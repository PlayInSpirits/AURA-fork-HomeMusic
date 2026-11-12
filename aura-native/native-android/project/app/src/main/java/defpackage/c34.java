package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c34 extends z62 {
    public static final c34 b = new c34(0);
    public final /* synthetic */ int a;

    public /* synthetic */ c34(int i) {
        this.a = i;
    }

    @Override // defpackage.ui2
    public final vi2 a(cf2 cf2Var, List list, long j) {
        switch (this.a) {
            case 0:
                int size = list.size();
                v01 v01Var = v01.n;
                if (size == 0) {
                    return cf2Var.v(nc0.j(j), nc0.i(j), v01Var, new or1(24));
                }
                if (size == 1) {
                    jg3 jg3VarR = ((pi2) list.get(0)).r(j);
                    return cf2Var.v(qc0.f(jg3VarR.n, j), qc0.e(jg3VarR.o, j), v01Var, new la(jg3VarR, 4));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i = 0; i < size2; i++) {
                    jg3 jg3VarR2 = ((pi2) list.get(i)).r(j);
                    iMax = Math.max(jg3VarR2.n, iMax);
                    iMax2 = Math.max(jg3VarR2.o, iMax2);
                    arrayList.add(jg3VarR2);
                }
                return cf2Var.v(qc0.f(iMax, j), qc0.e(iMax2, j), v01Var, new oc3(1, arrayList));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
