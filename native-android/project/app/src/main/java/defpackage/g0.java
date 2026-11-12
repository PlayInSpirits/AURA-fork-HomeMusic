package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends Throwable {
    public final /* synthetic */ int n;

    public /* synthetic */ g0(int r1, String r2) {
        this.n = r1;
        super(r2);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        int r0 = this.n;
        monitor-enter(this);
        switch(r0) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        monitor-exit(this);
        return this;
    L7:
        monitor-exit(this);
        return this;
    L9:
        monitor-exit(this);
        return this;
    }
}
