package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class s32 extends b71 {
    @Override // defpackage.b71
    public final of4 a(ge3 ge3Var) {
        ge3Var.getClass();
        File file = ge3Var.toFile();
        Logger logger = p83.a;
        return new sk(1, new FileOutputStream(file, true), new fu4());
    }

    @Override // defpackage.b71
    public void b(ge3 ge3Var, ge3 ge3Var2) throws IOException {
        ge3Var.getClass();
        ge3Var2.getClass();
        if (ge3Var.toFile().renameTo(ge3Var2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + ge3Var + " to " + ge3Var2);
    }

    @Override // defpackage.b71
    public final void c(ge3 ge3Var) throws IOException {
        if (ge3Var.toFile().mkdir()) {
            return;
        }
        xo0 xo0VarH = h(ge3Var);
        if (xo0VarH == null || !xo0VarH.c) {
            tb4.d(ge3Var, "failed to create directory: ");
        }
    }

    @Override // defpackage.b71
    public final void d(ge3 ge3Var) throws IOException {
        ge3Var.getClass();
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = ge3Var.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        tb4.d(ge3Var, "failed to delete ");
    }

    @Override // defpackage.b71
    public final List f(ge3 ge3Var) throws IOException {
        File file = ge3Var.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                tb4.d(ge3Var, "failed to list ");
                return null;
            }
            mj0.k(ge3Var, "no such file: ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(ge3Var.d(str));
        }
        u40.l0(arrayList);
        return arrayList;
    }

    @Override // defpackage.b71
    public xo0 h(ge3 ge3Var) {
        ge3Var.getClass();
        File file = ge3Var.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new xo0(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
    }

    @Override // defpackage.b71
    public final r32 i(ge3 ge3Var) {
        return new r32(new RandomAccessFile(ge3Var.toFile(), "r"));
    }

    @Override // defpackage.b71
    public final of4 j(ge3 ge3Var) {
        ge3Var.getClass();
        File file = ge3Var.toFile();
        Logger logger = p83.a;
        return new sk(1, new FileOutputStream(file, false), new fu4());
    }

    @Override // defpackage.b71
    public final ej4 k(ge3 ge3Var) {
        ge3Var.getClass();
        File file = ge3Var.toFile();
        Logger logger = p83.a;
        return new tk(1, new FileInputStream(file), fu4.d);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
