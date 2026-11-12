package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yy4 implements wd {
    public final int a;
    public final ry0 b;

    public yy4(int r1, ry0 r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // defpackage.wd
    public final g45 a() {
        return new x7(this.a, this.b);
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof yy4) == false) goto L10;
        yy4 r4 = (yy4) r3;
        if (r4.a == this.a) goto L7;
        return false;
    L7:
        if (h12.c(r4.b, this.b) == false) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a * 31;
        return (this.b.hashCode() + r0) * 31;
    }
}
