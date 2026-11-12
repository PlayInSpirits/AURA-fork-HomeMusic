package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d15 implements bi {
    public final Object n;
    public final ArrayList o = new ArrayList();
    public Object p;

    public d15(c72 c72Var) {
        this.n = c72Var;
        this.p = c72Var;
    }

    @Override // defpackage.bi
    public final void a(int i, Object obj) throws IOException {
        ((c72) this.p).A(i, (c72) obj);
    }

    @Override // defpackage.bi
    public final void b(Object obj) {
        this.o.add(this.p);
        this.p = obj;
    }

    @Override // defpackage.bi
    public final void c() {
        yv3 rectManager;
        y9 autofillManager;
        yv3 rectManager2;
        c72 c72Var = (c72) this.p;
        w12 w12Var = c72Var.Q;
        if (!c72Var.G()) {
            cz1.a("onReuse is only expected on attached node");
        }
        o72 o72Var = c72Var.S;
        if (o72Var != null) {
            o72Var.i(false);
        }
        c72Var.F = false;
        if (c72Var.Z) {
            c72Var.Z = false;
        } else {
            cx2 cx2Var = (sq4) c72Var.Q.f;
            for (cx2 cx2Var2 = cx2Var; cx2Var2 != null; cx2Var2 = cx2Var2.r) {
                if (cx2Var2.A) {
                    cx2Var2.l0();
                }
            }
            for (cx2 cx2Var3 = cx2Var; cx2Var3 != null; cx2Var3 = cx2Var3.r) {
                if (cx2Var3.A) {
                    cx2Var3.n0();
                }
            }
            while (cx2Var != null) {
                if (cx2Var.A) {
                    cx2Var.h0();
                }
                cx2Var = cx2Var.r;
            }
        }
        int i = c72Var.o;
        ub3 ub3Var = c72Var.A;
        if (ub3Var != null && (rectManager2 = ((ra) ub3Var).getRectManager()) != null) {
            rectManager2.i(c72Var);
        }
        c72Var.o = f94.a.addAndGet(1);
        ub3 ub3Var2 = c72Var.A;
        if (ub3Var2 != null) {
            ra raVar = (ra) ub3Var2;
            raVar.getLayoutNodes().g(i);
            raVar.getLayoutNodes().i(c72Var.o, c72Var);
        }
        for (cx2 cx2Var4 = (cx2) w12Var.g; cx2Var4 != null; cx2Var4 = cx2Var4.s) {
            cx2Var4.g0();
        }
        w12Var.e();
        if (w12Var.d(8)) {
            c72Var.E();
        }
        c72.X(c72Var);
        ub3 ub3Var3 = c72Var.A;
        if (ub3Var3 != null) {
            ra raVar2 = (ra) ub3Var3;
            if (ra.d() && (autofillManager = raVar2.getAutofillManager()) != null) {
                ra raVar3 = autofillManager.p;
                qr2 qr2Var = autofillManager.n;
                j03 j03Var = autofillManager.t;
                if (j03Var.f(i)) {
                    qr2Var.p(raVar3, i, false);
                }
                e94 e94VarV = c72Var.v();
                if (e94VarV != null && e94VarV.n.b(n94.q)) {
                    j03Var.a(c72Var.o);
                    qr2Var.p(raVar3, c72Var.o, true);
                }
            }
        }
        ub3 ub3Var4 = c72Var.A;
        if (ub3Var4 == null || (rectManager = ((ra) ub3Var4).getRectManager()) == null) {
            return;
        }
        rectManager.h(c72Var);
    }

    @Override // defpackage.bi
    public final void d(int i, int i2, int i3) throws IOException {
        ((c72) this.p).K(i, i2, i3);
    }

    @Override // defpackage.bi
    public final void e(int i, int i2) throws IOException {
        ((c72) this.p).R(i, i2);
    }

    public final void f() throws IOException {
        this.o.clear();
        this.p = this.n;
        ((c72) this.n).Q();
    }

    @Override // defpackage.bi
    public final void g() {
        ArrayList arrayList = this.o;
        this.p = arrayList.remove(arrayList.size() - 1);
    }

    @Override // defpackage.bi
    public final /* bridge */ /* synthetic */ void h(int i, Object obj) {
    }

    @Override // defpackage.bi
    public final void i() {
        ub3 ub3Var = ((c72) this.n).A;
        if (ub3Var != null) {
            ((ra) ub3Var).s();
        }
    }

    @Override // defpackage.bi
    public final Object j() {
        return this.p;
    }
}
