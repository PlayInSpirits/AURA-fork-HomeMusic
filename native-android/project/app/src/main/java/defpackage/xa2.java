package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xa2 extends rx1 {
    public static final int[] l = null;
    public static final int[] m = null;
    public static final r00 n = null;
    public ObjectAnimator d;
    public ObjectAnimator e;
    public final Interpolator[] f;
    public final cb2 g;
    public int h;
    public boolean i;
    public float j;
    public hq k;

    static {
        l = new int[]{533, 567, 850, 750};
        m = new int[]{1267, 1000, 333, 0};
        n = new r00(Float.class, "animationFraction", 13);
    }

    public xa2(Context r6, cb2 r7) {
        super(2);
        this.h = 0;
        this.k = null;
        this.g = r7;
        this.f = new Interpolator[]{AnimationUtils.loadInterpolator(r6, R.anim.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(r6, R.anim.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(r6, R.anim.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(r6, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // defpackage.rx1
    public final void d() {
        ObjectAnimator r0 = this.d;
        if (r0 == null) goto L6;
        r0.cancel();
        return;
    }

    @Override // defpackage.rx1
    public final void f() {
        this.h = 0;
        int r1 = g12.l(this.g.c[0], ((sx1) this.a).w);
        int[] r3 = (int[]) this.c;
        r3[0] = r1;
        r3[1] = r1;
    }

    @Override // defpackage.rx1
    public final void g(hq r1) {
        this.k = r1;
    }

    @Override // defpackage.rx1
    public final void i() {
        ObjectAnimator r0 = this.e;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.isRunning() == true) goto L13;
        d();
        if (((sx1) this.a).isVisible() == false) goto L12;
        this.e.setFloatValues(new float[]{this.j, 1.0f});
        this.e.setDuration((long) ((1.0f - this.j) * 1800.0f));
        this.e.start();
        return;
    L12:
        return;
    }

    @Override // defpackage.rx1
    public final void j() {
        ObjectAnimator r0 = this.d;
        r00 r5 = n;
        if (r0 != null) goto L6;
        ObjectAnimator r1 = ObjectAnimator.ofFloat(this, r5, new float[]{0.0f, 1.0f});
        this.d = r1;
        r1.setDuration(1800);
        this.d.setInterpolator(null);
        this.d.setRepeatCount(-1);
        this.d.addListener(new wa2(this, 0));
    L6:
        if (this.e != null) goto L8;
        ObjectAnimator r2 = ObjectAnimator.ofFloat(this, r5, new float[]{1.0f});
        this.e = r2;
        r2.setDuration(1800);
        this.e.setInterpolator(null);
        this.e.addListener(new wa2(this, 1));
    L8:
        this.h = 0;
        int r3 = g12.l(this.g.c[0], ((sx1) this.a).w);
        int[] r4 = (int[]) this.c;
        r4[0] = r3;
        r4[1] = r3;
        this.d.start();
    }

    @Override // defpackage.rx1
    public final void k() {
        this.k = null;
    }
}
