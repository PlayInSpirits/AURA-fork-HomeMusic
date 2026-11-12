package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import app.homemusic.R;
import com.eddyizm.tempus.interfaces.DialogClickCallback;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class us0 extends pp0 {
    public final /* synthetic */ int B0;
    public final DialogClickCallback C0;

    public /* synthetic */ us0(DialogClickCallback r1, int r2) {
        this.B0 = r2;
        this.C0 = r1;
    }

    @Override // defpackage.kc1
    public final void P() {
        final int r2 = 0;
        final int r4 = 1;
        switch(this.B0) {
            case 0: goto L12;
            case 1: goto L8;
            default: goto L4;
        };
    L4:
        this.R = true;
        final f9 r0 = (f9) this.w0;
        if (r0 == null) goto L16;
        r0.i(-1).setOnClickListener(new km4(this, r0, r2));
        r0.i(-2).setOnClickListener(new km4(this, r0, r4));
        return;
    L16:
        return;
    L8:
        this.R = true;
        final f9 r1 = (f9) this.w0;
        if (r1 == null) goto L17;
        r1.i(-1).setOnClickListener(new wt0(this, r1, r2));
        r1.i(-2).setOnClickListener(new wt0(this, r1, r4));
        final int r3 = 2;
        r1.i(-3).setOnClickListener(new wt0(this, r1, r3));
        return;
    L17:
        return;
    L12:
        this.R = true;
        final f9 r5 = (f9) this.w0;
        if (r5 == null) goto L18;
        r5.i(-1).setOnClickListener(new ts0(this, r5, r2));
        r5.i(-2).setOnClickListener(new ts0(this, r5, r4));
        return;
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle r5) {
        switch(this.B0) {
            case 0: goto L14;
            case 1: goto L9;
            default: goto L4;
        };
    L4:
        View r6 = o().inflate(R.layout.dialog_streaming_cache_storage, null, false);
        if (r6 == null) goto L7;
        vg2 r0 = new vg2(l(), 0);
        vg2 r4 = r0.q((LinearLayout) r6);
        r4.p(R.string.streaming_cache_storage_dialog_title);
        return r4.l(R.string.streaming_cache_storage_external_dialog_positive_button, null).j(R.string.streaming_cache_storage_internal_dialog_negative_button, null).create();
    L7:
        nz2.n("rootView");
        return null;
    L9:
        View r7 = o().inflate(R.layout.dialog_download_storage, null, false);
        if (r7 == null) goto L12;
        vg2 r1 = new vg2(l(), 0);
        vg2 r8 = r1.q((LinearLayout) r7);
        r8.p(R.string.download_storage_dialog_title);
        vg2 r9 = r8.l(R.string.download_storage_external_dialog_positive_button, null).j(R.string.download_storage_internal_dialog_negative_button, null);
        r9.k(R.string.download_storage_directory_dialog_neutral_button, null);
        return r9.create();
    L12:
        nz2.n("rootView");
        return null;
    L14:
        View r10 = o().inflate(R.layout.dialog_download_directory, null, false);
        if (r10 == null) goto L17;
        vg2 r2 = new vg2(Z(), 0);
        vg2 r11 = r2.q((LinearLayout) r10);
        r11.p(R.string.download_directory_dialog_title);
        return r11.l(R.string.download_directory_dialog_positive_button, null).j(R.string.download_directory_dialog_negative_button, null).create();
    L17:
        nz2.n("rootView");
        return null;
    }
}
