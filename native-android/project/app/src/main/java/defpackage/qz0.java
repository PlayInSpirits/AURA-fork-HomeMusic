package defpackage;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qz0 {
    public int a;
    public final Object b;
    public final Object c;

    public qz0(mw3 r2) {
        this.a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = r2;
    }

    public static qz0 b(mw3 r1, int r2) {
        if (r2 == 0) goto L10;
        int r0 = 1;
        if (r2 == 1) goto L6;
        kf2.n("invalid orientation");
        return null;
    L6:
        return new ib3(r1, r0);
    L10:
        return new ib3(r1, 0);
    }

    public abstract void a(x34 r1);

    public abstract void c(x34 r1);

    public abstract int d(View r1);

    public abstract int e(View r1);

    public abstract int f(View r1);

    public abstract int g(View r1);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o(View r1);

    public abstract int p(View r1);

    public abstract void q(int r1);

    public abstract void r(x34 r1);

    public abstract void s(x34 r1);

    public abstract void t(x34 r1);

    public abstract void u(x34 r1);

    public abstract u24 v(x34 r1);

    public qz0(int r1, String r2, String r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    public qz0(sz0 r2) {
        this.a = 0;
        this.c = new wk0();
        this.b = r2;
    }
}
