package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class uy2 implements pv2 {
    public final long a;
    public final long b;
    public final long c;

    public uy2(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy2)) {
            return false;
        }
        uy2 uy2Var = (uy2) obj;
        return this.a == uy2Var.a && this.b == uy2Var.b && this.c == uy2Var.c;
    }

    public final int hashCode() {
        return si0.z(this.c) + ((si0.z(this.b) + ((si0.z(this.a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }
}
