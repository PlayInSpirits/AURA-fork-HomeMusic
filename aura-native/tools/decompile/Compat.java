import org.objectweb.asm.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.zip.*;
/** Compat <original.jar> <compiledClassesDir> <report.txt>: list compiled classes whose binary interface differs from the original. */
public class Compat {
  static class Info { String sup; Set<String> itf = new TreeSet<>(); Map<String,Integer> members = new TreeMap<>(); int access; }
  static Info read(byte[] b) {
    Info in = new Info();
    new ClassReader(b).accept(new ClassVisitor(Opcodes.ASM9) {
      public void visit(int v, int acc, String n, String s, String sup, String[] i) { in.sup = sup; in.access = acc; if (i != null) in.itf.addAll(Arrays.asList(i)); }
      public FieldVisitor visitField(int acc, String n, String d, String s, Object v) { in.members.put("F " + n + ":" + d, acc); return null; }
      public MethodVisitor visitMethod(int acc, String n, String d, String s, String[] x) { in.members.put("M " + n + d, acc); return null; }
    }, ClassReader.SKIP_CODE);
    return in;
  }
  public static void main(String[] a) throws Exception {
    Map<String, Info> orig = new HashMap<>();
    try (ZipInputStream z = new ZipInputStream(new FileInputStream(a[0]))) {
      ZipEntry e; while ((e = z.getNextEntry()) != null) if (e.getName().endsWith(".class")) orig.put(e.getName().replace(".class", ""), read(z.readAllBytes()));
    }
    Path root = Paths.get(a[1]);
    List<Path> files = new ArrayList<>();
    Files.walk(root).filter(p -> p.toString().endsWith(".class")).forEach(files::add);
    try (PrintWriter out = new PrintWriter(a[2])) {
      for (Path p : files) {
        String n = root.relativize(p).toString().replace('\\', '/').replace(".class", "");
        Info c = read(Files.readAllBytes(p));
        Info o = orig.get(n);
        if (o == null) { out.println("NEW " + n); continue; }
        List<String> probs = new ArrayList<>();
        if (!Objects.equals(o.sup, c.sup)) probs.add("super " + o.sup + " -> " + c.sup);
        if (!o.itf.equals(c.itf)) probs.add("interfaces " + o.itf + " -> " + c.itf);
        if ((o.access & Opcodes.ACC_INTERFACE) != (c.access & Opcodes.ACC_INTERFACE)) probs.add("kind");
        for (Map.Entry<String,Integer> m : o.members.entrySet()) {
          Integer ca = c.members.get(m.getKey());
          if (ca == null) { if (!m.getKey().startsWith("M <clinit>") && (m.getValue() & Opcodes.ACC_PRIVATE) == 0) probs.add("missing " + m.getKey()); continue; }
          if ((ca & Opcodes.ACC_STATIC) != (m.getValue() & Opcodes.ACC_STATIC)) probs.add("static " + m.getKey());
          if ((m.getValue() & Opcodes.ACC_PRIVATE) == 0 && (ca & Opcodes.ACC_PRIVATE) != 0) probs.add("private " + m.getKey());
          if ((m.getValue() & Opcodes.ACC_PUBLIC) != 0 && (ca & Opcodes.ACC_PUBLIC) == 0) probs.add("notpublic " + m.getKey());
        }
        if (!probs.isEmpty()) out.println("BAD " + n + " " + probs);
      }
    }
  }
}
