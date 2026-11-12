package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
@s43("navigation")
public class u23 extends t43 {
    public final u43 c;

    public u23(u43 u43Var) {
        this.c = u43Var;
    }

    @Override // defpackage.t43
    public final r23 a() {
        return new t23(this);
    }

    @Override // defpackage.t43
    public final void d(List list, y23 y23Var) {
        String strValueOf;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a23 a23Var = (a23) it.next();
            r23 r23Var = a23Var.o;
            r23Var.getClass();
            t23 t23Var = (t23) r23Var;
            Bundle bundleC = a23Var.c();
            int i = t23Var.y;
            if (i == 0) {
                StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
                int i2 = t23Var.u;
                if (i2 != 0) {
                    strValueOf = t23Var.p;
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(i2);
                    }
                } else {
                    strValueOf = "the root navigation";
                }
                sb.append(strValueOf);
                throw new IllegalStateException(sb.toString().toString());
            }
            r23 r23Var2 = (r23) t23Var.x.b(i);
            if (r23Var2 == null) {
                if (t23Var.z == null) {
                    t23Var.z = String.valueOf(t23Var.y);
                }
                String str = t23Var.z;
                str.getClass();
                kf2.n(xa3.h("navigation destination ", str, " is not a direct child of this NavGraph"));
                return;
            }
            t43 t43VarB = this.c.b(r23Var2.n);
            d23 d23VarB = b();
            Bundle bundleA = r23Var2.a(bundleC);
            v23 v23Var = d23VarB.h;
            t43VarB.d(gb.O(tv1.v(v23Var.a, r23Var2, bundleA, v23Var.j(), v23Var.o)), y23Var);
        }
    }
}
