package defpackage;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a22 implements qw3 {
    public final /* synthetic */ f22 a;

    public a22(f22 r1) {
        this.a = r1;
    }

    @Override // defpackage.qw3
    public final void a(MotionEvent r9) {
        f22 r8 = this.a;
        g5 r0 = r8.s;
        r8.x.onTouchEvent(r9);
        VelocityTracker r1 = r8.t;
        if (r1 == null) goto L6;
        r1.addMovement(r9);
    L6:
        if (r8.l == (-1)) goto L39;
        int r2 = r9.getActionMasked();
        int r3 = r9.findPointerIndex(r8.l);
        if (r3 < 0) goto L11;
        r8.k(r2, r3, r9);
    L11:
        cx3 r4 = r8.c;
        if (r4 == null) goto L40;
        int r5 = 0;
        if (r2 != 1) goto L17;
    L35:
        r8.r(null, 0);
        r8.l = -1;
        return;
    L17:
        if (r2 != 2) goto L19;
        if (r3 < 0) goto L38;
        r8.s(r8.o, r3, r9);
        r8.q(r4);
        r8.r.removeCallbacks(r0);
        r0.run();
        r8.r.invalidate();
        return;
    L38:
        return;
    L19:
        if (r2 != 3) goto L21;
        VelocityTracker r10 = r8.t;
        if (r10 == null) goto L35;
        r10.clear();
        goto L35
    L21:
        if (r2 != 6) goto L41;
        int r6 = r9.getActionIndex();
        if (r9.getPointerId(r6) != r8.l) goto L37;
        if (r6 != 0) goto L27;
        r5 = 1;
    L27:
        r8.l = r9.getPointerId(r5);
        r8.s(r8.o, r6, r9);
        return;
    L37:
        return;
    L41:
        return;
    L40:
        return;
    }

    @Override // defpackage.qw3
    public final boolean d(MotionEvent r9) {
        f22 r8 = this.a;
        r8.x.onTouchEvent(r9);
        int r0 = r9.getActionMasked();
        b22 r1 = null;
        if (r0 != 0) goto L24;
        r8.l = r9.getPointerId(0);
        r8.d = r9.getX();
        r8.e = r9.getY();
        VelocityTracker r2 = r8.t;
        if (r2 == null) goto L7;
        r2.recycle();
    L7:
        r8.t = VelocityTracker.obtain();
        if (r8.c != null) goto L33;
        ArrayList r3 = r8.p;
        if (r3.isEmpty() == true) goto L18;
        View r4 = r8.n(r9);
        int r5 = r3.size() - 1;
    L13:
        if (r5 < 0) goto L18;
        b22 r6 = (b22) r3.get(r5);
        if (r6.e.a == r4) goto L16;
        r5 = r5 - 1;
        goto L13
    L16:
        r1 = r6;
    L18:
        if (r1 == null) goto L33;
        cx3 r7 = r1.e;
        r8.d -= r1.i;
        r8.e -= r1.j;
        r8.m(r7, true);
        if (r8.a.remove(r7.a) == false) goto L22;
        r8.m.a(r8.r, r7);
    L22:
        r8.r(r7, r1.f);
        r8.s(r8.o, 0, r9);
    L33:
        VelocityTracker r10 = r8.t;
        if (r10 == null) goto L37;
        r10.addMovement(r9);
    L37:
        if (r8.c == null) goto L39;
        return true;
    L39:
        return false;
    L24:
        if (r0 == 3) goto L32;
        if (r0 == 1) goto L32;
        int r11 = r8.l;
        if (r11 == (-1)) goto L33;
        int r12 = r9.findPointerIndex(r11);
        if (r12 < 0) goto L33;
        r8.k(r0, r12, r9);
    L32:
        r8.l = -1;
        r8.r(null, 0);
        goto L33
    }

    @Override // defpackage.qw3
    public final void e(boolean r2) {
        if (r2 == true) goto L4;
        return;
    L4:
        this.a.r(null, 0);
    }
}
