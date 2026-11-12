package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class er4 extends br4 {
    public final Runnable p;

    public er4(Runnable r1, long r2, boolean r4) {
        super(r4, r2);
        this.p = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.p.run();
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("Task[");
        Runnable r1 = this.p;
        r0.append(r1.getClass().getSimpleName());
        r0.append('@');
        r0.append(si0.x(r1));
        r0.append(", ");
        r0.append(this.n);
        r0.append(", ");
        if (this.o == false) goto L5;
        String r4 = "Blocking";
    L6:
        r0.append(r4);
        r0.append(']');
        return r0.toString();
    L5:
        r4 = "Non-blocking";
        goto L6
    }
}
