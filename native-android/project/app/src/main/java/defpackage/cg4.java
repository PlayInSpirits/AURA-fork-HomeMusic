package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cg4 extends l85 {
    public static final DecelerateInterpolator N = new DecelerateInterpolator();
    public static final AccelerateInterpolator O = new AccelerateInterpolator();
    public static final zf4 P = new zf4(0);
    public static final zf4 Q = new zf4(1);
    public static final ag4 R = new ag4(0);
    public static final zf4 S = new zf4(2);
    public static final zf4 T = new zf4(3);
    public static final ag4 U = new ag4(1);
    public final bg4 M;

    public cg4(int i) {
        ag4 ag4Var = U;
        this.M = ag4Var;
        if (i == 3) {
            this.M = P;
        } else if (i == 5) {
            this.M = S;
        } else if (i == 48) {
            this.M = R;
        } else if (i == 80) {
            this.M = ag4Var;
        } else if (i == 8388611) {
            this.M = Q;
        } else {
            if (i != 8388613) {
                kf2.n("Invalid slide direction");
                throw null;
            }
            this.M = T;
        }
        cx cxVar = new cx();
        cxVar.a = i;
        this.F = cxVar;
    }

    @Override // defpackage.l85
    public final ObjectAnimator H(ViewGroup viewGroup, View view, mx4 mx4Var, mx4 mx4Var2) {
        if (mx4Var2 == null) {
            return null;
        }
        int[] iArr = (int[]) mx4Var2.a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        bg4 bg4Var = this.M;
        return fh0.k(view, mx4Var2, iArr[0], iArr[1], bg4Var.b(viewGroup, view), bg4Var.a(viewGroup, view), translationX, translationY, N, this);
    }

    @Override // defpackage.l85
    public final ObjectAnimator I(ViewGroup viewGroup, View view, mx4 mx4Var) {
        if (mx4Var == null) {
            return null;
        }
        int[] iArr = (int[]) mx4Var.a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        bg4 bg4Var = this.M;
        return fh0.k(view, mx4Var, iArr[0], iArr[1], translationX, translationY, bg4Var.b(viewGroup, view), bg4Var.a(viewGroup, view), O, this);
    }

    @Override // defpackage.l85, defpackage.dx4
    public final void c(mx4 mx4Var) {
        l85.F(mx4Var);
        int[] iArr = new int[2];
        mx4Var.b.getLocationOnScreen(iArr);
        mx4Var.a.put("android:slide:screenPosition", iArr);
    }

    @Override // defpackage.dx4
    public final void f(mx4 mx4Var) {
        l85.F(mx4Var);
        int[] iArr = new int[2];
        mx4Var.b.getLocationOnScreen(iArr);
        mx4Var.a.put("android:slide:screenPosition", iArr);
    }
}
