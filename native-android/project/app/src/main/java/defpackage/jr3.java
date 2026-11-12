package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jr3 implements lt2 {
    public final bi0 a;
    public final ss2 b;
    public yc5 c;
    public final i80 d;
    public int e;

    public jr3(bi0 r4, n51 r5) {
        ss2 r0 = new ss2(10, r5);
        yc5 r6 = new yc5(3);
        i80 r1 = new i80(28);
        this.a = r4;
        this.b = r0;
        this.c = r6;
        this.d = r1;
        this.e = 1048576;
    }

    @Override // defpackage.lt2
    public final /* bridge */ /* synthetic */ bq d(gn2 r1) {
        return f(r1);
    }

    @Override // defpackage.lt2
    public final lt2 e(yc5 r2) {
        rr2.s(r2, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.c = r2;
        return this;
    }

    public final kr3 f(gn2 r10) {
        r10.b.getClass();
        ww0 r5 = this.c.b(r10);
        int r7 = this.e;
        return new kr3(r10, this.a, this.b, r5, this.d, r7, null);
    }
}
