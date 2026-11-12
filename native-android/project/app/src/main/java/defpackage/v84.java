package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v84 extends w34 {
    public final /* synthetic */ lx u;
    public final /* synthetic */ ii0 v;
    public final /* synthetic */ mm1 w;

    public v84(mm1 mm1Var, lx lxVar, ii0 ii0Var) {
        this.w = mm1Var;
        this.u = lxVar;
        this.v = ii0Var;
    }

    @Override // defpackage.w34
    public final Object c() {
        ce3 ce3Var = this.w.d;
        lx lxVar = this.u;
        yl4 yl4Var = new yl4(lxVar);
        ed2.g.getAndIncrement();
        yl4Var.o = 0L;
        gi0 gi0Var = new gi0(yl4Var, this.v);
        try {
            gi0Var.b();
            Uri uri = lxVar.v;
            uri.getClass();
            dn1 dn1VarA = ce3Var.a(uri, gi0Var);
            f35.h(gi0Var);
            dn1VarA.getClass();
            return dn1VarA;
        } catch (Throwable th) {
            f35.h(gi0Var);
            throw th;
        }
    }
}
