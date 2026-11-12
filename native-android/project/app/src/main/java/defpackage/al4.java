package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class al4 implements a83 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ CountDownLatch b;
    public final /* synthetic */ xj c;
    public final /* synthetic */ k03 d;

    public al4(ArrayList arrayList, CountDownLatch countDownLatch, xj xjVar, k03 k03Var) {
        this.a = arrayList;
        this.b = countDownLatch;
        this.c = xjVar;
        this.d = k03Var;
    }

    @Override // defpackage.a83
    public final void b(Object obj) {
        List list = (List) obj;
        ArrayList arrayList = this.a;
        if (list != null) {
            arrayList.addAll(list);
        }
        CountDownLatch countDownLatch = this.b;
        countDownLatch.countDown();
        if (countDownLatch.getCount() == 0) {
            this.c.e(arrayList);
            this.d.j(this);
        }
    }
}
