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
    public Handler l0;
    public boolean u0;
    public Dialog w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;
    public final g5 m0 = new g5(6, this);
    public final lp0 n0 = new lp0(this);
    public final mp0 o0 = new mp0(this);
    public int p0 = 0;
    public int q0 = 0;
    public boolean r0 = true;
    public boolean s0 = true;
    public int t0 = -1;
    public final np0 v0 = new np0(0, this);
    public boolean A0 = false;

    @Override // defpackage.kc1
    public final void C() {
        this.R = true;
    }

    @Override // defpackage.kc1
    public final void E(Context context) {
        super.E(context);
        this.e0.f(this.v0);
        if (this.z0) {
            return;
        }
        this.y0 = false;
    }

    @Override // defpackage.kc1
    public void F(Bundle bundle) {
        super.F(bundle);
        this.l0 = new Handler();
        this.s0 = this.K == 0;
        if (bundle != null) {
            this.p0 = bundle.getInt("android:style", 0);
            this.q0 = bundle.getInt("android:theme", 0);
            this.r0 = bundle.getBoolean("android:cancelable", true);
            this.s0 = bundle.getBoolean("android:showsDialog", this.s0);
            this.t0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // defpackage.kc1
    public void J() {
        this.R = true;
        Dialog dialog = this.w0;
        if (dialog != null) {
            this.x0 = true;
            dialog.setOnDismissListener(null);
            this.w0.dismiss();
            if (!this.y0) {
                onDismiss(this.w0);
            }
            this.w0 = null;
            this.A0 = false;
        }
    }

    @Override // defpackage.kc1
    public final void K() {
        this.R = true;
        if (!this.z0 && !this.y0) {
            this.y0 = true;
        }
        this.e0.j(this.v0);
    }

    @Override // defpackage.kc1
    public final LayoutInflater L(Bundle bundle) {
        LayoutInflater layoutInflaterL = super.L(bundle);
        boolean z = this.s0;
        if (z && !this.u0) {
            if (z && !this.A0) {
                try {
                    this.u0 = true;
                    Dialog dialogJ0 = j0(bundle);
                    this.w0 = dialogJ0;
                    if (this.s0) {
                        l0(dialogJ0, this.p0);
                        Context contextN = n();
                        if (contextN != null) {
                            this.w0.setOwnerActivity((Activity) contextN);
                        }
                        this.w0.setCancelable(this.r0);
                        this.w0.setOnCancelListener(this.n0);
                        this.w0.setOnDismissListener(this.o0);
                        this.A0 = true;
                    } else {
                        this.w0 = null;
                    }
                    this.u0 = false;
                } catch (Throwable th) {
                    this.u0 = false;
                    throw th;
                }
            }
            if (ld1.I(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.w0;
            if (dialog != null) {
                return layoutInflaterL.cloneInContext(dialog.getContext());
            }
        } else if (ld1.I(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.s0) {
                Log.d("FragmentManager", "mShowsDialog = false: ".concat(str));
                return layoutInflaterL;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: ".concat(str));
        }
        return layoutInflaterL;
    }

    @Override // defpackage.kc1
    public void Q(Bundle bundle) {
        Dialog dialog = this.w0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.p0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.q0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.r0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.s0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.t0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // defpackage.kc1
    public void R() {
        this.R = true;
        Dialog dialog = this.w0;
        if (dialog != null) {
            this.x0 = false;
            dialog.show();
            View decorView = this.w0.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // defpackage.kc1
    public void S() {
        this.R = true;
        Dialog dialog = this.w0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // defpackage.kc1
    public final void U(Bundle bundle) {
        Bundle bundle2;
        this.R = true;
        if (this.w0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.w0.onRestoreInstanceState(bundle2);
    }

    @Override // defpackage.kc1
    public final void V(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.V(layoutInflater, viewGroup, bundle);
        if (this.T != null || this.w0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.w0.onRestoreInstanceState(bundle2);
    }

    public void h0() {
        i0(false, false);
    }

    @Override // defpackage.kc1
    public final fu i() {
        return new op0(this, new fc1(this));
    }

    public final void i0(boolean z, boolean z2) {
        if (this.y0) {
            return;
        }
        this.y0 = true;
        this.z0 = false;
        Dialog dialog = this.w0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.w0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.l0.getLooper()) {
                    onDismiss(this.w0);
                } else {
                    this.l0.post(this.m0);
                }
            }
        }
        this.x0 = true;
        if (this.t0 >= 0) {
            ld1 ld1VarQ = q();
            int i = this.t0;
            if (i < 0) {
                kf2.n(f34.f(i, "Bad id: "));
                return;
            } else {
                ld1VarQ.w(new jd1(ld1VarQ, null, i), z);
                this.t0 = -1;
                return;
            }
        }
        po poVar = new po(q());
        poVar.p = true;
        poVar.i(this);
        if (z) {
            poVar.e(true);
        } else {
            poVar.e(false);
        }
    }

    public Dialog j0(Bundle bundle) {
        if (ld1.I(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new n70(Z(), this.q0);
    }

    public final Dialog k0() {
        Dialog dialog = this.w0;
        if (dialog != null) {
            return dialog;
        }
        nz2.w(this, " does not have a Dialog.", "DialogFragment ");
        return null;
    }

    public void l0(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void m0(ld1 ld1Var, String str) {
        this.y0 = false;
        this.z0 = true;
        ld1Var.getClass();
        po poVar = new po(ld1Var);
        poVar.p = true;
        poVar.g(0, this, str, 1);
        poVar.e(false);
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onClick(View view) {
        h0();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.x0) {
            return;
        }
        if (ld1.I(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        i0(true, true);
    }
}
