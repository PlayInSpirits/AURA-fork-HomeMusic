package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qf2 {
    public final m45 a;
    public final m45 b;
    public long c;

    public qf2() {
        this.a = new m45();
        this.b = new m45();
    }

    public final void a(long r3, long r5) {
        float r0 = Float.intBitsToFloat((int) (r5 >> 32));
        this.a.a(r3, r0);
        float r6 = Float.intBitsToFloat((int) (r5 & 4294967295L));
        this.b.a(r3, r6);
    }
}
