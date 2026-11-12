package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bm0 implements go4 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ bm0(int i, Object obj, Object obj2) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
    }

    @Override // defpackage.go4
    public final Object get() {
        int i = this.n;
        Object obj = this.p;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                return new jr3((bi0) obj, (n51) ((au) obj2).b);
            default:
                pe4 pe4Var = (pe4) obj;
                oe4 oe4VarA = pe4Var.a();
                oe4VarA.d = 1;
                oe4VarA.J = ne4.k;
                oe4VarA.H = new xm(qe4.h1(pe4Var.D.get(), pe4Var, ((qe4) obj2).b));
                oe4VarA.I = pe4Var.E;
                return new pe4(oe4VarA);
        }
    }
}
