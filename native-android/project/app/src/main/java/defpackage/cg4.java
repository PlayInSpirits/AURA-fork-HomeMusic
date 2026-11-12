package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cg4 extends l85 {
    public static final DecelerateInterpolator N = null;
    public static final AccelerateInterpolator O = null;
    public static final zf4 P = null;
    public static final zf4 Q = null;
    public static final ag4 R = null;
    public static final zf4 S = null;
    public static final zf4 T = null;
    public static final ag4 U = null;
    public final bg4 M;

    static {
        N = new DecelerateInterpolator();
        O = new AccelerateInterpolator();
        P = new zf4(0);
        Q = new zf4(1);
        R = new ag4(0);
        S = new zf4(2);
        T = new zf4(3);
        U = new ag4(1);
    }

    public cg4(int r3) {
        ag4 r0 = U;
        this.M = r0;
        if (r3 != 3) goto L5;
        this.M = P;
    L22:
        cx r1 = new cx();
        r1.a = r3;
        this.F = r1;
        return;
    L5:
        if (r3 != 5) goto L7;
        this.M = S;
        goto L22
    L7:
        if (r3 != 48) goto L9;
        this.M = R;
        goto L22
    L9:
        if (r3 != 80) goto L11;
        this.M = r0;
        goto L22
    L11:
        if (r3 != 8388611) goto L13;
        this.M = Q;
        goto L22
    L13:
        if (r3 != 8388613) goto L15;
        this.M = T;
        goto L22
    L15:
        kf2.n("Invalid slide direction");
        throw null;
    }

    @Override // defpackage.l85
    public final ObjectAnimator H(ViewGroup r11, View r12, mx4 r13, mx4 r14) {
        if (r14 != null) goto L5;
        return null;
    L5:
        int[] r15 = (int[]) r14.a.get("android:slide:screenPosition");
        float r6 = r12.getTranslationX();
        float r7 = r12.getTranslationY();
        bg4 r0 = this.M;
        float r4 = r0.b(r11, r12);
        float r5 = r0.a(r11, r12);
        return fh0.k(r12, r14, r15[0], r15[1], r4, r5, r6, r7, N, this);
    }

    @Override // defpackage.l85
    public final ObjectAnimator I(ViewGroup r12, View r13, mx4 r14) {
        if (r14 != null) goto L5;
        return null;
    L5:
        int[] r0 = (int[]) r14.a.get("android:slide:screenPosition");
        float r5 = r13.getTranslationX();
        float r6 = r13.getTranslationY();
        bg4 r1 = this.M;
        float r7 = r1.b(r12, r13);
        float r8 = r1.a(r12, r13);
        return fh0.k(r13, r14, r0[0], r0[1], r5, r6, r7, r8, O, this);
    }

    @Override // defpackage.l85, defpackage.dx4
    public final void c(mx4 r2) {
        l85.F(r2);
        int[] r0 = new int[2];
        r2.b.getLocationOnScreen(r0);
        r2.a.put("android:slide:screenPosition", r0);
    }

    @Override // defpackage.dx4
    public final void f(mx4 r2) {
        l85.F(r2);
        int[] r0 = new int[2];
        r2.b.getLocationOnScreen(r0);
        r2.a.put("android:slide:screenPosition", r0);
    }
}
