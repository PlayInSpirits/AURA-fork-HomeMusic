package aura.build;

import com.android.tools.smali.smali.Smali;
import com.android.tools.smali.smali.SmaliOptions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Collections;

/** Assembles the prebuilt smali tree into a single dex file. */
public final class SmaliAssembler {
    private SmaliAssembler() {}

    public static void assemble(File smaliDir, File outDex, int apiLevel) throws IOException {
        Files.createDirectories(outDex.getParentFile().toPath());
        SmaliOptions options = new SmaliOptions();
        options.apiLevel = apiLevel;
        options.outputDexFile = outDex.getAbsolutePath();
        options.jobs = Math.max(1, Runtime.getRuntime().availableProcessors());
        options.verboseErrors = true;
        if (!Smali.assemble(options, Collections.singletonList(smaliDir.getAbsolutePath()))) {
            throw new IOException("smali assembly failed for " + smaliDir);
        }
    }
}
