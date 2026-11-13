package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class em3 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ im3 o;
    public final /* synthetic */ String p;

    public /* synthetic */ em3(im3 im3Var, String str, int i) {
        this.n = i;
        this.o = im3Var;
        this.p = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        String str = this.p;
        im3 im3Var = this.o;
        switch (i) {
            case 0:
                im3Var.g(str);
                break;
            case 1:
                im3Var.g(str);
                break;
            default:
                im3Var.g(str);
                break;
        }
    }
}
