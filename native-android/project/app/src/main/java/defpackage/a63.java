package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a63 extends i63 {
    public final cx2 c;
    public final te2 d;
    public final xe2 e;
    public f63 f;
    public kn3 g;
    public boolean h;
    public boolean i;
    public boolean j;

    public a63(cx2 r3) {
        this.c = r3;
        te2 r4 = new te2();
        r4.c = new long[2];
        this.d = r4;
        this.e = new xe2(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [cx2] */
    /* JADX WARN: Type inference failed for: r5v1, types: [cx2] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39, types: [cx2] */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [f13] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22, types: [f13] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    @Override // defpackage.i63
    public final boolean a(xe2 r56, q62 r57, gp3 r58, boolean r59) {
        boolean r4 = super.a(r56, r57, r58, r59);
        ?? r5 = this.c;
        boolean r7 = true;
        if (r5.A == false) goto L32;
        ?? r8 = 0;
    L6:
        if (r5 == 0) goto L31;
        if ((r5 instanceof rn3) == true) goto L9;
        if ((r5.p & 16) == 0) goto L29;
        if ((r5 instanceof fo0) == false) goto L29;
        cx2 r10 = ((fo0) r5).C;
        int r9 = 0;
        r5 = r5;
        r8 = r8;
    L15:
        if (r10 == null) goto L27;
        if ((r10.p & 16) == 0) goto L26;
        r9 = r9 + 1;
        r8 = r8;
        if (r9 != 1) goto L21;
        r5 = r10;
        goto L26
    L21:
        if (r8 != 0) goto L23;
        r8 = new f13(new cx2[16]);
    L23:
        if (r5 == 0) goto L25;
        r8.b(r5);
        r5 = 0;
    L25:
        r8.b(r10);
    L26:
        r10 = r10.s;
        r5 = r5;
        r8 = r8;
        goto L15
    L27:
        if (r9 == 1) goto L6;
    L29:
        r5 = j51.c(r8);
        goto L6
    L9:
        this.f = j51.M((rn3) r5, 16);
        goto L29
    L31:
        if (this.f == null) goto L32;
        int r6 = r56.h();
        int r11 = 0;
    L34:
        te2 r12 = this.d;
        xe2 r13 = this.e;
        if (r11 >= r6) goto L60;
        long r14 = r56.e(r11);
        on3 r15 = (on3) r56.i(r11);
        if (r12.c(r14) == false) goto L58;
        boolean r16 = r7;
        long r17 = r15.g;
        long r18 = r15.c;
        if ((((r17 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) goto L41;
    L57:
        boolean r19 = r16;
    L59:
        r11 = r11 + 1;
        r7 = r19;
        r6 = r6;
        r4 = r4;
        goto L34
    L41:
        if ((((r18 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) != 0) goto L57;
        r19 = r16;
        ArrayList r110 = new ArrayList(r15.b().size());
        List r20 = r15.b();
        int r21 = r20.size();
        int r22 = 0;
    L43:
        if (r22 >= r21) goto L49;
        List r27 = r20;
        bm1 r23 = (bm1) r20.get(r22);
        xe2 r51 = r13;
        long r52 = r14;
        long r111 = r23.b;
        if ((((r111 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) != 0) goto L48;
        long r112 = r23.a;
        f63 r24 = this.f;
        r24.getClass();
        r110.add(new bm1(r112, r24.A(r57, r111), r23.c, r23.d, r23.e));
    L48:
        r22 = r22 + 1;
        r21 = r21;
        r20 = r27;
        r13 = r51;
        r14 = r52;
        r15 = r15;
        goto L43
    L49:
        xe2 r53 = r13;
        long r54 = r14;
        f63 r25 = this.f;
        r25.getClass();
        long r37 = r25.A(r57, r17);
        f63 r26 = this.f;
        r26.getClass();
        long r31 = r26.A(r57, r18);
        on3 r28 = new on3(r15.a, r15.b, r31, r15.d, r15.e, r15.f, r37, r15.h, r15.i, r110, r15.j, r15.k, r15.l, r15.n);
        on3 r29 = r15.q;
        if (r29 != null) goto L52;
        r29 = r15;
    L52:
        r28.q = r29;
        on3 r30 = r15.q;
        if (r30 == null) goto L56;
        r15 = r30;
    L56:
        r28.q = r15;
        r53.f(r54, r28);
        goto L59
    L58:
        r19 = r7;
        goto L59
    L60:
        boolean r49 = r4;
        boolean r113 = r7;
        if (r13.d() == false) goto L64;
        r12.b = 0;
        this.a.g();
        return r113;
    L64:
        int r2 = r12.b;
    L65:
        r2 = r2 - 1;
        if ((-1) >= r2) goto L77;
        if (r56.c(r12.c[r2]) >= 0) goto L65;
        int r32 = r12.b;
        if (r2 >= r32) goto L65;
        int r33 = r32 - 1;
        int r34 = r2;
    L73:
        if (r34 >= r33) goto L75;
        long[] r35 = r12.c;
        int r36 = r34 + 1;
        r35[r34] = r35[r36];
        r34 = r36;
        goto L73
    L75:
        r12.b--;
        goto L65
    L77:
        ArrayList r1 = new ArrayList(r13.h());
        int r3 = r13.h();
        int r38 = 0;
    L78:
        if (r38 >= r3) goto L80;
        r1.add(r13.i(r38));
        r38 = r38 + 1;
        goto L78
    L80:
        kn3 r39 = new kn3(r1, r58);
        int r40 = r1.size();
        int r41 = 0;
    L81:
        if (r41 >= r40) goto L86;
        Object r42 = r1.get(r41);
        if (r58.c(((on3) r42).a) == true) goto L87;
        r41 = r41 + 1;
    L87:
        on3 r43 = (on3) r42;
        if (r43 == null) goto L135;
        boolean r44 = r43.d;
        if (r59 == true) goto L92;
        boolean r45 = false;
        this.i = false;
    L114:
        boolean r46 = this.i;
        boolean r47 = this.h;
        int r48 = 5;
        if (r46 == r47) goto L125;
        int r50 = r39.c;
        if (r50 == 3) goto L122;
        if (r50 == 4) goto L122;
        if (r50 != 5) goto L125;
    L122:
        if (r46 == false) goto L124;
        r48 = 4;
    L124:
        r39.c = r48;
    L136:
        if (r49 == false) goto L138;
    L151:
        boolean r55 = r113;
    L152:
        this.g = r39;
        return r55;
    L138:
        if (r39.c != 3) goto L151;
        kn3 r60 = this.g;
        if (r60 == null) goto L151;
        ?? r61 = r60.a;
        int r62 = r61.size();
        ?? r63 = r39.a;
        if (r62 != r63.size()) goto L151;
        int r64 = r63.size();
        ?? r65 = r45;
    L145:
        if (r65 >= r64) goto L150;
        if (g83.b(((on3) r61.get(r65)).c, ((on3) r63.get(r65)).c) == false) goto L151;
        r65 = r65 + 1;
        goto L145
    L150:
        r55 = r45;
    L125:
        int r66 = r39.c;
        if (r66 != 4) goto L131;
        if (r47 == false) goto L131;
        if (this.j == true) goto L131;
        r39.c = 3;
    L131:
        if (r66 != 5) goto L136;
        if (r46 == false) goto L136;
        if (r44 == false) goto L136;
        r39.c = 3;
        goto L136
    L92:
        r45 = false;
        if (this.i == true) goto L114;
        if (r44 == false) goto L96;
    L97:
        f63 r67 = this.f;
        r67.getClass();
        long r68 = r67.p;
        long r69 = r43.c;
        float r114 = Float.intBitsToFloat((int) (r69 >> 32));
        float r70 = Float.intBitsToFloat((int) (r69 & 4294967295L));
        int r71 = (int) (r68 >> 32);
        int r72 = (int) (r68 & 4294967295L);
        if (r114 >= 0.0f) goto L100;
        boolean r73 = r113;
    L102:
        if (r114 <= r71) goto L104;
        boolean r74 = r113;
    L105:
        boolean r75 = r74 | r73;
        if (r70 >= 0.0f) goto L108;
        boolean r76 = r113;
    L109:
        boolean r77 = r75 | r76;
        if (r70 <= r72) goto L112;
        boolean r78 = r113;
    L113:
        this.i = !(r78 | r77);
        goto L114
    L112:
        r78 = false;
        goto L113
    L108:
        r76 = false;
        goto L109
    L104:
        r74 = false;
        goto L105
    L100:
        r73 = false;
        goto L102
    L96:
        if (r43.h == false) goto L114;
    L135:
        r45 = false;
        goto L136
    L86:
        r42 = null;
    L32:
        return true;
    }

    @Override // defpackage.i63
    public final void b(gp3 r11) {
        super.b(r11);
        kn3 r0 = this.g;
        if (r0 != null) goto L5;
        return;
    L5:
        this.h = this.i;
        List r1 = r0.a;
        int r2 = r1.size();
        boolean r3 = false;
        int r4 = 0;
    L6:
        if (r4 >= r2) goto L14;
        on3 r5 = (on3) r1.get(r4);
        boolean r6 = r5.d;
        long r7 = r5.a;
        boolean r8 = r11.c(r7);
        boolean r9 = this.i;
        if (r6 == true) goto L10;
        if (r8 == true) goto L10;
    L12:
        this.d.e(r7);
    L13:
        r4 = r4 + 1;
    L10:
        if (r6 == true) goto L13;
        if (r9 == true) goto L13;
    L14:
        this.i = false;
        if (r0.c != 5) goto L17;
        r3 = true;
    L17:
        this.j = r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [f13] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [f13] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r8v1, types: [cx2] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [cx2] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [cx2] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void c() {
        f13 r0 = this.a;
        Object[] r1 = r0.n;
        int r2 = r0.p;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L5;
        ((a63) r1[r3]).c();
        r3 = r3 + 1;
        goto L3
    L5:
        ?? r8 = this.c;
        ?? r4 = 0;
    L6:
        if (r8 == 0) goto L31;
        if ((r8 instanceof rn3) == true) goto L9;
        if ((r8.p & 16) == 0) goto L30;
        if ((r8 instanceof fo0) == false) goto L30;
        cx2 r5 = ((fo0) r8).C;
        int r6 = 0;
        r4 = r4;
        r8 = r8;
    L16:
        if (r5 == null) goto L28;
        if ((r5.p & 16) == 0) goto L27;
        r6 = r6 + 1;
        r4 = r4;
        if (r6 != 1) goto L22;
        r8 = r5;
        goto L27
    L22:
        if (r4 != 0) goto L24;
        r4 = new f13(new cx2[16]);
    L24:
        if (r8 == 0) goto L26;
        r4.b(r8);
        r8 = 0;
    L26:
        r4.b(r5);
    L27:
        r5 = r5.s;
        r4 = r4;
        r8 = r8;
        goto L16
    L28:
        if (r6 == 1) goto L6;
    L30:
        r8 = j51.c(r4);
        goto L6
    L9:
        ((rn3) r8).t();
        goto L30
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [cx2] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [cx2] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
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
    public final boolean d(gp3 r15) {
        xe2 r0 = this.e;
        boolean r3 = false;
        int r4 = 0;
        r3 = false;
        r3 = false;
        if (r0.d() == true) goto L48;
        cx2 r1 = this.c;
        if (r1.A == false) goto L48;
        f63 r5 = r1.u;
        if (r5 == null) goto L13;
        c72 r6 = r5.H;
        if (r6 == null) goto L13;
        boolean r7 = r6.H();
    L14:
        if (r7 == false) goto L48;
        kn3 r8 = this.g;
        r8.getClass();
        f63 r9 = this.f;
        r9.getClass();
        long r10 = r9.p;
        ?? r11 = r1;
        ?? r12 = 0;
    L18:
        if (r11 == 0) goto L43;
        if ((r11 instanceof rn3) == true) goto L21;
        if ((r11.p & 16) == 0) goto L41;
        if ((r11 instanceof fo0) == false) goto L41;
        cx2 r13 = ((fo0) r11).C;
        int r14 = 0;
        r11 = r11;
        r12 = r12;
    L27:
        if (r13 == null) goto L39;
        if ((r13.p & 16) == 0) goto L38;
        r14 = r14 + 1;
        r12 = r12;
        if (r14 != 1) goto L33;
        r11 = r13;
        goto L38
    L33:
        if (r12 != 0) goto L35;
        r12 = new f13(new cx2[16]);
    L35:
        if (r11 == 0) goto L37;
        r12.b(r11);
        r11 = 0;
    L37:
        r12.b(r13);
    L38:
        r13 = r13.s;
        r11 = r11;
        r12 = r12;
        goto L27
    L39:
        if (r14 == 1) goto L18;
    L41:
        r11 = j51.c(r12);
        goto L18
    L21:
        ((rn3) r11).n(r8, ln3.p, r10);
        goto L41
    L43:
        if (r1.A == false) goto L47;
        f13 r2 = this.a;
        Object[] r16 = r2.n;
        int r17 = r2.p;
    L45:
        if (r4 >= r17) goto L47;
        ((a63) r16[r4]).d(r15);
        r4 = r4 + 1;
    L47:
        r3 = true;
    L13:
        r7 = false;
    L48:
        b(r15);
        r0.a();
        this.f = null;
        return r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [cx2] */
    /* JADX WARN: Type inference failed for: r0v3, types: [cx2] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [cx2] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [f13] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [f13] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [cx2] */
    /* JADX WARN: Type inference failed for: r6v10, types: [cx2] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [f13] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [f13] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(gp3 r14, boolean r15) {
        if (this.e.d() == true) goto L15;
        ?? r0 = this.c;
        if (r0.A == false) goto L15;
        f63 r2 = r0.u;
        if (r2 == null) goto L13;
        c72 r3 = r2.H;
        if (r3 == null) goto L13;
        boolean r4 = r3.H();
    L14:
        if (r4 == false) goto L15;
        kn3 r5 = this.g;
        r5.getClass();
        f63 r6 = this.f;
        r6.getClass();
        long r7 = r6.p;
        ?? r8 = r0;
        ?? r9 = 0;
    L18:
        if (r8 == 0) goto L43;
        if ((r8 instanceof rn3) == true) goto L21;
        if ((r8.p & 16) == 0) goto L41;
        if ((r8 instanceof fo0) == false) goto L41;
        cx2 r10 = ((fo0) r8).C;
        int r11 = 0;
        r8 = r8;
        r9 = r9;
    L27:
        if (r10 == null) goto L39;
        if ((r10.p & 16) == 0) goto L38;
        r11 = r11 + 1;
        r9 = r9;
        if (r11 != 1) goto L33;
        r8 = r10;
        goto L38
    L33:
        if (r9 != 0) goto L35;
        r9 = new f13(new cx2[16]);
    L35:
        if (r8 == 0) goto L37;
        r9.b(r8);
        r8 = 0;
    L37:
        r9.b(r10);
    L38:
        r10 = r10.s;
        r8 = r8;
        r9 = r9;
        goto L27
    L39:
        if (r11 == 1) goto L18;
    L41:
        r8 = j51.c(r9);
        goto L18
    L21:
        ((rn3) r8).n(r5, ln3.n, r7);
        goto L41
    L43:
        if (r0.A == false) goto L48;
        f13 r12 = this.a;
        Object[] r13 = r12.n;
        int r16 = r12.p;
        int r17 = 0;
    L45:
        if (r17 >= r16) goto L48;
        a63 r18 = (a63) r13[r17];
        this.f.getClass();
        r18.e(r14, r15);
        r17 = r17 + 1;
    L48:
        if (r0.A == false) goto L74;
        ?? r19 = 0;
    L50:
        if (r0 == 0) goto L74;
        if ((r0 instanceof rn3) == true) goto L53;
        if ((r0.p & 16) == 0) goto L73;
        if ((r0 instanceof fo0) == false) goto L73;
        cx2 r110 = ((fo0) r0).C;
        int r111 = 0;
        r0 = r0;
        r19 = r19;
    L59:
        if (r110 == null) goto L71;
        if ((r110.p & 16) == 0) goto L70;
        r111 = r111 + 1;
        r19 = r19;
        if (r111 != 1) goto L65;
        r0 = r110;
        goto L70
    L65:
        if (r19 != 0) goto L67;
        r19 = new f13(new cx2[16]);
    L67:
        if (r0 == 0) goto L69;
        r19.b(r0);
        r0 = 0;
    L69:
        r19.b(r110);
    L70:
        r110 = r110.s;
        r0 = r0;
        r19 = r19;
        goto L59
    L71:
        if (r111 == 1) goto L50;
    L73:
        r0 = j51.c(r19);
        goto L50
    L53:
        ((rn3) r0).n(r5, ln3.o, r7);
    L74:
        return true;
    L13:
        r4 = false;
    L15:
        return false;
    }

    public final void f(long r4, q03 r6) {
        te2 r0 = this.d;
        if (r0.c(r4) == true) goto L5;
    L8:
        f13 r3 = this.a;
        Object[] r1 = r3.n;
        int r5 = r3.p;
        int r2 = 0;
    L9:
        if (r2 >= r5) goto L11;
        ((a63) r1[r2]).f(r4, r6);
        r2 = r2 + 1;
        goto L9
    L11:
        return;
    L5:
        if (r6.g(this) >= 0) goto L8;
        r0.e(r4);
        this.e.g(r4);
        goto L8
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ")";
    }
}
