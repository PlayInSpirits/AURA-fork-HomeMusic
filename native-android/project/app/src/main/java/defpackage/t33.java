package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t33 {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public t33(int r1, float r2, float r3, float r4, long r5) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L23:
        return false;
    L8:
        if (t33.class != r5.getClass()) goto L23;
        t33 r6 = (t33) r5;
        if (this.c != r6.c) goto L23;
        if (this.d != r6.d) goto L23;
        if (this.b != r6.b) goto L23;
        if (this.a == r6.a) goto L20;
        return false;
    L20:
        if (this.e == r6.e) goto L22;
        return false;
    L22:
        return true;
    }

    public final int hashCode() {
        int r0 = b11.d(b11.d(Float.hashCode(this.c) * 31, this.d, 31), this.b, 31);
        int r1 = f34.d(this.a, r0, 31);
        return Long.hashCode(this.e) + r1;
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ')';
    }
}
