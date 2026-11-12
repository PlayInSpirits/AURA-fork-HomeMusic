package com.eddyizm.tempus.ui.fragment.bottomsheetdialog;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.subsonic.models.Playlist;
import com.eddyizm.tempus.ui.activity.MainActivity;
import defpackage.b11;
import defpackage.c04;
import defpackage.e03;
import defpackage.f9;
import defpackage.i7;
import defpackage.jm3;
import defpackage.k03;
import defpackage.k52;
import defpackage.kc1;
import defpackage.le1;
import defpackage.lg1;
import defpackage.mm3;
import defpackage.nm3;
import defpackage.s24;
import defpackage.ud3;
import defpackage.vz3;
import defpackage.wg0;
import defpackage.xd0;
import defpackage.xv0;
import defpackage.z6;
import defpackage.zt;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class PlaylistRowBottomSheetDialog extends zt {
    public final mm3 B0;
    public Playlist C0;
    public f9 D0;

    public PlaylistRowBottomSheetDialog() {
        this.B0 = new mm3();
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r8, ViewGroup r9, Bundle r10) {
        final int r0 = 0;
        View r11 = r8.inflate(R.layout.bottom_sheet_playlist_row_dialog, r9, false);
        Bundle r12 = this.s;
        if (r12 == null) goto L16;
        Playlist r13 = (Playlist) r12.getParcelable("PLAYLIST_OBJECT");
        this.C0 = r13;
        if (r13 == null) goto L16;
        ImageView r14 = (ImageView) r11.findViewById(R.id.playlist_cover_image_view);
        Context r15 = r11.getContext();
        String r1 = this.C0.getCoverArtId();
        c04 r2 = a.c(r15);
        if (r1 == null) goto L10;
        String r3 = wg0.b(ud3.t(), r1);
    L11:
        final int r4 = 6;
        vz3 r16 = b11.g(r15, r1, 6, r2, r3).T(xv0.b());
        if (ud3.R() == false) goto L14;
        r16 = (vz3) r16.l();
    L14:
        r16.K(r14);
        TextView r17 = (TextView) r11.findViewById(R.id.playlist_title_text_view);
        r17.setText(this.C0.getName());
        final int r18 = 1;
        r17.setSelected(true);
        ((TextView) r11.findViewById(R.id.playlist_count_text_view)).setText(r11.getContext().getString(R.string.playlist_counted_tracks, new Object[]{Integer.valueOf(this.C0.getSongCount()), e03.h(Long.valueOf(this.C0.getDuration()), false)}));
        r11.findViewById(R.id.play_row).setOnClickListener(new nm3(this, r0));
        final int r5 = 3;
        r11.findViewById(R.id.play_shuffle_row).setOnClickListener(new nm3(this, r5));
        final int r6 = 4;
        r11.findViewById(R.id.play_next_row).setOnClickListener(new nm3(this, r6));
        final int r7 = 5;
        r11.findViewById(R.id.add_to_queue_row).setOnClickListener(new nm3(this, r7));
        r11.findViewById(R.id.download_all_row).setOnClickListener(new nm3(this, r4));
        final int r19 = 7;
        r11.findViewById(R.id.edit_playlist_row).setOnClickListener(new nm3(this, r19));
        final int r20 = 8;
        r11.findViewById(R.id.edit_playlist_details_row).setOnClickListener(new nm3(this, r20));
        View r21 = r11.findViewById(R.id.pin_row);
        View r22 = r11.findViewById(R.id.unpin_row);
        ((s24) this.B0.a.o).i().a(new String[]{"pinned_playlist"}, new k52(26)).e(v(), new z6(this, r21, r22, r5));
        final int r23 = 9;
        r21.setOnClickListener(new nm3(this, r23));
        r22.setOnClickListener(new nm3(this, r18));
        final int r24 = 2;
        r11.findViewById(R.id.delete_row).setOnClickListener(new nm3(this, r24));
        return r11;
    L10:
        r3 = null;
    L16:
        n0();
        return r11;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void J() {
        super.J();
        f9 r0 = this.D0;
        if (r0 != null) goto L5;
    L7:
        this.D0 = null;
        return;
    L5:
        if (r0.isShowing() == false) goto L7;
        this.D0.dismiss();
        goto L7
    }

    public final void o0(boolean r6) {
        Playlist r0 = this.C0;
        mm3 r2 = this.B0;
        int r4 = 21;
        new Thread(new lg1(r4, r2.b, r0)).start();
        Playlist r1 = this.C0;
        if (r6 == false) goto L5;
        new Thread(new jm3(r2, r1.getId(), 1)).start();
    L6:
        h0();
        return;
    L5:
        new Thread(new jm3(r2, r1.getId(), 0)).start();
        goto L6
    }

    public final void p0(BiConsumer r5) {
        MainActivity r0 = (MainActivity) l();
        if (r0 == null) goto L13;
        kc1 r1 = q().y;
        if (r1 != null) goto L8;
        return;
    L8:
        if (r1.T == null) goto L14;
        h0();
        le1 r2 = r1.v();
        String r4 = this.C0.getId();
        int r3 = 1;
        xd0 r6 = new xd0(r3, r5, r0);
        k03 r7 = new mm3().c(r4, true, null);
        r7.e(r2, new i7(r3, r7, r6));
        return;
    L14:
        return;
    }
}
