package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xl1 implements k51 {
    public final k51 a;
    public final boolean b;

    public xl1(int r3) {
        boolean r0 = true;
        if ((r3 & 1) != 0) goto L6;
        r0 = false;
    L6:
        this.b = r0;
        if (r0 == false) goto L10;
        this.a = new df4("image/heif", -1, -1);
        return;
    L10:
        this.a = new wl1();
    }

    @Override // defpackage.k51
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.k51
    public final int b(l51 r1, t71 r2) {
        return this.a.b(r1, r2);
    }

    @Override // defpackage.k51
    public final boolean c(l51 r2) {
        if (this.b == false) goto L7;
        return ji2.S((rk0) r2, false);
    L7:
        return this.a.c(r2);
    }

    @Override // defpackage.k51
    public final void d(long r1, long r3) {
        this.a.d(r1, r3);
    }

    @Override // defpackage.k51
    public final void f(m51 r1) {
        this.a.f(r1);
    }
}
