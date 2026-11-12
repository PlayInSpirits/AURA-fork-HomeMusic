package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ys extends hd3 {
    public final cc e;
    public final long f;
    public int g;
    public final long h;
    public float i;
    public dt j;

    public ys(cc r4, long r5) {
        this.e = r4;
        this.f = r5;
        this.g = 1;
        int r0 = (int) (r5 >> 32);
        if (r0 < 0) goto L12;
        int r1 = (int) (4294967295L & r5);
        if (r1 < 0) goto L12;
        if (r0 > r4.a.getWidth()) goto L12;
        if (r1 > r4.a.getHeight()) goto L12;
        this.h = r5;
        this.i = 1.0f;
        return;
    L12:
        kf2.n("Failed requirement.");
        throw null;
    }

    @Override // defpackage.hd3
    public final void a(float r1) {
        this.i = r1;
    }

    @Override // defpackage.hd3
    public final void b(dt r1) {
        this.j = r1;
    }

    @Override // defpackage.hd3
    public final long d() {
        return l93.o0(this.h);
    }

    @Override // defpackage.hd3
    public final void e(e72 r11) {
        mz r2 = r11.n;
        int r3 = Math.round(Float.intBitsToFloat((int) (r2.P() >> 32)));
        long r4 = (((long) r3) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (r2.P() & 4294967295L)))) & 4294967295L);
        float r6 = this.i;
        dt r7 = this.j;
        int r8 = this.g;
        sv0.p(r11, this.e, this.f, r4, r6, r7, r8, 328);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L5;
        return true;
    L5:
        if ((r5 instanceof ys) == false) goto L23;
        ys r6 = (ys) r5;
        cc r0 = r6.e;
        if (h12.c(this.e, r0) == true) goto L11;
        return false;
    L11:
        if (g02.a(0, 0) == true) goto L14;
        return false;
    L14:
        if (n02.a(this.f, r6.f) == true) goto L17;
        return false;
    L17:
        if (this.g != r6.g) goto L20;
        return true;
    L20:
        return false;
    L23:
        return false;
    }

    public final int hashCode() {
        int r0 = xa3.b(xa3.b(this.e.hashCode() * 31, 31, 0), 31, this.f);
        return Integer.hashCode(this.g) + r0;
    }

    public final String toString() {
        String r0 = g02.d(0);
        String r1 = n02.b(this.f);
        int r2 = this.g;
        if (r2 != 0) goto L6;
        String r3 = "None";
    L16:
        return "BitmapPainter(image=" + this.e + ", srcOffset=" + r0 + ", srcSize=" + r1 + ", filterQuality=" + r3 + ")";
    L6:
        if (r2 != 1) goto L9;
        r3 = "Low";
        goto L16
    L9:
        if (r2 != 2) goto L12;
        r3 = "Medium";
        goto L16
    L12:
        if (r2 != 3) goto L14;
        r3 = "High";
        goto L16
    L14:
        r3 = "Unknown";
        goto L16
    }
}
