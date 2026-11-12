package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class qb5 extends su3 {
    public final Window g;
    public final om1 h;

    public qb5(Window r1, om1 r2) {
        this.g = r1;
        this.h = r2;
    }

    @Override // defpackage.su3
    public final void D(boolean r3) {
        if (r3 == false) goto L6;
        Window r1 = this.g;
        r1.clearFlags(67108864);
        r1.addFlags(Integer.MIN_VALUE);
        J(8192);
        return;
    L6:
        K(8192);
    }

    @Override // defpackage.su3
    public final void E(int r4) {
        this.g.getDecorView().setTag(356039078, Integer.valueOf(r4));
        if (r4 != 0) goto L5;
        K(6144);
        return;
    L5:
        if (r4 != 1) goto L7;
        K(4096);
        J(2048);
        return;
    L7:
        if (r4 == 2) goto L9;
        return;
    L9:
        K(2048);
        J(4096);
    }

    @Override // defpackage.su3
    public final void F(int r5) {
        int r1 = 1;
    L4:
        if (r1 > 512) goto L18;
        if ((r5 & r1) == 0) goto L17;
        if (r1 != 1) goto L10;
        K(4);
        this.g.clearFlags(1024);
        goto L17
    L10:
        if (r1 != 2) goto L12;
        K(2);
        goto L17
    L12:
        if (r1 != 8) goto L17;
        ((sg3) this.h.o).b();
    L17:
        r1 = r1 << 1;
        goto L4
    }

    public final void J(int r2) {
        View r1 = this.g.getDecorView();
        r1.setSystemUiVisibility(r2 | r1.getSystemUiVisibility());
    }

    public final void K(int r2) {
        View r1 = this.g.getDecorView();
        int r0 = r1.getSystemUiVisibility();
        r1.setSystemUiVisibility((~r2) & r0);
    }

    @Override // defpackage.su3
    public final void x(int r4) {
        int r1 = 1;
    L4:
        if (r1 > 512) goto L18;
        if ((r4 & r1) == 0) goto L17;
        if (r1 != 1) goto L10;
        J(4);
        goto L17
    L10:
        if (r1 != 2) goto L12;
        J(2);
        goto L17
    L12:
        if (r1 != 8) goto L17;
        ((sg3) this.h.o).a();
    L17:
        r1 = r1 << 1;
        goto L4
    }

    @Override // defpackage.su3
    public final boolean y() {
        if ((this.g.getDecorView().getSystemUiVisibility() & 8192) == 0) goto L6;
        return true;
    L6:
        return false;
    }
}
