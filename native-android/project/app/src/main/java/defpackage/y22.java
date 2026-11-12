package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y22 extends u22 {
    public final a32 u;
    public final z22 v;
    public final d20 w;
    public final Object x;

    public y22(a32 r1, z22 r2, d20 r3, Object r4) {
        this.u = r1;
        this.v = r2;
        this.w = r3;
        this.x = r4;
    }

    @Override // defpackage.u22
    public final boolean r() {
        return false;
    }

    @Override // defpackage.u22
    public final void s(Throwable r6) {
        d20 r7 = this.w;
        d20 r0 = a32.V(r7);
        a32 r1 = this.u;
        z22 r2 = this.v;
        Object r5 = this.x;
        if (r0 != null) goto L5;
    L7:
        r2.n.e(new sb2(2), 2);
        d20 r8 = a32.V(r7);
        if (r8 != null) goto L10;
    L12:
        r1.l(r1.B(r2, r5));
        return;
    L10:
        if (r1.i0(r2, r8, r5) == false) goto L12;
        return;
    L5:
        if (r1.i0(r2, r0, r5) == false) goto L7;
    }
}
