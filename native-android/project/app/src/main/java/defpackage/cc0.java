package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cc0 extends ep4 implements wf1 {
    public ic2 o;
    public sk4 p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ oc2 s;
    public final /* synthetic */ c52 t;
    public final /* synthetic */ dd5 u;

    public cc0(oc2 r1, c52 r2, dd5 r3, vd0 r4) {
        this.s = r1;
        this.t = r2;
        this.u = r3;
        super(2, r4);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r4, vd0 r5) {
        c52 r1 = this.t;
        dd5 r2 = this.u;
        cc0 r0 = new cc0(this.s, r1, r2, r5);
        r0.r = r4;
        return r0;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r1, Object r2) {
        return ((cc0) create((we0) r1, (vd0) r2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r14) {
        int r0 = this.q;
        oc2 r3 = this.s;
        boolean r4 = true;
        if (r0 == 0) goto L14;
        if (r0 != 1) goto L12;
        sk4 r6 = this.p;
        ic2 r7 = this.o;
        AtomicInteger r13 = (AtomicInteger) this.r;
        kb4.X(r14);     // Catch: Throwable -> L8 CancellationException -> L10
    L20:
        nc2 r15 = (nc2) r14;     // Catch: Throwable -> L8 CancellationException -> L10
        r6.f(null);
        return r15;
    L10:
        e = move-exception;
        CancellationException r16 = e;
    L29:
        String r1 = ic0.a;     // Catch: Throwable -> L27
        cx.f().c(r1, "Delegated worker " + r3.getClass() + " was cancelled", r16);     // Catch: Throwable -> L27
        if (r13.get() != (-256)) goto L34;
        r4 = false;
    L34:
        if (r7.isCancelled() == false) goto L38;
        if (r4 == true) goto L37;
        throw r16;     // Catch: Throwable -> L27
    L37:
        throw new zb0(r13.get());     // Catch: Throwable -> L27
    L38:
        throw r16;     // Catch: Throwable -> L27
    L12:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L14:
        kb4.X(r14);
        we0 r17 = (we0) this.r;
        AtomicInteger r9 = new AtomicInteger(-256);
        ry r10 = r3.c();
        r6 = fu.G(r17, null, null, new x70(this.t, this.u, r9, r10, null, 1), 3);
        this.r = r9;     // Catch: Throwable -> L8 CancellationException -> L23
        this.o = r10;     // Catch: Throwable -> L8 CancellationException -> L23
        this.p = r6;     // Catch: Throwable -> L8 CancellationException -> L23
        this.q = 1;     // Catch: Throwable -> L8 CancellationException -> L23
        r14 = fu.e(r10, this);     // Catch: Throwable -> L8 CancellationException -> L23
        xe0 r18 = xe0.n;
        if (r14 != r18) goto L19;
        return r18;
    L19:
        r13 = r9;
        r7 = r10;
    L23:
        e = move-exception;
        r16 = e;
        r13 = r9;
        r7 = r10;
    L27:
        th = move-exception;
        r6.f(null);
        throw th;
    L8:
        th = move-exception;
        String r19 = ic0.a;     // Catch: Throwable -> L27
        cx.f().c(r19, "Delegated worker " + r3.getClass() + " threw exception in startWork.", th);     // Catch: Throwable -> L27
        throw th;     // Catch: Throwable -> L27
    }
}
