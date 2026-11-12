package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zk4 extends pp0 {
    public final /* synthetic */ int B0;
    public hd C0;
    public Runnable D0;

    public /* synthetic */ zk4(int i) {
        this.B0 = i;
    }

    @Override // defpackage.kc1
    public final void P() {
        switch (this.B0) {
            case 0:
                this.R = true;
                Context contextZ = Z();
                f9 f9Var = (f9) this.w0;
                if (f9Var != null) {
                    int i = 2;
                    f9Var.i(-1).setOnClickListener(new et1(this, contextZ, f9Var, i));
                    f9Var.i(-3).setOnClickListener(new io0(f9Var, i));
                    f9Var.i(-2).setOnClickListener(new j8(24, this, f9Var));
                }
                break;
            case 1:
                this.R = true;
                Context contextZ2 = Z();
                f9 f9Var2 = (f9) this.w0;
                if (f9Var2 != null) {
                    int i2 = 3;
                    f9Var2.i(-1).setOnClickListener(new et1(this, contextZ2, f9Var2, i2));
                    f9Var2.i(-3).setOnClickListener(new io0(f9Var2, i2));
                    f9Var2.i(-2).setOnClickListener(new j8(25, this, f9Var2));
                }
                break;
            default:
                this.R = true;
                Context contextZ3 = Z();
                f9 f9Var3 = (f9) this.w0;
                if (f9Var3 != null) {
                    int i3 = 4;
                    f9Var3.i(-1).setOnClickListener(new et1(this, contextZ3, f9Var3, i3));
                    f9Var3.i(-3).setOnClickListener(new io0(f9Var3, i3));
                    f9Var3.i(-2).setOnClickListener(new j8(26, this, f9Var3));
                }
                break;
        }
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle bundle) {
        switch (this.B0) {
            case 0:
                View viewInflate = o().inflate(R.layout.dialog_starred_album_sync, (ViewGroup) null, false);
                if (viewInflate == null) {
                    nz2.n("rootView");
                    return null;
                }
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                nc1 nc1VarX = X();
                e75 e75VarD = nc1VarX.d();
                b75 b75VarR = gh0.r(nc1VarX);
                bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
                i30 i30VarA = kx3.a(bl4.class);
                String strB = i30VarA.b();
                if (strB == null) {
                    kf2.n("Local and anonymous classes can not be ViewModels");
                    return null;
                }
                this.C0 = (bl4) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                vg2 vg2VarQ = new vg2(e(), 0).q(linearLayout);
                vg2VarQ.p(R.string.starred_album_sync_dialog_title);
                vg2 vg2VarL = vg2VarQ.l(R.string.starred_sync_dialog_positive_button, null);
                vg2VarL.k(R.string.starred_sync_dialog_neutral_button, null);
                return vg2VarL.j(R.string.starred_sync_dialog_negative_button, null).create();
            case 1:
                View viewInflate2 = o().inflate(R.layout.dialog_starred_artist_sync, (ViewGroup) null, false);
                if (viewInflate2 == null) {
                    nz2.n("rootView");
                    return null;
                }
                LinearLayout linearLayout2 = (LinearLayout) viewInflate2;
                nc1 nc1VarX2 = X();
                e75 e75VarD2 = nc1VarX2.d();
                b75 b75VarR2 = gh0.r(nc1VarX2);
                bq4 bq4Var2 = new bq4(e75VarD2, b75VarR2, b11.e(nc1VarX2, b75VarR2));
                i30 i30VarA2 = kx3.a(cl4.class);
                String strB2 = i30VarA2.b();
                if (strB2 == null) {
                    kf2.n("Local and anonymous classes can not be ViewModels");
                    return null;
                }
                this.C0 = (cl4) bq4Var2.l(i30VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB2));
                vg2 vg2VarQ2 = new vg2(e(), 0).q(linearLayout2);
                vg2VarQ2.p(R.string.starred_artist_sync_dialog_title);
                vg2 vg2VarL2 = vg2VarQ2.l(R.string.starred_sync_dialog_positive_button, null);
                vg2VarL2.k(R.string.starred_sync_dialog_neutral_button, null);
                return vg2VarL2.j(R.string.starred_sync_dialog_negative_button, null).create();
            default:
                View viewInflate3 = o().inflate(R.layout.dialog_starred_sync, (ViewGroup) null, false);
                if (viewInflate3 == null) {
                    nz2.n("rootView");
                    return null;
                }
                LinearLayout linearLayout3 = (LinearLayout) viewInflate3;
                nc1 nc1VarX3 = X();
                e75 e75VarD3 = nc1VarX3.d();
                b75 b75VarR3 = gh0.r(nc1VarX3);
                bq4 bq4Var3 = new bq4(e75VarD3, b75VarR3, b11.e(nc1VarX3, b75VarR3));
                i30 i30VarA3 = kx3.a(dl4.class);
                String strB3 = i30VarA3.b();
                if (strB3 == null) {
                    kf2.n("Local and anonymous classes can not be ViewModels");
                    return null;
                }
                this.C0 = (dl4) bq4Var3.l(i30VarA3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB3));
                vg2 vg2VarQ3 = new vg2(e(), 0).q(linearLayout3);
                vg2VarQ3.p(R.string.starred_sync_dialog_title);
                vg2 vg2VarL3 = vg2VarQ3.l(R.string.starred_sync_dialog_positive_button, null);
                vg2VarL3.k(R.string.starred_sync_dialog_neutral_button, null);
                return vg2VarL3.j(R.string.starred_sync_dialog_negative_button, null).create();
        }
    }
}
