package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ux1 implements m84 {
    public final te2 a;
    public final te2 b;
    public long c;

    public ux1(long r7, long[] r9, long[] r10) {
        if (r9.length != r10.length) goto L5;
        boolean r0 = true;
    L6:
        rr2.l(r0);
        int r1 = r10.length;
        if (r1 > 0) goto L9;
    L11:
        this.a = new te2(r1);
        this.b = new te2(r1);
    L12:
        this.a.b(r9);
        this.b.b(r10);
        this.c = r7;
        return;
    L9:
        if (r10[0] <= 0) goto L11;
        int r2 = r1 + 1;
        te2 r3 = new te2(r2);
        this.a = r3;
        te2 r4 = new te2(r2);
        this.b = r4;
        r3.a(0);
        r4.a(0);
        goto L12
    L5:
        r0 = false;
        goto L6
    }

    @Override // defpackage.m84
    public final boolean b() {
        if (this.b.b <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.m84
    public final l84 e(long r8) {
        te2 r0 = this.b;
        if (r0.b != 0) goto L6;
        o84 r9 = o84.c;
        return new l84(r9, r9);
    L6:
        int r1 = f35.c(r0, r8);
        long r3 = r0.d(r1);
        te2 r7 = this.a;
        o84 r2 = new o84(r3, r7.d(r1));
        if (r3 == r8) goto L14;
        if (r1 == (r0.b - 1)) goto L14;
        int r4 = r1 + 1;
        return new l84(r2, new o84(r0.d(r4), r7.d(r4)));
    L14:
        return new l84(r2, r2);
    }

    @Override // defpackage.m84
    public final long g() {
        return this.c;
    }
}
