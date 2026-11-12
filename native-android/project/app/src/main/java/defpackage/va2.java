package defpackage;

import android.animation.ObjectAnimator;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class va2 extends rx1 {
    public static final r00 j = new r00(Float.class, "animationFraction", 12);
    public ObjectAnimator d;
    public final a61 e;
    public final cb2 f;
    public int g;
    public boolean h;
    public float i;

    public va2(cb2 cb2Var) {
        super(3);
        this.g = 1;
        this.f = cb2Var;
        this.e = new a61(1);
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
        this.h = true;
        this.g = 1;
        Arrays.fill((int[]) this.c, g12.l(this.f.c[0], ((sx1) this.a).w));
    }

    @Override // defpackage.rx1
    public final void g(hq hqVar) {
    }

    @Override // defpackage.rx1
    public final void i() {
    }

    @Override // defpackage.rx1
    public final void j() {
        if (this.d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, j, 0.0f, 1.0f);
            this.d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.d.setInterpolator(null);
            this.d.setRepeatCount(-1);
            this.d.addListener(new l4(10, this));
        }
        this.h = true;
        this.g = 1;
        Arrays.fill((int[]) this.c, g12.l(this.f.c[0], ((sx1) this.a).w));
        this.d.start();
    }

    @Override // defpackage.rx1
    public final void k() {
    }
}
