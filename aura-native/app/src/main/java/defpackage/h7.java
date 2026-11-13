package defpackage;

import com.eddyizm.tempus.interfaces.StarCallback;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class h7 implements StarCallback {
    public final /* synthetic */ int n;
    public final /* synthetic */ j7 o;

    public /* synthetic */ h7(j7 j7Var, int i) {
        this.n = i;
        this.o = j7Var;
    }

    @Override // com.eddyizm.tempus.interfaces.StarCallback
    public final void onError() {
        int i = this.n;
        j7 j7Var = this.o;
        switch (i) {
            case 0:
                j7Var.e.J(null, j7Var.g.getId(), false, null);
                break;
            default:
                j7Var.e.J(null, j7Var.g.getId(), true, null);
                break;
        }
    }
}
