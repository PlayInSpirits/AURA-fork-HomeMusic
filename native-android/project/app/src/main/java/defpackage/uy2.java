package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uy2 implements pv2 {
    public final long a;
    public final long b;
    public final long c;

    public uy2(long r1, long r3, long r5) {
        this.a = r1;
        this.b = r3;
        this.c = r5;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof uy2) == true) goto L8;
        return false;
    L8:
        uy2 r9 = (uy2) r8;
        if (this.a == r9.a) goto L11;
    L15:
        return false;
    L11:
        if (this.b != r9.b) goto L15;
        if (this.c != r9.c) goto L15;
        return true;
    }

    public final int hashCode() {
        int r0 = (si0.z(this.a) + 527) * 31;
        int r1 = (si0.z(this.b) + r0) * 31;
        return si0.z(this.c) + r1;
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }
}
