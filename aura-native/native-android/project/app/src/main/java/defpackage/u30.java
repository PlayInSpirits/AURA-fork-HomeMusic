package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u30 extends fo0 implements rn3, j42, g94, a90, b83, my1, ih1 {
    public gf1 G;
    public dk0 I;
    public jh1 J;
    public ck0 L;
    public bq3 M;
    public wp1 N;
    public final m03 O;
    public bq3 P;
    public rm2 Q;
    public boolean R;
    public sk4 S;
    public on3 T;
    public ey1 U;
    public rm2 D = null;
    public boolean E = true;
    public boolean F = true;
    public final ea1 H = new ea1(new q(1, this, u30.class, "onFocusChange", "onFocusChange(Z)V", 0, 0));
    public String K = "idle";

    public u30(gf1 gf1Var) {
        this.G = gf1Var;
        int i = ve2.a;
        this.O = new m03(6);
        rm2 rm2Var = this.D;
        this.Q = rm2Var;
        this.R = rm2Var == null;
    }

    @Override // defpackage.ih1
    public final String A() {
        return this.K;
    }

    @Override // defpackage.my1
    public final void G(ue1 ue1Var, ln3 ln3Var) {
        ArrayList arrayList = (ArrayList) ue1Var.p;
        x0();
        if (this.F && this.J == null) {
            jh1 jh1Var = new jh1(this);
            q0(jh1Var);
            this.J = jh1Var;
        }
        if (ln3Var != ln3.o) {
            if (ln3Var == ln3.p) {
                if (this.U != null) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ey1 ey1Var = (ey1) arrayList.get(i);
                        if (ey1Var.i && ey1Var != this.U) {
                            t0(true);
                            break;
                        }
                    }
                }
                if (h12.c(this.K, "recognized")) {
                    this.K = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.U == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (zz1.h((ey1) arrayList.get(i2))) {
                    ey1 ey1Var2 = (ey1) arrayList.get(0);
                    ey1Var2.i = true;
                    this.U = ey1Var2;
                    if (this.F) {
                        this.K = "waiting";
                        rm2 rm2Var = this.D;
                        if (rm2Var != null) {
                            bq3 bq3Var = new bq3();
                            if (u0()) {
                                this.S = fu.G(e0(), null, null, new u(rm2Var, bq3Var, this, null, 0), 3);
                                return;
                            } else {
                                this.P = bq3Var;
                                fu.G(e0(), null, null, new t(rm2Var, bq3Var, null, 1), 3);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ey1 ey1Var3 = (ey1) arrayList.get(i3);
            if (ey1Var3.i || !ey1Var3.h || ey1Var3.d) {
                float fC = ((m65) kb4.q(this, g90.t)).c();
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ey1 ey1Var4 = (ey1) arrayList.get(i4);
                    long j = ey1Var4.c;
                    ey1 ey1Var5 = this.U;
                    ey1Var5.getClass();
                    boolean z = Math.abs(g83.c(g83.d(j, ey1Var5.c))) > fC;
                    if (ey1Var4.i || z) {
                        t0(true);
                        return;
                    }
                }
                return;
            }
        }
        ((ey1) arrayList.get(0)).i = true;
        if (this.F) {
            this.K = "recognized";
            ey1 ey1Var6 = this.U;
            ey1Var6.getClass();
            w0(true, ey1Var6.c);
            y0();
        }
        this.U = null;
    }

    @Override // defpackage.my1
    public final void N() {
        t0(true);
    }

    @Override // defpackage.b83
    public final void Q() {
        if (this.E) {
            j51.F(this, new n(this, 0));
        }
    }

    @Override // defpackage.g94
    public final void c0(q94 q94Var) {
        n nVar = new n(this, 1);
        c42[] c42VarArr = o94.a;
        q94Var.a(d94.b, new w2(null, nVar));
        if (this.F) {
            this.H.c0(q94Var);
        } else {
            q94Var.a(n94.j, j15.a);
        }
    }

    @Override // defpackage.g94
    public final boolean d0() {
        return true;
    }

    @Override // defpackage.cx2
    public final boolean f0() {
        return false;
    }

    @Override // defpackage.cx2
    public final void i0() {
        Q();
        if (!this.R) {
            x0();
        }
        if (this.F) {
            q0(this.H);
        }
    }

    @Override // defpackage.cx2
    public final void j0() {
        v0();
        if (this.Q == null) {
            this.D = null;
        }
        ck0 ck0Var = this.L;
        if (ck0Var != null) {
            r0(ck0Var);
        }
        this.L = null;
        jh1 jh1Var = this.J;
        if (jh1Var != null) {
            r0(jh1Var);
        }
        this.J = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r17v0, types: [a90, cx2, eo0, fo0, ih1, java.lang.Object, u30] */
    @Override // defpackage.rn3
    public final void n(kn3 kn3Var, ln3 ln3Var, long j) {
        boolean z;
        char c = ' ';
        long j2 = 4294967295L;
        long j3 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        Float.floatToRawIntBits((int) (j3 >> 32));
        Float.floatToRawIntBits((int) (j3 & 4294967295L));
        x0();
        boolean z2 = this.F;
        ln3 ln3Var2 = ln3.o;
        int i = 1;
        boolean z3 = false;
        if (z2) {
            if (this.J == null) {
                jh1 jh1Var = new jh1(this);
                q0(jh1Var);
                this.J = jh1Var;
            }
            if (ln3Var == ln3Var2) {
                int i2 = kn3Var.c;
                if (i2 == 4) {
                    fu.G(e0(), null, null, new w(this, null, 0), 3);
                } else if (i2 == 5) {
                    fu.G(e0(), null, null, new w(this, null, 1), 3);
                }
            }
        }
        if (ln3Var != ln3Var2) {
            if (ln3Var == ln3.p) {
                if (this.T != null) {
                    List list = kn3Var.a;
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        on3 on3Var = (on3) list.get(i3);
                        if (on3Var.c() && on3Var != this.T) {
                            t0(false);
                            break;
                        }
                    }
                }
                if (h12.c(this.K, "recognized")) {
                    this.K = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.T == null) {
            if (vq4.b(kn3Var, true)) {
                on3 on3Var2 = (on3) kn3Var.a.get(0);
                on3Var2.a();
                this.T = on3Var2;
                if (this.F) {
                    this.K = "waiting";
                    rm2 rm2Var = this.D;
                    if (rm2Var != null) {
                        bq3 bq3Var = new bq3();
                        if (u0()) {
                            this.S = fu.G(e0(), null, null, new u(rm2Var, bq3Var, this, null, 1), 3);
                            return;
                        } else {
                            this.M = bq3Var;
                            fu.G(e0(), null, null, new t(rm2Var, bq3Var, null, 2), 3);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        List list2 = kn3Var.a;
        int size2 = list2.size();
        int i4 = 0;
        while (i4 < size2) {
            if (!gi1.h((on3) list2.get(i4))) {
                long jY = j51.O(this).J.Y(((m65) kb4.q(this, g90.t)).a());
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jY & j2)) - ((int) (j & j2))) / 2.0f)) & j2) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jY >> c)) - ((int) (j >> c))) / 2.0f)) << c);
                int size3 = list2.size();
                int i5 = 0;
                while (i5 < size3) {
                    on3 on3Var3 = (on3) list2.get(i5);
                    if (on3Var3.c()) {
                        z = z3;
                    } else {
                        int r12 = on3Var3.i == i ? 1 : 0;
                        long j4 = on3Var3.c;
                        char c2 = c;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (j4 >> c2));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j4 & j2));
                        float f = (float) r12;
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> c2)) * f;
                        long j5 = j2;
                        float f2 = ((int) (j >> c2)) + fIntBitsToFloat3;
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & j5)) * f;
                        if ((((fIntBitsToFloat > f2) | (fIntBitsToFloat < (-fIntBitsToFloat3))) || (fIntBitsToFloat2 < (-fIntBitsToFloat4))) || (fIntBitsToFloat2 > ((int) (j & j5)) + fIntBitsToFloat4)) {
                            z = false;
                        } else {
                            i5++;
                            j2 = j5;
                            i = 1;
                            c = ' ';
                            z3 = false;
                        }
                    }
                    t0(z);
                    return;
                }
                return;
            }
            i4++;
            j2 = j2;
            i = 1;
            c = ' ';
        }
        ((on3) list2.get(0)).a();
        if (this.F) {
            this.K = "recognized";
            on3 on3Var4 = this.T;
            on3Var4.getClass();
            w0(false, on3Var4.c);
            y0();
        }
        this.T = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.j42
    public final boolean q(KeyEvent keyEvent) {
        boolean z;
        int iNumberOfTrailingZeros;
        Object obj;
        x0();
        long jA = fh0.a(keyEvent.getKeyCode());
        boolean z2 = this.F;
        m03 m03Var = this.O;
        int i = 1;
        if (z2 && hw.n(keyEvent) == 2 && wr1.F(keyEvent)) {
            if (!m03Var.b(jA)) {
                bq3 bq3Var = new bq3();
                m03Var.f(jA, bq3Var);
                if (this.D == null) {
                    return true;
                }
                fu.G(e0(), null, null, new v(this, bq3Var, null, 2), 3);
                return true;
            }
        } else if (this.F && hw.n(keyEvent) == 1 && wr1.F(keyEvent)) {
            m03Var.getClass();
            int iHashCode = Long.hashCode(jA) * (-862048943);
            int i2 = iHashCode ^ (iHashCode << 16);
            int i3 = i2 & 127;
            int i4 = m03Var.d;
            int i5 = (i2 >>> 7) & i4;
            int i6 = 0;
            loop0: while (true) {
                long[] jArr = m03Var.a;
                int i7 = i5 >> 3;
                int i8 = (i5 & 7) << 3;
                z = i;
                long j = (((-i8) >> 63) & (jArr[i7 + i] << (64 - i8))) | (jArr[i7] >>> i8);
                long j2 = (((long) i3) * 72340172838076673L) ^ j;
                long j3 = -9187201950435737472L;
                long j4 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (j4 != 0) {
                    iNumberOfTrailingZeros = (i5 + (Long.numberOfTrailingZeros(j4) >> 3)) & i4;
                    long j5 = j3;
                    if (m03Var.b[iNumberOfTrailingZeros] == jA) {
                        break loop0;
                    }
                    j4 &= j4 - 1;
                    j3 = j5;
                }
                if ((j & ((~j) << 6) & j3) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i6 += 8;
                i5 = (i5 + i6) & i4;
                i = z ? 1 : 0;
            }
            if (iNumberOfTrailingZeros >= 0) {
                m03Var.e--;
                long[] jArr2 = m03Var.a;
                int i9 = m03Var.d;
                int i10 = iNumberOfTrailingZeros >> 3;
                int i11 = (iNumberOfTrailingZeros & 7) << 3;
                long j6 = (jArr2[i10] & (~(255 << i11))) | (254 << i11);
                jArr2[i10] = j6;
                jArr2[(((iNumberOfTrailingZeros - 7) & i9) + (i9 & 7)) >> 3] = j6;
                Object[] objArr = m03Var.c;
                obj = objArr[iNumberOfTrailingZeros];
                objArr[iNumberOfTrailingZeros] = null;
            } else {
                obj = null;
            }
            bq3 bq3Var2 = (bq3) obj;
            if (bq3Var2 != null) {
                if (this.D != null) {
                    fu.G(e0(), null, null, new v(this, bq3Var2, null, 3), 3);
                }
                y0();
            }
            if (bq3Var2 != null) {
                return z;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.rn3
    public final void t() {
        rm2 rm2Var = this.D;
        if (rm2Var != null && this.N != null) {
            rm2Var.l(new xp1());
        }
        this.N = null;
        t0(false);
    }

    public final void t0(boolean z) {
        if (z) {
            this.U = null;
        } else {
            this.T = null;
        }
        rm2 rm2Var = this.D;
        if (rm2Var != null) {
            sk4 sk4Var = this.S;
            if (sk4Var == null || !sk4Var.b()) {
                if ((z ? this.P : this.M) != null) {
                    aq3 aq3Var = new aq3();
                    s22 s22Var = (s22) e0().e().K(fz0.h0);
                    fu.G(e0(), null, null, new r(rm2Var, aq3Var, s22Var != null ? s22Var.M(new o(0, rm2Var, aq3Var)) : null, null, 0), 3);
                }
            } else {
                sk4 sk4Var2 = this.S;
                if (sk4Var2 != null) {
                    sk4Var2.f(null);
                }
            }
            if (z) {
                this.P = null;
            } else {
                this.M = null;
            }
        }
        this.K = "idle";
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [cx2] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [cx2] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [f13] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [f13] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v8 */
    public final boolean u0() {
        w12 w12Var;
        boolean z;
        if (!this.n.A) {
            cz1.b("visitAncestors called on an unattached node");
        }
        cx2 cx2Var = this.n.r;
        c72 c72VarO = j51.O(this);
        ih1 ih1Var = null;
        loop0: while (c72VarO != null) {
            if ((((cx2) c72VarO.Q.g).q & 262144) != 0) {
                while (cx2Var != null) {
                    if ((cx2Var.p & 262144) != 0) {
                        ?? C = cx2Var;
                        ?? f13Var = 0;
                        while (C != 0) {
                            if (C instanceof rx4) {
                                rx4 rx4Var = (rx4) C;
                                if (jh1.C != rx4Var.f()) {
                                    z = true;
                                } else {
                                    if (!(rx4Var instanceof jh1)) {
                                        kf2.o("Node is not a GestureNode instance");
                                        return false;
                                    }
                                    ih1 ih1Var2 = ((jh1) rx4Var).B;
                                    if (ih1Var2 == null) {
                                        ih1Var2 = null;
                                    }
                                    if (ih1Var2 == null) {
                                        z = true;
                                    } else {
                                        boolean zC = h12.c(ih1Var2.A(), "waiting");
                                        if (zC) {
                                            ih1Var = ih1Var2;
                                        }
                                        z = !zC;
                                    }
                                }
                                if (!z) {
                                    break loop0;
                                }
                            } else if ((C.p & 262144) != 0 && (C instanceof fo0)) {
                                cx2 cx2Var2 = ((fo0) C).C;
                                int i = 0;
                                while (cx2Var2 != null) {
                                    if ((cx2Var2.p & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            C = C;
                                            f13Var = f13Var;
                                            f13Var = f13Var;
                                            C = cx2Var2;
                                        } else {
                                            if (f13Var == 0) {
                                                f13Var = new f13(new cx2[16]);
                                            }
                                            if (C != 0) {
                                                f13Var.b(C);
                                                C = 0;
                                            }
                                            f13Var.b(cx2Var2);
                                        }
                                    } else {
                                        C = C;
                                        f13Var = f13Var;
                                    }
                                    cx2Var2 = cx2Var2.s;
                                    C = C;
                                    f13Var = f13Var;
                                }
                                if (i == 1) {
                                    C = C;
                                    f13Var = f13Var;
                                } else {
                                    C = C;
                                    f13Var = f13Var;
                                }
                            }
                            C = j51.c(f13Var);
                        }
                    }
                    cx2Var = cx2Var.r;
                }
            }
            c72VarO = c72VarO.t();
            cx2Var = (c72VarO == null || (w12Var = c72VarO.Q) == null) ? null : (sq4) w12Var.f;
        }
        if (ih1Var == null) {
            int i2 = v30.b;
            if (!this.n.A) {
                cz1.b("Cannot get View because the Modifier node is not currently attached.");
            }
            ViewParent parent = ((View) h12.L(j51.O(this))).getParent();
            while (parent != null && (parent instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (!viewGroup.shouldDelayChildPressedState()) {
                    parent = viewGroup.getParent();
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[LOOP:0: B:16:0x0037->B:26:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[EDGE_INSN: B:30:0x0076->B:27:0x0076 BREAK  A[LOOP:0: B:16:0x0037->B:26:0x0073], SYNTHETIC] */
    public final void v0() {
        rm2 rm2Var = this.D;
        m03 m03Var = this.O;
        if (rm2Var != null) {
            if (this.M != null) {
                rm2Var.l(new aq3());
            }
            if (this.P != null) {
                rm2Var.l(new aq3());
            }
            if (this.N != null) {
                rm2Var.l(new xp1());
            }
            Object[] objArr = m03Var.c;
            long[] jArr = m03Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                rm2Var.l(new aq3());
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        this.M = null;
        this.P = null;
        this.N = null;
        m03Var.a();
    }

    public final void w0(boolean z, long j) {
        rm2 rm2Var = this.D;
        if (rm2Var != null) {
            sk4 sk4Var = this.S;
            if (sk4Var == null || !sk4Var.b()) {
                bq3 bq3Var = z ? this.P : this.M;
                if (bq3Var != null) {
                    fu.G(e0(), null, null, new t(bq3Var, rm2Var, null), 3);
                }
            } else {
                sk4Var.f(null);
                fu.G(e0(), null, null, new s(sk4Var, j, rm2Var, null, 0), 3);
            }
            if (z) {
                this.P = null;
            } else {
                this.M = null;
            }
        }
    }

    public final void x0() {
        if (this.L != null) {
            return;
        }
        if ((this.E ? this.I : null) != null) {
            if (this.D == null) {
                this.D = new rm2(4);
            }
            this.H.v0(this.D);
            rm2 rm2Var = this.D;
            rm2Var.getClass();
            ck0 ck0Var = new ck0(rm2Var);
            q0(ck0Var);
            this.L = ck0Var;
        }
    }

    public final void y0() {
        dj4 dj4Var = (dj4) kb4.q(this, g90.v);
        if (dj4Var != null) {
            dj4Var.a();
        }
        this.G.invoke();
    }
}
