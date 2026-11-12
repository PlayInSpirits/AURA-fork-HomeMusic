package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o11 implements q04 {
    public final boolean n;
    public final boolean o;
    public final q04 p;
    public final i11 q;
    public final f42 r;
    public int s;
    public boolean t;

    public o11(q04 r2, boolean r3, boolean r4, f42 r5, i11 r6) {
        h12.f(r2, "Argument must not be null");
        this.p = r2;
        this.n = r3;
        this.o = r4;
        this.r = r5;
        h12.f(r6, "Argument must not be null");
        this.q = r6;
    }

    public final synchronized void a() {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (this.t == true) goto L11;
        this.s++;     // Catch: Throwable -> L8
        monitor-exit(this);
        return;
    L11:
        throw new IllegalStateException("Cannot acquire a recycled resource");     // Catch: Throwable -> L8
    }

    @Override // defpackage.q04
    public final synchronized void b() {
        monitor-enter(this);
    L11:
        th = move-exception;
        throw th;
    L4:
        if (this.s > 0) goto L18;
        if (this.t == true) goto L16;
        this.t = true;     // Catch: Throwable -> L11
        if (this.o == false) goto L13;
        this.p.b();     // Catch: Throwable -> L11
    L13:
        monitor-exit(this);
        return;
    L16:
        throw new IllegalStateException("Cannot recycle a resource that has already been recycled");     // Catch: Throwable -> L11
    L18:
        throw new IllegalStateException("Cannot recycle a resource while it is still acquired");     // Catch: Throwable -> L11
    }

    public final void c() {
        monitor-enter(this);
        int r0 = this.s;     // Catch: Throwable -> L13
        if (r0 <= 0) goto L16;
        boolean r1 = true;
        int r2 = r0 - 1;     // Catch: Throwable -> L13
        this.s = r2;     // Catch: Throwable -> L13
        if (r2 == 0) goto L9;
        r1 = false;
    L9:
        monitor-exit(this);     // Catch: Throwable -> L13
        if (r1 == false) goto L20;
        this.q.e(this.r, this);
        return;
    L20:
        return;
    L16:
        throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");     // Catch: Throwable -> L13
    L13:
        th = move-exception;
        throw th;
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
        monitor-enter(this);
        String r0 = "EngineResource{isMemoryCacheable=" + this.n + ", listener=" + this.q + ", key=" + this.r + ", acquired=" + this.s + ", isRecycled=" + this.t + ", resource=" + this.p + '}';     // Catch: Throwable -> L7
        monitor-exit(this);
        return r0;
    L7:
        th = move-exception;
        throw th;
    }
}
