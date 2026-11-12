package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xo0 {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public Object d;
    public Object e;
    public Serializable f;
    public Serializable g;
    public Object h;
    public Object i;

    public xo0(boolean r2, boolean r3, ge3 r4, Long r5, Long r6, Long r7, Long r8, Map r9) {
        this.a = 1;
        r9.getClass();
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = r7;
        this.h = r8;
        this.i = lg2.a0(r9);
    }

    public void a(yo0 r10, int r11, ArrayList r12, v34 r13) {
        ba5 r14 = r10.d;
        v34 r0 = r14.c;
        yo0 r1 = r14.i;
        yo0 r2 = r14.h;
        if (r0 != null) goto L42;
        kc0 r3 = (kc0) this.d;
        if (r14 != r3.d) goto L7;
        return;
    L7:
        if (r14 == r3.e) goto L64;
        if (r13 != null) goto L11;
        r13 = new v34();
        r13.a = null;
        r13.b = new ArrayList();
        r13.a = r14;
        r12.add(r13);
    L11:
        r14.c = r13;
        r13.b.add(r14);
        ArrayList r4 = r2.k;
        int r5 = r4.size();
        int r6 = 0;
        int r7 = 0;
    L12:
        if (r7 >= r5) goto L16;
        Object r8 = r4.get(r7);
        r7 = r7 + 1;
        uo0 r9 = (uo0) r8;
        if ((r9 instanceof yo0) == false) goto L12;
        a((yo0) r9, r11, r12, r13);
        goto L12
    L16:
        ArrayList r15 = r1.k;
        int r16 = r15.size();
        int r17 = 0;
    L17:
        if (r17 >= r16) goto L22;
        Object r18 = r15.get(r17);
        r17 = r17 + 1;
        uo0 r19 = (uo0) r18;
        if ((r19 instanceof yo0) == false) goto L17;
        a((yo0) r19, r11, r12, r13);
        goto L17
    L22:
        if (r11 == 1) goto L24;
    L30:
        ArrayList r20 = r2.l;
        int r21 = r20.size();
        int r22 = 0;
    L31:
        if (r22 >= r21) goto L33;
        Object r23 = r20.get(r22);
        r22 = r22 + 1;
        a((yo0) r23, r11, r12, r13);
        goto L31
    L33:
        ArrayList r24 = r1.l;
        int r25 = r24.size();
        int r26 = 0;
    L34:
        if (r26 >= r25) goto L36;
        Object r27 = r24.get(r26);
        r26 = r26 + 1;
        a((yo0) r27, r11, r12, r13);
        goto L34
    L36:
        if (r11 == 1) goto L38;
        return;
    L38:
        if ((r14 instanceof w45) == false) goto L63;
        ArrayList r110 = ((w45) r14).k.l;
        int r28 = r110.size();
    L40:
        if (r6 >= r28) goto L65;
        Object r29 = r110.get(r6);
        r6 = r6 + 1;
        a((yo0) r29, r11, r12, r13);
        goto L40
    L65:
        return;
    L63:
        return;
    L24:
        if ((r14 instanceof w45) == false) goto L30;
        ArrayList r30 = ((w45) r14).k.k;
        int r31 = r30.size();
        int r32 = 0;
    L26:
        if (r32 >= r31) goto L30;
        Object r33 = r30.get(r32);
        r32 = r32 + 1;
        uo0 r34 = (uo0) r33;
        if ((r34 instanceof yo0) == false) goto L26;
        a((yo0) r34, r11, r12, r13);
        goto L26
    L64:
        return;
    }

    public void b(kc0 r25) {
        ArrayList r1 = r25.p0;
        int[] r2 = r25.o0;
        int r3 = r1.size();
        char r4 = 0;
        int r5 = 0;
    L3:
        if (r5 >= r3) goto L158;
        Object r6 = r1.get(r5);
        r5 = r5 + 1;
        jc0 r12 = (jc0) r6;
        int[] r7 = r12.o0;
        hb0[] r8 = r12.P;
        hb0 r9 = r12.K;
        hb0 r10 = r12.I;
        hb0 r11 = r12.J;
        hb0 r13 = r12.H;
        int r14 = r7[r4];
        int r15 = r7[1];
        r4 = r4;
        if (r12.f0 == 8) goto L6;
        float r16 = r12.w;
        if (r16 >= 1.0f) goto L11;
        if (r14 != 3) goto L11;
        r12.r = 2;
    L11:
        float r17 = r12.z;
        if (r17 >= 1.0f) goto L16;
        if (r15 != 3) goto L16;
        r12.s = 2;
    L16:
        if (r12.V > 0.0f) goto L18;
        int r0 = 3;
    L40:
        if (r14 != r0) goto L49;
        if (r12.r != 1) goto L49;
        if (r13.f != null) goto L46;
    L47:
        r14 = 2;
        goto L49
    L46:
        if (r11.f == null) goto L47;
    L49:
        if (r15 == 3) goto L51;
    L57:
        up1 r18 = r12.d;
        r18.d = r14;
        int r19 = r12.r;
        r18.a = r19;
        w45 r20 = r12.e;
        r20.d = r15;
        ArrayList r22 = r1;
        int r21 = r12.s;
        r20.a = r21;
        if (r14 == 4) goto L64;
        if (r14 == 1) goto L64;
        int r23 = 2;
        if (r14 == 2) goto L64;
    L71:
        if (r14 != 3) goto L100;
        if (r15 != r23) goto L74;
    L77:
        if (r19 != 3) goto L82;
        if (r15 != r23) goto L80;
        f(r23, 0, r23, 0, r12);
    L80:
        int r110 = r12.i();
        f(1, (int) ((r110 * r12.V) + 0.5f), 1, r110, r12);
        r12.d.e.d(r12.o());
        r12.e.e.d(r12.i());
        r12.a = true;
    L81:
        r1 = r22;
        goto L3
    L82:
        int r24 = r23;
        if (r19 != 1) goto L86;
        f(r24, 0, r15, 0, r12);
        r12.d.e.m = r12.o();
        goto L81
    L86:
        if (r19 != 2) goto L95;
        int r26 = r2[r4];
        if (r26 != 1) goto L90;
    L94:
        f(1, (int) ((r16 * r25.o()) + 0.5f), r15, r12.i(), r12);
        r12.d.e.d(r12.o());
        r12.e.e.d(r12.i());
        r12.a = true;
        goto L81
    L90:
        if (r26 == 4) goto L94;
        int r111 = r15;
        int r27 = 1;
    L93:
        int r28 = 3;
    L101:
        if (r111 != r28) goto L134;
        if (r14 == r24) goto L107;
        if (r14 == r27) goto L107;
        int r29 = r28;
        int r30 = r14;
        int r112 = r24;
    L106:
        r27 = r27;
        int r31 = 1;
    L135:
        if (r30 != r29) goto L81;
        if (r111 != r29) goto L81;
        if (r19 == r31) goto L148;
        if (r21 == r31) goto L148;
        if (r21 != 2) goto L81;
        if (r19 != 2) goto L81;
        if (r2[r4] != r27) goto L81;
        if (r2[r31] != r27) goto L81;
        f(r27, (int) ((r16 * r25.o()) + 0.5f), r27, (int) ((r17 * r25.i()) + 0.5f), r12);
        r12.d.e.d(r12.o());
        r12.e.e.d(r12.i());
        r12.a = true;
    L148:
        f(r112, 0, r112, 0, r12);
        r12.d.e.m = r12.o();
        r12.e.e.m = r12.i();
    L107:
        if (r21 != r28) goto L115;
        if (r14 != r24) goto L110;
        f(r24, 0, r24, 0, r12);
    L110:
        int r32 = r12.o();
        float r33 = r12.V;
        if (r12.W != (-1)) goto L113;
        r33 = 1.0f / r33;
    L113:
        int r34 = r27;
        f(r34, r32, r27, (int) ((r32 * r33) + 0.5f), r12);
        r12.d.e.d(r12.o());
        r12.e.e.d(r12.i());
        r12.a = true;
        goto L81
    L115:
        if (r21 != 1) goto L117;
        f(r14, 0, r24, 0, r12);
        r12.e.e.m = r12.i();
        goto L81
    L117:
        int r113 = r24;
        int r35 = r14;
        if (r21 != 2) goto L126;
        int r36 = r2[1];
        if (r36 != r27) goto L122;
    L125:
        f(r35, r12.o(), r27, (int) ((r17 * r25.i()) + 0.5f), r12);
        r12.d.e.d(r12.o());
        r12.e.e.d(r12.i());
        r12.a = true;
        goto L81
    L122:
        if (r36 == 4) goto L125;
        r30 = r35;
        r112 = r113;
        r29 = 3;
        goto L106
    L126:
        r30 = r35;
        if (r8[2].f != null) goto L129;
    L133:
        f(r113, 0, r111, 0, r12);
        r12.d.e.d(r12.o());
        r12.e.e.d(r12.i());
        r12.a = true;
        goto L81
    L129:
        if (r8[3].f == null) goto L133;
        r112 = r113;
    L132:
        r31 = 1;
        r29 = 3;
        goto L135
    L134:
        r30 = r14;
        r112 = r24;
        goto L132
    L95:
        r111 = r15;
        r27 = 1;
        if (r8[r4].f != null) goto L98;
    L99:
        f(r24, 0, r111, 0, r12);
        r12.d.e.d(r12.o());
        r12.e.e.d(r12.i());
        r12.a = true;
        goto L81
    L98:
        if (r8[1].f != null) goto L93;
    L74:
        if (r15 == 1) goto L77;
        r24 = r23;
        r28 = 3;
        r111 = r15;
        r27 = 1;
        goto L101
    L100:
        r24 = r23;
        r111 = r15;
        r27 = 1;
    L64:
        if (r15 != 4) goto L66;
    L69:
        int r210 = 1;
    L150:
        int r37 = r12.o();
        if (r14 != 4) goto L153;
        r37 = (r25.o() - r13.g) - r11.g;
        r14 = r210;
    L153:
        int r38 = r12.i();
        if (r15 != 4) goto L156;
        int r114 = r210;
        int r115 = (r25.i() - r10.g) - r9.g;
    L157:
        f(r14, r37, r114, r115, r12);
        r12.d.e.d(r12.o());
        r12.e.e.d(r12.i());
        r12.a = true;
        goto L81
    L156:
        r114 = r15;
        r115 = r38;
        goto L157
    L66:
        if (r15 == 1) goto L149;
        r23 = 2;
        if (r15 != 2) goto L71;
    L149:
        r210 = 1;
        goto L150
    L51:
        if (r12.s != 1) goto L57;
        if (r10.f != null) goto L55;
    L56:
        r15 = 2;
        goto L57
    L55:
        if (r9.f != null) goto L57;
    L18:
        if (r14 != 3) goto L25;
        int r116 = 2;
        if (r15 == 2) goto L22;
        if (r15 == 1) goto L22;
        r0 = 3;
    L26:
        if (r15 != r0) goto L31;
        if (r14 != r116) goto L29;
    L30:
        r12.s = r0;
        goto L40
    L29:
        if (r14 == 1) goto L30;
    L31:
        if (r14 != r0) goto L40;
        if (r15 != r0) goto L40;
        if (r12.r != 0) goto L37;
        r12.r = r0;
    L37:
        if (r12.s != 0) goto L40;
        r12.s = r0;
    L22:
        r0 = 3;
        r12.r = 3;
        goto L40
    L25:
        r0 = 3;
        r116 = 2;
        goto L26
    L6:
        r12.a = true;
        goto L3
    }

    public void c() {
        kc0 r0 = (kc0) this.d;
        ArrayList r1 = (ArrayList) this.g;
        ArrayList r2 = (ArrayList) this.f;
        r2.clear();
        kc0 r3 = (kc0) this.e;
        r3.d.f();
        r3.e.f();
        r2.add(r3.d);
        r2.add(r3.e);
        ArrayList r4 = r3.p0;
        int r5 = r4.size();
        HashSet r6 = null;
        int r8 = 0;
    L4:
        if (r8 >= r5) goto L29;
        Object r10 = r4.get(r8);
        r8 = r8 + 1;
        jc0 r11 = (jc0) r10;
        if ((r11 instanceof pk1) == true) goto L7;
        if (r11.v() == true) goto L11;
        r2.add(r11.d);
    L18:
        if (r11.w() == true) goto L20;
        r2.add(r11.e);
    L27:
        if ((r11 instanceof ep) == false) goto L4;
        r2.add(new yl1(r11));
        goto L4
    L20:
        if (r11.c != null) goto L22;
        r11.c = new q00(r11, 1);
    L22:
        if (r6 != null) goto L24;
        r6 = new HashSet();
    L24:
        r6.add(r11.c);
        goto L27
    L11:
        if (r11.b != null) goto L13;
        r11.b = new q00(r11, 0);
    L13:
        if (r6 != null) goto L15;
        r6 = new HashSet();
    L15:
        r6.add(r11.b);
        goto L18
    L7:
        qk1 r9 = new qk1(r11);
        r11.d.f();
        r11.e.f();
        r9.f = ((pk1) r11).t0;
        r2.add(r9);
        goto L4
    L29:
        if (r6 == null) goto L31;
        r2.addAll(r6);
    L31:
        int r7 = r2.size();
        int r12 = 0;
    L32:
        if (r12 >= r7) goto L34;
        Object r13 = r2.get(r12);
        r12 = r12 + 1;
        ((ba5) r13).f();
        goto L32
    L34:
        int r14 = r2.size();
        int r15 = 0;
    L35:
        if (r15 >= r14) goto L40;
        Object r16 = r2.get(r15);
        r15 = r15 + 1;
        ba5 r17 = (ba5) r16;
        if (r17.b == r3) goto L35;
        r17.d();
        goto L35
    L40:
        r1.clear();
        e(r0.d, 0, r1);
        e(r0.e, 1, r1);
        this.b = false;
    }

    public int d(kc0 r18, int r19) {
        ArrayList r1 = (ArrayList) this.g;
        int r3 = r1.size();
        long r4 = 0;
        int r6 = 0;
        long r7 = 0;
    L3:
        if (r6 >= r3) goto L53;
        ba5 r9 = ((v34) r1.get(r6)).a;
        if ((r9 instanceof q00) == true) goto L7;
        if (r19 != 0) goto L14;
        if ((r9 instanceof up1) == false) goto L8;
    L16:
        if (r19 != 0) goto L19;
        ba5 r10 = r18.d;
    L18:
        yo0 r11 = r10.h;
        if (r19 != 0) goto L23;
        ba5 r12 = r18.d;
    L22:
        yo0 r13 = r12.i;
        yo0 r14 = r9.h;
        yo0 r15 = r9.i;
        boolean r16 = r14.l.contains(r11);
        boolean r17 = r15.l.contains(r13);
        long r110 = r9.j();
        if (r16 == false) goto L45;
        if (r17 == false) goto L45;
        long r111 = v34.b(r14, r4);
        ArrayList r112 = r1;
        long r0 = v34.a(r15, r4);
        long r113 = r111 - r110;
        int r5 = r15.f;
        int r114 = r6;
        if (r113 < (-r5)) goto L30;
        r113 = r113 + ((long) r5);
    L30:
        long r8 = r14.f;
        long r2 = ((-r0) - r110) - r8;
        if (r2 < r8) goto L33;
        r2 = r2 - r8;
    L33:
        jc0 r20 = r9.b;
        if (r19 != 0) goto L37;
        float r21 = r20.c0;
    L41:
        if (r21 <= 0.0f) goto L43;
        long r22 = (long) ((r113 / (1.0f - r21)) + (r2 / r21));
    L44:
        float r23 = r22;
        long r24 = (((long) r14.f) + ((((long) ((r23 * r21) + 0.5f)) + r110) + ((long) xa3.a(1.0f, r21, r23, 0.5f)))) - ((long) r15.f);
    L51:
        r7 = Math.max(r7, r24);
        r6 = r114 + 1;
        r1 = r112;
        r4 = 0;
        goto L3
    L43:
        r22 = 0;
        goto L44
    L37:
        if (r19 != 1) goto L39;
        r21 = r20.d0;
        goto L41
    L39:
        r20.getClass();
        r21 = -1.0f;
    L45:
        r112 = r1;
        r114 = r6;
        if (r16 == false) goto L48;
        r24 = Math.max(v34.b(r14, r14.f), ((long) r14.f) + r110);
        goto L51
    L48:
        if (r17 == false) goto L50;
        r24 = Math.max(-v34.a(r15, r15.f), ((long) (-r15.f)) + r110);
        goto L51
    L50:
        r24 = (r9.j() + r14.f) - ((long) r15.f);
        goto L51
    L23:
        r12 = r18.e;
        goto L22
    L19:
        r10 = r18.e;
    L8:
        r112 = r1;
        r24 = r4;
        r114 = r6;
        goto L51
    L14:
        if ((r9 instanceof w45) == true) goto L16;
    L7:
        if (((q00) r9).f == r19) goto L16;
    L53:
        return (int) r7;
    }

    public void e(ba5 r9, int r10, ArrayList r11) {
        yo0 r0 = r9.h;
        yo0 r1 = r9.i;
        ArrayList r2 = r0.k;
        int r3 = r2.size();
        int r4 = 0;
        int r5 = 0;
    L4:
        if (r5 >= r3) goto L11;
        Object r6 = r2.get(r5);
        r5 = r5 + 1;
        uo0 r7 = (uo0) r6;
        if ((r7 instanceof yo0) == true) goto L7;
        if ((r7 instanceof ba5) == false) goto L4;
        a(((ba5) r7).h, r10, r11, null);
        goto L4
    L7:
        a((yo0) r7, r10, r11, null);
        goto L4
    L11:
        ArrayList r8 = r1.k;
        int r12 = r8.size();
        int r13 = 0;
    L12:
        if (r13 >= r12) goto L20;
        Object r14 = r8.get(r13);
        r13 = r13 + 1;
        uo0 r15 = (uo0) r14;
        if ((r15 instanceof yo0) == true) goto L15;
        if ((r15 instanceof ba5) == false) goto L12;
        a(((ba5) r15).i, r10, r11, null);
        goto L12
    L15:
        a((yo0) r15, r10, r11, null);
        goto L12
    L20:
        if (r10 != 1) goto L26;
        ArrayList r16 = ((w45) r9).k.k;
        int r17 = r16.size();
    L22:
        if (r4 >= r17) goto L48;
        Object r18 = r16.get(r4);
        r4 = r4 + 1;
        uo0 r19 = (uo0) r18;
        if ((r19 instanceof yo0) == false) goto L22;
        a((yo0) r19, r10, r11, null);
        goto L22
    L48:
        return;
    }

    public void f(int r2, int r3, int r4, int r5, jc0 r6) {
        kr r0 = (kr) this.i;
        r0.a = r2;
        r0.b = r4;
        r0.c = r3;
        r0.d = r5;
        ((nr3) this.h).d(r6, r0);
        r6.K(r0.e);
        r6.H(r0.f);
        r6.E = r0.h;
        int r1 = r0.g;
        r6.Z = r1;
        if (r1 <= 0) goto L5;
        boolean r7 = true;
    L6:
        r6.E = r7;
        return;
    L5:
        r7 = false;
        goto L6
    }

    public void g() {
        xo0 r0 = this;
        ArrayList r6 = ((kc0) r0.d).p0;
        int r7 = r6.size();
        int r1 = 0;
    L3:
        if (r1 >= r7) goto L43;
        int r9 = r1 + 1;
        jc0 r5 = (jc0) r6.get(r1);
        if (r5.a == true) goto L6;
        int[] r2 = r5.o0;
        int r10 = r2[0];
        int r12 = r2[1];
        int r3 = r5.r;
        int r4 = r5.s;
        if (r10 == 2) goto L13;
        if (r10 != 3) goto L12;
        if (r3 == 1) goto L13;
    L12:
        boolean r8 = false;
    L14:
        if (r12 == 2) goto L19;
        if (r12 != 3) goto L18;
        if (r4 == 1) goto L19;
    L18:
        boolean r11 = false;
    L20:
        eq0 r13 = r5.d.e;
        boolean r14 = r13.j;
        eq0 r15 = r5.e.e;
        boolean r16 = r15.j;
        boolean r17 = r8;
        if (r14 == false) goto L24;
        if (r16 == false) goto L24;
        r0.f(1, r13.g, 1, r15.g, r5);
        r5.a = true;
    L38:
        if (r5.a == false) goto L42;
        gr r18 = r5.e.l;
        if (r18 == null) goto L42;
        r18.d(r5.Z);
    L42:
        r0 = this;
    L24:
        if (r14 == false) goto L31;
        if (r11 == false) goto L31;
        f(1, r13.g, 2, r15.g, r5);
        w45 r19 = r5.e;
        if (r12 != 3) goto L29;
        r19.e.m = r5.i();
        goto L38
    L29:
        r19.e.d(r5.i());
        r5.a = true;
    L31:
        if (r16 == false) goto L38;
        if (r17 == false) goto L38;
        f(2, r13.g, 1, r15.g, r5);
        up1 r20 = r5.d;
        if (r10 != 3) goto L36;
        r20.e.m = r5.o();
        goto L38
    L36:
        r20.e.d(r5.o());
        r5.a = true;
    L19:
        r11 = true;
    L13:
        r8 = true;
    L6:
        r1 = r9;
        goto L3
    }

    public String toString() {
        switch(this.a) {
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        Map r0 = (Map) this.i;
        Long r1 = (Long) this.h;
        Long r2 = (Long) this.g;
        Long r3 = (Long) this.f;
        Long r4 = (Long) this.e;
        ArrayList r5 = new ArrayList();
        if (this.b == false) goto L10;
        r5.add("isRegularFile");
    L10:
        if (this.c == false) goto L12;
        r5.add("isDirectory");
    L12:
        if (r4 == null) goto L14;
        r5.add("byteCount=" + r4);
    L14:
        if (r3 == null) goto L16;
        r5.add("createdAt=" + r3);
    L16:
        if (r2 == null) goto L18;
        r5.add("lastModifiedAt=" + r2);
    L18:
        if (r1 == null) goto L21;
        r5.add("lastAccessedAt=" + r1);
    L21:
        if (r0.isEmpty() == true) goto L24;
        r5.add("extras=" + r0);
    L24:
        return q40.B0(r5, ", ", "FileMetadata(", ")", null, 56);
    L5:
        return super.toString();
    }

    public /* synthetic */ xo0() {
        this.a = 0;
    }

    public /* synthetic */ xo0(boolean r11, boolean r12, ge3 r13, Long r14, Long r15, Long r16, Long r17) {
        this.a = 1;
        this(r11, r12, r13, r14, r15, r16, r17, v01.n);
    }
}
