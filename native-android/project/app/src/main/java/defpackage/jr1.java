package defpackage;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jr1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ ic2 o;

    public /* synthetic */ jr1(bl2 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        Object r1 = null;
        ic2 r3 = this.o;
        switch(r0) {
            case 0: goto L69;
            case 1: goto L73;
            case 2: goto L78;
            default: goto L75;
        };
    L69:
        Object r4 = (bj2) r3.get();     // Catch: Throwable -> L55
    L58:
        if ((r4 instanceof s14) == true) goto L61;
        r1 = r4;
    L61:
        bj2 r2 = (bj2) r1;
        if (r2 != null) goto L65;
        return;
    L65:
        if (lr1.a.get() == r2) goto L90;
        r2.v(lr1.b);
        lr1.a = new WeakReference(r2);
        return;
    L90:
        return;
    L55:
        th = move-exception;
        r4 = new s14(th);
        goto L58
    L73:
        Object r5 = (bj2) r3.get();     // Catch: Throwable -> L38
    L41:
        if ((r5 instanceof s14) == true) goto L44;
        r1 = r5;
    L44:
        bj2 r6 = (bj2) r1;
        if (r6 != null) goto L48;
        return;
    L48:
        if (r6.h0() == false) goto L50;
    L51:
        r6.c();
        return;
    L50:
        if (r6.q() == true) goto L51;
        return;
    L38:
        th = move-exception;
        r5 = new s14(th);
        goto L41
    L75:
    L20:
        e = e;
    L21:
        e.printStackTrace();
        return;
    L5:
        if (r3.isDone() == true) goto L7;
        return;
    L7:
        if (((bj2) r3.get()).Q0() < 1) goto L9;
        return;
    L9:
        if (ra0.b() == true) goto L83;
    L18:
        e = e;
        goto L21
    L12:
        List r7 = new vs3().b();     // Catch: Throwable -> L20 Throwable -> L20
        if (r7 != null) goto L15;
        return;
    L15:
        if (r7.size() < 1) goto L82;
        r3.f(new ws1(18, r3, r7), gq0.n);     // Catch: InterruptedException -> L18 Throwable -> L20
    L84:
        return;
    L82:
        return;
    L83:
        return;
    L78:
    L33:
        e = e;
    L34:
        e.printStackTrace();
        return;
    L24:
        if (r3.isDone() == true) goto L26;
        return;
    L26:
        if (((bj2) r3.get()).h0() == false) goto L28;
        ((bj2) r3.get()).c();     // Catch: Throwable -> L33
    L28:
        ((bj2) r3.get()).stop();     // Catch: Throwable -> L33
        ((bj2) r3.get()).r();     // Catch: Throwable -> L33
        vs3 r8 = new vs3();     // Catch: InterruptedException -> L31 Throwable -> L33
        ExecutorService r9 = vs3.b;     // Catch: InterruptedException -> L31 Throwable -> L33
        ns3 r10 = r8.a;     // Catch: InterruptedException -> L31 Throwable -> L33
        Objects.requireNonNull(r10);     // Catch: InterruptedException -> L31 Throwable -> L33
        r9.execute(new jq3(1, r10));     // Catch: InterruptedException -> L31 Throwable -> L33
    L86:
        return;
    L31:
        e = e;
        goto L34
    }
}
