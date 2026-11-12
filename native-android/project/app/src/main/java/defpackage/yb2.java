package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yb2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ bc2 o;

    public /* synthetic */ yb2(bc2 bc2Var, int i) {
        this.n = i;
        this.o = bc2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        bc2 bc2Var = this.o;
        switch (i) {
            case 0:
                cx0 cx0Var = bc2Var.p;
                if (cx0Var != null) {
                    cx0Var.setListSelectionHidden(true);
                    cx0Var.requestLayout();
                }
                break;
            default:
                cx0 cx0Var2 = bc2Var.p;
                if (cx0Var2 != null && cx0Var2.isAttachedToWindow() && bc2Var.p.getCount() > bc2Var.p.getChildCount() && bc2Var.p.getChildCount() <= bc2Var.z) {
                    bc2Var.M.setInputMethodMode(2);
                    bc2Var.f();
                    break;
                }
                break;
        }
    }
}
