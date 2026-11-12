package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h81 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ Matrix h;
    public final /* synthetic */ m81 i;

    public h81(m81 r1, float r2, float r3, float r4, float r5, float r6, float r7, float r8, Matrix r9) {
        this.i = r1;
        this.a = r2;
        this.b = r3;
        this.c = r4;
        this.d = r5;
        this.e = r6;
        this.f = r7;
        this.g = r8;
        this.h = r9;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator r7) {
        float r8 = ((Float) r7.getAnimatedValue()).floatValue();
        m81 r0 = this.i;
        FloatingActionButton r1 = r0.r;
        r1.setAlpha(yd.b(this.a, this.b, 0.0f, 0.2f, r8));
        float r2 = this.c;
        float r3 = this.d;
        r1.setScaleX(yd.a(r2, r3, r8));
        r1.setScaleY(yd.a(this.e, r3, r8));
        float r4 = this.f;
        float r5 = this.g;
        r0.o = yd.a(r4, r5, r8);
        float r9 = yd.a(r4, r5, r8);
        Matrix r6 = this.h;
        r0.a(r9, r6);
        r1.setImageMatrix(r6);
    }
}
