package defpackage;

import com.eddyizm.tempus.model.Server;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class oa4 implements Runnable {
    public final /* synthetic */ int n;
    public final na4 o;
    public final Server p;

    public /* synthetic */ oa4(na4 na4Var, Server server, int i) {
        this.n = i;
        this.o = na4Var;
        this.p = server;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        Server server = this.p;
        na4 na4Var = this.o;
        int i2 = 1;
        int i3 = 0;
        switch (i) {
            case 0:
                xl.E((s24) na4Var.n, false, true, new ma4(na4Var, server, i2));
                break;
            case 1:
                xl.E((s24) na4Var.n, false, true, new ma4(na4Var, server, i3));
                break;
            default:
                xl.E((s24) na4Var.n, false, true, new ma4(na4Var, server, 2));
                break;
        }
    }
}
