package defpackage;

import android.content.Context;
import android.os.Handler;
import com.eddyizm.tempus.homemusic.WaveRetry;
import java.util.ArrayList;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k52 implements if1 {
    public final /* synthetic */ int n;

    public /* synthetic */ k52(int i) {
        this.n = i;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) throws Exception {
        rp1 rp1Var;
        int i = this.n;
        j15 j15Var = j15.a;
        switch (i) {
            case 0:
                ((JSONObject) obj).getClass();
                u52.d = null;
                Handler handler = u52.a;
                u52.m();
                return j15Var;
            case 1:
                ((JSONObject) obj).getClass();
                return j15Var;
            case 2:
                ((JSONObject) obj).getClass();
                u52.d = null;
                Handler handler2 = u52.a;
                u52.m();
                return j15Var;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                JSONObject jSONObject = (JSONObject) obj;
                jSONObject.getClass();
                v52 v52VarA = v52.a(u52.c(), jSONObject.optInt("deviceVolume"), jSONObject.optInt("deviceVolumeMax"), 0, 536858623);
                u52.b.k(v52VarA);
                Context context = u52.f;
                if (context != null) {
                    z52.c(context, v52VarA);
                }
                return j15Var;
            case 4:
                JSONObject jSONObject2 = (JSONObject) obj;
                jSONObject2.getClass();
                v52 v52VarA2 = v52.a(u52.c(), jSONObject2.optInt("deviceVolume"), jSONObject2.optInt("deviceVolumeMax"), 0, 536858623);
                u52.b.k(v52VarA2);
                Context context2 = u52.f;
                if (context2 != null) {
                    z52.c(context2, v52VarA2);
                }
                return j15Var;
            case 5:
                ((JSONObject) obj).getClass();
                return j15Var;
            case 6:
                ((JSONObject) obj).getClass();
                return j15Var;
            case 7:
                h52 h52Var = (h52) obj;
                h52Var.getClass();
                return h52Var.a + ":" + h52Var.d;
            case 8:
                kd3 kd3Var = (kd3) obj;
                kd3Var.getClass();
                return kd3Var.n + ":" + kd3Var.o;
            case 9:
                lg3 lg3Var = (lg3) obj;
                if (lg3Var.j()) {
                    cf2 cf2Var = lg3Var.o;
                    if (!cf2Var.B) {
                        if1 if1VarG = lg3Var.n.g();
                        if (lg3Var.n.f() != null) {
                            cf2Var.o0();
                        } else if (if1VarG == null) {
                            cf2Var.u = null;
                            cf2Var.v = null;
                            cf2Var.t = null;
                            cf2Var.o0();
                        } else {
                            cf2Var.u = null;
                            cf2Var.v = null;
                            cf2Var.Z(lg3Var, 9223372034707292159L, 0L);
                            cf2Var.t = if1VarG;
                        }
                    }
                }
                return j15Var;
            case 10:
                lg3 lg3Var2 = (lg3) obj;
                if (lg3Var2.j() && (rp1Var = lg3Var2.p) != null) {
                    cf2 cf2Var2 = lg3Var2.o;
                    w03 w03Var = cf2Var2.E;
                    x03 x03Var = w03Var != null ? (x03) w03Var.g(rp1Var) : null;
                    if (x03Var != null) {
                        c6 c6Var = cf2Var2.D;
                        if (c6Var != null) {
                            c6Var.u(rp1Var);
                        }
                        cf2Var2.m0(x03Var);
                        x03Var.b();
                    }
                }
                return j15Var;
            case 11:
                od3 od3Var = (od3) obj;
                return b11.n("[", ", ", od3Var.b, od3Var.c, ")");
            case 12:
                wc wcVar = ((w53) obj).a;
                if (wcVar != null) {
                    wcVar.invoke();
                }
                return j15Var;
            case 13:
                f63 f63Var = (f63) obj;
                c72 c72Var = f63Var.H;
                try {
                    if (f63Var.j()) {
                        f63Var.Z0(true);
                        break;
                    }
                    return j15Var;
                } catch (Throwable th) {
                    c72Var.Z(th);
                    throw null;
                }
            case 14:
                tb3 tb3Var = ((f63) obj).g0;
                if (tb3Var != null) {
                    ((vj1) tb3Var).c();
                }
                return j15Var;
            case 15:
                ((Long) obj).getClass();
                return j15Var;
            case WaveRetry.MAX_FAILURES /* 16 */:
                c83 c83Var = (c83) obj;
                if (c83Var.j()) {
                    c83Var.n.Q();
                }
                return j15Var;
            case 17:
                mf3 mf3Var = (mf3) obj;
                int i2 = fc.a;
                wl4 wl4Var = hb.b;
                mf3Var.getClass();
                Context context3 = (Context) vr1.C(mf3Var, wl4Var);
                oo0 oo0Var = (oo0) vr1.C(mf3Var, g90.h);
                qb3 qb3Var = (qb3) vr1.C(mf3Var, rb3.a);
                if (qb3Var == null) {
                    return null;
                }
                return new ub(context3, oo0Var, qb3Var.a, qb3Var.b);
            case 18:
                c72 c72Var2 = (c72) obj;
                if (c72Var2.G()) {
                    c72.U(c72Var2, false, 7);
                }
                return j15Var;
            case 19:
                c72 c72Var3 = (c72) obj;
                if (c72Var3.G()) {
                    c72.W(c72Var3, false, 7);
                }
                return j15Var;
            case 20:
                c72 c72Var4 = (c72) obj;
                if (c72Var4.G()) {
                    c72Var4.E();
                }
                return j15Var;
            case 21:
                c72 c72Var5 = (c72) obj;
                if (c72Var5.G()) {
                    c72Var5.V(false);
                }
                return j15Var;
            case 22:
                c72 c72Var6 = (c72) obj;
                if (c72Var6.G()) {
                    c72Var6.V(false);
                }
                return j15Var;
            case 23:
                c72 c72Var7 = (c72) obj;
                if (c72Var7.G()) {
                    c72Var7.T(false);
                }
                return j15Var;
            case 24:
                c72 c72Var8 = (c72) obj;
                if (c72Var8.G()) {
                    c72Var8.T(false);
                }
                return j15Var;
            case 25:
                obj.getClass();
                return Boolean.valueOf(!((vb3) obj).j());
            case 26:
                z34 z34VarU = ((x34) obj).U("SELECT playlistId FROM pinned_playlist");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (z34VarU.O()) {
                        arrayList.add(new gg3(z34VarU.isNull(0) ? null : z34VarU.D(0)));
                        break;
                    }
                    return arrayList;
                } finally {
                    z34VarU.close();
                }
            case 27:
                k52 k52Var = kg3.a;
                return j15Var;
            case 28:
                z34 z34VarU2 = ((x34) obj).U("SELECT COUNT(*) FROM queue");
                try {
                    return Integer.valueOf(z34VarU2.O() ? (int) z34VarU2.getLong(0) : 0);
                } finally {
                    z34VarU2.close();
                }
            default:
                z34 z34VarU3 = ((x34) obj).U("DELETE FROM queue");
                try {
                    z34VarU3.O();
                    return null;
                } finally {
                    z34VarU3.close();
                }
        }
    }
}
