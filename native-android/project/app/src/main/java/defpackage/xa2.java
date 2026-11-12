package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xa2 extends rx1 {
    public static final int[] l = {533, 567, 850, 750};
    public static final int[] m = {1267, 1000, 333, 0};
    public static final r00 n = new r00(Float.class, "animationFraction", 13);
    public ObjectAnimator d;
    public ObjectAnimator e;
    public final Interpolator[] f;
    public final cb2 g;
    public int h;
    public boolean i;
    public float j;
    public hq k;

    public xa2(Context context, cb2 cb2Var) {
        super(2);
        this.h = 0;
        this.k = null;
        this.g = cb2Var;
        this.f = new Interpolator[]{AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // defpackage.rx1
    public final void d() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.rx1
    public final void f() {
        this.h = 0;
        int iL = g12.l(this.g.c[0], ((sx1) this.a).w);
        int[] iArr = (int[]) this.c;
        iArr[0] = iL;
        iArr[1] = iL;
    }

    @Override // defpackage.rx1
    public final void g(hq hqVar) {
        this.k = hqVar;
    }

    @Override // defpackage.rx1
    public final void i() {
        ObjectAnimator objectAnimator = this.e;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        d();
        if (((sx1) this.a).isVisible()) {
            this.e.setFloatValues(this.j, 1.0f);
            this.e.setDuration((long) ((1.0f - this.j) * 1800.0f));
            this.e.start();
        }
    }

    @Override // defpackage.rx1
    public final void j() {
        ObjectAnimator objectAnimator = this.d;
        r00 r00Var = n;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, r00Var, 0.0f, 1.0f);
            this.d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.d.setInterpolator(null);
            this.d.setRepeatCount(-1);
            this.d.addListener(new wa2(this, 0));
        }
        if (this.e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, r00Var, 1.0f);
            this.e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.e.setInterpolator(null);
            this.e.addListener(new wa2(this, 1));
        }
        this.h = 0;
        int iL = g12.l(this.g.c[0], ((sx1) this.a).w);
        int[] iArr = (int[]) this.c;
        iArr[0] = iL;
        iArr[1] = iL;
        this.d.start();
    }

    @Override // defpackage.rx1
    public final void k() {
        this.k = null;
    }
}
