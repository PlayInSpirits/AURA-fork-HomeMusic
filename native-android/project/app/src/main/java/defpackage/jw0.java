package defpackage;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jw0 extends hw {
    public final int j;
    public o65 k;
    public final g5 l;
    public final /* synthetic */ DrawerLayout m;

    public jw0(DrawerLayout r2, int r3) {
        this.m = r2;
        this.l = new g5(8, this);
        this.j = r3;
    }

    @Override // defpackage.hw
    public final void A(View r2, int r3, int r4) {
        int r5 = r2.getWidth();
        DrawerLayout r1 = this.m;
        if (r1.b(r2, 3) == false) goto L6;
        float r6 = r3 + r5;
    L5:
        float r7 = r6 / r5;
        r1.s(r2, r7);
        if (r7 != 0.0f) goto L10;
        int r8 = 4;
    L11:
        r2.setVisibility(r8);
        r1.invalidate();
        return;
    L10:
        r8 = 0;
        goto L11
    L6:
        r6 = r1.getWidth() - r3;
        goto L5
    }

    @Override // defpackage.hw
    public final void B(View r7, float r8, float r9) {
        int[] r10 = DrawerLayout.P;
        float r11 = ((hw0) r7.getLayoutParams()).b;
        int r0 = r7.getWidth();
        DrawerLayout r2 = this.m;
        if (r2.b(r7, 3) == true) goto L5;
        int r1 = r2.getWidth();
        if (r8 >= 0.0f) goto L15;
    L20:
        r1 = r1 - r0;
    L19:
        int r12 = r1;
    L21:
        this.k.q(r12, r7.getTop());
        r2.invalidate();
        return;
    L15:
        if (r8 != 0.0f) goto L19;
        if (r11 <= 0.5f) goto L19;
    L5:
        if (r8 > 0.0f) goto L11;
        if (r8 == 0.0f) goto L8;
    L10:
        r12 = -r0;
        goto L21
    L8:
        if (r11 <= 0.5f) goto L10;
    L11:
        r12 = 0;
        goto L21
    }

    @Override // defpackage.hw
    public final boolean Q(View r1, int r2) {
        if (DrawerLayout.n(r1) == false) goto L10;
        int r3 = this.j;
        DrawerLayout r0 = this.m;
        if (r0.b(r1, r3) == true) goto L7;
        return false;
    L7:
        if (r0.i(r1) != 0) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    @Override // defpackage.hw
    public final int d(View r2, int r3) {
        DrawerLayout r1 = this.m;
        if (r1.b(r2, 3) == true) goto L5;
        int r4 = r1.getWidth();
        return Math.max(r4 - r2.getWidth(), Math.min(r3, r4));
    L5:
        return Math.max(-r2.getWidth(), Math.min(r3, 0));
    }

    @Override // defpackage.hw
    public final int e(View r1, int r2) {
        return r1.getTop();
    }

    @Override // defpackage.hw
    public final int o(View r1) {
        if (DrawerLayout.n(r1) == true) goto L5;
        return 0;
    L5:
        return r1.getWidth();
    }

    @Override // defpackage.hw
    public final void v(int r3, int r4) {
        int r5 = r3 & 1;
        DrawerLayout r1 = this.m;
        if (r5 != 1) goto L5;
        View r6 = r1.f(3);
    L6:
        if (r6 != null) goto L8;
        return;
    L8:
        if (r1.i(r6) != 0) goto L12;
        this.k.b(r6, r4);
        return;
    L12:
        return;
    L5:
        r6 = r1.f(5);
        goto L6
    }

    @Override // defpackage.hw
    public final void w() {
        g5 r0 = this.l;
        this.m.postDelayed(r0, 160);
    }

    @Override // defpackage.hw
    public final void y(View r1, int r2) {
        ((hw0) r1.getLayoutParams()).c = false;
        int r3 = 3;
        if (this.j != 3) goto L5;
        r3 = 5;
    L5:
        DrawerLayout r0 = this.m;
        View r4 = r0.f(r3);
        if (r4 == null) goto L9;
        r0.c(r4, true);
        return;
    }

    @Override // defpackage.hw
    public final void z(int r2) {
        View r0 = this.k.t;
        this.m.v(r0, r2);
    }
}
