package defpackage;

import android.util.Log;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vn2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ ic2 o;
    public final /* synthetic */ List p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;

    public /* synthetic */ vn2(bl2 bl2Var, List list, int i, int i2) {
        this.n = 1;
        this.o = bl2Var;
        this.p = list;
        this.q = i;
        this.r = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        List list = this.p;
        int i2 = this.r;
        int i3 = this.q;
        ic2 ic2Var = this.o;
        switch (i) {
            case 0:
                try {
                    if (ic2Var.isDone()) {
                        Log.e("MediaManager", "remove range");
                        ((bj2) ic2Var.get()).P(i3, i2);
                        try {
                            list.removeAll(list.subList(i3, i2));
                            new vs3().c(list, true, 0);
                        } catch (InterruptedException e) {
                            e = e;
                        }
                    }
                } catch (InterruptedException | ExecutionException e2) {
                    e = e2;
                }
                e.printStackTrace();
                break;
            case 1:
                try {
                    if (ic2Var.isDone()) {
                        Log.e("MediaManager", "shuffle");
                        bo2.d.execute(new xn2(list, (bj2) ic2Var.get(), i3, i2));
                    }
                } catch (InterruptedException | ExecutionException e3) {
                    e3.printStackTrace();
                    return;
                }
                break;
            default:
                try {
                    if (ic2Var.isDone()) {
                        Log.e("MediaManager", "swap");
                        ((bj2) ic2Var.get()).t0(i3, i2);
                        try {
                            new vs3().c(list, true, 0);
                        } catch (InterruptedException e4) {
                            e = e4;
                        }
                    }
                } catch (InterruptedException | ExecutionException e5) {
                    e = e5;
                }
                e.printStackTrace();
                break;
        }
    }

    public /* synthetic */ vn2(bl2 bl2Var, int i, int i2, List list, int i3) {
        this.n = i3;
        this.o = bl2Var;
        this.q = i;
        this.r = i2;
        this.p = list;
    }
}
