package defpackage;

import android.view.ViewGroup;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class qf implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ bg o;

    public /* synthetic */ qf(bg bgVar, int i) {
        this.n = i;
        this.o = bgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.n;
        bg bgVar = this.o;
        switch (i) {
            case 0:
                if ((bgVar.m0 & 1) != 0) {
                    bgVar.A(0);
                }
                if ((bgVar.m0 & 4096) != 0) {
                    bgVar.A(108);
                }
                bgVar.l0 = false;
                bgVar.m0 = 0;
                break;
            default:
                bgVar.I.showAtLocation(bgVar.H, 55, 0, 0);
                s75 s75Var = bgVar.K;
                if (s75Var != null) {
                    s75Var.b();
                }
                if (!bgVar.M || (viewGroup = bgVar.N) == null || !viewGroup.isLaidOut()) {
                    bgVar.H.setAlpha(1.0f);
                    bgVar.H.setVisibility(0);
                    break;
                } else {
                    bgVar.H.setAlpha(0.0f);
                    s75 a = j65.a(bgVar.H);
                    a.a(1.0f);
                    bgVar.K = a;
                    a.d(new sf(0, this));
                    break;
                }
        }
    }
}
