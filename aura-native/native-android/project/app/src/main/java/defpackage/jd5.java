package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jd5 {
    public static final String e = cx.i("WorkTimer");
    public final hg3 a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final Object d = new Object();

    public jd5(hg3 hg3Var) {
        this.a = hg3Var;
    }

    public final void a(rc5 rc5Var) {
        synchronized (this.d) {
            try {
                if (((id5) this.b.remove(rc5Var)) != null) {
                    cx.f().b(e, "Stopping timer for " + rc5Var);
                    this.c.remove(rc5Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
