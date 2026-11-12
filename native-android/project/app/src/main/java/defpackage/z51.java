package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z51 extends ar4 {
    public final /* synthetic */ q34 e;
    public final /* synthetic */ lr0 f;

    public z51(String r1, q34 r2, lr0 r3) {
        this.e = r2;
        this.f = r3;
        super(r1);
    }

    @Override // defpackage.ar4
    public final long a() {
        q34 r0 = this.e;
        p34 r1 = r0.f();     // Catch: Throwable -> L5
    L7:
        lr0 r4 = this.f;
        if (((CopyOnWriteArrayList) r4.q).contains(r0) == false) goto L14;
        ((LinkedBlockingDeque) r4.r).put(r1);
        return -1;
    L14:
        return -1;
    L5:
        th = move-exception;
        r1 = new p34(r0, th, 2);
        goto L7
    }
}
