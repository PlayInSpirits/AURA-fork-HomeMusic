package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class bz implements xf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ bz(n13 n13Var, m13 m13Var) {
        this.n = 1;
        this.o = n13Var;
    }

    @Override // defpackage.xf1
    public final Object a(Object obj, Object obj2, Object obj3) {
        int i = this.n;
        j15 j15Var = j15.a;
        Object obj4 = this.o;
        switch (i) {
            case 0:
                ((x) obj4).invoke((Throwable) obj);
                break;
            case 1:
                n13 n13Var = (n13) obj4;
                n13.w.set(n13Var, null);
                n13Var.f(null);
                break;
            default:
                ((u94) obj4).c();
                break;
        }
        return j15Var;
    }

    public /* synthetic */ bz(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }
}
