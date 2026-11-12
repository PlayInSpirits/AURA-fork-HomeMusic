package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class xf4 extends pp0 {
    public static final int[] C0 = null;
    public pz1 B0;

    static {
        C0 = new int[]{5, 10, 15, 20, 30, 45, 60, -2, -1};
    }

    public xf4() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [wf4] */
    @Override // defpackage.pp0
    public final Dialog j0(Bundle r7) {
        String[] r8 = r().getStringArray(R.array.sleep_timer_duration_labels);
        boolean r0 = u52.c().a;
        v52 r1 = u52.c();
        if (r0 == false) goto L5;
        boolean r2 = r1.A;
    L6:
        final int r5 = 0;
        vg2 r3 = new vg2(X(), 0);
        r3.p(R.string.sleep_timer_dialog_title);
        r3.n(r8, new wf4(this, r5));
        vg2 r9 = r3.j(R.string.sleep_timer_dialog_close, new wr(14));
        if (r2 == false) goto L19;
        if (r0 == false) goto L10;
        boolean r4 = r1.B;
    L11:
        if (r4 == false) goto L13;
        String r6 = s(R.string.sleep_timer_dialog_end_of_track_active);
    L17:
        r9.a.f = r6;
        final int r10 = 1;
        r9.k(R.string.sleep_timer_dialog_cancel_timer, new wf4(this, r10));
        goto L19
    L13:
        if (r0 == false) goto L15;
        String r11 = r1.C;
    L16:
        r6 = t(R.string.sleep_timer_dialog_active_message, new Object[]{r11});
        goto L17
    L15:
        r11 = yf4.c().d();
        goto L16
    L10:
        r4 = yf4.c().g;
    L19:
        return r9.create();
    L5:
        r2 = yf4.c().f;
        goto L6
    }
}
