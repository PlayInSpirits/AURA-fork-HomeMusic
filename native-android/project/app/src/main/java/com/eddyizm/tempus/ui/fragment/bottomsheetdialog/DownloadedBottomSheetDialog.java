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
import com.eddyizm.tempus.subsonic.models.Child;
import defpackage.aj2;
import defpackage.b11;
import defpackage.bj2;
import defpackage.bl2;
import defpackage.c04;
import defpackage.cb4;
import defpackage.cu0;
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
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class DownloadedBottomSheetDialog extends zt implements View.OnClickListener {
    public ArrayList B0;
    public String C0;
    public String D0;
    public bl2 E0;

    public DownloadedBottomSheetDialog() {
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r8, ViewGroup r9, Bundle r10) {
        final int r0 = 0;
        View r11 = r8.inflate(R.layout.bottom_sheet_downloaded_dialog, r9, false);
        Bundle r12 = this.s;
        if (r12 == null) goto L25;
        ArrayList r13 = r12.getParcelableArrayList("download_group");
        this.B0 = r13;
        if (r13 == null) goto L25;
        this.C0 = r12.getString("download_group_title");
        this.D0 = r12.getString("download_group_subtitle");
        q05.u((ViewGroup) r11.findViewById(R.id.option_linear_layout));
        TextView r14 = (TextView) r11.findViewById(R.id.play_random_text_view);
        final int r2 = 1;
        if (this.B0.size() <= 1) goto L10;
        int r1 = 0;
    L11:
        r14.setVisibility(r1);
        TextView r3 = (TextView) r11.findViewById(R.id.remove_all_text_view);
        if (this.B0.size() <= 1) goto L15;
        int r4 = R.string.downloaded_bottom_sheet_remove_all;
    L16:
        r3.setText(r().getText(r4));
        ImageView r5 = (ImageView) r11.findViewById(R.id.group_cover_image_view);
        Context r6 = Z();
        String r7 = ((Child) this.B0.get(new Random().nextInt(this.B0.size()))).getCoverArtId();
        c04 r15 = a.c(r6);
        if (r7 == null) goto L19;
        String r16 = wg0.b(ud3.t(), r7);
    L20:
        vz3 r17 = b11.g(r6, r7, 1, r15, r16).T(xv0.b());
        if (ud3.R() == false) goto L23;
        r17 = (vz3) r17.l();
    L23:
        r17.K(r5);
        TextView r18 = (TextView) r11.findViewById(R.id.group_title_text_view);
        r18.setText(this.C0);
        r18.setSelected(true);
        TextView r19 = (TextView) r11.findViewById(R.id.group_subtitle_text_view);
        r19.setText(this.D0);
        r19.setSelected(true);
        ((TextView) r11.findViewById(R.id.play_random_text_view)).setOnClickListener(new cu0(this, r0));
        ((TextView) r11.findViewById(R.id.play_next_text_view)).setOnClickListener(new cu0(this, r2));
        final int r20 = 2;
        ((TextView) r11.findViewById(R.id.add_to_queue_text_view)).setOnClickListener(new cu0(this, r20));
        final int r21 = 3;
        ((TextView) r11.findViewById(R.id.remove_all_text_view)).setOnClickListener(new cu0(this, r21));
        return r11;
    L19:
        r16 = null;
        goto L20
    L15:
        r4 = R.string.downloaded_bottom_sheet_remove;
        goto L16
    L10:
        r1 = 8;
    L25:
        n0();
        return r11;
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
        this.E0 = r7;
        return;
    L8:
        r0 = null;
        goto L9
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void S() {
        bl2 r0 = this.E0;
        if (r0 == null) goto L5;
        sk2.Z0(r0);
    L5:
        super.S();
    }
}
