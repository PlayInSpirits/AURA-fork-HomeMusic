package defpackage;

import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ej2 extends v14 {
    public final Bundle q;
    public final si1 r;

    public ej2(String r1, Bundle r2, si1 r3, Handler r4) {
        super(r4);
        this.q = r2;
        this.r = r3;
    }

    @Override // defpackage.v14
    public final void a(int r3, Bundle r4) {
        Bundle r5 = f35.n(r4);
        Bundle r1 = this.q;
        si1 r2 = this.r;
        if (r3 == (-1)) goto L16;
        if (r3 != 0) goto L6;
        Bundle r6 = new Bundle(r1);
        r6.putAll(r5);
        ((lb4) r2.o).l(new ab4(0, r6));
        return;
    L6:
        if (r3 == 1) goto L9;
        l93.q0("MediaBrowserCompat", "Unknown result code: " + r3 + " (extras=" + r1 + ", resultData=" + r5 + ")");
        return;
    L9:
        if (r1 != null) goto L11;
        Bundle r7 = Bundle.EMPTY;
    L11:
        if (r5 != null) goto L18;
        Bundle r8 = Bundle.EMPTY;
        return;
    L18:
        return;
    L16:
        r2.I(r1, r5);
    }
}
