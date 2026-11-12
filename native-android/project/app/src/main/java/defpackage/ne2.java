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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ne2 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ kc1 o;

    public /* synthetic */ ne2(int r1, kc1 r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView r4, View r5, int r6, long r7) {
        int r8 = this.n;
        kc1 r3 = this.o;
        switch(r8) {
            case 0: goto L12;
            default: goto L4;
        };
    L4:
        eu3 r9 = (eu3) r3;
        String r10 = (String) r9.M0.getItem(r6);
        r9.N0 = true;
        ((TextInputEditText) r9.J0.e).setText(r10);
        TextInputEditText r11 = (TextInputEditText) r9.J0.e;
        if (r10 == null) goto L7;
        int r12 = r10.length();
    L8:
        r11.setSelection(r12);
        r9.N0 = false;
        w12 r13 = r9.J0;
        if (r13 == null) goto L54;
        ((ListView) r13.g).setVisibility(8);
        return;
    L54:
        return;
    L7:
        r12 = 0;
        goto L8
    L12:
        oe2 r14 = (oe2) r3;
        r14.o0 = r6;
        if (r6 != 0) goto L15;
        r14.i0();
        return;
    L15:
        pc1 r15 = r14.l0;
        r15.getClass();
        ((MaterialButton) r15.c).setText(r14.s(R.string.la_server_button_update));
        pc1 r16 = r14.l0;
        r16.getClass();
        ((MaterialButton) r16.d).setEnabled(true);
        pc1 r17 = r14.l0;
        r17.getClass();
        ((MaterialButton) r17.q).setEnabled(true);
        pc1 r18 = r14.l0;
        r18.getClass();
        TextInputEditText r19 = (TextInputEditText) r18.k;
        ArrayList r20 = r14.n0;
        if (r20 == null) goto L52;
        r19.setText(((Server) r20.get(r6)).getServerName());
        pc1 r21 = r14.l0;
        r21.getClass();
        TextInputEditText r22 = (TextInputEditText) r21.o;
        ArrayList r23 = r14.n0;
        if (r23 == null) goto L50;
        r22.setText(((Server) r23.get(r6)).getUsername());
        pc1 r24 = r14.l0;
        r24.getClass();
        TextInputEditText r25 = (TextInputEditText) r24.l;
        ArrayList r26 = r14.n0;
        if (r26 == null) goto L48;
        r25.setText(((Server) r26.get(r6)).getPassword());
        pc1 r27 = r14.l0;
        r27.getClass();
        TextInputEditText r28 = (TextInputEditText) r27.n;
        ArrayList r29 = r14.n0;
        if (r29 == null) goto L46;
        r28.setText(((Server) r29.get(r6)).getAddress());
        ArrayList r30 = r14.n0;
        if (r30 == null) goto L44;
        String r31 = ((Server) r30.get(r6)).getLocalAddress();
        if (r31 != null) goto L28;
    L31:
        pc1 r32 = r14.l0;
        r32.getClass();
        ((TextInputEditText) r32.h).setText("");
    L32:
        ArrayList r33 = r14.n0;
        if (r33 == null) goto L42;
        String r34 = ((Server) r33.get(r6)).getClientCert();
        if (r34 != null) goto L37;
    L40:
        pc1 r35 = r14.l0;
        r35.getClass();
        ((TextInputEditText) r35.e).setText("");
        return;
    L37:
        if (r34.length() == 0) goto L40;
        pc1 r36 = r14.l0;
        r36.getClass();
        ((MaterialSwitch) r36.g).setChecked(true);
        pc1 r37 = r14.l0;
        r37.getClass();
        ((TextInputLayout) r37.f).setVisibility(0);
        pc1 r38 = r14.l0;
        r38.getClass();
        ((TextInputEditText) r38.e).setText(r34);
        return;
    L42:
        h12.Q("serverList");
        throw null;
    L28:
        if (r31.length() == 0) goto L31;
        pc1 r2 = r14.l0;
        r2.getClass();
        ((MaterialSwitch) r2.j).setChecked(true);
        pc1 r39 = r14.l0;
        r39.getClass();
        ((TextInputLayout) r39.i).setVisibility(0);
        pc1 r40 = r14.l0;
        r40.getClass();
        ((TextInputEditText) r40.h).setText(r31);
        goto L32
    L44:
        h12.Q("serverList");
        throw null;
    L46:
        h12.Q("serverList");
        throw null;
    L48:
        h12.Q("serverList");
        throw null;
    L50:
        h12.Q("serverList");
        throw null;
    L52:
        h12.Q("serverList");
        throw null;
    }
}
