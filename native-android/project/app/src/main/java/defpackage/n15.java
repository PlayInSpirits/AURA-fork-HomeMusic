package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n15 extends pe0 {
    public static final n15 p = null;

    static {
        p = new n15();
    }

    @Override // defpackage.pe0
    public final void W(ne0 r2, Runnable r3) {
        rm0.q.p.f(r3, true, false);
    }

    @Override // defpackage.pe0
    public final void X(ne0 r1, Runnable r2) {
        rm0.q.p.f(r2, true, true);
    }

    @Override // defpackage.pe0
    public final pe0 Z(int r2) {
        e35.o(r2);
        if (r2 < ir4.d) goto L6;
        return this;
    L6:
        return super.Z(r2);
    }

    @Override // defpackage.pe0
    public final String toString() {
        return "Dispatchers.IO";
    }
}
