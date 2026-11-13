package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class vp implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ k6 o;

    public /* synthetic */ vp(k6 k6Var, int i) {
        this.n = i;
        this.o = k6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        k6 k6Var = this.o;
        switch (i) {
            case 0:
                new Handler(Looper.getMainLooper()).post(new vp(k6Var, 1));
                break;
            default:
                k6Var.run();
                break;
        }
    }
}
