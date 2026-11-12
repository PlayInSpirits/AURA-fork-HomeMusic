package defpackage;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import app.homemusic.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.skydoves.colorpickerview.ColorPickerView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f50 extends pp0 {
    public bq4 B0;
    public String C0;

    @Override // defpackage.pp0, defpackage.kc1
    public final void F(Bundle bundle) {
        super.F(bundle);
        Bundle bundle2 = this.s;
        if (bundle2 != null) {
            this.C0 = bundle2.getString("arg_title");
        }
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_color_picker, viewGroup, false);
        int i = R.id.btnAccept;
        MaterialButton materialButton = (MaterialButton) uo.s(viewInflate, R.id.btnAccept);
        if (materialButton != null) {
            i = R.id.btnCancel;
            MaterialButton materialButton2 = (MaterialButton) uo.s(viewInflate, R.id.btnCancel);
            if (materialButton2 != null) {
                i = R.id.colorPickerView;
                ColorPickerView colorPickerView = (ColorPickerView) uo.s(viewInflate, R.id.colorPickerView);
                if (colorPickerView != null) {
                    i = R.id.tvDialogTitle;
                    TextView textView = (TextView) uo.s(viewInflate, R.id.tvDialogTitle);
                    if (textView != null) {
                        MaterialCardView materialCardView = (MaterialCardView) viewInflate;
                        this.B0 = new bq4(materialCardView, materialButton, materialButton2, colorPickerView, textView);
                        materialCardView.getClass();
                        return materialCardView;
                    }
                }
            }
        }
        nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void J() {
        super.J();
        this.B0 = null;
    }

    @Override // defpackage.kc1
    public final void T(View view, Bundle bundle) {
        view.getClass();
        String str = this.C0;
        if (str != null) {
            bq4 bq4Var = this.B0;
            bq4Var.getClass();
            ((TextView) bq4Var.q).setText(str);
        }
        bq4 bq4Var2 = this.B0;
        bq4Var2.getClass();
        ((MaterialButton) bq4Var2.o).setOnClickListener(new p6(9, this));
        jx3 jx3Var = new jx3();
        jx3Var.n = "HEX:#B5076B";
        bq4 bq4Var3 = this.B0;
        bq4Var3.getClass();
        ((ColorPickerView) bq4Var3.p).setColorListener(new e50(jx3Var));
        bq4 bq4Var4 = this.B0;
        bq4Var4.getClass();
        ((MaterialButton) bq4Var4.n).setOnClickListener(new j8(6, this, jx3Var));
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle bundle) {
        Dialog dialogJ0 = super.j0(bundle);
        Window window = dialogJ0.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        return dialogJ0;
    }
}
