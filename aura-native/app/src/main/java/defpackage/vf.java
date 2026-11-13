package defpackage;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class vf implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((bg) obj).J();
                break;
            case 1:
                ((zg2) obj).a();
                break;
            case 2:
                ((s83) obj).a();
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}
