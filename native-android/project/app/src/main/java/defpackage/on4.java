package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class on4 extends cd4 implements ll4 {
    @Override // defpackage.ll4
    public final Object getValue() {
        monitor-enter(this);
        Object[] r0 = this.u;     // Catch: Throwable -> L6
        r0.getClass();     // Catch: Throwable -> L6
        Integer r1 = Integer.valueOf(((Number) r0[((int) ((this.v + ((long) ((int) ((o() + ((long) this.x)) - this.v)))) - 1)) & (r0.length - 1)]).intValue());     // Catch: Throwable -> L6
        monitor-exit(this);
        return r1;
    L6:
        th = move-exception;
        throw th;
    }

    public final void w(int r8) {
        monitor-enter(this);
        Object[] r0 = this.u;     // Catch: Throwable -> L6
        r0.getClass();     // Catch: Throwable -> L6
        q(Integer.valueOf(((Number) r0[((int) ((this.v + ((long) ((int) ((o() + ((long) this.x)) - this.v)))) - 1)) & (r0.length - 1)]).intValue() + r8));     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }
}
