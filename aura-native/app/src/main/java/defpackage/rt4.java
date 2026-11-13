package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class rt4 implements pv2 {
    public final long a;

    public rt4(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && rt4.class == obj.getClass() && this.a == ((rt4) obj).a;
    }

    public final int hashCode() {
        return si0.z(this.a) + 527;
    }

    public final String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.a;
    }
}
