package defpackage;

import com.eddyizm.tempus.interfaces.ScanCallback;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mb4 implements ScanCallback {
    public final /* synthetic */ pz1 n;

    public mb4(pz1 r1) {
        this.n = r1;
    }

    @Override // com.eddyizm.tempus.interfaces.ScanCallback
    public final void onError(Exception r1) {
        this.n.onError(r1);
    }

    @Override // com.eddyizm.tempus.interfaces.ScanCallback
    public final void onSuccess(boolean r1, long r2) {
        this.n.onSuccess(r1, r2);
    }
}
