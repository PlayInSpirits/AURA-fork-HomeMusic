package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ba5 implements uo0 {
    public int a;
    public jc0 b;
    public v34 c;
    public int d;
    public final eq0 e;
    public int f;
    public boolean g;
    public final yo0 h;
    public final yo0 i;
    public int j;

    public ba5(jc0 r2) {
        this.e = new eq0(this);
        this.f = 0;
        this.g = false;
        this.h = new yo0(this);
        this.i = new yo0(this);
        this.j = 1;
        this.b = r2;
    }

    public static void b(yo0 r1, yo0 r2, int r3) {
        r1.l.add(r2);
        r1.f = r3;
        r2.k.add(r1);
    }

    public static yo0 h(hb0 r2) {
        hb0 r3 = r2.f;
        if (r3 == null) goto L27;
        jc0 r0 = r3.d;
        int r4 = xa3.w(r3.e);
        if (r4 == 1) goto L26;
        if (r4 == 2) goto L24;
        if (r4 == 3) goto L22;
        if (r4 == 4) goto L20;
        if (r4 == 5) goto L18;
        return null;
    L18:
        return r0.e.k;
    L20:
        return r0.e.i;
    L22:
        return r0.d.i;
    L24:
        return r0.e.h;
    L26:
        return r0.d.h;
    L27:
        return null;
    }

    public static yo0 i(hb0 r1, int r2) {
        hb0 r3 = r1.f;
        if (r3 == null) goto L23;
        jc0 r0 = r3.d;
        if (r2 != 0) goto L8;
        ba5 r4 = r0.d;
    L9:
        int r5 = xa3.w(r3.e);
        if (r5 == 1) goto L22;
        if (r5 == 2) goto L22;
        if (r5 == 3) goto L20;
        if (r5 == 4) goto L20;
        return null;
    L20:
        return r4.i;
    L22:
        return r4.h;
    L8:
        r4 = r0.e;
        goto L9
    L23:
        return null;
    }

    public final void c(yo0 r2, yo0 r3, int r4, eq0 r5) {
        r2.l.add(r3);
        r2.l.add(this.e);
        r2.h = r4;
        r2.i = r5;
        r3.k.add(r2);
        r5.k.add(r2);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int r1, int r2) {
        jc0 r0 = this.b;
        if (r2 != 0) goto L9;
        int r3 = r0.v;
        int r4 = Math.max(r0.u, r1);
        if (r3 <= 0) goto L7;
        r4 = Math.min(r3, r1);
    L7:
        if (r4 == r1) goto L14;
        return r4;
    L14:
        return r1;
    L9:
        int r5 = r0.y;
        int r6 = Math.max(r0.x, r1);
        if (r5 <= 0) goto L12;
        r6 = Math.min(r5, r1);
    L12:
        if (r6 == r1) goto L14;
        return r6;
    }

    public long j() {
        eq0 r2 = this.e;
        if (r2.j == true) goto L5;
        return 0;
    L5:
        return r2.g;
    }

    public abstract boolean k();

    public final void l(hb0 r12, hb0 r13, int r14) {
        yo0 r0 = h(r12);
        yo0 r1 = h(r13);
        if (r0.j == true) goto L5;
        return;
    L5:
        if (r1.j == false) goto L66;
        int r15 = r12.d() + r0.g;
        int r2 = r1.g - r13.d();
        int r16 = r2 - r15;
        eq0 r3 = this.e;
        if (r3.j == true) goto L51;
        if (this.d != 3) goto L51;
        int r4 = this.a;
        if (r4 != 0) goto L14;
        r3.d(g(r16, r14));
        goto L51
    L14:
        if (r4 != 1) goto L16;
        r3.d(Math.min(g(r3.m, r14), r16));
        goto L51
    L16:
        if (r4 == 2) goto L37;
        if (r4 != 3) goto L51;
        jc0 r5 = this.b;
        ba5 r8 = r5.d;
        if (r8.d == 3) goto L22;
    L28:
        if (r14 != 0) goto L30;
        r8 = r5.e;
    L30:
        eq0 r6 = r8.e;
        if (r6.j == false) goto L51;
        float r7 = r5.V;
        int r9 = r6.g;
        if (r14 != 1) goto L35;
        int r10 = (int) ((r9 / r7) + 0.5f);
    L36:
        r3.d(r10);
        goto L51
    L35:
        r10 = (int) ((r7 * r9) + 0.5f);
        goto L36
    L22:
        if (r8.a != 3) goto L28;
        w45 r11 = r5.e;
        if (r11.d != 3) goto L28;
        if (r11.a != 3) goto L28;
    L37:
        jc0 r17 = this.b;
        jc0 r18 = r17.S;
        if (r18 == null) goto L51;
        if (r14 != 0) goto L41;
        ba5 r19 = r18.d;
    L42:
        eq0 r20 = r19.e;
        if (r20.j == false) goto L51;
        if (r14 != 0) goto L46;
        float r21 = r17.w;
    L47:
        r3.d(g((int) ((r20.g * r21) + 0.5f), r14));
        goto L51
    L46:
        r21 = r17.z;
        goto L47
    L41:
        r19 = r18.e;
    L51:
        if (r3.j == false) goto L67;
        int r22 = r3.g;
        yo0 r23 = this.i;
        yo0 r24 = this.h;
        if (r22 != r16) goto L57;
        r24.d(r15);
        r23.d(r2);
        return;
    L57:
        jc0 r110 = this.b;
        if (r14 != 0) goto L60;
        float r111 = r110.c0;
    L61:
        if (r0 != r1) goto L63;
        r15 = r0.g;
        r2 = r1.g;
        r111 = 0.5f;
    L63:
        r24.d((int) ((((r2 - r15) - r22) * r111) + (r15 + 0.5f)));
        r23.d(r24.g + r3.g);
        return;
    L60:
        r111 = r110.d0;
        goto L61
    L67:
        return;
    }
}
