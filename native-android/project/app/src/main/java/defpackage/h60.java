package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h60 implements dx2 {
    public final dx2 a;
    public final dx2 b;

    public h60(dx2 r1, dx2 r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // defpackage.dx2
    public final boolean a(if1 r2) {
        if (this.a.a(r2) == true) goto L5;
        return false;
    L5:
        if (this.b.a(r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.dx2
    public final Object b(wf1 r2, Object r3) {
        Object r4 = this.a.b(r2, r3);
        return this.b.b(r2, r4);
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof h60) == false) goto L10;
        h60 r4 = (h60) r3;
        dx2 r0 = r4.a;
        if (this.a.equals(r0) == true) goto L7;
        return false;
    L7:
        if (h12.c(this.b, r4.b) == false) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode();
        return (this.b.hashCode() * 31) + r0;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("[");
        StringBuilder r4 = (StringBuilder) b(new d60(1, 0), r0);
        r4.append("]");
        return r4.toString();
    }
}
