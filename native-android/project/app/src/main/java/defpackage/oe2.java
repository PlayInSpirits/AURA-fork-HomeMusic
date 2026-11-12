package defpackage;

import android.content.Intent;
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
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.model.Server;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oe2 extends kc1 {
    public pc1 l0;
    public ta4 m0;
    public ArrayList n0;
    public int o0;
    public boolean p0;

    public static final void h0(oe2 oe2Var, int i, String str, int i2) {
        pc1 pc1Var = oe2Var.l0;
        if (pc1Var == null) {
            return;
        }
        ((MaterialButton) pc1Var.q).setEnabled(true);
        Toast.makeText(oe2Var.n(), oe2Var.s(i) + (str == null ? "" : "\n".concat(str)), i2).show();
    }

    public static boolean k0(String str) {
        if (!URLUtil.isValidUrl(str)) {
            return false;
        }
        gr1 gr1VarB = null;
        try {
            fr1 fr1Var = new fr1();
            fr1Var.e(null, str);
            gr1VarB = fr1Var.b();
        } catch (IllegalArgumentException unused) {
        }
        return gr1VarB != null;
    }

    @Override // defpackage.kc1
    public final void F(Bundle bundle) {
        super.F(bundle);
        Bundle bundle2 = this.s;
        if (bundle2 != null) {
            bundle2.getBoolean("single_page_mode");
        }
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        final int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_login_server, viewGroup, false);
        int i2 = R.id.button5;
        MaterialButton materialButton = (MaterialButton) uo.s(viewInflate, R.id.button5);
        if (materialButton != null) {
            i2 = R.id.buttoner;
            if (((LinearLayout) uo.s(viewInflate, R.id.buttoner)) != null) {
                i2 = R.id.createOrUpdateButton;
                MaterialButton materialButton2 = (MaterialButton) uo.s(viewInflate, R.id.createOrUpdateButton);
                if (materialButton2 != null) {
                    i2 = R.id.deleteButton;
                    MaterialButton materialButton3 = (MaterialButton) uo.s(viewInflate, R.id.deleteButton);
                    if (materialButton3 != null) {
                        i2 = R.id.footer;
                        if (((LinearLayout) uo.s(viewInflate, R.id.footer)) != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            i2 = R.id.preScrollDivider;
                            if (((MaterialDivider) uo.s(viewInflate, R.id.preScrollDivider)) != null) {
                                i2 = R.id.scrollable;
                                if (((ScrollView) uo.s(viewInflate, R.id.scrollable)) != null) {
                                    i2 = R.id.server_cert_field;
                                    TextInputEditText textInputEditText = (TextInputEditText) uo.s(viewInflate, R.id.server_cert_field);
                                    if (textInputEditText != null) {
                                        i2 = R.id.server_cert_field_container;
                                        TextInputLayout textInputLayout = (TextInputLayout) uo.s(viewInflate, R.id.server_cert_field_container);
                                        if (textInputLayout != null) {
                                            i2 = R.id.server_cert_switch;
                                            MaterialSwitch materialSwitch = (MaterialSwitch) uo.s(viewInflate, R.id.server_cert_switch);
                                            if (materialSwitch != null) {
                                                i2 = R.id.server_local_url_field;
                                                TextInputEditText textInputEditText2 = (TextInputEditText) uo.s(viewInflate, R.id.server_local_url_field);
                                                if (textInputEditText2 != null) {
                                                    i2 = R.id.server_local_url_field_container;
                                                    TextInputLayout textInputLayout2 = (TextInputLayout) uo.s(viewInflate, R.id.server_local_url_field_container);
                                                    if (textInputLayout2 != null) {
                                                        i2 = R.id.server_local_url_switch;
                                                        MaterialSwitch materialSwitch2 = (MaterialSwitch) uo.s(viewInflate, R.id.server_local_url_switch);
                                                        if (materialSwitch2 != null) {
                                                            i2 = R.id.server_name_field;
                                                            TextInputEditText textInputEditText3 = (TextInputEditText) uo.s(viewInflate, R.id.server_name_field);
                                                            if (textInputEditText3 != null) {
                                                                i2 = R.id.server_name_field_container;
                                                                if (((TextInputLayout) uo.s(viewInflate, R.id.server_name_field_container)) != null) {
                                                                    i2 = R.id.server_password_field;
                                                                    TextInputEditText textInputEditText4 = (TextInputEditText) uo.s(viewInflate, R.id.server_password_field);
                                                                    if (textInputEditText4 != null) {
                                                                        i2 = R.id.server_password_field_container;
                                                                        if (((TextInputLayout) uo.s(viewInflate, R.id.server_password_field_container)) != null) {
                                                                            i2 = R.id.serverPlaintextPassowrd;
                                                                            MaterialSwitch materialSwitch3 = (MaterialSwitch) uo.s(viewInflate, R.id.serverPlaintextPassowrd);
                                                                            if (materialSwitch3 != null) {
                                                                                i2 = R.id.server_public_url_field;
                                                                                TextInputEditText textInputEditText5 = (TextInputEditText) uo.s(viewInflate, R.id.server_public_url_field);
                                                                                if (textInputEditText5 != null) {
                                                                                    i2 = R.id.server_public_url_field_container;
                                                                                    if (((TextInputLayout) uo.s(viewInflate, R.id.server_public_url_field_container)) != null) {
                                                                                        i2 = R.id.server_user_field;
                                                                                        TextInputEditText textInputEditText6 = (TextInputEditText) uo.s(viewInflate, R.id.server_user_field);
                                                                                        if (textInputEditText6 != null) {
                                                                                            i2 = R.id.server_user_field_container;
                                                                                            if (((TextInputLayout) uo.s(viewInflate, R.id.server_user_field_container)) != null) {
                                                                                                i2 = R.id.serversList;
                                                                                                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) uo.s(viewInflate, R.id.serversList);
                                                                                                if (autoCompleteTextView != null) {
                                                                                                    i2 = R.id.serversListContainer;
                                                                                                    if (((TextInputLayout) uo.s(viewInflate, R.id.serversListContainer)) != null) {
                                                                                                        i2 = R.id.testButton;
                                                                                                        MaterialButton materialButton4 = (MaterialButton) uo.s(viewInflate, R.id.testButton);
                                                                                                        if (materialButton4 != null) {
                                                                                                            this.l0 = new pc1(constraintLayout, materialButton, materialButton2, materialButton3, textInputEditText, textInputLayout, materialSwitch, textInputEditText2, textInputLayout2, materialSwitch2, textInputEditText3, textInputEditText4, materialSwitch3, textInputEditText5, textInputEditText6, autoCompleteTextView, materialButton4);
                                                                                                            e75 e75VarD = d();
                                                                                                            b75 b75VarR = gh0.r(this);
                                                                                                            tf0 tf0VarQ = gh0.q(this);
                                                                                                            b75VarR.getClass();
                                                                                                            tf0VarQ.getClass();
                                                                                                            bq4 bq4Var = new bq4(e75VarD, b75VarR, tf0VarQ);
                                                                                                            i30 i30VarA = kx3.a(ta4.class);
                                                                                                            String strB = i30VarA.b();
                                                                                                            if (strB == null) {
                                                                                                                kf2.n("Local and anonymous classes can not be ViewModels");
                                                                                                                return null;
                                                                                                            }
                                                                                                            this.m0 = (ta4) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                                                                                                            Server server = new Server("Unselected", "Add new server", "", "", "", "", 0L, false, "");
                                                                                                            ta4 ta4Var = this.m0;
                                                                                                            if (ta4Var == null) {
                                                                                                                h12.Q("serverViewModel");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            ta4Var.d.e(v(), new wd1(new o(17, this, server), 6));
                                                                                                            pc1 pc1Var = this.l0;
                                                                                                            pc1Var.getClass();
                                                                                                            ((AutoCompleteTextView) pc1Var.p).setOnItemClickListener(new ne2(i, this));
                                                                                                            pc1 pc1Var2 = this.l0;
                                                                                                            pc1Var2.getClass();
                                                                                                            ((MaterialButton) pc1Var2.q).setOnLongClickListener(new q6(12, this));
                                                                                                            pc1 pc1Var3 = this.l0;
                                                                                                            pc1Var3.getClass();
                                                                                                            final int i3 = 3;
                                                                                                            ((MaterialButton) pc1Var3.q).setOnClickListener(new View.OnClickListener(this) { // from class: me2
                                                                                                                public final /* synthetic */ oe2 o;

                                                                                                                {
                                                                                                                    this.o = this;
                                                                                                                }

                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view) {
                                                                                                                    String serverId;
                                                                                                                    int i4 = i3;
                                                                                                                    oe2 oe2Var = this.o;
                                                                                                                    switch (i4) {
                                                                                                                        case 0:
                                                                                                                            ta4 ta4Var2 = oe2Var.m0;
                                                                                                                            if (ta4Var2 == null) {
                                                                                                                                h12.Q("serverViewModel");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            ArrayList arrayList = oe2Var.n0;
                                                                                                                            if (arrayList == null) {
                                                                                                                                h12.Q("serverList");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            Server server2 = (Server) arrayList.get(oe2Var.o0);
                                                                                                                            server2.getClass();
                                                                                                                            new Thread(new oa4((na4) ta4Var2.c.o, server2, 0)).start();
                                                                                                                            oe2Var.j0();
                                                                                                                            Toast.makeText(oe2Var.n(), oe2Var.s(R.string.la_server_toast_deleted), 0).show();
                                                                                                                            return;
                                                                                                                        case 1:
                                                                                                                            String strS = oe2Var.s(R.string.la_server_field_server_empty_error);
                                                                                                                            strS.getClass();
                                                                                                                            String strS2 = oe2Var.s(R.string.la_server_field_server_url_error);
                                                                                                                            strS2.getClass();
                                                                                                                            pc1 pc1Var4 = oe2Var.l0;
                                                                                                                            pc1Var4.getClass();
                                                                                                                            int length = String.valueOf(((TextInputEditText) pc1Var4.k).getText()).length();
                                                                                                                            pc1 pc1Var5 = oe2Var.l0;
                                                                                                                            if (length == 0) {
                                                                                                                                pc1Var5.getClass();
                                                                                                                                ((TextInputEditText) pc1Var5.k).setError(strS);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var5.getClass();
                                                                                                                            int length2 = String.valueOf(((TextInputEditText) pc1Var5.o).getText()).length();
                                                                                                                            pc1 pc1Var6 = oe2Var.l0;
                                                                                                                            if (length2 == 0) {
                                                                                                                                pc1Var6.getClass();
                                                                                                                                ((TextInputEditText) pc1Var6.o).setError(strS);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var6.getClass();
                                                                                                                            int length3 = String.valueOf(((TextInputEditText) pc1Var6.l).getText()).length();
                                                                                                                            pc1 pc1Var7 = oe2Var.l0;
                                                                                                                            if (length3 == 0) {
                                                                                                                                pc1Var7.getClass();
                                                                                                                                ((TextInputEditText) pc1Var7.l).setError(strS);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var7.getClass();
                                                                                                                            int length4 = String.valueOf(((TextInputEditText) pc1Var7.n).getText()).length();
                                                                                                                            pc1 pc1Var8 = oe2Var.l0;
                                                                                                                            if (length4 == 0) {
                                                                                                                                pc1Var8.getClass();
                                                                                                                                ((TextInputEditText) pc1Var8.n).setError(strS);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var8.getClass();
                                                                                                                            boolean zK0 = oe2.k0(String.valueOf(((TextInputEditText) pc1Var8.n).getText()));
                                                                                                                            pc1 pc1Var9 = oe2Var.l0;
                                                                                                                            if (!zK0) {
                                                                                                                                pc1Var9.getClass();
                                                                                                                                ((TextInputEditText) pc1Var9.n).setError(strS2);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var9.getClass();
                                                                                                                            if (((MaterialSwitch) pc1Var9.j).isChecked()) {
                                                                                                                                pc1 pc1Var10 = oe2Var.l0;
                                                                                                                                pc1Var10.getClass();
                                                                                                                                if (String.valueOf(((TextInputEditText) pc1Var10.h).getText()).length() == 0) {
                                                                                                                                    pc1 pc1Var11 = oe2Var.l0;
                                                                                                                                    pc1Var11.getClass();
                                                                                                                                    ((TextInputEditText) pc1Var11.h).setError(strS);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            pc1 pc1Var12 = oe2Var.l0;
                                                                                                                            pc1Var12.getClass();
                                                                                                                            if (((MaterialSwitch) pc1Var12.j).isChecked()) {
                                                                                                                                pc1 pc1Var13 = oe2Var.l0;
                                                                                                                                pc1Var13.getClass();
                                                                                                                                if (!oe2.k0(String.valueOf(((TextInputEditText) pc1Var13.h).getText()))) {
                                                                                                                                    pc1 pc1Var14 = oe2Var.l0;
                                                                                                                                    pc1Var14.getClass();
                                                                                                                                    ((TextInputEditText) pc1Var14.h).setError(strS2);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            int i5 = oe2Var.o0;
                                                                                                                            ArrayList arrayList2 = oe2Var.n0;
                                                                                                                            if (i5 == 0) {
                                                                                                                                if (arrayList2 == null) {
                                                                                                                                    h12.Q("serverList");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                serverId = String.valueOf(arrayList2.size() + 1);
                                                                                                                            } else {
                                                                                                                                if (arrayList2 == null) {
                                                                                                                                    h12.Q("serverList");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                serverId = ((Server) arrayList2.get(i5)).getServerId();
                                                                                                                            }
                                                                                                                            String str = serverId;
                                                                                                                            pc1 pc1Var15 = oe2Var.l0;
                                                                                                                            pc1Var15.getClass();
                                                                                                                            String strValueOf = String.valueOf(((TextInputEditText) pc1Var15.k).getText());
                                                                                                                            pc1 pc1Var16 = oe2Var.l0;
                                                                                                                            pc1Var16.getClass();
                                                                                                                            String strValueOf2 = String.valueOf(((TextInputEditText) pc1Var16.o).getText());
                                                                                                                            pc1 pc1Var17 = oe2Var.l0;
                                                                                                                            pc1Var17.getClass();
                                                                                                                            String strValueOf3 = String.valueOf(((TextInputEditText) pc1Var17.l).getText());
                                                                                                                            pc1 pc1Var18 = oe2Var.l0;
                                                                                                                            pc1Var18.getClass();
                                                                                                                            String strValueOf4 = String.valueOf(((TextInputEditText) pc1Var18.n).getText());
                                                                                                                            pc1 pc1Var19 = oe2Var.l0;
                                                                                                                            pc1Var19.getClass();
                                                                                                                            String strValueOf5 = String.valueOf(((TextInputEditText) pc1Var19.h).getText());
                                                                                                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                                                                                                            pc1 pc1Var20 = oe2Var.l0;
                                                                                                                            pc1Var20.getClass();
                                                                                                                            boolean zIsChecked = ((MaterialSwitch) pc1Var20.m).isChecked();
                                                                                                                            pc1 pc1Var21 = oe2Var.l0;
                                                                                                                            pc1Var21.getClass();
                                                                                                                            Server server3 = new Server(str, strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, jCurrentTimeMillis, zIsChecked, String.valueOf(((TextInputEditText) pc1Var21.e).getText()));
                                                                                                                            int i6 = oe2Var.o0;
                                                                                                                            ta4 ta4Var3 = oe2Var.m0;
                                                                                                                            if (i6 == 0) {
                                                                                                                                if (ta4Var3 == null) {
                                                                                                                                    h12.Q("serverViewModel");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                new Thread(new oa4((na4) ta4Var3.c.o, server3, 1)).start();
                                                                                                                                Toast.makeText(oe2Var.n(), oe2Var.s(R.string.la_server_toast_created), 0).show();
                                                                                                                                oe2Var.j0();
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            if (ta4Var3 == null) {
                                                                                                                                h12.Q("serverViewModel");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            new Thread(new oa4((na4) ta4Var3.c.o, server3, 2)).start();
                                                                                                                            Toast.makeText(oe2Var.n(), oe2Var.s(R.string.la_server_toast_updated), 0).show();
                                                                                                                            oe2Var.j0();
                                                                                                                            return;
                                                                                                                        case 2:
                                                                                                                            pc1 pc1Var22 = oe2Var.l0;
                                                                                                                            pc1Var22.getClass();
                                                                                                                            boolean zIsChecked2 = ((MaterialSwitch) pc1Var22.j).isChecked();
                                                                                                                            pc1 pc1Var23 = oe2Var.l0;
                                                                                                                            if (!zIsChecked2) {
                                                                                                                                pc1Var23.getClass();
                                                                                                                                ((TextInputLayout) pc1Var23.i).setVisibility(8);
                                                                                                                                pc1 pc1Var24 = oe2Var.l0;
                                                                                                                                pc1Var24.getClass();
                                                                                                                                ((TextInputEditText) pc1Var24.h).setText("");
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var23.getClass();
                                                                                                                            ((TextInputLayout) pc1Var23.i).setVisibility(0);
                                                                                                                            pc1 pc1Var25 = oe2Var.l0;
                                                                                                                            pc1Var25.getClass();
                                                                                                                            TextInputEditText textInputEditText7 = (TextInputEditText) pc1Var25.h;
                                                                                                                            ArrayList arrayList3 = oe2Var.n0;
                                                                                                                            if (arrayList3 == null) {
                                                                                                                                h12.Q("serverList");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            String localAddress = ((Server) arrayList3.get(oe2Var.o0)).getLocalAddress();
                                                                                                                            textInputEditText7.setText(localAddress != null ? localAddress : "");
                                                                                                                            return;
                                                                                                                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                                                            pc1 pc1Var26 = oe2Var.l0;
                                                                                                                            pc1Var26.getClass();
                                                                                                                            ((MaterialButton) pc1Var26.q).setEnabled(false);
                                                                                                                            Toast.makeText(oe2Var.n(), oe2Var.s(R.string.la_server_toast_connection_testing), 0).show();
                                                                                                                            ArrayList arrayList4 = oe2Var.n0;
                                                                                                                            if (arrayList4 == null) {
                                                                                                                                h12.Q("serverList");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            Server server4 = (Server) arrayList4.get(oe2Var.o0);
                                                                                                                            App app2 = App.n;
                                                                                                                            String address = server4.getAddress();
                                                                                                                            String username = server4.getUsername();
                                                                                                                            String password = server4.getPassword();
                                                                                                                            boolean zIsLowSecurity = server4.isLowSecurity();
                                                                                                                            c12 c12Var = new c12(10);
                                                                                                                            c12Var.o = address;
                                                                                                                            c12Var.p = username;
                                                                                                                            c12Var.j(password, null, zIsLowSecurity, null);
                                                                                                                            pn4 pn4Var = new pn4(c12Var);
                                                                                                                            hg3 hg3Var = new hg3(26, oe2Var);
                                                                                                                            if (pn4Var.c == null) {
                                                                                                                                pn4Var.c = new gp3(pn4Var, 21);
                                                                                                                            }
                                                                                                                            pn4Var.c.u().enqueue(new rm2(23, hg3Var));
                                                                                                                            return;
                                                                                                                        case 4:
                                                                                                                            pc1 pc1Var27 = oe2Var.l0;
                                                                                                                            pc1Var27.getClass();
                                                                                                                            boolean zIsChecked3 = ((MaterialSwitch) pc1Var27.g).isChecked();
                                                                                                                            pc1 pc1Var28 = oe2Var.l0;
                                                                                                                            if (!zIsChecked3) {
                                                                                                                                pc1Var28.getClass();
                                                                                                                                ((TextInputLayout) pc1Var28.f).setVisibility(8);
                                                                                                                                pc1 pc1Var29 = oe2Var.l0;
                                                                                                                                pc1Var29.getClass();
                                                                                                                                ((TextInputEditText) pc1Var29.e).setText("");
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var28.getClass();
                                                                                                                            ((TextInputLayout) pc1Var28.f).setVisibility(0);
                                                                                                                            pc1 pc1Var30 = oe2Var.l0;
                                                                                                                            pc1Var30.getClass();
                                                                                                                            TextInputEditText textInputEditText8 = (TextInputEditText) pc1Var30.e;
                                                                                                                            ArrayList arrayList5 = oe2Var.n0;
                                                                                                                            if (arrayList5 == null) {
                                                                                                                                h12.Q("serverList");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            String clientCert = ((Server) arrayList5.get(oe2Var.o0)).getClientCert();
                                                                                                                            textInputEditText8.setText(clientCert != null ? clientCert : "");
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            oe2Var.X().finish();
                                                                                                                            Intent intent = new Intent(oe2Var.X(), (Class<?>) MainActivity.class);
                                                                                                                            intent.putExtra("LOGIN_ACTIVITY_INTENT", "open_legacy_login_fragment");
                                                                                                                            oe2Var.g0(intent);
                                                                                                                            return;
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            pc1 pc1Var4 = this.l0;
                                                                                                            pc1Var4.getClass();
                                                                                                            final int i4 = 1;
                                                                                                            ((MaterialButton) pc1Var4.c).setOnClickListener(new View.OnClickListener(this) { // from class: me2
                                                                                                                public final /* synthetic */ oe2 o;

                                                                                                                {
                                                                                                                    this.o = this;
                                                                                                                }

                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view) {
                                                                                                                    String serverId;
                                                                                                                    int i5 = i4;
                                                                                                                    oe2 oe2Var = this.o;
                                                                                                                    switch (i5) {
                                                                                                                        case 0:
                                                                                                                            ta4 ta4Var2 = oe2Var.m0;
                                                                                                                            if (ta4Var2 == null) {
                                                                                                                                h12.Q("serverViewModel");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            ArrayList arrayList = oe2Var.n0;
                                                                                                                            if (arrayList == null) {
                                                                                                                                h12.Q("serverList");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            Server server2 = (Server) arrayList.get(oe2Var.o0);
                                                                                                                            server2.getClass();
                                                                                                                            new Thread(new oa4((na4) ta4Var2.c.o, server2, 0)).start();
                                                                                                                            oe2Var.j0();
                                                                                                                            Toast.makeText(oe2Var.n(), oe2Var.s(R.string.la_server_toast_deleted), 0).show();
                                                                                                                            return;
                                                                                                                        case 1:
                                                                                                                            String strS = oe2Var.s(R.string.la_server_field_server_empty_error);
                                                                                                                            strS.getClass();
                                                                                                                            String strS2 = oe2Var.s(R.string.la_server_field_server_url_error);
                                                                                                                            strS2.getClass();
                                                                                                                            pc1 pc1Var5 = oe2Var.l0;
                                                                                                                            pc1Var5.getClass();
                                                                                                                            int length = String.valueOf(((TextInputEditText) pc1Var5.k).getText()).length();
                                                                                                                            pc1 pc1Var6 = oe2Var.l0;
                                                                                                                            if (length == 0) {
                                                                                                                                pc1Var6.getClass();
                                                                                                                                ((TextInputEditText) pc1Var6.k).setError(strS);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var6.getClass();
                                                                                                                            int length2 = String.valueOf(((TextInputEditText) pc1Var6.o).getText()).length();
                                                                                                                            pc1 pc1Var7 = oe2Var.l0;
                                                                                                                            if (length2 == 0) {
                                                                                                                                pc1Var7.getClass();
                                                                                                                                ((TextInputEditText) pc1Var7.o).setError(strS);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var7.getClass();
                                                                                                                            int length3 = String.valueOf(((TextInputEditText) pc1Var7.l).getText()).length();
                                                                                                                            pc1 pc1Var8 = oe2Var.l0;
                                                                                                                            if (length3 == 0) {
                                                                                                                                pc1Var8.getClass();
                                                                                                                                ((TextInputEditText) pc1Var8.l).setError(strS);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var8.getClass();
                                                                                                                            int length4 = String.valueOf(((TextInputEditText) pc1Var8.n).getText()).length();
                                                                                                                            pc1 pc1Var9 = oe2Var.l0;
                                                                                                                            if (length4 == 0) {
                                                                                                                                pc1Var9.getClass();
                                                                                                                                ((TextInputEditText) pc1Var9.n).setError(strS);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var9.getClass();
                                                                                                                            boolean zK0 = oe2.k0(String.valueOf(((TextInputEditText) pc1Var9.n).getText()));
                                                                                                                            pc1 pc1Var10 = oe2Var.l0;
                                                                                                                            if (!zK0) {
                                                                                                                                pc1Var10.getClass();
                                                                                                                                ((TextInputEditText) pc1Var10.n).setError(strS2);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var10.getClass();
                                                                                                                            if (((MaterialSwitch) pc1Var10.j).isChecked()) {
                                                                                                                                pc1 pc1Var11 = oe2Var.l0;
                                                                                                                                pc1Var11.getClass();
                                                                                                                                if (String.valueOf(((TextInputEditText) pc1Var11.h).getText()).length() == 0) {
                                                                                                                                    pc1 pc1Var12 = oe2Var.l0;
                                                                                                                                    pc1Var12.getClass();
                                                                                                                                    ((TextInputEditText) pc1Var12.h).setError(strS);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            pc1 pc1Var13 = oe2Var.l0;
                                                                                                                            pc1Var13.getClass();
                                                                                                                            if (((MaterialSwitch) pc1Var13.j).isChecked()) {
                                                                                                                                pc1 pc1Var14 = oe2Var.l0;
                                                                                                                                pc1Var14.getClass();
                                                                                                                                if (!oe2.k0(String.valueOf(((TextInputEditText) pc1Var14.h).getText()))) {
                                                                                                                                    pc1 pc1Var15 = oe2Var.l0;
                                                                                                                                    pc1Var15.getClass();
                                                                                                                                    ((TextInputEditText) pc1Var15.h).setError(strS2);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            int i6 = oe2Var.o0;
                                                                                                                            ArrayList arrayList2 = oe2Var.n0;
                                                                                                                            if (i6 == 0) {
                                                                                                                                if (arrayList2 == null) {
                                                                                                                                    h12.Q("serverList");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                serverId = String.valueOf(arrayList2.size() + 1);
                                                                                                                            } else {
                                                                                                                                if (arrayList2 == null) {
                                                                                                                                    h12.Q("serverList");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                serverId = ((Server) arrayList2.get(i6)).getServerId();
                                                                                                                            }
                                                                                                                            String str = serverId;
                                                                                                                            pc1 pc1Var16 = oe2Var.l0;
                                                                                                                            pc1Var16.getClass();
                                                                                                                            String strValueOf = String.valueOf(((TextInputEditText) pc1Var16.k).getText());
                                                                                                                            pc1 pc1Var17 = oe2Var.l0;
                                                                                                                            pc1Var17.getClass();
                                                                                                                            String strValueOf2 = String.valueOf(((TextInputEditText) pc1Var17.o).getText());
                                                                                                                            pc1 pc1Var18 = oe2Var.l0;
                                                                                                                            pc1Var18.getClass();
                                                                                                                            String strValueOf3 = String.valueOf(((TextInputEditText) pc1Var18.l).getText());
                                                                                                                            pc1 pc1Var19 = oe2Var.l0;
                                                                                                                            pc1Var19.getClass();
                                                                                                                            String strValueOf4 = String.valueOf(((TextInputEditText) pc1Var19.n).getText());
                                                                                                                            pc1 pc1Var110 = oe2Var.l0;
                                                                                                                            pc1Var110.getClass();
                                                                                                                            String strValueOf5 = String.valueOf(((TextInputEditText) pc1Var110.h).getText());
                                                                                                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                                                                                                            pc1 pc1Var20 = oe2Var.l0;
                                                                                                                            pc1Var20.getClass();
                                                                                                                            boolean zIsChecked = ((MaterialSwitch) pc1Var20.m).isChecked();
                                                                                                                            pc1 pc1Var21 = oe2Var.l0;
                                                                                                                            pc1Var21.getClass();
                                                                                                                            Server server3 = new Server(str, strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, jCurrentTimeMillis, zIsChecked, String.valueOf(((TextInputEditText) pc1Var21.e).getText()));
                                                                                                                            int i7 = oe2Var.o0;
                                                                                                                            ta4 ta4Var3 = oe2Var.m0;
                                                                                                                            if (i7 == 0) {
                                                                                                                                if (ta4Var3 == null) {
                                                                                                                                    h12.Q("serverViewModel");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                new Thread(new oa4((na4) ta4Var3.c.o, server3, 1)).start();
                                                                                                                                Toast.makeText(oe2Var.n(), oe2Var.s(R.string.la_server_toast_created), 0).show();
                                                                                                                                oe2Var.j0();
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            if (ta4Var3 == null) {
                                                                                                                                h12.Q("serverViewModel");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            new Thread(new oa4((na4) ta4Var3.c.o, server3, 2)).start();
                                                                                                                            Toast.makeText(oe2Var.n(), oe2Var.s(R.string.la_server_toast_updated), 0).show();
                                                                                                                            oe2Var.j0();
                                                                                                                            return;
                                                                                                                        case 2:
                                                                                                                            pc1 pc1Var22 = oe2Var.l0;
                                                                                                                            pc1Var22.getClass();
                                                                                                                            boolean zIsChecked2 = ((MaterialSwitch) pc1Var22.j).isChecked();
                                                                                                                            pc1 pc1Var23 = oe2Var.l0;
                                                                                                                            if (!zIsChecked2) {
                                                                                                                                pc1Var23.getClass();
                                                                                                                                ((TextInputLayout) pc1Var23.i).setVisibility(8);
                                                                                                                                pc1 pc1Var24 = oe2Var.l0;
                                                                                                                                pc1Var24.getClass();
                                                                                                                                ((TextInputEditText) pc1Var24.h).setText("");
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var23.getClass();
                                                                                                                            ((TextInputLayout) pc1Var23.i).setVisibility(0);
                                                                                                                            pc1 pc1Var25 = oe2Var.l0;
                                                                                                                            pc1Var25.getClass();
                                                                                                                            TextInputEditText textInputEditText7 = (TextInputEditText) pc1Var25.h;
                                                                                                                            ArrayList arrayList3 = oe2Var.n0;
                                                                                                                            if (arrayList3 == null) {
                                                                                                                                h12.Q("serverList");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            String localAddress = ((Server) arrayList3.get(oe2Var.o0)).getLocalAddress();
                                                                                                                            textInputEditText7.setText(localAddress != null ? localAddress : "");
                                                                                                                            return;
                                                                                                                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                                                            pc1 pc1Var26 = oe2Var.l0;
                                                                                                                            pc1Var26.getClass();
                                                                                                                            ((MaterialButton) pc1Var26.q).setEnabled(false);
                                                                                                                            Toast.makeText(oe2Var.n(), oe2Var.s(R.string.la_server_toast_connection_testing), 0).show();
                                                                                                                            ArrayList arrayList4 = oe2Var.n0;
                                                                                                                            if (arrayList4 == null) {
                                                                                                                                h12.Q("serverList");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            Server server4 = (Server) arrayList4.get(oe2Var.o0);
                                                                                                                            App app2 = App.n;
                                                                                                                            String address = server4.getAddress();
                                                                                                                            String username = server4.getUsername();
                                                                                                                            String password = server4.getPassword();
                                                                                                                            boolean zIsLowSecurity = server4.isLowSecurity();
                                                                                                                            c12 c12Var = new c12(10);
                                                                                                                            c12Var.o = address;
                                                                                                                            c12Var.p = username;
                                                                                                                            c12Var.j(password, null, zIsLowSecurity, null);
                                                                                                                            pn4 pn4Var = new pn4(c12Var);
                                                                                                                            hg3 hg3Var = new hg3(26, oe2Var);
                                                                                                                            if (pn4Var.c == null) {
                                                                                                                                pn4Var.c = new gp3(pn4Var, 21);
                                                                                                                            }
                                                                                                                            pn4Var.c.u().enqueue(new rm2(23, hg3Var));
                                                                                                                            return;
                                                                                                                        case 4:
                                                                                                                            pc1 pc1Var27 = oe2Var.l0;
                                                                                                                            pc1Var27.getClass();
                                                                                                                            boolean zIsChecked3 = ((MaterialSwitch) pc1Var27.g).isChecked();
                                                                                                                            pc1 pc1Var28 = oe2Var.l0;
                                                                                                                            if (!zIsChecked3) {
                                                                                                                                pc1Var28.getClass();
                                                                                                                                ((TextInputLayout) pc1Var28.f).setVisibility(8);
                                                                                                                                pc1 pc1Var29 = oe2Var.l0;
                                                                                                                                pc1Var29.getClass();
                                                                                                                                ((TextInputEditText) pc1Var29.e).setText("");
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var28.getClass();
                                                                                                                            ((TextInputLayout) pc1Var28.f).setVisibility(0);
                                                                                                                            pc1 pc1Var30 = oe2Var.l0;
                                                                                                                            pc1Var30.getClass();
                                                                                                                            TextInputEditText textInputEditText8 = (TextInputEditText) pc1Var30.e;
                                                                                                                            ArrayList arrayList5 = oe2Var.n0;
                                                                                                                            if (arrayList5 == null) {
                                                                                                                                h12.Q("serverList");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            String clientCert = ((Server) arrayList5.get(oe2Var.o0)).getClientCert();
                                                                                                                            textInputEditText8.setText(clientCert != null ? clientCert : "");
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            oe2Var.X().finish();
                                                                                                                            Intent intent = new Intent(oe2Var.X(), (Class<?>) MainActivity.class);
                                                                                                                            intent.putExtra("LOGIN_ACTIVITY_INTENT", "open_legacy_login_fragment");
                                                                                                                            oe2Var.g0(intent);
                                                                                                                            return;
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            pc1 pc1Var5 = this.l0;
                                                                                                            pc1Var5.getClass();
                                                                                                            ((MaterialButton) pc1Var5.d).setOnClickListener(new View.OnClickListener(this) { // from class: me2
                                                                                                                public final /* synthetic */ oe2 o;

                                                                                                                {
                                                                                                                    this.o = this;
                                                                                                                }

                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view) {
                                                                                                                    String serverId;
                                                                                                                    int i5 = i;
                                                                                                                    oe2 oe2Var = this.o;
                                                                                                                    switch (i5) {
                                                                                                                        case 0:
                                                                                                                            ta4 ta4Var2 = oe2Var.m0;
                                                                                                                            if (ta4Var2 == null) {
                                                                                                                                h12.Q("serverViewModel");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            ArrayList arrayList = oe2Var.n0;
                                                                                                                            if (arrayList == null) {
                                                                                                                                h12.Q("serverList");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            Server server2 = (Server) arrayList.get(oe2Var.o0);
                                                                                                                            server2.getClass();
                                                                                                                            new Thread(new oa4((na4) ta4Var2.c.o, server2, 0)).start();
                                                                                                                            oe2Var.j0();
                                                                                                                            Toast.makeText(oe2Var.n(), oe2Var.s(R.string.la_server_toast_deleted), 0).show();
                                                                                                                            return;
                                                                                                                        case 1:
                                                                                                                            String strS = oe2Var.s(R.string.la_server_field_server_empty_error);
                                                                                                                            strS.getClass();
                                                                                                                            String strS2 = oe2Var.s(R.string.la_server_field_server_url_error);
                                                                                                                            strS2.getClass();
                                                                                                                            pc1 pc1Var6 = oe2Var.l0;
                                                                                                                            pc1Var6.getClass();
                                                                                                                            int length = String.valueOf(((TextInputEditText) pc1Var6.k).getText()).length();
                                                                                                                            pc1 pc1Var7 = oe2Var.l0;
                                                                                                                            if (length == 0) {
                                                                                                                                pc1Var7.getClass();
                                                                                                                                ((TextInputEditText) pc1Var7.k).setError(strS);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var7.getClass();
                                                                                                                            int length2 = String.valueOf(((TextInputEditText) pc1Var7.o).getText()).length();
                                                                                                                            pc1 pc1Var8 = oe2Var.l0;
                                                                                                                            if (length2 == 0) {
                                                                                                                                pc1Var8.getClass();
                                                                                                                                ((TextInputEditText) pc1Var8.o).setError(strS);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var8.getClass();
                                                                                                                            int length3 = String.valueOf(((TextInputEditText) pc1Var8.l).getText()).length();
                                                                                                                            pc1 pc1Var9 = oe2Var.l0;
                                                                                                                            if (length3 == 0) {
                                                                                                                                pc1Var9.getClass();
                                                                                                                                ((TextInputEditText) pc1Var9.l).setError(strS);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var9.getClass();
                                                                                                                            int length4 = String.valueOf(((TextInputEditText) pc1Var9.n).getText()).length();
                                                                                                                            pc1 pc1Var10 = oe2Var.l0;
                                                                                                                            if (length4 == 0) {
                                                                                                                                pc1Var10.getClass();
                                                                                                                                ((TextInputEditText) pc1Var10.n).setError(strS);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var10.getClass();
                                                                                                                            boolean zK0 = oe2.k0(String.valueOf(((TextInputEditText) pc1Var10.n).getText()));
                                                                                                                            pc1 pc1Var11 = oe2Var.l0;
                                                                                                                            if (!zK0) {
                                                                                                                                pc1Var11.getClass();
                                                                                                                                ((TextInputEditText) pc1Var11.n).setError(strS2);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var11.getClass();
                                                                                                                            if (((MaterialSwitch) pc1Var11.j).isChecked()) {
                                                                                                                                pc1 pc1Var12 = oe2Var.l0;
                                                                                                                                pc1Var12.getClass();
                                                                                                                                if (String.valueOf(((TextInputEditText) pc1Var12.h).getText()).length() == 0) {
                                                                                                                                    pc1 pc1Var13 = oe2Var.l0;
                                                                                                                                    pc1Var13.getClass();
                                                                                                                                    ((TextInputEditText) pc1Var13.h).setError(strS);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            pc1 pc1Var14 = oe2Var.l0;
                                                                                                                            pc1Var14.getClass();
                                                                                                                            if (((MaterialSwitch) pc1Var14.j).isChecked()) {
                                                                                                                                pc1 pc1Var15 = oe2Var.l0;
                                                                                                                                pc1Var15.getClass();
                                                                                                                                if (!oe2.k0(String.valueOf(((TextInputEditText) pc1Var15.h).getText()))) {
                                                                                                                                    pc1 pc1Var16 = oe2Var.l0;
                                                                                                                                    pc1Var16.getClass();
                                                                                                                                    ((TextInputEditText) pc1Var16.h).setError(strS2);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            int i6 = oe2Var.o0;
                                                                                                                            ArrayList arrayList2 = oe2Var.n0;
                                                                                                                            if (i6 == 0) {
                                                                                                                                if (arrayList2 == null) {
                                                                                                                                    h12.Q("serverList");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                serverId = String.valueOf(arrayList2.size() + 1);
                                                                                                                            } else {
                                                                                                                                if (arrayList2 == null) {
                                                                                                                                    h12.Q("serverList");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                serverId = ((Server) arrayList2.get(i6)).getServerId();
                                                                                                                            }
                                                                                                                            String str = serverId;
                                                                                                                            pc1 pc1Var17 = oe2Var.l0;
                                                                                                                            pc1Var17.getClass();
                                                                                                                            String strValueOf = String.valueOf(((TextInputEditText) pc1Var17.k).getText());
                                                                                                                            pc1 pc1Var18 = oe2Var.l0;
                                                                                                                            pc1Var18.getClass();
                                                                                                                            String strValueOf2 = String.valueOf(((TextInputEditText) pc1Var18.o).getText());
                                                                                                                            pc1 pc1Var19 = oe2Var.l0;
                                                                                                                            pc1Var19.getClass();
                                                                                                                            String strValueOf3 = String.valueOf(((TextInputEditText) pc1Var19.l).getText());
                                                                                                                            pc1 pc1Var110 = oe2Var.l0;
                                                                                                                            pc1Var110.getClass();
                                                                                                                            String strValueOf4 = String.valueOf(((TextInputEditText) pc1Var110.n).getText());
                                                                                                                            pc1 pc1Var111 = oe2Var.l0;
                                                                                                                            pc1Var111.getClass();
                                                                                                                            String strValueOf5 = String.valueOf(((TextInputEditText) pc1Var111.h).getText());
                                                                                                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                                                                                                            pc1 pc1Var20 = oe2Var.l0;
                                                                                                                            pc1Var20.getClass();
                                                                                                                            boolean zIsChecked = ((MaterialSwitch) pc1Var20.m).isChecked();
                                                                                                                            pc1 pc1Var21 = oe2Var.l0;
                                                                                                                            pc1Var21.getClass();
                                                                                                                            Server server3 = new Server(str, strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, jCurrentTimeMillis, zIsChecked, String.valueOf(((TextInputEditText) pc1Var21.e).getText()));
                                                                                                                            int i7 = oe2Var.o0;
                                                                                                                            ta4 ta4Var3 = oe2Var.m0;
                                                                                                                            if (i7 == 0) {
                                                                                                                                if (ta4Var3 == null) {
                                                                                                                                    h12.Q("serverViewModel");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                new Thread(new oa4((na4) ta4Var3.c.o, server3, 1)).start();
                                                                                                                                Toast.makeText(oe2Var.n(), oe2Var.s(R.string.la_server_toast_created), 0).show();
                                                                                                                                oe2Var.j0();
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            if (ta4Var3 == null) {
                                                                                                                                h12.Q("serverViewModel");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            new Thread(new oa4((na4) ta4Var3.c.o, server3, 2)).start();
                                                                                                                            Toast.makeText(oe2Var.n(), oe2Var.s(R.string.la_server_toast_updated), 0).show();
                                                                                                                            oe2Var.j0();
                                                                                                                            return;
                                                                                                                        case 2:
                                                                                                                            pc1 pc1Var22 = oe2Var.l0;
                                                                                                                            pc1Var22.getClass();
                                                                                                                            boolean zIsChecked2 = ((MaterialSwitch) pc1Var22.j).isChecked();
                                                                                                                            pc1 pc1Var23 = oe2Var.l0;
                                                                                                                            if (!zIsChecked2) {
                                                                                                                                pc1Var23.getClass();
                                                                                                                                ((TextInputLayout) pc1Var23.i).setVisibility(8);
                                                                                                                                pc1 pc1Var24 = oe2Var.l0;
                                                                                                                                pc1Var24.getClass();
                                                                                                                                ((TextInputEditText) pc1Var24.h).setText("");
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var23.getClass();
                                                                                                                            ((TextInputLayout) pc1Var23.i).setVisibility(0);
                                                                                                                            pc1 pc1Var25 = oe2Var.l0;
                                                                                                                            pc1Var25.getClass();
                                                                                                                            TextInputEditText textInputEditText7 = (TextInputEditText) pc1Var25.h;
                                                                                                                            ArrayList arrayList3 = oe2Var.n0;
                                                                                                                            if (arrayList3 == null) {
                                                                                                                                h12.Q("serverList");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            String localAddress = ((Server) arrayList3.get(oe2Var.o0)).getLocalAddress();
                                                                                                                            textInputEditText7.setText(localAddress != null ? localAddress : "");
                                                                                                                            return;
                                                                                                                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                                                            pc1 pc1Var26 = oe2Var.l0;
                                                                                                                            pc1Var26.getClass();
                                                                                                                            ((MaterialButton) pc1Var26.q).setEnabled(false);
                                                                                                                            Toast.makeText(oe2Var.n(), oe2Var.s(R.string.la_server_toast_connection_testing), 0).show();
                                                                                                                            ArrayList arrayList4 = oe2Var.n0;
                                                                                                                            if (arrayList4 == null) {
                                                                                                                                h12.Q("serverList");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            Server server4 = (Server) arrayList4.get(oe2Var.o0);
                                                                                                                            App app2 = App.n;
                                                                                                                            String address = server4.getAddress();
                                                                                                                            String username = server4.getUsername();
                                                                                                                            String password = server4.getPassword();
                                                                                                                            boolean zIsLowSecurity = server4.isLowSecurity();
                                                                                                                            c12 c12Var = new c12(10);
                                                                                                                            c12Var.o = address;
                                                                                                                            c12Var.p = username;
                                                                                                                            c12Var.j(password, null, zIsLowSecurity, null);
                                                                                                                            pn4 pn4Var = new pn4(c12Var);
                                                                                                                            hg3 hg3Var = new hg3(26, oe2Var);
                                                                                                                            if (pn4Var.c == null) {
                                                                                                                                pn4Var.c = new gp3(pn4Var, 21);
                                                                                                                            }
                                                                                                                            pn4Var.c.u().enqueue(new rm2(23, hg3Var));
                                                                                                                            return;
                                                                                                                        case 4:
                                                                                                                            pc1 pc1Var27 = oe2Var.l0;
                                                                                                                            pc1Var27.getClass();
                                                                                                                            boolean zIsChecked3 = ((MaterialSwitch) pc1Var27.g).isChecked();
                                                                                                                            pc1 pc1Var28 = oe2Var.l0;
                                                                                                                            if (!zIsChecked3) {
                                                                                                                                pc1Var28.getClass();
                                                                                                                                ((TextInputLayout) pc1Var28.f).setVisibility(8);
                                                                                                                                pc1 pc1Var29 = oe2Var.l0;
                                                                                                                                pc1Var29.getClass();
                                                                                                                                ((TextInputEditText) pc1Var29.e).setText("");
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var28.getClass();
                                                                                                                            ((TextInputLayout) pc1Var28.f).setVisibility(0);
                                                                                                                            pc1 pc1Var30 = oe2Var.l0;
                                                                                                                            pc1Var30.getClass();
                                                                                                                            TextInputEditText textInputEditText8 = (TextInputEditText) pc1Var30.e;
                                                                                                                            ArrayList arrayList5 = oe2Var.n0;
                                                                                                                            if (arrayList5 == null) {
                                                                                                                                h12.Q("serverList");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            String clientCert = ((Server) arrayList5.get(oe2Var.o0)).getClientCert();
                                                                                                                            textInputEditText8.setText(clientCert != null ? clientCert : "");
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            oe2Var.X().finish();
                                                                                                                            Intent intent = new Intent(oe2Var.X(), (Class<?>) MainActivity.class);
                                                                                                                            intent.putExtra("LOGIN_ACTIVITY_INTENT", "open_legacy_login_fragment");
                                                                                                                            oe2Var.g0(intent);
                                                                                                                            return;
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            pc1 pc1Var6 = this.l0;
                                                                                                            pc1Var6.getClass();
                                                                                                            final int i5 = 5;
                                                                                                            ((MaterialButton) pc1Var6.b).setOnClickListener(new View.OnClickListener(this) { // from class: me2
                                                                                                                public final /* synthetic */ oe2 o;

                                                                                                                {
                                                                                                                    this.o = this;
                                                                                                                }

                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view) {
                                                                                                                    String serverId;
                                                                                                                    int i6 = i5;
                                                                                                                    oe2 oe2Var = this.o;
                                                                                                                    switch (i6) {
                                                                                                                        case 0:
                                                                                                                            ta4 ta4Var2 = oe2Var.m0;
                                                                                                                            if (ta4Var2 == null) {
                                                                                                                                h12.Q("serverViewModel");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            ArrayList arrayList = oe2Var.n0;
                                                                                                                            if (arrayList == null) {
                                                                                                                                h12.Q("serverList");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            Server server2 = (Server) arrayList.get(oe2Var.o0);
                                                                                                                            server2.getClass();
                                                                                                                            new Thread(new oa4((na4) ta4Var2.c.o, server2, 0)).start();
                                                                                                                            oe2Var.j0();
                                                                                                                            Toast.makeText(oe2Var.n(), oe2Var.s(R.string.la_server_toast_deleted), 0).show();
                                                                                                                            return;
                                                                                                                        case 1:
                                                                                                                            String strS = oe2Var.s(R.string.la_server_field_server_empty_error);
                                                                                                                            strS.getClass();
                                                                                                                            String strS2 = oe2Var.s(R.string.la_server_field_server_url_error);
                                                                                                                            strS2.getClass();
                                                                                                                            pc1 pc1Var7 = oe2Var.l0;
                                                                                                                            pc1Var7.getClass();
                                                                                                                            int length = String.valueOf(((TextInputEditText) pc1Var7.k).getText()).length();
                                                                                                                            pc1 pc1Var8 = oe2Var.l0;
                                                                                                                            if (length == 0) {
                                                                                                                                pc1Var8.getClass();
                                                                                                                                ((TextInputEditText) pc1Var8.k).setError(strS);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var8.getClass();
                                                                                                                            int length2 = String.valueOf(((TextInputEditText) pc1Var8.o).getText()).length();
                                                                                                                            pc1 pc1Var9 = oe2Var.l0;
                                                                                                                            if (length2 == 0) {
                                                                                                                                pc1Var9.getClass();
                                                                                                                                ((TextInputEditText) pc1Var9.o).setError(strS);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var9.getClass();
                                                                                                                            int length3 = String.valueOf(((TextInputEditText) pc1Var9.l).getText()).length();
                                                                                                                            pc1 pc1Var10 = oe2Var.l0;
                                                                                                                            if (length3 == 0) {
                                                                                                                                pc1Var10.getClass();
                                                                                                                                ((TextInputEditText) pc1Var10.l).setError(strS);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var10.getClass();
                                                                                                                            int length4 = String.valueOf(((TextInputEditText) pc1Var10.n).getText()).length();
                                                                                                                            pc1 pc1Var11 = oe2Var.l0;
                                                                                                                            if (length4 == 0) {
                                                                                                                                pc1Var11.getClass();
                                                                                                                                ((TextInputEditText) pc1Var11.n).setError(strS);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var11.getClass();
                                                                                                                            boolean zK0 = oe2.k0(String.valueOf(((TextInputEditText) pc1Var11.n).getText()));
                                                                                                                            pc1 pc1Var12 = oe2Var.l0;
                                                                                                                            if (!zK0) {
                                                                                                                                pc1Var12.getClass();
                                                                                                                                ((TextInputEditText) pc1Var12.n).setError(strS2);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var12.getClass();
                                                                                                                            if (((MaterialSwitch) pc1Var12.j).isChecked()) {
                                                                                                                                pc1 pc1Var13 = oe2Var.l0;
                                                                                                                                pc1Var13.getClass();
                                                                                                                                if (String.valueOf(((TextInputEditText) pc1Var13.h).getText()).length() == 0) {
                                                                                                                                    pc1 pc1Var14 = oe2Var.l0;
                                                                                                                                    pc1Var14.getClass();
                                                                                                                                    ((TextInputEditText) pc1Var14.h).setError(strS);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            pc1 pc1Var15 = oe2Var.l0;
                                                                                                                            pc1Var15.getClass();
                                                                                                                            if (((MaterialSwitch) pc1Var15.j).isChecked()) {
                                                                                                                                pc1 pc1Var16 = oe2Var.l0;
                                                                                                                                pc1Var16.getClass();
                                                                                                                                if (!oe2.k0(String.valueOf(((TextInputEditText) pc1Var16.h).getText()))) {
                                                                                                                                    pc1 pc1Var17 = oe2Var.l0;
                                                                                                                                    pc1Var17.getClass();
                                                                                                                                    ((TextInputEditText) pc1Var17.h).setError(strS2);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            int i7 = oe2Var.o0;
                                                                                                                            ArrayList arrayList2 = oe2Var.n0;
                                                                                                                            if (i7 == 0) {
                                                                                                                                if (arrayList2 == null) {
                                                                                                                                    h12.Q("serverList");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                serverId = String.valueOf(arrayList2.size() + 1);
                                                                                                                            } else {
                                                                                                                                if (arrayList2 == null) {
                                                                                                                                    h12.Q("serverList");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                serverId = ((Server) arrayList2.get(i7)).getServerId();
                                                                                                                            }
                                                                                                                            String str = serverId;
                                                                                                                            pc1 pc1Var18 = oe2Var.l0;
                                                                                                                            pc1Var18.getClass();
                                                                                                                            String strValueOf = String.valueOf(((TextInputEditText) pc1Var18.k).getText());
                                                                                                                            pc1 pc1Var19 = oe2Var.l0;
                                                                                                                            pc1Var19.getClass();
                                                                                                                            String strValueOf2 = String.valueOf(((TextInputEditText) pc1Var19.o).getText());
                                                                                                                            pc1 pc1Var110 = oe2Var.l0;
                                                                                                                            pc1Var110.getClass();
                                                                                                                            String strValueOf3 = String.valueOf(((TextInputEditText) pc1Var110.l).getText());
                                                                                                                            pc1 pc1Var111 = oe2Var.l0;
                                                                                                                            pc1Var111.getClass();
                                                                                                                            String strValueOf4 = String.valueOf(((TextInputEditText) pc1Var111.n).getText());
                                                                                                                            pc1 pc1Var112 = oe2Var.l0;
                                                                                                                            pc1Var112.getClass();
                                                                                                                            String strValueOf5 = String.valueOf(((TextInputEditText) pc1Var112.h).getText());
                                                                                                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                                                                                                            pc1 pc1Var20 = oe2Var.l0;
                                                                                                                            pc1Var20.getClass();
                                                                                                                            boolean zIsChecked = ((MaterialSwitch) pc1Var20.m).isChecked();
                                                                                                                            pc1 pc1Var21 = oe2Var.l0;
                                                                                                                            pc1Var21.getClass();
                                                                                                                            Server server3 = new Server(str, strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, jCurrentTimeMillis, zIsChecked, String.valueOf(((TextInputEditText) pc1Var21.e).getText()));
                                                                                                                            int i8 = oe2Var.o0;
                                                                                                                            ta4 ta4Var3 = oe2Var.m0;
                                                                                                                            if (i8 == 0) {
                                                                                                                                if (ta4Var3 == null) {
                                                                                                                                    h12.Q("serverViewModel");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                new Thread(new oa4((na4) ta4Var3.c.o, server3, 1)).start();
                                                                                                                                Toast.makeText(oe2Var.n(), oe2Var.s(R.string.la_server_toast_created), 0).show();
                                                                                                                                oe2Var.j0();
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            if (ta4Var3 == null) {
                                                                                                                                h12.Q("serverViewModel");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            new Thread(new oa4((na4) ta4Var3.c.o, server3, 2)).start();
                                                                                                                            Toast.makeText(oe2Var.n(), oe2Var.s(R.string.la_server_toast_updated), 0).show();
                                                                                                                            oe2Var.j0();
                                                                                                                            return;
                                                                                                                        case 2:
                                                                                                                            pc1 pc1Var22 = oe2Var.l0;
                                                                                                                            pc1Var22.getClass();
                                                                                                                            boolean zIsChecked2 = ((MaterialSwitch) pc1Var22.j).isChecked();
                                                                                                                            pc1 pc1Var23 = oe2Var.l0;
                                                                                                                            if (!zIsChecked2) {
                                                                                                                                pc1Var23.getClass();
                                                                                                                                ((TextInputLayout) pc1Var23.i).setVisibility(8);
                                                                                                                                pc1 pc1Var24 = oe2Var.l0;
                                                                                                                                pc1Var24.getClass();
                                                                                                                                ((TextInputEditText) pc1Var24.h).setText("");
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var23.getClass();
                                                                                                                            ((TextInputLayout) pc1Var23.i).setVisibility(0);
                                                                                                                            pc1 pc1Var25 = oe2Var.l0;
                                                                                                                            pc1Var25.getClass();
                                                                                                                            TextInputEditText textInputEditText7 = (TextInputEditText) pc1Var25.h;
                                                                                                                            ArrayList arrayList3 = oe2Var.n0;
                                                                                                                            if (arrayList3 == null) {
                                                                                                                                h12.Q("serverList");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            String localAddress = ((Server) arrayList3.get(oe2Var.o0)).getLocalAddress();
                                                                                                                            textInputEditText7.setText(localAddress != null ? localAddress : "");
                                                                                                                            return;
                                                                                                                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                                                            pc1 pc1Var26 = oe2Var.l0;
                                                                                                                            pc1Var26.getClass();
                                                                                                                            ((MaterialButton) pc1Var26.q).setEnabled(false);
                                                                                                                            Toast.makeText(oe2Var.n(), oe2Var.s(R.string.la_server_toast_connection_testing), 0).show();
                                                                                                                            ArrayList arrayList4 = oe2Var.n0;
                                                                                                                            if (arrayList4 == null) {
                                                                                                                                h12.Q("serverList");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            Server server4 = (Server) arrayList4.get(oe2Var.o0);
                                                                                                                            App app2 = App.n;
                                                                                                                            String address = server4.getAddress();
                                                                                                                            String username = server4.getUsername();
                                                                                                                            String password = server4.getPassword();
                                                                                                                            boolean zIsLowSecurity = server4.isLowSecurity();
                                                                                                                            c12 c12Var = new c12(10);
                                                                                                                            c12Var.o = address;
                                                                                                                            c12Var.p = username;
                                                                                                                            c12Var.j(password, null, zIsLowSecurity, null);
                                                                                                                            pn4 pn4Var = new pn4(c12Var);
                                                                                                                            hg3 hg3Var = new hg3(26, oe2Var);
                                                                                                                            if (pn4Var.c == null) {
                                                                                                                                pn4Var.c = new gp3(pn4Var, 21);
                                                                                                                            }
                                                                                                                            pn4Var.c.u().enqueue(new rm2(23, hg3Var));
                                                                                                                            return;
                                                                                                                        case 4:
                                                                                                                            pc1 pc1Var27 = oe2Var.l0;
                                                                                                                            pc1Var27.getClass();
                                                                                                                            boolean zIsChecked3 = ((MaterialSwitch) pc1Var27.g).isChecked();
                                                                                                                            pc1 pc1Var28 = oe2Var.l0;
                                                                                                                            if (!zIsChecked3) {
                                                                                                                                pc1Var28.getClass();
                                                                                                                                ((TextInputLayout) pc1Var28.f).setVisibility(8);
                                                                                                                                pc1 pc1Var29 = oe2Var.l0;
                                                                                                                                pc1Var29.getClass();
                                                                                                                                ((TextInputEditText) pc1Var29.e).setText("");
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var28.getClass();
                                                                                                                            ((TextInputLayout) pc1Var28.f).setVisibility(0);
                                                                                                                            pc1 pc1Var30 = oe2Var.l0;
                                                                                                                            pc1Var30.getClass();
                                                                                                                            TextInputEditText textInputEditText8 = (TextInputEditText) pc1Var30.e;
                                                                                                                            ArrayList arrayList5 = oe2Var.n0;
                                                                                                                            if (arrayList5 == null) {
                                                                                                                                h12.Q("serverList");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            String clientCert = ((Server) arrayList5.get(oe2Var.o0)).getClientCert();
                                                                                                                            textInputEditText8.setText(clientCert != null ? clientCert : "");
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            oe2Var.X().finish();
                                                                                                                            Intent intent = new Intent(oe2Var.X(), (Class<?>) MainActivity.class);
                                                                                                                            intent.putExtra("LOGIN_ACTIVITY_INTENT", "open_legacy_login_fragment");
                                                                                                                            oe2Var.g0(intent);
                                                                                                                            return;
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            pc1 pc1Var7 = this.l0;
                                                                                                            pc1Var7.getClass();
                                                                                                            final int i6 = 2;
                                                                                                            ((MaterialSwitch) pc1Var7.j).setOnClickListener(new View.OnClickListener(this) { // from class: me2
                                                                                                                public final /* synthetic */ oe2 o;

                                                                                                                {
                                                                                                                    this.o = this;
                                                                                                                }

                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view) {
                                                                                                                    String serverId;
                                                                                                                    int i7 = i6;
                                                                                                                    oe2 oe2Var = this.o;
                                                                                                                    switch (i7) {
                                                                                                                        case 0:
                                                                                                                            ta4 ta4Var2 = oe2Var.m0;
                                                                                                                            if (ta4Var2 == null) {
                                                                                                                                h12.Q("serverViewModel");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            ArrayList arrayList = oe2Var.n0;
                                                                                                                            if (arrayList == null) {
                                                                                                                                h12.Q("serverList");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            Server server2 = (Server) arrayList.get(oe2Var.o0);
                                                                                                                            server2.getClass();
                                                                                                                            new Thread(new oa4((na4) ta4Var2.c.o, server2, 0)).start();
                                                                                                                            oe2Var.j0();
                                                                                                                            Toast.makeText(oe2Var.n(), oe2Var.s(R.string.la_server_toast_deleted), 0).show();
                                                                                                                            return;
                                                                                                                        case 1:
                                                                                                                            String strS = oe2Var.s(R.string.la_server_field_server_empty_error);
                                                                                                                            strS.getClass();
                                                                                                                            String strS2 = oe2Var.s(R.string.la_server_field_server_url_error);
                                                                                                                            strS2.getClass();
                                                                                                                            pc1 pc1Var8 = oe2Var.l0;
                                                                                                                            pc1Var8.getClass();
                                                                                                                            int length = String.valueOf(((TextInputEditText) pc1Var8.k).getText()).length();
                                                                                                                            pc1 pc1Var9 = oe2Var.l0;
                                                                                                                            if (length == 0) {
                                                                                                                                pc1Var9.getClass();
                                                                                                                                ((TextInputEditText) pc1Var9.k).setError(strS);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var9.getClass();
                                                                                                                            int length2 = String.valueOf(((TextInputEditText) pc1Var9.o).getText()).length();
                                                                                                                            pc1 pc1Var10 = oe2Var.l0;
                                                                                                                            if (length2 == 0) {
                                                                                                                                pc1Var10.getClass();
                                                                                                                                ((TextInputEditText) pc1Var10.o).setError(strS);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var10.getClass();
                                                                                                                            int length3 = String.valueOf(((TextInputEditText) pc1Var10.l).getText()).length();
                                                                                                                            pc1 pc1Var11 = oe2Var.l0;
                                                                                                                            if (length3 == 0) {
                                                                                                                                pc1Var11.getClass();
                                                                                                                                ((TextInputEditText) pc1Var11.l).setError(strS);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var11.getClass();
                                                                                                                            int length4 = String.valueOf(((TextInputEditText) pc1Var11.n).getText()).length();
                                                                                                                            pc1 pc1Var12 = oe2Var.l0;
                                                                                                                            if (length4 == 0) {
                                                                                                                                pc1Var12.getClass();
                                                                                                                                ((TextInputEditText) pc1Var12.n).setError(strS);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var12.getClass();
                                                                                                                            boolean zK0 = oe2.k0(String.valueOf(((TextInputEditText) pc1Var12.n).getText()));
                                                                                                                            pc1 pc1Var13 = oe2Var.l0;
                                                                                                                            if (!zK0) {
                                                                                                                                pc1Var13.getClass();
                                                                                                                                ((TextInputEditText) pc1Var13.n).setError(strS2);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var13.getClass();
                                                                                                                            if (((MaterialSwitch) pc1Var13.j).isChecked()) {
                                                                                                                                pc1 pc1Var14 = oe2Var.l0;
                                                                                                                                pc1Var14.getClass();
                                                                                                                                if (String.valueOf(((TextInputEditText) pc1Var14.h).getText()).length() == 0) {
                                                                                                                                    pc1 pc1Var15 = oe2Var.l0;
                                                                                                                                    pc1Var15.getClass();
                                                                                                                                    ((TextInputEditText) pc1Var15.h).setError(strS);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            pc1 pc1Var16 = oe2Var.l0;
                                                                                                                            pc1Var16.getClass();
                                                                                                                            if (((MaterialSwitch) pc1Var16.j).isChecked()) {
                                                                                                                                pc1 pc1Var17 = oe2Var.l0;
                                                                                                                                pc1Var17.getClass();
                                                                                                                                if (!oe2.k0(String.valueOf(((TextInputEditText) pc1Var17.h).getText()))) {
                                                                                                                                    pc1 pc1Var18 = oe2Var.l0;
                                                                                                                                    pc1Var18.getClass();
                                                                                                                                    ((TextInputEditText) pc1Var18.h).setError(strS2);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            int i8 = oe2Var.o0;
                                                                                                                            ArrayList arrayList2 = oe2Var.n0;
                                                                                                                            if (i8 == 0) {
                                                                                                                                if (arrayList2 == null) {
                                                                                                                                    h12.Q("serverList");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                serverId = String.valueOf(arrayList2.size() + 1);
                                                                                                                            } else {
                                                                                                                                if (arrayList2 == null) {
                                                                                                                                    h12.Q("serverList");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                serverId = ((Server) arrayList2.get(i8)).getServerId();
                                                                                                                            }
                                                                                                                            String str = serverId;
                                                                                                                            pc1 pc1Var19 = oe2Var.l0;
                                                                                                                            pc1Var19.getClass();
                                                                                                                            String strValueOf = String.valueOf(((TextInputEditText) pc1Var19.k).getText());
                                                                                                                            pc1 pc1Var110 = oe2Var.l0;
                                                                                                                            pc1Var110.getClass();
                                                                                                                            String strValueOf2 = String.valueOf(((TextInputEditText) pc1Var110.o).getText());
                                                                                                                            pc1 pc1Var111 = oe2Var.l0;
                                                                                                                            pc1Var111.getClass();
                                                                                                                            String strValueOf3 = String.valueOf(((TextInputEditText) pc1Var111.l).getText());
                                                                                                                            pc1 pc1Var112 = oe2Var.l0;
                                                                                                                            pc1Var112.getClass();
                                                                                                                            String strValueOf4 = String.valueOf(((TextInputEditText) pc1Var112.n).getText());
                                                                                                                            pc1 pc1Var113 = oe2Var.l0;
                                                                                                                            pc1Var113.getClass();
                                                                                                                            String strValueOf5 = String.valueOf(((TextInputEditText) pc1Var113.h).getText());
                                                                                                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                                                                                                            pc1 pc1Var20 = oe2Var.l0;
                                                                                                                            pc1Var20.getClass();
                                                                                                                            boolean zIsChecked = ((MaterialSwitch) pc1Var20.m).isChecked();
                                                                                                                            pc1 pc1Var21 = oe2Var.l0;
                                                                                                                            pc1Var21.getClass();
                                                                                                                            Server server3 = new Server(str, strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, jCurrentTimeMillis, zIsChecked, String.valueOf(((TextInputEditText) pc1Var21.e).getText()));
                                                                                                                            int i9 = oe2Var.o0;
                                                                                                                            ta4 ta4Var3 = oe2Var.m0;
                                                                                                                            if (i9 == 0) {
                                                                                                                                if (ta4Var3 == null) {
                                                                                                                                    h12.Q("serverViewModel");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                new Thread(new oa4((na4) ta4Var3.c.o, server3, 1)).start();
                                                                                                                                Toast.makeText(oe2Var.n(), oe2Var.s(R.string.la_server_toast_created), 0).show();
                                                                                                                                oe2Var.j0();
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            if (ta4Var3 == null) {
                                                                                                                                h12.Q("serverViewModel");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            new Thread(new oa4((na4) ta4Var3.c.o, server3, 2)).start();
                                                                                                                            Toast.makeText(oe2Var.n(), oe2Var.s(R.string.la_server_toast_updated), 0).show();
                                                                                                                            oe2Var.j0();
                                                                                                                            return;
                                                                                                                        case 2:
                                                                                                                            pc1 pc1Var22 = oe2Var.l0;
                                                                                                                            pc1Var22.getClass();
                                                                                                                            boolean zIsChecked2 = ((MaterialSwitch) pc1Var22.j).isChecked();
                                                                                                                            pc1 pc1Var23 = oe2Var.l0;
                                                                                                                            if (!zIsChecked2) {
                                                                                                                                pc1Var23.getClass();
                                                                                                                                ((TextInputLayout) pc1Var23.i).setVisibility(8);
                                                                                                                                pc1 pc1Var24 = oe2Var.l0;
                                                                                                                                pc1Var24.getClass();
                                                                                                                                ((TextInputEditText) pc1Var24.h).setText("");
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var23.getClass();
                                                                                                                            ((TextInputLayout) pc1Var23.i).setVisibility(0);
                                                                                                                            pc1 pc1Var25 = oe2Var.l0;
                                                                                                                            pc1Var25.getClass();
                                                                                                                            TextInputEditText textInputEditText7 = (TextInputEditText) pc1Var25.h;
                                                                                                                            ArrayList arrayList3 = oe2Var.n0;
                                                                                                                            if (arrayList3 == null) {
                                                                                                                                h12.Q("serverList");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            String localAddress = ((Server) arrayList3.get(oe2Var.o0)).getLocalAddress();
                                                                                                                            textInputEditText7.setText(localAddress != null ? localAddress : "");
                                                                                                                            return;
                                                                                                                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                                                            pc1 pc1Var26 = oe2Var.l0;
                                                                                                                            pc1Var26.getClass();
                                                                                                                            ((MaterialButton) pc1Var26.q).setEnabled(false);
                                                                                                                            Toast.makeText(oe2Var.n(), oe2Var.s(R.string.la_server_toast_connection_testing), 0).show();
                                                                                                                            ArrayList arrayList4 = oe2Var.n0;
                                                                                                                            if (arrayList4 == null) {
                                                                                                                                h12.Q("serverList");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            Server server4 = (Server) arrayList4.get(oe2Var.o0);
                                                                                                                            App app2 = App.n;
                                                                                                                            String address = server4.getAddress();
                                                                                                                            String username = server4.getUsername();
                                                                                                                            String password = server4.getPassword();
                                                                                                                            boolean zIsLowSecurity = server4.isLowSecurity();
                                                                                                                            c12 c12Var = new c12(10);
                                                                                                                            c12Var.o = address;
                                                                                                                            c12Var.p = username;
                                                                                                                            c12Var.j(password, null, zIsLowSecurity, null);
                                                                                                                            pn4 pn4Var = new pn4(c12Var);
                                                                                                                            hg3 hg3Var = new hg3(26, oe2Var);
                                                                                                                            if (pn4Var.c == null) {
                                                                                                                                pn4Var.c = new gp3(pn4Var, 21);
                                                                                                                            }
                                                                                                                            pn4Var.c.u().enqueue(new rm2(23, hg3Var));
                                                                                                                            return;
                                                                                                                        case 4:
                                                                                                                            pc1 pc1Var27 = oe2Var.l0;
                                                                                                                            pc1Var27.getClass();
                                                                                                                            boolean zIsChecked3 = ((MaterialSwitch) pc1Var27.g).isChecked();
                                                                                                                            pc1 pc1Var28 = oe2Var.l0;
                                                                                                                            if (!zIsChecked3) {
                                                                                                                                pc1Var28.getClass();
                                                                                                                                ((TextInputLayout) pc1Var28.f).setVisibility(8);
                                                                                                                                pc1 pc1Var29 = oe2Var.l0;
                                                                                                                                pc1Var29.getClass();
                                                                                                                                ((TextInputEditText) pc1Var29.e).setText("");
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var28.getClass();
                                                                                                                            ((TextInputLayout) pc1Var28.f).setVisibility(0);
                                                                                                                            pc1 pc1Var30 = oe2Var.l0;
                                                                                                                            pc1Var30.getClass();
                                                                                                                            TextInputEditText textInputEditText8 = (TextInputEditText) pc1Var30.e;
                                                                                                                            ArrayList arrayList5 = oe2Var.n0;
                                                                                                                            if (arrayList5 == null) {
                                                                                                                                h12.Q("serverList");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            String clientCert = ((Server) arrayList5.get(oe2Var.o0)).getClientCert();
                                                                                                                            textInputEditText8.setText(clientCert != null ? clientCert : "");
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            oe2Var.X().finish();
                                                                                                                            Intent intent = new Intent(oe2Var.X(), (Class<?>) MainActivity.class);
                                                                                                                            intent.putExtra("LOGIN_ACTIVITY_INTENT", "open_legacy_login_fragment");
                                                                                                                            oe2Var.g0(intent);
                                                                                                                            return;
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            pc1 pc1Var8 = this.l0;
                                                                                                            pc1Var8.getClass();
                                                                                                            final int i7 = 4;
                                                                                                            ((MaterialSwitch) pc1Var8.g).setOnClickListener(new View.OnClickListener(this) { // from class: me2
                                                                                                                public final /* synthetic */ oe2 o;

                                                                                                                {
                                                                                                                    this.o = this;
                                                                                                                }

                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view) {
                                                                                                                    String serverId;
                                                                                                                    int i8 = i7;
                                                                                                                    oe2 oe2Var = this.o;
                                                                                                                    switch (i8) {
                                                                                                                        case 0:
                                                                                                                            ta4 ta4Var2 = oe2Var.m0;
                                                                                                                            if (ta4Var2 == null) {
                                                                                                                                h12.Q("serverViewModel");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            ArrayList arrayList = oe2Var.n0;
                                                                                                                            if (arrayList == null) {
                                                                                                                                h12.Q("serverList");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            Server server2 = (Server) arrayList.get(oe2Var.o0);
                                                                                                                            server2.getClass();
                                                                                                                            new Thread(new oa4((na4) ta4Var2.c.o, server2, 0)).start();
                                                                                                                            oe2Var.j0();
                                                                                                                            Toast.makeText(oe2Var.n(), oe2Var.s(R.string.la_server_toast_deleted), 0).show();
                                                                                                                            return;
                                                                                                                        case 1:
                                                                                                                            String strS = oe2Var.s(R.string.la_server_field_server_empty_error);
                                                                                                                            strS.getClass();
                                                                                                                            String strS2 = oe2Var.s(R.string.la_server_field_server_url_error);
                                                                                                                            strS2.getClass();
                                                                                                                            pc1 pc1Var9 = oe2Var.l0;
                                                                                                                            pc1Var9.getClass();
                                                                                                                            int length = String.valueOf(((TextInputEditText) pc1Var9.k).getText()).length();
                                                                                                                            pc1 pc1Var10 = oe2Var.l0;
                                                                                                                            if (length == 0) {
                                                                                                                                pc1Var10.getClass();
                                                                                                                                ((TextInputEditText) pc1Var10.k).setError(strS);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var10.getClass();
                                                                                                                            int length2 = String.valueOf(((TextInputEditText) pc1Var10.o).getText()).length();
                                                                                                                            pc1 pc1Var11 = oe2Var.l0;
                                                                                                                            if (length2 == 0) {
                                                                                                                                pc1Var11.getClass();
                                                                                                                                ((TextInputEditText) pc1Var11.o).setError(strS);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var11.getClass();
                                                                                                                            int length3 = String.valueOf(((TextInputEditText) pc1Var11.l).getText()).length();
                                                                                                                            pc1 pc1Var12 = oe2Var.l0;
                                                                                                                            if (length3 == 0) {
                                                                                                                                pc1Var12.getClass();
                                                                                                                                ((TextInputEditText) pc1Var12.l).setError(strS);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var12.getClass();
                                                                                                                            int length4 = String.valueOf(((TextInputEditText) pc1Var12.n).getText()).length();
                                                                                                                            pc1 pc1Var13 = oe2Var.l0;
                                                                                                                            if (length4 == 0) {
                                                                                                                                pc1Var13.getClass();
                                                                                                                                ((TextInputEditText) pc1Var13.n).setError(strS);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var13.getClass();
                                                                                                                            boolean zK0 = oe2.k0(String.valueOf(((TextInputEditText) pc1Var13.n).getText()));
                                                                                                                            pc1 pc1Var14 = oe2Var.l0;
                                                                                                                            if (!zK0) {
                                                                                                                                pc1Var14.getClass();
                                                                                                                                ((TextInputEditText) pc1Var14.n).setError(strS2);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var14.getClass();
                                                                                                                            if (((MaterialSwitch) pc1Var14.j).isChecked()) {
                                                                                                                                pc1 pc1Var15 = oe2Var.l0;
                                                                                                                                pc1Var15.getClass();
                                                                                                                                if (String.valueOf(((TextInputEditText) pc1Var15.h).getText()).length() == 0) {
                                                                                                                                    pc1 pc1Var16 = oe2Var.l0;
                                                                                                                                    pc1Var16.getClass();
                                                                                                                                    ((TextInputEditText) pc1Var16.h).setError(strS);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            pc1 pc1Var17 = oe2Var.l0;
                                                                                                                            pc1Var17.getClass();
                                                                                                                            if (((MaterialSwitch) pc1Var17.j).isChecked()) {
                                                                                                                                pc1 pc1Var18 = oe2Var.l0;
                                                                                                                                pc1Var18.getClass();
                                                                                                                                if (!oe2.k0(String.valueOf(((TextInputEditText) pc1Var18.h).getText()))) {
                                                                                                                                    pc1 pc1Var19 = oe2Var.l0;
                                                                                                                                    pc1Var19.getClass();
                                                                                                                                    ((TextInputEditText) pc1Var19.h).setError(strS2);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            int i9 = oe2Var.o0;
                                                                                                                            ArrayList arrayList2 = oe2Var.n0;
                                                                                                                            if (i9 == 0) {
                                                                                                                                if (arrayList2 == null) {
                                                                                                                                    h12.Q("serverList");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                serverId = String.valueOf(arrayList2.size() + 1);
                                                                                                                            } else {
                                                                                                                                if (arrayList2 == null) {
                                                                                                                                    h12.Q("serverList");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                serverId = ((Server) arrayList2.get(i9)).getServerId();
                                                                                                                            }
                                                                                                                            String str = serverId;
                                                                                                                            pc1 pc1Var110 = oe2Var.l0;
                                                                                                                            pc1Var110.getClass();
                                                                                                                            String strValueOf = String.valueOf(((TextInputEditText) pc1Var110.k).getText());
                                                                                                                            pc1 pc1Var111 = oe2Var.l0;
                                                                                                                            pc1Var111.getClass();
                                                                                                                            String strValueOf2 = String.valueOf(((TextInputEditText) pc1Var111.o).getText());
                                                                                                                            pc1 pc1Var112 = oe2Var.l0;
                                                                                                                            pc1Var112.getClass();
                                                                                                                            String strValueOf3 = String.valueOf(((TextInputEditText) pc1Var112.l).getText());
                                                                                                                            pc1 pc1Var113 = oe2Var.l0;
                                                                                                                            pc1Var113.getClass();
                                                                                                                            String strValueOf4 = String.valueOf(((TextInputEditText) pc1Var113.n).getText());
                                                                                                                            pc1 pc1Var114 = oe2Var.l0;
                                                                                                                            pc1Var114.getClass();
                                                                                                                            String strValueOf5 = String.valueOf(((TextInputEditText) pc1Var114.h).getText());
                                                                                                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                                                                                                            pc1 pc1Var20 = oe2Var.l0;
                                                                                                                            pc1Var20.getClass();
                                                                                                                            boolean zIsChecked = ((MaterialSwitch) pc1Var20.m).isChecked();
                                                                                                                            pc1 pc1Var21 = oe2Var.l0;
                                                                                                                            pc1Var21.getClass();
                                                                                                                            Server server3 = new Server(str, strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, jCurrentTimeMillis, zIsChecked, String.valueOf(((TextInputEditText) pc1Var21.e).getText()));
                                                                                                                            int i10 = oe2Var.o0;
                                                                                                                            ta4 ta4Var3 = oe2Var.m0;
                                                                                                                            if (i10 == 0) {
                                                                                                                                if (ta4Var3 == null) {
                                                                                                                                    h12.Q("serverViewModel");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                new Thread(new oa4((na4) ta4Var3.c.o, server3, 1)).start();
                                                                                                                                Toast.makeText(oe2Var.n(), oe2Var.s(R.string.la_server_toast_created), 0).show();
                                                                                                                                oe2Var.j0();
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            if (ta4Var3 == null) {
                                                                                                                                h12.Q("serverViewModel");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            new Thread(new oa4((na4) ta4Var3.c.o, server3, 2)).start();
                                                                                                                            Toast.makeText(oe2Var.n(), oe2Var.s(R.string.la_server_toast_updated), 0).show();
                                                                                                                            oe2Var.j0();
                                                                                                                            return;
                                                                                                                        case 2:
                                                                                                                            pc1 pc1Var22 = oe2Var.l0;
                                                                                                                            pc1Var22.getClass();
                                                                                                                            boolean zIsChecked2 = ((MaterialSwitch) pc1Var22.j).isChecked();
                                                                                                                            pc1 pc1Var23 = oe2Var.l0;
                                                                                                                            if (!zIsChecked2) {
                                                                                                                                pc1Var23.getClass();
                                                                                                                                ((TextInputLayout) pc1Var23.i).setVisibility(8);
                                                                                                                                pc1 pc1Var24 = oe2Var.l0;
                                                                                                                                pc1Var24.getClass();
                                                                                                                                ((TextInputEditText) pc1Var24.h).setText("");
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var23.getClass();
                                                                                                                            ((TextInputLayout) pc1Var23.i).setVisibility(0);
                                                                                                                            pc1 pc1Var25 = oe2Var.l0;
                                                                                                                            pc1Var25.getClass();
                                                                                                                            TextInputEditText textInputEditText7 = (TextInputEditText) pc1Var25.h;
                                                                                                                            ArrayList arrayList3 = oe2Var.n0;
                                                                                                                            if (arrayList3 == null) {
                                                                                                                                h12.Q("serverList");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            String localAddress = ((Server) arrayList3.get(oe2Var.o0)).getLocalAddress();
                                                                                                                            textInputEditText7.setText(localAddress != null ? localAddress : "");
                                                                                                                            return;
                                                                                                                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                                                                                            pc1 pc1Var26 = oe2Var.l0;
                                                                                                                            pc1Var26.getClass();
                                                                                                                            ((MaterialButton) pc1Var26.q).setEnabled(false);
                                                                                                                            Toast.makeText(oe2Var.n(), oe2Var.s(R.string.la_server_toast_connection_testing), 0).show();
                                                                                                                            ArrayList arrayList4 = oe2Var.n0;
                                                                                                                            if (arrayList4 == null) {
                                                                                                                                h12.Q("serverList");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            Server server4 = (Server) arrayList4.get(oe2Var.o0);
                                                                                                                            App app2 = App.n;
                                                                                                                            String address = server4.getAddress();
                                                                                                                            String username = server4.getUsername();
                                                                                                                            String password = server4.getPassword();
                                                                                                                            boolean zIsLowSecurity = server4.isLowSecurity();
                                                                                                                            c12 c12Var = new c12(10);
                                                                                                                            c12Var.o = address;
                                                                                                                            c12Var.p = username;
                                                                                                                            c12Var.j(password, null, zIsLowSecurity, null);
                                                                                                                            pn4 pn4Var = new pn4(c12Var);
                                                                                                                            hg3 hg3Var = new hg3(26, oe2Var);
                                                                                                                            if (pn4Var.c == null) {
                                                                                                                                pn4Var.c = new gp3(pn4Var, 21);
                                                                                                                            }
                                                                                                                            pn4Var.c.u().enqueue(new rm2(23, hg3Var));
                                                                                                                            return;
                                                                                                                        case 4:
                                                                                                                            pc1 pc1Var27 = oe2Var.l0;
                                                                                                                            pc1Var27.getClass();
                                                                                                                            boolean zIsChecked3 = ((MaterialSwitch) pc1Var27.g).isChecked();
                                                                                                                            pc1 pc1Var28 = oe2Var.l0;
                                                                                                                            if (!zIsChecked3) {
                                                                                                                                pc1Var28.getClass();
                                                                                                                                ((TextInputLayout) pc1Var28.f).setVisibility(8);
                                                                                                                                pc1 pc1Var29 = oe2Var.l0;
                                                                                                                                pc1Var29.getClass();
                                                                                                                                ((TextInputEditText) pc1Var29.e).setText("");
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            pc1Var28.getClass();
                                                                                                                            ((TextInputLayout) pc1Var28.f).setVisibility(0);
                                                                                                                            pc1 pc1Var30 = oe2Var.l0;
                                                                                                                            pc1Var30.getClass();
                                                                                                                            TextInputEditText textInputEditText8 = (TextInputEditText) pc1Var30.e;
                                                                                                                            ArrayList arrayList5 = oe2Var.n0;
                                                                                                                            if (arrayList5 == null) {
                                                                                                                                h12.Q("serverList");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            String clientCert = ((Server) arrayList5.get(oe2Var.o0)).getClientCert();
                                                                                                                            textInputEditText8.setText(clientCert != null ? clientCert : "");
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            oe2Var.X().finish();
                                                                                                                            Intent intent = new Intent(oe2Var.X(), (Class<?>) MainActivity.class);
                                                                                                                            intent.putExtra("LOGIN_ACTIVITY_INTENT", "open_legacy_login_fragment");
                                                                                                                            oe2Var.g0(intent);
                                                                                                                            return;
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            pc1 pc1Var9 = this.l0;
                                                                                                            pc1Var9.getClass();
                                                                                                            ConstraintLayout constraintLayout2 = pc1Var9.a;
                                                                                                            constraintLayout2.getClass();
                                                                                                            return constraintLayout2;
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

    public final void i0() {
        pc1 pc1Var = this.l0;
        pc1Var.getClass();
        ((MaterialButton) pc1Var.c).setText(s(R.string.la_server_button_create));
        pc1 pc1Var2 = this.l0;
        pc1Var2.getClass();
        ((MaterialButton) pc1Var2.d).setEnabled(false);
        pc1 pc1Var3 = this.l0;
        pc1Var3.getClass();
        ((MaterialButton) pc1Var3.q).setEnabled(false);
        pc1 pc1Var4 = this.l0;
        pc1Var4.getClass();
        ((TextInputEditText) pc1Var4.k).setText("");
        pc1 pc1Var5 = this.l0;
        pc1Var5.getClass();
        ((TextInputEditText) pc1Var5.o).setText("");
        pc1 pc1Var6 = this.l0;
        pc1Var6.getClass();
        ((TextInputEditText) pc1Var6.l).setText("");
        pc1 pc1Var7 = this.l0;
        pc1Var7.getClass();
        ((TextInputEditText) pc1Var7.n).setText("");
        pc1 pc1Var8 = this.l0;
        pc1Var8.getClass();
        ((TextInputEditText) pc1Var8.h).setText("");
        pc1 pc1Var9 = this.l0;
        pc1Var9.getClass();
        ((TextInputEditText) pc1Var9.e).setText("");
    }

    public final void j0() {
        i0();
        this.o0 = 0;
        pc1 pc1Var = this.l0;
        pc1Var.getClass();
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) pc1Var.p;
        ArrayList arrayList = this.n0;
        if (arrayList == null) {
            h12.Q("serverList");
            throw null;
        }
        autoCompleteTextView.setText((CharSequence) ((Server) arrayList.get(0)).getServerName(), false);
        pc1 pc1Var2 = this.l0;
        pc1Var2.getClass();
        ((AutoCompleteTextView) pc1Var2.p).performCompletion();
    }
}
