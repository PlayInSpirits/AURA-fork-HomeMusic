package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t44 implements vy3 {
    public m54 n;
    public x44 o;
    public String p;
    public Object q;
    public Object[] r;
    public c12 s;
    public final wc t = new wc(19, this);

    public t44(m54 m54Var, x44 x44Var, String str, Object obj, Object[] objArr) {
        this.n = m54Var;
        this.o = x44Var;
        this.p = str;
        this.q = obj;
        this.r = objArr;
    }

    @Override // defpackage.vy3
    public final void a() {
        c12 c12Var = this.s;
        if (c12Var != null) {
            c12Var.k();
        }
    }

    public final void b() throws IOException {
        String strO;
        x44 x44Var = this.o;
        c12 c12Var = this.s;
        if (c12Var != null) {
            nz2.k(c12Var, ") is not null", "entry(");
            return;
        }
        if (x44Var != null) {
            wc wcVar = this.t;
            Object objInvoke = wcVar.invoke();
            if (objInvoke == null || x44Var.b(objInvoke)) {
                this.s = x44Var.a(this.p, wcVar);
                return;
            }
            if (objInvoke instanceof nh4) {
                nh4 nh4Var = (nh4) objInvoke;
                if (nh4Var.c() == rv2.s || nh4Var.c() == rv2.D || nh4Var.c() == rv2.A) {
                    strO = "MutableState containing " + nh4Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strO = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strO = gh0.o(objInvoke);
            }
            throw new IllegalArgumentException(strO);
        }
    }

    @Override // defpackage.vy3
    public final void c() {
        c12 c12Var = this.s;
        if (c12Var != null) {
            c12Var.k();
        }
    }

    @Override // defpackage.vy3
    public final void d() throws IOException {
        b();
    }
}
