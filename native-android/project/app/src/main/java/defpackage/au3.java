package defpackage;

import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.subsonic.models.InternetRadioStation;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class au3 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ eu3 o;

    public /* synthetic */ au3(eu3 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r21) {
        int r1 = this.n;
        final int r6 = 0;
        String r7 = "";
        final int r8 = 1;
        final eu3 r0 = this.o;
        switch(r1) {
            case 0: goto L94;
            case 1: goto L53;
            case 2: goto L19;
            case 3: goto L17;
            default: goto L4;
        };
    L4:
        Editable r2 = ((TextInputEditText) r0.J0.k).getText();
        Objects.requireNonNull(r2);
        String r3 = r2.toString().trim();
        if (((TextInputEditText) r0.J0.e).getText() == null) goto L8;
        r7 = ((TextInputEditText) r0.J0.e).getText().toString().trim();
    L8:
        if (r3.isEmpty() == true) goto L10;
    L12:
        w12 r4 = r0.J0;
        if (r4 == null) goto L15;
        ((ListView) r4.g).setVisibility(8);
    L15:
        r0.n0(r3, r7);
        return;
    L10:
        if (r7.isEmpty() == false) goto L12;
        ((TextInputEditText) r0.J0.k).setError(r0.s(R.string.radio_search_empty_query));
        return;
    L17:
        r0.I0.dismiss();
        return;
    L19:
        PopupWindow r5 = r0.I0;
        if (r5 != null) goto L22;
    L24:
        View r9 = r0.o().inflate(R.layout.popup_radio_search, null, false);
        int r10 = R.id.popup_cancel_button;
        MaterialButton r11 = (MaterialButton) uo.s(r9, R.id.popup_cancel_button);
        if (r11 == null) goto L51;
        r10 = R.id.popup_country_dropdown;
        TextInputEditText r12 = (TextInputEditText) uo.s(r9, R.id.popup_country_dropdown);
        if (r12 == null) goto L51;
        r10 = R.id.popup_country_layout;
        TextInputLayout r13 = (TextInputLayout) uo.s(r9, R.id.popup_country_layout);
        if (r13 == null) goto L51;
        r10 = R.id.popup_country_list;
        ListView r14 = (ListView) uo.s(r9, R.id.popup_country_list);
        if (r14 == null) goto L51;
        r10 = R.id.popup_empty_results;
        TextView r15 = (TextView) uo.s(r9, R.id.popup_empty_results);
        if (r15 == null) goto L51;
        r10 = R.id.popup_progress_bar;
        ProgressBar r16 = (ProgressBar) uo.s(r9, R.id.popup_progress_bar);
        if (r16 == null) goto L51;
        r10 = R.id.popup_results_recycler;
        RecyclerView r17 = (RecyclerView) uo.s(r9, R.id.popup_results_recycler);
        if (r17 == null) goto L51;
        r10 = R.id.popup_search_button;
        MaterialButton r18 = (MaterialButton) uo.s(r9, R.id.popup_search_button);
        if (r18 == null) goto L51;
        r10 = R.id.popup_search_name;
        TextInputEditText r19 = (TextInputEditText) uo.s(r9, R.id.popup_search_name);
        if (r19 == null) goto L51;
        r10 = R.id.popup_search_name_layout;
        if (((TextInputLayout) uo.s(r9, R.id.popup_search_name_layout)) == null) goto L51;
        r0.J0 = new w12((LinearLayout) r9, r11, r12, r13, r14, r15, r16, r17, r18, r19);
        r0.L0 = new zd0(new ss2(11, r0));
        RecyclerView r20 = (RecyclerView) r0.J0.i;
        r0.Z();
        r20.setLayoutManager(new LinearLayoutManager(1));
        ((RecyclerView) r0.J0.i).setAdapter(r0.L0);
        ((TextInputEditText) r0.J0.k).setText(((TextInputEditText) r0.B0.f).getText());
        ArrayAdapter r22 = new ArrayAdapter(r0.Z(), R.layout.item_country_dropdown);
        r0.M0 = r22;
        ((ListView) r0.J0.g).setAdapter(r22);
        ((ListView) r0.J0.g).setOnItemClickListener(new ne2(r8, r0));
        ((TextInputEditText) r0.J0.e).addTextChangedListener(new pn1(r8, r0));
        ((TextInputEditText) r0.J0.e).setOnFocusChangeListener(new zt3(r0, r6));
        ((TextInputLayout) r0.J0.f).setEndIconOnClickListener(new au3(r0, r6));
        r0.p0();
        ((TextInputEditText) r0.J0.k).setOnFocusChangeListener(new zt3(r0, r8));
        if (r0.K0.isEmpty() == false) goto L48;
        vt3 r23 = vt3.a();
        r23.getClass();
        Log.d("RadioBrowserClient", "getCountries");
        r23.a.a().enqueue(new si1(18, r0));
    L48:
        ((MaterialButton) r0.J0.c).setOnClickListener(new au3(r0, 3));
        ((MaterialButton) r0.J0.j).setOnClickListener(new au3(r0, 4));
        Rect r24 = new Rect();
        r0.X().getWindow().getDecorView().getWindowVisibleDisplayFrame(r24);
        PopupWindow r25 = new PopupWindow((LinearLayout) r0.J0.b, r24.width() - (((int) (r0.r().getDisplayMetrics().density * 16.0f)) * 2), (int) (((double) r24.height()) * 0.6d), true);
        r0.I0 = r25;
        r25.setFocusable(true);
        r0.I0.setElevation(16.0f);
        r0.I0.setInputMethodMode(1);
        r0.I0.setClippingEnabled(true);
        r0.I0.setOnDismissListener(new yt3(r0));
        r0.I0.showAtLocation((LinearLayout) r0.B0.a, 17, 0, 0);
        Editable r26 = ((TextInputEditText) r0.J0.k).getText();
        Objects.requireNonNull(r26);
        String r27 = r26.toString().trim();
        if (r27.isEmpty() == true) goto L107;
        r0.n0(r27, "");
        return;
    L107:
        return;
    L51:
        nz2.n("Missing required view with ID: ".concat(r9.getResources().getResourceName(r10)));
        return;
    L22:
        if (r5.isShowing() == false) goto L24;
        r0.I0.dismiss();
        return;
    L53:
        Editable r28 = ((TextInputEditText) r0.B0.f).getText();
        Objects.requireNonNull(r28);
        r0.E0 = r28.toString().trim();
        Editable r29 = ((TextInputEditText) r0.B0.g).getText();
        Objects.requireNonNull(r29);
        r0.F0 = r29.toString().trim();
        Editable r30 = ((TextInputEditText) r0.B0.e).getText();
        Objects.requireNonNull(r30);
        r0.G0 = r30.toString().trim();
        if (((TextInputEditText) r0.B0.d).getText() == null) goto L56;
        r7 = ((TextInputEditText) r0.B0.d).getText().toString().trim();
    L56:
        r0.H0 = r7;
        if (TextUtils.isEmpty(r0.E0) == false) goto L60;
        ((TextInputEditText) r0.B0.f).setError(r0.s(R.string.error_required));
        return;
    L60:
        if (TextUtils.isEmpty(r0.F0) == false) goto L62;
        ((TextInputEditText) r0.B0.g).setError(r0.s(R.string.error_required));
        return;
    L62:
        gu3 r31 = r0.C0;
        InternetRadioStation r32 = r31.d;
        hh3 r33 = r31.c;
        k03 r34 = r31.f;
        k03 r110 = r31.g;
        String r111 = r0.E0;
        String r112 = r0.F0;
        String r113 = r0.G0;
        if (r32 != null) goto L77;
        if (r113.isEmpty() == false) goto L67;
        String r35 = null;
    L69:
        if (r0.H0.isEmpty() == false) goto L71;
        String r36 = null;
    L72:
        r110.k(null);
        r34.k(Boolean.FALSE);
        if (r31.e == false) goto L75;
        fu3 r37 = new fu3(r31, 2);
        r33.getClass();
        new Thread(new mr(r111, r112, r35, r36, r37)).start();
        return;
    L75:
        r33.getClass();
        xc5 r38 = App.f(false).d();
        r38.getClass();
        Log.d("InternetRadioClient", "createInternetRadioStation()");
        ((x02) r38.p).d(((pn4) r38.o).f(), r112, r111, r35).enqueue(new pz1(16, r31));
        return;
    L71:
        r36 = r0.H0;
        goto L72
    L67:
        r35 = r0.G0;
        goto L69
    L77:
        if (r113.isEmpty() == false) goto L79;
        String r114 = null;
    L81:
        if (r0.H0.isEmpty() == false) goto L83;
        String r39 = null;
    L84:
        InternetRadioStation r40 = r31.d;
        if (r40 != null) goto L87;
        return;
    L87:
        if (r40.getId() == null) goto L115;
        r110.k(null);
        r34.k(Boolean.FALSE);
        boolean r41 = r31.e;
        InternetRadioStation r42 = r31.d;
        if (r41 == false) goto L92;
        String r115 = r42.getId();
        fu3 r43 = new fu3(r31, 1);
        r33.getClass();
        new Thread(new up(r115, r111, r112, r114, r39, r43)).start();
        return;
    L92:
        String r116 = r42.getId();
        r33.getClass();
        xc5 r44 = App.f(false).d();
        r44.getClass();
        Log.d("InternetRadioClient", "updateInternetRadioStation()");
        ((x02) r44.p).b(((pn4) r44.o).f(), r116, r112, r111, r114).enqueue(new rm2(11, r31));
        return;
    L115:
        return;
    L83:
        r39 = r0.H0;
        goto L84
    L79:
        r114 = r0.G0;
        goto L81
    L94:
        Editable r45 = ((TextInputEditText) r0.J0.e).getText();
        if (r45 != null) goto L97;
    L99:
        int r46 = ((ListView) r0.J0.g).getVisibility();
        w12 r47 = r0.J0;
        if (r46 != 0) goto L103;
        if (r47 == null) goto L117;
        ((ListView) r47.g).setVisibility(8);
        return;
    L117:
        return;
    L103:
        ((TextInputEditText) r47.e).requestFocus();
        r0.o0("");
        return;
    L97:
        if (r45.length() <= 0) goto L99;
        ((TextInputEditText) r0.J0.e).setText("");
        ((TextInputEditText) r0.J0.e).requestFocus();
    }
}
