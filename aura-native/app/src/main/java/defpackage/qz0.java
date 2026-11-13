package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class qz0 {
    public int a;
    public final Object b;
    public final Object c;

    public qz0(mw3 mw3Var) {
        this.a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = mw3Var;
    }

    public static qz0 b(mw3 mw3Var, int i) {
        if (i == 0) {
            return new ib3(mw3Var, 0);
        }
        int i2 = 1;
        if (i == 1) {
            return new ib3(mw3Var, i2);
        }
        kf2.n("invalid orientation");
        return null;
    }

    public abstract void a(x34 x34Var);

    public abstract void c(x34 x34Var);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o(View view);

    public abstract int p(View view);

    public abstract void q(int i);

    public abstract void r(x34 x34Var);

    public abstract void s(x34 x34Var);

    public abstract void t(x34 x34Var);

    public abstract void u(x34 x34Var);

    public abstract u24 v(x34 x34Var);

    public qz0(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public qz0(sz0 sz0Var) {
        this.a = 0;
        this.c = new wk0();
        this.b = sz0Var;
    }
}
