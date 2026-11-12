package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ba1 extends cx2 implements a90, b83, fx2, eo0 {
    public final wf1 B;
    public boolean C;
    public boolean D;
    public final int E;
    public c12 F;

    public ba1(int i, wf1 wf1Var, int i2) {
        this.B = (i2 & 4) != 0 ? null : wf1Var;
        this.E = i;
    }

    @Override // defpackage.b83
    public final void Q() {
        w0();
    }

    @Override // defpackage.cx2
    public final boolean f0() {
        return false;
    }

    @Override // defpackage.cx2
    public final void i0() {
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // defpackage.cx2
    public final void j0() {
        int iOrdinal = v0().ordinal();
        if (iOrdinal == 0) {
            ey eyVar = (ey) ((ra) j51.P(this)).getFocusOwner();
            eyVar.b(8, true, false);
            ((s91) eyVar.d).a();
        } else if (iOrdinal == 1) {
            ((ra) j51.P(this)).getFocusOwner();
            te5.p(this);
        } else if (iOrdinal == 2) {
            ey eyVar2 = (ey) ((ra) j51.P(this)).getFocusOwner();
            eyVar2.b(8, true, false);
            ((s91) eyVar2.d).a();
        } else if (iOrdinal != 3) {
            er1.n();
            return;
        }
        c12 c12Var = this.F;
        if (c12Var != null) {
            c12Var.k();
        }
        this.F = null;
    }

    @Override // defpackage.cx2
    public final void k0() {
        if (v0().a()) {
            ((ey) ((ra) j51.P(this)).getFocusOwner()).b(8, true, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:165:0x027d  */
    /* JADX WARN: Code duplicated, block: B:167:0x0284 A[ADDED_TO_REGION, LOOP:9: B:167:0x0284->B:174:0x0296, LOOP_START, PHI: r14
  0x0284: PHI (r14v3 int) = (r14v2 int), (r14v4 int) binds: [B:166:0x0282, B:174:0x0296] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:168:0x0286  */
    /* JADX WARN: Code duplicated, block: B:171:0x0291 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:172:0x0293  */
    /* JADX WARN: Code duplicated, block: B:173:0x0295  */
    /* JADX WARN: Code duplicated, block: B:175:0x029c  */
    /* JADX WARN: Code duplicated, block: B:178:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:182:0x02af A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:216:0x021a A[SYNTHETIC] */
    public final boolean q0() {
        f13 f13Var;
        int i;
        ba1 ba1Var;
        z91 z91Var;
        w12 w12Var;
        boolean z;
        w12 w12Var2;
        int iOrdinal = uc5.O(this).ordinal();
        if (iOrdinal == 0) {
            ey eyVar = (ey) ((ra) j51.P(this)).getFocusOwner();
            ba1 ba1VarF = eyVar.f();
            z91 z91VarV0 = v0();
            if (ba1VarF == this) {
                r0(z91VarV0, z91VarV0);
                return true;
            }
            if (ba1VarF != null || ((ra) ((ey) ((ra) j51.P(this)).getFocusOwner()).a).B()) {
                if (ba1VarF != null) {
                    f13Var = new f13(new ba1[16]);
                    if (!ba1VarF.n.A) {
                        cz1.b("visitAncestors called on an unattached node");
                    }
                    cx2 cx2Var = ba1VarF.n.r;
                    c72 c72VarO = j51.O(ba1VarF);
                    while (c72VarO != null) {
                        if ((((cx2) c72VarO.Q.g).q & 1024) != 0) {
                            while (cx2Var != null) {
                                if ((cx2Var.p & 1024) != 0) {
                                    cx2 cx2VarC = cx2Var;
                                    f13 f13Var2 = null;
                                    while (cx2VarC != null) {
                                        if (cx2VarC instanceof ba1) {
                                            f13Var.b((ba1) cx2VarC);
                                        } else if ((cx2VarC.p & 1024) != 0 && (cx2VarC instanceof fo0)) {
                                            int i2 = 0;
                                            for (cx2 cx2Var2 = ((fo0) cx2VarC).C; cx2Var2 != null; cx2Var2 = cx2Var2.s) {
                                                if ((cx2Var2.p & 1024) != 0) {
                                                    i2++;
                                                    if (i2 == 1) {
                                                        cx2VarC = cx2Var2;
                                                    } else {
                                                        if (f13Var2 == null) {
                                                            f13Var2 = new f13(new cx2[16]);
                                                        }
                                                        if (cx2VarC != null) {
                                                            f13Var2.b(cx2VarC);
                                                            cx2VarC = null;
                                                        }
                                                        f13Var2.b(cx2Var2);
                                                    }
                                                }
                                            }
                                            if (i2 == 1) {
                                            }
                                        }
                                        cx2VarC = j51.c(f13Var2);
                                    }
                                }
                                cx2Var = cx2Var.r;
                            }
                        }
                        c72VarO = c72VarO.t();
                        cx2Var = (c72VarO == null || (w12Var2 = c72VarO.Q) == null) ? null : (sq4) w12Var2.f;
                    }
                } else {
                    f13Var = null;
                }
                Object[] objArr = new ba1[16];
                Object[] objArr2 = new ba1[16];
                if (!this.n.A) {
                    cz1.b("visitAncestors called on an unattached node");
                }
                cx2 cx2Var3 = this.n.r;
                c72 c72VarO2 = j51.O(this);
                int i3 = 0;
                int i4 = 0;
                boolean z2 = true;
                while (c72VarO2 != null) {
                    if ((((cx2) c72VarO2.Q.g).q & 1024) != 0) {
                        while (cx2Var3 != null) {
                            if ((cx2Var3.p & 1024) != 0) {
                                cx2 cx2VarC2 = cx2Var3;
                                f13 f13Var3 = null;
                                while (cx2VarC2 != null) {
                                    if (cx2VarC2 instanceof ba1) {
                                        ba1 ba1Var2 = (ba1) cx2VarC2;
                                        if (h12.c(f13Var != null ? Boolean.valueOf(f13Var.j(ba1Var2)) : null, Boolean.TRUE)) {
                                            int i5 = i3 + 1;
                                            if (objArr.length < i5) {
                                                int length = objArr.length;
                                                Object[] objArr3 = new Object[Math.max(i5, length * 2)];
                                                System.arraycopy(objArr, 0, objArr3, 0, length);
                                                objArr = objArr3;
                                            }
                                            objArr[i3] = ba1Var2;
                                            i3 = i5;
                                        } else {
                                            eyVar = eyVar;
                                            int i6 = i4 + 1;
                                            if (objArr2.length < i6) {
                                                int length2 = objArr2.length;
                                                Object[] objArr4 = new Object[Math.max(i6, length2 * 2)];
                                                System.arraycopy(objArr2, 0, objArr4, 0, length2);
                                                objArr2 = objArr4;
                                            }
                                            objArr2[i4] = ba1Var2;
                                            i4 = i6;
                                        }
                                        if (ba1Var2 == ba1VarF) {
                                            z2 = false;
                                        }
                                        z = false;
                                    } else {
                                        eyVar = eyVar;
                                        z = true;
                                    }
                                    if (z && (cx2VarC2.p & 1024) != 0 && (cx2VarC2 instanceof fo0)) {
                                        int i7 = 0;
                                        for (cx2 cx2Var4 = ((fo0) cx2VarC2).C; cx2Var4 != null; cx2Var4 = cx2Var4.s) {
                                            if ((cx2Var4.p & 1024) != 0) {
                                                int i8 = i7 + 1;
                                                if (i8 == 1) {
                                                    cx2VarC2 = cx2Var4;
                                                    i8 = i8;
                                                } else {
                                                    f13 f13Var4 = f13Var3 == null ? new f13(new cx2[16]) : f13Var3;
                                                    if (cx2VarC2 != null) {
                                                        f13Var4.b(cx2VarC2);
                                                        cx2VarC2 = null;
                                                    }
                                                    f13Var4.b(cx2Var4);
                                                    f13Var3 = f13Var4;
                                                }
                                                i7 = i8;
                                            }
                                        }
                                        if (i7 != 1) {
                                            cx2VarC2 = j51.c(f13Var3);
                                        }
                                    } else {
                                        cx2VarC2 = j51.c(f13Var3);
                                    }
                                }
                            }
                            cx2Var3 = cx2Var3.r;
                            eyVar = eyVar;
                        }
                    }
                    ey eyVar2 = eyVar;
                    c72VarO2 = c72VarO2.t();
                    cx2Var3 = (c72VarO2 == null || (w12Var = c72VarO2.Q) == null) ? null : (sq4) w12Var.f;
                    eyVar = eyVar2;
                }
                ey eyVar3 = eyVar;
                if (!z2 || ba1VarF == null || uc5.P(ba1VarF, false)) {
                    j51.F(this, new wc(4, this));
                    int iOrdinal2 = v0().ordinal();
                    if (iOrdinal2 != 0) {
                        if (iOrdinal2 == 1) {
                            ((ey) ((ra) j51.P(this)).getFocusOwner()).h(this);
                        } else if (iOrdinal2 != 2) {
                            if (iOrdinal2 != 3) {
                                er1.n();
                                return false;
                            }
                            ((ey) ((ra) j51.P(this)).getFocusOwner()).h(this);
                        }
                    }
                    z91 z91Var2 = z91.p;
                    z91 z91Var3 = z91.n;
                    if (z2 && ba1VarF != null) {
                        ba1VarF.r0(z91Var3, z91Var2);
                    }
                    z91 z91Var4 = z91.o;
                    if (f13Var != null) {
                        int i9 = f13Var.p - 1;
                        Object[] objArr5 = f13Var.n;
                        if (i9 < objArr5.length) {
                            while (i9 >= 0) {
                                ba1 ba1Var3 = (ba1) objArr5[i9];
                                if (eyVar3.f() == this) {
                                    ba1Var3.r0(z91Var4, z91Var2);
                                    i9--;
                                }
                            }
                            i = i4 - 1;
                            if (i < objArr2.length) {
                                while (i >= 0) {
                                    ba1Var = (ba1) objArr2[i];
                                    if (eyVar3.f() == this) {
                                        if (ba1Var == ba1VarF) {
                                            z91Var = z91Var3;
                                        } else {
                                            z91Var = z91Var2;
                                        }
                                        ba1Var.r0(z91Var, z91Var4);
                                        i--;
                                    }
                                }
                                if (eyVar3.f() == this) {
                                    r0(z91VarV0, z91Var3);
                                    if (eyVar3.f() != this) {
                                        return true;
                                    }
                                }
                            } else if (eyVar3.f() == this) {
                                r0(z91VarV0, z91Var3);
                                if (eyVar3.f() != this) {
                                    return true;
                                }
                            }
                        } else {
                            i = i4 - 1;
                            if (i < objArr2.length) {
                                while (i >= 0) {
                                    ba1Var = (ba1) objArr2[i];
                                    if (eyVar3.f() == this) {
                                        if (ba1Var == ba1VarF) {
                                            z91Var = z91Var3;
                                        } else {
                                            z91Var = z91Var2;
                                        }
                                        ba1Var.r0(z91Var, z91Var4);
                                        i--;
                                    }
                                }
                                if (eyVar3.f() == this) {
                                    r0(z91VarV0, z91Var3);
                                    if (eyVar3.f() != this) {
                                        return true;
                                    }
                                }
                            } else if (eyVar3.f() == this) {
                                r0(z91VarV0, z91Var3);
                                if (eyVar3.f() != this) {
                                    return true;
                                }
                            }
                        }
                    } else {
                        i = i4 - 1;
                        if (i < objArr2.length) {
                            while (i >= 0) {
                                ba1Var = (ba1) objArr2[i];
                                if (eyVar3.f() == this) {
                                    if (ba1Var == ba1VarF) {
                                        z91Var = z91Var3;
                                    } else {
                                        z91Var = z91Var2;
                                    }
                                    ba1Var.r0(z91Var, z91Var4);
                                    i--;
                                }
                            }
                            if (eyVar3.f() == this) {
                                r0(z91VarV0, z91Var3);
                                if (eyVar3.f() != this) {
                                    return true;
                                }
                            }
                        } else if (eyVar3.f() == this) {
                            r0(z91VarV0, z91Var3);
                            if (eyVar3.f() != this) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
        } else if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return true;
            }
            if (iOrdinal != 3) {
                er1.n();
                return false;
            }
        }
        return false;
    }

    public final void r0(z91 z91Var, z91 z91Var2) {
        w12 w12Var;
        wf1 wf1Var;
        ey eyVar = (ey) ((ra) j51.P(this)).getFocusOwner();
        ba1 ba1VarF = eyVar.f();
        if (!z91Var.equals(z91Var2) && (wf1Var = this.B) != null) {
            wf1Var.invoke(z91Var, z91Var2);
        }
        cx2 cx2Var = this.n;
        if (!cx2Var.A) {
            cz1.b("visitAncestors called on an unattached node");
        }
        cx2 cx2Var2 = this.n;
        c72 c72VarO = j51.O(this);
        while (c72VarO != null) {
            if ((((cx2) c72VarO.Q.g).q & 5120) != 0) {
                while (cx2Var2 != null) {
                    int i = cx2Var2.p;
                    if ((i & 5120) != 0) {
                        if (cx2Var2 != cx2Var && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            cx2 cx2VarC = cx2Var2;
                            f13 f13Var = null;
                            while (cx2VarC != null) {
                                if (cx2VarC instanceof xo) {
                                    xo xoVar = (xo) cx2VarC;
                                    if (ba1VarF == eyVar.f()) {
                                        xoVar.r0();
                                        throw null;
                                    }
                                } else if ((cx2VarC.p & 4096) != 0 && (cx2VarC instanceof fo0)) {
                                    int i2 = 0;
                                    for (cx2 cx2Var3 = ((fo0) cx2VarC).C; cx2Var3 != null; cx2Var3 = cx2Var3.s) {
                                        if ((cx2Var3.p & 4096) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cx2VarC = cx2Var3;
                                            } else {
                                                if (f13Var == null) {
                                                    f13Var = new f13(new cx2[16]);
                                                }
                                                if (cx2VarC != null) {
                                                    f13Var.b(cx2VarC);
                                                    cx2VarC = null;
                                                }
                                                f13Var.b(cx2Var3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cx2VarC = j51.c(f13Var);
                            }
                        } else {
                            continue;
                        }
                    }
                    cx2Var2 = cx2Var2.r;
                }
            }
            c72VarO = c72VarO.t();
            cx2Var2 = (c72VarO == null || (w12Var = c72VarO.Q) == null) ? null : (sq4) w12Var.f;
        }
    }

    public final x91 s0() {
        boolean z;
        w12 w12Var;
        x91 x91Var = new x91();
        x91Var.a = true;
        y91 y91Var = y91.b;
        x91Var.b = y91Var;
        x91Var.c = y91Var;
        x91Var.d = y91Var;
        x91Var.e = y91Var;
        x91Var.f = y91Var;
        x91Var.g = y91Var;
        x91Var.h = y91Var;
        x91Var.i = y91Var;
        x91Var.j = new k2(18, (byte) 0);
        x91Var.k = new k2(18, (byte) 0);
        x91Var.l = fz0.a0;
        int i = this.E;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((qz1) ((sz1) ((rz1) kb4.q(this, g90.m))).a.getValue()).a == 1);
        } else {
            if (i != 2) {
                kf2.o("Unknown Focusability");
                return null;
            }
            z = false;
        }
        x91Var.a = z;
        cx2 cx2Var = this.n;
        if (!cx2Var.A) {
            cz1.b("visitAncestors called on an unattached node");
        }
        cx2 cx2Var2 = this.n;
        c72 c72VarO = j51.O(this);
        loop0: while (c72VarO != null) {
            if ((((cx2) c72VarO.Q.g).q & 3072) != 0) {
                while (cx2Var2 != null) {
                    int i2 = cx2Var2.p;
                    if ((i2 & 3072) != 0) {
                        if (cx2Var2 != cx2Var && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            f13 f13Var = null;
                            cx2 cx2VarC = cx2Var2;
                            while (cx2VarC != null) {
                                if (cx2VarC instanceof xo) {
                                    bx2 bx2Var = ((xo) cx2VarC).B;
                                    cz1.b("applyFocusProperties called on wrong node");
                                    bx2Var.getClass();
                                    kf2.k();
                                    return null;
                                }
                                if ((cx2VarC.p & 2048) != 0 && (cx2VarC instanceof fo0)) {
                                    int i3 = 0;
                                    for (cx2 cx2Var3 = ((fo0) cx2VarC).C; cx2Var3 != null; cx2Var3 = cx2Var3.s) {
                                        if ((cx2Var3.p & 2048) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                cx2VarC = cx2Var3;
                                            } else {
                                                if (f13Var == null) {
                                                    f13Var = new f13(new cx2[16]);
                                                }
                                                if (cx2VarC != null) {
                                                    f13Var.b(cx2VarC);
                                                    cx2VarC = null;
                                                }
                                                f13Var.b(cx2Var3);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                cx2VarC = j51.c(f13Var);
                            }
                        } else {
                            continue;
                        }
                    }
                    cx2Var2 = cx2Var2.r;
                }
            }
            c72VarO = c72VarO.t();
            cx2Var2 = (c72VarO == null || (w12Var = c72VarO.Q) == null) ? null : (sq4) w12Var.f;
        }
        return x91Var;
    }

    public final wv3 t0(q62 q62Var) {
        wv3 wv3Var = s0().l;
        if (wv3Var != fz0.a0) {
            return q62Var == null ? wv3Var : wv3Var.f(q62Var.A(j51.N(this), 0L));
        }
        return q62Var != null ? q62Var.C(j51.N(this), false) : bu.d(0L, l93.o0(j51.N(this).p));
    }

    public final z72 u0() {
        w12 w12Var;
        Object obj;
        if (!this.n.A) {
            cz1.b("visitAncestors called on an unattached node");
        }
        cx2 cx2Var = this.n.r;
        c72 c72VarO = j51.O(this);
        loop0: while (c72VarO != null) {
            if ((((cx2) c72VarO.Q.g).q & 8388640) != 0) {
                while (cx2Var != null) {
                    int i = cx2Var.p;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(cx2Var instanceof z72)) {
                                if (cx2Var instanceof fo0) {
                                    cx2Var = null;
                                    for (cx2 cx2Var2 = ((fo0) cx2Var).C; cx2Var2 != null; cx2Var2 = cx2Var2.s) {
                                        if (cx2Var2 instanceof z72) {
                                            cx2Var = cx2Var2;
                                        }
                                    }
                                } else {
                                    cx2Var = null;
                                }
                            }
                            z72 z72Var = (z72) cx2Var;
                            if (z72Var != null) {
                                return z72Var;
                            }
                        } else if ((i & 32) != 0) {
                            if (cx2Var instanceof fx2) {
                                obj = cx2Var;
                            } else if (cx2Var instanceof fo0) {
                                obj = null;
                                for (cx2 cx2Var3 = ((fo0) cx2Var).C; cx2Var3 != null; cx2Var3 = cx2Var3.s) {
                                    if (cx2Var3 instanceof fx2) {
                                        obj = cx2Var3;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            fx2 fx2Var = (fx2) obj;
                            if (fx2Var != null) {
                                fx2Var.E();
                            }
                        }
                    }
                    cx2Var = cx2Var.r;
                }
            }
            c72VarO = c72VarO.t();
            cx2Var = (c72VarO == null || (w12Var = c72VarO.Q) == null) ? null : (sq4) w12Var.f;
        }
        return null;
    }

    public final z91 v0() {
        ba1 ba1VarF;
        w12 w12Var;
        boolean z = this.A;
        z91 z91Var = z91.p;
        if (!z || (ba1VarF = ((ey) ((ra) j51.P(this)).getFocusOwner()).f()) == null) {
            return z91Var;
        }
        if (this == ba1VarF) {
            return z91.n;
        }
        if (ba1VarF.A) {
            if (!ba1VarF.n.A) {
                cz1.b("visitAncestors called on an unattached node");
            }
            cx2 cx2Var = ba1VarF.n.r;
            c72 c72VarO = j51.O(ba1VarF);
            while (c72VarO != null) {
                if ((((cx2) c72VarO.Q.g).q & 1024) != 0) {
                    while (cx2Var != null) {
                        if ((cx2Var.p & 1024) != 0) {
                            cx2 cx2VarC = cx2Var;
                            f13 f13Var = null;
                            while (cx2VarC != null) {
                                if (cx2VarC instanceof ba1) {
                                    if (this == ((ba1) cx2VarC)) {
                                        return z91.o;
                                    }
                                } else if ((cx2VarC.p & 1024) != 0 && (cx2VarC instanceof fo0)) {
                                    int i = 0;
                                    for (cx2 cx2Var2 = ((fo0) cx2VarC).C; cx2Var2 != null; cx2Var2 = cx2Var2.s) {
                                        if ((cx2Var2.p & 1024) != 0) {
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
        }
        return z91Var;
    }

    public final void w0() {
        int iOrdinal = v0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                er1.n();
                return;
            }
        }
        jx3 jx3Var = new jx3();
        j51.F(this, new fa(5, jx3Var, this));
        Object obj = jx3Var.n;
        if (obj == null) {
            h12.Q("focusProperties");
            throw null;
        }
        if (((x91) obj).a) {
            return;
        }
        ((ey) ((ra) j51.P(this)).getFocusOwner()).b(8, true, true);
    }

    public final void x0() {
    }

    public final boolean y0(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return s0().a ? q0() : kb4.v(this, i, new k2(i));
        } finally {
            Trace.endSection();
        }
    }
}
