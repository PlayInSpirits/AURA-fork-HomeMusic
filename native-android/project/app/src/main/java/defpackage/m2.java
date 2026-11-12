package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m2 {
    public n2[] n;
    public int o;
    public int p;
    public on4 q;

    public final n2 d() {
        n2 n2VarE;
        on4 on4Var;
        synchronized (this) {
            try {
                n2[] n2VarArrF = this.n;
                if (n2VarArrF == null) {
                    n2VarArrF = f();
                    this.n = n2VarArrF;
                } else if (this.o >= n2VarArrF.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(n2VarArrF, n2VarArrF.length * 2);
                    this.n = (n2[]) objArrCopyOf;
                    n2VarArrF = (n2[]) objArrCopyOf;
                }
                int i = this.p;
                do {
                    n2VarE = n2VarArrF[i];
                    if (n2VarE == null) {
                        n2VarE = e();
                        n2VarArrF[i] = n2VarE;
                    }
                    i++;
                    if (i >= n2VarArrF.length) {
                        i = 0;
                    }
                } while (!n2VarE.a(this));
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
        return n2VarE;
    }

    public abstract n2 e();

    public abstract n2[] f();

    public final void g(n2 n2Var) {
        on4 on4Var;
        int i;
        vd0[] vd0VarArrB;
        synchronized (this) {
            try {
                int i2 = this.o - 1;
                this.o = i2;
                on4Var = this.q;
                if (i2 == 0) {
                    this.p = 0;
                }
                n2Var.getClass();
                vd0VarArrB = n2Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (vd0 vd0Var : vd0VarArrB) {
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
