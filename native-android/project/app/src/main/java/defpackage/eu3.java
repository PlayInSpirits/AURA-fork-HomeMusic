package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import app.homemusic.R;
import com.eddyizm.tempus.interfaces.RadioCallback;
import com.eddyizm.tempus.radiobrowser.RadioBrowserStation;
import com.eddyizm.tempus.subsonic.models.InternetRadioStation;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import retrofit2.Call;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class eu3 extends pp0 {
    public up0 B0;
    public gu3 C0;
    public final RadioCallback D0;
    public String E0;
    public String F0;
    public String G0;
    public String H0;
    public PopupWindow I0;
    public w12 J0;
    public final ArrayList K0;
    public zd0 L0;
    public ArrayAdapter M0;
    public boolean N0;

    public eu3(RadioCallback r2) {
        this.K0 = new ArrayList();
        this.D0 = r2;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void J() {
        super.J();
        PopupWindow r0 = this.I0;
        if (r0 == null) goto L5;
        r0.dismiss();
    L5:
        this.B0 = null;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void R() {
        super.R();
        InternetRadioStation r0 = this.C0.d;
        if (r0 == null) goto L12;
        ((TextInputEditText) this.B0.f).setText(r0.getName());
        ((TextInputEditText) this.B0.g).setText(r0.getStreamUrl());
        ((TextInputEditText) this.B0.e).setText(r0.getHomePageUrl());
        this.B0.b.setVisibility(8);
        ((ImageButton) this.B0.i).setVisibility(8);
        if (this.C0.e == false) goto L7;
        ((TextInputLayout) this.B0.c).setVisibility(0);
        ((TextInputEditText) this.B0.d).setText(r0.getCoverArt());
    L7:
        Dialog r1 = this.w0;
        if (r1 == null) goto L12;
        Button r2 = ((f9) r1).i(-3);
        if (r2 == null) goto L12;
        r2.setVisibility(0);
    L12:
        Dialog r3 = this.w0;
        if ((r3 instanceof f9) == false) goto L18;
        Button r4 = ((f9) r3).i(-1);
        if (r4 == null) goto L19;
        r4.setOnClickListener(new au3(this, 1));
        return;
    L19:
        return;
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle r15) {
        final int r2 = 0;
        View r16 = o().inflate(R.layout.dialog_radio_editor, null, false);
        int r0 = R.id.internet_radio_station_cover_art_url_layout;
        TextInputLayout r6 = (TextInputLayout) uo.s(r16, R.id.internet_radio_station_cover_art_url_layout);
        if (r6 == null) goto L52;
        r0 = R.id.internet_radio_station_cover_art_url_text_view;
        TextInputEditText r7 = (TextInputEditText) uo.s(r16, R.id.internet_radio_station_cover_art_url_text_view);
        if (r7 == null) goto L52;
        r0 = R.id.internet_radio_station_homepage_url_layout;
        if (((TextInputLayout) uo.s(r16, R.id.internet_radio_station_homepage_url_layout)) == null) goto L52;
        r0 = R.id.internet_radio_station_homepage_url_text_view;
        TextInputEditText r8 = (TextInputEditText) uo.s(r16, R.id.internet_radio_station_homepage_url_text_view);
        if (r8 == null) goto L52;
        r0 = R.id.internet_radio_station_name_layout;
        if (((TextInputLayout) uo.s(r16, R.id.internet_radio_station_name_layout)) == null) goto L52;
        r0 = R.id.internet_radio_station_name_text_view;
        TextInputEditText r9 = (TextInputEditText) uo.s(r16, R.id.internet_radio_station_name_text_view);
        if (r9 == null) goto L52;
        r0 = R.id.internet_radio_station_stream_url_layout;
        if (((TextInputLayout) uo.s(r16, R.id.internet_radio_station_stream_url_layout)) == null) goto L52;
        r0 = R.id.internet_radio_station_stream_url_text_view;
        TextInputEditText r10 = (TextInputEditText) uo.s(r16, R.id.internet_radio_station_stream_url_text_view);
        if (r10 == null) goto L52;
        r0 = R.id.radio_source_local;
        if (((MaterialButton) uo.s(r16, R.id.radio_source_local)) == null) goto L52;
        r0 = R.id.radio_source_server;
        if (((MaterialButton) uo.s(r16, R.id.radio_source_server)) == null) goto L52;
        int r3 = R.id.radio_source_toggle;
        MaterialButtonToggleGroup r11 = (MaterialButtonToggleGroup) uo.s(r16, R.id.radio_source_toggle);
        if (r11 == null) goto L51;
        r3 = R.id.search_directory_button;
        ImageButton r12 = (ImageButton) uo.s(r16, R.id.search_directory_button);
        if (r12 == null) goto L51;
        r3 = R.id.source_toggle_layout;
        LinearLayout r13 = (LinearLayout) uo.s(r16, R.id.source_toggle_layout);
        if (r13 == null) goto L51;
        this.B0 = new up0((LinearLayout) r16, r6, r7, r8, r9, r10, r11, r12, r13);
        e75 r17 = d();
        b75 r4 = gh0.r(this);
        tf0 r5 = gh0.q(this);
        r4.getClass();
        r5.getClass();
        bq4 r14 = new bq4(r17, r4, r5);
        i30 r18 = kx3.a(gu3.class);
        String r19 = r18.b();
        if (r19 == null) goto L49;
        this.C0 = (gu3) r14.l(r18, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r19));
        Bundle r110 = this.s;
        final int r1 = 1;
        if (r110 != null) goto L33;
    L43:
        this.C0.f.e(this, new bu3(this, r2));
        this.C0.g.e(this, new bu3(this, r1));
        InternetRadioStation r111 = this.C0.d;
        up0 r20 = this.B0;
        if (r111 == null) goto L46;
        r20.b.setVisibility(8);
        ((ImageButton) this.B0.i).setVisibility(8);
    L47:
        ((ImageButton) this.B0.i).setOnClickListener(new au3(this, 2));
        vg2 r112 = new vg2(Z(), 0).q((LinearLayout) this.B0.a);
        r112.p(R.string.radio_editor_dialog_title);
        vg2 r113 = r112.l(R.string.radio_editor_dialog_positive_button, new wr(3));
        r113.k(R.string.radio_editor_dialog_neutral_button, new vr(6, this));
        return r113.j(R.string.radio_editor_dialog_negative_button, new wr(9)).create();
    L46:
        r20.b.setVisibility(0);
        ((ImageButton) this.B0.i).setVisibility(0);
        MaterialButtonToggleGroup r114 = (MaterialButtonToggleGroup) this.B0.h;
        r114.p.add(new cu3(this));
        ((MaterialButtonToggleGroup) this.B0.h).b(R.id.radio_source_server, true);
        goto L47
    L33:
        if (r110.getParcelable("INTERNET_RADIO_STATION_OBJECT") == null) goto L43;
        gu3 r115 = this.C0;
        InternetRadioStation r21 = (InternetRadioStation) Y().getParcelable("INTERNET_RADIO_STATION_OBJECT");
        r115.d = r21;
        if (r21 == null) goto L41;
        hh3 r22 = r115.c;
        String r23 = r21.getId();
        r22.getClass();
        if (r23 == null) goto L41;
        if (r23.startsWith("local_") == false) goto L41;
        boolean r24 = true;
    L42:
        r115.e = r24;
    L41:
        r24 = false;
        goto L42
    L49:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L51:
        r0 = r3;
    L52:
        nz2.n("Missing required view with ID: ".concat(r16.getResources().getResourceName(r0)));
        return null;
    }

    public final void n0(String r7, String r8) {
        if (this.L0.r.size() != 0) goto L6;
        ((ProgressBar) this.J0.h).setVisibility(0);
        ((TextView) this.J0.d).setVisibility(8);
    L6:
        if (r7.isEmpty() == true) goto L17;
        if (r8.isEmpty() == true) goto L17;
        vt3 r0 = vt3.a();
        r0.getClass();
        Log.d("RadioBrowserClient", "searchAdvanced: name=" + r7 + " country=" + r8);
        HashMap r3 = new HashMap();
        if (r7.isEmpty() == true) goto L13;
        r3.put("name", r7);
    L13:
        if (r8.isEmpty() == true) goto L15;
        r3.put("country", r8);
    L15:
        r3.put("limit", String.valueOf(30));
        r3.put("order", "votes");
        r3.put("reverse", "true");
        Call<List<RadioBrowserStation>> r9 = r0.a.b(r3);
    L20:
        r9.enqueue(new om1(21, this));
        return;
    L17:
        if (r8.isEmpty() == true) goto L19;
        vt3 r10 = vt3.a();
        r10.getClass();
        Log.d("RadioBrowserClient", "searchByCountryExact: ".concat(r8));
        r9 = r10.a.d(r8, 30, "votes", true);
        goto L20
    L19:
        vt3 r11 = vt3.a();
        r11.getClass();
        Log.d("RadioBrowserClient", "searchByName: ".concat(r7));
        r9 = r11.a.c(r7, 30, "votes", true);
        goto L20
    }

    public final void o0(String r8) {
        if (this.J0 != null) goto L5;
        return;
    L5:
        if (r8 == null) goto L7;
        String r9 = r8.trim().toLowerCase();
    L8:
        ArrayList r0 = new ArrayList();
        ArrayList r1 = this.K0;
        int r2 = r1.size();
        int r3 = 0;
        int r4 = 0;
    L9:
        if (r4 >= r2) goto L15;
        Object r5 = r1.get(r4);
        r4 = r4 + 1;
        String r6 = (String) r5;
        if (r9.isEmpty() == true) goto L14;
        if (r6.toLowerCase().contains(r9) == false) goto L9;
    L14:
        r0.add(r6);
        goto L9
    L15:
        this.M0.clear();
        this.M0.addAll(r0);
        this.M0.notifyDataSetChanged();
        w12 r10 = this.J0;
        if (r10 == null) goto L19;
        int[] r7 = new int[2];
        ((View) ((ListView) r10.g).getParent()).getLocationOnScreen(r7);
        int[] r11 = new int[2];
        ((TextInputLayout) this.J0.f).getLocationOnScreen(r11);
        int r12 = (int) (r().getDisplayMetrics().density * 16.0f);
        FrameLayout.LayoutParams r13 = (FrameLayout.LayoutParams) ((ListView) this.J0.g).getLayoutParams();
        r13.width = -1;
        r13.gravity = 8388659;
        r13.leftMargin = Math.max(0, r11[0] - r7[0]);
        r13.rightMargin = r12;
        ((ListView) this.J0.g).setLayoutParams(r13);
    L19:
        ListView r14 = (ListView) this.J0.g;
        if (r0.isEmpty() == false) goto L22;
        r3 = 8;
    L22:
        r14.setVisibility(r3);
        return;
    L7:
        r9 = "";
        goto L8
    }

    public final void p0() {
        w12 r0 = this.J0;
        if (r0 != null) goto L5;
        return;
    L5:
        Editable r1 = ((TextInputEditText) r0.e).getText();
        if (r1 != null) goto L8;
    L10:
        boolean r2 = false;
    L11:
        TextInputLayout r3 = (TextInputLayout) this.J0.f;
        if (r2 == false) goto L14;
        int r4 = R.drawable.ic_close;
    L15:
        r3.setEndIconDrawable(r4);
        return;
    L14:
        r4 = R.drawable.ic_expand_more;
        goto L15
    L8:
        if (r1.length() <= 0) goto L10;
        r2 = true;
        goto L11
    }
}
