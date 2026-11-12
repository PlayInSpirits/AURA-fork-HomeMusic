package com.eddyizm.tempus.ui.fragment;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.PodcastChannel;
import com.eddyizm.tempus.subsonic.models.PodcastEpisode;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.aj2;
import defpackage.an3;
import defpackage.au;
import defpackage.b11;
import defpackage.b75;
import defpackage.bj2;
import defpackage.bl2;
import defpackage.bn3;
import defpackage.bo2;
import defpackage.bq4;
import defpackage.cb4;
import defpackage.d8;
import defpackage.e03;
import defpackage.e75;
import defpackage.en3;
import defpackage.f35;
import defpackage.fi0;
import defpackage.g12;
import defpackage.gb;
import defpackage.gh0;
import defpackage.gq0;
import defpackage.hh3;
import defpackage.hn3;
import defpackage.i30;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.nc1;
import defpackage.nz2;
import defpackage.pn4;
import defpackage.pz1;
import defpackage.qg4;
import defpackage.sk2;
import defpackage.u52;
import defpackage.uo;
import defpackage.v23;
import defpackage.wo0;
import defpackage.ws1;
import defpackage.x7;
import defpackage.xc5;
import defpackage.z40;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class PodcastChannelPageFragment extends kc1 implements ClickCallback {
    public z40 l0;
    public MainActivity m0;
    public bn3 n0;
    public en3 o0;
    public bl2 p0;

    public PodcastChannelPageFragment() {
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r10, ViewGroup r11, Bundle r12) {
        this.m0 = (MainActivity) l();
        final int r0 = 0;
        View r13 = r10.inflate(R.layout.fragment_podcast_channel_page, r11, false);
        int r14 = R.id.app_bar_layout;
        PodcastChannel r1 = null;
        if (((AppBarLayout) uo.s(r13, R.id.app_bar_layout)) == null) goto L46;
        LinearLayout r3 = (LinearLayout) r13;
        r14 = R.id.podcast_channel_description_label;
        if (((TextView) uo.s(r13, R.id.podcast_channel_description_label)) == null) goto L46;
        r14 = R.id.podcast_channel_description_text_view;
        TextView r4 = (TextView) uo.s(r13, R.id.podcast_channel_description_text_view);
        if (r4 == null) goto L46;
        r14 = R.id.podcast_channel_page_info_sector;
        if (((ConstraintLayout) uo.s(r13, R.id.podcast_channel_page_info_sector)) == null) goto L46;
        r14 = R.id.podcast_episodes_filter_image_view;
        Button r5 = (Button) uo.s(r13, R.id.podcast_episodes_filter_image_view);
        if (r5 == null) goto L46;
        r14 = R.id.podcast_episodes_recycler_view;
        RecyclerView r6 = (RecyclerView) uo.s(r13, R.id.podcast_episodes_recycler_view);
        if (r6 == null) goto L46;
        r14 = R.id.podcast_episodes_section_label;
        if (((TextView) uo.s(r13, R.id.podcast_episodes_section_label)) == null) goto L46;
        r14 = R.id.toolbar;
        MaterialToolbar r7 = (MaterialToolbar) uo.s(r13, R.id.toolbar);
        if (r7 == null) goto L46;
        r14 = R.id.upper_button_divider;
        View r8 = uo.s(r13, R.id.upper_button_divider);
        if (r8 == null) goto L46;
        this.l0 = new z40(r3, r4, r5, r6, r7, r8);
        nc1 r15 = X();
        e75 r16 = r15.d();
        b75 r17 = gh0.r(r15);
        bq4 r2 = new bq4(r16, r17, b11.e(r15, r17));
        i30 r18 = kx3.a(bn3.class);
        String r19 = r18.b();
        if (r19 == null) goto L44;
        this.n0 = (bn3) r2.l(r18, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r19));
        Bundle r110 = this.s;
        if (r110 == null) goto L25;
        r1 = (PodcastChannel) r110.getParcelable("PODCAST_CHANNEL_OBJECT");
    L25:
        if (r1 != null) goto L32;
        MainActivity r9 = this.m0;
        if (r9 == null) goto L31;
        v23 r20 = r9.T;
        if (r20 == null) goto L31;
        r20.o();
    L31:
        return r3;
    L32:
        this.n0.d = r1;
        this.m0.o((MaterialToolbar) this.l0.q);
        final int r111 = 1;
        if (this.m0.n() == null) goto L35;
        this.m0.n().f0(true);
        this.m0.n().g0();
    L35:
        ((MaterialToolbar) this.l0.q).setTitle(this.n0.d.getTitle());
        ((MaterialToolbar) this.l0.q).setNavigationOnClickListener(new an3(this, r111));
        ((MaterialToolbar) this.l0.q).setTitle(this.n0.d.getTitle());
        String r112 = e03.c(this.n0.d.getDescription());
        z40 r113 = this.l0;
        if (r113 == null) goto L42;
        TextView r114 = (TextView) r113.n;
        if (r112.trim().isEmpty() == true) goto L40;
        int r21 = 0;
    L41:
        r114.setVisibility(r21);
        ((TextView) this.l0.n).setText(r112);
        ((Button) this.l0.o).setOnClickListener(new an3(this, r0));
        goto L42
    L40:
        r21 = 8;
    L42:
        RecyclerView r115 = (RecyclerView) this.l0.p;
        Z();
        r115.setLayoutManager(new LinearLayoutManager(1));
        ((RecyclerView) this.l0.p).i(g12.v(Z()));
        en3 r116 = new en3(this);
        this.o0 = r116;
        ((RecyclerView) this.l0.p).setAdapter(r116);
        bn3 r117 = this.n0;
        hh3 r118 = r117.c;
        String r119 = r117.d.getId();
        r118.getClass();
        hh3.l(r119, true).e(v(), new d8(23, this));
        return r3;
    L44:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L46:
        nz2.n("Missing required view with ID: ".concat(r13.getResources().getResourceName(r14)));
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

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPodcastEpisodeAltClick(Bundle r5) {
        PodcastEpisode r6 = (PodcastEpisode) r5.getParcelable("PODCAST_OBJECT");
        bn3 r0 = this.n0;
        r0.getClass();
        if (r6 != null) goto L5;
    L7:
        View r7 = a0();
        int[] r1 = qg4.E;
        qg4 r8 = qg4.h(r7, r7.getResources().getText(R.string.podcast_episode_download_request_snackbar), -1);
        r8.e(this.m0.u());
        r8.j();
        return;
    L5:
        if (r6.getId() == null) goto L7;
        hh3 r2 = r0.c;
        String r3 = r6.getId();
        r2.getClass();
        wo0 r4 = App.f(false).h();
        r4.getClass();
        Log.d("PodcastClient", "downloadPodcastEpisode()");
        ((hn3) r4.o).b(((pn4) r4.n).f(), r3).enqueue(new pz1(14, r6));
        goto L7
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPodcastEpisodeClick(Bundle r4) {
        bl2 r0 = this.p0;
        PodcastEpisode r5 = (PodcastEpisode) r4.getParcelable("PODCAST_OBJECT");
        WeakReference r1 = bo2.a;
        if (u52.c().a == true) goto L6;
        if (r0 == null) goto L7;
        r0.f(new ws1(17, r0, r5), gq0.n);
    L7:
        ((au) this.m0.V.n).d(true);
        return;
    L6:
        u52.h(R.string.lan_music_only);
        goto L7
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPodcastEpisodeLongClick(Bundle r3) {
        gb.x(a0()).m(R.id.podcastEpisodeBottomSheetDialog, r3, null);
    }
}
