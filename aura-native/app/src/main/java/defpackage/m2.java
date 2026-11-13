package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class m2 {
    public n2[] n;
    public int o;
    public int p;
    public on4 q;

    public final n2 d() {
        n2 n2Var;
        on4 on4Var;
        synchronized (this) {
            try {
                n2[] n2VarArr = this.n;
                if (n2VarArr == null) {
                    n2VarArr = f();
                    this.n = n2VarArr;
                } else if (this.o >= n2VarArr.length) {
                    Object[] copyOf = Arrays.copyOf(n2VarArr, n2VarArr.length * 2);
                    this.n = (n2[]) copyOf;
                    n2VarArr = (n2[]) copyOf;
                }
                int i = this.p;
                do {
                    n2Var = n2VarArr[i];
                    if (n2Var == null) {
                        n2Var = e();
                        n2VarArr[i] = n2Var;
                    }
                    i++;
                    if (i >= n2VarArr.length) {
                        i = 0;
                    }
                } while (!n2Var.a(this));
                this.p = i;
                this.o++;
                on4Var = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (on4Var != null) {
            on4Var.w(1);
        }
        return n2Var;
    }

    public abstract n2 e();

    public abstract n2[] f();

    public final void g(n2 n2Var) {
        on4 on4Var;
        int i;
        vd0[] b;
        synchronized (this) {
            try {
                int i2 = this.o - 1;
                this.o = i2;
                on4Var = this.q;
                if (i2 == 0) {
                    this.p = 0;
                }
                n2Var.getClass();
                b = n2Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (vd0 vd0Var : b) {
            if (vd0Var != null) {
                vd0Var.resumeWith(j15.a);
            }
        }
        if (on4Var != null) {
            on4Var.w(-1);
        }
    }

    public final on4 h() {
        on4 on4Var;
        synchronized (this) {
            on4Var = this.q;
            if (on4Var == null) {
                int i = this.o;
                on4Var = new on4(1, Integer.MAX_VALUE, wv.o);
                on4Var.q(Integer.valueOf(i));
                this.q = on4Var;
            }
        }
        return on4Var;
    }
}
