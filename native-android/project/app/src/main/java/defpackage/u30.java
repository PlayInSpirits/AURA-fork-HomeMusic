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
    public rm2 D;
    public boolean E;
    public boolean F;
    public gf1 G;
    public final ea1 H;
    public dk0 I;
    public jh1 J;
    public String K;
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

    public u30(gf1 r10) {
        this.D = null;
        boolean r0 = true;
        this.E = true;
        this.F = true;
        this.G = r10;
        this.H = new ea1(new q(1, this, u30.class, "onFocusChange", "onFocusChange(Z)V", 0, 0));
        this.K = "idle";
        int r9 = ve2.a;
        this.O = new m03(6);
        rm2 r11 = this.D;
        this.Q = r11;
        if (r11 == null) goto L6;
        r0 = false;
    L6:
        this.R = r0;
    }

    @Override // defpackage.ih1
    public final String A() {
        return this.K;
    }

    @Override // defpackage.my1
    public final void G(ue1 r11, ln3 r12) {
        ArrayList r13 = (ArrayList) r11.p;
        x0();
        if (this.F == true) goto L5;
    L7:
        int r3 = 0;
        if (r12 != ln3.o) goto L54;
        if (this.U != null) goto L26;
        int r14 = r13.size();
        int r0 = 0;
    L12:
        if (r0 >= r14) goto L86;
        if (zz1.h((ey1) r13.get(r0)) == true) goto L15;
        r0 = r0 + 1;
        goto L12
    L15:
        ey1 r15 = (ey1) r13.get(0);
        r15.i = true;
        this.U = r15;
        if (this.F == false) goto L82;
        this.K = "waiting";
        rm2 r5 = this.D;
        if (r5 == null) goto L83;
        bq3 r6 = new bq3();
        if (u0() == false) goto L23;
        this.S = fu.G(e0(), null, null, new u(r5, r6, this, null, 0), 3);
        return;
    L23:
        this.P = r6;
        fu.G(e0(), null, null, new t(r5, r6, null, 1), 3);
        return;
    L83:
        return;
    L82:
        return;
    L86:
        return;
    L26:
        int r10 = r13.size();
        int r16 = 0;
    L27:
        if (r16 >= r10) goto L48;
        ey1 r1 = (ey1) r13.get(r16);
        if (r1.i == true) goto L35;
        if (r1.h == false) goto L35;
        if (r1.d == true) goto L35;
        r16 = r16 + 1;
    L35:
        float r17 = ((m65) kb4.q(this, g90.t)).c();
        int r18 = r13.size();
        int r2 = 0;
    L36:
        if (r2 >= r18) goto L87;
        ey1 r4 = (ey1) r13.get(r2);
        long r7 = r4.c;
        ey1 r8 = this.U;
        r8.getClass();
        if (Math.abs(g83.c(g83.d(r7, r8.c))) <= r17) goto L40;
        boolean r9 = true;
    L42:
        if (r4.i == true) goto L46;
        if (r9 == true) goto L46;
        r2 = r2 + 1;
    L46:
        t0(true);
        return;
    L40:
        r9 = false;
        goto L42
    L87:
        return;
    L48:
        ((ey1) r13.get(0)).i = true;
        if (this.F == false) goto L51;
        this.K = "recognized";
        ey1 r19 = this.U;
        r19.getClass();
        w0(true, r19.c);
        y0();
    L51:
        this.U = null;
        return;
    L54:
        if (r12 == ln3.p) goto L56;
        return;
    L56:
        if (this.U == null) goto L66;
        int r110 = r13.size();
    L58:
        if (r3 >= r110) goto L66;
        ey1 r111 = (ey1) r13.get(r3);
        if (r111.i == false) goto L64;
        if (r111 == this.U) goto L64;
        t0(true);
    L64:
        r3 = r3 + 1;
    L66:
        if (h12.c(this.K, "recognized") == false) goto L85;
        this.K = "idle";
        return;
    L85:
        return;
    L5:
        if (this.J != null) goto L7;
        jh1 r20 = new jh1(this);
        q0(r20);
        this.J = r20;
        goto L7
    }

    @Override // defpackage.my1
    public final void N() {
        t0(true);
    }

    @Override // defpackage.b83
    public final void Q() {
        if (this.E == false) goto L6;
        j51.F(this, new n(this, 0));
        return;
    }

    @Override // defpackage.g94
    public final void c0(q94 r5) {
        n r0 = new n(this, 1);
        c42[] r1 = o94.a;
        r5.a(d94.b, new w2(null, r0));
        if (this.F == false) goto L6;
        this.H.c0(r5);
        return;
    L6:
        r5.a(n94.j, j15.a);
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
        if (this.R == true) goto L6;
        x0();
    L6:
        if (this.F == false) goto L9;
        q0(this.H);
        return;
    }

    @Override // defpackage.cx2
    public final void j0() {
        v0();
        if (this.Q != null) goto L5;
        this.D = null;
    L5:
        ck0 r0 = this.L;
        if (r0 == null) goto L8;
        r0(r0);
    L8:
        this.L = null;
        jh1 r1 = this.J;
        if (r1 == null) goto L11;
        r0(r1);
    L11:
        this.J = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r17v0, types: [a90, cx2, eo0, fo0, ih1, java.lang.Object, u30] */
    @Override // defpackage.rn3
    public final void n(kn3 r18, ln3 r19, long r20) {
        char r6 = ' ';
        long r9 = 4294967295L;
        long r4 = ((r20 >> 33) << 32) | (((r20 << 32) >> 33) & 4294967295L);
        Float.floatToRawIntBits((int) (r4 >> 32));
        Float.floatToRawIntBits((int) (r4 & 4294967295L));
        x0();
        boolean r2 = this.F;
        ln3 r5 = ln3.o;
        int r7 = 1;
        boolean r8 = false;
        if (r2 == false) goto L15;
        if (this.J != null) goto L7;
        jh1 r3 = new jh1(this);
        q0(r3);
        this.J = r3;
    L7:
        if (r19 != r5) goto L15;
        int r10 = r18.c;
        if (r10 != 4) goto L12;
        fu.G(e0(), null, null, new w(this, null, 0), 3);
        goto L15
    L12:
        if (r10 != 5) goto L15;
        fu.G(e0(), null, null, new w(this, null, 1), 3);
    L15:
        if (r19 != r5) goto L72;
        if (this.T == null) goto L19;
        List r0 = r18.a;
        int r1 = r0.size();
        int r11 = 0;
    L31:
        if (r11 >= r1) goto L66;
        if (gi1.h((on3) r0.get(r11)) == false) goto L34;
        r11 = r11 + 1;
        r9 = r9;
        r7 = 1;
        r6 = ' ';
        goto L31
    L34:
        long r12 = j51.O(this).J.Y(((m65) kb4.q(this, g90.t)).a());
        float r13 = Math.max(0.0f, Float.intBitsToFloat((int) (r12 >> r6)) - ((int) (r20 >> r6))) / 2.0f;
        float r14 = Math.max(0.0f, Float.intBitsToFloat((int) (r12 & r9)) - ((int) (r20 & r9))) / 2.0f;
        long r15 = Float.floatToRawIntBits(r13);
        long r16 = (((long) Float.floatToRawIntBits(r14)) & r9) | (r15 << r6);
        int r17 = r0.size();
        int r21 = 0;
    L35:
        if (r21 >= r17) goto L101;
        on3 r110 = (on3) r0.get(r21);
        if (r110.c() == true) goto L62;
        if (r110.i != r7) goto L41;
        ?? r111 = r7;
    L42:
        long r112 = r110.c;
        char r113 = r6;
        float r22 = Float.intBitsToFloat((int) (r112 >> r113));
        float r23 = Float.intBitsToFloat((int) (r112 & r9));
        float r114 = (float) r111;
        float r115 = Float.intBitsToFloat((int) (r16 >> r113)) * r114;
        long r116 = r9;
        float r24 = ((int) (r20 >> r113)) + r115;
        float r117 = Float.intBitsToFloat((int) (r16 & r116)) * r114;
        float r25 = ((int) (r20 & r116)) + r117;
        if (r22 >= (-r115)) goto L45;
        boolean r26 = true;
    L47:
        if (r22 <= r24) goto L49;
        boolean r27 = true;
    L50:
        boolean r28 = r27 | r26;
        if (r23 >= (-r117)) goto L53;
        boolean r29 = true;
    L54:
        boolean r30 = r28 | r29;
        if (r23 <= r25) goto L57;
        boolean r31 = true;
    L59:
        if ((r30 | r31) == true) goto L60;
        r21 = r21 + 1;
        r9 = r116;
        r7 = 1;
        r6 = ' ';
        r8 = false;
        goto L35
    L60:
        boolean r118 = false;
    L63:
        t0(r118);
        return;
    L57:
        r31 = false;
        goto L59
    L53:
        r29 = false;
        goto L54
    L49:
        r27 = false;
        goto L50
    L45:
        r26 = false;
        goto L47
    L41:
        r111 = r8;
        goto L42
    L62:
        r118 = r8;
        goto L63
    L101:
        return;
    L66:
        ((on3) r0.get(0)).a();
        if (this.F == false) goto L69;
        this.K = "recognized";
        on3 r32 = this.T;
        r32.getClass();
        w0(false, r32.c);
        y0();
    L69:
        this.T = null;
        return;
    L19:
        if (vq4.b(r18, true) == false) goto L96;
        on3 r33 = (on3) r18.a.get(0);
        r33.a();
        this.T = r33;
        if (this.F == false) goto L97;
        this.K = "waiting";
        rm2 r34 = this.D;
        if (r34 == null) goto L98;
        bq3 r35 = new bq3();
        if (u0() == false) goto L28;
        this.S = fu.G(e0(), null, null, new u(r34, r35, this, null, 1), 3);
        return;
    L28:
        this.M = r35;
        fu.G(e0(), null, null, new t(r34, r35, null, 2), 3);
        return;
    L98:
        return;
    L97:
        return;
    L96:
        return;
    L72:
        if (r19 == ln3.p) goto L74;
        return;
    L74:
        if (this.T == null) goto L84;
        List r36 = r18.a;
        int r37 = r36.size();
        int r38 = 0;
    L76:
        if (r38 >= r37) goto L84;
        on3 r39 = (on3) r36.get(r38);
        if (r39.c() == false) goto L82;
        if (r39 == this.T) goto L82;
        t0(false);
    L82:
        r38 = r38 + 1;
    L84:
        if (h12.c(this.K, "recognized") == false) goto L100;
        this.K = "idle";
        return;
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
    public final boolean q(KeyEvent r24) {
        x0();
        long r1 = fh0.a(r24.getKeyCode());
        boolean r3 = this.F;
        m03 r6 = this.O;
        int r7 = 1;
        if (r3 == false) goto L17;
        if (hw.n(r24) != 2) goto L17;
        if (wr1.F(r24) == false) goto L17;
        if (r6.b(r1) == true) goto L15;
        bq3 r4 = new bq3();
        r6.f(r1, r4);
        if (this.D == null) goto L43;
        fu.G(e0(), null, null, new v(this, r4, null, 2), 3);
        return true;
    L43:
        return true;
    L15:
        return false;
    L17:
        if (this.F == false) goto L15;
        if (hw.n(r24) != 1) goto L15;
        if (wr1.F(r24) == false) goto L15;
        r6.getClass();
        int r5 = Long.hashCode(r1) * (-862048943);
        int r8 = r5 ^ (r5 << 16);
        int r9 = r8 & 127;
        int r10 = r6.d;
        int r11 = (r8 >>> 7) & r10;
        int r12 = 0;
    L23:
        long[] r13 = r6.a;
        int r14 = r11 >> 3;
        int r15 = (r11 & 7) << 3;
        boolean r17 = r7;
        long r16 = (((-r15) >> 63) & (r13[r14 + r7] << (64 - r15))) | (r13[r14] >>> r15);
        long r18 = (((long) r9) * 72340172838076673L) ^ r16;
        long r19 = (~r18) & (r18 - 72340172838076673L);
        long r110 = -9187201950435737472L;
        long r111 = r19 & (-9187201950435737472L);
    L25:
        if (r111 == 0) goto L31;
        int r112 = (r11 + (Long.numberOfTrailingZeros(r111) >> 3)) & r10;
        long r21 = r110;
        if (r6.b[r112] == r1) goto L33;
        r111 = r111 & (r111 - 1);
        r110 = r21;
    L33:
        if (r112 < 0) goto L35;
        r6.e--;
        long[] r2 = r6.a;
        int r20 = r6.d;
        int r22 = r112 >> 3;
        int r23 = (r112 & 7) << 3;
        long r25 = (r2[r22] & (~(255 << r23))) | (254 << r23);
        r2[r22] = r25;
        r2[(((r112 - 7) & r20) + (r20 & 7)) >> 3] = r25;
        Object[] r26 = r6.c;
        Object r27 = r26[r112];
        r26[r112] = null;
    L36:
        bq3 r28 = (bq3) r27;
        if (r28 != null) goto L39;
    L42:
        if (r28 == null) goto L50;
        return r17;
    L50:
        return false;
    L39:
        if (this.D == null) goto L41;
        fu.G(e0(), null, null, new v(this, r28, null, 3), 3);
    L41:
        y0();
        goto L42
    L35:
        r27 = null;
        goto L36
    L31:
        if (((r16 & ((~r16) << 6)) & r110) != 0) goto L32;
        r12 = r12 + 8;
        r11 = (r11 + r12) & r10;
        r7 = r17 ? 1 : 0;
        goto L23
    L32:
        r112 = -1;
        goto L33
    }

    @Override // defpackage.rn3
    public final void t() {
        rm2 r0 = this.D;
        if (r0 != null) goto L5;
    L7:
        this.N = null;
        t0(false);
        return;
    L5:
        if (this.N == null) goto L7;
        r0.l(new xp1());
        goto L7
    }

    public final void t0(boolean r8) {
        if (r8 == false) goto L5;
        this.U = null;
    L6:
        rm2 r1 = this.D;
        if (r1 == null) goto L27;
        sk4 r0 = this.S;
        if (r0 != null) goto L11;
    L15:
        if (r8 == false) goto L17;
        bq3 r2 = this.P;
    L18:
        if (r2 == null) goto L24;
        aq3 r3 = new aq3();
        s22 r4 = (s22) e0().e().K(fz0.h0);
        if (r4 == null) goto L22;
        as0 r5 = r4.M(new o(0, r1, r3));
    L23:
        fu.G(e0(), null, null, new r(r1, r3, r5, null, 0), 3);
        goto L24
    L22:
        r5 = null;
    L24:
        if (r8 == false) goto L26;
        this.P = null;
        goto L27
    L26:
        this.M = null;
        goto L27
    L17:
        r2 = this.M;
        goto L18
    L11:
        if (r0.b() != true) goto L15;
        sk4 r6 = this.S;
        if (r6 == null) goto L24;
        r6.f(null);
    L27:
        this.K = "idle";
        return;
    L5:
        this.T = null;
        goto L6
    }

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
        if (this.n.A == true) goto L5;
        cz1.b("visitAncestors called on an unattached node");
    L5:
        cx2 r0 = this.n.r;
        c72 r1 = j51.O(this);
        ih1 r3 = null;
    L7:
        if (r1 == null) goto L63;
        if ((((cx2) r1.Q.g).q & 262144) == 0) goto L57;
    L10:
        if (r0 == null) goto L57;
        if ((r0.p & 262144) == 0) goto L56;
        ?? r6 = r0;
        ?? r8 = 0;
    L14:
        if (r6 == 0) goto L56;
        if ((r6 instanceof rx4) == true) goto L17;
        if ((r6.p & 262144) == 0) goto L55;
        if ((r6 instanceof fo0) == false) goto L55;
        cx2 r9 = ((fo0) r6).C;
        int r10 = 0;
        r6 = r6;
        r8 = r8;
    L41:
        if (r9 == null) goto L53;
        if ((r9.p & 262144) == 0) goto L52;
        r10 = r10 + 1;
        r8 = r8;
        if (r10 != 1) goto L47;
        r6 = r9;
        goto L52
    L47:
        if (r8 != 0) goto L49;
        r8 = new f13(new cx2[16]);
    L49:
        if (r6 == 0) goto L51;
        r8.b(r6);
        r6 = 0;
    L51:
        r8.b(r9);
    L52:
        r9 = r9.s;
        r6 = r6;
        r8 = r8;
        goto L41
    L53:
        if (r10 == 1) goto L14;
    L55:
        r6 = j51.c(r8);
        goto L14
    L17:
        rx4 r7 = (rx4) r6;
        if (jh1.C == r7.f()) goto L21;
    L19:
        boolean r11 = true;
    L32:
        if (r11 == true) goto L55;
    L21:
        if ((r7 instanceof jh1) == false) goto L34;
        ih1 r12 = ((jh1) r7).B;
        if (r12 != null) goto L26;
        r12 = null;
    L26:
        if (r12 == null) goto L19;
        boolean r13 = h12.c(r12.A(), "waiting");
        if (r13 == false) goto L31;
        r3 = r12;
    L31:
        r11 = !r13;
        goto L32
    L34:
        kf2.o("Node is not a GestureNode instance");
        return false;
    L56:
        r0 = r0.r;
    L57:
        r1 = r1.t();
        if (r1 == null) goto L62;
        w12 r2 = r1.Q;
        if (r2 == null) goto L62;
        r0 = (sq4) r2.f;
    L62:
        r0 = null;
    L63:
        if (r3 != null) goto L74;
        int r4 = v30.b;
        if (this.n.A == true) goto L68;
        cz1.b("Cannot get View because the Modifier node is not currently attached.");
    L68:
        ViewParent r14 = ((View) h12.L(j51.O(this))).getParent();
    L69:
        if (r14 == null) goto L76;
        if ((r14 instanceof ViewGroup) == false) goto L76;
        ViewGroup r15 = (ViewGroup) r14;
        if (r15.shouldDelayChildPressedState() == true) goto L74;
        r14 = r15.getParent();
    L76:
        return false;
    L74:
        return true;
    }

    public final void v0() {
        rm2 r1 = this.D;
        m03 r2 = this.O;
        if (r1 != null) goto L5;
    L27:
        this.M = null;
        this.P = null;
        this.N = null;
        r2.a();
        return;
    L5:
        if (this.M == null) goto L8;
        r1.l(new aq3());
    L8:
        if (this.P == null) goto L11;
        r1.l(new aq3());
    L11:
        if (this.N == null) goto L13;
        r1.l(new xp1());
    L13:
        Object[] r3 = r2.c;
        long[] r4 = r2.a;
        int r5 = r4.length - 2;
        if (r5 < 0) goto L27;
        int r7 = 0;
    L16:
        long r8 = r4[r7];
        if (((((~r8) << 7) & r8) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L25;
        int r10 = 8 - ((~(r7 - r5)) >>> 31);
        int r12 = 0;
    L19:
        if (r12 >= r10) goto L24;
        if ((255 & r8) >= 128) goto L23;
        bq3 r13 = (bq3) r3[(r7 << 3) + r12];
        r1.l(new aq3());
    L23:
        r8 = r8 >> 8;
        r12 = r12 + 1;
        goto L19
    L24:
        if (r10 != 8) goto L27;
    L25:
        if (r7 == r5) goto L27;
        r7 = r7 + 1;
        goto L16
    }

    public final void w0(boolean r11, long r12) {
        rm2 r4 = this.D;
        if (r4 == null) goto L19;
        sk4 r1 = this.S;
        if (r1 != null) goto L7;
    L9:
        if (r11 == false) goto L11;
        bq3 r13 = this.P;
    L12:
        if (r13 == null) goto L14;
        fu.G(e0(), null, null, new t(r13, r4, null), 3);
    L14:
        if (r11 == false) goto L17;
        this.P = null;
        return;
    L17:
        this.M = null;
        return;
    L11:
        r13 = this.M;
        goto L12
    L7:
        if (r1.b() != true) goto L9;
        r1.f(null);
        fu.G(e0(), null, null, new s(r1, r12, r4, null, 0), 3);
        goto L14
    }

    public final void x0() {
        if (this.L == null) goto L6;
        return;
    L6:
        if (this.E == false) goto L8;
        dk0 r0 = this.I;
    L9:
        if (r0 != null) goto L11;
        return;
    L11:
        if (this.D != null) goto L13;
        this.D = new rm2(4);
    L13:
        this.H.v0(this.D);
        rm2 r1 = this.D;
        r1.getClass();
        ck0 r2 = new ck0(r1);
        q0(r2);
        this.L = r2;
        return;
    L8:
        r0 = null;
        goto L9
    }

    public final void y0() {
        dj4 r0 = (dj4) kb4.q(this, g90.v);
        if (r0 == null) goto L5;
        r0.a();
    L5:
        this.G.invoke();
    }
}
