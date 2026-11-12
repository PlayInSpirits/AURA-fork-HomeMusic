package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vh0 {
    public long a;
    public float b;

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof vh0) == true) goto L8;
        return false;
    L8:
        vh0 r9 = (vh0) r8;
        if (this.a == r9.a) goto L12;
        return false;
    L12:
        if (Float.compare(this.b, r9.b) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r0 = Long.hashCode(this.a) * 31;
        return Float.hashCode(this.b) + r0;
    }

    public final String toString() {
        return "DataPointAtTime(time=" + this.a + ", dataPoint=" + this.b + ")";
    }
}
