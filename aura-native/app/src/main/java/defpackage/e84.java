package defpackage;

import com.eddyizm.tempus.model.RecentSearch;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class e84 implements Runnable {
    public final /* synthetic */ int n;
    public final jv3 o;
    public final RecentSearch p;

    public /* synthetic */ e84(jv3 jv3Var, RecentSearch recentSearch, int i) {
        this.n = i;
        this.o = jv3Var;
        this.p = recentSearch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        final RecentSearch recentSearch = this.p;
        final jv3 jv3Var = this.o;
        final int i2 = 1;
        final int i3 = 0;
        switch (i) {
            case 0:
                xl.E((s24) jv3Var.n, false, true, new if1() { // from class: iv3
                    @Override // defpackage.if1
                    public final Object invoke(Object obj) {
                        int i4 = i2;
                        RecentSearch recentSearch2 = recentSearch;
                        jv3 jv3Var2 = jv3Var;
                        x34 x34Var = (x34) obj;
                        switch (i4) {
                            case 0:
                                ((q20) jv3Var2.o).I(x34Var, recentSearch2);
                                break;
                            default:
                                ((h61) jv3Var2.p).y(x34Var, recentSearch2);
                                break;
                        }
                        return null;
                    }
                });
                break;
            default:
                xl.E((s24) jv3Var.n, false, true, new if1() { // from class: iv3
                    @Override // defpackage.if1
                    public final Object invoke(Object obj) {
                        int i4 = i3;
                        RecentSearch recentSearch2 = recentSearch;
                        jv3 jv3Var2 = jv3Var;
                        x34 x34Var = (x34) obj;
                        switch (i4) {
                            case 0:
                                ((q20) jv3Var2.o).I(x34Var, recentSearch2);
                                break;
                            default:
                                ((h61) jv3Var2.p).y(x34Var, recentSearch2);
                                break;
                        }
                        return null;
                    }
                });
                break;
        }
    }
}
