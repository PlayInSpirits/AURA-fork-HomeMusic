package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class o0 {
    public static /* synthetic */ boolean a(Unsafe r1, u0 r2, long r3, t0 r5, t0 r6) {
    L3:
        if (r1.compareAndSwapObject(r2, r3, r5, r6) == true) goto L4;
        if (r1.getObject(r2, r3) == r5) goto L3;
        return false;
    L4:
        return true;
    }
}
