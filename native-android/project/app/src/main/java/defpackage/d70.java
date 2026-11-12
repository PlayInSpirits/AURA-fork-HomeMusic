package defpackage;

import android.util.Log;
import android.window.OnBackInvokedDispatcher;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d70 implements w92 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ d70(int i, Object obj, Object obj2) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
    }

    @Override // defpackage.w92
    public final void b(ba2 ba2Var, q92 q92Var) {
        int i = this.n;
        Object obj = this.p;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                a93 a93Var = (a93) obj2;
                l70 l70Var = (l70) obj;
                if (q92Var == q92.ON_CREATE) {
                    OnBackInvokedDispatcher onBackInvokedDispatcher = l70Var.getOnBackInvokedDispatcher();
                    onBackInvokedDispatcher.getClass();
                    a93Var.c(onBackInvokedDispatcher);
                }
                break;
            default:
                rd1 rd1Var = (rd1) obj2;
                a23 a23Var = (a23) obj;
                a23Var.getClass();
                if (q92Var == q92.ON_RESUME && ((List) rd1Var.b().e.n.getValue()).contains(a23Var)) {
                    if (rd1.n()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + a23Var + " due to fragment " + ba2Var + " view lifecycle reaching RESUMED");
                    }
                    rd1Var.b().b(a23Var);
                }
                if (q92Var == q92.ON_DESTROY) {
                    if (rd1.n()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + a23Var + " due to fragment " + ba2Var + " view lifecycle reaching DESTROYED");
                    }
                    rd1Var.b().b(a23Var);
                }
                break;
        }
    }
}
