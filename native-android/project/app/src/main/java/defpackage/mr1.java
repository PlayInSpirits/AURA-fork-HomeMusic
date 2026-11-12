package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mr1 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ wz2 o;

    public /* synthetic */ mr1(wz2 wz2Var, int i) {
        this.n = i;
        this.o = wz2Var;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        int i = this.n;
        wz2 wz2Var = this.o;
        String str = (String) obj;
        switch (i) {
            case 0:
                nz3 nz3VarF = b11.f(str);
                nz3VarF.d(str.concat("/api/assistant/tasks"));
                nz3VarF.b("POST", wz2Var);
                return new oz3(nz3VarF);
            default:
                nz3 nz3VarF2 = b11.f(str);
                nz3VarF2.d(str.concat("/api/uploads"));
                nz3VarF2.b("POST", wz2Var);
                return new oz3(nz3VarF2);
        }
    }
}
