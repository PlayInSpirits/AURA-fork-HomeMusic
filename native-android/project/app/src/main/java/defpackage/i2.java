package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 extends ep4 implements wf1 {
    public int o;
    public final /* synthetic */ z64 p;
    public final /* synthetic */ float q;
    public final /* synthetic */ float r;

    public i2(z64 r1, float r2, float r3, vd0 r4) {
        this.p = r1;
        this.q = r2;
        this.r = r3;
        super(2, r4);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r3, vd0 r4) {
        float r0 = this.q;
        float r1 = this.r;
        return new i2(this.p, r0, r1, r4);
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r1, Object r2) {
        return ((i2) create((we0) r1, (vd0) r2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r9) {
        int r0 = this.o;
        if (r0 == 0) goto L8;
        if (r0 != 1) goto L6;
        kb4.X(r9);
    L12:
        return j15.a;
    L6:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L8:
        kb4.X(r9);
        long r2 = (Float.floatToRawIntBits(this.q) << 32) | (((long) Float.floatToRawIntBits(this.r)) & 4294967295L);
        this.o = 1;
        Object r8 = v64.a(this.p.e0, r2, this);
        xe0 r10 = xe0.n;
        if (r8 != r10) goto L12;
        return r10;
    }
}
