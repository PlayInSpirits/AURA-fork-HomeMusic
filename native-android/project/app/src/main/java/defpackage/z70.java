package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z70 extends ep4 implements wf1 {
    public int o;
    public /* synthetic */ float p;
    public final /* synthetic */ a80 q;

    public z70(a80 r1, vd0 r2) {
        this.q = r1;
        super(2, r2);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r2, vd0 r3) {
        z70 r0 = new z70(this.q, r3);
        r0.p = ((Number) r2).floatValue();
        return r0;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r1, Object r2) {
        Float r3 = Float.valueOf(((Number) r1).floatValue());
        return ((z70) create(r3, (vd0) r2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r10) {
        int r0 = this.o;
        Object r1 = null;
        if (r0 == 0) goto L8;
        if (r0 != 1) goto L6;
        kb4.X(r10);
    L18:
        return new Float(Float.intBitsToFloat((int) (((g83) r10).a & 4294967295L)));
    L6:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L8:
        kb4.X(r10);
        float r11 = this.p;
        a80 r2 = this.q;
        e94 r5 = r2.a.d;
        Object r6 = r5.n.g(d94.e);
        if (r6 == null) goto L12;
        r1 = r6;
    L12:
        wf1 r3 = (wf1) r1;
        if (r3 == null) goto L20;
        h64 r4 = (h64) r2.a.d.d(n94.v);
        g83 r12 = new g83((Float.floatToRawIntBits(0.0f) << 32) | (((long) Float.floatToRawIntBits(r11)) & 4294967295L));
        this.o = 1;
        r10 = r3.invoke(r12, this);
        xe0 r9 = xe0.n;
        if (r10 != r9) goto L18;
        return r9;
    L20:
        throw xa3.l("Required value was null.");
    }
}
