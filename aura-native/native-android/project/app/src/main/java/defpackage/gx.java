package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gx extends zb1 {
    public final /* synthetic */ hx o;
    public final /* synthetic */ jw p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx(hx hxVar, jw jwVar, of4 of4Var) {
        super(of4Var);
        this.o = hxVar;
        this.p = jwVar;
    }

    @Override // defpackage.zb1, defpackage.of4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        hx hxVar = this.o;
        jw jwVar = this.p;
        synchronized (hxVar) {
            if (jwVar.n) {
                return;
            }
            jwVar.n = true;
            super.close();
            ((ll) this.p.o).b();
        }
    }
}
