package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mu0 {
    public final long a;

    public /* synthetic */ mu0(long r1) {
        this.a = r1;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof mu0) == false) goto L11;
        long r0 = ((mu0) r3).a;
        if (this.a == r0) goto L9;
        return false;
    L9:
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long r2 = this.a;
        if (r2 != 9205357640488583168L) goto L5;
        return "DpOffset.Unspecified";
    L5:
        return f34.h("(", ku0.c(Float.intBitsToFloat((int) (r2 >> 32))), ", ", ku0.c(Float.intBitsToFloat((int) (4294967295L & r2))), ")");
    }
}
