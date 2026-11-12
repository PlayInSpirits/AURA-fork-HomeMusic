package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class je4 {
    public final Object a;
    public final long b;
    public final z5 c;
    public final boolean d;

    public je4(ie4 r3) {
        this.a = r3.a;
        this.b = r3.b;
        this.c = r3.c;
        this.d = r3.d;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof je4) == true) goto L8;
        return false;
    L8:
        je4 r9 = (je4) r8;
        if (this.a.equals(r9.a) == true) goto L11;
    L17:
        return false;
    L11:
        if (this.b != r9.b) goto L17;
        if (this.c.equals(r9.c) == false) goto L17;
        if (this.d != r9.d) goto L17;
        return true;
    }

    public final int hashCode() {
        int r0 = (this.a.hashCode() + 217) * 31;
        long r2 = this.b;
        int r1 = (r0 + ((int) (r2 ^ (r2 >>> 32)))) * 31;
        return ((this.c.hashCode() + r1) * 31) + (this.d ? 1 : 0);
    }
}
