package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g75 extends de0 {
    public h75 n;
    public int o;

    public g75() {
        this.o = 0;
    }

    @Override // defpackage.de0
    public boolean l(CoordinatorLayout r1, View r2, int r3) {
        x(r1, r2, r3);
        if (this.n != null) goto L5;
        this.n = new h75(r2);
    L5:
        h75 r4 = this.n;
        View r5 = r4.a;
        r4.b = r5.getTop();
        r4.c = r5.getLeft();
        this.n.a();
        int r6 = this.o;
        if (r6 == 0) goto L10;
        this.n.b(r6);
        this.o = 0;
        return true;
    L10:
        return true;
    }

    public final int w() {
        h75 r0 = this.n;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.d;
    }

    public void x(CoordinatorLayout r1, View r2, int r3) {
        r1.r(r2, r3);
    }

    public g75(int r1) {
        this.o = 0;
    }
}
