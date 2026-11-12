package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q70 extends a6 implements wf1 {
    public final /* synthetic */ int u;

    public /* synthetic */ q70(int r2, Object r3, Class r4, String r5, String r6, int r7, int r8) {
        this.u = r8;
        super(r2, r7, r4, r3, r5, r6);
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r10, Object r11) {
        int r0 = this.u;
        j15 r2 = j15.a;
        Object r9 = this.n;
        switch(r0) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        long r5 = ((k45) r10).a;
        vd0 r12 = (vd0) r11;
        z64 r4 = (z64) r9;
        vd0 r7 = null;
        fu.G(r4.W.x(), null, null, new j2(r4, r5, r7, 3), 3);
        return r2;
    L6:
        long r6 = ((k45) r10).a;
        vd0 r13 = (vd0) r11;
        z64 r8 = (z64) r9;
        vd0 r14 = null;
        fu.G(r8.W.x(), null, null, new j2(r8, r6, r14, 2), 3);
        return r2;
    L8:
        int r15 = ((Number) r11).intValue();
        r70 r16 = (r70) r9;
        r16.b(r15, (rg1) r10);
        return r2;
    }
}
