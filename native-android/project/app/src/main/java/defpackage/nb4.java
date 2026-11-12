package defpackage;

import app.homemusic.R;
import com.eddyizm.tempus.interfaces.ScanCallback;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nb4 implements ScanCallback {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ nb4(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    @Override // com.eddyizm.tempus.interfaces.ScanCallback
    public final void onError(Exception exc) {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                ((nb4) obj).onError(exc);
                break;
            default:
                ((vb4) obj).h0("scan_library").x(exc.getMessage());
                break;
        }
    }

    @Override // com.eddyizm.tempus.interfaces.ScanCallback
    public final void onSuccess(boolean z, long j) {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                ((nb4) obj).onSuccess(z, j);
                break;
            default:
                vb4 vb4Var = (vb4) obj;
                vb4Var.h0("scan_library").x(vb4Var.t(R.string.settings_scan_result, Long.valueOf(j)));
                if (z) {
                    vb4.k0(vb4Var);
                }
                break;
        }
    }
}
