package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
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

    public uv4(do2 do2Var) {
        this.C0 = do2Var;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void J() {
        super.J();
        this.B0 = null;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void R() {
        String string;
        int i;
        String strS;
        int i2;
        String strS2;
        int i3;
        String strS3;
        super.R();
        this.G0 = null;
        this.H0 = null;
        do2 do2Var = this.C0;
        Bundle bundle = do2Var.I;
        Bundle bundle2 = do2Var.I;
        CharSequence charSequence = do2Var.b;
        boolean zEquals = Objects.equals(bundle != null ? bundle.getString("type") : null, WaveOrigin.RADIO);
        if (zEquals) {
            String string2 = bundle != null ? bundle.getString("stationName", charSequence != null ? String.valueOf(charSequence) : "") : charSequence != null ? String.valueOf(charSequence) : "";
            String string3 = bundle != null ? bundle.getString("radioArtist", "") : "";
            String string4 = bundle != null ? bundle.getString("radioTitle", "") : "";
            if (!TextUtils.isEmpty(string3) && !TextUtils.isEmpty(string4)) {
                string3 = b11.o(string3, " - ", string4);
            } else if (!TextUtils.isEmpty(string4)) {
                string3 = string4;
            } else if (TextUtils.isEmpty(string3)) {
                string3 = string2;
            }
            this.B0.v.setText(string3);
            this.B0.u.setText(string2);
        } else {
            this.B0.v.setText(do2Var.a);
            TextView textView = this.B0.u;
            if (charSequence == null) {
                charSequence = "";
            }
            textView.setText(charSequence);
        }
        if (bundle != null) {
            this.D0 = l93.h("song", bundle.getString("id"));
            this.E0 = l93.h("album", bundle.getString("albumId"));
            this.F0 = l93.h("artist", bundle.getString("artistId"));
            String string5 = bundle.getString("assetLinkGenre");
            this.G0 = TextUtils.isEmpty(string5) ? null : l93.S(Uri.parse(string5));
            String string6 = bundle.getString("assetLinkYear");
            this.H0 = TextUtils.isEmpty(string6) ? null : l93.S(Uri.parse(string6));
            Context contextZ = Z();
            String string7 = bundle.getString("coverArtId", "");
            vz3 vz3VarT = b11.g(contextZ, string7, 9, a.c(contextZ), string7 != null ? wg0.b(ud3.t(), string7) : null).T(xv0.b());
            if (ud3.R()) {
                vz3VarT = (vz3) vz3VarT.l();
            }
            vz3VarT.K(this.B0.s);
            ImageView imageView = this.B0.s;
            ik ikVar = this.E0;
            if (ikVar == null) {
                ikVar = this.D0;
            }
            n0(imageView, ikVar);
            n0(this.B0.v, this.D0);
            TextView textView2 = this.B0.u;
            ik ikVar2 = this.F0;
            if (ikVar2 == null) {
                ikVar2 = this.D0;
            }
            n0(textView2, ikVar2);
            String string8 = bundle.getString("title", s(R.string.label_placeholder));
            String string9 = bundle.getString("album", s(R.string.label_placeholder));
            String string10 = bundle.getString("artist", s(R.string.label_placeholder));
            String string11 = bundle.getString("genre", s(R.string.label_placeholder));
            int i4 = bundle.getInt("year", 0);
            if (zEquals) {
                String string12 = bundle.getString("stationName", s(R.string.label_placeholder));
                String string13 = bundle.getString("radioArtist", "");
                String string14 = bundle.getString("radioTitle", "");
                this.B0.o.setVisibility(0);
                this.B0.p.setText(string12);
                if (!TextUtils.isEmpty(string14)) {
                    string8 = string14;
                }
                if (!TextUtils.isEmpty(string13)) {
                    string10 = string13;
                }
            } else {
                this.B0.o.setVisibility(8);
            }
            if (this.G0 == null && string11 != null && !string11.isEmpty() && !s(R.string.label_placeholder).contentEquals(string11)) {
                this.G0 = l93.h("genre", string11);
            }
            if (this.H0 == null && i4 != 0) {
                this.H0 = l93.h("year", String.valueOf(i4));
            }
            this.B0.r.setText(string8);
            this.B0.b.setText(string9);
            this.B0.c.setText(string10);
            TextView textView3 = this.B0.t;
            if (bundle.getInt("track", 0) != 0) {
                strS = String.valueOf(bundle.getInt("track", 0));
                i = R.string.label_placeholder;
            } else {
                i = R.string.label_placeholder;
                strS = s(R.string.label_placeholder);
            }
            textView3.setText(strS);
            this.B0.z.setText(i4 != 0 ? String.valueOf(i4) : s(i));
            this.B0.i.setText(string11);
            TextView textView4 = this.B0.l;
            if (bundle.getLong("size", 0L) != 0) {
                long j = bundle.getLong("size", 0L);
                Pattern pattern = e03.a;
                long jAbs = j == Long.MIN_VALUE ? Long.MAX_VALUE : Math.abs(j);
                if (jAbs < 1024) {
                    strS2 = j + " B";
                } else {
                    StringCharacterIterator stringCharacterIterator = new StringCharacterIterator("KMGTPE");
                    long j2 = jAbs;
                    for (int i5 = 40; i5 >= 0 && jAbs > (1152865209611504844 >> i5); i5 -= 10) {
                        j2 >>= 10;
                        stringCharacterIterator.next();
                    }
                    strS2 = String.format("%.1f %ciB", Double.valueOf((j2 * ((long) Long.signum(j))) / 1024.0d), Character.valueOf(stringCharacterIterator.current()));
                }
                i2 = R.string.label_placeholder;
            } else {
                i2 = R.string.label_placeholder;
                strS2 = s(R.string.label_placeholder);
            }
            textView4.setText(strS2);
            this.B0.f.setText(bundle.getString("contentType", s(i2)));
            this.B0.q.setText(bundle.getString("suffix", s(i2)));
            this.B0.x.setText(bundle.getString("transcodedContentType", s(i2)));
            this.B0.y.setText(bundle.getString("transcodedSuffix", s(i2)));
            this.B0.h.setText(bundle.getInt("duration", 0) != 0 ? e03.g(Integer.valueOf(bundle.getInt("duration", 0))) : s(R.string.label_placeholder));
            this.B0.e.setText(bundle.getInt("bitrate", 0) != 0 ? bundle.getInt("bitrate", 0) + " kbps" : s(R.string.label_placeholder));
            this.B0.k.setText(bundle.getInt("samplingRate", 0) != 0 ? bundle.getInt("samplingRate", 0) + " Hz" : s(R.string.label_placeholder));
            TextView textView5 = this.B0.d;
            if (bundle.getInt("bitDepth", 0) != 0) {
                strS3 = bundle.getInt("bitDepth", 0) + " bits";
                i3 = R.string.label_placeholder;
            } else {
                i3 = R.string.label_placeholder;
                strS3 = s(R.string.label_placeholder);
            }
            textView5.setText(strS3);
            this.B0.j.setText(bundle.getString("path", s(i3)));
            this.B0.g.setText(bundle.getInt("discNumber", 0) != 0 ? String.valueOf(bundle.getInt("discNumber", 0)) : s(i3));
            n0(this.B0.r, this.D0);
            n0(this.B0.b, this.E0);
            n0(this.B0.c, this.F0);
            n0(this.B0.i, this.G0);
            n0(this.B0.z, this.H0);
        }
        StringBuilder sb = new StringBuilder();
        boolean zU = ud3.U();
        String strQ = e03.q(e03.d());
        int iD = e03.d();
        if (Integer.parseInt(e03.b(iD, e03.q(iD))) != 0) {
            StringBuilder sb2 = new StringBuilder();
            int iD2 = e03.d();
            sb2.append(Integer.parseInt(e03.b(iD2, e03.q(iD2))));
            sb2.append("kbps");
            string = sb2.toString();
        } else {
            string = "Original";
        }
        if (bundle2 != null && bundle2.getString("uri", "").contains("rest/download")) {
            sb.append(s(R.string.track_info_summary_downloaded_file));
            this.B0.w.setText(sb);
        } else if (zU) {
            sb.append(s(R.string.track_info_summary_server_prioritized));
            this.B0.w.setText(sb);
        } else if (!zU && strQ.equals("raw") && string.equals("Original")) {
            sb.append(s(R.string.track_info_summary_original_file));
            this.B0.w.setText(sb);
        } else if (!zU && !strQ.equals("raw") && string.equals("Original")) {
            sb.append(t(R.string.track_info_summary_transcoding_codec, strQ));
            this.B0.w.setText(sb);
        } else if (!zU && strQ.equals("raw") && !string.equals("Original")) {
            sb.append(t(R.string.track_info_summary_transcoding_bitrate, string));
            this.B0.w.setText(sb);
        } else if (!zU && !strQ.equals("raw") && !string.equals("Original")) {
            sb.append(t(R.string.track_info_summary_full_transcode, strQ, string));
            this.B0.w.setText(sb);
        }
        if (bundle2 == null) {
            return;
        }
        String string15 = bundle2.getString("id");
        d7 d7Var = new d7(6, this);
        Map map = jt1.a;
        if (string15 == null || string15.length() == 0) {
            return;
        }
        io1.a.execute(new it1(string15, d7Var));
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle bundle) {
        View viewInflate = o().inflate(R.layout.dialog_track_info, (ViewGroup) null, false);
        int i = R.id.album_info_sector;
        if (((LinearLayout) uo.s(viewInflate, R.id.album_info_sector)) != null) {
            i = R.id.album_key_sector;
            if (((TextView) uo.s(viewInflate, R.id.album_key_sector)) != null) {
                i = R.id.album_value_sector;
                TextView textView = (TextView) uo.s(viewInflate, R.id.album_value_sector);
                if (textView != null) {
                    i = R.id.artist_info_sector;
                    if (((LinearLayout) uo.s(viewInflate, R.id.artist_info_sector)) != null) {
                        i = R.id.artist_key_sector;
                        if (((TextView) uo.s(viewInflate, R.id.artist_key_sector)) != null) {
                            i = R.id.artist_value_sector;
                            TextView textView2 = (TextView) uo.s(viewInflate, R.id.artist_value_sector);
                            if (textView2 != null) {
                                i = R.id.bit_depth_info_sector;
                                if (((LinearLayout) uo.s(viewInflate, R.id.bit_depth_info_sector)) != null) {
                                    i = R.id.bit_depth_key_sector;
                                    if (((TextView) uo.s(viewInflate, R.id.bit_depth_key_sector)) != null) {
                                        i = R.id.bit_depth_value_sector;
                                        TextView textView3 = (TextView) uo.s(viewInflate, R.id.bit_depth_value_sector);
                                        if (textView3 != null) {
                                            i = R.id.bitrate_info_sector;
                                            if (((LinearLayout) uo.s(viewInflate, R.id.bitrate_info_sector)) != null) {
                                                i = R.id.bitrate_key_sector;
                                                if (((TextView) uo.s(viewInflate, R.id.bitrate_key_sector)) != null) {
                                                    i = R.id.bitrate_value_sector;
                                                    TextView textView4 = (TextView) uo.s(viewInflate, R.id.bitrate_value_sector);
                                                    if (textView4 != null) {
                                                        i = R.id.content_type_info_sector;
                                                        if (((LinearLayout) uo.s(viewInflate, R.id.content_type_info_sector)) != null) {
                                                            i = R.id.content_type_key_sector;
                                                            if (((TextView) uo.s(viewInflate, R.id.content_type_key_sector)) != null) {
                                                                i = R.id.content_type_value_sector;
                                                                TextView textView5 = (TextView) uo.s(viewInflate, R.id.content_type_value_sector);
                                                                if (textView5 != null) {
                                                                    i = R.id.disc_number_info_sector;
                                                                    if (((LinearLayout) uo.s(viewInflate, R.id.disc_number_info_sector)) != null) {
                                                                        i = R.id.disc_number_key_sector;
                                                                        if (((TextView) uo.s(viewInflate, R.id.disc_number_key_sector)) != null) {
                                                                            i = R.id.disc_number_value_sector;
                                                                            TextView textView6 = (TextView) uo.s(viewInflate, R.id.disc_number_value_sector);
                                                                            if (textView6 != null) {
                                                                                i = R.id.duration_info_sector;
                                                                                if (((LinearLayout) uo.s(viewInflate, R.id.duration_info_sector)) != null) {
                                                                                    i = R.id.duration_key_sector;
                                                                                    if (((TextView) uo.s(viewInflate, R.id.duration_key_sector)) != null) {
                                                                                        i = R.id.duration_value_sector;
                                                                                        TextView textView7 = (TextView) uo.s(viewInflate, R.id.duration_value_sector);
                                                                                        if (textView7 != null) {
                                                                                            i = R.id.genre_info_sector;
                                                                                            if (((LinearLayout) uo.s(viewInflate, R.id.genre_info_sector)) != null) {
                                                                                                i = R.id.genre_key_sector;
                                                                                                if (((TextView) uo.s(viewInflate, R.id.genre_key_sector)) != null) {
                                                                                                    i = R.id.genre_value_sector;
                                                                                                    TextView textView8 = (TextView) uo.s(viewInflate, R.id.genre_value_sector);
                                                                                                    if (textView8 != null) {
                                                                                                        i = R.id.path_info_sector;
                                                                                                        if (((LinearLayout) uo.s(viewInflate, R.id.path_info_sector)) != null) {
                                                                                                            i = R.id.path_key_sector;
                                                                                                            if (((TextView) uo.s(viewInflate, R.id.path_key_sector)) != null) {
                                                                                                                i = R.id.path_value_sector;
                                                                                                                TextView textView9 = (TextView) uo.s(viewInflate, R.id.path_value_sector);
                                                                                                                if (textView9 != null) {
                                                                                                                    i = R.id.sampling_rate_info_sector;
                                                                                                                    if (((LinearLayout) uo.s(viewInflate, R.id.sampling_rate_info_sector)) != null) {
                                                                                                                        i = R.id.sampling_rate_key_sector;
                                                                                                                        if (((TextView) uo.s(viewInflate, R.id.sampling_rate_key_sector)) != null) {
                                                                                                                            i = R.id.sampling_rate_value_sector;
                                                                                                                            TextView textView10 = (TextView) uo.s(viewInflate, R.id.sampling_rate_value_sector);
                                                                                                                            if (textView10 != null) {
                                                                                                                                i = R.id.size_info_sector;
                                                                                                                                if (((LinearLayout) uo.s(viewInflate, R.id.size_info_sector)) != null) {
                                                                                                                                    i = R.id.size_key_sector;
                                                                                                                                    if (((TextView) uo.s(viewInflate, R.id.size_key_sector)) != null) {
                                                                                                                                        i = R.id.size_value_sector;
                                                                                                                                        TextView textView11 = (TextView) uo.s(viewInflate, R.id.size_value_sector);
                                                                                                                                        if (textView11 != null) {
                                                                                                                                            i = R.id.source_info_sector;
                                                                                                                                            LinearLayout linearLayout = (LinearLayout) uo.s(viewInflate, R.id.source_info_sector);
                                                                                                                                            if (linearLayout != null) {
                                                                                                                                                i = R.id.source_key_sector;
                                                                                                                                                if (((TextView) uo.s(viewInflate, R.id.source_key_sector)) != null) {
                                                                                                                                                    i = R.id.source_value_sector;
                                                                                                                                                    TextView textView12 = (TextView) uo.s(viewInflate, R.id.source_value_sector);
                                                                                                                                                    if (textView12 != null) {
                                                                                                                                                        i = R.id.station_info_sector;
                                                                                                                                                        LinearLayout linearLayout2 = (LinearLayout) uo.s(viewInflate, R.id.station_info_sector);
                                                                                                                                                        if (linearLayout2 != null) {
                                                                                                                                                            i = R.id.station_key_sector;
                                                                                                                                                            if (((TextView) uo.s(viewInflate, R.id.station_key_sector)) != null) {
                                                                                                                                                                i = R.id.station_value_sector;
                                                                                                                                                                TextView textView13 = (TextView) uo.s(viewInflate, R.id.station_value_sector);
                                                                                                                                                                if (textView13 != null) {
                                                                                                                                                                    i = R.id.suffix_info_sector;
                                                                                                                                                                    if (((LinearLayout) uo.s(viewInflate, R.id.suffix_info_sector)) != null) {
                                                                                                                                                                        i = R.id.suffix_key_sector;
                                                                                                                                                                        if (((TextView) uo.s(viewInflate, R.id.suffix_key_sector)) != null) {
                                                                                                                                                                            i = R.id.suffix_value_sector;
                                                                                                                                                                            TextView textView14 = (TextView) uo.s(viewInflate, R.id.suffix_value_sector);
                                                                                                                                                                            if (textView14 != null) {
                                                                                                                                                                                i = R.id.title_info_sector;
                                                                                                                                                                                if (((LinearLayout) uo.s(viewInflate, R.id.title_info_sector)) != null) {
                                                                                                                                                                                    i = R.id.title_key_sector;
                                                                                                                                                                                    if (((TextView) uo.s(viewInflate, R.id.title_key_sector)) != null) {
                                                                                                                                                                                        i = R.id.title_value_sector;
                                                                                                                                                                                        TextView textView15 = (TextView) uo.s(viewInflate, R.id.title_value_sector);
                                                                                                                                                                                        if (textView15 != null) {
                                                                                                                                                                                            i = R.id.track_cover_info_image_view;
                                                                                                                                                                                            ImageView imageView = (ImageView) uo.s(viewInflate, R.id.track_cover_info_image_view);
                                                                                                                                                                                            if (imageView != null) {
                                                                                                                                                                                                i = R.id.track_number_info_sector;
                                                                                                                                                                                                if (((LinearLayout) uo.s(viewInflate, R.id.track_number_info_sector)) != null) {
                                                                                                                                                                                                    i = R.id.track_number_key_sector;
                                                                                                                                                                                                    if (((TextView) uo.s(viewInflate, R.id.track_number_key_sector)) != null) {
                                                                                                                                                                                                        i = R.id.track_number_value_sector;
                                                                                                                                                                                                        TextView textView16 = (TextView) uo.s(viewInflate, R.id.track_number_value_sector);
                                                                                                                                                                                                        if (textView16 != null) {
                                                                                                                                                                                                            i = R.id.trak_artist_info_text_view;
                                                                                                                                                                                                            TextView textView17 = (TextView) uo.s(viewInflate, R.id.trak_artist_info_text_view);
                                                                                                                                                                                                            if (textView17 != null) {
                                                                                                                                                                                                                i = R.id.trak_title_info_text_view;
                                                                                                                                                                                                                TextView textView18 = (TextView) uo.s(viewInflate, R.id.trak_title_info_text_view);
                                                                                                                                                                                                                if (textView18 != null) {
                                                                                                                                                                                                                    i = R.id.trak_transcoding_info_text_view;
                                                                                                                                                                                                                    TextView textView19 = (TextView) uo.s(viewInflate, R.id.trak_transcoding_info_text_view);
                                                                                                                                                                                                                    if (textView19 != null) {
                                                                                                                                                                                                                        i = R.id.transcoded_content_type_info_sector;
                                                                                                                                                                                                                        if (((LinearLayout) uo.s(viewInflate, R.id.transcoded_content_type_info_sector)) != null) {
                                                                                                                                                                                                                            i = R.id.transcoded_content_type_key_sector;
                                                                                                                                                                                                                            if (((TextView) uo.s(viewInflate, R.id.transcoded_content_type_key_sector)) != null) {
                                                                                                                                                                                                                                i = R.id.transcoded_content_type_value_sector;
                                                                                                                                                                                                                                TextView textView20 = (TextView) uo.s(viewInflate, R.id.transcoded_content_type_value_sector);
                                                                                                                                                                                                                                if (textView20 != null) {
                                                                                                                                                                                                                                    i = R.id.transcoded_suffix_info_sector;
                                                                                                                                                                                                                                    if (((LinearLayout) uo.s(viewInflate, R.id.transcoded_suffix_info_sector)) != null) {
                                                                                                                                                                                                                                        i = R.id.transcoded_suffix_key_sector;
                                                                                                                                                                                                                                        if (((TextView) uo.s(viewInflate, R.id.transcoded_suffix_key_sector)) != null) {
                                                                                                                                                                                                                                            i = R.id.transcoded_suffix_value_sector;
                                                                                                                                                                                                                                            TextView textView21 = (TextView) uo.s(viewInflate, R.id.transcoded_suffix_value_sector);
                                                                                                                                                                                                                                            if (textView21 != null) {
                                                                                                                                                                                                                                                i = R.id.year_info_sector;
                                                                                                                                                                                                                                                if (((LinearLayout) uo.s(viewInflate, R.id.year_info_sector)) != null) {
                                                                                                                                                                                                                                                    i = R.id.year_key_sector;
                                                                                                                                                                                                                                                    if (((TextView) uo.s(viewInflate, R.id.year_key_sector)) != null) {
                                                                                                                                                                                                                                                        i = R.id.year_value_sector;
                                                                                                                                                                                                                                                        TextView textView22 = (TextView) uo.s(viewInflate, R.id.year_value_sector);
                                                                                                                                                                                                                                                        if (textView22 != null) {
                                                                                                                                                                                                                                                            this.B0 = new vp0((NestedScrollView) viewInflate, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, linearLayout, textView12, linearLayout2, textView13, textView14, textView15, imageView, textView16, textView17, textView18, textView19, textView20, textView21, textView22);
                                                                                                                                                                                                                                                            return new vg2(X(), 0).q(this.B0.a).l(R.string.track_info_dialog_positive_button, new wr(15)).create();
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public final void n0(View view, ik ikVar) {
        if (view == null) {
            return;
        }
        if (ikVar == null) {
            l93.p(view);
            view.setOnClickListener(null);
            view.setOnLongClickListener(null);
            view.setClickable(false);
            view.setLongClickable(false);
            return;
        }
        view.setClickable(true);
        view.setLongClickable(true);
        l93.g(view);
        view.setOnClickListener(new j8(27, this, ikVar));
        view.setOnLongClickListener(new i8(7, this, ikVar));
    }
}
