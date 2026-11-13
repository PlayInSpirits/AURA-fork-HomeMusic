package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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

    public h81(m81 m81Var, float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
        this.i = m81Var;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = matrix;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        m81 m81Var = this.i;
        FloatingActionButton floatingActionButton = m81Var.r;
        floatingActionButton.setAlpha(yd.b(this.a, this.b, 0.0f, 0.2f, floatValue));
        float f = this.c;
        float f2 = this.d;
        floatingActionButton.setScaleX(yd.a(f, f2, floatValue));
        floatingActionButton.setScaleY(yd.a(this.e, f2, floatValue));
        float f3 = this.f;
        float f4 = this.g;
        m81Var.o = yd.a(f3, f4, floatValue);
        float a = yd.a(f3, f4, floatValue);
        Matrix matrix = this.h;
        m81Var.a(a, matrix);
        floatingActionButton.setImageMatrix(matrix);
    }
}
