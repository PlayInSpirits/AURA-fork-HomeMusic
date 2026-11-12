package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mp0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ pp0 n;

    public mp0(pp0 r1) {
        this.n = r1;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface r1) {
        pp0 r0 = this.n;
        Dialog r2 = r0.w0;
        if (r2 == null) goto L6;
        r0.onDismiss(r2);
        return;
    }
}
