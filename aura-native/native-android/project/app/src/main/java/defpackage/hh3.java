package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import com.bumptech.glide.a;
import com.eddyizm.tempus.App;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hh3 implements gh3, sq3, Callback, d04, q51, n64 {
    public final /* synthetic */ int n;

    public /* synthetic */ hh3(int i) {
        this.n = i;
    }

    public static final boolean d(ge3 ge3Var) {
        ge3 ge3Var2 = y04.f;
        yw ywVarO = ge3Var.n;
        int iK = yw.k(ywVarO, f.a);
        if (iK == -1) {
            iK = yw.k(ge3Var.n, f.b);
        }
        if (iK != -1) {
            ywVarO = yw.o(ywVarO, iK + 1, 0, 2);
        } else if (ge3Var.e() != null && ywVarO.d() == 2) {
            ywVarO = yw.q;
        }
        return !xm4.e0(ywVarO.q(), ".class", true);
    }

    public static final void f(hh3 hh3Var) {
        nl4 nl4Var;
        vf3 vf3Var;
        vf3 vf3Var2;
        nl4 nl4Var2 = tv3.z;
        do {
            nl4Var = tv3.z;
            vf3Var = (vf3) nl4Var.getValue();
            nf3 nf3VarA = vf3Var.p;
            ob2 ob2Var = (ob2) nf3VarA.get(hh3Var);
            if (ob2Var == null) {
                vf3Var2 = vf3Var;
            } else {
                Object obj = ob2Var.a;
                Object obj2 = ob2Var.b;
                xx4 xx4Var = nf3VarA.n;
                xx4 xx4VarV = xx4Var.v(hh3Var != null ? hh3Var.hashCode() : 0, 0, hh3Var);
                if (xx4Var != xx4VarV) {
                    nf3VarA = xx4VarV == null ? nf3.p : new nf3(xx4VarV, nf3VarA.o - 1);
                }
                fz0 fz0Var = fz0.Z;
                if (obj != fz0Var) {
                    Object obj3 = nf3VarA.get(obj);
                    obj3.getClass();
                    nf3VarA = nf3VarA.a(obj, new ob2(((ob2) obj3).a, obj2));
                }
                if (obj2 != fz0Var) {
                    Object obj4 = nf3VarA.get(obj2);
                    obj4.getClass();
                    nf3VarA = nf3VarA.a(obj2, new ob2(obj, ((ob2) obj4).b));
                }
                Object obj5 = obj != fz0Var ? vf3Var.n : obj2;
                if (obj2 != fz0Var) {
                    obj = vf3Var.o;
                }
                vf3Var2 = new vf3(obj5, obj, nf3VarA);
            }
            if (vf3Var == vf3Var2) {
                return;
            }
        } while (!nl4Var.j(vf3Var, vf3Var2));
    }

    public static k03 h(String str, String str2) {
        k03 k03Var = new k03();
        wo0 wo0VarI = App.e(ud3.D()).i();
        wo0VarI.getClass();
        Log.d("BrowsingClient", "createShare()");
        ((hd4) wo0VarI.o).c(((pn4) wo0VarI.n).f(), str, str2, null).enqueue(new q8(k03Var, 4));
        return k03Var;
    }

    public static pr3 i(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return pr3.p;
        }
        if (str.equals("http/1.1")) {
            return pr3.q;
        }
        if (str.equals("h2_prior_knowledge")) {
            return pr3.t;
        }
        if (str.equals("h2")) {
            return pr3.s;
        }
        if (str.equals("spdy/3.1")) {
            return pr3.r;
        }
        if (str.equals("quic")) {
            return pr3.u;
        }
        if (xm4.k0(str, "h3", false)) {
            return pr3.v;
        }
        mj0.i("Unexpected protocol: ".concat(str));
        return null;
    }

    public static k03 k() {
        k03 k03Var = new k03(new ArrayList());
        wo0 wo0VarH = App.f(false).h();
        wo0VarH.getClass();
        Log.d("PodcastClient", "getNewestPodcasts()");
        ((hn3) wo0VarH.o).f(((pn4) wo0VarH.n).f(), 20).enqueue(new ck(k03Var, 1));
        return k03Var;
    }

    public static k03 l(String str, boolean z) {
        k03 k03Var = new k03(new ArrayList());
        wo0 wo0VarH = App.f(false).h();
        wo0VarH.getClass();
        Log.d("PodcastClient", "getPodcasts()");
        ((hn3) wo0VarH.o).c(((pn4) wo0VarH.n).f(), z, str).enqueue(new r8(k03Var, 2));
        return k03Var;
    }

    public static k03 m() {
        k03 k03Var = new k03(new ArrayList());
        wo0 wo0VarI = App.f(false).i();
        wo0VarI.getClass();
        Log.d("BrowsingClient", "getShares()");
        ((hd4) wo0VarI.o).b(((pn4) wo0VarI.n).f()).enqueue(new p8(k03Var, 5));
        return k03Var;
    }

    private final void n() {
    }

    private final void o(Call call, Throwable th) {
    }

    private final void p(Call call, Throwable th) {
    }

    private final void q(Call call, Response response) {
    }

    private final void r(Call call, Response response) {
    }

    private final void s(int i, Object obj) {
    }

    @Override // defpackage.d04
    public c04 a(a aVar, s92 s92Var, f04 f04Var, Context context) {
        return new c04(aVar, s92Var, f04Var, context);
    }

    @Override // defpackage.gh3
    public Typeface b(gb1 gb1Var, int i) {
        if (i == 0 && h12.c(gb1Var, gb1.p)) {
            return Typeface.DEFAULT;
        }
        int iJ = h12.j(gb1Var.n, gb1.o.n);
        int i2 = 0;
        boolean z = iJ >= 0;
        boolean z2 = i == 1;
        if (z2 && z) {
            i2 = 3;
        } else if (z) {
            i2 = 1;
        } else if (z2) {
            i2 = 2;
        }
        return Typeface.defaultFromStyle(i2);
    }

    @Override // defpackage.sq3
    public void c() {
        switch (this.n) {
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // defpackage.sq3
    public void e(int i, Object obj) {
        String str;
        switch (this.n) {
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                break;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i == 6 || i == 7 || i == 8) {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                } else {
                    Log.d("ProfileInstaller", str);
                }
                break;
        }
    }

    @Override // defpackage.q51
    public Object g() {
        try {
            return new j44(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            er1.m(e);
            return null;
        }
    }

    public k03 j() {
        k03 k03Var = new k03(new ArrayList());
        xc5 xc5VarD = App.f(false).d();
        xc5VarD.getClass();
        Log.d("InternetRadioClient", "getInternetRadioStations()");
        ((x02) xc5VarD.p).a(((pn4) xc5VarD.o).f()).enqueue(new hd5(this, k03Var, false, 18));
        return k03Var;
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        switch (this.n) {
            case 8:
                Log.e("QueueRepository", "Play queue save failed", th);
                break;
            case 9:
                Log.e("QueueRepository", "deleteBookmark failed", th);
                break;
        }
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        switch (this.n) {
            case 8:
                if (!response.isSuccessful()) {
                    Log.d("QueueRepository", "Play queue save failed with code: " + response.code());
                } else {
                    Log.d("QueueRepository", "Play queue saved successfully");
                }
                break;
            case 9:
                if (!response.isSuccessful()) {
                    Log.w("QueueRepository", "deleteBookmark failed with code: " + response.code());
                }
                break;
        }
    }

    @Override // defpackage.n64
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // defpackage.n64
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }

    public String toString() {
        switch (this.n) {
            case 19:
                int iHashCode = hashCode();
                ya4.g(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return f34.h("CreationExtras.Key@", string, "<", kx3.a(j54.class).c(), ">");
            case 20:
                int iHashCode2 = hashCode();
                ya4.g(16);
                String string2 = Integer.toString(iHashCode2, 16);
                string2.getClass();
                return f34.h("CreationExtras.Key@", string2, "<", kx3.a(f75.class).c(), ">");
            case 21:
                int iHashCode3 = hashCode();
                ya4.g(16);
                String string3 = Integer.toString(iHashCode3, 16);
                string3.getClass();
                return f34.h("CreationExtras.Key@", string3, "<", kx3.a(Bundle.class).c(), ">");
            default:
                return super.toString();
        }
    }
}
