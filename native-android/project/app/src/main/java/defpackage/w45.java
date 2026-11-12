package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w45 extends ba5 {
    public yo0 k;
    public gr l;

    @Override // defpackage.uo0
    public final void a(uo0 uo0Var) {
        float f;
        float f2;
        float f3;
        int i;
        if (xa3.w(this.j) == 3) {
            jc0 jc0Var = this.b;
            l(jc0Var.I, jc0Var.K, 1);
            return;
        }
        eq0 eq0Var = this.e;
        if (eq0Var.c && !eq0Var.j && this.d == 3) {
            jc0 jc0Var2 = this.b;
            int i2 = jc0Var2.s;
            if (i2 == 2) {
                jc0 jc0Var3 = jc0Var2.S;
                if (jc0Var3 != null) {
                    eq0 eq0Var2 = jc0Var3.e.e;
                    if (eq0Var2.j) {
                        eq0Var.d((int) ((eq0Var2.g * jc0Var2.z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                eq0 eq0Var3 = jc0Var2.d.e;
                if (eq0Var3.j) {
                    int i3 = jc0Var2.W;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f3 = eq0Var3.g * jc0Var2.V;
                            i = (int) (f3 + 0.5f);
                        } else if (i3 != 1) {
                            i = 0;
                        } else {
                            f = eq0Var3.g;
                            f2 = jc0Var2.V;
                        }
                        eq0Var.d(i);
                    } else {
                        f = eq0Var3.g;
                        f2 = jc0Var2.V;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    eq0Var.d(i);
                }
            }
        }
        yo0 yo0Var = this.h;
        boolean z = yo0Var.c;
        ArrayList arrayList = yo0Var.l;
        if (z) {
            yo0 yo0Var2 = this.i;
            boolean z2 = yo0Var2.c;
            ArrayList arrayList2 = yo0Var2.l;
            if (z2) {
                if (yo0Var.j && yo0Var2.j && eq0Var.j) {
                    return;
                }
                if (!eq0Var.j && this.d == 3) {
                    jc0 jc0Var4 = this.b;
                    if (jc0Var4.r == 0 && !jc0Var4.w()) {
                        yo0 yo0Var3 = (yo0) arrayList.get(0);
                        yo0 yo0Var4 = (yo0) arrayList2.get(0);
                        int i4 = yo0Var3.g + yo0Var.f;
                        int i5 = yo0Var4.g + yo0Var2.f;
                        yo0Var.d(i4);
                        yo0Var2.d(i5);
                        eq0Var.d(i5 - i4);
                        return;
                    }
                }
                if (!eq0Var.j && this.d == 3 && this.a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    yo0 yo0Var5 = (yo0) arrayList.get(0);
                    int i6 = (((yo0) arrayList2.get(0)).g + yo0Var2.f) - (yo0Var5.g + yo0Var.f);
                    int i7 = eq0Var.m;
                    if (i6 < i7) {
                        eq0Var.d(i6);
                    } else {
                        eq0Var.d(i7);
                    }
                }
                if (eq0Var.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    yo0 yo0Var6 = (yo0) arrayList.get(0);
                    yo0 yo0Var7 = (yo0) arrayList2.get(0);
                    int i8 = yo0Var6.g;
                    int i9 = yo0Var.f + i8;
                    int i10 = yo0Var7.g;
                    int i11 = yo0Var2.f + i10;
                    float f4 = this.b.d0;
                    if (yo0Var6 == yo0Var7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    yo0Var.d((int) ((((i10 - i8) - eq0Var.g) * f4) + i8 + 0.5f));
                    yo0Var2.d(yo0Var.g + eq0Var.g);
                }
            }
        }
    }

    @Override // defpackage.ba5
    public final void d() {
        jc0 jc0Var;
        jc0 jc0Var2;
        jc0 jc0Var3;
        jc0 jc0Var4;
        yo0 yo0Var = this.k;
        jc0 jc0Var5 = this.b;
        boolean z = jc0Var5.a;
        eq0 eq0Var = this.e;
        if (z) {
            eq0Var.d(jc0Var5.i());
        }
        boolean z2 = eq0Var.j;
        ArrayList arrayList = eq0Var.k;
        ArrayList arrayList2 = eq0Var.l;
        yo0 yo0Var2 = this.i;
        yo0 yo0Var3 = this.h;
        if (!z2) {
            jc0 jc0Var6 = this.b;
            this.d = jc0Var6.o0[1];
            if (jc0Var6.E) {
                this.l = new gr(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (jc0Var4 = this.b.S) != null && jc0Var4.o0[1] == 1) {
                    int i2 = (jc0Var4.i() - this.b.I.d()) - this.b.K.d();
                    ba5.b(yo0Var3, jc0Var4.e.h, this.b.I.d());
                    ba5.b(yo0Var2, jc0Var4.e.i, -this.b.K.d());
                    eq0Var.d(i2);
                    return;
                }
                if (i == 1) {
                    eq0Var.d(this.b.i());
                }
            }
        } else if (this.d == 4 && (jc0Var2 = (jc0Var = this.b).S) != null && jc0Var2.o0[1] == 1) {
            ba5.b(yo0Var3, jc0Var2.e.h, jc0Var.I.d());
            ba5.b(yo0Var2, jc0Var2.e.i, -this.b.K.d());
            return;
        }
        boolean z3 = eq0Var.j;
        if (z3) {
            jc0 jc0Var7 = this.b;
            if (jc0Var7.a) {
                hb0[] hb0VarArr = jc0Var7.P;
                hb0 hb0Var = hb0VarArr[2];
                hb0 hb0Var2 = hb0Var.f;
                if (hb0Var2 != null && hb0VarArr[3].f != null) {
                    boolean zW = jc0Var7.w();
                    jc0 jc0Var8 = this.b;
                    if (zW) {
                        yo0Var3.f = jc0Var8.P[2].d();
                        yo0Var2.f = -this.b.P[3].d();
                    } else {
                        yo0 yo0VarH = ba5.h(jc0Var8.P[2]);
                        if (yo0VarH != null) {
                            ba5.b(yo0Var3, yo0VarH, this.b.P[2].d());
                        }
                        yo0 yo0VarH2 = ba5.h(this.b.P[3]);
                        if (yo0VarH2 != null) {
                            ba5.b(yo0Var2, yo0VarH2, -this.b.P[3].d());
                        }
                        yo0Var3.b = true;
                        yo0Var2.b = true;
                    }
                    jc0 jc0Var9 = this.b;
                    if (jc0Var9.E) {
                        ba5.b(yo0Var, yo0Var3, jc0Var9.Z);
                        return;
                    }
                    return;
                }
                if (hb0Var2 != null) {
                    yo0 yo0VarH3 = ba5.h(hb0Var);
                    if (yo0VarH3 != null) {
                        ba5.b(yo0Var3, yo0VarH3, this.b.P[2].d());
                        ba5.b(yo0Var2, yo0Var3, eq0Var.g);
                        jc0 jc0Var10 = this.b;
                        if (jc0Var10.E) {
                            ba5.b(yo0Var, yo0Var3, jc0Var10.Z);
                            return;
                        }
                        return;
                    }
                    return;
                }
                hb0 hb0Var3 = hb0VarArr[3];
                if (hb0Var3.f != null) {
                    yo0 yo0VarH4 = ba5.h(hb0Var3);
                    if (yo0VarH4 != null) {
                        ba5.b(yo0Var2, yo0VarH4, -this.b.P[3].d());
                        ba5.b(yo0Var3, yo0Var2, -eq0Var.g);
                    }
                    jc0 jc0Var11 = this.b;
                    if (jc0Var11.E) {
                        ba5.b(yo0Var, yo0Var3, jc0Var11.Z);
                        return;
                    }
                    return;
                }
                hb0 hb0Var4 = hb0VarArr[4];
                if (hb0Var4.f != null) {
                    yo0 yo0VarH5 = ba5.h(hb0Var4);
                    if (yo0VarH5 != null) {
                        ba5.b(yo0Var, yo0VarH5, 0);
                        ba5.b(yo0Var3, yo0Var, -this.b.Z);
                        ba5.b(yo0Var2, yo0Var3, eq0Var.g);
                        return;
                    }
                    return;
                }
                if ((jc0Var7 instanceof ep) || jc0Var7.S == null || jc0Var7.g(7).f != null) {
                    return;
                }
                jc0 jc0Var12 = this.b;
                ba5.b(yo0Var3, jc0Var12.S.e.h, jc0Var12.q());
                ba5.b(yo0Var2, yo0Var3, eq0Var.g);
                jc0 jc0Var13 = this.b;
                if (jc0Var13.E) {
                    ba5.b(yo0Var, yo0Var3, jc0Var13.Z);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != 3) {
            eq0Var.b(this);
        } else {
            jc0 jc0Var14 = this.b;
            int i3 = jc0Var14.s;
            if (i3 == 2) {
                jc0 jc0Var15 = jc0Var14.S;
                if (jc0Var15 != null) {
                    eq0 eq0Var2 = jc0Var15.e.e;
                    arrayList2.add(eq0Var2);
                    eq0Var2.k.add(eq0Var);
                    eq0Var.b = true;
                    arrayList.add(yo0Var3);
                    arrayList.add(yo0Var2);
                }
            } else if (i3 == 3 && !jc0Var14.w()) {
                jc0 jc0Var16 = this.b;
                if (jc0Var16.r != 3) {
                    eq0 eq0Var3 = jc0Var16.d.e;
                    arrayList2.add(eq0Var3);
                    eq0Var3.k.add(eq0Var);
                    eq0Var.b = true;
                    arrayList.add(yo0Var3);
                    arrayList.add(yo0Var2);
                }
            }
        }
        jc0 jc0Var17 = this.b;
        hb0[] hb0VarArr2 = jc0Var17.P;
        hb0 hb0Var5 = hb0VarArr2[2];
        hb0 hb0Var6 = hb0Var5.f;
        if (hb0Var6 != null && hb0VarArr2[3].f != null) {
            boolean zW2 = jc0Var17.w();
            jc0 jc0Var18 = this.b;
            if (zW2) {
                yo0Var3.f = jc0Var18.P[2].d();
                yo0Var2.f = -this.b.P[3].d();
            } else {
                yo0 yo0VarH6 = ba5.h(jc0Var18.P[2]);
                yo0 yo0VarH7 = ba5.h(this.b.P[3]);
                if (yo0VarH6 != null) {
                    yo0VarH6.b(this);
                }
                if (yo0VarH7 != null) {
                    yo0VarH7.b(this);
                }
                this.j = 4;
            }
            if (this.b.E) {
                c(yo0Var, yo0Var3, 1, this.l);
            }
        } else if (hb0Var6 != null) {
            yo0 yo0VarH8 = ba5.h(hb0Var5);
            if (yo0VarH8 != null) {
                ba5.b(yo0Var3, yo0VarH8, this.b.P[2].d());
                c(yo0Var2, yo0Var3, 1, eq0Var);
                if (this.b.E) {
                    c(yo0Var, yo0Var3, 1, this.l);
                }
                if (this.d == 3) {
                    jc0 jc0Var19 = this.b;
                    if (jc0Var19.V > 0.0f) {
                        up1 up1Var = jc0Var19.d;
                        if (up1Var.d == 3) {
                            up1Var.e.k.add(eq0Var);
                            arrayList2.add(this.b.d.e);
                            eq0Var.a = this;
                        }
                    }
                }
            }
        } else {
            hb0 hb0Var7 = hb0VarArr2[3];
            if (hb0Var7.f != null) {
                yo0 yo0VarH9 = ba5.h(hb0Var7);
                if (yo0VarH9 != null) {
                    ba5.b(yo0Var2, yo0VarH9, -this.b.P[3].d());
                    c(yo0Var3, yo0Var2, -1, eq0Var);
                    if (this.b.E) {
                        c(yo0Var, yo0Var3, 1, this.l);
                    }
                }
            } else {
                hb0 hb0Var8 = hb0VarArr2[4];
                if (hb0Var8.f != null) {
                    yo0 yo0VarH10 = ba5.h(hb0Var8);
                    if (yo0VarH10 != null) {
                        ba5.b(yo0Var, yo0VarH10, 0);
                        c(yo0Var3, yo0Var, -1, this.l);
                        c(yo0Var2, yo0Var3, 1, eq0Var);
                    }
                } else if (!(jc0Var17 instanceof ep) && (jc0Var3 = jc0Var17.S) != null) {
                    ba5.b(yo0Var3, jc0Var3.e.h, jc0Var17.q());
                    c(yo0Var2, yo0Var3, 1, eq0Var);
                    if (this.b.E) {
                        c(yo0Var, yo0Var3, 1, this.l);
                    }
                    if (this.d == 3) {
                        jc0 jc0Var20 = this.b;
                        if (jc0Var20.V > 0.0f) {
                            up1 up1Var2 = jc0Var20.d;
                            if (up1Var2.d == 3) {
                                up1Var2.e.k.add(eq0Var);
                                arrayList2.add(this.b.d.e);
                                eq0Var.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            eq0Var.c = true;
        }
    }

    @Override // defpackage.ba5
    public final void e() {
        yo0 yo0Var = this.h;
        if (yo0Var.j) {
            this.b.Y = yo0Var.g;
        }
    }

    @Override // defpackage.ba5
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.ba5
    public final boolean k() {
        return this.d != 3 || this.b.s == 0;
    }

    public final void m() {
        this.g = false;
        yo0 yo0Var = this.h;
        yo0Var.c();
        yo0Var.j = false;
        yo0 yo0Var2 = this.i;
        yo0Var2.c();
        yo0Var2.j = false;
        yo0 yo0Var3 = this.k;
        yo0Var3.c();
        yo0Var3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.g0;
    }
}
