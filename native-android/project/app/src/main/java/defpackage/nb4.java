package defpackage;

import app.homemusic.R;
import com.eddyizm.tempus.interfaces.ScanCallback;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nb4 implements ScanCallback {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ nb4(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // com.eddyizm.tempus.interfaces.ScanCallback
    public final void onError(Exception r2) {
        int r0 = this.n;
        Object r1 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((vb4) r1).h0("scan_library").x(r2.getMessage());
        return;
    L6:
        ((nb4) r1).onError(r2);
    }

    @Override // com.eddyizm.tempus.interfaces.ScanCallback
    public final void onSuccess(boolean r2, long r3) {
        int r0 = this.n;
        Object r1 = this.o;
        switch(r0) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        vb4 r4 = (vb4) r1;
        r4.h0("scan_library").x(r4.t(R.string.settings_scan_result, new Object[]{Long.valueOf(r3)}));
        if (r2 == false) goto L10;
        vb4.k0(r4);
        return;
    L10:
        return;
    L8:
        ((nb4) r1).onSuccess(r2, r3);
    }
}
