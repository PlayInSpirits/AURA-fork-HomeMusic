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
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import defpackage.aj2;
import defpackage.b11;
import defpackage.b75;
import defpackage.bj;
import defpackage.bj2;
import defpackage.bl2;
import defpackage.bq4;
import defpackage.c04;
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
import defpackage.wi;
import defpackage.x7;
import defpackage.xc5;
import defpackage.xi;
import defpackage.xv0;
import defpackage.zt;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ArtistBottomSheetDialog extends zt implements View.OnClickListener {
    public bj B0;
    public ArtistID3 C0;
    public bl2 D0;
    public boolean E0;
    public boolean F0;

    public ArtistBottomSheetDialog() {
        this.E0 = true;
        this.F0 = false;
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r8, ViewGroup r9, Bundle r10) {
        final int r0 = 0;
        View r11 = r8.inflate(R.layout.bottom_sheet_artist_dialog, r9, false);
        Bundle r12 = this.s;
        if (r12 == null) goto L28;
        ArtistID3 r13 = (ArtistID3) r12.getParcelable("ARTIST_OBJECT");
        this.C0 = r13;
        if (r13 == null) goto L28;
        this.C0 = r13.strippedForNav();
        nc1 r14 = X();
        e75 r15 = r14.d();
        b75 r1 = gh0.r(r14);
        bq4 r2 = new bq4(r15, r1, b11.e(r14, r1));
        i30 r16 = kx3.a(bj.class);
        String r17 = r16.b();
        String r3 = null;
        if (r17 == null) goto L26;
        bj r18 = (bj) r2.l(r16, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r17));
        this.B0 = r18;
        r18.g = this.C0;
        r18.f = null;
        q05.u((ViewGroup) r11.findViewById(R.id.option_linear_layout));
        ImageView r19 = (ImageView) r11.findViewById(R.id.artist_cover_image_view);
        Context r110 = Z();
        String r4 = this.B0.g.getCoverArtId();
        c04 r5 = a.c(r110);
        if (r4 == null) goto L12;
        r3 = wg0.b(ud3.t(), r4);
    L12:
        vz3 r111 = b11.g(r110, r4, 3, r5, r3).T(xv0.b());
        if (ud3.R() == false) goto L15;
        r111 = (vz3) r111.l();
    L15:
        r111.K(r19);
        TextView r20 = (TextView) r11.findViewById(R.id.song_title_text_view);
        r20.setText(this.B0.g.getName());
        final int r112 = 1;
        r20.setSelected(true);
        ToggleButton r21 = (ToggleButton) r11.findViewById(R.id.button_favorite);
        String r6 = this.B0.g.getId();
        if (this.B0.g.getStarred() == null) goto L18;
        boolean r7 = true;
    L19:
        r21.setChecked(n61.f(3, r6, r7));
        r21.setOnClickListener(new wi(this, r0));
        View r22 = r11.findViewById(R.id.homemusic_wave_artist_text_view);
        String r23 = this.C0.getId();
        final int r24 = 2;
        if (r23 != null) goto L22;
    L24:
        ((TextView) r11.findViewById(R.id.play_radio_text_view)).setOnClickListener(new wi(this, r112));
        ((TextView) r11.findViewById(R.id.play_random_text_view)).setOnClickListener(new wi(this, r24));
        final TextView r25 = (TextView) r11.findViewById(R.id.play_next_text_view);
        final TextView r26 = (TextView) r11.findViewById(R.id.add_to_queue_text_view);
        final TextView r27 = (TextView) r11.findViewById(R.id.add_to_playlist_text_view);
        final t6 r28 = new t6(this, r25, r26, r27, 1);
        final int r29 = 0;
        r25.setOnClickListener(new xi(this, r25, r26, r27, r28, r29));
        final int r30 = 1;
        r26.setOnClickListener(new xi(this, r25, r26, r27, r28, r30));
        final int r31 = 2;
        r27.setOnClickListener(new xi(this, r25, r26, r27, r28, r31));
        return r11;
    L22:
        if (r23.trim().isEmpty() == true) goto L24;
        r22.setVisibility(0);
        r22.setOnClickListener(new j8(2, this, r23));
        goto L24
    L18:
        r7 = false;
        goto L19
    L26:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L28:
        n0();
        return r11;
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
