package defpackage;

import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ej2 extends v14 {
    public final Bundle q;
    public final si1 r;

    public ej2(String str, Bundle bundle, si1 si1Var, Handler handler) {
        super(handler);
        this.q = bundle;
        this.r = si1Var;
    }

    @Override // defpackage.v14
    public final void a(int i, Bundle bundle) {
        Bundle bundleN = f35.n(bundle);
        Bundle bundle2 = this.q;
        si1 si1Var = this.r;
        if (i == -1) {
            si1Var.I(bundle2, bundleN);
            return;
        }
        if (i == 0) {
            Bundle bundle3 = new Bundle(bundle2);
            bundle3.putAll(bundleN);
            ((lb4) si1Var.o).l(new ab4(0, bundle3));
            return;
        }
        if (i == 1) {
            if (bundle2 == null) {
                Bundle bundle4 = Bundle.EMPTY;
            }
            if (bundleN == null) {
                Bundle bundle5 = Bundle.EMPTY;
                return;
            }
            return;
        }
        l93.q0("MediaBrowserCompat", "Unknown result code: " + i + " (extras=" + bundle2 + ", resultData=" + bundleN + ")");
    }
}
