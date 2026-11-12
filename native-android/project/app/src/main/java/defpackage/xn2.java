package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xn2 implements Runnable {
    public final /* synthetic */ int n = 1;
    public final /* synthetic */ bj2 o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ List r;

    public /* synthetic */ xn2(bj2 bj2Var, int i, int i2, ArrayList arrayList) {
        this.o = bj2Var;
        this.p = i;
        this.q = i2;
        this.r = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        List list = this.r;
        int i2 = this.q;
        int i3 = this.p;
        bj2 bj2Var = this.o;
        switch (i) {
            case 0:
                new Handler(Looper.getMainLooper()).post(new xn2(bj2Var, i3, i2, gi1.M(list)));
                new vs3().c(list, true, 0);
                break;
            default:
                int i4 = i2 + 1;
                bj2Var.P(i3, i4);
                bj2Var.w0(((ArrayList) list).subList(i3, i4));
                break;
        }
    }

    public /* synthetic */ xn2(List list, bj2 bj2Var, int i, int i2) {
        this.r = list;
        this.o = bj2Var;
        this.p = i;
        this.q = i2;
    }
}
