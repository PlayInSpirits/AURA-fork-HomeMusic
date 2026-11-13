package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import app.homemusic.R;
import com.eddyizm.tempus.model.Server;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class ne2 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ kc1 o;

    public /* synthetic */ ne2(int i, kc1 kc1Var) {
        this.n = i;
        this.o = kc1Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = this.n;
        kc1 kc1Var = this.o;
        switch (i2) {
            case 0:
                oe2 oe2Var = (oe2) kc1Var;
                oe2Var.o0 = i;
                if (i == 0) {
                    oe2Var.i0();
                    return;
                }
                pc1 pc1Var = oe2Var.l0;
                pc1Var.getClass();
                ((MaterialButton) pc1Var.c).setText(oe2Var.s(R.string.la_server_button_update));
                pc1 pc1Var2 = oe2Var.l0;
                pc1Var2.getClass();
                ((MaterialButton) pc1Var2.d).setEnabled(true);
                pc1 pc1Var3 = oe2Var.l0;
                pc1Var3.getClass();
                ((MaterialButton) pc1Var3.q).setEnabled(true);
                pc1 pc1Var4 = oe2Var.l0;
                pc1Var4.getClass();
                TextInputEditText textInputEditText = (TextInputEditText) pc1Var4.k;
                ArrayList arrayList = oe2Var.n0;
                if (arrayList == null) {
                    h12.Q("serverList");
                    throw null;
                }
                textInputEditText.setText(((Server) arrayList.get(i)).getServerName());
                pc1 pc1Var5 = oe2Var.l0;
                pc1Var5.getClass();
                TextInputEditText textInputEditText2 = (TextInputEditText) pc1Var5.o;
                ArrayList arrayList2 = oe2Var.n0;
                if (arrayList2 == null) {
                    h12.Q("serverList");
                    throw null;
                }
                textInputEditText2.setText(((Server) arrayList2.get(i)).getUsername());
                pc1 pc1Var6 = oe2Var.l0;
                pc1Var6.getClass();
                TextInputEditText textInputEditText3 = (TextInputEditText) pc1Var6.l;
                ArrayList arrayList3 = oe2Var.n0;
                if (arrayList3 == null) {
                    h12.Q("serverList");
                    throw null;
                }
                textInputEditText3.setText(((Server) arrayList3.get(i)).getPassword());
                pc1 pc1Var7 = oe2Var.l0;
                pc1Var7.getClass();
                TextInputEditText textInputEditText4 = (TextInputEditText) pc1Var7.n;
                ArrayList arrayList4 = oe2Var.n0;
                if (arrayList4 == null) {
                    h12.Q("serverList");
                    throw null;
                }
                textInputEditText4.setText(((Server) arrayList4.get(i)).getAddress());
                ArrayList arrayList5 = oe2Var.n0;
                if (arrayList5 == null) {
                    h12.Q("serverList");
                    throw null;
                }
                String localAddress = ((Server) arrayList5.get(i)).getLocalAddress();
                if (localAddress == null || localAddress.length() == 0) {
                    pc1 pc1Var8 = oe2Var.l0;
                    pc1Var8.getClass();
                    ((TextInputEditText) pc1Var8.h).setText("");
                } else {
                    pc1 pc1Var9 = oe2Var.l0;
                    pc1Var9.getClass();
                    ((MaterialSwitch) pc1Var9.j).setChecked(true);
                    pc1 pc1Var10 = oe2Var.l0;
                    pc1Var10.getClass();
                    ((TextInputLayout) pc1Var10.i).setVisibility(0);
                    pc1 pc1Var11 = oe2Var.l0;
                    pc1Var11.getClass();
                    ((TextInputEditText) pc1Var11.h).setText(localAddress);
                }
                ArrayList arrayList6 = oe2Var.n0;
                if (arrayList6 == null) {
                    h12.Q("serverList");
                    throw null;
                }
                String clientCert = ((Server) arrayList6.get(i)).getClientCert();
                if (clientCert == null || clientCert.length() == 0) {
                    pc1 pc1Var12 = oe2Var.l0;
                    pc1Var12.getClass();
                    ((TextInputEditText) pc1Var12.e).setText("");
                    return;
                }
                pc1 pc1Var13 = oe2Var.l0;
                pc1Var13.getClass();
                ((MaterialSwitch) pc1Var13.g).setChecked(true);
                pc1 pc1Var14 = oe2Var.l0;
                pc1Var14.getClass();
                ((TextInputLayout) pc1Var14.f).setVisibility(0);
                pc1 pc1Var15 = oe2Var.l0;
                pc1Var15.getClass();
                ((TextInputEditText) pc1Var15.e).setText(clientCert);
                return;
            default:
                eu3 eu3Var = (eu3) kc1Var;
                String str = (String) eu3Var.M0.getItem(i);
                eu3Var.N0 = true;
                ((TextInputEditText) eu3Var.J0.e).setText(str);
                ((TextInputEditText) eu3Var.J0.e).setSelection(str != null ? str.length() : 0);
                eu3Var.N0 = false;
                w12 w12Var = eu3Var.J0;
                if (w12Var != null) {
                    ((ListView) w12Var.g).setVisibility(8);
                    return;
                }
                return;
        }
    }
}
