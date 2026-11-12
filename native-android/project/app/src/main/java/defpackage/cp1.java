package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
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
import android.widget.Toast;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.AURAHomeAnimation;
import app.homemusic.AURAVersion;
import app.homemusic.AURAWaveCircleTouchListener;
import app.homemusic.AURAWavePlaybackListener;
import app.homemusic.AURAWaveToggleClickListener;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.WaveOrigin;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Share;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.viewmodel.b;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class cp1 extends kc1 implements ClickCallback {
    public s6 A0;
    public b8 B0;
    public uc4 C0;
    public ej D0;
    public uc4 E0;
    public bl2 F0;
    public zd0 G0;
    public View H0;
    public boolean I0;
    public tc1 l0;
    public MainActivity m0;
    public b n0;
    public vf2 o0;
    public li3 p0;
    public vq0 q0;
    public s6 r0;
    public vi s0;
    public vi t0;
    public ni4 u0;
    public ni4 v0;
    public s6 w0;
    public b8 x0;
    public s6 y0;
    public s6 z0;

    public cp1() {
        this.H0 = null;
        this.I0 = false;
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r78, ViewGroup r79, Bundle r80) {
        this.m0 = (MainActivity) l();
        final int r2 = 0;
        View r1 = r78.inflate(R.layout.fragment_home_tab_music, r79, false);
        int r3 = R.id.after_favorites_divider;
        View r6 = uo.s(r1, R.id.after_favorites_divider);
        if (r6 == null) goto L186;
        r3 = R.id.after_grid_divider;
        View r7 = uo.s(r1, R.id.after_grid_divider);
        if (r7 == null) goto L186;
        r3 = R.id.after_radio_artist_divider;
        View r8 = uo.s(r1, R.id.after_radio_artist_divider);
        if (r8 == null) goto L186;
        r3 = R.id.best_of_artist_recycler_view;
        RecyclerView r9 = (RecyclerView) uo.s(r1, R.id.best_of_artist_recycler_view);
        if (r9 == null) goto L186;
        r3 = R.id.best_of_artist_text_view_refreshable;
        TextView r10 = (TextView) uo.s(r1, R.id.best_of_artist_text_view_refreshable);
        if (r10 == null) goto L186;
        r3 = R.id.continue_listening_recycler_view;
        RecyclerView r11 = (RecyclerView) uo.s(r1, R.id.continue_listening_recycler_view);
        if (r11 == null) goto L186;
        r3 = R.id.discover_song_recycler_view;
        RecyclerView r12 = (RecyclerView) uo.s(r1, R.id.discover_song_recycler_view);
        if (r12 == null) goto L186;
        r3 = R.id.discovery_text_view_clickable;
        TextView r13 = (TextView) uo.s(r1, R.id.discovery_text_view_clickable);
        if (r13 == null) goto L186;
        r3 = R.id.discovery_text_view_refreshable;
        TextView r14 = (TextView) uo.s(r1, R.id.discovery_text_view_refreshable);
        if (r14 == null) goto L186;
        NestedScrollView r5 = (NestedScrollView) r1;
        r3 = R.id.grid_tracks_pre_text_view;
        TextView r15 = (TextView) uo.s(r1, R.id.grid_tracks_pre_text_view);
        if (r15 == null) goto L186;
        r3 = R.id.grid_tracks_text_view;
        if (((TextView) uo.s(r1, R.id.grid_tracks_text_view)) == null) goto L186;
        r3 = R.id.home_best_of_artist_sector;
        LinearLayout r16 = (LinearLayout) uo.s(r1, R.id.home_best_of_artist_sector);
        if (r16 == null) goto L186;
        r3 = R.id.home_continue_listening_sector;
        LinearLayout r17 = (LinearLayout) uo.s(r1, R.id.home_continue_listening_sector);
        if (r17 == null) goto L186;
        r3 = R.id.home_discover_sector;
        LinearLayout r18 = (LinearLayout) uo.s(r1, R.id.home_discover_sector);
        if (r18 == null) goto L186;
        r3 = R.id.home_flashback_sector;
        LinearLayout r19 = (LinearLayout) uo.s(r1, R.id.home_flashback_sector);
        if (r19 == null) goto L186;
        r3 = R.id.home_grid_tracks_sector;
        LinearLayout r20 = (LinearLayout) uo.s(r1, R.id.home_grid_tracks_sector);
        if (r20 == null) goto L186;
        r3 = R.id.home_linear_layout_container;
        LinearLayout r21 = (LinearLayout) uo.s(r1, R.id.home_linear_layout_container);
        if (r21 == null) goto L186;
        r3 = R.id.home_most_played_albums_sector;
        LinearLayout r22 = (LinearLayout) uo.s(r1, R.id.home_most_played_albums_sector);
        if (r22 == null) goto L186;
        r3 = R.id.home_new_releases_sector;
        LinearLayout r23 = (LinearLayout) uo.s(r1, R.id.home_new_releases_sector);
        if (r23 == null) goto L186;
        r3 = R.id.home_radio_artist_sector;
        LinearLayout r24 = (LinearLayout) uo.s(r1, R.id.home_radio_artist_sector);
        if (r24 == null) goto L186;
        r3 = R.id.home_recently_added_albums_sector;
        LinearLayout r25 = (LinearLayout) uo.s(r1, R.id.home_recently_added_albums_sector);
        if (r25 == null) goto L186;
        r3 = R.id.home_recently_played_albums_sector;
        LinearLayout r26 = (LinearLayout) uo.s(r1, R.id.home_recently_played_albums_sector);
        if (r26 == null) goto L186;
        r3 = R.id.home_sector_rearrangement_button;
        Button r27 = (Button) uo.s(r1, R.id.home_sector_rearrangement_button);
        if (r27 == null) goto L186;
        r3 = R.id.home_similar_tracks_sector;
        LinearLayout r28 = (LinearLayout) uo.s(r1, R.id.home_similar_tracks_sector);
        if (r28 == null) goto L186;
        r3 = R.id.home_sync_starred_albums_cancel;
        MaterialButton r29 = (MaterialButton) uo.s(r1, R.id.home_sync_starred_albums_cancel);
        if (r29 == null) goto L186;
        r3 = R.id.home_sync_starred_albums_card;
        MaterialCardView r30 = (MaterialCardView) uo.s(r1, R.id.home_sync_starred_albums_card);
        if (r30 == null) goto L186;
        r3 = R.id.home_sync_starred_albums_download;
        MaterialButton r31 = (MaterialButton) uo.s(r1, R.id.home_sync_starred_albums_download);
        if (r31 == null) goto L186;
        r3 = R.id.home_sync_starred_albums_subtitle;
        if (((TextView) uo.s(r1, R.id.home_sync_starred_albums_subtitle)) == null) goto L186;
        r3 = R.id.home_sync_starred_albums_title;
        if (((TextView) uo.s(r1, R.id.home_sync_starred_albums_title)) == null) goto L186;
        r3 = R.id.home_sync_starred_albums_to_sync;
        TextView r32 = (TextView) uo.s(r1, R.id.home_sync_starred_albums_to_sync);
        if (r32 == null) goto L186;
        r3 = R.id.home_sync_starred_artists_cancel;
        MaterialButton r33 = (MaterialButton) uo.s(r1, R.id.home_sync_starred_artists_cancel);
        if (r33 == null) goto L186;
        r3 = R.id.home_sync_starred_artists_card;
        MaterialCardView r34 = (MaterialCardView) uo.s(r1, R.id.home_sync_starred_artists_card);
        if (r34 == null) goto L186;
        r3 = R.id.home_sync_starred_artists_download;
        MaterialButton r35 = (MaterialButton) uo.s(r1, R.id.home_sync_starred_artists_download);
        if (r35 == null) goto L186;
        r3 = R.id.home_sync_starred_artists_subtitle;
        if (((TextView) uo.s(r1, R.id.home_sync_starred_artists_subtitle)) == null) goto L186;
        r3 = R.id.home_sync_starred_artists_title;
        if (((TextView) uo.s(r1, R.id.home_sync_starred_artists_title)) == null) goto L186;
        r3 = R.id.home_sync_starred_artists_to_sync;
        TextView r36 = (TextView) uo.s(r1, R.id.home_sync_starred_artists_to_sync);
        if (r36 == null) goto L186;
        r3 = R.id.home_sync_starred_cancel;
        MaterialButton r37 = (MaterialButton) uo.s(r1, R.id.home_sync_starred_cancel);
        if (r37 == null) goto L186;
        r3 = R.id.home_sync_starred_card;
        MaterialCardView r38 = (MaterialCardView) uo.s(r1, R.id.home_sync_starred_card);
        if (r38 == null) goto L186;
        r3 = R.id.home_sync_starred_download;
        MaterialButton r39 = (MaterialButton) uo.s(r1, R.id.home_sync_starred_download);
        if (r39 == null) goto L186;
        r3 = R.id.home_sync_starred_subtitle;
        if (((TextView) uo.s(r1, R.id.home_sync_starred_subtitle)) == null) goto L186;
        r3 = R.id.home_sync_starred_title;
        if (((TextView) uo.s(r1, R.id.home_sync_starred_title)) == null) goto L186;
        r3 = R.id.home_sync_starred_tracks_to_sync;
        TextView r40 = (TextView) uo.s(r1, R.id.home_sync_starred_tracks_to_sync);
        if (r40 == null) goto L186;
        r3 = R.id.most_played_albums_recycler_view;
        RecyclerView r41 = (RecyclerView) uo.s(r1, R.id.most_played_albums_recycler_view);
        if (r41 == null) goto L186;
        r3 = R.id.most_played_albums_text_view_clickable;
        TextView r42 = (TextView) uo.s(r1, R.id.most_played_albums_text_view_clickable);
        if (r42 == null) goto L186;
        r3 = R.id.most_played_albums_text_view_refreshable;
        TextView r43 = (TextView) uo.s(r1, R.id.most_played_albums_text_view_refreshable);
        if (r43 == null) goto L186;
        r3 = R.id.most_streamed_song_pre_text_view;
        if (((TextView) uo.s(r1, R.id.most_streamed_song_pre_text_view)) == null) goto L186;
        r3 = R.id.new_releases_recycler_view;
        RecyclerView r44 = (RecyclerView) uo.s(r1, R.id.new_releases_recycler_view);
        if (r44 == null) goto L186;
        r3 = R.id.pinned_playlists_recycler_view;
        RecyclerView r45 = (RecyclerView) uo.s(r1, R.id.pinned_playlists_recycler_view);
        if (r45 == null) goto L186;
        r3 = R.id.pinned_playlists_sector;
        LinearLayout r46 = (LinearLayout) uo.s(r1, R.id.pinned_playlists_sector);
        if (r46 == null) goto L186;
        r3 = R.id.pinned_playlists_text_view;
        if (((TextView) uo.s(r1, R.id.pinned_playlists_text_view)) == null) goto L186;
        r3 = R.id.playlist_catalogue_text_view_clickable;
        TextView r47 = (TextView) uo.s(r1, R.id.playlist_catalogue_text_view_clickable);
        if (r47 == null) goto L186;
        r3 = R.id.radio_artist_recycler_view;
        RecyclerView r48 = (RecyclerView) uo.s(r1, R.id.radio_artist_recycler_view);
        if (r48 == null) goto L186;
        r3 = R.id.radio_artist_text_view_refreshable;
        TextView r49 = (TextView) uo.s(r1, R.id.radio_artist_text_view_refreshable);
        if (r49 == null) goto L186;
        r3 = R.id.recently_added_albums_recycler_view;
        RecyclerView r50 = (RecyclerView) uo.s(r1, R.id.recently_added_albums_recycler_view);
        if (r50 == null) goto L186;
        r3 = R.id.recently_added_albums_text_view_clickable;
        TextView r51 = (TextView) uo.s(r1, R.id.recently_added_albums_text_view_clickable);
        if (r51 == null) goto L186;
        r3 = R.id.recently_added_albums_text_view_refreshable;
        TextView r52 = (TextView) uo.s(r1, R.id.recently_added_albums_text_view_refreshable);
        if (r52 == null) goto L186;
        r3 = R.id.recently_played_albums_recycler_view;
        RecyclerView r53 = (RecyclerView) uo.s(r1, R.id.recently_played_albums_recycler_view);
        if (r53 == null) goto L186;
        r3 = R.id.recently_played_albums_text_view_clickable;
        TextView r54 = (TextView) uo.s(r1, R.id.recently_played_albums_text_view_clickable);
        if (r54 == null) goto L186;
        r3 = R.id.recently_played_albums_text_view_refreshable;
        TextView r55 = (TextView) uo.s(r1, R.id.recently_played_albums_text_view_refreshable);
        if (r55 == null) goto L186;
        r3 = R.id.shares_recycler_view;
        RecyclerView r56 = (RecyclerView) uo.s(r1, R.id.shares_recycler_view);
        if (r56 == null) goto L186;
        r3 = R.id.shares_sector;
        LinearLayout r57 = (LinearLayout) uo.s(r1, R.id.shares_sector);
        if (r57 == null) goto L186;
        r3 = R.id.shares_text_view_refreshable;
        TextView r58 = (TextView) uo.s(r1, R.id.shares_text_view_refreshable);
        if (r58 == null) goto L186;
        r3 = R.id.similar_tracks_pre_text_view;
        if (((TextView) uo.s(r1, R.id.similar_tracks_pre_text_view)) == null) goto L186;
        r3 = R.id.similar_tracks_recycler_view;
        RecyclerView r59 = (RecyclerView) uo.s(r1, R.id.similar_tracks_recycler_view);
        if (r59 == null) goto L186;
        r3 = R.id.similar_tracks_text_view_refreshable;
        TextView r60 = (TextView) uo.s(r1, R.id.similar_tracks_text_view_refreshable);
        if (r60 == null) goto L186;
        r3 = R.id.starred_albums_recycler_view;
        RecyclerView r61 = (RecyclerView) uo.s(r1, R.id.starred_albums_recycler_view);
        if (r61 == null) goto L186;
        r3 = R.id.starred_albums_sector;
        LinearLayout r62 = (LinearLayout) uo.s(r1, R.id.starred_albums_sector);
        if (r62 == null) goto L186;
        r3 = R.id.starred_albums_text_view_clickable;
        TextView r63 = (TextView) uo.s(r1, R.id.starred_albums_text_view_clickable);
        if (r63 == null) goto L186;
        r3 = R.id.starred_albums_text_view_refreshable;
        TextView r64 = (TextView) uo.s(r1, R.id.starred_albums_text_view_refreshable);
        if (r64 == null) goto L186;
        r3 = R.id.starred_artists_recycler_view;
        RecyclerView r65 = (RecyclerView) uo.s(r1, R.id.starred_artists_recycler_view);
        if (r65 == null) goto L186;
        r3 = R.id.starred_artists_sector;
        LinearLayout r66 = (LinearLayout) uo.s(r1, R.id.starred_artists_sector);
        if (r66 == null) goto L186;
        r3 = R.id.starred_artists_text_view_clickable;
        TextView r67 = (TextView) uo.s(r1, R.id.starred_artists_text_view_clickable);
        if (r67 == null) goto L186;
        r3 = R.id.starred_artists_text_view_refreshable;
        TextView r68 = (TextView) uo.s(r1, R.id.starred_artists_text_view_refreshable);
        if (r68 == null) goto L186;
        r3 = R.id.starred_tracks_recycler_view;
        RecyclerView r69 = (RecyclerView) uo.s(r1, R.id.starred_tracks_recycler_view);
        if (r69 == null) goto L186;
        r3 = R.id.starred_tracks_sector;
        LinearLayout r70 = (LinearLayout) uo.s(r1, R.id.starred_tracks_sector);
        if (r70 == null) goto L186;
        r3 = R.id.starred_tracks_text_view_clickable;
        TextView r71 = (TextView) uo.s(r1, R.id.starred_tracks_text_view_clickable);
        if (r71 == null) goto L186;
        r3 = R.id.starred_tracks_text_view_refreshable;
        TextView r72 = (TextView) uo.s(r1, R.id.starred_tracks_text_view_refreshable);
        if (r72 == null) goto L186;
        r3 = R.id.top_songs_recycler_view;
        RecyclerView r73 = (RecyclerView) uo.s(r1, R.id.top_songs_recycler_view);
        if (r73 == null) goto L186;
        r3 = R.id.vertical_guideline;
        if (((Guideline) uo.s(r1, R.id.vertical_guideline)) == null) goto L186;
        r3 = R.id.vertical_guideline_albums;
        if (((Guideline) uo.s(r1, R.id.vertical_guideline_albums)) == null) goto L186;
        r3 = R.id.vertical_guideline_artists;
        if (((Guideline) uo.s(r1, R.id.vertical_guideline_artists)) == null) goto L186;
        r3 = R.id.years_recycler_view;
        RecyclerView r74 = (RecyclerView) uo.s(r1, R.id.years_recycler_view);
        if (r74 == null) goto L186;
        this.l0 = new tc1(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74);
        NestedScrollView r4 = this.l0.a;
        nc1 r75 = X();
        e75 r76 = r75.d();
        b75 r77 = gh0.r(r75);
        bq4 r81 = new bq4(r76, r77, b11.e(r75, r77));
        i30 r82 = kx3.a(b.class);
        String r83 = r82.b();
        if (r83 == null) goto L184;
        this.n0 = (b) r81.l(r82, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r83));
        nc1 r84 = X();
        e75 r85 = r84.d();
        b75 r86 = gh0.r(r84);
        bq4 r87 = new bq4(r85, r86, b11.e(r84, r86));
        i30 r88 = kx3.a(vf2.class);
        String r89 = r88.b();
        if (r89 == null) goto L182;
        this.o0 = (vf2) r87.l(r88, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r89));
        nc1 r90 = X();
        e75 r91 = r90.d();
        b75 r92 = gh0.r(r90);
        bq4 r93 = new bq4(r91, r92, b11.e(r90, r92));
        i30 r94 = kx3.a(li3.class);
        String r95 = r94.b();
        if (r95 == null) goto L180;
        this.p0 = (li3) r93.l(r94, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r95));
        this.n0.e();
        this.l0.j.setOnLongClickListener(new yo1(this, r2));
        final int r96 = 4;
        this.l0.i.setOnClickListener(new go1(this, r96));
        final int r97 = 8;
        this.l0.d0.setOnLongClickListener(new yo1(this, r97));
        final int r98 = 9;
        this.l0.S.setOnLongClickListener(new yo1(this, r98));
        final int r99 = 10;
        this.l0.f.setOnLongClickListener(new yo1(this, r99));
        final int r100 = 5;
        this.l0.o0.setOnClickListener(new go1(this, r100));
        final int r110 = 6;
        this.l0.g0.setOnClickListener(new go1(this, r110));
        final int r111 = 7;
        this.l0.k0.setOnClickListener(new go1(this, r111));
        this.l0.U.setOnClickListener(new go1(this, r97));
        this.l0.Q.setOnClickListener(new go1(this, r98));
        final int r101 = 1;
        this.l0.X.setOnClickListener(new go1(this, r101));
        final int r102 = 2;
        this.l0.L.setOnClickListener(new go1(this, r102));
        this.l0.p0.setOnLongClickListener(new yo1(this, r101));
        this.l0.h0.setOnLongClickListener(new yo1(this, r102));
        final int r103 = 3;
        this.l0.l0.setOnLongClickListener(new yo1(this, r103));
        this.l0.Y.setOnLongClickListener(new yo1(this, r96));
        this.l0.M.setOnLongClickListener(new yo1(this, r100));
        this.l0.V.setOnLongClickListener(new yo1(this, r110));
        this.l0.b0.setOnLongClickListener(new yo1(this, r111));
        this.l0.k.setOnClickListener(new go1(this, r103));
        LinearLayout r104 = this.l0.q;
        final View r105 = LayoutInflater.from(r104.getContext()).inflate(R.layout.homemusic_home_mixes, r104, false);
        View r106 = r105.findViewById(R.id.homemusic_wave_card);
        r106.setOnClickListener(new AURAWaveToggleClickListener(new go1(this, r2)));
        r106.setOnTouchListener(new AURAWaveCircleTouchListener());
        AURAVersion.waveButton = r106;
        AURAWaveToggleClickListener.syncIcon(r106);
        AURAWavePlaybackListener.syncCurrent();
        r105.findViewById(R.id.homemusic_mix_card).setOnClickListener(new ho1(this, r105, r2));
        r105.findViewById(R.id.homemusic_mix_play).setOnClickListener(new ho1(this, r105, r101));
        ud3.E0(r105, null);
        this.H0 = r105;
        if (this.H0 == null) goto L179;
        LinearLayout r107 = this.l0.q;
        View r108 = this.H0;
        MaterialCardView r0 = this.l0.D;
        r107.addView(r108, 0);
        View r112 = r107.getRootView().findViewById(R.id.fragment_home_nested_scroll_view);
        if (r112 == null) goto L179;
        Drawable r113 = r112.getBackground();
        if ((r113 instanceof AnimationDrawable) == false) goto L179;
        ((AnimationDrawable) r113).start();
    L179:
        return r4;
    L180:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L182:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L184:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L186:
        nz2.n("Missing required view with ID: ".concat(r1.getResources().getResourceName(r3)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        AURAHomeAnimation.stop(this);
        this.R = true;
        this.l0 = null;
        this.H0 = null;
    }

    @Override // defpackage.kc1
    public final void P() {
        this.R = true;
        new Handler().postDelayed(new zo1(this, 7), 100);
        new Handler().postDelayed(new zo1(this, 2), 100);
        View r0 = this.H0;
        if (r0 == null) goto L6;
        io1.a.execute(new k6(26, this, r0));
    L6:
        ni4 r1 = this.v0;
        if (r1 == null) goto L9;
        r1.A = this.F0;
    L9:
        ni4 r2 = this.u0;
        if (r2 == null) goto L13;
        r2.A = this.F0;
        return;
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
        fi0 r8 = new fi0(new x7(r2));
        xc5 r0 = new xc5(4, r8);
    L7:
        b11.w(r7, new bj2(r2, r3, r4, r5, r6, r7, r0), new Handler(r6));
        this.F0 = r7;
        zd0 r1 = this.G0;
        if (r1 == null) goto L10;
        r1.s = r7;
    L10:
        bo2.j(r7, this.p0);
        this.p0.b.e(v(), new xo1(this, 17));
        this.p0.c.e(v(), new xo1(this, 18));
        this.p0.b.e(v(), new xo1(this, 0));
        this.p0.c.e(v(), new xo1(this, 2));
        return;
    L6:
        r0 = null;
        goto L7
    }

    @Override // defpackage.kc1
    public final void S() {
        sk2.Z0(this.F0);
        this.R = true;
    }

    @Override // defpackage.kc1
    public final void T(View r24, Bundle r25) {
        int r6 = 0;
        if (ud3.X() == false) goto L5;
        this.n0.c.getClass();
        xi4.s(-1, false, false).e(v(), new ap1(this, r6));
    L5:
        this.l0.G.setOnClickListener(new go1(this, 15));
        int r8 = 4;
        this.l0.I.setOnClickListener(new i4(r8, this));
        App.b().getClass();
        int r10 = 1;
        if (App.c().getBoolean("sync_starred_albums_for_offline_use", false) == false) goto L11;
        b r0 = this.n0;
        le1 r1 = v();
        k03 r3 = r0.r;
        if (r3.d() != null) goto L10;
        r0.d.getClass();
        rv2.o(20, true).e(r1, new g7(r3, 0));
    L10:
        r3.e(v(), new ap1(this, r10));
    L11:
        int r4 = 10;
        this.l0.y.setOnClickListener(new go1(this, r4));
        int r11 = 11;
        this.l0.A.setOnClickListener(new go1(this, r11));
        int r12 = 3;
        if (ud3.W() == false) goto L17;
        b r2 = this.n0;
        le1 r5 = v();
        k03 r7 = r2.s;
        if (r7.d() != null) goto L16;
        r2.e.y(20, true).e(r5, new g7(r7, 0));
    L16:
        r7.e(v(), new ap1(this, r12));
    L17:
        int r9 = 13;
        this.l0.C.setOnClickListener(new go1(this, r9));
        this.l0.E.setOnClickListener(new go1(this, 14));
        if (this.n0.d("HOME_SECTOR_DISCOVERY") == true) goto L24;
        RecyclerView r13 = this.l0.h;
        Z();
        r13.setLayoutManager(new LinearLayoutManager(0));
        this.l0.h.setHasFixedSize(true);
        vq0 r14 = new vq0(this);
        this.q0 = r14;
        this.l0.h.setAdapter(r14);
        b r15 = this.n0;
        le1 r16 = v();
        k03 r17 = r15.l;
        if (r17.d() != null) goto L23;
        r15.c.getClass();
        xi4.q(10, null, null).e(r16, r15.h(r17));
    L23:
        r17.e(v(), new xo1(this, 7));
    L24:
        int r18 = 8;
        if (this.n0.d("HOME_SECTOR_CONTINUE_LISTENING") == true) goto L33;
        RecyclerView r19 = this.l0.g;
        Z();
        r19.setLayoutManager(new LinearLayoutManager(0));
        this.l0.g.setHasFixedSize(true);
        bl2 r20 = this.F0;
        zd0 r21 = new zd0();
        r21.r = Collections.EMPTY_LIST;
        r21.s = r20;
        this.G0 = r21;
        this.l0.g.setAdapter(r21);
        List r22 = q40.K0(ud3.A().values(), new jb2(1));
        boolean r23 = r22.isEmpty();
        tc1 r26 = this.l0;
        if (r23 == false) goto L30;
        r26.m.setVisibility(8);
    L31:
        new vs3();
        zo1 r27 = new zo1(this, r12);
        rm3 r28 = App.f(false).b();
        r28.getClass();
        Log.d("BookmarksClient", "getBookmarks()");
        ((mt) r28.o).c(((pn4) r28.n).f()).enqueue(new rm2(r4, r27));
        goto L33
    L30:
        r26.m.setVisibility(0);
        zd0 r29 = this.G0;
        r29.r = r22;
        r29.d();
    L33:
        if (this.n0.d("HOME_SECTOR_MADE_FOR_YOU") == true) goto L40;
        RecyclerView r30 = this.l0.c0;
        Z();
        r30.setLayoutManager(new LinearLayoutManager(0));
        this.l0.c0.setHasFixedSize(true);
        s6 r31 = new s6(this);
        this.r0 = r31;
        this.l0.c0.setAdapter(r31);
        b r32 = this.n0;
        le1 r33 = v();
        k03 r34 = r32.n;
        if (r34.d() != null) goto L38;
        r32.c.getClass();
        xi4.s(10, true, true).e(r33, new g7(r34, 0));
    L38:
        r34.e(v(), new xo1(this, 9));
        new xg0(0).a(this.l0.c0);
    L40:
        if (this.n0.d("HOME_SECTOR_RADIO_STATION") == true) goto L47;
        RecyclerView r35 = this.l0.R;
        Z();
        r35.setLayoutManager(new LinearLayoutManager(0));
        this.l0.R.setHasFixedSize(true);
        vi r36 = new vi(this, Boolean.TRUE, Boolean.FALSE);
        this.s0 = r36;
        this.l0.R.setAdapter(r36);
        b r37 = this.n0;
        le1 r38 = v();
        k03 r39 = r37.o;
        if (r39.d() != null) goto L45;
        pa r40 = r37.e;
        r40.getClass();
        k03 r110 = new k03();
        App.f(false).a().s().enqueue(new r8(r40, r110, r10));
        r110.e(r38, new g7(r39, 0));
    L45:
        r39.e(v(), new xo1(this, r9));
        new xg0(0).a(this.l0.R);
    L47:
        if (this.n0.d("HOME_SECTOR_BEST_OF") == true) goto L54;
        RecyclerView r41 = this.l0.e;
        Z();
        r41.setLayoutManager(new LinearLayoutManager(0));
        this.l0.e.setHasFixedSize(true);
        vi r42 = new vi(this, Boolean.FALSE, Boolean.TRUE);
        this.t0 = r42;
        this.l0.e.setAdapter(r42);
        b r43 = this.n0;
        le1 r44 = v();
        k03 r45 = r43.p;
        if (r45.d() != null) goto L52;
        r43.e.y(20, true).e(r44, new g7(r45, 0));
    L52:
        r45.e(v(), new xo1(this, r4));
        new xg0(0).a(this.l0.e);
    L54:
        if (this.n0.d("HOME_SECTOR_STARRED_TRACKS") == true) goto L61;
        this.l0.m0.setHasFixedSize(true);
        ni4 r46 = new ni4(v(), this, true, false, null);
        this.u0 = r46;
        this.l0.m0.setAdapter(r46);
        ni4 r47 = this.u0;
        r47.A = this.F0;
        h0();
        b r48 = this.n0;
        le1 r49 = v();
        k03 r50 = r48.q;
        if (r50.d() != null) goto L59;
        r48.c.getClass();
        xi4.s(20, true, true).e(r49, new g7(r50, 0));
    L59:
        r50.e(v(), new xo1(this, r18));
        new xg0(1).a(this.l0.m0);
        this.l0.m0.i(new js0(r().getDimensionPixelSize(R.dimen.radius), r().getDimensionPixelSize(R.dimen.radius) * 4, r().getDimensionPixelSize(R.dimen.dots_height), Z().getResources().getColor(R.color.titleTextColor, null), Z().getResources().getColor(R.color.titleTextColor, null)));
    L61:
        if (this.n0.d("HOME_SECTOR_STARRED_ALBUMS") == true) goto L68;
        RecyclerView r51 = this.l0.e0;
        r51.getContext();
        r51.setLayoutManager(new LinearLayoutManager(0));
        r51.setHasFixedSize(true);
        float r52 = r51.getResources().getDisplayMetrics().density;
        r51.setPaddingRelative((int) (16.0f * r52), r51.getPaddingTop(), (int) (8.0f * r52), r51.getPaddingBottom());
        s6 r53 = new s6(this);
        r51.setAdapter(r53);
        new xg0(0).a(r51);
        this.w0 = r53;
        b r54 = this.n0;
        le1 r55 = v();
        k03 r56 = r54.r;
        if (r56.d() != null) goto L66;
        r54.d.getClass();
        rv2.o(20, true).e(r55, new g7(r56, 0));
    L66:
        r56.e(v(), new xo1(this, 22));
    L68:
        if (this.n0.d("HOME_SECTOR_STARRED_ARTISTS") == true) goto L75;
        this.l0.i0.setHasFixedSize(true);
        b8 r57 = new b8(this, 1);
        this.x0 = r57;
        this.l0.i0.setAdapter(r57);
        b r58 = this.n0;
        le1 r59 = v();
        k03 r60 = r58.s;
        if (r60.d() != null) goto L73;
        r58.e.y(20, true).e(r59, new g7(r60, 0));
    L73:
        r60.e(v(), new xo1(this, r10));
        new xg0(1).a(this.l0.i0);
        this.l0.i0.i(new js0(r().getDimensionPixelSize(R.dimen.radius), r().getDimensionPixelSize(R.dimen.radius) * 4, r().getDimensionPixelSize(R.dimen.dots_height), Z().getResources().getColor(R.color.titleTextColor, null), Z().getResources().getColor(R.color.titleTextColor, null)));
    L75:
        if (this.n0.d("HOME_SECTOR_MOST_PLAYED") == true) goto L82;
        RecyclerView r61 = this.l0.K;
        Z();
        r61.setLayoutManager(new LinearLayoutManager(0));
        this.l0.K.setHasFixedSize(true);
        s6 r62 = new s6(this);
        this.A0 = r62;
        this.l0.K.setAdapter(r62);
        b r63 = this.n0;
        le1 r64 = v();
        k03 r65 = r63.t;
        if (r65.d() != null) goto L80;
        r63.d.getClass();
        rv2.m("frequent", 20, null, null).e(r64, r63.h(r65));
    L80:
        r65.e(v(), new xo1(this, r8));
        new xg0(0).a(this.l0.K);
    L82:
        if (this.n0.d("HOME_SECTOR_LAST_PLAYED") == true) goto L89;
        RecyclerView r66 = this.l0.W;
        Z();
        r66.setLayoutManager(new LinearLayoutManager(0));
        this.l0.W.setHasFixedSize(true);
        s6 r67 = new s6(this);
        this.z0 = r67;
        this.l0.W.setAdapter(r67);
        b r68 = this.n0;
        le1 r69 = v();
        k03 r70 = r68.u;
        if (r70.d() != null) goto L87;
        r68.d.getClass();
        rv2.m("recent", 20, null, null).e(r69, r68.h(r70));
    L87:
        r70.e(v(), new xo1(this, r11));
        new xg0(0).a(this.l0.W);
    L89:
        if (this.n0.d("HOME_SECTOR_NEW_RELEASES") == true) goto L96;
        this.l0.N.setHasFixedSize(true);
        b8 r71 = new b8(this, 0);
        this.B0 = r71;
        this.l0.N.setAdapter(r71);
        b r72 = this.n0;
        le1 r73 = v();
        k03 r74 = r72.m;
        if (r74.d() != null) goto L94;
        r72.f(r73);
    L94:
        r74.e(v(), new xo1(this, 5));
        new xg0(1).a(this.l0.N);
        this.l0.N.i(new js0(r().getDimensionPixelSize(R.dimen.radius), r().getDimensionPixelSize(R.dimen.radius) * 4, r().getDimensionPixelSize(R.dimen.dots_height), Z().getResources().getColor(R.color.titleTextColor, null), Z().getResources().getColor(R.color.titleTextColor, null)));
    L96:
        if (this.n0.d("HOME_SECTOR_FLASHBACK") == true) goto L103;
        RecyclerView r75 = this.l0.r0;
        Z();
        r75.setLayoutManager(new LinearLayoutManager(0));
        this.l0.r0.setHasFixedSize(true);
        uc4 r76 = new uc4(this, 1);
        this.C0 = r76;
        this.l0.r0.setAdapter(r76);
        b r77 = this.n0;
        le1 r78 = v();
        k03 r79 = r77.v;
        if (r79.d() != null) goto L101;
        r77.d.n().e(r78, r77.h(r79));
    L101:
        r79.e(v(), new xo1(this, 16));
        new xg0(0).a(this.l0.r0);
    L103:
        if (this.n0.d("HOME_SECTOR_RECENTLY_ADDED") == true) goto L110;
        RecyclerView r80 = this.l0.T;
        Z();
        r80.setLayoutManager(new LinearLayoutManager(0));
        this.l0.T.setHasFixedSize(true);
        s6 r81 = new s6(this);
        this.y0 = r81;
        this.l0.T.setAdapter(r81);
        b r82 = this.n0;
        le1 r83 = v();
        k03 r84 = r82.w;
        if (r84.d() != null) goto L108;
        r82.d.getClass();
        rv2.m("newest", 20, null, null).e(r83, r82.h(r84));
    L108:
        r84.e(v(), new xo1(this, 15));
        new xg0(0).a(this.l0.T);
    L110:
        if (this.n0.d("HOME_SECTOR_TOP_SONGS") == true) goto L114;
        this.l0.q0.setHasFixedSize(true);
        ni4 r85 = new ni4(v(), this, true, false, null);
        this.v0 = r85;
        this.l0.q0.setAdapter(r85);
        ni4 r86 = this.v0;
        r86.A = this.F0;
        i0();
        b r87 = this.n0;
        le1 r88 = v();
        r87.getClass();
        Calendar r89 = Calendar.getInstance();
        String r210 = ud3.E();
        int r90 = r89.get(3);
        long r111 = r89.getTimeInMillis();
        r89.set(3, r90 - 1);
        long r112 = r89.getTimeInMillis();
        r20 r91 = (r20) r87.f.o;
        t24 r92 = ((s24) r91.o).i().a(new String[]{"chronology"}, new p20(r91, r112, r111, r210));
        k03 r93 = r87.x;
        Objects.requireNonNull(r93);
        r92.e(r88, new g7(r93, 0));
        r93.e(v(), new xo1(this, 14));
        new xg0(1).a(this.l0.q0);
        this.l0.q0.i(new js0(r().getDimensionPixelSize(R.dimen.radius), r().getDimensionPixelSize(R.dimen.radius) * 4, r().getDimensionPixelSize(R.dimen.dots_height), Z().getResources().getColor(R.color.titleTextColor, null), Z().getResources().getColor(R.color.titleTextColor, null)));
    L114:
        if (this.n0.d("HOME_SECTOR_PINNED_PLAYLISTS") == true) goto L117;
        this.l0.O.setHasFixedSize(true);
        ej r94 = new ej(this);
        this.D0 = r94;
        this.l0.O.setAdapter(r94);
        b r95 = this.n0;
        v();
        r95.B.e(v(), new xo1(this, 3));
        new xg0(1).a(this.l0.O);
        this.l0.O.i(new js0(r().getDimensionPixelSize(R.dimen.radius), r().getDimensionPixelSize(R.dimen.radius) * 4, r().getDimensionPixelSize(R.dimen.dots_height), Z().getResources().getColor(R.color.titleTextColor, null), Z().getResources().getColor(R.color.titleTextColor, null)));
    L117:
        int r96 = 12;
        if (this.n0.d("HOME_SECTOR_SHARED") == true) goto L127;
        this.l0.Z.setHasFixedSize(true);
        uc4 r97 = new uc4(this, 0);
        this.E0 = r97;
        this.l0.Z.setAdapter(r97);
        if (ud3.V() == false) goto L126;
        b r98 = this.n0;
        le1 r99 = v();
        k03 r100 = r98.C;
        if (r100.d() != null) goto L125;
        r98.i.getClass();
        hh3.m().e(r99, new g7(r100, 0));
    L125:
        r100.e(v(), new xo1(this, r96));
    L126:
        new xg0(1).a(this.l0.Z);
        this.l0.Z.i(new js0(r().getDimensionPixelSize(R.dimen.radius), r().getDimensionPixelSize(R.dimen.radius) * 4, r().getDimensionPixelSize(R.dimen.dots_height), Z().getResources().getColor(R.color.titleTextColor, null), Z().getResources().getColor(R.color.titleTextColor, null)));
    L127:
        new Handler().postDelayed(new zo1(this, r10), 5000);
        this.l0.w.setOnClickListener(new go1(this, r96));
        this.o0.d.e(v(), new xo1(this, 6));
        j0();
    }

    public final void h0() {
        if (this.u0 == null) goto L12;
        String r0 = (String) this.p0.b.d();
        Boolean r1 = (Boolean) this.p0.c.d();
        ni4 r2 = this.u0;
        if (r1 != null) goto L7;
    L9:
        boolean r3 = false;
    L10:
        r2.s(r0, r3);
        return;
    L7:
        if (r1.booleanValue() == false) goto L9;
        r3 = true;
        goto L10
    }

    public final void i0() {
        if (this.v0 == null) goto L12;
        String r0 = (String) this.p0.b.d();
        Boolean r1 = (Boolean) this.p0.c.d();
        ni4 r2 = this.v0;
        if (r1 != null) goto L7;
    L9:
        boolean r3 = false;
    L10:
        r2.s(r0, r3);
        return;
    L7:
        if (r1.booleanValue() == false) goto L9;
        r3 = true;
        goto L10
    }

    public final void j0() {
        tc1 r0 = this.l0;
        if (r0 != null) goto L5;
        return;
    L5:
        if (this.n0.D != null) goto L8;
        return;
    L8:
        if (this.I0 == true) goto L14;
        this.I0 = true;
        r0.q.post(new zo1(this, 0));
        return;
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onAlbumClick(Bundle r3) {
        gb.x(a0()).m(R.id.albumPageFragment, r3, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onAlbumLongClick(Bundle r3) {
        gb.x(a0()).m(R.id.albumBottomSheetDialog, r3, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onArtistClick(Bundle r5) {
        if (r5.containsKey("MEDIA_MIX") == false) goto L16;
        if (r5.getBoolean("MEDIA_MIX") == false) goto L16;
        ArtistID3 r6 = (ArtistID3) r5.getParcelable("ARTIST_OBJECT");
        if (r6 == null) goto L29;
        MainActivity r0 = this.m0;
        String r1 = r6.getId();
        k6 r2 = new k6(27, this, r6);
        WeakReference r4 = com.eddyizm.tempus.homemusic.b.a;
        r0.getClass();
        r1.getClass();
        if (cx.h() == true) goto L13;
        r2.run();
        return;
    L13:
        Map r7 = Collections.singletonMap("nd_artist_id", r1);
        r7.getClass();
        com.eddyizm.tempus.homemusic.b.l(r0, r7, r2, WaveOrigin.RADIO);
        return;
    L29:
        return;
    L16:
        if (r5.containsKey("MEDIA_BEST_OF") == true) goto L18;
    L26:
        gb.x(a0()).m(R.id.artistPageFragment, r5, null);
        return;
    L18:
        if (r5.getBoolean("MEDIA_BEST_OF") == false) goto L26;
        ArtistID3 r8 = (ArtistID3) r5.getParcelable("ARTIST_OBJECT");
        if (r8 != null) goto L23;
        return;
    L23:
        if (this.F0 == null) goto L28;
        b r3 = this.n0;
        r3.getClass();
        k03 r9 = new k03();
        pa r10 = r3.e;
        String r11 = r8.getName();
        r10.getClass();
        pa.z(10, r11).f(new np1(r3, r9, r8));
        r9.e(v(), new xo1(this, 19));
        return;
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onArtistLongClick(Bundle r3) {
        gb.x(a0()).m(R.id.artistBottomSheetDialog, r3, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMediaClick(Bundle r8) {
        if (r8.containsKey("MEDIA_MIX") == false) goto L8;
        Child r9 = (Child) r8.getParcelable("TRACK_OBJECT");
        ((au) this.m0.V.n).d(true);
        if (this.F0 == null) goto L11;
        Toast.makeText(Z(), R.string.bottom_sheet_generating_instant_mix, 0).show();
        b r2 = this.n0;
        le1 r3 = v();
        k03 r4 = r2.y;
        r4.k(Collections.EMPTY_LIST);
        r2.c.o(r9.getId(), fb0.p, 20).e(r3, new g7(r4, 0));
        r4.e(v(), new f7(2, this, new boolean[]{false}));
    L11:
        this.v0.d();
        this.u0.d();
        return;
    L8:
        if (r8.containsKey("MEDIA_CHRONOLOGY") == false) goto L10;
        bo2.o(this.F0, r8.getParcelableArrayList("TRACKS_OBJECT"), r8.getInt("ITEM_POSITION"));
        ((au) this.m0.V.n).d(true);
        goto L11
    L10:
        bo2.o(this.F0, r8.getParcelableArrayList("TRACKS_OBJECT"), r8.getInt("ITEM_POSITION"));
        ((au) this.m0.V.n).d(true);
        goto L11
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMediaLongClick(Bundle r3) {
        gb.x(a0()).m(R.id.songBottomSheetDialog, r3, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPlaylistClick(Bundle r3) {
        gb.x(a0()).m(R.id.playlistPageFragment, r3, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPlaylistLongClick(Bundle r3) {
        gb.x(a0()).m(R.id.playlistRowBottomSheetDialog, r3, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onShareClick(Bundle r3) {
        g0(new Intent("android.intent.action.VIEW", Uri.parse(((Share) r3.getParcelable("share_object")).getUrl())).setFlags(268435456));
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onShareLongClick(Bundle r3) {
        gb.x(a0()).m(R.id.shareBottomSheetDialog, r3, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onYearClick(Bundle r3) {
        gb.x(a0()).m(R.id.songListPageFragment, r3, null);
    }
}
