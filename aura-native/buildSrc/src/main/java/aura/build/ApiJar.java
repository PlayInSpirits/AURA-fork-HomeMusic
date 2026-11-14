package aura.build;

import com.googlecode.d2j.dex.Dex2jar;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Turns the prebuilt dex into a compile-only API jar for javac.
 * R8 marks merged classes and many members ACC_SYNTHETIC, which javac refuses to see,
 * so the flag is cleared in the stubs (the runtime dex itself is untouched).
 */
public final class ApiJar {
    private ApiJar() {}

    public static void make(File dex, File outJar, File tmpDir) throws IOException {
        deleteTree(tmpDir.toPath());
        Files.createDirectories(tmpDir.toPath());
        Dex2jar.from(dex).noCode(true).skipDebug(true).dontSanitizeNames(true).to(tmpDir.toPath());
        List<Path> classes = new ArrayList<>();
        Files.walkFileTree(tmpDir.toPath(), new SimpleFileVisitor<Path>() {
            @Override public FileVisitResult visitFile(Path f, BasicFileAttributes a) {
                if (f.toString().endsWith(".class")) classes.add(f);
                return FileVisitResult.CONTINUE;
            }
        });
        Collections.sort(classes);
        Files.createDirectories(outJar.getParentFile().toPath());
        try (ZipOutputStream out = new ZipOutputStream(new FileOutputStream(outJar))) {
            for (Path p : classes) {
                String name = tmpDir.toPath().relativize(p).toString().replace(File.separatorChar, '/');
                ZipEntry e = new ZipEntry(name);
                e.setTime(0L);
                out.putNextEntry(e);
                out.write(unsynthetic(Files.readAllBytes(p)));
                out.closeEntry();
            }
        }
    }

    static byte[] unsynthetic(byte[] b) {
        ClassReader cr = new ClassReader(b);
        ClassWriter cw = new ClassWriter(0);
        final int mask = ~Opcodes.ACC_SYNTHETIC;
        cr.accept(new ClassVisitor(Opcodes.ASM9, cw) {
            @Override public void visit(int v, int acc, String n, String s, String sup, String[] i) { super.visit(v, acc & mask, n, s, sup, i); }
            @Override public void visitInnerClass(String n, String o, String in, int acc) { super.visitInnerClass(n, o, in, acc & mask); }
            @Override public FieldVisitor visitField(int acc, String n, String d, String s, Object v) { return super.visitField(acc & mask, n, d, s, v); }
            @Override public MethodVisitor visitMethod(int acc, String n, String d, String s, String[] x) { return super.visitMethod(acc & mask & ~Opcodes.ACC_BRIDGE, n, d, s, x); }
        }, ClassReader.SKIP_CODE);
        return cw.toByteArray();
    }

    static void deleteTree(Path root) throws IOException {
        if (!Files.exists(root)) return;
        Files.walkFileTree(root, new SimpleFileVisitor<Path>() {
            @Override public FileVisitResult visitFile(Path f, BasicFileAttributes a) throws IOException { Files.delete(f); return FileVisitResult.CONTINUE; }
            @Override public FileVisitResult postVisitDirectory(Path d, IOException e) throws IOException { Files.delete(d); return FileVisitResult.CONTINUE; }
        });
    }
}
