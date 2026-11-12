package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import app.homemusic.R;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s30 extends h11 {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final p6 j;
    public final p30 k;
    public AnimatorSet l;
    public ValueAnimator m;

    public s30(g11 g11Var) {
        super(g11Var);
        this.j = new p6(7, this);
        this.k = new p30(0, this);
        this.e = g12.N(g11Var.getContext(), R.attr.motionDurationShort3, 100);
        this.f = g12.N(g11Var.getContext(), R.attr.motionDurationShort3, 150);
        this.g = g12.O(g11Var.getContext(), R.attr.motionEasingLinearInterpolator, yd.a);
        this.h = g12.O(g11Var.getContext(), R.attr.motionEasingEmphasizedInterpolator, yd.d);
    }

    @Override // defpackage.h11
    public final void a() {
        if (this.b.C != null) {
            return;
        }
        s(t());
    }

    @Override // defpackage.h11
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // defpackage.h11
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // defpackage.h11
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // defpackage.h11
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // defpackage.h11
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // defpackage.h11
    public final void l(EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(t());
    }

    @Override // defpackage.h11
    public final void o(boolean z) {
        if (this.b.C == null) {
            return;
        }
        s(z);
    }

    @Override // defpackage.h11
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.h);
        valueAnimatorOfFloat.setDuration(this.f);
        final int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: q30
            public final /* synthetic */ s30 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = i;
                s30 s30Var = this.b;
                switch (i2) {
                    case 0:
                        s30Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = s30Var.d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i2 = this.e;
        valueAnimatorOfFloat2.setDuration(i2);
        final int i3 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: q30
            public final /* synthetic */ s30 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i4 = i3;
                s30 s30Var = this.b;
                switch (i4) {
                    case 0:
                        s30Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = s30Var.d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.l.addListener(new r30(this, i3));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i2);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: q30
            public final /* synthetic */ s30 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i4 = i3;
                s30 s30Var = this.b;
                switch (i4) {
                    case 0:
                        s30Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = s30Var.d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new r30(this, i));
    }

    @Override // defpackage.h11
    public final void r() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new a0(11, this));
        }
    }

    public final void s(boolean z) {
        boolean z2 = this.b.c() == z;
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.l.cancel();
        this.m.start();
        if (z2) {
            this.m.end();
        }
    }

    public final boolean t() {
        EditText editText = this.i;
        if (editText != null) {
            return (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
        }
        return false;
    }
}
