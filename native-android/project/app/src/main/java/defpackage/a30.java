package defpackage;

import android.animation.ObjectAnimator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a30 extends rx1 {
    public static final int[] l = null;
    public static final int[] m = null;
    public static final int[] n = null;
    public static final r00 o = null;
    public static final r00 p = null;
    public ObjectAnimator d;
    public ObjectAnimator e;
    public final a61 f;
    public final g30 g;
    public int h;
    public float i;
    public float j;
    public hq k;

    static {
        l = new int[]{0, 1350, 2700, 4050};
        m = new int[]{667, 2017, 3367, 4717};
        n = new int[]{1000, 2350, 3700, 5050};
        o = new r00(Float.class, "animationFraction", 5);
        p = new r00(Float.class, "completeEndFraction", 6);
    }

    public a30(g30 r2) {
        super(1);
        this.h = 0;
        this.k = null;
        this.g = r2;
        this.f = new a61(1);
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
        ((int[]) this.c)[0] = g12.l(this.g.c[0], ((sx1) this.a).w);
        this.j = 0.0f;
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
        if (r0.isRunning() == false) goto L8;
        return;
    L8:
        if (((sx1) this.a).isVisible() == false) goto L11;
        this.e.start();
        return;
    L11:
        d();
    }

    @Override // defpackage.rx1
    public final void j() {
        if (this.d != null) goto L6;
        r00 r3 = o;
        ObjectAnimator r0 = ObjectAnimator.ofFloat(this, r3, new float[]{0.0f, 1.0f});
        this.d = r0;
        r0.setDuration(5400);
        this.d.setInterpolator(null);
        this.d.setRepeatCount(-1);
        this.d.addListener(new z20(this, 0));
    L6:
        if (this.e != null) goto L8;
        r00 r2 = p;
        ObjectAnimator r1 = ObjectAnimator.ofFloat(this, r2, new float[]{0.0f, 1.0f});
        this.e = r1;
        r1.setDuration(333);
        this.e.setInterpolator(this.f);
        this.e.addListener(new z20(this, 1));
    L8:
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
