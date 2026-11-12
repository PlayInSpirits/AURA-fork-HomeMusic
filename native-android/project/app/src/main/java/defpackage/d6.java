package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d6 {
    public final long a;
    public final long b;

    public d6(long r1, long r3) {
        this.a = r1;
        this.b = r3;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof d6) == true) goto L8;
        return false;
    L8:
        d6 r9 = (d6) r8;
        if (this.a == r9.a) goto L11;
    L13:
        return false;
    L11:
        if (this.b != r9.b) goto L13;
        return true;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
