package defpackage;

import android.os.Handler;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tl0 implements w92 {
    public final /* synthetic */ int n;
    public final Object o;
    public final Object p;

    public tl0(aa2 r3) {
        this.n = 5;
        this.o = r3;
        l30 r0 = l30.c;
        Class<?> r4 = r3.getClass();
        j30 r1 = (j30) r0.a.get(r4);
        if (r1 != null) goto L6;
        r1 = r0.a(r4, null);
    L6:
        this.p = r1;
    }

    @Override // defpackage.w92
    public final void b(ba2 r4, q92 r5) {
        int r0 = this.n;
        Object r1 = this.o;
        Object r2 = this.p;
        switch(r0) {
            case 0: goto L32;
            case 1: goto L25;
            case 2: goto L22;
            case 3: goto L18;
            case 4: goto L6;
            default: goto L4;
        };
    L4:
        HashMap r3 = ((j30) r2).a;
        j30.a((List) r3.get(r5), r4, r5, r1);
        j30.a((List) r3.get(q92.ON_ANY), r4, r5, r1);
        return;
    L6:
        u83 r6 = (u83) r1;
        int r7 = z83.a[r5.ordinal()];
        if (r7 != 1) goto L9;
        r6.b(true);
        return;
    L9:
        if (r7 != 2) goto L11;
        r6.b(false);
        return;
    L11:
        if (r7 != 3) goto L48;
        r6.a();
        ((ea2) r2).f(this);
        return;
    L48:
        return;
    L25:
        ke1 r8 = (ke1) r1;
        ee1 r9 = (ee1) r2;
        if (r9.r.N() == true) goto L52;
        r4.h().f(this);
        FrameLayout r10 = (FrameLayout) r8.a;
        WeakHashMap r11 = j65.a;
        if (r10.isAttachedToWindow() == false) goto L51;
        r9.u(r8);
        return;
    L51:
        return;
    L52:
        return;
    L32:
        rl0 r12 = (rl0) r1;
        switch(sl0.a[r5.ordinal()]) {
            case 1: goto L41;
            case 2: goto L40;
            case 3: goto L39;
            case 4: goto L38;
            case 5: goto L37;
            case 6: goto L36;
            case 7: goto L35;
            default: goto L34;
        };
    L34:
        er1.n();
        return;
    L35:
        kf2.n("ON_ANY must not been send by anybody");
        return;
    L36:
        r12.onDestroy(r4);
    L42:
        w92 r13 = (w92) r2;
        if (r13 == null) goto L55;
        r13.b(r4, r5);
        return;
    L55:
        return;
    L37:
        r12.onStop(r4);
        goto L42
    L38:
        r12.getClass();
        goto L42
    L39:
        r12.j(r4);
        goto L42
    L40:
        r12.onStart(r4);
        goto L42
    L41:
        r12.getClass();
        goto L42
    L18:
        if (r5 != q92.ON_START) goto L49;
        ((ea2) r1).f(this);
        ((rm3) r2).P();
        return;
    L49:
        return;
    L22:
        if (r5 != q92.ON_DESTROY) goto L50;
        ((Handler) r1).removeCallbacks((g5) r2);
        r4.h().f(this);
        return;
    }

    public tl0(rl0 r2, w92 r3) {
        this.n = 0;
        r2.getClass();
        this.o = r2;
        this.p = r3;
    }

    public /* synthetic */ tl0(int r1, Object r2, Object r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    public tl0(u83 r1, a93 r2, ea2 r3) {
        this.n = 4;
        this.o = r1;
        this.p = r3;
    }

    public tl0(ee1 r2, ke1 r3) {
        this.n = 1;
        this.p = r2;
        this.o = r3;
    }
}
