package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import app.homemusic.R;
import com.eddyizm.tempus.model.Server;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ra4 extends pp0 {
    public ey B0;
    public se2 C0;
    public String D0;
    public String E0;
    public String F0;
    public String G0;
    public String H0;
    public boolean I0;
    public String J0;

    public ra4() {
        this.I0 = false;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void J() {
        super.J();
        this.B0 = null;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void R() {
        super.R();
        Bundle r0 = this.s;
        se2 r1 = this.C0;
        if (r0 == null) goto L7;
        r1.d = (Server) Y().getParcelable("server_object");
        Server r2 = this.C0.d;
        if (r2 == null) goto L8;
        ((TextInputEditText) this.B0.f).setText(r2.getServerName());
        ((TextInputEditText) this.B0.h).setText(this.C0.d.getUsername());
        ((TextInputEditText) this.B0.e).setText("");
        ((TextInputEditText) this.B0.g).setText(this.C0.d.getAddress());
        ((TextInputEditText) this.B0.c).setText(this.C0.d.getLocalAddress());
        ((CheckBox) this.B0.d).setChecked(this.C0.d.isLowSecurity());
        ((TextInputEditText) this.B0.b).setText(this.C0.d.getClientCert());
    L8:
        Dialog r3 = this.w0;
        Objects.requireNonNull(r3);
        f9 r4 = (f9) r3;
        r4.i(-1).setOnClickListener(new pa4(this, 1));
        r4.i(-3).setOnClickListener(new pa4(this, 2));
        r4.i(-3).setOnLongClickListener(new q6(20, this));
        return;
    L7:
        r1.d = null;
        goto L8
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle r14) {
        View r15 = o().inflate(R.layout.dialog_server_signup, null, false);
        int r0 = R.id.client_cert_text_input_layout;
        if (((TextInputLayout) uo.s(r15, R.id.client_cert_text_input_layout)) == null) goto L26;
        r0 = R.id.client_cert_text_view;
        TextInputEditText r6 = (TextInputEditText) uo.s(r15, R.id.client_cert_text_view);
        if (r6 == null) goto L26;
        r0 = R.id.home_radio_station_sector;
        if (((NestedScrollView) uo.s(r15, R.id.home_radio_station_sector)) == null) goto L26;
        r0 = R.id.local_address_text_view;
        TextInputEditText r7 = (TextInputEditText) uo.s(r15, R.id.local_address_text_view);
        if (r7 == null) goto L26;
        r0 = R.id.low_security_checkbox;
        CheckBox r8 = (CheckBox) uo.s(r15, R.id.low_security_checkbox);
        if (r8 == null) goto L26;
        r0 = R.id.password_text_view;
        TextInputEditText r9 = (TextInputEditText) uo.s(r15, R.id.password_text_view);
        if (r9 == null) goto L26;
        r0 = R.id.server_name_text_view;
        TextInputEditText r10 = (TextInputEditText) uo.s(r15, R.id.server_name_text_view);
        if (r10 == null) goto L26;
        r0 = R.id.server_text_view;
        TextInputEditText r11 = (TextInputEditText) uo.s(r15, R.id.server_text_view);
        if (r11 == null) goto L26;
        r0 = R.id.username_text_view;
        TextInputEditText r12 = (TextInputEditText) uo.s(r15, R.id.username_text_view);
        if (r12 == null) goto L26;
        this.B0 = new ey((ConstraintLayout) r15, r6, r7, r8, r9, r10, r11, r12);
        r6.setOnClickListener(new pa4(this, 0));
        nc1 r16 = X();
        e75 r1 = r16.d();
        b75 r3 = gh0.r(r16);
        bq4 r4 = new bq4(r1, r3, b11.e(r16, r3));
        i30 r17 = kx3.a(se2.class);
        String r2 = r17.b();
        if (r2 == null) goto L24;
        this.C0 = (se2) r4.l(r17, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r2));
        vg2 r13 = new vg2(l(), 0).q((ConstraintLayout) this.B0.a);
        r13.p(R.string.server_signup_dialog_title);
        r13.k(R.string.server_signup_dialog_neutral_button, new wr(3));
        return r13.l(R.string.server_signup_dialog_positive_button, new wr(3)).j(R.string.server_signup_dialog_negative_button, new wr(11)).create();
    L24:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L26:
        nz2.n("Missing required view with ID: ".concat(r15.getResources().getResourceName(r0)));
        return null;
    }
}
