package defpackage;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nr1 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ we5 o;

    public /* synthetic */ nr1(we5 we5Var, int i) {
        this.n = i;
        this.o = we5Var;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        int i = this.n;
        we5 we5Var = this.o;
        String str = (String) obj;
        switch (i) {
            case 0:
                nz3 nz3VarF = b11.f(str);
                nz3VarF.d(str.concat("/api/assistant/tasks"));
                nz3VarF.b("POST", we5Var);
                return new oz3(nz3VarF);
            case 1:
                nz3 nz3VarF2 = b11.f(str);
                nz3VarF2.d(str.concat("/api/wave/start"));
                nz3VarF2.b("POST", we5Var);
                return new oz3(nz3VarF2);
            case 2:
                nz3 nz3VarF3 = b11.f(str);
                nz3VarF3.d(str.concat("/api/auth/google/link"));
                nz3VarF3.b("POST", we5Var);
                return new oz3(nz3VarF3);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                nz3 nz3VarF4 = b11.f(str);
                nz3VarF4.d(str.concat("/api/dislikes"));
                nz3VarF4.b("POST", we5Var);
                return new oz3(nz3VarF4);
            case 4:
                nz3 nz3VarF5 = b11.f(str);
                nz3VarF5.d(str.concat("/api/downloads"));
                nz3VarF5.b("POST", we5Var);
                return new oz3(nz3VarF5);
            case 5:
                nz3 nz3VarF6 = b11.f(str);
                nz3VarF6.d(str.concat("/api/smart-shuffle/start"));
                nz3VarF6.b("POST", we5Var);
                return new oz3(nz3VarF6);
            default:
                nz3 nz3VarF7 = b11.f(str);
                nz3VarF7.d(str.concat("/api/plays/events"));
                nz3VarF7.b("POST", we5Var);
                return new oz3(nz3VarF7);
        }
    }
}
