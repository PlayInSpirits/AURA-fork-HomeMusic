package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class o0 {
    public static /* synthetic */ boolean a(Unsafe unsafe, u0 u0Var, long j, t0 t0Var, t0 t0Var2) {
        while (!unsafe.compareAndSwapObject(u0Var, j, t0Var, t0Var2)) {
            if (unsafe.getObject(u0Var, j) != t0Var) {
                return false;
            }
        }
        return true;
    }
}
