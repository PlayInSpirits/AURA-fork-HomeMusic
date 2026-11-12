package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ba5 implements uo0 {
    public int a;
    public jc0 b;
    public v34 c;
    public int d;
    public final eq0 e = new eq0(this);
    public int f = 0;
    public boolean g = false;
    public final yo0 h = new yo0(this);
    public final yo0 i = new yo0(this);
    public int j = 1;

    public ba5(jc0 jc0Var) {
        this.b = jc0Var;
    }

    public static void b(yo0 yo0Var, yo0 yo0Var2, int i) {
        yo0Var.l.add(yo0Var2);
        yo0Var.f = i;
        yo0Var2.k.add(yo0Var);
    }

    public static yo0 h(hb0 hb0Var) {
        hb0 hb0Var2 = hb0Var.f;
        if (hb0Var2 == null) {
            return null;
        }
        jc0 jc0Var = hb0Var2.d;
        int iW = xa3.w(hb0Var2.e);
        if (iW == 1) {
            return jc0Var.d.h;
        }
        if (iW == 2) {
            return jc0Var.e.h;
        }
        if (iW == 3) {
            return jc0Var.d.i;
        }
        if (iW == 4) {
            return jc0Var.e.i;
        }
        if (iW != 5) {
            return null;
        }
        return jc0Var.e.k;
    }

    public static yo0 i(hb0 hb0Var, int i) {
        hb0 hb0Var2 = hb0Var.f;
        if (hb0Var2 == null) {
            return null;
        }
        jc0 jc0Var = hb0Var2.d;
        ba5 ba5Var = i == 0 ? jc0Var.d : jc0Var.e;
        int iW = xa3.w(hb0Var2.e);
        if (iW == 1 || iW == 2) {
            return ba5Var.h;
        }
        if (iW == 3 || iW == 4) {
            return ba5Var.i;
        }
        return null;
    }

    public final void c(yo0 yo0Var, yo0 yo0Var2, int i, eq0 eq0Var) {
        yo0Var.l.add(yo0Var2);
        yo0Var.l.add(this.e);
        yo0Var.h = i;
        yo0Var.i = eq0Var;
        yo0Var2.k.add(yo0Var);
        eq0Var.k.add(yo0Var);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        jc0 jc0Var = this.b;
        if (i2 == 0) {
            int i3 = jc0Var.v;
            int iMax = Math.max(jc0Var.u, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            int i4 = jc0Var.y;
            int iMax2 = Math.max(jc0Var.x, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public long j() {
        eq0 eq0Var = this.e;
        if (eq0Var.j) {
            return eq0Var.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    public final void l(hb0 hb0Var, hb0 hb0Var2, int i) {
        eq0 eq0Var;
        float f;
        int i2;
        int i3;
        yo0 yo0VarH = h(hb0Var);
        yo0 yo0VarH2 = h(hb0Var2);
        if (yo0VarH.j && yo0VarH2.j) {
            int iD = hb0Var.d() + yo0VarH.g;
            int iD2 = yo0VarH2.g - hb0Var2.d();
            int i4 = iD2 - iD;
            eq0 eq0Var2 = this.e;
            if (!eq0Var2.j && this.d == 3) {
                int i5 = this.a;
                if (i5 == 0) {
                    eq0Var2.d(g(i4, i));
                } else if (i5 == 1) {
                    eq0Var2.d(Math.min(g(eq0Var2.m, i), i4));
                } else if (i5 == 2) {
                    jc0 jc0Var = this.b;
                    jc0 jc0Var2 = jc0Var.S;
                    if (jc0Var2 != null) {
                        eq0 eq0Var3 = (i == 0 ? jc0Var2.d : jc0Var2.e).e;
                        if (eq0Var3.j) {
                            eq0Var2.d(g((int) ((eq0Var3.g * (i == 0 ? jc0Var.w : jc0Var.z)) + 0.5f), i));
                        }
                    }
                } else if (i5 == 3) {
                    jc0 jc0Var3 = this.b;
                    ba5 ba5Var = jc0Var3.d;
                    if (ba5Var.d == 3 && ba5Var.a == 3) {
                        w45 w45Var = jc0Var3.e;
                        if (w45Var.d != 3 || w45Var.a != 3) {
                            if (i == 0) {
                                ba5Var = jc0Var3.e;
                            }
                            eq0Var = ba5Var.e;
                            if (eq0Var.j) {
                                f = jc0Var3.V;
                                i2 = eq0Var.g;
                                if (i == 1) {
                                    i3 = (int) ((i2 / f) + 0.5f);
                                } else {
                                    i3 = (int) ((f * i2) + 0.5f);
                                }
                                eq0Var2.d(i3);
                            }
                        }
                    } else {
                        if (i == 0) {
                            ba5Var = jc0Var3.e;
                        }
                        eq0Var = ba5Var.e;
                        if (eq0Var.j) {
                            f = jc0Var3.V;
                            i2 = eq0Var.g;
                            if (i == 1) {
                                i3 = (int) ((i2 / f) + 0.5f);
                            } else {
                                i3 = (int) ((f * i2) + 0.5f);
                            }
                            eq0Var2.d(i3);
                        }
                    }
                }
            }
            if (eq0Var2.j) {
                int i6 = eq0Var2.g;
                yo0 yo0Var = this.i;
                yo0 yo0Var2 = this.h;
                if (i6 == i4) {
                    yo0Var2.d(iD);
                    yo0Var.d(iD2);
                    return;
                }
                jc0 jc0Var4 = this.b;
                float f2 = i == 0 ? jc0Var4.c0 : jc0Var4.d0;
                if (yo0VarH == yo0VarH2) {
                    iD = yo0VarH.g;
                    iD2 = yo0VarH2.g;
                    f2 = 0.5f;
                }
                yo0Var2.d((int) ((((iD2 - iD) - i6) * f2) + iD + 0.5f));
                yo0Var.d(yo0Var2.g + eq0Var2.g);
            }
        }
    }
}
