package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fj2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ si1 o;
    public final /* synthetic */ Bundle p;

    public /* synthetic */ fj2(si1 r1, String r2, Bundle r3, int r4) {
        this.n = r4;
        this.o = r1;
        this.p = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        Bundle r2 = this.p;
        si1 r3 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r3.I(r2, null);
        return;
    L6:
        r3.I(r2, null);
    }
}
