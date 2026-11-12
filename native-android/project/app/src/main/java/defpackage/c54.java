package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c54 implements w92, AutoCloseable {
    public final String n;
    public final b54 o;
    public boolean p;

    public c54(String r1, b54 r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.w92
    public final void b(ba2 r2, q92 r3) {
        if (r3 != q92.ON_DESTROY) goto L6;
        this.p = false;
        r2.h().f(this);
        return;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    public final void f(rm3 r2, ea2 r3) {
        r2.getClass();
        r3.getClass();
        if (this.p == true) goto L6;
        this.p = true;
        r3.a(this);
        cs0 r4 = (cs0) this.o.a.r;
        r2.L(this.n, r4);
        return;
    L6:
        kf2.o("Already attached to lifecycleOwner");
    }
}
