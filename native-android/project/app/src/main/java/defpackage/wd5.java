package defpackage;

import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wd5 implements t80, w92 {
    public final ra n;
    public final z80 o;
    public boolean p;
    public ea2 q;
    public r70 r;

    public wd5(ra r1, z80 r2) {
        this.n = r1;
        this.o = r2;
        this.r = rr2.a;
    }

    public final void a() {
        if (this.p == true) goto L11;
        this.p = true;
        ra r0 = this.n;
        r0.getView().setTag(R.id.wrapped_composition_tag, null);
        ea2 r1 = this.q;
        if (r1 == null) goto L7;
        r1.f(this);
    L7:
        this.q = null;
        bs0 r2 = r0.t;
        if (r2 == null) goto L10;
        r2.o.invoke();
    L10:
        r0.t = null;
    L11:
        this.o.m();
    }

    @Override // defpackage.w92
    public final void b(ba2 r1, q92 r2) {
        if (r2 != q92.ON_DESTROY) goto L7;
        a();
        return;
    L7:
        if (r2 == q92.ON_CREATE) goto L9;
        return;
    L9:
        if (this.p == true) goto L13;
        c(this.r);
        return;
    }

    public final void c(wf1 r3) {
        z15 r0 = new z15(this, (r70) r3, 1);
        this.n.setOnReadyForComposition(r0);
    }
}
