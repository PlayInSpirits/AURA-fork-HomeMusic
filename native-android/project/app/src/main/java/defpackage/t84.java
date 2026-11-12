package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t84 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public t84 f;
    public t84 g;

    public t84(byte[] r1, int r2, int r3, boolean r4) {
        r1.getClass();
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = false;
    }

    public final t84 a() {
        t84 r0 = this.f;
        if (r0 != this) goto L6;
        r0 = null;
    L6:
        t84 r2 = this.g;
        r2.getClass();
        r2.f = this.f;
        t84 r3 = this.f;
        r3.getClass();
        r3.g = this.g;
        this.f = null;
        this.g = null;
        return r0;
    }

    public final void b(t84 r2) {
        r2.getClass();
        r2.g = this;
        r2.f = this.f;
        t84 r0 = this.f;
        r0.getClass();
        r0.g = r2;
        this.f = r2;
    }

    public final t84 c() {
        this.d = true;
        int r2 = this.b;
        int r3 = this.c;
        return new t84(this.a, r2, r3, true);
    }

    public final void d(t84 r6, int r7) {
        r6.getClass();
        byte[] r0 = r6.a;
        if (r6.e == false) goto L17;
        int r1 = r6.c;
        int r2 = r1 + r7;
        if (r2 > 8192) goto L7;
    L15:
        int r3 = r6.c;
        int r4 = this.b;
        ti.X(r3, r4, r4 + r7, this.a, r0);
        r6.c += r7;
        this.b += r7;
        return;
    L7:
        if (r6.d == true) goto L13;
        int r5 = r6.b;
        if ((r2 - r5) > 8192) goto L11;
        ti.X(0, r5, r1, r0, r0);
        r6.c -= r6.b;
        r6.b = 0;
        goto L15
    L11:
        nz2.c();
        return;
    L13:
        nz2.c();
        return;
    L17:
        kf2.o("only owner can write");
    }

    public t84() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}
