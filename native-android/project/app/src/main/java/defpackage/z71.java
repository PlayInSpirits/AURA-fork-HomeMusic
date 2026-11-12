package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z71 {
    public final float a;
    public final float b;
    public final long c;

    public z71(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z71)) {
            return false;
        }
        z71 z71Var = (z71) obj;
        return Float.compare(this.a, z71Var.a) == 0 && Float.compare(this.b, z71Var.b) == 0 && this.c == z71Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + b11.d(Float.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return b11.p(b11.r("FlingInfo(initialVelocity=", this.a, ", distance=", this.b, ", duration="), this.c, ")");
    }
}
