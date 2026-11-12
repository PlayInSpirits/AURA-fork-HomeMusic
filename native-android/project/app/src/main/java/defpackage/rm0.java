package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rm0 extends x21 {
    public static final rm0 q = null;
    public ve0 p;

    static {
        int r2 = ir4.c;
        int r3 = ir4.d;
        long r4 = ir4.e;
        String r6 = ir4.a;
        rm0 r0 = new rm0();
        r0.p = new ve0(r2, r3, r4, r6);
        q = r0;
    }

    @Override // defpackage.pe0
    public final void W(ne0 r1, Runnable r2) {
        ve0.j(this.p, r2, 6);
    }

    @Override // defpackage.pe0
    public final void X(ne0 r1, Runnable r2) {
        ve0.j(this.p, r2, 2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.pe0
    public final String toString() {
        return "Dispatchers.Default";
    }
}
