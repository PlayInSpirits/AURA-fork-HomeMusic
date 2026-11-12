package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class id3 extends gx2 {
    public final hd3 a;
    public final hs b;
    public final i80 c;
    public final float d;
    public final dt e;

    public id3(hd3 hd3Var, hs hsVar, i80 i80Var, float f, dt dtVar) {
        this.a = hd3Var;
        this.b = hsVar;
        this.c = i80Var;
        this.d = f;
        this.e = dtVar;
    }

    @Override // defpackage.gx2
    public final cx2 d() {
        jd3 jd3Var = new jd3();
        jd3Var.B = this.a;
        jd3Var.C = true;
        jd3Var.D = this.b;
        jd3Var.E = this.c;
        jd3Var.F = this.d;
        jd3Var.G = this.e;
        return jd3Var;
    }

    @Override // defpackage.gx2
    public final void e(cx2 cx2Var) {
        jd3 jd3Var = (jd3) cx2Var;
        boolean z = jd3Var.C;
        hd3 hd3Var = this.a;
        boolean z2 = (z && qf4.a(jd3Var.B.d(), hd3Var.d())) ? false : true;
        jd3Var.B = hd3Var;
        jd3Var.C = true;
        jd3Var.D = this.b;
        jd3Var.E = this.c;
        jd3Var.F = this.d;
        jd3Var.G = this.e;
        if (z2) {
            g12.A(jd3Var);
        }
        jz4.z(jd3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id3)) {
            return false;
        }
        id3 id3Var = (id3) obj;
        return h12.c(this.a, id3Var.a) && h12.c(this.b, id3Var.b) && h12.c(this.c, id3Var.c) && Float.compare(this.d, id3Var.d) == 0 && h12.c(this.e, id3Var.e);
    }

    public final int hashCode() {
        int iD = b11.d((this.c.hashCode() + ((this.b.hashCode() + xa3.c(this.a.hashCode() * 31, 31, true)) * 31)) * 31, this.d, 31);
        dt dtVar = this.e;
        return iD + (dtVar == null ? 0 : dtVar.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=true, alignment=" + this.b + ", contentScale=" + this.c + ", alpha=" + this.d + ", colorFilter=" + this.e + ")";
    }
}
