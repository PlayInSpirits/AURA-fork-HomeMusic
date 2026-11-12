package defpackage;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pr1 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ String o;
    public final /* synthetic */ we5 p;

    public /* synthetic */ pr1(String str, we5 we5Var, int i) {
        this.n = i;
        this.o = str;
        this.p = we5Var;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        int i = this.n;
        we5 we5Var = this.p;
        String str = this.o;
        String str2 = (String) obj;
        switch (i) {
            case 0:
                nz3 nz3VarF = b11.f(str2);
                nz3VarF.d(str2 + str);
                nz3VarF.b("POST", we5Var);
                return new oz3(nz3VarF);
            case 1:
                nz3 nz3VarF2 = b11.f(str2);
                nz3VarF2.d(str2 + "/api/smart-shuffle/" + str + "/next");
                nz3VarF2.b("POST", we5Var);
                return new oz3(nz3VarF2);
            case 2:
                nz3 nz3VarF3 = b11.f(str2);
                nz3VarF3.d(str2 + "/api/wave/" + str + "/next");
                nz3VarF3.b("POST", we5Var);
                return new oz3(nz3VarF3);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                nz3 nz3VarF4 = b11.f(str2);
                nz3VarF4.d(str2 + "/api/smart-shuffle/" + str + "/add");
                nz3VarF4.b("POST", we5Var);
                return new oz3(nz3VarF4);
            default:
                nz3 nz3VarF5 = b11.f(str2);
                nz3VarF5.d(str2 + "/api/smart-shuffle/" + str + "/hide");
                nz3VarF5.b("POST", we5Var);
                return new oz3(nz3VarF5);
        }
    }
}
