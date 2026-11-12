package defpackage;

import com.eddyizm.tempus.interfaces.StarCallback;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uj implements StarCallback {
    public final /* synthetic */ int n;
    public final /* synthetic */ wj o;

    public /* synthetic */ uj(wj wjVar, int i) {
        this.n = i;
        this.o = wjVar;
    }

    @Override // com.eddyizm.tempus.interfaces.StarCallback
    public final void onError() {
        int i = this.n;
        wj wjVar = this.o;
        switch (i) {
            case 0:
                wjVar.d.J(null, null, false, wjVar.e.getId());
                break;
            default:
                wjVar.d.J(null, null, true, wjVar.e.getId());
                break;
        }
    }
}
