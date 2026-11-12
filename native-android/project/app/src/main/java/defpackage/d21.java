package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class d21 extends DialogFragment {
    public Dialog n;
    public DialogInterface.OnCancelListener o;
    public AlertDialog p;

    public d21() {
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface r1) {
        DialogInterface.OnCancelListener r0 = this.o;
        if (r0 == null) goto L6;
        r0.onCancel(r1);
        return;
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle r2) {
        Dialog r3 = this.n;
        if (r3 != null) goto L9;
        setShowsDialog(false);
        if (this.p != null) goto L8;
        Activity r0 = getActivity();
        ji2.m(r0);
        this.p = new AlertDialog.Builder(r0).create();
    L8:
        return this.p;
    L9:
        return r3;
    }
}
