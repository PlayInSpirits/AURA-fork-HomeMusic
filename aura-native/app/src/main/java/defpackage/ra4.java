package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import app.homemusic.R;
import com.eddyizm.tempus.model.Server;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class ra4 extends pp0 {
    public ey B0;
    public se2 C0;
    public String D0;
    public String E0;
    public String F0;
    public String G0;
    public String H0;
    public boolean I0 = false;
    public String J0;

    @Override // defpackage.pp0, defpackage.kc1
    public final void J() {
        super.J();
        this.B0 = null;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void R() {
        super.R();
        Bundle bundle = this.s;
        se2 se2Var = this.C0;
        if (bundle != null) {
            se2Var.d = (Server) Y().getParcelable("server_object");
            Server server = this.C0.d;
            if (server != null) {
                ((TextInputEditText) this.B0.f).setText(server.getServerName());
                ((TextInputEditText) this.B0.h).setText(this.C0.d.getUsername());
                ((TextInputEditText) this.B0.e).setText("");
                ((TextInputEditText) this.B0.g).setText(this.C0.d.getAddress());
                ((TextInputEditText) this.B0.c).setText(this.C0.d.getLocalAddress());
                ((CheckBox) this.B0.d).setChecked(this.C0.d.isLowSecurity());
                ((TextInputEditText) this.B0.b).setText(this.C0.d.getClientCert());
            }
        } else {
            se2Var.d = null;
        }
        Dialog dialog = this.w0;
        Objects.requireNonNull(dialog);
        f9 f9Var = (f9) dialog;
        f9Var.i(-1).setOnClickListener(new pa4(this, 1));
        f9Var.i(-3).setOnClickListener(new pa4(this, 2));
        f9Var.i(-3).setOnLongClickListener(new q6(20, this));
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle bundle) {
        View inflate = o().inflate(app.homemusic.R.layout.dialog_server_signup, (ViewGroup) null, false);
        int i = app.homemusic.R.id.client_cert_text_input_layout;
        if (((TextInputLayout) uo.s(inflate, app.homemusic.R.id.client_cert_text_input_layout)) != null) {
            i = app.homemusic.R.id.client_cert_text_view;
            TextInputEditText textInputEditText = (TextInputEditText) uo.s(inflate, app.homemusic.R.id.client_cert_text_view);
            if (textInputEditText != null) {
                i = app.homemusic.R.id.home_radio_station_sector;
                if (((NestedScrollView) uo.s(inflate, app.homemusic.R.id.home_radio_station_sector)) != null) {
                    i = app.homemusic.R.id.local_address_text_view;
                    TextInputEditText textInputEditText2 = (TextInputEditText) uo.s(inflate, app.homemusic.R.id.local_address_text_view);
                    if (textInputEditText2 != null) {
                        i = app.homemusic.R.id.low_security_checkbox;
                        CheckBox checkBox = (CheckBox) uo.s(inflate, app.homemusic.R.id.low_security_checkbox);
                        if (checkBox != null) {
                            i = app.homemusic.R.id.password_text_view;
                            TextInputEditText textInputEditText3 = (TextInputEditText) uo.s(inflate, app.homemusic.R.id.password_text_view);
                            if (textInputEditText3 != null) {
                                i = app.homemusic.R.id.server_name_text_view;
                                TextInputEditText textInputEditText4 = (TextInputEditText) uo.s(inflate, app.homemusic.R.id.server_name_text_view);
                                if (textInputEditText4 != null) {
                                    i = app.homemusic.R.id.server_text_view;
                                    TextInputEditText textInputEditText5 = (TextInputEditText) uo.s(inflate, app.homemusic.R.id.server_text_view);
                                    if (textInputEditText5 != null) {
                                        i = app.homemusic.R.id.username_text_view;
                                        TextInputEditText textInputEditText6 = (TextInputEditText) uo.s(inflate, app.homemusic.R.id.username_text_view);
                                        if (textInputEditText6 != null) {
                                            this.B0 = new ey((ConstraintLayout) inflate, textInputEditText, textInputEditText2, checkBox, textInputEditText3, textInputEditText4, textInputEditText5, textInputEditText6);
                                            textInputEditText.setOnClickListener(new pa4(this, 0));
                                            nc1 X = X();
                                            e75 d = X.d();
                                            b75 r = gh0.r(X);
                                            bq4 bq4Var = new bq4(d, r, b11.e(X, r));
                                            i30 a = kx3.a(se2.class);
                                            String b = a.b();
                                            if (b == null) {
                                                kf2.n("Local and anonymous classes can not be ViewModels");
                                                return null;
                                            }
                                            this.C0 = (se2) bq4Var.l(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
                                            vg2 q = new vg2(e(), 0).q((ConstraintLayout) this.B0.a);
                                            q.p(app.homemusic.R.string.server_signup_dialog_title);
                                            q.k(app.homemusic.R.string.server_signup_dialog_neutral_button, new wr(3));
                                            return q.l(app.homemusic.R.string.server_signup_dialog_positive_button, new wr(3)).j(app.homemusic.R.string.server_signup_dialog_negative_button, new wr(11)).create();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        nz2.n("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }
}
