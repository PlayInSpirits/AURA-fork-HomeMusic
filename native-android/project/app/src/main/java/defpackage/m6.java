package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m6 extends ya4 {
    @Override // defpackage.ya4
    public final int l(g60 r1) {
        monitor-enter(r1);
        int r0 = r1.v - 1;     // Catch: Throwable -> L6
        r1.v = r0;     // Catch: Throwable -> L6
        monitor-exit(r1);     // Catch: Throwable -> L6
        return r0;
    L6:
        th = move-exception;
        throw th;
    }
}
