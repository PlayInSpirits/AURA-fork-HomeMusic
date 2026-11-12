package defpackage;

import com.eddyizm.tempus.model.Favorite;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o61 implements Runnable {
    public final /* synthetic */ int n;
    public final i61 o;
    public final Favorite p;

    public /* synthetic */ o61(i61 i61Var, Favorite favorite, int i) {
        this.n = i;
        this.o = i61Var;
        this.p = favorite;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        final Favorite favorite = this.p;
        final i61 i61Var = this.o;
        final int i2 = 1;
        final int i3 = 0;
        switch (i) {
            case 0:
                xl.E((s24) i61Var.o, false, true, new if1() { // from class: g61
                    @Override // defpackage.if1
                    public final Object invoke(Object obj) {
                        int i4 = i2;
                        Favorite favorite2 = favorite;
                        i61 i61Var2 = i61Var;
                        x34 x34Var = (x34) obj;
                        switch (i4) {
                            case 0:
                                ((q20) i61Var2.p).I(x34Var, favorite2);
                                break;
                            default:
                                ((h61) i61Var2.q).y(x34Var, favorite2);
                                break;
                        }
                        return null;
                    }
                });
                break;
            default:
                xl.E((s24) i61Var.o, false, true, new if1() { // from class: g61
                    @Override // defpackage.if1
                    public final Object invoke(Object obj) {
                        int i4 = i3;
                        Favorite favorite2 = favorite;
                        i61 i61Var2 = i61Var;
                        x34 x34Var = (x34) obj;
                        switch (i4) {
                            case 0:
                                ((q20) i61Var2.p).I(x34Var, favorite2);
                                break;
                            default:
                                ((h61) i61Var2.q).y(x34Var, favorite2);
                                break;
                        }
                        return null;
                    }
                });
                break;
        }
    }
}
