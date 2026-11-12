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
import com.eddyizm.tempus.subsonic.models.PodcastEpisode;
import defpackage.aj2;
import defpackage.b11;
import defpackage.b75;
import defpackage.bj2;
import defpackage.bl2;
import defpackage.bq4;
import defpackage.c04;
import defpackage.cb4;
import defpackage.e75;
import defpackage.f35;
import defpackage.fi0;
import defpackage.fn3;
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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class PodcastEpisodeBottomSheetDialog extends zt implements View.OnClickListener {
    public gn3 B0;
    public PodcastEpisode C0;
    public bl2 D0;

    public PodcastEpisodeBottomSheetDialog() {
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r6, ViewGroup r7, Bundle r8) {
        final int r0 = 0;
        View r9 = r6.inflate(R.layout.bottom_sheet_podcast_episode_dialog, r7, false);
        Bundle r10 = this.s;
        if (r10 == null) goto L19;
        PodcastEpisode r11 = (PodcastEpisode) r10.getParcelable("PODCAST_OBJECT");
        this.C0 = r11;
        if (r11 == null) goto L19;
        nc1 r12 = X();
        e75 r13 = r12.d();
        b75 r1 = gh0.r(r12);
        bq4 r2 = new bq4(r13, r1, b11.e(r12, r1));
        i30 r14 = kx3.a(gn3.class);
        String r15 = r14.b();
        String r3 = null;
        if (r15 == null) goto L17;
        gn3 r16 = (gn3) r2.l(r14, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r15));
        this.B0 = r16;
        r16.d = this.C0;
        ImageView r17 = (ImageView) r9.findViewById(R.id.podcast_cover_image_view);
        Context r18 = Z();
        String r4 = this.B0.d.getCoverArtId();
        c04 r5 = a.c(r18);
        if (r4 == null) goto L12;
        r3 = wg0.b(ud3.t(), r4);
    L12:
        vz3 r19 = b11.g(r18, r4, 7, r5, r3).T(xv0.b());
        if (ud3.R() == false) goto L15;
        r19 = (vz3) r19.l();
    L15:
        r19.K(r17);
        TextView r20 = (TextView) r9.findViewById(R.id.podcast_title_text_view);
        r20.setText(this.B0.d.getTitle());
        final int r21 = 1;
        r20.setSelected(true);
        ((TextView) r9.findViewById(R.id.play_next_text_view)).setOnClickListener(new fn3(this, r0));
        ((TextView) r9.findViewById(R.id.add_to_queue_text_view)).setOnClickListener(new fn3(this, r21));
        final int r22 = 2;
        ((TextView) r9.findViewById(R.id.download_text_view)).setOnClickListener(new fn3(this, r22));
        final int r23 = 3;
        ((TextView) r9.findViewById(R.id.remove_text_view)).setOnClickListener(new fn3(this, r23));
        final int r24 = 4;
        ((TextView) r9.findViewById(R.id.delete_text_view)).setOnClickListener(new fn3(this, r24));
        final int r25 = 5;
        ((TextView) r9.findViewById(R.id.go_to_channel_text_view)).setOnClickListener(new fn3(this, r25));
        return r9;
    L17:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L19:
        n0();
        return r9;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void R() {
        super.R();
        if (this.C0 == null) goto L11;
        Context r2 = Z();
        cb4 r3 = new cb4(Z(), new ComponentName(Z(), MediaService.class));
        Bundle r4 = Bundle.EMPTY;
        aj2 r5 = new aj2();
        Looper r6 = f35.x();
        bl2 r7 = new bl2(r6);
        if (r3.a.e() == false) goto L8;
        xc5 r0 = new xc5(4, new fi0(new x7(r2)));
    L9:
        b11.w(r7, new bj2(r2, r3, r4, r5, r6, r7, r0), new Handler(r6));
        this.D0 = r7;
        return;
    L8:
        r0 = null;
        goto L9
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void S() {
        bl2 r0 = this.D0;
        if (r0 == null) goto L5;
        sk2.Z0(r0);
    L5:
        super.S();
    }
}
