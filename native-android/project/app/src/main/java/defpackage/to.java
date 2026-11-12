package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class to extends gx2 {
    public final long a;
    public final float b;
    public final sp1 c;

    public to(long r2) {
        sp1 r0 = kb4.b;
        this.a = r2;
        this.b = 1.0f;
        this.c = r0;
    }

    @Override // defpackage.gx2
    public final cx2 d() {
        vo r0 = new vo();
        r0.B = this.a;
        r0.C = this.c;
        r0.D = 9205357640488583168L;
        return r0;
    }

    @Override // defpackage.gx2
    public final void e(cx2 r3) {
        vo r4 = (vo) r3;
        r4.B = this.a;
        sp1 r0 = r4.C;
        sp1 r2 = this.c;
        if (h12.c(r0, r2) == true) goto L5;
        r4.C = r2;
        fu.C(r4);
    L5:
        jz4.z(r4);
    }

    public final boolean equals(Object r5) {
        if ((r5 instanceof to) == false) goto L5;
        to r6 = (to) r5;
    L6:
        if (r6 != null) goto L9;
        return false;
    L9:
        if (x40.c(this.a, r6.a) == true) goto L11;
        return false;
    L11:
        if (this.b == r6.b) goto L13;
        return false;
    L13:
        if (h12.c(this.c, r6.c) == false) goto L19;
        return true;
    L19:
        return false;
    L5:
        r6 = null;
        goto L6
    }

    public final int hashCode() {
        int r0 = x40.h;
        int r1 = b11.d(Long.hashCode(this.a) * 961, this.b, 31);
        return this.c.hashCode() + r1;
    }
}
