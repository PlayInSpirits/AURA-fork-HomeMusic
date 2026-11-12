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
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.PodcastEpisode;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.PodcastEpisodeBottomSheetDialog;
import defpackage.aj2;
import defpackage.b11;
import defpackage.b75;
import defpackage.bj2;
import defpackage.bl2;
import defpackage.bq4;
import defpackage.cb4;
import defpackage.e75;
import defpackage.f35;
import defpackage.fi0;
import defpackage.gh0;
import defpackage.gn3;
import defpackage.i30;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.nc1;
import defpackage.sk2;
import defpackage.ud3;
import defpackage.vz3;
import defpackage.wg0;
import defpackage.x7;
import defpackage.xc5;
import defpackage.xv0;
import defpackage.zt;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class PodcastEpisodeBottomSheetDialog extends zt implements View.OnClickListener {
    public gn3 B0;
    public PodcastEpisode C0;
    public bl2 D0;

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.bottom_sheet_podcast_episode_dialog, viewGroup, false);
        Bundle bundle2 = this.s;
        if (bundle2 != null) {
            PodcastEpisode podcastEpisode = (PodcastEpisode) bundle2.getParcelable("PODCAST_OBJECT");
            this.C0 = podcastEpisode;
            if (podcastEpisode != null) {
                nc1 nc1VarX = X();
                e75 e75VarD = nc1VarX.d();
                b75 b75VarR = gh0.r(nc1VarX);
                bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
                i30 i30VarA = kx3.a(gn3.class);
                String strB = i30VarA.b();
                if (strB == null) {
                    kf2.n("Local and anonymous classes can not be ViewModels");
                    return null;
                }
                gn3 gn3Var = (gn3) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                this.B0 = gn3Var;
                gn3Var.d = this.C0;
                ImageView imageView = (ImageView) viewInflate.findViewById(R.id.podcast_cover_image_view);
                Context contextZ = Z();
                String coverArtId = this.B0.d.getCoverArtId();
                vz3 vz3VarT = b11.g(contextZ, coverArtId, 7, a.c(contextZ), coverArtId != null ? wg0.b(ud3.t(), coverArtId) : null).T(xv0.b());
                if (ud3.R()) {
                    vz3VarT = (vz3) vz3VarT.l();
                }
                vz3VarT.K(imageView);
                TextView textView = (TextView) viewInflate.findViewById(R.id.podcast_title_text_view);
                textView.setText(this.B0.d.getTitle());
                final int i2 = 1;
                textView.setSelected(true);
                ((TextView) viewInflate.findViewById(R.id.play_next_text_view)).setOnClickListener(new View.OnClickListener(this) { // from class: fn3
                    public final /* synthetic */ PodcastEpisodeBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i3 = i;
                        PodcastEpisodeBottomSheetDialog podcastEpisodeBottomSheetDialog = this.o;
                        switch (i3) {
                            case 0:
                                ((au) ((MainActivity) podcastEpisodeBottomSheetDialog.X()).V.n).d(true);
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                            case 1:
                                ((au) ((MainActivity) podcastEpisodeBottomSheetDialog.X()).V.n).d(true);
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                            case 2:
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                            case 4:
                                gn3 gn3Var2 = podcastEpisodeBottomSheetDialog.B0;
                                PodcastEpisode podcastEpisode2 = gn3Var2.d;
                                if (podcastEpisode2 != null && podcastEpisode2.getId() != null) {
                                    hh3 hh3Var = gn3Var2.c;
                                    String id = gn3Var2.d.getId();
                                    hh3Var.getClass();
                                    wo0 wo0VarH = App.f(false).h();
                                    wo0VarH.getClass();
                                    Log.d("PodcastClient", "deletePodcastEpisode()");
                                    ((hn3) wo0VarH.o).e(((pn4) wo0VarH.n).f(), id).enqueue(new rm2(9, gn3Var2));
                                }
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                            default:
                                Toast.makeText(podcastEpisodeBottomSheetDialog.Z(), "Open the channel", 0).show();
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                        }
                    }
                });
                ((TextView) viewInflate.findViewById(R.id.add_to_queue_text_view)).setOnClickListener(new View.OnClickListener(this) { // from class: fn3
                    public final /* synthetic */ PodcastEpisodeBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i3 = i2;
                        PodcastEpisodeBottomSheetDialog podcastEpisodeBottomSheetDialog = this.o;
                        switch (i3) {
                            case 0:
                                ((au) ((MainActivity) podcastEpisodeBottomSheetDialog.X()).V.n).d(true);
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                            case 1:
                                ((au) ((MainActivity) podcastEpisodeBottomSheetDialog.X()).V.n).d(true);
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                            case 2:
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                            case 4:
                                gn3 gn3Var2 = podcastEpisodeBottomSheetDialog.B0;
                                PodcastEpisode podcastEpisode2 = gn3Var2.d;
                                if (podcastEpisode2 != null && podcastEpisode2.getId() != null) {
                                    hh3 hh3Var = gn3Var2.c;
                                    String id = gn3Var2.d.getId();
                                    hh3Var.getClass();
                                    wo0 wo0VarH = App.f(false).h();
                                    wo0VarH.getClass();
                                    Log.d("PodcastClient", "deletePodcastEpisode()");
                                    ((hn3) wo0VarH.o).e(((pn4) wo0VarH.n).f(), id).enqueue(new rm2(9, gn3Var2));
                                }
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                            default:
                                Toast.makeText(podcastEpisodeBottomSheetDialog.Z(), "Open the channel", 0).show();
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                        }
                    }
                });
                final int i3 = 2;
                ((TextView) viewInflate.findViewById(R.id.download_text_view)).setOnClickListener(new View.OnClickListener(this) { // from class: fn3
                    public final /* synthetic */ PodcastEpisodeBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4 = i3;
                        PodcastEpisodeBottomSheetDialog podcastEpisodeBottomSheetDialog = this.o;
                        switch (i4) {
                            case 0:
                                ((au) ((MainActivity) podcastEpisodeBottomSheetDialog.X()).V.n).d(true);
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                            case 1:
                                ((au) ((MainActivity) podcastEpisodeBottomSheetDialog.X()).V.n).d(true);
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                            case 2:
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                            case 4:
                                gn3 gn3Var2 = podcastEpisodeBottomSheetDialog.B0;
                                PodcastEpisode podcastEpisode2 = gn3Var2.d;
                                if (podcastEpisode2 != null && podcastEpisode2.getId() != null) {
                                    hh3 hh3Var = gn3Var2.c;
                                    String id = gn3Var2.d.getId();
                                    hh3Var.getClass();
                                    wo0 wo0VarH = App.f(false).h();
                                    wo0VarH.getClass();
                                    Log.d("PodcastClient", "deletePodcastEpisode()");
                                    ((hn3) wo0VarH.o).e(((pn4) wo0VarH.n).f(), id).enqueue(new rm2(9, gn3Var2));
                                }
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                            default:
                                Toast.makeText(podcastEpisodeBottomSheetDialog.Z(), "Open the channel", 0).show();
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                        }
                    }
                });
                final int i4 = 3;
                ((TextView) viewInflate.findViewById(R.id.remove_text_view)).setOnClickListener(new View.OnClickListener(this) { // from class: fn3
                    public final /* synthetic */ PodcastEpisodeBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i5 = i4;
                        PodcastEpisodeBottomSheetDialog podcastEpisodeBottomSheetDialog = this.o;
                        switch (i5) {
                            case 0:
                                ((au) ((MainActivity) podcastEpisodeBottomSheetDialog.X()).V.n).d(true);
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                            case 1:
                                ((au) ((MainActivity) podcastEpisodeBottomSheetDialog.X()).V.n).d(true);
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                            case 2:
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                            case 4:
                                gn3 gn3Var2 = podcastEpisodeBottomSheetDialog.B0;
                                PodcastEpisode podcastEpisode2 = gn3Var2.d;
                                if (podcastEpisode2 != null && podcastEpisode2.getId() != null) {
                                    hh3 hh3Var = gn3Var2.c;
                                    String id = gn3Var2.d.getId();
                                    hh3Var.getClass();
                                    wo0 wo0VarH = App.f(false).h();
                                    wo0VarH.getClass();
                                    Log.d("PodcastClient", "deletePodcastEpisode()");
                                    ((hn3) wo0VarH.o).e(((pn4) wo0VarH.n).f(), id).enqueue(new rm2(9, gn3Var2));
                                }
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                            default:
                                Toast.makeText(podcastEpisodeBottomSheetDialog.Z(), "Open the channel", 0).show();
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                        }
                    }
                });
                final int i5 = 4;
                ((TextView) viewInflate.findViewById(R.id.delete_text_view)).setOnClickListener(new View.OnClickListener(this) { // from class: fn3
                    public final /* synthetic */ PodcastEpisodeBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i6 = i5;
                        PodcastEpisodeBottomSheetDialog podcastEpisodeBottomSheetDialog = this.o;
                        switch (i6) {
                            case 0:
                                ((au) ((MainActivity) podcastEpisodeBottomSheetDialog.X()).V.n).d(true);
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                            case 1:
                                ((au) ((MainActivity) podcastEpisodeBottomSheetDialog.X()).V.n).d(true);
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                            case 2:
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                            case 4:
                                gn3 gn3Var2 = podcastEpisodeBottomSheetDialog.B0;
                                PodcastEpisode podcastEpisode2 = gn3Var2.d;
                                if (podcastEpisode2 != null && podcastEpisode2.getId() != null) {
                                    hh3 hh3Var = gn3Var2.c;
                                    String id = gn3Var2.d.getId();
                                    hh3Var.getClass();
                                    wo0 wo0VarH = App.f(false).h();
                                    wo0VarH.getClass();
                                    Log.d("PodcastClient", "deletePodcastEpisode()");
                                    ((hn3) wo0VarH.o).e(((pn4) wo0VarH.n).f(), id).enqueue(new rm2(9, gn3Var2));
                                }
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                            default:
                                Toast.makeText(podcastEpisodeBottomSheetDialog.Z(), "Open the channel", 0).show();
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                        }
                    }
                });
                final int i6 = 5;
                ((TextView) viewInflate.findViewById(R.id.go_to_channel_text_view)).setOnClickListener(new View.OnClickListener(this) { // from class: fn3
                    public final /* synthetic */ PodcastEpisodeBottomSheetDialog o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i7 = i6;
                        PodcastEpisodeBottomSheetDialog podcastEpisodeBottomSheetDialog = this.o;
                        switch (i7) {
                            case 0:
                                ((au) ((MainActivity) podcastEpisodeBottomSheetDialog.X()).V.n).d(true);
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                            case 1:
                                ((au) ((MainActivity) podcastEpisodeBottomSheetDialog.X()).V.n).d(true);
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                            case 2:
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                            case 4:
                                gn3 gn3Var2 = podcastEpisodeBottomSheetDialog.B0;
                                PodcastEpisode podcastEpisode2 = gn3Var2.d;
                                if (podcastEpisode2 != null && podcastEpisode2.getId() != null) {
                                    hh3 hh3Var = gn3Var2.c;
                                    String id = gn3Var2.d.getId();
                                    hh3Var.getClass();
                                    wo0 wo0VarH = App.f(false).h();
                                    wo0VarH.getClass();
                                    Log.d("PodcastClient", "deletePodcastEpisode()");
                                    ((hn3) wo0VarH.o).e(((pn4) wo0VarH.n).f(), id).enqueue(new rm2(9, gn3Var2));
                                }
                                podcastEpisodeBottomSheetDialog.h0();
                                break;
                            default:
                                Toast.makeText(podcastEpisodeBottomSheetDialog.Z(), "Open the channel", 0).show();
                                podcastEpisodeBottomSheetDialog.h0();
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
