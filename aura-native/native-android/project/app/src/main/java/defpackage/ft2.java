package defpackage;

import android.os.Bundle;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ft2 implements er2 {
    public final ju1 n;
    public final int o;

    public ft2(ju1 ju1Var, int i) {
        this.n = ju1Var;
        this.o = i;
    }

    @Override // defpackage.er2
    public final void A(int i, lk3 lk3Var, mi3 mi3Var, boolean z, boolean z2) {
        Bundle bundleT;
        int i2 = this.o;
        rr2.w(i2 != 0);
        boolean z3 = z || !mi3Var.a(17);
        boolean z4 = z2 || !mi3Var.a(30);
        ju1 ju1Var = this.n;
        if (i2 < 2) {
            ju1Var.u0(i, lk3Var.q(mi3Var, z, true).t(i2), z3);
            return;
        }
        lk3 lk3VarQ = lk3Var.q(mi3Var, z, z2);
        if (ju1Var instanceof mm2) {
            bundleT = new Bundle();
            bundleT.putBinder(lk3.o0, new kk3(lk3VarQ));
        } else {
            bundleT = lk3VarQ.t(i2);
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean(jk3.d, z3);
        bundle.putBoolean(jk3.e, z4);
        ju1Var.I(i, bundleT, bundle);
    }

    @Override // defpackage.er2
    public final void B(int i, za4 za4Var, boolean z, boolean z2, int i2) {
        this.n.C(i, za4Var.a(z, z2).c(i2));
    }

    @Override // defpackage.er2
    public final void c() {
        au0.k(this.n);
    }

    @Override // defpackage.er2
    public final void e(int i) {
        this.n.e(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != ft2.class) {
            return false;
        }
        return Objects.equals(this.n.asBinder(), ((ft2) obj).n.asBinder());
    }

    public final int hashCode() {
        return Objects.hash(this.n.asBinder());
    }

    @Override // defpackage.er2
    public final void i(int i, int i2, int i3) {
        this.n.i(i, i2, i3);
    }

    @Override // defpackage.er2
    public final void k(List list, int i) {
        int i2 = this.o;
        int i3 = 0;
        ju1 ju1Var = this.n;
        if (i2 >= 7) {
            uw1 uw1VarJ = yw1.j();
            while (i3 < list.size()) {
                uw1VarJ.c(((j60) list.get(i3)).o());
                i3++;
            }
            ju1Var.n(uw1VarJ.f(), i);
            return;
        }
        gy3 gy3VarJ = j60.j(list, true, true);
        uw1 uw1VarJ2 = yw1.j();
        while (i3 < gy3VarJ.q) {
            uw1VarJ2.c(((j60) gy3VarJ.get(i3)).o());
            i3++;
        }
        ju1Var.s0(uw1VarJ2.f(), i);
    }

    @Override // defpackage.er2
    public final void l(int i, va4 va4Var) {
        this.n.E(i, va4Var.b(), Bundle.EMPTY);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if (r2 != 4) goto L26;
     */
    @Override // defpackage.er2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(int i, m92 m92Var) {
        String str = m92.j;
        Object obj = m92Var.c;
        int i2 = m92Var.d;
        Bundle bundle = new Bundle();
        bundle.putInt(m92.g, m92Var.a);
        bundle.putLong(m92.h, m92Var.b);
        jn2 jn2Var = m92Var.e;
        if (jn2Var != null) {
            bundle.putBundle(m92.i, jn2Var.b());
        }
        xa4 xa4Var = m92Var.f;
        if (xa4Var != null) {
            bundle.putBundle(m92.l, xa4Var.b());
        }
        bundle.putInt(m92.k, i2);
        if (obj != null) {
            if (i2 != 1) {
                if (i2 == 2) {
                    bundle.putBundle(str, ((gn2) obj).c(false));
                } else if (i2 == 3) {
                    yw1 yw1Var = (yw1) obj;
                    uw1 uw1VarJ = yw1.j();
                    for (int i3 = 0; i3 < yw1Var.size(); i3++) {
                        uw1VarJ.c(((gn2) yw1Var.get(i3)).c(false));
                    }
                    bundle.putBinder(str, new iw(uw1VarJ.f()));
                }
            }
            tb4.a();
            return;
        }
        this.n.O(i, bundle);
    }

    @Override // defpackage.er2
    public final void t(int i, mi3 mi3Var) {
        this.n.z(i, mi3Var.c());
    }

    @Override // defpackage.er2
    public final void v(int i, ab4 ab4Var) {
        this.n.I0(i, ab4Var.b());
    }

    @Override // defpackage.er2
    public final void z(int i, String str, jn2 jn2Var) {
        this.n.w0(i, str, Integer.MAX_VALUE, jn2Var == null ? null : jn2Var.b());
    }
}
