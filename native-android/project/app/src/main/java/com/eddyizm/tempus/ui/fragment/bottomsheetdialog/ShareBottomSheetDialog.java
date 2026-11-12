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
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Share;
import com.eddyizm.tempus.viewmodel.b;
import defpackage.b11;
import defpackage.b75;
import defpackage.bq4;
import defpackage.c04;
import defpackage.e75;
import defpackage.g12;
import defpackage.gh0;
import defpackage.i30;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.nc1;
import defpackage.qc4;
import defpackage.rc4;
import defpackage.ud3;
import defpackage.vz3;
import defpackage.wg0;
import defpackage.xv0;
import defpackage.zt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ShareBottomSheetDialog extends zt implements View.OnClickListener {
    public b B0;
    public rc4 C0;
    public Share D0;

    public ShareBottomSheetDialog() {
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r7, ViewGroup r8, Bundle r9) {
        final int r0 = 0;
        View r10 = r7.inflate(R.layout.bottom_sheet_share_dialog, r8, false);
        Bundle r11 = this.s;
        if (r11 == null) goto L29;
        Share r12 = (Share) r11.getParcelable("share_object");
        this.D0 = r12;
        if (r12 == null) goto L29;
        nc1 r13 = X();
        e75 r14 = r13.d();
        b75 r1 = gh0.r(r13);
        bq4 r2 = new bq4(r14, r1, b11.e(r13, r1));
        i30 r15 = kx3.a(b.class);
        String r16 = r15.b();
        String r3 = null;
        if (r16 == null) goto L27;
        this.B0 = (b) r2.l(r15, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r16));
        nc1 r17 = X();
        e75 r18 = r17.d();
        b75 r4 = gh0.r(r17);
        bq4 r5 = new bq4(r18, r4, b11.e(r17, r4));
        i30 r19 = kx3.a(rc4.class);
        String r20 = r19.b();
        if (r20 == null) goto L25;
        rc4 r21 = (rc4) r5.l(r19, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r20));
        this.C0 = r21;
        r21.d = this.D0;
        ImageView r22 = (ImageView) r10.findViewById(R.id.share_cover_image_view);
        List<Child> r23 = this.C0.d.getEntries();
        if (r23 != null) goto L14;
    L16:
        String r24 = null;
    L17:
        Context r6 = Z();
        c04 r25 = a.c(r6);
        if (r24 == null) goto L20;
        r3 = wg0.b(ud3.t(), r24);
    L20:
        final int r26 = 1;
        vz3 r27 = b11.g(r6, r24, 1, r25, r3).T(xv0.b());
        if (ud3.R() == false) goto L23;
        r27 = (vz3) r27.l();
    L23:
        r27.K(r22);
        TextView r28 = (TextView) r10.findViewById(R.id.share_title_text_view);
        r28.setText(this.C0.d.getDescription());
        r28.setSelected(true);
        TextView r29 = (TextView) r10.findViewById(R.id.share_subtitle_text_view);
        r29.setText(Z().getString(R.string.share_subtitle_item, new Object[]{g12.x(this.D0.getExpires())}));
        r29.setSelected(true);
        ((TextView) r10.findViewById(R.id.copy_link_text_view)).setOnClickListener(new qc4(this, r0));
        ((TextView) r10.findViewById(R.id.update_share_preferences_text_view)).setOnClickListener(new qc4(this, r26));
        final int r30 = 2;
        ((TextView) r10.findViewById(R.id.delete_share_text_view)).setOnClickListener(new qc4(this, r30));
        return r10;
    L14:
        if (r23.isEmpty() == true) goto L16;
        r24 = r23.get(0).getCoverArtId();
        goto L17
    L25:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L27:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L29:
        n0();
        return r10;
    }
}
