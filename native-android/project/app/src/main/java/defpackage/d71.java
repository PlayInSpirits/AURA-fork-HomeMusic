package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class d71 extends gx2 {
    public final lq0 a;

    public d71(lq0 r1) {
        this.a = r1;
    }

    @Override // defpackage.gx2
    public final cx2 d() {
        e71 r0 = new e71();
        r0.B = this.a;
        r0.C = 1.0f;
        return r0;
    }

    @Override // defpackage.gx2
    public final void e(cx2 r1) {
        e71 r2 = (e71) r1;
        r2.B = this.a;
        r2.C = 1.0f;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L6;
        return true;
    L6:
        if ((r3 instanceof d71) == false) goto L13;
        lq0 r4 = ((d71) r3).a;
        if (this.a == r4) goto L12;
        return false;
    L12:
        return true;
    L13:
        return false;
    }

    public final int hashCode() {
        int r1 = this.a.hashCode() * 31;
        return Float.hashCode(1.0f) + r1;
    }
}
