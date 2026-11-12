package defpackage;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a54 implements x44, j54 {
    public final /* synthetic */ y44 n;
    public ea2 o;
    public gp3 p;

    public a54(y44 y44Var) {
        this.n = y44Var;
        Object objD = y44Var.d("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objD instanceof Bundle ? (Bundle) objD : null;
        if (bundle != null && this.p == null) {
            gp3 gp3Var = new gp3(new xm2(this, new wc(22, this)));
            this.p = gp3Var;
            gp3Var.s(bundle);
        }
        y44Var.a("androidx.savedstate.SavedStateRegistry", new wc(20, this));
    }

    @Override // defpackage.x44
    public final c12 a(String str, gf1 gf1Var) {
        return this.n.a(str, gf1Var);
    }

    @Override // defpackage.x44
    public final boolean b(Object obj) {
        return this.n.b(obj);
    }

    @Override // defpackage.x44
    public final Map c() {
        return this.n.c();
    }

    @Override // defpackage.x44
    public final Object d(String str) {
        return this.n.d(str);
    }

    @Override // defpackage.j54
    public final rm3 f() {
        gp3 gp3Var = this.p;
        if (gp3Var == null) {
            gp3 gp3Var2 = new gp3(new xm2(this, new wc(22, this)));
            this.p = gp3Var2;
            gp3Var2.s(null);
            gp3Var = gp3Var2;
        }
        return (rm3) gp3Var.p;
    }

    @Override // defpackage.ba2
    public final ea2 h() {
        ea2 ea2Var = this.o;
        if (ea2Var != null) {
            return ea2Var;
        }
        ea2 ea2Var2 = new ea2(this, false);
        this.o = ea2Var2;
        return ea2Var2;
    }
}
