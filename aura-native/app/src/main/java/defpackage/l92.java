package defpackage;

import com.eddyizm.tempus.ui.fragment.LibraryFragment;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class l92 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ LibraryFragment o;

    public /* synthetic */ l92(LibraryFragment libraryFragment, int i) {
        this.n = i;
        this.o = libraryFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n92 n92Var;
        int i = this.n;
        LibraryFragment libraryFragment = this.o;
        switch (i) {
            case 0:
                if (libraryFragment.T != null && libraryFragment.l0 != null && (n92Var = libraryFragment.o0) != null) {
                    n92Var.f(libraryFragment.v());
                    break;
                }
                break;
            case 1:
                xc1 xc1Var = libraryFragment.l0;
                if (xc1Var != null) {
                    xc1Var.p.setVisibility(8);
                    break;
                }
                break;
            default:
                xc1 xc1Var2 = libraryFragment.l0;
                if (xc1Var2 != null) {
                    xc1Var2.p.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
