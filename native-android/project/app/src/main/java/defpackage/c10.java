package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c10 extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ f10 r;
    public final /* synthetic */ q81 s;

    public c10(f10 r2, q81 r3, Object r4, vd0 r5) {
        this.o = 0;
        this.r = r2;
        this.s = r3;
        this.q = r4;
        super(2, r5);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r4, vd0 r5) {
        int r0 = this.o;
        q81 r1 = this.s;
        f10 r2 = this.r;
        switch(r0) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        c10 r3 = new c10(r2, r1, r5);
        r3.q = r4;
        return r3;
    L7:
        return new c10(r2, r1, this.q, r5);
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
        return ((c10) create(r5, r6)).invokeSuspend(r1);
    L7:
        return ((c10) create(r5, r6)).invokeSuspend(r1);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r13) {
        int r0 = this.o;
        j15 r1 = j15.a;
        xe0 r4 = xe0.n;
        switch(r0) {
            case 0: goto L13;
            default: goto L4;
        };
    L4:
        int r2 = this.p;
        if (r2 == 0) goto L9;
        if (r2 != 1) goto L8;
        kb4.X(r13);
        return r1;
    L8:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L9:
        kb4.X(r13);
        we0 r8 = (we0) this.q;
        jx3 r7 = new jx3();
        f10 r9 = this.r;
        p81 r14 = r9.q;
        e10 r6 = new e10(r7, r8, r9, this.s, 0);
        this.p = 1;
        if (r14.a(r6, this) == r4) goto L12;
        return r1;
    L12:
        return r4;
    L13:
        int r3 = this.p;
        if (r3 == 0) goto L18;
        if (r3 != 1) goto L17;
        kb4.X(r13);
        return r1;
    L17:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L18:
        kb4.X(r13);
        xf1 r15 = this.r.r;
        Object r5 = this.q;
        this.p = 1;
        if (r15.a(this.s, r5, this) == r4) goto L21;
        return r1;
    L21:
        return r4;
    }

    public c10(f10 r2, q81 r3, vd0 r4) {
        this.o = 1;
        this.r = r2;
        this.s = r3;
        super(2, r4);
    }
}
