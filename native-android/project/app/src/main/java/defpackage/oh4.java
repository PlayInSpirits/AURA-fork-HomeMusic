package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oh4 extends tl4 {
    public Object c;

    public oh4(long r1, Object r3) {
        super(r1);
        this.c = r3;
    }

    @Override // defpackage.tl4
    public final void a(tl4 r1) {
        r1.getClass();
        this.c = ((oh4) r1).c;
    }

    @Override // defpackage.tl4
    public final tl4 b(long r2) {
        return new oh4(r2, this.c);
    }
}
