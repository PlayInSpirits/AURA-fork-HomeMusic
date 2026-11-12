package defpackage;

import android.net.ConnectivityManager;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p53 implements jb0 {
    public final ConnectivityManager a;

    public p53(ConnectivityManager r1) {
        this.a = r1;
    }

    @Override // defpackage.jb0
    public final boolean a(dd5 r1) {
        if (c(r1) == true) goto L5;
        return false;
    L5:
        kf2.o("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        return false;
    }

    @Override // defpackage.jb0
    public final ny b(mc0 r4) {
        r4.getClass();
        r r0 = new r(r4, this, null, 9);
        wv r1 = wv.n;
        return new ny(r0, q01.n, -2, r1);
    }

    @Override // defpackage.jb0
    public final boolean c(dd5 r1) {
        r1.getClass();
        if (r1.j.a() == null) goto L6;
        return true;
    L6:
        return false;
    }
}
