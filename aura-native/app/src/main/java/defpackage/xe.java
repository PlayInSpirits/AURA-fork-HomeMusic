package defpackage;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class xe implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xe(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                AppBarLayout appBarLayout = (AppBarLayout) obj2;
                int i2 = AppBarLayout.L;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((fi2) obj).l(floatValue);
                Drawable drawable = appBarLayout.I;
                if (drawable instanceof fi2) {
                    ((fi2) drawable).l(floatValue);
                }
                Iterator it = appBarLayout.E.iterator();
                if (it.hasNext()) {
                    throw xa3.d(it);
                }
                return;
            case 1:
                fi2 fi2Var = (fi2) obj;
                int i3 = AppBarLayout.L;
                int floatValue2 = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fi2Var.setAlpha(floatValue2);
                ArrayList arrayList = ((AppBarLayout) obj2).E;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj3 = arrayList.get(i4);
                    i4++;
                    if (obj3 != null) {
                        kf2.k();
                        return;
                    }
                    ColorStateList colorStateList = fi2Var.n.c;
                    if (colorStateList != null) {
                        colorStateList.withAlpha(floatValue2).getDefaultColor();
                        throw null;
                    }
                }
                return;
            default:
                ((View) ((ia5) ((oz4) obj2).n).g.getParent()).invalidate();
                return;
        }
    }
}
