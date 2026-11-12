package defpackage;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t53 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final v53 a;

    public t53(v53 r1) {
        this.a = r1;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo r3) {
        int r4 = xq2.d(r3);
        int r1 = 5;
        if (r4 != 3) goto L5;
    L9:
        boolean r5 = true;
    L10:
        if (r5 == false) goto L12;
        r1 = 10;
    L12:
        this.a.c(r1);
        return;
    L5:
        if (r4 == 4) goto L9;
        if (r4 == 5) goto L9;
        r5 = false;
        goto L10
    }
}
