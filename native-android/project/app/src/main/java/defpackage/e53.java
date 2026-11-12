package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e53 extends cx2 implements rx4, y43 {
    public y43 B;
    public na4 C;
    public e53 D;
    public final String E;

    public e53(y43 y43Var, na4 na4Var) {
        this.B = y43Var;
        this.C = na4Var == null ? new na4(10) : na4Var;
        this.E = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // defpackage.y43
    public final long R(int i, long j, long j2) {
        long jR = this.B.R(i, j, j2);
        e53 e53VarR0 = this.A ? r0() : null;
        return g83.e(jR, e53VarR0 != null ? e53VarR0.R(i, g83.e(j, jR), g83.d(j2, jR)) : 0L);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // defpackage.y43
    public final Object b0(long j, long j2, vd0 vd0Var) {
        c53 c53Var;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        if (vd0Var instanceof c53) {
            c53Var = (c53) vd0Var;
            int i = c53Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                c53Var.r = i - Integer.MIN_VALUE;
            } else {
                c53Var = new c53(this, (wd0) vd0Var);
            }
        } else {
            c53Var = new c53(this, (wd0) vd0Var);
        }
        c53 c53Var2 = c53Var;
        Object objB0 = c53Var2.p;
        int i2 = c53Var2.r;
        e53 e53VarR0 = null;
        xe0 xe0Var = xe0.n;
        if (i2 == 0) {
            kb4.X(objB0);
            y43 y43Var = this.B;
            c53Var2.n = j;
            c53Var2.o = j2;
            c53Var2.r = 1;
            objB0 = y43Var.b0(j, j2, c53Var2);
            if (objB0 != xe0Var) {
                j3 = j;
                j4 = j2;
            }
            return xe0Var;
        }
        if (i2 == 1) {
            j4 = c53Var2.o;
            j3 = c53Var2.n;
            kb4.X(objB0);
        } else {
            if (i2 != 2) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j7 = c53Var2.n;
            kb4.X(objB0);
        }
        j6 = ((k45) objB0).a;
        j5 = j7;
        return new k45(k45.e(j5, j6));
        j5 = ((k45) objB0).a;
        boolean z = this.A;
        if (!z) {
            e53VarR0 = this.D;
        } else if (z) {
            e53VarR0 = r0();
        }
        if (e53VarR0 != null) {
            long jE = k45.e(j3, j5);
            long jD = k45.d(j4, j5);
            c53Var2.n = j5;
            c53Var2.r = 2;
            objB0 = e53VarR0.b0(jE, jD, c53Var2);
            if (objB0 != xe0Var) {
                j7 = j5;
                j6 = ((k45) objB0).a;
                j5 = j7;
            }
            return xe0Var;
        }
        j6 = 0;
        return new k45(k45.e(j5, j6));
    }

    @Override // defpackage.rx4
    public final Object f() {
        return this.E;
    }

    @Override // defpackage.cx2
    public final void i0() {
        na4 na4Var = this.C;
        na4Var.n = this;
        na4Var.o = null;
        this.D = null;
        na4Var.p = new wc(15, this);
        na4Var.q = e0();
    }

    @Override // defpackage.cx2
    public final void j0() {
        jx3 jx3Var = new jx3();
        gh0.I(this, new ea(1, jx3Var));
        e53 e53Var = (e53) ((rx4) jx3Var.n);
        this.D = e53Var;
        na4 na4Var = this.C;
        na4Var.o = e53Var;
        if (((e53) na4Var.n) == this) {
            na4Var.n = null;
            na4Var.q = null;
            na4Var.p = gb.c;
        }
    }

    public final we0 q0() {
        e53 e53VarR0 = r0();
        we0 we0VarQ0 = e53VarR0 != null ? e53VarR0.q0() : null;
        if (we0VarQ0 != null) {
            s22 s22Var = (s22) we0VarQ0.e().K(fz0.h0);
            if (s22Var != null ? s22Var.b() : true) {
                return we0VarQ0;
            }
        }
        we0 we0Var = (we0) this.C.q;
        if (we0Var != null) {
            return we0Var;
        }
        kf2.o("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public final e53 r0() {
        w12 w12Var;
        rx4 rx4Var = null;
        if (!this.A) {
            return null;
        }
        if (!this.n.A) {
            cz1.b("visitAncestors called on an unattached node");
        }
        cx2 cx2Var = this.n.r;
        c72 c72VarO = j51.O(this);
        loop0: while (c72VarO != null) {
            if ((((cx2) c72VarO.Q.g).q & 262144) != 0) {
                while (cx2Var != null) {
                    if ((cx2Var.p & 262144) != 0) {
                        cx2 cx2VarC = cx2Var;
                        f13 f13Var = null;
                        while (cx2VarC != null) {
                            if (cx2VarC instanceof rx4) {
                                rx4 rx4Var2 = (rx4) cx2VarC;
                                if (h12.c(this.E, rx4Var2.f()) && e53.class == rx4Var2.getClass()) {
                                    rx4Var = rx4Var2;
                                    break loop0;
                                }
                            }
                            if ((cx2VarC.p & 262144) != 0 && (cx2VarC instanceof fo0)) {
                                int i = 0;
                                for (cx2 cx2Var2 = ((fo0) cx2VarC).C; cx2Var2 != null; cx2Var2 = cx2Var2.s) {
                                    if ((cx2Var2.p & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            cx2VarC = cx2Var2;
                                        } else {
                                            if (f13Var == null) {
                                                f13Var = new f13(new cx2[16]);
                                            }
                                            if (cx2VarC != null) {
                                                f13Var.b(cx2VarC);
                                                cx2VarC = null;
                                            }
                                            f13Var.b(cx2Var2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            cx2VarC = j51.c(f13Var);
                        }
                    }
                    cx2Var = cx2Var.r;
                }
            }
            c72VarO = c72VarO.t();
            cx2Var = (c72VarO == null || (w12Var = c72VarO.Q) == null) ? null : (sq4) w12Var.f;
        }
        return (e53) rx4Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r9 == r5) goto L27;
     */
    @Override // defpackage.y43
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(long j, vd0 vd0Var) {
        d53 d53Var;
        long j2;
        long j3;
        if (vd0Var instanceof d53) {
            d53Var = (d53) vd0Var;
            int i = d53Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                d53Var.q = i - Integer.MIN_VALUE;
            } else {
                d53Var = new d53(this, (wd0) vd0Var);
            }
        } else {
            d53Var = new d53(this, (wd0) vd0Var);
        }
        Object objS = d53Var.o;
        int i2 = d53Var.q;
        xe0 xe0Var = xe0.n;
        if (i2 != 0) {
            if (i2 == 1) {
                j = d53Var.n;
                kb4.X(objS);
            } else {
                if (i2 != 2) {
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j3 = d53Var.n;
                kb4.X(objS);
            }
            return new k45(k45.e(j3, ((k45) objS).a));
        }
        kb4.X(objS);
        e53 e53VarR0 = this.A ? r0() : null;
        if (e53VarR0 != null) {
            d53Var.n = j;
            d53Var.q = 1;
            objS = e53VarR0.s(j, d53Var);
        } else {
            j2 = 0;
            y43 y43Var = this.B;
            long jD = k45.d(j, j2);
            d53Var.n = j2;
            d53Var.q = 2;
            objS = y43Var.s(jD, d53Var);
            if (objS != xe0Var) {
                j3 = j2;
                return new k45(k45.e(j3, ((k45) objS).a));
            }
        }
        return xe0Var;
        j2 = ((k45) objS).a;
        y43 y43Var2 = this.B;
        long jD2 = k45.d(j, j2);
        d53Var.n = j2;
        d53Var.q = 2;
        objS = y43Var2.s(jD2, d53Var);
        if (objS != xe0Var) {
            j3 = j2;
            return new k45(k45.e(j3, ((k45) objS).a));
        }
        return xe0Var;
    }

    @Override // defpackage.y43
    public final long x(int i, long j) {
        e53 e53VarR0 = this.A ? r0() : null;
        long jX = e53VarR0 != null ? e53VarR0.x(i, j) : 0L;
        return g83.e(jX, this.B.x(i, g83.d(j, jX)));
    }
}
