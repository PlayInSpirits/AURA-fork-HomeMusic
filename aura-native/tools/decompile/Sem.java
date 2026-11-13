import org.objectweb.asm.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.zip.*;
/**
 * Sem <original-with-code.jar> <compiledClassesDir> <out.tsv>
 * For each compiled top-level unit (class + its $-nested classes), compares the multiset of
 * referenced methods/fields/string constants against the original classes of the same names.
 */
public class Sem {
  static final Set<String> IGNORE_OWNERS = new HashSet<>(Arrays.asList(
    "java/lang/StringBuilder", "java/lang/Integer", "java/lang/Long", "java/lang/Boolean", "java/lang/Float",
    "java/lang/Double", "java/lang/Short", "java/lang/Byte", "java/lang/Character", "java/lang/Object",
    "java/lang/invoke/LambdaMetafactory", "java/lang/String", "java/util/Objects"));
  static void collect(byte[] b, Map<String,Integer> m) {
    new ClassReader(b).accept(new ClassVisitor(Opcodes.ASM9) {
      public MethodVisitor visitMethod(int acc, String n, String d, String s, String[] x) {
        return new MethodVisitor(Opcodes.ASM9) {
          void add(String k) { m.merge(k, 1, Integer::sum); }
          public void visitMethodInsn(int op, String o, String nm, String ds, boolean itf) {
            if (IGNORE_OWNERS.contains(o) || nm.startsWith("access$") || nm.startsWith("lambda$")) return;
            if (nm.equals("<init>") && ds.equals("()V")) return;
            add("M " + (nm.equals("<init>") ? o + "." : "") + nm + ds);
          }
          public void visitFieldInsn(int op, String o, String nm, String ds) { if (!nm.startsWith("this$") && !nm.startsWith("val$") && !nm.startsWith("$SwitchMap")) add("F " + nm + ":" + ds); }
          public void visitLdcInsn(Object v) { if (v instanceof String) add("S " + v); }
          public void visitInvokeDynamicInsn(String nm, String ds, Handle bsm, Object... args) {
            for (Object a : args) if (a instanceof Handle) { Handle h = (Handle) a; if (!h.getName().startsWith("lambda$")) add("M " + h.getOwner() + "." + h.getName() + h.getDesc()); }
          }
        };
      }
    }, 0);
  }
  public static void main(String[] a) throws Exception {
    Map<String, byte[]> orig = new HashMap<>();
    try (ZipInputStream z = new ZipInputStream(new FileInputStream(a[0]))) {
      ZipEntry e; while ((e = z.getNextEntry()) != null) if (e.getName().endsWith(".class")) orig.put(e.getName().replace(".class", ""), z.readAllBytes());
    }
    Path root = Paths.get(a[1]);
    Map<String, List<Path>> units = new TreeMap<>();
    Files.walk(root).filter(p -> p.toString().endsWith(".class")).forEach(p -> {
      String n = root.relativize(p).toString().replace('\\', '/').replace(".class", "");
      int i = n.lastIndexOf('/'); String simple = n.substring(i + 1); int d = simple.indexOf('$');
      String top = d > 0 ? n.substring(0, i + 1) + simple.substring(0, d) : n;
      units.computeIfAbsent(top, k -> new ArrayList<>()).add(p);
    });
    try (PrintWriter out = new PrintWriter(a[2])) {
      for (Map.Entry<String, List<Path>> u : units.entrySet()) {
        Map<String,Integer> c = new HashMap<>(), o = new HashMap<>();
        Set<String> names = new HashSet<>();
        for (Path p : u.getValue()) { collect(Files.readAllBytes(p), c); names.add(root.relativize(p).toString().replace('\\','/').replace(".class","")); }
        for (String n : names) if (orig.containsKey(n)) collect(orig.get(n), o);
        int missing = 0, extra = 0; List<String> det = new ArrayList<>();
        Set<String> keys = new TreeSet<>(o.keySet()); keys.addAll(c.keySet());
        for (String k : keys) {
          int dv = c.getOrDefault(k, 0) - o.getOrDefault(k, 0);
          if (dv < 0) { missing -= dv; if (det.size() < 6) det.add("-" + (-dv) + " " + k); }
          if (dv > 0) { extra += dv; if (det.size() < 6) det.add("+" + dv + " " + k); }
        }
        int total = o.values().stream().mapToInt(Integer::intValue).sum();
        out.println(u.getKey() + "\t" + total + "\t" + missing + "\t" + extra + "\t" + String.join(" | ", det).replace('\t',' ').replace('\n',' '));
      }
    }
  }
}
