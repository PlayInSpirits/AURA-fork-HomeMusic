package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v84 extends w34 {
    public final /* synthetic */ lx u;
    public final /* synthetic */ ii0 v;
    public final /* synthetic */ mm1 w;

    public v84(mm1 r1, lx r2, ii0 r3) {
        this.w = r1;
        this.u = r2;
        this.v = r3;
    }

    @Override // defpackage.w34
    public final Object c() {
        ce3 r0 = this.w.d;
        lx r2 = this.u;
        yl4 r1 = new yl4(r2);
        ed2.g.getAndIncrement();
        r1.o = 0;
        gi0 r3 = new gi0(r1, this.v);
        r3.b();     // Catch: Throwable -> L6
        Uri r5 = r2.v;     // Catch: Throwable -> L6
        r5.getClass();     // Catch: Throwable -> L6
        dn1 r6 = r0.a(r5, r3);     // Catch: Throwable -> L6
        f35.h(r3);
        r6.getClass();
        return r6;
    L6:
        th = move-exception;
        f35.h(r3);
        throw th;
    }
}
