package com.eddyizm.tempus.ui.fragment.bottomsheetdialog;

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
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.ArtistBottomSheetDialog;
import defpackage.aj2;
import defpackage.b11;
import defpackage.b75;
import defpackage.bj;
import defpackage.bj2;
import defpackage.bl2;
import defpackage.bq4;
import defpackage.cb4;
import defpackage.e75;
import defpackage.f35;
import defpackage.fi0;
import defpackage.gh0;
import defpackage.i30;
import defpackage.j8;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.n61;
import defpackage.nc1;
import defpackage.q05;
import defpackage.sk2;
import defpackage.t6;
import defpackage.ud3;
import defpackage.vz3;
import defpackage.wg0;
import defpackage.x7;
import defpackage.xc5;
import defpackage.xv0;
import defpackage.zt;
import java.util.Collections;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ArtistBottomSheetDialog extends zt implements View.OnClickListener {
    public bj B0;
    public ArtistID3 C0;
    public bl2 D0;
    public boolean E0 = true;
    public boolean F0 = false;

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.bottom_sheet_artist_dialog, viewGroup, false);
        Bundle bundle2 = this.s;
        if (bundle2 != null) {
            ArtistID3 artistID3 = (ArtistID3) bundle2.getParcelable("ARTIST_OBJECT");
            this.C0 = artistID3;
            if (artistID3 != null) {
                this.C0 = artistID3.strippedForNav();
                nc1 nc1VarX = X();
                e75 e75VarD = nc1VarX.d();
                b75 b75VarR = gh0.r(nc1VarX);
                bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
                i30 i30VarA = kx3.a(bj.class);
                String strB = i30VarA.b();
                if (strB == null) {
                    kf2.n("Local and anonymous classes can not be ViewModels");
                    return null;
                }
                bj bjVar = (bj) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                this.B0 = bjVar;
                bjVar.g = this.C0;
                bjVar.f = null;
                q05.u((ViewGroup) viewInflate.findViewById(R.id.option_linear_layout));
                ImageView imageView = (ImageView) viewInflate.findViewById(R.id.artist_cover_image_view);
                Context contextZ = Z();
                String coverArtId = this.B0.g.getCoverArtId();
                vz3 vz3VarT = b11.g(contextZ, coverArtId, 3, a.c(contextZ), coverArtId != null ? wg0.b(ud3.t(), coverArtId) : null).T(xv0.b());
                if (ud3.R()) {
                    vz3VarT = (vz3) vz3VarT.l();
                }
                vz3VarT.K(imageView);
                TextView textView = (TextView) viewInflate.findViewById(R.id.song_title_text_view);
                textView.setText(this.B0.g.getName());
                final int i2 = 1;
                textView.setSelected(true);
                ToggleButton toggleButton = (ToggleButton) viewInflate.findViewById(R.id.button_favorite);
                toggleButton.setChecked(n61.f(3, this.B0.g.getId(), this.B0.g.getStarred() != null));
                toggleButton.setOnClickListener(new View.OnClickListener(this) { // from class: wi
                    public final /* synthetic */ ArtistBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        bl2 bl2Var;
                        int i3 = i;
                        ArtistBottomSheetDialog artistBottomSheetDialog = this.o;
                        int i4 = 1;
                        switch (i3) {
                            case 0:
                                bj bjVar2 = artistBottomSheetDialog.B0;
                                Context contextZ2 = artistBottomSheetDialog.Z();
                                d34 d34Var = bjVar2.d;
                                if (!n61.f(3, bjVar2.g.getId(), bjVar2.g.getStarred() != null)) {
                                    boolean zT = hw.t();
                                    ArtistID3 artistID4 = bjVar2.g;
                                    if (!zT) {
                                        String id = artistID4.getId();
                                        zi ziVar = new zi(bjVar2, 1);
                                        d34Var.getClass();
                                        d34.I(null, null, id, ziVar);
                                        bjVar2.g.setStarred(new Date());
                                        Log.d("ArtistSync", "Checking preference: " + ud3.W());
                                        if (!ud3.W()) {
                                            Log.d("ArtistSync", "Artist sync preference is disabled");
                                        } else {
                                            Log.d("ArtistSync", "Starting artist sync for: " + bjVar2.g.getName());
                                            bjVar2.c.w(bjVar2.g.getId(), new aj(contextZ2));
                                        }
                                    } else {
                                        d34Var.J(null, null, true, artistID4.getId());
                                        bjVar2.g.setStarred(new Date());
                                    }
                                } else {
                                    boolean zT2 = hw.t();
                                    ArtistID3 artistID5 = bjVar2.g;
                                    if (!zT2) {
                                        String id2 = artistID5.getId();
                                        zi ziVar2 = new zi(bjVar2, 0);
                                        d34Var.getClass();
                                        d34.K(null, null, id2, ziVar2);
                                        bjVar2.g.setStarred(null);
                                    } else {
                                        d34Var.J(null, null, false, artistID5.getId());
                                        bjVar2.g.setStarred(null);
                                    }
                                }
                                break;
                            case 1:
                                MainActivity mainActivity = (MainActivity) artistBottomSheetDialog.e();
                                if (mainActivity != null && (bl2Var = mainActivity.P) != null) {
                                    artistBottomSheetDialog.E0 = true;
                                    Toast.makeText(artistBottomSheetDialog.Z(), R.string.bottom_sheet_generating_instant_mix, 0).show();
                                    bj bjVar3 = artistBottomSheetDialog.B0;
                                    ArtistID3 artistID6 = artistBottomSheetDialog.C0;
                                    k03 k03Var = bjVar3.e;
                                    k03Var.k(Collections.EMPTY_LIST);
                                    bjVar3.c.getClass();
                                    new xi4(2).o(artistID6.getId(), fb0.n, 30).e(mainActivity, new g7(k03Var, 0));
                                    k03Var.e(mainActivity, new z6(artistBottomSheetDialog, bl2Var, mainActivity, i4));
                                }
                                break;
                            default:
                                pa paVar = new pa(12);
                                ArtistID3 artistID7 = artistBottomSheetDialog.C0;
                                k03 k03Var2 = new k03();
                                App.f(false).c().i(artistID7.getId()).enqueue(new r20(paVar, artistID7, k03Var2, 2));
                                k03Var2.e(artistBottomSheetDialog.v(), new d8(3, artistBottomSheetDialog));
                                break;
                        }
                    }
                });
                View viewFindViewById = viewInflate.findViewById(R.id.homemusic_wave_artist_text_view);
                String id = this.C0.getId();
                final int i3 = 2;
                if (id != null && !id.trim().isEmpty()) {
                    viewFindViewById.setVisibility(0);
                    viewFindViewById.setOnClickListener(new j8(2, this, id));
                }
                ((TextView) viewInflate.findViewById(R.id.play_radio_text_view)).setOnClickListener(new View.OnClickListener(this) { // from class: wi
                    public final /* synthetic */ ArtistBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        bl2 bl2Var;
                        int i4 = i2;
                        ArtistBottomSheetDialog artistBottomSheetDialog = this.o;
                        int i5 = 1;
                        switch (i4) {
                            case 0:
                                bj bjVar2 = artistBottomSheetDialog.B0;
                                Context contextZ2 = artistBottomSheetDialog.Z();
                                d34 d34Var = bjVar2.d;
                                if (!n61.f(3, bjVar2.g.getId(), bjVar2.g.getStarred() != null)) {
                                    boolean zT = hw.t();
                                    ArtistID3 artistID4 = bjVar2.g;
                                    if (!zT) {
                                        String id2 = artistID4.getId();
                                        zi ziVar = new zi(bjVar2, 1);
                                        d34Var.getClass();
                                        d34.I(null, null, id2, ziVar);
                                        bjVar2.g.setStarred(new Date());
                                        Log.d("ArtistSync", "Checking preference: " + ud3.W());
                                        if (!ud3.W()) {
                                            Log.d("ArtistSync", "Artist sync preference is disabled");
                                        } else {
                                            Log.d("ArtistSync", "Starting artist sync for: " + bjVar2.g.getName());
                                            bjVar2.c.w(bjVar2.g.getId(), new aj(contextZ2));
                                        }
                                    } else {
                                        d34Var.J(null, null, true, artistID4.getId());
                                        bjVar2.g.setStarred(new Date());
                                    }
                                } else {
                                    boolean zT2 = hw.t();
                                    ArtistID3 artistID5 = bjVar2.g;
                                    if (!zT2) {
                                        String id3 = artistID5.getId();
                                        zi ziVar2 = new zi(bjVar2, 0);
                                        d34Var.getClass();
                                        d34.K(null, null, id3, ziVar2);
                                        bjVar2.g.setStarred(null);
                                    } else {
                                        d34Var.J(null, null, false, artistID5.getId());
                                        bjVar2.g.setStarred(null);
                                    }
                                }
                                break;
                            case 1:
                                MainActivity mainActivity = (MainActivity) artistBottomSheetDialog.e();
                                if (mainActivity != null && (bl2Var = mainActivity.P) != null) {
                                    artistBottomSheetDialog.E0 = true;
                                    Toast.makeText(artistBottomSheetDialog.Z(), R.string.bottom_sheet_generating_instant_mix, 0).show();
                                    bj bjVar3 = artistBottomSheetDialog.B0;
                                    ArtistID3 artistID6 = artistBottomSheetDialog.C0;
                                    k03 k03Var = bjVar3.e;
                                    k03Var.k(Collections.EMPTY_LIST);
                                    bjVar3.c.getClass();
                                    new xi4(2).o(artistID6.getId(), fb0.n, 30).e(mainActivity, new g7(k03Var, 0));
                                    k03Var.e(mainActivity, new z6(artistBottomSheetDialog, bl2Var, mainActivity, i5));
                                }
                                break;
                            default:
                                pa paVar = new pa(12);
                                ArtistID3 artistID7 = artistBottomSheetDialog.C0;
                                k03 k03Var2 = new k03();
                                App.f(false).c().i(artistID7.getId()).enqueue(new r20(paVar, artistID7, k03Var2, 2));
                                k03Var2.e(artistBottomSheetDialog.v(), new d8(3, artistBottomSheetDialog));
                                break;
                        }
                    }
                });
                ((TextView) viewInflate.findViewById(R.id.play_random_text_view)).setOnClickListener(new View.OnClickListener(this) { // from class: wi
                    public final /* synthetic */ ArtistBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        bl2 bl2Var;
                        int i4 = i3;
                        ArtistBottomSheetDialog artistBottomSheetDialog = this.o;
                        int i5 = 1;
                        switch (i4) {
                            case 0:
                                bj bjVar2 = artistBottomSheetDialog.B0;
                                Context contextZ2 = artistBottomSheetDialog.Z();
                                d34 d34Var = bjVar2.d;
                                if (!n61.f(3, bjVar2.g.getId(), bjVar2.g.getStarred() != null)) {
                                    boolean zT = hw.t();
                                    ArtistID3 artistID4 = bjVar2.g;
                                    if (!zT) {
                                        String id2 = artistID4.getId();
                                        zi ziVar = new zi(bjVar2, 1);
                                        d34Var.getClass();
                                        d34.I(null, null, id2, ziVar);
                                        bjVar2.g.setStarred(new Date());
                                        Log.d("ArtistSync", "Checking preference: " + ud3.W());
                                        if (!ud3.W()) {
                                            Log.d("ArtistSync", "Artist sync preference is disabled");
                                        } else {
                                            Log.d("ArtistSync", "Starting artist sync for: " + bjVar2.g.getName());
                                            bjVar2.c.w(bjVar2.g.getId(), new aj(contextZ2));
                                        }
                                    } else {
                                        d34Var.J(null, null, true, artistID4.getId());
                                        bjVar2.g.setStarred(new Date());
                                    }
                                } else {
                                    boolean zT2 = hw.t();
                                    ArtistID3 artistID5 = bjVar2.g;
                                    if (!zT2) {
                                        String id3 = artistID5.getId();
                                        zi ziVar2 = new zi(bjVar2, 0);
                                        d34Var.getClass();
                                        d34.K(null, null, id3, ziVar2);
                                        bjVar2.g.setStarred(null);
                                    } else {
                                        d34Var.J(null, null, false, artistID5.getId());
                                        bjVar2.g.setStarred(null);
                                    }
                                }
                                break;
                            case 1:
                                MainActivity mainActivity = (MainActivity) artistBottomSheetDialog.e();
                                if (mainActivity != null && (bl2Var = mainActivity.P) != null) {
                                    artistBottomSheetDialog.E0 = true;
                                    Toast.makeText(artistBottomSheetDialog.Z(), R.string.bottom_sheet_generating_instant_mix, 0).show();
                                    bj bjVar3 = artistBottomSheetDialog.B0;
                                    ArtistID3 artistID6 = artistBottomSheetDialog.C0;
                                    k03 k03Var = bjVar3.e;
                                    k03Var.k(Collections.EMPTY_LIST);
                                    bjVar3.c.getClass();
                                    new xi4(2).o(artistID6.getId(), fb0.n, 30).e(mainActivity, new g7(k03Var, 0));
                                    k03Var.e(mainActivity, new z6(artistBottomSheetDialog, bl2Var, mainActivity, i5));
                                }
                                break;
                            default:
                                pa paVar = new pa(12);
                                ArtistID3 artistID7 = artistBottomSheetDialog.C0;
                                k03 k03Var2 = new k03();
                                App.f(false).c().i(artistID7.getId()).enqueue(new r20(paVar, artistID7, k03Var2, 2));
                                k03Var2.e(artistBottomSheetDialog.v(), new d8(3, artistBottomSheetDialog));
                                break;
                        }
                    }
                });
                final TextView textView2 = (TextView) viewInflate.findViewById(R.id.play_next_text_view);
                final TextView textView3 = (TextView) viewInflate.findViewById(R.id.add_to_queue_text_view);
                final TextView textView4 = (TextView) viewInflate.findViewById(R.id.add_to_playlist_text_view);
                final t6 t6Var = new t6(this, textView2, textView3, textView4, 1);
                final int i4 = 0;
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: xi
                    public final /* synthetic */ ArtistBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i5 = i4;
                        t6 t6Var2 = t6Var;
                        TextView textView5 = textView4;
                        TextView textView6 = textView3;
                        TextView textView7 = textView2;
                        ArtistBottomSheetDialog artistBottomSheetDialog = this.o;
                        int i6 = 1;
                        int i7 = 0;
                        switch (i5) {
                            case 0:
                                if (!artistBottomSheetDialog.F0) {
                                    artistBottomSheetDialog.F0 = true;
                                    if (textView7 != null) {
                                        textView7.setEnabled(false);
                                    }
                                    if (textView6 != null) {
                                        textView6.setEnabled(false);
                                    }
                                    if (textView5 != null) {
                                        textView5.setEnabled(false);
                                    }
                                    Toast.makeText(artistBottomSheetDialog.Z(), R.string.artist_bottom_sheet_loading_tracks, 0).show();
                                    artistBottomSheetDialog.B0.c().e(artistBottomSheetDialog.v(), new yi(artistBottomSheetDialog, t6Var2, i7));
                                    break;
                                }
                                break;
                            case 1:
                                if (!artistBottomSheetDialog.F0) {
                                    artistBottomSheetDialog.F0 = true;
                                    textView7.setEnabled(false);
                                    if (textView6 != null) {
                                        textView6.setEnabled(false);
                                    }
                                    if (textView5 != null) {
                                        textView5.setEnabled(false);
                                    }
                                    Toast.makeText(artistBottomSheetDialog.Z(), R.string.artist_bottom_sheet_loading_tracks, 0).show();
                                    artistBottomSheetDialog.B0.c().e(artistBottomSheetDialog.v(), new yi(artistBottomSheetDialog, t6Var2, i6));
                                    break;
                                }
                                break;
                            default:
                                if (!artistBottomSheetDialog.F0) {
                                    artistBottomSheetDialog.F0 = true;
                                    textView7.setEnabled(false);
                                    textView6.setEnabled(false);
                                    if (textView5 != null) {
                                        textView5.setEnabled(false);
                                    }
                                    Toast.makeText(artistBottomSheetDialog.Z(), R.string.artist_bottom_sheet_loading_tracks, 0).show();
                                    artistBottomSheetDialog.B0.c().e(artistBottomSheetDialog.v(), new yi(artistBottomSheetDialog, t6Var2, 2));
                                    break;
                                }
                                break;
                        }
                    }
                });
                final int i5 = 1;
                textView3.setOnClickListener(new View.OnClickListener(this) { // from class: xi
                    public final /* synthetic */ ArtistBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i6 = i5;
                        t6 t6Var2 = t6Var;
                        TextView textView5 = textView4;
                        TextView textView6 = textView3;
                        TextView textView7 = textView2;
                        ArtistBottomSheetDialog artistBottomSheetDialog = this.o;
                        int i7 = 1;
                        int i8 = 0;
                        switch (i6) {
                            case 0:
                                if (!artistBottomSheetDialog.F0) {
                                    artistBottomSheetDialog.F0 = true;
                                    if (textView7 != null) {
                                        textView7.setEnabled(false);
                                    }
                                    if (textView6 != null) {
                                        textView6.setEnabled(false);
                                    }
                                    if (textView5 != null) {
                                        textView5.setEnabled(false);
                                    }
                                    Toast.makeText(artistBottomSheetDialog.Z(), R.string.artist_bottom_sheet_loading_tracks, 0).show();
                                    artistBottomSheetDialog.B0.c().e(artistBottomSheetDialog.v(), new yi(artistBottomSheetDialog, t6Var2, i8));
                                    break;
                                }
                                break;
                            case 1:
                                if (!artistBottomSheetDialog.F0) {
                                    artistBottomSheetDialog.F0 = true;
                                    textView7.setEnabled(false);
                                    if (textView6 != null) {
                                        textView6.setEnabled(false);
                                    }
                                    if (textView5 != null) {
                                        textView5.setEnabled(false);
                                    }
                                    Toast.makeText(artistBottomSheetDialog.Z(), R.string.artist_bottom_sheet_loading_tracks, 0).show();
                                    artistBottomSheetDialog.B0.c().e(artistBottomSheetDialog.v(), new yi(artistBottomSheetDialog, t6Var2, i7));
                                    break;
                                }
                                break;
                            default:
                                if (!artistBottomSheetDialog.F0) {
                                    artistBottomSheetDialog.F0 = true;
                                    textView7.setEnabled(false);
                                    textView6.setEnabled(false);
                                    if (textView5 != null) {
                                        textView5.setEnabled(false);
                                    }
                                    Toast.makeText(artistBottomSheetDialog.Z(), R.string.artist_bottom_sheet_loading_tracks, 0).show();
                                    artistBottomSheetDialog.B0.c().e(artistBottomSheetDialog.v(), new yi(artistBottomSheetDialog, t6Var2, 2));
                                    break;
                                }
                                break;
                        }
                    }
                });
                final int i6 = 2;
                textView4.setOnClickListener(new View.OnClickListener(this) { // from class: xi
                    public final /* synthetic */ ArtistBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i7 = i6;
                        t6 t6Var2 = t6Var;
                        TextView textView5 = textView4;
                        TextView textView6 = textView3;
                        TextView textView7 = textView2;
                        ArtistBottomSheetDialog artistBottomSheetDialog = this.o;
                        int i8 = 1;
                        int i9 = 0;
                        switch (i7) {
                            case 0:
                                if (!artistBottomSheetDialog.F0) {
                                    artistBottomSheetDialog.F0 = true;
                                    if (textView7 != null) {
                                        textView7.setEnabled(false);
                                    }
                                    if (textView6 != null) {
                                        textView6.setEnabled(false);
                                    }
                                    if (textView5 != null) {
                                        textView5.setEnabled(false);
                                    }
                                    Toast.makeText(artistBottomSheetDialog.Z(), R.string.artist_bottom_sheet_loading_tracks, 0).show();
                                    artistBottomSheetDialog.B0.c().e(artistBottomSheetDialog.v(), new yi(artistBottomSheetDialog, t6Var2, i9));
                                    break;
                                }
                                break;
                            case 1:
                                if (!artistBottomSheetDialog.F0) {
                                    artistBottomSheetDialog.F0 = true;
                                    textView7.setEnabled(false);
                                    if (textView6 != null) {
                                        textView6.setEnabled(false);
                                    }
                                    if (textView5 != null) {
                                        textView5.setEnabled(false);
                                    }
                                    Toast.makeText(artistBottomSheetDialog.Z(), R.string.artist_bottom_sheet_loading_tracks, 0).show();
                                    artistBottomSheetDialog.B0.c().e(artistBottomSheetDialog.v(), new yi(artistBottomSheetDialog, t6Var2, i8));
                                    break;
                                }
                                break;
                            default:
                                if (!artistBottomSheetDialog.F0) {
                                    artistBottomSheetDialog.F0 = true;
                                    textView7.setEnabled(false);
                                    textView6.setEnabled(false);
                                    if (textView5 != null) {
                                        textView5.setEnabled(false);
                                    }
                                    Toast.makeText(artistBottomSheetDialog.Z(), R.string.artist_bottom_sheet_loading_tracks, 0).show();
                                    artistBottomSheetDialog.B0.c().e(artistBottomSheetDialog.v(), new yi(artistBottomSheetDialog, t6Var2, 2));
                                    break;
                                }
                                break;
                        }
                    }
                });
                return viewInflate;
            }
        }
        n0();
        return viewInflate;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void R() {
        super.R();
        if (this.C0 != null) {
            Context contextZ = Z();
            cb4 cb4Var = new cb4(Z(), new ComponentName(Z(), (Class<?>) MediaService.class));
            Bundle bundle = Bundle.EMPTY;
            aj2 aj2Var = new aj2();
            Looper looperX = f35.x();
            bl2 bl2Var = new bl2(looperX);
            b11.w(bl2Var, new bj2(contextZ, cb4Var, bundle, aj2Var, looperX, bl2Var, cb4Var.a.e() ? new xc5(4, new fi0(new x7(contextZ))) : null), new Handler(looperX));
            this.D0 = bl2Var;
        }
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void S() {
        bl2 bl2Var = this.D0;
        if (bl2Var != null) {
            sk2.Z0(bl2Var);
        }
        super.S();
    }
}
