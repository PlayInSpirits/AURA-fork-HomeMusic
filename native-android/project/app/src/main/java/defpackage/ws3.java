package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ws3 {
    public final gn2 a;
    public final long b;
    public final long c;

    public ws3(gn2 r1, long r2, long r4) {
        this.a = r1;
        this.b = r2;
        this.c = r4;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof ws3) == true) goto L8;
        return false;
    L8:
        ws3 r9 = (ws3) r8;
        if (this.b == r9.b) goto L11;
    L15:
        return false;
    L11:
        if (this.a.equals(r9.a) == false) goto L15;
        if (this.c != r9.c) goto L15;
        return true;
    }

    public final int hashCode() {
        long r0 = this.b;
        int r1 = (217 + ((int) (r0 ^ (r0 >>> 32)))) * 31;
        int r2 = (this.a.hashCode() + r1) * 31;
        long r3 = this.c;
        return r2 + ((int) ((r3 >>> 32) ^ r3));
    }
}
