package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ia1 implements ha1 {
    public final pa a;
    public final zb b;
    public final wo0 c;
    public final ma1 d;
    public final rm2 e;

    public ia1(pa paVar, zb zbVar) {
        wo0 wo0Var = ja1.a;
        ma1 ma1Var = new ma1();
        la1 la1Var = ma1.a;
        fl1 fl1Var = qr0.a;
        la1Var.getClass();
        te5.a(ya4.F(la1Var, fl1Var).J(q01.n).J(new fo4(null)));
        rm2 rm2Var = new rm2(6);
        this.a = paVar;
        this.b = zbVar;
        this.c = wo0Var;
        this.d = ma1Var;
        this.e = rm2Var;
        new x(12, this);
    }

    public final n05 a(m05 m05Var) {
        Object objRemove;
        wo0 wo0Var = this.c;
        synchronized (((xi4) wo0Var.n)) {
            try {
                n05 n05Var = (n05) ((fg4) wo0Var.o).g(m05Var);
                if (n05Var != null) {
                    if (n05Var.o) {
                        return n05Var;
                    }
                    fg4 fg4Var = (fg4) wo0Var.o;
                    synchronized (((tv1) fg4Var.g)) {
                        si1 si1Var = (si1) fg4Var.f;
                        si1Var.getClass();
                        objRemove = ((LinkedHashMap) si1Var.o).remove(m05Var);
                        if (objRemove != null) {
                            fg4Var.c--;
                        }
                    }
                }
                try {
                    this.d.getClass();
                    rm2 rm2Var = this.e;
                    rm2Var.getClass();
                    vk0 vk0Var = m05Var.a;
                    n05 n05Var2 = (vk0Var == null || (vk0Var instanceof vk0)) ? new n05(((gh3) rm2Var.o).b(m05Var.b, m05Var.c)) : null;
                    if (n05Var2 == null) {
                        throw new IllegalStateException("Could not load font");
                    }
                    synchronized (((xi4) wo0Var.n)) {
                        if (((fg4) wo0Var.o).g(m05Var) == null && n05Var2.o) {
                            ((fg4) wo0Var.o).l(m05Var, n05Var2);
                        }
                    }
                    return n05Var2;
                } catch (Exception e) {
                    mj0.j("Could not load font", e);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final n05 b(vk0 vk0Var, gb1 gb1Var, int i, int i2) {
        zb zbVar = this.b;
        zbVar.getClass();
        int i3 = zbVar.n;
        gb1 gb1Var2 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? gb1Var : new gb1(gb.m(gb1Var.n + i3, 1, 1000));
        this.a.getClass();
        return a(new m05(vk0Var, gb1Var2, i, i2, null));
    }
}
