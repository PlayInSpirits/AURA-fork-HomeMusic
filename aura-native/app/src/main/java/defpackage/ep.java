package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ep extends jc0 {
    public ep() {
        super();
    }

    public jc0[] p0;
    public int q0;
    public int r0;
    public boolean s0;
    public int t0;
    public boolean u0;

    public final void N(int i, aa5 aa5Var, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.q0; i2++) {
            jc0 jc0Var = this.p0[i2];
            ArrayList arrayList2 = aa5Var.a;
            if (!arrayList2.contains(jc0Var)) {
                arrayList2.add(jc0Var);
            }
        }
        for (int i3 = 0; i3 < this.q0; i3++) {
            gi1.n(this.p0[i3], i, arrayList, aa5Var);
        }
    }

    public final boolean O() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.q0;
            if (i4 >= i) {
                break;
            }
            jc0 jc0Var = this.p0[i4];
            if ((this.s0 || jc0Var.c()) && ((((i2 = this.r0) == 0 || i2 == 1) && !jc0Var.y()) || (((i3 = this.r0) == 2 || i3 == 3) && !jc0Var.z()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.q0; i6++) {
            jc0 jc0Var2 = this.p0[i6];
            if (this.s0 || jc0Var2.c()) {
                if (!z2) {
                    int i7 = this.r0;
                    if (i7 == 0) {
                        i5 = jc0Var2.g(2).c();
                    } else if (i7 == 1) {
                        i5 = jc0Var2.g(4).c();
                    } else if (i7 == 2) {
                        i5 = jc0Var2.g(3).c();
                    } else if (i7 == 3) {
                        i5 = jc0Var2.g(5).c();
                    }
                    z2 = true;
                }
                int i8 = this.r0;
                if (i8 == 0) {
                    i5 = Math.min(i5, jc0Var2.g(2).c());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, jc0Var2.g(4).c());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, jc0Var2.g(3).c());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, jc0Var2.g(5).c());
                }
            }
        }
        int i9 = i5 + this.t0;
        int i10 = this.r0;
        if (i10 == 0 || i10 == 1) {
            F(i9, i9);
        } else {
            G(i9, i9);
        }
        this.u0 = true;
        return true;
    }

    public final int P() {
        int i = this.r0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // defpackage.jc0
    public final void b(eb2 eb2Var, boolean z) {
        boolean z2;
        int i;
        int i2;
        hb0[] hb0VarArr = this.P;
        hb0 hb0Var = this.H;
        hb0VarArr[0] = hb0Var;
        int i3 = 2;
        hb0 hb0Var2 = this.I;
        hb0VarArr[2] = hb0Var2;
        hb0 hb0Var3 = this.J;
        hb0VarArr[1] = hb0Var3;
        hb0 hb0Var4 = this.K;
        hb0VarArr[3] = hb0Var4;
        for (hb0 hb0Var5 : hb0VarArr) {
            hb0Var5.i = eb2Var.k(hb0Var5);
        }
        int i4 = this.r0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        hb0 hb0Var6 = hb0VarArr[i4];
        if (!this.u0) {
            O();
        }
        if (this.u0) {
            this.u0 = false;
            int i5 = this.r0;
            if (i5 == 0 || i5 == 1) {
                eb2Var.d(hb0Var.i, this.X);
                eb2Var.d(hb0Var3.i, this.X);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    eb2Var.d(hb0Var2.i, this.Y);
                    eb2Var.d(hb0Var4.i, this.Y);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.q0; i6++) {
            jc0 jc0Var = this.p0[i6];
            if ((this.s0 || jc0Var.c()) && ((((i2 = this.r0) == 0 || i2 == 1) && jc0Var.o0[0] == 3 && jc0Var.H.f != null && jc0Var.J.f != null) || ((i2 == 2 || i2 == 3) && jc0Var.o0[1] == 3 && jc0Var.I.f != null && jc0Var.K.f != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = hb0Var.e() || hb0Var3.e();
        boolean z4 = hb0Var2.e() || hb0Var4.e();
        int i7 = !(!z2 && (((i = this.r0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.q0) {
            jc0 jc0Var2 = this.p0[i8];
            if (this.s0 || jc0Var2.c()) {
                ai4 k = eb2Var.k(jc0Var2.P[this.r0]);
                hb0[] hb0VarArr2 = jc0Var2.P;
                int i9 = this.r0;
                hb0 hb0Var7 = hb0VarArr2[i9];
                hb0Var7.i = k;
                hb0 hb0Var8 = hb0Var7.f;
                int i10 = (hb0Var8 == null || hb0Var8.d != this) ? 0 : hb0Var7.g;
                if (i9 == 0 || i9 == i3) {
                    ai4 ai4Var = hb0Var6.i;
                    int i11 = this.t0 - i10;
                    pi l = eb2Var.l();
                    ai4 m = eb2Var.m();
                    m.q = 0;
                    l.c(ai4Var, k, m, i11);
                    eb2Var.c(l);
                } else {
                    ai4 ai4Var2 = hb0Var6.i;
                    int i12 = this.t0 + i10;
                    pi l2 = eb2Var.l();
                    ai4 m2 = eb2Var.m();
                    m2.q = 0;
                    l2.b(ai4Var2, k, m2, i12);
                    eb2Var.c(l2);
                }
                eb2Var.e(hb0Var6.i, k, this.t0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.r0;
        if (i13 == 0) {
            eb2Var.e(hb0Var3.i, hb0Var.i, 0, 8);
            eb2Var.e(hb0Var.i, this.S.J.i, 0, 4);
            eb2Var.e(hb0Var.i, this.S.H.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            eb2Var.e(hb0Var.i, hb0Var3.i, 0, 8);
            eb2Var.e(hb0Var.i, this.S.H.i, 0, 4);
            eb2Var.e(hb0Var.i, this.S.J.i, 0, 0);
        } else if (i13 == 2) {
            eb2Var.e(hb0Var4.i, hb0Var2.i, 0, 8);
            eb2Var.e(hb0Var2.i, this.S.K.i, 0, 4);
            eb2Var.e(hb0Var2.i, this.S.I.i, 0, 0);
        } else if (i13 == 3) {
            eb2Var.e(hb0Var2.i, hb0Var4.i, 0, 8);
            eb2Var.e(hb0Var2.i, this.S.I.i, 0, 4);
            eb2Var.e(hb0Var2.i, this.S.K.i, 0, 0);
        }
    }

    @Override // defpackage.jc0
    public final boolean c() {
        return true;
    }

    @Override // defpackage.jc0
    public final String toString() {
        String q = b11.q(new StringBuilder("[Barrier] "), this.g0, " {");
        for (int i = 0; i < this.q0; i++) {
            jc0 jc0Var = this.p0[i];
            if (i > 0) {
                q = q.concat(", ");
            }
            StringBuilder i2 = xa3.i(q);
            i2.append(jc0Var.g0);
            q = i2.toString();
        }
        return q.concat("}");
    }

    @Override // defpackage.jc0
    public final boolean y() {
        return this.u0;
    }

    @Override // defpackage.jc0
    public final boolean z() {
        return this.u0;
    }
}
