package defpackage;

import com.eddyizm.tempus.App;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Starred2;
import com.eddyizm.tempus.subsonic.models.SubsonicResponse;
import java.util.List;
import java.util.function.Consumer;
import org.json.JSONObject;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sn1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ long o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ sn1(h62 h62Var, long j, g62 g62Var) {
        this.n = 2;
        this.p = h62Var;
        this.o = j;
        this.q = g62Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<Child> list;
        SubsonicResponse subsonicResponse;
        Starred2 starred2 = null;
        switch (this.n) {
            case 0:
                long j = this.o;
                String str = (String) this.p;
                Consumer consumer = (Consumer) this.q;
                try {
                    vn1 vn1Var = vn1.n;
                    try {
                        if (!cx.h()) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (str == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        rr1 rr1Var = rr1.a;
                        list = (List) rr1.B(str, new e90(7));
                        List<Child> list2 = list;
                        if (((Number) vn1Var.invoke()).longValue() == j) {
                            list2.getClass();
                            io1.b.post(new un1(j, str, consumer, list2, 0));
                            return;
                        }
                        return;
                    } catch (Exception unused) {
                        if (((Number) vn1Var.invoke()).longValue() != j) {
                            return;
                        }
                        Response responseExecute = App.f(false).a().s().execute();
                        if (!responseExecute.isSuccessful()) {
                            throw new IllegalStateException("Check failed.");
                        }
                        ApiResponse apiResponse = (ApiResponse) responseExecute.body();
                        if (apiResponse != null && (subsonicResponse = apiResponse.getSubsonicResponse()) != null) {
                            starred2 = subsonicResponse.getStarred2();
                        }
                        if (starred2 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        List<Child> songs = starred2.getSongs();
                        if (songs == null) {
                            songs = u01.n;
                        }
                        list = songs;
                    }
                } catch (Throwable unused2) {
                    return;
                }
                break;
            case 1:
                long j2 = this.o;
                if1 if1Var = (if1) this.p;
                JSONObject jSONObject = (JSONObject) this.q;
                if (u52.i == j2) {
                    if1Var.invoke(jSONObject);
                    return;
                }
                return;
            case 2:
                h62 h62Var = (h62) this.p;
                long j3 = this.o;
                g62 g62Var = (g62) this.q;
                if (h62Var.l0(j3) && h62Var.H0 == g62Var) {
                    h62Var.H0 = null;
                    if (h62Var.I0) {
                        h62Var.I0 = false;
                        h62Var.q0();
                        return;
                    }
                    return;
                }
                return;
            default:
                rf2 rf2Var = (rf2) this.p;
                Object obj = this.q;
                long j4 = this.o;
                o55 o55Var = (o55) rf2Var.o;
                String str2 = f35.a;
                o55Var.u(j4, obj);
                return;
        }
    }

    public /* synthetic */ sn1(long j, Object obj, Object obj2, int i) {
        this.n = i;
        this.o = j;
        this.p = obj;
        this.q = obj2;
    }

    public /* synthetic */ sn1(rf2 rf2Var, Object obj, long j) {
        this.n = 3;
        this.p = rf2Var;
        this.q = obj;
        this.o = j;
    }
}
