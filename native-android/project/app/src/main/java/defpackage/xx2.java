package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xx2 implements pv2 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public xx2(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xx2.class == obj.getClass()) {
            xx2 xx2Var = (xx2) obj;
            if (this.a == xx2Var.a && this.b == xx2Var.b && this.c == xx2Var.c && this.d == xx2Var.d && this.e == xx2Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return si0.z(this.e) + ((si0.z(this.d) + ((si0.z(this.c) + ((si0.z(this.b) + ((si0.z(this.a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }
}
