package defpackage;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qq implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qq(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator r8) {
        int r0 = this.a;
        int r1 = 0;
        Object r7 = this.b;
        switch(r0) {
            case 0: goto L22;
            case 1: goto L18;
            case 2: goto L16;
            case 3: goto L14;
            case 4: goto L12;
            case 5: goto L10;
            case 6: goto L8;
            case 7: goto L6;
            default: goto L4;
        };
    L4:
        float r9 = ((Float) r8.getAnimatedValue()).floatValue();
        TextView r10 = (TextView) r7;
        r10.setScaleX(r9);
        r10.setScaleY(r9);
        return;
    L6:
        ((TextInputLayout) r7).H0.p(((Float) r8.getAnimatedValue()).floatValue());
        return;
    L8:
        ((TabLayout) r7).scrollTo(((Integer) r8.getAnimatedValue()).intValue(), 0);
        return;
    L10:
        ((ld4) r7).invalidateSelf();
        return;
    L12:
        float r11 = r8.getAnimatedFraction();
        ((b22) r7).m = r11;
        return;
    L14:
        int r12 = (int) (((Float) r8.getAnimatedValue()).floatValue() * 255.0f);
        e61 r13 = (e61) r7;
        r13.c.setAlpha(r12);
        r13.d.setAlpha(r12);
        r13.s.invalidate();
        return;
    L16:
        ((CollapsingToolbarLayout) r7).setScrimAlpha(((Integer) r8.getAnimatedValue()).intValue());
        return;
    L18:
        float r14 = ((Float) r8.getAnimatedValue()).floatValue();
        fi2 r15 = ((BottomSheetBehavior) r7).v;
        if (r15 == null) goto L28;
        r15.n(r14);
        return;
    L28:
        return;
    L22:
        float r16 = ((Float) r8.getAnimatedValue()).floatValue();
        uq r17 = (uq) r7;
        ArrayList r2 = r17.x;
        int r3 = r2.size();
    L23:
        if (r1 >= r3) goto L25;
        Object r4 = r2.get(r1);
        r1 = r1 + 1;
        kv4 r5 = (kv4) r4;
        r5.Y = 1.2f;
        r5.W = r16;
        r5.X = r16;
        r5.Z = yd.b(0.0f, 1.0f, 0.19f, 1.0f, r16);
        r5.invalidateSelf();
        goto L23
    L25:
        WeakHashMap r18 = j65.a;
        r17.postInvalidateOnAnimation();
    }
}
