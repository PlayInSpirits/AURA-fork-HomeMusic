package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rt4 implements pv2 {
    public final long a;

    public rt4(long r1) {
        this.a = r1;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L13:
        return false;
    L8:
        if (rt4.class != r5.getClass()) goto L13;
        if (this.a != ((rt4) r5).a) goto L13;
        return true;
    }

    public final int hashCode() {
        return si0.z(this.a) + 527;
    }

    public final String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.a;
    }
}
