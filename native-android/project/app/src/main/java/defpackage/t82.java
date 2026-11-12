package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class t82 extends gx2 {
    public final gf1 a;
    public final s82 b;
    public final boolean c;

    public t82(gf1 r1, s82 r2, boolean r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    @Override // defpackage.gx2
    public final cx2 d() {
        s82 r1 = this.b;
        boolean r2 = this.c;
        return new x82(this.a, r1, r2);
    }

    @Override // defpackage.gx2
    public final void e(cx2 r2) {
        x82 r3 = (x82) r2;
        r3.B = this.a;
        r3.C = this.b;
        boolean r0 = r3.D;
        boolean r1 = this.c;
        if (r0 != r1) goto L5;
        return;
    L5:
        r3.D = r1;
        r3.q0();
        fu.C(r3);
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof t82) == false) goto L19;
        t82 r5 = (t82) r4;
        gf1 r1 = r5.a;
        if (this.a == r1) goto L12;
        return false;
    L12:
        if (h12.c(this.b, r5.b) == true) goto L15;
        return false;
    L15:
        if (this.c == r5.c) goto L18;
        return false;
    L18:
        return true;
    L19:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        int r2 = (this.b.hashCode() + r0) * 31;
        int r3 = xa3.c((hb3.o.hashCode() + r2) * 31, 31, this.c);
        return Boolean.hashCode(false) + r3;
    }
}
