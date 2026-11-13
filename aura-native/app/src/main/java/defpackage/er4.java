package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class er4 extends br4 {
    public final Runnable p;

    public er4(Runnable runnable, long j, boolean z) {
        super(z, j);
        this.p = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.p.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.p;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(si0.x(runnable));
        sb.append(", ");
        sb.append(this.n);
        sb.append(", ");
        sb.append(this.o ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
