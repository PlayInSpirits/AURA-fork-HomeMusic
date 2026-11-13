package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class z00 implements jg1 {
    public final ne0 n;
    public final int o;
    public final wv p;

    public z00(ne0 ne0Var, int i, wv wvVar) {
        this.n = ne0Var;
        this.o = i;
        this.p = wvVar;
    }

    @Override // defpackage.p81
    public Object a(q81 q81Var, vd0 vd0Var) {
        Object j = te5.j(new r(q81Var, this, null, 2), vd0Var);
        return j == xe0.n ? j : j15.a;
    }

    public abstract Object b(rq3 rq3Var, vd0 vd0Var);

    @Override // defpackage.jg1
    public final p81 c(ne0 ne0Var, int i, wv wvVar) {
        ne0 ne0Var2 = this.n;
        ne0 J = ne0Var.J(ne0Var2);
        wv wvVar2 = wv.n;
        wv wvVar3 = this.p;
        int i2 = this.o;
        if (wvVar == wvVar2) {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i2;
            }
            wvVar = wvVar3;
        }
        return (h12.c(J, ne0Var2) && i == i2 && wvVar == wvVar3) ? this : d(J, i, wvVar);
    }

    public abstract z00 d(ne0 ne0Var, int i, wv wvVar);

    public p81 e() {
        return null;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        q01 q01Var = q01.n;
        ne0 ne0Var = this.n;
        if (ne0Var != q01Var) {
            arrayList.add("context=" + ne0Var);
        }
        int i = this.o;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        wv wvVar = wv.n;
        wv wvVar2 = this.p;
        if (wvVar2 != wvVar) {
            arrayList.add("onBufferOverflow=" + wvVar2);
        }
        return getClass().getSimpleName() + '[' + q40.B0(arrayList, ", ", null, null, null, 62) + ']';
    }
}
