package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class bk1 implements uj1 {
    public static final ak1 A = new ak1();
    public final qv0 b;
    public final nz c;
    public final v65 d;
    public final Resources e;
    public final Rect f;
    public Paint g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public float p;
    public boolean q;
    public long r;
    public float s;
    public float t;
    public long u;
    public long v;
    public int w;
    public int x;
    public int y;
    public int z;

    public bk1(qv0 qv0Var) {
        nz nzVar = new nz();
        mz mzVar = new mz();
        this.b = qv0Var;
        this.c = nzVar;
        v65 v65Var = new v65(qv0Var, nzVar, mzVar);
        this.d = v65Var;
        this.e = qv0Var.getResources();
        this.f = new Rect();
        qv0Var.addView(v65Var);
        v65Var.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.n = 3;
        this.o = 0;
        this.p = 1.0f;
        this.r = 9205357640488583168L;
        this.s = 1.0f;
        this.t = 1.0f;
        long j = x40.b;
        this.u = j;
        this.v = j;
    }

    @Override // defpackage.uj1
    public final void A(float f) {
        this.s = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.uj1
    public final float B() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.uj1
    public final void C() {
        this.d.setElevation(0.0f);
    }

    @Override // defpackage.uj1
    public final float D() {
        return 0.0f;
    }

    @Override // defpackage.uj1
    public final void E() {
        this.d.setTranslationX(0.0f);
    }

    @Override // defpackage.uj1
    public final void F(boolean z) {
        boolean z2 = false;
        this.m = z && !this.l;
        this.k = true;
        if (z && this.l) {
            z2 = true;
        }
        this.d.setClipToOutline(z2);
    }

    @Override // defpackage.uj1
    public final float G() {
        return 0.0f;
    }

    @Override // defpackage.uj1
    public final void H(int i) {
        this.o = i;
        Q();
    }

    @Override // defpackage.uj1
    public final void I() {
        this.d.setRotation(0.0f);
    }

    @Override // defpackage.uj1
    public final void J(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.v = j;
            this.d.setOutlineSpotShadowColor(e35.U(j));
        }
    }

    @Override // defpackage.uj1
    public final Matrix K() {
        return this.d.getMatrix();
    }

    @Override // defpackage.uj1
    public final void L(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.uj1
    public final float M() {
        return 0.0f;
    }

    @Override // defpackage.uj1
    public final float N() {
        return this.t;
    }

    @Override // defpackage.uj1
    public final int O() {
        return this.n;
    }

    public final void P() {
        boolean z = this.m;
        v65 v65Var = this.d;
        if (z || v65Var.getClipToOutline()) {
            this.k = true;
        }
        int i = this.h;
        int i2 = i - this.w;
        int i3 = this.i;
        int i4 = i3 - this.x;
        long j = this.j;
        v65Var.layout(i2, i4, i + ((int) (j >> 32)) + this.y, i3 + ((int) (j & 4294967295L)) + this.z);
    }

    public final void Q() {
        int i = this.o;
        if (i != 1 && this.n == 3) {
            a(i);
        } else {
            a(1);
        }
    }

    public final void R() {
        boolean z = this.q;
        v65 v65Var = this.d;
        if (z || g83.b(this.r, 9205357640488583168L)) {
            v65Var.setPivotX((((int) (this.j >> 32)) / 2.0f) + this.w);
            v65Var.setPivotY((((int) (this.j & 4294967295L)) / 2.0f) + this.x);
        } else {
            v65Var.setPivotX(Float.intBitsToFloat((int) (this.r >> 32)) + this.w);
            v65Var.setPivotY(Float.intBitsToFloat((int) (this.r & 4294967295L)) + this.x);
        }
    }

    public final void a(int i) {
        v65 v65Var = this.d;
        boolean z = true;
        if (i == 1) {
            v65Var.setLayerType(2, this.g);
        } else {
            Paint paint = this.g;
            if (i == 2) {
                v65Var.setLayerType(0, paint);
                z = false;
            } else {
                v65Var.setLayerType(0, paint);
            }
        }
        v65Var.setCanUseCompositingLayer$ui_graphics(z);
    }

    @Override // defpackage.uj1
    public final float b() {
        return this.p;
    }

    @Override // defpackage.uj1
    public final float c() {
        return this.s;
    }

    @Override // defpackage.uj1
    public final void d(Outline outline, long j) {
        v65 v65Var = this.d;
        v65Var.r = outline;
        v65Var.invalidateOutline();
        if ((this.m || v65Var.getClipToOutline()) && outline != null) {
            v65Var.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        this.l = outline != null;
    }

    @Override // defpackage.uj1
    public final void e(int i) {
        this.n = i;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(q05.B(i)));
        Q();
    }

    @Override // defpackage.uj1
    public final void f() {
        this.b.removeViewInLayout(this.d);
    }

    @Override // defpackage.uj1
    public final void g(jz jzVar) {
        Rect rect;
        boolean z = this.k;
        v65 v65Var = this.d;
        if (z) {
            if ((this.m || v65Var.getClipToOutline()) && !this.l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = v65Var.getWidth();
                rect.bottom = v65Var.getHeight();
            } else {
                rect = null;
            }
            v65Var.setClipBounds(rect);
        }
        Canvas canvas = ba.a;
        if (((aa) jzVar).a.isHardwareAccelerated()) {
            this.b.a(jzVar, v65Var, v65Var.getDrawingTime());
        }
    }

    @Override // defpackage.uj1
    public final int h() {
        return this.o;
    }

    @Override // defpackage.uj1
    public final dt i() {
        return null;
    }

    @Override // defpackage.uj1
    public final void j(float f) {
        this.t = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.uj1
    public final void k(int i, int i2, long j) {
        if (!n02.a(this.j, j)) {
            this.h = i;
            this.i = i2;
            this.j = j;
            P();
            return;
        }
        int i3 = this.h;
        v65 v65Var = this.d;
        if (i3 != i) {
            v65Var.offsetLeftAndRight(i - i3);
        }
        int i4 = this.i;
        if (i4 != i2) {
            v65Var.offsetTopAndBottom(i2 - i4);
        }
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.uj1
    public final float l() {
        return 0.0f;
    }

    @Override // defpackage.uj1
    public final float n() {
        return 0.0f;
    }

    @Override // defpackage.uj1
    public final void o(long j) {
        this.r = j;
        this.q = (j & 9223372034707292159L) == 9205357640488583168L;
        R();
    }

    @Override // defpackage.uj1
    public final long p() {
        return this.u;
    }

    @Override // defpackage.uj1
    public final void q(oo0 oo0Var, r62 r62Var, sj1 sj1Var, ir0 ir0Var) {
        v65 v65Var = this.d;
        ViewParent parent = v65Var.getParent();
        qv0 qv0Var = this.b;
        if (parent == null) {
            qv0Var.addView(v65Var);
        }
        float f = this.w;
        float f2 = this.x;
        long floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
        float intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
        v65Var.t = oo0Var;
        v65Var.u = r62Var;
        v65Var.v = ir0Var;
        v65Var.w = sj1Var;
        v65Var.x = intBitsToFloat;
        v65Var.y = intBitsToFloat2;
        if (v65Var.isAttachedToWindow()) {
            v65Var.setVisibility(4);
            v65Var.setVisibility(0);
            try {
                nz nzVar = this.c;
                ak1 ak1Var = A;
                aa aaVar = nzVar.a;
                Canvas canvas = aaVar.a;
                aaVar.a = ak1Var;
                qv0Var.a(aaVar, v65Var, v65Var.getDrawingTime());
                nzVar.a.a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // defpackage.uj1
    public final void r() {
        this.d.setRotationX(0.0f);
    }

    @Override // defpackage.uj1
    public final void s(float f) {
        this.p = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.uj1
    public final void t(int i, int i2, int i3, int i4) {
        if (!(i >= 0 && i2 >= 0 && i3 >= 0 && i4 >= 0)) {
            StringBuilder t = b11.t("Outsets cannot be negative! Left: ", ", Top: ", i, i2, ", Right: ");
            t.append(i3);
            t.append(", Bottom: ");
            t.append(i4);
            bz1.a(t.toString());
        }
        int i5 = this.w;
        if (i == i5 && i2 == this.x && i3 == this.y && i4 == this.z) {
            return;
        }
        boolean z = (i == i5 && i2 == this.x) ? false : true;
        this.w = i;
        this.x = i2;
        this.y = i3;
        this.z = i4;
        P();
        if (z) {
            R();
        }
    }

    @Override // defpackage.uj1
    public final float u() {
        return 0.0f;
    }

    @Override // defpackage.uj1
    public final void v() {
        this.d.setTranslationY(0.0f);
    }

    @Override // defpackage.uj1
    public final void w() {
        this.d.setRotationY(0.0f);
    }

    @Override // defpackage.uj1
    public final long x() {
        return this.v;
    }

    @Override // defpackage.uj1
    public final void y(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.u = j;
            this.d.setOutlineAmbientShadowColor(e35.U(j));
        }
    }

    @Override // defpackage.uj1
    public final void z() {
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setColorFilter(null);
        Q();
    }
}
