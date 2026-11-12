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
import com.eddyizm.tempus.subsonic.models.PlaylistWithSongs;
import defpackage.aj2;
import defpackage.b11;
import defpackage.bj2;
import defpackage.bl2;
import defpackage.bl3;
import defpackage.c04;
import defpackage.cb4;
import defpackage.e03;
import defpackage.f35;
import defpackage.fi0;
import defpackage.q05;
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
public class PlaylistBottomSheetDialog extends zt implements View.OnClickListener {
    public PlaylistWithSongs B0;
    public bl2 C0;

    public PlaylistBottomSheetDialog() {
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r6, ViewGroup r7, Bundle r8) {
        final int r0 = 0;
        View r9 = r6.inflate(R.layout.bottom_sheet_playlist_dialog, r7, false);
        Bundle r10 = this.s;
        if (r10 == null) goto L16;
        PlaylistWithSongs r11 = (PlaylistWithSongs) r10.getParcelable("PLAYLIST_OBJECT");
        this.B0 = r11;
        if (r11 == null) goto L16;
        q05.u((ViewGroup) r9.findViewById(R.id.option_linear_layout));
        ImageView r12 = (ImageView) r9.findViewById(R.id.playlist_cover_image_view);
        Context r13 = r9.getContext();
        String r1 = this.B0.getCoverArtId();
        c04 r2 = a.c(r13);
        if (r1 == null) goto L10;
        String r3 = wg0.b(ud3.t(), r1);
    L11:
        vz3 r14 = b11.g(r13, r1, 6, r2, r3).T(xv0.b());
        if (ud3.R() == false) goto L14;
        r14 = (vz3) r14.l();
    L14:
        r14.K(r12);
        TextView r15 = (TextView) r9.findViewById(R.id.playlist_title_text_view);
        r15.setText(this.B0.getName());
        final int r16 = 1;
        r15.setSelected(true);
        ((TextView) r9.findViewById(R.id.playlist_count_text_view)).setText(r9.getContext().getString(R.string.playlist_counted_tracks, new Object[]{Integer.valueOf(this.B0.getSongCount()), e03.h(Long.valueOf(this.B0.getDuration()), false)}));
        ((TextView) r9.findViewById(R.id.play_next_text_view)).setOnClickListener(new bl3(this, r0));
        ((TextView) r9.findViewById(R.id.add_to_queue_text_view)).setOnClickListener(new bl3(this, r16));
        return r9;
    L10:
        r3 = null;
    L16:
        n0();
        return r9;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void R() {
        super.R();
        if (this.B0 == null) goto L11;
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
        this.C0 = r7;
        return;
    L8:
        r0 = null;
        goto L9
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void S() {
        bl2 r0 = this.C0;
        if (r0 == null) goto L5;
        sk2.Z0(r0);
    L5:
        super.S();
    }

    @Override // defpackage.kc1
    public final void T(View r1, Bundle r2) {
    }
}
