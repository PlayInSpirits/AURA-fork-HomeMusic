package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t51 extends fx4 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ t51(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // defpackage.fx4, defpackage.bx4
    public void a(dx4 r1) {
        switch(this.a) {
            case 2: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        kx4 r0 = (kx4) this.b;
        if (r0.N == true) goto L9;
        r0.D();
        r0.N = true;
        return;
    }

    @Override // defpackage.bx4
    public final void c(dx4 r4) {
        switch(this.a) {
            case 0: goto L11;
            case 1: goto L9;
            default: goto L4;
        };
    L4:
        kx4 r0 = (kx4) this.b;
        int r1 = r0.M - 1;
        r0.M = r1;
        if (r1 != 0) goto L7;
        r0.N = false;
        r0.l();
    L7:
        r4.u(this);
        return;
    L9:
        ((dx4) this.b).w();
        r4.u(this);
        return;
    L11:
        View r2 = (View) this.b;
        f85 r3 = d85.a;
        r3.R(r2, 1.0f);
        r3.getClass();
        r4.u(this);
    }

    public /* synthetic */ t51() {
        this.a = 2;
    }
}
