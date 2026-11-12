package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d74 extends ep4 implements wf1 {
    public g74 o;
    public ix3 p;
    public long q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ g74 t;
    public final /* synthetic */ ix3 u;
    public final /* synthetic */ long v;

    public d74(g74 r1, ix3 r2, long r3, vd0 r5) {
        this.t = r1;
        this.u = r2;
        this.v = r3;
        super(2, r5);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r7, vd0 r8) {
        ix3 r2 = this.u;
        long r3 = this.v;
        d74 r0 = new d74(this.t, r2, r3, r8);
        r0.s = r7;
        return r0;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r1, Object r2) {
        return ((d74) create((e74) r1, (vd0) r2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r11) {
        int r0 = this.r;
        hb3 r1 = hb3.o;
        if (r0 == 0) goto L8;
        if (r0 != 1) goto L6;
        long r3 = this.q;
        ix3 r2 = this.p;
        g74 r5 = this.o;
        g74 r10 = (g74) this.s;
        kb4.X(r11);
    L16:
        float r12 = r10.e(((Number) r11).floatValue());
        if (r5.d != r1) goto L19;
        long r13 = k45.a(r3, r12, 0.0f, 2);
    L20:
        r2.n = r13;
        return j15.a;
    L19:
        r13 = k45.a(r3, 0.0f, r12, 1);
        goto L20
    L6:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L8:
        kb4.X(r11);
        e74 r14 = (e74) this.s;
        r5 = this.t;
        c74 r4 = new c74(r5, r14);
        y71 r15 = r5.c;
        ix3 r6 = this.u;
        long r7 = r6.n;
        hb3 r8 = r5.d;
        long r9 = this.v;
        if (r8 != r1) goto L11;
        float r16 = k45.b(r9);
    L12:
        float r17 = r5.e(r16);
        this.s = r5;
        this.o = r5;
        this.p = r6;
        this.q = r7;
        this.r = 1;
        r11 = r15.a(r4, r17, this);
        xe0 r18 = xe0.n;
        if (r11 != r18) goto L15;
        return r18;
    L15:
        r2 = r6;
        r10 = r5;
        r3 = r7;
        goto L16
    L11:
        r16 = k45.c(r9);
        goto L12
    }
}
