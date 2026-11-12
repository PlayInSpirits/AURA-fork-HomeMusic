package defpackage;

import android.util.Log;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w42 {
    public static final w42 a = null;
    public static final ArrayDeque b = null;

    static {
        a = new w42();
        b = new ArrayDeque();
    }

    public static /* synthetic */ void b(String r2) {
        a.a(r2, null);
    }

    public final synchronized void a(String r5, Exception r6) {
        monitor-enter(this);
        String r7 = fa4.d0(fa4.e0(fa4.c0(new or1(28), r6), 6), " -> ", new or1(29), 30);     // Catch: Throwable -> L7
        long r1 = System.currentTimeMillis();     // Catch: Throwable -> L7
        if (r7.length() != 0) goto L9;
        String r8 = "";
    L10:
        String r9 = r1 + " " + r5 + r8;     // Catch: Throwable -> L7
        ArrayDeque r10 = b;     // Catch: Throwable -> L7
        if (r10.size() != 200) goto L13;
        r10.removeFirst();     // Catch: Throwable -> L7
    L13:
        r10.addLast(r9);     // Catch: Throwable -> L7
        Log.d("TempusLAN", r9);     // Catch: Throwable -> L7
        monitor-exit(this);
        return;
    L9:
        r8 = " [" + r7 + "]";     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        throw th;
    }
}
