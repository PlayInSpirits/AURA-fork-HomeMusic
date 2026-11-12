package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g63 {
    public static final p03 a;

    static {
        p03 p03Var = r73.a;
        a = new p03();
    }

    public static final void a(cx2 cx2Var, int i, int i2) {
        if (!(cx2Var instanceof fo0)) {
            b(cx2Var, i & cx2Var.p, i2);
            return;
        }
        fo0 fo0Var = (fo0) cx2Var;
        int i3 = fo0Var.B;
        b(cx2Var, i3 & i, i2);
        int i4 = (~i3) & i;
        for (cx2 cx2Var2 = fo0Var.C; cx2Var2 != null; cx2Var2 = cx2Var2.s) {
            a(cx2Var2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(cx2 cx2Var, int i, int i2) {
        if (i2 != 0 || cx2Var.f0()) {
            if ((i & 2) != 0 && (cx2Var instanceof u62)) {
                g12.A((u62) cx2Var);
                if (i2 == 2) {
                    j51.M(cx2Var, 2).O0();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                j51.O(cx2Var).D();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                j51.O(cx2Var).V(false);
            }
            if ((i & 256) != 0 && (cx2Var instanceof vi1)) {
                if (i2 == 1) {
                    c72 c72VarO = j51.O(cx2Var);
                    c72VarO.b0(c72VarO.Y + 1);
                } else if (i2 == 2) {
                    c72 c72VarO2 = j51.O(cx2Var);
                    c72VarO2.b0(c72VarO2.Y - 1);
                }
                if (i2 != 2) {
                    c72 c72VarO3 = j51.O(cx2Var);
                    if (c72VarO3.Y != 0 && !c72VarO3.p() && !c72VarO3.q() && !c72VarO3.X) {
                        ra raVar = (ra) h12.L(c72VarO3);
                        rm3 rm3Var = raVar.f0.e;
                        rm3Var.getClass();
                        if (c72VarO3.Y > 0) {
                            ((f13) rm3Var.n).b(c72VarO3);
                            c72VarO3.X = true;
                        }
                        raVar.D(null);
                    }
                }
            }
            if ((i & 4) != 0 && (cx2Var instanceof rv0)) {
                jz4.z((rv0) cx2Var);
            }
            if ((i & 8) != 0 && (cx2Var instanceof g94)) {
                j51.O(cx2Var).D = true;
            }
            if ((i & 64) != 0 && (cx2Var instanceof xo)) {
                j51.O((xo) cx2Var).R.p.getClass();
            }
            if ((i & 2048) != 0 && (cx2Var instanceof xo)) {
                bx2 bx2Var = ((xo) cx2Var).B;
                cz1.b("applyFocusProperties called on wrong node");
                bx2Var.getClass();
                kf2.k();
                return;
            }
            if ((i & 4096) != 0 && (cx2Var instanceof xo)) {
                xo xoVar = (xo) cx2Var;
                s91 s91Var = (s91) ((ey) ((ra) j51.P(xoVar)).getFocusOwner()).d;
                if (s91Var.d.a(xoVar)) {
                    s91Var.a();
                }
            }
            if ((i & 2097152) != 0 && (cx2Var instanceof my1) && i2 == 2) {
                ((my1) cx2Var).N();
            }
        }
    }

    public static final void c(cx2 cx2Var) {
        if (!cx2Var.A) {
            cz1.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(cx2Var, -1, 0);
    }

    public static final int d(cx2 cx2Var) {
        int i = cx2Var.p;
        if (i != 0) {
            return i;
        }
        Class<?> cls = cx2Var.getClass();
        p03 p03Var = a;
        int iD = p03Var.d(cls);
        if (iD >= 0) {
            return p03Var.c[iD];
        }
        int i2 = cx2Var instanceof u62 ? 3 : 1;
        if (cx2Var instanceof rv0) {
            i2 |= 4;
        }
        if (cx2Var instanceof g94) {
            i2 |= 8;
        }
        if (cx2Var instanceof rn3) {
            i2 |= 16;
        }
        if (cx2Var instanceof fx2) {
            i2 |= 32;
        }
        if (cx2Var instanceof xo) {
            i2 |= 64;
        }
        if (cx2Var instanceof o62) {
            i2 |= 4194432;
        } else if (cx2Var instanceof yi2) {
            i2 |= 128;
        }
        if (cx2Var instanceof vi1) {
            i2 |= 256;
        }
        if (cx2Var instanceof ba1) {
            i2 |= 1024;
        }
        boolean z = cx2Var instanceof xo;
        if (z) {
            i2 |= 2048;
        }
        if (z) {
            i2 |= 4096;
        }
        if (cx2Var instanceof j42) {
            i2 |= 8192;
        }
        if (cx2Var instanceof ma) {
            i2 |= 16384;
        }
        if (cx2Var instanceof a90) {
            i2 |= 32768;
        }
        if (cx2Var instanceof rx4) {
            i2 |= 262144;
        }
        if (cx2Var instanceof zu) {
            i2 |= 524288;
        }
        if (cx2Var instanceof ba1) {
            i2 |= 1048576;
        }
        if (cx2Var instanceof my1) {
            i2 |= 2097152;
        }
        if (cx2Var instanceof z72) {
            i2 |= 8388608;
        }
        p03Var.g(i2, cls);
        return i2;
    }

    public static final int e(cx2 cx2Var) {
        if (!(cx2Var instanceof fo0)) {
            return d(cx2Var);
        }
        fo0 fo0Var = (fo0) cx2Var;
        int iE = fo0Var.B;
        for (cx2 cx2Var2 = fo0Var.C; cx2Var2 != null; cx2Var2 = cx2Var2.s) {
            iE |= e(cx2Var2);
        }
        return iE;
    }

    public static final boolean f(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }
}
