package com.eddyizm.tempus.ui.fragment.bottomsheetdialog;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Share;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.SongBottomSheetDialog;
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
import defpackage.cb4;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

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
    public boolean N0 = true;
    public bl2 O0;

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        final int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.bottom_sheet_song_dialog, viewGroup, false);
        Bundle bundle2 = this.s;
        if (bundle2 != null) {
            Child child = (Child) bundle2.getParcelable("TRACK_OBJECT");
            this.D0 = child;
            if (child != null) {
                this.E0 = bundle2.getBoolean("homemusic_song_sheet_from_player", false);
                nc1 nc1VarX = X();
                e75 e75VarD = nc1VarX.d();
                b75 b75VarR = gh0.r(nc1VarX);
                bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
                i30 i30VarA = kx3.a(b.class);
                String strB = i30VarA.b();
                if (strB == null) {
                    kf2.n("Local and anonymous classes can not be ViewModels");
                    return null;
                }
                this.B0 = (b) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                nc1 nc1VarX2 = X();
                e75 e75VarD2 = nc1VarX2.d();
                b75 b75VarR2 = gh0.r(nc1VarX2);
                bq4 bq4Var2 = new bq4(e75VarD2, b75VarR2, b11.e(nc1VarX2, b75VarR2));
                i30 i30VarA2 = kx3.a(ii4.class);
                String strB2 = i30VarA2.b();
                if (strB2 == null) {
                    kf2.n("Local and anonymous classes can not be ViewModels");
                    return null;
                }
                ii4 ii4Var = (ii4) bq4Var2.l(i30VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB2));
                this.C0 = ii4Var;
                ii4Var.h = this.D0;
                q05.u((ViewGroup) viewInflate.findViewById(R.id.option_linear_layout));
                ImageView imageView = (ImageView) viewInflate.findViewById(R.id.song_cover_image_view);
                Context contextZ = Z();
                String coverArtId = this.C0.h.getCoverArtId();
                final int i2 = 9;
                vz3 vz3VarT = b11.g(contextZ, coverArtId, 9, a.c(contextZ), coverArtId != null ? wg0.b(ud3.t(), coverArtId) : null).T(xv0.b());
                if (ud3.R()) {
                    vz3VarT = (vz3) vz3VarT.l();
                }
                vz3VarT.K(imageView);
                TextView textView = (TextView) viewInflate.findViewById(R.id.song_title_text_view);
                textView.setText(this.C0.h.getTitle());
                final int i3 = 1;
                textView.setSelected(true);
                TextView textView2 = (TextView) viewInflate.findViewById(R.id.song_artist_text_view);
                textView2.setText(this.C0.h.getArtist());
                this.H0 = (ChipGroup) viewInflate.findViewById(R.id.asset_link_chip_group);
                this.I0 = (Chip) viewInflate.findViewById(R.id.asset_link_song_chip);
                this.J0 = (Chip) viewInflate.findViewById(R.id.asset_link_album_chip);
                this.K0 = (Chip) viewInflate.findViewById(R.id.asset_link_artist_chip);
                this.L0 = o0(this.I0, "song", this.D0.getId());
                o0(this.J0, "album", this.D0.getAlbumId());
                this.M0 = o0(this.K0, "artist", this.D0.getArtistId());
                final int i4 = 8;
                if (this.H0 != null) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= this.H0.getChildCount()) {
                            z = false;
                            break;
                        }
                        if (this.H0.getChildAt(i5).getVisibility() == 0) {
                            z = true;
                            break;
                        }
                        i5++;
                    }
                    this.H0.setVisibility(z ? 0 : 8);
                }
                p0(imageView, this.L0);
                p0(textView, this.L0);
                ik ikVar = this.M0;
                if (ikVar == null) {
                    ikVar = this.L0;
                }
                p0(textView2, ikVar);
                ToggleButton toggleButton = (ToggleButton) viewInflate.findViewById(R.id.button_favorite);
                ot1.f(toggleButton, new ei4(0, this));
                toggleButton.setChecked(n61.f(1, this.C0.h.getId(), this.C0.h.getStarred() != null));
                toggleButton.setOnClickListener(new View.OnClickListener(this) { // from class: ci4
                    public final /* synthetic */ SongBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i6 = i4;
                        final int i7 = 0;
                        final int i8 = 1;
                        final SongBottomSheetDialog songBottomSheetDialog = this.o;
                        switch (i6) {
                            case 0:
                                bo2.f(songBottomSheetDialog.O0, songBottomSheetDialog.D0, true);
                                if (!songBottomSheetDialog.E0) {
                                    ((au) ((MainActivity) songBottomSheetDialog.X()).V.n).d(true);
                                }
                                songBottomSheetDialog.h0();
                                break;
                            case 1:
                                bo2.f(songBottomSheetDialog.O0, songBottomSheetDialog.D0, false);
                                if (!songBottomSheetDialog.E0) {
                                    ((au) ((MainActivity) songBottomSheetDialog.X()).V.n).d(true);
                                }
                                songBottomSheetDialog.h0();
                                break;
                            case 2:
                                Bundle bundle3 = new Bundle();
                                bundle3.putParcelable("TRACK_OBJECT", songBottomSheetDialog.D0);
                                ou3 ou3Var = new ou3();
                                ou3Var.c0(bundle3);
                                ou3Var.m0(songBottomSheetDialog.X().k(), null);
                                songBottomSheetDialog.h0();
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                if (ud3.o() == null) {
                                    au0.w(songBottomSheetDialog.Z()).e(gi1.G(songBottomSheetDialog.D0), new Download(songBottomSheetDialog.D0));
                                } else {
                                    g51.b(songBottomSheetDialog.D0);
                                }
                                songBottomSheetDialog.h0();
                                break;
                            case 4:
                                Bundle bundle4 = new Bundle();
                                bundle4.putParcelableArrayList("TRACKS_OBJECT", new ArrayList<>(Collections.singletonList(songBottomSheetDialog.D0)));
                                fl3 fl3Var = new fl3();
                                fl3Var.c0(bundle4);
                                fl3Var.m0(songBottomSheetDialog.X().k(), null);
                                songBottomSheetDialog.h0();
                                break;
                            case 5:
                                ii4 ii4Var2 = songBottomSheetDialog.C0;
                                rv2 rv2Var = ii4Var2.d;
                                String albumId = ii4Var2.h.getAlbumId();
                                rv2Var.getClass();
                                rv2.j(albumId).e(songBottomSheetDialog.v(), new a83() { // from class: di4
                                    @Override // defpackage.a83
                                    public final void b(Object obj) {
                                        int i9 = i8;
                                        SongBottomSheetDialog songBottomSheetDialog2 = songBottomSheetDialog;
                                        switch (i9) {
                                            case 0:
                                                Share share = (Share) obj;
                                                if (share == null) {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.share_unsupported_error), 0).show();
                                                    songBottomSheetDialog2.h0();
                                                } else {
                                                    ((ClipboardManager) songBottomSheetDialog2.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(songBottomSheetDialog2.s(R.string.app_name), share.getUrl()));
                                                    songBottomSheetDialog2.B0.g(songBottomSheetDialog2.X());
                                                    songBottomSheetDialog2.h0();
                                                }
                                                break;
                                            case 1:
                                                AlbumID3 albumID3 = (AlbumID3) obj;
                                                if (albumID3 != null) {
                                                    Bundle bundle5 = new Bundle();
                                                    bundle5.putParcelable("ALBUM_OBJECT", albumID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.albumPageFragment, bundle5, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_album), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                            default:
                                                ArtistID3 artistID3 = (ArtistID3) obj;
                                                if (artistID3 != null) {
                                                    Bundle bundle6 = new Bundle();
                                                    bundle6.putParcelable("ARTIST_OBJECT", artistID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.artistPageFragment, bundle6, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_artist), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 6:
                                ii4 ii4Var3 = songBottomSheetDialog.C0;
                                pa paVar = ii4Var3.e;
                                String artistId = ii4Var3.h.getArtistId();
                                paVar.getClass();
                                final int i9 = 2;
                                pa.v(artistId).e(songBottomSheetDialog.v(), new a83() { // from class: di4
                                    @Override // defpackage.a83
                                    public final void b(Object obj) {
                                        int i10 = i9;
                                        SongBottomSheetDialog songBottomSheetDialog2 = songBottomSheetDialog;
                                        switch (i10) {
                                            case 0:
                                                Share share = (Share) obj;
                                                if (share == null) {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.share_unsupported_error), 0).show();
                                                    songBottomSheetDialog2.h0();
                                                } else {
                                                    ((ClipboardManager) songBottomSheetDialog2.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(songBottomSheetDialog2.s(R.string.app_name), share.getUrl()));
                                                    songBottomSheetDialog2.B0.g(songBottomSheetDialog2.X());
                                                    songBottomSheetDialog2.h0();
                                                }
                                                break;
                                            case 1:
                                                AlbumID3 albumID3 = (AlbumID3) obj;
                                                if (albumID3 != null) {
                                                    Bundle bundle5 = new Bundle();
                                                    bundle5.putParcelable("ALBUM_OBJECT", albumID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.albumPageFragment, bundle5, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_album), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                            default:
                                                ArtistID3 artistID3 = (ArtistID3) obj;
                                                if (artistID3 != null) {
                                                    Bundle bundle6 = new Bundle();
                                                    bundle6.putParcelable("ARTIST_OBJECT", artistID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.artistPageFragment, bundle6, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_artist), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 7:
                                ii4 ii4Var4 = songBottomSheetDialog.C0;
                                hh3 hh3Var = ii4Var4.g;
                                String id = ii4Var4.h.getId();
                                String title = ii4Var4.h.getTitle();
                                hh3Var.getClass();
                                hh3.h(id, title).e(songBottomSheetDialog.v(), new a83() { // from class: di4
                                    @Override // defpackage.a83
                                    public final void b(Object obj) {
                                        int i10 = i7;
                                        SongBottomSheetDialog songBottomSheetDialog2 = songBottomSheetDialog;
                                        switch (i10) {
                                            case 0:
                                                Share share = (Share) obj;
                                                if (share == null) {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.share_unsupported_error), 0).show();
                                                    songBottomSheetDialog2.h0();
                                                } else {
                                                    ((ClipboardManager) songBottomSheetDialog2.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(songBottomSheetDialog2.s(R.string.app_name), share.getUrl()));
                                                    songBottomSheetDialog2.B0.g(songBottomSheetDialog2.X());
                                                    songBottomSheetDialog2.h0();
                                                }
                                                break;
                                            case 1:
                                                AlbumID3 albumID3 = (AlbumID3) obj;
                                                if (albumID3 != null) {
                                                    Bundle bundle5 = new Bundle();
                                                    bundle5.putParcelable("ALBUM_OBJECT", albumID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.albumPageFragment, bundle5, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_album), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                            default:
                                                ArtistID3 artistID3 = (ArtistID3) obj;
                                                if (artistID3 != null) {
                                                    Bundle bundle6 = new Bundle();
                                                    bundle6.putParcelable("ARTIST_OBJECT", artistID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.artistPageFragment, bundle6, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_artist), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 8:
                                ii4 ii4Var5 = songBottomSheetDialog.C0;
                                Context contextZ2 = songBottomSheetDialog.Z();
                                d34 d34Var = ii4Var5.f;
                                if (n61.f(1, ii4Var5.h.getId(), ii4Var5.h.getStarred() != null)) {
                                    boolean zT = hw.t();
                                    Child child2 = ii4Var5.h;
                                    if (!zT) {
                                        String id2 = child2.getId();
                                        hi4 hi4Var = new hi4(ii4Var5, child2, 0);
                                        d34Var.getClass();
                                        d34.K(id2, null, null, hi4Var);
                                        child2.setStarred(null);
                                    } else {
                                        d34Var.J(child2.getId(), null, false, null);
                                        child2.setStarred(null);
                                    }
                                    break;
                                } else {
                                    boolean zT2 = hw.t();
                                    Child child3 = ii4Var5.h;
                                    if (zT2) {
                                        d34Var.J(child3.getId(), null, true, null);
                                        child3.setStarred(new Date());
                                        break;
                                    } else {
                                        String id3 = child3.getId();
                                        hi4 hi4Var2 = new hi4(ii4Var5, child3, 1);
                                        d34Var.getClass();
                                        d34.I(id3, null, null, hi4Var2);
                                        child3.setStarred(new Date());
                                        if (ud3.X() && ud3.o() == null) {
                                            au0.w(contextZ2).b(gi1.G(child3), new Download(child3), false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                MainActivity mainActivity = (MainActivity) songBottomSheetDialog.e();
                                if (mainActivity != null) {
                                    bl2 bl2Var = mainActivity.P;
                                    if (bl2Var != null) {
                                        songBottomSheetDialog.N0 = true;
                                        Toast.makeText(songBottomSheetDialog.Z(), R.string.bottom_sheet_generating_instant_mix, 0).show();
                                        ii4 ii4Var6 = songBottomSheetDialog.C0;
                                        Child child4 = songBottomSheetDialog.D0;
                                        k03 k03Var = ii4Var6.i;
                                        k03Var.k(Collections.EMPTY_LIST);
                                        ii4Var6.c.o(child4.getId(), fb0.p, 30).e(mainActivity, new g7(k03Var, 0));
                                        k03Var.e(mainActivity, new z6(songBottomSheetDialog, bl2Var, mainActivity, 4));
                                    } else {
                                        Log.e("SongBottomSheetDialog", "MediaBrowser Future is null in MainActivity");
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                toggleButton.setOnLongClickListener(new q6(23, this));
                ((TextView) viewInflate.findViewById(R.id.play_radio_text_view)).setOnClickListener(new View.OnClickListener(this) { // from class: ci4
                    public final /* synthetic */ SongBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i6 = i2;
                        final int i7 = 0;
                        final int i8 = 1;
                        final SongBottomSheetDialog songBottomSheetDialog = this.o;
                        switch (i6) {
                            case 0:
                                bo2.f(songBottomSheetDialog.O0, songBottomSheetDialog.D0, true);
                                if (!songBottomSheetDialog.E0) {
                                    ((au) ((MainActivity) songBottomSheetDialog.X()).V.n).d(true);
                                }
                                songBottomSheetDialog.h0();
                                break;
                            case 1:
                                bo2.f(songBottomSheetDialog.O0, songBottomSheetDialog.D0, false);
                                if (!songBottomSheetDialog.E0) {
                                    ((au) ((MainActivity) songBottomSheetDialog.X()).V.n).d(true);
                                }
                                songBottomSheetDialog.h0();
                                break;
                            case 2:
                                Bundle bundle3 = new Bundle();
                                bundle3.putParcelable("TRACK_OBJECT", songBottomSheetDialog.D0);
                                ou3 ou3Var = new ou3();
                                ou3Var.c0(bundle3);
                                ou3Var.m0(songBottomSheetDialog.X().k(), null);
                                songBottomSheetDialog.h0();
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                if (ud3.o() == null) {
                                    au0.w(songBottomSheetDialog.Z()).e(gi1.G(songBottomSheetDialog.D0), new Download(songBottomSheetDialog.D0));
                                } else {
                                    g51.b(songBottomSheetDialog.D0);
                                }
                                songBottomSheetDialog.h0();
                                break;
                            case 4:
                                Bundle bundle4 = new Bundle();
                                bundle4.putParcelableArrayList("TRACKS_OBJECT", new ArrayList<>(Collections.singletonList(songBottomSheetDialog.D0)));
                                fl3 fl3Var = new fl3();
                                fl3Var.c0(bundle4);
                                fl3Var.m0(songBottomSheetDialog.X().k(), null);
                                songBottomSheetDialog.h0();
                                break;
                            case 5:
                                ii4 ii4Var2 = songBottomSheetDialog.C0;
                                rv2 rv2Var = ii4Var2.d;
                                String albumId = ii4Var2.h.getAlbumId();
                                rv2Var.getClass();
                                rv2.j(albumId).e(songBottomSheetDialog.v(), new a83() { // from class: di4
                                    @Override // defpackage.a83
                                    public final void b(Object obj) {
                                        int i10 = i8;
                                        SongBottomSheetDialog songBottomSheetDialog2 = songBottomSheetDialog;
                                        switch (i10) {
                                            case 0:
                                                Share share = (Share) obj;
                                                if (share == null) {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.share_unsupported_error), 0).show();
                                                    songBottomSheetDialog2.h0();
                                                } else {
                                                    ((ClipboardManager) songBottomSheetDialog2.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(songBottomSheetDialog2.s(R.string.app_name), share.getUrl()));
                                                    songBottomSheetDialog2.B0.g(songBottomSheetDialog2.X());
                                                    songBottomSheetDialog2.h0();
                                                }
                                                break;
                                            case 1:
                                                AlbumID3 albumID3 = (AlbumID3) obj;
                                                if (albumID3 != null) {
                                                    Bundle bundle5 = new Bundle();
                                                    bundle5.putParcelable("ALBUM_OBJECT", albumID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.albumPageFragment, bundle5, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_album), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                            default:
                                                ArtistID3 artistID3 = (ArtistID3) obj;
                                                if (artistID3 != null) {
                                                    Bundle bundle6 = new Bundle();
                                                    bundle6.putParcelable("ARTIST_OBJECT", artistID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.artistPageFragment, bundle6, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_artist), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 6:
                                ii4 ii4Var3 = songBottomSheetDialog.C0;
                                pa paVar = ii4Var3.e;
                                String artistId = ii4Var3.h.getArtistId();
                                paVar.getClass();
                                final int i9 = 2;
                                pa.v(artistId).e(songBottomSheetDialog.v(), new a83() { // from class: di4
                                    @Override // defpackage.a83
                                    public final void b(Object obj) {
                                        int i10 = i9;
                                        SongBottomSheetDialog songBottomSheetDialog2 = songBottomSheetDialog;
                                        switch (i10) {
                                            case 0:
                                                Share share = (Share) obj;
                                                if (share == null) {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.share_unsupported_error), 0).show();
                                                    songBottomSheetDialog2.h0();
                                                } else {
                                                    ((ClipboardManager) songBottomSheetDialog2.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(songBottomSheetDialog2.s(R.string.app_name), share.getUrl()));
                                                    songBottomSheetDialog2.B0.g(songBottomSheetDialog2.X());
                                                    songBottomSheetDialog2.h0();
                                                }
                                                break;
                                            case 1:
                                                AlbumID3 albumID3 = (AlbumID3) obj;
                                                if (albumID3 != null) {
                                                    Bundle bundle5 = new Bundle();
                                                    bundle5.putParcelable("ALBUM_OBJECT", albumID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.albumPageFragment, bundle5, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_album), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                            default:
                                                ArtistID3 artistID3 = (ArtistID3) obj;
                                                if (artistID3 != null) {
                                                    Bundle bundle6 = new Bundle();
                                                    bundle6.putParcelable("ARTIST_OBJECT", artistID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.artistPageFragment, bundle6, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_artist), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 7:
                                ii4 ii4Var4 = songBottomSheetDialog.C0;
                                hh3 hh3Var = ii4Var4.g;
                                String id = ii4Var4.h.getId();
                                String title = ii4Var4.h.getTitle();
                                hh3Var.getClass();
                                hh3.h(id, title).e(songBottomSheetDialog.v(), new a83() { // from class: di4
                                    @Override // defpackage.a83
                                    public final void b(Object obj) {
                                        int i10 = i7;
                                        SongBottomSheetDialog songBottomSheetDialog2 = songBottomSheetDialog;
                                        switch (i10) {
                                            case 0:
                                                Share share = (Share) obj;
                                                if (share == null) {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.share_unsupported_error), 0).show();
                                                    songBottomSheetDialog2.h0();
                                                } else {
                                                    ((ClipboardManager) songBottomSheetDialog2.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(songBottomSheetDialog2.s(R.string.app_name), share.getUrl()));
                                                    songBottomSheetDialog2.B0.g(songBottomSheetDialog2.X());
                                                    songBottomSheetDialog2.h0();
                                                }
                                                break;
                                            case 1:
                                                AlbumID3 albumID3 = (AlbumID3) obj;
                                                if (albumID3 != null) {
                                                    Bundle bundle5 = new Bundle();
                                                    bundle5.putParcelable("ALBUM_OBJECT", albumID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.albumPageFragment, bundle5, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_album), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                            default:
                                                ArtistID3 artistID3 = (ArtistID3) obj;
                                                if (artistID3 != null) {
                                                    Bundle bundle6 = new Bundle();
                                                    bundle6.putParcelable("ARTIST_OBJECT", artistID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.artistPageFragment, bundle6, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_artist), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 8:
                                ii4 ii4Var5 = songBottomSheetDialog.C0;
                                Context contextZ2 = songBottomSheetDialog.Z();
                                d34 d34Var = ii4Var5.f;
                                if (n61.f(1, ii4Var5.h.getId(), ii4Var5.h.getStarred() != null)) {
                                    boolean zT = hw.t();
                                    Child child2 = ii4Var5.h;
                                    if (!zT) {
                                        String id2 = child2.getId();
                                        hi4 hi4Var = new hi4(ii4Var5, child2, 0);
                                        d34Var.getClass();
                                        d34.K(id2, null, null, hi4Var);
                                        child2.setStarred(null);
                                    } else {
                                        d34Var.J(child2.getId(), null, false, null);
                                        child2.setStarred(null);
                                    }
                                    break;
                                } else {
                                    boolean zT2 = hw.t();
                                    Child child3 = ii4Var5.h;
                                    if (zT2) {
                                        d34Var.J(child3.getId(), null, true, null);
                                        child3.setStarred(new Date());
                                        break;
                                    } else {
                                        String id3 = child3.getId();
                                        hi4 hi4Var2 = new hi4(ii4Var5, child3, 1);
                                        d34Var.getClass();
                                        d34.I(id3, null, null, hi4Var2);
                                        child3.setStarred(new Date());
                                        if (ud3.X() && ud3.o() == null) {
                                            au0.w(contextZ2).b(gi1.G(child3), new Download(child3), false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                MainActivity mainActivity = (MainActivity) songBottomSheetDialog.e();
                                if (mainActivity != null) {
                                    bl2 bl2Var = mainActivity.P;
                                    if (bl2Var != null) {
                                        songBottomSheetDialog.N0 = true;
                                        Toast.makeText(songBottomSheetDialog.Z(), R.string.bottom_sheet_generating_instant_mix, 0).show();
                                        ii4 ii4Var6 = songBottomSheetDialog.C0;
                                        Child child4 = songBottomSheetDialog.D0;
                                        k03 k03Var = ii4Var6.i;
                                        k03Var.k(Collections.EMPTY_LIST);
                                        ii4Var6.c.o(child4.getId(), fb0.p, 30).e(mainActivity, new g7(k03Var, 0));
                                        k03Var.e(mainActivity, new z6(songBottomSheetDialog, bl2Var, mainActivity, 4));
                                    } else {
                                        Log.e("SongBottomSheetDialog", "MediaBrowser Future is null in MainActivity");
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                ((TextView) viewInflate.findViewById(R.id.play_next_text_view)).setOnClickListener(new View.OnClickListener(this) { // from class: ci4
                    public final /* synthetic */ SongBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i6 = i;
                        final int i7 = 0;
                        final int i8 = 1;
                        final SongBottomSheetDialog songBottomSheetDialog = this.o;
                        switch (i6) {
                            case 0:
                                bo2.f(songBottomSheetDialog.O0, songBottomSheetDialog.D0, true);
                                if (!songBottomSheetDialog.E0) {
                                    ((au) ((MainActivity) songBottomSheetDialog.X()).V.n).d(true);
                                }
                                songBottomSheetDialog.h0();
                                break;
                            case 1:
                                bo2.f(songBottomSheetDialog.O0, songBottomSheetDialog.D0, false);
                                if (!songBottomSheetDialog.E0) {
                                    ((au) ((MainActivity) songBottomSheetDialog.X()).V.n).d(true);
                                }
                                songBottomSheetDialog.h0();
                                break;
                            case 2:
                                Bundle bundle3 = new Bundle();
                                bundle3.putParcelable("TRACK_OBJECT", songBottomSheetDialog.D0);
                                ou3 ou3Var = new ou3();
                                ou3Var.c0(bundle3);
                                ou3Var.m0(songBottomSheetDialog.X().k(), null);
                                songBottomSheetDialog.h0();
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                if (ud3.o() == null) {
                                    au0.w(songBottomSheetDialog.Z()).e(gi1.G(songBottomSheetDialog.D0), new Download(songBottomSheetDialog.D0));
                                } else {
                                    g51.b(songBottomSheetDialog.D0);
                                }
                                songBottomSheetDialog.h0();
                                break;
                            case 4:
                                Bundle bundle4 = new Bundle();
                                bundle4.putParcelableArrayList("TRACKS_OBJECT", new ArrayList<>(Collections.singletonList(songBottomSheetDialog.D0)));
                                fl3 fl3Var = new fl3();
                                fl3Var.c0(bundle4);
                                fl3Var.m0(songBottomSheetDialog.X().k(), null);
                                songBottomSheetDialog.h0();
                                break;
                            case 5:
                                ii4 ii4Var2 = songBottomSheetDialog.C0;
                                rv2 rv2Var = ii4Var2.d;
                                String albumId = ii4Var2.h.getAlbumId();
                                rv2Var.getClass();
                                rv2.j(albumId).e(songBottomSheetDialog.v(), new a83() { // from class: di4
                                    @Override // defpackage.a83
                                    public final void b(Object obj) {
                                        int i10 = i8;
                                        SongBottomSheetDialog songBottomSheetDialog2 = songBottomSheetDialog;
                                        switch (i10) {
                                            case 0:
                                                Share share = (Share) obj;
                                                if (share == null) {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.share_unsupported_error), 0).show();
                                                    songBottomSheetDialog2.h0();
                                                } else {
                                                    ((ClipboardManager) songBottomSheetDialog2.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(songBottomSheetDialog2.s(R.string.app_name), share.getUrl()));
                                                    songBottomSheetDialog2.B0.g(songBottomSheetDialog2.X());
                                                    songBottomSheetDialog2.h0();
                                                }
                                                break;
                                            case 1:
                                                AlbumID3 albumID3 = (AlbumID3) obj;
                                                if (albumID3 != null) {
                                                    Bundle bundle5 = new Bundle();
                                                    bundle5.putParcelable("ALBUM_OBJECT", albumID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.albumPageFragment, bundle5, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_album), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                            default:
                                                ArtistID3 artistID3 = (ArtistID3) obj;
                                                if (artistID3 != null) {
                                                    Bundle bundle6 = new Bundle();
                                                    bundle6.putParcelable("ARTIST_OBJECT", artistID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.artistPageFragment, bundle6, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_artist), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 6:
                                ii4 ii4Var3 = songBottomSheetDialog.C0;
                                pa paVar = ii4Var3.e;
                                String artistId = ii4Var3.h.getArtistId();
                                paVar.getClass();
                                final int i9 = 2;
                                pa.v(artistId).e(songBottomSheetDialog.v(), new a83() { // from class: di4
                                    @Override // defpackage.a83
                                    public final void b(Object obj) {
                                        int i10 = i9;
                                        SongBottomSheetDialog songBottomSheetDialog2 = songBottomSheetDialog;
                                        switch (i10) {
                                            case 0:
                                                Share share = (Share) obj;
                                                if (share == null) {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.share_unsupported_error), 0).show();
                                                    songBottomSheetDialog2.h0();
                                                } else {
                                                    ((ClipboardManager) songBottomSheetDialog2.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(songBottomSheetDialog2.s(R.string.app_name), share.getUrl()));
                                                    songBottomSheetDialog2.B0.g(songBottomSheetDialog2.X());
                                                    songBottomSheetDialog2.h0();
                                                }
                                                break;
                                            case 1:
                                                AlbumID3 albumID3 = (AlbumID3) obj;
                                                if (albumID3 != null) {
                                                    Bundle bundle5 = new Bundle();
                                                    bundle5.putParcelable("ALBUM_OBJECT", albumID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.albumPageFragment, bundle5, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_album), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                            default:
                                                ArtistID3 artistID3 = (ArtistID3) obj;
                                                if (artistID3 != null) {
                                                    Bundle bundle6 = new Bundle();
                                                    bundle6.putParcelable("ARTIST_OBJECT", artistID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.artistPageFragment, bundle6, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_artist), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 7:
                                ii4 ii4Var4 = songBottomSheetDialog.C0;
                                hh3 hh3Var = ii4Var4.g;
                                String id = ii4Var4.h.getId();
                                String title = ii4Var4.h.getTitle();
                                hh3Var.getClass();
                                hh3.h(id, title).e(songBottomSheetDialog.v(), new a83() { // from class: di4
                                    @Override // defpackage.a83
                                    public final void b(Object obj) {
                                        int i10 = i7;
                                        SongBottomSheetDialog songBottomSheetDialog2 = songBottomSheetDialog;
                                        switch (i10) {
                                            case 0:
                                                Share share = (Share) obj;
                                                if (share == null) {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.share_unsupported_error), 0).show();
                                                    songBottomSheetDialog2.h0();
                                                } else {
                                                    ((ClipboardManager) songBottomSheetDialog2.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(songBottomSheetDialog2.s(R.string.app_name), share.getUrl()));
                                                    songBottomSheetDialog2.B0.g(songBottomSheetDialog2.X());
                                                    songBottomSheetDialog2.h0();
                                                }
                                                break;
                                            case 1:
                                                AlbumID3 albumID3 = (AlbumID3) obj;
                                                if (albumID3 != null) {
                                                    Bundle bundle5 = new Bundle();
                                                    bundle5.putParcelable("ALBUM_OBJECT", albumID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.albumPageFragment, bundle5, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_album), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                            default:
                                                ArtistID3 artistID3 = (ArtistID3) obj;
                                                if (artistID3 != null) {
                                                    Bundle bundle6 = new Bundle();
                                                    bundle6.putParcelable("ARTIST_OBJECT", artistID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.artistPageFragment, bundle6, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_artist), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 8:
                                ii4 ii4Var5 = songBottomSheetDialog.C0;
                                Context contextZ2 = songBottomSheetDialog.Z();
                                d34 d34Var = ii4Var5.f;
                                if (n61.f(1, ii4Var5.h.getId(), ii4Var5.h.getStarred() != null)) {
                                    boolean zT = hw.t();
                                    Child child2 = ii4Var5.h;
                                    if (!zT) {
                                        String id2 = child2.getId();
                                        hi4 hi4Var = new hi4(ii4Var5, child2, 0);
                                        d34Var.getClass();
                                        d34.K(id2, null, null, hi4Var);
                                        child2.setStarred(null);
                                    } else {
                                        d34Var.J(child2.getId(), null, false, null);
                                        child2.setStarred(null);
                                    }
                                    break;
                                } else {
                                    boolean zT2 = hw.t();
                                    Child child3 = ii4Var5.h;
                                    if (zT2) {
                                        d34Var.J(child3.getId(), null, true, null);
                                        child3.setStarred(new Date());
                                        break;
                                    } else {
                                        String id3 = child3.getId();
                                        hi4 hi4Var2 = new hi4(ii4Var5, child3, 1);
                                        d34Var.getClass();
                                        d34.I(id3, null, null, hi4Var2);
                                        child3.setStarred(new Date());
                                        if (ud3.X() && ud3.o() == null) {
                                            au0.w(contextZ2).b(gi1.G(child3), new Download(child3), false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                MainActivity mainActivity = (MainActivity) songBottomSheetDialog.e();
                                if (mainActivity != null) {
                                    bl2 bl2Var = mainActivity.P;
                                    if (bl2Var != null) {
                                        songBottomSheetDialog.N0 = true;
                                        Toast.makeText(songBottomSheetDialog.Z(), R.string.bottom_sheet_generating_instant_mix, 0).show();
                                        ii4 ii4Var6 = songBottomSheetDialog.C0;
                                        Child child4 = songBottomSheetDialog.D0;
                                        k03 k03Var = ii4Var6.i;
                                        k03Var.k(Collections.EMPTY_LIST);
                                        ii4Var6.c.o(child4.getId(), fb0.p, 30).e(mainActivity, new g7(k03Var, 0));
                                        k03Var.e(mainActivity, new z6(songBottomSheetDialog, bl2Var, mainActivity, 4));
                                    } else {
                                        Log.e("SongBottomSheetDialog", "MediaBrowser Future is null in MainActivity");
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                ((TextView) viewInflate.findViewById(R.id.add_to_queue_text_view)).setOnClickListener(new View.OnClickListener(this) { // from class: ci4
                    public final /* synthetic */ SongBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i6 = i3;
                        final int i7 = 0;
                        final int i8 = 1;
                        final SongBottomSheetDialog songBottomSheetDialog = this.o;
                        switch (i6) {
                            case 0:
                                bo2.f(songBottomSheetDialog.O0, songBottomSheetDialog.D0, true);
                                if (!songBottomSheetDialog.E0) {
                                    ((au) ((MainActivity) songBottomSheetDialog.X()).V.n).d(true);
                                }
                                songBottomSheetDialog.h0();
                                break;
                            case 1:
                                bo2.f(songBottomSheetDialog.O0, songBottomSheetDialog.D0, false);
                                if (!songBottomSheetDialog.E0) {
                                    ((au) ((MainActivity) songBottomSheetDialog.X()).V.n).d(true);
                                }
                                songBottomSheetDialog.h0();
                                break;
                            case 2:
                                Bundle bundle3 = new Bundle();
                                bundle3.putParcelable("TRACK_OBJECT", songBottomSheetDialog.D0);
                                ou3 ou3Var = new ou3();
                                ou3Var.c0(bundle3);
                                ou3Var.m0(songBottomSheetDialog.X().k(), null);
                                songBottomSheetDialog.h0();
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                if (ud3.o() == null) {
                                    au0.w(songBottomSheetDialog.Z()).e(gi1.G(songBottomSheetDialog.D0), new Download(songBottomSheetDialog.D0));
                                } else {
                                    g51.b(songBottomSheetDialog.D0);
                                }
                                songBottomSheetDialog.h0();
                                break;
                            case 4:
                                Bundle bundle4 = new Bundle();
                                bundle4.putParcelableArrayList("TRACKS_OBJECT", new ArrayList<>(Collections.singletonList(songBottomSheetDialog.D0)));
                                fl3 fl3Var = new fl3();
                                fl3Var.c0(bundle4);
                                fl3Var.m0(songBottomSheetDialog.X().k(), null);
                                songBottomSheetDialog.h0();
                                break;
                            case 5:
                                ii4 ii4Var2 = songBottomSheetDialog.C0;
                                rv2 rv2Var = ii4Var2.d;
                                String albumId = ii4Var2.h.getAlbumId();
                                rv2Var.getClass();
                                rv2.j(albumId).e(songBottomSheetDialog.v(), new a83() { // from class: di4
                                    @Override // defpackage.a83
                                    public final void b(Object obj) {
                                        int i10 = i8;
                                        SongBottomSheetDialog songBottomSheetDialog2 = songBottomSheetDialog;
                                        switch (i10) {
                                            case 0:
                                                Share share = (Share) obj;
                                                if (share == null) {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.share_unsupported_error), 0).show();
                                                    songBottomSheetDialog2.h0();
                                                } else {
                                                    ((ClipboardManager) songBottomSheetDialog2.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(songBottomSheetDialog2.s(R.string.app_name), share.getUrl()));
                                                    songBottomSheetDialog2.B0.g(songBottomSheetDialog2.X());
                                                    songBottomSheetDialog2.h0();
                                                }
                                                break;
                                            case 1:
                                                AlbumID3 albumID3 = (AlbumID3) obj;
                                                if (albumID3 != null) {
                                                    Bundle bundle5 = new Bundle();
                                                    bundle5.putParcelable("ALBUM_OBJECT", albumID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.albumPageFragment, bundle5, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_album), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                            default:
                                                ArtistID3 artistID3 = (ArtistID3) obj;
                                                if (artistID3 != null) {
                                                    Bundle bundle6 = new Bundle();
                                                    bundle6.putParcelable("ARTIST_OBJECT", artistID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.artistPageFragment, bundle6, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_artist), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 6:
                                ii4 ii4Var3 = songBottomSheetDialog.C0;
                                pa paVar = ii4Var3.e;
                                String artistId = ii4Var3.h.getArtistId();
                                paVar.getClass();
                                final int i9 = 2;
                                pa.v(artistId).e(songBottomSheetDialog.v(), new a83() { // from class: di4
                                    @Override // defpackage.a83
                                    public final void b(Object obj) {
                                        int i10 = i9;
                                        SongBottomSheetDialog songBottomSheetDialog2 = songBottomSheetDialog;
                                        switch (i10) {
                                            case 0:
                                                Share share = (Share) obj;
                                                if (share == null) {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.share_unsupported_error), 0).show();
                                                    songBottomSheetDialog2.h0();
                                                } else {
                                                    ((ClipboardManager) songBottomSheetDialog2.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(songBottomSheetDialog2.s(R.string.app_name), share.getUrl()));
                                                    songBottomSheetDialog2.B0.g(songBottomSheetDialog2.X());
                                                    songBottomSheetDialog2.h0();
                                                }
                                                break;
                                            case 1:
                                                AlbumID3 albumID3 = (AlbumID3) obj;
                                                if (albumID3 != null) {
                                                    Bundle bundle5 = new Bundle();
                                                    bundle5.putParcelable("ALBUM_OBJECT", albumID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.albumPageFragment, bundle5, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_album), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                            default:
                                                ArtistID3 artistID3 = (ArtistID3) obj;
                                                if (artistID3 != null) {
                                                    Bundle bundle6 = new Bundle();
                                                    bundle6.putParcelable("ARTIST_OBJECT", artistID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.artistPageFragment, bundle6, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_artist), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 7:
                                ii4 ii4Var4 = songBottomSheetDialog.C0;
                                hh3 hh3Var = ii4Var4.g;
                                String id = ii4Var4.h.getId();
                                String title = ii4Var4.h.getTitle();
                                hh3Var.getClass();
                                hh3.h(id, title).e(songBottomSheetDialog.v(), new a83() { // from class: di4
                                    @Override // defpackage.a83
                                    public final void b(Object obj) {
                                        int i10 = i7;
                                        SongBottomSheetDialog songBottomSheetDialog2 = songBottomSheetDialog;
                                        switch (i10) {
                                            case 0:
                                                Share share = (Share) obj;
                                                if (share == null) {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.share_unsupported_error), 0).show();
                                                    songBottomSheetDialog2.h0();
                                                } else {
                                                    ((ClipboardManager) songBottomSheetDialog2.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(songBottomSheetDialog2.s(R.string.app_name), share.getUrl()));
                                                    songBottomSheetDialog2.B0.g(songBottomSheetDialog2.X());
                                                    songBottomSheetDialog2.h0();
                                                }
                                                break;
                                            case 1:
                                                AlbumID3 albumID3 = (AlbumID3) obj;
                                                if (albumID3 != null) {
                                                    Bundle bundle5 = new Bundle();
                                                    bundle5.putParcelable("ALBUM_OBJECT", albumID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.albumPageFragment, bundle5, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_album), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                            default:
                                                ArtistID3 artistID3 = (ArtistID3) obj;
                                                if (artistID3 != null) {
                                                    Bundle bundle6 = new Bundle();
                                                    bundle6.putParcelable("ARTIST_OBJECT", artistID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.artistPageFragment, bundle6, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_artist), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 8:
                                ii4 ii4Var5 = songBottomSheetDialog.C0;
                                Context contextZ2 = songBottomSheetDialog.Z();
                                d34 d34Var = ii4Var5.f;
                                if (n61.f(1, ii4Var5.h.getId(), ii4Var5.h.getStarred() != null)) {
                                    boolean zT = hw.t();
                                    Child child2 = ii4Var5.h;
                                    if (!zT) {
                                        String id2 = child2.getId();
                                        hi4 hi4Var = new hi4(ii4Var5, child2, 0);
                                        d34Var.getClass();
                                        d34.K(id2, null, null, hi4Var);
                                        child2.setStarred(null);
                                    } else {
                                        d34Var.J(child2.getId(), null, false, null);
                                        child2.setStarred(null);
                                    }
                                    break;
                                } else {
                                    boolean zT2 = hw.t();
                                    Child child3 = ii4Var5.h;
                                    if (zT2) {
                                        d34Var.J(child3.getId(), null, true, null);
                                        child3.setStarred(new Date());
                                        break;
                                    } else {
                                        String id3 = child3.getId();
                                        hi4 hi4Var2 = new hi4(ii4Var5, child3, 1);
                                        d34Var.getClass();
                                        d34.I(id3, null, null, hi4Var2);
                                        child3.setStarred(new Date());
                                        if (ud3.X() && ud3.o() == null) {
                                            au0.w(contextZ2).b(gi1.G(child3), new Download(child3), false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                MainActivity mainActivity = (MainActivity) songBottomSheetDialog.e();
                                if (mainActivity != null) {
                                    bl2 bl2Var = mainActivity.P;
                                    if (bl2Var != null) {
                                        songBottomSheetDialog.N0 = true;
                                        Toast.makeText(songBottomSheetDialog.Z(), R.string.bottom_sheet_generating_instant_mix, 0).show();
                                        ii4 ii4Var6 = songBottomSheetDialog.C0;
                                        Child child4 = songBottomSheetDialog.D0;
                                        k03 k03Var = ii4Var6.i;
                                        k03Var.k(Collections.EMPTY_LIST);
                                        ii4Var6.c.o(child4.getId(), fb0.p, 30).e(mainActivity, new g7(k03Var, 0));
                                        k03Var.e(mainActivity, new z6(songBottomSheetDialog, bl2Var, mainActivity, 4));
                                    } else {
                                        Log.e("SongBottomSheetDialog", "MediaBrowser Future is null in MainActivity");
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                final int i6 = 2;
                ((TextView) viewInflate.findViewById(R.id.rate_text_view)).setOnClickListener(new View.OnClickListener(this) { // from class: ci4
                    public final /* synthetic */ SongBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i7 = i6;
                        final int i8 = 0;
                        final int i9 = 1;
                        final SongBottomSheetDialog songBottomSheetDialog = this.o;
                        switch (i7) {
                            case 0:
                                bo2.f(songBottomSheetDialog.O0, songBottomSheetDialog.D0, true);
                                if (!songBottomSheetDialog.E0) {
                                    ((au) ((MainActivity) songBottomSheetDialog.X()).V.n).d(true);
                                }
                                songBottomSheetDialog.h0();
                                break;
                            case 1:
                                bo2.f(songBottomSheetDialog.O0, songBottomSheetDialog.D0, false);
                                if (!songBottomSheetDialog.E0) {
                                    ((au) ((MainActivity) songBottomSheetDialog.X()).V.n).d(true);
                                }
                                songBottomSheetDialog.h0();
                                break;
                            case 2:
                                Bundle bundle3 = new Bundle();
                                bundle3.putParcelable("TRACK_OBJECT", songBottomSheetDialog.D0);
                                ou3 ou3Var = new ou3();
                                ou3Var.c0(bundle3);
                                ou3Var.m0(songBottomSheetDialog.X().k(), null);
                                songBottomSheetDialog.h0();
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                if (ud3.o() == null) {
                                    au0.w(songBottomSheetDialog.Z()).e(gi1.G(songBottomSheetDialog.D0), new Download(songBottomSheetDialog.D0));
                                } else {
                                    g51.b(songBottomSheetDialog.D0);
                                }
                                songBottomSheetDialog.h0();
                                break;
                            case 4:
                                Bundle bundle4 = new Bundle();
                                bundle4.putParcelableArrayList("TRACKS_OBJECT", new ArrayList<>(Collections.singletonList(songBottomSheetDialog.D0)));
                                fl3 fl3Var = new fl3();
                                fl3Var.c0(bundle4);
                                fl3Var.m0(songBottomSheetDialog.X().k(), null);
                                songBottomSheetDialog.h0();
                                break;
                            case 5:
                                ii4 ii4Var2 = songBottomSheetDialog.C0;
                                rv2 rv2Var = ii4Var2.d;
                                String albumId = ii4Var2.h.getAlbumId();
                                rv2Var.getClass();
                                rv2.j(albumId).e(songBottomSheetDialog.v(), new a83() { // from class: di4
                                    @Override // defpackage.a83
                                    public final void b(Object obj) {
                                        int i10 = i9;
                                        SongBottomSheetDialog songBottomSheetDialog2 = songBottomSheetDialog;
                                        switch (i10) {
                                            case 0:
                                                Share share = (Share) obj;
                                                if (share == null) {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.share_unsupported_error), 0).show();
                                                    songBottomSheetDialog2.h0();
                                                } else {
                                                    ((ClipboardManager) songBottomSheetDialog2.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(songBottomSheetDialog2.s(R.string.app_name), share.getUrl()));
                                                    songBottomSheetDialog2.B0.g(songBottomSheetDialog2.X());
                                                    songBottomSheetDialog2.h0();
                                                }
                                                break;
                                            case 1:
                                                AlbumID3 albumID3 = (AlbumID3) obj;
                                                if (albumID3 != null) {
                                                    Bundle bundle5 = new Bundle();
                                                    bundle5.putParcelable("ALBUM_OBJECT", albumID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.albumPageFragment, bundle5, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_album), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                            default:
                                                ArtistID3 artistID3 = (ArtistID3) obj;
                                                if (artistID3 != null) {
                                                    Bundle bundle6 = new Bundle();
                                                    bundle6.putParcelable("ARTIST_OBJECT", artistID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.artistPageFragment, bundle6, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_artist), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 6:
                                ii4 ii4Var3 = songBottomSheetDialog.C0;
                                pa paVar = ii4Var3.e;
                                String artistId = ii4Var3.h.getArtistId();
                                paVar.getClass();
                                final int i10 = 2;
                                pa.v(artistId).e(songBottomSheetDialog.v(), new a83() { // from class: di4
                                    @Override // defpackage.a83
                                    public final void b(Object obj) {
                                        int i11 = i10;
                                        SongBottomSheetDialog songBottomSheetDialog2 = songBottomSheetDialog;
                                        switch (i11) {
                                            case 0:
                                                Share share = (Share) obj;
                                                if (share == null) {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.share_unsupported_error), 0).show();
                                                    songBottomSheetDialog2.h0();
                                                } else {
                                                    ((ClipboardManager) songBottomSheetDialog2.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(songBottomSheetDialog2.s(R.string.app_name), share.getUrl()));
                                                    songBottomSheetDialog2.B0.g(songBottomSheetDialog2.X());
                                                    songBottomSheetDialog2.h0();
                                                }
                                                break;
                                            case 1:
                                                AlbumID3 albumID3 = (AlbumID3) obj;
                                                if (albumID3 != null) {
                                                    Bundle bundle5 = new Bundle();
                                                    bundle5.putParcelable("ALBUM_OBJECT", albumID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.albumPageFragment, bundle5, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_album), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                            default:
                                                ArtistID3 artistID3 = (ArtistID3) obj;
                                                if (artistID3 != null) {
                                                    Bundle bundle6 = new Bundle();
                                                    bundle6.putParcelable("ARTIST_OBJECT", artistID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.artistPageFragment, bundle6, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_artist), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 7:
                                ii4 ii4Var4 = songBottomSheetDialog.C0;
                                hh3 hh3Var = ii4Var4.g;
                                String id = ii4Var4.h.getId();
                                String title = ii4Var4.h.getTitle();
                                hh3Var.getClass();
                                hh3.h(id, title).e(songBottomSheetDialog.v(), new a83() { // from class: di4
                                    @Override // defpackage.a83
                                    public final void b(Object obj) {
                                        int i11 = i8;
                                        SongBottomSheetDialog songBottomSheetDialog2 = songBottomSheetDialog;
                                        switch (i11) {
                                            case 0:
                                                Share share = (Share) obj;
                                                if (share == null) {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.share_unsupported_error), 0).show();
                                                    songBottomSheetDialog2.h0();
                                                } else {
                                                    ((ClipboardManager) songBottomSheetDialog2.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(songBottomSheetDialog2.s(R.string.app_name), share.getUrl()));
                                                    songBottomSheetDialog2.B0.g(songBottomSheetDialog2.X());
                                                    songBottomSheetDialog2.h0();
                                                }
                                                break;
                                            case 1:
                                                AlbumID3 albumID3 = (AlbumID3) obj;
                                                if (albumID3 != null) {
                                                    Bundle bundle5 = new Bundle();
                                                    bundle5.putParcelable("ALBUM_OBJECT", albumID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.albumPageFragment, bundle5, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_album), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                            default:
                                                ArtistID3 artistID3 = (ArtistID3) obj;
                                                if (artistID3 != null) {
                                                    Bundle bundle6 = new Bundle();
                                                    bundle6.putParcelable("ARTIST_OBJECT", artistID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.artistPageFragment, bundle6, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_artist), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 8:
                                ii4 ii4Var5 = songBottomSheetDialog.C0;
                                Context contextZ2 = songBottomSheetDialog.Z();
                                d34 d34Var = ii4Var5.f;
                                if (n61.f(1, ii4Var5.h.getId(), ii4Var5.h.getStarred() != null)) {
                                    boolean zT = hw.t();
                                    Child child2 = ii4Var5.h;
                                    if (!zT) {
                                        String id2 = child2.getId();
                                        hi4 hi4Var = new hi4(ii4Var5, child2, 0);
                                        d34Var.getClass();
                                        d34.K(id2, null, null, hi4Var);
                                        child2.setStarred(null);
                                    } else {
                                        d34Var.J(child2.getId(), null, false, null);
                                        child2.setStarred(null);
                                    }
                                    break;
                                } else {
                                    boolean zT2 = hw.t();
                                    Child child3 = ii4Var5.h;
                                    if (zT2) {
                                        d34Var.J(child3.getId(), null, true, null);
                                        child3.setStarred(new Date());
                                        break;
                                    } else {
                                        String id3 = child3.getId();
                                        hi4 hi4Var2 = new hi4(ii4Var5, child3, 1);
                                        d34Var.getClass();
                                        d34.I(id3, null, null, hi4Var2);
                                        child3.setStarred(new Date());
                                        if (ud3.X() && ud3.o() == null) {
                                            au0.w(contextZ2).b(gi1.G(child3), new Download(child3), false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                MainActivity mainActivity = (MainActivity) songBottomSheetDialog.e();
                                if (mainActivity != null) {
                                    bl2 bl2Var = mainActivity.P;
                                    if (bl2Var != null) {
                                        songBottomSheetDialog.N0 = true;
                                        Toast.makeText(songBottomSheetDialog.Z(), R.string.bottom_sheet_generating_instant_mix, 0).show();
                                        ii4 ii4Var6 = songBottomSheetDialog.C0;
                                        Child child4 = songBottomSheetDialog.D0;
                                        k03 k03Var = ii4Var6.i;
                                        k03Var.k(Collections.EMPTY_LIST);
                                        ii4Var6.c.o(child4.getId(), fb0.p, 30).e(mainActivity, new g7(k03Var, 0));
                                        k03Var.e(mainActivity, new z6(songBottomSheetDialog, bl2Var, mainActivity, 4));
                                    } else {
                                        Log.e("SongBottomSheetDialog", "MediaBrowser Future is null in MainActivity");
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                Bundle bundle3 = this.s;
                String string = bundle3 != null ? bundle3.getString("PLAYLIST_ID") : null;
                String string2 = bundle3 != null ? bundle3.getString("PLAYLIST_NAME") : null;
                int i7 = bundle3 != null ? bundle3.getInt("ITEM_POSITION", -1) : -1;
                TextView textView3 = (TextView) viewInflate.findViewById(R.id.download_text_view);
                this.F0 = textView3;
                textView3.setOnClickListener(new et1(this, string, string2, 1));
                TextView textView4 = (TextView) viewInflate.findViewById(R.id.remove_text_view);
                this.G0 = textView4;
                final int i8 = 3;
                textView4.setOnClickListener(new View.OnClickListener(this) { // from class: ci4
                    public final /* synthetic */ SongBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i9 = i8;
                        final int i10 = 0;
                        final int i11 = 1;
                        final SongBottomSheetDialog songBottomSheetDialog = this.o;
                        switch (i9) {
                            case 0:
                                bo2.f(songBottomSheetDialog.O0, songBottomSheetDialog.D0, true);
                                if (!songBottomSheetDialog.E0) {
                                    ((au) ((MainActivity) songBottomSheetDialog.X()).V.n).d(true);
                                }
                                songBottomSheetDialog.h0();
                                break;
                            case 1:
                                bo2.f(songBottomSheetDialog.O0, songBottomSheetDialog.D0, false);
                                if (!songBottomSheetDialog.E0) {
                                    ((au) ((MainActivity) songBottomSheetDialog.X()).V.n).d(true);
                                }
                                songBottomSheetDialog.h0();
                                break;
                            case 2:
                                Bundle bundle4 = new Bundle();
                                bundle4.putParcelable("TRACK_OBJECT", songBottomSheetDialog.D0);
                                ou3 ou3Var = new ou3();
                                ou3Var.c0(bundle4);
                                ou3Var.m0(songBottomSheetDialog.X().k(), null);
                                songBottomSheetDialog.h0();
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                if (ud3.o() == null) {
                                    au0.w(songBottomSheetDialog.Z()).e(gi1.G(songBottomSheetDialog.D0), new Download(songBottomSheetDialog.D0));
                                } else {
                                    g51.b(songBottomSheetDialog.D0);
                                }
                                songBottomSheetDialog.h0();
                                break;
                            case 4:
                                Bundle bundle5 = new Bundle();
                                bundle5.putParcelableArrayList("TRACKS_OBJECT", new ArrayList<>(Collections.singletonList(songBottomSheetDialog.D0)));
                                fl3 fl3Var = new fl3();
                                fl3Var.c0(bundle5);
                                fl3Var.m0(songBottomSheetDialog.X().k(), null);
                                songBottomSheetDialog.h0();
                                break;
                            case 5:
                                ii4 ii4Var2 = songBottomSheetDialog.C0;
                                rv2 rv2Var = ii4Var2.d;
                                String albumId = ii4Var2.h.getAlbumId();
                                rv2Var.getClass();
                                rv2.j(albumId).e(songBottomSheetDialog.v(), new a83() { // from class: di4
                                    @Override // defpackage.a83
                                    public final void b(Object obj) {
                                        int i12 = i11;
                                        SongBottomSheetDialog songBottomSheetDialog2 = songBottomSheetDialog;
                                        switch (i12) {
                                            case 0:
                                                Share share = (Share) obj;
                                                if (share == null) {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.share_unsupported_error), 0).show();
                                                    songBottomSheetDialog2.h0();
                                                } else {
                                                    ((ClipboardManager) songBottomSheetDialog2.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(songBottomSheetDialog2.s(R.string.app_name), share.getUrl()));
                                                    songBottomSheetDialog2.B0.g(songBottomSheetDialog2.X());
                                                    songBottomSheetDialog2.h0();
                                                }
                                                break;
                                            case 1:
                                                AlbumID3 albumID3 = (AlbumID3) obj;
                                                if (albumID3 != null) {
                                                    Bundle bundle6 = new Bundle();
                                                    bundle6.putParcelable("ALBUM_OBJECT", albumID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.albumPageFragment, bundle6, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_album), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                            default:
                                                ArtistID3 artistID3 = (ArtistID3) obj;
                                                if (artistID3 != null) {
                                                    Bundle bundle7 = new Bundle();
                                                    bundle7.putParcelable("ARTIST_OBJECT", artistID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.artistPageFragment, bundle7, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_artist), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 6:
                                ii4 ii4Var3 = songBottomSheetDialog.C0;
                                pa paVar = ii4Var3.e;
                                String artistId = ii4Var3.h.getArtistId();
                                paVar.getClass();
                                final int i12 = 2;
                                pa.v(artistId).e(songBottomSheetDialog.v(), new a83() { // from class: di4
                                    @Override // defpackage.a83
                                    public final void b(Object obj) {
                                        int i13 = i12;
                                        SongBottomSheetDialog songBottomSheetDialog2 = songBottomSheetDialog;
                                        switch (i13) {
                                            case 0:
                                                Share share = (Share) obj;
                                                if (share == null) {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.share_unsupported_error), 0).show();
                                                    songBottomSheetDialog2.h0();
                                                } else {
                                                    ((ClipboardManager) songBottomSheetDialog2.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(songBottomSheetDialog2.s(R.string.app_name), share.getUrl()));
                                                    songBottomSheetDialog2.B0.g(songBottomSheetDialog2.X());
                                                    songBottomSheetDialog2.h0();
                                                }
                                                break;
                                            case 1:
                                                AlbumID3 albumID3 = (AlbumID3) obj;
                                                if (albumID3 != null) {
                                                    Bundle bundle6 = new Bundle();
                                                    bundle6.putParcelable("ALBUM_OBJECT", albumID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.albumPageFragment, bundle6, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_album), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                            default:
                                                ArtistID3 artistID3 = (ArtistID3) obj;
                                                if (artistID3 != null) {
                                                    Bundle bundle7 = new Bundle();
                                                    bundle7.putParcelable("ARTIST_OBJECT", artistID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.artistPageFragment, bundle7, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_artist), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 7:
                                ii4 ii4Var4 = songBottomSheetDialog.C0;
                                hh3 hh3Var = ii4Var4.g;
                                String id = ii4Var4.h.getId();
                                String title = ii4Var4.h.getTitle();
                                hh3Var.getClass();
                                hh3.h(id, title).e(songBottomSheetDialog.v(), new a83() { // from class: di4
                                    @Override // defpackage.a83
                                    public final void b(Object obj) {
                                        int i13 = i10;
                                        SongBottomSheetDialog songBottomSheetDialog2 = songBottomSheetDialog;
                                        switch (i13) {
                                            case 0:
                                                Share share = (Share) obj;
                                                if (share == null) {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.share_unsupported_error), 0).show();
                                                    songBottomSheetDialog2.h0();
                                                } else {
                                                    ((ClipboardManager) songBottomSheetDialog2.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(songBottomSheetDialog2.s(R.string.app_name), share.getUrl()));
                                                    songBottomSheetDialog2.B0.g(songBottomSheetDialog2.X());
                                                    songBottomSheetDialog2.h0();
                                                }
                                                break;
                                            case 1:
                                                AlbumID3 albumID3 = (AlbumID3) obj;
                                                if (albumID3 != null) {
                                                    Bundle bundle6 = new Bundle();
                                                    bundle6.putParcelable("ALBUM_OBJECT", albumID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.albumPageFragment, bundle6, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_album), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                            default:
                                                ArtistID3 artistID3 = (ArtistID3) obj;
                                                if (artistID3 != null) {
                                                    Bundle bundle7 = new Bundle();
                                                    bundle7.putParcelable("ARTIST_OBJECT", artistID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.artistPageFragment, bundle7, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_artist), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 8:
                                ii4 ii4Var5 = songBottomSheetDialog.C0;
                                Context contextZ2 = songBottomSheetDialog.Z();
                                d34 d34Var = ii4Var5.f;
                                if (n61.f(1, ii4Var5.h.getId(), ii4Var5.h.getStarred() != null)) {
                                    boolean zT = hw.t();
                                    Child child2 = ii4Var5.h;
                                    if (!zT) {
                                        String id2 = child2.getId();
                                        hi4 hi4Var = new hi4(ii4Var5, child2, 0);
                                        d34Var.getClass();
                                        d34.K(id2, null, null, hi4Var);
                                        child2.setStarred(null);
                                    } else {
                                        d34Var.J(child2.getId(), null, false, null);
                                        child2.setStarred(null);
                                    }
                                    break;
                                } else {
                                    boolean zT2 = hw.t();
                                    Child child3 = ii4Var5.h;
                                    if (zT2) {
                                        d34Var.J(child3.getId(), null, true, null);
                                        child3.setStarred(new Date());
                                        break;
                                    } else {
                                        String id3 = child3.getId();
                                        hi4 hi4Var2 = new hi4(ii4Var5, child3, 1);
                                        d34Var.getClass();
                                        d34.I(id3, null, null, hi4Var2);
                                        child3.setStarred(new Date());
                                        if (ud3.X() && ud3.o() == null) {
                                            au0.w(contextZ2).b(gi1.G(child3), new Download(child3), false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                MainActivity mainActivity = (MainActivity) songBottomSheetDialog.e();
                                if (mainActivity != null) {
                                    bl2 bl2Var = mainActivity.P;
                                    if (bl2Var != null) {
                                        songBottomSheetDialog.N0 = true;
                                        Toast.makeText(songBottomSheetDialog.Z(), R.string.bottom_sheet_generating_instant_mix, 0).show();
                                        ii4 ii4Var6 = songBottomSheetDialog.C0;
                                        Child child4 = songBottomSheetDialog.D0;
                                        k03 k03Var = ii4Var6.i;
                                        k03Var.k(Collections.EMPTY_LIST);
                                        ii4Var6.c.o(child4.getId(), fb0.p, 30).e(mainActivity, new g7(k03Var, 0));
                                        k03Var.e(mainActivity, new z6(songBottomSheetDialog, bl2Var, mainActivity, 4));
                                    } else {
                                        Log.e("SongBottomSheetDialog", "MediaBrowser Future is null in MainActivity");
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                q0();
                TextView textView5 = (TextView) viewInflate.findViewById(R.id.remove_from_playlist_text_view);
                if (string != null && i7 != -1) {
                    textView5.setVisibility(0);
                    textView5.setOnClickListener(new wi3(this, string, i7, i3));
                }
                View viewFindViewById = viewInflate.findViewById(R.id.homemusic_remove_from_liked_text_view);
                Child child2 = this.D0;
                viewFindViewById.getClass();
                child2.getClass();
                boolean zF = n61.f(1, child2.getId(), child2.getStarred() != null);
                Bundle bundle4 = this.s;
                boolean z2 = bundle4 != null && bundle4.getBoolean("homemusic_song_sheet_from_liked");
                String id = child2.getId();
                id.getClass();
                if (z2 && zF && !qm4.u0(id)) {
                    viewFindViewById.setVisibility(0);
                    viewFindViewById.setOnClickListener(new j8(11, this, child2));
                } else {
                    viewFindViewById.setVisibility(8);
                }
                View viewFindViewById2 = viewInflate.findViewById(R.id.homemusic_dislike_text_view);
                Child child3 = this.D0;
                bi4 bi4Var = new bi4(this, 1);
                ExecutorService executorService = ur1.a;
                child3.getClass();
                if (viewFindViewById2 != null) {
                    if (ur1.b(child3)) {
                        viewFindViewById2.setVisibility(0);
                        viewFindViewById2.setOnClickListener(new sr1(bi4Var, child3));
                    } else {
                        viewFindViewById2.setVisibility(8);
                    }
                }
                View viewFindViewById3 = viewInflate.findViewById(R.id.homemusic_wave_text_view);
                Child child4 = this.D0;
                bi4 bi4Var2 = new bi4(this, 1);
                boolean z3 = this.E0;
                WeakReference weakReference = com.eddyizm.tempus.homemusic.b.a;
                child4.getClass();
                com.eddyizm.tempus.homemusic.b.d(viewFindViewById3, child4, bi4Var2, false, z3);
                View viewFindViewById4 = viewInflate.findViewById(R.id.homemusic_wave_artist_text_view);
                Child child5 = this.D0;
                bi4 bi4Var3 = new bi4(this, 1);
                boolean z4 = this.E0;
                child5.getClass();
                com.eddyizm.tempus.homemusic.b.d(viewFindViewById4, child5, bi4Var3, true, z4);
                final int i9 = 4;
                ((TextView) viewInflate.findViewById(R.id.add_to_playlist_text_view)).setOnClickListener(new View.OnClickListener(this) { // from class: ci4
                    public final /* synthetic */ SongBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i10 = i9;
                        final int i11 = 0;
                        final int i12 = 1;
                        final SongBottomSheetDialog songBottomSheetDialog = this.o;
                        switch (i10) {
                            case 0:
                                bo2.f(songBottomSheetDialog.O0, songBottomSheetDialog.D0, true);
                                if (!songBottomSheetDialog.E0) {
                                    ((au) ((MainActivity) songBottomSheetDialog.X()).V.n).d(true);
                                }
                                songBottomSheetDialog.h0();
                                break;
                            case 1:
                                bo2.f(songBottomSheetDialog.O0, songBottomSheetDialog.D0, false);
                                if (!songBottomSheetDialog.E0) {
                                    ((au) ((MainActivity) songBottomSheetDialog.X()).V.n).d(true);
                                }
                                songBottomSheetDialog.h0();
                                break;
                            case 2:
                                Bundle bundle5 = new Bundle();
                                bundle5.putParcelable("TRACK_OBJECT", songBottomSheetDialog.D0);
                                ou3 ou3Var = new ou3();
                                ou3Var.c0(bundle5);
                                ou3Var.m0(songBottomSheetDialog.X().k(), null);
                                songBottomSheetDialog.h0();
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                if (ud3.o() == null) {
                                    au0.w(songBottomSheetDialog.Z()).e(gi1.G(songBottomSheetDialog.D0), new Download(songBottomSheetDialog.D0));
                                } else {
                                    g51.b(songBottomSheetDialog.D0);
                                }
                                songBottomSheetDialog.h0();
                                break;
                            case 4:
                                Bundle bundle6 = new Bundle();
                                bundle6.putParcelableArrayList("TRACKS_OBJECT", new ArrayList<>(Collections.singletonList(songBottomSheetDialog.D0)));
                                fl3 fl3Var = new fl3();
                                fl3Var.c0(bundle6);
                                fl3Var.m0(songBottomSheetDialog.X().k(), null);
                                songBottomSheetDialog.h0();
                                break;
                            case 5:
                                ii4 ii4Var2 = songBottomSheetDialog.C0;
                                rv2 rv2Var = ii4Var2.d;
                                String albumId = ii4Var2.h.getAlbumId();
                                rv2Var.getClass();
                                rv2.j(albumId).e(songBottomSheetDialog.v(), new a83() { // from class: di4
                                    @Override // defpackage.a83
                                    public final void b(Object obj) {
                                        int i13 = i12;
                                        SongBottomSheetDialog songBottomSheetDialog2 = songBottomSheetDialog;
                                        switch (i13) {
                                            case 0:
                                                Share share = (Share) obj;
                                                if (share == null) {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.share_unsupported_error), 0).show();
                                                    songBottomSheetDialog2.h0();
                                                } else {
                                                    ((ClipboardManager) songBottomSheetDialog2.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(songBottomSheetDialog2.s(R.string.app_name), share.getUrl()));
                                                    songBottomSheetDialog2.B0.g(songBottomSheetDialog2.X());
                                                    songBottomSheetDialog2.h0();
                                                }
                                                break;
                                            case 1:
                                                AlbumID3 albumID3 = (AlbumID3) obj;
                                                if (albumID3 != null) {
                                                    Bundle bundle7 = new Bundle();
                                                    bundle7.putParcelable("ALBUM_OBJECT", albumID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.albumPageFragment, bundle7, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_album), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                            default:
                                                ArtistID3 artistID3 = (ArtistID3) obj;
                                                if (artistID3 != null) {
                                                    Bundle bundle8 = new Bundle();
                                                    bundle8.putParcelable("ARTIST_OBJECT", artistID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.artistPageFragment, bundle8, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_artist), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 6:
                                ii4 ii4Var3 = songBottomSheetDialog.C0;
                                pa paVar = ii4Var3.e;
                                String artistId = ii4Var3.h.getArtistId();
                                paVar.getClass();
                                final int i13 = 2;
                                pa.v(artistId).e(songBottomSheetDialog.v(), new a83() { // from class: di4
                                    @Override // defpackage.a83
                                    public final void b(Object obj) {
                                        int i14 = i13;
                                        SongBottomSheetDialog songBottomSheetDialog2 = songBottomSheetDialog;
                                        switch (i14) {
                                            case 0:
                                                Share share = (Share) obj;
                                                if (share == null) {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.share_unsupported_error), 0).show();
                                                    songBottomSheetDialog2.h0();
                                                } else {
                                                    ((ClipboardManager) songBottomSheetDialog2.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(songBottomSheetDialog2.s(R.string.app_name), share.getUrl()));
                                                    songBottomSheetDialog2.B0.g(songBottomSheetDialog2.X());
                                                    songBottomSheetDialog2.h0();
                                                }
                                                break;
                                            case 1:
                                                AlbumID3 albumID3 = (AlbumID3) obj;
                                                if (albumID3 != null) {
                                                    Bundle bundle7 = new Bundle();
                                                    bundle7.putParcelable("ALBUM_OBJECT", albumID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.albumPageFragment, bundle7, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_album), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                            default:
                                                ArtistID3 artistID3 = (ArtistID3) obj;
                                                if (artistID3 != null) {
                                                    Bundle bundle8 = new Bundle();
                                                    bundle8.putParcelable("ARTIST_OBJECT", artistID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.artistPageFragment, bundle8, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_artist), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 7:
                                ii4 ii4Var4 = songBottomSheetDialog.C0;
                                hh3 hh3Var = ii4Var4.g;
                                String id2 = ii4Var4.h.getId();
                                String title = ii4Var4.h.getTitle();
                                hh3Var.getClass();
                                hh3.h(id2, title).e(songBottomSheetDialog.v(), new a83() { // from class: di4
                                    @Override // defpackage.a83
                                    public final void b(Object obj) {
                                        int i14 = i11;
                                        SongBottomSheetDialog songBottomSheetDialog2 = songBottomSheetDialog;
                                        switch (i14) {
                                            case 0:
                                                Share share = (Share) obj;
                                                if (share == null) {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.share_unsupported_error), 0).show();
                                                    songBottomSheetDialog2.h0();
                                                } else {
                                                    ((ClipboardManager) songBottomSheetDialog2.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(songBottomSheetDialog2.s(R.string.app_name), share.getUrl()));
                                                    songBottomSheetDialog2.B0.g(songBottomSheetDialog2.X());
                                                    songBottomSheetDialog2.h0();
                                                }
                                                break;
                                            case 1:
                                                AlbumID3 albumID3 = (AlbumID3) obj;
                                                if (albumID3 != null) {
                                                    Bundle bundle7 = new Bundle();
                                                    bundle7.putParcelable("ALBUM_OBJECT", albumID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.albumPageFragment, bundle7, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_album), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                            default:
                                                ArtistID3 artistID3 = (ArtistID3) obj;
                                                if (artistID3 != null) {
                                                    Bundle bundle8 = new Bundle();
                                                    bundle8.putParcelable("ARTIST_OBJECT", artistID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.artistPageFragment, bundle8, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_artist), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 8:
                                ii4 ii4Var5 = songBottomSheetDialog.C0;
                                Context contextZ2 = songBottomSheetDialog.Z();
                                d34 d34Var = ii4Var5.f;
                                if (n61.f(1, ii4Var5.h.getId(), ii4Var5.h.getStarred() != null)) {
                                    boolean zT = hw.t();
                                    Child child6 = ii4Var5.h;
                                    if (!zT) {
                                        String id3 = child6.getId();
                                        hi4 hi4Var = new hi4(ii4Var5, child6, 0);
                                        d34Var.getClass();
                                        d34.K(id3, null, null, hi4Var);
                                        child6.setStarred(null);
                                    } else {
                                        d34Var.J(child6.getId(), null, false, null);
                                        child6.setStarred(null);
                                    }
                                    break;
                                } else {
                                    boolean zT2 = hw.t();
                                    Child child7 = ii4Var5.h;
                                    if (zT2) {
                                        d34Var.J(child7.getId(), null, true, null);
                                        child7.setStarred(new Date());
                                        break;
                                    } else {
                                        String id4 = child7.getId();
                                        hi4 hi4Var2 = new hi4(ii4Var5, child7, 1);
                                        d34Var.getClass();
                                        d34.I(id4, null, null, hi4Var2);
                                        child7.setStarred(new Date());
                                        if (ud3.X() && ud3.o() == null) {
                                            au0.w(contextZ2).b(gi1.G(child7), new Download(child7), false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                MainActivity mainActivity = (MainActivity) songBottomSheetDialog.e();
                                if (mainActivity != null) {
                                    bl2 bl2Var = mainActivity.P;
                                    if (bl2Var != null) {
                                        songBottomSheetDialog.N0 = true;
                                        Toast.makeText(songBottomSheetDialog.Z(), R.string.bottom_sheet_generating_instant_mix, 0).show();
                                        ii4 ii4Var6 = songBottomSheetDialog.C0;
                                        Child child8 = songBottomSheetDialog.D0;
                                        k03 k03Var = ii4Var6.i;
                                        k03Var.k(Collections.EMPTY_LIST);
                                        ii4Var6.c.o(child8.getId(), fb0.p, 30).e(mainActivity, new g7(k03Var, 0));
                                        k03Var.e(mainActivity, new z6(songBottomSheetDialog, bl2Var, mainActivity, 4));
                                    } else {
                                        Log.e("SongBottomSheetDialog", "MediaBrowser Future is null in MainActivity");
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                TextView textView6 = (TextView) viewInflate.findViewById(R.id.go_to_album_text_view);
                final int i10 = 5;
                textView6.setOnClickListener(new View.OnClickListener(this) { // from class: ci4
                    public final /* synthetic */ SongBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i11 = i10;
                        final int i12 = 0;
                        final int i13 = 1;
                        final SongBottomSheetDialog songBottomSheetDialog = this.o;
                        switch (i11) {
                            case 0:
                                bo2.f(songBottomSheetDialog.O0, songBottomSheetDialog.D0, true);
                                if (!songBottomSheetDialog.E0) {
                                    ((au) ((MainActivity) songBottomSheetDialog.X()).V.n).d(true);
                                }
                                songBottomSheetDialog.h0();
                                break;
                            case 1:
                                bo2.f(songBottomSheetDialog.O0, songBottomSheetDialog.D0, false);
                                if (!songBottomSheetDialog.E0) {
                                    ((au) ((MainActivity) songBottomSheetDialog.X()).V.n).d(true);
                                }
                                songBottomSheetDialog.h0();
                                break;
                            case 2:
                                Bundle bundle5 = new Bundle();
                                bundle5.putParcelable("TRACK_OBJECT", songBottomSheetDialog.D0);
                                ou3 ou3Var = new ou3();
                                ou3Var.c0(bundle5);
                                ou3Var.m0(songBottomSheetDialog.X().k(), null);
                                songBottomSheetDialog.h0();
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                if (ud3.o() == null) {
                                    au0.w(songBottomSheetDialog.Z()).e(gi1.G(songBottomSheetDialog.D0), new Download(songBottomSheetDialog.D0));
                                } else {
                                    g51.b(songBottomSheetDialog.D0);
                                }
                                songBottomSheetDialog.h0();
                                break;
                            case 4:
                                Bundle bundle6 = new Bundle();
                                bundle6.putParcelableArrayList("TRACKS_OBJECT", new ArrayList<>(Collections.singletonList(songBottomSheetDialog.D0)));
                                fl3 fl3Var = new fl3();
                                fl3Var.c0(bundle6);
                                fl3Var.m0(songBottomSheetDialog.X().k(), null);
                                songBottomSheetDialog.h0();
                                break;
                            case 5:
                                ii4 ii4Var2 = songBottomSheetDialog.C0;
                                rv2 rv2Var = ii4Var2.d;
                                String albumId = ii4Var2.h.getAlbumId();
                                rv2Var.getClass();
                                rv2.j(albumId).e(songBottomSheetDialog.v(), new a83() { // from class: di4
                                    @Override // defpackage.a83
                                    public final void b(Object obj) {
                                        int i14 = i13;
                                        SongBottomSheetDialog songBottomSheetDialog2 = songBottomSheetDialog;
                                        switch (i14) {
                                            case 0:
                                                Share share = (Share) obj;
                                                if (share == null) {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.share_unsupported_error), 0).show();
                                                    songBottomSheetDialog2.h0();
                                                } else {
                                                    ((ClipboardManager) songBottomSheetDialog2.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(songBottomSheetDialog2.s(R.string.app_name), share.getUrl()));
                                                    songBottomSheetDialog2.B0.g(songBottomSheetDialog2.X());
                                                    songBottomSheetDialog2.h0();
                                                }
                                                break;
                                            case 1:
                                                AlbumID3 albumID3 = (AlbumID3) obj;
                                                if (albumID3 != null) {
                                                    Bundle bundle7 = new Bundle();
                                                    bundle7.putParcelable("ALBUM_OBJECT", albumID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.albumPageFragment, bundle7, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_album), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                            default:
                                                ArtistID3 artistID3 = (ArtistID3) obj;
                                                if (artistID3 != null) {
                                                    Bundle bundle8 = new Bundle();
                                                    bundle8.putParcelable("ARTIST_OBJECT", artistID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.artistPageFragment, bundle8, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_artist), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 6:
                                ii4 ii4Var3 = songBottomSheetDialog.C0;
                                pa paVar = ii4Var3.e;
                                String artistId = ii4Var3.h.getArtistId();
                                paVar.getClass();
                                final int i14 = 2;
                                pa.v(artistId).e(songBottomSheetDialog.v(), new a83() { // from class: di4
                                    @Override // defpackage.a83
                                    public final void b(Object obj) {
                                        int i15 = i14;
                                        SongBottomSheetDialog songBottomSheetDialog2 = songBottomSheetDialog;
                                        switch (i15) {
                                            case 0:
                                                Share share = (Share) obj;
                                                if (share == null) {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.share_unsupported_error), 0).show();
                                                    songBottomSheetDialog2.h0();
                                                } else {
                                                    ((ClipboardManager) songBottomSheetDialog2.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(songBottomSheetDialog2.s(R.string.app_name), share.getUrl()));
                                                    songBottomSheetDialog2.B0.g(songBottomSheetDialog2.X());
                                                    songBottomSheetDialog2.h0();
                                                }
                                                break;
                                            case 1:
                                                AlbumID3 albumID3 = (AlbumID3) obj;
                                                if (albumID3 != null) {
                                                    Bundle bundle7 = new Bundle();
                                                    bundle7.putParcelable("ALBUM_OBJECT", albumID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.albumPageFragment, bundle7, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_album), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                            default:
                                                ArtistID3 artistID3 = (ArtistID3) obj;
                                                if (artistID3 != null) {
                                                    Bundle bundle8 = new Bundle();
                                                    bundle8.putParcelable("ARTIST_OBJECT", artistID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.artistPageFragment, bundle8, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_artist), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 7:
                                ii4 ii4Var4 = songBottomSheetDialog.C0;
                                hh3 hh3Var = ii4Var4.g;
                                String id2 = ii4Var4.h.getId();
                                String title = ii4Var4.h.getTitle();
                                hh3Var.getClass();
                                hh3.h(id2, title).e(songBottomSheetDialog.v(), new a83() { // from class: di4
                                    @Override // defpackage.a83
                                    public final void b(Object obj) {
                                        int i15 = i12;
                                        SongBottomSheetDialog songBottomSheetDialog2 = songBottomSheetDialog;
                                        switch (i15) {
                                            case 0:
                                                Share share = (Share) obj;
                                                if (share == null) {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.share_unsupported_error), 0).show();
                                                    songBottomSheetDialog2.h0();
                                                } else {
                                                    ((ClipboardManager) songBottomSheetDialog2.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(songBottomSheetDialog2.s(R.string.app_name), share.getUrl()));
                                                    songBottomSheetDialog2.B0.g(songBottomSheetDialog2.X());
                                                    songBottomSheetDialog2.h0();
                                                }
                                                break;
                                            case 1:
                                                AlbumID3 albumID3 = (AlbumID3) obj;
                                                if (albumID3 != null) {
                                                    Bundle bundle7 = new Bundle();
                                                    bundle7.putParcelable("ALBUM_OBJECT", albumID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.albumPageFragment, bundle7, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_album), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                            default:
                                                ArtistID3 artistID3 = (ArtistID3) obj;
                                                if (artistID3 != null) {
                                                    Bundle bundle8 = new Bundle();
                                                    bundle8.putParcelable("ARTIST_OBJECT", artistID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.artistPageFragment, bundle8, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_artist), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 8:
                                ii4 ii4Var5 = songBottomSheetDialog.C0;
                                Context contextZ2 = songBottomSheetDialog.Z();
                                d34 d34Var = ii4Var5.f;
                                if (n61.f(1, ii4Var5.h.getId(), ii4Var5.h.getStarred() != null)) {
                                    boolean zT = hw.t();
                                    Child child6 = ii4Var5.h;
                                    if (!zT) {
                                        String id3 = child6.getId();
                                        hi4 hi4Var = new hi4(ii4Var5, child6, 0);
                                        d34Var.getClass();
                                        d34.K(id3, null, null, hi4Var);
                                        child6.setStarred(null);
                                    } else {
                                        d34Var.J(child6.getId(), null, false, null);
                                        child6.setStarred(null);
                                    }
                                    break;
                                } else {
                                    boolean zT2 = hw.t();
                                    Child child7 = ii4Var5.h;
                                    if (zT2) {
                                        d34Var.J(child7.getId(), null, true, null);
                                        child7.setStarred(new Date());
                                        break;
                                    } else {
                                        String id4 = child7.getId();
                                        hi4 hi4Var2 = new hi4(ii4Var5, child7, 1);
                                        d34Var.getClass();
                                        d34.I(id4, null, null, hi4Var2);
                                        child7.setStarred(new Date());
                                        if (ud3.X() && ud3.o() == null) {
                                            au0.w(contextZ2).b(gi1.G(child7), new Download(child7), false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                MainActivity mainActivity = (MainActivity) songBottomSheetDialog.e();
                                if (mainActivity != null) {
                                    bl2 bl2Var = mainActivity.P;
                                    if (bl2Var != null) {
                                        songBottomSheetDialog.N0 = true;
                                        Toast.makeText(songBottomSheetDialog.Z(), R.string.bottom_sheet_generating_instant_mix, 0).show();
                                        ii4 ii4Var6 = songBottomSheetDialog.C0;
                                        Child child8 = songBottomSheetDialog.D0;
                                        k03 k03Var = ii4Var6.i;
                                        k03Var.k(Collections.EMPTY_LIST);
                                        ii4Var6.c.o(child8.getId(), fb0.p, 30).e(mainActivity, new g7(k03Var, 0));
                                        k03Var.e(mainActivity, new z6(songBottomSheetDialog, bl2Var, mainActivity, 4));
                                    } else {
                                        Log.e("SongBottomSheetDialog", "MediaBrowser Future is null in MainActivity");
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                textView6.setVisibility(this.C0.h.getAlbumId() != null ? 0 : 8);
                TextView textView7 = (TextView) viewInflate.findViewById(R.id.go_to_artist_text_view);
                final int i11 = 6;
                textView7.setOnClickListener(new View.OnClickListener(this) { // from class: ci4
                    public final /* synthetic */ SongBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i12 = i11;
                        final int i13 = 0;
                        final int i14 = 1;
                        final SongBottomSheetDialog songBottomSheetDialog = this.o;
                        switch (i12) {
                            case 0:
                                bo2.f(songBottomSheetDialog.O0, songBottomSheetDialog.D0, true);
                                if (!songBottomSheetDialog.E0) {
                                    ((au) ((MainActivity) songBottomSheetDialog.X()).V.n).d(true);
                                }
                                songBottomSheetDialog.h0();
                                break;
                            case 1:
                                bo2.f(songBottomSheetDialog.O0, songBottomSheetDialog.D0, false);
                                if (!songBottomSheetDialog.E0) {
                                    ((au) ((MainActivity) songBottomSheetDialog.X()).V.n).d(true);
                                }
                                songBottomSheetDialog.h0();
                                break;
                            case 2:
                                Bundle bundle5 = new Bundle();
                                bundle5.putParcelable("TRACK_OBJECT", songBottomSheetDialog.D0);
                                ou3 ou3Var = new ou3();
                                ou3Var.c0(bundle5);
                                ou3Var.m0(songBottomSheetDialog.X().k(), null);
                                songBottomSheetDialog.h0();
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                if (ud3.o() == null) {
                                    au0.w(songBottomSheetDialog.Z()).e(gi1.G(songBottomSheetDialog.D0), new Download(songBottomSheetDialog.D0));
                                } else {
                                    g51.b(songBottomSheetDialog.D0);
                                }
                                songBottomSheetDialog.h0();
                                break;
                            case 4:
                                Bundle bundle6 = new Bundle();
                                bundle6.putParcelableArrayList("TRACKS_OBJECT", new ArrayList<>(Collections.singletonList(songBottomSheetDialog.D0)));
                                fl3 fl3Var = new fl3();
                                fl3Var.c0(bundle6);
                                fl3Var.m0(songBottomSheetDialog.X().k(), null);
                                songBottomSheetDialog.h0();
                                break;
                            case 5:
                                ii4 ii4Var2 = songBottomSheetDialog.C0;
                                rv2 rv2Var = ii4Var2.d;
                                String albumId = ii4Var2.h.getAlbumId();
                                rv2Var.getClass();
                                rv2.j(albumId).e(songBottomSheetDialog.v(), new a83() { // from class: di4
                                    @Override // defpackage.a83
                                    public final void b(Object obj) {
                                        int i15 = i14;
                                        SongBottomSheetDialog songBottomSheetDialog2 = songBottomSheetDialog;
                                        switch (i15) {
                                            case 0:
                                                Share share = (Share) obj;
                                                if (share == null) {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.share_unsupported_error), 0).show();
                                                    songBottomSheetDialog2.h0();
                                                } else {
                                                    ((ClipboardManager) songBottomSheetDialog2.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(songBottomSheetDialog2.s(R.string.app_name), share.getUrl()));
                                                    songBottomSheetDialog2.B0.g(songBottomSheetDialog2.X());
                                                    songBottomSheetDialog2.h0();
                                                }
                                                break;
                                            case 1:
                                                AlbumID3 albumID3 = (AlbumID3) obj;
                                                if (albumID3 != null) {
                                                    Bundle bundle7 = new Bundle();
                                                    bundle7.putParcelable("ALBUM_OBJECT", albumID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.albumPageFragment, bundle7, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_album), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                            default:
                                                ArtistID3 artistID3 = (ArtistID3) obj;
                                                if (artistID3 != null) {
                                                    Bundle bundle8 = new Bundle();
                                                    bundle8.putParcelable("ARTIST_OBJECT", artistID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.artistPageFragment, bundle8, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_artist), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 6:
                                ii4 ii4Var3 = songBottomSheetDialog.C0;
                                pa paVar = ii4Var3.e;
                                String artistId = ii4Var3.h.getArtistId();
                                paVar.getClass();
                                final int i15 = 2;
                                pa.v(artistId).e(songBottomSheetDialog.v(), new a83() { // from class: di4
                                    @Override // defpackage.a83
                                    public final void b(Object obj) {
                                        int i16 = i15;
                                        SongBottomSheetDialog songBottomSheetDialog2 = songBottomSheetDialog;
                                        switch (i16) {
                                            case 0:
                                                Share share = (Share) obj;
                                                if (share == null) {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.share_unsupported_error), 0).show();
                                                    songBottomSheetDialog2.h0();
                                                } else {
                                                    ((ClipboardManager) songBottomSheetDialog2.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(songBottomSheetDialog2.s(R.string.app_name), share.getUrl()));
                                                    songBottomSheetDialog2.B0.g(songBottomSheetDialog2.X());
                                                    songBottomSheetDialog2.h0();
                                                }
                                                break;
                                            case 1:
                                                AlbumID3 albumID3 = (AlbumID3) obj;
                                                if (albumID3 != null) {
                                                    Bundle bundle7 = new Bundle();
                                                    bundle7.putParcelable("ALBUM_OBJECT", albumID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.albumPageFragment, bundle7, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_album), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                            default:
                                                ArtistID3 artistID3 = (ArtistID3) obj;
                                                if (artistID3 != null) {
                                                    Bundle bundle8 = new Bundle();
                                                    bundle8.putParcelable("ARTIST_OBJECT", artistID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.artistPageFragment, bundle8, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_artist), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 7:
                                ii4 ii4Var4 = songBottomSheetDialog.C0;
                                hh3 hh3Var = ii4Var4.g;
                                String id2 = ii4Var4.h.getId();
                                String title = ii4Var4.h.getTitle();
                                hh3Var.getClass();
                                hh3.h(id2, title).e(songBottomSheetDialog.v(), new a83() { // from class: di4
                                    @Override // defpackage.a83
                                    public final void b(Object obj) {
                                        int i16 = i13;
                                        SongBottomSheetDialog songBottomSheetDialog2 = songBottomSheetDialog;
                                        switch (i16) {
                                            case 0:
                                                Share share = (Share) obj;
                                                if (share == null) {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.share_unsupported_error), 0).show();
                                                    songBottomSheetDialog2.h0();
                                                } else {
                                                    ((ClipboardManager) songBottomSheetDialog2.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(songBottomSheetDialog2.s(R.string.app_name), share.getUrl()));
                                                    songBottomSheetDialog2.B0.g(songBottomSheetDialog2.X());
                                                    songBottomSheetDialog2.h0();
                                                }
                                                break;
                                            case 1:
                                                AlbumID3 albumID3 = (AlbumID3) obj;
                                                if (albumID3 != null) {
                                                    Bundle bundle7 = new Bundle();
                                                    bundle7.putParcelable("ALBUM_OBJECT", albumID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.albumPageFragment, bundle7, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_album), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                            default:
                                                ArtistID3 artistID3 = (ArtistID3) obj;
                                                if (artistID3 != null) {
                                                    Bundle bundle8 = new Bundle();
                                                    bundle8.putParcelable("ARTIST_OBJECT", artistID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.artistPageFragment, bundle8, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_artist), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 8:
                                ii4 ii4Var5 = songBottomSheetDialog.C0;
                                Context contextZ2 = songBottomSheetDialog.Z();
                                d34 d34Var = ii4Var5.f;
                                if (n61.f(1, ii4Var5.h.getId(), ii4Var5.h.getStarred() != null)) {
                                    boolean zT = hw.t();
                                    Child child6 = ii4Var5.h;
                                    if (!zT) {
                                        String id3 = child6.getId();
                                        hi4 hi4Var = new hi4(ii4Var5, child6, 0);
                                        d34Var.getClass();
                                        d34.K(id3, null, null, hi4Var);
                                        child6.setStarred(null);
                                    } else {
                                        d34Var.J(child6.getId(), null, false, null);
                                        child6.setStarred(null);
                                    }
                                    break;
                                } else {
                                    boolean zT2 = hw.t();
                                    Child child7 = ii4Var5.h;
                                    if (zT2) {
                                        d34Var.J(child7.getId(), null, true, null);
                                        child7.setStarred(new Date());
                                        break;
                                    } else {
                                        String id4 = child7.getId();
                                        hi4 hi4Var2 = new hi4(ii4Var5, child7, 1);
                                        d34Var.getClass();
                                        d34.I(id4, null, null, hi4Var2);
                                        child7.setStarred(new Date());
                                        if (ud3.X() && ud3.o() == null) {
                                            au0.w(contextZ2).b(gi1.G(child7), new Download(child7), false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                MainActivity mainActivity = (MainActivity) songBottomSheetDialog.e();
                                if (mainActivity != null) {
                                    bl2 bl2Var = mainActivity.P;
                                    if (bl2Var != null) {
                                        songBottomSheetDialog.N0 = true;
                                        Toast.makeText(songBottomSheetDialog.Z(), R.string.bottom_sheet_generating_instant_mix, 0).show();
                                        ii4 ii4Var6 = songBottomSheetDialog.C0;
                                        Child child8 = songBottomSheetDialog.D0;
                                        k03 k03Var = ii4Var6.i;
                                        k03Var.k(Collections.EMPTY_LIST);
                                        ii4Var6.c.o(child8.getId(), fb0.p, 30).e(mainActivity, new g7(k03Var, 0));
                                        k03Var.e(mainActivity, new z6(songBottomSheetDialog, bl2Var, mainActivity, 4));
                                    } else {
                                        Log.e("SongBottomSheetDialog", "MediaBrowser Future is null in MainActivity");
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                textView7.setVisibility(this.C0.h.getArtistId() != null ? 0 : 8);
                TextView textView8 = (TextView) viewInflate.findViewById(R.id.share_text_view);
                final int i12 = 7;
                textView8.setOnClickListener(new View.OnClickListener(this) { // from class: ci4
                    public final /* synthetic */ SongBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i13 = i12;
                        final int i14 = 0;
                        final int i15 = 1;
                        final SongBottomSheetDialog songBottomSheetDialog = this.o;
                        switch (i13) {
                            case 0:
                                bo2.f(songBottomSheetDialog.O0, songBottomSheetDialog.D0, true);
                                if (!songBottomSheetDialog.E0) {
                                    ((au) ((MainActivity) songBottomSheetDialog.X()).V.n).d(true);
                                }
                                songBottomSheetDialog.h0();
                                break;
                            case 1:
                                bo2.f(songBottomSheetDialog.O0, songBottomSheetDialog.D0, false);
                                if (!songBottomSheetDialog.E0) {
                                    ((au) ((MainActivity) songBottomSheetDialog.X()).V.n).d(true);
                                }
                                songBottomSheetDialog.h0();
                                break;
                            case 2:
                                Bundle bundle5 = new Bundle();
                                bundle5.putParcelable("TRACK_OBJECT", songBottomSheetDialog.D0);
                                ou3 ou3Var = new ou3();
                                ou3Var.c0(bundle5);
                                ou3Var.m0(songBottomSheetDialog.X().k(), null);
                                songBottomSheetDialog.h0();
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                if (ud3.o() == null) {
                                    au0.w(songBottomSheetDialog.Z()).e(gi1.G(songBottomSheetDialog.D0), new Download(songBottomSheetDialog.D0));
                                } else {
                                    g51.b(songBottomSheetDialog.D0);
                                }
                                songBottomSheetDialog.h0();
                                break;
                            case 4:
                                Bundle bundle6 = new Bundle();
                                bundle6.putParcelableArrayList("TRACKS_OBJECT", new ArrayList<>(Collections.singletonList(songBottomSheetDialog.D0)));
                                fl3 fl3Var = new fl3();
                                fl3Var.c0(bundle6);
                                fl3Var.m0(songBottomSheetDialog.X().k(), null);
                                songBottomSheetDialog.h0();
                                break;
                            case 5:
                                ii4 ii4Var2 = songBottomSheetDialog.C0;
                                rv2 rv2Var = ii4Var2.d;
                                String albumId = ii4Var2.h.getAlbumId();
                                rv2Var.getClass();
                                rv2.j(albumId).e(songBottomSheetDialog.v(), new a83() { // from class: di4
                                    @Override // defpackage.a83
                                    public final void b(Object obj) {
                                        int i16 = i15;
                                        SongBottomSheetDialog songBottomSheetDialog2 = songBottomSheetDialog;
                                        switch (i16) {
                                            case 0:
                                                Share share = (Share) obj;
                                                if (share == null) {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.share_unsupported_error), 0).show();
                                                    songBottomSheetDialog2.h0();
                                                } else {
                                                    ((ClipboardManager) songBottomSheetDialog2.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(songBottomSheetDialog2.s(R.string.app_name), share.getUrl()));
                                                    songBottomSheetDialog2.B0.g(songBottomSheetDialog2.X());
                                                    songBottomSheetDialog2.h0();
                                                }
                                                break;
                                            case 1:
                                                AlbumID3 albumID3 = (AlbumID3) obj;
                                                if (albumID3 != null) {
                                                    Bundle bundle7 = new Bundle();
                                                    bundle7.putParcelable("ALBUM_OBJECT", albumID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.albumPageFragment, bundle7, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_album), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                            default:
                                                ArtistID3 artistID3 = (ArtistID3) obj;
                                                if (artistID3 != null) {
                                                    Bundle bundle8 = new Bundle();
                                                    bundle8.putParcelable("ARTIST_OBJECT", artistID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.artistPageFragment, bundle8, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_artist), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 6:
                                ii4 ii4Var3 = songBottomSheetDialog.C0;
                                pa paVar = ii4Var3.e;
                                String artistId = ii4Var3.h.getArtistId();
                                paVar.getClass();
                                final int i16 = 2;
                                pa.v(artistId).e(songBottomSheetDialog.v(), new a83() { // from class: di4
                                    @Override // defpackage.a83
                                    public final void b(Object obj) {
                                        int i17 = i16;
                                        SongBottomSheetDialog songBottomSheetDialog2 = songBottomSheetDialog;
                                        switch (i17) {
                                            case 0:
                                                Share share = (Share) obj;
                                                if (share == null) {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.share_unsupported_error), 0).show();
                                                    songBottomSheetDialog2.h0();
                                                } else {
                                                    ((ClipboardManager) songBottomSheetDialog2.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(songBottomSheetDialog2.s(R.string.app_name), share.getUrl()));
                                                    songBottomSheetDialog2.B0.g(songBottomSheetDialog2.X());
                                                    songBottomSheetDialog2.h0();
                                                }
                                                break;
                                            case 1:
                                                AlbumID3 albumID3 = (AlbumID3) obj;
                                                if (albumID3 != null) {
                                                    Bundle bundle7 = new Bundle();
                                                    bundle7.putParcelable("ALBUM_OBJECT", albumID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.albumPageFragment, bundle7, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_album), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                            default:
                                                ArtistID3 artistID3 = (ArtistID3) obj;
                                                if (artistID3 != null) {
                                                    Bundle bundle8 = new Bundle();
                                                    bundle8.putParcelable("ARTIST_OBJECT", artistID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.artistPageFragment, bundle8, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_artist), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 7:
                                ii4 ii4Var4 = songBottomSheetDialog.C0;
                                hh3 hh3Var = ii4Var4.g;
                                String id2 = ii4Var4.h.getId();
                                String title = ii4Var4.h.getTitle();
                                hh3Var.getClass();
                                hh3.h(id2, title).e(songBottomSheetDialog.v(), new a83() { // from class: di4
                                    @Override // defpackage.a83
                                    public final void b(Object obj) {
                                        int i17 = i14;
                                        SongBottomSheetDialog songBottomSheetDialog2 = songBottomSheetDialog;
                                        switch (i17) {
                                            case 0:
                                                Share share = (Share) obj;
                                                if (share == null) {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.share_unsupported_error), 0).show();
                                                    songBottomSheetDialog2.h0();
                                                } else {
                                                    ((ClipboardManager) songBottomSheetDialog2.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(songBottomSheetDialog2.s(R.string.app_name), share.getUrl()));
                                                    songBottomSheetDialog2.B0.g(songBottomSheetDialog2.X());
                                                    songBottomSheetDialog2.h0();
                                                }
                                                break;
                                            case 1:
                                                AlbumID3 albumID3 = (AlbumID3) obj;
                                                if (albumID3 != null) {
                                                    Bundle bundle7 = new Bundle();
                                                    bundle7.putParcelable("ALBUM_OBJECT", albumID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.albumPageFragment, bundle7, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_album), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                            default:
                                                ArtistID3 artistID3 = (ArtistID3) obj;
                                                if (artistID3 != null) {
                                                    Bundle bundle8 = new Bundle();
                                                    bundle8.putParcelable("ARTIST_OBJECT", artistID3);
                                                    if (songBottomSheetDialog2.E0) {
                                                        ((au) ((MainActivity) songBottomSheetDialog2.X()).V.n).d(true);
                                                    }
                                                    q05.l(songBottomSheetDialog2).m(R.id.artistPageFragment, bundle8, null);
                                                } else {
                                                    Toast.makeText(songBottomSheetDialog2.Z(), songBottomSheetDialog2.s(R.string.song_bottom_sheet_error_retrieving_artist), 0).show();
                                                }
                                                songBottomSheetDialog2.h0();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 8:
                                ii4 ii4Var5 = songBottomSheetDialog.C0;
                                Context contextZ2 = songBottomSheetDialog.Z();
                                d34 d34Var = ii4Var5.f;
                                if (n61.f(1, ii4Var5.h.getId(), ii4Var5.h.getStarred() != null)) {
                                    boolean zT = hw.t();
                                    Child child6 = ii4Var5.h;
                                    if (!zT) {
                                        String id3 = child6.getId();
                                        hi4 hi4Var = new hi4(ii4Var5, child6, 0);
                                        d34Var.getClass();
                                        d34.K(id3, null, null, hi4Var);
                                        child6.setStarred(null);
                                    } else {
                                        d34Var.J(child6.getId(), null, false, null);
                                        child6.setStarred(null);
                                    }
                                    break;
                                } else {
                                    boolean zT2 = hw.t();
                                    Child child7 = ii4Var5.h;
                                    if (zT2) {
                                        d34Var.J(child7.getId(), null, true, null);
                                        child7.setStarred(new Date());
                                        break;
                                    } else {
                                        String id4 = child7.getId();
                                        hi4 hi4Var2 = new hi4(ii4Var5, child7, 1);
                                        d34Var.getClass();
                                        d34.I(id4, null, null, hi4Var2);
                                        child7.setStarred(new Date());
                                        if (ud3.X() && ud3.o() == null) {
                                            au0.w(contextZ2).b(gi1.G(child7), new Download(child7), false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                MainActivity mainActivity = (MainActivity) songBottomSheetDialog.e();
                                if (mainActivity != null) {
                                    bl2 bl2Var = mainActivity.P;
                                    if (bl2Var != null) {
                                        songBottomSheetDialog.N0 = true;
                                        Toast.makeText(songBottomSheetDialog.Z(), R.string.bottom_sheet_generating_instant_mix, 0).show();
                                        ii4 ii4Var6 = songBottomSheetDialog.C0;
                                        Child child8 = songBottomSheetDialog.D0;
                                        k03 k03Var = ii4Var6.i;
                                        k03Var.k(Collections.EMPTY_LIST);
                                        ii4Var6.c.o(child8.getId(), fb0.p, 30).e(mainActivity, new g7(k03Var, 0));
                                        k03Var.e(mainActivity, new z6(songBottomSheetDialog, bl2Var, mainActivity, 4));
                                    } else {
                                        Log.e("SongBottomSheetDialog", "MediaBrowser Future is null in MainActivity");
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                textView8.setVisibility(ud3.V() ? 0 : 8);
                Child child6 = this.D0;
                bi4 bi4Var4 = new bi4(this, 1);
                child6.getClass();
                if (ot1.c(child6.getId())) {
                    int[] iArr = {R.id.play_radio_text_view, R.id.rate_text_view, R.id.remove_text_view, R.id.add_to_playlist_text_view, R.id.go_to_album_text_view, R.id.go_to_artist_text_view, R.id.share_text_view, R.id.remove_from_playlist_text_view, R.id.asset_link_chip_group};
                    for (int i13 = 0; i13 < 9; i13++) {
                        View viewFindViewById5 = viewInflate.findViewById(iArr[i13]);
                        if (viewFindViewById5 != null) {
                            viewFindViewById5.setVisibility(8);
                        }
                    }
                    View viewFindViewById6 = viewInflate.findViewById(R.id.button_favorite);
                    if (viewFindViewById6 != null) {
                        viewFindViewById6.setOnClickListener(new tr1(child6, 1));
                    }
                    View viewFindViewById7 = viewInflate.findViewById(R.id.button_favorite);
                    if (viewFindViewById7 != null) {
                        viewFindViewById7.setOnLongClickListener(null);
                    }
                    TextView textView9 = (TextView) viewInflate.findViewById(R.id.download_text_view);
                    if (textView9 != null) {
                        textView9.setVisibility(0);
                        textView9.setText(R.string.homemusic_hub_download_track);
                        textView9.setOnClickListener(new sr1(child6, bi4Var4));
                    }
                }
                return viewInflate;
            }
        }
        n0();
        return viewInflate;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void R() {
        super.R();
        if (this.D0 != null) {
            Context contextZ = Z();
            cb4 cb4Var = new cb4(Z(), new ComponentName(Z(), (Class<?>) MediaService.class));
            Bundle bundle = Bundle.EMPTY;
            aj2 aj2Var = new aj2();
            Looper looperX = f35.x();
            bl2 bl2Var = new bl2(looperX);
            b11.w(bl2Var, new bj2(contextZ, cb4Var, bundle, aj2Var, looperX, bl2Var, cb4Var.a.e() ? new xc5(4, new fi0(new x7(contextZ))) : null), new Handler(looperX));
            this.O0 = bl2Var;
        }
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void S() {
        bl2 bl2Var = this.O0;
        if (bl2Var != null) {
            sk2.Z0(bl2Var);
        }
        super.S();
    }

    @Override // defpackage.kc1
    public final void T(View view, Bundle bundle) {
        if (this.D0 != null) {
            g51.d.e(v(), new d8(15, new bi4(this, 0)));
        }
    }

    public final ik o0(Chip chip, String str, String str2) {
        int i;
        if (chip == null) {
            return null;
        }
        if (str2 == null || str2.isEmpty()) {
            chip.setVisibility(8);
            chip.setText("");
            chip.setOnClickListener(null);
            chip.setOnLongClickListener(null);
            return null;
        }
        switch (str) {
            case "artist":
                i = R.string.asset_link_label_artist;
                break;
            case "song":
                i = R.string.asset_link_label_song;
                break;
            case "year":
                i = R.string.asset_link_label_year;
                break;
            case "album":
                i = R.string.asset_link_label_album;
                break;
            case "genre":
                i = R.string.asset_link_label_genre;
                break;
            case "playlist":
                i = R.string.asset_link_label_playlist;
                break;
            default:
                i = R.string.asset_link_label_unknown;
                break;
        }
        String strS = s(i);
        ik ikVarH = l93.h(str, str2);
        if (ikVarH == null) {
            chip.setVisibility(8);
            chip.setText("");
            chip.setOnClickListener(null);
            chip.setOnLongClickListener(null);
            return null;
        }
        chip.setText(t(R.string.asset_link_chip_text, strS, ikVarH.d));
        chip.setVisibility(0);
        chip.setOnClickListener(new fi4(this, ikVarH, 1));
        chip.setOnLongClickListener(new yj3(this, ikVarH, str2, 1));
        return ikVarH;
    }

    public final void p0(View view, ik ikVar) {
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
        view.setOnClickListener(new fi4(this, ikVar, 0));
        view.setOnLongClickListener(new i8(6, this, ikVar));
    }

    public final void q0() {
        if (this.F0 == null || this.G0 == null || this.D0 == null) {
            return;
        }
        if (ud3.o() != null) {
            boolean z = g51.e(this.D0) != null;
            this.F0.setVisibility(z ? 8 : 0);
            this.G0.setVisibility(z ? 0 : 8);
        } else {
            eu0 eu0VarW = au0.w(Z());
            String id = this.D0.getId();
            eu0VarW.getClass();
            boolean zD = eu0.d(id);
            this.F0.setVisibility(zD ? 8 : 0);
            this.G0.setVisibility(zD ? 0 : 8);
        }
    }
}
