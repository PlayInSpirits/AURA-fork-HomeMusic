package defpackage;

import com.eddyizm.tempus.interfaces.StarCallback;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class zi implements StarCallback {
    public final /* synthetic */ int n;
    public final /* synthetic */ bj o;

    public /* synthetic */ zi(bj bjVar, int i) {
        this.n = i;
        this.o = bjVar;
    }

    @Override // com.eddyizm.tempus.interfaces.StarCallback
    public final void onError() {
        int i = this.n;
        bj bjVar = this.o;
        switch (i) {
            case 0:
                bjVar.d.J(null, null, false, bjVar.g.getId());
                break;
            default:
                bjVar.d.J(null, null, true, bjVar.g.getId());
                break;
        }
    }
}
