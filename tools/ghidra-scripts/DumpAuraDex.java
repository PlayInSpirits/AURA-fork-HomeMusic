// Dump selected Dalvik methods from the recovered AURA DEX using Ghidra's decompiler.
import ghidra.app.decompiler.DecompInterface;
import ghidra.app.decompiler.DecompileResults;
import ghidra.app.script.GhidraScript;
import ghidra.program.model.listing.Function;
import ghidra.program.model.listing.FunctionIterator;
import ghidra.program.model.symbol.Namespace;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DumpAuraDex extends GhidraScript {
    private static final Set<String> TARGETS = new HashSet<>(Arrays.asList(
        "a0", "ad3", "b31", "c72", "cd4", "dk2", "e35", "en1", "ey", "f22", "f31", "f35", "f63",
        "MixOfflineWorker", "WaveSession", "WaveOut", "WaveNextIn",
        "PlayEvent", "AURAWavePlaybackListener", "AURAWaveToggleClickListener",
        "AURAWaveCircleTouchListener", "AURAHomeAnimation", "AURAVersion"
    ));

    private static String namespaceName(Namespace ns) {
        StringBuilder out = new StringBuilder();
        Namespace current = ns;
        while (current != null && !current.isGlobal()) {
            if (out.length() > 0) out.insert(0, ".");
            out.insert(0, current.getName());
            current = current.getParentNamespace();
        }
        return out.toString();
    }

    private static boolean isTarget(String ns, String function) {
        if (TARGETS.contains(ns)) return true;
        for (String target : TARGETS) {
            if (ns.equals(target) || ns.endsWith("." + target) ||
                ns.contains("." + target + "$") || ns.endsWith("$" + target)) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected void run() throws Exception {
        String[] args = getScriptArgs();
        if (args.length < 1) throw new IllegalArgumentException("Pass output text path as script argument.");
        File output = new File(args[0]);
        File parent = output.getParentFile();
        if (parent != null) parent.mkdirs();

        DecompInterface decompiler = new DecompInterface();
        decompiler.openProgram(currentProgram);
        int matched = 0;
        int emitted = 0;
        try (PrintWriter writer = new PrintWriter(new OutputStreamWriter(
                new FileOutputStream(output), StandardCharsets.UTF_8))) {
            writer.println("PROGRAM: " + currentProgram.getName());
            writer.println("LANGUAGE: " + currentProgram.getLanguage().getLanguageID());
            writer.println("TARGETS: " + TARGETS);
            writer.println();

            FunctionIterator functions = currentProgram.getFunctionManager().getFunctions(true);
            while (functions.hasNext()) {
                monitor.checkCancelled();
                Function function = functions.next();
                String ns = namespaceName(function.getParentNamespace());
                String name = function.getName();
                if (!isTarget(ns, name)) continue;

                matched++;
                writer.println("============================================================");
                writer.println("FUNCTION: " + (ns.isEmpty() ? name : ns + "." + name));
                writer.println("ENTRY: " + function.getEntryPoint());
                writer.println("SIGNATURE: " + function.getSignature());
                writer.println("RETURN: " + function.getReturnType());
                writer.println("PARAMETERS: " + function.getParameterCount());
                writer.println("NATIVE: " + function.isExternal());
                writer.println("------------------------------------------------------------");

                DecompileResults result = decompiler.decompileFunction(function, 45, monitor);
                if (result != null && result.decompileCompleted() && result.getDecompiledFunction() != null) {
                    writer.println(result.getDecompiledFunction().getC());
                    emitted++;
                } else {
                    writer.println("[DECOMPILATION_FAILED] " +
                        (result == null ? "no result" : result.getErrorMessage()));
                }
                writer.println();
                writer.flush();
                if (matched >= 2000) {
                    writer.println("[TRUNCATED] matched function limit 2000 reached.");
                    break;
                }
            }
            writer.println("SUMMARY matched=" + matched + " decompiled=" + emitted);
            writer.flush();
        } finally {
            decompiler.dispose();
        }
        println("Ghidra export finished: matched=" + matched + ", decompiled=" + emitted + ", output=" + output);
    }
}
