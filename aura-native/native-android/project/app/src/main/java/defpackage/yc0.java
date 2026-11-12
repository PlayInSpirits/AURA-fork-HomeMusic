package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yc0 {
    public final int a;
    public final long b;
    public final zc0 c;
    public final oz4 d;

    public yc0(int i, long j, zc0 zc0Var, oz4 oz4Var) {
        this.a = i;
        this.b = j;
        this.c = zc0Var;
        this.d = oz4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc0)) {
            return false;
        }
        yc0 yc0Var = (yc0) obj;
        return this.a == yc0Var.a && this.b == yc0Var.b && this.c == yc0Var.c && h12.c(this.d, yc0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + xa3.b(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        oz4 oz4Var = this.d;
        return iHashCode + (oz4Var == null ? 0 : oz4Var.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ")";
    }
}
