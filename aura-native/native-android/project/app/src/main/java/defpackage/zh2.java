package defpackage;

import com.eddyizm.tempus.homemusic.WaveRetry;
import java.util.function.Function;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zh2 implements Function {
    public final /* synthetic */ int a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return Double.valueOf(((d64) obj).c ? 100.0d : 0.0d);
            case 1:
                return ((d64) obj).h;
            case 2:
                return Double.valueOf(((d64) obj).c ? 6.0d : 87.0d);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return ((d64) obj).i;
            case 4:
                return Double.valueOf(((d64) obj).c ? 80.0d : 30.0d);
            case 5:
                return ((d64) obj).e;
            case 6:
                return Double.valueOf(((d64) obj).c ? 30.0d : 90.0d);
            case 7:
                return ((d64) obj).h;
            case 8:
                return Double.valueOf(((d64) obj).c ? 10.0d : 96.0d);
            case 9:
                return ((d64) obj).f;
            case 10:
                d64 d64Var = (d64) obj;
                boolean zC = tv1.C(d64Var);
                tu4 tu4Var = d64Var.f;
                boolean z = d64Var.c;
                if (zC) {
                    return Double.valueOf(z ? 30.0d : 85.0d);
                }
                double d = z ? 30.0d : 90.0d;
                if (!tv1.B(d64Var)) {
                    return Double.valueOf(d);
                }
                double d2 = tu4Var.a;
                double d3 = tu4Var.b;
                ol1 ol1VarA = ol1.a(d2, d3, d);
                double dMax = ol1VarA.b;
                if (dMax < d3) {
                    while (ol1VarA.b < d3) {
                        d += !z ? -1.0d : 1.0d;
                        ol1 ol1VarA2 = ol1.a(d2, d3, d);
                        double d4 = ol1VarA2.b;
                        if (dMax <= d4 && Math.abs(d4 - d3) >= 0.4d) {
                            boolean z2 = z;
                            double d5 = d2;
                            if (Math.abs(ol1VarA2.b - d3) < Math.abs(ol1VarA.b - d3)) {
                                ol1VarA = ol1VarA2;
                            }
                            dMax = Math.max(dMax, ol1VarA2.b);
                            d2 = d5;
                            z = z2;
                        }
                    }
                }
                return Double.valueOf(tv1.D(ol1.a(tu4Var.a, tu4Var.b, d), d64Var));
            case 11:
                return Double.valueOf(((d64) obj).c ? 6.0d : 98.0d);
            case 12:
                return Double.valueOf(0.0d);
            case 13:
                return Double.valueOf(((d64) obj).c ? 100.0d : 0.0d);
            case 14:
                return Double.valueOf(((d64) obj).c ? 0.2d : 0.12d);
            case 15:
                d64 d64Var2 = (d64) obj;
                zh2 zh2Var = new zh2(0);
                return Double.valueOf(gy0.a(d64Var2, zh2Var, new zx0(d64Var2, 1), new by0(zh2Var, d64Var2, null), null, null, null, new m7(23)));
            case WaveRetry.MAX_FAILURES /* 16 */:
                d64 d64Var3 = (d64) obj;
                return Double.valueOf(gy0.a(d64Var3, new m7(29), new zx0(d64Var3, 2), new ay0(null, d64Var3), null, null, null, null));
            case 17:
                return ((d64) obj).e;
            case 18:
                d64 d64Var4 = (d64) obj;
                if (tv1.B(d64Var4)) {
                    return Double.valueOf(tv1.D(d64Var4.a, d64Var4));
                }
                int i = d64Var4.b;
                boolean z3 = d64Var4.c;
                if (i == 1) {
                    return Double.valueOf(z3 ? 85.0d : 25.0d);
                }
                return Double.valueOf(z3 ? 30.0d : 90.0d);
            case 19:
                return ((d64) obj).h;
            case 20:
                return Double.valueOf(((d64) obj).c ? 6.0d : 98.0d);
            case 21:
                return ((d64) obj).h;
            case 22:
                return ((d64) obj).h;
            case 23:
                return Double.valueOf(((d64) obj).c ? 17.0d : 92.0d);
            case 24:
                return ((d64) obj).h;
            case 25:
                return Double.valueOf(((d64) obj).c ? 90.0d : 10.0d);
            case 26:
                return gy0.c(new zh2(19), new zh2(20), null, null);
            case 27:
                return ((d64) obj).i;
            case 28:
                return Double.valueOf(((d64) obj).c ? 30.0d : 80.0d);
            default:
                return ((d64) obj).h;
        }
    }

    public /* synthetic */ zh2(int i) {
        this.a = i;
    }
}
