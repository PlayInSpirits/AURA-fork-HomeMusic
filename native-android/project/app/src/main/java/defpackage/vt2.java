package defpackage;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vt2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ zt2 o;
    public final /* synthetic */ Pair p;
    public final /* synthetic */ un2 q;

    public /* synthetic */ vt2(zt2 zt2Var, Pair pair, un2 un2Var, int i) {
        this.n = i;
        this.o = zt2Var;
        this.p = pair;
        this.q = un2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        un2 un2Var = this.q;
        Pair pair = this.p;
        zt2 zt2Var = this.o;
        switch (i) {
            case 0:
                nj0 nj0Var = (nj0) zt2Var.o.i;
                int iIntValue = ((Integer) pair.first).intValue();
                mt2 mt2Var = (mt2) pair.second;
                mt2Var.getClass();
                nj0Var.m(iIntValue, mt2Var, un2Var);
                break;
            default:
                ((nj0) zt2Var.o.i).l(((Integer) pair.first).intValue(), (mt2) pair.second, un2Var);
                break;
        }
    }
}
