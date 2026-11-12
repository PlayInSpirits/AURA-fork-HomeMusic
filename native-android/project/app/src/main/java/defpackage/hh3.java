package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import com.bumptech.glide.a;
import com.eddyizm.tempus.App;
import java.security.MessageDigest;
import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hh3 implements gh3, sq3, Callback, d04, q51, n64 {
    public final /* synthetic */ int n;

    public /* synthetic */ hh3(int r1) {
        this.n = r1;
    }

    public static final boolean d(ge3 r5) {
        ge3 r0 = y04.f;
        yw r1 = r5.n;
        int r2 = yw.k(r1, f.a);
        if (r2 != (-1)) goto L7;
        r2 = yw.k(r5.n, f.b);
    L7:
        if (r2 == (-1)) goto L10;
        r1 = yw.o(r1, r2 + 1, 0, 2);
    L15:
        return !xm4.e0(r1.q(), ".class", true);
    L10:
        if (r5.e() == null) goto L15;
        if (r1.d() != 2) goto L15;
        r1 = yw.q;
        goto L15
    }

    public static final void f(hh3 r8) {
        nl4 r0 = tv3.z;
    L3:
        nl4 r1 = tv3.z;
        vf3 r2 = (vf3) r1.getValue();
        nf3 r3 = r2.p;
        ob2 r4 = (ob2) r3.get(r8);
        if (r4 != null) goto L6;
        vf3 r5 = r2;
    L27:
        if (r2 == r5) goto L30;
        if (r1.j(r2, r5) == false) goto L3;
        return;
    L30:
        return;
    L6:
        Object r6 = r4.a;
        Object r7 = r4.b;
        xx4 r9 = r3.n;
        if (r8 == null) goto L9;
        int r10 = r8.hashCode();
    L10:
        xx4 r11 = r9.v(r10, 0, r8);
        if (r9 == r11) goto L16;
        if (r11 != null) goto L15;
        r3 = nf3.p;
        goto L16
    L15:
        r3 = new nf3(r11, r3.o - 1);
    L16:
        fz0 r12 = fz0.Z;
        if (r6 == r12) goto L19;
        Object r13 = r3.get(r6);
        r13.getClass();
        r3 = r3.a(r6, new ob2(((ob2) r13).a, r7));
    L19:
        if (r7 == r12) goto L21;
        Object r14 = r3.get(r7);
        r14.getClass();
        r3 = r3.a(r7, new ob2(r6, ((ob2) r14).b));
    L21:
        if (r6 == r12) goto L23;
        Object r15 = r2.n;
    L24:
        if (r7 == r12) goto L26;
        r6 = r2.o;
    L26:
        r5 = new vf3(r15, r6, r3);
        goto L27
    L23:
        r15 = r7;
        goto L24
    L9:
        r10 = 0;
        goto L10
    }

    public static k03 h(String r4, String r5) {
        k03 r0 = new k03();
        wo0 r1 = App.e(ud3.D()).i();
        r1.getClass();
        Log.d("BrowsingClient", "createShare()");
        ((hd4) r1.o).c(((pn4) r1.n).f(), r4, r5, null).enqueue(new q8(r0, 4));
        return r0;
    }

    public static pr3 i(String r2) {
        if (r2.equals("http/1.0") == false) goto L7;
        return pr3.p;
    L7:
        if (r2.equals("http/1.1") == false) goto L11;
        return pr3.q;
    L11:
        if (r2.equals("h2_prior_knowledge") == false) goto L15;
        return pr3.t;
    L15:
        if (r2.equals("h2") == false) goto L19;
        return pr3.s;
    L19:
        if (r2.equals("spdy/3.1") == false) goto L23;
        return pr3.r;
    L23:
        if (r2.equals("quic") == false) goto L27;
        return pr3.u;
    L27:
        if (xm4.k0(r2, "h3", false) == true) goto L29;
        mj0.i("Unexpected protocol: ".concat(r2));
        return null;
    L29:
        return pr3.v;
    }

    public static k03 k() {
        k03 r0 = new k03(new ArrayList());
        wo0 r1 = App.f(false).h();
        r1.getClass();
        Log.d("PodcastClient", "getNewestPodcasts()");
        ((hn3) r1.o).f(((pn4) r1.n).f(), 20).enqueue(new ck(r0, 1));
        return r0;
    }

    public static k03 l(String r4, boolean r5) {
        k03 r0 = new k03(new ArrayList());
        wo0 r1 = App.f(false).h();
        r1.getClass();
        Log.d("PodcastClient", "getPodcasts()");
        ((hn3) r1.o).c(((pn4) r1.n).f(), r5, r4).enqueue(new r8(r0, 2));
        return r0;
    }

    public static k03 m() {
        k03 r0 = new k03(new ArrayList());
        wo0 r1 = App.f(false).i();
        r1.getClass();
        Log.d("BrowsingClient", "getShares()");
        ((hd4) r1.o).b(((pn4) r1.n).f()).enqueue(new p8(r0, 5));
        return r0;
    }

    private final void n() {
    }

    private final void o(Call r1, Throwable r2) {
    }

    private final void p(Call r1, Throwable r2) {
    }

    private final void q(Call r1, Response r2) {
    }

    private final void r(Call r1, Response r2) {
    }

    private final void s(int r1, Object r2) {
    }

    @Override // defpackage.d04
    public c04 a(a r1, s92 r2, f04 r3, Context r4) {
        return new c04(r1, r2, r3, r4);
    }

    @Override // defpackage.gh3
    public Typeface b(gb1 r2, int r3) {
        if (r3 == 0) goto L4;
    L7:
        int r1 = h12.j(r2.n, gb1.o.n);
        int r4 = 0;
        if (r1 < 0) goto L10;
        boolean r5 = true;
    L11:
        if (r3 != 1) goto L13;
        boolean r6 = true;
    L14:
        if (r6 == false) goto L17;
        if (r5 == false) goto L17;
        r4 = 3;
    L22:
        return Typeface.defaultFromStyle(r4);
    L17:
        if (r5 == false) goto L19;
        r4 = 1;
        goto L22
    L19:
        if (r6 == false) goto L22;
        r4 = 2;
        goto L22
    L13:
        r6 = false;
        goto L14
    L10:
        r5 = false;
        goto L11
    L4:
        if (h12.c(r2, gb1.p) == false) goto L7;
        return Typeface.DEFAULT;
    }

    @Override // defpackage.sq3
    public void c() {
        switch(this.n) {
            case 3: goto L6;
            default: goto L4;
        };
    L4:
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
        return;
    }

    @Override // defpackage.sq3
    public void e(int r3, Object r4) {
        switch(this.n) {
            case 3: goto L25;
            default: goto L4;
        };
    L4:
        switch(r3) {
            case 1: goto L15;
            case 2: goto L14;
            case 3: goto L13;
            case 4: goto L12;
            case 5: goto L11;
            case 6: goto L10;
            case 7: goto L9;
            case 8: goto L8;
            case 9: goto L5;
            case 10: goto L7;
            case 11: goto L6;
            default: goto L5;
        };
    L5:
        String r2 = "";
    L17:
        if (r3 != 6) goto L19;
    L23:
        Log.e("ProfileInstaller", r2, (Throwable) r4);
        return;
    L19:
        if (r3 == 7) goto L23;
        if (r3 == 8) goto L23;
        Log.d("ProfileInstaller", r2);
        return;
    L6:
        r2 = "RESULT_DELETE_SKIP_FILE_SUCCESS";
        goto L17
    L7:
        r2 = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
        goto L17
    L8:
        r2 = "RESULT_PARSE_EXCEPTION";
        goto L17
    L9:
        r2 = "RESULT_IO_EXCEPTION";
        goto L17
    L10:
        r2 = "RESULT_BASELINE_PROFILE_NOT_FOUND";
        goto L17
    L11:
        r2 = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
        goto L17
    L12:
        r2 = "RESULT_NOT_WRITABLE";
        goto L17
    L13:
        r2 = "RESULT_UNSUPPORTED_ART_VERSION";
        goto L17
    L14:
        r2 = "RESULT_ALREADY_INSTALLED";
        goto L17
    L15:
        r2 = "RESULT_INSTALL_SUCCESS";
        goto L17
    }

    @Override // defpackage.q51
    public Object g() {
        return new j44(MessageDigest.getInstance("SHA-256"));
    L4:
        e = move-exception;
        er1.m(e);
        return null;
    }

    public k03 j() {
        k03 r0 = new k03(new ArrayList());
        xc5 r2 = App.f(false).d();
        r2.getClass();
        Log.d("InternetRadioClient", "getInternetRadioStations()");
        ((x02) r2.p).a(((pn4) r2.o).f()).enqueue(new hd5(this, r0, false, 18));
        return r0;
    }

    @Override // retrofit2.Callback
    public void onFailure(Call r1, Throwable r2) {
        switch(this.n) {
            case 8: goto L7;
            case 9: goto L5;
            case 25: goto L4;
            default: goto L4;
        };
    L4:
        return;
    L5:
        Log.e("QueueRepository", "deleteBookmark failed", r2);
        return;
    L7:
        Log.e("QueueRepository", "Play queue save failed", r2);
    }

    @Override // retrofit2.Callback
    public void onResponse(Call r2, Response r3) {
        switch(this.n) {
            case 8: goto L10;
            case 9: goto L6;
            case 25: goto L4;
            default: goto L4;
        };
    L4:
        return;
    L6:
        if (r3.isSuccessful() == true) goto L14;
        Log.w("QueueRepository", "deleteBookmark failed with code: " + r3.code());
        return;
    L14:
        return;
    L10:
        if (r3.isSuccessful() == false) goto L12;
        Log.d("QueueRepository", "Play queue saved successfully");
        return;
    L12:
        Log.d("QueueRepository", "Play queue save failed with code: " + r3.code());
    }

    @Override // defpackage.n64
    public void onScrollLimit(int r1, int r2, int r3, boolean r4) {
    }

    @Override // defpackage.n64
    public void onScrollProgress(int r1, int r2, int r3, int r4) {
    }

    public String toString() {
        switch(this.n) {
            case 19: goto L10;
            case 20: goto L8;
            case 21: goto L6;
            default: goto L5;
        };
    L6:
        int r5 = hashCode();
        ya4.g(16);
        String r6 = Integer.toString(r5, 16);
        r6.getClass();
        return f34.h("CreationExtras.Key@", r6, "<", kx3.a(Bundle.class).c(), ">");
    L8:
        int r7 = hashCode();
        ya4.g(16);
        String r8 = Integer.toString(r7, 16);
        r8.getClass();
        return f34.h("CreationExtras.Key@", r8, "<", kx3.a(f75.class).c(), ">");
    L10:
        int r9 = hashCode();
        ya4.g(16);
        String r10 = Integer.toString(r9, 16);
        r10.getClass();
        return f34.h("CreationExtras.Key@", r10, "<", kx3.a(j54.class).c(), ">");
    L5:
        return super.toString();
    }
}
