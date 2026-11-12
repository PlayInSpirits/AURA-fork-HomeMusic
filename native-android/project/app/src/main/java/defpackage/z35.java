package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.eddyizm.tempus.homemusic.WaveRetry;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z35 extends q35 {
    public static final PorterDuff.Mode w = PorterDuff.Mode.SRC_IN;
    public x35 o;
    public PorterDuffColorFilter p;
    public ColorFilter q;
    public boolean r;
    public boolean s;
    public final float[] t;
    public final Matrix u;
    public final Rect v;

    public z35() {
        this.s = true;
        this.t = new float[9];
        this.u = new Matrix();
        this.v = new Rect();
        x35 x35Var = new x35();
        x35Var.c = null;
        x35Var.d = w;
        x35Var.b = new w35();
        this.o = x35Var;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.n;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.v;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.q;
        if (colorFilter == null) {
            colorFilter = this.p;
        }
        Matrix matrix = this.u;
        canvas.getMatrix(matrix);
        float[] fArr = this.t;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        x35 x35Var = this.o;
        Bitmap bitmap = x35Var.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != x35Var.f.getHeight()) {
            x35Var.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            x35Var.k = true;
        }
        boolean z = this.s;
        x35 x35Var2 = this.o;
        if (!z) {
            x35Var2.f.eraseColor(0);
            Canvas canvas2 = new Canvas(x35Var2.f);
            w35 w35Var = x35Var2.b;
            w35Var.a(w35Var.g, w35.p, canvas2, iMin, iMin2);
        } else if (x35Var2.k || x35Var2.g != x35Var2.c || x35Var2.h != x35Var2.d || x35Var2.j != x35Var2.e || x35Var2.i != x35Var2.b.getRootAlpha()) {
            x35 x35Var3 = this.o;
            x35Var3.f.eraseColor(0);
            Canvas canvas3 = new Canvas(x35Var3.f);
            w35 w35Var2 = x35Var3.b;
            w35Var2.a(w35Var2.g, w35.p, canvas3, iMin, iMin2);
            x35 x35Var4 = this.o;
            x35Var4.g = x35Var4.c;
            x35Var4.h = x35Var4.d;
            x35Var4.i = x35Var4.b.getRootAlpha();
            x35Var4.j = x35Var4.e;
            x35Var4.k = false;
        }
        x35 x35Var5 = this.o;
        if (x35Var5.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (x35Var5.l == null) {
                Paint paint2 = new Paint();
                x35Var5.l = paint2;
                paint2.setFilterBitmap(true);
            }
            x35Var5.l.setAlpha(x35Var5.b.getRootAlpha());
            x35Var5.l.setColorFilter(colorFilter);
            paint = x35Var5.l;
        }
        canvas.drawBitmap(x35Var5.f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.n;
        return drawable != null ? drawable.getAlpha() : this.o.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.n;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.o.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.n;
        return drawable != null ? drawable.getColorFilter() : this.q;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.n != null) {
            return new y35(this.n.getConstantState());
        }
        this.o.a = getChangingConfigurations();
        return this.o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.n;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.o.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.n;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.o.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.n;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        int i2;
        int i3;
        int i4;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        x35 x35Var = this.o;
        x35Var.b = new w35();
        TypedArray typedArrayO = gi1.O(resources, theme, attributeSet, fh0.a);
        x35 x35Var2 = this.o;
        w35 w35Var = x35Var2.b;
        int i5 = !gi1.u(xmlPullParser, "tintMode") ? -1 : typedArrayO.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i6 = 3;
        if (i5 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i5 != 5) {
            if (i5 != 9) {
                switch (i5) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case WaveRetry.MAX_FAILURES /* 16 */:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        x35Var2.d = mode;
        ColorStateList colorStateListR = gi1.r(typedArrayO, xmlPullParser, theme);
        if (colorStateListR != null) {
            x35Var2.c = colorStateListR;
        }
        boolean z = x35Var2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = typedArrayO.getBoolean(5, z);
        }
        x35Var2.e = z;
        float f = w35Var.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayO.getFloat(7, f);
        }
        w35Var.j = f;
        float f2 = w35Var.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = typedArrayO.getFloat(8, f2);
        }
        w35Var.k = f2;
        if (w35Var.j <= 0.0f) {
            throw new XmlPullParserException(typedArrayO.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayO.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        w35Var.h = typedArrayO.getDimension(3, w35Var.h);
        int i7 = 2;
        float dimension = typedArrayO.getDimension(2, w35Var.i);
        w35Var.i = dimension;
        if (w35Var.h <= 0.0f) {
            throw new XmlPullParserException(typedArrayO.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayO.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = w35Var.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = typedArrayO.getFloat(4, alpha);
        }
        w35Var.setAlpha(alpha);
        String string = typedArrayO.getString(0);
        if (string != null) {
            w35Var.m = string;
            w35Var.o.put(string, w35Var);
        }
        typedArrayO.recycle();
        x35Var.a = getChangingConfigurations();
        int i8 = 1;
        x35Var.k = true;
        x35 x35Var3 = this.o;
        w35 w35Var2 = x35Var3.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        t35 t35Var = w35Var2.g;
        oi oiVar = w35Var2.o;
        arrayDeque.push(t35Var);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i8 && (xmlPullParser.getDepth() >= depth || eventType != i6)) {
            if (eventType == i7) {
                String name = xmlPullParser.getName();
                t35 t35Var2 = (t35) arrayDeque.peek();
                i = depth;
                if ("path".equals(name)) {
                    s35 s35Var = new s35();
                    s35Var.e = 0.0f;
                    s35Var.g = 1.0f;
                    s35Var.h = 1.0f;
                    s35Var.i = 0.0f;
                    s35Var.j = 1.0f;
                    s35Var.k = 0.0f;
                    Paint.Cap cap2 = Paint.Cap.BUTT;
                    s35Var.l = cap2;
                    Paint.Join join2 = Paint.Join.MITER;
                    s35Var.m = join2;
                    s35Var.n = 4.0f;
                    TypedArray typedArrayO2 = gi1.O(resources, theme, attributeSet, fh0.c);
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        String string2 = typedArrayO2.getString(0);
                        if (string2 != null) {
                            s35Var.b = string2;
                        }
                        String string3 = typedArrayO2.getString(2);
                        if (string3 != null) {
                            s35Var.a = fh0.l(string3);
                        }
                        s35Var.f = gi1.s(typedArrayO2, xmlPullParser, theme, "fillColor", 1);
                        float f3 = s35Var.h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                            f3 = typedArrayO2.getFloat(12, f3);
                        }
                        s35Var.h = f3;
                        int i9 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayO2.getInt(8, -1) : -1;
                        Paint.Cap cap3 = s35Var.l;
                        if (i9 == 0) {
                            cap = cap2;
                        } else if (i9 != 1) {
                            cap = i9 != 2 ? cap3 : Paint.Cap.SQUARE;
                        } else {
                            cap = Paint.Cap.ROUND;
                        }
                        s35Var.l = cap;
                        int i10 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayO2.getInt(9, -1) : -1;
                        Paint.Join join3 = s35Var.m;
                        if (i10 == 0) {
                            join = join2;
                        } else if (i10 != 1) {
                            join = i10 != 2 ? join3 : Paint.Join.BEVEL;
                        } else {
                            join = Paint.Join.ROUND;
                        }
                        s35Var.m = join;
                        float f4 = s35Var.n;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                            f4 = typedArrayO2.getFloat(10, f4);
                        }
                        s35Var.n = f4;
                        s35Var.d = gi1.s(typedArrayO2, xmlPullParser, theme, "strokeColor", 3);
                        float f5 = s35Var.g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                            f5 = typedArrayO2.getFloat(11, f5);
                        }
                        s35Var.g = f5;
                        float f6 = s35Var.e;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                            f6 = typedArrayO2.getFloat(4, f6);
                        }
                        s35Var.e = f6;
                        float f7 = s35Var.j;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                            f7 = typedArrayO2.getFloat(6, f7);
                        }
                        s35Var.j = f7;
                        float f8 = s35Var.k;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                            f8 = typedArrayO2.getFloat(7, f8);
                        }
                        s35Var.k = f8;
                        float f9 = s35Var.i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                            f9 = typedArrayO2.getFloat(5, f9);
                        }
                        s35Var.i = f9;
                        int i11 = s35Var.c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                            i11 = typedArrayO2.getInt(13, i11);
                        }
                        s35Var.c = i11;
                    }
                    typedArrayO2.recycle();
                    t35Var2.b.add(s35Var);
                    if (s35Var.getPathName() != null) {
                        oiVar.put(s35Var.getPathName(), s35Var);
                    }
                    x35Var3.a = x35Var3.a;
                    i4 = 1;
                    z2 = false;
                } else {
                    if ("clip-path".equals(name)) {
                        r35 r35Var = new r35();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                            TypedArray typedArrayO3 = gi1.O(resources, theme, attributeSet, fh0.d);
                            String string4 = typedArrayO3.getString(0);
                            if (string4 != null) {
                                r35Var.b = string4;
                            }
                            String string5 = typedArrayO3.getString(1);
                            if (string5 != null) {
                                r35Var.a = fh0.l(string5);
                            }
                            r35Var.c = !gi1.u(xmlPullParser, "fillType") ? 0 : typedArrayO3.getInt(2, 0);
                            typedArrayO3.recycle();
                        }
                        t35Var2.b.add(r35Var);
                        if (r35Var.getPathName() != null) {
                            oiVar.put(r35Var.getPathName(), r35Var);
                        }
                        x35Var3.a = x35Var3.a;
                    } else if ("group".equals(name)) {
                        t35 t35Var3 = new t35();
                        TypedArray typedArrayO4 = gi1.O(resources, theme, attributeSet, fh0.b);
                        float f10 = t35Var3.c;
                        if (gi1.u(xmlPullParser, "rotation")) {
                            f10 = typedArrayO4.getFloat(5, f10);
                        }
                        t35Var3.c = f10;
                        i4 = 1;
                        t35Var3.d = typedArrayO4.getFloat(1, t35Var3.d);
                        t35Var3.e = typedArrayO4.getFloat(2, t35Var3.e);
                        float f11 = t35Var3.f;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                            f11 = typedArrayO4.getFloat(3, f11);
                        }
                        t35Var3.f = f11;
                        float f12 = t35Var3.g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                            f12 = typedArrayO4.getFloat(4, f12);
                        }
                        t35Var3.g = f12;
                        float f13 = t35Var3.h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                            f13 = typedArrayO4.getFloat(6, f13);
                        }
                        t35Var3.h = f13;
                        float f14 = t35Var3.i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                            f14 = typedArrayO4.getFloat(7, f14);
                        }
                        t35Var3.i = f14;
                        String string6 = typedArrayO4.getString(0);
                        if (string6 != null) {
                            t35Var3.k = string6;
                        }
                        t35Var3.c();
                        typedArrayO4.recycle();
                        t35Var2.b.add(t35Var3);
                        arrayDeque.push(t35Var3);
                        if (t35Var3.getGroupName() != null) {
                            oiVar.put(t35Var3.getGroupName(), t35Var3);
                        }
                        x35Var3.a = x35Var3.a;
                    }
                    i4 = 1;
                }
                i3 = i4;
                i2 = 3;
            } else {
                i = depth;
                i2 = i6;
                i3 = 1;
                if (eventType == i2 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i6 = i2;
            i8 = i3;
            depth = i;
            i7 = 2;
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        this.p = a(x35Var.c, x35Var.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.n;
        return drawable != null ? drawable.isAutoMirrored() : this.o.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.n;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        x35 x35Var = this.o;
        if (x35Var == null) {
            return false;
        }
        w35 w35Var = x35Var.b;
        if (w35Var.n == null) {
            w35Var.n = Boolean.valueOf(w35Var.g.a());
        }
        if (w35Var.n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.o.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.r && super.mutate() == this) {
            x35 x35Var = this.o;
            x35 x35Var2 = new x35();
            x35Var2.c = null;
            x35Var2.d = w;
            if (x35Var != null) {
                x35Var2.a = x35Var.a;
                w35 w35Var = new w35(x35Var.b);
                x35Var2.b = w35Var;
                if (x35Var.b.e != null) {
                    w35Var.e = new Paint(x35Var.b.e);
                }
                if (x35Var.b.d != null) {
                    x35Var2.b.d = new Paint(x35Var.b.d);
                }
                x35Var2.c = x35Var.c;
                x35Var2.d = x35Var.d;
                x35Var2.e = x35Var.e;
            }
            this.o = x35Var2;
            this.r = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.n;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        x35 x35Var = this.o;
        ColorStateList colorStateList = x35Var.c;
        if (colorStateList == null || (mode = x35Var.d) == null) {
            z = false;
        } else {
            this.p = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        w35 w35Var = x35Var.b;
        if (w35Var.n == null) {
            w35Var.n = Boolean.valueOf(w35Var.g.a());
        }
        if (w35Var.n.booleanValue()) {
            boolean zB = x35Var.b.g.b(iArr);
            x35Var.k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.o.b.getRootAlpha() != i) {
            this.o.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.o.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.q = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        x35 x35Var = this.o;
        if (x35Var.c != colorStateList) {
            x35Var.c = colorStateList;
            this.p = a(colorStateList, x35Var.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        x35 x35Var = this.o;
        if (x35Var.d != mode) {
            x35Var.d = mode;
            this.p = a(x35Var.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.n;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public z35(x35 x35Var) {
        this.s = true;
        this.t = new float[9];
        this.u = new Matrix();
        this.v = new Rect();
        this.o = x35Var;
        this.p = a(x35Var.c, x35Var.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
