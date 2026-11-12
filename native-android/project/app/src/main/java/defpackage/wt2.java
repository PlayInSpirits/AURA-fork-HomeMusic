package defpackage;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wt2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ zt2 o;
    public final /* synthetic */ Pair p;
    public final /* synthetic */ ed2 q;
    public final /* synthetic */ un2 r;

    public /* synthetic */ wt2(zt2 zt2Var, Pair pair, ed2 ed2Var, un2 un2Var, int i) {
        this.n = i;
        this.o = zt2Var;
        this.p = pair;
        this.q = ed2Var;
        this.r = un2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        un2 un2Var = this.r;
        ed2 ed2Var = this.q;
        Pair pair = this.p;
        zt2 zt2Var = this.o;
        switch (i) {
            case 0:
                ((nj0) zt2Var.o.i).u(((Integer) pair.first).intValue(), (mt2) pair.second, ed2Var, un2Var);
                break;
            default:
                ((nj0) zt2Var.o.i).w(((Integer) pair.first).intValue(), (mt2) pair.second, ed2Var, un2Var);
                break;
        }
    }
}
