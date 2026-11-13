package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class xo extends cx2 implements u62, rv0, g94, rn3, fx2, o62, vi1, vb3, eo0 {
    public xo() {
        super();
    }

    public bx2 B;

    @Override // defpackage.fx2
    public final fz0 E() {
        return fz0.Y;
    }

    @Override // defpackage.vi1
    public final void L(f63 f63Var) {
        this.B.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.rv0
    public final void S(e72 e72Var) {
        this.B.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.rn3
    public final boolean X() {
        this.B.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.g94
    public final void c0(q94 q94Var) {
        bx2 bx2Var = this.B;
        bx2Var.getClass();
        e94 e94Var = new e94();
        int i = 0;
        e94Var.p = false;
        ((zh) bx2Var).a.invoke(e94Var);
        q94Var.getClass();
        e94 e94Var2 = (e94) q94Var;
        w03 w03Var = e94Var2.n;
        if (e94Var.p) {
            e94Var2.p = true;
        }
        if (e94Var.q) {
            e94Var2.q = true;
        }
        w03 w03Var2 = e94Var.n;
        Object[] objArr = w03Var2.b;
        Object[] objArr2 = w03Var2.c;
        long[] jArr = w03Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = i; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i2 << 3) + i4;
                        Object obj = objArr[i5];
                        Object obj2 = objArr2[i5];
                        p94 p94Var = (p94) obj;
                        if (!w03Var.b(p94Var)) {
                            w03Var.l(p94Var, obj2);
                        } else if (obj2 instanceof w2) {
                            Object g = w03Var.g(p94Var);
                            g.getClass();
                            w2 w2Var = (w2) g;
                            String str = w2Var.a;
                            if (str == null) {
                                str = ((w2) obj2).a;
                            }
                            sf1 sf1Var = w2Var.b;
                            if (sf1Var == null) {
                                sf1Var = ((w2) obj2).b;
                            }
                            w03Var.l(p94Var, new w2(str, sf1Var));
                        }
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            }
            i2++;
            i = 0;
        }
    }

    @Override // defpackage.cx2
    public final void i0() {
        q0(true);
    }

    @Override // defpackage.vb3
    public final boolean j() {
        return this.A;
    }

    @Override // defpackage.cx2
    public final void j0() {
        if (!this.A) {
            cz1.b("unInitializeModifier called on unattached node");
        }
        if ((this.p & 8) != 0) {
            ((ra) j51.P(this)).w();
        }
    }

    @Override // defpackage.rn3
    public final void n(kn3 kn3Var, ln3 ln3Var, long j) {
        this.B.getClass();
        throw new ClassCastException();
    }

    public final void q0(boolean z) {
        if (!this.A) {
            cz1.b("initializeModifier called on unattached node");
        }
        bx2 bx2Var = this.B;
        if ((this.p & 4) != 0 && !z) {
            j51.M(this, 2).I0();
        }
        if ((this.p & 2) != 0) {
            sq4 sq4Var = (sq4) j51.O(this).Q.f;
            sq4Var.getClass();
            if (sq4Var.B) {
                f63 f63Var = this.u;
                f63Var.getClass();
                ((w62) f63Var).b1(this);
                tb3 tb3Var = f63Var.g0;
                if (tb3Var != null) {
                    ((vj1) tb3Var).c();
                }
            }
            if (!z) {
                j51.M(this, 2).I0();
                j51.O(this).D();
            }
        }
        if (bx2Var instanceof yc3) {
            ((yc3) bx2Var).a.x.setValue(j51.O(this));
        }
        if ((this.p & 8) != 0) {
            ((ra) j51.P(this)).w();
        }
    }

    @Override // defpackage.u62
    public final vi2 r(cf2 cf2Var, pi2 pi2Var, long j) {
        this.B.getClass();
        throw new ClassCastException();
    }

    public final void r0() {
        bx2 bx2Var = this.B;
        cz1.b("onFocusEvent called on wrong node");
        bx2Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.rn3
    public final void t() {
        this.B.getClass();
        throw new ClassCastException();
    }

    public final String toString() {
        return this.B.toString();
    }

    @Override // defpackage.rv0
    public final void y() {
        jz4.z(this);
    }

    @Override // defpackage.rn3
    public final boolean z() {
        this.B.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.eo0, defpackage.rn3
    public final void b() {
    }

    @Override // defpackage.o62, defpackage.yi2
    public final void a(long j) {
    }

    @Override // defpackage.o62
    public final void e(q62 q62Var) {
    }
}
