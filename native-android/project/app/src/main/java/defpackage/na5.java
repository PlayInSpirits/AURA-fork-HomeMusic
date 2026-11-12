package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class na5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ta5 a;
    public final /* synthetic */ pb5 b;
    public final /* synthetic */ pb5 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public na5(ta5 r1, pb5 r2, pb5 r3, int r4, View r5) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator r15) {
        float r16 = r15.getAnimatedFraction();
        ta5 r0 = this.a;
        sa5 r1 = r0.a;
        r1.e(r16);
        float r17 = r1.c();
        PathInterpolator r2 = pa5.e;
        int r3 = Build.VERSION.SDK_INT;
        pb5 r4 = this.b;
        if (r3 < 36) goto L6;
        bb5 r5 = new ab5(r4);
    L21:
        int r6 = 1;
    L23:
        if (r6 > 512) goto L29;
        int r7 = this.d & r6;
        mb5 r8 = r4.a;
        if (r7 != 0) goto L27;
        r5.d(r6, r8.h(r6));
    L28:
        r6 = r6 << 1;
        goto L23
    L27:
        vz1 r9 = r8.h(r6);
        vz1 r10 = this.c.a.h(r6);
        float r11 = 1.0f - r17;
        r5.d(r6, pb5.e(r9, (int) (((double) ((r9.a - r10.a) * r11)) + 0.5d), (int) (((double) ((r9.b - r10.b) * r11)) + 0.5d), (int) (((double) ((r9.c - r10.c) * r11)) + 0.5d), (int) (((double) ((r9.d - r10.d) * r11)) + 0.5d)));
        goto L28
    L29:
        pa5.h(this.e, r5.b(), Collections.singletonList(r0));
        return;
    L6:
        if (r3 < 35) goto L9;
        r5 = new za5(r4);
        goto L21
    L9:
        if (r3 < 34) goto L12;
        r5 = new ya5(r4);
        goto L21
    L12:
        if (r3 < 31) goto L15;
        r5 = new xa5(r4);
        goto L21
    L15:
        if (r3 < 30) goto L18;
        r5 = new wa5(r4);
        goto L21
    L18:
        if (r3 < 29) goto L20;
        r5 = new va5(r4);
        goto L21
    L20:
        r5 = new ua5(r4);
        goto L21
    }
}
