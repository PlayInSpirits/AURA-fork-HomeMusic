package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rp4 implements r72, Serializable {
    public gf1 n;
    public volatile Object o = rv2.H;
    public final Object p = this;

    public rp4(gf1 gf1Var) {
        this.n = gf1Var;
    }

    @Override // defpackage.r72
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.o;
        rv2 rv2Var = rv2.H;
        if (obj != rv2Var) {
            return obj;
        }
        synchronized (this.p) {
            objInvoke = this.o;
            if (objInvoke == rv2Var) {
                gf1 gf1Var = this.n;
                gf1Var.getClass();
                objInvoke = gf1Var.invoke();
                this.o = objInvoke;
                this.n = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return this.o != rv2.H ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
