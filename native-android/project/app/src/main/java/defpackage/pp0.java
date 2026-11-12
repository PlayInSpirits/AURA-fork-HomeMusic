package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class pp0 extends kc1 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public boolean A0;
    public Handler l0;
    public final g5 m0;
    public final lp0 n0;
    public final mp0 o0;
    public int p0;
    public int q0;
    public boolean r0;
    public boolean s0;
    public int t0;
    public boolean u0;
    public final np0 v0;
    public Dialog w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    public pp0() {
        this.m0 = new g5(6, this);
        this.n0 = new lp0(this);
        this.o0 = new mp0(this);
        this.p0 = 0;
        this.q0 = 0;
        this.r0 = true;
        this.s0 = true;
        this.t0 = -1;
        this.v0 = new np0(0, this);
        this.A0 = false;
    }

    @Override // defpackage.kc1
    public final void C() {
        this.R = true;
    }

    @Override // defpackage.kc1
    public final void E(Context r2) {
        super.E(r2);
        this.e0.f(this.v0);
        if (this.z0 == true) goto L6;
        this.y0 = false;
        return;
    }

    @Override // defpackage.kc1
    public void F(Bundle r4) {
        super.F(r4);
        this.l0 = new Handler();
        if (this.K != 0) goto L5;
        boolean r0 = true;
    L6:
        this.s0 = r0;
        if (r4 == null) goto L10;
        this.p0 = r4.getInt("android:style", 0);
        this.q0 = r4.getInt("android:theme", 0);
        this.r0 = r4.getBoolean("android:cancelable", true);
        this.s0 = r4.getBoolean("android:showsDialog", this.s0);
        this.t0 = r4.getInt("android:backStackId", -1);
        return;
    L10:
        return;
    L5:
        r0 = false;
        goto L6
    }

    @Override // defpackage.kc1
    public void J() {
        this.R = true;
        Dialog r1 = this.w0;
        if (r1 == null) goto L9;
        this.x0 = true;
        r1.setOnDismissListener(null);
        this.w0.dismiss();
        if (this.y0 == true) goto L7;
        onDismiss(this.w0);
    L7:
        this.w0 = null;
        this.A0 = false;
        return;
    }

    @Override // defpackage.kc1
    public final void K() {
        this.R = true;
        if (this.z0 == false) goto L5;
    L7:
        this.e0.j(this.v0);
        return;
    L5:
        if (this.y0 == true) goto L7;
        this.y0 = true;
        goto L7
    }

    @Override // defpackage.kc1
    public final LayoutInflater L(Bundle r7) {
        LayoutInflater r0 = super.L(r7);
        boolean r1 = this.s0;
        if (r1 == false) goto L32;
        if (this.u0 == true) goto L32;
        if (r1 == false) goto L25;
        if (this.A0 == true) goto L25;
        this.u0 = true;     // Catch: Throwable -> L17
        Dialog r8 = j0(r7);     // Catch: Throwable -> L17
        this.w0 = r8;     // Catch: Throwable -> L17
        if (this.s0 == false) goto L20;
        l0(r8, this.p0);     // Catch: Throwable -> L17
        Context r9 = n();     // Catch: Throwable -> L17
        if (r9 == null) goto L19;
        this.w0.setOwnerActivity((Activity) r9);     // Catch: Throwable -> L17
    L19:
        this.w0.setCancelable(this.r0);     // Catch: Throwable -> L17
        this.w0.setOnCancelListener(this.n0);     // Catch: Throwable -> L17
        this.w0.setOnDismissListener(this.o0);     // Catch: Throwable -> L17
        this.A0 = true;     // Catch: Throwable -> L17
    L21:
        this.u0 = false;
        goto L25
    L20:
        this.w0 = null;     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        this.u0 = false;
        throw th;
    L25:
        if (ld1.I(2) == false) goto L27;
        Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
    L27:
        Dialog r6 = this.w0;
        if (r6 != null) goto L30;
    L38:
        return r0;
    L30:
        return r0.cloneInContext(r6.getContext());
    L32:
        if (ld1.I(2) == false) goto L38;
        String r10 = "getting layout inflater for DialogFragment " + this;
        if (this.s0 == true) goto L37;
        Log.d("FragmentManager", "mShowsDialog = false: ".concat(r10));
        return r0;
    L37:
        Log.d("FragmentManager", "mCreatingDialog = true: ".concat(r10));
        goto L38
    }

    @Override // defpackage.kc1
    public void Q(Bundle r4) {
        Dialog r0 = this.w0;
        if (r0 == null) goto L5;
        Bundle r1 = r0.onSaveInstanceState();
        r1.putBoolean("android:dialogShowing", false);
        r4.putBundle("android:savedDialogState", r1);
    L5:
        int r2 = this.p0;
        if (r2 == 0) goto L8;
        r4.putInt("android:style", r2);
    L8:
        int r3 = this.q0;
        if (r3 == 0) goto L11;
        r4.putInt("android:theme", r3);
    L11:
        boolean r5 = this.r0;
        if (r5 == true) goto L14;
        r4.putBoolean("android:cancelable", r5);
    L14:
        boolean r6 = this.s0;
        if (r6 == true) goto L17;
        r4.putBoolean("android:showsDialog", r6);
    L17:
        int r7 = this.t0;
        if (r7 == (-1)) goto L21;
        r4.putInt("android:backStackId", r7);
        return;
    }

    @Override // defpackage.kc1
    public void R() {
        this.R = true;
        Dialog r0 = this.w0;
        if (r0 == null) goto L6;
        this.x0 = false;
        r0.show();
        View r1 = this.w0.getWindow().getDecorView();
        r1.getClass();
        r1.setTag(R.id.view_tree_lifecycle_owner, this);
        r1.setTag(R.id.view_tree_view_model_store_owner, this);
        r1.setTag(R.id.view_tree_saved_state_registry_owner, this);
        return;
    }

    @Override // defpackage.kc1
    public void S() {
        this.R = true;
        Dialog r1 = this.w0;
        if (r1 == null) goto L6;
        r1.hide();
        return;
    }

    @Override // defpackage.kc1
    public final void U(Bundle r2) {
        this.R = true;
        if (this.w0 == null) goto L9;
        if (r2 == null) goto L10;
        Bundle r3 = r2.getBundle("android:savedDialogState");
        if (r3 == null) goto L11;
        this.w0.onRestoreInstanceState(r3);
        return;
    L11:
        return;
    L10:
        return;
    }

    @Override // defpackage.kc1
    public final void V(LayoutInflater r1, ViewGroup r2, Bundle r3) {
        super.V(r1, r2, r3);
        if (this.T == null) goto L5;
        return;
    L5:
        if (this.w0 == null) goto L12;
        if (r3 == null) goto L13;
        Bundle r4 = r3.getBundle("android:savedDialogState");
        if (r4 == null) goto L14;
        this.w0.onRestoreInstanceState(r4);
        return;
    L14:
        return;
    L13:
        return;
    }

    public void h0() {
        i0(false, false);
    }

    @Override // defpackage.kc1
    public final fu i() {
        return new op0(this, new fc1(this));
    }

    public final void i0(boolean r5, boolean r6) {
        if (this.y0 == false) goto L5;
        return;
    L5:
        this.y0 = true;
        this.z0 = false;
        Dialog r2 = this.w0;
        if (r2 == null) goto L13;
        r2.setOnDismissListener(null);
        this.w0.dismiss();
        if (r6 == true) goto L13;
        if (Looper.myLooper() != this.l0.getLooper()) goto L12;
        onDismiss(this.w0);
        goto L13
    L12:
        this.l0.post(this.m0);
    L13:
        this.x0 = true;
        if (this.t0 < 0) goto L21;
        ld1 r7 = q();
        int r0 = this.t0;
        if (r0 < 0) goto L19;
        r7.w(new jd1(r7, null, r0), r5);
        this.t0 = -1;
        return;
    L19:
        kf2.n(f34.f(r0, "Bad id: "));
        return;
    L21:
        po r3 = new po(q());
        r3.p = true;
        r3.i(this);
        if (r5 == false) goto L25;
        r3.e(true);
        return;
    L25:
        r3.e(false);
    }

    public Dialog j0(Bundle r2) {
        if (ld1.I(3) == false) goto L6;
        Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
    L6:
        return new n70(Z(), this.q0);
    }

    public final Dialog k0() {
        Dialog r0 = this.w0;
        if (r0 == null) goto L5;
        return r0;
    L5:
        nz2.w(this, " does not have a Dialog.", "DialogFragment ");
        return null;
    }

    public void l0(Dialog r2, int r3) {
        if (r3 != 1) goto L5;
    L12:
        r2.requestWindowFeature(1);
        return;
    L5:
        if (r3 == 2) goto L12;
        if (r3 == 3) goto L9;
        return;
    L9:
        Window r4 = r2.getWindow();
        if (r4 == null) goto L12;
        r4.addFlags(24);
        goto L12
    }

    public void m0(ld1 r4, String r5) {
        this.y0 = false;
        this.z0 = true;
        r4.getClass();
        po r2 = new po(r4);
        r2.p = true;
        r2.g(0, this, r5, 1);
        r2.e(false);
    }

    public void onCancel(DialogInterface r1) {
    }

    public void onClick(View r1) {
        h0();
    }

    public void onDismiss(DialogInterface r2) {
        if (this.x0 == false) goto L5;
        return;
    L5:
        if (ld1.I(3) == false) goto L7;
        Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
    L7:
        i0(true, true);
    }
}
