package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zb implements bh3 {
    public final int n;

    public zb(int r1) {
        this.n = r1;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof zb) == true) goto L9;
        return false;
    L9:
        if (this.n == ((zb) r4).n) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.n);
    }

    public final String toString() {
        return b11.j(this.n, "AndroidFontResolveInterceptor(fontWeightAdjustment=", ")");
    }
}
