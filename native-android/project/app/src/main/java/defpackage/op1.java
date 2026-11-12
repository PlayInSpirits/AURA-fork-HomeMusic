package defpackage;

import com.eddyizm.tempus.interfaces.StarCallback;
import com.eddyizm.tempus.model.Favorite;
import com.eddyizm.tempus.viewmodel.b;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class op1 implements StarCallback {
    public final /* synthetic */ Favorite n;
    public final /* synthetic */ b o;

    public op1(b bVar, Favorite favorite) {
        this.o = bVar;
        this.n = favorite;
    }

    @Override // com.eddyizm.tempus.interfaces.StarCallback
    public final void onRefused() {
        this.o.g.C(this.n);
    }

    @Override // com.eddyizm.tempus.interfaces.StarCallback
    public final void onSuccess() {
        this.o.g.C(this.n);
    }
}
