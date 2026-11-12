package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ko4 extends pp0 {
    public Dialog B0;
    public DialogInterface.OnCancelListener C0;
    public AlertDialog D0;

    public ko4() {
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle r2) {
        Dialog r3 = this.B0;
        if (r3 != null) goto L9;
        this.s0 = false;
        if (this.D0 != null) goto L8;
        Context r0 = n();
        ji2.m(r0);
        this.D0 = new AlertDialog.Builder(r0).create();
    L8:
        return this.D0;
    L9:
        return r3;
    }

    @Override // defpackage.pp0, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface r1) {
        DialogInterface.OnCancelListener r0 = this.C0;
        if (r0 == null) goto L6;
        r0.onCancel(r1);
        return;
    }
}
