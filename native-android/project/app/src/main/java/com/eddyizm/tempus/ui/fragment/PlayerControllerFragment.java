package com.eddyizm.tempus.ui.fragment;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.PlayerControlView;
import androidx.viewpager2.widget.ViewPager2;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.WaveOrigin;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import defpackage.a52;
import defpackage.aj2;
import defpackage.aj3;
import defpackage.b11;
import defpackage.b75;
import defpackage.bj2;
import defpackage.bk3;
import defpackage.bl2;
import defpackage.bq4;
import defpackage.cb4;
import defpackage.cg4;
import defpackage.d7;
import defpackage.do2;
import defpackage.e03;
import defpackage.e75;
import defpackage.et1;
import defpackage.f35;
import defpackage.fi0;
import defpackage.ft1;
import defpackage.fu;
import defpackage.g12;
import defpackage.gh0;
import defpackage.gq0;
import defpackage.gt1;
import defpackage.ht1;
import defpackage.i30;
import defpackage.i61;
import defpackage.i8;
import defpackage.ik;
import defpackage.iw4;
import defpackage.ix4;
import defpackage.j51;
import defpackage.j8;
import defpackage.k03;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.kx4;
import defpackage.l93;
import defpackage.le1;
import defpackage.nc1;
import defpackage.nz2;
import defpackage.ot1;
import defpackage.pu3;
import defpackage.q80;
import defpackage.qa1;
import defpackage.qh3;
import defpackage.rj3;
import defpackage.si0;
import defpackage.sj3;
import defpackage.sk2;
import defpackage.tb1;
import defpackage.tj3;
import defpackage.u52;
import defpackage.ud3;
import defpackage.uj3;
import defpackage.uo;
import defpackage.v00;
import defpackage.v52;
import defpackage.vw1;
import defpackage.wj3;
import defpackage.x7;
import defpackage.xa3;
import defpackage.xc5;
import defpackage.y11;
import defpackage.yf4;
import defpackage.yj3;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class PlayerControllerFragment extends kc1 {
    public ImageButton A0;
    public ImageButton B0;
    public ImageButton C0;
    public LinearLayout D0;
    public ImageButton E0;
    public TextView F0;
    public ChipGroup G0;
    public Chip H0;
    public Chip I0;
    public Chip J0;
    public MainActivity K0;
    public aj3 L0;
    public bl2 M0;
    public boolean N0;
    public final y11 O0;
    public i61 l0;
    public a52 m0;
    public boolean n0;
    public ViewPager2 o0;
    public ToggleButton p0;
    public ImageButton q0;
    public pu3 r0;
    public RatingBar s0;
    public TextView t0;
    public TextView u0;
    public Button v0;
    public ToggleButton w0;
    public Chip x0;
    public TextView y0;
    public ConstraintLayout z0;

    public PlayerControllerFragment() {
        this.N0 = false;
        this.O0 = new y11(1, this);
    }

    public static void j0(Chip r1) {
        if (r1 != null) goto L4;
        return;
    L4:
        r1.setVisibility(8);
        r1.setText("");
        r1.setOnClickListener(null);
        r1.setOnLongClickListener(null);
    }

    public static qh3 l0(float r3) {
        float r2 = 1.0f;
        if (xa3.u("playback_speed_pitch", false) == false) goto L9;
        if (xa3.u("playback_speed_manual_pitch", false) == false) goto L7;
        App.b().getClass();
        r2 = App.c().getFloat("playback_speed_manual_pitch_value", 1.0f);
        goto L9
    L7:
        r2 = r3;
    L9:
        return new qh3(r3, r2);
    }

    public static void s0(TextView r1, String r2) {
        if (TextUtils.equals(r1.getText(), r2) == true) goto L6;
        r1.setText(r2);
        return;
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r17, ViewGroup r18, Bundle r19) {
        this.K0 = (MainActivity) l();
        final int r2 = 0;
        View r1 = r17.inflate(R.layout.inner_fragment_player_controller, r18, false);
        int r3 = R.id.now_playing_media_controller_view;
        PlayerControlView r7 = (PlayerControlView) uo.s(r1, R.id.now_playing_media_controller_view);
        if (r7 == null) goto L36;
        r3 = R.id.player_remote_toggle;
        MaterialButton r8 = (MaterialButton) uo.s(r1, R.id.player_remote_toggle);
        if (r8 == null) goto L36;
        LinearLayout r6 = (LinearLayout) r1;
        this.l0 = new i61(r6, r7, r8, false, 6);
        nc1 r4 = X();
        e75 r5 = r4.d();
        b75 r9 = gh0.r(r4);
        bq4 r10 = new bq4(r5, r9, b11.e(r4, r9));
        i30 r11 = kx3.a(aj3.class);
        String r12 = r11.b();
        if (r12 == null) goto L34;
        this.L0 = (aj3) r10.l(r11, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r12));
        nc1 r13 = X();
        e75 r14 = r13.d();
        b75 r15 = gh0.r(r13);
        bq4 r16 = new bq4(r14, r15, b11.e(r13, r15));
        i30 r20 = kx3.a(pu3.class);
        String r21 = r20.b();
        if (r21 == null) goto L32;
        this.r0 = (pu3) r16.l(r20, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r21));
        this.o0 = (ViewPager2) ((LinearLayout) this.l0.o).findViewById(R.id.player_media_cover_view_pager);
        ToggleButton r22 = (ToggleButton) ((LinearLayout) this.l0.o).findViewById(R.id.button_favorite);
        this.p0 = r22;
        ot1.f(r22, new wj3(this, r2));
        this.q0 = (ImageButton) ((LinearLayout) this.l0.o).findViewById(R.id.player_overflow_button);
        this.t0 = (TextView) ((LinearLayout) this.l0.o).findViewById(R.id.player_media_title_label);
        this.u0 = (TextView) ((LinearLayout) this.l0.o).findViewById(R.id.player_artist_name_label);
        this.v0 = (Button) ((LinearLayout) this.l0.o).findViewById(R.id.player_playback_speed_button);
        this.w0 = (ToggleButton) ((LinearLayout) this.l0.o).findViewById(R.id.player_skip_silence_toggle_button);
        this.x0 = (Chip) ((LinearLayout) this.l0.o).findViewById(R.id.player_media_extension);
        this.y0 = (TextView) ((LinearLayout) this.l0.o).findViewById(R.id.player_media_bitrate);
        this.z0 = (ConstraintLayout) ((LinearLayout) this.l0.o).findViewById(R.id.player_quick_action_view);
        this.A0 = (ImageButton) ((LinearLayout) this.l0.o).findViewById(R.id.player_open_queue_button);
        this.B0 = (ImageButton) ((LinearLayout) this.l0.o).findViewById(R.id.player_open_lyrics_button);
        this.C0 = (ImageButton) ((LinearLayout) this.l0.o).findViewById(R.id.player_info_track);
        this.s0 = (RatingBar) ((LinearLayout) this.l0.o).findViewById(R.id.song_rating_bar);
        this.D0 = (LinearLayout) ((LinearLayout) this.l0.o).findViewById(R.id.rating_container);
        this.G0 = (ChipGroup) ((LinearLayout) this.l0.o).findViewById(R.id.asset_link_chip_group);
        this.H0 = (Chip) ((LinearLayout) this.l0.o).findViewById(R.id.asset_link_song_chip);
        this.I0 = (Chip) ((LinearLayout) this.l0.o).findViewById(R.id.asset_link_album_chip);
        this.J0 = (Chip) ((LinearLayout) this.l0.o).findViewById(R.id.asset_link_artist_chip);
        LinearLayout r23 = (LinearLayout) ((LinearLayout) this.l0.o).findViewById(R.id.player_sleep_timer_container);
        this.E0 = (ImageButton) ((LinearLayout) this.l0.o).findViewById(R.id.player_sleep_timer_button);
        this.F0 = (TextView) ((LinearLayout) this.l0.o).findViewById(R.id.player_sleep_timer_label);
        DefaultTimeBar r24 = (DefaultTimeBar) ((LinearLayout) this.l0.o).findViewById(R.id.exo_progress);
        r24.getClass();
        int r25 = g12.t(r24, R.attr.colorOnPrimaryContainer);
        int r26 = g12.t(r24, R.attr.colorPrimaryContainer);
        r24.setBufferedColor(j51.k(r26, r25, 0) | ((j51.k(r26, r25, 16) | (-16777216)) | j51.k(r26, r25, 8)));
        le1 r27 = v();
        LinearLayout r110 = (LinearLayout) this.l0.o;
        k03 r28 = this.L0.n;
        d7 r29 = new d7(5, this);
        wj3 r111 = new wj3(this, 1);
        TextView r112 = this.u0;
        r110.getClass();
        r28.getClass();
        View r113 = r110.findViewById(R.id.player_smart_rec_row);
        TextView r114 = (TextView) r110.findViewById(R.id.player_smart_rec_label);
        ImageButton r115 = (ImageButton) r110.findViewById(R.id.player_smart_rec_add);
        ImageButton r30 = (ImageButton) r110.findViewById(R.id.player_smart_rec_hide);
        ImageButton r31 = (ImageButton) r110.findViewById(R.id.exo_shuffle);
        if (r31 == null) goto L13;
        r31.setOnClickListener(new j8(13, r110, r111));
    L13:
        if (r115 == null) goto L15;
        r115.setOnClickListener(new et1(r28, r29, r110, r2));
    L15:
        if (r30 == null) goto L17;
        r30.setOnClickListener(new j8(14, r28, r110));
    L17:
        final ft1 r32 = new ft1(r28, r110, r113, r114, r115, r112, r111);
        r28.e(r27, new ht1(new gt1(r32, r2), 0));
        final int r33 = 1;
        a.f.e(r27, new ht1(new gt1(r32, r33), 0));
        if (this.D0 != null) goto L20;
    L19:
        int r34 = 8;
    L24:
        this.m0 = new a52(Looper.getMainLooper());
        final int r35 = 3;
        u52.b.e(v(), new uj3(this, r35));
        final int r36 = 4;
        u52.c.e(v(), new uj3(this, r36));
        ((MaterialButton) this.l0.q).setOnClickListener(new rj3(this, 5));
        ImageButton r37 = this.q0;
        if (r37 == null) goto L27;
        r37.setOnClickListener(new rj3(this, r36));
    L27:
        ConstraintLayout r38 = this.z0;
        if (xa3.u("quick_action_visible", true) == false) goto L30;
        r34 = 0;
    L30:
        r38.setVisibility(r34);
        final int r39 = 2;
        this.A0.setOnClickListener(new rj3(this, r39));
        this.B0.setOnClickListener(new rj3(this, r35));
        this.o0.setOrientation(0);
        this.o0.setAdapter(new bk3(m(), this.c0));
        this.o0.setUserInputEnabled(false);
        ViewPager2 r40 = this.o0;
        ((ArrayList) r40.p.b).add(new q80(r35, this));
        final int r41 = 1;
        this.L0.n.e(v(), new uj3(this, r41));
        this.L0.o.e(v(), new uj3(this, r2));
        this.L0.p.e(v(), new uj3(this, r39));
        x0();
        return r6;
    L20:
        boolean r42 = xa3.u("song_rating_per_item", false);
        LinearLayout r43 = this.D0;
        if (r42 == false) goto L23;
        r43.setVisibility(0);
        goto L19
    L23:
        r34 = 8;
        r43.setVisibility(8);
        goto L24
    L32:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L34:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L36:
        nz2.n("Missing required view with ID: ".concat(r1.getResources().getResourceName(r3)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        i61 r0 = this.l0;
        if (r0 == null) goto L5;
        ((PlayerControlView) r0.p).setPlayer(null);
    L5:
        a52 r1 = this.m0;
        if (r1 == null) goto L8;
        r1.A1();
    L8:
        this.m0 = null;
        this.l0 = null;
    }

    @Override // defpackage.kc1
    public final void O() {
        this.R = true;
        if (this.N0 == false) goto L6;
        X().unbindService(this.O0);
        this.N0 = false;
        return;
    }

    @Override // defpackage.kc1
    public final void P() {
        this.R = true;
        Intent r1 = new Intent(X(), MediaService.class);
        r1.setAction("com.eddyizm.tempus.service.BIND_EQUALIZER");
        X().bindService(r1, this.O0, 1);
        this.N0 = true;
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
        this.M0 = r7;
        r7.f(new qa1(27, this), gq0.n);
        return;
    L6:
        r0 = null;
        goto L7
    }

    @Override // defpackage.kc1
    public final void S() {
        yf4.c().h = null;
        sk2.Z0(this.M0);
        this.R = true;
    }

    public final ik h0(Chip r6, String r7, String r8) {
        if (r6 != null) goto L6;
        return null;
    L6:
        if (TextUtils.isEmpty(r8) == false) goto L9;
        j0(r6);
        return null;
    L9:
        int r2 = 1;
        byte r4 = -1;
        switch(r7.hashCode()) {
            case -1409097913: goto L33;
            case 3536149: goto L29;
            case 3704893: goto L25;
            case 92896879: goto L21;
            case 98240899: goto L17;
            case 1879474642: goto L13;
            default: goto L36;
        };
    L36:
        switch(r4) {
            case 0: goto L43;
            case 1: goto L42;
            case 2: goto L41;
            case 3: goto L40;
            case 4: goto L39;
            case 5: goto L38;
            default: goto L37;
        };
    L37:
        int r1 = R.string.asset_link_label_unknown;
    L44:
        String r3 = s(r1);
        ik r9 = l93.h(r7, r8);
        if (r9 != null) goto L48;
        j0(r6);
        return null;
    L48:
        r6.setText(t(R.string.asset_link_chip_text, new Object[]{r3, r9.d}));
        r6.setVisibility(0);
        r6.setOnClickListener(new tj3(this, r9, r2));
        r6.setOnLongClickListener(new yj3(this, r9, r8, 0));
        return r9;
    L38:
        r1 = R.string.asset_link_label_playlist;
        goto L44
    L39:
        r1 = R.string.asset_link_label_genre;
        goto L44
    L40:
        r1 = R.string.asset_link_label_album;
        goto L44
    L41:
        r1 = R.string.asset_link_label_year;
        goto L44
    L42:
        r1 = R.string.asset_link_label_song;
        goto L44
    L43:
        r1 = R.string.asset_link_label_artist;
        goto L44
    L13:
        if (r7.equals("playlist") == false) goto L36;
        r4 = 5;
        goto L36
    L17:
        if (r7.equals("genre") == false) goto L36;
        r4 = 4;
        goto L36
    L21:
        if (r7.equals("album") == false) goto L36;
        r4 = 3;
        goto L36
    L25:
        if (r7.equals("year") == false) goto L36;
        r4 = 2;
        goto L36
    L29:
        if (r7.equals("song") == false) goto L36;
        r4 = 1;
        goto L36
    L33:
        if (r7.equals("artist") == false) goto L36;
        r4 = 0;
        goto L36
    }

    public final void i0(View r3, ik r4) {
        if (r3 != null) goto L4;
        return;
    L4:
        int r0 = 0;
        if (r4 != null) goto L8;
        l93.p(r3);
        r3.setOnClickListener(null);
        r3.setOnLongClickListener(null);
        r3.setClickable(false);
        r3.setLongClickable(false);
        return;
    L8:
        r3.setClickable(true);
        r3.setLongClickable(true);
        l93.g(r3);
        r3.setOnClickListener(new tj3(this, r4, r0));
        r3.setOnLongClickListener(new i8(3, this, r4));
    }

    public final bj2 k0() {
        bl2 r0 = this.M0;
        if (r0 != null) goto L5;
    L11:
        return null;
    L5:
        if (r0.isDone() == false) goto L11;
        return (bj2) this.M0.get();
    L9:
        e = move-exception;
        Log.e("PlayerCoverFragment", "Unable to resolve media browser", e);
        goto L11
    }

    public final void m0() {
        if (this.l0 != null) goto L5;
        return;
    L5:
        if (this.m0 != null) goto L8;
        return;
    L8:
        if (u52.c().a == false) goto L28;
        a52 r0 = this.m0;
        r0.F1();
        if (r0.f.isEmpty() == true) goto L12;
    L15:
        ((PlayerControlView) this.l0.p).setPlayer(this.m0);
        v52 r1 = u52.c();
        String r3 = r1.c;
        ((MaterialButton) this.l0.q).setText(t(R.string.lan_operating_on, new Object[]{r3}));
        ((MaterialButton) this.l0.q).setContentDescription(t(R.string.lan_controlling, new Object[]{r3}));
        ((MaterialButton) this.l0.q).setSelected(true);
        ((PlayerControlView) this.l0.p).setShowShuffleButton(true);
        ((PlayerControlView) this.l0.p).setRepeatToggleModes(3);
        ((PlayerControlView) this.l0.p).setShowRewindButton(false);
        ((PlayerControlView) this.l0.p).setShowFastForwardButton(false);
        ((PlayerControlView) this.l0.p).setShowPreviousButton(true);
        ((PlayerControlView) this.l0.p).setShowNextButton(true);
        this.v0.setVisibility(0);
        this.w0.setVisibility(8);
        this.p0.setVisibility(0);
        Child r4 = (Child) this.L0.n.d();
        ToggleButton r5 = this.p0;
        if (r4 != null) goto L18;
    L20:
        boolean r6 = false;
    L21:
        r5.setEnabled(r6);
        this.n0 = true;
        do2 r2 = si0.E(u52.d());     // Catch: Throwable -> L25
        q0(r2);     // Catch: Throwable -> L25
        p0(r2);     // Catch: Throwable -> L25
        this.v0.setText(t(R.string.player_playback_speed, new Object[]{Float.valueOf(r1.y)}));     // Catch: Throwable -> L25
        x0();     // Catch: Throwable -> L25
        this.n0 = false;
        return;
    L25:
        th = move-exception;
        this.n0 = false;
        throw th;
    L18:
        if (Objects.equals(r4.getId(), r1.x) == false) goto L20;
        r6 = true;
        goto L21
    L12:
        if (r0.i == true) goto L15;
        r0.D1(r0.i1(), false, false);
        goto L15
    L28:
        ((MaterialButton) this.l0.q).setText(R.string.lan_play_on);
        ((MaterialButton) this.l0.q).setContentDescription(s(R.string.lan_play_on));
        ((MaterialButton) this.l0.q).setSelected(false);
        this.p0.setEnabled(true);
        bj2 r7 = k0();
        if (r7 == null) goto L35;
        ((PlayerControlView) this.l0.p).setPlayer(r7);
        n0(r7);
        q0(r7.K0());
        p0(r7.K0());
        return;
    }

    public final void n0(bj2 r11) {
        if (this.l0 != null) goto L5;
        return;
    L5:
        if (u52.c().a == true) goto L29;
        this.v0.setOnClickListener(new rj3(this, 6));
        this.w0.setOnClickListener(new rj3(this, 7));
        if (r11.K0().I == null) goto L28;
        String r0 = r11.K0().I.getString("type", "music");
        int r1 = r0.hashCode();
        if (r1 == (-405568764)) goto L22;
        if (r1 != 104263205) goto L14;
        r0.equals("music");
    L25:
        ((PlayerControlView) this.l0.p).setShowShuffleButton(true);
        ((PlayerControlView) this.l0.p).setShowRewindButton(false);
        ((PlayerControlView) this.l0.p).setShowPreviousButton(true);
        ((PlayerControlView) this.l0.p).setShowNextButton(true);
        ((PlayerControlView) this.l0.p).setShowFastForwardButton(false);
        ((PlayerControlView) this.l0.p).setRepeatToggleModes(3);
        ((LinearLayout) this.l0.o).findViewById(R.id.player_playback_speed_button).setVisibility(0);
        ((LinearLayout) this.l0.o).findViewById(R.id.player_skip_silence_toggle_button).setVisibility(8);
        ((LinearLayout) this.l0.o).findViewById(R.id.button_favorite).setVisibility(0);
        r0(r11);
        return;
    L14:
        if (r1 != 108270587) goto L25;
        if (r0.equals(WaveOrigin.RADIO) == false) goto L25;
        ((PlayerControlView) this.l0.p).setShowShuffleButton(false);
        ((PlayerControlView) this.l0.p).setShowRewindButton(false);
        ((PlayerControlView) this.l0.p).setShowPreviousButton(false);
        ((PlayerControlView) this.l0.p).setShowNextButton(false);
        ((PlayerControlView) this.l0.p).setShowFastForwardButton(false);
        ((PlayerControlView) this.l0.p).setRepeatToggleModes(0);
        ((LinearLayout) this.l0.o).findViewById(R.id.player_playback_speed_button).setVisibility(8);
        ((LinearLayout) this.l0.o).findViewById(R.id.player_skip_silence_toggle_button).setVisibility(8);
        ((LinearLayout) this.l0.o).findViewById(R.id.button_favorite).setVisibility(8);
        r0(r11);
        return;
    L22:
        if (r0.equals("podcast") == false) goto L25;
        ((PlayerControlView) this.l0.p).setShowShuffleButton(false);
        ((PlayerControlView) this.l0.p).setShowRewindButton(true);
        ((PlayerControlView) this.l0.p).setShowPreviousButton(false);
        ((PlayerControlView) this.l0.p).setShowNextButton(false);
        ((PlayerControlView) this.l0.p).setShowFastForwardButton(true);
        ((PlayerControlView) this.l0.p).setRepeatToggleModes(0);
        ((LinearLayout) this.l0.o).findViewById(R.id.player_playback_speed_button).setVisibility(0);
        ((LinearLayout) this.l0.o).findViewById(R.id.player_skip_silence_toggle_button).setVisibility(0);
        ((LinearLayout) this.l0.o).findViewById(R.id.button_favorite).setVisibility(8);
        r0(r11);
        return;
    L28:
        return;
    }

    public final void o0() {
        if (u52.c().a == false) goto L6;
        return;
    L6:
        if (this.x0 == null) goto L190;
        bj2 r0 = k0();
        if (e03.m(r0) == true) goto L191;
        String r1 = null;
        boolean r2 = true;
        int r3 = 0;
        if (r0 != null) goto L14;
        tb1 r5 = null;
    L29:
        if (r5 == null) goto L192;
        String r4 = r5.n;
        int r6 = r5.j;
        boolean r7 = "upnp".equals(r5.a);
        if (r7 == false) goto L37;
        if ("audio/x-unknown".equals(r4) == false) goto L37;
        return;
    L37:
        if (r4 != null) goto L39;
        String r8 = null;
    L84:
        if (r7 == false) goto L86;
        r1 = e03.p(r0.K0().I);
    L92:
        if (r8 != null) goto L94;
    L102:
        r2 = false;
    L139:
        if (r8 == null) goto L147;
        if (r8.isEmpty() == true) goto L147;
        Chip r9 = this.x0;
        if (r2 == false) goto L145;
        StringBuilder r10 = b11.s(r8, " (");
        r10.append(s(R.string.player_transcoding));
        r10.append(")");
        r8 = r10.toString();
    L145:
        r9.setText(r8);
    L147:
        if (Objects.equals(r0.K0().I.getString("type"), WaveOrigin.RADIO) == false) goto L154;
        this.y0.setText((r6 / 1000) + "kbps");
        TextView r15 = this.y0;
        if (ud3.l() == true) goto L152;
        r3 = 8;
    L152:
        r15.setVisibility(r3);
        return;
    L154:
        if (r6 == (-1)) goto L163;
        if (r6 <= 0) goto L163;
        if (r2 == false) goto L187;
        this.y0.setText((r6 / 1000) + "kbps");
        TextView r16 = this.y0;
        if (ud3.l() == true) goto L161;
        r3 = 8;
    L161:
        r16.setVisibility(r3);
        return;
    L187:
        return;
    L163:
        if (r2 == false) goto L188;
        int r11 = e03.d();
        String r12 = e03.b(r11, e03.q(r11));
        boolean r13 = r12.equals("0");
        TextView r14 = this.y0;
        if (r13 == true) goto L172;
        r14.setText(r12.concat("kbps"));
        TextView r17 = this.y0;
        if (ud3.l() == true) goto L170;
        r3 = 8;
    L170:
        r17.setVisibility(r3);
        return;
    L172:
        r14.setVisibility(8);
        return;
    L188:
        return;
    L94:
        if (r8.isEmpty() == true) goto L102;
        if (r1 == null) goto L102;
        if (r1.isEmpty() == true) goto L102;
        if (r8.equalsIgnoreCase(r1) == true) goto L102;
        String r18 = r1.toLowerCase();
        r18.getClass();
        switch(r18.hashCode()) {
            case 106458: goto L123;
            case 106459: goto L119;
            case 108273: goto L115;
            case 109961: goto L111;
            case 109967: goto L107;
            default: goto L105;
        };
    L105:
        byte r19 = -1;
    L126:
        switch(r19) {
            case 0: goto L136;
            case 1: goto L136;
            case 2: goto L136;
            case 3: goto L129;
            case 4: goto L129;
            default: goto L139;
        };
    L129:
        if (r8.equals("vorbis") == true) goto L102;
        if (r8.equals("opus") == true) goto L102;
        if (r8.equals("flac") == true) goto L102;
    L136:
        if (r8.equals("aac") == true) goto L102;
        if (r8.equals("alac") == true) goto L102;
    L107:
        if (r18.equals("ogg") == false) goto L182;
        r19 = 4;
        goto L126
    L182:
        r19 = -1;
        goto L126
    L111:
        if (r18.equals("oga") == false) goto L183;
        r19 = 3;
        goto L126
    L183:
        r19 = -1;
        goto L126
    L115:
        if (r18.equals("mp4") == false) goto L184;
        r19 = 2;
        goto L126
    L184:
        r19 = -1;
        goto L126
    L119:
        if (r18.equals("m4b") == false) goto L185;
        r19 = 1;
        goto L126
    L185:
        r19 = -1;
        goto L126
    L123:
        if (r18.equals("m4a") == false) goto L186;
        r19 = 0;
        goto L126
    L186:
        r19 = -1;
        goto L126
    L86:
        if (r0 == null) goto L92;
        if (r0.K0().I == null) goto L92;
        r1 = r0.K0().I.getString("suffix", null);
        goto L92
    L39:
        r8 = r4.toLowerCase();
        if (r8.contains("flac") == false) goto L43;
        r8 = "flac";
        goto L84
    L43:
        if (r8.contains("opus") == false) goto L46;
        r8 = "opus";
        goto L84
    L46:
        if (r8.contains("vorbis") == false) goto L49;
        r8 = "vorbis";
        goto L84
    L49:
        if (r8.contains("mp4a") == false) goto L51;
    L83:
        r8 = "aac";
        goto L84
    L51:
        if (r8.contains("aac") == true) goto L83;
        String r110 = "mp3";
        if (r8.contains("mpeg") == false) goto L56;
    L82:
        r8 = r110;
        goto L84
    L56:
        if (r8.contains("mp3") == true) goto L82;
        if (r8.contains("alac") == false) goto L61;
        r8 = "alac";
        goto L84
    L61:
        String r111 = "eac3";
        if (r8.contains("eac3") == false) goto L64;
    L63:
        r8 = r111;
        goto L84
    L64:
        r111 = "ac3";
        if (r8.contains("ac3") == true) goto L63;
        r110 = "wav";
        if (r8.contains("pcm") == true) goto L82;
        if (r8.contains("raw") == true) goto L82;
        if (r8.contains("wav") == true) goto L82;
        if (r8.contains("ogg") == false) goto L77;
        r8 = "ogg";
        goto L84
    L77:
        int r112 = r8.indexOf(47);
        if (r112 < 0) goto L84;
        if (r112 >= (r8.length() - 1)) goto L84;
        r8 = r8.substring(r112 + 1);
        goto L84
    L192:
        return;
    L14:
        vw1 r20 = r0.e0().a.m(0);
        r5 = null;
    L16:
        if (r20.hasNext() == false) goto L29;
        iw4 r21 = (iw4) r20.next();
        if (r21.b.c != 1) goto L16;
        int r22 = 0;
    L22:
        if (r22 >= r21.a) goto L16;
        if (r21.e[r22] == true) goto L25;
        if (r5 != null) goto L28;
        r5 = r21.a(r22);
    L28:
        r22 = r22 + 1;
        goto L22
    L25:
        r5 = r21.a(r22);
        goto L29
    L191:
        return;
    }

    public final void p0(do2 r18) {
        if (this.l0 != null) goto L5;
        return;
    L5:
        if (u52.c().a == true) goto L7;
    L9:
        final int r3 = 1;
        final int r4 = 0;
        if (u52.c().a == false) goto L12;
    L14:
        boolean r2 = false;
    L15:
        Bundle r5 = r18.I;
        if (r5 == null) goto L45;
        String r6 = r5.getString("suffix", s(R.string.player_unknown_format));
        int r7 = r5.getInt("bitrate", 0);
        if (r7 == 0) goto L20;
        String r8 = r7 + "kbps";
    L21:
        String r11 = "";
        if (r5.getInt("samplingRate", 0) == 0) goto L24;
        String r9 = new DecimalFormat("0.#").format(((double) r5.getInt("samplingRate", 0)) / 1000.0d) + "kHz";
    L26:
        if (r5.getInt("bitDepth", 0) == 0) goto L28;
        r11 = r5.getInt("bitDepth", 0) + "b";
    L28:
        this.x0.setText(r6);
        int r10 = 8;
        if (r8.equals("Original") == false) goto L32;
        if (r2 == true) goto L32;
        this.y0.setVisibility(8);
    L32:
        ArrayList r12 = new ArrayList();
        if (r8.trim().isEmpty() == true) goto L36;
        r12.add(r8);
    L36:
        if (r11.trim().isEmpty() == true) goto L39;
        r12.add(r11);
    L39:
        if (r9.trim().isEmpty() == true) goto L41;
        r12.add(r9);
    L41:
        String r13 = TextUtils.join(" • ", r12);
        TextView r14 = this.y0;
        if (ud3.l() == false) goto L44;
        r10 = 0;
    L44:
        r14.setVisibility(r10);
        this.y0.setText(r13);
        goto L45
    L24:
        r9 = "";
        goto L26
    L20:
        r8 = "Original";
    L45:
        if (r2 == true) goto L47;
        o0();
    L47:
        this.C0.setOnClickListener(new j8(19, this, r18));
        this.x0.setOnClickListener(new rj3(this, r4));
        this.x0.setOnLongClickListener(new sj3(this, r4));
        this.y0.setOnClickListener(new rj3(this, r3));
        this.y0.setOnLongClickListener(new sj3(this, r3));
        return;
    L12:
        if (e03.m(k0()) == false) goto L14;
        r2 = true;
        goto L15
    L7:
        if (this.n0 == true) goto L9;
    }

    public final void q0(do2 r15) {
        if (this.l0 != null) goto L5;
        return;
    L5:
        if (u52.c().a == true) goto L7;
    L9:
        Bundle r0 = r15.I;
        Integer r1 = r15.n;
        CharSequence r2 = r15.a;
        CharSequence r3 = r15.b;
        String r4 = null;
        if (r0 == null) goto L12;
        String r6 = r0.getString("type");
    L13:
        int r8 = 8;
        String r11 = "";
        if (Objects.equals(r6, WaveOrigin.RADIO) == false) goto L49;
        if (r0 == null) goto L20;
        if (r3 == null) goto L18;
        String r5 = String.valueOf(r3);
    L19:
        String r7 = r0.getString("stationName", r5);
    L23:
        if (r0 == null) goto L25;
        String r9 = r0.getString("radioArtist", "");
    L26:
        if (r0 == null) goto L29;
        r11 = r0.getString("radioTitle", "");
    L29:
        if (TextUtils.isEmpty(r9) == true) goto L34;
        if (TextUtils.isEmpty(r11) == true) goto L34;
        r9 = b11.o(r9, " - ", r11);
    L40:
        s0(this.t0, r9);
        s0(this.u0, r7);
        this.t0.setSelected(true);
        this.u0.setSelected(true);
        TextView r10 = this.t0;
        if (TextUtils.isEmpty(r9) == true) goto L43;
        int r12 = 0;
    L44:
        r10.setVisibility(r12);
        TextView r13 = this.u0;
        if (TextUtils.isEmpty(r7) == true) goto L47;
        r8 = 0;
    L47:
        r13.setVisibility(r8);
        w0(r15);
        return;
    L43:
        r12 = 8;
    L34:
        if (TextUtils.isEmpty(r11) == true) goto L37;
        r9 = r11;
        goto L40
    L37:
        if (TextUtils.isEmpty(r9) == false) goto L40;
        r9 = r7;
        goto L40
    L25:
        r9 = "";
        goto L26
    L18:
        r5 = "";
        goto L19
    L20:
        if (r3 == null) goto L22;
        r7 = String.valueOf(r3);
        goto L23
    L22:
        r7 = "";
        goto L23
    L49:
        TextView r14 = this.t0;
        if (xa3.u("track_number_visible", false) == false) goto L55;
        if (r1 == null) goto L55;
        if (String.valueOf(r1).isEmpty() == true) goto L55;
        String r16 = String.format("%02d", new Object[]{r1}) + ". " + String.valueOf(r2);
    L56:
        s0(r14, r16);
        TextView r17 = this.u0;
        if (r3 == null) goto L59;
        String r18 = String.valueOf(r3);
    L60:
        s0(r17, r18);
        this.t0.setSelected(true);
        this.u0.setSelected(true);
        TextView r19 = this.u0;
        if (r0 == null) goto L63;
        r4 = r0.getString("id");
    L63:
        fu.p(r19, r4);
        TextView r20 = this.t0;
        if (r2 != null) goto L66;
    L68:
        int r21 = 8;
    L69:
        r20.setVisibility(r21);
        TextView r22 = this.u0;
        if (r3 != null) goto L72;
    L73:
        if (r0 != null) goto L75;
    L79:
        r22.setVisibility(r8);
        w0(r15);
        return;
    L75:
        if (Objects.equals(r0.getString("type"), WaveOrigin.RADIO) == false) goto L79;
        if (r0.getString("uri") == null) goto L79;
    L78:
        r8 = 0;
        goto L79
    L72:
        if (r3.equals("") == false) goto L78;
    L66:
        if (r2.equals("") == true) goto L68;
        r21 = 0;
        goto L69
    L59:
        r18 = "";
    L55:
        r16 = String.valueOf(r2);
        goto L56
    L12:
        r6 = null;
        goto L13
    L7:
        if (this.n0 == true) goto L9;
    }

    public final void r0(bj2 r5) {
        Button r0 = (Button) ((LinearLayout) this.l0.o).findViewById(R.id.player_playback_speed_button);
        App.b().getClass();
        float r1 = App.c().getFloat("playback_speed", 1.0f);
        boolean r2 = xa3.u("skip_silence", false);
        r5.d(l0(r1));
        r0.setText(t(R.string.player_playback_speed, new Object[]{Float.valueOf(r1)}));
        this.w0.setChecked(r2);
    }

    public final void t0() {
        if (this.G0 != null) goto L5;
        return;
    L5:
        int r0 = 0;
        int r1 = 0;
    L7:
        if (r1 >= this.G0.getChildCount()) goto L12;
        if (this.G0.getChildAt(r1).getVisibility() == 0) goto L10;
        r1 = r1 + 1;
        goto L7
    L10:
        boolean r2 = true;
    L13:
        ChipGroup r3 = this.G0;
        if (r2 == true) goto L17;
        r0 = 8;
    L17:
        r3.setVisibility(r0);
        return;
    L12:
        r2 = false;
        goto L13
    }

    public final void u0() {
        ViewGroup r0 = (ViewGroup) this.y0.getParent();
        kx4 r1 = new kx4();
        r1.F(new cg4(8388611));
        r1.F(new v00());
        r1.G(500);
        r1.H(new AccelerateDecelerateInterpolator());
        ix4.a(r0, r1);
        TextView r4 = this.y0;
        if (ud3.l() == false) goto L5;
        int r2 = 8;
    L6:
        r4.setVisibility(r2);
        xa3.t("bitrate_visible", !ud3.l());
        return;
    L5:
        r2 = 0;
        goto L6
    }

    public final void v0() {
        ViewGroup r0 = (ViewGroup) this.z0.getParent();
        kx4 r1 = new kx4();
        r1.F(new cg4(80));
        r1.F(new v00());
        r1.G(500);
        r1.H(new AccelerateDecelerateInterpolator());
        ix4.a(r0, r1);
        ConstraintLayout r4 = this.z0;
        if (xa3.u("quick_action_visible", true) == false) goto L5;
        int r2 = 8;
    L6:
        r4.setVisibility(r2);
        App.b().getClass();
        xa3.t("quick_action_visible", !App.c().getBoolean("quick_action_visible", true));
        return;
    L5:
        r2 = 0;
        goto L6
    }

    public final void w0(do2 r5) {
        if (this.G0 != null) goto L5;
        return;
    L5:
        Bundle r6 = r5.I;
        if (r6 == null) goto L8;
        String r1 = r6.getString("type", "music");
    L10:
        if ("music".equals(r1) == true) goto L13;
        j0(this.H0);
        j0(this.I0);
        j0(this.J0);
        t0();
        return;
    L13:
        String r0 = null;
        if (r6 == null) goto L16;
        String r2 = r6.getString("id");
    L17:
        if (r6 == null) goto L19;
        String r3 = r6.getString("albumId");
    L20:
        if (r6 == null) goto L22;
        r0 = r6.getString("artistId");
    L22:
        ik r7 = h0(this.H0, "song", r2);
        h0(this.I0, "album", r3);
        ik r4 = h0(this.J0, "artist", r0);
        i0(this.t0, r7);
        TextView r8 = this.u0;
        if (r4 != null) goto L26;
        r4 = r7;
    L26:
        i0(r8, r4);
        i0(this.o0, r7);
        t0();
        return;
    L19:
        r3 = null;
        goto L20
    L16:
        r2 = null;
        goto L17
    L8:
        r1 = "music";
        goto L10
    }

    public final void x0() {
        if (this.E0 != null) goto L5;
        return;
    L5:
        if (this.F0 == null) goto L25;
        boolean r0 = u52.c().a;
        v52 r1 = u52.c();
        if (r0 == false) goto L10;
        boolean r2 = r1.A;
    L11:
        if (r2 == false) goto L22;
        if (r0 == false) goto L14;
        boolean r3 = r1.B;
    L15:
        if (r3 == false) goto L17;
        String r4 = s(R.string.sleep_timer_end_of_track_label);
    L20:
        this.F0.setText(r4);
        this.F0.setVisibility(0);
        int r5 = g12.t(this.E0, R.attr.colorPrimary);
        this.E0.setImageTintList(ColorStateList.valueOf(r5));
        return;
    L17:
        if (r0 == false) goto L19;
        r4 = r1.C;
        goto L20
    L19:
        r4 = yf4.c().d();
        goto L20
    L14:
        r3 = yf4.c().g;
        goto L15
    L22:
        this.F0.setVisibility(8);
        this.F0.setText("");
        int r6 = g12.t(this.E0, R.attr.colorOnSurface);
        this.E0.setImageTintList(ColorStateList.valueOf(r6));
        return;
    L10:
        r2 = yf4.c().f;
        goto L11
    }
}
