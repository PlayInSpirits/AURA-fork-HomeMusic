package defpackage;

import android.os.Looper;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z15 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ sf1 p;

    public /* synthetic */ z15(Object obj, sf1 sf1Var, int i) {
        this.n = i;
        this.o = obj;
        this.p = sf1Var;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        int i = this.n;
        j15 j15Var = j15.a;
        sf1 sf1Var = this.p;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                b25 b25Var = (b25) obj2;
                ((Long) obj).getClass();
                float f = b25Var.e;
                b25Var.e = 0.0f;
                ((if1) sf1Var).invoke(Float.valueOf(f));
                break;
            default:
                wd5 wd5Var = (wd5) obj2;
                r70 r70Var = (r70) sf1Var;
                h80 h80Var = (h80) obj;
                if (!wd5Var.p) {
                    ba2 ba2VarD = h80Var.d();
                    View view = h80Var.a;
                    ea2 ea2VarH = ba2VarD.h();
                    wd5Var.r = r70Var;
                    if (wd5Var.q != null) {
                        if (ea2VarH.h.compareTo(r92.p) >= 0) {
                            wd5Var.o.A(new r70(-1723985096, true, new d90(wd5Var, h80Var, r70Var, 3)));
                        }
                    } else if (!h12.c(Looper.myLooper(), view.getHandler().getLooper())) {
                        view.post(new w85(5, wd5Var, ea2VarH));
                    } else {
                        wd5Var.q = ea2VarH;
                        ea2VarH.a(wd5Var);
                    }
                }
                break;
        }
        return j15Var;
    }
}
