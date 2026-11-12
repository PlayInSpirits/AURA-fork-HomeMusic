package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ma extends cx2 implements zu, g94, j42, u62, rx4 {
    public final x B = new x(4, this);
    public final /* synthetic */ ra C;

    public ma(ra raVar) {
        this.C = raVar;
    }

    @Override // defpackage.g94
    public final void c0(q94 q94Var) {
    }

    @Override // defpackage.rx4
    public final Object f() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // defpackage.zu
    public final Object k(f63 f63Var, fa faVar, ep4 ep4Var) {
        long jK0 = f63Var.K0(0L);
        wv3 wv3Var = (wv3) faVar.invoke();
        wv3 wv3VarF = wv3Var != null ? wv3Var.f(jK0) : null;
        if (wv3VarF != null) {
            this.C.requestRectangleOnScreen(new Rect((int) wv3VarF.a, (int) wv3VarF.b, (int) wv3VarF.c, (int) wv3VarF.d), false);
        }
        return j15.a;
    }

    @Override // defpackage.j42
    public final boolean q(KeyEvent keyEvent) {
        o91 o91Var;
        int[] iArr = r91.a;
        long jA = fh0.a(keyEvent.getKeyCode());
        if (g42.a(jA, g42.b)) {
            o91Var = new o91(2);
        } else if (g42.a(jA, g42.c)) {
            o91Var = new o91(1);
        } else if (g42.a(jA, g42.i)) {
            o91Var = new o91(keyEvent.isShiftPressed() ? 2 : 1);
        } else if (g42.a(jA, g42.g)) {
            o91Var = new o91(4);
        } else if (g42.a(jA, g42.f)) {
            o91Var = new o91(3);
        } else if (g42.a(jA, g42.d) || g42.a(jA, g42.m)) {
            o91Var = new o91(5);
        } else if (g42.a(jA, g42.e) || g42.a(jA, g42.n)) {
            o91Var = new o91(6);
        } else if (g42.a(jA, g42.h) || g42.a(jA, g42.k) || g42.a(jA, g42.o)) {
            o91Var = new o91(7);
        } else {
            o91Var = (g42.a(jA, g42.a) || g42.a(jA, g42.l)) ? new o91(8) : null;
        }
        if (o91Var != null) {
            int i = o91Var.a;
            if (hw.n(keyEvent) == 2) {
                ra raVar = this.C;
                ((ey) raVar.getFocusOwner()).f();
                Boolean boolE = ((ey) raVar.getFocusOwner()).e(i, raVar.getEmbeddedViewFocusRect(), new x(3, o91Var));
                if (boolE == null) {
                    return true;
                }
                if (boolE.booleanValue()) {
                    raVar.getPlayNavigationSoundEffect$ui().invoke(o91Var, Boolean.valueOf(keyEvent.getRepeatCount() > 0));
                    return true;
                }
                if (i != 1 && i != 2) {
                    return false;
                }
                Integer numB = r91.b(i);
                int iIntValue = numB != null ? numB.intValue() : 2;
                FocusFinder focusFinder = FocusFinder.getInstance();
                View rootView = raVar.getRootView();
                rootView.getClass();
                View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, raVar.getView(), iIntValue);
                if (viewFindNextFocus == null || viewFindNextFocus.equals(raVar)) {
                    return ((ey) raVar.getFocusOwner()).g(i);
                }
            }
        }
        return false;
    }

    @Override // defpackage.u62
    public final vi2 r(cf2 cf2Var, pi2 pi2Var, long j) {
        jg3 jg3VarR = pi2Var.r(j);
        return cf2Var.T(jg3VarR.n, jg3VarR.o, v01.n, this.B, new la(jg3VarR, 0));
    }
}
