package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class xr1 {
    public static volatile boolean a;
    public static volatile bv3 b;
    public static Thread c;
    public static Context d;
    public static final rp4 e = new rp4(new e90(12));
    public static final u6 f = new u6(6);

    public static final synchronized void a() {
        synchronized (xr1.class) {
            try {
                a = false;
                bv3 bv3Var = b;
                if (bv3Var != null) {
                    bv3Var.cancel();
                }
                b = null;
                Thread thread = c;
                if (thread != null) {
                    thread.interrupt();
                }
                c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
