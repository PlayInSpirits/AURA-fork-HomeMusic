package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class sx4 extends gx2 {
    public final q82 a;

    public sx4(q82 r1) {
        this.a = r1;
    }

    @Override // defpackage.gx2
    public final cx2 d() {
        tx4 r0 = new tx4();
        r0.B = this.a;
        return r0;
    }

    @Override // defpackage.gx2
    public final void e(cx2 r1) {
        q82 r0 = this.a;
        ((tx4) r1).B = r0;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof sx4) == true) goto L9;
        return false;
    L9:
        if (h12.c(this.a, ((sx4) r4).a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.a + ")";
    }
}
