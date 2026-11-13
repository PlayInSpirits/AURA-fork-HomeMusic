package defpackage;

import com.eddyizm.tempus.model.Server;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class ma4 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ na4 o;
    public final /* synthetic */ Server p;

    public /* synthetic */ ma4(na4 na4Var, Server server, int i) {
        this.n = i;
        this.o = na4Var;
        this.p = server;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        int i = this.n;
        Server server = this.p;
        na4 na4Var = this.o;
        x34 x34Var = (x34) obj;
        switch (i) {
            case 0:
                ((q20) na4Var.o).I(x34Var, server);
                break;
            case 1:
                ((h61) na4Var.p).y(x34Var, server);
                break;
            default:
                ((h61) na4Var.q).y(x34Var, server);
                break;
        }
        return null;
    }
}
