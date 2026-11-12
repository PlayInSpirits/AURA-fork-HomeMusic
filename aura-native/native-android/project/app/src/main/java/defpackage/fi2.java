package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class fi2 extends Drawable implements lc4 {
    public static final Paint J;
    public final Paint A;
    public final Paint B;
    public final yb4 C;
    public final pz1 D;
    public final fo1 E;
    public PorterDuffColorFilter F;
    public PorterDuffColorFilter G;
    public final RectF H;
    public boolean I;
    public ei2 n;
    public final jc4[] o;
    public final jc4[] p;
    public final BitSet q;
    public boolean r;
    public final Matrix s;
    public final Path t;
    public final Path u;
    public final RectF v;
    public final RectF w;
    public final Region x;
    public final Region y;
    public bc4 z;

    static {
        Paint paint = new Paint(1);
        J = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public fi2(ei2 ei2Var) {
        int i = 4;
        this.o = new jc4[4];
        this.p = new jc4[4];
        this.q = new BitSet(8);
        this.s = new Matrix();
        this.t = new Path();
        this.u = new Path();
        this.v = new RectF();
        this.w = new RectF();
        this.x = new Region();
        this.y = new Region();
        Paint paint = new Paint(1);
        this.A = paint;
        Paint paint2 = new Paint(1);
        this.B = paint2;
        this.C = new yb4();
        this.E = Looper.getMainLooper().getThread() == Thread.currentThread() ? cc4.a : new fo1();
        this.H = new RectF();
        this.I = true;
        this.n = ei2Var;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        t();
        s(getState());
        this.D = new pz1(i, this);
    }

    public void a() {
        invalidateSelf();
    }

    public final void b(RectF rectF, Path path) {
        ei2 ei2Var = this.n;
        this.E.d(ei2Var.a, ei2Var.i, rectF, this.D, path);
        if (this.n.h != 1.0f) {
            Matrix matrix = this.s;
            matrix.reset();
            float f = this.n.h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.H, true);
    }

    public final int c(int i) {
        ei2 ei2Var = this.n;
        float f = ei2Var.m + 0.0f + ei2Var.l;
        nz0 nz0Var = ei2Var.b;
        return nz0Var != null ? nz0Var.b(i, f) : i;
    }

    public final void d(Canvas canvas) {
        if (this.q.cardinality() > 0) {
            Log.w("fi2", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.n.p;
        Path path = this.t;
        yb4 yb4Var = this.C;
        if (i != 0) {
            canvas.drawPath(path, (Paint) yb4Var.d);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            jc4 jc4Var = this.o[i2];
            int i3 = this.n.o;
            Matrix matrix = jc4.b;
            jc4Var.a(matrix, yb4Var, i3, canvas);
            this.p[i2].a(matrix, yb4Var, this.n.o, canvas);
        }
        if (this.I) {
            int iSin = (int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.n.p));
            int iCos = (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.n.p));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, J);
            canvas.translate(iSin, iCos);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        PorterDuffColorFilter porterDuffColorFilter = this.F;
        Paint paint = this.A;
        paint.setColorFilter(porterDuffColorFilter);
        int alpha = paint.getAlpha();
        int i = this.n.k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.G;
        Paint paint2 = this.B;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setStrokeWidth(this.n.j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.n.k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = this.r;
        Path path = this.t;
        if (z) {
            float f = -(i() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            bc4 bc4Var = this.n.a;
            zc1 zc1VarG = bc4Var.g();
            ke0 g6Var = bc4Var.e;
            if (!(g6Var instanceof oy3)) {
                g6Var = new g6(f, g6Var);
            }
            zc1VarG.e = g6Var;
            ke0 g6Var2 = bc4Var.f;
            if (!(g6Var2 instanceof oy3)) {
                g6Var2 = new g6(f, g6Var2);
            }
            zc1VarG.f = g6Var2;
            ke0 g6Var3 = bc4Var.h;
            if (!(g6Var3 instanceof oy3)) {
                g6Var3 = new g6(f, g6Var3);
            }
            zc1VarG.h = g6Var3;
            ke0 g6Var4 = bc4Var.g;
            if (!(g6Var4 instanceof oy3)) {
                g6Var4 = new g6(f, g6Var4);
            }
            zc1VarG.g = g6Var4;
            bc4 bc4VarA = zc1VarG.a();
            this.z = bc4VarA;
            float f2 = this.n.i;
            RectF rectFG = g();
            RectF rectF = this.w;
            rectF.set(rectFG);
            float strokeWidth = i() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.E.d(bc4VarA, f2, rectF, null, this.u);
            b(g(), path);
            this.r = false;
        }
        ei2 ei2Var = this.n;
        int i3 = ei2Var.n;
        if (i3 != 1 && ei2Var.o > 0 && (i3 == 2 || (!k() && !path.isConvex() && Build.VERSION.SDK_INT < 29))) {
            canvas.save();
            canvas.translate((int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.n.p)), (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.n.p)));
            if (this.I) {
                RectF rectF2 = this.H;
                int iWidth = (int) (rectF2.width() - getBounds().width());
                int iHeight = (int) (rectF2.height() - getBounds().height());
                if (iWidth < 0 || iHeight < 0) {
                    kf2.o("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    return;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.n.o * 2) + ((int) rectF2.width()) + iWidth, (this.n.o * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                float f3 = (getBounds().left - this.n.o) - iWidth;
                float f4 = (getBounds().top - this.n.o) - iHeight;
                canvas2.translate(-f3, -f4);
                d(canvas2);
                canvas.drawBitmap(bitmapCreateBitmap, f3, f4, (Paint) null);
                bitmapCreateBitmap.recycle();
                canvas.restore();
            } else {
                d(canvas);
                canvas.restore();
            }
        }
        ei2 ei2Var2 = this.n;
        Paint.Style style = ei2Var2.q;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            e(canvas, paint, path, ei2Var2.a, g());
        }
        if (i()) {
            f(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(Canvas canvas, Paint paint, Path path, bc4 bc4Var, RectF rectF) {
        if (!bc4Var.f(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = bc4Var.f.a(rectF) * this.n.i;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public void f(Canvas canvas) {
        bc4 bc4Var = this.z;
        RectF rectFG = g();
        RectF rectF = this.w;
        rectF.set(rectFG);
        boolean zI = i();
        Paint paint = this.B;
        float strokeWidth = zI ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        e(canvas, paint, this.u, bc4Var, rectF);
    }

    public final RectF g() {
        Rect bounds = getBounds();
        RectF rectF = this.v;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.n.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.n.n == 2) {
            return;
        }
        if (k()) {
            outline.setRoundRect(getBounds(), h() * this.n.i);
        } else {
            RectF rectFG = g();
            Path path = this.t;
            b(rectFG, path);
            te5.M(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.n.g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.x;
        region.set(bounds);
        RectF rectFG = g();
        Path path = this.t;
        b(rectFG, path);
        Region region2 = this.y;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final float h() {
        return this.n.a.e.a(g());
    }

    public final boolean i() {
        Paint.Style style = this.n.q;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.B.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.r = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.n.e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.n.getClass();
        ColorStateList colorStateList2 = this.n.d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.n.c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    public final void j(Context context) {
        this.n.b = new nz0(context);
        u();
    }

    public final boolean k() {
        return this.n.a.f(g());
    }

    public final void l(float f) {
        ei2 ei2Var = this.n;
        if (ei2Var.m != f) {
            ei2Var.m = f;
            u();
        }
    }

    public final void m(ColorStateList colorStateList) {
        ei2 ei2Var = this.n;
        if (ei2Var.c != colorStateList) {
            ei2Var.c = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.n = new ei2(this.n);
        return this;
    }

    public final void n(float f) {
        ei2 ei2Var = this.n;
        if (ei2Var.i != f) {
            ei2Var.i = f;
            this.r = true;
            invalidateSelf();
        }
    }

    public final void o() {
        this.C.t(-12303292);
        this.n.getClass();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.r = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = s(iArr) || t();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final void p() {
        ei2 ei2Var = this.n;
        if (ei2Var.n != 2) {
            ei2Var.n = 2;
            super.invalidateSelf();
        }
    }

    public final void q(ColorStateList colorStateList) {
        ei2 ei2Var = this.n;
        if (ei2Var.d != colorStateList) {
            ei2Var.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void r(float f) {
        this.n.j = f;
        invalidateSelf();
    }

    public final boolean s(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.n.c == null || color2 == (colorForState2 = this.n.c.getColorForState(iArr, (color2 = (paint2 = this.A).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.n.d == null || color == (colorForState = this.n.d.getColorForState(iArr, (color = (paint = this.B).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        ei2 ei2Var = this.n;
        if (ei2Var.k != i) {
            ei2Var.k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.n.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.lc4
    public final void setShapeAppearanceModel(bc4 bc4Var) {
        this.n.a = bc4Var;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.n.e = colorStateList;
        t();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        ei2 ei2Var = this.n;
        if (ei2Var.f != mode) {
            ei2Var.f = mode;
            t();
            super.invalidateSelf();
        }
    }

    public final boolean t() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.F;
        PorterDuffColorFilter porterDuffColorFilter3 = this.G;
        ei2 ei2Var = this.n;
        ColorStateList colorStateList = ei2Var.e;
        PorterDuff.Mode mode = ei2Var.f;
        if (colorStateList == null || mode == null) {
            int color = this.A.getColor();
            int iC = c(color);
            porterDuffColorFilter = iC != color ? new PorterDuffColorFilter(iC, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.F = porterDuffColorFilter;
        this.n.getClass();
        this.G = null;
        this.n.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.F) && Objects.equals(porterDuffColorFilter3, this.G)) ? false : true;
    }

    public final void u() {
        ei2 ei2Var = this.n;
        float f = ei2Var.m + 0.0f;
        ei2Var.o = (int) Math.ceil(0.75f * f);
        this.n.p = (int) Math.ceil(f * 0.25f);
        t();
        super.invalidateSelf();
    }

    public fi2(Context context, AttributeSet attributeSet, int i, int i2) {
        this(bc4.c(context, attributeSet, i, i2).a());
    }

    public fi2(bc4 bc4Var) {
        this(new ei2(bc4Var));
    }

    public fi2() {
        this(new bc4());
    }
}
