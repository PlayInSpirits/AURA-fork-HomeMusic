package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ql4 extends tl4 {
    public y1 c;
    public int d;
    public int e;

    public ql4(long j, y1 y1Var) {
        super(j);
        this.c = y1Var;
    }

    @Override // defpackage.tl4
    public final void a(tl4 tl4Var) {
        synchronized (rr2.b) {
            tl4Var.getClass();
            this.c = ((ql4) tl4Var).c;
            this.d = ((ql4) tl4Var).d;
            this.e = ((ql4) tl4Var).e;
        }
    }

    @Override // defpackage.tl4
    public final tl4 b(long j) {
        return new ql4(j, this.c);
    }
}
