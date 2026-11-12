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
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.PodcastChannel;
import defpackage.aj2;
import defpackage.b11;
import defpackage.b75;
import defpackage.bj2;
import defpackage.bj3;
import defpackage.bl2;
import defpackage.bq4;
import defpackage.cb4;
import defpackage.e75;
import defpackage.f35;
import defpackage.fi0;
import defpackage.gh0;
import defpackage.i30;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.nc1;
import defpackage.sk2;
import defpackage.ud3;
import defpackage.um3;
import defpackage.vz3;
import defpackage.wg0;
import defpackage.x7;
import defpackage.xc5;
import defpackage.xv0;
import defpackage.zt;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class PodcastChannelBottomSheetDialog extends zt implements View.OnClickListener {
    public um3 B0;
    public PodcastChannel C0;
    public bl2 D0;

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.bottom_sheet_podcast_channel_dialog, viewGroup, false);
        Bundle bundle2 = this.s;
        if (bundle2 != null) {
            PodcastChannel podcastChannel = (PodcastChannel) bundle2.getParcelable("PODCAST_CHANNEL_OBJECT");
            this.C0 = podcastChannel;
            if (podcastChannel != null) {
                nc1 nc1VarX = X();
                e75 e75VarD = nc1VarX.d();
                b75 b75VarR = gh0.r(nc1VarX);
                bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
                i30 i30VarA = kx3.a(um3.class);
                String strB = i30VarA.b();
                if (strB == null) {
                    kf2.n("Local and anonymous classes can not be ViewModels");
                    return null;
                }
                um3 um3Var = (um3) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                this.B0 = um3Var;
                um3Var.d = this.C0;
                ImageView imageView = (ImageView) viewInflate.findViewById(R.id.podcast_cover_image_view);
                Context contextZ = Z();
                String coverArtId = this.B0.d.getCoverArtId();
                vz3 vz3VarT = b11.g(contextZ, coverArtId, 7, a.c(contextZ), coverArtId != null ? wg0.b(ud3.t(), coverArtId) : null).T(xv0.b());
                if (ud3.R()) {
                    vz3VarT = (vz3) vz3VarT.l();
                }
                vz3VarT.K(imageView);
                ((TextView) viewInflate.findViewById(R.id.podcast_title_text_view)).setText(this.B0.d.getTitle());
                ((TextView) viewInflate.findViewById(R.id.delete_text_view)).setOnClickListener(new bj3(9, this));
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
