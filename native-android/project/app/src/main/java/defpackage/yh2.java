package defpackage;

import java.util.function.Function;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yh2 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ tv1 b;

    public /* synthetic */ yh2(tv1 tv1Var, int i) {
        this.a = i;
        this.b = tv1Var;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.a;
        int i2 = 7;
        int i3 = 1;
        tv1 tv1Var = this.b;
        switch (i) {
            case 0:
                return new uu4(tv1Var.E(), ((d64) obj).c ? 1 : 2);
            case 1:
                return new uu4(tv1Var.G(), ((d64) obj).c ? 1 : 2);
            case 2:
                return gy0.c(new bi2(24), new bi2(25), new bi2(tv1Var, 26), new yh2(tv1Var, 0));
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return gy0.c(new bi2(5), new bi2(7), new bi2(tv1Var, 26), new yh2(tv1Var, 13));
            case 4:
                d64 d64Var = (d64) obj;
                if (tv1.B(d64Var)) {
                    return Double.valueOf(gy0.b(((Double) tv1Var.E().c.apply(d64Var)).doubleValue(), 4.5d));
                }
                int i4 = d64Var.b;
                boolean z = d64Var.c;
                if (i4 == 1) {
                    return Double.valueOf(z ? 0.0d : 100.0d);
                }
                return Double.valueOf(z ? 90.0d : 10.0d);
            case 5:
                return tv1Var.E();
            case 6:
                return gy0.c(new ai2(24), new ai2(25), new bi2(tv1Var, 26), new yh2(tv1Var, i2));
            case 7:
                return new uu4(tv1Var.F(), ((d64) obj).c ? 1 : 2);
            case 8:
                return gy0.c(new m7(27), new m7(28), new bi2(tv1Var, 26), new yh2(tv1Var, i3));
            case 9:
                d64 d64Var2 = (d64) obj;
                boolean zC = tv1.C(d64Var2);
                boolean z2 = d64Var2.c;
                if (zC) {
                    return Double.valueOf(z2 ? 0.0d : 100.0d);
                }
                if (tv1.B(d64Var2)) {
                    return Double.valueOf(gy0.b(((Double) tv1Var.G().c.apply(d64Var2)).doubleValue(), 4.5d));
                }
                return Double.valueOf(z2 ? 90.0d : 10.0d);
            case 10:
                return tv1Var.G();
            case 11:
                d64 d64Var3 = (d64) obj;
                if (tv1.B(d64Var3)) {
                    return Double.valueOf(gy0.b(((Double) tv1Var.F().c.apply(d64Var3)).doubleValue(), 4.5d));
                }
                return Double.valueOf(d64Var3.c ? 90.0d : 10.0d);
            case 12:
                return tv1Var.F();
            case 13:
                return new uu4(tv1Var.x(), ((d64) obj).c ? 1 : 2);
            default:
                return tv1Var.x();
        }
    }
}
