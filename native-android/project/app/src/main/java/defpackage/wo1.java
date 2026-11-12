package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wo1 implements rl0 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ wo1(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    @Override // defpackage.rl0
    public final void onDestroy(ba2 ba2Var) {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                ((rm3) obj).o = null;
                break;
            default:
                ((f9) obj).dismiss();
                break;
        }
    }
}
