package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gt0 implements Handler.Callback {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ gt0(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message r8) {
        int r0 = this.n;
        Object r7 = this.o;
        switch(r0) {
            case 0: goto L38;
            case 1: goto L27;
            case 2: goto L21;
            case 3: goto L17;
            default: goto L4;
        };
    L4:
        w12 r9 = (w12) r7;
        int r10 = r8.what;
        if (r10 == 1) goto L15;
        if (r10 == 2) goto L14;
        if (r10 != 3) goto L9;
        ((bn4) r9.j).a();
    L16:
        return true;
    L9:
        if (r10 != 4) goto L79;
        ((cn4) r9.k).a();
        goto L16
    L79:
        return false;
    L14:
        ((an4) r9.i).a();
        goto L16
    L15:
        ((zm4) r9.h).a();
        goto L16
    L17:
        gm2 r11 = (gm2) r7;
        if (r8.what != 1) goto L20;
        im2 r12 = r11.e;
        r12.b1(false, r12.n);
    L20:
        return true;
    L21:
        rf2 r13 = (rf2) r7;
        if (r8.what == 1) goto L70;
    L26:
        return true;
    L70:
        bm2 r14 = (bm2) r13.o;     // Catch: RemoteException -> L25
        r14.D.p0(r14.c);     // Catch: RemoteException -> L25
    L25:
        l93.q0("MCImplBase", "Error in sending flushCommandQueue");
        goto L26
    L27:
        tc2 r15 = (tc2) r7;
        rc2 r16 = r15.c;
        r16.getClass();
        Iterator r1 = r15.d.iterator();
    L29:
        if (r1.hasNext() == false) goto L37;
        sc2 r2 = (sc2) r1.next();
        if (r2.d == false) goto L33;
    L35:
        yp4 r3 = r15.b;
        r3.getClass();
        if (r3.a.hasMessages(1) == false) goto L29;
    L33:
        if (r2.c == false) goto L35;
        w71 r5 = r2.b.f();
        r2.b = new xk0(2);
        r2.c = false;
        r16.f(r2.a, r5);
    L37:
        return true;
    L38:
        lt0 r17 = (lt0) r7;
        CopyOnWriteArraySet r4 = r17.e;
        int r6 = r8.what;
        if (r6 == 1) goto L63;
        if (r6 == 2) goto L56;
        if (r6 != 3) goto L55;
        ht0 r18 = (ht0) r8.obj;
        r17.l = Collections.unmodifiableList(r18.c);
        ns0 r19 = r18.a;
        boolean r20 = r17.e();
        if (r18.b == false) goto L48;
        Iterator r21 = r4.iterator();
    L46:
        if (r21.hasNext() == false) goto L52;
        ((jt0) r21.next()).d(r19);
    L52:
        if (r20 == false) goto L69;
        r17.a();
    L69:
        return true;
    L48:
        Iterator r22 = r4.iterator();
    L50:
        if (r22.hasNext() == false) goto L52;
        ((jt0) r22.next()).b(r17, r19);
        goto L50
    L55:
        tb4.a();
        return false;
    L56:
        int r23 = r8.arg1;
        int r24 = r8.arg2;
        int r25 = r17.f - r23;
        r17.f = r25;
        r17.g = r24;
        if (r24 != 0) goto L69;
        if (r25 != 0) goto L69;
        Iterator r26 = r4.iterator();
    L61:
        if (r26.hasNext() == false) goto L69;
        ((jt0) r26.next()).e();
        goto L61
    L63:
        List r27 = (List) r8.obj;
        r17.h = true;
        r17.l = Collections.unmodifiableList(r27);
        boolean r28 = r17.e();
        Iterator r29 = r4.iterator();
    L65:
        if (r29.hasNext() == false) goto L67;
        ((jt0) r29.next()).a(r17);
        goto L65
    L67:
        if (r28 == false) goto L69;
        r17.a();
        goto L69
    }
}
