package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nq2 extends oq2 {
    public final Object a = new Object();
    public Executor b;
    public zh0 c;
    public sp2 d;
    public ArrayList e;

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final void l(sp2 sp2Var, ArrayList arrayList) {
        if (sp2Var == null) {
            nz2.n("groupRoute must not be null");
            return;
        }
        synchronized (this.a) {
            try {
                Executor executor = this.b;
                if (executor != null) {
                    executor.execute(new t6(this, this.c, sp2Var, arrayList, 19));
                } else {
                    this.d = sp2Var;
                    this.e = new ArrayList(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void m(String str);

    public abstract void n(String str);

    public abstract void o(ArrayList arrayList);
}
