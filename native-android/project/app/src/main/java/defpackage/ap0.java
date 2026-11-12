package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ap0 {
    public final long a;
    public final long b;

    public ap0(long r1, long r3) {
        this.a = r1;
        this.b = r3;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L5;
        return true;
    L5:
        if ((r5 instanceof ap0) == false) goto L17;
        ap0 r6 = (ap0) r5;
        long r0 = r6.a;
        if (n02.a(this.a, r0) == true) goto L11;
        return false;
    L11:
        if (this.b != r6.b) goto L14;
        return true;
    L14:
        return false;
    L17:
        return false;
    }

    public final int hashCode() {
        int r0 = Long.hashCode(this.a) * 31;
        return Long.hashCode(this.b) + r0;
    }
}
