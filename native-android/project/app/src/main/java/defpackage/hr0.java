package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hr0 extends b71 {
    public final b71 c;

    public hr0(b71 b71Var) {
        b71Var.getClass();
        this.c = b71Var;
    }

    @Override // defpackage.b71
    public final of4 a(ge3 ge3Var) {
        ge3Var.getClass();
        return this.c.a(ge3Var);
    }

    @Override // defpackage.b71
    public final void b(ge3 ge3Var, ge3 ge3Var2) {
        ge3Var.getClass();
        ge3Var2.getClass();
        this.c.b(ge3Var, ge3Var2);
    }

    @Override // defpackage.b71
    public final void c(ge3 ge3Var) {
        this.c.c(ge3Var);
    }

    @Override // defpackage.b71
    public final void d(ge3 ge3Var) {
        ge3Var.getClass();
        this.c.d(ge3Var);
    }

    @Override // defpackage.b71
    public final List f(ge3 ge3Var) {
        List<ge3> listF = this.c.f(ge3Var);
        ArrayList arrayList = new ArrayList();
        for (ge3 ge3Var2 : listF) {
            ge3Var2.getClass();
            arrayList.add(ge3Var2);
        }
        u40.l0(arrayList);
        return arrayList;
    }

    @Override // defpackage.b71
    public final xo0 h(ge3 ge3Var) {
        ge3Var.getClass();
        xo0 xo0VarH = this.c.h(ge3Var);
        if (xo0VarH == null) {
            return null;
        }
        ge3 ge3Var2 = (ge3) xo0VarH.d;
        if (ge3Var2 == null) {
            return xo0VarH;
        }
        boolean z = xo0VarH.b;
        boolean z2 = xo0VarH.c;
        Long l = (Long) xo0VarH.e;
        Long l2 = (Long) xo0VarH.f;
        Long l3 = (Long) xo0VarH.g;
        Long l4 = (Long) xo0VarH.h;
        Map map = (Map) xo0VarH.i;
        map.getClass();
        return new xo0(z, z2, ge3Var2, l, l2, l3, l4, map);
    }

    @Override // defpackage.b71
    public final r32 i(ge3 ge3Var) {
        return this.c.i(ge3Var);
    }

    @Override // defpackage.b71
    public final of4 j(ge3 ge3Var) {
        ge3Var.getClass();
        ge3 ge3VarB = ge3Var.b();
        b71 b71Var = this.c;
        if (ge3VarB != null) {
            ii<ge3> iiVar = new ii();
            while (ge3VarB != null && !e(ge3VarB)) {
                iiVar.addFirst(ge3VarB);
                ge3VarB = ge3VarB.b();
            }
            for (ge3 ge3Var2 : iiVar) {
                ge3Var2.getClass();
                b71Var.c(ge3Var2);
            }
        }
        return b71Var.j(ge3Var);
    }

    @Override // defpackage.b71
    public final ej4 k(ge3 ge3Var) {
        ge3Var.getClass();
        return this.c.k(ge3Var);
    }

    public final String toString() {
        return kx3.a(hr0.class).c() + '(' + this.c + ')';
    }
}
