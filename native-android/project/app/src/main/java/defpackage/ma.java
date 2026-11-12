package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ma extends cx2 implements zu, g94, j42, u62, rx4 {
    public final x B;
    public final /* synthetic */ ra C;

    public ma(ra r2) {
        this.C = r2;
        this.B = new x(4, this);
    }

    @Override // defpackage.g94
    public final void c0(q94 r1) {
    }

    @Override // defpackage.rx4
    public final Object f() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // defpackage.zu
    public final Object k(f63 r3, fa r4, ep4 r5) {
        long r0 = r3.K0(0);
        wv3 r6 = (wv3) r4.invoke();
        if (r6 == null) goto L5;
        wv3 r7 = r6.f(r0);
    L6:
        if (r7 == null) goto L9;
        Rect r8 = new Rect((int) r7.a, (int) r7.b, (int) r7.c, (int) r7.d);
        this.C.requestRectangleOnScreen(r8, false);
    L9:
        return j15.a;
    L5:
        r7 = null;
        goto L6
    }

    @Override // defpackage.j42
    public final boolean q(KeyEvent r10) {
        int[] r0 = r91.a;
        long r1 = fh0.a(r10.getKeyCode());
        int r5 = 2;
        if (g42.a(r1, g42.b) == false) goto L6;
        o91 r2 = new o91(2);
    L48:
        boolean r3 = false;
        if (r2 == null) goto L75;
        int r4 = r2.a;
        if (hw.n(r10) != 2) goto L75;
        ra r9 = this.C;
        ((ey) r9.getFocusOwner()).f();
        wv3 r6 = r9.getEmbeddedViewFocusRect();
        Boolean r7 = ((ey) r9.getFocusOwner()).e(r4, r6, new x(3, r2));
        if (r7 != null) goto L55;
        return true;
    L55:
        if (r7.booleanValue() == false) goto L61;
        wf1 r11 = r9.getPlayNavigationSoundEffect$ui();
        if (r10.getRepeatCount() <= 0) goto L59;
        r3 = true;
    L59:
        r11.invoke(r2, Boolean.valueOf(r3));
        return true;
    L61:
        if (r4 == 1) goto L64;
        if (r4 == 2) goto L64;
        return false;
    L64:
        Integer r12 = r91.b(r4);
        if (r12 == null) goto L67;
        r5 = r12.intValue();
    L67:
        FocusFinder r13 = FocusFinder.getInstance();
        View r8 = r9.getRootView();
        r8.getClass();
        View r14 = r13.findNextFocus((ViewGroup) r8, r9.getView(), r5);
        if (r14 == null) goto L72;
        if (r14.equals(r9) == false) goto L75;
    L72:
        return ((ey) r9.getFocusOwner()).g(r4);
    L75:
        return false;
    L6:
        if (g42.a(r1, g42.c) == false) goto L9;
        r2 = new o91(1);
        goto L48
    L9:
        if (g42.a(r1, g42.i) == false) goto L16;
        if (r10.isShiftPressed() == false) goto L13;
        int r15 = 2;
    L14:
        r2 = new o91(r15);
        goto L48
    L13:
        r15 = 1;
        goto L14
    L16:
        if (g42.a(r1, g42.g) == false) goto L19;
        r2 = new o91(4);
        goto L48
    L19:
        if (g42.a(r1, g42.f) == false) goto L22;
        r2 = new o91(3);
        goto L48
    L22:
        if (g42.a(r1, g42.d) == false) goto L24;
    L47:
        r2 = new o91(5);
        goto L48
    L24:
        if (g42.a(r1, g42.m) == true) goto L47;
        if (g42.a(r1, g42.e) == false) goto L29;
    L46:
        r2 = new o91(6);
        goto L48
    L29:
        if (g42.a(r1, g42.n) == true) goto L46;
        if (g42.a(r1, g42.h) == false) goto L34;
    L45:
        r2 = new o91(7);
        goto L48
    L34:
        if (g42.a(r1, g42.k) == true) goto L45;
        if (g42.a(r1, g42.o) == true) goto L45;
        if (g42.a(r1, g42.a) == false) goto L41;
    L44:
        r2 = new o91(8);
        goto L48
    L41:
        if (g42.a(r1, g42.l) == true) goto L44;
        r2 = null;
        goto L48
    }

    @Override // defpackage.u62
    public final vi2 r(cf2 r7, pi2 r8, long r9) {
        jg3 r10 = r8.r(r9);
        int r1 = r10.n;
        int r2 = r10.o;
        la r5 = new la(r10, 0);
        return r7.T(r1, r2, v01.n, this.B, r5);
    }
}
