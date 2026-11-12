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
import defpackage.c04;
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

    public PodcastChannelBottomSheetDialog() {
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r5, ViewGroup r6, Bundle r7) {
        View r8 = r5.inflate(R.layout.bottom_sheet_podcast_channel_dialog, r6, false);
        Bundle r9 = this.s;
        if (r9 == null) goto L19;
        PodcastChannel r10 = (PodcastChannel) r9.getParcelable("PODCAST_CHANNEL_OBJECT");
        this.C0 = r10;
        if (r10 == null) goto L19;
        nc1 r11 = X();
        e75 r12 = r11.d();
        b75 r0 = gh0.r(r11);
        bq4 r1 = new bq4(r12, r0, b11.e(r11, r0));
        i30 r13 = kx3.a(um3.class);
        String r14 = r13.b();
        String r2 = null;
        if (r14 == null) goto L17;
        um3 r15 = (um3) r1.l(r13, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r14));
        this.B0 = r15;
        r15.d = this.C0;
        ImageView r16 = (ImageView) r8.findViewById(R.id.podcast_cover_image_view);
        Context r17 = Z();
        String r3 = this.B0.d.getCoverArtId();
        c04 r4 = a.c(r17);
        if (r3 == null) goto L12;
        r2 = wg0.b(ud3.t(), r3);
    L12:
        vz3 r18 = b11.g(r17, r3, 7, r4, r2).T(xv0.b());
        if (ud3.R() == false) goto L15;
        r18 = (vz3) r18.l();
    L15:
        r18.K(r16);
        ((TextView) r8.findViewById(R.id.podcast_title_text_view)).setText(this.B0.d.getTitle());
        ((TextView) r8.findViewById(R.id.delete_text_view)).setOnClickListener(new bj3(9, this));
        return r8;
    L17:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L19:
        n0();
        return r8;
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
