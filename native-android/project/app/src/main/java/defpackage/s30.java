package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import app.homemusic.R;

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

    public s30(g11 r4) {
        super(r4);
        this.j = new p6(7, this);
        this.k = new p30(0, this);
        this.e = g12.N(r4.getContext(), R.attr.motionDurationShort3, 100);
        this.f = g12.N(r4.getContext(), R.attr.motionDurationShort3, 150);
        this.g = g12.O(r4.getContext(), R.attr.motionEasingLinearInterpolator, yd.a);
        this.h = g12.O(r4.getContext(), R.attr.motionEasingEmphasizedInterpolator, yd.d);
    }

    @Override // defpackage.h11
    public final void a() {
        if (this.b.C == null) goto L5;
        return;
    L5:
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
    public final void l(EditText r1) {
        this.i = r1;
        this.a.setEndIconVisible(t());
    }

    @Override // defpackage.h11
    public final void o(boolean r2) {
        if (this.b.C != null) goto L5;
        return;
    L5:
        s(r2);
    }

    @Override // defpackage.h11
    public final void q() {
        ValueAnimator r1 = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        r1.setInterpolator(this.h);
        r1.setDuration(this.f);
        final int r3 = 1;
        r1.addUpdateListener(new q30(this, r3));
        ValueAnimator r2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator r4 = this.g;
        r2.setInterpolator(r4);
        int r5 = this.e;
        r2.setDuration(r5);
        final int r7 = 0;
        r2.addUpdateListener(new q30(this, r7));
        AnimatorSet r6 = new AnimatorSet();
        this.l = r6;
        r6.playTogether(new Animator[]{r1, r2});
        this.l.addListener(new r30(this, r7));
        ValueAnimator r0 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        r0.setInterpolator(r4);
        r0.setDuration(r5);
        r0.addUpdateListener(new q30(this, r7));
        this.m = r0;
        r0.addListener(new r30(this, r3));
    }

    @Override // defpackage.h11
    public final void r() {
        EditText r0 = this.i;
        if (r0 == null) goto L6;
        r0.post(new a0(11, this));
        return;
    }

    public final void s(boolean r3) {
        if (this.b.c() != r3) goto L5;
        boolean r0 = true;
    L6:
        if (r3 == true) goto L8;
    L13:
        if (r3 == true) goto L19;
        this.l.cancel();
        this.m.start();
        if (r0 == false) goto L20;
        this.m.end();
        return;
    L20:
        return;
    L19:
        return;
    L8:
        if (this.l.isRunning() == true) goto L13;
        this.m.cancel();
        this.l.start();
        if (r0 == false) goto L18;
        this.l.end();
        return;
    L18:
        return;
    L5:
        r0 = false;
        goto L6
    }

    public final boolean t() {
        EditText r0 = this.i;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.hasFocus() == true) goto L9;
        if (this.d.hasFocus() == true) goto L9;
        return false;
    L9:
        if (this.i.getText().length() <= 0) goto L15;
        return true;
    L15:
        return false;
    }
}
