package defpackage;

import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.ResponseStatus;
import com.eddyizm.tempus.subsonic.models.SubsonicResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class nq implements Callback, pp {
    public boolean n;
    public final Object o;
    public final Object p;
    public Object q;
    public Object r;
    public final Object s;

    public nq(int i, float f, ad3 ad3Var) {
        this.o = ad3Var;
        this.p = new wd3(i);
        this.q = new vd3(f);
        this.s = new g82(i);
    }

    public void a(ka0 ka0Var) {
        gf5 gf5Var = (gf5) ((ij1) this.s).w.get((ve) this.p);
        if (gf5Var != null) {
            gf5Var.n(ka0Var);
        }
    }

    @Override // defpackage.pp
    public void k(ka0 ka0Var) {
        ((ij1) this.s).A.post(new lg1(this, ka0Var, false, 29));
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        call.getClass();
        th.getClass();
        n61.l((l61) this.o);
        ((pq) this.r).f((kn2) this.p, false);
        ((lb4) this.s).l(new ab4(new xa4(-1, "An error has occurred")));
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        SubsonicResponse subsonicResponse;
        lb4 lb4Var = (lb4) this.s;
        pq pqVar = (pq) this.r;
        l61 l61Var = (l61) this.o;
        kn2 kn2Var = (kn2) this.p;
        call.getClass();
        response.getClass();
        ApiResponse apiResponse = (ApiResponse) response.body();
        boolean c = h12.c((apiResponse == null || (subsonicResponse = apiResponse.getSubsonicResponse()) == null) ? null : subsonicResponse.getStatus(), ResponseStatus.FAILED);
        if (!response.isSuccessful() || c) {
            if (c) {
                n61.j(l61Var);
            } else {
                n61.l(l61Var);
            }
            pqVar.f(kn2Var, false);
            lb4Var.l(new ab4(c ? new xa4(-1, "The server refused the change") : new xa4(response.code(), response.message())));
            return;
        }
        n61.a(l61Var);
        int Q0 = kn2Var.a().Q0();
        for (int i = 0; i < Q0; i++) {
            gn2 Y = kn2Var.a().Y(i);
            Y.getClass();
            if (h12.c(Y.a, (String) this.q)) {
                co2 a = Y.d.a();
                a.i = new vl1(this.n);
                do2 do2Var = new do2(a);
                qi3 a2 = kn2Var.a();
                tm2 a3 = Y.a();
                a3.k = do2Var;
                a2.z0(i, a3.a());
            }
        }
        pqVar.f(kn2Var, false);
        lb4Var.l(new ab4(0));
    }

    public nq(ij1 ij1Var, me meVar, ve veVar) {
        this.s = ij1Var;
        this.q = null;
        this.r = null;
        this.n = false;
        this.o = meVar;
        this.p = veVar;
    }

    public nq(l61 l61Var, kn2 kn2Var, String str, boolean z, pq pqVar, lb4 lb4Var) {
        this.o = l61Var;
        this.p = kn2Var;
        this.q = str;
        this.n = z;
        this.r = pqVar;
        this.s = lb4Var;
    }
}
