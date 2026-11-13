package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class k0 implements Runnable {
    public final u0 n;
    public final ic2 o;

    public k0(u0 u0Var, ic2 ic2Var) {
        this.n = u0Var;
        this.o = ic2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.n.n != this) {
            return;
        }
        if (u0.s.h(this.n, this, u0.h(this.o))) {
            u0.d(this.n, false);
        }
    }
}
