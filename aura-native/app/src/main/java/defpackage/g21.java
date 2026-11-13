package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class g21 extends pe0 {
    public static final /* synthetic */ int s = 0;
    public long p;
    public boolean q;
    public ii r;

    public final void a0(boolean z) {
        long j = this.p - (z ? 4294967296L : 1L);
        this.p = j;
        if (j <= 0 && this.q) {
            shutdown();
        }
    }

    public final void b0(or0 or0Var) {
        ii iiVar = this.r;
        if (iiVar == null) {
            iiVar = new ii();
            this.r = iiVar;
        }
        iiVar.addLast(or0Var);
    }

    public final void c0(boolean z) {
        this.p = (z ? 4294967296L : 1L) + this.p;
        if (z) {
            return;
        }
        this.q = true;
    }

    public abstract long d0();

    public final boolean e0() {
        ii iiVar = this.r;
        if (iiVar == null) {
            return false;
        }
        or0 or0Var = (or0) (iiVar.isEmpty() ? null : iiVar.removeFirst());
        if (or0Var == null) {
            return false;
        }
        or0Var.run();
        return true;
    }

    public abstract void shutdown();
}
