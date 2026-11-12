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
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zd0 extends dw3 {
    public final /* synthetic */ int q;
    public List r;
    public Object s;

    public zd0(LoginFragment loginFragment) {
        this.q = 8;
        this.s = loginFragment;
        this.r = new ArrayList();
    }

    @Override // defpackage.dw3
    public final int a() {
        switch (this.q) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return this.r.size();
    }

    /* JADX WARN: Code duplicated, block: B:75:0x026b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0280  */
    @Override // defpackage.dw3
    public final void g(cx3 cx3Var, int i) {
        ko1 ko1Var;
        switch (this.q) {
            case 0:
                yd0 yd0Var = (yd0) cx3Var;
                sp3 sp3Var = (sp3) this.r.get(i);
                z40 z40Var = yd0Var.u;
                TextView textView = (TextView) z40Var.r;
                ImageView imageView = (ImageView) z40Var.p;
                String str = sp3Var.c;
                String str2 = sp3Var.g;
                textView.setText(str);
                ((TextView) z40Var.o).setText(sp3Var.d);
                TextView textView2 = (TextView) z40Var.q;
                View view = yd0Var.a;
                Context context = view.getContext();
                long j = sp3Var.b / 1000;
                long j2 = j / 3600;
                long j3 = (j % 3600) / 60;
                long j4 = j % 60;
                textView2.setText(context.getString(R.string.home_continue_listening_resume_at, j2 > 0 ? String.format(Locale.US, "%d:%02d:%02d", Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)) : String.format(Locale.US, "%d:%02d", Long.valueOf(j3), Long.valueOf(j4))));
                if (str2 == null) {
                    imageView.setImageResource(R.drawable.ic_placeholder_album);
                } else {
                    Context context2 = view.getContext();
                    vz3 vz3VarT = b11.g(context2, str2, 2, a.c(context2), wg0.b(ud3.t(), str2)).T(xv0.b());
                    if (ud3.R()) {
                        vz3VarT = (vz3) vz3VarT.l();
                    }
                    vz3VarT.K(imageView);
                }
                break;
            case 1:
                ((TextView) ((dh1) cx3Var).u.o).setText(((Genre) this.r.get(i)).getGenre());
                break;
            case 2:
                z02 z02Var = (z02) cx3Var;
                InternetRadioStation internetRadioStation = (InternetRadioStation) this.r.get(i);
                lv4 lv4Var = z02Var.u;
                View view2 = z02Var.a;
                ((TextView) lv4Var.t).setText(internetRadioStation.getName());
                TextView textView3 = (TextView) lv4Var.s;
                TextView textView4 = (TextView) lv4Var.p;
                ImageView imageView2 = (ImageView) lv4Var.q;
                textView3.setText(internetRadioStation.getStreamUrl());
                if (internetRadioStation.getId() == null || !internetRadioStation.getId().startsWith("local_")) {
                    textView4.setVisibility(8);
                } else {
                    textView4.setVisibility(0);
                }
                if (internetRadioStation.getId() != null) {
                    File fileE = xt3.e(internetRadioStation.getId());
                    if (fileE.exists()) {
                        ((vz3) a.c(view2.getContext()).s(fileE).a(wg0.a(8, view2.getContext(), internetRadioStation.getId())).w(new s73(Long.valueOf(fileE.lastModified())))).T(xv0.b()).K(imageView2);
                    }
                }
                if (internetRadioStation.getCoverArt() == null || internetRadioStation.getCoverArt().isEmpty()) {
                    String homePageUrl = internetRadioStation.getHomePageUrl();
                    if (homePageUrl == null || homePageUrl.isEmpty() || !e03.n(homePageUrl)) {
                        a.c(view2.getContext()).t(null).a(wg0.a(8, view2.getContext(), null)).K(imageView2);
                    } else {
                        a.c(view2.getContext()).t(homePageUrl).a(wg0.a(8, view2.getContext(), homePageUrl)).T(xv0.b()).K(imageView2);
                    }
                } else {
                    Context context3 = view2.getContext();
                    String coverArt = internetRadioStation.getCoverArt();
                    vz3 vz3VarT2 = b11.g(context3, coverArt, 8, a.c(context3), coverArt != null ? wg0.b(ud3.t(), coverArt) : null).T(xv0.b());
                    if (ud3.R()) {
                        vz3VarT2 = (vz3) vz3VarT2.l();
                    }
                    vz3VarT2.K(imageView2);
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                yz2 yz2Var = (yz2) cx3Var;
                Child child = (Child) this.r.get(i);
                z12 z12Var = yz2Var.u;
                z12Var.e.setText(child.getTitle());
                int i2 = child.isDir() ? 5 : 9;
                Context context4 = yz2Var.a.getContext();
                String coverArtId = child.getCoverArtId();
                vz3 vz3VarT3 = b11.g(context4, coverArtId, i2, a.c(context4), coverArtId != null ? wg0.b(ud3.t(), coverArtId) : null).T(xv0.b());
                if (ud3.R()) {
                    vz3VarT3 = (vz3) vz3VarT3.l();
                }
                ImageView imageView3 = z12Var.b;
                ImageView imageView4 = z12Var.c;
                vz3VarT3.K(imageView3);
                imageView4.setVisibility(child.isDir() ? 0 : 4);
                z12Var.d.setVisibility(child.isDir() ? 0 : 4);
                boolean zIsDir = child.isDir();
                ko1 ko1Var2 = ko1.p;
                ko1 ko1Var3 = ko1.n;
                if (zIsDir) {
                    ko1Var = ko1Var3;
                } else {
                    Context context5 = imageView4.getContext();
                    context5.getClass();
                    if (ud3.o() == null) {
                        eu0 eu0VarW = au0.w(context5);
                        String id = child.getId();
                        eu0VarW.getClass();
                        Integer numC = eu0.c(id);
                        if (numC == null || numC.intValue() == 4 || numC.intValue() == 5) {
                            ko1Var = ko1Var3;
                        } else if (numC.intValue() == 3) {
                            ko1Var = ko1Var2;
                        } else {
                            ko1Var = ko1.o;
                        }
                    } else if (g51.e(child) != null) {
                        ko1Var = ko1Var2;
                    } else {
                        ko1Var = ko1Var3;
                    }
                }
                if (ko1Var != ko1Var3) {
                    int i3 = (int) (2.0f * imageView4.getResources().getDisplayMetrics().density);
                    imageView4.setBackground(null);
                    imageView4.setPadding(i3, i3, i3, i3);
                    imageView4.setImageResource(ko1Var == ko1Var2 ? R.drawable.ic_homemusic_on_phone : R.drawable.ic_homemusic_to_phone);
                    imageView4.setContentDescription(imageView4.getContext().getString(ko1Var == ko1Var2 ? R.string.homemusic_downloaded_on_phone : R.string.homemusic_downloading_to_phone));
                    imageView4.setVisibility(0);
                } else {
                    imageView4.setImageDrawable(null);
                    imageView4.setPadding(0, 0, 0, 0);
                    imageView4.setBackground(imageView4.getContext().getDrawable(R.drawable.ic_navigate_next));
                    imageView4.setContentDescription(null);
                }
                break;
            case 4:
                nl3 nl3Var = (nl3) cx3Var;
                Playlist playlist = (Playlist) this.r.get(i);
                z05 z05Var = nl3Var.u;
                ((TextView) z05Var.q).setText(playlist.getName());
                ((TextView) z05Var.p).setText(nl3Var.a.getContext().getString(R.string.playlist_counted_tracks, Integer.valueOf(playlist.getSongCount()), e03.h(Long.valueOf(playlist.getDuration()), false)));
                break;
            case 5:
                ol3 ol3Var = (ol3) cx3Var;
                Child child2 = (Child) this.r.get(i);
                lv4 lv4Var2 = ol3Var.u;
                ((TextView) lv4Var2.t).setText(child2.getTitle());
                ((TextView) lv4Var2.p).setText(child2.getArtist());
                ((TextView) lv4Var2.q).setText(e03.g(child2.getDuration()));
                Context context6 = ol3Var.a.getContext();
                String coverArtId2 = child2.getCoverArtId();
                vz3 vz3VarT4 = b11.g(context6, coverArtId2, 9, a.c(context6), coverArtId2 != null ? wg0.b(ud3.t(), coverArtId2) : null).T(xv0.b());
                if (ud3.R()) {
                    vz3VarT4 = (vz3) vz3VarT4.l();
                }
                vz3VarT4.K((ImageView) lv4Var2.o);
                break;
            case 6:
                zm3 zm3Var = (zm3) cx3Var;
                PodcastChannel podcastChannel = (PodcastChannel) this.r.get(i);
                z40 z40Var2 = zm3Var.u;
                ((TextView) z40Var2.r).setText(podcastChannel.getTitle());
                TextView textView5 = (TextView) z40Var2.p;
                String description = podcastChannel.getDescription();
                Pattern pattern = e03.a;
                textView5.setText(description != null ? Html.fromHtml(description, 63).toString() : "");
                Context context7 = zm3Var.a.getContext();
                String coverArtId3 = podcastChannel.getCoverArtId();
                vz3 vz3VarT5 = b11.g(context7, coverArtId3, 7, a.c(context7), coverArtId3 != null ? wg0.b(ud3.t(), coverArtId3) : null).T(xv0.b());
                if (ud3.R()) {
                    vz3VarT5 = (vz3) vz3VarT5.l();
                }
                vz3VarT5.K((ImageView) z40Var2.o);
                break;
            case 7:
                du3 du3Var = (du3) cx3Var;
                RadioBrowserStation radioBrowserStation = (RadioBrowserStation) this.r.get(i);
                na4 na4Var = du3Var.u;
                View view3 = du3Var.a;
                ((TextView) na4Var.q).setText(radioBrowserStation.name);
                StringBuilder sb = new StringBuilder();
                String str3 = radioBrowserStation.country;
                if (str3 != null && !str3.isEmpty()) {
                    sb.append(radioBrowserStation.country);
                }
                String str4 = radioBrowserStation.codec;
                if (str4 != null && !str4.isEmpty()) {
                    if (sb.length() > 0) {
                        sb.append(" · ");
                    }
                    sb.append(radioBrowserStation.codec);
                }
                if (radioBrowserStation.bitrate > 0) {
                    if (sb.length() > 0) {
                        sb.append(" · ");
                    }
                    sb.append(radioBrowserStation.bitrate);
                    sb.append(" kbps");
                }
                TextView textView6 = (TextView) na4Var.p;
                MaterialButton materialButton = (MaterialButton) na4Var.n;
                ImageView imageView5 = (ImageView) na4Var.o;
                textView6.setText(sb.toString());
                String str5 = radioBrowserStation.favicon;
                if (str5 == null || str5.isEmpty()) {
                    imageView5.setImageDrawable(null);
                } else {
                    a.c(view3.getContext()).t(str5).a(wg0.a(8, view3.getContext(), str5)).K(imageView5);
                }
                materialButton.setText(R.string.radio_search_use);
                materialButton.setOnClickListener(new j8(21, this, radioBrowserStation));
                break;
            default:
                Server server = (Server) this.r.get(i);
                i61 i61Var = ((la4) cx3Var).u;
                ((TextView) i61Var.q).setText(server.getServerName());
                ((TextView) i61Var.p).setText(server.getAddress());
                break;
        }
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup viewGroup, int i) {
        boolean z = false;
        switch (this.q) {
            case 0:
                View viewI = b11.i(viewGroup, R.layout.item_home_continue_listening, viewGroup, false);
                int i2 = R.id.continue_listening_album_label;
                TextView textView = (TextView) uo.s(viewI, R.id.continue_listening_album_label);
                if (textView != null) {
                    i2 = R.id.continue_listening_cover_image_view;
                    ImageView imageView = (ImageView) uo.s(viewI, R.id.continue_listening_cover_image_view);
                    if (imageView != null) {
                        i2 = R.id.continue_listening_resume_label;
                        TextView textView2 = (TextView) uo.s(viewI, R.id.continue_listening_resume_label);
                        if (textView2 != null) {
                            i2 = R.id.continue_listening_title_label;
                            TextView textView3 = (TextView) uo.s(viewI, R.id.continue_listening_title_label);
                            if (textView3 != null) {
                                return new yd0(this, new z40((ConstraintLayout) viewI, textView, imageView, textView2, textView3));
                            }
                        }
                    }
                }
                nz2.n("Missing required view with ID: ".concat(viewI.getResources().getResourceName(i2)));
                return null;
            case 1:
                View viewI2 = b11.i(viewGroup, R.layout.item_library_genre, viewGroup, false);
                int i3 = R.id.card_view;
                if (((CardView) uo.s(viewI2, R.id.card_view)) != null) {
                    i3 = R.id.genre_label;
                    TextView textView4 = (TextView) uo.s(viewI2, R.id.genre_label);
                    if (textView4 != null) {
                        return new dh1(this, new rm3((LinearLayout) viewI2, textView4, z));
                    }
                }
                nz2.n("Missing required view with ID: ".concat(viewI2.getResources().getResourceName(i3)));
                return null;
            case 2:
                View viewI3 = b11.i(viewGroup, R.layout.item_home_internet_radio_station, viewGroup, false);
                int i4 = R.id.cover_image_separator;
                View viewS = uo.s(viewI3, R.id.cover_image_separator);
                if (viewS != null) {
                    i4 = R.id.internet_radio_station_cover_image_view;
                    ImageView imageView2 = (ImageView) uo.s(viewI3, R.id.internet_radio_station_cover_image_view);
                    if (imageView2 != null) {
                        i4 = R.id.internet_radio_station_local_badge;
                        TextView textView5 = (TextView) uo.s(viewI3, R.id.internet_radio_station_local_badge);
                        if (textView5 != null) {
                            i4 = R.id.internet_radio_station_more_button;
                            ImageView imageView3 = (ImageView) uo.s(viewI3, R.id.internet_radio_station_more_button);
                            if (imageView3 != null) {
                                i4 = R.id.internet_radio_station_subtitle_text_view;
                                TextView textView6 = (TextView) uo.s(viewI3, R.id.internet_radio_station_subtitle_text_view);
                                if (textView6 != null) {
                                    i4 = R.id.internet_radio_station_title_text_view;
                                    TextView textView7 = (TextView) uo.s(viewI3, R.id.internet_radio_station_title_text_view);
                                    if (textView7 != null) {
                                        return new z02(this, new lv4((ConstraintLayout) viewI3, viewS, imageView2, textView5, imageView3, textView6, textView7));
                                    }
                                }
                            }
                        }
                    }
                }
                nz2.n("Missing required view with ID: ".concat(viewI3.getResources().getResourceName(i4)));
                return null;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                View viewI4 = b11.i(viewGroup, R.layout.item_library_music_directory, viewGroup, false);
                int i5 = R.id.music_directory_cover_image_view;
                ImageView imageView4 = (ImageView) uo.s(viewI4, R.id.music_directory_cover_image_view);
                if (imageView4 != null) {
                    i5 = R.id.music_directory_more_button;
                    ImageView imageView5 = (ImageView) uo.s(viewI4, R.id.music_directory_more_button);
                    if (imageView5 != null) {
                        i5 = R.id.music_directory_play_button;
                        ImageView imageView6 = (ImageView) uo.s(viewI4, R.id.music_directory_play_button);
                        if (imageView6 != null) {
                            i5 = R.id.music_directory_title_text_view;
                            TextView textView8 = (TextView) uo.s(viewI4, R.id.music_directory_title_text_view);
                            if (textView8 != null) {
                                return new yz2(this, new z12((ConstraintLayout) viewI4, imageView4, imageView5, imageView6, textView8));
                            }
                        }
                    }
                }
                nz2.n("Missing required view with ID: ".concat(viewI4.getResources().getResourceName(i5)));
                return null;
            case 4:
                View viewI5 = b11.i(viewGroup, R.layout.item_horizontal_playlist_dialog, viewGroup, false);
                int i6 = R.id.playlist_dialog_count_text_view;
                TextView textView9 = (TextView) uo.s(viewI5, R.id.playlist_dialog_count_text_view);
                if (textView9 != null) {
                    i6 = R.id.playlist_dialog_title_text_view;
                    TextView textView10 = (TextView) uo.s(viewI5, R.id.playlist_dialog_title_text_view);
                    if (textView10 != null) {
                        return new nl3(this, new z05((ConstraintLayout) viewI5, textView9, textView10, 6));
                    }
                }
                nz2.n("Missing required view with ID: ".concat(viewI5.getResources().getResourceName(i6)));
                return null;
            case 5:
                View viewI6 = b11.i(viewGroup, R.layout.item_horizontal_playlist_dialog_track, viewGroup, false);
                int i7 = R.id.playlist_dialog_album_artist_text_view;
                TextView textView11 = (TextView) uo.s(viewI6, R.id.playlist_dialog_album_artist_text_view);
                if (textView11 != null) {
                    i7 = R.id.playlist_dialog_song_cover_image_view;
                    ImageView imageView7 = (ImageView) uo.s(viewI6, R.id.playlist_dialog_song_cover_image_view);
                    if (imageView7 != null) {
                        i7 = R.id.playlist_dialog_song_duration_text_view;
                        TextView textView12 = (TextView) uo.s(viewI6, R.id.playlist_dialog_song_duration_text_view);
                        if (textView12 != null) {
                            i7 = R.id.playlist_dialog_song_handle_button;
                            ImageView imageView8 = (ImageView) uo.s(viewI6, R.id.playlist_dialog_song_handle_button);
                            if (imageView8 != null) {
                                i7 = R.id.playlist_dialog_song_remove_button;
                                ImageView imageView9 = (ImageView) uo.s(viewI6, R.id.playlist_dialog_song_remove_button);
                                if (imageView9 != null) {
                                    i7 = R.id.playlist_dialog_song_title_text_view;
                                    TextView textView13 = (TextView) uo.s(viewI6, R.id.playlist_dialog_song_title_text_view);
                                    if (textView13 != null) {
                                        i7 = R.id.queue_separator_text_view;
                                        if (((TextView) uo.s(viewI6, R.id.queue_separator_text_view)) != null) {
                                            return new ol3(this, new lv4((ConstraintLayout) viewI6, textView11, imageView7, textView12, imageView8, imageView9, textView13));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                nz2.n("Missing required view with ID: ".concat(viewI6.getResources().getResourceName(i7)));
                return null;
            case 6:
                View viewI7 = b11.i(viewGroup, R.layout.item_horizontal_podcast_channel, viewGroup, false);
                int i8 = R.id.podcast_channel_cover_image_view;
                ImageView imageView10 = (ImageView) uo.s(viewI7, R.id.podcast_channel_cover_image_view);
                if (imageView10 != null) {
                    i8 = R.id.podcast_channel_description_text_view;
                    TextView textView14 = (TextView) uo.s(viewI7, R.id.podcast_channel_description_text_view);
                    if (textView14 != null) {
                        i8 = R.id.podcast_channel_more_button;
                        ImageView imageView11 = (ImageView) uo.s(viewI7, R.id.podcast_channel_more_button);
                        if (imageView11 != null) {
                            i8 = R.id.podcast_channel_title_text_view;
                            TextView textView15 = (TextView) uo.s(viewI7, R.id.podcast_channel_title_text_view);
                            if (textView15 != null) {
                                return new zm3(this, new z40((ConstraintLayout) viewI7, imageView10, textView14, imageView11, textView15));
                            }
                        }
                    }
                }
                nz2.n("Missing required view with ID: ".concat(viewI7.getResources().getResourceName(i8)));
                return null;
            case 7:
                View viewI8 = b11.i(viewGroup, R.layout.item_radio_search_result, viewGroup, false);
                int i9 = R.id.add_station_button;
                MaterialButton materialButton = (MaterialButton) uo.s(viewI8, R.id.add_station_button);
                if (materialButton != null) {
                    i9 = R.id.station_cover_image_view;
                    ImageView imageView12 = (ImageView) uo.s(viewI8, R.id.station_cover_image_view);
                    if (imageView12 != null) {
                        i9 = R.id.station_details_text_view;
                        TextView textView16 = (TextView) uo.s(viewI8, R.id.station_details_text_view);
                        if (textView16 != null) {
                            i9 = R.id.station_name_text_view;
                            TextView textView17 = (TextView) uo.s(viewI8, R.id.station_name_text_view);
                            if (textView17 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) viewI8;
                                na4 na4Var = new na4(constraintLayout, materialButton, imageView12, textView16, textView17);
                                du3 du3Var = new du3(constraintLayout);
                                du3Var.u = na4Var;
                                return du3Var;
                            }
                        }
                    }
                }
                nz2.n("Missing required view with ID: ".concat(viewI8.getResources().getResourceName(i9)));
                return null;
            default:
                View viewI9 = b11.i(viewGroup, R.layout.item_login_server, viewGroup, false);
                int i10 = R.id.server_address_text_view;
                TextView textView18 = (TextView) uo.s(viewI9, R.id.server_address_text_view);
                if (textView18 != null) {
                    i10 = R.id.server_name_text_view;
                    TextView textView19 = (TextView) uo.s(viewI9, R.id.server_name_text_view);
                    if (textView19 != null) {
                        return new la4(this, new i61((ConstraintLayout) viewI9, textView18, textView19, false, 7));
                    }
                }
                nz2.n("Missing required view with ID: ".concat(viewI9.getResources().getResourceName(i10)));
                return null;
        }
    }

    public /* synthetic */ zd0() {
        this.q = 0;
    }

    public zd0(LibraryFragment libraryFragment) {
        this.q = 1;
        this.s = libraryFragment;
        this.r = Collections.EMPTY_LIST;
    }

    public zd0(gp1 gp1Var) {
        this.q = 6;
        this.s = gp1Var;
        this.r = Collections.EMPTY_LIST;
    }

    public zd0(fl3 fl3Var) {
        this.q = 4;
        this.s = fl3Var;
        this.r = Collections.EMPTY_LIST;
    }

    public zd0(DirectoryFragment directoryFragment) {
        this.q = 3;
        this.s = directoryFragment;
        this.r = Collections.EMPTY_LIST;
    }

    public zd0(PlaylistEditorFragment playlistEditorFragment) {
        this.q = 5;
        this.s = playlistEditorFragment;
        this.r = Collections.EMPTY_LIST;
    }

    public zd0(hp1 hp1Var) {
        this.q = 2;
        this.s = hp1Var;
        this.r = Collections.EMPTY_LIST;
    }

    public zd0(ss2 ss2Var) {
        this.q = 7;
        this.r = Collections.EMPTY_LIST;
        this.s = ss2Var;
    }
}
