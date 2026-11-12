package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rx implements r02 {
    public final /* synthetic */ cx a;

    public /* synthetic */ rx(cx cxVar) {
        this.a = cxVar;
    }

    @Override // defpackage.r02
    public final k14 a(ev3 ev3Var) {
        oz3 oz3Var = ev3Var.e;
        if (!cx.h()) {
            nz3 nz3VarA = oz3Var.a();
            nz3VarA.a("Cache-Control", "public, only-if-cached, max-stale=" + this.a.a);
            nz3VarA.c.e("Pragma");
            oz3Var = new oz3(nz3VarA);
        }
        return ev3Var.b(oz3Var);
    }
}
