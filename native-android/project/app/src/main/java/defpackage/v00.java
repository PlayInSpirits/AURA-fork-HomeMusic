package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v00 extends dx4 {
    public static final String[] K = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final r00 L;
    public static final r00 M;
    public static final r00 N;
    public static final r00 O;
    public static final r00 P;

    static {
        new cq(PointF.class, "boundsOrigin").b = new Rect();
        L = new r00(PointF.class, "topLeft", 0);
        M = new r00(PointF.class, "bottomRight", 1);
        N = new r00(PointF.class, "bottomRight", 2);
        O = new r00(PointF.class, "topLeft", 3);
        P = new r00(PointF.class, "position", 4);
    }

    public static void F(mx4 mx4Var) {
        View view = mx4Var.b;
        HashMap map = mx4Var.a;
        WeakHashMap weakHashMap = j65.a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // defpackage.dx4
    public final void c(mx4 mx4Var) {
        F(mx4Var);
    }

    @Override // defpackage.dx4
    public final void f(mx4 mx4Var) {
        F(mx4Var);
    }

    @Override // defpackage.dx4
    public final Animator j(ViewGroup viewGroup, mx4 mx4Var, mx4 mx4Var2) {
        int i;
        v00 v00Var;
        Animator animatorOfObject;
        if (mx4Var == null) {
            return null;
        }
        HashMap map = mx4Var.a;
        if (mx4Var2 == null) {
            return null;
        }
        HashMap map2 = mx4Var2.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = mx4Var2.b;
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        int i14 = i;
        if (i14 <= 0) {
            return null;
        }
        d85.a(view, i2, i4, i6, i8);
        if (i14 != 2) {
            v00Var = this;
            if (i2 == i3 && i4 == i5) {
                v00Var.G.getClass();
                animatorOfObject = ObjectAnimator.ofObject(view, N, (TypeConverter) null, xi4.p(i6, i8, i7, i9));
            } else {
                v00Var.G.getClass();
                animatorOfObject = ObjectAnimator.ofObject(view, O, (TypeConverter) null, xi4.p(i2, i4, i3, i5));
            }
        } else if (i10 == i12 && i11 == i13) {
            v00Var = this;
            v00Var.G.getClass();
            animatorOfObject = ObjectAnimator.ofObject(view, P, (TypeConverter) null, xi4.p(i2, i4, i3, i5));
        } else {
            v00Var = this;
            u00 u00Var = new u00();
            u00Var.e = view;
            v00Var.G.getClass();
            ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(u00Var, L, (TypeConverter) null, xi4.p(i2, i4, i3, i5));
            v00Var.G.getClass();
            ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(u00Var, M, (TypeConverter) null, xi4.p(i6, i8, i7, i9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfObject, objectAnimatorOfObject2);
            animatorSet.addListener(new s00(u00Var));
            animatorOfObject = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            fh0.y(viewGroup4, true);
            v00Var.a(new t00(viewGroup4));
        }
        return animatorOfObject;
    }

    @Override // defpackage.dx4
    public final String[] o() {
        return K;
    }
}
