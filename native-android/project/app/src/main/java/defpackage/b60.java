package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b60 extends ep4 implements wf1 {
    public int o;
    public final /* synthetic */ p81[] p;
    public final /* synthetic */ int q;
    public final /* synthetic */ AtomicInteger r;
    public final /* synthetic */ aw s;

    public b60(p81[] r1, int r2, AtomicInteger r3, aw r4, vd0 r5) {
        this.p = r1;
        this.q = r2;
        this.r = r3;
        this.s = r4;
        super(2, r5);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r7, vd0 r8) {
        AtomicInteger r3 = this.r;
        aw r4 = this.s;
        return new b60(this.p, this.q, r3, r4, r8);
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r1, Object r2) {
        return ((b60) create((we0) r1, (vd0) r2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r7) {
        int r0 = this.o;
        AtomicInteger r2 = this.r;
        aw r3 = this.s;
        if (r0 == 0) goto L11;
        if (r0 != 1) goto L9;
        kb4.X(r7);     // Catch: Throwable -> L7
    L16:
        if (r2.decrementAndGet() != 0) goto L20;
        r3.j(null);
    L20:
        return j15.a;
    L9:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L11:
        kb4.X(r7);
        p81[] r8 = this.p;     // Catch: Throwable -> L7
        int r1 = this.q;     // Catch: Throwable -> L7
        p81 r9 = r8[r1];     // Catch: Throwable -> L7
        a60 r5 = new a60(r3, r1);     // Catch: Throwable -> L7
        this.o = 1;     // Catch: Throwable -> L7
        Object r6 = r9.a(r5, this);     // Catch: Throwable -> L7
        xe0 r10 = xe0.n;
        if (r6 != r10) goto L16;
        return r10;
    L7:
        th = move-exception;
        if (r2.decrementAndGet() != 0) goto L24;
        r3.j(null);
    L24:
        throw th;
    }
}
