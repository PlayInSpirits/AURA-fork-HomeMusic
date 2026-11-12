package defpackage;

import com.eddyizm.tempus.interfaces.ScanCallback;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mb4 implements ScanCallback {
    public final /* synthetic */ pz1 n;

    public mb4(pz1 pz1Var) {
        this.n = pz1Var;
    }

    @Override // com.eddyizm.tempus.interfaces.ScanCallback
    public final void onError(Exception exc) {
        this.n.onError(exc);
    }

    @Override // com.eddyizm.tempus.interfaces.ScanCallback
    public final void onSuccess(boolean z, long j) {
        this.n.onSuccess(z, j);
    }
}
