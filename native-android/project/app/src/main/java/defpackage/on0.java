package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class on0 extends nn0 {
    public final int A;
    public final int B;
    public final int C;
    public final boolean D;
    public final int E;
    public final boolean F;
    public final int G;
    public final boolean H;
    public final boolean I;
    public final int J;
    public final boolean r;
    public final jn0 s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    /* JADX WARN: Code duplicated, block: B:127:0x0181  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:45:0x0072  */
    public on0(int i, sv4 sv4Var, int i2, jn0 jn0Var, int i3, String str, int i4, boolean z) {
        boolean z2;
        boolean z3;
        int i5;
        int iC;
        int i6;
        int i7;
        tb1 tb1Var;
        int i8;
        int i9;
        int i10;
        tb1 tb1Var2;
        int i11;
        int i12;
        int i13;
        super(i, sv4Var, i2);
        this.s = jn0Var;
        boolean z4 = jn0Var.x0;
        yw1 yw1Var = jn0Var.m;
        yw1 yw1Var2 = jn0Var.o;
        int i14 = z4 ? 24 : 16;
        int i15 = 0;
        this.F = false;
        if (!z || (((i11 = (tb1Var2 = this.q).u) != -1 && i11 > jn0Var.a) || ((i12 = tb1Var2.v) != -1 && i12 > jn0Var.b))) {
            z2 = false;
        } else {
            float f = tb1Var2.y;
            if ((f == -1.0f || f <= jn0Var.c) && ((i13 = tb1Var2.j) == -1 || i13 <= jn0Var.d)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.r = z2;
        if (!z || (((i8 = (tb1Var = this.q).u) != -1 && i8 < jn0Var.e) || ((i9 = tb1Var.v) != -1 && i9 < jn0Var.f))) {
            z3 = false;
        } else {
            float f2 = tb1Var.y;
            if ((f2 == -1.0f || f2 >= jn0Var.g) && ((i10 = tb1Var.j) == -1 || i10 >= jn0Var.h)) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        this.t = z3;
        this.u = kq.n(i3, false);
        tb1 tb1Var3 = this.q;
        float f3 = tb1Var3.y;
        this.v = f3 != -1.0f && f3 >= 10.0f;
        this.w = tb1Var3.j;
        int i16 = tb1Var3.u;
        this.x = (i16 == -1 || (i7 = tb1Var3.v) == -1) ? -1 : i16 * i7;
        int i17 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i17 >= yw1Var2.size()) {
                iC = 0;
                i17 = Integer.MAX_VALUE;
                break;
            } else {
                iC = pn0.c(this.q, (String) yw1Var2.get(i17), false);
                if (iC > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.z = i17;
        this.A = iC;
        int i18 = this.q.f;
        int i19 = jn0Var.p;
        gb3 gb3Var = pn0.k;
        this.B = (i18 == 0 || i18 != i19) ? Integer.bitCount(i18 & i19) : Integer.MAX_VALUE;
        int i20 = this.q.f;
        this.D = i20 == 0 || (i20 & 1) != 0;
        this.E = pn0.c(this.q, str, pn0.f(str) == null);
        for (int i21 = 0; i21 < yw1Var.size(); i21++) {
            String str2 = this.q.n;
            if (str2 != null && str2.equals(yw1Var.get(i21))) {
                i5 = i21;
                break;
            }
        }
        this.y = i5;
        this.C = pn0.a(this.q, jn0Var.n);
        this.H = (i3 & 384) == 128;
        this.I = (i3 & 64) == 64;
        tb1 tb1Var4 = this.q;
        String str3 = tb1Var4.n;
        if (str3 != null) {
            i6 = 4;
            switch (str3) {
                case "video/dolby-vision":
                    i6 = 5;
                    break;
                case "video/av01":
                    break;
                case "video/hevc":
                    i6 = 3;
                    break;
                case "video/avc":
                    i6 = 1;
                    break;
                case "video/x-vnd.on2.vp9":
                    i6 = 2;
                    break;
                default:
                    i6 = 0;
                    break;
            }
        } else {
            i6 = 0;
        }
        this.J = i6;
        boolean z5 = this.r;
        jn0 jn0Var2 = this.s;
        if ((tb1Var4.f & 16384) == 0 && kq.n(i3, jn0Var2.B0) && (z5 || jn0Var2.w0)) {
            i15 = (!kq.n(i3, false) || !this.t || !z5 || tb1Var4.j == -1 || jn0Var2.G || jn0Var2.F || (i14 & i3) == 0) ? 1 : 2;
        }
        this.G = i15;
    }

    public static int c(on0 on0Var, on0 on0Var2) {
        v60 v60VarC = v60.a.c(on0Var.u, on0Var2.u);
        Integer numValueOf = Integer.valueOf(on0Var.z);
        Integer numValueOf2 = Integer.valueOf(on0Var2.z);
        x13 x13Var = x13.p;
        v60 v60VarB = v60VarC.b(numValueOf, numValueOf2, x13Var).a(on0Var.A, on0Var2.A).a(on0Var.B, on0Var2.B).b(Integer.valueOf(on0Var.C), Integer.valueOf(on0Var2.C), x13Var).c(on0Var.D, on0Var2.D).a(on0Var.E, on0Var2.E).c(on0Var.v, on0Var2.v).c(on0Var.r, on0Var2.r).c(on0Var.t, on0Var2.t).b(Integer.valueOf(on0Var.y), Integer.valueOf(on0Var2.y), x13Var);
        boolean z = on0Var.H;
        v60 v60VarC2 = v60VarB.c(z, on0Var2.H);
        boolean z2 = on0Var.I;
        v60 v60VarC3 = v60VarC2.c(z2, on0Var2.I);
        if (z && z2) {
            v60VarC3 = v60VarC3.a(on0Var.J, on0Var2.J);
        }
        return v60VarC3.e();
    }

    @Override // defpackage.nn0
    public final int a() {
        return this.G;
    }

    @Override // defpackage.nn0
    public final boolean b(nn0 nn0Var) {
        on0 on0Var = (on0) nn0Var;
        if (!this.F && !Objects.equals(this.q.n, on0Var.q.n)) {
            return false;
        }
        this.s.getClass();
        return this.H == on0Var.H && this.I == on0Var.I;
    }
}
