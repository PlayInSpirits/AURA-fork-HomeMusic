package defpackage;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ei extends wr1 {
    public static volatile ei k;
    public static final di l = null;
    public final bn0 j;

    static {
        l = new di(0);
    }

    public ei() {
        this.j = new bn0();
    }

    public static ei V() {
        if (k == null) goto L7;
        return k;
    L7:
        monitor-enter(ei.class);
    L11:
        th = move-exception;
        throw th;
    L9:
        if (k != null) goto L13;
        k = new ei();     // Catch: Throwable -> L11
    L13:
        monitor-exit(ei.class);     // Catch: Throwable -> L11
        return k;
    }

    public final void W(Runnable r3) {
        bn0 r2 = this.j;
        if (r2.l != null) goto L15;
        Object r0 = r2.j;
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (r2.l != null) goto L11;
        r2.l = bn0.m(Looper.getMainLooper());     // Catch: Throwable -> L9
    L11:
        monitor-exit(r0);     // Catch: Throwable -> L9
    L15:
        r2.l.post(r3);
    }
}
