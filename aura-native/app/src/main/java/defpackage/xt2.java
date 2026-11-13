package defpackage;

import android.util.Pair;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class xt2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ zt2 o;
    public final /* synthetic */ Pair p;

    public /* synthetic */ xt2(zt2 zt2Var, Pair pair, int i) {
        this.n = i;
        this.o = zt2Var;
        this.p = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        Pair pair = this.p;
        zt2 zt2Var = this.o;
        switch (i) {
            case 0:
                ((nj0) zt2Var.o.i).M(((Integer) pair.first).intValue(), (mt2) pair.second);
                break;
            default:
                ((nj0) zt2Var.o.i).z(((Integer) pair.first).intValue(), (mt2) pair.second);
                break;
        }
    }
}
