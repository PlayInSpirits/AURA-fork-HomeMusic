package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class my4 {
    public final byte[] a;
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public my4() {
        this.a = new byte[10];
    }

    public final void a(wv4 r9, vv4 r10) {
        if (this.c <= 0) goto L6;
        r9.a(this.d, this.e, this.f, this.g, r10);
        this.c = 0;
        return;
    }

    public final void b(wv4 r4, long r5, int r7, int r8, int r9, vv4 r10) {
        if (this.g > (r8 + r9)) goto L5;
        boolean r0 = true;
    L6:
        rr2.v("TrueHD chunk samples must be contiguous in the sample queue.", r0);
        if (this.b == false) goto L17;
        int r1 = this.c;
        int r2 = r1 + 1;
        this.c = r2;
        if (r1 != 0) goto L12;
        this.d = r5;
        this.e = r7;
        this.f = 0;
    L12:
        this.f += r8;
        this.g = r9;
        if (r2 < 16) goto L16;
        a(r4, r10);
        return;
    L16:
        return;
    L17:
        return;
    L5:
        r0 = false;
        goto L6
    }

    public final void c(l51 r8) {
        if (this.b == true) goto L25;
        byte[] r1 = this.a;
        int r2 = 0;
        r8.n(r1, 0, 10);
        r8.k();
        if (r1[4] == (-8)) goto L8;
    L21:
        if (r2 != 0) goto L23;
        return;
    L23:
        this.b = true;
        return;
    L8:
        if (r1[5] != 114) goto L21;
        if (r1[6] != 111) goto L21;
        byte r3 = r1[7];
        if ((r3 & 254) != 186) goto L21;
        if ((r3 & 255) != 187) goto L17;
        r2 = 1;
    L17:
        if (r2 == 0) goto L19;
        char r4 = '\t';
    L20:
        r2 = 40 << ((r1[r4] >> 4) & 7);
        goto L21
    L19:
        r4 = '\b';
        goto L20
    }
}
