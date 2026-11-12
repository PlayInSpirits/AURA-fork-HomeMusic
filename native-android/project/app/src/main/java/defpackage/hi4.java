package defpackage;

import com.eddyizm.tempus.interfaces.StarCallback;
import com.eddyizm.tempus.subsonic.models.Child;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hi4 implements StarCallback {
    public final /* synthetic */ int n;
    public final /* synthetic */ Child o;
    public final /* synthetic */ ii4 p;

    public /* synthetic */ hi4(ii4 ii4Var, Child child, int i) {
        this.n = i;
        this.p = ii4Var;
        this.o = child;
    }

    @Override // com.eddyizm.tempus.interfaces.StarCallback
    public final void onError() {
        switch (this.n) {
            case 0:
                this.p.f.J(this.o.getId(), null, false, null);
                break;
            default:
                this.p.f.J(this.o.getId(), null, true, null);
                break;
        }
    }
}
