package defpackage;

import android.animation.ObjectAnimator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a30 extends rx1 {
    public static final int[] l = {0, 1350, 2700, 4050};
    public static final int[] m = {667, 2017, 3367, 4717};
    public static final int[] n = {1000, 2350, 3700, 5050};
    public static final r00 o = new r00(Float.class, "animationFraction", 5);
    public static final r00 p = new r00(Float.class, "completeEndFraction", 6);
    public ObjectAnimator d;
    public ObjectAnimator e;
    public final a61 f;
    public final g30 g;
    public int h;
    public float i;
    public float j;
    public hq k;

    public a30(g30 g30Var) {
        super(1);
        this.h = 0;
        this.k = null;
        this.g = g30Var;
        this.f = new a61(1);
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
        ((int[]) this.c)[0] = g12.l(this.g.c[0], ((sx1) this.a).w);
        this.j = 0.0f;
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
        if (((sx1) this.a).isVisible()) {
            this.e.start();
        } else {
            d();
        }
    }

    @Override // defpackage.rx1
    public final void j() {
        if (this.d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, o, 0.0f, 1.0f);
            this.d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.d.setInterpolator(null);
            this.d.setRepeatCount(-1);
            this.d.addListener(new z20(this, 0));
        }
        if (this.e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, p, 0.0f, 1.0f);
            this.e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.e.setInterpolator(this.f);
            this.e.addListener(new z20(this, 1));
        }
        this.h = 0;
        ((int[]) this.c)[0] = g12.l(this.g.c[0], ((sx1) this.a).w);
        this.j = 0.0f;
        this.d.start();
    }

    @Override // defpackage.rx1
    public final void k() {
        this.k = null;
    }
}
