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
    public static final r00 x = null;
    public final Context n;
    public final jq o;
    public ee p;
    public ObjectAnimator q;
    public ObjectAnimator r;
    public ArrayList s;
    public boolean t;
    public float u;
    public final Paint v;
    public int w;

    static {
        Class<Float> r3 = Float.class;
        x = new r00(r3, "growFraction", 7);
    }

    public cw0(Context r2, jq r3) {
        this.v = new Paint();
        this.n = r2;
        this.o = r3;
        this.p = new ee();
        setAlpha(255);
    }

    public static /* synthetic */ void a(cw0 r1) {
        super.setVisible(false, false);
    }

    public final float b() {
        jq r0 = this.o;
        if (r0.e != 0) goto L8;
        if (r0.f != 0) goto L8;
        return 1.0f;
    L8:
        return this.u;
    }

    public final boolean c() {
        ObjectAnimator r0 = this.r;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.isRunning() == false) goto L11;
        return true;
    L11:
        return false;
    }

    public final boolean d() {
        ObjectAnimator r0 = this.q;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.isRunning() == false) goto L11;
        return true;
    L11:
        return false;
    }

    public final boolean e(boolean r4, boolean r5, boolean r6) {
        ee r0 = this.p;
        ContentResolver r1 = this.n.getContentResolver();
        r0.getClass();
        float r2 = Settings.Global.getFloat(r1, "animator_duration_scale", 1.0f);
        if (r6 == true) goto L5;
    L7:
        boolean r7 = false;
    L9:
        return f(r4, r5, r7);
    L5:
        if (r2 <= 0.0f) goto L7;
        r7 = true;
        goto L9
    }

    public boolean f(boolean r8, boolean r9, boolean r10) {
        ObjectAnimator r0 = this.q;
        int r2 = 0;
        r00 r5 = x;
        if (r0 != null) goto L12;
        ObjectAnimator r1 = ObjectAnimator.ofFloat(this, r5, new float[]{0.0f, 1.0f});
        this.q = r1;
        r1.setDuration(500);
        this.q.setInterpolator(yd.b);
        ObjectAnimator r3 = this.q;
        if (r3 != null) goto L7;
    L11:
        this.q = r3;
        r3.addListener(new bw0(this, r2));
        goto L12
    L7:
        if (r3.isRunning() == false) goto L11;
        kf2.n("Cannot set showAnimator while the current showAnimator is running.");
        return false;
    L12:
        int r6 = 1;
        if (this.r != null) goto L23;
        ObjectAnimator r4 = ObjectAnimator.ofFloat(this, r5, new float[]{1.0f, 0.0f});
        this.r = r4;
        r4.setDuration(500);
        this.r.setInterpolator(yd.b);
        ObjectAnimator r7 = this.r;
        if (r7 != null) goto L17;
    L21:
        this.r = r7;
        r7.addListener(new bw0(this, r6));
        goto L23
    L17:
        if (r7.isRunning() == false) goto L21;
        kf2.n("Cannot set hideAnimator while the current hideAnimator is running.");
        return false;
    L23:
        if (isVisible() == true) goto L26;
        if (r8 == true) goto L26;
    L45:
        return false;
    L26:
        if (r8 == false) goto L28;
        ObjectAnimator r11 = this.q;
    L29:
        if (r8 == false) goto L31;
        ObjectAnimator r12 = this.r;
    L32:
        if (r10 == false) goto L34;
        if (r10 == true) goto L44;
    L46:
        if (r8 == true) goto L48;
    L51:
        boolean r13 = true;
    L52:
        jq r14 = this.o;
        if (r8 == false) goto L58;
        if (r14.e != 0) goto L59;
    L67:
        boolean r15 = this.t;
        this.t = true;
        new ValueAnimator[]{r11}[0].end();
        this.t = r15;
        return r13;
    L59:
        if (r9 == false) goto L61;
    L65:
        r11.start();
        return r13;
    L61:
        if (r11.isPaused() == false) goto L65;
        r11.resume();
        return r13;
    L58:
        if (r14.f == 0) goto L67;
    L48:
        if (super.setVisible(r8, false) == true) goto L51;
        r13 = false;
        goto L52
    L44:
        if (r11.isRunning() == false) goto L46;
    L34:
        if (r12.isRunning() == false) goto L37;
        boolean r16 = this.t;
        this.t = true;
        new ValueAnimator[]{r12}[0].cancel();
        this.t = r16;
    L37:
        if (r11.isRunning() == false) goto L39;
        r11.end();
    L41:
        return super.setVisible(r8, false);
    L39:
        boolean r17 = this.t;
        this.t = true;
        new ValueAnimator[]{r11}[0].end();
        this.t = r17;
        goto L41
    L31:
        r12 = this.q;
        goto L32
    L28:
        r11 = this.r;
        goto L29
    }

    public final void g(hq r2) {
        ArrayList r0 = this.s;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.contains(r2) == false) goto L11;
        this.s.remove(r2);
        if (this.s.isEmpty() == false) goto L12;
        this.s = null;
        return;
    L12:
        return;
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
        if (d() == false) goto L5;
        return true;
    L5:
        if (c() == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r1) {
        this.w = r1;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r2) {
        this.v.setColorFilter(r2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean r2, boolean r3) {
        return e(r2, r3, true);
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
