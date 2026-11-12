package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kp2 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Map n;
    public final /* synthetic */ Map o;
    public final /* synthetic */ qp2 p;

    public kp2(qp2 qp2Var, HashMap map, HashMap map2) {
        this.p = qp2Var;
        this.n = map;
        this.o = map2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Map map;
        Map map2;
        pb3 pb3Var;
        qp2 qp2Var = this.p;
        qp2Var.R.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = qp2Var.U;
        if (hashSet == null || qp2Var.V == null) {
            return;
        }
        int size = hashSet.size() - qp2Var.V.size();
        boolean z = true;
        gp2 gp2Var = new gp2(1 == true ? 1 : 0, qp2Var);
        int firstVisiblePosition = qp2Var.R.getFirstVisiblePosition();
        int i = 0;
        boolean z2 = false;
        while (true) {
            int childCount = qp2Var.R.getChildCount();
            map = this.n;
            map2 = this.o;
            if (i >= childCount) {
                break;
            }
            View childAt = qp2Var.R.getChildAt(i);
            wq2 wq2Var = (wq2) qp2Var.S.getItem(firstVisiblePosition + i);
            Rect rect = (Rect) map.get(wq2Var);
            int top = childAt.getTop();
            int i2 = rect != null ? rect.top : (qp2Var.b0 * size) + top;
            AnimationSet animationSet = new AnimationSet(z);
            HashSet hashSet2 = qp2Var.U;
            if (hashSet2 != null && hashSet2.contains(wq2Var)) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                alphaAnimation.setDuration(qp2Var.u0);
                animationSet.addAnimation(alphaAnimation);
                i2 = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i2 - top, 0.0f);
            translateAnimation.setDuration(qp2Var.t0);
            animationSet.addAnimation(translateAnimation);
            z = true;
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(qp2Var.w0);
            if (!z2) {
                animationSet.setAnimationListener(gp2Var);
                z2 = true;
            }
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
            map.remove(wq2Var);
            map2.remove(wq2Var);
            i++;
        }
        for (Map.Entry entry : map2.entrySet()) {
            wq2 wq2Var2 = (wq2) entry.getKey();
            BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
            Rect rect2 = (Rect) map.get(wq2Var2);
            if (qp2Var.V.contains(wq2Var2)) {
                pb3Var = new pb3(bitmapDrawable, rect2);
                pb3Var.h = 0.0f;
                pb3Var.e = qp2Var.v0;
                pb3Var.d = qp2Var.w0;
            } else {
                int i3 = qp2Var.b0 * size;
                pb3 pb3Var2 = new pb3(bitmapDrawable, rect2);
                pb3Var2.g = i3;
                pb3Var2.e = qp2Var.t0;
                pb3Var2.d = qp2Var.w0;
                pb3Var2.l = new hd5(qp2Var, wq2Var2, false, 14);
                qp2Var.W.add(wq2Var2);
                pb3Var = pb3Var2;
            }
            qp2Var.R.n.add(pb3Var);
        }
    }
}
