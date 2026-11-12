package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qc3 implements vi2 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final hb3 e;
    public final int f;
    public final int g;
    public final int h;
    public final xi2 i;
    public final xi2 j;
    public final float k;
    public final int l;
    public final boolean m;
    public final rv2 n;
    public final vi2 o;
    public final boolean p;
    public final List q;
    public final List r;
    public final we0 s;
    public final oo0 t;
    public final long u;

    public qc3(List r1, int r2, int r3, int r4, hb3 r5, int r6, int r7, int r8, xi2 r9, xi2 r10, float r11, int r12, boolean r13, rv2 r14, vi2 r15, boolean r16, List r17, List r18, we0 r19, oo0 r20, long r21) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = r7;
        this.h = r8;
        this.i = r9;
        this.j = r10;
        this.k = r11;
        this.l = r12;
        this.m = r13;
        this.n = r14;
        this.o = r15;
        this.p = r16;
        this.q = r17;
        this.r = r18;
        this.s = r19;
        this.t = r20;
        this.u = r21;
    }

    @Override // defpackage.vi2
    public final Map a() {
        return this.o.a();
    }

    @Override // defpackage.vi2
    public final int b() {
        return this.o.b();
    }

    @Override // defpackage.vi2
    public final void c() {
        this.o.c();
    }

    @Override // defpackage.vi2
    public final int d() {
        return this.o.d();
    }

    @Override // defpackage.vi2
    public final if1 e() {
        return this.o.e();
    }

    @Override // defpackage.vi2
    public final wf1 f() {
        return this.o.f();
    }

    @Override // defpackage.vi2
    public final if1 g() {
        return this.o.g();
    }

    public final qc3 h(int r29) {
        int r2 = this.b + this.c;
        if (this.p == true) goto L45;
        List r3 = this.a;
        if (r3.isEmpty() == false) goto L7;
        return null;
    L7:
        if (this.i == null) goto L51;
        int r4 = this.l - r29;
        if (r4 < 0) goto L52;
        if (r4 >= r2) goto L53;
        if (r2 == 0) goto L13;
        float r5 = r29 / r2;
    L14:
        float r16 = this.k - r5;
        if (this.j != null) goto L17;
        return null;
    L17:
        if (r16 < 0.5f) goto L19;
        return null;
    L19:
        if (r16 <= (-0.5f)) goto L58;
        xi2 r6 = (xi2) q40.w0(r3);
        xi2 r7 = (xi2) q40.C0(r3);
        int r8 = this.g;
        int r9 = this.f;
        if (r29 >= 0) goto L27;
        if (Math.min((r6.l + r2) - r9, (r7.l + r2) - r8) <= (-r29)) goto L56;
    L28:
        int r10 = r3.size();
        boolean r11 = false;
        int r12 = 0;
    L29:
        if (r12 >= r10) goto L31;
        ((xi2) r3.get(r12)).a(r29);
        r12 = r12 + 1;
        goto L29
    L31:
        List r13 = this.q;
        int r14 = r13.size();
        int r15 = 0;
    L32:
        if (r15 >= r14) goto L34;
        ((xi2) r13.get(r15)).a(r29);
        r15 = r15 + 1;
        goto L32
    L34:
        List r17 = this.r;
        int r18 = r17.size();
        int r19 = 0;
    L35:
        if (r19 >= r18) goto L38;
        ((xi2) r17.get(r19)).a(r29);
        r19 = r19 + 1;
        goto L35
    L38:
        if (this.m == true) goto L42;
        if (r29 > 0) goto L42;
    L44:
        return new qc3(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, r16, r4, r11, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u);
    L42:
        r11 = true;
        goto L44
    L56:
        return null;
    L27:
        if (Math.min(r9 - r6.l, r8 - r7.l) > r29) goto L28;
        return null;
    L58:
        return null;
    L13:
        r5 = 0.0f;
        goto L14
    L53:
        return null;
    L52:
        return null;
    L51:
        return null;
    L45:
        return null;
    }

    public final long i() {
        vi2 r6 = this.o;
        int r0 = r6.d();
        return (((long) r0) << 32) | (((long) r6.b()) & 4294967295L);
    }

    public /* synthetic */ qc3(int r24, int r25, int r26, int r27, int r28, int r29, rv2 r30, vi2 r31, we0 r32, oo0 r33, long r34) {
        u01 r1 = u01.n;
        this(r1, r24, r25, r26, hb3.o, r27, r28, r29, null, null, 0.0f, 0, false, r30, r31, false, r1, r1, r32, r33, r34);
    }
}
