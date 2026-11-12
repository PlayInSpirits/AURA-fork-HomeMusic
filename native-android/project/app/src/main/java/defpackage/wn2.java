package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wn2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ bj2 o;
    public final /* synthetic */ ArrayList p;
    public final /* synthetic */ int q;
    public final /* synthetic */ long r;

    public /* synthetic */ wn2(bj2 bj2Var, ArrayList arrayList, int i, long j, int i2) {
        this.n = i2;
        this.o = bj2Var;
        this.p = arrayList;
        this.q = i;
        this.r = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        long j = this.r;
        int i2 = this.q;
        ArrayList arrayList = this.p;
        bj2 bj2Var = this.o;
        switch (i) {
            case 0:
                if (!u52.c().a && bj2Var.Q0() <= 0) {
                    bj2Var.r();
                    rk2 rk2Var = bj2Var.d;
                    bj2Var.c1();
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        rr2.j(i3, "items must not contain null, index=%s", arrayList.get(i3) != null);
                    }
                    if (rk2Var.Y()) {
                        rk2Var.L0(arrayList);
                    } else {
                        l93.q0("MediaController", "The controller is not connected. Ignoring setMediaItems().");
                    }
                    bj2Var.n(i2, j);
                    bj2Var.b();
                }
                break;
            default:
                if (!u52.c().a) {
                    bo2.b.set(true);
                    bj2Var.T(arrayList, i2, j);
                    bj2Var.b();
                    bj2Var.v(new zn2(bj2Var, i2, j));
                    break;
                }
                break;
        }
    }
}
