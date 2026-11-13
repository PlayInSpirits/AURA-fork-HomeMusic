package defpackage;

import android.net.ConnectivityManager;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class p53 implements jb0 {
    public final ConnectivityManager a;

    public p53(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    @Override // defpackage.jb0
    public final boolean a(dd5 dd5Var) {
        if (!c(dd5Var)) {
            return false;
        }
        kf2.o("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        return false;
    }

    @Override // defpackage.jb0
    public final ny b(mc0 mc0Var) {
        mc0Var.getClass();
        return new ny(new r(mc0Var, this, null, 9), q01.n, -2, wv.n);
    }

    @Override // defpackage.jb0
    public final boolean c(dd5 dd5Var) {
        dd5Var.getClass();
        return dd5Var.j.a() != null;
    }
}
