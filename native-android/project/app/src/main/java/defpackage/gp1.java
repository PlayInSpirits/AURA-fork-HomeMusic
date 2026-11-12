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
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.interfaces.PodcastCallback;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.PodcastEpisode;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class gp1 extends kc1 implements ClickCallback, PodcastCallback {
    public up0 l0;
    public MainActivity m0;
    public jn3 n0;
    public en3 o0;
    public zd0 p0;
    public bl2 q0;

    public gp1() {
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r13, ViewGroup r14, Bundle r15) {
        this.m0 = (MainActivity) l();
        View r16 = r13.inflate(R.layout.fragment_home_tab_podcast, r14, false);
        int r17 = R.id.empty_description_image_view;
        if (((ImageView) uo.s(r16, R.id.empty_description_image_view)) == null) goto L34;
        r17 = R.id.empty_podcast_layout;
        LinearLayout r3 = (LinearLayout) uo.s(r16, R.id.empty_podcast_layout);
        if (r3 == null) goto L34;
        r17 = R.id.hide_section_button;
        TextView r4 = (TextView) uo.s(r16, R.id.hide_section_button);
        if (r4 == null) goto L34;
        r17 = R.id.home_newest_podcasts_sector;
        LinearLayout r5 = (LinearLayout) uo.s(r16, R.id.home_newest_podcasts_sector);
        if (r5 == null) goto L34;
        r17 = R.id.home_podcast_channels_sector;
        LinearLayout r6 = (LinearLayout) uo.s(r16, R.id.home_podcast_channels_sector);
        if (r6 == null) goto L34;
        r17 = R.id.home_podcast_sector;
        if (((NestedScrollView) uo.s(r16, R.id.home_podcast_sector)) == null) goto L34;
        r17 = R.id.newest_podcasts_recycler_view;
        RecyclerView r7 = (RecyclerView) uo.s(r16, R.id.newest_podcasts_recycler_view);
        if (r7 == null) goto L34;
        r17 = R.id.podcast_channels_pre_text_view;
        TextView r8 = (TextView) uo.s(r16, R.id.podcast_channels_pre_text_view);
        if (r8 == null) goto L34;
        r17 = R.id.podcast_channels_recycler_view;
        RecyclerView r9 = (RecyclerView) uo.s(r16, R.id.podcast_channels_recycler_view);
        if (r9 == null) goto L34;
        r17 = R.id.podcast_channels_text_view_clickable;
        TextView r10 = (TextView) uo.s(r16, R.id.podcast_channels_text_view_clickable);
        if (r10 == null) goto L34;
        r17 = R.id.subtitle_empty_description_label;
        if (((TextView) uo.s(r16, R.id.subtitle_empty_description_label)) == null) goto L34;
        r17 = R.id.title_empty_description_label;
        if (((TextView) uo.s(r16, R.id.title_empty_description_label)) == null) goto L34;
        r17 = R.id.upper_button_divider;
        View r11 = uo.s(r16, R.id.upper_button_divider);
        if (r11 == null) goto L34;
        ConstraintLayout r2 = (ConstraintLayout) r16;
        this.l0 = new up0(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
        nc1 r18 = X();
        e75 r19 = r18.d();
        b75 r110 = gh0.r(r18);
        bq4 r1 = new bq4(r19, r110, b11.e(r18, r110));
        i30 r111 = kx3.a(jn3.class);
        String r112 = r111.b();
        if (r112 == null) goto L32;
        this.n0 = (jn3) r1.l(r111, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r112));
        return r2;
    L32:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L34:
        nz2.n("Missing required view with ID: ".concat(r16.getResources().getResourceName(r17)));
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
        this.q0 = r7;
        return;
    L6:
        r0 = null;
        goto L7
    }

    @Override // defpackage.kc1
    public final void S() {
        sk2.Z0(this.q0);
        this.R = true;
    }

    @Override // defpackage.kc1
    public final void T(View r6, Bundle r7) {
        final int r0 = 0;
        ((TextView) this.l0.f).setOnClickListener(new dp1(this, r0));
        final int r1 = 1;
        ((TextView) this.l0.h).setOnClickListener(new dp1(this, r1));
        ((TextView) this.l0.c).setOnClickListener(new ep1(0));
        jn3 r8 = this.n0;
        le1 r9 = v();
        k03 r2 = r8.e;
        if (r2.d() != null) goto L5;
        r8.c.getClass();
        hh3.l(null, false).e(r9, new g7(r2, 0));
    L5:
        r2.e(v(), new fp1(this, r0));
        RecyclerView r10 = (RecyclerView) this.l0.e;
        Z();
        r10.setLayoutManager(new LinearLayoutManager(1));
        ((RecyclerView) this.l0.e).i(g12.v(Z()));
        en3 r11 = new en3(this);
        this.o0 = r11;
        ((RecyclerView) this.l0.e).setAdapter(r11);
        jn3 r12 = this.n0;
        le1 r13 = v();
        k03 r3 = r12.d;
        if (r3.d() != null) goto L8;
        r12.c.getClass();
        hh3.k().e(r13, new g7(r3, 0));
    L8:
        final int r4 = 2;
        r3.e(v(), new fp1(this, r4));
        RecyclerView r14 = (RecyclerView) this.l0.g;
        Z();
        r14.setLayoutManager(new LinearLayoutManager(1));
        zd0 r15 = new zd0(this);
        this.p0 = r15;
        ((RecyclerView) this.l0.g).setAdapter(r15);
        jn3 r16 = this.n0;
        le1 r17 = v();
        k03 r5 = r16.e;
        if (r5.d() != null) goto L11;
        r16.c.getClass();
        hh3.l(null, false).e(r17, new g7(r5, 0));
    L11:
        r5.e(v(), new fp1(this, r1));
    }

    @Override // com.eddyizm.tempus.interfaces.PodcastCallback
    public final void onDismiss() {
        new Handler().postDelayed(new qa1(11, this), 1000);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPodcastChannelClick(Bundle r3) {
        gb.x(a0()).m(R.id.podcastChannelPageFragment, r3, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPodcastChannelLongClick(Bundle r3) {
        gb.x(a0()).m(R.id.podcastChannelBottomSheetDialog, r3, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPodcastEpisodeClick(Bundle r4) {
        bl2 r0 = this.q0;
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
