package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wo1 implements rl0 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ wo1(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.rl0
    public final void onDestroy(ba2 r1) {
        int r2 = this.n;
        Object r0 = this.o;
        switch(r2) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((f9) r0).dismiss();
        return;
    L6:
        ((rm3) r0).o = null;
    }
}
