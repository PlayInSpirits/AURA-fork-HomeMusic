package defpackage;

import android.graphics.Rect;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class bb5 {
    public final pb5 a;
    public vz1[] b;
    public final Rect[][] c;
    public final Rect[][] d;

    public bb5(pb5 pb5Var) {
        this.c = new Rect[10][];
        this.d = new Rect[10][];
        this.a = pb5Var;
        c(pb5Var);
    }

    public final void a() {
        vz1[] vz1VarArr = this.b;
        if (vz1VarArr != null) {
            vz1 vz1Var = vz1VarArr[0];
            vz1 vz1Var2 = vz1VarArr[1];
            pb5 pb5Var = this.a;
            if (vz1Var2 == null) {
                vz1Var2 = pb5Var.a.h(2);
            }
            if (vz1Var == null) {
                vz1Var = pb5Var.a.h(1);
            }
            h(vz1.a(vz1Var, vz1Var2));
            vz1 vz1Var3 = this.b[ud3.N(16)];
            if (vz1Var3 != null) {
                g(vz1Var3);
            }
            vz1 vz1Var4 = this.b[ud3.N(32)];
            if (vz1Var4 != null) {
                e(vz1Var4);
            }
            vz1 vz1Var5 = this.b[ud3.N(64)];
            if (vz1Var5 != null) {
                i(vz1Var5);
            }
        }
    }

    public abstract pb5 b();

    public void c(pb5 pb5Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> e = pb5Var.a.e(i);
            int N = ud3.N(i);
            this.c[N] = (Rect[]) e.toArray(new Rect[e.size()]);
            if (i != 8) {
                List<Rect> f = pb5Var.a.f(i);
                this.d[N] = (Rect[]) f.toArray(new Rect[f.size()]);
            }
        }
    }

    public void d(int i, vz1 vz1Var) {
        if (this.b == null) {
            this.b = new vz1[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[ud3.N(i2)] = vz1Var;
            }
        }
    }

    public abstract void f(vz1 vz1Var);

    public abstract void h(vz1 vz1Var);

    public bb5() {
        this(new pb5());
    }

    public void e(vz1 vz1Var) {
    }

    public void g(vz1 vz1Var) {
    }

    public void i(vz1 vz1Var) {
    }
}
