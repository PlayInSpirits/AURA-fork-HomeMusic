package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class oh4 extends tl4 {
    public Object c;

    public oh4(long j, Object obj) {
        super(j);
        this.c = obj;
    }

    @Override // defpackage.tl4
    public final void a(tl4 tl4Var) {
        tl4Var.getClass();
        this.c = ((oh4) tl4Var).c;
    }

    @Override // defpackage.tl4
    public final tl4 b(long j) {
        return new oh4(j, this.c);
    }
}
