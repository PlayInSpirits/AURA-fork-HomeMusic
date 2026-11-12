package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ti0 implements rd {
    public final na4 a;
    public final hd5 b;
    public final Object c;
    public final ce d;
    public final ce e;
    public final ce f;
    public final Object g;
    public final long h;

    public ti0(ui0 r12, Object r13, ce r14) {
        na4 r0 = new na4(r12.a);
        this.a = r0;
        hd5 r15 = p35.a;
        this.b = r15;
        this.c = r13;
        ce r16 = (ce) ((if1) r15.o).invoke(r13);
        this.d = r16;
        this.e = kb4.n(r14);
        this.g = ((if1) r15.p).invoke(r0.D(r16, r14));
        if (((ce) r0.p) != null) goto L5;
        r0.p = r16.c();
    L5:
        ce r17 = (ce) r0.p;
        if (r17 == null) goto L14;
        int r18 = r17.b();
        int r1 = 0;
        long r2 = 0;
        int r4 = 0;
    L8:
        if (r4 >= r18) goto L10;
        rm2 r5 = (rm2) r0.n;
        r16.getClass();
        r2 = Math.max(r2, ((long) (Math.exp(((yx0) r5.o).b(r14.a(r4)) / (((double) a81.a) - 1.0d)) * 1000.0d)) * 1000000);
        r4 = r4 + 1;
        goto L8
    L10:
        this.h = r2;
        ce r19 = kb4.n(this.a.E(r2, this.d, r14));
        this.f = r19;
        int r110 = r19.b();
    L11:
        if (r1 >= r110) goto L13;
        ce r111 = this.f;
        float r112 = r111.a(r1);
        this.a.getClass();
        this.a.getClass();
        r111.d(r1, gb.l(r112, -0.0f, 0.0f));
        r1 = r1 + 1;
        goto L11
    L13:
        return;
    L14:
        h12.Q("velocityVector");
        throw null;
    }

    @Override // defpackage.rd
    public final boolean a() {
        return false;
    }

    @Override // defpackage.rd
    public final long b() {
        return this.h;
    }

    @Override // defpackage.rd
    public final hd5 c() {
        return this.b;
    }

    @Override // defpackage.rd
    public final ce d(long r3) {
        if (e(r3) == true) goto L7;
        ce r0 = this.d;
        ce r1 = this.e;
        return this.a.E(r3, r0, r1);
    L7:
        return this.f;
    }

    @Override // defpackage.rd
    public final Object f(long r19) {
        if (e(r19) == true) goto L28;
        if1 r1 = (if1) this.b.p;
        na4 r2 = this.a;
        ce r3 = (ce) r2.o;
        ce r4 = this.d;
        if (r3 != null) goto L7;
        r2.o = r4.c();
    L7:
        ce r5 = (ce) r2.o;
        if (r5 == null) goto L25;
        int r6 = r5.b();
        int r7 = 0;
    L10:
        ce r8 = (ce) r2.o;
        if (r7 >= r6) goto L20;
        if (r8 == null) goto L18;
        rm2 r9 = (rm2) r2.n;
        float r10 = r4.a(r7);
        long r12 = r19 / 1000000;
        z71 r11 = ((yx0) r9.o).a(this.e.a(r7));
        long r14 = r11.c;
        if (r14 <= 0) goto L16;
        float r13 = r12 / r14;
    L17:
        r8.d(r7, ((Math.signum(r11.a) * r11.b) * yb.a(r13).a) + r10);
        r7 = r7 + 1;
        goto L10
    L16:
        r13 = 1.0f;
        goto L17
    L18:
        h12.Q("valueVector");
        throw null;
    L20:
        if (r8 != null) goto L22;
        h12.Q("valueVector");
        throw null;
    L22:
        return r1.invoke(r8);
    L25:
        h12.Q("valueVector");
        throw null;
    L28:
        return this.g;
    }

    @Override // defpackage.rd
    public final Object g() {
        return this.g;
    }
}
