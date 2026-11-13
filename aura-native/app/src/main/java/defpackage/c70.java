package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class c70 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ nc1 o;

    public /* synthetic */ c70(nc1 nc1Var, int i) {
        this.n = i;
        this.o = nc1Var;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int i = this.n;
        int i2 = 0;
        nc1 nc1Var = this.o;
        switch (i) {
            case 0:
                nc1Var.reportFullyDrawn();
                return j15.a;
            case 1:
                return new ff1(nc1Var.s, new c70(nc1Var, i2));
            case 2:
                iq0 iq0Var = new iq0();
                nc1Var.i().b().c.e(iq0Var);
                return iq0Var;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return new k54(nc1Var.getApplication(), nc1Var, nc1Var.getIntent() != null ? nc1Var.getIntent().getExtras() : null);
            default:
                a93 a93Var = new a93(new b70(nc1Var, i2));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (h12.c(Looper.myLooper(), Looper.getMainLooper())) {
                        nc1Var.n.a(new d70(i2, a93Var, nc1Var));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new k6(15, nc1Var, a93Var));
                    }
                }
                return a93Var;
        }
    }
}
