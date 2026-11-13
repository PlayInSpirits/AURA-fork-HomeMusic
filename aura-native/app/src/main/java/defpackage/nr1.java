package defpackage;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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
                nz3 f = b11.f(str);
                f.d(str.concat("/api/assistant/tasks"));
                f.b("POST", we5Var);
                return new oz3(f);
            case 1:
                nz3 f2 = b11.f(str);
                f2.d(str.concat("/api/wave/start"));
                f2.b("POST", we5Var);
                return new oz3(f2);
            case 2:
                nz3 f3 = b11.f(str);
                f3.d(str.concat("/api/auth/google/link"));
                f3.b("POST", we5Var);
                return new oz3(f3);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                nz3 f4 = b11.f(str);
                f4.d(str.concat("/api/dislikes"));
                f4.b("POST", we5Var);
                return new oz3(f4);
            case 4:
                nz3 f5 = b11.f(str);
                f5.d(str.concat("/api/downloads"));
                f5.b("POST", we5Var);
                return new oz3(f5);
            case 5:
                nz3 f6 = b11.f(str);
                f6.d(str.concat("/api/smart-shuffle/start"));
                f6.b("POST", we5Var);
                return new oz3(f6);
            default:
                nz3 f7 = b11.f(str);
                f7.d(str.concat("/api/plays/events"));
                f7.b("POST", we5Var);
                return new oz3(f7);
        }
    }
}
