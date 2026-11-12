package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yc0 {
    public final int a;
    public final long b;
    public final zc0 c;
    public final oz4 d;

    public yc0(int r1, long r2, zc0 r4, oz4 r5) {
        this.a = r1;
        this.b = r2;
        this.c = r4;
        this.d = r5;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L5;
        return true;
    L5:
        if ((r5 instanceof yc0) == false) goto L22;
        yc0 r6 = (yc0) r5;
        if (this.a == r6.a) goto L11;
        return false;
    L11:
        if (this.b == r6.b) goto L14;
        return false;
    L14:
        if (this.c == r6.c) goto L17;
        return false;
    L17:
        if (h12.c(this.d, r6.d) == true) goto L20;
        return false;
    L20:
        return true;
    L22:
        return false;
    }

    public final int hashCode() {
        int r0 = xa3.b(Integer.hashCode(this.a) * 31, 31, this.b);
        int r2 = (this.c.hashCode() + r0) * 31;
        oz4 r4 = this.d;
        if (r4 != null) goto L5;
        int r5 = 0;
    L7:
        return r2 + r5;
    L5:
        r5 = r4.hashCode();
        goto L7
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ")";
    }
}
