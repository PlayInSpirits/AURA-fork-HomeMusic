package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ql4 extends tl4 {
    public y1 c;
    public int d;
    public int e;

    public ql4(long r1, y1 r3) {
        super(r1);
        this.c = r3;
    }

    @Override // defpackage.tl4
    public final void a(tl4 r3) {
        Object r0 = rr2.b;
        monitor-enter(r0);
        r3.getClass();     // Catch: Throwable -> L7
        this.c = ((ql4) r3).c;     // Catch: Throwable -> L7
        this.d = ((ql4) r3).d;     // Catch: Throwable -> L7
        this.e = ((ql4) r3).e;     // Catch: Throwable -> L7
        monitor-exit(r0);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.tl4
    public final tl4 b(long r2) {
        return new ql4(r2, this.c);
    }
}
