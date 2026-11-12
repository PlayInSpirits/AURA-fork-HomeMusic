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
    public final of4 a(ge3 r3) {
        r3.getClass();
        File r2 = r3.toFile();
        Logger r4 = p83.a;
        return new sk(1, new FileOutputStream(r2, true), new fu4());
    }

    @Override // defpackage.b71
    public void b(ge3 r3, ge3 r4) {
        r3.getClass();
        r4.getClass();
        if (r3.toFile().renameTo(r4.toFile()) == false) goto L6;
        return;
    L6:
        throw new IOException("failed to move " + r3 + " to " + r4);
    }

    @Override // defpackage.b71
    public final void c(ge3 r2) {
        if (r2.toFile().mkdir() == true) goto L11;
        xo0 r1 = h(r2);
        if (r1 != null) goto L7;
    L9:
        tb4.d(r2, "failed to create directory: ");
        return;
    L7:
        if (r1.c != true) goto L9;
        return;
    }

    @Override // defpackage.b71
    public final void d(ge3 r2) {
        r2.getClass();
        if (Thread.interrupted() == true) goto L12;
        File r1 = r2.toFile();
        if (r1.delete() == false) goto L7;
        return;
    L7:
        if (r1.exists() == false) goto L14;
        tb4.d(r2, "failed to delete ");
        return;
    L14:
        return;
    L12:
        throw new InterruptedIOException("interrupted");
    }

    @Override // defpackage.b71
    public final List f(ge3 r5) {
        File r4 = r5.toFile();
        String[] r0 = r4.list();
        if (r0 == null) goto L5;
        ArrayList r6 = new ArrayList();
        int r1 = r0.length;
        int r2 = 0;
    L11:
        if (r2 >= r1) goto L13;
        String r3 = r0[r2];
        r3.getClass();
        r6.add(r5.d(r3));
        r2 = r2 + 1;
        goto L11
    L13:
        u40.l0(r6);
        return r6;
    L5:
        if (r4.exists() == true) goto L8;
        mj0.k(r5, "no such file: ");
        return null;
    L8:
        tb4.d(r5, "failed to list ");
        return null;
    }

    @Override // defpackage.b71
    public xo0 h(ge3 r10) {
        r10.getClass();
        File r9 = r10.toFile();
        boolean r1 = r9.isFile();
        boolean r2 = r9.isDirectory();
        long r3 = r9.lastModified();
        long r5 = r9.length();
        if (r1 == true) goto L13;
        if (r2 == true) goto L13;
        if (r3 != 0) goto L13;
        if (r5 != 0) goto L13;
        if (r9.exists() == true) goto L13;
        return null;
    L13:
        ge3 r4 = null;
        Long r6 = null;
        return new xo0(r1, r2, r4, Long.valueOf(r5), r6, Long.valueOf(r3), null);
    }

    @Override // defpackage.b71
    public final r32 i(ge3 r3) {
        return new r32(new RandomAccessFile(r3.toFile(), "r"));
    }

    @Override // defpackage.b71
    public final of4 j(ge3 r3) {
        r3.getClass();
        File r2 = r3.toFile();
        Logger r4 = p83.a;
        int r1 = 1;
        return new sk(r1, new FileOutputStream(r2, false), new fu4());
    }

    @Override // defpackage.b71
    public final ej4 k(ge3 r3) {
        r3.getClass();
        File r2 = r3.toFile();
        Logger r4 = p83.a;
        int r1 = 1;
        return new tk(r1, new FileInputStream(r2), fu4.d);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
