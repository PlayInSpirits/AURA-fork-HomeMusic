package defpackage;

import androidx.work.Worker;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gq1 extends q42 implements gf1 {
    public static final gq1 o;
    public static final gq1 p;
    public static final gq1 q;
    public final /* synthetic */ int n;

    static {
        int i = 0;
        o = new gq1(i, 0);
        p = new gq1(i, 1);
        q = new gq1(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq1(Worker worker) {
        super(0);
        this.n = 3;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        switch (this.n) {
            case 0:
                throw new IllegalStateException("trailers not available");
            case 1:
                throw new IllegalStateException("trailers not available");
            case 2:
                return h12.G(new String[0]);
            default:
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gq1(int i, int i2) {
        super(i);
        this.n = i2;
    }
}
