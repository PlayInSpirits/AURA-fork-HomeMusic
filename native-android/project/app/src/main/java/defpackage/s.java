package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public final /* synthetic */ long q;
    public Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ s(Object r1, long r2, Object r4, vd0 r5, int r6) {
        this.o = r6;
        this.s = r1;
        this.q = r2;
        this.t = r4;
        super(2, r5);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r12, vd0 r13) {
        int r0 = this.o;
        Object r1 = this.t;
        Object r2 = this.s;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        long r5 = this.q;
        s r3 = new s((g74) r2, r5, (gx3) r1, r13, 1);
        r3.r = r12;
        return r3;
    L6:
        long r6 = this.q;
        return new s((s22) r2, r6, (rm2) r1, r13, 0);
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r3, Object r4) {
        int r0 = this.o;
        j15 r1 = j15.a;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((s) create((e74) r3, (vd0) r4)).invokeSuspend(r1);
    L7:
        return ((s) create((we0) r3, (vd0) r4)).invokeSuspend(r1);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r11) {
        int r0 = this.o;
        j15 r1 = j15.a;
        Object r2 = this.t;
        xe0 r4 = xe0.n;
        Object r5 = this.s;
        int r6 = 1;
        switch(r0) {
            case 0: goto L13;
            default: goto L4;
        };
    L4:
        g74 r7 = (g74) r5;
        int r3 = this.p;
        if (r3 == 0) goto L9;
        if (r3 != 1) goto L8;
        kb4.X(r11);
        return r1;
    L8:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L9:
        kb4.X(r11);
        e74 r12 = (e74) this.r;
        float r8 = r7.h(this.q);
        d90 r9 = new d90((gx3) r2, r7, r12, r6);
        this.p = 1;
        if (j51.f(r8, null, r9, this, 12) == r4) goto L12;
        return r1;
    L12:
        return r4;
    L13:
        rm2 r10 = (rm2) r2;
        int r13 = this.p;
        if (r13 == 0) goto L22;
        if (r13 == 1) goto L21;
        if (r13 == 2) goto L20;
        if (r13 != 3) goto L19;
        kb4.X(r11);
        return r1;
    L19:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L20:
        cq3 r14 = (cq3) this.r;
        kb4.X(r11);
    L28:
        this.r = null;
        this.p = 3;
        if (r10.e(r14, this) == r4) goto L31;
        return r1;
    L31:
        return r4;
    L21:
        kb4.X(r11);
    L25:
        bq3 r15 = new bq3();
        r14 = new cq3();
        this.r = r14;
        this.p = 2;
        if (r10.e(r15, this) != r4) goto L28;
    L22:
        kb4.X(r11);
        this.p = 1;
        if (((s22) r5).R(this) != r4) goto L25;
        goto L25
    }
}
