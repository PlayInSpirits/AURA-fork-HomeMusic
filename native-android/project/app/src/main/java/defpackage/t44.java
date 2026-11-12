package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t44 implements vy3 {
    public m54 n;
    public x44 o;
    public String p;
    public Object q;
    public Object[] r;
    public c12 s;
    public final wc t;

    public t44(m54 r1, x44 r2, String r3, Object r4, Object[] r5) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
        this.t = new wc(19, this);
    }

    @Override // defpackage.vy3
    public final void a() {
        c12 r0 = this.s;
        if (r0 == null) goto L6;
        r0.k();
        return;
    }

    public final void b() {
        x44 r0 = this.o;
        c12 r1 = this.s;
        if (r1 != null) goto L24;
        if (r0 == null) goto L26;
        wc r2 = this.t;
        Object r3 = r2.invoke();
        if (r3 != null) goto L8;
    L22:
        this.s = r0.a(this.p, r2);
        return;
    L8:
        if (r0.b(r3) == true) goto L22;
        if ((r3 instanceof nh4) == false) goto L19;
        nh4 r4 = (nh4) r3;
        if (r4.c() != rv2.s) goto L14;
    L18:
        String r5 = "MutableState containing " + r4.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
    L21:
        throw new IllegalArgumentException(r5);
    L14:
        if (r4.c() == rv2.D) goto L18;
        if (r4.c() == rv2.A) goto L18;
        r5 = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
        goto L21
    L19:
        r5 = gh0.o(r3);
        goto L21
    L26:
        return;
    L24:
        nz2.k(r1, ") is not null", "entry(");
    }

    @Override // defpackage.vy3
    public final void c() {
        c12 r0 = this.s;
        if (r0 == null) goto L6;
        r0.k();
        return;
    }

    @Override // defpackage.vy3
    public final void d() {
        b();
    }
}
