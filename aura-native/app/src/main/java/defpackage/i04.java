package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class i04 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ j04 o;

    public /* synthetic */ i04(j04 j04Var, int i) {
        this.n = i;
        this.o = j04Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        j04 j04Var = this.o;
        switch (i) {
            case 0:
                hq1 hq1Var = j04Var.c;
                if (((j04) hq1Var.g) != null) {
                    hq1Var.j();
                    break;
                }
                break;
            default:
                hq1 hq1Var2 = j04Var.c;
                if (((j04) hq1Var2.g) != null && (hq1Var2.a & 3) != 0) {
                    hq1Var2.j();
                    break;
                }
                break;
        }
    }
}
