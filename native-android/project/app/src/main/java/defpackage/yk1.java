package defpackage;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yk1 implements mz0 {
    public static final float[] l = null;
    public final r20 a;
    public final be3 b;
    public final boolean[] c;
    public final wk1 d;
    public final n41 e;
    public xk1 f;
    public long g;
    public String h;
    public wv4 i;
    public boolean j;
    public long k;

    static {
        l = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    }

    public yk1(r20 r3) {
        this.a = r3;
        this.c = new boolean[4];
        wk1 r4 = new wk1();
        r4.e = new byte[128];
        this.d = r4;
        this.k = -9223372036854775807L;
        this.e = new n41(178);
        this.b = new be3();
    }

    @Override // defpackage.mz0
    public final void a(be3 r20) {
        this.f.getClass();
        this.i.getClass();
        int r2 = r20.b;
        int r3 = r20.c;
        byte[] r4 = r20.a;
        this.g += (long) r20.a();
        this.i.e(r20.a(), r20);
    L3:
        int r5 = uc5.o(r4, r2, r3, this.c);
        wk1 r6 = this.d;
        n41 r7 = this.e;
        if (r5 == r3) goto L6;
        int r9 = r5 + 3;
        byte r8 = r20.a[r9];
        int r10 = r8 & 255;
        int r11 = r5 - r2;
        if (this.j == true) goto L83;
        if (r11 <= 0) goto L16;
        r6.a(r4, r2, r5);
    L16:
        if (r11 >= 0) goto L18;
        int r12 = -r11;
    L19:
        int r15 = r6.b;
        if (r15 == 0) goto L79;
        int r16 = r3;
        if (r15 != 1) goto L24;
        int r17 = r9;
        int r13 = 0;
        if (r10 == 181) goto L78;
        l93.q0("H263Reader", "Unexpected start code value");
        r6.a = false;
        r6.c = 0;
        r6.b = 0;
    L82:
        r6.a(wk1.f, r13, 3);
    L84:
        this.f.a(r4, r2, r5);
        if (r7 == null) goto L97;
        if (r11 <= 0) goto L88;
        r7.a(r4, r2, r5);
        int r14 = 0;
    L90:
        if (r7.d(r14) == false) goto L93;
        int r18 = uc5.b0(r7.c, (byte[]) r7.f);
        String r19 = f35.a;
        byte[] r21 = (byte[]) r7.f;
        be3 r22 = this.b;
        r22.L(r18, r21);
        this.a.n(this.k, r22);
    L93:
        if (r10 != 178) goto L97;
        boolean r23 = true;
        if (r20.a[r5 + 2] != 1) goto L98;
        r7.g(r10);
    L98:
        int r24 = r16 - r5;
        this.f.b(r24, this.g - ((long) r24), this.j);
        xk1 r25 = this.f;
        long r26 = this.k;
        r25.e = r10;
        r25.d = false;
        if (r10 != 182) goto L101;
    L104:
        boolean r27 = r23;
    L105:
        r25.b = r27;
        if (r10 != 182) goto L108;
        boolean r110 = r23;
    L109:
        r25.c = r110;
        r25.f = 0;
        r25.h = r26;
        r3 = r16;
        r2 = r17;
        goto L3
    L108:
        r110 = false;
        goto L109
    L101:
        if (r10 == 179) goto L104;
        r27 = false;
        goto L105
    L88:
        r14 = -r11;
    L97:
        r23 = true;
        goto L98
    L78:
        r6.b = 2;
        goto L82
    L24:
        if (r15 == 2) goto L71;
        r17 = r9;
        if (r15 == 3) goto L68;
        if (r15 != 4) goto L65;
        if (r10 != 179) goto L31;
    L34:
        r6.c -= r12;
        r6.a = false;
        wv4 r28 = this.i;
        int r29 = r6.d;
        String r111 = this.h;
        r111.getClass();
        byte[] r30 = Arrays.copyOf(r6.e, r6.c);
        h00 r112 = new h00(r30.length, r30);
        r112.u(r29);
        r112.u(4);
        r112.s();
        r112.t(8);
        if (r112.h() == false) goto L37;
        r112.t(4);
        r112.t(3);
    L37:
        int r31 = r112.i(4);
        if (r31 != 15) goto L44;
        int r32 = r112.i(8);
        int r33 = r112.i(8);
        if (r33 != 0) goto L42;
        l93.q0("H263Reader", "Invalid aspect ratio");
    L47:
        float r113 = 1.0f;
    L49:
        if (r112.h() == false) goto L54;
        r112.t(2);
        r112.t(1);
        if (r112.h() == false) goto L54;
        r112.t(15);
        r112.s();
        r112.t(15);
        r112.s();
        r112.t(15);
        r112.s();
        r112.t(3);
        r112.t(11);
        r112.s();
        r112.t(15);
        r112.s();
    L54:
        if (r112.i(2) == 0) goto L56;
        l93.q0("H263Reader", "Unhandled video object layer shape");
    L56:
        r112.s();
        int r34 = r112.i(16);
        r112.s();
        if (r112.h() == false) goto L64;
        if (r34 != 0) goto L60;
        l93.q0("H263Reader", "Invalid vop_increment_time_resolution");
        goto L64
    L60:
        int r35 = r34 - 1;
        int r36 = 0;
    L61:
        if (r35 <= 0) goto L63;
        r36 = r36 + 1;
        r35 = r35 >> 1;
        goto L61
    L63:
        r112.t(r36);
    L64:
        r112.s();
        int r37 = r112.i(13);
        r112.s();
        int r38 = r112.i(13);
        r112.s();
        r112.s();
        sb1 r39 = new sb1();
        r39.a = r111;
        r39.l = lw2.m("video/mp2t");
        r39.m = lw2.m("video/mp4v-es");
        r39.t = r37;
        r39.u = r38;
        r39.z = r113;
        r39.p = Collections.singletonList(r30);
        f34.l(r39, r28);
        this.j = true;
        goto L84
    L42:
        r113 = r32 / r33;
        goto L49
    L44:
        if (r31 >= 7) goto L46;
        r113 = l[r31];
        goto L49
    L46:
        l93.q0("H263Reader", "Invalid aspect ratio");
        goto L47
    L31:
        if (r10 == 181) goto L34;
        r13 = 0;
        goto L82
    L65:
        tb4.a();
        return;
    L68:
        if ((r8 & 240) == 32) goto L70;
        l93.q0("H263Reader", "Unexpected start code value");
        r13 = 0;
        r6.a = false;
        r6.c = 0;
        r6.b = 0;
        goto L82
    L70:
        r13 = 0;
        r6.d = r6.c;
        r6.b = 4;
        goto L82
    L71:
        r17 = r9;
        r13 = 0;
        if (r10 <= 31) goto L74;
        l93.q0("H263Reader", "Unexpected start code value");
        r6.a = false;
        r6.c = 0;
        r6.b = 0;
        goto L82
    L74:
        r6.b = 3;
        goto L82
    L79:
        r16 = r3;
        r17 = r9;
        r13 = 0;
        if (r10 != 176) goto L82;
        r6.b = 1;
        r6.a = true;
        goto L82
    L18:
        r12 = 0;
        goto L19
    L83:
        r16 = r3;
        r17 = r9;
        goto L84
    L6:
        if (this.j == true) goto L8;
        r6.a(r4, r2, r3);
    L8:
        this.f.a(r4, r2, r3);
        if (r7 == null) goto L115;
        r7.a(r4, r2, r3);
        return;
    }

    @Override // defpackage.mz0
    public final void c() {
        uc5.i(this.c);
        wk1 r0 = this.d;
        r0.a = false;
        r0.c = 0;
        r0.b = 0;
        xk1 r1 = this.f;
        if (r1 == null) goto L5;
        r1.b = false;
        r1.c = false;
        r1.d = false;
        r1.e = -1;
    L5:
        n41 r2 = this.e;
        if (r2 == null) goto L8;
        r2.f();
    L8:
        this.g = 0;
        this.k = -9223372036854775807L;
    }

    @Override // defpackage.mz0
    public final void d(boolean r5) {
        this.f.getClass();
        if (r5 == false) goto L6;
        this.f.b(0, this.g, this.j);
        xk1 r4 = this.f;
        r4.b = false;
        r4.c = false;
        r4.d = false;
        r4.e = -1;
        return;
    }

    @Override // defpackage.mz0
    public final void e(int r1, long r2) {
        this.k = r2;
    }

    @Override // defpackage.mz0
    public final void f(m51 r3, sy4 r4) {
        r4.a();
        r4.b();
        this.h = r4.e;
        r4.b();
        wv4 r0 = r3.t(r4.d, 2);
        this.i = r0;
        this.f = new xk1(r0);
        this.a.p(r3, r4);
    }
}
