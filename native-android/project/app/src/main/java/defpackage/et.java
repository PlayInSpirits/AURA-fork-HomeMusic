package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class et extends gx2 {
    public final if1 a;

    public et(if1 r1) {
        this.a = r1;
    }

    @Override // defpackage.gx2
    public final cx2 d() {
        ft r0 = new ft();
        r0.B = this.a;
        return r0;
    }

    @Override // defpackage.gx2
    public final void e(cx2 r2) {
        ft r3 = (ft) r2;
        if1 r1 = this.a;
        r3.B = r1;
        if (r3.n.A == false) goto L10;
        f63 r4 = j51.M(r3, 2).I;
        if (r4 == null) goto L9;
        r4.Y0(r1, true);
        return;
    L9:
        return;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof et) == true) goto L8;
        return false;
    L8:
        if1 r5 = ((et) r4).a;
        if (this.a == r5) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
