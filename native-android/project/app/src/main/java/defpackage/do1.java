package defpackage;

import com.eddyizm.tempus.homemusic.HubGoogleLogin;
import com.eddyizm.tempus.homemusic.HubMe;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class do1 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ String o;

    public /* synthetic */ do1(int i, String str) {
        this.n = i;
        this.o = str;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int i = this.n;
        String str = this.o;
        switch (i) {
            case 0:
                HubGoogleLogin hubGoogleLoginL = rr1.l(str, null, null);
                String username = hubGoogleLoginL.getUsername();
                if (username == null) {
                    username = "";
                }
                String password = hubGoogleLoginL.getPassword();
                return new kd3(username, password != null ? password : "");
            default:
                rr1 rr1Var = rr1.a;
                str.getClass();
                sz3 sz3Var = tz3.Companion;
                nk1 nk1Var = rr1.c;
                Map mapSingletonMap = Collections.singletonMap("id_token", str);
                mapSingletonMap.getClass();
                String strJ = nk1Var.j(mapSingletonMap);
                strJ.getClass();
                hu2 hu2Var = rr1.b;
                sz3Var.getClass();
                we5 we5VarB = sz3.b(strJ, hu2Var);
                rr1 rr1Var2 = rr1.a;
                return (HubMe) rr1.d(new nr1(we5VarB, 2), new or1(8));
        }
    }
}
