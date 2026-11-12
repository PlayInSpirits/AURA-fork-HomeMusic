package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oz0 extends bu {
    public final /* synthetic */ pz0 h;

    public oz0(pz0 r1) {
        this.h = r1;
    }

    @Override // defpackage.bu
    public final void u(Throwable r1) {
        this.h.a.e(r1);
    }

    @Override // defpackage.bu
    public final void v(na4 r6) {
        pz0 r5 = this.h;
        r5.c = r6;
        na4 r0 = r5.c;
        tz0 r1 = r5.a;
        om0 r2 = r1.g;
        wk0 r3 = r1.i;
        if (Build.VERSION.SDK_INT < 34) goto L5;
        Set<int[]> r4 = zz0.a();
    L6:
        r5.b = new qp4(r0, r2, r3, r4);
        tz0 r7 = r5.a;
        ArrayList r8 = new ArrayList();
        r7.a.writeLock().lock();
        r7.c = 1;     // Catch: Throwable -> L10
        r8.addAll(r7.b);     // Catch: Throwable -> L10
        r7.b.clear();     // Catch: Throwable -> L10
        r7.a.writeLock().unlock();
        r7.d.post(new rq(r8, r7.c, null));
        return;
    L10:
        th = move-exception;
        r7.a.writeLock().unlock();
        throw th;
    L5:
        r4 = fu.w();
        goto L6
    }
}
