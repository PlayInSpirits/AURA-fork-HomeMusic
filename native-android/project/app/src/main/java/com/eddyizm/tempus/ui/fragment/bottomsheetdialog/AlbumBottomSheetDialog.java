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
import defpackage.c04;
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
import defpackage.le1;
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
        List r0 = Collections.EMPTY_LIST;
        this.F0 = r0;
        this.G0 = r0;
        this.H0 = true;
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r7, ViewGroup r8, Bundle r9) {
        int r0 = 0;
        View r10 = r7.inflate(R.layout.bottom_sheet_album_dialog, r8, false);
        Bundle r11 = this.s;
        if (r11 == null) goto L31;
        AlbumID3 r12 = (AlbumID3) r11.getParcelable("ALBUM_OBJECT");
        this.D0 = r12;
        if (r12 == null) goto L31;
        nc1 r13 = X();
        e75 r14 = r13.d();
        b75 r1 = gh0.r(r13);
        bq4 r2 = new bq4(r14, r1, b11.e(r13, r1));
        i30 r15 = kx3.a(b.class);
        String r16 = r15.b();
        String r3 = null;
        if (r16 == null) goto L29;
        this.B0 = (b) r2.l(r15, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r16));
        nc1 r17 = X();
        e75 r18 = r17.d();
        b75 r4 = gh0.r(r17);
        bq4 r5 = new bq4(r18, r4, b11.e(r17, r4));
        i30 r19 = kx3.a(j7.class);
        String r20 = r19.b();
        if (r20 == null) goto L27;
        j7 r21 = (j7) r5.l(r19, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r20));
        this.C0 = r21;
        r21.g = this.D0;
        q05.u((ViewGroup) r10.findViewById(R.id.option_linear_layout));
        ImageView r22 = (ImageView) r10.findViewById(R.id.album_cover_image_view);
        Context r23 = Z();
        String r6 = this.C0.g.getCoverArtId();
        c04 r24 = a.c(r23);
        if (r6 == null) goto L14;
        r3 = wg0.b(ud3.t(), r6);
    L14:
        vz3 r25 = b11.g(r23, r6, 2, r24, r3).T(xv0.b());
        if (ud3.R() == false) goto L17;
        r25 = (vz3) r25.l();
    L17:
        r25.K(r22);
        TextView r26 = (TextView) r10.findViewById(R.id.album_title_text_view);
        r26.setText(this.C0.g.getName());
        int r27 = 1;
        r26.setSelected(true);
        ((TextView) r10.findViewById(R.id.album_artist_text_view)).setText(this.C0.g.getArtist());
        ToggleButton r28 = (ToggleButton) r10.findViewById(R.id.button_favorite);
        String r29 = this.C0.g.getId();
        if (this.C0.g.getStarred() == null) goto L20;
        boolean r30 = true;
    L21:
        r28.setChecked(n61.f(2, r29, r30));
        r28.setOnClickListener(new y6(this, 3));
        ((TextView) r10.findViewById(R.id.play_radio_text_view)).setOnClickListener(new y6(this, 4));
        ((TextView) r10.findViewById(R.id.play_random_text_view)).setOnClickListener(new y6(this, 5));
        int r31 = 6;
        ((TextView) r10.findViewById(R.id.play_next_text_view)).setOnClickListener(new y6(this, r31));
        ((TextView) r10.findViewById(R.id.add_to_queue_text_view)).setOnClickListener(new y6(this, 7));
        this.C0.c().e(v(), new f7(r0, this, (TextView) r10.findViewById(R.id.download_all_text_view)));
        ((TextView) r10.findViewById(R.id.add_to_playlist_text_view)).setOnClickListener(new y6(this, 8));
        this.E0 = (TextView) r10.findViewById(R.id.remove_all_text_view);
        this.C0.c().e(v(), new b7(this, r31));
        ((TextView) r10.findViewById(R.id.go_to_artist_text_view)).setOnClickListener(new y6(this, r0));
        TextView r32 = (TextView) r10.findViewById(R.id.share_text_view);
        r32.setOnClickListener(new y6(this, r27));
        if (ud3.V() == true) goto L25;
        r0 = 8;
    L25:
        r32.setVisibility(r0);
        return r10;
    L20:
        r30 = false;
        goto L21
    L27:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L29:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L31:
        n0();
        return r10;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void R() {
        super.R();
        if (this.D0 == null) goto L11;
        Context r2 = Z();
        cb4 r3 = new cb4(Z(), new ComponentName(Z(), MediaService.class));
        Bundle r4 = Bundle.EMPTY;
        aj2 r5 = new aj2();
        Looper r6 = f35.x();
        bl2 r7 = new bl2(r6);
        if (r3.a.e() == false) goto L8;
        fi0 r8 = new fi0(new x7(r2));
        xc5 r0 = new xc5(4, r8);
    L9:
        b11.w(r7, new bj2(r2, r3, r4, r5, r6, r7, r0), new Handler(r6));
        this.I0 = r7;
        return;
    L8:
        r0 = null;
        goto L9
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void S() {
        bl2 r0 = this.I0;
        if (r0 == null) goto L5;
        sk2.Z0(r0);
    L5:
        super.S();
    }

    @Override // defpackage.kc1
    public final void T(View r3, Bundle r4) {
        if (this.D0 == null) goto L6;
        le1 r5 = v();
        a0 r6 = new a0(2, this);
        g51.d.e(r5, new d8(15, r6));
        return;
    }

    public final void o0() {
        if (this.E0 != null) goto L5;
        return;
    L5:
        List r0 = this.F0;
        int r1 = 8;
        if (r0 != null) goto L8;
    L30:
        this.E0.setVisibility(8);
        return;
    L8:
        if (r0.isEmpty() == true) goto L30;
        int r2 = 0;
        if (ud3.o() != null) goto L25;
        List r3 = this.G0;
        if (r3 != null) goto L15;
    L23:
        this.E0.setVisibility(8);
        return;
    L15:
        if (r3.isEmpty() == true) goto L23;
        eu0 r4 = au0.w(Z());
        r4.getClass();
        boolean r5 = r3.stream().anyMatch(new c7(r4));
        TextView r6 = this.E0;
        if (r5 == false) goto L21;
        r6.setVisibility(0);
        return;
    L21:
        r6.setVisibility(8);
        return;
    L25:
        boolean r7 = this.F0.stream().anyMatch(new c7(r2));
        TextView r8 = this.E0;
        if (r7 == false) goto L28;
        r1 = 0;
    L28:
        r8.setVisibility(r1);
    }
}
