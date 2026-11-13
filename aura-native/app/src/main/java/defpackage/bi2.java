package defpackage;

import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.model.Queue;
import com.eddyizm.tempus.subsonic.models.Child;
import java.util.function.Function;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class bi2 implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ bi2(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((d64) obj).h;
            case 1:
                return Double.valueOf(((d64) obj).c ? 20.0d : 95.0d);
            case 2:
                return gy0.c(new bi2(15), new bi2(17), null, null);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return ((d64) obj).g;
            case 4:
                return ((d64) obj).f;
            case 5:
                return ((d64) obj).j;
            case 6:
                return ((d64) obj).h;
            case 7:
                return Double.valueOf(((d64) obj).c ? 80.0d : 40.0d);
            case 8:
                return ((d64) obj).h;
            case 9:
                return Double.valueOf(((d64) obj).c ? 10.0d : 90.0d);
            case 10:
                return ((d64) obj).h;
            case 11:
                return Double.valueOf(((d64) obj).c ? 12.0d : 94.0d);
            case 12:
                return ((d64) obj).i;
            case 13:
                return Double.valueOf(((d64) obj).c ? 80.0d : 30.0d);
            case 14:
                return gy0.c(new ai2(13), new ai2(14), null, null);
            case 15:
                return ((d64) obj).h;
            case WaveRetry.MAX_FAILURES /* 16 */:
                return Double.valueOf(((d64) obj).c ? 90.0d : 10.0d);
            case 17:
                return Double.valueOf(((d64) obj).c ? 90.0d : 20.0d);
            case 18:
                return ((d64) obj).j;
            case 19:
                return Double.valueOf(((d64) obj).c ? 90.0d : 10.0d);
            case 20:
                return ((d64) obj).i;
            case 21:
                return Double.valueOf(((d64) obj).c ? 30.0d : 80.0d);
            case 22:
                return ((d64) obj).j;
            case 23:
                return Double.valueOf(((d64) obj).c ? 30.0d : 90.0d);
            case 24:
                return ((d64) obj).e;
            case 25:
                d64 d64Var = (d64) obj;
                boolean C = tv1.C(d64Var);
                boolean z = d64Var.c;
                if (C) {
                    return Double.valueOf(z ? 100.0d : 0.0d);
                }
                return Double.valueOf(z ? 80.0d : 40.0d);
            case 26:
                return ((d64) obj).c ? gy0.c(new zh2(29), new ai2(0), null, null) : gy0.c(new zh2(1), new zh2(2), null, null);
            case 27:
                return (Queue) obj;
            case 28:
                return ((Queue) obj).getId();
            default:
                return (Child) Child.class.cast((Queue) obj);
        }
    }

    public /* synthetic */ bi2(tv1 tv1Var, int i) {
        this.a = i;
    }
}
