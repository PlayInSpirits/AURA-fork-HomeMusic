package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f30 extends Drawable implements Animatable {
    public static final LinearInterpolator t = null;
    public static final a61 u = null;
    public static final int[] v = null;
    public final e30 n;
    public float o;
    public final Resources p;
    public final ValueAnimator q;
    public float r;
    public boolean s;

    static {
        t = new LinearInterpolator();
        u = new a61(1);
        v = new int[]{-16777216};
    }

    public f30(Context r3) {
        r3.getClass();
        this.p = r3.getResources();
        e30 r4 = new e30();
        this.n = r4;
        r4.i = v;
        r4.a(0);
        r4.h = 2.5f;
        r4.b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator r0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        r0.addUpdateListener(new c30(this, r4));
        r0.setRepeatCount(-1);
        r0.setRepeatMode(1);
        r0.setInterpolator(t);
        r0.addListener(new d30(this, r4));
        this.q = r0;
    }

    public static void d(float r8, e30 r9) {
        if (r8 <= 0.75f) goto L6;
        float r10 = (r8 - 0.75f) / 0.25f;
        int[] r0 = r9.i;
        int r1 = r9.j;
        int r2 = r0[r1];
        int r3 = r0[(r1 + 1) % r0.length];
        int r4 = (r2 >> 24) & 255;
        int r5 = (r2 >> 16) & 255;
        int r6 = (r2 >> 8) & 255;
        int r7 = r2 & 255;
        r9.u = ((((r4 + ((int) ((((r3 >> 24) & 255) - r4) * r10))) << 24) | ((r5 + ((int) ((((r3 >> 16) & 255) - r5) * r10))) << 16)) | ((r6 + ((int) ((((r3 >> 8) & 255) - r6) * r10))) << 8)) | (r7 + ((int) (r10 * ((r3 & 255) - r7))));
        return;
    L6:
        r9.u = r9.i[r9.j];
    }

    public final void a(float r8, e30 r9, boolean r10) {
        if (this.s == false) goto L7;
        d(r8, r9);
        float r7 = (float) (Math.floor(r9.m / 0.8f) + 1.0d);
        float r11 = r9.k;
        float r0 = r9.l;
        r9.e = (((r0 - 0.01f) - r11) * r8) + r11;
        r9.f = r0;
        float r12 = r9.m;
        r9.g = xa3.a(r7, r12, r8, r12);
        return;
    L7:
        if (r8 != 1.0f) goto L11;
        if (r10 == true) goto L11;
        return;
    L11:
        float r13 = r9.m;
        float r4 = r9.k;
        a61 r5 = u;
        if (r8 >= 0.5f) goto L14;
        float r1 = ((r5.getInterpolation(r8 / 0.5f) * 0.79f) + 0.01f) + r4;
    L15:
        float r2 = (0.20999998f * r8) + r13;
        float r14 = (r8 + this.r) * 216.0f;
        r9.e = r4;
        r9.f = r1;
        r9.g = r2;
        this.o = r14;
        return;
    L14:
        float r3 = r4 + 0.79f;
        r4 = r3 - (((1.0f - r5.getInterpolation((r8 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
        r1 = r3;
        goto L15
    }

    public final void b(float r3, float r4, float r5, float r6) {
        float r0 = this.p.getDisplayMetrics().density;
        float r7 = r4 * r0;
        e30 r2 = this.n;
        r2.h = r7;
        r2.b.setStrokeWidth(r7);
        r2.q = r3 * r0;
        r2.a(0);
        r2.r = (int) (r5 * r0);
        r2.s = (int) (r6 * r0);
    }

    public final void c(int r4) {
        if (r4 != 0) goto L4;
        b(11.0f, 3.0f, 12.0f, 6.0f);
    L5:
        invalidateSelf();
        return;
    L4:
        b(7.5f, 2.5f, 10.0f, 5.0f);
        goto L5
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas r12) {
        Rect r0 = getBounds();
        r12.save();
        r12.rotate(this.o, r0.exactCenterX(), r0.exactCenterY());
        e30 r11 = this.n;
        Paint r6 = r11.b;
        RectF r2 = r11.a;
        float r1 = r11.q;
        float r3 = (r11.h / 2.0f) + r1;
        if (r1 > 0.0f) goto L5;
        r3 = (Math.min(r0.width(), r0.height()) / 2.0f) - Math.max((r11.r * r11.p) / 2.0f, r11.h / 2.0f);
    L5:
        r2.set(r0.centerX() - r3, r0.centerY() - r3, r0.centerX() + r3, r0.centerY() + r3);
        float r4 = r11.e;
        float r5 = r11.g;
        float r7 = (r4 + r5) * 360.0f;
        float r8 = ((r11.f + r5) * 360.0f) - r7;
        r6.setColor(r11.u);
        r6.setAlpha(r11.t);
        float r9 = r11.h / 2.0f;
        r2.inset(r9, r9);
        r12.drawCircle(r2.centerX(), r2.centerY(), r2.width() / 2.0f, r11.d);
        float r10 = -r9;
        r2.inset(r10, r10);
        r12.drawArc(r2, r7, r8, false, r6);
        Paint r13 = r11.c;
        if (r11.n == false) goto L12;
        Path r14 = r11.o;
        if (r14 != null) goto L10;
        Path r15 = new Path();
        r11.o = r15;
        r15.setFillType(Path.FillType.EVEN_ODD);
    L11:
        float r16 = Math.min(r2.width(), r2.height()) / 2.0f;
        float r17 = (r11.r * r11.p) / 2.0f;
        r11.o.moveTo(0.0f, 0.0f);
        r11.o.lineTo(r11.r * r11.p, 0.0f);
        Path r18 = r11.o;
        float r19 = r11.r;
        float r20 = r11.p;
        r18.lineTo((r19 * r20) / 2.0f, r11.s * r20);
        r11.o.offset((r2.centerX() + r16) - r17, (r11.h / 2.0f) + r2.centerY());
        r11.o.close();
        r13.setColor(r11.u);
        r13.setAlpha(r11.t);
        r12.save();
        r12.rotate(r7 + r8, r2.centerX(), r2.centerY());
        r12.drawPath(r11.o, r13);
        r12.restore();
        goto L12
    L10:
        r14.reset();
    L12:
        r12.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.n.t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.q.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
        this.n.t = r2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r2) {
        this.n.b.setColorFilter(r2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ValueAnimator r0 = this.q;
        r0.cancel();
        e30 r1 = this.n;
        float r2 = r1.e;
        r1.k = r2;
        float r3 = r1.f;
        r1.l = r3;
        r1.m = r1.g;
        if (r3 == r2) goto L6;
        this.s = true;
        r0.setDuration(666);
        r0.start();
        return;
    L6:
        r1.a(0);
        r1.k = 0.0f;
        r1.l = 0.0f;
        r1.m = 0.0f;
        r1.e = 0.0f;
        r1.f = 0.0f;
        r1.g = 0.0f;
        r0.setDuration(1332);
        r0.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.q.cancel();
        this.o = 0.0f;
        e30 r1 = this.n;
        if (r1.n == false) goto L5;
        r1.n = false;
    L5:
        r1.a(0);
        r1.k = 0.0f;
        r1.l = 0.0f;
        r1.m = 0.0f;
        r1.e = 0.0f;
        r1.f = 0.0f;
        r1.g = 0.0f;
        invalidateSelf();
    }
}
