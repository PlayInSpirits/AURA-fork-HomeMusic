package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qr implements fc2 {
    public final fc2 n;
    public int o;
    public int p;
    public int q;
    public Object r;

    public qr(fc2 r2) {
        this.o = 0;
        this.p = -1;
        this.q = -1;
        this.r = null;
        this.n = r2;
    }

    @Override // defpackage.fc2
    public final void a(int r1, int r2) {
        b();
        this.n.a(r1, r2);
    }

    public final void b() {
        int r0 = this.o;
        if (r0 != 0) goto L5;
        return;
    L5:
        fc2 r2 = this.n;
        if (r0 != 1) goto L8;
        r2.k(this.p, this.q);
    L15:
        this.r = null;
        this.o = 0;
        return;
    L8:
        if (r0 != 2) goto L10;
        r2.r(this.p, this.q);
        goto L15
    L10:
        if (r0 != 3) goto L15;
        r2.y(this.p, this.q, this.r);
        goto L15
    }

    @Override // defpackage.fc2
    public final void k(int r5, int r6) {
        if (this.o != 1) goto L10;
        int r0 = this.p;
        if (r5 < r0) goto L10;
        int r2 = this.q;
        if (r5 > (r0 + r2)) goto L10;
        this.q = r2 + r6;
        this.p = Math.min(r5, r0);
        return;
    L10:
        b();
        this.p = r5;
        this.q = r6;
        this.o = 1;
    }

    @Override // defpackage.fc2
    public final void r(int r4, int r5) {
        if (this.o != 2) goto L10;
        int r0 = this.p;
        if (r0 < r4) goto L10;
        if (r0 > (r4 + r5)) goto L10;
        this.q += r5;
        this.p = r4;
        return;
    L10:
        b();
        this.p = r4;
        this.q = r5;
        this.o = 2;
    }

    @Override // defpackage.fc2
    public final void y(int r6, int r7, Object r8) {
        if (this.o != 3) goto L12;
        int r0 = this.p;
        int r2 = this.q + r0;
        if (r6 > r2) goto L12;
        int r3 = r6 + r7;
        if (r3 < r0) goto L12;
        if (this.r != r8) goto L12;
        this.p = Math.min(r6, r0);
        this.q = Math.max(r2, r3) - this.p;
        return;
    L12:
        b();
        this.p = r6;
        this.q = r7;
        this.r = r8;
        this.o = 3;
    }
}
