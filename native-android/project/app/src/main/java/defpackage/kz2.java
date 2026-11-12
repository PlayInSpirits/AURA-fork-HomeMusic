package defpackage;

import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kz2 extends rp {
    public final w03 b;
    public final ArrayList c;
    public final w03 d;
    public final ss2 e;

    public kz2() {
        super(4);
        this.b = te5.i();
        this.c = new ArrayList();
        this.d = new w03();
        z zVar = new z(8, this);
        jh4.e(jh4.a);
        synchronized (jh4.c) {
            jh4.h = q40.F0(zVar, jh4.h);
        }
        this.e = new ss2(18, zVar);
    }

    @Override // defpackage.rp
    public final void e(y94 y94Var) {
        this.c.add(new iz2(y94Var));
    }

    @Override // defpackage.rp
    public final void f() {
        synchronized (this.a) {
            try {
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    jz2 jz2Var = (jz2) arrayList.get(i);
                    if (jz2Var instanceof hz2) {
                        te5.b(this.b, ((hz2) jz2Var).a, ((hz2) jz2Var).b);
                    } else {
                        if (!(jz2Var instanceof iz2)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        te5.J(this.b, ((iz2) jz2Var).a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c.clear();
    }

    @Override // defpackage.rp
    public final void h() {
        this.e.d();
        this.c.clear();
        this.d.a();
        synchronized (this.a) {
            this.b.a();
        }
    }

    @Override // defpackage.rp
    public final if1 m(y94 y94Var) {
        w03 w03Var = this.d;
        if1 oVar = (if1) w03Var.g(y94Var);
        if (oVar == null) {
            oVar = new o(19, this, y94Var);
            int iF = w03Var.f(y94Var);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = w03Var.c;
            Object obj = objArr[iF];
            w03Var.b[iF] = y94Var;
            objArr[iF] = oVar;
        }
        return oVar;
    }

    @Override // defpackage.rp
    public final void n(y00 y00Var) {
        this.d.j(y00Var);
        e(y00Var);
        f();
    }
}
