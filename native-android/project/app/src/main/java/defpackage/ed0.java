package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ed0 extends ep4 implements wf1 {
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ b25 q;
    public final /* synthetic */ gd0 r;
    public final /* synthetic */ fv s;
    public final /* synthetic */ long t;
    public final /* synthetic */ s22 u;

    public ed0(b25 r1, gd0 r2, fv r3, long r4, s22 r6, vd0 r7) {
        this.q = r1;
        this.r = r2;
        this.s = r3;
        this.t = r4;
        this.u = r6;
        super(2, r7);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r9, vd0 r10) {
        long r4 = this.t;
        s22 r6 = this.u;
        ed0 r0 = new ed0(this.q, this.r, this.s, r4, r6, r10);
        r0.p = r9;
        return r0;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r1, Object r2) {
        return ((ed0) create((e74) r1, (vd0) r2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r7) {
        int r0 = this.o;
        if (r0 == 0) goto L8;
        if (r0 != 1) goto L6;
        kb4.X(r7);
    L12:
        return j15.a;
    L6:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L8:
        kb4.X(r7);
        e74 r8 = (e74) this.p;
        long r2 = this.t;
        gd0 r1 = this.r;
        fv r4 = this.s;
        float r3 = gd0.q0(r1, r4, r2);
        b25 r5 = this.q;
        r5.e = r3;
        dd0 r6 = new dd0(r1, r5, this.u, r8);
        jo r9 = new jo(r1, r5, r4, 2);
        this.o = 1;
        Object r10 = r5.a(r6, r9, this);
        xe0 r11 = xe0.n;
        if (r10 != r11) goto L12;
        return r11;
    }
}
