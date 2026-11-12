package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ed1 implements w92 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public ed1(td0 r2, ed r3, tv3 r4, jx3 r5) {
        this.n = 1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
    }

    @Override // defpackage.w92
    public final void b(ba2 r11, q92 r12) {
        switch(this.n) {
            case 0: goto L55;
            default: goto L4;
        };
    L4:
        az r0 = null;
        switch(gc5.a[r12.ordinal()]) {
            case 1: goto L53;
            case 2: goto L17;
            case 3: goto L8;
            case 4: goto L7;
            case 5: goto L74;
            case 6: goto L74;
            case 7: goto L74;
            default: goto L6;
        };
    L6:
        er1.n();
        return;
    L7:
        ((tv3) this.q).x();
        return;
    L8:
        tv3 r10 = (tv3) this.q;
        Object r13 = r10.c;
        monitor-enter(r13);
        r10.t = true;     // Catch: Throwable -> L13
        monitor-exit(r13);
        return;
    L13:
        th = move-exception;
        throw th;
    L17:
        ed r14 = (ed) this.p;
        if (r14 == null) goto L40;
        ll r15 = (ll) r14.p;
        Object r2 = r15.p;
        monitor-enter(r2);
        Object r3 = r15.p;     // Catch: Throwable -> L31
        monitor-enter(r3);     // Catch: Throwable -> L31
        boolean r4 = r15.o;     // Catch: Throwable -> L34
        monitor-exit(r3);     // Catch: Throwable -> L31
        if (r4 == false) goto L28;
    L26:
        monitor-exit(r2);
        goto L40
    L28:
        ArrayList r5 = (ArrayList) r15.q;     // Catch: Throwable -> L31
        r15.q = (ArrayList) r15.r;     // Catch: Throwable -> L31
        r15.r = r5;     // Catch: Throwable -> L31
        r15.o = true;     // Catch: Throwable -> L31
        int r16 = r5.size();     // Catch: Throwable -> L31
        int r1 = 0;
    L29:
        if (r1 >= r16) goto L33;
        ((vd0) r5.get(r1)).resumeWith(j15.a);     // Catch: Throwable -> L31
        r1 = r1 + 1;     // Catch: Throwable -> L31
        goto L29
    L33:
        r5.clear();     // Catch: Throwable -> L31
        goto L26
    L34:
        th = move-exception;
        throw th;     // Catch: Throwable -> L31
    L31:
        th = move-exception;
        throw th;
    L40:
        tv3 r17 = (tv3) this.q;
        Object r18 = r17.c;
        monitor-enter(r18);
    L46:
        th = move-exception;
        throw th;
    L43:
        if (r17.t == false) goto L48;
        r17.t = false;     // Catch: Throwable -> L46
        r0 = r17.y();     // Catch: Throwable -> L46
    L48:
        monitor-exit(r18);
        if (r0 == null) goto L77;
        ((cz) r0).resumeWith(j15.a);
        return;
    L77:
        return;
    L53:
        fu.G((td0) this.o, null, ze0.q, new x70((jx3) this.r, (tv3) this.q, r11, this, null, 8), 1);
        return;
    L74:
        return;
    L55:
        ld1 r19 = (ld1) this.r;
        Map r110 = r19.k;
        String r6 = (String) this.o;
        if (r12 != q92.ON_START) goto L63;
        Bundle r7 = (Bundle) r110.get(r6);
        if (r7 == null) goto L63;
        ((zd1) this.p).d(r6, r7);
        r110.remove(r6);
        if (ld1.I(2) == false) goto L63;
        Log.v("FragmentManager", "Clearing fragment result with key ".concat(r6));
    L63:
        if (r12 != q92.ON_DESTROY) goto L80;
        ((ea2) this.q).f(this);
        r19.l.remove(r6);
        return;
    }

    public ed1(ld1 r2, String r3, zd1 r4, ea2 r5) {
        this.n = 0;
        this.r = r2;
        this.o = r3;
        this.p = r4;
        this.q = r5;
    }
}
