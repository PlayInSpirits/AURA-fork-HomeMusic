package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fn0 extends nn0 implements Comparable {
    public final boolean A;
    public final boolean B;
    public final int C;
    public final int D;
    public final boolean E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final int r;
    public final boolean s;
    public final String t;
    public final jn0 u;
    public final boolean v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    /* JADX WARN: Code duplicated, block: B:120:0x0190  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:85:0x013a  */
    /* JADX WARN: Code duplicated, block: B:86:0x013c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0145  */
    /* JADX WARN: Code duplicated, block: B:90:0x0147  */
    public fn0(int i, sv4 sv4Var, int i2, jn0 jn0Var, int i3, boolean z, en0 en0Var, int i4) {
        int i5;
        int iC;
        boolean z2;
        int iC2;
        boolean z3;
        boolean z4;
        boolean z5;
        super(i, sv4Var, i2);
        this.u = jn0Var;
        boolean z6 = jn0Var.z0;
        yw1 yw1Var = jn0Var.v;
        yw1 yw1Var2 = jn0Var.q;
        int i6 = z6 ? 24 : 16;
        int i7 = 0;
        this.A = false;
        this.t = pn0.f(this.q.d);
        this.v = kq.n(i3, false);
        int i8 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i8 >= yw1Var2.size()) {
                iC = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iC = pn0.c(this.q, (String) yw1Var2.get(i8), false);
                if (iC > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.x = i8;
        this.w = iC;
        int i9 = this.q.f;
        int i10 = jn0Var.s;
        this.y = (i9 == 0 || i9 != i10) ? Integer.bitCount(i9 & i10) : Integer.MAX_VALUE;
        this.z = pn0.a(this.q, jn0Var.r);
        tb1 tb1Var = this.q;
        int i11 = tb1Var.f;
        this.B = i11 == 0 || (i11 & 1) != 0;
        this.E = (tb1Var.e & 1) != 0;
        String str = tb1Var.n;
        if (str != null) {
            switch (str) {
                case "audio/eac3-joc":
                case "audio/ac4":
                case "audio/iamf":
                    z2 = true;
                    break;
                default:
                    z2 = false;
                    break;
            }
        } else {
            z2 = false;
        }
        this.L = z2;
        int i12 = tb1Var.F;
        this.F = i12;
        this.G = tb1Var.G;
        int i13 = tb1Var.j;
        this.H = i13;
        this.s = (i13 == -1 || i13 <= jn0Var.u) && (i12 == -1 || i12 <= jn0Var.t) && en0Var.apply(tb1Var);
        String[] strArrSplit = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
            strArrSplit[i14] = f35.R(strArrSplit[i14]);
        }
        int i15 = 0;
        while (true) {
            if (i15 < strArrSplit.length) {
                iC2 = pn0.c(this.q, strArrSplit[i15], false);
                if (iC2 <= 0) {
                    i15++;
                }
            } else {
                iC2 = 0;
                i15 = Integer.MAX_VALUE;
            }
        }
        this.C = i15;
        this.D = iC2;
        for (int i16 = 0; i16 < yw1Var.size(); i16++) {
            String str2 = this.q.n;
            if (str2 != null && str2.equals(yw1Var.get(i16))) {
                i5 = i16;
                this.I = i5;
                if ((i3 & 384) == 128) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.J = z3;
                if ((i3 & 64) == 64) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.K = z4;
                tb1 tb1Var2 = this.q;
                boolean z7 = this.s;
                jn0 jn0Var2 = this.u;
                z5 = jn0Var2.B0;
                aw4 aw4Var = jn0Var2.w;
                if (kq.n(i3, z5) && ((z7 || jn0Var2.y0) && (aw4Var.a != 2 || pn0.h(jn0Var2, i3, tb1Var2)))) {
                    if (kq.n(i3, false) || !z7 || tb1Var2.j == -1 || jn0Var2.G || jn0Var2.F || ((!jn0Var2.C0 && z) || aw4Var.a == 2 || (i6 & i3) == 0)) {
                        i7 = 1;
                    } else {
                        i7 = 2;
                    }
                }
                this.r = i7;
            }
        }
        this.I = i5;
        if ((i3 & 384) == 128) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.J = z3;
        if ((i3 & 64) == 64) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.K = z4;
        tb1 tb1Var3 = this.q;
        boolean z8 = this.s;
        jn0 jn0Var3 = this.u;
        z5 = jn0Var3.B0;
        aw4 aw4Var2 = jn0Var3.w;
        if (kq.n(i3, z5)) {
            if (kq.n(i3, false)) {
                i7 = 1;
            } else {
                i7 = 1;
            }
        }
        this.r = i7;
    }

    @Override // defpackage.nn0
    public final int a() {
        return this.r;
    }

    @Override // defpackage.nn0
    public final boolean b(nn0 nn0Var) {
        int i;
        String str;
        fn0 fn0Var = (fn0) nn0Var;
        tb1 tb1Var = fn0Var.q;
        this.u.getClass();
        tb1 tb1Var2 = this.q;
        int i2 = tb1Var2.F;
        if (i2 == -1 || i2 != tb1Var.F) {
            return false;
        }
        return (this.A || ((str = tb1Var2.n) != null && TextUtils.equals(str, tb1Var.n))) && (i = tb1Var2.G) != -1 && i == tb1Var.G && this.J == fn0Var.J && this.K == fn0Var.K;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(fn0 fn0Var) {
        boolean z = this.v;
        boolean z2 = this.s;
        gb3 gb3VarA = (z2 && z) ? pn0.k : pn0.k.a();
        boolean z3 = fn0Var.v;
        int i = fn0Var.H;
        v60 v60VarC = v60.a.c(z, z3);
        Integer numValueOf = Integer.valueOf(this.x);
        Integer numValueOf2 = Integer.valueOf(fn0Var.x);
        x13 x13Var = x13.p;
        v60 v60VarB = v60VarC.b(numValueOf, numValueOf2, x13Var).a(this.w, fn0Var.w).a(this.y, fn0Var.y).b(Integer.valueOf(this.z), Integer.valueOf(fn0Var.z), x13Var).c(this.E, fn0Var.E).c(this.B, fn0Var.B).b(Integer.valueOf(this.C), Integer.valueOf(fn0Var.C), x13Var).a(this.D, fn0Var.D).c(z2, fn0Var.s).b(Integer.valueOf(this.I), Integer.valueOf(fn0Var.I), x13Var);
        boolean z4 = this.u.F;
        int i2 = this.H;
        if (z4) {
            v60VarB = v60VarB.b(Integer.valueOf(i2), Integer.valueOf(i), pn0.k.a());
        }
        v60 v60VarB2 = v60VarB.c(this.J, fn0Var.J).c(this.K, fn0Var.K).c(this.L, fn0Var.L).b(Integer.valueOf(this.F), Integer.valueOf(fn0Var.F), gb3VarA).b(Integer.valueOf(this.G), Integer.valueOf(fn0Var.G), gb3VarA);
        if (Objects.equals(this.t, fn0Var.t)) {
            v60VarB2 = v60VarB2.b(Integer.valueOf(i2), Integer.valueOf(i), gb3VarA);
        }
        return v60VarB2.e();
    }
}
