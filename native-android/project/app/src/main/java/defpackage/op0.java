package defpackage;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class op0 extends fu {
    public final /* synthetic */ fc1 A;
    public final /* synthetic */ pp0 B;

    public op0(pp0 r1, fc1 r2) {
        this.B = r1;
        this.A = r2;
    }

    @Override // defpackage.fu
    public final View H(int r3) {
        fc1 r0 = this.A;
        if (r0.I() == true) goto L5;
        Dialog r2 = this.B.w0;
        if (r2 != null) goto L9;
        return null;
    L9:
        return r2.findViewById(r3);
    L5:
        return r0.H(r3);
    }

    @Override // defpackage.fu
    public final boolean I() {
        if (this.A.I() == false) goto L5;
        return true;
    L5:
        if (this.B.A0 == true) goto L11;
        return false;
    L11:
        return true;
    }
}
