package com.eddyizm.tempus.ui.fragment.bottomsheetdialog;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.viewmodel.b;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import defpackage.aj2;
import defpackage.au0;
import defpackage.b11;
import defpackage.b75;
import defpackage.bi4;
import defpackage.bj2;
import defpackage.bl2;
import defpackage.bq4;
import defpackage.c04;
import defpackage.cb4;
import defpackage.ci4;
import defpackage.d8;
import defpackage.e75;
import defpackage.ei4;
import defpackage.et1;
import defpackage.eu0;
import defpackage.f35;
import defpackage.fi0;
import defpackage.fi4;
import defpackage.g51;
import defpackage.gh0;
import defpackage.i30;
import defpackage.i8;
import defpackage.ii4;
import defpackage.ik;
import defpackage.j8;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.l93;
import defpackage.le1;
import defpackage.n61;
import defpackage.nc1;
import defpackage.ot1;
import defpackage.q05;
import defpackage.q6;
import defpackage.qm4;
import defpackage.sk2;
import defpackage.sr1;
import defpackage.tr1;
import defpackage.ud3;
import defpackage.ur1;
import defpackage.vz3;
import defpackage.wg0;
import defpackage.wi3;
import defpackage.x7;
import defpackage.xc5;
import defpackage.xv0;
import defpackage.yj3;
import defpackage.zt;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class SongBottomSheetDialog extends zt implements View.OnClickListener {
    public b B0;
    public ii4 C0;
    public Child D0;
    public boolean E0;
    public TextView F0;
    public TextView G0;
    public ChipGroup H0;
    public Chip I0;
    public Chip J0;
    public Chip K0;
    public ik L0;
    public ik M0;
    public boolean N0;
    public bl2 O0;

    public SongBottomSheetDialog() {
        this.N0 = true;
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r12, ViewGroup r13, Bundle r14) {
        final int r0 = 0;
        View r15 = r12.inflate(R.layout.bottom_sheet_song_dialog, r13, false);
        Bundle r16 = this.s;
        if (r16 == null) goto L116;
        Child r17 = (Child) r16.getParcelable("TRACK_OBJECT");
        this.D0 = r17;
        if (r17 == null) goto L116;
        this.E0 = r16.getBoolean("homemusic_song_sheet_from_player", false);
        nc1 r18 = X();
        e75 r19 = r18.d();
        b75 r1 = gh0.r(r18);
        bq4 r2 = new bq4(r19, r1, b11.e(r18, r1));
        i30 r110 = kx3.a(b.class);
        String r111 = r110.b();
        if (r111 == null) goto L114;
        this.B0 = (b) r2.l(r110, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r111));
        nc1 r112 = X();
        e75 r113 = r112.d();
        b75 r3 = gh0.r(r112);
        bq4 r5 = new bq4(r113, r3, b11.e(r112, r3));
        i30 r114 = kx3.a(ii4.class);
        String r115 = r114.b();
        if (r115 == null) goto L112;
        ii4 r116 = (ii4) r5.l(r114, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r115));
        this.C0 = r116;
        r116.h = this.D0;
        q05.u((ViewGroup) r15.findViewById(R.id.option_linear_layout));
        ImageView r117 = (ImageView) r15.findViewById(R.id.song_cover_image_view);
        Context r118 = Z();
        String r4 = this.C0.h.getCoverArtId();
        c04 r6 = a.c(r118);
        if (r4 == null) goto L14;
        String r7 = wg0.b(ud3.t(), r4);
    L15:
        final int r8 = 9;
        vz3 r119 = b11.g(r118, r4, 9, r6, r7).T(xv0.b());
        if (ud3.R() == false) goto L18;
        r119 = (vz3) r119.l();
    L18:
        r119.K(r117);
        TextView r120 = (TextView) r15.findViewById(R.id.song_title_text_view);
        r120.setText(this.C0.h.getTitle());
        final int r9 = 1;
        r120.setSelected(true);
        TextView r10 = (TextView) r15.findViewById(R.id.song_artist_text_view);
        r10.setText(this.C0.h.getArtist());
        this.H0 = (ChipGroup) r15.findViewById(R.id.asset_link_chip_group);
        this.I0 = (Chip) r15.findViewById(R.id.asset_link_song_chip);
        this.J0 = (Chip) r15.findViewById(R.id.asset_link_album_chip);
        this.K0 = (Chip) r15.findViewById(R.id.asset_link_artist_chip);
        this.L0 = o0(this.I0, "song", this.D0.getId());
        o0(this.J0, "album", this.D0.getAlbumId());
        this.M0 = o0(this.K0, "artist", this.D0.getArtistId());
        final int r11 = 8;
        if (this.H0 == null) goto L34;
        int r20 = 0;
    L23:
        if (r20 >= this.H0.getChildCount()) goto L28;
        if (this.H0.getChildAt(r20).getVisibility() == 0) goto L26;
        r20 = r20 + 1;
        goto L23
    L26:
        boolean r21 = true;
    L29:
        ChipGroup r22 = this.H0;
        if (r21 == false) goto L32;
        int r23 = 0;
    L33:
        r22.setVisibility(r23);
        goto L34
    L32:
        r23 = 8;
        goto L33
    L28:
        r21 = false;
    L34:
        p0(r117, this.L0);
        p0(r120, this.L0);
        ik r121 = this.M0;
        if (r121 != null) goto L38;
        r121 = this.L0;
    L38:
        p0(r10, r121);
        ToggleButton r122 = (ToggleButton) r15.findViewById(R.id.button_favorite);
        ot1.f(r122, new ei4(0, this));
        String r24 = this.C0.h.getId();
        if (this.C0.h.getStarred() == null) goto L41;
        boolean r25 = true;
    L42:
        r122.setChecked(n61.f(1, r24, r25));
        r122.setOnClickListener(new ci4(this, r11));
        r122.setOnLongClickListener(new q6(23, this));
        ((TextView) r15.findViewById(R.id.play_radio_text_view)).setOnClickListener(new ci4(this, r8));
        ((TextView) r15.findViewById(R.id.play_next_text_view)).setOnClickListener(new ci4(this, r0));
        ((TextView) r15.findViewById(R.id.add_to_queue_text_view)).setOnClickListener(new ci4(this, r9));
        final int r26 = 2;
        ((TextView) r15.findViewById(R.id.rate_text_view)).setOnClickListener(new ci4(this, r26));
        Bundle r123 = this.s;
        if (r123 == null) goto L45;
        String r27 = r123.getString("PLAYLIST_ID");
    L46:
        if (r123 == null) goto L48;
        String r28 = r123.getString("PLAYLIST_NAME");
    L50:
        if (r123 == null) goto L52;
        int r124 = r123.getInt("ITEM_POSITION", -1);
    L53:
        TextView r29 = (TextView) r15.findViewById(R.id.download_text_view);
        this.F0 = r29;
        r29.setOnClickListener(new et1(this, r27, r28, 1));
        TextView r30 = (TextView) r15.findViewById(R.id.remove_text_view);
        this.G0 = r30;
        final int r125 = 3;
        r30.setOnClickListener(new ci4(this, r125));
        q0();
        TextView r31 = (TextView) r15.findViewById(R.id.remove_from_playlist_text_view);
        if (r27 == null) goto L57;
        if (r124 == (-1)) goto L57;
        r31.setVisibility(0);
        r31.setOnClickListener(new wi3(this, r27, r124, r9));
    L57:
        View r126 = r15.findViewById(R.id.homemusic_remove_from_liked_text_view);
        Child r32 = this.D0;
        r126.getClass();
        r32.getClass();
        String r33 = r32.getId();
        if (r32.getStarred() == null) goto L60;
        boolean r34 = true;
    L61:
        boolean r35 = n61.f(1, r33, r34);
        Bundle r36 = this.s;
        if (r36 != null) goto L64;
    L66:
        boolean r37 = false;
    L67:
        String r38 = r32.getId();
        r38.getClass();
        if (r37 == false) goto L73;
        if (r35 == false) goto L73;
        if (qm4.u0(r38) == true) goto L73;
        r126.setVisibility(0);
        r126.setOnClickListener(new j8(11, this, r32));
    L74:
        View r127 = r15.findViewById(R.id.homemusic_dislike_text_view);
        Child r39 = this.D0;
        bi4 r40 = new bi4(this, 1);
        ExecutorService r41 = ur1.a;
        r39.getClass();
        if (r127 != null) goto L78;
    L81:
        View r128 = r15.findViewById(R.id.homemusic_wave_text_view);
        Child r42 = this.D0;
        bi4 r43 = new bi4(this, 1);
        boolean r44 = this.E0;
        WeakReference r45 = com.eddyizm.tempus.homemusic.b.a;
        r42.getClass();
        com.eddyizm.tempus.homemusic.b.d(r128, r42, r43, false, r44);
        View r129 = r15.findViewById(R.id.homemusic_wave_artist_text_view);
        Child r46 = this.D0;
        bi4 r47 = new bi4(this, 1);
        boolean r48 = this.E0;
        r46.getClass();
        com.eddyizm.tempus.homemusic.b.d(r129, r46, r47, true, r48);
        final int r49 = 4;
        ((TextView) r15.findViewById(R.id.add_to_playlist_text_view)).setOnClickListener(new ci4(this, r49));
        TextView r130 = (TextView) r15.findViewById(R.id.go_to_album_text_view);
        final int r50 = 5;
        r130.setOnClickListener(new ci4(this, r50));
        if (this.C0.h.getAlbumId() == null) goto L84;
        int r51 = 0;
    L85:
        r130.setVisibility(r51);
        TextView r131 = (TextView) r15.findViewById(R.id.go_to_artist_text_view);
        final int r52 = 6;
        r131.setOnClickListener(new ci4(this, r52));
        if (this.C0.h.getArtistId() == null) goto L88;
        int r53 = 0;
    L89:
        r131.setVisibility(r53);
        TextView r132 = (TextView) r15.findViewById(R.id.share_text_view);
        final int r54 = 7;
        r132.setOnClickListener(new ci4(this, r54));
        if (ud3.V() == false) goto L92;
        int r55 = 0;
    L93:
        r132.setVisibility(r55);
        Child r133 = this.D0;
        bi4 r56 = new bi4(this, 1);
        r133.getClass();
        if (ot1.c(r133.getId()) == false) goto L111;
        int[] r134 = {R.id.play_radio_text_view, R.id.rate_text_view, R.id.remove_text_view, R.id.add_to_playlist_text_view, R.id.go_to_album_text_view, R.id.go_to_artist_text_view, R.id.share_text_view, R.id.remove_from_playlist_text_view, R.id.asset_link_chip_group};
        int r57 = 0;
    L97:
        if (r57 >= 9) goto L102;
        View r58 = r15.findViewById(r134[r57]);
        if (r58 == null) goto L101;
        r58.setVisibility(8);
    L101:
        r57 = r57 + 1;
        goto L97
    L102:
        View r135 = r15.findViewById(R.id.button_favorite);
        if (r135 == null) goto L105;
        r135.setOnClickListener(new tr1(r133, 1));
    L105:
        View r136 = r15.findViewById(R.id.button_favorite);
        if (r136 == null) goto L108;
        r136.setOnLongClickListener(null);
    L108:
        TextView r137 = (TextView) r15.findViewById(R.id.download_text_view);
        if (r137 == null) goto L111;
        r137.setVisibility(0);
        r137.setText(R.string.homemusic_hub_download_track);
        r137.setOnClickListener(new sr1(r133, r56));
    L111:
        return r15;
    L92:
        r55 = 8;
        goto L93
    L88:
        r53 = 8;
        goto L89
    L84:
        r51 = 8;
        goto L85
    L78:
        if (ur1.b(r39) == true) goto L80;
        r127.setVisibility(8);
        goto L81
    L80:
        r127.setVisibility(0);
        r127.setOnClickListener(new sr1(r40, r39));
    L73:
        r126.setVisibility(8);
        goto L74
    L64:
        if (r36.getBoolean("homemusic_song_sheet_from_liked") != true) goto L66;
        r37 = true;
        goto L67
    L60:
        r34 = false;
        goto L61
    L52:
        r124 = -1;
        goto L53
    L48:
        r28 = null;
        goto L50
    L45:
        r27 = null;
        goto L46
    L41:
        r25 = false;
        goto L42
    L14:
        r7 = null;
        goto L15
    L112:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L114:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L116:
        n0();
        return r15;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void R() {
        super.R();
        if (this.D0 == null) goto L11;
        Context r2 = Z();
        cb4 r3 = new cb4(Z(), new ComponentName(Z(), MediaService.class));
        Bundle r4 = Bundle.EMPTY;
        aj2 r5 = new aj2();
        Looper r6 = f35.x();
        bl2 r7 = new bl2(r6);
        if (r3.a.e() == false) goto L8;
        xc5 r0 = new xc5(4, new fi0(new x7(r2)));
    L9:
        b11.w(r7, new bj2(r2, r3, r4, r5, r6, r7, r0), new Handler(r6));
        this.O0 = r7;
        return;
    L8:
        r0 = null;
        goto L9
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void S() {
        bl2 r0 = this.O0;
        if (r0 == null) goto L5;
        sk2.Z0(r0);
    L5:
        super.S();
    }

    @Override // defpackage.kc1
    public final void T(View r3, Bundle r4) {
        if (this.D0 == null) goto L6;
        le1 r5 = v();
        bi4 r6 = new bi4(this, 0);
        g51.d.e(r5, new d8(15, r6));
        return;
    }

    public final ik o0(Chip r8, String r9, String r10) {
        if (r8 != null) goto L6;
        return null;
    L6:
        if (r10 != null) goto L8;
    L51:
        r8.setVisibility(8);
        r8.setText("");
        r8.setOnClickListener(null);
        r8.setOnLongClickListener(null);
        return null;
    L8:
        if (r10.isEmpty() == true) goto L51;
        byte r6 = -1;
        switch(r9.hashCode()) {
            case -1409097913: goto L34;
            case 3536149: goto L30;
            case 3704893: goto L26;
            case 92896879: goto L22;
            case 98240899: goto L18;
            case 1879474642: goto L14;
            default: goto L37;
        };
    L37:
        switch(r6) {
            case 0: goto L44;
            case 1: goto L43;
            case 2: goto L42;
            case 3: goto L41;
            case 4: goto L40;
            case 5: goto L39;
            default: goto L38;
        };
    L38:
        int r3 = R.string.asset_link_label_unknown;
    L45:
        String r4 = s(r3);
        ik r11 = l93.h(r9, r10);
        if (r11 != null) goto L49;
        r8.setVisibility(8);
        r8.setText("");
        r8.setOnClickListener(null);
        r8.setOnLongClickListener(null);
        return null;
    L49:
        r8.setText(t(R.string.asset_link_chip_text, new Object[]{r4, r11.d}));
        r8.setVisibility(0);
        r8.setOnClickListener(new fi4(this, r11, 1));
        r8.setOnLongClickListener(new yj3(this, r11, r10, 1));
        return r11;
    L39:
        r3 = R.string.asset_link_label_playlist;
        goto L45
    L40:
        r3 = R.string.asset_link_label_genre;
        goto L45
    L41:
        r3 = R.string.asset_link_label_album;
        goto L45
    L42:
        r3 = R.string.asset_link_label_year;
        goto L45
    L43:
        r3 = R.string.asset_link_label_song;
        goto L45
    L44:
        r3 = R.string.asset_link_label_artist;
        goto L45
    L14:
        if (r9.equals("playlist") == false) goto L37;
        r6 = 5;
        goto L37
    L18:
        if (r9.equals("genre") == false) goto L37;
        r6 = 4;
        goto L37
    L22:
        if (r9.equals("album") == false) goto L37;
        r6 = 3;
        goto L37
    L26:
        if (r9.equals("year") == false) goto L37;
        r6 = 2;
        goto L37
    L30:
        if (r9.equals("song") == false) goto L37;
        r6 = 1;
        goto L37
    L34:
        if (r9.equals("artist") == false) goto L37;
        r6 = 0;
        goto L37
    }

    public final void p0(View r3, ik r4) {
        if (r4 != null) goto L6;
        l93.p(r3);
        r3.setOnClickListener(null);
        r3.setOnLongClickListener(null);
        r3.setClickable(false);
        r3.setLongClickable(false);
        return;
    L6:
        r3.setClickable(true);
        r3.setLongClickable(true);
        l93.g(r3);
        r3.setOnClickListener(new fi4(this, r4, 0));
        r3.setOnLongClickListener(new i8(6, this, r4));
    }

    public final void q0() {
        if (this.F0 != null) goto L5;
        return;
    L5:
        if (this.G0 != null) goto L7;
        return;
    L7:
        if (this.D0 == null) goto L35;
        int r1 = 8;
        if (ud3.o() != null) goto L21;
        eu0 r0 = au0.w(Z());
        String r3 = this.D0.getId();
        r0.getClass();
        boolean r2 = eu0.d(r3);
        TextView r4 = this.F0;
        if (r2 == false) goto L14;
        int r5 = 8;
    L15:
        r4.setVisibility(r5);
        TextView r6 = this.G0;
        if (r2 == false) goto L18;
        r1 = 0;
    L18:
        r6.setVisibility(r1);
        return;
    L14:
        r5 = 0;
        goto L15
    L21:
        if (g51.e(this.D0) == null) goto L23;
        boolean r7 = true;
    L24:
        TextView r8 = this.F0;
        if (r7 == false) goto L27;
        int r9 = 8;
    L28:
        r8.setVisibility(r9);
        TextView r10 = this.G0;
        if (r7 == false) goto L31;
        r1 = 0;
    L31:
        r10.setVisibility(r1);
        return;
    L27:
        r9 = 0;
        goto L28
    L23:
        r7 = false;
        goto L24
    }
}
