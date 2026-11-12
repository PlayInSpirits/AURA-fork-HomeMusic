package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.homemusic.R;
import com.eddyizm.tempus.model.Server;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oe2 extends kc1 {
    public pc1 l0;
    public ta4 m0;
    public ArrayList n0;
    public int o0;
    public boolean p0;

    public oe2() {
    }

    public static final void h0(oe2 r2, int r3, String r4, int r5) {
        pc1 r0 = r2.l0;
        if (r0 != null) goto L5;
        return;
    L5:
        ((MaterialButton) r0.q).setEnabled(true);
        String r6 = r2.s(r3);
        if (r4 != null) goto L8;
        String r7 = "";
    L9:
        Toast.makeText(r2.n(), r6 + r7, r5).show();
        return;
    L8:
        r7 = "\n".concat(r4);
        goto L9
    }

    public static boolean k0(String r2) {
        if (URLUtil.isValidUrl(r2) == false) goto L15;
        gr1 r0 = null;
        fr1 r1 = new fr1();     // Catch: IllegalArgumentException -> L12
        r1.e(null, r2);     // Catch: IllegalArgumentException -> L12
        r0 = r1.b();     // Catch: IllegalArgumentException -> L12
    L7:
        if (r0 != null) goto L10;
        return false;
    L10:
        return true;
    L15:
        return false;
    }

    @Override // defpackage.kc1
    public final void F(Bundle r1) {
        super.F(r1);
        Bundle r0 = this.s;
        if (r0 == null) goto L6;
        r0.getBoolean("single_page_mode");
        return;
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r24, ViewGroup r25, Bundle r26) {
        r24.getClass();
        final int r2 = 0;
        View r1 = r24.inflate(R.layout.fragment_login_server, r25, false);
        int r3 = R.id.button5;
        MaterialButton r7 = (MaterialButton) uo.s(r1, R.id.button5);
        if (r7 == null) goto L62;
        r3 = R.id.buttoner;
        if (((LinearLayout) uo.s(r1, R.id.buttoner)) == null) goto L62;
        r3 = R.id.createOrUpdateButton;
        MaterialButton r8 = (MaterialButton) uo.s(r1, R.id.createOrUpdateButton);
        if (r8 == null) goto L62;
        r3 = R.id.deleteButton;
        MaterialButton r9 = (MaterialButton) uo.s(r1, R.id.deleteButton);
        if (r9 == null) goto L62;
        r3 = R.id.footer;
        if (((LinearLayout) uo.s(r1, R.id.footer)) == null) goto L62;
        ConstraintLayout r6 = (ConstraintLayout) r1;
        r3 = R.id.preScrollDivider;
        if (((MaterialDivider) uo.s(r1, R.id.preScrollDivider)) == null) goto L62;
        r3 = R.id.scrollable;
        if (((ScrollView) uo.s(r1, R.id.scrollable)) == null) goto L62;
        r3 = R.id.server_cert_field;
        TextInputEditText r10 = (TextInputEditText) uo.s(r1, R.id.server_cert_field);
        if (r10 == null) goto L62;
        r3 = R.id.server_cert_field_container;
        TextInputLayout r11 = (TextInputLayout) uo.s(r1, R.id.server_cert_field_container);
        if (r11 == null) goto L62;
        r3 = R.id.server_cert_switch;
        MaterialSwitch r12 = (MaterialSwitch) uo.s(r1, R.id.server_cert_switch);
        if (r12 == null) goto L62;
        r3 = R.id.server_local_url_field;
        TextInputEditText r13 = (TextInputEditText) uo.s(r1, R.id.server_local_url_field);
        if (r13 == null) goto L62;
        r3 = R.id.server_local_url_field_container;
        TextInputLayout r14 = (TextInputLayout) uo.s(r1, R.id.server_local_url_field_container);
        if (r14 == null) goto L62;
        r3 = R.id.server_local_url_switch;
        MaterialSwitch r15 = (MaterialSwitch) uo.s(r1, R.id.server_local_url_switch);
        if (r15 == null) goto L62;
        r3 = R.id.server_name_field;
        TextInputEditText r16 = (TextInputEditText) uo.s(r1, R.id.server_name_field);
        if (r16 == null) goto L62;
        r3 = R.id.server_name_field_container;
        if (((TextInputLayout) uo.s(r1, R.id.server_name_field_container)) == null) goto L62;
        r3 = R.id.server_password_field;
        TextInputEditText r17 = (TextInputEditText) uo.s(r1, R.id.server_password_field);
        if (r17 == null) goto L62;
        r3 = R.id.server_password_field_container;
        if (((TextInputLayout) uo.s(r1, R.id.server_password_field_container)) == null) goto L62;
        r3 = R.id.serverPlaintextPassowrd;
        MaterialSwitch r18 = (MaterialSwitch) uo.s(r1, R.id.serverPlaintextPassowrd);
        if (r18 == null) goto L62;
        r3 = R.id.server_public_url_field;
        TextInputEditText r19 = (TextInputEditText) uo.s(r1, R.id.server_public_url_field);
        if (r19 == null) goto L62;
        r3 = R.id.server_public_url_field_container;
        if (((TextInputLayout) uo.s(r1, R.id.server_public_url_field_container)) == null) goto L62;
        r3 = R.id.server_user_field;
        TextInputEditText r20 = (TextInputEditText) uo.s(r1, R.id.server_user_field);
        if (r20 == null) goto L62;
        r3 = R.id.server_user_field_container;
        if (((TextInputLayout) uo.s(r1, R.id.server_user_field_container)) == null) goto L62;
        r3 = R.id.serversList;
        AutoCompleteTextView r21 = (AutoCompleteTextView) uo.s(r1, R.id.serversList);
        if (r21 == null) goto L62;
        r3 = R.id.serversListContainer;
        if (((TextInputLayout) uo.s(r1, R.id.serversListContainer)) == null) goto L62;
        r3 = R.id.testButton;
        MaterialButton r22 = (MaterialButton) uo.s(r1, R.id.testButton);
        if (r22 == null) goto L62;
        this.l0 = new pc1(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
        e75 r4 = d();
        b75 r5 = gh0.r(this);
        tf0 r23 = gh0.q(this);
        r5.getClass();
        r23.getClass();
        bq4 r27 = new bq4(r4, r5, r23);
        i30 r28 = kx3.a(ta4.class);
        String r29 = r28.b();
        if (r29 == null) goto L60;
        this.m0 = (ta4) r27.l(r28, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r29));
        Server r30 = new Server("Unselected", "Add new server", "", "", "", "", 0, false, "");
        ta4 r31 = this.m0;
        if (r31 == null) goto L58;
        r31.d.e(v(), new wd1(new o(17, this, r30), 6));
        pc1 r32 = this.l0;
        r32.getClass();
        ((AutoCompleteTextView) r32.p).setOnItemClickListener(new ne2(r2, this));
        pc1 r33 = this.l0;
        r33.getClass();
        ((MaterialButton) r33.q).setOnLongClickListener(new q6(12, this));
        pc1 r34 = this.l0;
        r34.getClass();
        final int r35 = 3;
        ((MaterialButton) r34.q).setOnClickListener(new me2(this, r35));
        pc1 r36 = this.l0;
        r36.getClass();
        final int r37 = 1;
        ((MaterialButton) r36.c).setOnClickListener(new me2(this, r37));
        pc1 r38 = this.l0;
        r38.getClass();
        ((MaterialButton) r38.d).setOnClickListener(new me2(this, r2));
        pc1 r39 = this.l0;
        r39.getClass();
        final int r40 = 5;
        ((MaterialButton) r39.b).setOnClickListener(new me2(this, r40));
        pc1 r41 = this.l0;
        r41.getClass();
        final int r42 = 2;
        ((MaterialSwitch) r41.j).setOnClickListener(new me2(this, r42));
        pc1 r43 = this.l0;
        r43.getClass();
        final int r44 = 4;
        ((MaterialSwitch) r43.g).setOnClickListener(new me2(this, r44));
        pc1 r0 = this.l0;
        r0.getClass();
        ConstraintLayout r45 = r0.a;
        r45.getClass();
        return r45;
    L58:
        h12.Q("serverViewModel");
        throw null;
    L60:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L62:
        nz2.n("Missing required view with ID: ".concat(r1.getResources().getResourceName(r3)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.l0 = null;
    }

    public final void i0() {
        pc1 r0 = this.l0;
        r0.getClass();
        ((MaterialButton) r0.c).setText(s(R.string.la_server_button_create));
        pc1 r1 = this.l0;
        r1.getClass();
        ((MaterialButton) r1.d).setEnabled(false);
        pc1 r2 = this.l0;
        r2.getClass();
        ((MaterialButton) r2.q).setEnabled(false);
        pc1 r3 = this.l0;
        r3.getClass();
        ((TextInputEditText) r3.k).setText("");
        pc1 r4 = this.l0;
        r4.getClass();
        ((TextInputEditText) r4.o).setText("");
        pc1 r5 = this.l0;
        r5.getClass();
        ((TextInputEditText) r5.l).setText("");
        pc1 r6 = this.l0;
        r6.getClass();
        ((TextInputEditText) r6.n).setText("");
        pc1 r7 = this.l0;
        r7.getClass();
        ((TextInputEditText) r7.h).setText("");
        pc1 r8 = this.l0;
        r8.getClass();
        ((TextInputEditText) r8.e).setText("");
    }

    public final void j0() {
        i0();
        this.o0 = 0;
        pc1 r1 = this.l0;
        r1.getClass();
        AutoCompleteTextView r2 = (AutoCompleteTextView) r1.p;
        ArrayList r3 = this.n0;
        if (r3 == null) goto L6;
        r2.setText(((Server) r3.get(0)).getServerName(), false);
        pc1 r4 = this.l0;
        r4.getClass();
        ((AutoCompleteTextView) r4.p).performCompletion();
        return;
    L6:
        h12.Q("serverList");
        throw null;
    }
}
