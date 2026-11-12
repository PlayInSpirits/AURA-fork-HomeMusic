package defpackage;

import android.animation.ValueAnimator;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.media3.ui.DefaultTimeBar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cn0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cn0(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator r7) {
        int r0 = this.a;
        Object r6 = this.b;
        switch(r0) {
            case 0: goto L16;
            case 1: goto L14;
            case 2: goto L12;
            case 3: goto L10;
            case 4: goto L8;
            case 5: goto L6;
            default: goto L4;
        };
    L4:
        ((v51) r6).a(((Float) r7.getAnimatedValue()).floatValue());
        return;
    L6:
        ((dw0) r6).setProgress(((Float) r7.getAnimatedValue()).floatValue());
        return;
    L8:
        ClippableRoundedCornerLayout r1 = (ClippableRoundedCornerLayout) r6;
        r1.a(r1.getLeft(), r1.getTop(), r1.getRight(), r1.getBottom(), ((Float) r7.getAnimatedValue()).floatValue());
        return;
    L10:
        qh2 r8 = (qh2) r6;
        float r9 = ((Float) r7.getAnimatedValue()).floatValue();
        r8.j.setAlpha((int) (255.0f * r9));
        r8.x = r9;
        return;
    L12:
        ((ix0) r6).d.setAlpha(((Float) r7.getAnimatedValue()).floatValue());
        return;
    L14:
        ((DrawerLayout) r6).setScrimColor(v50.i(-1728053248, yd.c(lw0.a, r7.getAnimatedFraction(), 0)));
        return;
    L16:
        DefaultTimeBar r10 = (DefaultTimeBar) r6;
        int r2 = DefaultTimeBar.f0;
        r10.S = ((Float) r7.getAnimatedValue()).floatValue();
        r10.invalidate(r10.n);
    }
}
