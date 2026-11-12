package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zk4 extends pp0 {
    public final /* synthetic */ int B0;
    public hd C0;
    public Runnable D0;

    public /* synthetic */ zk4(int r1) {
        this.B0 = r1;
    }

    @Override // defpackage.kc1
    public final void P() {
        switch(this.B0) {
            case 0: goto L12;
            case 1: goto L8;
            default: goto L4;
        };
    L4:
        this.R = true;
        Context r0 = Z();
        f9 r4 = (f9) this.w0;
        if (r4 == null) goto L16;
        int r6 = 4;
        r4.i(-1).setOnClickListener(new et1(this, r0, r4, r6));
        r4.i(-3).setOnClickListener(new io0(r4, r6));
        r4.i(-2).setOnClickListener(new j8(26, this, r4));
        return;
    L16:
        return;
    L8:
        this.R = true;
        Context r1 = Z();
        f9 r5 = (f9) this.w0;
        if (r5 == null) goto L17;
        int r7 = 3;
        r5.i(-1).setOnClickListener(new et1(this, r1, r5, r7));
        r5.i(-3).setOnClickListener(new io0(r5, r7));
        r5.i(-2).setOnClickListener(new j8(25, this, r5));
        return;
    L17:
        return;
    L12:
        this.R = true;
        Context r2 = Z();
        f9 r8 = (f9) this.w0;
        if (r8 == null) goto L18;
        int r9 = 2;
        r8.i(-1).setOnClickListener(new et1(this, r2, r8, r9));
        r8.i(-3).setOnClickListener(new io0(r8, r9));
        r8.i(-2).setOnClickListener(new j8(24, this, r8));
        return;
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle r12) {
        switch(this.B0) {
            case 0: goto L20;
            case 1: goto L12;
            default: goto L4;
        };
    L4:
        View r13 = o().inflate(R.layout.dialog_starred_sync, null, false);
        if (r13 == null) goto L10;
        LinearLayout r14 = (LinearLayout) r13;
        nc1 r0 = X();
        e75 r8 = r0.d();
        b75 r9 = gh0.r(r0);
        bq4 r10 = new bq4(r8, r9, b11.e(r0, r9));
        i30 r1 = kx3.a(dl4.class);
        String r11 = r1.b();
        if (r11 == null) goto L9;
        this.C0 = (dl4) r10.l(r1, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r11));
        vg2 r15 = new vg2(l(), 0).q(r14);
        r15.p(R.string.starred_sync_dialog_title);
        vg2 r16 = r15.l(R.string.starred_sync_dialog_positive_button, null);
        r16.k(R.string.starred_sync_dialog_neutral_button, null);
        return r16.j(R.string.starred_sync_dialog_negative_button, null).create();
    L9:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L10:
        nz2.n("rootView");
        return null;
    L12:
        View r17 = o().inflate(R.layout.dialog_starred_artist_sync, null, false);
        if (r17 == null) goto L18;
        LinearLayout r18 = (LinearLayout) r17;
        nc1 r2 = X();
        e75 r19 = r2.d();
        b75 r20 = gh0.r(r2);
        bq4 r110 = new bq4(r19, r20, b11.e(r2, r20));
        i30 r3 = kx3.a(cl4.class);
        String r21 = r3.b();
        if (r21 == null) goto L17;
        this.C0 = (cl4) r110.l(r3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r21));
        vg2 r111 = new vg2(l(), 0).q(r18);
        r111.p(R.string.starred_artist_sync_dialog_title);
        vg2 r112 = r111.l(R.string.starred_sync_dialog_positive_button, null);
        r112.k(R.string.starred_sync_dialog_neutral_button, null);
        return r112.j(R.string.starred_sync_dialog_negative_button, null).create();
    L17:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L18:
        nz2.n("rootView");
        return null;
    L20:
        View r113 = o().inflate(R.layout.dialog_starred_album_sync, null, false);
        if (r113 == null) goto L26;
        LinearLayout r114 = (LinearLayout) r113;
        nc1 r4 = X();
        e75 r22 = r4.d();
        b75 r23 = gh0.r(r4);
        bq4 r115 = new bq4(r22, r23, b11.e(r4, r23));
        i30 r5 = kx3.a(bl4.class);
        String r24 = r5.b();
        if (r24 == null) goto L25;
        this.C0 = (bl4) r115.l(r5, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r24));
        vg2 r116 = new vg2(l(), 0).q(r114);
        r116.p(R.string.starred_album_sync_dialog_title);
        vg2 r117 = r116.l(R.string.starred_sync_dialog_positive_button, null);
        r117.k(R.string.starred_sync_dialog_neutral_button, null);
        return r117.j(R.string.starred_sync_dialog_negative_button, null).create();
    L25:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L26:
        nz2.n("rootView");
        return null;
    }
}
