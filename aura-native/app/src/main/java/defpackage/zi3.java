package defpackage;

import com.eddyizm.tempus.interfaces.StarCallback;
import com.eddyizm.tempus.subsonic.models.Child;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class zi3 implements StarCallback {
    public final /* synthetic */ int n;
    public final /* synthetic */ Child o;
    public final /* synthetic */ aj3 p;

    public /* synthetic */ zi3(aj3 aj3Var, Child child, int i) {
        this.n = i;
        this.p = aj3Var;
        this.o = child;
    }

    @Override // com.eddyizm.tempus.interfaces.StarCallback
    public final void onError() {
        int i = this.n;
        Child child = this.o;
        aj3 aj3Var = this.p;
        switch (i) {
            case 0:
                aj3Var.g.J(child.getId(), null, false, null);
                break;
            default:
                aj3Var.g.J(child.getId(), null, true, null);
                break;
        }
    }
}
