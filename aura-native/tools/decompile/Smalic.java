import brut.androlib.smali.SmaliBuilder;
import com.android.tools.smali.dexlib2.Opcodes;
import com.android.tools.smali.dexlib2.writer.builder.DexBuilder;
import com.android.tools.smali.dexlib2.writer.io.FileDataStore;
import java.io.File;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;
/** Assemble a smali tree into one or more dex files: Smalic <smaliDir> <outDir> [api] */
public class Smalic {
  public static void main(String[] a) throws Exception {
    int api = a.length > 2 ? Integer.parseInt(a[2]) : 24;
    List<Path> files;
    try (Stream<Path> s = Files.walk(Paths.get(a[0]))) { files = s.filter(p -> p.toString().endsWith(".smali")).sorted().collect(Collectors.toList()); }
    Files.createDirectories(Paths.get(a[1]));
    SmaliBuilder sb = new SmaliBuilder(api);
    DexBuilder db = new DexBuilder(new Opcodes(api));
    int n = 0, fail = 0;
    for (Path p : files) { if (!sb.buildFile(p.toFile(), db)) { System.err.println("FAILED " + p); fail++; } n++; }
    if (fail > 0) System.exit(1);
    db.writeTo(new FileDataStore(new File(a[1], "classes.dex")));
    System.out.println("assembled " + n + " classes");
  }
}
