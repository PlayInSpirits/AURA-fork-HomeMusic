package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v00 extends dx4 {
    public static final String[] K = null;
    public static final r00 L = null;
    public static final r00 M = null;
    public static final r00 N = null;
    public static final r00 O = null;
    public static final r00 P = null;

    static {
        K = new String[]{"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
        cq r0 = new cq(PointF.class, "boundsOrigin");
        r0.b = new Rect();
        L = new r00(PointF.class, "topLeft", 0);
        M = new r00(PointF.class, "bottomRight", 1);
        N = new r00(PointF.class, "bottomRight", 2);
        O = new r00(PointF.class, "topLeft", 3);
        P = new r00(PointF.class, "position", 4);
    }

    public static void F(mx4 r6) {
        View r0 = r6.b;
        HashMap r7 = r6.a;
        WeakHashMap r1 = j65.a;
        if (r0.isLaidOut() == false) goto L5;
    L10:
        r7.put("android:changeBounds:bounds", new Rect(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom()));
        r7.put("android:changeBounds:parent", r0.getParent());
        return;
    L5:
        if (r0.getWidth() != 0) goto L10;
        if (r0.getHeight() != 0) goto L10;
    }

    @Override // defpackage.dx4
    public final void c(mx4 r1) {
        F(r1);
    }

    @Override // defpackage.dx4
    public final void f(mx4 r1) {
        F(r1);
    }

    @Override // defpackage.dx4
    public final Animator j(ViewGroup r19, mx4 r20, mx4 r21) {
        if (r20 == null) goto L6;
        HashMap r1 = r20.a;
        if (r21 == null) goto L50;
        HashMap r4 = r21.a;
        ViewGroup r6 = (ViewGroup) r1.get("android:changeBounds:parent");
        ViewGroup r5 = (ViewGroup) r4.get("android:changeBounds:parent");
        if (r6 == null) goto L51;
        if (r5 == null) goto L53;
        View r2 = r21.b;
        Rect r7 = (Rect) r1.get("android:changeBounds:bounds");
        Rect r8 = (Rect) r4.get("android:changeBounds:bounds");
        int r9 = r7.left;
        int r10 = r8.left;
        int r11 = r7.top;
        int r12 = r8.top;
        int r13 = r7.right;
        int r14 = r8.right;
        int r15 = r7.bottom;
        int r16 = r8.bottom;
        int r17 = r13 - r9;
        int r18 = r15 - r11;
        int r110 = r14 - r10;
        int r3 = r16 - r12;
        Rect r22 = (Rect) r1.get("android:changeBounds:clip");
        Rect r0 = (Rect) r4.get("android:changeBounds:clip");
        if (r17 == 0) goto L14;
        if (r18 == 0) goto L14;
    L16:
        if (r9 != r10) goto L20;
        if (r11 != r12) goto L20;
        int r111 = 0;
    L21:
        if (r13 != r14) goto L23;
        if (r15 != r16) goto L23;
    L25:
        if (r22 != null) goto L27;
    L28:
        if (r22 != null) goto L31;
        if (r0 == null) goto L31;
    L30:
        r111 = r111 + 1;
    L31:
        int r23 = r111;
        if (r23 <= 0) goto L52;
        d85.a(r2, r9, r11, r13, r15);
        if (r23 != 2) goto L39;
        if (r17 != r110) goto L38;
        if (r18 != r3) goto L38;
        v00 r24 = this;
        r24.G.getClass();
        Animator r25 = ObjectAnimator.ofObject(r2, P, null, xi4.p(r9, r11, r10, r12));
    L46:
        if ((r2.getParent() instanceof ViewGroup) == false) goto L48;
        ViewGroup r26 = (ViewGroup) r2.getParent();
        fh0.y(r26, true);
        r24.a(new t00(r26));
    L48:
        return r25;
    L38:
        r24 = this;
        u00 r27 = new u00();
        r27.e = r2;
        r24.G.getClass();
        ObjectAnimator r28 = ObjectAnimator.ofObject(r27, L, null, xi4.p(r9, r11, r10, r12));
        r24.G.getClass();
        ObjectAnimator r29 = ObjectAnimator.ofObject(r27, M, null, xi4.p(r13, r15, r14, r16));
        AnimatorSet r30 = new AnimatorSet();
        r30.playTogether(new Animator[]{r28, r29});
        r30.addListener(new s00(r27));
        r25 = r30;
        goto L46
    L39:
        r24 = this;
        if (r9 != r10) goto L44;
        if (r11 != r12) goto L44;
        r24.G.getClass();
        r25 = ObjectAnimator.ofObject(r2, N, null, xi4.p(r13, r15, r14, r16));
    L44:
        r24.G.getClass();
        r25 = ObjectAnimator.ofObject(r2, O, null, xi4.p(r9, r11, r10, r12));
        goto L46
    L52:
        return null;
    L27:
        if (r22.equals(r0) == false) goto L30;
    L23:
        r111 = r111 + 1;
    L20:
        r111 = 1;
    L14:
        if (r110 == 0) goto L24;
        if (r3 != 0) goto L16;
    L24:
        r111 = 0;
        goto L25
    L53:
        return null;
    L51:
        return null;
    L50:
        return null;
    L6:
        return null;
    }

    @Override // defpackage.dx4
    public final String[] o() {
        return K;
    }
}
