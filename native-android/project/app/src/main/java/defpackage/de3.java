package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class de3 implements jd2 {
    public final long a;
    public final ii0 b;
    public final int c;
    public final yl4 d;
    public final ce3 e;
    public volatile Object f;

    public de3(ci0 r2, ii0 r3, ce3 r4) {
        this.d = new yl4(r2);
        this.b = r3;
        this.c = 4;
        this.e = r4;
        this.a = ed2.g.getAndIncrement();
    }

    @Override // defpackage.jd2
    public final void a() {
        this.d.o = 0;
        gi0 r0 = new gi0(this.d, this.b);
        r0.b();     // Catch: Throwable -> L6
        Uri r1 = this.d.n.m();     // Catch: Throwable -> L6
        r1.getClass();     // Catch: Throwable -> L6
        this.f = this.e.a(r1, r0);     // Catch: Throwable -> L6
        f35.h(r0);
        return;
    L6:
        th = move-exception;
        f35.h(r0);
        throw th;
    }

    @Override // defpackage.jd2
    public final void b() {
    }
}
