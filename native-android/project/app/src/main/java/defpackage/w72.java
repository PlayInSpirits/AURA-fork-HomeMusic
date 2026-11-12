package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class w72 extends gx2 {
    public final dc3 a;
    public final hg3 b;

    public w72(dc3 r1, hg3 r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // defpackage.gx2
    public final cx2 d() {
        z72 r0 = new z72();
        r0.B = this.a;
        r0.C = this.b;
        r0.D = hb3.o;
        return r0;
    }

    @Override // defpackage.gx2
    public final void e(cx2 r2) {
        z72 r3 = (z72) r2;
        r3.B = this.a;
        r3.C = this.b;
        r3.D = hb3.o;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof w72) == false) goto L16;
        w72 r5 = (w72) r4;
        dc3 r1 = r5.a;
        if (h12.c(this.a, r1) == true) goto L12;
        return false;
    L12:
        if (h12.c(this.b, r5.b) == true) goto L15;
        return false;
    L15:
        return true;
    L16:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        int r2 = xa3.c((this.b.hashCode() + r0) * 31, 31, false);
        return hb3.o.hashCode() + r2;
    }
}
