package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mh4 extends tl4 {
    public long c;

    public mh4(long r1, long r3) {
        super(r1);
        this.c = r3;
    }

    @Override // defpackage.tl4
    public final void a(tl4 r3) {
        r3.getClass();
        this.c = ((mh4) r3).c;
    }

    @Override // defpackage.tl4
    public final tl4 b(long r4) {
        return new mh4(r4, this.c);
    }
}
