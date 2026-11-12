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

    public /* synthetic */ sn1(h62 r2, long r3, g62 r5) {
        this.n = 2;
        this.p = r2;
        this.o = r3;
        this.q = r5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Starred2 r2 = null;
        switch(this.n) {
            case 0: goto L18;
            case 1: goto L14;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        rf2 r0 = (rf2) this.p;
        Object r1 = this.q;
        long r3 = this.o;
        o55 r11 = (o55) r0.o;
        String r4 = f35.a;
        r11.u(r3, r1);
        return;
    L6:
        h62 r5 = (h62) this.p;
        long r6 = this.o;
        g62 r12 = (g62) this.q;
        if (r5.l0(r6) == true) goto L9;
        return;
    L9:
        if (r5.H0 != r12) goto L56;
        r5.H0 = null;
        if (r5.I0 == false) goto L57;
        r5.I0 = false;
        r5.q0();
        return;
    L57:
        return;
    L56:
        return;
    L14:
        long r7 = this.o;
        if1 r8 = (if1) this.p;
        JSONObject r13 = (JSONObject) this.q;
        if (u52.i != r7) goto L58;
        r8.invoke(r13);
        return;
    L58:
        return;
    L18:
        long r9 = this.o;
        String r10 = (String) this.p;
        Consumer r14 = (Consumer) this.q;
        vn1 r15 = vn1.n;     // Catch: Throwable -> L52
        if (cx.h() == false) goto L28;
        if (r10 == null) goto L26;
        rr1 r16 = rr1.a;     // Catch: Exception -> L29 Throwable -> L52
        List<Child> r17 = (List) rr1.B(r10, new e90(7));     // Catch: Exception -> L29 Throwable -> L52
    L24:
        List<Child> r18 = r17;
        if (((Number) r15.invoke()).longValue() != r9) goto L59;
        r18.getClass();     // Catch: Throwable -> L52
        io1.b.post(new un1(r9, r10, r14, r18, 0));     // Catch: Throwable -> L52
        return;
    L59:
        return;
    L26:
        throw new IllegalStateException("Required value was null.");     // Catch: Exception -> L29 Throwable -> L52
    L28:
        throw new IllegalStateException("Check failed.");     // Catch: Exception -> L29 Throwable -> L52
    L30:
        if (((Number) r15.invoke()).longValue() != r9) goto L51;
        Response r19 = App.f(false).a().s().execute();     // Catch: Throwable -> L52
        if (r19.isSuccessful() == false) goto L50;
        ApiResponse r20 = (ApiResponse) r19.body();     // Catch: Throwable -> L52
        if (r20 == null) goto L39;
        SubsonicResponse r21 = r20.getSubsonicResponse();     // Catch: Throwable -> L52
        if (r21 == null) goto L39;
        r2 = r21.getStarred2();     // Catch: Throwable -> L52
    L39:
        if (r2 == null) goto L48;
        List<Child> r22 = r2.getSongs();     // Catch: Throwable -> L52
        if (r22 != null) goto L43;
        r22 = u01.n;     // Catch: Throwable -> L52
    L43:
        r17 = r22;
        goto L24
    L48:
        throw new IllegalStateException("Required value was null.");     // Catch: Throwable -> L52
    L50:
        throw new IllegalStateException("Check failed.");     // Catch: Throwable -> L52
    L51:
        return;
    }

    public /* synthetic */ sn1(long r1, Object r3, Object r4, int r5) {
        this.n = r5;
        this.o = r1;
        this.p = r3;
        this.q = r4;
    }

    public /* synthetic */ sn1(rf2 r2, Object r3, long r4) {
        this.n = 3;
        this.p = r2;
        this.q = r3;
        this.o = r4;
    }
}
