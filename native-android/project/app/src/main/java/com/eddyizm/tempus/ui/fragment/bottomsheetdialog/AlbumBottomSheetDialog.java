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
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.viewmodel.b;
import defpackage.a0;
import defpackage.aj2;
import defpackage.au0;
import defpackage.b11;
import defpackage.b7;
import defpackage.b75;
import defpackage.bj2;
import defpackage.bl2;
import defpackage.bq4;
import defpackage.c7;
import defpackage.cb4;
import defpackage.d8;
import defpackage.e75;
import defpackage.eu0;
import defpackage.f35;
import defpackage.f7;
import defpackage.fi0;
import defpackage.g51;
import defpackage.gh0;
import defpackage.i30;
import defpackage.j7;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.n61;
import defpackage.nc1;
import defpackage.q05;
import defpackage.sk2;
import defpackage.ud3;
import defpackage.vz3;
import defpackage.wg0;
import defpackage.x7;
import defpackage.xc5;
import defpackage.xv0;
import defpackage.y6;
import defpackage.zt;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class AlbumBottomSheetDialog extends zt implements View.OnClickListener {
    public b B0;
    public j7 C0;
    public AlbumID3 D0;
    public TextView E0;
    public List F0;
    public List G0;
    public boolean H0;
    public bl2 I0;

    public AlbumBottomSheetDialog() {
        List list = Collections.EMPTY_LIST;
        this.F0 = list;
        this.G0 = list;
        this.H0 = true;
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.bottom_sheet_album_dialog, viewGroup, false);
        Bundle bundle2 = this.s;
        if (bundle2 != null) {
            AlbumID3 albumID3 = (AlbumID3) bundle2.getParcelable("ALBUM_OBJECT");
            this.D0 = albumID3;
            if (albumID3 != null) {
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
                i30 i30VarA2 = kx3.a(j7.class);
                String strB2 = i30VarA2.b();
                if (strB2 == null) {
                    kf2.n("Local and anonymous classes can not be ViewModels");
                    return null;
                }
                j7 j7Var = (j7) bq4Var2.l(i30VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB2));
                this.C0 = j7Var;
                j7Var.g = this.D0;
                q05.u((ViewGroup) viewInflate.findViewById(R.id.option_linear_layout));
                ImageView imageView = (ImageView) viewInflate.findViewById(R.id.album_cover_image_view);
                Context contextZ = Z();
                String coverArtId = this.C0.g.getCoverArtId();
                vz3 vz3VarT = b11.g(contextZ, coverArtId, 2, a.c(contextZ), coverArtId != null ? wg0.b(ud3.t(), coverArtId) : null).T(xv0.b());
                if (ud3.R()) {
                    vz3VarT = (vz3) vz3VarT.l();
                }
                vz3VarT.K(imageView);
                TextView textView = (TextView) viewInflate.findViewById(R.id.album_title_text_view);
                textView.setText(this.C0.g.getName());
                int i2 = 1;
                textView.setSelected(true);
                ((TextView) viewInflate.findViewById(R.id.album_artist_text_view)).setText(this.C0.g.getArtist());
                ToggleButton toggleButton = (ToggleButton) viewInflate.findViewById(R.id.button_favorite);
                toggleButton.setChecked(n61.f(2, this.C0.g.getId(), this.C0.g.getStarred() != null));
                toggleButton.setOnClickListener(new y6(this, 3));
                ((TextView) viewInflate.findViewById(R.id.play_radio_text_view)).setOnClickListener(new y6(this, 4));
                ((TextView) viewInflate.findViewById(R.id.play_random_text_view)).setOnClickListener(new y6(this, 5));
                int i3 = 6;
                ((TextView) viewInflate.findViewById(R.id.play_next_text_view)).setOnClickListener(new y6(this, i3));
                ((TextView) viewInflate.findViewById(R.id.add_to_queue_text_view)).setOnClickListener(new y6(this, 7));
                this.C0.c().e(v(), new f7(i, this, (TextView) viewInflate.findViewById(R.id.download_all_text_view)));
                ((TextView) viewInflate.findViewById(R.id.add_to_playlist_text_view)).setOnClickListener(new y6(this, 8));
                this.E0 = (TextView) viewInflate.findViewById(R.id.remove_all_text_view);
                this.C0.c().e(v(), new b7(this, i3));
                ((TextView) viewInflate.findViewById(R.id.go_to_artist_text_view)).setOnClickListener(new y6(this, i));
                TextView textView2 = (TextView) viewInflate.findViewById(R.id.share_text_view);
                textView2.setOnClickListener(new y6(this, i2));
                textView2.setVisibility(ud3.V() ? 0 : 8);
                return viewInflate;
            }
        }
        n0();
        return viewInflate;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void R() {
        xc5 xc5Var;
        super.R();
        if (this.D0 != null) {
            Context contextZ = Z();
            cb4 cb4Var = new cb4(Z(), new ComponentName(Z(), (Class<?>) MediaService.class));
            Bundle bundle = Bundle.EMPTY;
            aj2 aj2Var = new aj2();
            Looper looperX = f35.x();
            bl2 bl2Var = new bl2(looperX);
            if (cb4Var.a.e()) {
                xc5Var = new xc5(4, new fi0(new x7(contextZ)));
            } else {
                xc5Var = null;
            }
            b11.w(bl2Var, new bj2(contextZ, cb4Var, bundle, aj2Var, looperX, bl2Var, xc5Var), new Handler(looperX));
            this.I0 = bl2Var;
        }
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void S() {
        bl2 bl2Var = this.I0;
        if (bl2Var != null) {
            sk2.Z0(bl2Var);
        }
        super.S();
    }

    @Override // defpackage.kc1
    public final void T(View view, Bundle bundle) {
        if (this.D0 != null) {
            g51.d.e(v(), new d8(15, new a0(2, this)));
        }
    }

    public final void o0() {
        if (this.E0 == null) {
            return;
        }
        List list = this.F0;
        if (list == null || list.isEmpty()) {
            this.E0.setVisibility(8);
            return;
        }
        int i = 0;
        if (ud3.o() != null) {
            this.E0.setVisibility(this.F0.stream().anyMatch(new c7(i)) ? 0 : 8);
            return;
        }
        List list2 = this.G0;
        if (list2 == null || list2.isEmpty()) {
            this.E0.setVisibility(8);
            return;
        }
        eu0 eu0VarW = au0.w(Z());
        eu0VarW.getClass();
        boolean zAnyMatch = list2.stream().anyMatch(new c7(eu0VarW));
        TextView textView = this.E0;
        if (zAnyMatch) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }
}
