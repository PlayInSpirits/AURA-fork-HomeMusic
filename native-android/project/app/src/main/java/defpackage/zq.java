package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.util.Log;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zq implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ fr o;

    public /* synthetic */ zq(fr frVar, int i) {
        this.n = i;
        this.o = frVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        fr frVar = this.o;
        int i2 = 1;
        switch (i) {
            case 0:
                er erVar = frVar.i;
                if (erVar != null) {
                    int iHeight = ya4.u(frVar.h).height();
                    int[] iArr = new int[2];
                    erVar.getLocationOnScreen(iArr);
                    int height = (iHeight - (erVar.getHeight() + iArr[1])) + ((int) erVar.getTranslationY());
                    int i3 = frVar.r;
                    if (height < i3) {
                        ViewGroup.LayoutParams layoutParams = erVar.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            Log.w(fr.B, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                        } else {
                            int i4 = frVar.r;
                            frVar.s = i4;
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin = (i4 - height) + marginLayoutParams.bottomMargin;
                            erVar.requestLayout();
                        }
                    } else {
                        frVar.s = i3;
                    }
                }
                break;
            case 1:
                frVar.c();
                break;
            default:
                er erVar2 = frVar.i;
                if (erVar2 != null) {
                    byte b = 0;
                    if (erVar2.getParent() != null) {
                        erVar2.setVisibility(0);
                    }
                    if (erVar2.getAnimationMode() != 1) {
                        int height2 = erVar2.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = erVar2.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            height2 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        }
                        erVar2.setTranslationY(height2);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(height2, 0);
                        valueAnimator.setInterpolator(frVar.e);
                        valueAnimator.setDuration(frVar.c);
                        valueAnimator.addListener(new wq(frVar, i2));
                        valueAnimator.addUpdateListener(new xq(frVar, height2));
                        valueAnimator.start();
                    } else {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setInterpolator(frVar.d);
                        valueAnimatorOfFloat.addUpdateListener(new xq(frVar, b, b));
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        valueAnimatorOfFloat2.setInterpolator(frVar.f);
                        valueAnimatorOfFloat2.addUpdateListener(new xq(frVar, i2, b));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                        animatorSet.setDuration(frVar.a);
                        animatorSet.addListener(new wq(frVar, 3));
                        animatorSet.start();
                    }
                    break;
                }
                break;
        }
    }
}
