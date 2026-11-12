package defpackage;

import com.eddyizm.tempus.ui.fragment.LibraryFragment;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l92 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ LibraryFragment o;

    public /* synthetic */ l92(LibraryFragment r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        LibraryFragment r2 = this.o;
        switch(r0) {
            case 0: goto L14;
            case 1: goto L9;
            default: goto L4;
        };
    L4:
        xc1 r3 = r2.l0;
        if (r3 == null) goto L21;
        r3.p.setVisibility(8);
        return;
    L21:
        return;
    L9:
        xc1 r4 = r2.l0;
        if (r4 == null) goto L22;
        r4.p.setVisibility(8);
        return;
    L22:
        return;
    L14:
        if (r2.T != null) goto L16;
        return;
    L16:
        if (r2.l0 == null) goto L24;
        n92 r1 = r2.o0;
        if (r1 == null) goto L25;
        r1.f(r2.v());
        return;
    L25:
        return;
    }
}
