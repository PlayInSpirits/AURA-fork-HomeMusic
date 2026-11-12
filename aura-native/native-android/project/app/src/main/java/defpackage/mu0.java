package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mu0 {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof mu0) {
            return this.a == ((mu0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long j = this.a;
        return j != 9205357640488583168L ? f34.h("(", ku0.c(Float.intBitsToFloat((int) (j >> 32))), ", ", ku0.c(Float.intBitsToFloat((int) (4294967295L & j))), ")") : "DpOffset.Unspecified";
    }
}
