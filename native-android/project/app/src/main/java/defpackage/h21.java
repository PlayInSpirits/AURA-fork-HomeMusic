package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h21 extends j21 {
    public final cz p;
    public final /* synthetic */ l21 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h21(l21 l21Var, long j, cz czVar) {
        super(j);
        this.q = l21Var;
        this.p = czVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.p.E(this.q);
    }

    @Override // defpackage.j21
    public final String toString() {
        return super.toString() + this.p;
    }
}
