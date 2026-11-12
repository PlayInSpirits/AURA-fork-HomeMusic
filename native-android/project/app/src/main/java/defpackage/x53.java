package defpackage;

import java.io.FileNotFoundException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x53 extends s32 {
    public static Long l(FileTime r4) {
        long r0 = gm0.a(r4);
        Long r5 = Long.valueOf(r0);
        if (r0 == 0) goto L5;
        return r5;
    L5:
        return null;
    }

    @Override // defpackage.s32, defpackage.b71
    public final void b(ge3 r3, ge3 r4) {
        r3.getClass();
        r4.getClass();
        Path r2 = gm0.m(r3.n.q(), new String[0]);     // Catch: NoSuchFileException -> L5 UnsupportedOperationException -> L7
        r2.getClass();     // Catch: NoSuchFileException -> L5 UnsupportedOperationException -> L7
        Path r5 = gm0.m(r4.n.q(), new String[0]);     // Catch: NoSuchFileException -> L5 UnsupportedOperationException -> L7
        r5.getClass();     // Catch: NoSuchFileException -> L5 UnsupportedOperationException -> L7
        Files.move(r2, r5, new CopyOption[]{StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING});     // Catch: NoSuchFileException -> L5 UnsupportedOperationException -> L7
        return;
    L7:
        mj0.i("atomic move not supported");
        return;
    L5:
        e = move-exception;
        throw new FileNotFoundException(e.getMessage());
    }

    @Override // defpackage.s32, defpackage.b71
    public final xo0 h(ge3 r10) {
        r10.getClass();
        Path r9 = gm0.m(r10.n.q(), new String[0]);
        r9.getClass();
        Long r0 = null;
        BasicFileAttributes r11 = Files.readAttributes(r9, BasicFileAttributes.class, new LinkOption[]{LinkOption.NOFOLLOW_LINKS});     // Catch: Throwable -> L25
        if (r11.isSymbolicLink() == false) goto L7;
        Path r12 = Files.readSymbolicLink(r9);
    L8:
        boolean r2 = r11.isRegularFile();
        boolean r3 = r11.isDirectory();
        if (r12 == null) goto L11;
        String r4 = ge3.o;
        ge3 r5 = tv1.z(r12.toString());
    L12:
        Long r6 = Long.valueOf(r11.size());
        FileTime r13 = r11.creationTime();
        if (r13 == null) goto L15;
        Long r7 = l(r13);
    L16:
        FileTime r14 = r11.lastModifiedTime();
        if (r14 == null) goto L19;
        Long r8 = l(r14);
    L20:
        FileTime r15 = r11.lastAccessTime();
        if (r15 == null) goto L24;
        r0 = l(r15);
    L24:
        return new xo0(r2, r3, r5, r6, r7, r8, r0);
    L19:
        r8 = null;
        goto L20
    L15:
        r7 = null;
        goto L16
    L11:
        r5 = null;
        goto L12
    L7:
        r12 = null;
    L25:
        return null;
    }

    @Override // defpackage.s32
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
