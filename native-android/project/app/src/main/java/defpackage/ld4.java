package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ld4 extends Drawable {
    public final qq a;
    public final Paint b;
    public final Rect c;
    public final Matrix d;
    public ValueAnimator e;
    public kd4 f;

    public ld4() {
        this.a = new qq(5, this);
        Paint r0 = new Paint();
        this.b = r0;
        this.c = new Rect();
        this.d = new Matrix();
        r0.setAntiAlias(true);
    }

    public final void a() {
        ValueAnimator r0 = this.e;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.isStarted() == true) goto L15;
        kd4 r1 = this.f;
        if (r1 != null) goto L9;
        return;
    L9:
        if (r1.o == true) goto L11;
        return;
    L11:
        if (getCallback() == null) goto L18;
        this.e.start();
        return;
    L18:
        return;
    }

    public final void b() {
        Rect r0 = getBounds();
        int r1 = r0.width();
        int r2 = r0.height();
        if (r1 == 0) goto L33;
        if (r2 == 0) goto L34;
        kd4 r3 = this.f;
        if (r3 == null) goto L35;
        int r4 = r3.g;
        if (r4 > 0) goto L12;
        r4 = Math.round(r3.i * r1);
    L12:
        kd4 r5 = this.f;
        int r6 = r5.h;
        if (r6 > 0) goto L16;
        r6 = Math.round(r5.j * r2);
    L16:
        kd4 r7 = this.f;
        boolean r8 = true;
        if (r7.f == 1) goto L30;
        int r9 = r7.c;
        if (r9 != 1) goto L21;
    L24:
        if (r8 == false) goto L26;
        r4 = 0;
    L26:
        if (r8 == true) goto L29;
        r6 = 0;
    L29:
        kd4 r10 = this.f;
        Shader r11 = new LinearGradient(0.0f, 0.0f, r4, r6, r10.b, r10.a, Shader.TileMode.CLAMP);
    L31:
        this.b.setShader(r11);
        return;
    L21:
        if (r9 == 3) goto L24;
        r8 = false;
        goto L24
    L30:
        float r12 = (float) (((double) Math.max(r4, r6)) / Math.sqrt(2.0d));
        kd4 r13 = this.f;
        r11 = new RadialGradient(r4 / 2.0f, r6 / 2.0f, r12, r13.b, r13.a, Shader.TileMode.CLAMP);
        goto L31
    L35:
        return;
    L34:
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas r10) {
        if (this.f == null) goto L24;
        Paint r0 = this.b;
        if (r0.getShader() == null) goto L25;
        float r1 = (float) Math.tan(Math.toRadians(this.f.m));
        Rect r2 = this.c;
        float r4 = (r2.width() * r1) + r2.height();
        float r3 = (r1 * r2.height()) + r2.width();
        ValueAnimator r5 = this.e;
        float r6 = 0.0f;
        if (r5 == null) goto L10;
        float r7 = r5.getAnimatedFraction();
    L11:
        int r8 = this.f.c;
        if (r8 != 1) goto L14;
        float r9 = -r4;
        float r11 = xa3.a(r4, r9, r7, r9);
    L22:
        Matrix r12 = this.d;
        r12.reset();
        r12.setRotate(this.f.m, r2.width() / 2.0f, r2.height() / 2.0f);
        r12.postTranslate(r6, r11);
        r0.getShader().setLocalMatrix(r12);
        r10.drawRect(r2, r0);
        return;
    L14:
        if (r8 != 2) goto L16;
        float r13 = xa3.a(-r3, r3, r7, r3);
    L18:
        r6 = r13;
        r11 = 0.0f;
        goto L22
    L16:
        if (r8 == 3) goto L19;
        float r14 = -r3;
        r13 = xa3.a(r3, r14, r7, r14);
        goto L18
    L19:
        r11 = xa3.a(-r4, r4, r7, r4);
        goto L22
    L10:
        r7 = 0.0f;
        goto L11
    L25:
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        kd4 r1 = this.f;
        if (r1 != null) goto L5;
        return -1;
    L5:
        if (r1.n == false) goto L7;
        return -3;
    L7:
        if (r1.p == false) goto L13;
        return -3;
    L13:
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect r4) {
        super.onBoundsChange(r4);
        int r0 = r4.width();
        int r5 = r4.height();
        this.c.set(0, 0, r0, r5);
        b();
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r1) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r1) {
    }
}
