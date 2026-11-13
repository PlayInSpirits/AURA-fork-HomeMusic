package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
final class to extends gx2 {
    public final long a;
    public final float b;
    public final sp1 c;

    public to(long j) {
        sp1 sp1Var = kb4.b;
        this.a = j;
        this.b = 1.0f;
        this.c = sp1Var;
    }

    @Override // defpackage.gx2
    public final cx2 d() {
        vo voVar = new vo();
        voVar.B = this.a;
        voVar.C = this.c;
        voVar.D = 9205357640488583168L;
        return voVar;
    }

    @Override // defpackage.gx2
    public final void e(cx2 cx2Var) {
        vo voVar = (vo) cx2Var;
        voVar.B = this.a;
        sp1 sp1Var = voVar.C;
        sp1 sp1Var2 = this.c;
        if (!h12.c(sp1Var, sp1Var2)) {
            voVar.C = sp1Var2;
            fu.C(voVar);
        }
        jz4.z(voVar);
    }

    public final boolean equals(Object obj) {
        to toVar = obj instanceof to ? (to) obj : null;
        return toVar != null && x40.c(this.a, toVar.a) && this.b == toVar.b && h12.c(this.c, toVar.c);
    }

    public final int hashCode() {
        int i = x40.h;
        return this.c.hashCode() + b11.d(Long.hashCode(this.a) * 961, this.b, 31);
    }
}
