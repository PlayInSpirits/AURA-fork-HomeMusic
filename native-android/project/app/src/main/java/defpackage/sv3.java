package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sv3 extends ep4 implements xf1 {
    public List o;
    public List p;
    public List q;
    public x03 r;
    public x03 s;
    public x03 t;
    public Set u;
    public x03 v;
    public int w;
    public /* synthetic */ ed x;
    public final /* synthetic */ tv3 y;

    public sv3(tv3 r1, vd0 r2) {
        this.y = r1;
        super(3, r2);
    }

    public static final void e(tv3 r22, List r23, List r24, List r25, x03 r26, x03 r27, x03 r28, x03 r29) {
        Object r4 = r22.c;
        monitor-enter(r4);
        r23.clear();     // Catch: Throwable -> L7
        r24.clear();     // Catch: Throwable -> L7
        int r5 = r25.size();     // Catch: Throwable -> L7
        int r7 = 0;
    L5:
        if (r7 >= r5) goto L9;
        z80 r9 = (z80) r25.get(r7);     // Catch: Throwable -> L7
        r9.a();     // Catch: Throwable -> L7
        r22.L(r9);     // Catch: Throwable -> L7
        r7 = r7 + 1;     // Catch: Throwable -> L7
        goto L5
    L9:
        r25.clear();     // Catch: Throwable -> L7
        Object[] r6 = r26.b;     // Catch: Throwable -> L7
        long[] r8 = r26.a;     // Catch: Throwable -> L7
        int r10 = r8.length - 2;     // Catch: Throwable -> L7
        if (r10 < 0) goto L23;
        int r11 = 0;
        long r16 = 255;
    L12:
        long r12 = r8[r11];     // Catch: Throwable -> L7
        char r13 = 7;
        long r18 = -9187201950435737472L;
        if (((((~r12) << 7) & r12) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L21;
        int r14 = 8 - ((~(r11 - r10)) >>> 31);     // Catch: Throwable -> L7
        int r15 = 0;
    L15:
        if (r15 >= r14) goto L20;
        if ((r12 & 255) >= 128) goto L19;
        z80 r17 = (z80) r6[(r11 << 3) + r15];     // Catch: Throwable -> L7
        r17.a();     // Catch: Throwable -> L7
        r22.L(r17);     // Catch: Throwable -> L7
    L19:
        r12 = r12 >> 8;     // Catch: Throwable -> L7
        r15 = r15 + 1;     // Catch: Throwable -> L7
        goto L15
    L20:
        if (r14 == 8) goto L21;
    L24:
        r26.b();     // Catch: Throwable -> L7
        Object[] r1 = r27.b;     // Catch: Throwable -> L7
        long[] r19 = r27.a;     // Catch: Throwable -> L7
        int r20 = r19.length - 2;     // Catch: Throwable -> L7
        if (r20 < 0) goto L38;
        int r21 = 0;
    L27:
        long r110 = r19[r21];     // Catch: Throwable -> L7
        if (((((~r110) << r13) & r110) & r18) == r18) goto L36;
        int r30 = 8 - ((~(r21 - r20)) >>> 31);     // Catch: Throwable -> L7
        int r111 = 0;
    L30:
        if (r111 >= r30) goto L35;
        if ((r110 & r16) >= 128) goto L34;
        ((z80) r1[(r21 << 3) + r111]).g();     // Catch: Throwable -> L7
    L34:
        r110 = r110 >> 8;     // Catch: Throwable -> L7
        r111 = r111 + 1;     // Catch: Throwable -> L7
        goto L30
    L35:
        if (r30 != 8) goto L38;
    L36:
        if (r21 == r20) goto L38;
        r21 = r21 + 1;     // Catch: Throwable -> L7
    L38:
        r27.b();     // Catch: Throwable -> L7
        r28.b();     // Catch: Throwable -> L7
        Object[] r2 = r29.b;     // Catch: Throwable -> L7
        long[] r3 = r29.a;     // Catch: Throwable -> L7
        int r31 = r3.length - 2;     // Catch: Throwable -> L7
        if (r31 < 0) goto L52;
        int r32 = 0;
    L41:
        long r33 = r3[r32];     // Catch: Throwable -> L7
        if (((((~r33) << r13) & r33) & r18) == r18) goto L50;
        int r112 = 8 - ((~(r32 - r31)) >>> 31);     // Catch: Throwable -> L7
        int r113 = 0;
    L44:
        if (r113 >= r112) goto L49;
        if ((r33 & r16) >= 128) goto L48;
        z80 r114 = (z80) r2[(r32 << 3) + r113];     // Catch: Throwable -> L7
        r114.a();     // Catch: Throwable -> L7
        r22.L(r114);     // Catch: Throwable -> L7
    L48:
        r33 = r33 >> 8;     // Catch: Throwable -> L7
        r113 = r113 + 1;     // Catch: Throwable -> L7
        goto L44
    L49:
        if (r112 != 8) goto L52;
    L50:
        if (r32 == r31) goto L52;
        r32 = r32 + 1;     // Catch: Throwable -> L7
    L52:
        r29.b();     // Catch: Throwable -> L7
        monitor-exit(r4);
        return;
    L21:
        if (r11 == r10) goto L24;
        r11 = r11 + 1;     // Catch: Throwable -> L7
        goto L12
    L23:
        r13 = 7;
        r16 = 255;
        r18 = -9187201950435737472L;
    L7:
        th = move-exception;
        throw th;
    }

    public static final void f(List r5, tv3 r6) {
        r5.clear();
        Object r0 = r6.c;
        monitor-enter(r0);
        ArrayList r1 = r6.k;     // Catch: Throwable -> L7
        int r2 = r1.size();     // Catch: Throwable -> L7
        int r3 = 0;
    L5:
        if (r3 >= r2) goto L9;
        r5.add((jy2) r1.get(r3));     // Catch: Throwable -> L7
        r3 = r3 + 1;     // Catch: Throwable -> L7
        goto L5
    L9:
        r6.k.clear();     // Catch: Throwable -> L7
        monitor-exit(r0);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.xf1
    public final Object a(Object r1, Object r2, Object r3) {
        we0 r4 = (we0) r1;
        tv3 r0 = this.y;
        sv3 r5 = new sv3(r0, (vd0) r3);
        r5.x = (ed) r2;
        r5.invokeSuspend(j15.a);
        return xe0.n;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0124 -> B:44:0x012c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x01da -> B:12:0x0093). Please report as a decompilation issue!!! */
    @Override // defpackage.jp
    public final Object invokeSuspend(Object r23) {
        xe0 r1 = xe0.n;
        int r2 = this.w;
        int r4 = 2;
        int r5 = 1;
        if (r2 == 0) goto L11;
        if (r2 == 1) goto L9;
        if (r2 != 2) goto L7;
        x03 r3 = this.v;
        Set r6 = this.u;
        x03 r7 = this.t;
        x03 r8 = this.s;
        x03 r9 = this.r;
        List r10 = this.q;
        final List r11 = this.p;
        List r12 = this.o;
        ed r13 = this.x;
        kb4.X(r23);
        x03 r14 = r3;
        ed r15 = r13;
    L44:
        tv3 r16 = this.y;
        Object r17 = r16.c;
        monitor-enter(r17);
        w03 r18 = r16.l;     // Catch: Throwable -> L54
        if (r18.e == 0) goto L49;
        boolean r19 = true;
    L50:
        if (r19 == false) goto L57;
        q03 r20 = mz2.b(r18);     // Catch: Throwable -> L54
        r16.l.a();     // Catch: Throwable -> L54
        rf2 r110 = r16.m;     // Catch: Throwable -> L54
        ((w03) r110.n).a();     // Catch: Throwable -> L54
        ((w03) r110.o).a();     // Catch: Throwable -> L54
        r16.o.a();     // Catch: Throwable -> L54
        q03 r21 = new q03(r20.b);     // Catch: Throwable -> L54
        Object[] r111 = r20.a;     // Catch: Throwable -> L54
        int r22 = r20.b;     // Catch: Throwable -> L54
        int r24 = 0;
    L52:
        if (r24 >= r22) goto L56;
        int r112 = r24;
        jy2 r25 = (jy2) r111[r24];     // Catch: Throwable -> L54
        ed r113 = r15;
        int r26 = r22;
        r21.a(new kd3(r25, r16.n.g(r25)));     // Catch: Throwable -> L54
        r24 = r112 + 1;     // Catch: Throwable -> L54
        r15 = r113;
        r22 = r26;
        goto L52
    L56:
        ed r114 = r15;
        r16.n.a();     // Catch: Throwable -> L54
    L58:
        monitor-exit(r17);
        Object[] r27 = r21.a;
        int r28 = r21.b;
        int r29 = 0;
    L60:
        if (r29 >= r28) goto L62;
        kd3 r30 = (kd3) r27[r29];
        jy2 r31 = (jy2) r30.n;
        iy2 r32 = (iy2) r30.o;
        r29 = r29 + 1;
        goto L60
    L62:
        jv3 r33 = this.y.b;
        ((fl) r33.n).set(0);
        ((z40) r33.o).b(new k52(12));
        r1 = r1;
        r15 = r114;
        r4 = 2;
        r5 = 1;
    L12:
        Object r115 = this.y.c;
        monitor-enter(r115);
        monitor-exit(r115);
        tv3 r116 = this.y;
        this.x = r15;
        this.o = r12;
        this.p = r11;
        this.q = r10;
        this.r = r9;
        this.s = r8;
        this.t = r7;
        this.u = r6;
        this.v = r14;
        this.w = r5;
        if (r116.C() == true) goto L34;
        cz r117 = new cz(r5, ya4.x(this));
        r117.u();
        Object r34 = r116.c;
        monitor-enter(r34);
    L31:
        th = move-exception;
        throw th;
    L20:
        if (r116.C() == false) goto L22;
        cz r118 = r117;
    L24:
        monitor-exit(r34);
        if (r118 == null) goto L27;
        r118.resumeWith(j15.a);
    L27:
        Object r35 = r117.q();
        if (r35 == xe0.n) goto L35;
        r35 = j15.a;
    L35:
        if (r35 == r1) goto L42;
        List r119 = r12;
        final x03 r120 = r9;
        final x03 r36 = r14;
        final List r121 = r10;
        final List r122 = r119;
    L10:
        final Set r123 = r6;
        final x03 r124 = r8;
        final x03 r37 = r7;
        tv3 r38 = this.y;
        nl4 r39 = tv3.z;
        if (r38.K() == false) goto L65;
        final tv3 r40 = this.y;
        if1 r41 = new rv3(r40, r37, r36, r122, r11, r120, r121, r124, r123);
        this.x = r15;
        this.o = r122;
        this.p = r11;
        this.q = r121;
        this.r = r120;
        this.s = r124;
        this.t = r37;
        this.u = r123;
        this.v = r36;
        this.w = r4;
        if (r15.a(r41, this) == r1) goto L42;
        List r42 = r121;
        r14 = r36;
        r9 = r120;
        r12 = r122;
        r10 = r42;
        r7 = r37;
        r8 = r124;
        r6 = r123;
        goto L44
    L65:
        List r43 = r121;
        r14 = r36;
        r9 = r120;
        r12 = r122;
        r10 = r43;
        r7 = r37;
        r8 = r124;
        r6 = r123;
    L42:
        return r1;
    L22:
        r116.r = r117;     // Catch: Throwable -> L31
        r118 = null;
        goto L24
    L34:
        r35 = j15.a;
        goto L35
    L57:
        r114 = r15;
        r21 = t73.b;     // Catch: Throwable -> L54
        r21.getClass();     // Catch: Throwable -> L54
        goto L58
    L49:
        r19 = false;
    L54:
        th = move-exception;
        throw th;
    L7:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L9:
        x03 r44 = this.v;
        r6 = this.u;
        r7 = this.t;
        r8 = this.s;
        x03 r45 = this.r;
        List r125 = this.q;
        r11 = this.p;
        List r126 = this.o;
        ed r127 = this.x;
        kb4.X(r23);
        r36 = r44;
        r15 = r127;
        r121 = r125;
        r122 = r126;
        r120 = r45;
        goto L10
    L11:
        kb4.X(r23);
        r15 = this.x;
        ArrayList r46 = new ArrayList();
        ArrayList r47 = new ArrayList();
        ArrayList r48 = new ArrayList();
        x03 r49 = w54.a;
        r9 = new x03();
        x03 r128 = new x03();
        x03 r129 = new x03();
        x54 r130 = new x54(r129);
        r14 = new x03();
        r12 = r46;
        r6 = r130;
        r11 = r47;
        r7 = r129;
        r10 = r48;
        r8 = r128;
        goto L12
    }
}
