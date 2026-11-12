package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class de2 implements q04, r51 {
    public static final i61 r = null;
    public final ul4 n;
    public q04 o;
    public boolean p;
    public boolean q;

    static {
        r = s51.a(20, new tv1());
    }

    public de2() {
        this.n = new ul4();
    }

    public final synchronized void a() {
        monitor-enter(this);
        this.n.a();     // Catch: Throwable -> L9
        if (this.p == false) goto L14;
        this.p = false;     // Catch: Throwable -> L9
        if (this.q == false) goto L11;
        b();     // Catch: Throwable -> L9
    L11:
        monitor-exit(this);
        return;
    L14:
        throw new IllegalStateException("Already unlocked");     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.q04
    public final synchronized void b() {
        monitor-enter(this);
        this.n.a();     // Catch: Throwable -> L7
        this.q = true;     // Catch: Throwable -> L7
        if (this.p == true) goto L9;
        this.o.b();     // Catch: Throwable -> L7
        this.o = null;     // Catch: Throwable -> L7
        r.a(this);     // Catch: Throwable -> L7
    L9:
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
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
