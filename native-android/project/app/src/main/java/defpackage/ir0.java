package defpackage;

import java.io.IOException;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ir0 extends q42 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ir0(int i, Object obj) {
        super(1);
        this.n = i;
        this.o = obj;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        int i = this.n;
        int i2 = 1;
        j15 j15Var = j15.a;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                ((IOException) obj).getClass();
                tl1 tl1Var = ze5.a;
                ((jr0) obj2).x = true;
                return j15Var;
            case 1:
                a23 a23Var = (a23) obj;
                a23Var.getClass();
                return new d70(i2, (rd1) obj2, a23Var);
            case 2:
                sv0 sv0Var = (sv0) obj;
                sj1 sj1Var = (sj1) obj2;
                nc ncVar = sj1Var.l;
                if (sj1Var.n && sj1Var.A && ncVar != null) {
                    i61 i61VarO = sv0Var.O();
                    long j = i61VarO.j();
                    i61VarO.g().e();
                    try {
                        ((i61) ((zg5) i61VarO.o).n).g().i(ncVar);
                        sj1Var.c(sv0Var);
                    } finally {
                        i61VarO.g().k();
                        i61VarO.t(j);
                    }
                } else {
                    sj1Var.c(sv0Var);
                }
                return j15Var;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ((ic2) obj2).cancel(false);
                return j15Var;
            case 4:
                return obj == ((q03) obj2) ? "(this)" : String.valueOf(obj);
            case 5:
                return obj == ((r03) obj2) ? "(this)" : String.valueOf(obj);
            default:
                return obj == ((x03) obj2) ? "(this)" : String.valueOf(obj);
        }
    }
}
