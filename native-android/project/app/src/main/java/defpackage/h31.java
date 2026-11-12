package defpackage;

import android.system.Os;
import java.io.FileDescriptor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h31 {
    public static void a(FileDescriptor r0) {
        Os.close(r0);
    }

    public static FileDescriptor b(FileDescriptor r0) {
        return Os.dup(r0);
    }

    public static long c(FileDescriptor r0, long r1, int r3) {
        return Os.lseek(r0, r1, r3);
    }
}
