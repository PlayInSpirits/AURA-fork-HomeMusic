/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import defpackage.a0;
import defpackage.g11;
import defpackage.g12;
import defpackage.h11;
import defpackage.p30;
import defpackage.p6;
import defpackage.q30;
import defpackage.r30;
import defpackage.yd;

public final class s30
extends h11 {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final p6 j = new p6(7, this);
    public final p30 k = new p30(0, this);
    public AnimatorSet l;
    public ValueAnimator m;

    public s30(g11 g112) {
        super(g112);
        this.e = g12.N(g112.getContext(), 2130969496, 100);
        this.f = g12.N(g112.getContext(), 2130969496, 150);
        this.g = g12.O(g112.getContext(), 2130969505, yd.a);
        this.h = g12.O(g112.getContext(), 2130969503, yd.d);
    }

    @Override
    public final void a() {
        if (this.b.C != null) {
            return;
        }
        this.s(this.t());
    }

    @Override
    public final int c() {
        return 2131951789;
    }

    @Override
    public final int d() {
        return 2131231428;
    }

    @Override
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override
    public final void l(EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(this.t());
    }

    @Override
    public final void o(boolean bl5) {
        if (this.b.C == null) {
            return;
        }
        this.s(bl5);
    }

    @Override
    public final void q() {
        AnimatorSet animatorSet;
        ValueAnimator valueAnimator = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimator.setInterpolator(this.h);
        valueAnimator.setDuration(this.f);
        valueAnimator.addUpdateListener(new q30(this, 1));
        ValueAnimator valueAnimator2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimator2.setInterpolator(timeInterpolator);
        int n16 = this.e;
        valueAnimator2.setDuration(n16);
        valueAnimator2.addUpdateListener(new q30(this, 0));
        this.l = animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimator, valueAnimator2);
        this.l.addListener(new r30(this, 0));
        valueAnimator = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimator.setInterpolator(timeInterpolator);
        valueAnimator.setDuration(n16);
        valueAnimator.addUpdateListener(new q30(this, 0));
        this.m = valueAnimator;
        valueAnimator.addListener(new r30(this, 1));
    }

    @Override
    public final void r() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new a0(11, this));
        }
    }

    public final void s(boolean bl5) {
        boolean bl6 = this.b.c() == bl5;
        if (bl5 && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (bl6) {
                this.l.end();
                return;
            }
        } else if (!bl5) {
            this.l.cancel();
            this.m.start();
            if (bl6) {
                this.m.end();
            }
        }
    }

    public final boolean t() {
        EditText editText = this.i;
        return editText != null && (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
    }
}

