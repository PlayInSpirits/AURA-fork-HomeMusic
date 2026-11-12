package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class sb5 extends su3 {
    public final WindowInsetsController g;
    public final om1 h;
    public final Window i;

    public sb5(Window r2, om1 r3) {
        this(hb5.f(r2), r3);
        this.i = r2;
    }

    @Override // defpackage.su3
    public void C(boolean r3) {
        Window r1 = this.i;
        if (r1 == null) goto L9;
        if (r3 == false) goto L7;
        View r2 = r1.getDecorView();
        r2.setSystemUiVisibility(r2.getSystemUiVisibility() | 16);
        return;
    L7:
        J(16);
        return;
    L9:
        WindowInsetsController r4 = this.g;
        if (r3 == false) goto L13;
        hb5.j(r4, 16, 16);
        return;
    L13:
        hb5.m(r4, 16);
    }

    @Override // defpackage.su3
    public void D(boolean r3) {
        Window r0 = this.i;
        if (r0 != null) goto L5;
        WindowInsetsController r2 = this.g;
        if (r3 == false) goto L14;
        hb5.j(r2, 8, 8);
        return;
    L14:
        hb5.m(r2, 8);
        return;
    L5:
        if (r3 == false) goto L8;
        View r4 = r0.getDecorView();
        r4.setSystemUiVisibility(r4.getSystemUiVisibility() | 8192);
        return;
    L8:
        J(8192);
    }

    @Override // defpackage.su3
    public void E(int r5) {
        Window r0 = this.i;
        if (r0 == null) goto L17;
        r0.getDecorView().setTag(356039078, Integer.valueOf(r5));
        if (r5 != 0) goto L7;
        J(6144);
        return;
    L7:
        if (r5 != 1) goto L9;
        J(4096);
        View r4 = r0.getDecorView();
        r4.setSystemUiVisibility(r4.getSystemUiVisibility() | 2048);
        return;
    L9:
        if (r5 == 2) goto L11;
        return;
    L11:
        J(2048);
        View r6 = r0.getDecorView();
        r6.setSystemUiVisibility(r6.getSystemUiVisibility() | 4096);
        return;
    L17:
        hb5.i(this.g, r5);
    }

    @Override // defpackage.su3
    public final void F(int r2) {
        if ((r2 & 8) == 0) goto L5;
        ((sg3) this.h.o).b();
    L5:
        hb5.o(this.g, r2 & (-9));
    }

    public final void J(int r2) {
        View r1 = this.i.getDecorView();
        int r0 = r1.getSystemUiVisibility();
        r1.setSystemUiVisibility((~r2) & r0);
    }

    @Override // defpackage.su3
    public final void x(int r2) {
        if ((r2 & 8) == 0) goto L5;
        ((sg3) this.h.o).a();
    L5:
        hb5.q(this.g, r2 & (-9));
    }

    @Override // defpackage.su3
    public boolean y() {
        Window r0 = this.i;
        if (r0 != null) goto L5;
        hb5.h(this.g);
        if ((hb5.b(this.g) & 8) == 0) goto L14;
        return true;
    L14:
        return false;
    L5:
        if ((r0.getDecorView().getSystemUiVisibility() & 8192) != 0) goto L13;
        return false;
    L13:
        return true;
    }

    public sb5(WindowInsetsController r1, om1 r2) {
        this.g = r1;
        this.h = r2;
    }
}
