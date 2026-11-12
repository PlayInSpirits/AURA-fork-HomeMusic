package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pk1 extends jc0 {
    public float p0 = -1.0f;
    public int q0 = -1;
    public int r0 = -1;
    public hb0 s0 = this.I;
    public int t0 = 0;
    public boolean u0;

    public pk1() {
        this.Q.clear();
        this.Q.add(this.s0);
        int length = this.P.length;
        for (int i = 0; i < length; i++) {
            this.P[i] = this.s0;
        }
    }

    @Override // defpackage.jc0
    public final void M(eb2 eb2Var, boolean z) {
        if (this.S == null) {
            return;
        }
        hb0 hb0Var = this.s0;
        eb2Var.getClass();
        int iN = eb2.n(hb0Var);
        if (this.t0 == 1) {
            this.X = iN;
            this.Y = 0;
            H(this.S.i());
            K(0);
            return;
        }
        this.X = 0;
        this.Y = iN;
        K(this.S.o());
        H(0);
    }

    public final void N(int i) {
        this.s0.i(i);
        this.u0 = true;
    }

    public final void O(int i) {
        if (this.t0 == i) {
            return;
        }
        this.t0 = i;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        if (this.t0 == 1) {
            this.s0 = this.H;
        } else {
            this.s0 = this.I;
        }
        arrayList.add(this.s0);
        hb0[] hb0VarArr = this.P;
        int length = hb0VarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            hb0VarArr[i2] = this.s0;
        }
    }

    @Override // defpackage.jc0
    public final void b(eb2 eb2Var, boolean z) {
        kc0 kc0Var = (kc0) this.S;
        if (kc0Var == null) {
            return;
        }
        Object objG = kc0Var.g(2);
        Object objG2 = kc0Var.g(4);
        jc0 jc0Var = this.S;
        boolean z2 = jc0Var != null && jc0Var.o0[0] == 2;
        if (this.t0 == 0) {
            objG = kc0Var.g(3);
            objG2 = kc0Var.g(5);
            jc0 jc0Var2 = this.S;
            z2 = jc0Var2 != null && jc0Var2.o0[1] == 2;
        }
        if (this.u0) {
            hb0 hb0Var = this.s0;
            if (hb0Var.c) {
                ai4 ai4VarK = eb2Var.k(hb0Var);
                eb2Var.d(ai4VarK, this.s0.c());
                if (this.q0 != -1) {
                    if (z2) {
                        eb2Var.f(eb2Var.k(objG2), ai4VarK, 0, 5);
                    }
                } else if (this.r0 != -1 && z2) {
                    ai4 ai4VarK2 = eb2Var.k(objG2);
                    eb2Var.f(ai4VarK, eb2Var.k(objG), 0, 5);
                    eb2Var.f(ai4VarK2, ai4VarK, 0, 5);
                }
                this.u0 = false;
                return;
            }
        }
        if (this.q0 != -1) {
            ai4 ai4VarK3 = eb2Var.k(this.s0);
            eb2Var.e(ai4VarK3, eb2Var.k(objG), this.q0, 8);
            if (z2) {
                eb2Var.f(eb2Var.k(objG2), ai4VarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.r0 != -1) {
            ai4 ai4VarK4 = eb2Var.k(this.s0);
            ai4 ai4VarK5 = eb2Var.k(objG2);
            eb2Var.e(ai4VarK4, ai4VarK5, -this.r0, 8);
            if (z2) {
                eb2Var.f(ai4VarK4, eb2Var.k(objG), 0, 5);
                eb2Var.f(ai4VarK5, ai4VarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.p0 != -1.0f) {
            ai4 ai4VarK6 = eb2Var.k(this.s0);
            ai4 ai4VarK7 = eb2Var.k(objG2);
            float f = this.p0;
            pi piVarL = eb2Var.l();
            piVarL.d.g(ai4VarK6, -1.0f);
            piVarL.d.g(ai4VarK7, f);
            eb2Var.c(piVarL);
        }
    }

    @Override // defpackage.jc0
    public final boolean c() {
        return true;
    }

    @Override // defpackage.jc0
    public final hb0 g(int i) {
        int iW = xa3.w(i);
        if (iW != 1) {
            if (iW != 2) {
                if (iW != 3) {
                    if (iW != 4) {
                        return null;
                    }
                }
            }
            if (this.t0 == 0) {
                return this.s0;
            }
            return null;
        }
        if (this.t0 == 1) {
            return this.s0;
        }
        return null;
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
