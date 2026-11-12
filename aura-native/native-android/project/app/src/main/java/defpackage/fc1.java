package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fc1 extends fu {
    public final /* synthetic */ kc1 A;

    public fc1(kc1 kc1Var) {
        this.A = kc1Var;
    }

    @Override // defpackage.fu
    public final View H(int i) {
        kc1 kc1Var = this.A;
        View view = kc1Var.T;
        if (view != null) {
            return view.findViewById(i);
        }
        kf2.o(b11.l("Fragment ", kc1Var, " does not have a view"));
        return null;
    }

    @Override // defpackage.fu
    public final boolean I() {
        return this.A.T != null;
    }
}
