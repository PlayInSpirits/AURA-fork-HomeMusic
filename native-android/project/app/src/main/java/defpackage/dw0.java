package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dw0 extends Drawable {
    public static final float m = 0.0f;
    public final Paint a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final Path g;
    public final int h;
    public boolean i;
    public float j;
    public final float k;
    public final int l;

    static {
        m = (float) Math.toRadians(45.0d);
    }

    public dw0(Context r11) {
        Paint r0 = new Paint();
        this.a = r0;
        this.g = new Path();
        this.i = false;
        this.l = 2;
        r0.setStyle(Paint.Style.STROKE);
        r0.setStrokeJoin(Paint.Join.MITER);
        r0.setStrokeCap(Paint.Cap.BUTT);
        r0.setAntiAlias(true);
        TypedArray r12 = r11.getTheme().obtainStyledAttributes(null, st3.n, R.attr.drawerArrowStyle, R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        int r4 = r12.getColor(3, 0);
        if (r4 == r0.getColor()) goto L5;
        r0.setColor(r4);
        invalidateSelf();
    L5:
        float r5 = r12.getDimension(7, 0.0f);
        if (r0.getStrokeWidth() == r5) goto L8;
        r0.setStrokeWidth(r5);
        this.k = (float) (Math.cos(m) * ((double) (r5 / 2.0f)));
        invalidateSelf();
    L8:
        boolean r1 = r12.getBoolean(6, true);
        if (this.f == r1) goto L11;
        this.f = r1;
        invalidateSelf();
    L11:
        float r2 = Math.round(r12.getDimension(5, 0.0f));
        if (r2 == this.e) goto L14;
        this.e = r2;
        invalidateSelf();
    L14:
        this.h = r12.getDimensionPixelSize(4, 0);
        this.c = Math.round(r12.getDimension(2, 0.0f));
        this.b = Math.round(r12.getDimension(0, 0.0f));
        this.d = r12.getDimension(1, 0.0f);
        r12.recycle();
    }

    public static float a(float r0, float r1, float r2) {
        return xa3.a(r1, r0, r2, r0);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas r21) {
        Rect r2 = getBounds();
        boolean r3 = false;
        int r5 = this.l;
        if (r5 == 0) goto L13;
        if (r5 != 1) goto L6;
    L12:
        r3 = true;
        goto L13
    L6:
        if (r5 == 3) goto L11;
        if (getLayoutDirection() != 1) goto L13;
    L11:
        if (getLayoutDirection() == 0) goto L12;
    L13:
        float r6 = this.b;
        float r7 = (float) Math.sqrt((r6 * r6) * 2.0f);
        float r8 = this.j;
        float r9 = this.c;
        float r10 = a(r9, r7, r8);
        float r11 = a(r9, this.d, this.j);
        float r12 = this.j;
        float r13 = this.k;
        float r14 = Math.round(a(0.0f, r13, r12));
        float r15 = a(0.0f, m, this.j);
        if (r3 == false) goto L16;
        float r16 = 0.0f;
    L17:
        if (r3 == false) goto L19;
        float r17 = 180.0f;
    L20:
        float r18 = a(r16, r17, this.j);
        double r19 = r10;
        double r4 = r15;
        float r110 = Math.round(Math.cos(r4) * r19);
        float r20 = Math.round(Math.sin(r4) * r19);
        Path r22 = this.g;
        r22.rewind();
        Paint r111 = this.a;
        float r112 = r111.getStrokeWidth();
        float r23 = this.e;
        float r113 = a(r112 + r23, -r13, this.j);
        float r114 = (-r11) / 2.0f;
        r22.moveTo(r114 + r14, 0.0f);
        r22.rLineTo(r11 - (r14 * 2.0f), 0.0f);
        r22.moveTo(r114, r113);
        r22.rLineTo(r110, r20);
        r22.moveTo(r114, -r113);
        r22.rLineTo(r110, -r20);
        r22.close();
        r21.save();
        float r24 = r111.getStrokeWidth();
        float r25 = (((int) ((r2.height() - (3.0f * r24)) - (r23 * 2.0f))) / 4) * 2;
        r21.translate(r2.centerX(), ((r24 * 1.5f) + r23) + r25);
        if (this.f == true) goto L23;
        if (r3 == false) goto L29;
        r21.rotate(180.0f);
    L29:
        r21.drawPath(r22, r111);
        r21.restore();
        return;
    L23:
        if ((this.i ^ r3) == false) goto L25;
        int r26 = -1;
    L26:
        r21.rotate(r18 * r26);
        goto L29
    L25:
        r26 = 1;
        goto L26
    L19:
        r17 = 0.0f;
        goto L20
    L16:
        r16 = -180.0f;
        goto L17
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r3) {
        Paint r0 = this.a;
        if (r3 == r0.getAlpha()) goto L6;
        r0.setAlpha(r3);
        invalidateSelf();
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r2) {
        this.a.setColorFilter(r2);
        invalidateSelf();
    }

    public void setProgress(float r2) {
        if (this.j == r2) goto L6;
        this.j = r2;
        invalidateSelf();
        return;
    }
}
