package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qn {
    public int a;
    public int b;
    public float c;
    public float d;
    public long e;
    public long f;
    public long g;
    public float h;
    public int i;

    public final float a(long r9) {
        long r0 = this.e;
        if (r9 >= r0) goto L5;
        return 0.0f;
    L5:
        long r4 = this.g;
        if (r4 < 0) goto L13;
        if (r9 < r4) goto L13;
        float r1 = this.h;
        return (hc2.b((r9 - r4) / this.i, 0.0f, 1.0f) * r1) + (1.0f - r1);
    L13:
        return hc2.b((r9 - r0) / this.a, 0.0f, 1.0f) * 0.5f;
    }
}
