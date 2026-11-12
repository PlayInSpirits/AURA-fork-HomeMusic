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
        View viewInflate = o().inflate(R.layout.dialog_server_signup, (ViewGroup) null, false);
        int i = R.id.client_cert_text_input_layout;
        if (((TextInputLayout) uo.s(viewInflate, R.id.client_cert_text_input_layout)) != null) {
            i = R.id.client_cert_text_view;
            TextInputEditText textInputEditText = (TextInputEditText) uo.s(viewInflate, R.id.client_cert_text_view);
            if (textInputEditText != null) {
                i = R.id.home_radio_station_sector;
                if (((NestedScrollView) uo.s(viewInflate, R.id.home_radio_station_sector)) != null) {
                    i = R.id.local_address_text_view;
                    TextInputEditText textInputEditText2 = (TextInputEditText) uo.s(viewInflate, R.id.local_address_text_view);
                    if (textInputEditText2 != null) {
                        i = R.id.low_security_checkbox;
                        CheckBox checkBox = (CheckBox) uo.s(viewInflate, R.id.low_security_checkbox);
                        if (checkBox != null) {
                            i = R.id.password_text_view;
                            TextInputEditText textInputEditText3 = (TextInputEditText) uo.s(viewInflate, R.id.password_text_view);
                            if (textInputEditText3 != null) {
                                i = R.id.server_name_text_view;
                                TextInputEditText textInputEditText4 = (TextInputEditText) uo.s(viewInflate, R.id.server_name_text_view);
                                if (textInputEditText4 != null) {
                                    i = R.id.server_text_view;
                                    TextInputEditText textInputEditText5 = (TextInputEditText) uo.s(viewInflate, R.id.server_text_view);
                                    if (textInputEditText5 != null) {
                                        i = R.id.username_text_view;
                                        TextInputEditText textInputEditText6 = (TextInputEditText) uo.s(viewInflate, R.id.username_text_view);
                                        if (textInputEditText6 != null) {
                                            this.B0 = new ey((ConstraintLayout) viewInflate, textInputEditText, textInputEditText2, checkBox, textInputEditText3, textInputEditText4, textInputEditText5, textInputEditText6);
                                            textInputEditText.setOnClickListener(new pa4(this, 0));
                                            nc1 nc1VarX = X();
                                            e75 e75VarD = nc1VarX.d();
                                            b75 b75VarR = gh0.r(nc1VarX);
                                            bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
                                            i30 i30VarA = kx3.a(se2.class);
                                            String strB = i30VarA.b();
                                            if (strB == null) {
                                                kf2.n("Local and anonymous classes can not be ViewModels");
                                                return null;
                                            }
                                            this.C0 = (se2) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                                            vg2 vg2VarQ = new vg2(e(), 0).q((ConstraintLayout) this.B0.a);
                                            vg2VarQ.p(R.string.server_signup_dialog_title);
                                            vg2VarQ.k(R.string.server_signup_dialog_neutral_button, new wr(3));
                                            return vg2VarQ.l(R.string.server_signup_dialog_positive_button, new wr(3)).j(R.string.server_signup_dialog_negative_button, new wr(11)).create();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
