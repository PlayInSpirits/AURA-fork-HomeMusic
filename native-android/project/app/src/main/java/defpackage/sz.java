package defpackage;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sz implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public sz(View r2, ta5 r3, qr2 r4, ValueAnimator r5) {
        this.n = 4;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        int r2 = 1;
        int r4 = 0;
        Object r5 = this.r;
        Object r6 = this.q;
        Object r7 = this.p;
        Object r11 = this.o;
        switch(r0) {
            case 0: goto L51;
            case 1: goto L43;
            case 2: goto L14;
            case 3: goto L6;
            default: goto L4;
        };
    L4:
        pa5.i((View) r11, (ta5) r7, (qr2) r6);
        ((ValueAnimator) r5).start();
        return;
    L6:
        String r8 = (String) r7;
        pz1 r9 = (pz1) r5;
        oj2 r12 = (oj2) ((pn2) r9.o).r.get(((Messenger) ((hg3) r11).o).getBinder());
        if (r12 != null) goto L9;
        xa3.s("getMediaItem for callback that isn't registered id=", r8, "MBServiceCompat");
        return;
    L9:
        pn2 r1 = (pn2) r9.o;
        nj2 r3 = new nj2(r8, (v14) r6, r4);
        r1.s = r12;
        r1.e(r8, r3);
        r1.s = null;
        if (r3.b() == true) goto L70;
        kf2.o(xa3.g("onLoadItem must call detach() or sendResult() before returning for id=", r8));
        return;
    L70:
        return;
    L14:
        String r10 = (String) r7;
        pz1 r13 = (pz1) r5;
        oj2 r14 = (oj2) ((pn2) r13.o).r.get(((Messenger) ((hg3) r11).o).getBinder());
        if (r14 != null) goto L17;
        xa3.s("removeSubscription for callback that isn't registered id=", r10, "MBServiceCompat");
        return;
    L17:
        HashMap r15 = r14.f;
        pn2 r16 = (pn2) r13.o;
        IBinder r17 = (IBinder) r6;
        if (r17 == null) goto L20;
        List r18 = (List) r15.get(r10);     // Catch: Throwable -> L24
        if (r18 == null) goto L37;
        Iterator r19 = r18.iterator();     // Catch: Throwable -> L24
    L30:
        if (r19.hasNext() == false) goto L35;
        if (r17 != ((ld3) r19.next()).a) goto L30;
        r19.remove();     // Catch: Throwable -> L24
        r4 = 1;
        goto L30
    L35:
        if (r18.isEmpty() == false) goto L37;
        r15.remove(r10);     // Catch: Throwable -> L24
    L37:
        r16.s = r14;
        r16.f(r10);
        r16.s = null;
        r2 = r4;
    L38:
        if (r2 != 0) goto L72;
        l93.q0("MBServiceCompat", "removeSubscription called for " + r10 + " which is not subscribed");
        return;
    L72:
        return;
    L20:
        if (r15.remove(r10) != null) goto L23;
        r2 = 0;
    L23:
        r16.s = r14;
        r16.f(r10);
        r16.s = null;
    L24:
        th = move-exception;
        r16.s = r14;
        r16.f(r10);
        r16.s = null;
        throw th;
    L43:
        bq4 r20 = (bq4) r5;
    L44:
        oi r21 = ((pn2) r20.q).r;
        if (r4 >= r21.p) goto L50;
        oj2 r22 = (oj2) r21.j(r4);
        if (r22.d.equals((ms2) r11) == false) goto L49;
        r20.o(r22, (String) r7, (Bundle) r6);
    L49:
        r4 = r4 + 1;
        goto L44
    L50:
        return;
    L51:
        uz r23 = (uz) ((d34) r5).o;
        tu2 r24 = (tu2) r7;
        tz r110 = (tz) r11;
        if (r110 == null) goto L55;
        r23.M = true;
        r110.b.c(false);
        r23.M = false;
    L55:
        if (r24.isEnabled() == true) goto L57;
        return;
    L57:
        if (r24.hasSubMenu() == false) goto L74;
        ((qu2) r6).q(r24, null, 4);
        return;
    }

    public /* synthetic */ sz(Object r1, Object r2, Object r3, Object r4, int r5) {
        this.n = r5;
        this.r = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
    }
}
