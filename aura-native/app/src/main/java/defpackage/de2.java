package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class de2 implements q04, r51 {
    public static final i61 r = s51.a(20, new tv1());
    public final ul4 n = new ul4();
    public q04 o;
    public boolean p;
    public boolean q;

    public final synchronized void a() {
        this.n.a();
        if (!this.p) {
            throw new IllegalStateException("Already unlocked");
        }
        this.p = false;
        if (this.q) {
            b();
        }
    }

    @Override // defpackage.q04
    public final synchronized void b() {
        this.n.a();
        this.q = true;
        if (!this.p) {
            this.o.b();
            this.o = null;
            r.a(this);
        }
    }

    @Override // defpackage.r51
    public final ul4 c() {
        return this.n;
    }

    @Override // defpackage.q04
    public final int d() {
        return this.o.d();
    }

    @Override // defpackage.q04
    public final Class e() {
        return this.o.e();
    }

    @Override // defpackage.q04
    public final Object get() {
        return this.o.get();
    }
}
