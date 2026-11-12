package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e45 extends hd3 {
    public final zd3 e;
    public final zd3 f;
    public final n35 g;
    public final zd3 h;
    public float i;
    public dt j;

    public e45(gk1 r4) {
        this.e = uc5.B(new qf4(0));
        this.f = uc5.B(Boolean.FALSE);
        n35 r0 = new n35(r4);
        r0.f = new e25(1, this);
        this.g = r0;
        rv2 r5 = rv2.s;
        this.h = new zd3(j15.a, r5);
        this.i = 1.0f;
    }

    @Override // defpackage.hd3
    public final void a(float r1) {
        this.i = r1;
    }

    @Override // defpackage.hd3
    public final void b(dt r1) {
        this.j = r1;
    }

    @Override // defpackage.hd3
    public final long d() {
        return ((qf4) this.e.getValue()).a;
    }

    @Override // defpackage.hd3
    public final void e(e72 r11) {
        mz r0 = r11.n;
        dt r1 = this.j;
        n35 r2 = this.g;
        if (r1 != null) goto L6;
        r1 = (dt) r2.g.getValue();
    L6:
        if (((Boolean) this.f.getValue()).booleanValue() == true) goto L8;
    L15:
        r2.e(r11, this.i, r1);
    L16:
        this.h.getValue();
        return;
    L8:
        if (r11.getLayoutDirection() != r62.o) goto L15;
        long r3 = r0.W();
        i61 r4 = r0.o;
        long r5 = r4.j();
        r4.g().e();
        ((zg5) r4.o).B(-1.0f, 1.0f, r3);     // Catch: Throwable -> L12
        r2.e(r11, this.i, r1);     // Catch: Throwable -> L12
        r4.g().k();
        r4.t(r5);
    L12:
        th = move-exception;
        r4.g().k();
        r4.t(r5);
        throw th;
    }
}
