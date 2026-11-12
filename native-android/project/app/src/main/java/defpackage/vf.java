package defpackage;

import android.window.OnBackInvokedCallback;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vf implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vf(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    public final void onBackInvoked() {
        int r0 = this.a;
        Object r1 = this.b;
        switch(r0) {
            case 0: goto L10;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        ((Runnable) r1).run();
        return;
    L6:
        ((s83) r1).a();
        return;
    L8:
        ((zg2) r1).a();
        return;
    L10:
        ((bg) r1).J();
    }
}
