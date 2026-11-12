package defpackage;

import androidx.work.CoroutineWorker;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bf0 extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public final /* synthetic */ CoroutineWorker q;

    public /* synthetic */ bf0(CoroutineWorker r1, vd0 r2, int r3) {
        this.o = r3;
        this.q = r1;
        super(2, r2);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r2, vd0 r3) {
        int r4 = this.o;
        CoroutineWorker r1 = this.q;
        switch(r4) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new bf0(r1, r3, 1);
    L7:
        return new bf0(r1, r3, 0);
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r3, Object r4) {
        int r0 = this.o;
        j15 r1 = j15.a;
        we0 r5 = (we0) r3;
        vd0 r6 = (vd0) r4;
        switch(r0) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        ((bf0) create(r5, r6)).invokeSuspend(r1);
        return r1;
    L5:
        return ((bf0) create(r5, r6)).invokeSuspend(r1);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r5) {
        switch(this.o) {
            case 0: goto L13;
            default: goto L4;
        };
    L4:
        int r0 = this.p;
        if (r0 == 0) goto L9;
        if (r0 != 1) goto L8;
        kb4.X(r5);
        return r5;
    L8:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L9:
        kb4.X(r5);
        this.p = 1;
        Object r6 = this.q.d(this);
        xe0 r4 = xe0.n;
        if (r6 == r4) goto L12;
        return r6;
    L12:
        return r4;
    L13:
        int r1 = this.p;
        if (r1 == 0) goto L19;
        if (r1 != 1) goto L17;
        kb4.X(r5);
        return r5;
    L17:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
    L24:
        return null;
    L19:
        kb4.X(r5);
        this.p = 1;
        kf2.o("Not implemented");
        goto L24
    }
}
