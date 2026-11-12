package defpackage;

import androidx.work.Worker;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gq1 extends q42 implements gf1 {
    public static final gq1 o = null;
    public static final gq1 p = null;
    public static final gq1 q = null;
    public final /* synthetic */ int n;

    static {
        int r1 = 0;
        o = new gq1(r1, 0);
        p = new gq1(r1, 1);
        q = new gq1(r1, 2);
    }

    public gq1(Worker r1) {
        this.n = 3;
        super(0);
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        switch(this.n) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
    L7:
        return h12.G(new String[0]);
    L9:
        throw new IllegalStateException("trailers not available");
    L11:
        throw new IllegalStateException("trailers not available");
    }

    public /* synthetic */ gq1(int r1, int r2) {
        this.n = r2;
        super(r1);
    }
}
