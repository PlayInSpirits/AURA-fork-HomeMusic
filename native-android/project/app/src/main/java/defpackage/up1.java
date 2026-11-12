package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class up1 extends ba5 {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0268  */
    /* JADX WARN: Code duplicated, block: B:118:0x0278  */
    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // defpackage.uo0
    public final void a(uo0 uo0Var) {
        float f;
        int iG;
        int i;
        int iG2;
        float f2;
        float f3;
        float f4;
        int i2;
        if (xa3.w(this.j) == 3) {
            jc0 jc0Var = this.b;
            l(jc0Var.H, jc0Var.J, 0);
            return;
        }
        eq0 eq0Var = this.e;
        boolean z = eq0Var.j;
        yo0 yo0Var = this.h;
        yo0 yo0Var2 = this.i;
        if (z || this.d != 3) {
            f = 0.5f;
        } else {
            jc0 jc0Var2 = this.b;
            int i3 = jc0Var2.r;
            if (i3 == 2) {
                f = 0.5f;
                jc0 jc0Var3 = jc0Var2.S;
                if (jc0Var3 != null) {
                    eq0 eq0Var2 = jc0Var3.d.e;
                    if (eq0Var2.j) {
                        eq0Var.d((int) ((eq0Var2.g * jc0Var2.w) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = jc0Var2.s;
                if (i4 == 0 || i4 == 3) {
                    w45 w45Var = jc0Var2.e;
                    yo0 yo0Var3 = w45Var.h;
                    yo0 yo0Var4 = w45Var.i;
                    boolean z2 = jc0Var2.H.f != null;
                    boolean z3 = jc0Var2.I.f != null;
                    boolean z4 = jc0Var2.J.f != null;
                    boolean z5 = jc0Var2.K.f != null;
                    f = 0.5f;
                    int i5 = jc0Var2.W;
                    if (z2 && z3 && z4 && z5) {
                        float f5 = jc0Var2.V;
                        boolean z6 = yo0Var3.j;
                        ArrayList arrayList = yo0Var3.l;
                        int[] iArr = k;
                        if (z6 && yo0Var4.j) {
                            if (yo0Var.c && yo0Var2.c) {
                                m(iArr, ((yo0) yo0Var.l.get(0)).g + yo0Var.f, ((yo0) yo0Var2.l.get(0)).g - yo0Var2.f, yo0Var3.g + yo0Var3.f, yo0Var4.g - yo0Var4.f, f5, i5);
                                eq0Var.d(iArr[0]);
                                this.b.e.e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (yo0Var.j && yo0Var2.j) {
                            if (!yo0Var3.c || !yo0Var4.c) {
                                return;
                            }
                            m(iArr, yo0Var.g + yo0Var.f, yo0Var2.g - yo0Var2.f, ((yo0) arrayList.get(0)).g + yo0Var3.f, ((yo0) yo0Var4.l.get(0)).g - yo0Var4.f, f5, i5);
                            eq0Var.d(iArr[0]);
                            this.b.e.e.d(iArr[1]);
                        }
                        if (!yo0Var.c || !yo0Var2.c || !yo0Var3.c || !yo0Var4.c) {
                            return;
                        }
                        m(iArr, ((yo0) yo0Var.l.get(0)).g + yo0Var.f, ((yo0) yo0Var2.l.get(0)).g - yo0Var2.f, ((yo0) arrayList.get(0)).g + yo0Var3.f, ((yo0) yo0Var4.l.get(0)).g - yo0Var4.f, f5, i5);
                        eq0Var.d(iArr[0]);
                        this.b.e.e.d(iArr[1]);
                    } else if (z2 && z4) {
                        if (!yo0Var.c || !yo0Var2.c) {
                            return;
                        }
                        float f6 = jc0Var2.V;
                        int i6 = ((yo0) yo0Var.l.get(0)).g + yo0Var.f;
                        int i7 = ((yo0) yo0Var2.l.get(0)).g - yo0Var2.f;
                        if (i5 == -1 || i5 == 0) {
                            int iG3 = g(i7 - i6, 0);
                            int i8 = (int) ((iG3 * f6) + 0.5f);
                            int iG4 = g(i8, 1);
                            if (i8 != iG4) {
                                iG3 = (int) ((iG4 / f6) + 0.5f);
                            }
                            eq0Var.d(iG3);
                            this.b.e.e.d(iG4);
                        } else if (i5 == 1) {
                            int iG5 = g(i7 - i6, 0);
                            int i9 = (int) ((iG5 / f6) + 0.5f);
                            int iG6 = g(i9, 1);
                            if (i9 != iG6) {
                                iG5 = (int) ((iG6 * f6) + 0.5f);
                            }
                            eq0Var.d(iG5);
                            this.b.e.e.d(iG6);
                        }
                    } else if (z3 && z5) {
                        if (!yo0Var3.c || !yo0Var4.c) {
                            return;
                        }
                        float f7 = jc0Var2.V;
                        int i10 = ((yo0) yo0Var3.l.get(0)).g + yo0Var3.f;
                        int i11 = ((yo0) yo0Var4.l.get(0)).g - yo0Var4.f;
                        if (i5 == -1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / f7) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f7) + 0.5f);
                            }
                            eq0Var.d(iG2);
                            this.b.e.e.d(iG);
                        } else if (i5 == 0) {
                            int iG7 = g(i11 - i10, 1);
                            int i12 = (int) ((iG7 * f7) + 0.5f);
                            int iG8 = g(i12, 0);
                            if (i12 != iG8) {
                                iG7 = (int) ((iG8 / f7) + 0.5f);
                            }
                            eq0Var.d(iG8);
                            this.b.e.e.d(iG7);
                        } else if (i5 == 1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / f7) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f7) + 0.5f);
                            }
                            eq0Var.d(iG2);
                            this.b.e.e.d(iG);
                        }
                    }
                } else {
                    int i13 = jc0Var2.W;
                    if (i13 != -1) {
                        if (i13 == 0) {
                            f4 = jc0Var2.e.e.g / jc0Var2.V;
                            i2 = (int) (f4 + 0.5f);
                        } else if (i13 != 1) {
                            i2 = 0;
                        } else {
                            f2 = jc0Var2.e.e.g;
                            f3 = jc0Var2.V;
                        }
                        eq0Var.d(i2);
                        f = 0.5f;
                    } else {
                        f2 = jc0Var2.e.e.g;
                        f3 = jc0Var2.V;
                    }
                    f4 = f2 * f3;
                    i2 = (int) (f4 + 0.5f);
                    eq0Var.d(i2);
                    f = 0.5f;
                }
            } else {
                f = 0.5f;
            }
        }
        boolean z7 = yo0Var.c;
        ArrayList arrayList2 = yo0Var.l;
        if (z7) {
            boolean z8 = yo0Var2.c;
            ArrayList arrayList3 = yo0Var2.l;
            if (z8) {
                if (yo0Var.j && yo0Var2.j && eq0Var.j) {
                    return;
                }
                if (!eq0Var.j && this.d == 3) {
                    jc0 jc0Var4 = this.b;
                    if (jc0Var4.r == 0 && !jc0Var4.v()) {
                        yo0 yo0Var5 = (yo0) arrayList2.get(0);
                        yo0 yo0Var6 = (yo0) arrayList3.get(0);
                        int i14 = yo0Var5.g + yo0Var.f;
                        int i15 = yo0Var6.g + yo0Var2.f;
                        yo0Var.d(i14);
                        yo0Var2.d(i15);
                        eq0Var.d(i15 - i14);
                        return;
                    }
                }
                if (!eq0Var.j && this.d == 3 && this.a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((yo0) arrayList3.get(0)).g + yo0Var2.f) - (((yo0) arrayList2.get(0)).g + yo0Var.f), eq0Var.m);
                    jc0 jc0Var5 = this.b;
                    int i16 = jc0Var5.v;
                    int iMax = Math.max(jc0Var5.u, iMin);
                    if (i16 > 0) {
                        iMax = Math.min(i16, iMax);
                    }
                    eq0Var.d(iMax);
                }
                if (eq0Var.j) {
                    yo0 yo0Var7 = (yo0) arrayList2.get(0);
                    yo0 yo0Var8 = (yo0) arrayList3.get(0);
                    int i17 = yo0Var7.g;
                    int i18 = yo0Var.f + i17;
                    int i19 = yo0Var8.g;
                    int i20 = yo0Var2.f + i19;
                    float f8 = this.b.c0;
                    if (yo0Var7 == yo0Var8) {
                        f8 = f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    yo0Var.d((int) ((((i19 - i17) - eq0Var.g) * f8) + i17 + f));
                    yo0Var2.d(yo0Var.g + eq0Var.g);
                }
            }
        }
    }

    @Override // defpackage.ba5
    public final void d() {
        jc0 jc0Var;
        jc0 jc0Var2;
        int i;
        jc0 jc0Var3;
        jc0 jc0Var4;
        int i2;
        jc0 jc0Var5 = this.b;
        boolean z = jc0Var5.a;
        eq0 eq0Var = this.e;
        if (z) {
            eq0Var.d(jc0Var5.o());
        }
        boolean z2 = eq0Var.j;
        ArrayList arrayList = eq0Var.k;
        ArrayList arrayList2 = eq0Var.l;
        yo0 yo0Var = this.i;
        yo0 yo0Var2 = this.h;
        if (!z2) {
            jc0 jc0Var6 = this.b;
            int i3 = jc0Var6.o0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (jc0Var4 = jc0Var6.S) != null && ((i2 = jc0Var4.o0[0]) == 1 || i2 == 4)) {
                    int iO = (jc0Var4.o() - this.b.H.d()) - this.b.J.d();
                    ba5.b(yo0Var2, jc0Var4.d.h, this.b.H.d());
                    ba5.b(yo0Var, jc0Var4.d.i, -this.b.J.d());
                    eq0Var.d(iO);
                    return;
                }
                if (i3 == 1) {
                    eq0Var.d(jc0Var6.o());
                }
            }
        } else if (this.d == 4 && (jc0Var2 = (jc0Var = this.b).S) != null && ((i = jc0Var2.o0[0]) == 1 || i == 4)) {
            ba5.b(yo0Var2, jc0Var2.d.h, jc0Var.H.d());
            ba5.b(yo0Var, jc0Var2.d.i, -this.b.J.d());
            return;
        }
        if (eq0Var.j) {
            jc0 jc0Var7 = this.b;
            if (jc0Var7.a) {
                hb0[] hb0VarArr = jc0Var7.P;
                hb0 hb0Var = hb0VarArr[0];
                hb0 hb0Var2 = hb0Var.f;
                if (hb0Var2 != null && hb0VarArr[1].f != null) {
                    boolean zV = jc0Var7.v();
                    jc0 jc0Var8 = this.b;
                    if (zV) {
                        yo0Var2.f = jc0Var8.P[0].d();
                        yo0Var.f = -this.b.P[1].d();
                        return;
                    }
                    yo0 yo0VarH = ba5.h(jc0Var8.P[0]);
                    if (yo0VarH != null) {
                        ba5.b(yo0Var2, yo0VarH, this.b.P[0].d());
                    }
                    yo0 yo0VarH2 = ba5.h(this.b.P[1]);
                    if (yo0VarH2 != null) {
                        ba5.b(yo0Var, yo0VarH2, -this.b.P[1].d());
                    }
                    yo0Var2.b = true;
                    yo0Var.b = true;
                    return;
                }
                if (hb0Var2 != null) {
                    yo0 yo0VarH3 = ba5.h(hb0Var);
                    if (yo0VarH3 != null) {
                        ba5.b(yo0Var2, yo0VarH3, this.b.P[0].d());
                        ba5.b(yo0Var, yo0Var2, eq0Var.g);
                        return;
                    }
                    return;
                }
                hb0 hb0Var3 = hb0VarArr[1];
                if (hb0Var3.f != null) {
                    yo0 yo0VarH4 = ba5.h(hb0Var3);
                    if (yo0VarH4 != null) {
                        ba5.b(yo0Var, yo0VarH4, -this.b.P[1].d());
                        ba5.b(yo0Var2, yo0Var, -eq0Var.g);
                        return;
                    }
                    return;
                }
                if ((jc0Var7 instanceof ep) || jc0Var7.S == null || jc0Var7.g(7).f != null) {
                    return;
                }
                jc0 jc0Var9 = this.b;
                ba5.b(yo0Var2, jc0Var9.S.d.h, jc0Var9.p());
                ba5.b(yo0Var, yo0Var2, eq0Var.g);
                return;
            }
        }
        if (this.d == 3) {
            jc0 jc0Var10 = this.b;
            int i4 = jc0Var10.r;
            if (i4 == 2) {
                jc0 jc0Var11 = jc0Var10.S;
                if (jc0Var11 != null) {
                    eq0 eq0Var2 = jc0Var11.e.e;
                    arrayList2.add(eq0Var2);
                    eq0Var2.k.add(eq0Var);
                    eq0Var.b = true;
                    arrayList.add(yo0Var2);
                    arrayList.add(yo0Var);
                }
            } else if (i4 == 3) {
                if (jc0Var10.s == 3) {
                    yo0Var2.a = this;
                    yo0Var.a = this;
                    w45 w45Var = jc0Var10.e;
                    w45Var.h.a = this;
                    w45Var.i.a = this;
                    eq0Var.a = this;
                    if (jc0Var10.w()) {
                        arrayList2.add(this.b.e.e);
                        this.b.e.e.k.add(eq0Var);
                        w45 w45Var2 = this.b.e;
                        w45Var2.e.a = this;
                        arrayList2.add(w45Var2.h);
                        arrayList2.add(this.b.e.i);
                        this.b.e.h.k.add(eq0Var);
                        this.b.e.i.k.add(eq0Var);
                    } else {
                        boolean zV2 = this.b.v();
                        jc0 jc0Var12 = this.b;
                        if (zV2) {
                            jc0Var12.e.e.l.add(eq0Var);
                            arrayList.add(this.b.e.e);
                        } else {
                            jc0Var12.e.e.l.add(eq0Var);
                        }
                    }
                } else {
                    eq0 eq0Var3 = jc0Var10.e.e;
                    arrayList2.add(eq0Var3);
                    eq0Var3.k.add(eq0Var);
                    this.b.e.h.k.add(eq0Var);
                    this.b.e.i.k.add(eq0Var);
                    eq0Var.b = true;
                    arrayList.add(yo0Var2);
                    arrayList.add(yo0Var);
                    yo0Var2.l.add(eq0Var);
                    yo0Var.l.add(eq0Var);
                }
            }
        }
        jc0 jc0Var13 = this.b;
        hb0[] hb0VarArr2 = jc0Var13.P;
        hb0 hb0Var4 = hb0VarArr2[0];
        hb0 hb0Var5 = hb0Var4.f;
        if (hb0Var5 != null && hb0VarArr2[1].f != null) {
            boolean zV3 = jc0Var13.v();
            jc0 jc0Var14 = this.b;
            if (zV3) {
                yo0Var2.f = jc0Var14.P[0].d();
                yo0Var.f = -this.b.P[1].d();
                return;
            }
            yo0 yo0VarH5 = ba5.h(jc0Var14.P[0]);
            yo0 yo0VarH6 = ba5.h(this.b.P[1]);
            if (yo0VarH5 != null) {
                yo0VarH5.b(this);
            }
            if (yo0VarH6 != null) {
                yo0VarH6.b(this);
            }
            this.j = 4;
            return;
        }
        if (hb0Var5 != null) {
            yo0 yo0VarH7 = ba5.h(hb0Var4);
            if (yo0VarH7 != null) {
                ba5.b(yo0Var2, yo0VarH7, this.b.P[0].d());
                c(yo0Var, yo0Var2, 1, eq0Var);
                return;
            }
            return;
        }
        hb0 hb0Var6 = hb0VarArr2[1];
        if (hb0Var6.f != null) {
            yo0 yo0VarH8 = ba5.h(hb0Var6);
            if (yo0VarH8 != null) {
                ba5.b(yo0Var, yo0VarH8, -this.b.P[1].d());
                c(yo0Var2, yo0Var, -1, eq0Var);
                return;
            }
            return;
        }
        if ((jc0Var13 instanceof ep) || (jc0Var3 = jc0Var13.S) == null) {
            return;
        }
        ba5.b(yo0Var2, jc0Var3.d.h, jc0Var13.p());
        c(yo0Var, yo0Var2, 1, eq0Var);
    }

    @Override // defpackage.ba5
    public final void e() {
        yo0 yo0Var = this.h;
        if (yo0Var.j) {
            this.b.X = yo0Var.g;
        }
    }

    @Override // defpackage.ba5
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.ba5
    public final boolean k() {
        return this.d != 3 || this.b.r == 0;
    }

    public final void n() {
        this.g = false;
        yo0 yo0Var = this.h;
        yo0Var.c();
        yo0Var.j = false;
        yo0 yo0Var2 = this.i;
        yo0Var2.c();
        yo0Var2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.g0;
    }
}
