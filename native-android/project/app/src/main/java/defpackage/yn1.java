package defpackage;

import com.eddyizm.tempus.homemusic.HubAuthOptions;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yn1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ String o;
    public final /* synthetic */ fo1 p;

    public /* synthetic */ yn1(fo1 r2, String r3) {
        this.n = 0;
        this.p = r2;
        this.o = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.n) {
            case 0: goto L37;
            default: goto L4;
        };
    L4:
        n83 r0 = rr1.k().a();
        r0.k = be0.g;
        r0.a(15, TimeUnit.SECONDS);
        o83 r1 = new o83(r0);
        nz3 r2 = new nz3();
        String r6 = this.o;
        r2.d(r6.concat("/rest/ping.view?v=1.16.1&c=HomeMusic&f=json"));
        Object r3 = null;
        k14 r4 = new bv3(r1, new oz3(r2)).c();     // Catch: Exception -> L24
        n14 r5 = r4.t;     // Catch: Throwable -> L9
        if (r5 == null) goto L11;
        String r7 = r5.string();     // Catch: Throwable -> L9
    L12:
        if (r7 != null) goto L14;
        r7 = "";
    L14:
        if (qm4.o0(r7, "subsonic-response") == false) goto L17;
        int r8 = 0;
    L18:
        r4.close();     // Catch: Exception -> L24
    L19:
        int r9 = r8;
        if (r9 == 0) goto L43;
    L35:
        io1.b.post(new ct0(this.p, r9, r6, r3, 1));
        return;
    L43:
        Object r10 = (HubAuthOptions) rr1.s(null, "/api/auth/options", HubAuthOptions.class);     // Catch: Throwable -> L28
    L31:
        if ((r10 instanceof s14) == true) goto L34;
        r3 = r10;
    L34:
        r3 = (HubAuthOptions) r3;
    L28:
        th = move-exception;
        r10 = new s14(th);
        goto L31
    L17:
        r8 = 2;
        goto L18
    L11:
        r7 = null;
    L9:
        th = move-exception;
        throw th;     // Catch: Throwable -> L21
    L21:
        th = move-exception;
        q05.h(r4, th);     // Catch: Exception -> L24
        throw th;     // Catch: Exception -> L24
    L24:
        r8 = 1;
        goto L19
    L37:
        String r11 = this.o;
        rr1 r12 = rr1.a;     // Catch: Throwable -> L40
        Map r13 = Collections.singletonMap("email", r11);     // Catch: Throwable -> L40
        r13.getClass();     // Catch: Throwable -> L40
        rr1.s(r13, "/api/auth/email/code", wr1.class);     // Catch: Throwable -> L40
        throw new ClassCastException();     // Catch: Throwable -> L40
    L40:
        th = move-exception;
        s14 r14 = new s14(th);
        io1.b.post(new v6(this.p, r14, r11, 11));
    }

    public /* synthetic */ yn1(String r2, fo1 r3) {
        this.n = 1;
        this.o = r2;
        this.p = r3;
    }
}
