package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bm1 {
    public final long a;
    public final long b;
    public final float c;
    public final long d;
    public final long e;

    public bm1(long r1, long r3, float r5, long r6, long r8) {
        this.a = r1;
        this.b = r3;
        this.c = r5;
        this.d = r6;
        this.e = r8;
    }

    public final String toString() {
        return "HistoricalChange(uptimeMillis=" + this.a + ", position=" + g83.g(this.b) + ", scaleFactor=" + this.c + ", panOffset=" + g83.g(this.d) + ")";
    }
}
