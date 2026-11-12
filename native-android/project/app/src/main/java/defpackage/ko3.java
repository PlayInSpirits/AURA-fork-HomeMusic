package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ko3 extends jo3 {
    public final Object p;

    public ko3(int r1) {
        super(r1);
        this.p = new Object();
    }

    @Override // defpackage.jo3, defpackage.io3
    public final boolean a(Object r2) {
        r2.getClass();
        Object r0 = this.p;
        monitor-enter(r0);
        boolean r1 = super.a(r2);     // Catch: Throwable -> L7
        monitor-exit(r0);
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.jo3, defpackage.io3
    public final Object b() {
        Object r0 = this.p;
        monitor-enter(r0);
        Object r1 = super.b();     // Catch: Throwable -> L7
        monitor-exit(r0);
        return r1;
    L7:
        th = move-exception;
        throw th;
    }
}
