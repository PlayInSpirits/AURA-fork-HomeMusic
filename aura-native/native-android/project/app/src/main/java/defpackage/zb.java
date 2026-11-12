package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zb implements bh3 {
    public final int n;

    public zb(int i) {
        this.n = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zb) && this.n == ((zb) obj).n;
    }

    public final int hashCode() {
        return Integer.hashCode(this.n);
    }

    public final String toString() {
        return b11.j(this.n, "AndroidFontResolveInterceptor(fontWeightAdjustment=", ")");
    }
}
