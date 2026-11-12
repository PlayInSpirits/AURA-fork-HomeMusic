package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kx implements bi0 {
    public se4 n;
    public final y41 o;
    public px p;
    public boolean q;
    public bi0 r;
    public int s;

    public kx() {
        this.o = new y41(6);
        this.p = px.c;
    }

    public final lx a() {
        bi0 r0 = this.r;
        if (r0 == null) goto L5;
        ci0 r1 = r0.m();
    L7:
        return c(r1, this.s);
    L5:
        r1 = null;
        goto L7
    }

    public final lx b() {
        bi0 r0 = this.r;
        if (r0 == null) goto L5;
        ci0 r1 = r0.m();
    L7:
        return c(r1, this.s | 1);
    L5:
        r1 = null;
        goto L7
    }

    public final lx c(ci0 r8, int r9) {
        se4 r1 = this.n;
        r1.getClass();
        if (this.q == true) goto L8;
        if (r8 == null) goto L8;
        jx r0 = new jx(r1);
    L7:
        jx r4 = r0;
        return new lx(r1, r8, this.o.m(), r4, this.p, r9);
    L8:
        r0 = null;
        goto L7
    }

    @Override // defpackage.bi0
    public final /* bridge */ /* synthetic */ ci0 m() {
        return a();
    }
}
