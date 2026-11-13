package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class d21 extends DialogFragment {
    public Dialog n;
    public DialogInterface.OnCancelListener o;
    public AlertDialog p;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.o;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.n;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.p == null) {
            Activity activity = getActivity();
            ji2.m(activity);
            this.p = new AlertDialog.Builder(activity).create();
        }
        return this.p;
    }
}
