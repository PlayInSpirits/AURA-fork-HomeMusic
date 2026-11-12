package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ua4 implements Runnable {
    public final /* synthetic */ int n;
    public boolean o;
    public final Object p;
    public final Object q;

    public ua4(ea2 r2, q92 r3) {
        this.n = 0;
        r2.getClass();
        r3.getClass();
        this.p = r2;
        this.q = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.n) {
            case 0: goto L33;
            case 1: goto L15;
            default: goto L4;
        };
    L4:
        View r0 = (View) this.p;
        SwipeDismissBehavior r1 = (SwipeDismissBehavior) this.q;
        o65 r2 = r1.n;
        if (r2 == null) goto L10;
        if (r2.g() == false) goto L10;
        WeakHashMap r3 = j65.a;
        r0.postOnAnimation(this);
        return;
    L10:
        if (this.o == false) goto L37;
        zg5 r9 = r1.o;
        if (r9 == null) goto L38;
        r9.y(r0);
        return;
    L38:
        return;
    L37:
        return;
    L15:
        qi3 r4 = (qi3) this.p;
        yf4 r5 = (yf4) this.q;
        if (r5.g == true) goto L19;
        return;
    L19:
        if (this.o == true) goto L41;
        long r6 = r4.getDuration();
        long r7 = r4.M0();
        if (r6 > 0) goto L24;
    L30:
        r5.a.postDelayed(this, 500);
        return;
    L24:
        if (r6 == (-9223372036854775807L)) goto L30;
        long r8 = r6 - r7;
        if (r8 < 1) goto L30;
        if (r8 > 10000) goto L30;
        this.o = true;
        r5.c = false;
        r5.a.post(new pb0(r5, r4, new float[]{1.0f}, 6));
        return;
    L41:
        return;
    L33:
        if (this.o == true) goto L42;
        ((ea2) this.p).d((q92) this.q);
        this.o = true;
        return;
    }

    public ua4(yf4 r2, qi3 r3) {
        this.n = 1;
        this.q = r2;
        this.p = r3;
        this.o = false;
    }

    public ua4(SwipeDismissBehavior r2, View r3, boolean r4) {
        this.n = 2;
        this.q = r2;
        this.p = r3;
        this.o = r4;
    }
}
