package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.interfaces.RadioCallback;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.InternetRadioStation;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class hp1 extends kc1 implements ClickCallback, RadioCallback {
    public z40 l0;
    public MainActivity m0;
    public iu3 n0;
    public zd0 o0;
    public bl2 p0;

    public hp1() {
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r9, ViewGroup r10, Bundle r11) {
        this.m0 = (MainActivity) l();
        View r12 = r9.inflate(R.layout.fragment_home_tab_radio, r10, false);
        int r13 = R.id.empty_description_image_view;
        if (((ImageView) uo.s(r12, R.id.empty_description_image_view)) == null) goto L24;
        r13 = R.id.empty_radio_station_layout;
        LinearLayout r3 = (LinearLayout) uo.s(r12, R.id.empty_radio_station_layout);
        if (r3 == null) goto L24;
        r13 = R.id.hide_section_button;
        TextView r4 = (TextView) uo.s(r12, R.id.hide_section_button);
        if (r4 == null) goto L24;
        r13 = R.id.internet_radio_station_pre_text_view;
        TextView r5 = (TextView) uo.s(r12, R.id.internet_radio_station_pre_text_view);
        if (r5 == null) goto L24;
        r13 = R.id.internet_radio_station_recycler_view;
        RecyclerView r6 = (RecyclerView) uo.s(r12, R.id.internet_radio_station_recycler_view);
        if (r6 == null) goto L24;
        r13 = R.id.internet_radio_station_title_text_view;
        TextView r7 = (TextView) uo.s(r12, R.id.internet_radio_station_title_text_view);
        if (r7 == null) goto L24;
        r13 = R.id.subtitle_empty_description_label;
        if (((TextView) uo.s(r12, R.id.subtitle_empty_description_label)) == null) goto L24;
        r13 = R.id.title_empty_description_label;
        if (((TextView) uo.s(r12, R.id.title_empty_description_label)) == null) goto L24;
        ConstraintLayout r2 = (ConstraintLayout) r12;
        this.l0 = new z40(r2, r3, r4, r5, r6, r7);
        nc1 r14 = X();
        e75 r15 = r14.d();
        b75 r16 = gh0.r(r14);
        bq4 r1 = new bq4(r15, r16, b11.e(r14, r16));
        i30 r17 = kx3.a(iu3.class);
        String r18 = r17.b();
        if (r18 == null) goto L22;
        this.n0 = (iu3) r1.l(r17, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r18));
        return r2;
    L22:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L24:
        nz2.n("Missing required view with ID: ".concat(r12.getResources().getResourceName(r13)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.l0 = null;
    }

    @Override // defpackage.kc1
    public final void R() {
        this.R = true;
        Context r2 = Z();
        cb4 r3 = new cb4(Z(), new ComponentName(Z(), MediaService.class));
        Bundle r4 = Bundle.EMPTY;
        aj2 r5 = new aj2();
        Looper r6 = f35.x();
        bl2 r7 = new bl2(r6);
        if (r3.a.e() == false) goto L6;
        xc5 r0 = new xc5(4, new fi0(new x7(r2)));
    L7:
        b11.w(r7, new bj2(r2, r3, r4, r5, r6, r7, r0), new Handler(r6));
        this.p0 = r7;
        return;
    L6:
        r0 = null;
        goto L7
    }

    @Override // defpackage.kc1
    public final void S() {
        sk2.Z0(this.p0);
        this.R = true;
    }

    @Override // defpackage.kc1
    public final void T(View r3, Bundle r4) {
        ((TextView) this.l0.p).setOnClickListener(new p6(19, this));
        ((TextView) this.l0.r).setOnLongClickListener(new q6(10, this));
        ((TextView) this.l0.o).setOnClickListener(new ep1(1));
        RecyclerView r5 = (RecyclerView) this.l0.q;
        Z();
        r5.setLayoutManager(new LinearLayoutManager(1));
        ((RecyclerView) this.l0.q).setHasFixedSize(true);
        zd0 r6 = new zd0(this);
        this.o0 = r6;
        ((RecyclerView) this.l0.q).setAdapter(r6);
        this.n0.c(v()).e(v(), new d8(12, this));
    }

    @Override // com.eddyizm.tempus.interfaces.RadioCallback
    public final void onDismiss() {
        new Handler().postDelayed(new qa1(12, this), 1000);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onInternetRadioStationClick(Bundle r4) {
        bl2 r0 = this.p0;
        InternetRadioStation r5 = (InternetRadioStation) r4.getParcelable("INTERNET_RADIO_STATION_OBJECT");
        WeakReference r1 = bo2.a;
        if (u52.c().a == true) goto L6;
        if (r0 == null) goto L7;
        r0.f(new ws1(22, r0, r5), gq0.n);
    L7:
        ((au) this.m0.V.n).d(true);
        return;
    L6:
        u52.h(R.string.lan_music_only);
        goto L7
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onInternetRadioStationLongClick(Bundle r4) {
        eu3 r0 = new eu3(new hg3(23, this));
        r0.c0(r4);
        r0.m0(this.m0.k(), null);
    }
}
