package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u50 implements as4 {
    public final long n;

    public u50(long j) {
        this.n = j;
        if (j != 16) {
            return;
        }
        dz1.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.as4
    public final float b() {
        return x40.d(this.n);
    }

    @Override // defpackage.as4
    public final long c() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u50) && x40.c(this.n, ((u50) obj).n);
    }

    @Override // defpackage.as4
    public final uo f() {
        return null;
    }

    public final int hashCode() {
        int i = x40.h;
        return Long.hashCode(this.n);
    }

    public final String toString() {
        return xa3.h("ColorStyle(value=", x40.h(this.n), ")");
    }
}
