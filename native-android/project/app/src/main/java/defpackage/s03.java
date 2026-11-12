package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s03 extends r14 implements wf1 {
    public bh1 o;
    public t03 p;
    public long[] q;
    public int r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ t03 u;
    public final /* synthetic */ bh1 v;

    public s03(t03 r1, bh1 r2, vd0 r3) {
        this.u = r1;
        this.v = r2;
        super(r3);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r3, vd0 r4) {
        s03 r0 = new s03(this.u, this.v, r4);
        r0.t = r3;
        return r0;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r1, Object r2) {
        return ((s03) create((ba4) r1, (vd0) r2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r11) {
        int r0 = this.s;
        if (r0 == 0) goto L8;
        if (r0 != 1) goto L6;
        int r1 = this.r;
        long[] r2 = this.q;
        t03 r3 = this.p;
        bh1 r4 = this.o;
        ba4 r5 = (ba4) this.t;
        kb4.X(r11);
    L10:
        if (r1 == Integer.MAX_VALUE) goto L14;
        int r12 = (int) ((r2[r1] >> 31) & 2147483647L);
        r4.o = r1;
        Object r6 = r3.o.b[r1];
        this.t = r5;
        this.o = r4;
        this.p = r3;
        this.q = r2;
        this.r = r12;
        this.s = 1;
        r5.b(this, r6);
        return xe0.n;
    L14:
        return j15.a;
    L6:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L8:
        kb4.X(r11);
        r5 = (ba4) this.t;
        r3 = this.u;
        r03 r13 = r3.o;
        r2 = r13.c;
        r1 = r13.e;
        r4 = this.v;
        goto L10
    }
}
