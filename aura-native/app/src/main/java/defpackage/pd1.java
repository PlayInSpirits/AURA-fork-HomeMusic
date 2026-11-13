package defpackage;

import android.util.Log;
import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class pd1 implements w92 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ pd1(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    @Override // defpackage.w92
    public final void b(ba2 ba2Var, q92 q92Var) {
        int i = this.n;
        int i2 = 0;
        Object obj = this.o;
        switch (i) {
            case 0:
                rd1 rd1Var = (rd1) obj;
                if (q92Var == q92.ON_DESTROY) {
                    kc1 kc1Var = (kc1) ba2Var;
                    Object obj2 = null;
                    for (Object obj3 : (Iterable) rd1Var.b().f.n.getValue()) {
                        if (h12.c(((a23) obj3).s, kc1Var.L)) {
                            obj2 = obj3;
                        }
                    }
                    a23 a23Var = (a23) obj2;
                    if (a23Var != null) {
                        if (rd1.n()) {
                            Log.v("FragmentNavigator", "Marking transition complete for entry " + a23Var + " due to fragment " + ba2Var + " lifecycle reaching DESTROYED");
                        }
                        rd1Var.b().b(a23Var);
                        break;
                    }
                }
                break;
            case 1:
                v23 v23Var = (v23) obj;
                v23Var.q = q92Var.a();
                if (v23Var.c != null) {
                    ArrayList R0 = q40.R0(v23Var.g);
                    int size = R0.size();
                    while (i2 < size) {
                        Object obj4 = R0.get(i2);
                        i2++;
                        a23 a23Var2 = (a23) obj4;
                        a23Var2.getClass();
                        a23Var2.q = q92Var.a();
                        a23Var2.e();
                    }
                    break;
                }
                break;
            case 2:
                xm2 xm2Var = (xm2) obj;
                if (q92Var == q92.ON_START) {
                    xm2Var.c = true;
                    break;
                } else if (q92Var == q92.ON_STOP) {
                    xm2Var.c = false;
                    break;
                }
                break;
            default:
                b0 b0Var = (b0) obj;
                if (q92Var == q92.ON_DESTROY) {
                    b0Var.d();
                    break;
                }
                break;
        }
    }
}
