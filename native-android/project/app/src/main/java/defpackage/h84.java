package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h84 implements ty4 {
    public final g84 a;
    public final be3 b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public h84(g84 r2) {
        this.a = r2;
        this.b = new be3(32);
    }

    @Override // defpackage.ty4
    public final void a(int r8, be3 r9) {
        if ((r8 & 1) == 0) goto L5;
        boolean r10 = true;
    L7:
        if (r10 == false) goto L9;
        int r4 = r9.b + r9.A();
    L11:
        if (this.f == false) goto L16;
        if (r10 == false) goto L44;
        this.f = false;
        r9.N(r4);
        this.d = 0;
        goto L16
    L44:
        return;
    L16:
        if (r9.a() <= 0) goto L60;
        int r11 = this.d;
        be3 r5 = this.b;
        if (r11 < 3) goto L19;
        int r12 = Math.min(r9.a(), this.c - this.d);
        r9.k(r5.a, this.d, r12);
        int r3 = this.d + r12;
        this.d = r3;
        int r13 = this.c;
        if (r3 != r13) goto L16;
        if (this.e == true) goto L38;
        r5.M(r13);
    L43:
        r5.N(0);
        this.a.a(r5);
        this.d = 0;
        goto L16
    L38:
        if (f35.o(0, r13, -1, r5.a) != 0) goto L39;
        r5.M(this.c - 4);
        goto L43
    L39:
        this.f = true;
        return;
    L19:
        if (r11 != 0) goto L24;
        int r14 = r9.A();
        r9.N(r9.b - 1);
        if (r14 != 255) goto L24;
        this.f = true;
        return;
    L24:
        int r15 = Math.min(r9.a(), 3 - this.d);
        r9.k(r5.a, this.d, r15);
        int r6 = this.d + r15;
        this.d = r6;
        if (r6 != 3) goto L16;
        r5.N(0);
        r5.M(3);
        r5.O(1);
        int r16 = r5.A();
        int r7 = r5.A();
        if ((r16 & 128) == 0) goto L29;
        boolean r17 = true;
    L30:
        this.e = r17;
        int r18 = (((r16 & 15) << 8) | r7) + 3;
        this.c = r18;
        byte[] r19 = r5.a;
        if (r19.length >= r18) goto L16;
        r5.c(Math.min(4098, Math.max(r18, r19.length * 2)));
        goto L16
    L29:
        r17 = false;
        goto L30
    L60:
        return;
    L9:
        r4 = -1;
        goto L11
    L5:
        r10 = false;
        goto L7
    }

    @Override // defpackage.ty4
    public final void b(iu4 r2, m51 r3, sy4 r4) {
        this.a.b(r2, r3, r4);
        this.f = true;
    }

    @Override // defpackage.ty4
    public final void c() {
        this.f = true;
    }
}
