package defpackage;

import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.ResponseStatus;
import com.eddyizm.tempus.subsonic.models.SubsonicResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nq implements Callback, pp {
    public boolean n;
    public final Object o;
    public final Object p;
    public Object q;
    public Object r;
    public final Object s;

    public nq(int r1, float r2, ad3 r3) {
        this.o = r3;
        this.p = new wd3(r1);
        this.q = new vd3(r2);
        this.s = new g82(r1);
    }

    public void a(ka0 r2) {
        gf5 r1 = (gf5) ((ij1) this.s).w.get((ve) this.p);
        if (r1 == null) goto L6;
        r1.n(r2);
        return;
    }

    @Override // defpackage.pp
    public void k(ka0 r5) {
        boolean r3 = false;
        ((ij1) this.s).A.post(new lg1(this, r5, r3, 29));
    }

    @Override // retrofit2.Callback
    public void onFailure(Call r3, Throwable r4) {
        r3.getClass();
        r4.getClass();
        n61.l((l61) this.o);
        ((pq) this.r).f((kn2) this.p, false);
        ((lb4) this.s).l(new ab4(new xa4(-1, "An error has occurred")));
    }

    @Override // retrofit2.Callback
    public void onResponse(Call r9, Response r10) {
        lb4 r0 = (lb4) this.s;
        pq r1 = (pq) this.r;
        l61 r2 = (l61) this.o;
        kn2 r3 = (kn2) this.p;
        r9.getClass();
        r10.getClass();
        ApiResponse r11 = (ApiResponse) r10.body();
        if (r11 == null) goto L7;
        SubsonicResponse r12 = r11.getSubsonicResponse();
        if (r12 == null) goto L7;
        String r13 = r12.getStatus();
    L8:
        boolean r14 = h12.c(r13, ResponseStatus.FAILED);
        if (r10.isSuccessful() == false) goto L19;
        if (r14 == true) goto L19;
        n61.a(r2);
        int r15 = r3.a().Q0();
        int r16 = 0;
    L12:
        if (r16 >= r15) goto L17;
        gn2 r4 = r3.a().Y(r16);
        r4.getClass();
        if (h12.c(r4.a, (String) this.q) == false) goto L16;
        co2 r5 = r4.d.a();
        r5.i = new vl1(this.n);
        do2 r6 = new do2(r5);
        qi3 r7 = r3.a();
        tm2 r8 = r4.a();
        r8.k = r6;
        r7.z0(r16, r8.a());
    L16:
        r16 = r16 + 1;
        goto L12
    L17:
        r1.f(r3, false);
        r0.l(new ab4(0));
        return;
    L19:
        if (r14 == false) goto L21;
        n61.j(r2);
    L22:
        r1.f(r3, false);
        if (r14 == false) goto L25;
        xa4 r17 = new xa4(-1, "The server refused the change");
    L26:
        r0.l(new ab4(r17));
        return;
    L25:
        r17 = new xa4(r10.code(), r10.message());
        goto L26
    L21:
        n61.l(r2);
    L7:
        r13 = null;
        goto L8
    }

    public nq(ij1 r1, me r2, ve r3) {
        this.s = r1;
        this.q = null;
        this.r = null;
        this.n = false;
        this.o = r2;
        this.p = r3;
    }

    public nq(l61 r1, kn2 r2, String r3, boolean r4, pq r5, lb4 r6) {
        this.o = r1;
        this.p = r2;
        this.q = r3;
        this.n = r4;
        this.r = r5;
        this.s = r6;
    }
}
