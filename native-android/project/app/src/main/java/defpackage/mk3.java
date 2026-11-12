package defpackage;

import android.os.Handler;
import app.homemusic.R;
import com.eddyizm.tempus.subsonic.models.LyricsList;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mk3 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qk3 b;

    public /* synthetic */ mk3(qk3 r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // defpackage.a83
    public final void b(Object r4) {
        int r0 = this.a;
        qk3 r3 = this.b;
        switch(r0) {
            case 0: goto L22;
            case 1: goto L20;
            case 2: goto L18;
            case 3: goto L16;
            default: goto L4;
        };
    L4:
        LyricsList r5 = (LyricsList) r4;
        if (qk3.h0(r5) == true) goto L10;
        Handler r6 = r3.p0;
        if (r6 == null) goto L31;
        r6.removeCallbacks(r3.q0);
        r3.p0 = null;
        return;
    L31:
        return;
    L10:
        if (r5.getStructuredLyrics().get(0).getSynced() == true) goto L14;
        Handler r7 = r3.p0;
        if (r7 == null) goto L33;
        r7.removeCallbacks(r3.q0);
        r3.p0 = null;
        return;
    L33:
        return;
    L14:
        Handler r8 = new Handler();
        r3.p0 = r8;
        nk3 r1 = new nk3(r3, 1);
        r3.q0 = r1;
        r8.postDelayed(r1, 250);
        return;
    L16:
        r3.u0 = (String) r4;
        r3.i0();
        return;
    L18:
        r3.s0 = (LyricsList) r4;
        r3.t0 = null;
        r3.i0();
        return;
    L20:
        r3.r0 = (String) r4;
        r3.i0();
        return;
    L22:
        Boolean r9 = (Boolean) r4;
        ml3 r2 = r3.l0;
        if (r2 == null) goto L35;
        MaterialButton r10 = (MaterialButton) r2.a;
        if (r9 != null) goto L27;
    L29:
        r10.setIconResource(R.drawable.ic_download);
        r10.setContentDescription(r3.s(R.string.player_lyrics_download_content_description));
        return;
    L27:
        if (r9.booleanValue() == false) goto L29;
        r10.setIconResource(R.drawable.ic_done);
        r10.setContentDescription(r3.s(R.string.player_lyrics_downloaded_content_description));
        return;
    }
}
