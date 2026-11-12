package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fc1 extends fu {
    public final /* synthetic */ kc1 A;

    public fc1(kc1 r1) {
        this.A = r1;
    }

    @Override // defpackage.fu
    public final View H(int r2) {
        kc1 r1 = this.A;
        View r0 = r1.T;
        if (r0 != null) goto L5;
        kf2.o(b11.l("Fragment ", r1, " does not have a view"));
        return null;
    L5:
        return r0.findViewById(r2);
    }

    @Override // defpackage.fu
    public final boolean I() {
        if (this.A.T == null) goto L6;
        return true;
    L6:
        return false;
    }
}
