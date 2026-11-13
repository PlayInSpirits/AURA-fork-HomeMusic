import org.objectweb.asm.*;
import java.io.*;
import java.util.zip.*;
public class Unsyn {
  public static void main(String[] a) throws Exception {
    try (ZipInputStream in = new ZipInputStream(new FileInputStream(a[0]));
         ZipOutputStream out = new ZipOutputStream(new FileOutputStream(a[1]))) {
      ZipEntry e;
      while ((e = in.getNextEntry()) != null) {
        byte[] b = in.readAllBytes();
        if (e.getName().endsWith(".class")) {
          ClassReader cr = new ClassReader(b);
          ClassWriter cw = new ClassWriter(0);
          cr.accept(new ClassVisitor(Opcodes.ASM9, cw) {
            public void visit(int v, int acc, String n, String s, String sup, String[] i) { super.visit(v, acc & ~Opcodes.ACC_SYNTHETIC, n, s, sup, i); }
            public void visitInnerClass(String n, String o, String in2, int acc) { super.visitInnerClass(n, o, in2, acc & ~Opcodes.ACC_SYNTHETIC); }
            public FieldVisitor visitField(int acc, String n, String d, String s, Object v) { return super.visitField(acc & ~Opcodes.ACC_SYNTHETIC, n, d, s, v); }
            public MethodVisitor visitMethod(int acc, String n, String d, String s, String[] x) { return super.visitMethod(acc & ~(Opcodes.ACC_SYNTHETIC|Opcodes.ACC_BRIDGE), n, d, s, x); }
          }, a.length > 2 ? 0 : ClassReader.SKIP_CODE);
          b = cw.toByteArray();
        }
        out.putNextEntry(new ZipEntry(e.getName())); out.write(b); out.closeEntry();
      }
    }
  }
}
