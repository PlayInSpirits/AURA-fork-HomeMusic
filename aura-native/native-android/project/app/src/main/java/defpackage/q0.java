package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class q0 {
    public static /* synthetic */ boolean a(Unsafe unsafe, u0 u0Var, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(u0Var, j, obj, obj2)) {
            if (unsafe.getObject(u0Var, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
