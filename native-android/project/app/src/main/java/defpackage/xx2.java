package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xx2 implements pv2 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public xx2(long r1, long r3, long r5, long r7, long r9) {
        this.a = r1;
        this.b = r3;
        this.c = r5;
        this.d = r7;
        this.e = r9;
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (r7 != null) goto L8;
    L21:
        return false;
    L8:
        if (xx2.class != r7.getClass()) goto L21;
        xx2 r8 = (xx2) r7;
        if (this.a != r8.a) goto L21;
        if (this.b != r8.b) goto L21;
        if (this.c != r8.c) goto L21;
        if (this.d != r8.d) goto L21;
        if (this.e != r8.e) goto L21;
        return true;
    }

    public final int hashCode() {
        int r0 = (si0.z(this.a) + 527) * 31;
        int r1 = (si0.z(this.b) + r0) * 31;
        int r2 = (si0.z(this.c) + r1) * 31;
        int r3 = (si0.z(this.d) + r2) * 31;
        return si0.z(this.e) + r3;
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }
}
