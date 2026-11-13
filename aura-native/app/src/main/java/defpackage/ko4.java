package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class ko4 extends pp0 {
    public Dialog B0;
    public DialogInterface.OnCancelListener C0;
    public AlertDialog D0;

    @Override // defpackage.pp0
    public final Dialog j0(Bundle bundle) {
        Dialog dialog = this.B0;
        if (dialog != null) {
            return dialog;
        }
        this.s0 = false;
        if (this.D0 == null) {
            Context n = n();
            ji2.m(n);
            this.D0 = new AlertDialog.Builder(n).create();
        }
        return this.D0;
    }

    @Override // defpackage.pp0, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.C0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
