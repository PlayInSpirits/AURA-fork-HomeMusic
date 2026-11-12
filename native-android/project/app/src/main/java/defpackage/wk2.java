package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wk2 extends ResultReceiver {
    public final WeakReference n;

    public wk2(xk2 xk2Var) {
        super(null);
        this.n = new WeakReference(xk2Var);
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        qu1 qu1Var;
        xk2 xk2Var = (xk2) this.n.get();
        if (xk2Var == null || bundle == null) {
            return;
        }
        synchronized (xk2Var.b) {
            pr2 pr2Var = xk2Var.e;
            IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
            int i2 = jr2.f;
            if (binder == null) {
                qu1Var = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof qu1)) {
                    mu1 mu1Var = new mu1();
                    mu1Var.e = binder;
                    qu1Var = mu1Var;
                } else {
                    qu1Var = (qu1) iInterfaceQueryLocalInterface;
                }
            }
            synchronized (pr2Var.n) {
                pr2Var.p = qu1Var;
            }
            pr2 pr2Var2 = xk2Var.e;
            u45 u45VarL = ud3.L(bundle);
            synchronized (pr2Var2.n) {
                pr2Var2.q = u45VarL;
            }
            xk2Var.a();
        }
    }
}
