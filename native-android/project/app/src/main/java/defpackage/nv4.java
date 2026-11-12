package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nv4 {
    public static void a(int r0, String r1) {
        Trace.beginAsyncSection(r1, r0);
    }

    public static void b(int r0, String r1) {
        Trace.endAsyncSection(r1, r0);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }
}
