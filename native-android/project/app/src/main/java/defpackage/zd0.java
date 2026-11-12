package defpackage;

import android.content.Context;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.model.Server;
import com.eddyizm.tempus.radiobrowser.RadioBrowserStation;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Genre;
import com.eddyizm.tempus.subsonic.models.InternetRadioStation;
import com.eddyizm.tempus.subsonic.models.Playlist;
import com.eddyizm.tempus.subsonic.models.PodcastChannel;
import com.eddyizm.tempus.ui.fragment.DirectoryFragment;
import com.eddyizm.tempus.ui.fragment.LibraryFragment;
import com.eddyizm.tempus.ui.fragment.LoginFragment;
import com.eddyizm.tempus.ui.fragment.PlaylistEditorFragment;
import com.google.android.material.button.MaterialButton;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zd0 extends dw3 {
    public final /* synthetic */ int q;
    public List r;
    public Object s;

    public zd0(LoginFragment r2) {
        this.q = 8;
        this.s = r2;
        this.r = new ArrayList();
    }

    @Override // defpackage.dw3
    public final int a() {
        switch(this.q) {
            case 0: goto L21;
            case 1: goto L19;
            case 2: goto L17;
            case 3: goto L15;
            case 4: goto L13;
            case 5: goto L11;
            case 6: goto L9;
            case 7: goto L7;
            default: goto L5;
        };
    L5:
        return this.r.size();
    L7:
        return this.r.size();
    L9:
        return this.r.size();
    L11:
        return this.r.size();
    L13:
        return this.r.size();
    L15:
        return this.r.size();
    L17:
        return this.r.size();
    L19:
        return this.r.size();
    L21:
        return this.r.size();
    }

    @Override // defpackage.dw3
    public final void g(cx3 r13, int r14) {
        int r1 = 9;
        String r4 = null;
        switch(this.q) {
            case 0: goto L137;
            case 1: goto L135;
            case 2: goto L104;
            case 3: goto L55;
            case 4: goto L53;
            case 5: goto L45;
            case 6: goto L33;
            case 7: goto L6;
            default: goto L4;
        };
    L4:
        Server r12 = (Server) this.r.get(r14);
        i61 r15 = ((la4) r13).u;
        ((TextView) r15.q).setText(r12.getServerName());
        ((TextView) r15.p).setText(r12.getAddress());
        return;
    L6:
        du3 r16 = (du3) r13;
        RadioBrowserStation r17 = (RadioBrowserStation) this.r.get(r14);
        na4 r0 = r16.u;
        View r18 = r16.a;
        ((TextView) r0.q).setText(r17.name);
        StringBuilder r2 = new StringBuilder();
        String r3 = r17.country;
        if (r3 != null) goto L9;
    L11:
        String r5 = r17.codec;
        if (r5 == null) goto L20;
        if (r5.isEmpty() == true) goto L20;
        if (r2.length() <= 0) goto L18;
        r2.append(" · ");
    L18:
        r2.append(r17.codec);
    L20:
        if (r17.bitrate > 0) goto L22;
    L25:
        TextView r6 = (TextView) r0.p;
        MaterialButton r7 = (MaterialButton) r0.n;
        ImageView r8 = (ImageView) r0.o;
        r6.setText(r2.toString());
        String r9 = r17.favicon;
        if (r9 != null) goto L28;
    L30:
        r8.setImageDrawable(null);
    L31:
        r7.setText(R.string.radio_search_use);
        r7.setOnClickListener(new j8(21, this, r17));
        return;
    L28:
        if (r9.isEmpty() == true) goto L30;
        a.c(r18.getContext()).t(r9).G(wg0.a(8, r18.getContext(), r9)).K(r8);
        goto L31
    L22:
        if (r2.length() <= 0) goto L24;
        r2.append(" · ");
    L24:
        r2.append(r17.bitrate);
        r2.append(" kbps");
        goto L25
    L9:
        if (r3.isEmpty() == true) goto L11;
        r2.append(r17.country);
        goto L11
    L33:
        zm3 r19 = (zm3) r13;
        PodcastChannel r110 = (PodcastChannel) this.r.get(r14);
        z40 r111 = r19.u;
        ((TextView) r111.r).setText(r110.getTitle());
        TextView r10 = (TextView) r111.p;
        String r11 = r110.getDescription();
        Pattern r20 = e03.a;
        if (r11 == null) goto L36;
        String r21 = Html.fromHtml(r11, 63).toString();
    L37:
        r10.setText(r21);
        Context r112 = r19.a.getContext();
        String r113 = r110.getCoverArtId();
        c04 r22 = a.c(r112);
        if (r113 == null) goto L40;
        r4 = wg0.b(ud3.t(), r113);
    L40:
        vz3 r114 = b11.g(r112, r113, 7, r22, r4).T(xv0.b());
        if (ud3.R() == false) goto L43;
        r114 = (vz3) r114.l();
    L43:
        r114.K((ImageView) r111.o);
        return;
    L36:
        r21 = "";
        goto L37
    L45:
        ol3 r115 = (ol3) r13;
        Child r116 = (Child) this.r.get(r14);
        lv4 r117 = r115.u;
        ((TextView) r117.t).setText(r116.getTitle());
        ((TextView) r117.p).setText(r116.getArtist());
        ((TextView) r117.q).setText(e03.g(r116.getDuration()));
        Context r118 = r115.a.getContext();
        String r119 = r116.getCoverArtId();
        c04 r23 = a.c(r118);
        if (r119 == null) goto L48;
        r4 = wg0.b(ud3.t(), r119);
    L48:
        vz3 r120 = b11.g(r118, r119, 9, r23, r4).T(xv0.b());
        if (ud3.R() == false) goto L51;
        r120 = (vz3) r120.l();
    L51:
        r120.K((ImageView) r117.o);
        return;
    L53:
        nl3 r121 = (nl3) r13;
        Playlist r122 = (Playlist) this.r.get(r14);
        z05 r123 = r121.u;
        ((TextView) r123.q).setText(r122.getName());
        ((TextView) r123.p).setText(r121.a.getContext().getString(R.string.playlist_counted_tracks, new Object[]{Integer.valueOf(r122.getSongCount()), e03.h(Long.valueOf(r122.getDuration()), false)}));
        return;
    L55:
        yz2 r124 = (yz2) r13;
        Child r125 = (Child) this.r.get(r14);
        z12 r126 = r124.u;
        r126.e.setText(r125.getTitle());
        if (r125.isDir() == false) goto L58;
        r1 = 5;
    L58:
        Context r127 = r124.a.getContext();
        String r24 = r125.getCoverArtId();
        c04 r25 = a.c(r127);
        if (r24 == null) goto L61;
        String r26 = wg0.b(ud3.t(), r24);
    L62:
        vz3 r128 = b11.g(r127, r24, r1, r25, r26).T(xv0.b());
        if (ud3.R() == false) goto L65;
        r128 = (vz3) r128.l();
    L65:
        ImageView r27 = r126.b;
        ImageView r28 = r126.c;
        r128.K(r27);
        if (r125.isDir() == false) goto L68;
        int r129 = 0;
    L69:
        r28.setVisibility(r129);
        ImageView r130 = r126.d;
        if (r125.isDir() == false) goto L72;
        int r131 = 0;
    L73:
        r130.setVisibility(r131);
        boolean r132 = r125.isDir();
        ko1 r133 = ko1.p;
        ko1 r29 = ko1.n;
        if (r132 == false) goto L76;
    L75:
        ko1 r134 = r29;
    L92:
        if (r134 != r29) goto L94;
        r28.setImageDrawable(null);
        r28.setPadding(0, 0, 0, 0);
        r28.setBackground(r28.getContext().getDrawable(R.drawable.ic_navigate_next));
        r28.setContentDescription(null);
        return;
    L94:
        int r135 = (int) (2.0f * r28.getResources().getDisplayMetrics().density);
        r28.setBackground(null);
        r28.setPadding(r135, r135, r135, r135);
        if (r134 != r133) goto L97;
        int r136 = R.drawable.ic_homemusic_on_phone;
    L98:
        r28.setImageResource(r136);
        Context r137 = r28.getContext();
        if (r134 != r133) goto L101;
        int r138 = R.string.homemusic_downloaded_on_phone;
    L102:
        r28.setContentDescription(r137.getString(r138));
        r28.setVisibility(0);
        return;
    L101:
        r138 = R.string.homemusic_downloading_to_phone;
        goto L102
    L97:
        r136 = R.drawable.ic_homemusic_to_phone;
        goto L98
    L76:
        Context r139 = r28.getContext();
        r139.getClass();
        if (ud3.o() != null) goto L79;
        eu0 r140 = au0.w(r139);
        String r141 = r125.getId();
        r140.getClass();
        Integer r142 = eu0.c(r141);
        if (r142 == null) goto L75;
        if (r142.intValue() == 4) goto L75;
        if (r142.intValue() == 5) goto L75;
        if (r142.intValue() == 3) goto L80;
        r134 = ko1.o;
    L80:
        r134 = r133;
        goto L92
    L79:
        if (g51.e(r125) == null) goto L75;
    L72:
        r131 = 4;
        goto L73
    L68:
        r129 = 4;
        goto L69
    L61:
        r26 = null;
        goto L62
    L104:
        z02 r143 = (z02) r13;
        InternetRadioStation r144 = (InternetRadioStation) this.r.get(r14);
        lv4 r145 = r143.u;
        View r146 = r143.a;
        ((TextView) r145.t).setText(r144.getName());
        TextView r30 = (TextView) r145.s;
        TextView r31 = (TextView) r145.p;
        ImageView r147 = (ImageView) r145.q;
        r30.setText(r144.getStreamUrl());
        if (r144.getId() != null) goto L107;
    L109:
        r31.setVisibility(8);
    L111:
        if (r144.getId() == null) goto L116;
        File r32 = xt3.e(r144.getId());
        if (r32.exists() == false) goto L116;
        ((vz3) a.c(r146.getContext()).s(r32).G(wg0.a(8, r146.getContext(), r144.getId())).w(new s73(Long.valueOf(r32.lastModified())))).T(xv0.b()).K(r147);
        return;
    L116:
        if (r144.getCoverArt() != null) goto L118;
    L126:
        String r148 = r144.getHomePageUrl();
        if (r148 != null) goto L129;
    L133:
        a.c(r146.getContext()).t(null).G(wg0.a(8, r146.getContext(), null)).K(r147);
        return;
    L129:
        if (r148.isEmpty() == true) goto L133;
        if (e03.n(r148) == false) goto L133;
        a.c(r146.getContext()).t(r148).G(wg0.a(8, r146.getContext(), r148)).T(xv0.b()).K(r147);
        return;
    L118:
        if (r144.getCoverArt().isEmpty() == true) goto L126;
        Context r149 = r146.getContext();
        String r150 = r144.getCoverArt();
        c04 r33 = a.c(r149);
        if (r150 == null) goto L122;
        r4 = wg0.b(ud3.t(), r150);
    L122:
        vz3 r151 = b11.g(r149, r150, 8, r33, r4).T(xv0.b());
        if (ud3.R() == false) goto L125;
        r151 = (vz3) r151.l();
    L125:
        r151.K(r147);
        return;
    L107:
        if (r144.getId().startsWith("local_") == false) goto L109;
        r31.setVisibility(0);
        goto L111
    L135:
        ((TextView) ((dh1) r13).u.o).setText(((Genre) this.r.get(r14)).getGenre());
        return;
    L137:
        yd0 r152 = (yd0) r13;
        sp3 r153 = (sp3) this.r.get(r14);
        z40 r154 = r152.u;
        TextView r34 = (TextView) r154.r;
        ImageView r35 = (ImageView) r154.p;
        String r36 = r153.c;
        String r37 = r153.g;
        r34.setText(r36);
        ((TextView) r154.o).setText(r153.d);
        TextView r155 = (TextView) r154.q;
        View r156 = r152.a;
        Context r38 = r156.getContext();
        long r39 = r153.b / 1000;
        long r40 = r39 / 3600;
        long r41 = (r39 % 3600) / 60;
        long r42 = r39 % 60;
        if (r40 <= 0) goto L140;
        String r157 = String.format(Locale.US, "%d:%02d:%02d", new Object[]{Long.valueOf(r40), Long.valueOf(r41), Long.valueOf(r42)});
    L141:
        r155.setText(r38.getString(R.string.home_continue_listening_resume_at, new Object[]{r157}));
        if (r37 == null) goto L147;
        Context r158 = r156.getContext();
        vz3 r159 = b11.g(r158, r37, 2, a.c(r158), wg0.b(ud3.t(), r37)).T(xv0.b());
        if (ud3.R() == false) goto L146;
        r159 = (vz3) r159.l();
    L146:
        r159.K(r35);
        return;
    L147:
        r35.setImageResource(R.drawable.ic_placeholder_album);
        return;
    L140:
        r157 = String.format(Locale.US, "%d:%02d", new Object[]{Long.valueOf(r41), Long.valueOf(r42)});
        goto L141
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup r12, int r13) {
        boolean r2 = false;
        switch(this.q) {
            case 0: goto L90;
            case 1: goto L83;
            case 2: goto L68;
            case 3: goto L57;
            case 4: goto L50;
            case 5: goto L33;
            case 6: goto L22;
            case 7: goto L11;
            default: goto L4;
        };
    L4:
        View r14 = b11.i(r12, R.layout.item_login_server, r12, false);
        int r15 = R.id.server_address_text_view;
        TextView r5 = (TextView) uo.s(r14, R.id.server_address_text_view);
        if (r5 == null) goto L9;
        r15 = R.id.server_name_text_view;
        TextView r6 = (TextView) uo.s(r14, R.id.server_name_text_view);
        if (r6 == null) goto L9;
        boolean r7 = false;
        return new la4(this, new i61((ConstraintLayout) r14, r5, r6, r7, 7));
    L9:
        nz2.n("Missing required view with ID: ".concat(r14.getResources().getResourceName(r15)));
        return null;
    L11:
        View r11 = b11.i(r12, R.layout.item_radio_search_result, r12, false);
        int r16 = R.id.add_station_button;
        MaterialButton r4 = (MaterialButton) uo.s(r11, R.id.add_station_button);
        if (r4 == null) goto L20;
        r16 = R.id.station_cover_image_view;
        ImageView r8 = (ImageView) uo.s(r11, R.id.station_cover_image_view);
        if (r8 == null) goto L20;
        r16 = R.id.station_details_text_view;
        TextView r9 = (TextView) uo.s(r11, R.id.station_details_text_view);
        if (r9 == null) goto L20;
        r16 = R.id.station_name_text_view;
        TextView r10 = (TextView) uo.s(r11, R.id.station_name_text_view);
        if (r10 == null) goto L20;
        ConstraintLayout r3 = (ConstraintLayout) r11;
        na4 r17 = new na4(r3, r4, r8, r9, r10);
        du3 r0 = new du3(r3);
        r0.u = r17;
        return r0;
    L20:
        nz2.n("Missing required view with ID: ".concat(r11.getResources().getResourceName(r16)));
        return null;
    L22:
        View r18 = b11.i(r12, R.layout.item_horizontal_podcast_channel, r12, false);
        int r19 = R.id.podcast_channel_cover_image_view;
        ImageView r20 = (ImageView) uo.s(r18, R.id.podcast_channel_cover_image_view);
        if (r20 == null) goto L31;
        r19 = R.id.podcast_channel_description_text_view;
        TextView r21 = (TextView) uo.s(r18, R.id.podcast_channel_description_text_view);
        if (r21 == null) goto L31;
        r19 = R.id.podcast_channel_more_button;
        ImageView r22 = (ImageView) uo.s(r18, R.id.podcast_channel_more_button);
        if (r22 == null) goto L31;
        r19 = R.id.podcast_channel_title_text_view;
        TextView r23 = (TextView) uo.s(r18, R.id.podcast_channel_title_text_view);
        if (r23 == null) goto L31;
        return new zm3(this, new z40((ConstraintLayout) r18, r20, r21, r22, r23));
    L31:
        nz2.n("Missing required view with ID: ".concat(r18.getResources().getResourceName(r19)));
        return null;
    L33:
        View r110 = b11.i(r12, R.layout.item_horizontal_playlist_dialog_track, r12, false);
        int r111 = R.id.playlist_dialog_album_artist_text_view;
        TextView r24 = (TextView) uo.s(r110, R.id.playlist_dialog_album_artist_text_view);
        if (r24 == null) goto L48;
        r111 = R.id.playlist_dialog_song_cover_image_view;
        ImageView r25 = (ImageView) uo.s(r110, R.id.playlist_dialog_song_cover_image_view);
        if (r25 == null) goto L48;
        r111 = R.id.playlist_dialog_song_duration_text_view;
        TextView r26 = (TextView) uo.s(r110, R.id.playlist_dialog_song_duration_text_view);
        if (r26 == null) goto L48;
        r111 = R.id.playlist_dialog_song_handle_button;
        ImageView r27 = (ImageView) uo.s(r110, R.id.playlist_dialog_song_handle_button);
        if (r27 == null) goto L48;
        r111 = R.id.playlist_dialog_song_remove_button;
        ImageView r28 = (ImageView) uo.s(r110, R.id.playlist_dialog_song_remove_button);
        if (r28 == null) goto L48;
        r111 = R.id.playlist_dialog_song_title_text_view;
        TextView r112 = (TextView) uo.s(r110, R.id.playlist_dialog_song_title_text_view);
        if (r112 == null) goto L48;
        r111 = R.id.queue_separator_text_view;
        if (((TextView) uo.s(r110, R.id.queue_separator_text_view)) == null) goto L48;
        return new ol3(this, new lv4((ConstraintLayout) r110, r24, r25, r26, r27, r28, r112));
    L48:
        nz2.n("Missing required view with ID: ".concat(r110.getResources().getResourceName(r111)));
        return null;
    L50:
        View r113 = b11.i(r12, R.layout.item_horizontal_playlist_dialog, r12, false);
        int r114 = R.id.playlist_dialog_count_text_view;
        TextView r29 = (TextView) uo.s(r113, R.id.playlist_dialog_count_text_view);
        if (r29 == null) goto L55;
        r114 = R.id.playlist_dialog_title_text_view;
        TextView r30 = (TextView) uo.s(r113, R.id.playlist_dialog_title_text_view);
        if (r30 == null) goto L55;
        return new nl3(this, new z05((ConstraintLayout) r113, r29, r30, 6));
    L55:
        nz2.n("Missing required view with ID: ".concat(r113.getResources().getResourceName(r114)));
        return null;
    L57:
        View r115 = b11.i(r12, R.layout.item_library_music_directory, r12, false);
        int r116 = R.id.music_directory_cover_image_view;
        ImageView r31 = (ImageView) uo.s(r115, R.id.music_directory_cover_image_view);
        if (r31 == null) goto L66;
        r116 = R.id.music_directory_more_button;
        ImageView r32 = (ImageView) uo.s(r115, R.id.music_directory_more_button);
        if (r32 == null) goto L66;
        r116 = R.id.music_directory_play_button;
        ImageView r33 = (ImageView) uo.s(r115, R.id.music_directory_play_button);
        if (r33 == null) goto L66;
        r116 = R.id.music_directory_title_text_view;
        TextView r34 = (TextView) uo.s(r115, R.id.music_directory_title_text_view);
        if (r34 == null) goto L66;
        return new yz2(this, new z12((ConstraintLayout) r115, r31, r32, r33, r34));
    L66:
        nz2.n("Missing required view with ID: ".concat(r115.getResources().getResourceName(r116)));
        return null;
    L68:
        View r117 = b11.i(r12, R.layout.item_home_internet_radio_station, r12, false);
        int r118 = R.id.cover_image_separator;
        View r35 = uo.s(r117, R.id.cover_image_separator);
        if (r35 == null) goto L81;
        r118 = R.id.internet_radio_station_cover_image_view;
        ImageView r36 = (ImageView) uo.s(r117, R.id.internet_radio_station_cover_image_view);
        if (r36 == null) goto L81;
        r118 = R.id.internet_radio_station_local_badge;
        TextView r37 = (TextView) uo.s(r117, R.id.internet_radio_station_local_badge);
        if (r37 == null) goto L81;
        r118 = R.id.internet_radio_station_more_button;
        ImageView r38 = (ImageView) uo.s(r117, R.id.internet_radio_station_more_button);
        if (r38 == null) goto L81;
        r118 = R.id.internet_radio_station_subtitle_text_view;
        TextView r39 = (TextView) uo.s(r117, R.id.internet_radio_station_subtitle_text_view);
        if (r39 == null) goto L81;
        r118 = R.id.internet_radio_station_title_text_view;
        TextView r40 = (TextView) uo.s(r117, R.id.internet_radio_station_title_text_view);
        if (r40 == null) goto L81;
        return new z02(this, new lv4((ConstraintLayout) r117, r35, r36, r37, r38, r39, r40));
    L81:
        nz2.n("Missing required view with ID: ".concat(r117.getResources().getResourceName(r118)));
        return null;
    L83:
        View r119 = b11.i(r12, R.layout.item_library_genre, r12, false);
        int r120 = R.id.card_view;
        if (((CardView) uo.s(r119, R.id.card_view)) == null) goto L88;
        r120 = R.id.genre_label;
        TextView r41 = (TextView) uo.s(r119, R.id.genre_label);
        if (r41 == null) goto L88;
        return new dh1(this, new rm3((LinearLayout) r119, r41, r2));
    L88:
        nz2.n("Missing required view with ID: ".concat(r119.getResources().getResourceName(r120)));
        return null;
    L90:
        View r121 = b11.i(r12, R.layout.item_home_continue_listening, r12, false);
        int r122 = R.id.continue_listening_album_label;
        TextView r42 = (TextView) uo.s(r121, R.id.continue_listening_album_label);
        if (r42 == null) goto L99;
        r122 = R.id.continue_listening_cover_image_view;
        ImageView r43 = (ImageView) uo.s(r121, R.id.continue_listening_cover_image_view);
        if (r43 == null) goto L99;
        r122 = R.id.continue_listening_resume_label;
        TextView r44 = (TextView) uo.s(r121, R.id.continue_listening_resume_label);
        if (r44 == null) goto L99;
        r122 = R.id.continue_listening_title_label;
        TextView r45 = (TextView) uo.s(r121, R.id.continue_listening_title_label);
        if (r45 == null) goto L99;
        return new yd0(this, new z40((ConstraintLayout) r121, r42, r43, r44, r45));
    L99:
        nz2.n("Missing required view with ID: ".concat(r121.getResources().getResourceName(r122)));
        return null;
    }

    public /* synthetic */ zd0() {
        this.q = 0;
    }

    public zd0(LibraryFragment r2) {
        this.q = 1;
        this.s = r2;
        this.r = Collections.EMPTY_LIST;
    }

    public zd0(gp1 r2) {
        this.q = 6;
        this.s = r2;
        this.r = Collections.EMPTY_LIST;
    }

    public zd0(fl3 r2) {
        this.q = 4;
        this.s = r2;
        this.r = Collections.EMPTY_LIST;
    }

    public zd0(DirectoryFragment r2) {
        this.q = 3;
        this.s = r2;
        this.r = Collections.EMPTY_LIST;
    }

    public zd0(PlaylistEditorFragment r2) {
        this.q = 5;
        this.s = r2;
        this.r = Collections.EMPTY_LIST;
    }

    public zd0(hp1 r2) {
        this.q = 2;
        this.s = r2;
        this.r = Collections.EMPTY_LIST;
    }

    public zd0(ss2 r2) {
        this.q = 7;
        this.r = Collections.EMPTY_LIST;
        this.s = r2;
    }
}
