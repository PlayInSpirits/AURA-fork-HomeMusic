package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f74 extends ep4 implements wf1 {
    public long o;
    public int p;
    public /* synthetic */ long q;
    public final /* synthetic */ g74 r;

    public f74(g74 r1, vd0 r2) {
        this.r = r1;
        super(2, r2);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r2, vd0 r3) {
        f74 r0 = new f74(this.r, r3);
        r0.q = ((k45) r2).a;
        return r0;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r3, Object r4) {
        long r0 = ((k45) r3).a;
        g74 r2 = this.r;
        f74 r5 = new f74(r2, (vd0) r4);
        r5.q = r0;
        return r5.invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r15) {
        int r0 = this.p;
        g74 r4 = this.r;
        xe0 r5 = xe0.n;
        if (r0 == 0) goto L12;
        if (r0 == 1) goto L11;
        if (r0 == 2) goto L10;
        if (r0 != 3) goto L8;
        long r1 = this.o;
        long r2 = this.q;
        kb4.X(r15);
    L24:
        return new k45(k45.d(r2, k45.d(r1, ((k45) r15).a)));
    L8:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L10:
        long r3 = this.o;
        long r6 = this.q;
        kb4.X(r15);
    L19:
        long r11 = ((k45) r15).a;
        na4 r8 = r4.f;
        long r9 = k45.d(r3, r11);
        this.q = r6;
        this.o = r11;
        this.p = 3;
        r15 = r8.l(r9, r11, this);
        if (r15 != r5) goto L22;
    L21:
        return r5;
    L22:
        r2 = r6;
        r1 = r11;
        goto L24
    L11:
        r6 = this.q;
        kb4.X(r15);
    L15:
        long r10 = k45.d(r6, ((k45) r15).a);
        this.q = r6;
        this.o = r10;
        this.p = 2;
        r15 = r4.a(r10, this);
        if (r15 == r5) goto L21;
        r3 = r10;
        goto L19
    L12:
        kb4.X(r15);
        r6 = this.q;
        na4 r16 = r4.f;
        this.q = r6;
        this.p = 1;
        r15 = r16.m(r6, this);
        if (r15 != r5) goto L15;
        goto L15
    }
}
