package defpackage;

import com.google.common.reflect.TypeToken;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a05 extends yb1 implements Serializable {
    public transient jx1 u;
    public final /* synthetic */ TypeToken v;

    public a05(TypeToken typeToken) {
        super(10);
        this.v = typeToken;
    }

    @Override // defpackage.yb1
    /* JADX INFO: renamed from: W */
    public final jx1 o() {
        jx1 jx1VarG = this.u;
        if (jx1VarG == null) {
            rv2 rv2Var = rv2.G;
            gy3 gy3VarO = yw1.o(this.v);
            HashMap map = new HashMap();
            int i = 0;
            vw1 vw1VarListIterator = gy3VarO.listIterator(0);
            while (vw1VarListIterator.hasNext()) {
                rv2Var.g(vw1VarListIterator.next(), map);
            }
            gy3 gy3VarQ = yw1.q(new wz4(map), map.keySet());
            l91 l91Var = new l91(gy3VarQ, gy3VarQ);
            Iterable iterable = (Iterable) l91Var.n.b(l91Var);
            iterable.getClass();
            Iterable g22Var = new g22(iterable, zz4.n, i);
            int i2 = jx1.p;
            if (g22Var instanceof Collection) {
                jx1VarG = jx1.k((Collection) g22Var);
            } else {
                Iterator it = g22Var.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    if (it.hasNext()) {
                        ix1 ix1Var = new ix1(4);
                        ix1Var.f(next);
                        while (it.hasNext()) {
                            ix1Var.f(it.next());
                        }
                        jx1VarG = ix1Var.g();
                    } else {
                        jx1VarG = new nf4(next);
                    }
                } else {
                    jx1VarG = ny3.w;
                }
            }
            this.u = jx1VarG;
        }
        return jx1VarG;
    }
}
