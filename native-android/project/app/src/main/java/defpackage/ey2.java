package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ey2 implements if1 {
    public final /* synthetic */ hy2 n;
    public final /* synthetic */ jx3 o;
    public final /* synthetic */ gx3 p;
    public final /* synthetic */ g74 q;
    public final /* synthetic */ fx3 r;

    public /* synthetic */ ey2(hy2 r1, jx3 r2, gx3 r3, g74 r4, fx3 r5) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r11) {
        float r12 = ((Float) r11).floatValue();
        hy2 r0 = this.n;
        cy2 r1 = hy2.I(r0.g);
        boolean r2 = true;
        if (r1 == null) goto L5;
        rf2 r3 = (rf2) r0.e;
        long r4 = r1.b;
        long r5 = r1.a;
        ((m45) r3.n).a(r4, Float.intBitsToFloat((int) (r5 >> 32)));
        ((m45) r3.o).a(r4, Float.intBitsToFloat((int) (r5 & 4294967295L)));
        jx3 r6 = this.o;
        cy2 r7 = ((cy2) r6.n).a(r1);
        r6.n = r7;
        long r8 = r7.a;
        g74 r9 = this.q;
        float r10 = r9.j(r9.f(r8));
        this.p.n = r10;
        this.r.n = !h12.b(r10 - r12);
    L5:
        if (r1 != null) goto L9;
        r2 = false;
    L9:
        return Boolean.valueOf(r2);
    }
}
