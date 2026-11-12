package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class id3 extends gx2 {
    public final hd3 a;
    public final hs b;
    public final i80 c;
    public final float d;
    public final dt e;

    public id3(hd3 r1, hs r2, i80 r3, float r4, dt r5) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
    }

    @Override // defpackage.gx2
    public final cx2 d() {
        jd3 r0 = new jd3();
        r0.B = this.a;
        r0.C = true;
        r0.D = this.b;
        r0.E = this.c;
        r0.F = this.d;
        r0.G = this.e;
        return r0;
    }

    @Override // defpackage.gx2
    public final void e(cx2 r8) {
        jd3 r9 = (jd3) r8;
        boolean r0 = r9.C;
        hd3 r1 = this.a;
        if (r0 == true) goto L5;
    L8:
        boolean r2 = true;
    L9:
        r9.B = r1;
        r9.C = true;
        r9.D = this.b;
        r9.E = this.c;
        r9.F = this.d;
        r9.G = this.e;
        if (r2 == false) goto L12;
        g12.A(r9);
    L12:
        jz4.z(r9);
        return;
    L5:
        if (qf4.a(r9.B.d(), r1.d()) == false) goto L8;
        r2 = false;
        goto L9
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof id3) == false) goto L25;
        id3 r4 = (id3) r3;
        if (h12.c(this.a, r4.a) == true) goto L11;
        return false;
    L11:
        if (h12.c(this.b, r4.b) == true) goto L14;
        return false;
    L14:
        if (h12.c(this.c, r4.c) == true) goto L17;
        return false;
    L17:
        if (Float.compare(this.d, r4.d) == 0) goto L20;
        return false;
    L20:
        if (h12.c(this.e, r4.e) == true) goto L23;
        return false;
    L23:
        return true;
    L25:
        return false;
    }

    public final int hashCode() {
        int r0 = xa3.c(this.a.hashCode() * 31, 31, true);
        int r2 = (this.b.hashCode() + r0) * 31;
        int r1 = b11.d((this.c.hashCode() + r2) * 31, this.d, 31);
        dt r3 = this.e;
        if (r3 != null) goto L5;
        int r4 = 0;
    L7:
        return r1 + r4;
    L5:
        r4 = r3.hashCode();
        goto L7
    }

    public final String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=true, alignment=" + this.b + ", contentScale=" + this.c + ", alpha=" + this.d + ", colorFilter=" + this.e + ")";
    }
}
