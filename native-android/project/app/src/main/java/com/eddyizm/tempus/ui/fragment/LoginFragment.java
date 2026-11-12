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
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.model.Server;
import com.eddyizm.tempus.ui.activity.MainActivity;
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
import defpackage.bo1;
import defpackage.bq4;
import defpackage.co1;
import defpackage.d8;
import defpackage.e75;
import defpackage.eo1;
import defpackage.fo1;
import defpackage.gb;
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
import defpackage.xn1;
import defpackage.zd0;
import defpackage.zn1;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class LoginFragment extends kc1 implements ClickCallback {
    public ml3 l0;
    public MainActivity m0;
    public se2 n0;
    public zd0 o0;

    public LoginFragment() {
    }

    @Override // defpackage.kc1
    public final void F(Bundle r1) {
        super.F(r1);
        d0();
    }

    @Override // defpackage.kc1
    public final void G(Menu r1, MenuInflater r2) {
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r37, ViewGroup r38, Bundle r39) {
        this.m0 = (MainActivity) l();
        r37.getClass();
        View r3 = r37.inflate(R.layout.fragment_homemusic_login, r38, false);
        int r5 = R.id.hm_login_account_step;
        LinearLayout r9 = (LinearLayout) uo.s(r3, R.id.hm_login_account_step);
        if (r9 == null) goto L81;
        r5 = R.id.hm_login_code;
        TextInputEditText r10 = (TextInputEditText) uo.s(r3, R.id.hm_login_code);
        if (r10 == null) goto L81;
        r5 = R.id.hm_login_code_layout;
        TextInputLayout r11 = (TextInputLayout) uo.s(r3, R.id.hm_login_code_layout);
        if (r11 == null) goto L81;
        r5 = R.id.hm_login_email;
        TextInputEditText r12 = (TextInputEditText) uo.s(r3, R.id.hm_login_email);
        if (r12 == null) goto L81;
        r5 = R.id.hm_login_email_layout;
        TextInputLayout r13 = (TextInputLayout) uo.s(r3, R.id.hm_login_email_layout);
        if (r13 == null) goto L81;
        r5 = R.id.hm_login_email_switch;
        MaterialButton r14 = (MaterialButton) uo.s(r3, R.id.hm_login_email_switch);
        if (r14 == null) goto L81;
        r5 = R.id.hm_login_error;
        TextView r15 = (TextView) uo.s(r3, R.id.hm_login_error);
        if (r15 == null) goto L81;
        r5 = R.id.hm_login_google;
        MaterialButton r16 = (MaterialButton) uo.s(r3, R.id.hm_login_google);
        if (r16 == null) goto L81;
        r5 = R.id.hm_login_hint;
        TextView r17 = (TextView) uo.s(r3, R.id.hm_login_hint);
        if (r17 == null) goto L81;
        r5 = R.id.hm_login_password;
        TextInputEditText r18 = (TextInputEditText) uo.s(r3, R.id.hm_login_password);
        if (r18 == null) goto L81;
        r5 = R.id.hm_login_password2;
        TextInputEditText r19 = (TextInputEditText) uo.s(r3, R.id.hm_login_password2);
        if (r19 == null) goto L81;
        r5 = R.id.hm_login_password2_layout;
        TextInputLayout r20 = (TextInputLayout) uo.s(r3, R.id.hm_login_password2_layout);
        if (r20 == null) goto L81;
        r5 = R.id.hm_login_password_layout;
        TextInputLayout r21 = (TextInputLayout) uo.s(r3, R.id.hm_login_password_layout);
        if (r21 == null) goto L81;
        r5 = R.id.hm_login_primary;
        MaterialButton r22 = (MaterialButton) uo.s(r3, R.id.hm_login_primary);
        if (r22 == null) goto L81;
        r5 = R.id.hm_login_progress;
        LinearProgressIndicator r23 = (LinearProgressIndicator) uo.s(r3, R.id.hm_login_progress);
        if (r23 == null) goto L81;
        r5 = R.id.hm_login_resend;
        MaterialButton r24 = (MaterialButton) uo.s(r3, R.id.hm_login_resend);
        if (r24 == null) goto L81;
        ScrollView r8 = (ScrollView) r3;
        r5 = R.id.hm_login_server;
        TextInputEditText r26 = (TextInputEditText) uo.s(r3, R.id.hm_login_server);
        if (r26 == null) goto L81;
        r5 = R.id.hm_login_server_default;
        TextView r27 = (TextView) uo.s(r3, R.id.hm_login_server_default);
        if (r27 == null) goto L81;
        r5 = R.id.hm_login_server_label;
        TextView r28 = (TextView) uo.s(r3, R.id.hm_login_server_label);
        if (r28 == null) goto L81;
        r5 = R.id.hm_login_server_layout;
        TextInputLayout r29 = (TextInputLayout) uo.s(r3, R.id.hm_login_server_layout);
        if (r29 == null) goto L81;
        r5 = R.id.hm_login_server_row;
        LinearLayout r30 = (LinearLayout) uo.s(r3, R.id.hm_login_server_row);
        if (r30 == null) goto L81;
        r5 = R.id.hm_login_server_step;
        LinearLayout r31 = (LinearLayout) uo.s(r3, R.id.hm_login_server_step);
        if (r31 == null) goto L81;
        r5 = R.id.hm_login_subtitle;
        TextView r32 = (TextView) uo.s(r3, R.id.hm_login_subtitle);
        if (r32 == null) goto L81;
        r5 = R.id.hm_login_switch;
        MaterialButton r33 = (MaterialButton) uo.s(r3, R.id.hm_login_switch);
        if (r33 == null) goto L81;
        r5 = R.id.hm_login_user;
        TextInputEditText r34 = (TextInputEditText) uo.s(r3, R.id.hm_login_user);
        if (r34 == null) goto L81;
        r5 = R.id.hm_login_user_layout;
        TextInputLayout r35 = (TextInputLayout) uo.s(r3, R.id.hm_login_user_layout);
        if (r35 == null) goto L81;
        uc1 r7 = new uc1(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r8, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35);
        final fo1 r110 = new fo1(this, r7);
        mj0 r6 = new mj0(28);
        WeakHashMap r4 = j65.a;
        a65.c(r8, r6);
        r26.setText("http://192.168.1.129:4533");
        r26.addTextChangedListener(new eo1(r110, 0));
        final int r25 = 5;
        r27.setOnClickListener(new xn1(r110, r25));
        Iterator r36 = gb.P(new TextInputEditText[]{r10, r34, r18, r19}).iterator();
    L55:
        final int r40 = 2;
        if (r36.hasNext() == false) goto L58;
        TextInputEditText r41 = (TextInputEditText) r36.next();
        r41.getClass();
        r41.addTextChangedListener(new eo1(r110, r40));
        goto L55
    L58:
        final int r42 = 1;
        r12.addTextChangedListener(new eo1(r110, r42));
        final int r111 = 0;
        r12.setOnEditorActionListener(new zn1(r111, new bo1(r110, r111)));
        r26.setOnEditorActionListener(new zn1(r111, new bo1(r110, r42)));
        r18.setOnEditorActionListener(new zn1(r111, new bo1(r110, r40)));
        final int r43 = 3;
        r19.setOnEditorActionListener(new zn1(r111, new bo1(r110, r43)));
        final int r44 = 6;
        View.OnClickListener r45 = new xn1(r110, r44);
        r7.o.setOnClickListener(r45);
        View.OnClickListener r46 = new xn1(r110, r111);
        r7.v.setOnClickListener(r46);
        View.OnClickListener r47 = new xn1(r110, r42);
        r7.y.setOnClickListener(r47);
        View.OnClickListener r48 = new xn1(r110, r40);
        r7.g.setOnClickListener(r48);
        View.OnClickListener r49 = new xn1(r110, r43);
        r7.q.setOnClickListener(r49);
        final int r50 = 4;
        View.OnClickListener r51 = new xn1(r110, r50);
        r7.i.setOnClickListener(r51);
        int r112 = 14;
        ((s24) AppDatabase.y().G().n).i().a(new String[]{"server"}, new o54(r112)).e(v(), new wd1(new x(16, r110), r40));
        X().i().a(v(), (bd1) r110.k);
        r110.s(co1.n);
        ScrollView r52 = r7.a;
        if (r52 == null) goto L61;
        return r52;
    L61:
        nc1 r53 = X();
        e75 r54 = r53.d();
        b75 r55 = gh0.r(r53);
        bq4 r56 = new bq4(r54, r55, b11.e(r53, r55));
        i30 r57 = kx3.a(se2.class);
        String r58 = r57.b();
        if (r58 == null) goto L79;
        this.n0 = (se2) r56.l(r57, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r58));
        View r1 = r37.inflate(R.layout.fragment_login, r38, false);
        int r2 = R.id.app_bar_layout;
        AppBarLayout r113 = (AppBarLayout) uo.s(r1, R.id.app_bar_layout);
        if (r113 == null) goto L77;
        r2 = R.id.new_login_button;
        MaterialButton r114 = (MaterialButton) uo.s(r1, R.id.new_login_button);
        if (r114 == null) goto L77;
        r2 = R.id.no_server_added_text_view;
        TextView r115 = (TextView) uo.s(r1, R.id.no_server_added_text_view);
        if (r115 == null) goto L77;
        r2 = R.id.server_info_sector;
        ConstraintLayout r116 = (ConstraintLayout) uo.s(r1, R.id.server_info_sector);
        if (r116 == null) goto L77;
        r2 = R.id.server_list_recycler_view;
        RecyclerView r117 = (RecyclerView) uo.s(r1, R.id.server_list_recycler_view);
        if (r117 == null) goto L77;
        r2 = R.id.toolbar;
        MaterialToolbar r118 = (MaterialToolbar) uo.s(r1, R.id.toolbar);
        if (r118 == null) goto L77;
        LinearLayout r119 = (LinearLayout) r1;
        this.l0 = new ml3(r119, r113, r114, r115, r116, r117, r118);
        this.m0.o(r118);
        ((AppBarLayout) this.l0.a).a(new u7(7, this));
        RecyclerView r59 = (RecyclerView) this.l0.e;
        Z();
        r59.setLayoutManager(new LinearLayoutManager(1));
        ((RecyclerView) this.l0.e).setHasFixedSize(true);
        zd0 r60 = new zd0(this);
        this.o0 = r60;
        ((RecyclerView) this.l0.e).setAdapter(r60);
        ((s24) ((na4) this.n0.c.o).n).i().a(new String[]{"server"}, new o54(r112)).e(v(), new d8(r112, this));
        ViewGroup.MarginLayoutParams r61 = (ViewGroup.MarginLayoutParams) ((MaterialButton) this.l0.b).getLayoutParams();
        int r62 = r61.bottomMargin;
        MaterialButton r63 = (MaterialButton) this.l0.b;
        q31 r64 = new q31(r62, r42, r61);
        WeakHashMap r65 = j65.a;
        a65.c(r63, r64);
        ((MaterialButton) this.l0.b).setOnClickListener(new p6(24, this));
        return r119;
    L77:
        nz2.n("Missing required view with ID: ".concat(r1.getResources().getResourceName(r2)));
        return null;
    L79:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L81:
        nz2.n("Missing required view with ID: ".concat(r3.getResources().getResourceName(r5)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.l0 = null;
    }

    @Override // defpackage.kc1
    public final boolean N(MenuItem r2) {
        if (r2.getItemId() != R.id.action_add) goto L6;
        new ra4().m0(this.m0.k(), null);
        return true;
    L6:
        return false;
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onServerClick(Bundle r11) {
        Server r12 = (Server) r11.getParcelable("server_object");
        String r0 = r12.getServerId();
        String r1 = r12.getAddress();
        String r2 = r12.getLocalAddress();
        String r3 = r12.getUsername();
        String r4 = r12.getPassword();
        boolean r5 = r12.isLowSecurity();
        String r13 = r12.getClientCert();
        String r6 = ud3.u();
        if (Objects.equals(r6, r1) == false) goto L5;
    L8:
        boolean r7 = true;
    L9:
        ud3.w0(r0);
        ud3.v0(r1);
        ud3.n0(r2);
        if (r7 == true) goto L12;
        ud3.m0(r1);
    L12:
        ud3.D0(r3);
        ud3.q0(r4);
        ud3.o0(r5);
        ud3.h0(r13);
        App.f(true);
        ie2 r14 = new ie2(this);
        pn4 r10 = App.f(false);
        if (r10.c != null) goto L15;
        r10.c = new gp3(r10, 21);
    L15:
        r10.c.u().enqueue(new rm2(23, r14));
        return;
    L5:
        if (Objects.equals(r6, r2) == true) goto L8;
        r7 = false;
        goto L9
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onServerLongClick(Bundle r2) {
        ra4 r0 = new ra4();
        r0.c0(r2);
        r0.m0(this.m0.k(), null);
    }
}
