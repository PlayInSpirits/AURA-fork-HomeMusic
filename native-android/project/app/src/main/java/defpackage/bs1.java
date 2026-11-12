package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.preference.Preference;
import com.eddyizm.tempus.homemusic.HubFragment;
import com.eddyizm.tempus.homemusic.HubUpdater;
import com.eddyizm.tempus.subsonic.models.Child;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bs1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ bs1(Object r1, Object r2, boolean r3, int r4) {
        this.n = r4;
        this.p = r1;
        this.q = r2;
        this.o = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        boolean r1 = true;
        boolean r2 = this.o;
        Object r3 = this.q;
        Object r4 = this.p;
        switch(r0) {
            case 0: goto L65;
            case 1: goto L50;
            case 2: goto L48;
            case 3: goto L46;
            case 4: goto L31;
            default: goto L4;
        };
    L4:
        ic2 r5 = (ic2) r4;
        Child r6 = (Child) r3;
    L28:
        e = e;
    L29:
        e.printStackTrace();
        return;
    L6:
        if (r5.isDone() == false) goto L84;
    L18:
        e = e;
        goto L29
    L8:
        if (u52.c().a == true) goto L79;
        Log.e("MediaManager", "enqueue");     // Catch: Throwable -> L28 Throwable -> L28
        rs1.i(Collections.singletonList(r6));     // Catch: Throwable -> L28 Throwable -> L28
        bj2 r10 = (bj2) r5.get();     // Catch: Throwable -> L28 Throwable -> L28
        int r7 = r10.o0();     // Catch: Throwable -> L28 Throwable -> L28
        int r8 = 9;
        if (r2 == true) goto L14;
    L20:
        int r11 = ((bj2) r5.get()).Q0();     // Catch: Throwable -> L28 Throwable -> L28
        vs3.b.execute(new gk(new vs3(), r11, r6, r8));     // Catch: InterruptedException -> L18 Throwable -> L28
        bj2 r12 = (bj2) r5.get();     // Catch: Throwable -> L28 Throwable -> L28
        gn2 r9 = gi1.K(r6);     // Catch: Throwable -> L28 Throwable -> L28
        r12.c1();     // Catch: InterruptedException -> L18 Throwable -> L28
        rk2 r13 = r12.d;     // Catch: InterruptedException -> L18 Throwable -> L28
        if (r13.Y() == true) goto L26;
        l93.q0("MediaController", "The controller is not connected. Ignoring addMediaItem().");     // Catch: InterruptedException -> L18 Throwable -> L28
        goto L79
    L26:
        r13.U0(r9);     // Catch: InterruptedException -> L18 Throwable -> L28
        goto L79
    L14:
        if (r7 == (-1)) goto L20;
        int r14 = r7 + 1;
        vs3.b.execute(new gk(new vs3(), r14, r6, r8));     // Catch: InterruptedException -> L18 Throwable -> L28
        bo2.i(new yn2(r10), r10, Collections.singletonList(gi1.K(r6)));     // Catch: Throwable -> L28 Throwable -> L28
    L79:
    L84:
        return;
    L31:
        ic2 r15 = (ic2) r4;
        List r16 = (List) r3;
    L43:
        e = e;
    L44:
        e.printStackTrace();
        return;
    L33:
        if (r15.isDone() == false) goto L88;
    L41:
        e = e;
        goto L44
    L35:
        if (u52.c().a == false) goto L38;
        return;
    L38:
        bo2.g(new yn2((bj2) r15.get()), r16, r2);     // Catch: Throwable -> L43 Throwable -> L43
        return;
    L88:
        return;
    L46:
        HubUpdater.e((Activity) r4, r2, (Serializable) r3);
        return;
    L48:
        ConcurrentHashMap r17 = ot1.a;
        ot1.g((Context) r4, ot1.h((String) r3), r2);
        return;
    L50:
        vb4 r18 = (vb4) r4;
        Preference r19 = (Preference) r3;
        if (r18.y() == false) goto L91;
        bu.g = r2;
        Preference r110 = r18.h0("homemusic_check_update");
        if (r110 != null) goto L56;
    L58:
        boolean r111 = false;
    L59:
        if (r2 == false) goto L62;
        if (r111 == false) goto L62;
    L63:
        r19.A(r1);
        return;
    L62:
        r1 = false;
        goto L63
    L56:
        if (r110.K != true) goto L58;
        r111 = true;
        goto L59
    L91:
        return;
    L65:
        HubFragment r20 = (HubFragment) r4;
        String r21 = (String) r3;
        List r22 = HubFragment.y0;
        boolean r23 = this.o;
        if (r23 == true) goto L82;
    L70:
        String r112 = rr1.c();     // Catch: Throwable -> L68
        rr1.h();     // Catch: Throwable -> L68
        Object r24 = r112;
    L73:
        io1.b.post(new b41(r20, r24, r21, r23, 1));
        return;
    L68:
        th = move-exception;
        r24 = new s14(th);
        goto L73
    L82:
        rr1.m();     // Catch: Throwable -> L68
        goto L70
    }

    public /* synthetic */ bs1(Object r1, boolean r2, Object r3, int r4) {
        this.n = r4;
        this.p = r1;
        this.o = r2;
        this.q = r3;
    }
}
