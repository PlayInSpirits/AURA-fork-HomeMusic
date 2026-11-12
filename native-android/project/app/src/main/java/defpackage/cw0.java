package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cw0 extends Drawable implements Animatable {
    public static final r00 x = new r00(Float.class, "growFraction", 7);
    public final Context n;
    public final jq o;
    public ObjectAnimator q;
    public ObjectAnimator r;
    public ArrayList s;
    public boolean t;
    public float u;
    public int w;
    public final Paint v = new Paint();
    public ee p = new ee();

    public cw0(Context context, jq jqVar) {
        this.n = context;
        this.o = jqVar;
        setAlpha(255);
    }

    public final float b() {
        jq jqVar = this.o;
        if (jqVar.e == 0 && jqVar.f == 0) {
            return 1.0f;
        }
        return this.u;
    }

    public final boolean c() {
        ObjectAnimator objectAnimator = this.r;
        return objectAnimator != null && objectAnimator.isRunning();
    }

    public final boolean d() {
        ObjectAnimator objectAnimator = this.q;
        return objectAnimator != null && objectAnimator.isRunning();
    }

    public final boolean e(boolean z, boolean z2, boolean z3) {
        ee eeVar = this.p;
        ContentResolver contentResolver = this.n.getContentResolver();
        eeVar.getClass();
        return f(z, z2, z3 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    public boolean f(boolean z, boolean z2, boolean z3) {
        ObjectAnimator objectAnimator = this.q;
        int i = 0;
        r00 r00Var = x;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, r00Var, 0.0f, 1.0f);
            this.q = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.q.setInterpolator(yd.b);
            ObjectAnimator objectAnimator2 = this.q;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                kf2.n("Cannot set showAnimator while the current showAnimator is running.");
                return false;
            }
            this.q = objectAnimator2;
            objectAnimator2.addListener(new bw0(this, i));
        }
        int i2 = 1;
        if (this.r == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, r00Var, 1.0f, 0.0f);
            this.r = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.r.setInterpolator(yd.b);
            ObjectAnimator objectAnimator3 = this.r;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                kf2.n("Cannot set hideAnimator while the current hideAnimator is running.");
                return false;
            }
            this.r = objectAnimator3;
            objectAnimator3.addListener(new bw0(this, i2));
        }
        if (isVisible() || z) {
            ObjectAnimator objectAnimator4 = z ? this.q : this.r;
            ObjectAnimator objectAnimator5 = z ? this.r : this.q;
            if (!z3) {
                if (objectAnimator5.isRunning()) {
                    boolean z4 = this.t;
                    this.t = true;
                    new ValueAnimator[]{objectAnimator5}[0].cancel();
                    this.t = z4;
                }
                if (objectAnimator4.isRunning()) {
                    objectAnimator4.end();
                } else {
                    boolean z5 = this.t;
                    this.t = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.t = z5;
                }
                return super.setVisible(z, false);
            }
            if (!z3 || !objectAnimator4.isRunning()) {
                boolean z6 = !z || super.setVisible(z, false);
                jq jqVar = this.o;
                if (!z ? jqVar.f != 0 : jqVar.e != 0) {
                    boolean z7 = this.t;
                    this.t = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.t = z7;
                    return z6;
                }
                if (z2 || !objectAnimator4.isPaused()) {
                    objectAnimator4.start();
                    return z6;
                }
                objectAnimator4.resume();
                return z6;
            }
        }
        return false;
    }

    public final void g(hq hqVar) {
        ArrayList arrayList = this.s;
        if (arrayList == null || !arrayList.contains(hqVar)) {
            return;
        }
        this.s.remove(hqVar);
        if (this.s.isEmpty()) {
            this.s = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.w;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return d() || c();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.w = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.v.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return e(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        f(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        f(false, true, false);
    }
}
