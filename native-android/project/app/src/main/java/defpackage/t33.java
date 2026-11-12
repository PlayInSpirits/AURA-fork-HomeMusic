package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t33 {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public t33(int i, float f, float f2, float f3, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t33.class == obj.getClass()) {
            t33 t33Var = (t33) obj;
            return this.c == t33Var.c && this.d == t33Var.d && this.b == t33Var.b && this.a == t33Var.a && this.e == t33Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + f34.d(this.a, b11.d(b11.d(Float.hashCode(this.c) * 31, this.d, 31), this.b, 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ')';
    }
}
