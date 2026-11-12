package defpackage;

import com.eddyizm.tempus.homemusic.HubAuthOptions;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yn1 implements Runnable {
    public final /* synthetic */ int n = 0;
    public final /* synthetic */ String o;
    public final /* synthetic */ fo1 p;

    public /* synthetic */ yn1(fo1 fo1Var, String str) {
        this.p = fo1Var;
        this.o = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        Object s14Var;
        switch (this.n) {
            case 0:
                String str = this.o;
                try {
                    rr1 rr1Var = rr1.a;
                    Map mapSingletonMap = Collections.singletonMap("email", str);
                    mapSingletonMap.getClass();
                    rr1.s(mapSingletonMap, "/api/auth/email/code", wr1.class);
                    throw new ClassCastException();
                } catch (Throwable th) {
                    io1.b.post(new v6(this.p, new s14(th), str, 11));
                    return;
                }
            default:
                n83 n83VarA = rr1.k().a();
                n83VarA.k = be0.g;
                n83VarA.a(15L, TimeUnit.SECONDS);
                o83 o83Var = new o83(n83VarA);
                nz3 nz3Var = new nz3();
                String str2 = this.o;
                nz3Var.d(str2.concat("/rest/ping.view?v=1.16.1&c=HomeMusic&f=json"));
                Object obj = null;
                try {
                    k14 k14VarC = new bv3(o83Var, new oz3(nz3Var)).c();
                    try {
                        n14 n14Var = k14VarC.t;
                        String strString = n14Var != null ? n14Var.string() : null;
                        if (strString == null) {
                            strString = "";
                        }
                        i = qm4.o0(strString, "subsonic-response") ? 0 : 2;
                        k14VarC.close();
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            q05.h(k14VarC, th2);
                            throw th3;
                        }
                    }
                } catch (Exception unused) {
                    i = 1;
                }
                int i2 = i;
                if (i2 == 0) {
                    try {
                        s14Var = (HubAuthOptions) rr1.s(null, "/api/auth/options", HubAuthOptions.class);
                    } catch (Throwable th4) {
                        s14Var = new s14(th4);
                    }
                    obj = (HubAuthOptions) (s14Var instanceof s14 ? null : s14Var);
                    break;
                }
                io1.b.post(new ct0(this.p, i2, str2, obj, 1));
                return;
        }
    }

    public /* synthetic */ yn1(String str, fo1 fo1Var) {
        this.o = str;
        this.p = fo1Var;
    }
}
