package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ld2 extends k03 {
    public final og5 l;
    public ba2 m;
    public md2 n;

    public ld2(og5 r2) {
        this.l = r2;
        if (r2.a != null) goto L6;
        r2.a = this;
        return;
    L6:
        kf2.o("There is already a listener registered");
        throw null;
    }

    @Override // defpackage.ad2
    public final void g() {
        og5 r1 = this.l;
        r1.b = true;
        r1.d = false;
        r1.c = false;
        r1.i.drainPermits();
        r1.a();
        r1.g = new qk(r1);
        r1.b();
    }

    @Override // defpackage.ad2
    public final void h() {
        this.l.b = false;
    }

    @Override // defpackage.ad2
    public final void j(a83 r1) {
        super.j(r1);
        this.m = null;
        this.n = null;
    }

    public final void l() {
        ba2 r0 = this.m;
        md2 r1 = this.n;
        if (r0 == null) goto L7;
        if (r1 == null) goto L8;
        super.j(r1);
        e(r0, r1);
        return;
    L8:
        return;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder(64);
        r0.append("LoaderInfo{");
        r0.append(Integer.toHexString(System.identityHashCode(this)));
        r0.append(" #0 : ");
        gh0.c(this.l, r0);
        r0.append("}}");
        return r0.toString();
    }
}
