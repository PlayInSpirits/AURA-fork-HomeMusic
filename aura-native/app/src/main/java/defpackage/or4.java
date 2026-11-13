/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import defpackage.db;
import defpackage.dz1;
import defpackage.er1;
import defpackage.kz;
import defpackage.l3;
import defpackage.tn;
import defpackage.z9;

public final class or4
extends Canvas {
    public or4() {
        super();
    }

    public Canvas a;

    public final Canvas a() {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas;
        }
        dz1.c("Text drawing wrapper is missing a Canvas!");
        er1.a();
        return null;
    }

    @Override
    public final boolean clipOutPath(Path path) {
        return tn.v(this.a(), path);
    }

    @Override
    public final boolean clipOutRect(float f16, float f17, float f18, float f19) {
        return tn.t(this.a(), f16, f17, f18, f19);
    }

    @Override
    public final boolean clipOutRect(int n16, int n17, int n18, int n19) {
        return tn.u(this.a(), n16, n17, n18, n19);
    }

    @Override
    public final boolean clipOutRect(Rect rect) {
        return tn.w(this.a(), rect);
    }

    @Override
    public final boolean clipOutRect(RectF rectF) {
        return tn.x(this.a(), rectF);
    }

    @Override
    public final boolean clipPath(Path path) {
        return this.a().clipPath(path);
    }

    @Override
    public final boolean clipPath(Path path, Region.Op op5) {
        return this.a().clipPath(path, op5);
    }

    @Override
    public final boolean clipRect(float f16, float f17, float f18, float f19) {
        return this.a().clipRect(f16, f17, f18, f19);
    }

    @Override
    public final boolean clipRect(float f16, float f17, float f18, float f19, Region.Op op5) {
        return this.a().clipRect(f16, f17, f18, f19, op5);
    }

    @Override
    public final boolean clipRect(int n16, int n17, int n18, int n19) {
        return this.a().clipRect(n16, n17, n18, n19);
    }

    @Override
    public final boolean clipRect(Rect rect) {
        return this.a().clipRect(rect);
    }

    @Override
    public final boolean clipRect(Rect rect, Region.Op op5) {
        return this.a().clipRect(rect, op5);
    }

    @Override
    public final boolean clipRect(RectF rectF) {
        return this.a().clipRect(rectF);
    }

    @Override
    public final boolean clipRect(RectF rectF, Region.Op op5) {
        return this.a().clipRect(rectF, op5);
    }

    @Override
    public final void concat(Matrix matrix) {
        this.a().concat(matrix);
    }

    @Override
    public final void disableZ() {
        kz.f(this.a());
    }

    @Override
    public final void drawARGB(int n16, int n17, int n18, int n19) {
        this.a().drawARGB(n16, n17, n18, n19);
    }

    @Override
    public final void drawArc(float f16, float f17, float f18, float f19, float f26, float f27, boolean bl5, Paint paint) {
        this.a().drawArc(f16, f17, f18, f19, f26, f27, bl5, paint);
    }

    @Override
    public final void drawArc(RectF rectF, float f16, float f17, boolean bl5, Paint paint) {
        this.a().drawArc(rectF, f16, f17, bl5, paint);
    }

    @Override
    public final void drawBitmap(Bitmap bitmap, float f16, float f17, Paint paint) {
        this.a().drawBitmap(bitmap, f16, f17, paint);
    }

    @Override
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        this.a().drawBitmap(bitmap, matrix, paint);
    }

    @Override
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        this.a().drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        this.a().drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override
    public final void drawBitmap(int[] nArray, int n16, int n17, float f16, float f17, int n18, int n19, boolean bl5, Paint paint) {
        this.a().drawBitmap(nArray, n16, n17, f16, f17, n18, n19, bl5, paint);
    }

    @Override
    public final void drawBitmap(int[] nArray, int n16, int n17, int n18, int n19, int n26, int n27, boolean bl5, Paint paint) {
        this.a().drawBitmap(nArray, n16, n17, n18, n19, n26, n27, bl5, paint);
    }

    @Override
    public final void drawBitmapMesh(Bitmap bitmap, int n16, int n17, float[] fArray, int n18, int[] nArray, int n19, Paint paint) {
        this.a().drawBitmapMesh(bitmap, n16, n17, fArray, n18, nArray, n19, paint);
    }

    @Override
    public final void drawCircle(float f16, float f17, float f18, Paint paint) {
        this.a().drawCircle(f16, f17, f18, paint);
    }

    @Override
    public final void drawColor(int n16) {
        this.a().drawColor(n16);
    }

    @Override
    public final void drawColor(int n16, BlendMode blendMode) {
        z9.j(this.a(), n16, blendMode);
    }

    @Override
    public final void drawColor(int n16, PorterDuff.Mode mode) {
        this.a().drawColor(n16, mode);
    }

    @Override
    public final void drawColor(long l16) {
        kz.g(this.a(), l16);
    }

    @Override
    public final void drawColor(long l16, BlendMode blendMode) {
        kz.h(this.a(), l16, blendMode);
    }

    @Override
    public final void drawDoubleRoundRect(RectF rectF, float f16, float f17, RectF rectF2, float f18, float f19, Paint paint) {
        kz.i(this.a(), rectF, f16, f17, rectF2, f18, f19, paint);
    }

    @Override
    public final void drawDoubleRoundRect(RectF rectF, float[] fArray, RectF rectF2, float[] fArray2, Paint paint) {
        kz.j(this.a(), rectF, fArray, rectF2, fArray2, paint);
    }

    @Override
    public final void drawGlyphs(int[] nArray, int n16, float[] fArray, int n17, int n18, Font font, Paint paint) {
        db.s(this.a(), nArray, n16, fArray, n17, n18, font, paint);
    }

    @Override
    public final void drawLine(float f16, float f17, float f18, float f19, Paint paint) {
        this.a().drawLine(f16, f17, f18, f19, paint);
    }

    @Override
    public final void drawLines(float[] fArray, int n16, int n17, Paint paint) {
        this.a().drawLines(fArray, n16, n17, paint);
    }

    @Override
    public final void drawLines(float[] fArray, Paint paint) {
        this.a().drawLines(fArray, paint);
    }

    @Override
    public final void drawOval(float f16, float f17, float f18, float f19, Paint paint) {
        this.a().drawOval(f16, f17, f18, f19, paint);
    }

    @Override
    public final void drawOval(RectF rectF, Paint paint) {
        this.a().drawOval(rectF, paint);
    }

    @Override
    public final void drawPaint(Paint paint) {
        this.a().drawPaint(paint);
    }

    @Override
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        db.q(this.a(), ninePatch, rect, paint);
    }

    @Override
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        db.r(this.a(), ninePatch, rectF, paint);
    }

    @Override
    public final void drawPath(Path path, Paint paint) {
        this.a().drawPath(path, paint);
    }

    @Override
    public final void drawPicture(Picture picture) {
        this.a().drawPicture(picture);
    }

    @Override
    public final void drawPicture(Picture picture, Rect rect) {
        this.a().drawPicture(picture, rect);
    }

    @Override
    public final void drawPicture(Picture picture, RectF rectF) {
        this.a().drawPicture(picture, rectF);
    }

    @Override
    public final void drawPoint(float f16, float f17, Paint paint) {
        this.a().drawPoint(f16, f17, paint);
    }

    @Override
    public final void drawPoints(float[] fArray, int n16, int n17, Paint paint) {
        this.a().drawPoints(fArray, n16, n17, paint);
    }

    @Override
    public final void drawPoints(float[] fArray, Paint paint) {
        this.a().drawPoints(fArray, paint);
    }

    @Override
    public final void drawPosText(String string, float[] fArray, Paint paint) {
        this.a().drawPosText(string, fArray, paint);
    }

    @Override
    public final void drawPosText(char[] cArray, int n16, int n17, float[] fArray, Paint paint) {
        this.a().drawPosText(cArray, n16, n17, fArray, paint);
    }

    @Override
    public final void drawRGB(int n16, int n17, int n18) {
        this.a().drawRGB(n16, n17, n18);
    }

    @Override
    public final void drawRect(float f16, float f17, float f18, float f19, Paint paint) {
        this.a().drawRect(f16, f17, f18, f19, paint);
    }

    @Override
    public final void drawRect(Rect rect, Paint paint) {
        this.a().drawRect(rect, paint);
    }

    @Override
    public final void drawRect(RectF rectF, Paint paint) {
        this.a().drawRect(rectF, paint);
    }

    @Override
    public final void drawRenderNode(RenderNode renderNode) {
        kz.k(this.a(), renderNode);
    }

    @Override
    public final void drawRoundRect(float f16, float f17, float f18, float f19, float f26, float f27, Paint paint) {
        this.a().drawRoundRect(f16, f17, f18, f19, f26, f27, paint);
    }

    @Override
    public final void drawRoundRect(RectF rectF, float f16, float f17, Paint paint) {
        this.a().drawRoundRect(rectF, f16, f17, paint);
    }

    @Override
    public final void drawText(CharSequence charSequence, int n16, int n17, float f16, float f17, Paint paint) {
        this.a().drawText(charSequence, n16, n17, f16, f17, paint);
    }

    @Override
    public final void drawText(String string, float f16, float f17, Paint paint) {
        this.a().drawText(string, f16, f17, paint);
    }

    @Override
    public final void drawText(String string, int n16, int n17, float f16, float f17, Paint paint) {
        this.a().drawText(string, n16, n17, f16, f17, paint);
    }

    @Override
    public final void drawText(char[] cArray, int n16, int n17, float f16, float f17, Paint paint) {
        this.a().drawText(cArray, n16, n17, f16, f17, paint);
    }

    @Override
    public final void drawTextOnPath(String string, Path path, float f16, float f17, Paint paint) {
        this.a().drawTextOnPath(string, path, f16, f17, paint);
    }

    @Override
    public final void drawTextOnPath(char[] cArray, int n16, int n17, Path path, float f16, float f17, Paint paint) {
        this.a().drawTextOnPath(cArray, n16, n17, path, f16, f17, paint);
    }

    @Override
    public final void drawTextRun(MeasuredText measuredText, int n16, int n17, int n18, int n19, float f16, float f17, boolean bl5, Paint paint) {
        kz.l(this.a(), measuredText, n16, n17, n18, n19, f16, f17, bl5, paint);
    }

    @Override
    public final void drawTextRun(CharSequence charSequence, int n16, int n17, int n18, int n19, float f16, float f17, boolean bl5, Paint paint) {
        this.a().drawTextRun(charSequence, n16, n17, n18, n19, f16, f17, bl5, paint);
    }

    @Override
    public final void drawTextRun(char[] cArray, int n16, int n17, int n18, int n19, float f16, float f17, boolean bl5, Paint paint) {
        this.a().drawTextRun(cArray, n16, n17, n18, n19, f16, f17, bl5, paint);
    }

    @Override
    public final void drawVertices(Canvas.VertexMode vertexMode, int n16, float[] fArray, int n17, float[] fArray2, int n18, int[] nArray, int n19, short[] sArray, int n26, int n27, Paint paint) {
        this.a().drawVertices(vertexMode, n16, fArray, n17, fArray2, n18, nArray, n19, sArray, n26, n27, paint);
    }

    @Override
    public final void enableZ() {
        kz.u(this.a());
    }

    @Override
    public final boolean getClipBounds(Rect rect) {
        boolean bl5 = this.a().getClipBounds(rect);
        if (bl5) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return bl5;
    }

    @Override
    public final int getDensity() {
        return this.a().getDensity();
    }

    @Override
    public final DrawFilter getDrawFilter() {
        return this.a().getDrawFilter();
    }

    @Override
    public final int getHeight() {
        return this.a().getHeight();
    }

    @Override
    public final void getMatrix(Matrix matrix) {
        this.a().getMatrix(matrix);
    }

    @Override
    public final int getMaximumBitmapHeight() {
        return this.a().getMaximumBitmapHeight();
    }

    @Override
    public final int getMaximumBitmapWidth() {
        return this.a().getMaximumBitmapWidth();
    }

    @Override
    public final int getSaveCount() {
        return this.a().getSaveCount();
    }

    @Override
    public final int getWidth() {
        return this.a().getWidth();
    }

    @Override
    public final boolean isOpaque() {
        return this.a().isOpaque();
    }

    @Override
    public final boolean quickReject(float f16, float f17, float f18, float f19) {
        return l3.x(this.a(), f16, f17, f18, f19);
    }

    @Override
    public final boolean quickReject(float f16, float f17, float f18, float f19, Canvas.EdgeType edgeType) {
        return this.a().quickReject(f16, f17, f18, f19, edgeType);
    }

    @Override
    public final boolean quickReject(Path path) {
        return l3.y(this.a(), path);
    }

    @Override
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        return this.a().quickReject(path, edgeType);
    }

    @Override
    public final boolean quickReject(RectF rectF) {
        return l3.z(this.a(), rectF);
    }

    @Override
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        return this.a().quickReject(rectF, edgeType);
    }

    @Override
    public final void restore() {
        this.a().restore();
    }

    @Override
    public final void restoreToCount(int n16) {
        this.a().restoreToCount(n16);
    }

    @Override
    public final void rotate(float f16) {
        this.a().rotate(f16);
    }

    @Override
    public final int save() {
        return this.a().save();
    }

    @Override
    public final int saveLayer(float f16, float f17, float f18, float f19, Paint paint) {
        return this.a().saveLayer(f16, f17, f18, f19, paint);
    }

    @Override
    public final int saveLayer(float f16, float f17, float f18, float f19, Paint paint, int n16) {
        return this.a().saveLayer(f16, f17, f18, f19, paint, n16);
    }

    @Override
    public final int saveLayer(RectF rectF, Paint paint) {
        return this.a().saveLayer(rectF, paint);
    }

    @Override
    public final int saveLayer(RectF rectF, Paint paint, int n16) {
        return this.a().saveLayer(rectF, paint, n16);
    }

    @Override
    public final int saveLayerAlpha(float f16, float f17, float f18, float f19, int n16) {
        return this.a().saveLayerAlpha(f16, f17, f18, f19, n16);
    }

    @Override
    public final int saveLayerAlpha(float f16, float f17, float f18, float f19, int n16, int n17) {
        return this.a().saveLayerAlpha(f16, f17, f18, f19, n16, n17);
    }

    @Override
    public final int saveLayerAlpha(RectF rectF, int n16) {
        return this.a().saveLayerAlpha(rectF, n16);
    }

    @Override
    public final int saveLayerAlpha(RectF rectF, int n16, int n17) {
        return this.a().saveLayerAlpha(rectF, n16, n17);
    }

    @Override
    public final void scale(float f16, float f17) {
        this.a().scale(f16, f17);
    }

    @Override
    public final void setBitmap(Bitmap bitmap) {
        this.a().setBitmap(bitmap);
    }

    @Override
    public final void setDensity(int n16) {
        this.a().setDensity(n16);
    }

    @Override
    public final void setDrawFilter(DrawFilter drawFilter) {
        this.a().setDrawFilter(drawFilter);
    }

    @Override
    public final void setMatrix(Matrix matrix) {
        this.a().setMatrix(matrix);
    }

    @Override
    public final void skew(float f16, float f17) {
        this.a().skew(f16, f17);
    }

    @Override
    public final void translate(float f16, float f17) {
        this.a().translate(f16, f17);
    }
}

