package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class io4 implements go4 {
    public static final di0 q = null;
    public final Object n;
    public volatile go4 o;
    public Object p;

    static {
        q = new di0(6);
    }

    public io4(go4 r2) {
        this.n = new Object();
        this.o = r2;
    }

    @Override // defpackage.go4
    public final Object get() {
        go4 r0 = this.o;
        di0 r1 = q;
        if (r0 == r1) goto L18;
        Object r2 = this.n;
        monitor-enter(r2);
    L11:
        th = move-exception;
        throw th;
    L7:
        if (this.o == r1) goto L13;
        Object r3 = this.o.get();     // Catch: Throwable -> L11
        this.p = r3;     // Catch: Throwable -> L11
        this.o = r1;     // Catch: Throwable -> L11
        monitor-exit(r2);     // Catch: Throwable -> L11
        return r3;
    L13:
        monitor-exit(r2);     // Catch: Throwable -> L11
    L18:
        return this.p;
    }

    public final String toString() {
        Object r0 = this.o;
        StringBuilder r1 = new StringBuilder("Suppliers.memoize(");
        if (r0 != q) goto L5;
        r0 = "<supplier that returned " + this.p + ">";
    L5:
        r1.append(r0);
        r1.append(")");
        return r1.toString();
    }
}
