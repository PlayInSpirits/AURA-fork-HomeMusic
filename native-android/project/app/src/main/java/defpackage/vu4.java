package defpackage;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vu4 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Toolbar o;

    public /* synthetic */ vu4(Toolbar toolbar, int i) {
        this.n = i;
        this.o = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        Toolbar toolbar = this.o;
        switch (i) {
            case 0:
                yu4 yu4Var = toolbar.c0;
                tu2 tu2Var = yu4Var == null ? null : yu4Var.o;
                if (tu2Var != null) {
                    tu2Var.collapseActionView();
                }
                break;
            default:
                toolbar.n();
                break;
        }
    }
}
