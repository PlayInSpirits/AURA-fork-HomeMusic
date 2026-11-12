package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uv3 implements bi {
    public final h03 n;
    public final q03 o;
    public final Object p;

    public uv3(Object r2) {
        this.n = new h03();
        this.o = new q03();
        this.p = r2;
    }

    @Override // defpackage.bi
    public final void a(int r3, Object r4) {
        h03 r1 = this.n;
        r1.a(5);
        r1.a(r3);
        this.o.a(r4);
    }

    @Override // defpackage.bi
    public final void b(Object r3) {
        this.n.a(1);
        this.o.a(r3);
    }

    @Override // defpackage.bi
    public final void c() {
        this.n.a(8);
    }

    @Override // defpackage.bi
    public final void d(int r2, int r3, int r4) {
        h03 r1 = this.n;
        r1.a(3);
        r1.a(r2);
        r1.a(r3);
        r1.a(r4);
    }

    @Override // defpackage.bi
    public final void e(int r2, int r3) {
        h03 r1 = this.n;
        r1.a(2);
        r1.a(r2);
        r1.a(r3);
    }

    public final void f(d15 r11, uy3 r12) {
        h03 r3 = this.n;
        int r0 = r3.b;
        q03 r2 = new q03();
        int r4 = 0;
        int r5 = 0;
    L3:
        q03 r1 = this.o;
        if (r4 >= r0) goto L51;
        int r7 = r4 + 1;
        switch(r3.b(r4)) {
            case 0: goto L48;
            case 1: goto L46;
            case 2: goto L41;
            case 3: goto L30;
            case 4: goto L28;
            case 5: goto L26;
            case 6: goto L22;
            case 7: goto L20;
            case 8: goto L9;
            default: goto L21;
        };     // Catch: Throwable -> L15 Exception -> L17
    L22:
        r4 = r4 + 2;
        r3.b(r7);     // Catch: Throwable -> L15 Exception -> L24
        int r8 = r5 + 1;     // Catch: Throwable -> L15 Exception -> L24
        c72 r6 = (c72) r1.f(r5);     // Catch: Throwable -> L15 Exception -> L24
        r5 = r8;
    L24:
        e = move-exception;
        Exception r9 = e;
    L58:
        throw new w70(r1, r2, r3, r4 - 1, r9);     // Catch: Throwable -> L15
    L26:
        r4 = r4 + 2;     // Catch: Throwable -> L15 Exception -> L24
        int r10 = r5 + 1;     // Catch: Throwable -> L15 Exception -> L24
        r11.a(r3.b(r7), r1.f(r5));     // Catch: Throwable -> L15 Exception -> L24
        r5 = r10;
        goto L3
    L30:
        int r13 = r4 + 2;
        int r14 = r4 + 3;
        r4 = r4 + 4;
        r11.d(r3.b(r7), r3.b(r13), r3.b(r14));     // Catch: Throwable -> L15 Exception -> L24
    L37:
        e = move-exception;
        r9 = e;
        r4 = r14;
    L39:
        e = move-exception;
        r9 = e;
        r4 = r13;
        goto L58
    L41:
        int r15 = r4 + 2;
        r4 = r4 + 3;
        r11.e(r3.b(r7), r3.b(r15));     // Catch: Throwable -> L15 Exception -> L24
    L21:
        r4 = r7;
        goto L3
    L9:
        Object r16 = r11.p;     // Catch: Throwable -> L15 Exception -> L17
        if ((r16 instanceof u70) == false) goto L19;
        u70 r17 = (u70) r16;     // Catch: Throwable -> L15 Exception -> L17
        if (r12.f.j(r17) == false) goto L19;
        r17.b();     // Catch: Throwable -> L15 Exception -> L17
    L19:
        r2.a(r16);     // Catch: Throwable -> L15 Exception -> L17
        r11.c();     // Catch: Throwable -> L15 Exception -> L17
        goto L21
    L20:
        int r18 = r5 + 1;     // Catch: Throwable -> L15 Exception -> L17
        Object r19 = r1.f(r5);     // Catch: Throwable -> L15 Exception -> L17
        r19.getClass();     // Catch: Throwable -> L15 Exception -> L17
        jz4.j(2, r19);     // Catch: Throwable -> L15 Exception -> L17
        r5 = r5 + 2;     // Catch: Throwable -> L15 Exception -> L17
        r11.m((wf1) r19, r1.f(r18));     // Catch: Throwable -> L15 Exception -> L17
        goto L21
    L28:
        r11.f();     // Catch: Throwable -> L15 Exception -> L17
        goto L21
    L46:
        int r20 = r5 + 1;
        r11.b(r1.f(r5));     // Catch: Throwable -> L15 Exception -> L17
        r5 = r20;
        goto L21
    L48:
        r11.g();     // Catch: Throwable -> L15 Exception -> L17
    L15:
        th = move-exception;
        r11.i();
        throw th;
    L17:
        e = move-exception;
        r9 = e;
        r4 = r7;
        goto L58
    L51:
        if (r5 == r1.b) goto L54;
        l80.a("Applier operation size mismatch");     // Catch: Throwable -> L15 Exception -> L24
    L54:
        r1.d();     // Catch: Throwable -> L15 Exception -> L24
        r3.b = 0;     // Catch: Throwable -> L15 Exception -> L24
        r11.i();
    }

    @Override // defpackage.bi
    public final void g() {
        this.n.a(0);
    }

    @Override // defpackage.bi
    public final void h(int r3, Object r4) {
        h03 r1 = this.n;
        r1.a(6);
        r1.a(r3);
        this.o.a(r4);
    }

    @Override // defpackage.bi
    public final Object j() {
        return this.p;
    }

    @Override // defpackage.bi
    public final void m(wf1 r3, Object r4) {
        this.n.a(7);
        q03 r2 = this.o;
        r2.a(r3);
        r2.a(r4);
    }
}
