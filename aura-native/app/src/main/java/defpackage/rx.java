package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class rx implements r02 {
    public final /* synthetic */ cx a;

    public /* synthetic */ rx(cx cxVar) {
        this.a = cxVar;
    }

    @Override // defpackage.r02
    public final k14 a(ev3 ev3Var) {
        oz3 oz3Var = ev3Var.e;
        if (!cx.h()) {
            nz3 a = oz3Var.a();
            a.a("Cache-Control", "public, only-if-cached, max-stale=" + this.a.a);
            a.c.e("Pragma");
            oz3Var = new oz3(a);
        }
        return ev3Var.b(oz3Var);
    }
}
