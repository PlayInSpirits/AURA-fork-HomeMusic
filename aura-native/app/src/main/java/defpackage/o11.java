package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class o11 implements q04 {
    public final boolean n;
    public final boolean o;
    public final q04 p;
    public final i11 q;
    public final f42 r;
    public int s;
    public boolean t;

    public o11(q04 q04Var, boolean z, boolean z2, f42 f42Var, i11 i11Var) {
        h12.f(q04Var, "Argument must not be null");
        this.p = q04Var;
        this.n = z;
        this.o = z2;
        this.r = f42Var;
        h12.f(i11Var, "Argument must not be null");
        this.q = i11Var;
    }

    public final synchronized void a() {
        if (this.t) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.s++;
    }

    @Override // defpackage.q04
    public final synchronized void b() {
        if (this.s > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.t) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.t = true;
        if (this.o) {
            this.p.b();
        }
    }

    public final void c() {
        boolean z;
        synchronized (this) {
            int i = this.s;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.s = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.q.e(this.r, this);
        }
    }

    @Override // defpackage.q04
    public final int d() {
        return this.p.d();
    }

    @Override // defpackage.q04
    public final Class e() {
        return this.p.e();
    }

    @Override // defpackage.q04
    public final Object get() {
        return this.p.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.n + ", listener=" + this.q + ", key=" + this.r + ", acquired=" + this.s + ", isRecycled=" + this.t + ", resource=" + this.p + '}';
    }
}
