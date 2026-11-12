package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oz0 extends bu {
    public final /* synthetic */ pz0 h;

    public oz0(pz0 pz0Var) {
        this.h = pz0Var;
    }

    @Override // defpackage.bu
    public final void u(Throwable th) {
        this.h.a.e(th);
    }

    @Override // defpackage.bu
    public final void v(na4 na4Var) {
        pz0 pz0Var = this.h;
        pz0Var.c = na4Var;
        na4 na4Var2 = pz0Var.c;
        tz0 tz0Var = pz0Var.a;
        pz0Var.b = new qp4(na4Var2, tz0Var.g, tz0Var.i, Build.VERSION.SDK_INT >= 34 ? zz0.a() : fu.w());
        tz0 tz0Var2 = pz0Var.a;
        ArrayList arrayList = new ArrayList();
        tz0Var2.a.writeLock().lock();
        try {
            tz0Var2.c = 1;
            arrayList.addAll(tz0Var2.b);
            tz0Var2.b.clear();
            tz0Var2.a.writeLock().unlock();
            tz0Var2.d.post(new rq(arrayList, tz0Var2.c, (Throwable) null));
        } catch (Throwable th) {
            tz0Var2.a.writeLock().unlock();
            throw th;
        }
    }
}
