package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yc2 extends zc2 implements w92 {
    public final ba2 r;
    public final /* synthetic */ ad2 s;

    public yc2(ad2 r1, ba2 r2, a83 r3) {
        this.s = r1;
        super(r1, r3);
        this.r = r2;
    }

    @Override // defpackage.w92
    public final void b(ba2 r3, q92 r4) {
        ba2 r5 = this.r;
        r92 r6 = r5.h().h;
        if (r6 != r92.n) goto L6;
        this.s.j(this.n);
        return;
    L6:
        r92 r0 = null;
    L7:
        if (r0 == r6) goto L9;
        a(e());
        r92 r1 = r5.h().h;
        r0 = r6;
        r6 = r1;
        goto L7
    }

    @Override // defpackage.zc2
    public final void c() {
        this.r.h().f(this);
    }

    @Override // defpackage.zc2
    public final boolean d(ba2 r1) {
        if (this.r != r1) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.zc2
    public final boolean e() {
        if (this.r.h().h.compareTo(r92.q) < 0) goto L6;
        return true;
    L6:
        return false;
    }
}
