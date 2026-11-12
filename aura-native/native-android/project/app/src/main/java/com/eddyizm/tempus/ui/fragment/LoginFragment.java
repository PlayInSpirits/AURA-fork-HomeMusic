package com.eddyizm.tempus.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.homemusic.HubAuthOptions;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.model.Server;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.LoginFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.a65;
import defpackage.b11;
import defpackage.b75;
import defpackage.bd1;
import defpackage.bq4;
import defpackage.co1;
import defpackage.d8;
import defpackage.e75;
import defpackage.eo1;
import defpackage.fo1;
import defpackage.gb;
import defpackage.gf1;
import defpackage.gh0;
import defpackage.gp3;
import defpackage.i30;
import defpackage.ie2;
import defpackage.j65;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.mj0;
import defpackage.ml3;
import defpackage.na4;
import defpackage.nc1;
import defpackage.nz2;
import defpackage.o54;
import defpackage.p6;
import defpackage.pn4;
import defpackage.q31;
import defpackage.ra4;
import defpackage.rm2;
import defpackage.s24;
import defpackage.se2;
import defpackage.u7;
import defpackage.uc1;
import defpackage.ud3;
import defpackage.uo;
import defpackage.wd1;
import defpackage.x;
import defpackage.zd0;
import defpackage.zn1;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class LoginFragment extends kc1 implements ClickCallback {
    public ml3 l0;
    public MainActivity m0;
    public se2 n0;
    public zd0 o0;

    @Override // defpackage.kc1
    public final void F(Bundle bundle) {
        super.F(bundle);
        d0();
    }

    @Override // defpackage.kc1
    public final void G(Menu menu, MenuInflater menuInflater) {
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final int i;
        this.m0 = (MainActivity) e();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_homemusic_login, viewGroup, false);
        int i2 = R.id.hm_login_account_step;
        LinearLayout linearLayout = (LinearLayout) uo.s(viewInflate, R.id.hm_login_account_step);
        if (linearLayout != null) {
            i2 = R.id.hm_login_code;
            TextInputEditText textInputEditText = (TextInputEditText) uo.s(viewInflate, R.id.hm_login_code);
            if (textInputEditText != null) {
                i2 = R.id.hm_login_code_layout;
                TextInputLayout textInputLayout = (TextInputLayout) uo.s(viewInflate, R.id.hm_login_code_layout);
                if (textInputLayout != null) {
                    i2 = R.id.hm_login_email;
                    TextInputEditText textInputEditText2 = (TextInputEditText) uo.s(viewInflate, R.id.hm_login_email);
                    if (textInputEditText2 != null) {
                        i2 = R.id.hm_login_email_layout;
                        TextInputLayout textInputLayout2 = (TextInputLayout) uo.s(viewInflate, R.id.hm_login_email_layout);
                        if (textInputLayout2 != null) {
                            i2 = R.id.hm_login_email_switch;
                            MaterialButton materialButton = (MaterialButton) uo.s(viewInflate, R.id.hm_login_email_switch);
                            if (materialButton != null) {
                                i2 = R.id.hm_login_error;
                                TextView textView = (TextView) uo.s(viewInflate, R.id.hm_login_error);
                                if (textView != null) {
                                    i2 = R.id.hm_login_google;
                                    MaterialButton materialButton2 = (MaterialButton) uo.s(viewInflate, R.id.hm_login_google);
                                    if (materialButton2 != null) {
                                        i2 = R.id.hm_login_hint;
                                        TextView textView2 = (TextView) uo.s(viewInflate, R.id.hm_login_hint);
                                        if (textView2 != null) {
                                            i2 = R.id.hm_login_password;
                                            TextInputEditText textInputEditText3 = (TextInputEditText) uo.s(viewInflate, R.id.hm_login_password);
                                            if (textInputEditText3 != null) {
                                                i2 = R.id.hm_login_password2;
                                                TextInputEditText textInputEditText4 = (TextInputEditText) uo.s(viewInflate, R.id.hm_login_password2);
                                                if (textInputEditText4 != null) {
                                                    i2 = R.id.hm_login_password2_layout;
                                                    TextInputLayout textInputLayout3 = (TextInputLayout) uo.s(viewInflate, R.id.hm_login_password2_layout);
                                                    if (textInputLayout3 != null) {
                                                        i2 = R.id.hm_login_password_layout;
                                                        TextInputLayout textInputLayout4 = (TextInputLayout) uo.s(viewInflate, R.id.hm_login_password_layout);
                                                        if (textInputLayout4 != null) {
                                                            i2 = R.id.hm_login_primary;
                                                            MaterialButton materialButton3 = (MaterialButton) uo.s(viewInflate, R.id.hm_login_primary);
                                                            if (materialButton3 != null) {
                                                                i2 = R.id.hm_login_progress;
                                                                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) uo.s(viewInflate, R.id.hm_login_progress);
                                                                if (linearProgressIndicator != null) {
                                                                    i2 = R.id.hm_login_resend;
                                                                    MaterialButton materialButton4 = (MaterialButton) uo.s(viewInflate, R.id.hm_login_resend);
                                                                    if (materialButton4 != null) {
                                                                        ScrollView scrollView = (ScrollView) viewInflate;
                                                                        i2 = R.id.hm_login_server;
                                                                        TextInputEditText textInputEditText5 = (TextInputEditText) uo.s(viewInflate, R.id.hm_login_server);
                                                                        if (textInputEditText5 != null) {
                                                                            i2 = R.id.hm_login_server_default;
                                                                            TextView textView3 = (TextView) uo.s(viewInflate, R.id.hm_login_server_default);
                                                                            if (textView3 != null) {
                                                                                i2 = R.id.hm_login_server_label;
                                                                                TextView textView4 = (TextView) uo.s(viewInflate, R.id.hm_login_server_label);
                                                                                if (textView4 != null) {
                                                                                    i2 = R.id.hm_login_server_layout;
                                                                                    TextInputLayout textInputLayout5 = (TextInputLayout) uo.s(viewInflate, R.id.hm_login_server_layout);
                                                                                    if (textInputLayout5 != null) {
                                                                                        i2 = R.id.hm_login_server_row;
                                                                                        LinearLayout linearLayout2 = (LinearLayout) uo.s(viewInflate, R.id.hm_login_server_row);
                                                                                        if (linearLayout2 != null) {
                                                                                            i2 = R.id.hm_login_server_step;
                                                                                            LinearLayout linearLayout3 = (LinearLayout) uo.s(viewInflate, R.id.hm_login_server_step);
                                                                                            if (linearLayout3 != null) {
                                                                                                i2 = R.id.hm_login_subtitle;
                                                                                                TextView textView5 = (TextView) uo.s(viewInflate, R.id.hm_login_subtitle);
                                                                                                if (textView5 != null) {
                                                                                                    i2 = R.id.hm_login_switch;
                                                                                                    MaterialButton materialButton5 = (MaterialButton) uo.s(viewInflate, R.id.hm_login_switch);
                                                                                                    if (materialButton5 != null) {
                                                                                                        i2 = R.id.hm_login_user;
                                                                                                        TextInputEditText textInputEditText6 = (TextInputEditText) uo.s(viewInflate, R.id.hm_login_user);
                                                                                                        if (textInputEditText6 != null) {
                                                                                                            i2 = R.id.hm_login_user_layout;
                                                                                                            TextInputLayout textInputLayout6 = (TextInputLayout) uo.s(viewInflate, R.id.hm_login_user_layout);
                                                                                                            if (textInputLayout6 != null) {
                                                                                                                uc1 uc1Var = new uc1(scrollView, linearLayout, textInputEditText, textInputLayout, textInputEditText2, textInputLayout2, materialButton, textView, materialButton2, textView2, textInputEditText3, textInputEditText4, textInputLayout3, textInputLayout4, materialButton3, linearProgressIndicator, materialButton4, scrollView, textInputEditText5, textView3, textView4, textInputLayout5, linearLayout2, linearLayout3, textView5, materialButton5, textInputEditText6, textInputLayout6);
                                                                                                                final fo1 fo1Var = new fo1(this, uc1Var);
                                                                                                                mj0 mj0Var = new mj0(28);
                                                                                                                WeakHashMap weakHashMap = j65.a;
                                                                                                                a65.c(scrollView, mj0Var);
                                                                                                                textInputEditText5.setText("http://192.168.1.129:4533");
                                                                                                                textInputEditText5.addTextChangedListener(new eo1(fo1Var, 0));
                                                                                                                final int i3 = 5;
                                                                                                                textView3.setOnClickListener(new View.OnClickListener() { // from class: xn1
                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                    public final void onClick(View view) {
                                                                                                                        String googleClientId;
                                                                                                                        int i4 = i3;
                                                                                                                        fo1 fo1Var2 = fo1Var;
                                                                                                                        switch (i4) {
                                                                                                                            case 0:
                                                                                                                                fo1Var2.s(co1.n);
                                                                                                                                break;
                                                                                                                            case 1:
                                                                                                                                co1 co1Var = (co1) fo1Var2.d;
                                                                                                                                co1 co1Var2 = co1.o;
                                                                                                                                if (co1Var == co1Var2) {
                                                                                                                                    co1Var2 = co1.p;
                                                                                                                                }
                                                                                                                                fo1Var2.s(co1Var2);
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                fo1Var2.s(co1.q);
                                                                                                                                break;
                                                                                                                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                                                                fo1Var2.q();
                                                                                                                                break;
                                                                                                                            case 4:
                                                                                                                                HubAuthOptions hubAuthOptions = (HubAuthOptions) fo1Var2.i;
                                                                                                                                if (hubAuthOptions != null && (googleClientId = hubAuthOptions.getGoogleClientId()) != null && !fo1Var2.a) {
                                                                                                                                    fo1Var2.r(true);
                                                                                                                                    ud3.M(((LoginFragment) fo1Var2.b).X(), googleClientId, new zh0(29, fo1Var2));
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 5:
                                                                                                                                ((uc1) fo1Var2.c).r.setText("http://192.168.1.129:4533");
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                fo1Var2.m();
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                });
                                                                                                                Iterator it = gb.P(textInputEditText, textInputEditText6, textInputEditText3, textInputEditText4).iterator();
                                                                                                                while (true) {
                                                                                                                    i = 2;
                                                                                                                    if (!it.hasNext()) {
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    TextInputEditText textInputEditText7 = (TextInputEditText) it.next();
                                                                                                                    textInputEditText7.getClass();
                                                                                                                    textInputEditText7.addTextChangedListener(new eo1(fo1Var, i));
                                                                                                                }
                                                                                                                final int i4 = 1;
                                                                                                                textInputEditText2.addTextChangedListener(new eo1(fo1Var, i4));
                                                                                                                final int i5 = 0;
                                                                                                                textInputEditText2.setOnEditorActionListener(new zn1(i5, new gf1() { // from class: bo1
                                                                                                                    @Override // defpackage.gf1
                                                                                                                    public final Object invoke() {
                                                                                                                        int i6 = i5;
                                                                                                                        j15 j15Var = j15.a;
                                                                                                                        fo1 fo1Var2 = fo1Var;
                                                                                                                        switch (i6) {
                                                                                                                            case 0:
                                                                                                                                if (((String) fo1Var2.h) == null) {
                                                                                                                                    fo1Var2.m();
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 1:
                                                                                                                                fo1Var2.m();
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                if (((co1) fo1Var2.d) == co1.o) {
                                                                                                                                    fo1Var2.m();
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                fo1Var2.m();
                                                                                                                                break;
                                                                                                                        }
                                                                                                                        return j15Var;
                                                                                                                    }
                                                                                                                }));
                                                                                                                textInputEditText5.setOnEditorActionListener(new zn1(i5, new gf1() { // from class: bo1
                                                                                                                    @Override // defpackage.gf1
                                                                                                                    public final Object invoke() {
                                                                                                                        int i6 = i4;
                                                                                                                        j15 j15Var = j15.a;
                                                                                                                        fo1 fo1Var2 = fo1Var;
                                                                                                                        switch (i6) {
                                                                                                                            case 0:
                                                                                                                                if (((String) fo1Var2.h) == null) {
                                                                                                                                    fo1Var2.m();
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 1:
                                                                                                                                fo1Var2.m();
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                if (((co1) fo1Var2.d) == co1.o) {
                                                                                                                                    fo1Var2.m();
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                fo1Var2.m();
                                                                                                                                break;
                                                                                                                        }
                                                                                                                        return j15Var;
                                                                                                                    }
                                                                                                                }));
                                                                                                                textInputEditText3.setOnEditorActionListener(new zn1(i5, new gf1() { // from class: bo1
                                                                                                                    @Override // defpackage.gf1
                                                                                                                    public final Object invoke() {
                                                                                                                        int i6 = i;
                                                                                                                        j15 j15Var = j15.a;
                                                                                                                        fo1 fo1Var2 = fo1Var;
                                                                                                                        switch (i6) {
                                                                                                                            case 0:
                                                                                                                                if (((String) fo1Var2.h) == null) {
                                                                                                                                    fo1Var2.m();
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 1:
                                                                                                                                fo1Var2.m();
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                if (((co1) fo1Var2.d) == co1.o) {
                                                                                                                                    fo1Var2.m();
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                fo1Var2.m();
                                                                                                                                break;
                                                                                                                        }
                                                                                                                        return j15Var;
                                                                                                                    }
                                                                                                                }));
                                                                                                                final int i6 = 3;
                                                                                                                textInputEditText4.setOnEditorActionListener(new zn1(i5, new gf1() { // from class: bo1
                                                                                                                    @Override // defpackage.gf1
                                                                                                                    public final Object invoke() {
                                                                                                                        int i7 = i6;
                                                                                                                        j15 j15Var = j15.a;
                                                                                                                        fo1 fo1Var2 = fo1Var;
                                                                                                                        switch (i7) {
                                                                                                                            case 0:
                                                                                                                                if (((String) fo1Var2.h) == null) {
                                                                                                                                    fo1Var2.m();
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 1:
                                                                                                                                fo1Var2.m();
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                if (((co1) fo1Var2.d) == co1.o) {
                                                                                                                                    fo1Var2.m();
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                fo1Var2.m();
                                                                                                                                break;
                                                                                                                        }
                                                                                                                        return j15Var;
                                                                                                                    }
                                                                                                                }));
                                                                                                                final int i7 = 6;
                                                                                                                uc1Var.o.setOnClickListener(new View.OnClickListener() { // from class: xn1
                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                    public final void onClick(View view) {
                                                                                                                        String googleClientId;
                                                                                                                        int i8 = i7;
                                                                                                                        fo1 fo1Var2 = fo1Var;
                                                                                                                        switch (i8) {
                                                                                                                            case 0:
                                                                                                                                fo1Var2.s(co1.n);
                                                                                                                                break;
                                                                                                                            case 1:
                                                                                                                                co1 co1Var = (co1) fo1Var2.d;
                                                                                                                                co1 co1Var2 = co1.o;
                                                                                                                                if (co1Var == co1Var2) {
                                                                                                                                    co1Var2 = co1.p;
                                                                                                                                }
                                                                                                                                fo1Var2.s(co1Var2);
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                fo1Var2.s(co1.q);
                                                                                                                                break;
                                                                                                                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                                                                fo1Var2.q();
                                                                                                                                break;
                                                                                                                            case 4:
                                                                                                                                HubAuthOptions hubAuthOptions = (HubAuthOptions) fo1Var2.i;
                                                                                                                                if (hubAuthOptions != null && (googleClientId = hubAuthOptions.getGoogleClientId()) != null && !fo1Var2.a) {
                                                                                                                                    fo1Var2.r(true);
                                                                                                                                    ud3.M(((LoginFragment) fo1Var2.b).X(), googleClientId, new zh0(29, fo1Var2));
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 5:
                                                                                                                                ((uc1) fo1Var2.c).r.setText("http://192.168.1.129:4533");
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                fo1Var2.m();
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                });
                                                                                                                uc1Var.v.setOnClickListener(new View.OnClickListener() { // from class: xn1
                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                    public final void onClick(View view) {
                                                                                                                        String googleClientId;
                                                                                                                        int i8 = i5;
                                                                                                                        fo1 fo1Var2 = fo1Var;
                                                                                                                        switch (i8) {
                                                                                                                            case 0:
                                                                                                                                fo1Var2.s(co1.n);
                                                                                                                                break;
                                                                                                                            case 1:
                                                                                                                                co1 co1Var = (co1) fo1Var2.d;
                                                                                                                                co1 co1Var2 = co1.o;
                                                                                                                                if (co1Var == co1Var2) {
                                                                                                                                    co1Var2 = co1.p;
                                                                                                                                }
                                                                                                                                fo1Var2.s(co1Var2);
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                fo1Var2.s(co1.q);
                                                                                                                                break;
                                                                                                                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                                                                fo1Var2.q();
                                                                                                                                break;
                                                                                                                            case 4:
                                                                                                                                HubAuthOptions hubAuthOptions = (HubAuthOptions) fo1Var2.i;
                                                                                                                                if (hubAuthOptions != null && (googleClientId = hubAuthOptions.getGoogleClientId()) != null && !fo1Var2.a) {
                                                                                                                                    fo1Var2.r(true);
                                                                                                                                    ud3.M(((LoginFragment) fo1Var2.b).X(), googleClientId, new zh0(29, fo1Var2));
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 5:
                                                                                                                                ((uc1) fo1Var2.c).r.setText("http://192.168.1.129:4533");
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                fo1Var2.m();
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                });
                                                                                                                uc1Var.y.setOnClickListener(new View.OnClickListener() { // from class: xn1
                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                    public final void onClick(View view) {
                                                                                                                        String googleClientId;
                                                                                                                        int i8 = i4;
                                                                                                                        fo1 fo1Var2 = fo1Var;
                                                                                                                        switch (i8) {
                                                                                                                            case 0:
                                                                                                                                fo1Var2.s(co1.n);
                                                                                                                                break;
                                                                                                                            case 1:
                                                                                                                                co1 co1Var = (co1) fo1Var2.d;
                                                                                                                                co1 co1Var2 = co1.o;
                                                                                                                                if (co1Var == co1Var2) {
                                                                                                                                    co1Var2 = co1.p;
                                                                                                                                }
                                                                                                                                fo1Var2.s(co1Var2);
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                fo1Var2.s(co1.q);
                                                                                                                                break;
                                                                                                                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                                                                fo1Var2.q();
                                                                                                                                break;
                                                                                                                            case 4:
                                                                                                                                HubAuthOptions hubAuthOptions = (HubAuthOptions) fo1Var2.i;
                                                                                                                                if (hubAuthOptions != null && (googleClientId = hubAuthOptions.getGoogleClientId()) != null && !fo1Var2.a) {
                                                                                                                                    fo1Var2.r(true);
                                                                                                                                    ud3.M(((LoginFragment) fo1Var2.b).X(), googleClientId, new zh0(29, fo1Var2));
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 5:
                                                                                                                                ((uc1) fo1Var2.c).r.setText("http://192.168.1.129:4533");
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                fo1Var2.m();
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                });
                                                                                                                uc1Var.g.setOnClickListener(new View.OnClickListener() { // from class: xn1
                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                    public final void onClick(View view) {
                                                                                                                        String googleClientId;
                                                                                                                        int i8 = i;
                                                                                                                        fo1 fo1Var2 = fo1Var;
                                                                                                                        switch (i8) {
                                                                                                                            case 0:
                                                                                                                                fo1Var2.s(co1.n);
                                                                                                                                break;
                                                                                                                            case 1:
                                                                                                                                co1 co1Var = (co1) fo1Var2.d;
                                                                                                                                co1 co1Var2 = co1.o;
                                                                                                                                if (co1Var == co1Var2) {
                                                                                                                                    co1Var2 = co1.p;
                                                                                                                                }
                                                                                                                                fo1Var2.s(co1Var2);
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                fo1Var2.s(co1.q);
                                                                                                                                break;
                                                                                                                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                                                                fo1Var2.q();
                                                                                                                                break;
                                                                                                                            case 4:
                                                                                                                                HubAuthOptions hubAuthOptions = (HubAuthOptions) fo1Var2.i;
                                                                                                                                if (hubAuthOptions != null && (googleClientId = hubAuthOptions.getGoogleClientId()) != null && !fo1Var2.a) {
                                                                                                                                    fo1Var2.r(true);
                                                                                                                                    ud3.M(((LoginFragment) fo1Var2.b).X(), googleClientId, new zh0(29, fo1Var2));
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 5:
                                                                                                                                ((uc1) fo1Var2.c).r.setText("http://192.168.1.129:4533");
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                fo1Var2.m();
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                });
                                                                                                                uc1Var.q.setOnClickListener(new View.OnClickListener() { // from class: xn1
                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                    public final void onClick(View view) {
                                                                                                                        String googleClientId;
                                                                                                                        int i8 = i6;
                                                                                                                        fo1 fo1Var2 = fo1Var;
                                                                                                                        switch (i8) {
                                                                                                                            case 0:
                                                                                                                                fo1Var2.s(co1.n);
                                                                                                                                break;
                                                                                                                            case 1:
                                                                                                                                co1 co1Var = (co1) fo1Var2.d;
                                                                                                                                co1 co1Var2 = co1.o;
                                                                                                                                if (co1Var == co1Var2) {
                                                                                                                                    co1Var2 = co1.p;
                                                                                                                                }
                                                                                                                                fo1Var2.s(co1Var2);
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                fo1Var2.s(co1.q);
                                                                                                                                break;
                                                                                                                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                                                                fo1Var2.q();
                                                                                                                                break;
                                                                                                                            case 4:
                                                                                                                                HubAuthOptions hubAuthOptions = (HubAuthOptions) fo1Var2.i;
                                                                                                                                if (hubAuthOptions != null && (googleClientId = hubAuthOptions.getGoogleClientId()) != null && !fo1Var2.a) {
                                                                                                                                    fo1Var2.r(true);
                                                                                                                                    ud3.M(((LoginFragment) fo1Var2.b).X(), googleClientId, new zh0(29, fo1Var2));
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 5:
                                                                                                                                ((uc1) fo1Var2.c).r.setText("http://192.168.1.129:4533");
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                fo1Var2.m();
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                });
                                                                                                                final int i8 = 4;
                                                                                                                uc1Var.i.setOnClickListener(new View.OnClickListener() { // from class: xn1
                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                    public final void onClick(View view) {
                                                                                                                        String googleClientId;
                                                                                                                        int i9 = i8;
                                                                                                                        fo1 fo1Var2 = fo1Var;
                                                                                                                        switch (i9) {
                                                                                                                            case 0:
                                                                                                                                fo1Var2.s(co1.n);
                                                                                                                                break;
                                                                                                                            case 1:
                                                                                                                                co1 co1Var = (co1) fo1Var2.d;
                                                                                                                                co1 co1Var2 = co1.o;
                                                                                                                                if (co1Var == co1Var2) {
                                                                                                                                    co1Var2 = co1.p;
                                                                                                                                }
                                                                                                                                fo1Var2.s(co1Var2);
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                fo1Var2.s(co1.q);
                                                                                                                                break;
                                                                                                                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                                                                fo1Var2.q();
                                                                                                                                break;
                                                                                                                            case 4:
                                                                                                                                HubAuthOptions hubAuthOptions = (HubAuthOptions) fo1Var2.i;
                                                                                                                                if (hubAuthOptions != null && (googleClientId = hubAuthOptions.getGoogleClientId()) != null && !fo1Var2.a) {
                                                                                                                                    fo1Var2.r(true);
                                                                                                                                    ud3.M(((LoginFragment) fo1Var2.b).X(), googleClientId, new zh0(29, fo1Var2));
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 5:
                                                                                                                                ((uc1) fo1Var2.c).r.setText("http://192.168.1.129:4533");
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                fo1Var2.m();
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                });
                                                                                                                int i9 = 14;
                                                                                                                ((s24) AppDatabase.y().G().n).i().a(new String[]{"server"}, new o54(i9)).e(v(), new wd1(new x(16, fo1Var), i));
                                                                                                                X().i().a(v(), (bd1) fo1Var.k);
                                                                                                                fo1Var.s(co1.n);
                                                                                                                ScrollView scrollView2 = uc1Var.a;
                                                                                                                if (scrollView2 != null) {
                                                                                                                    return scrollView2;
                                                                                                                }
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
                                                                                                                this.n0 = (se2) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                                                                                                                View viewInflate2 = layoutInflater.inflate(R.layout.fragment_login, viewGroup, false);
                                                                                                                int i10 = R.id.app_bar_layout;
                                                                                                                AppBarLayout appBarLayout = (AppBarLayout) uo.s(viewInflate2, R.id.app_bar_layout);
                                                                                                                if (appBarLayout != null) {
                                                                                                                    i10 = R.id.new_login_button;
                                                                                                                    MaterialButton materialButton6 = (MaterialButton) uo.s(viewInflate2, R.id.new_login_button);
                                                                                                                    if (materialButton6 != null) {
                                                                                                                        i10 = R.id.no_server_added_text_view;
                                                                                                                        TextView textView6 = (TextView) uo.s(viewInflate2, R.id.no_server_added_text_view);
                                                                                                                        if (textView6 != null) {
                                                                                                                            i10 = R.id.server_info_sector;
                                                                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) uo.s(viewInflate2, R.id.server_info_sector);
                                                                                                                            if (constraintLayout != null) {
                                                                                                                                i10 = R.id.server_list_recycler_view;
                                                                                                                                RecyclerView recyclerView = (RecyclerView) uo.s(viewInflate2, R.id.server_list_recycler_view);
                                                                                                                                if (recyclerView != null) {
                                                                                                                                    i10 = R.id.toolbar;
                                                                                                                                    MaterialToolbar materialToolbar = (MaterialToolbar) uo.s(viewInflate2, R.id.toolbar);
                                                                                                                                    if (materialToolbar != null) {
                                                                                                                                        LinearLayout linearLayout4 = (LinearLayout) viewInflate2;
                                                                                                                                        this.l0 = new ml3(linearLayout4, appBarLayout, materialButton6, textView6, constraintLayout, recyclerView, materialToolbar);
                                                                                                                                        this.m0.o(materialToolbar);
                                                                                                                                        ((AppBarLayout) this.l0.a).a(new u7(7, this));
                                                                                                                                        RecyclerView recyclerView2 = (RecyclerView) this.l0.e;
                                                                                                                                        Z();
                                                                                                                                        recyclerView2.setLayoutManager(new LinearLayoutManager(1));
                                                                                                                                        ((RecyclerView) this.l0.e).setHasFixedSize(true);
                                                                                                                                        zd0 zd0Var = new zd0(this);
                                                                                                                                        this.o0 = zd0Var;
                                                                                                                                        ((RecyclerView) this.l0.e).setAdapter(zd0Var);
                                                                                                                                        ((s24) ((na4) this.n0.c.o).n).i().a(new String[]{"server"}, new o54(i9)).e(v(), new d8(i9, this));
                                                                                                                                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((MaterialButton) this.l0.b).getLayoutParams();
                                                                                                                                        int i11 = marginLayoutParams.bottomMargin;
                                                                                                                                        MaterialButton materialButton7 = (MaterialButton) this.l0.b;
                                                                                                                                        q31 q31Var = new q31(i11, i4, marginLayoutParams);
                                                                                                                                        WeakHashMap weakHashMap2 = j65.a;
                                                                                                                                        a65.c(materialButton7, q31Var);
                                                                                                                                        ((MaterialButton) this.l0.b).setOnClickListener(new p6(24, this));
                                                                                                                                        return linearLayout4;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                nz2.n("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i10)));
                                                                                                                return null;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.l0 = null;
    }

    @Override // defpackage.kc1
    public final boolean N(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_add) {
            return false;
        }
        new ra4().m0(this.m0.k(), null);
        return true;
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onServerClick(Bundle bundle) {
        Server server = (Server) bundle.getParcelable("server_object");
        String serverId = server.getServerId();
        String address = server.getAddress();
        String localAddress = server.getLocalAddress();
        String username = server.getUsername();
        String password = server.getPassword();
        boolean zIsLowSecurity = server.isLowSecurity();
        String clientCert = server.getClientCert();
        String strU = ud3.u();
        boolean z = Objects.equals(strU, address) || Objects.equals(strU, localAddress);
        ud3.w0(serverId);
        ud3.v0(address);
        ud3.n0(localAddress);
        if (!z) {
            ud3.m0(address);
        }
        ud3.D0(username);
        ud3.q0(password);
        ud3.o0(zIsLowSecurity);
        ud3.h0(clientCert);
        App.f(true);
        ie2 ie2Var = new ie2(this);
        pn4 pn4VarF = App.f(false);
        if (pn4VarF.c == null) {
            pn4VarF.c = new gp3(pn4VarF, 21);
        }
        pn4VarF.c.u().enqueue(new rm2(23, ie2Var));
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onServerLongClick(Bundle bundle) {
        ra4 ra4Var = new ra4();
        ra4Var.c0(bundle);
        ra4Var.m0(this.m0.k(), null);
    }
}
