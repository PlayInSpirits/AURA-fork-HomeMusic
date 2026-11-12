package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class jc0 {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public int F;
    public int G;
    public final hb0 H;
    public final hb0 I;
    public final hb0 J;
    public final hb0 K;
    public final hb0 L;
    public final hb0 M;
    public final hb0 N;
    public final hb0 O;
    public final hb0[] P;
    public final ArrayList Q;
    public final boolean[] R;
    public jc0 S;
    public int T;
    public int U;
    public float V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public boolean a;
    public int a0;
    public q00 b;
    public int b0;
    public q00 c;
    public float c0;
    public up1 d;
    public float d0;
    public w45 e;
    public View e0;
    public final boolean[] f;
    public int f0;
    public boolean g;
    public String g0;
    public int h;
    public int h0;
    public int i;
    public int i0;
    public String j;
    public final float[] j0;
    public boolean k;
    public final jc0[] k0;
    public boolean l;
    public final jc0[] l0;
    public boolean m;
    public int m0;
    public boolean n;
    public int n0;
    public int o;
    public final int[] o0;
    public int p;
    public int q;
    public int r;
    public int s;
    public final int[] t;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;

    public jc0() {
        this.a = false;
        this.d = null;
        this.e = null;
        this.f = new boolean[]{true, true};
        this.g = true;
        this.h = -1;
        this.i = -1;
        new HashMap();
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new int[2];
        this.u = 0;
        this.v = 0;
        this.w = 1.0f;
        this.x = 0;
        this.y = 0;
        this.z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = Float.NaN;
        this.E = false;
        this.F = 0;
        this.G = 0;
        hb0 r6 = new hb0(this, 2);
        this.H = r6;
        hb0 r8 = new hb0(this, 3);
        this.I = r8;
        hb0 r7 = new hb0(this, 4);
        this.J = r7;
        hb0 r9 = new hb0(this, 5);
        this.K = r9;
        hb0 r10 = new hb0(this, 6);
        this.L = r10;
        hb0 r5 = new hb0(this, 8);
        this.M = r5;
        hb0 r12 = new hb0(this, 9);
        this.N = r12;
        hb0 r11 = new hb0(this, 7);
        this.O = r11;
        this.P = new hb0[]{r6, r7, r8, r9, r10, r11};
        ArrayList r13 = new ArrayList();
        this.Q = r13;
        this.R = new boolean[2];
        this.o0 = new int[]{1, 1};
        this.S = null;
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = -1;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.c0 = 0.5f;
        this.d0 = 0.5f;
        this.f0 = 0;
        this.g0 = null;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = new float[]{-1.0f, -1.0f};
        this.k0 = new jc0[]{null, null};
        this.l0 = new jc0[]{null, null};
        this.m0 = -1;
        this.n0 = -1;
        r13.add(r6);
        r13.add(r8);
        r13.add(r7);
        r13.add(r9);
        r13.add(r5);
        r13.add(r12);
        r13.add(r11);
        r13.add(r10);
    }

    public static void D(int r0, int r1, String r2, StringBuilder r3) {
        if (r0 != r1) goto L4;
        return;
    L4:
        r3.append(r2);
        r3.append(" :   ");
        r3.append(r0);
        r3.append(",\n");
    }

    public static void E(StringBuilder r0, String r1, float r2, float r3) {
        if (r2 != r3) goto L5;
        return;
    L5:
        r0.append(r1);
        r0.append(" :   ");
        r0.append(r2);
        r0.append(",\n");
    }

    public static void m(StringBuilder r2, String r3, int r4, int r5, int r6, int r7, int r8, float r9, int r10) {
        r2.append(r3);
        r2.append(" :  {\n");
        if (r10 != 1) goto L5;
        String r11 = "FIXED";
    L17:
        if ("FIXED".equals(r11) == true) goto L20;
        f34.n(r2, "      behavior", " :   ", r11, ",\n");
    L20:
        D(r4, 0, "      size", r2);
        D(r5, 0, "      min", r2);
        D(r6, Integer.MAX_VALUE, "      max", r2);
        D(r7, 0, "      matchMin", r2);
        D(r8, 0, "      matchDef", r2);
        E(r2, "      matchPercent", r9, 1.0f);
        r2.append("    },\n");
        return;
    L5:
        if (r10 != 2) goto L7;
        r11 = "WRAP_CONTENT";
        goto L17
    L7:
        if (r10 != 3) goto L9;
        r11 = "MATCH_CONSTRAINT";
        goto L17
    L9:
        if (r10 != 4) goto L12;
        r11 = "MATCH_PARENT";
        goto L17
    L12:
        throw null;
    }

    public static void n(StringBuilder r2, String r3, hb0 r4) {
        if (r4.f != null) goto L5;
        return;
    L5:
        r2.append("    ");
        r2.append(r3);
        r2.append(" : [ '");
        r2.append(r4.f);
        r2.append("'");
        if (r4.h == Integer.MIN_VALUE) goto L8;
    L9:
        r2.append(",");
        r2.append(r4.g);
        if (r4.h == Integer.MIN_VALUE) goto L12;
        r2.append(",");
        r2.append(r4.h);
        r2.append(",");
    L12:
        r2.append(" ] ,\n");
        return;
    L8:
        if (r4.g == 0) goto L12;
        goto L9
    }

    public void A() {
        this.H.g();
        this.I.g();
        this.J.g();
        this.K.g();
        this.L.g();
        this.M.g();
        this.N.g();
        this.O.g();
        this.S = null;
        this.D = Float.NaN;
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = -1;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0.5f;
        this.d0 = 0.5f;
        int[] r3 = this.o0;
        r3[0] = 1;
        r3[1] = 1;
        this.e0 = null;
        this.f0 = 0;
        this.h0 = 0;
        this.i0 = 0;
        float[] r0 = this.j0;
        r0[0] = -1.0f;
        r0[1] = -1.0f;
        this.o = -1;
        this.p = -1;
        int[] r1 = this.C;
        r1[0] = Integer.MAX_VALUE;
        r1[1] = Integer.MAX_VALUE;
        this.r = 0;
        this.s = 0;
        this.w = 1.0f;
        this.z = 1.0f;
        this.v = Integer.MAX_VALUE;
        this.y = Integer.MAX_VALUE;
        this.u = 0;
        this.x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] r2 = this.f;
        r2[0] = true;
        r2[1] = true;
        boolean[] r4 = this.R;
        r4[0] = false;
        r4[1] = false;
        this.g = true;
        int[] r5 = this.t;
        r5[0] = 0;
        r5[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void B() {
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        ArrayList r4 = this.Q;
        int r1 = r4.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        hb0 r3 = (hb0) r4.get(r2);
        r3.c = false;
        r3.b = 0;
        r2 = r2 + 1;
        goto L3
    }

    public void C(yc5 r1) {
        this.H.h();
        this.I.h();
        this.J.h();
        this.K.h();
        this.L.h();
        this.O.h();
        this.M.h();
        this.N.h();
    }

    public final void F(int r2, int r3) {
        if (this.k == false) goto L5;
        return;
    L5:
        this.H.i(r2);
        this.J.i(r3);
        this.X = r2;
        this.T = r3 - r2;
        this.k = true;
    }

    public final void G(int r2, int r3) {
        if (this.l == false) goto L5;
        return;
    L5:
        this.I.i(r2);
        this.K.i(r3);
        this.Y = r2;
        this.U = r3 - r2;
        if (this.E == false) goto L8;
        int r4 = r2 + this.Z;
        this.L.i(r4);
    L8:
        this.l = true;
    }

    public final void H(int r2) {
        this.U = r2;
        int r0 = this.b0;
        if (r2 >= r0) goto L6;
        this.U = r0;
        return;
    }

    public final void I(int r2) {
        this.o0[0] = r2;
    }

    public final void J(int r2) {
        this.o0[1] = r2;
    }

    public final void K(int r2) {
        this.T = r2;
        int r0 = this.a0;
        if (r2 >= r0) goto L6;
        this.T = r0;
        return;
    }

    public void L(boolean r8, boolean r9) {
        up1 r0 = this.d;
        boolean r10 = r8 & r0.g;
        w45 r1 = this.e;
        boolean r11 = r9 & r1.g;
        int r2 = r0.h.g;
        int r3 = r1.h.g;
        int r4 = r0.i.g;
        int r5 = r1.i.g;
        int r6 = r5 - r3;
        if ((r4 - r2) < 0) goto L15;
        if (r6 < 0) goto L15;
        if (r2 == Integer.MIN_VALUE) goto L15;
        if (r2 == Integer.MAX_VALUE) goto L15;
        if (r3 == Integer.MIN_VALUE) goto L15;
        if (r3 == Integer.MAX_VALUE) goto L15;
        if (r4 == Integer.MIN_VALUE) goto L15;
        if (r4 == Integer.MAX_VALUE) goto L15;
        if (r5 == Integer.MIN_VALUE) goto L15;
        if (r5 == Integer.MAX_VALUE) goto L15;
    L16:
        int r7 = r4 - r2;
        int r12 = r5 - r3;
        if (r10 == false) goto L19;
        this.X = r2;
    L19:
        if (r11 == false) goto L22;
        this.Y = r3;
    L22:
        if (this.f0 != 8) goto L25;
        this.T = 0;
        this.U = 0;
        return;
    L25:
        int[] r13 = this.o0;
        if (r10 == true) goto L28;
    L35:
        if (r11 == true) goto L37;
        return;
    L37:
        if (r13[1] != 1) goto L41;
        int r14 = this.U;
        if (r12 >= r14) goto L41;
        r12 = r14;
    L41:
        this.U = r12;
        int r15 = this.b0;
        if (r12 >= r15) goto L46;
        this.U = r15;
        return;
    L46:
        return;
    L28:
        if (r13[0] != 1) goto L32;
        int r16 = this.T;
        if (r7 >= r16) goto L32;
        r7 = r16;
    L32:
        this.T = r7;
        int r17 = this.a0;
        if (r7 >= r17) goto L35;
        this.T = r17;
    L15:
        r4 = 0;
        r5 = 0;
        r2 = 0;
        r3 = 0;
        goto L16
    }

    public void M(eb2 r7, boolean r8) {
        r7.getClass();
        int r9 = eb2.n(this.H);
        int r0 = eb2.n(this.I);
        int r1 = eb2.n(this.J);
        int r2 = eb2.n(this.K);
        if (r8 == false) goto L11;
        up1 r3 = this.d;
        if (r3 == null) goto L11;
        yo0 r4 = r3.h;
        if (r4.j == false) goto L11;
        yo0 r5 = r3.i;
        if (r5.j == false) goto L11;
        r9 = r4.g;
        r1 = r5.g;
    L11:
        if (r8 == false) goto L19;
        w45 r10 = this.e;
        if (r10 == null) goto L19;
        yo0 r6 = r10.h;
        if (r6.j == false) goto L19;
        yo0 r11 = r10.i;
        if (r11.j == false) goto L19;
        r0 = r6.g;
        r2 = r11.g;
    L19:
        int r12 = r2 - r0;
        if ((r1 - r9) < 0) goto L32;
        if (r12 < 0) goto L32;
        if (r9 == Integer.MIN_VALUE) goto L32;
        if (r9 == Integer.MAX_VALUE) goto L32;
        if (r0 == Integer.MIN_VALUE) goto L32;
        if (r0 == Integer.MAX_VALUE) goto L32;
        if (r1 == Integer.MIN_VALUE) goto L32;
        if (r1 == Integer.MAX_VALUE) goto L32;
        if (r2 == Integer.MIN_VALUE) goto L32;
        if (r2 == Integer.MAX_VALUE) goto L32;
    L33:
        int r13 = r1 - r9;
        int r14 = r2 - r0;
        this.X = r9;
        this.Y = r0;
        if (this.f0 != 8) goto L37;
        this.T = 0;
        this.U = 0;
        return;
    L37:
        int[] r15 = this.o0;
        int r16 = r15[0];
        if (r16 != 1) goto L43;
        int r17 = this.T;
        if (r13 >= r17) goto L43;
        r13 = r17;
    L43:
        if (r15[1] != 1) goto L47;
        int r18 = this.U;
        if (r14 >= r18) goto L47;
        r14 = r18;
    L47:
        this.T = r13;
        this.U = r14;
        int r19 = this.b0;
        if (r14 >= r19) goto L50;
        this.U = r19;
    L50:
        int r20 = this.a0;
        if (r13 >= r20) goto L53;
        this.T = r20;
    L53:
        int r21 = this.v;
        if (r21 <= 0) goto L57;
        if (r16 != 3) goto L57;
        this.T = Math.min(this.T, r21);
    L57:
        int r22 = this.y;
        if (r22 > 0) goto L60;
    L62:
        int r23 = this.T;
        if (r13 == r23) goto L65;
        this.h = r23;
    L65:
        int r24 = this.U;
        if (r14 == r24) goto L69;
        this.i = r24;
        return;
    L69:
        return;
    L60:
        if (r15[1] != 3) goto L62;
        this.U = Math.min(this.U, r22);
    L32:
        r9 = 0;
        r0 = 0;
        r1 = 0;
        r2 = 0;
        goto L33
    }

    public final void a(kc0 r9, eb2 r10, HashSet r11, int r12, boolean r13) {
        if (r13 == true) goto L4;
    L7:
        if (r12 != 0) goto L20;
        HashSet r1 = this.H.a;
        if (r1 == null) goto L14;
        Iterator r7 = r1.iterator();
    L12:
        if (r7.hasNext() == false) goto L14;
        ((hb0) r7.next()).d.a(r9, r10, r11, r12, true);
    L14:
        HashSet r0 = this.J.a;
        if (r0 == null) goto L38;
        Iterator r6 = r0.iterator();
    L18:
        if (r6.hasNext() == false) goto L46;
        ((hb0) r6.next()).d.a(r9, r10, r11, r12, true);
        goto L18
    L46:
        return;
    L38:
        return;
    L20:
        HashSet r2 = this.I.a;
        if (r2 == null) goto L26;
        Iterator r8 = r2.iterator();
    L24:
        if (r8.hasNext() == false) goto L26;
        ((hb0) r8.next()).d.a(r9, r10, r11, r12, true);
    L26:
        HashSet r3 = this.K.a;
        if (r3 == null) goto L32;
        Iterator r14 = r3.iterator();
    L30:
        if (r14.hasNext() == false) goto L32;
        ((hb0) r14.next()).d.a(r9, r10, r11, r12, true);
    L32:
        HashSet r4 = this.L.a;
        if (r4 == null) goto L44;
        Iterator r15 = r4.iterator();
    L36:
        if (r15.hasNext() == false) goto L47;
        ((hb0) r15.next()).d.a(r9, r10, r11, r12, true);
        goto L36
    L47:
        return;
    L44:
        return;
    L4:
        if (r11.contains(this) == false) goto L45;
        uo.h(r9, r10, this);
        r11.remove(this);
        b(r10, r9.S(64));
        goto L7
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r58v0, types: [jc0] */
    public void b(eb2 r59, boolean r60) {
        eb2 r1 = r59;
        hb0 r2 = this.H;
        ai4 r3 = r1.k(r2);
        hb0 r4 = this.J;
        ai4 r5 = r1.k(r4);
        hb0 r6 = this.I;
        ai4 r7 = r1.k(r6);
        hb0 r8 = this.K;
        ai4 r9 = r1.k(r8);
        hb0 r10 = this.L;
        ai4 r11 = r1.k(r10);
        jc0 r12 = this.S;
        if (r12 == null) goto L21;
        int[] r13 = r12.o0;
        int r17 = 0;
        if (r13[0] != 2) goto L7;
        int r14 = 1;
    L9:
        if (r13[1] != 2) goto L11;
        int r18 = 1;
    L12:
        int r15 = this.q;
        if (r15 == 1) goto L20;
        if (r15 != 2) goto L16;
        r14 = 0;
    L17:
        int r16 = r18;
    L22:
        int r19 = this.f0;
        boolean[] r110 = this.R;
        int r20 = r16;
        if (r19 != 8) goto L38;
        ArrayList r111 = this.Q;
        int r112 = r111.size();
        int r22 = r14;
        int r113 = r17;
    L25:
        if (r113 >= r112) goto L34;
        int r24 = r112;
        HashSet r114 = ((hb0) r111.get(r113)).a;
        if (r114 == null) goto L32;
        if (r114.size() <= 0) goto L32;
    L39:
        boolean r115 = this.k;
        if (r115 == false) goto L42;
    L43:
        if (r115 == false) goto L63;
        r1.d(r3, this.X);
        r1.d(r5, this.X + this.T);
        if (r22 == 0) goto L63;
        jc0 r116 = this.S;
        if (r116 == null) goto L63;
        kc0 r117 = (kc0) r116;
        WeakReference r118 = r117.G0;
        if (r118 != null) goto L51;
    L54:
        r117.G0 = new WeakReference(r2);
    L55:
        WeakReference r119 = r117.I0;
        if (r119 != null) goto L58;
    L61:
        r117.I0 = new WeakReference(r4);
        goto L63
    L58:
        if (r119.get() == null) goto L61;
        if (r4.c() <= ((hb0) r117.I0.get()).c()) goto L63;
    L51:
        if (r118.get() == null) goto L54;
        if (r2.c() <= ((hb0) r117.G0.get()).c()) goto L55;
    L63:
        if (this.l == false) goto L88;
        r1.d(r7, this.Y);
        r1.d(r9, this.Y + this.U);
        HashSet r120 = r10.a;
        if (r120 != null) goto L68;
    L70:
        if (r20 == 0) goto L88;
        jc0 r121 = this.S;
        if (r121 == null) goto L88;
        kc0 r122 = (kc0) r121;
        WeakReference r123 = r122.F0;
        if (r123 != null) goto L76;
    L79:
        r122.F0 = new WeakReference(r6);
    L80:
        WeakReference r124 = r122.H0;
        if (r124 != null) goto L83;
    L86:
        r122.H0 = new WeakReference(r8);
        goto L88
    L83:
        if (r124.get() == null) goto L86;
        if (r8.c() <= ((hb0) r122.H0.get()).c()) goto L88;
    L76:
        if (r123.get() == null) goto L79;
        if (r6.c() <= ((hb0) r122.F0.get()).c()) goto L80;
    L68:
        if (r120.size() <= 0) goto L70;
        r1.d(r11, this.Y + this.Z);
    L88:
        if (this.k == true) goto L90;
    L93:
        boolean[] r125 = this.f;
        if (r60 == false) goto L125;
        up1 r126 = this.d;
        if (r126 == null) goto L125;
        w45 r127 = this.e;
        if (r127 == null) goto L125;
        hb0 r23 = r10;
        yo0 r128 = r126.h;
        boolean[] r25 = r125;
        if (r128.j == false) goto L127;
        if (r126.i.j == false) goto L127;
        if (r127.h.j == false) goto L127;
        if (r127.i.j == false) goto L127;
        r1.d(r3, r128.g);
        r1.d(r5, this.d.i.g);
        r1.d(r7, this.e.h.g);
        r1.d(r9, this.e.i.g);
        r1.d(r11, this.e.k.g);
        if (this.S == null) goto L121;
        if (r22 != 0) goto L111;
    L115:
        if (r20 == 0) goto L121;
        if (r25[1] == false) goto L121;
        if (w() == true) goto L121;
        boolean r129 = false;
        r1.f(r1.k(this.S.K), r9, 0, 8);
    L122:
        this.k = r129;
        this.l = r129;
        return;
    L111:
        if (r25[0] == false) goto L115;
        if (v() == true) goto L115;
        r1.f(r1.k(this.S.J), r5, 0, 8);
    L121:
        r129 = false;
    L127:
        if (this.S != null) goto L129;
        r2 = r2;
        boolean r130 = false;
        boolean r21 = false;
    L158:
        int r131 = this.T;
        int r132 = this.a0;
        if (r131 < r132) goto L162;
        r132 = r131;
    L162:
        int r133 = this.U;
        int r26 = this.b0;
        if (r133 >= r26) goto L165;
        int r27 = r26;
    L166:
        int[] r28 = this.o0;
        int r29 = r28[0];
        if (r29 == 3) goto L170;
        boolean r30 = true;
    L171:
        int r31 = r28[1];
        if (r31 == 3) goto L174;
        boolean r32 = true;
    L175:
        int r33 = this.W;
        this.A = r33;
        float r34 = this.V;
        this.B = r34;
        int r35 = this.r;
        int r36 = this.s;
        if (r34 <= 0.0f) goto L268;
        hb0 r39 = r8;
        if (this.f0 != 8) goto L180;
    L267:
        r9 = r9;
        int r37 = r27;
        int r38 = r35;
        int r210 = r36;
    L265:
        boolean r310 = false;
    L270:
        int[] r40 = this.t;
        r40[0] = r38;
        r40[1] = r210;
        if (r310 == false) goto L276;
        int r41 = this.A;
        int r42 = -1;
        if (r41 == 0) goto L275;
        if (r41 == (-1)) goto L275;
    L277:
        boolean r43 = false;
    L278:
        if (r310 == false) goto L284;
        int r44 = this.A;
        if (r44 == 1) goto L282;
        if (r44 != r42) goto L284;
    L282:
        boolean r311 = true;
    L286:
        if (r28[0] == 2) goto L288;
    L290:
        boolean r45 = false;
    L291:
        if (r45 == false) goto L293;
        r132 = 0;
    L293:
        hb0 r46 = this.O;
        boolean r211 = !r46.f();
        char r134 = '\b';
        boolean r212 = r110[0];
        boolean r312 = r110[1];
        int r47 = this.o;
        int[] r135 = this.C;
        ai4 r313 = null;
        if (r47 != 2) goto L296;
    L314:
        hb0 r55 = r23;
        ai4 r49 = r3;
        ai4 r50 = r5;
        ai4 r53 = r11;
        boolean r136 = r130;
        ?? r48 = r22;
        ?? r51 = r20;
        int r213 = r38;
    L329:
        if (r60 == false) goto L346;
        w45 r52 = this.e;
        if (r52 == null) goto L346;
        yo0 r54 = r52.h;
        if (r54.j == false) goto L346;
        if (r52.i.j == false) goto L346;
        int r56 = r54.g;
        ai4 r57 = r7;
        r1.d(r57, r56);
        ai4 r58 = r9;
        r1.d(r58, this.e.i.g);
        ai4 r61 = r53;
        r1.d(r61, this.e.k.g);
        jc0 r62 = this.S;
        if (r62 == null) goto L344;
        if (r21 == true) goto L344;
        if (r51 == 0) goto L344;
        boolean r137 = true;
        r137 = true;
        if (r25[1] == false) goto L343;
        int r63 = 0;
        int r138 = 8;
        r1.f(r1.k(r62.K), r58, 0, 8);
    L345:
        int r139 = r63;
        boolean r140 = r137;
    L348:
        if (this.p != 2) goto L351;
        r139 = r63;
    L351:
        if (r139 != 0) goto L353;
    L389:
        ai4 r510 = r57;
    L390:
        if (r310 == false) goto L396;
        int r64 = this.A;
        float r65 = this.B;
        if (r64 != 1) goto L394;
        pi r66 = r1.l();
        r66.d.g(r58, -1.0f);
        r66.d.g(r510, 1.0f);
        r66.d.g(r50, r65);
        r66.d.g(r49, -r65);
        r1.c(r66);
        goto L396
    L394:
        pi r67 = r1.l();
        r67.d.g(r50, -1.0f);
        r67.d.g(r49, 1.0f);
        r67.d.g(r58, r65);
        r67.d.g(r510, -r65);
        r1.c(r67);
    L396:
        if (r46.f() == false) goto L398;
        jc0 r68 = r46.f.d;
        float r69 = (float) Math.toRadians(this.D + 90.0f);
        int r70 = r46.d();
        ai4 r71 = r1.k(g(2));
        ai4 r72 = r1.k(g(3));
        ai4 r73 = r1.k(g(4));
        ai4 r141 = r1.k(g(5));
        ai4 r142 = r1.k(r68.g(2));
        ai4 r74 = r1.k(r68.g(3));
        ai4 r75 = r1.k(r68.g(4));
        ai4 r76 = r1.k(r68.g(5));
        pi r143 = r1.l();
        double r144 = r69;
        double r145 = Math.sin(r144);
        double r146 = r70;
        r143.d.g(r74, 0.5f);
        r143.d.g(r76, 0.5f);
        r143.d.g(r72, -0.5f);
        r143.d.g(r141, -0.5f);
        r143.b = -((float) (r145 * r146));
        r1.c(r143);
        pi r77 = r1.l();
        float r78 = (float) (Math.cos(r144) * r146);
        r77.d.g(r142, 0.5f);
        r77.d.g(r75, 0.5f);
        r77.d.g(r71, -0.5f);
        r77.d.g(r73, -0.5f);
        r77.b = -r78;
        r1.c(r77);
    L398:
        this.k = false;
        this.l = false;
        return;
    L353:
        if (this.l == true) goto L389;
        if (r28[r140 ? 1 : 0] == 2) goto L357;
    L359:
        int r147 = r63;
    L360:
        if (r147 == 0) goto L362;
        int r148 = r63;
    L363:
        jc0 r149 = this.S;
        if (r149 == null) goto L366;
        ai4 r150 = r1.k(r149.K);
    L367:
        jc0 r151 = this.S;
        if (r151 == null) goto L370;
        r313 = r1.k(r151.I);
    L370:
        int r152 = this.Z;
        if (r152 > 0) goto L374;
        ?? r214 = r211;
        if (this.f0 == r138) goto L374;
    L384:
        boolean r79 = r25[r140 ? 1 : 0];
        int r153 = r63;
        int r80 = r28[r140 ? 1 : 0];
        int r154 = this.Y;
        int r155 = this.b0;
        int r81 = r135[r140 ? 1 : 0];
        float r156 = this.d0;
        int r82 = r28[r153];
        boolean r157 = r140 ? 1 : 0;
        ?? r158 = r140;
        if (r82 == 3) goto L388;
        r158 = r153;
    L388:
        ?? r159 = r51;
        ?? r83 = r48;
        ?? r160 = r147;
        boolean r161 = r311;
        r510 = r57;
        ai4 r84 = r313;
        r1 = r59;
        d(r1, false, r159, r83, r79, r84, r150, r80, r160, this.I, this.K, r154, r148, r155, r81, r156, r161, r158, r21, r136, r312, r210, r213, this.x, this.y, this.z, r214);
    L374:
        hb0 r162 = r55;
        if (r162.f == null) goto L381;
        r1.e(r61, r57, r152, r138);
        r1.e(r61, r1.k(r162.f), r162.d(), r138);
        if (r51 == 0) goto L379;
        r1.f(r150, r1.k(r39), r63, 5);
    L379:
        r214 = r63;
        goto L384
    L381:
        if (this.f0 != r138) goto L383;
        r1.e(r61, r57, r162.d(), r138);
        r214 = r211;
        goto L384
    L383:
        r1.e(r61, r57, r152, r138);
        r214 = r211;
        goto L384
    L366:
        r150 = null;
        goto L367
    L362:
        r148 = r37;
        goto L363
    L357:
        if ((this instanceof kc0) == false) goto L359;
        r147 = r140 ? 1 : 0;
        goto L360
    L343:
        r63 = 0;
        r138 = 8;
    L344:
        r63 = 0;
        r138 = 8;
        r137 = true;
    L346:
        r57 = r33;
        r58 = r9;
        r61 = r53;
        r63 = 0;
        r138 = 8;
        r140 = true;
        r139 = 1;
        goto L348
    L296:
        if (this.k == true) goto L314;
        if (r60 == false) goto L315;
        up1 r85 = this.d;
        if (r85 == null) goto L315;
        yo0 r163 = r85.h;
        if (r163.j == true) goto L303;
    L304:
        r134 = '\b';
        goto L315
    L303:
        if (r85.i.j == false) goto L304;
        if (r60 == false) goto L314;
        r1.d(r3, r163.g);
        r1.d(r5, this.d.i.g);
        if (this.S == null) goto L314;
        if (r22 == 0) goto L314;
        if (r25[0] == false) goto L314;
        if (v() == true) goto L314;
        r1.f(r1.k(this.S.J), r5, 0, 8);
    L315:
        jc0 r86 = this.S;
        if (r86 == null) goto L318;
        ai4 r87 = r1.k(r86.J);
    L319:
        jc0 r164 = this.S;
        if (r164 == null) goto L323;
        ai4 r165 = r1.k(r164.H);
    L324:
        boolean r88 = r25[0];
        ?? r89 = r22;
        r213 = r38;
        ai4 r90 = r87;
        int r91 = r28[0];
        r136 = r130;
        int r166 = this.X;
        int r167 = this.a0;
        ai4 r92 = r165;
        int r168 = r135[0];
        float r93 = this.c0;
        boolean r169 = true;
        hb0 r410 = r23;
        if (r28[1] == 3) goto L328;
        r169 = false;
    L328:
        boolean r170 = r43;
        r49 = r3;
        ?? r94 = r20;
        r50 = r5;
        r55 = r410;
        r53 = r11;
        r1 = r59;
        d(r1, true, r89, r94, r88, r92, r90, r91, r45, this.H, this.J, r166, r132, r167, r168, r93, r170, r169, r136, r21, r212, r213, r210, this.u, this.v, this.w, r211);
        r48 = r89;
        r51 = r94;
        goto L329
    L323:
        r165 = null;
        goto L324
    L318:
        r87 = null;
        goto L319
    L288:
        if ((this instanceof kc0) == false) goto L290;
        r45 = true;
    L284:
        r311 = false;
    L275:
        r43 = true;
        goto L278
    L276:
        r42 = -1;
        goto L277
    L180:
        if (r29 != 3) goto L183;
        if (r35 != 0) goto L183;
        r38 = 3;
    L184:
        if (r31 != 3) goto L187;
        if (r36 != 0) goto L187;
        int r95 = 3;
    L188:
        if (r29 != 3) goto L249;
        if (r31 != 3) goto L249;
        if (r38 != 3) goto L249;
        if (r95 != 3) goto L249;
        if (r33 != (-1)) goto L203;
        if (r30 == false) goto L197;
        if (r32 == true) goto L197;
        this.A = 0;
    L197:
        if (r30 == true) goto L203;
        if (r32 == false) goto L203;
        this.A = 1;
        if (r33 != (-1)) goto L203;
        this.B = 1.0f / r34;
    L203:
        if (this.A != 0) goto L212;
        if (r6.f() == false) goto L210;
        if (r39.f() == true) goto L212;
    L210:
        this.A = 1;
    L219:
        if (this.A != (-1)) goto L239;
        if (r6.f() == false) goto L229;
        if (r39.f() == false) goto L229;
        if (r2.f() == false) goto L229;
        if (r4.f() == true) goto L239;
    L229:
        if (r6.f() == false) goto L234;
        if (r39.f() == false) goto L234;
        this.A = 0;
    L234:
        if (r2.f() == false) goto L239;
        if (r4.f() == false) goto L239;
        this.B = 1.0f / this.B;
        this.A = 1;
    L239:
        if (this.A != (-1)) goto L255;
        int r96 = this.u;
        if (r96 > 0) goto L243;
    L245:
        if (r96 != 0) goto L255;
        if (this.x <= 0) goto L255;
        this.B = 1.0f / this.B;
        this.A = 1;
        goto L255
    L243:
        if (this.x != 0) goto L245;
        this.A = 0;
    L255:
        r37 = r27;
    L256:
        r310 = true;
    L254:
        r210 = r95;
    L212:
        if (this.A != 1) goto L219;
        if (r2.f() == true) goto L216;
    L217:
        this.A = 0;
        goto L219
    L216:
        if (r4.f() == true) goto L219;
    L249:
        if (r29 != 3) goto L257;
        if (r38 != 3) goto L257;
        this.A = 0;
        r132 = (int) (r34 * r133);
        if (r31 == 3) goto L255;
        r23 = r23;
        r37 = r27;
        r38 = 4;
        r310 = false;
    L257:
        if (r31 != 3) goto L255;
        if (r95 != 3) goto L255;
        this.A = 1;
        if (r33 != (-1)) goto L262;
        this.B = 1.0f / r34;
    L262:
        r37 = (int) (this.B * r131);
        if (r29 == 3) goto L256;
        r38 = r38;
        r210 = 4;
    L187:
        r95 = r36;
    L183:
        r38 = r35;
        goto L184
    L268:
        r39 = r8;
        goto L267
    L174:
        r32 = false;
        goto L175
    L170:
        r30 = false;
        goto L171
    L165:
        r27 = r133;
        goto L166
    L129:
        if (u(0) == false) goto L131;
        ((kc0) this.S).N(this, 0);
        boolean r171 = true;
        int r172 = 1;
    L133:
        if (u(r172) == false) goto L135;
        ((kc0) this.S).N(this, r172);
        boolean r173 = true;
    L136:
        if (r171 == true) goto L146;
        if (r22 == 0) goto L146;
        if (this.f0 == 8) goto L146;
        if (r2.f != null) goto L146;
        if (r4.f != null) goto L146;
        r1.f(r1.k(this.S.J), r5, 0, 1);
    L146:
        if (r173 == true) goto L156;
        if (r20 == 0) goto L156;
        if (this.f0 == 8) goto L156;
        if (r6.f != null) goto L156;
        if (r8.f != null) goto L156;
        if (r23 != null) goto L156;
        r1.f(r1.k(this.S.K), r9, 0, 1);
    L156:
        r21 = r173;
        r130 = r171;
        goto L158
    L135:
        r173 = w();
        goto L136
    L131:
        r171 = v();
        r172 = 1;
    L125:
        r23 = r10;
        r25 = r125;
        goto L127
    L90:
        if (this.l == false) goto L93;
        ?? r174 = r17;
        this.k = r174;
        this.l = r174;
        return;
    L42:
        if (this.l == false) goto L93;
    L32:
        r113 = r113 + 1;
        r112 = r24;
        goto L25
    L34:
        if (r110[r17] == true) goto L39;
        if (r110[1] == true) goto L39;
        return;
    L38:
        r22 = r14;
        goto L39
    L16:
        if (r15 != 3) goto L17;
    L18:
        r16 = r17;
        r14 = r16;
        goto L22
    L20:
        r16 = 0;
        goto L22
    L11:
        r18 = 0;
        goto L12
    L7:
        r14 = 0;
        goto L9
    L21:
        r17 = 0;
        goto L18
    }

    public boolean c() {
        if (this.f0 == 8) goto L6;
        return true;
    L6:
        return false;
    }

    public final void d(eb2 r30, boolean r31, boolean r32, boolean r33, boolean r34, ai4 r35, ai4 r36, int r37, boolean r38, hb0 r39, hb0 r40, int r41, int r42, int r43, int r44, float r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, int r51, int r52, int r53, int r54, float r55, boolean r56) {
        r30 = r30;
        int r4 = r53;
        int r5 = r54;
        ai4 r7 = r30.k(r39);
        ai4 r8 = r30.k(r40);
        ai4 r9 = r30.k(r39.f);
        ai4 r15 = r30.k(r40.f);
        boolean r16 = r39.f();
        boolean r17 = r40.f();
        boolean r11 = this.O.f();
        if (r17 == false) goto L5;
        int r18 = (r16 ? 1 : 0) + 1;
    L6:
        if (r11 == false) goto L8;
        r18 = r18 + 1;
    L8:
        int r12 = r18;
        if (r46 == false) goto L11;
        int r3 = 3;
    L12:
        int r13 = xa3.w(r37);
        if (r13 == 0) goto L17;
        if (r13 == 1) goto L17;
        if (r13 != 2) goto L17;
        if (r3 == 4) goto L17;
        boolean r10 = true;
    L21:
        int r14 = this.h;
        if (r14 == (-1)) goto L25;
        if (r31 == false) goto L25;
        this.h = -1;
        boolean r410 = false;
    L26:
        int r19 = this.i;
        if (r19 == (-1)) goto L30;
        if (r31 == true) goto L30;
        this.i = -1;
        r14 = r19;
        boolean r110 = false;
    L31:
        boolean r411 = r110;
        if (this.f0 != 8) goto L34;
        boolean r111 = false;
        int r112 = 0;
    L35:
        if (r56 == false) goto L44;
        if (r16 == true) goto L41;
        if (r17 == true) goto L41;
        if (r11 == true) goto L41;
        r30.d(r7, r41);
    L40:
        int r113 = 8;
    L45:
        if (r111 != 0) goto L56;
        if (r38 == false) goto L53;
        r30.e(r8, r7, 0, 3);
        if (r43 <= 0) goto L51;
        r30.f(r8, r7, r43, r113);
    L51:
        if (r44 >= Integer.MAX_VALUE) goto L54;
        r30.g(r8, r7, r44, r113);
    L54:
        boolean r114 = r34;
        int r115 = r4;
    L103:
        if (r56 == false) goto L105;
        if (r48 == true) goto L105;
        if (r16 == true) goto L111;
        if (r17 == true) goto L111;
        if (r11 == true) goto L111;
        ai4 r6 = r15;
    L110:
        int r116 = 5;
    L306:
        boolean r20 = r32;
    L305:
        int r117 = r116;
    L307:
        if (r20 == false) goto L345;
        if (r114 == true) goto L310;
        return;
    L310:
        if (r40.f == null) goto L313;
        int r118 = r40.d();
    L314:
        if (r6 == r36) goto L347;
        r30.f(r36, r8, r118, r117);
        return;
    L347:
        return;
    L313:
        r118 = 0;
        goto L314
    L345:
        return;
    L111:
        if (r16 == false) goto L120;
        if (r17 == true) goto L120;
        jc0 r0 = r39.f.d;
        if (r32 == true) goto L116;
    L118:
        int r1 = 5;
    L119:
        r40 = r40;
        r8 = r8;
        r114 = r114;
        r6 = r15;
        r20 = r32;
        r117 = r1;
        goto L307
    L116:
        if ((r0 instanceof ep) == false) goto L118;
        r1 = 8;
    L120:
        if (r16 == true) goto L126;
        if (r17 == false) goto L126;
        r6 = r15;
        r30.e(r8, r6, -r40.d(), 8);
        if (r32 == false) goto L110;
        r30.f(r7, r35, 0, 5);
        r40 = r40;
        r116 = 5;
        r8 = r8;
        r114 = r114;
    L126:
        r6 = r15;
        if (r16 == false) goto L110;
        if (r17 == false) goto L110;
        jc0 r119 = r39.f.d;
        jc0 r21 = r40.f.d;
        r114 = r114;
        jc0 r120 = this.S;
        int r121 = 6;
        if (r111 == false) goto L201;
        if (r3 != 0) goto L151;
        if (r5 != 0) goto L141;
        if (r115 != 0) goto L141;
        if (r9.s == true) goto L137;
    L140:
        int r22 = 8;
        int r122 = 8;
        boolean r123 = false;
        boolean r23 = true;
        boolean r24 = false;
    L143:
        if ((r119 instanceof ep) == false) goto L145;
    L149:
        r30 = r30;
        r3 = r3;
        r7 = r7;
        r8 = r8;
        boolean r25 = r23;
        r36 = r36;
        int r26 = r22;
        r9 = r9;
        r121 = 6;
        boolean r27 = r123;
        int r124 = 4;
    L216:
        if (r24 == false) goto L220;
        if (r9 != r6) goto L220;
        if (r119 == r120) goto L220;
        r24 = false;
        boolean r28 = false;
    L221:
        if (r27 == false) goto L231;
        if (r111 == true) goto L229;
        if (r47 == true) goto L229;
        if (r49 == true) goto L229;
        if (r9 != r35) goto L229;
        if (r6 != r36) goto L229;
        r121 = 8;
        r20 = false;
        int r29 = 8;
        boolean r210 = false;
    L230:
        ai4 r57 = r9;
        jc0 r125 = r21;
        r30.b(r7, r57, r39.d(), r45, r6, r8, r40.d(), r121);
        r9 = r57;
        r26 = r29;
        r28 = r210;
    L233:
        if (this.f0 != 8) goto L239;
        HashSet r2 = r40.a;
        if (r2 != null) goto L238;
        return;
    L238:
        if (r2.size() > 0) goto L239;
        return;
    L239:
        if (r24 == false) goto L249;
        if (r20 == false) goto L248;
        if (r9 == r6) goto L248;
        if (r111 == true) goto L248;
        if ((r119 instanceof ep) == false) goto L246;
    L247:
        r26 = 6;
        goto L248
    L246:
        if ((r125 instanceof ep) == true) goto L247;
    L248:
        r30.f(r7, r9, r39.d(), r26);
        r30.g(r8, r6, -r40.d(), r26);
    L249:
        if (r20 == false) goto L257;
        if (r50 == false) goto L257;
        if ((r119 instanceof ep) == true) goto L257;
        if ((r125 instanceof ep) == true) goto L257;
        if (r125 == r120) goto L257;
        int r58 = 6;
        r26 = 6;
        boolean r211 = true;
    L258:
        if (r211 == false) goto L289;
        if (r25 == false) goto L280;
        if (r49 == false) goto L262;
        if (r33 == false) goto L280;
    L262:
        if (r119 == r120) goto L267;
        if (r125 == r120) goto L267;
        r121 = r58;
    L267:
        if ((r119 instanceof pk1) == false) goto L269;
    L270:
        r121 = 5;
    L272:
        if ((r119 instanceof ep) == false) goto L274;
    L275:
        r121 = 5;
    L276:
        if (r49 == false) goto L278;
        int r59 = 5;
    L279:
        r58 = Math.max(r59, r58);
        goto L280
    L278:
        r59 = r121;
        goto L279
    L274:
        if ((r125 instanceof ep) == false) goto L276;
    L269:
        if ((r125 instanceof pk1) == false) goto L272;
    L280:
        if (r20 == false) goto L287;
        r58 = Math.min(r26, r58);
        if (r46 == false) goto L287;
        if (r49 == true) goto L287;
        if (r119 == r120) goto L286;
        if (r125 != r120) goto L287;
    L286:
        int r126 = 4;
    L288:
        r30.e(r7, r9, r39.d(), r126);
        r30.e(r8, r6, -r40.d(), r126);
    L287:
        r126 = r58;
    L289:
        if (r20 == false) goto L295;
        if (r35 != r9) goto L292;
        int r60 = r39.d();
    L293:
        if (r9 == r35) goto L295;
        r30.f(r7, r35, r60, 5);
        goto L295
    L292:
        r60 = 0;
    L295:
        if (r20 == false) goto L303;
        if (r111 == false) goto L303;
        if (r43 != 0) goto L303;
        if (r115 != 0) goto L303;
        if (r111 == true) goto L301;
    L304:
        r116 = 5;
        r30.f(r8, r7, 0, 5);
        goto L305
    L301:
        if (r3 != 3) goto L304;
        r30.f(r8, r7, 0, 8);
    L303:
        r116 = 5;
    L257:
        r58 = r124;
        r211 = r28;
    L229:
        r20 = r32;
        r210 = r28;
        r29 = r26;
        goto L230
    L231:
        r125 = r21;
        r20 = r32;
    L220:
        r28 = true;
        goto L221
    L145:
        if ((r21 instanceof ep) == true) goto L149;
        r30 = r30;
        r7 = r7;
        r8 = r8;
        r25 = r23;
        r26 = r22;
        r9 = r9;
        r121 = 6;
        r27 = r123;
        r124 = r122;
        r3 = r3;
    L148:
        r36 = r36;
        goto L216
    L137:
        if (r6.s == false) goto L140;
        r30.e(r7, r9, r39.d(), 8);
        r30.e(r8, r6, -r40.d(), 8);
        return;
    L141:
        r22 = 5;
        r122 = 5;
        r123 = true;
        r23 = false;
        r24 = true;
        goto L143
    L151:
        if (r3 != 2) goto L162;
        if ((r119 instanceof ep) == false) goto L155;
    L159:
        r26 = 5;
    L160:
        r124 = 4;
    L158:
        r27 = true;
        r24 = true;
        r25 = false;
        goto L148
    L155:
        if ((r21 instanceof ep) == true) goto L159;
        r30 = r30;
        r3 = r3;
        r7 = r7;
        r8 = r8;
        r9 = r9;
        r121 = 6;
        r26 = 5;
        r124 = 5;
        goto L158
    L162:
        if (r3 != 1) goto L165;
        r26 = 8;
        goto L160
    L165:
        if (r3 != 3) goto L198;
        r3 = r3;
        if (this.A != (-1)) goto L176;
        if (r49 == false) goto L175;
        r30 = r30;
        r36 = r36;
        r7 = r7;
        r8 = r8;
        r9 = r9;
        r26 = 8;
        if (r32 == false) goto L174;
        r121 = 5;
    L172:
        r124 = 5;
    L173:
        r27 = true;
        r24 = true;
        r25 = true;
        goto L216
    L174:
        r121 = 4;
        goto L172
    L175:
        r30 = r30;
        r36 = r36;
        r7 = r7;
        r8 = r8;
        r9 = r9;
        r26 = 8;
        r121 = 8;
        goto L172
    L176:
        if (r46 == true) goto L178;
        if (r5 <= 0) goto L188;
        r30 = r30;
        r36 = r36;
        r7 = r7;
        r8 = r8;
        r9 = r9;
        r121 = 6;
        r26 = 5;
        goto L172
    L188:
        if (r5 != 0) goto L197;
        if (r115 != 0) goto L197;
        if (r49 == true) goto L192;
        r30 = r30;
        r36 = r36;
        r7 = r7;
        r8 = r8;
        r9 = r9;
        r121 = 6;
        r26 = 5;
        r124 = 8;
        goto L173
    L192:
        if (r119 == r120) goto L195;
        if (r21 == r120) goto L195;
        int r61 = 4;
    L196:
        r124 = 4;
        r27 = true;
        r24 = true;
        r25 = true;
    L185:
        r26 = r61;
        r30 = r30;
    L195:
        r61 = 5;
    L197:
        r30 = r30;
        r36 = r36;
        r7 = r7;
        r8 = r8;
        r9 = r9;
        r121 = 6;
        r26 = 5;
        r124 = 4;
        goto L173
    L178:
        if (r52 != 2) goto L180;
    L183:
        r61 = 5;
        int r62 = 4;
    L184:
        r124 = r62;
        r27 = true;
        r24 = true;
        r25 = true;
        goto L185
    L180:
        if (r52 == 1) goto L183;
        r61 = 8;
        r62 = 5;
        goto L184
    L198:
        r26 = 5;
        r124 = 4;
        r27 = false;
        r24 = false;
    L199:
        r25 = false;
        goto L216
    L201:
        if (r9.s == true) goto L203;
    L215:
        r26 = 5;
        r124 = 4;
        r27 = true;
        r24 = true;
        goto L199
    L203:
        if (r6.s == false) goto L215;
        r30.b(r7, r9, r39.d(), r45, r6, r8, r40.d(), 8);
        if (r32 == false) goto L341;
        if (r114 == true) goto L208;
        return;
    L208:
        if (r40.f == null) goto L211;
        int r127 = r40.d();
    L212:
        if (r6 == r36) goto L343;
        r30.f(r36, r8, r127, 5);
        return;
    L343:
        return;
    L211:
        r127 = 0;
        goto L212
    L341:
        return;
    L105:
        boolean r310 = r114;
        if (r12 >= 2) goto L348;
        if (r32 == false) goto L349;
        if (r310 == false) goto L350;
        r30.f(r7, r35, 0, 8);
        hb0 r63 = this.L;
        if (r31 == false) goto L323;
    L326:
        boolean r128 = true;
    L327:
        if (r31 == true) goto L338;
        hb0 r64 = r63.f;
        if (r64 == null) goto L338;
        jc0 r65 = r64.d;
        if (r65.V == 0.0f) goto L337;
        int[] r66 = r65.o0;
        if (r66[0] != 3) goto L337;
        if (r66[1] != 3) goto L337;
        r128 = true;
    L337:
        r128 = false;
    L338:
        if (r128 == false) goto L351;
        r30.f(r36, r8, 0, 8);
        return;
    L351:
        return;
    L323:
        if (r63.f == null) goto L326;
        r128 = false;
        goto L327
    L350:
        return;
    L349:
        return;
    L348:
        return;
    L53:
        r30.e(r8, r7, r112, r113);
        goto L54
    L56:
        if (r12 == 2) goto L66;
        if (r46 == true) goto L66;
        if (r3 == 1) goto L61;
        if (r3 != 0) goto L66;
    L61:
        int r67 = Math.max(r4, r112);
        if (r5 <= 0) goto L64;
        r67 = Math.min(r5, r67);
    L64:
        r30.e(r8, r7, r67, 8);
        r114 = r34;
        r115 = r4;
        r111 = false;
    L66:
        if (r4 != (-2)) goto L68;
        r4 = r112;
    L68:
        if (r5 != (-2)) goto L70;
        r5 = r112;
    L70:
        if (r112 <= 0) goto L75;
        if (r3 == 1) goto L75;
        r112 = 0;
    L75:
        if (r4 <= 0) goto L78;
        r30.f(r8, r7, r4, 8);
        r112 = Math.max(r112, r4);
    L78:
        if (r5 <= 0) goto L84;
        if (r32 == false) goto L82;
        if (r3 != 1) goto L82;
    L83:
        r112 = Math.min(r112, r5);
    L82:
        r30.g(r8, r7, r5, 8);
    L84:
        if (r3 != 1) goto L91;
        if (r32 == false) goto L87;
        r30.e(r8, r7, r112, 8);
        goto L54
    L87:
        if (r48 == false) goto L89;
        r30.e(r8, r7, r112, 5);
        r30.g(r8, r7, r112, 8);
        goto L54
    L89:
        r30.e(r8, r7, r112, 5);
        r30.g(r8, r7, r112, 8);
        goto L54
    L91:
        if (r3 != 2) goto L102;
        int r129 = r39.e;
        if (r129 == 3) goto L97;
        if (r129 == 5) goto L97;
        ai4 r68 = r30.k(this.S.g(2));
        ai4 r130 = r30.k(this.S.g(4));
    L98:
        pi r131 = r30.l();
        int r311 = r4;
        r131.d.g(r8, -1.0f);
        r131.d.g(r7, 1.0f);
        r131.d.g(r130, r55);
        r131.d.g(r68, -r55);
        r30.c(r131);
        if (r32 == false) goto L101;
        r111 = false;
    L101:
        r114 = r34;
        r115 = r311;
    L97:
        r68 = r30.k(this.S.g(3));
        r130 = r30.k(this.S.g(5));
        goto L98
    L102:
        r115 = r4;
        r114 = true;
    L41:
        if (r16 == false) goto L40;
        if (r17 == true) goto L40;
        r113 = 8;
        r30.e(r7, r9, r39.d(), 8);
        goto L45
    L44:
        r113 = 8;
        goto L45
    L34:
        r112 = r14;
        r111 = r411;
    L30:
        r110 = r410;
    L25:
        r14 = r42;
        r410 = r10;
    L17:
        r10 = false;
        goto L21
    L11:
        r3 = r51;
        goto L12
    L5:
        r18 = r16 ? 1 : 0;
        goto L6
    }

    public final void e(eb2 r2) {
        r2.k(this.H);
        r2.k(this.I);
        r2.k(this.J);
        r2.k(this.K);
        if (this.Z <= 0) goto L6;
        r2.k(this.L);
        return;
    }

    public final void f() {
        if (this.d != null) goto L6;
        up1 r0 = new up1(this);
        r0.h.e = 4;
        r0.i.e = 5;
        r0.f = 0;
        this.d = r0;
    L6:
        if (this.e != null) goto L9;
        w45 r1 = new w45(this);
        yo0 r2 = new yo0(r1);
        r1.k = r2;
        r1.l = null;
        r1.h.e = 6;
        r1.i.e = 7;
        r2.e = 8;
        r1.f = 1;
        this.e = r1;
        return;
    }

    public hb0 g(int r2) {
        switch(xa3.w(r2)) {
            case 0: goto L22;
            case 1: goto L21;
            case 2: goto L19;
            case 3: goto L17;
            case 4: goto L15;
            case 5: goto L13;
            case 6: goto L11;
            case 7: goto L9;
            case 8: goto L7;
            default: goto L5;
        };
    L22:
        return null;
    L5:
        throw new AssertionError(xa3.v(r2));
    L7:
        return this.N;
    L9:
        return this.M;
    L11:
        return this.O;
    L13:
        return this.L;
    L15:
        return this.K;
    L17:
        return this.J;
    L19:
        return this.I;
    L21:
        return this.H;
    }

    public final int h(int r3) {
        int[] r2 = this.o0;
        if (r3 != 0) goto L7;
        return r2[0];
    L7:
        if (r3 == 1) goto L9;
        return 0;
    L9:
        return r2[1];
    }

    public final int i() {
        if (this.f0 != 8) goto L7;
        return 0;
    L7:
        return this.U;
    }

    public final jc0 j(int r2) {
        if (r2 != 0) goto L10;
        hb0 r1 = this.J;
        hb0 r3 = r1.f;
        if (r3 != null) goto L6;
        return null;
    L6:
        if (r3.f == r1) goto L8;
        return null;
    L8:
        return r3.d;
    L10:
        if (r2 != 1) goto L20;
        hb0 r4 = this.K;
        hb0 r5 = r4.f;
        if (r5 != null) goto L14;
        return null;
    L14:
        if (r5.f == r4) goto L16;
        return null;
    L16:
        return r5.d;
    L20:
        return null;
    }

    public final jc0 k(int r2) {
        if (r2 != 0) goto L10;
        hb0 r1 = this.H;
        hb0 r3 = r1.f;
        if (r3 != null) goto L6;
        return null;
    L6:
        if (r3.f == r1) goto L8;
        return null;
    L8:
        return r3.d;
    L10:
        if (r2 != 1) goto L20;
        hb0 r4 = this.I;
        hb0 r5 = r4.f;
        if (r5 != null) goto L14;
        return null;
    L14:
        if (r5.f == r4) goto L16;
        return null;
    L16:
        return r5.d;
    L20:
        return null;
    }

    public void l(StringBuilder r15) {
        r15.append("  " + this.j + ":{\n");
        StringBuilder r2 = new StringBuilder("    actualWidth:");
        r2.append(this.T);
        r15.append(r2.toString());
        r15.append("\n");
        r15.append("    actualHeight:" + this.U);
        r15.append("\n");
        r15.append("    actualLeft:" + this.X);
        r15.append("\n");
        r15.append("    actualTop:" + this.Y);
        r15.append("\n");
        n(r15, "left", this.H);
        n(r15, "top", this.I);
        n(r15, "right", this.J);
        n(r15, "bottom", this.K);
        n(r15, "baseline", this.L);
        n(r15, "centerX", this.M);
        n(r15, "centerY", this.N);
        int r3 = this.T;
        int r4 = this.a0;
        int[] r10 = this.C;
        int r5 = r10[0];
        int r6 = this.u;
        int r7 = this.r;
        float r8 = this.w;
        int[] r12 = this.o0;
        int r9 = r12[0];
        float[] r13 = this.j0;
        float r11 = r13[0];
        m(r15, "    width", r3, r4, r5, r6, r7, r8, r9);
        int r14 = this.U;
        int r16 = this.b0;
        int r17 = r10[1];
        int r18 = this.x;
        int r19 = this.s;
        float r20 = this.z;
        int r21 = r12[1];
        float r1 = r13[1];
        m(r15, "    height", r14, r16, r17, r18, r19, r20, r21);
        float r22 = this.V;
        int r23 = this.W;
        if (r22 == 0.0f) goto L6;
        r15.append("    dimensionRatio");
        r15.append(" :  [");
        r15.append(r22);
        r15.append(",");
        r15.append(r23);
        r15.append("");
        r15.append("],\n");
    L6:
        E(r15, "    horizontalBias", this.c0, 0.5f);
        E(r15, "    verticalBias", this.d0, 0.5f);
        D(this.h0, 0, "    horizontalChainStyle", r15);
        D(this.i0, 0, "    verticalChainStyle", r15);
        r15.append("  }");
    }

    public final int o() {
        if (this.f0 != 8) goto L7;
        return 0;
    L7:
        return this.T;
    }

    public final int p() {
        jc0 r0 = this.S;
        if (r0 == null) goto L9;
        if ((r0 instanceof kc0) == false) goto L9;
        return ((kc0) r0).w0 + this.X;
    L9:
        return this.X;
    }

    public final int q() {
        jc0 r0 = this.S;
        if (r0 == null) goto L9;
        if ((r0 instanceof kc0) == false) goto L9;
        return ((kc0) r0).x0 + this.Y;
    L9:
        return this.Y;
    }

    public final boolean r(int r5) {
        if (r5 != 0) goto L16;
        if (this.H.f == null) goto L7;
        int r6 = 1;
    L9:
        if (this.J.f == null) goto L11;
        int r4 = 1;
    L13:
        if ((r6 + r4) < 2) goto L29;
    L30:
        return false;
    L29:
        return true;
    L11:
        r4 = 0;
        goto L13
    L7:
        r6 = 0;
        goto L9
    L16:
        if (this.I.f == null) goto L18;
        int r7 = 1;
    L20:
        if (this.K.f == null) goto L22;
        int r3 = 1;
    L23:
        int r8 = r7 + r3;
        if (this.L.f == null) goto L26;
        int r9 = 1;
    L28:
        if ((r8 + r9) >= 2) goto L30;
    L26:
        r9 = 0;
        goto L28
    L22:
        r3 = 0;
        goto L23
    L18:
        r7 = 0;
        goto L20
    }

    public final boolean s(int r3, int r4) {
        if (r3 != 0) goto L14;
        hb0 r5 = this.H;
        hb0 r0 = r5.f;
        if (r0 != null) goto L6;
        return false;
    L6:
        if (r0.c == false) goto L29;
        hb0 r2 = this.J;
        hb0 r1 = r2.f;
        if (r1 != null) goto L10;
        return false;
    L10:
        if (r1.c == false) goto L31;
        int r6 = r1.c() - r2.d();
        int r7 = r5.f.c();
        if ((r6 - (r5.d() + r7)) < r4) goto L32;
        return true;
    L32:
        return false;
    L31:
        return false;
    L29:
        return false;
    L14:
        hb0 r8 = this.I;
        hb0 r9 = r8.f;
        if (r9 != null) goto L17;
        return false;
    L17:
        if (r9.c == false) goto L34;
        hb0 r10 = this.K;
        hb0 r11 = r10.f;
        if (r11 != null) goto L21;
        return false;
    L21:
        if (r11.c == false) goto L36;
        int r12 = r11.c() - r10.d();
        int r13 = r8.f.c();
        if ((r12 - (r8.d() + r13)) < r4) goto L37;
        return true;
    L37:
        return false;
    L36:
        return false;
    L34:
        return false;
    }

    public final void t(int r1, int r2, int r3, int r4, jc0 r5) {
        g(r1).a(r5.g(r2), r3, r4);
    }

    public String toString() {
        String r0 = "";
        StringBuilder r1 = xa3.i("");
        if (this.g0 == null) goto L5;
        r0 = b11.q(new StringBuilder("id: "), this.g0, " ");
    L5:
        r1.append(r0);
        r1.append("(");
        r1.append(this.X);
        r1.append(", ");
        r1.append(this.Y);
        r1.append(") - (");
        r1.append(this.T);
        r1.append(" x ");
        return f34.i(r1, this.U, ")");
    }

    public final boolean u(int r3) {
        int r4 = r3 * 2;
        hb0[] r2 = this.P;
        hb0 r0 = r2[r4];
        hb0 r1 = r0.f;
        if (r1 != null) goto L5;
        return false;
    L5:
        if (r1.f == r0) goto L13;
        hb0 r5 = r2[r4 + 1];
        hb0 r6 = r5.f;
        if (r6 != null) goto L9;
        return false;
    L9:
        if (r6.f != r5) goto L15;
        return true;
    L15:
        return false;
    L13:
        return false;
    }

    public final boolean v() {
        hb0 r0 = this.H;
        hb0 r1 = r0.f;
        if (r1 != null) goto L5;
    L6:
        hb0 r2 = this.J;
        hb0 r3 = r2.f;
        if (r3 != null) goto L9;
        return false;
    L9:
        if (r3.f != r2) goto L15;
        return true;
    L15:
        return false;
    L5:
        if (r1.f != r0) goto L6;
        return true;
    }

    public final boolean w() {
        hb0 r0 = this.I;
        hb0 r1 = r0.f;
        if (r1 != null) goto L5;
    L6:
        hb0 r2 = this.K;
        hb0 r3 = r2.f;
        if (r3 != null) goto L9;
        return false;
    L9:
        if (r3.f != r2) goto L15;
        return true;
    L15:
        return false;
    L5:
        if (r1.f != r0) goto L6;
        return true;
    }

    public final boolean x() {
        if (this.g == true) goto L5;
        return false;
    L5:
        if (this.f0 == 8) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean y() {
        if (this.k == false) goto L5;
        return true;
    L5:
        if (this.H.c == true) goto L7;
        return false;
    L7:
        if (this.J.c == true) goto L14;
        return false;
    L14:
        return true;
    }

    public boolean z() {
        if (this.l == false) goto L5;
        return true;
    L5:
        if (this.I.c == true) goto L7;
        return false;
    L7:
        if (this.K.c == true) goto L14;
        return false;
    L14:
        return true;
    }
}
