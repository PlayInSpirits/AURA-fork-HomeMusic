package defpackage;

import com.eddyizm.tempus.homemusic.WaveRetry;
import java.util.function.Function;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ai2 implements Function {
    public final /* synthetic */ int a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return Double.valueOf(((d64) obj).c ? 24.0d : 98.0d);
            case 1:
                return ((d64) obj).e;
            case 2:
                d64 d64Var = (d64) obj;
                boolean zC = tv1.C(d64Var);
                boolean z = d64Var.c;
                if (zC) {
                    return Double.valueOf(z ? 10.0d : 90.0d);
                }
                return Double.valueOf(z ? 20.0d : 100.0d);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return Double.valueOf(((d64) obj).c ? 10.0d : 90.0d);
            case 4:
                return ((d64) obj).e;
            case 5:
                return Double.valueOf(((d64) obj).c ? 40.0d : 80.0d);
            case 6:
                return gy0.c(new bi2(15), new bi2(17), null, null);
            case 7:
                return ((d64) obj).j;
            case 8:
                return Double.valueOf(((d64) obj).c ? 20.0d : 100.0d);
            case 9:
                return ((d64) obj).h;
            case 10:
                return Double.valueOf(((d64) obj).c ? 10.0d : 90.0d);
            case 11:
                return ((d64) obj).e;
            case 12:
                return ((d64) obj).g;
            case 13:
                return ((d64) obj).i;
            case 14:
                return Double.valueOf(((d64) obj).c ? 30.0d : 90.0d);
            case 15:
                return ((d64) obj).h;
            case WaveRetry.MAX_FAILURES /* 16 */:
                return Double.valueOf(((d64) obj).c ? 10.0d : 90.0d);
            case 17:
                return ((d64) obj).h;
            case 18:
                return Double.valueOf(((d64) obj).c ? 22.0d : 90.0d);
            case 19:
                return ((d64) obj).g;
            case 20:
                d64 d64Var2 = (d64) obj;
                boolean zC2 = tv1.C(d64Var2);
                tu4 tu4Var = d64Var2.g;
                boolean z2 = d64Var2.c;
                if (zC2) {
                    return Double.valueOf(z2 ? 60.0d : 49.0d);
                }
                if (tv1.B(d64Var2)) {
                    return Double.valueOf(vr1.q(ol1.a(tu4Var.a, tu4Var.b, tv1.D(ol1.a(tu4Var.a, tu4Var.b, d64Var2.a.c), d64Var2))).c);
                }
                return Double.valueOf(z2 ? 30.0d : 90.0d);
            case 21:
                d64 d64Var3 = (d64) obj;
                boolean zC3 = tv1.C(d64Var3);
                boolean z3 = d64Var3.c;
                if (zC3) {
                    return Double.valueOf(z3 ? 10.0d : 90.0d);
                }
                return Double.valueOf(z3 ? 20.0d : 100.0d);
            case 22:
                return ((d64) obj).f;
            case 23:
                d64 d64Var4 = (d64) obj;
                boolean zC4 = tv1.C(d64Var4);
                boolean z4 = d64Var4.c;
                if (zC4) {
                    return Double.valueOf(z4 ? 10.0d : 100.0d);
                }
                return Double.valueOf(z4 ? 20.0d : 100.0d);
            case 24:
                return ((d64) obj).f;
            case 25:
                return Double.valueOf(((d64) obj).c ? 80.0d : 40.0d);
            case 26:
                return ((d64) obj).h;
            case 27:
                return Double.valueOf(((d64) obj).c ? 4.0d : 100.0d);
            case 28:
                return ((d64) obj).i;
            default:
                return Double.valueOf(((d64) obj).c ? 60.0d : 50.0d);
        }
    }

    public /* synthetic */ ai2(int i) {
        this.a = i;
    }
}
