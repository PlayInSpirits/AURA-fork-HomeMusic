package defpackage;

import androidx.work.impl.WorkerStoppedException;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qd5 extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public final /* synthetic */ td5 q;

    public /* synthetic */ qd5(td5 r1, vd0 r2, int r3) {
        this.o = r3;
        this.q = r1;
        super(2, r2);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r2, vd0 r3) {
        int r4 = this.o;
        td5 r1 = this.q;
        switch(r4) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new qd5(r1, r3, 1);
    L7:
        return new qd5(r1, r3, 0);
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r3, Object r4) {
        int r0 = this.o;
        j15 r1 = j15.a;
        we0 r5 = (we0) r3;
        vd0 r6 = (vd0) r4;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((qd5) create(r5, r6)).invokeSuspend(r1);
    L7:
        return ((qd5) create(r5, r6)).invokeSuspend(r1);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r7) {
        int r0 = this.o;
        xe0 r2 = xe0.n;
        td5 r4 = this.q;
        vd0 r5 = null;
        switch(r0) {
            case 0: goto L25;
            default: goto L4;
        };
    L4:
        int r1 = this.p;
        if (r1 == 0) goto L14;
        if (r1 != 1) goto L13;
        kb4.X(r7);     // Catch: Throwable -> L9 WorkerStoppedException -> L11 CancellationException -> L21
    L18:
        Object r8 = (pd5) r7;     // Catch: Throwable -> L9 WorkerStoppedException -> L11 CancellationException -> L21
    L23:
        Object r3 = r4.h.r(new ei0(4, r8, r4));
        r3.getClass();
        return r3;
    L13:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L14:
        kb4.X(r7);
        t22 r9 = r4.m;     // Catch: Throwable -> L9 WorkerStoppedException -> L11 CancellationException -> L21
        qd5 r6 = new qd5(r4, r5, 0);     // Catch: Throwable -> L9 WorkerStoppedException -> L11 CancellationException -> L21
        this.p = 1;     // Catch: Throwable -> L9 WorkerStoppedException -> L11 CancellationException -> L21
        r7 = fu.P(r9, r6, this);     // Catch: Throwable -> L9 WorkerStoppedException -> L11 CancellationException -> L21
        if (r7 != r2) goto L18;
        return r2;
    L11:
        e = move-exception;
        r8 = new od5(e.n);
    L21:
        r8 = new md5();
    L9:
        th = move-exception;
        String r10 = ud5.a;
        cx.f().e(r10, "Unexpected error in WorkerWrapper", th);
        r8 = new md5();
        goto L23
    L25:
        int r11 = this.p;
        if (r11 == 0) goto L30;
        if (r11 != 1) goto L29;
        kb4.X(r7);
        return r7;
    L29:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L30:
        kb4.X(r7);
        this.p = 1;
        Object r12 = td5.a(r4, this);
        if (r12 == r2) goto L33;
        return r12;
    L33:
        return r2;
    }
}
