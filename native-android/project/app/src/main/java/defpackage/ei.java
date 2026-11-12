package defpackage;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ei extends wr1 {
    public static volatile ei k;
    public static final di l = new di(0);
    public final bn0 j = new bn0();

    public static ei V() {
        if (k != null) {
            return k;
        }
        synchronized (ei.class) {
            try {
                if (k == null) {
                    k = new ei();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return k;
    }

    public final void W(Runnable runnable) {
        bn0 bn0Var = this.j;
        if (bn0Var.l == null) {
            synchronized (bn0Var.j) {
                try {
                    if (bn0Var.l == null) {
                        bn0Var.l = bn0.m(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        bn0Var.l.post(runnable);
    }
}
