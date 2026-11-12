package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c30 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public c30(oz2 r2, View[] r3) {
        this.a = 1;
        this.b = r2;
        this.c = r3;
    }

    public static c30 a(View... r3) {
        return new c30(new zr2(29), r3);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator r6) {
        int r0 = this.a;
        Object r1 = this.b;
        int r2 = 0;
        Object r5 = this.c;
        switch(r0) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        View[] r7 = (View[]) r5;
        int r3 = r7.length;
    L5:
        if (r2 >= r3) goto L7;
        oz2 r4 = (oz2) r1;
        r4.a(r6, r7[r2]);
        r2 = r2 + 1;
        goto L5
    L7:
        return;
    L8:
        float r8 = ((Float) r6.getAnimatedValue()).floatValue();
        f30 r9 = (f30) r5;
        e30 r10 = (e30) r1;
        f30.d(r8, r10);
        r9.a(r8, r10, false);
        r9.invalidateSelf();
    }

    public c30(f30 r2, e30 r3) {
        this.a = 0;
        this.c = r2;
        this.b = r3;
    }
}
