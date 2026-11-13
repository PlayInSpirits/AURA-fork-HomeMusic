package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class n15 extends pe0 {
    public n15() {
        super();
    }

    public static final n15 p = new n15();

    @Override // defpackage.pe0
    public final void W(ne0 ne0Var, Runnable runnable) {
        rm0.q.p.f(runnable, true, false);
    }

    @Override // defpackage.pe0
    public final void X(ne0 ne0Var, Runnable runnable) {
        rm0.q.p.f(runnable, true, true);
    }

    @Override // defpackage.pe0
    public final pe0 Z(int i) {
        e35.o(i);
        return i >= ir4.d ? this : super.Z(i);
    }

    @Override // defpackage.pe0
    public final String toString() {
        return "Dispatchers.IO";
    }
}
