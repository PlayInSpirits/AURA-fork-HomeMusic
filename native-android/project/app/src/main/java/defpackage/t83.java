package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t83 implements OnBackAnimationCallback {
    public final /* synthetic */ s83 a;

    public t83(s83 r1) {
        this.a = r1;
    }

    public final void onBackCancelled() {
        s83 r5 = this.a;
        bq4 r0 = r5.a;
        if (r0 != null) goto L5;
        kf2.o("This input is not added to any dispatcher.");
        return;
    L5:
        if (r5.b == true) goto L7;
        r0.g(r5, null);
    L7:
        w33 r1 = (w33) r0.o;
        r1.getClass();
        if (r5.equals(r1.h) == true) goto L10;
    L19:
        r5.b = false;
        return;
    L10:
        if ((-1) != r1.g) goto L19;
        u83 r2 = r1.f;
        if (r2 != null) goto L15;
        r2 = r1.c(-1);
    L15:
        r1.f = null;
        r1.g = 0;
        r1.h = null;
        if (r2 == null) goto L18;
        r2.d.getClass();
    L18:
        nl4 r3 = r1.a;
        x33 r4 = x33.p;
        r3.getClass();
        r3.j(null, r4);
        goto L19
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent r3) {
        r3.getClass();
        t33 r4 = xl.a(r3);
        s83 r2 = this.a;
        bq4 r0 = r2.a;
        if (r0 != null) goto L5;
        kf2.o("This input is not added to any dispatcher.");
        return;
    L5:
        if (r2.b == false) goto L20;
        w33 r1 = (w33) r0.o;
        r1.getClass();
        if (r2.equals(r1.h) == true) goto L9;
        return;
    L9:
        if ((-1) != r1.g) goto L22;
        u83 r5 = r1.f;
        if (r5 != null) goto L14;
        r5 = r1.c(-1);
    L14:
        if (r5 == null) goto L16;
        r5.d.getClass();
    L16:
        nl4 r6 = r1.a;
        y33 r7 = new y33(r4);
        r6.getClass();
        r6.j(null, r7);
        return;
    L22:
        return;
    }

    public final void onBackStarted(BackEvent r3) {
        r3.getClass();
        t33 r4 = xl.a(r3);
        s83 r2 = this.a;
        bq4 r0 = r2.a;
        if (r0 != null) goto L5;
        kf2.o("This input is not added to any dispatcher.");
        return;
    L5:
        if (r2.b == true) goto L10;
        r0.g(r2, r4);
        r2.b = true;
        return;
    }
}
