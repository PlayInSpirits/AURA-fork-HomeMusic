package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.homemusic.WaveOrigin;
import java.text.StringCharacterIterator;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uv4 extends pp0 {
    public vp0 B0;
    public final do2 C0;
    public ik D0;
    public ik E0;
    public ik F0;
    public ik G0;
    public ik H0;

    public uv4(do2 r1) {
        this.C0 = r1;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void J() {
        super.J();
        this.B0 = null;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void R() {
        super.R();
        String r1 = null;
        this.G0 = null;
        this.H0 = null;
        do2 r2 = this.C0;
        Bundle r3 = r2.I;
        Bundle r4 = r2.I;
        CharSequence r5 = r2.b;
        if (r3 == null) goto L5;
        String r6 = r3.getString("type");
    L6:
        boolean r7 = Objects.equals(r6, WaveOrigin.RADIO);
        if (r7 == false) goto L35;
        if (r3 == null) goto L13;
        if (r5 == null) goto L11;
        String r8 = String.valueOf(r5);
    L12:
        String r9 = r3.getString("stationName", r8);
    L16:
        if (r3 == null) goto L18;
        String r10 = r3.getString("radioArtist", "");
    L19:
        if (r3 == null) goto L21;
        String r11 = r3.getString("radioTitle", "");
    L23:
        if (TextUtils.isEmpty(r10) == true) goto L28;
        if (TextUtils.isEmpty(r11) == true) goto L28;
        r10 = b11.o(r10, " - ", r11);
    L34:
        this.B0.v.setText(r10);
        this.B0.u.setText(r9);
    L41:
        if (r3 == null) goto L131;
        this.D0 = l93.h("song", r3.getString("id"));
        this.E0 = l93.h("album", r3.getString("albumId"));
        this.F0 = l93.h("artist", r3.getString("artistId"));
        String r12 = r3.getString("assetLinkGenre");
        if (TextUtils.isEmpty(r12) == false) goto L45;
        ik r13 = null;
    L46:
        this.G0 = r13;
        String r14 = r3.getString("assetLinkYear");
        if (TextUtils.isEmpty(r14) == false) goto L49;
        ik r15 = null;
    L50:
        this.H0 = r15;
        Context r16 = Z();
        String r17 = r3.getString("coverArtId", "");
        c04 r18 = a.c(r16);
        if (r17 == null) goto L53;
        r1 = wg0.b(ud3.t(), r17);
    L53:
        vz3 r19 = b11.g(r16, r17, 9, r18, r1).T(xv0.b());
        if (ud3.R() == false) goto L56;
        r19 = (vz3) r19.l();
    L56:
        r19.K(this.B0.s);
        ImageView r20 = this.B0.s;
        ik r21 = this.E0;
        if (r21 != null) goto L60;
        r21 = this.D0;
    L60:
        n0(r20, r21);
        n0(this.B0.v, this.D0);
        TextView r22 = this.B0.u;
        ik r23 = this.F0;
        if (r23 != null) goto L64;
        r23 = this.D0;
    L64:
        n0(r22, r23);
        String r24 = r3.getString("title", s(R.string.label_placeholder));
        String r110 = r3.getString("album", s(R.string.label_placeholder));
        String r111 = r3.getString("artist", s(R.string.label_placeholder));
        String r112 = r3.getString("genre", s(R.string.label_placeholder));
        int r113 = r3.getInt("year", 0);
        if (r7 == false) goto L72;
        String r25 = r3.getString("stationName", s(R.string.label_placeholder));
        String r26 = r3.getString("radioArtist", "");
        String r27 = r3.getString("radioTitle", "");
        this.B0.o.setVisibility(0);
        this.B0.p.setText(r25);
        if (TextUtils.isEmpty(r27) == true) goto L70;
        r24 = r27;
    L70:
        if (TextUtils.isEmpty(r26) == true) goto L74;
        r111 = r26;
    L74:
        if (this.G0 != null) goto L82;
        if (r112 == null) goto L82;
        if (r112.isEmpty() == true) goto L82;
        if (s(R.string.label_placeholder).contentEquals(r112) == true) goto L82;
        this.G0 = l93.h("genre", r112);
    L82:
        if (this.H0 != null) goto L85;
        if (r113 == 0) goto L85;
        this.H0 = l93.h("year", String.valueOf(r113));
    L85:
        this.B0.r.setText(r24);
        this.B0.b.setText(r110);
        this.B0.c.setText(r111);
        TextView r28 = this.B0.t;
        if (r3.getInt("track", 0) == 0) goto L88;
        String r29 = String.valueOf(r3.getInt("track", 0));
        int r30 = R.string.label_placeholder;
    L89:
        r28.setText(r29);
        TextView r31 = this.B0.z;
        if (r113 == 0) goto L92;
        String r32 = String.valueOf(r113);
    L93:
        r31.setText(r32);
        this.B0.i.setText(r112);
        TextView r33 = this.B0.l;
        if (r3.getLong("size", 0) == 0) goto L109;
        long r34 = r3.getLong("size", 0);
        Pattern r35 = e03.a;
        if (r34 != Long.MIN_VALUE) goto L98;
        long r36 = Long.MAX_VALUE;
    L100:
        if (r36 >= 1024) goto L102;
        String r37 = r34 + " B";
    L108:
        int r38 = R.string.label_placeholder;
    L110:
        r33.setText(r37);
        this.B0.f.setText(r3.getString("contentType", s(r38)));
        this.B0.q.setText(r3.getString("suffix", s(r38)));
        this.B0.x.setText(r3.getString("transcodedContentType", s(r38)));
        this.B0.y.setText(r3.getString("transcodedSuffix", s(r38)));
        TextView r39 = this.B0.h;
        if (r3.getInt("duration", 0) == 0) goto L113;
        String r40 = e03.g(Integer.valueOf(r3.getInt("duration", 0)));
    L114:
        r39.setText(r40);
        TextView r41 = this.B0.e;
        if (r3.getInt("bitrate", 0) == 0) goto L117;
        String r42 = r3.getInt("bitrate", 0) + " kbps";
    L118:
        r41.setText(r42);
        TextView r43 = this.B0.k;
        if (r3.getInt("samplingRate", 0) == 0) goto L121;
        String r44 = r3.getInt("samplingRate", 0) + " Hz";
    L122:
        r43.setText(r44);
        TextView r45 = this.B0.d;
        if (r3.getInt("bitDepth", 0) == 0) goto L125;
        String r46 = r3.getInt("bitDepth", 0) + " bits";
        int r47 = R.string.label_placeholder;
    L126:
        r45.setText(r46);
        this.B0.j.setText(r3.getString("path", s(r47)));
        TextView r48 = this.B0.g;
        if (r3.getInt("discNumber", 0) == 0) goto L129;
        String r49 = String.valueOf(r3.getInt("discNumber", 0));
    L130:
        r48.setText(r49);
        n0(this.B0.r, this.D0);
        n0(this.B0.b, this.E0);
        n0(this.B0.c, this.F0);
        n0(this.B0.i, this.G0);
        n0(this.B0.z, this.H0);
        goto L131
    L129:
        r49 = s(r47);
        goto L130
    L125:
        r47 = R.string.label_placeholder;
        r46 = s(R.string.label_placeholder);
        goto L126
    L121:
        r44 = s(R.string.label_placeholder);
        goto L122
    L117:
        r42 = s(R.string.label_placeholder);
        goto L118
    L113:
        r40 = s(R.string.label_placeholder);
        goto L114
    L102:
        StringCharacterIterator r50 = new StringCharacterIterator("KMGTPE");
        int r114 = 40;
        long r115 = r36;
    L103:
        if (r114 < 0) goto L107;
        if (r36 <= (1152865209611504844 >> r114)) goto L107;
        r115 = r115 >> 10;
        r50.next();
        r114 = r114 - 10;
    L107:
        r37 = String.format("%.1f %ciB", new Object[]{Double.valueOf((r115 * ((long) Long.signum(r34))) / 1024.0d), Character.valueOf(r50.current())});
        goto L108
    L98:
        r36 = Math.abs(r34);
        goto L100
    L109:
        r38 = R.string.label_placeholder;
        r37 = s(R.string.label_placeholder);
        goto L110
    L92:
        r32 = s(r30);
        goto L93
    L88:
        r30 = R.string.label_placeholder;
        r29 = s(R.string.label_placeholder);
        goto L89
    L72:
        this.B0.o.setVisibility(8);
        goto L74
    L49:
        r15 = l93.S(Uri.parse(r14));
        goto L50
    L45:
        r13 = l93.S(Uri.parse(r12));
    L131:
        StringBuilder r51 = new StringBuilder();
        boolean r52 = ud3.U();
        String r53 = e03.q(e03.d());
        int r54 = e03.d();
        if (Integer.parseInt(e03.b(r54, e03.q(r54))) == 0) goto L134;
        StringBuilder r55 = new StringBuilder();
        int r56 = e03.d();
        r55.append(Integer.parseInt(e03.b(r56, e03.q(r56))));
        r55.append("kbps");
        String r57 = r55.toString();
    L135:
        if (r4 != null) goto L137;
    L139:
        if (r52 == false) goto L142;
        r51.append(s(R.string.track_info_summary_server_prioritized));
        this.B0.w.setText(r51);
    L166:
        if (r4 == null) goto L178;
        String r58 = r4.getString("id");
        d7 r59 = new d7(6, this);
        Map r0 = jt1.a;
        if (r58 != null) goto L171;
        return;
    L171:
        if (r58.length() == 0) goto L179;
        io1.a.execute(new it1(r58, r59));
        return;
    L179:
        return;
    L178:
        return;
    L142:
        if (r52 == false) goto L144;
    L148:
        if (r52 == false) goto L150;
    L154:
        if (r52 == false) goto L156;
    L160:
        if (r52 == true) goto L166;
        if (r53.equals("raw") == true) goto L166;
        if (r57.equals("Original") == true) goto L166;
        r51.append(t(R.string.track_info_summary_full_transcode, new Object[]{r53, r57}));
        this.B0.w.setText(r51);
        goto L166
    L156:
        if (r53.equals("raw") == false) goto L160;
        if (r57.equals("Original") == true) goto L160;
        r51.append(t(R.string.track_info_summary_transcoding_bitrate, new Object[]{r57}));
        this.B0.w.setText(r51);
        goto L166
    L150:
        if (r53.equals("raw") == true) goto L154;
        if (r57.equals("Original") == false) goto L154;
        r51.append(t(R.string.track_info_summary_transcoding_codec, new Object[]{r53}));
        this.B0.w.setText(r51);
        goto L166
    L144:
        if (r53.equals("raw") == false) goto L148;
        if (r57.equals("Original") == false) goto L148;
        r51.append(s(R.string.track_info_summary_original_file));
        this.B0.w.setText(r51);
        goto L166
    L137:
        if (r4.getString("uri", "").contains("rest/download") == false) goto L139;
        r51.append(s(R.string.track_info_summary_downloaded_file));
        this.B0.w.setText(r51);
        goto L166
    L134:
        r57 = "Original";
    L28:
        if (TextUtils.isEmpty(r11) == true) goto L31;
        r10 = r11;
        goto L34
    L31:
        if (TextUtils.isEmpty(r10) == false) goto L34;
        r10 = r9;
        goto L34
    L21:
        r11 = "";
        goto L23
    L18:
        r10 = "";
        goto L19
    L11:
        r8 = "";
        goto L12
    L13:
        if (r5 == null) goto L15;
        r9 = String.valueOf(r5);
        goto L16
    L15:
        r9 = "";
        goto L16
    L35:
        this.B0.v.setText(r2.a);
        TextView r60 = this.B0.u;
        if (r5 != null) goto L39;
        r5 = "";
    L39:
        r60.setText(r5);
        goto L41
    L5:
        r6 = null;
        goto L6
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle r34) {
        View r1 = o().inflate(R.layout.dialog_track_info, null, false);
        int r2 = R.id.album_info_sector;
        if (((LinearLayout) uo.s(r1, R.id.album_info_sector)) == null) goto L126;
        r2 = R.id.album_key_sector;
        if (((TextView) uo.s(r1, R.id.album_key_sector)) == null) goto L126;
        r2 = R.id.album_value_sector;
        TextView r8 = (TextView) uo.s(r1, R.id.album_value_sector);
        if (r8 == null) goto L126;
        r2 = R.id.artist_info_sector;
        if (((LinearLayout) uo.s(r1, R.id.artist_info_sector)) == null) goto L126;
        r2 = R.id.artist_key_sector;
        if (((TextView) uo.s(r1, R.id.artist_key_sector)) == null) goto L126;
        r2 = R.id.artist_value_sector;
        TextView r9 = (TextView) uo.s(r1, R.id.artist_value_sector);
        if (r9 == null) goto L126;
        r2 = R.id.bit_depth_info_sector;
        if (((LinearLayout) uo.s(r1, R.id.bit_depth_info_sector)) == null) goto L126;
        r2 = R.id.bit_depth_key_sector;
        if (((TextView) uo.s(r1, R.id.bit_depth_key_sector)) == null) goto L126;
        r2 = R.id.bit_depth_value_sector;
        TextView r10 = (TextView) uo.s(r1, R.id.bit_depth_value_sector);
        if (r10 == null) goto L126;
        r2 = R.id.bitrate_info_sector;
        if (((LinearLayout) uo.s(r1, R.id.bitrate_info_sector)) == null) goto L126;
        r2 = R.id.bitrate_key_sector;
        if (((TextView) uo.s(r1, R.id.bitrate_key_sector)) == null) goto L126;
        r2 = R.id.bitrate_value_sector;
        TextView r11 = (TextView) uo.s(r1, R.id.bitrate_value_sector);
        if (r11 == null) goto L126;
        r2 = R.id.content_type_info_sector;
        if (((LinearLayout) uo.s(r1, R.id.content_type_info_sector)) == null) goto L126;
        r2 = R.id.content_type_key_sector;
        if (((TextView) uo.s(r1, R.id.content_type_key_sector)) == null) goto L126;
        r2 = R.id.content_type_value_sector;
        TextView r12 = (TextView) uo.s(r1, R.id.content_type_value_sector);
        if (r12 == null) goto L126;
        r2 = R.id.disc_number_info_sector;
        if (((LinearLayout) uo.s(r1, R.id.disc_number_info_sector)) == null) goto L126;
        r2 = R.id.disc_number_key_sector;
        if (((TextView) uo.s(r1, R.id.disc_number_key_sector)) == null) goto L126;
        r2 = R.id.disc_number_value_sector;
        TextView r13 = (TextView) uo.s(r1, R.id.disc_number_value_sector);
        if (r13 == null) goto L126;
        r2 = R.id.duration_info_sector;
        if (((LinearLayout) uo.s(r1, R.id.duration_info_sector)) == null) goto L126;
        r2 = R.id.duration_key_sector;
        if (((TextView) uo.s(r1, R.id.duration_key_sector)) == null) goto L126;
        r2 = R.id.duration_value_sector;
        TextView r14 = (TextView) uo.s(r1, R.id.duration_value_sector);
        if (r14 == null) goto L126;
        r2 = R.id.genre_info_sector;
        if (((LinearLayout) uo.s(r1, R.id.genre_info_sector)) == null) goto L126;
        r2 = R.id.genre_key_sector;
        if (((TextView) uo.s(r1, R.id.genre_key_sector)) == null) goto L126;
        r2 = R.id.genre_value_sector;
        TextView r15 = (TextView) uo.s(r1, R.id.genre_value_sector);
        if (r15 == null) goto L126;
        r2 = R.id.path_info_sector;
        if (((LinearLayout) uo.s(r1, R.id.path_info_sector)) == null) goto L126;
        r2 = R.id.path_key_sector;
        if (((TextView) uo.s(r1, R.id.path_key_sector)) == null) goto L126;
        r2 = R.id.path_value_sector;
        TextView r16 = (TextView) uo.s(r1, R.id.path_value_sector);
        if (r16 == null) goto L126;
        r2 = R.id.sampling_rate_info_sector;
        if (((LinearLayout) uo.s(r1, R.id.sampling_rate_info_sector)) == null) goto L126;
        r2 = R.id.sampling_rate_key_sector;
        if (((TextView) uo.s(r1, R.id.sampling_rate_key_sector)) == null) goto L126;
        r2 = R.id.sampling_rate_value_sector;
        TextView r17 = (TextView) uo.s(r1, R.id.sampling_rate_value_sector);
        if (r17 == null) goto L126;
        r2 = R.id.size_info_sector;
        if (((LinearLayout) uo.s(r1, R.id.size_info_sector)) == null) goto L126;
        r2 = R.id.size_key_sector;
        if (((TextView) uo.s(r1, R.id.size_key_sector)) == null) goto L126;
        r2 = R.id.size_value_sector;
        TextView r18 = (TextView) uo.s(r1, R.id.size_value_sector);
        if (r18 == null) goto L126;
        r2 = R.id.source_info_sector;
        LinearLayout r19 = (LinearLayout) uo.s(r1, R.id.source_info_sector);
        if (r19 == null) goto L126;
        r2 = R.id.source_key_sector;
        if (((TextView) uo.s(r1, R.id.source_key_sector)) == null) goto L126;
        r2 = R.id.source_value_sector;
        TextView r20 = (TextView) uo.s(r1, R.id.source_value_sector);
        if (r20 == null) goto L126;
        r2 = R.id.station_info_sector;
        LinearLayout r21 = (LinearLayout) uo.s(r1, R.id.station_info_sector);
        if (r21 == null) goto L126;
        r2 = R.id.station_key_sector;
        if (((TextView) uo.s(r1, R.id.station_key_sector)) == null) goto L126;
        r2 = R.id.station_value_sector;
        TextView r22 = (TextView) uo.s(r1, R.id.station_value_sector);
        if (r22 == null) goto L126;
        r2 = R.id.suffix_info_sector;
        if (((LinearLayout) uo.s(r1, R.id.suffix_info_sector)) == null) goto L126;
        r2 = R.id.suffix_key_sector;
        if (((TextView) uo.s(r1, R.id.suffix_key_sector)) == null) goto L126;
        r2 = R.id.suffix_value_sector;
        TextView r23 = (TextView) uo.s(r1, R.id.suffix_value_sector);
        if (r23 == null) goto L126;
        r2 = R.id.title_info_sector;
        if (((LinearLayout) uo.s(r1, R.id.title_info_sector)) == null) goto L126;
        r2 = R.id.title_key_sector;
        if (((TextView) uo.s(r1, R.id.title_key_sector)) == null) goto L126;
        r2 = R.id.title_value_sector;
        TextView r24 = (TextView) uo.s(r1, R.id.title_value_sector);
        if (r24 == null) goto L126;
        r2 = R.id.track_cover_info_image_view;
        ImageView r25 = (ImageView) uo.s(r1, R.id.track_cover_info_image_view);
        if (r25 == null) goto L126;
        r2 = R.id.track_number_info_sector;
        if (((LinearLayout) uo.s(r1, R.id.track_number_info_sector)) == null) goto L126;
        r2 = R.id.track_number_key_sector;
        if (((TextView) uo.s(r1, R.id.track_number_key_sector)) == null) goto L126;
        r2 = R.id.track_number_value_sector;
        TextView r26 = (TextView) uo.s(r1, R.id.track_number_value_sector);
        if (r26 == null) goto L126;
        r2 = R.id.trak_artist_info_text_view;
        TextView r27 = (TextView) uo.s(r1, R.id.trak_artist_info_text_view);
        if (r27 == null) goto L126;
        r2 = R.id.trak_title_info_text_view;
        TextView r28 = (TextView) uo.s(r1, R.id.trak_title_info_text_view);
        if (r28 == null) goto L126;
        r2 = R.id.trak_transcoding_info_text_view;
        TextView r29 = (TextView) uo.s(r1, R.id.trak_transcoding_info_text_view);
        if (r29 == null) goto L126;
        r2 = R.id.transcoded_content_type_info_sector;
        if (((LinearLayout) uo.s(r1, R.id.transcoded_content_type_info_sector)) == null) goto L126;
        r2 = R.id.transcoded_content_type_key_sector;
        if (((TextView) uo.s(r1, R.id.transcoded_content_type_key_sector)) == null) goto L126;
        r2 = R.id.transcoded_content_type_value_sector;
        TextView r30 = (TextView) uo.s(r1, R.id.transcoded_content_type_value_sector);
        if (r30 == null) goto L126;
        r2 = R.id.transcoded_suffix_info_sector;
        if (((LinearLayout) uo.s(r1, R.id.transcoded_suffix_info_sector)) == null) goto L126;
        r2 = R.id.transcoded_suffix_key_sector;
        if (((TextView) uo.s(r1, R.id.transcoded_suffix_key_sector)) == null) goto L126;
        r2 = R.id.transcoded_suffix_value_sector;
        TextView r31 = (TextView) uo.s(r1, R.id.transcoded_suffix_value_sector);
        if (r31 == null) goto L126;
        r2 = R.id.year_info_sector;
        if (((LinearLayout) uo.s(r1, R.id.year_info_sector)) == null) goto L126;
        r2 = R.id.year_key_sector;
        if (((TextView) uo.s(r1, R.id.year_key_sector)) == null) goto L126;
        r2 = R.id.year_value_sector;
        TextView r32 = (TextView) uo.s(r1, R.id.year_value_sector);
        if (r32 == null) goto L126;
        this.B0 = new vp0((NestedScrollView) r1, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32);
        return new vg2(X(), 0).q(this.B0.a).l(R.string.track_info_dialog_positive_button, new wr(15)).create();
    L126:
        nz2.n("Missing required view with ID: ".concat(r1.getResources().getResourceName(r2)));
        return null;
    }

    public final void n0(View r3, ik r4) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (r4 != null) goto L7;
        l93.p(r3);
        r3.setOnClickListener(null);
        r3.setOnLongClickListener(null);
        r3.setClickable(false);
        r3.setLongClickable(false);
        return;
    L7:
        r3.setClickable(true);
        r3.setLongClickable(true);
        l93.g(r3);
        r3.setOnClickListener(new j8(27, this, r4));
        r3.setOnLongClickListener(new i8(7, this, r4));
    }
}
