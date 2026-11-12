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

    public al4(ArrayList r1, CountDownLatch r2, xj r3, k03 r4) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
    }

    @Override // defpackage.a83
    public final void b(Object r6) {
        List r7 = (List) r6;
        ArrayList r0 = this.a;
        if (r7 == null) goto L5;
        r0.addAll(r7);
    L5:
        CountDownLatch r8 = this.b;
        r8.countDown();
        if (r8.getCount() != 0) goto L9;
        this.c.e(r0);
        this.d.j(this);
        return;
    }
}
