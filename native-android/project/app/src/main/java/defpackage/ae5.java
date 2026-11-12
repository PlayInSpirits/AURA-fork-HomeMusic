package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ae5 {
    public static final ae5 b = null;
    public si1 a;

    static {
        ae5 r0 = new ae5();
        r0.a = null;
        b = r0;
    }

    public static si1 a(Context r3) {
        ae5 r0 = b;
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (r0.a == null) goto L7;
    L12:
        si1 r4 = r0.a;     // Catch: Throwable -> L9
        monitor-exit(r0);
        return r4;
    L7:
        if (r3.getApplicationContext() == null) goto L11;
        r3 = r3.getApplicationContext();     // Catch: Throwable -> L9
    L11:
        r0.a = new si1(13, r3);     // Catch: Throwable -> L9
        goto L12
    }
}
