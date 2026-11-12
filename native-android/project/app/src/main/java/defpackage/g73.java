package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g73 implements q81 {
    public final /* synthetic */ lm0 n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ b13 p;
    public final /* synthetic */ b13 q;
    public final /* synthetic */ b13 r;
    public final /* synthetic */ b13 s;

    public g73(lm0 r1, boolean r2, b13 r3, b13 r4, b13 r5, b13 r6) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
        this.s = r6;
    }

    @Override // defpackage.q81
    public final Object b(Object r2, vd0 r3) {
        boolean r4 = ((Boolean) r2).booleanValue();
        j15 r5 = j15.a;
        if (r4 == true) goto L15;
        b13 r6 = this.p;
        if (((Boolean) r6.getValue()).booleanValue() == false) goto L15;
        r6.setValue(Boolean.FALSE);
        int r7 = this.n.k();
        if (this.o == true) goto L15;
        if (r7 < 0) goto L15;
        if (r7 >= ((Number) this.q.getValue()).intValue()) goto L15;
        if (r7 == ((Number) this.r.getValue()).intValue()) goto L15;
        ((if1) this.s.getValue()).invoke(new Integer(r7));
    L15:
        return r5;
    }
}
