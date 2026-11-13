package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class jm3 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ mm3 o;
    public final /* synthetic */ String p;

    public /* synthetic */ jm3(mm3 mm3Var, String str, int i) {
        this.n = i;
        this.o = mm3Var;
        this.p = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        String str = this.p;
        mm3 mm3Var = this.o;
        switch (i) {
            case 0:
                xl.E((s24) mm3Var.a.o, false, true, new rs0(11, str));
                break;
            case 1:
                xl.E((s24) mm3Var.a.o, false, true, new rs0(12, str));
                break;
            default:
                xl.E((s24) mm3Var.b.a, false, true, new jl3(0, System.currentTimeMillis(), str));
                break;
        }
    }
}
