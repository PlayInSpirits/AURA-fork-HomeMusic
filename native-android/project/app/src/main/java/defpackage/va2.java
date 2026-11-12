package defpackage;

import android.animation.ObjectAnimator;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class va2 extends rx1 {
    public static final r00 j = null;
    public ObjectAnimator d;
    public final a61 e;
    public final cb2 f;
    public int g;
    public boolean h;
    public float i;

    static {
        j = new r00(Float.class, "animationFraction", 12);
    }

    public va2(cb2 r2) {
        super(3);
        this.g = 1;
        this.f = r2;
        this.e = new a61(1);
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
        this.h = true;
        this.g = 1;
        Arrays.fill((int[]) this.c, g12.l(this.f.c[0], ((sx1) this.a).w));
    }

    @Override // defpackage.rx1
    public final void g(hq r1) {
    }

    @Override // defpackage.rx1
    public final void i() {
    }

    @Override // defpackage.rx1
    public final void j() {
        if (this.d != null) goto L5;
        r00 r1 = j;
        ObjectAnimator r0 = ObjectAnimator.ofFloat(this, r1, new float[]{0.0f, 1.0f});
        this.d = r0;
        r0.setDuration(333);
        this.d.setInterpolator(null);
        this.d.setRepeatCount(-1);
        this.d.addListener(new l4(10, this));
    L5:
        this.h = true;
        this.g = 1;
        Arrays.fill((int[]) this.c, g12.l(this.f.c[0], ((sx1) this.a).w));
        this.d.start();
    }

    @Override // defpackage.rx1
    public final void k() {
    }
}
