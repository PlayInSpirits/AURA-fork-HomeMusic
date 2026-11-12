package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fd0 extends ep4 implements wf1 {
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ gd0 q;
    public final /* synthetic */ b25 r;
    public final /* synthetic */ fv s;
    public final /* synthetic */ long t;

    public fd0(gd0 r1, b25 r2, fv r3, long r4, vd0 r6) {
        this.q = r1;
        this.r = r2;
        this.s = r3;
        this.t = r4;
        super(2, r6);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r8, vd0 r9) {
        fv r3 = this.s;
        long r4 = this.t;
        fd0 r0 = new fd0(this.q, this.r, r3, r4, r9);
        r0.p = r8;
        return r0;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r1, Object r2) {
        return ((fd0) create((we0) r1, (vd0) r2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r14) {
        gd0 r2 = this.q;
        zg5 r8 = r2.G;
        int r0 = this.o;
        if (r0 == 0) goto L13;
        if (r0 != 1) goto L11;
        kb4.X(r14);     // Catch: Throwable -> L7 CancellationException -> L9
    L18:
        r8.z();     // Catch: Throwable -> L7 CancellationException -> L9
        r2.J = false;
        r8.q(null);
        r2.H = false;
        return j15.a;
    L11:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L13:
        kb4.X(r14);
        s22 r6 = gb.D(((we0) this.p).e());
        r2.J = true;     // Catch: Throwable -> L7 CancellationException -> L9
        g74 r15 = r2.C;     // Catch: Throwable -> L7 CancellationException -> L9
        h13 r12 = h13.n;     // Catch: Throwable -> L7 CancellationException -> L9
        ed0 r1 = new ed0(this.r, r2, this.s, this.t, r6, null);     // Catch: Throwable -> L7 CancellationException -> L9
        this.o = 1;     // Catch: Throwable -> L7 CancellationException -> L9
        Object r13 = r15.g(r12, r1, this);     // Catch: Throwable -> L7 CancellationException -> L9
        xe0 r16 = xe0.n;
        if (r13 != r16) goto L18;
        return r16;
    L7:
        th = move-exception;
        r2.J = false;
        r8.q(null);
        r2.H = false;
        throw th;
    L9:
        e = move-exception;
        throw e;     // Catch: Throwable -> L7
    }
}
