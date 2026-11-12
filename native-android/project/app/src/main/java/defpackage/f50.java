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

    public f50() {
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void F(Bundle r2) {
        super.F(r2);
        Bundle r3 = this.s;
        if (r3 == null) goto L6;
        this.C0 = r3.getString("arg_title");
        return;
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r7, ViewGroup r8, Bundle r9) {
        r7.getClass();
        View r10 = r7.inflate(R.layout.dialog_color_picker, r8, false);
        int r11 = R.id.btnAccept;
        MaterialButton r2 = (MaterialButton) uo.s(r10, R.id.btnAccept);
        if (r2 == null) goto L12;
        r11 = R.id.btnCancel;
        MaterialButton r3 = (MaterialButton) uo.s(r10, R.id.btnCancel);
        if (r3 == null) goto L12;
        r11 = R.id.colorPickerView;
        ColorPickerView r4 = (ColorPickerView) uo.s(r10, R.id.colorPickerView);
        if (r4 == null) goto L12;
        r11 = R.id.tvDialogTitle;
        TextView r5 = (TextView) uo.s(r10, R.id.tvDialogTitle);
        if (r5 == null) goto L12;
        MaterialCardView r1 = (MaterialCardView) r10;
        this.B0 = new bq4(r1, r2, r3, r4, r5);
        r1.getClass();
        return r1;
    L12:
        nz2.n("Missing required view with ID: ".concat(r10.getResources().getResourceName(r11)));
        return null;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void J() {
        super.J();
        this.B0 = null;
    }

    @Override // defpackage.kc1
    public final void T(View r3, Bundle r4) {
        r3.getClass();
        String r5 = this.C0;
        if (r5 == null) goto L5;
        bq4 r6 = this.B0;
        r6.getClass();
        ((TextView) r6.q).setText(r5);
    L5:
        bq4 r7 = this.B0;
        r7.getClass();
        ((MaterialButton) r7.o).setOnClickListener(new p6(9, this));
        jx3 r8 = new jx3();
        r8.n = "HEX:#B5076B";
        bq4 r9 = this.B0;
        r9.getClass();
        ((ColorPickerView) r9.p).setColorListener(new e50(r8));
        bq4 r10 = this.B0;
        r10.getClass();
        ((MaterialButton) r10.n).setOnClickListener(new j8(6, this, r8));
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle r3) {
        Dialog r2 = super.j0(r3);
        Window r4 = r2.getWindow();
        if (r4 == null) goto L5;
        r4.setBackgroundDrawable(new ColorDrawable(0));
    L5:
        return r2;
    }
}
