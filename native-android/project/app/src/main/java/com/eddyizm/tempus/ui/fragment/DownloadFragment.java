package com.eddyizm.tempus.ui.fragment;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.model.DownloadStack;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.aj2;
import defpackage.au;
import defpackage.b11;
import defpackage.b75;
import defpackage.bj2;
import defpackage.bl2;
import defpackage.bo2;
import defpackage.bq4;
import defpackage.bu0;
import defpackage.cb4;
import defpackage.d8;
import defpackage.e75;
import defpackage.f35;
import defpackage.fi0;
import defpackage.ft0;
import defpackage.g51;
import defpackage.gb;
import defpackage.gh0;
import defpackage.i30;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.le1;
import defpackage.nc1;
import defpackage.nz2;
import defpackage.om1;
import defpackage.os0;
import defpackage.s24;
import defpackage.sk2;
import defpackage.ss0;
import defpackage.ud3;
import defpackage.uo;
import defpackage.up0;
import defpackage.vs0;
import defpackage.ws0;
import defpackage.x7;
import defpackage.xc5;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class DownloadFragment extends kc1 implements ClickCallback {
    public up0 l0;
    public MainActivity m0;
    public om1 n0;
    public bu0 o0;
    public ft0 p0;
    public bl2 q0;
    public MaterialToolbar r0;

    public DownloadFragment() {
    }

    @Override // defpackage.kc1
    public final void D(int r2, int r3, Intent r4) {
        super.D(r2, r3, r4);
        if (r2 == 1002) goto L5;
        return;
    L5:
        if (r3 != (-1)) goto L11;
        Uri r5 = r4.getData();
        if (r5 == null) goto L12;
        Z().getContentResolver().takePersistableUriPermission(r5, 3);
        ud3.i0(r5.toString());
        g51.i();
        Toast.makeText(Z(), "Download directory set", 0).show();
        return;
    L12:
        return;
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r11, ViewGroup r12, Bundle r13) {
        MainActivity r14 = (MainActivity) l();
        this.m0 = r14;
        this.n0 = r14.U;
        View r15 = r11.inflate(R.layout.fragment_download, r12, false);
        int r16 = R.id.download_downloaded_sector;
        ConstraintLayout r2 = (ConstraintLayout) uo.s(r15, R.id.download_downloaded_sector);
        if (r2 == null) goto L32;
        r16 = R.id.downloaded_go_back_image_view;
        ImageView r3 = (ImageView) uo.s(r15, R.id.downloaded_go_back_image_view);
        if (r3 == null) goto L32;
        r16 = R.id.downloaded_group_by_image_view;
        ImageView r4 = (ImageView) uo.s(r15, R.id.downloaded_group_by_image_view);
        if (r4 == null) goto L32;
        r16 = R.id.downloaded_recycler_view;
        RecyclerView r5 = (RecyclerView) uo.s(r15, R.id.downloaded_recycler_view);
        if (r5 == null) goto L32;
        r16 = R.id.downloaded_refresh_image_view;
        ImageView r6 = (ImageView) uo.s(r15, R.id.downloaded_refresh_image_view);
        if (r6 == null) goto L32;
        r16 = R.id.downloaded_text_view_refreshable;
        if (((TextView) uo.s(r15, R.id.downloaded_text_view_refreshable)) == null) goto L32;
        r16 = R.id.empty_description_image_view;
        if (((ImageView) uo.s(r15, R.id.empty_description_image_view)) == null) goto L32;
        r16 = R.id.empty_download_layout;
        LinearLayout r7 = (LinearLayout) uo.s(r15, R.id.empty_download_layout);
        if (r7 == null) goto L32;
        r16 = R.id.loading_progress_bar;
        ProgressBar r8 = (ProgressBar) uo.s(r15, R.id.loading_progress_bar);
        if (r8 == null) goto L32;
        r16 = R.id.shuffle_downloaded_text_view_clickable;
        TextView r9 = (TextView) uo.s(r15, R.id.shuffle_downloaded_text_view_clickable);
        if (r9 == null) goto L32;
        r16 = R.id.subtitle_empty_description_label;
        if (((TextView) uo.s(r15, R.id.subtitle_empty_description_label)) == null) goto L32;
        r16 = R.id.title_empty_description_label;
        if (((TextView) uo.s(r15, R.id.title_empty_description_label)) == null) goto L32;
        LinearLayout r1 = (LinearLayout) r15;
        this.l0 = new up0(r1, r2, r3, r4, r5, r6, r7, r8, r9);
        nc1 r17 = X();
        e75 r18 = r17.d();
        b75 r0 = gh0.r(r17);
        bq4 r10 = new bq4(r18, r0, b11.e(r17, r0));
        i30 r19 = kx3.a(bu0.class);
        String r110 = r19.b();
        if (r110 == null) goto L30;
        this.o0 = (bu0) r10.l(r19, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r110));
        return r1;
    L30:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L32:
        nz2.n("Missing required view with ID: ".concat(r15.getResources().getResourceName(r16)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.l0 = null;
    }

    @Override // defpackage.kc1
    public final void R() {
        this.R = true;
        Context r2 = Z();
        cb4 r3 = new cb4(Z(), new ComponentName(Z(), MediaService.class));
        Bundle r4 = Bundle.EMPTY;
        aj2 r5 = new aj2();
        Looper r6 = f35.x();
        bl2 r7 = new bl2(r6);
        if (r3.a.e() == false) goto L6;
        xc5 r1 = new xc5(4, new fi0(new x7(r2)));
    L7:
        b11.w(r7, new bj2(r2, r3, r4, r5, r6, r7, r1), new Handler(r6));
        this.q0 = r7;
        this.m0.J();
        this.m0.I(true);
        return;
    L6:
        r1 = null;
        goto L7
    }

    @Override // defpackage.kc1
    public final void S() {
        sk2.Z0(this.q0);
        this.R = true;
    }

    @Override // defpackage.kc1
    public final void T(View r6, Bundle r7) {
        MaterialToolbar r8 = (MaterialToolbar) ((LinearLayout) this.l0.a).findViewById(R.id.toolbar);
        this.r0 = r8;
        this.m0.o(r8);
        this.n0.n(this.m0, this.r0);
        Drawable r9 = this.r0.getOverflowIcon();
        Objects.requireNonNull(r9);
        r9.setTint(Z().getResources().getColor(R.color.titleTextColor, null));
        final int r10 = 1;
        ((RecyclerView) this.l0.f).setHasFixedSize(true);
        ft0 r11 = new ft0(this);
        this.p0 = r11;
        ((RecyclerView) this.l0.f).setAdapter(r11);
        bu0 r12 = this.o0;
        le1 r0 = v();
        ss0 r1 = (ss0) r12.c.o;
        ((s24) r1.n).i().a(new String[]{"download"}, new os0(r1, 1)).e(r0, new d8(9, r12));
        final int r2 = 0;
        r12.d.e(v(), new vs0(this, r2));
        this.o0.f.e(v(), new vs0(this, r10));
        ((ImageView) this.l0.e).setOnClickListener(new ws0(this, r2));
        ((ImageView) this.l0.d).setOnClickListener(new ws0(this, r10));
        ((ImageView) this.l0.g).setOnClickListener(new ws0(this, 2));
    }

    public final void h0(String r3) {
        bu0 r2 = this.o0;
        DownloadStack r0 = new DownloadStack(r3, null);
        r2.getClass();
        ArrayList r1 = new ArrayList();
        r1.add(r0);
        r2.e.k(r1);
        App.b().getClass();
        App.c().edit().putString("default_download_view_type", r3).apply();
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onAlbumClick(Bundle r3) {
        this.o0.c(new DownloadStack("download_type_album", r3.getString("download_type_album")));
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onArtistClick(Bundle r3) {
        this.o0.c(new DownloadStack("download_type_artist", r3.getString("download_type_artist")));
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onDownloadGroupLongClick(Bundle r3) {
        gb.x(a0()).m(R.id.downloadBottomSheetDialog, r3, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onGenreClick(Bundle r3) {
        this.o0.c(new DownloadStack("download_type_genre", r3.getString("download_type_genre")));
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMediaClick(Bundle r4) {
        bo2.o(this.q0, r4.getParcelableArrayList("TRACKS_OBJECT"), r4.getInt("ITEM_POSITION"));
        ((au) this.m0.V.n).d(true);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMediaLongClick(Bundle r3) {
        gb.x(a0()).m(R.id.songBottomSheetDialog, r3, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPlaylistClick(Bundle r3) {
        this.o0.c(new DownloadStack("download_type_playlist", r3.getString("download_type_playlist")));
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onYearClick(Bundle r3) {
        this.o0.c(new DownloadStack("download_type_year", r3.getString("download_type_year")));
    }
}
