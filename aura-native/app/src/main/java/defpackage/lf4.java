package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class lf4 implements Runnable {
    public final /* synthetic */ boolean n;
    public final /* synthetic */ oy1 o;

    public lf4(oy1 oy1Var, boolean z) {
        this.o = oy1Var;
        this.n = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e35.m();
        ll llVar = (ll) this.o.b;
        boolean z = llVar.o;
        boolean z2 = this.n;
        llVar.o = z2;
        if (z != z2) {
            ((kf4) llVar.p).a(z2);
        }
    }
}
