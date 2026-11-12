package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qe5 extends q42 implements wf1 {
    public final /* synthetic */ fx3 n;
    public final /* synthetic */ long o;
    public final /* synthetic */ ix3 p;
    public final /* synthetic */ xu3 q;
    public final /* synthetic */ ix3 r;
    public final /* synthetic */ ix3 s;
    public final /* synthetic */ jx3 t;
    public final /* synthetic */ jx3 u;
    public final /* synthetic */ jx3 v;

    public qe5(fx3 r1, long r2, ix3 r4, xu3 r5, ix3 r6, ix3 r7, jx3 r8, jx3 r9, jx3 r10) {
        this.n = r1;
        this.o = r2;
        this.p = r4;
        this.q = r5;
        this.r = r6;
        this.s = r7;
        this.t = r8;
        this.u = r9;
        this.v = r10;
        super(2);
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r8, Object r9) {
        int r10 = ((Number) r8).intValue();
        long r0 = ((Number) r9).longValue();
        xu3 r2 = this.q;
        if (r10 != 1) goto L5;
        fx3 r11 = this.n;
        if (r11.n == true) goto L31;
        r11.n = true;
        if (r0 < this.o) goto L29;
        ix3 r12 = this.p;
        long r1 = r12.n;
        if (r1 != 4294967295L) goto L19;
        r1 = r2.j();
    L19:
        r12.n = r1;
        ix3 r13 = this.r;
        long r3 = 0;
        if (r13.n != 4294967295L) goto L22;
        long r5 = r2.j();
    L23:
        r13.n = r5;
        ix3 r7 = this.s;
        if (r7.n != 4294967295L) goto L26;
        r3 = r2.j();
    L26:
        r7.n = r3;
    L28:
        return j15.a;
    L22:
        r5 = 0;
        goto L23
    L29:
        mj0.i("bad zip: zip64 extra too short");
        return null;
    L31:
        mj0.i("bad zip: zip64 extra repeated");
        return null;
    L5:
        if (r10 != 10) goto L28;
        if (r0 < 4) goto L10;
        r2.skip(4);
        gb.W(r2, (int) (r0 - 4), new pe5(this.t, r2, this.u, this.v));
        goto L28
    L10:
        mj0.i("bad zip: NTFS extra too short");
        return null;
    }
}
