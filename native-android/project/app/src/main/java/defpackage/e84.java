package defpackage;

import com.eddyizm.tempus.model.RecentSearch;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e84 implements Runnable {
    public final /* synthetic */ int n;
    public final jv3 o;
    public final RecentSearch p;

    public /* synthetic */ e84(jv3 r1, RecentSearch r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        final RecentSearch r1 = this.p;
        final jv3 r5 = this.o;
        final int r2 = 1;
        final int r3 = 0;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        xl.E((s24) r5.n, false, true, new iv3(r5, r1, r3));
        return;
    L6:
        xl.E((s24) r5.n, false, true, new iv3(r5, r1, r2));
    }
}
