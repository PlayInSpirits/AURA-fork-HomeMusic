package defpackage;

import androidx.media3.session.MediaLibraryService;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class sr2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ tn2 o;

    public /* synthetic */ sr2(tn2 tn2Var, int i) {
        this.n = i;
        this.o = tn2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        tn2 tn2Var = this.o;
        switch (i) {
            case 0:
                xr2 xr2Var = tn2Var.u;
                if (xr2Var != null) {
                    tn2Var.s.r0(xr2Var);
                    break;
                }
                break;
            case 1:
                rm2 rm2Var = tn2Var.v;
                if (rm2Var != null) {
                    ((MediaLibraryService) rm2Var.o).k(tn2Var.k, false);
                    break;
                }
                break;
            case 2:
                tn2.a(tn2Var);
                break;
            default:
                tn2Var.C();
                break;
        }
    }
}
