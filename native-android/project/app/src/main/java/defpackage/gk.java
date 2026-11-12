package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.eddyizm.tempus.model.Queue;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gk implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ gk(Object r1, int r2, Object r3, int r4) {
        this.n = r4;
        this.p = r1;
        this.o = r2;
        this.q = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r1 = this.n;
        p5 r2 = null;
        int r4 = 0;
        Object r6 = this.q;
        int r7 = this.o;
        Object r0 = this.p;
        switch(r1) {
            case 0: goto L79;
            case 1: goto L67;
            case 2: goto L65;
            case 3: goto L63;
            case 4: goto L61;
            case 5: goto L52;
            case 6: goto L34;
            case 7: goto L18;
            case 8: goto L16;
            default: goto L4;
        };
    L4:
        Child r8 = (Child) r6;
        ns3 r3 = ((vs3) r0).a;
        new ArrayList();
        List r5 = r3.c();
        if (r7 >= 0) goto L8;
        r7 = 0;
    L10:
        r5.add(r7, new Queue(r8));
        int r9 = 0;
    L12:
        if (r9 >= r5.size()) goto L14;
        ((Queue) r5.get(r9)).setTrackOrder(r9);
        r9 = r9 + 1;
        goto L12
    L14:
        xl.E((s24) r3.o, false, true, new ls3(r3, r5, r4));
        return;
    L8:
        if (r7 <= r5.size()) goto L10;
        r7 = r5.size();
        goto L10
    L16:
        Pair r10 = (Pair) r6;
        ((nj0) ((zt2) r0).o.i).p(((Integer) r10.first).intValue(), (mt2) r10.second, r7);
        return;
    L18:
        ic2 r11 = (ic2) r0;
        List r12 = (List) r6;
    L31:
        e = e;
    L32:
        e.printStackTrace();
        return;
    L20:
        if (r11.isDone() == false) goto L102;
        Log.e("MediaManager", "remove");     // Catch: Throwable -> L31
        if (((bj2) r11.get()).Q0() > 1) goto L24;
        return;
    L24:
        if (((bj2) r11.get()).o0() == r7) goto L104;
        ((bj2) r11.get()).N(r7);     // Catch: Throwable -> L31
        if (r7 == (-1)) goto L105;
        r12.remove(r7);     // Catch: InterruptedException -> L29 Throwable -> L31
        new vs3().c(r12, true, 0);     // Catch: InterruptedException -> L29 Throwable -> L31
    L106:
        return;
    L29:
        e = e;
        goto L32
    L105:
        return;
    L104:
        return;
    L102:
        return;
    L34:
        bm2 r13 = (bm2) r0;
        ab4 r14 = (ab4) ((ic2) r6).get();     // Catch: InterruptedException -> L37 ExecutionException -> L39 CancellationException -> L41
        rr2.s(r14, "SessionResult must not be null");     // Catch: InterruptedException -> L37 ExecutionException -> L39 CancellationException -> L41
    L45:
        pu1 r15 = r13.D;
        if (r15 == null) goto L107;
        r15.a(r13.c, r7, r14.b());     // Catch: RemoteException -> L50
        return;
    L50:
        l93.q0("MCImplBase", "Error in sending");
        return;
    L107:
        return;
    L37:
        e = e;
    L43:
        l93.r0("MCImplBase", "Session operation failed", e);
        r14 = new ab4(-1);
    L41:
        e = move-exception;
        l93.r0("MCImplBase", "Session operation cancelled", e);
        r14 = new ab4(1);
    L39:
        e = e;
        goto L43
    L52:
        qc2 r16 = (qc2) r6;
        Iterator r17 = ((CopyOnWriteArraySet) r0).iterator();
    L54:
        if (r17.hasNext() == false) goto L60;
        sc2 r18 = (sc2) r17.next();
        if (r18.d == true) goto L54;
        if (r7 == (-1)) goto L59;
        r18.b.b(r7);
    L59:
        r18.c = true;
        r16.invoke(r18.a);
        goto L54
    L60:
        return;
    L61:
        sw0 r19 = (sw0) r0;
        ((tw0) r6).p(r19.a, r19.b, r7);
        return;
    L63:
        ((sq3) ((ip0) r0).c).e(r7, r6);
        return;
    L65:
        ((j70) r0).a(r7, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) r6));
        return;
    L67:
        j70 r20 = (j70) r0;
        Serializable r21 = (Serializable) ((zh0) r6).o;
        String r22 = (String) r20.a.get(Integer.valueOf(r7));
        if (r22 == null) goto L111;
        u5 r23 = (u5) r20.e.get(r22);
        if (r23 == null) goto L73;
        r2 = r23.a;
    L73:
        if (r2 != null) goto L75;
        r20.g.remove(r22);
        r20.f.put(r22, r21);
        return;
    L75:
        p5 r24 = r23.a;
        if (r20.d.remove(r22) == false) goto L110;
        r24.i(r21);
        return;
    L110:
        return;
    L111:
        return;
    L79:
        Bundle r25 = (Bundle) r6;
        v23 r26 = ((MainActivity) ((c12) r0).o).T;
        if (r26 != null) goto L83;
        return;
    L83:
        if (r26.g() != null) goto L85;
    L87:
        r26.m(r7, r25, null);
        return;
    L85:
        if (r26.g().u != r7) goto L87;
        r26.m(r7, r25, new y23(true, false, -1, false, false, -1, -1, -1, -1));
    }

    public /* synthetic */ gk(Object r1, Object r2, int r3, int r4) {
        this.n = r4;
        this.p = r1;
        this.q = r2;
        this.o = r3;
    }
}
