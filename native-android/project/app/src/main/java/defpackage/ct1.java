package defpackage;

import android.content.Context;
import com.eddyizm.tempus.homemusic.SmartSession;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ct1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ SmartSession o;
    public final /* synthetic */ String p;
    public final /* synthetic */ Context q;

    public /* synthetic */ ct1(SmartSession r1, String r2, Context r3, int r4) {
        this.n = r4;
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        Context r1 = this.q;
        String r2 = this.p;
        SmartSession r5 = this.o;
        switch(r0) {
            case 0: goto L16;
            default: goto L18;
        };
    L16:
        Object r3 = rr1.t(r5.getId(), r2);     // Catch: Throwable -> L12
    L14:
        io1.b.post(new t6(r3, r5, r2, r1));
        return;
    L12:
        th = move-exception;
        r3 = new s14(th);
        goto L14
    L18:
        rr1.u(r5.getId(), r2);     // Catch: Throwable -> L6
        Object r6 = j15.a;     // Catch: Throwable -> L6
    L8:
        io1.b.post(new ws1(3, r6, r1));
        return;
    L6:
        th = move-exception;
        r6 = new s14(th);
        goto L8
    }
}
