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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class or4 extends Canvas {
    public Canvas a;

    public final Canvas a() {
        Canvas r0 = this.a;
        if (r0 == null) goto L5;
        return r0;
    L5:
        dz1.c("Text drawing wrapper is missing a Canvas!");
        er1.a();
        return null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path r1) {
        return tn.v(a(), r1);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF r1) {
        return tn.x(a(), r1);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path r1, Region.Op r2) {
        return a().clipPath(r1, r2);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF r1, Region.Op r2) {
        return a().clipRect(r1, r2);
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix r1) {
        a().concat(r1);
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        kz.f(a());
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int r1, int r2, int r3, int r4) {
        a().drawARGB(r1, r2, r3, r4);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF r1, float r2, float r3, boolean r4, Paint r5) {
        a().drawArc(r1, r2, r3, r4, r5);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap r1, float r2, float r3, Paint r4) {
        a().drawBitmap(r1, r2, r3, r4);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap r1, int r2, int r3, float[] r4, int r5, int[] r6, int r7, Paint r8) {
        a().drawBitmapMesh(r1, r2, r3, r4, r5, r6, r7, r8);
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float r1, float r2, float r3, Paint r4) {
        a().drawCircle(r1, r2, r3, r4);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int r1) {
        a().drawColor(r1);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF r1, float r2, float r3, RectF r4, float r5, float r6, Paint r7) {
        kz.i(a(), r1, r2, r3, r4, r5, r6, r7);
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] r1, int r2, float[] r3, int r4, int r5, Font r6, Paint r7) {
        db.s(a(), r1, r2, r3, r4, r5, r6, r7);
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float r1, float r2, float r3, float r4, Paint r5) {
        a().drawLine(r1, r2, r3, r4, r5);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] r1, int r2, int r3, Paint r4) {
        a().drawLines(r1, r2, r3, r4);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF r1, Paint r2) {
        a().drawOval(r1, r2);
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint r1) {
        a().drawPaint(r1);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch r1, Rect r2, Paint r3) {
        db.q(a(), r1, r2, r3);
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path r1, Paint r2) {
        a().drawPath(r1, r2);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture r1) {
        a().drawPicture(r1);
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float r1, float r2, Paint r3) {
        a().drawPoint(r1, r2, r3);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] r1, int r2, int r3, Paint r4) {
        a().drawPoints(r1, r2, r3, r4);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] r1, int r2, int r3, float[] r4, Paint r5) {
        a().drawPosText(r1, r2, r3, r4, r5);
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int r1, int r2, int r3) {
        a().drawRGB(r1, r2, r3);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF r1, Paint r2) {
        a().drawRect(r1, r2);
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode r1) {
        kz.k(a(), r1);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF r1, float r2, float r3, Paint r4) {
        a().drawRoundRect(r1, r2, r3, r4);
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] r1, int r2, int r3, float r4, float r5, Paint r6) {
        a().drawText(r1, r2, r3, r4, r5, r6);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] r1, int r2, int r3, Path r4, float r5, float r6, Paint r7) {
        a().drawTextOnPath(r1, r2, r3, r4, r5, r6, r7);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] r1, int r2, int r3, int r4, int r5, float r6, float r7, boolean r8, Paint r9) {
        a().drawTextRun(r1, r2, r3, r4, r5, r6, r7, r8, r9);
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode r1, int r2, float[] r3, int r4, float[] r5, int r6, int[] r7, int r8, short[] r9, int r10, int r11, Paint r12) {
        a().drawVertices(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        kz.u(a());
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect r4) {
        boolean r3 = a().getClipBounds(r4);
        if (r3 == false) goto L5;
        r4.set(0, 0, r4.width(), Integer.MAX_VALUE);
    L5:
        return r3;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        return a().getDensity();
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        return a().getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        return a().getHeight();
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix r1) {
        a().getMatrix(r1);
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        return a().getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        return a().getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        return a().getSaveCount();
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        return a().getWidth();
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        return a().isOpaque();
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF r1, Canvas.EdgeType r2) {
        return a().quickReject(r1, r2);
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        a().restore();
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int r1) {
        a().restoreToCount(r1);
    }

    @Override // android.graphics.Canvas
    public final void rotate(float r1) {
        a().rotate(r1);
    }

    @Override // android.graphics.Canvas
    public final int save() {
        return a().save();
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF r1, Paint r2, int r3) {
        return a().saveLayer(r1, r2, r3);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF r1, int r2, int r3) {
        return a().saveLayerAlpha(r1, r2, r3);
    }

    @Override // android.graphics.Canvas
    public final void scale(float r1, float r2) {
        a().scale(r1, r2);
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap r1) {
        a().setBitmap(r1);
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int r1) {
        a().setDensity(r1);
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter r1) {
        a().setDrawFilter(r1);
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix r1) {
        a().setMatrix(r1);
    }

    @Override // android.graphics.Canvas
    public final void skew(float r1, float r2) {
        a().skew(r1, r2);
    }

    @Override // android.graphics.Canvas
    public final void translate(float r1, float r2) {
        a().translate(r1, r2);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float r1, float r2, float r3, float r4, float r5, float r6, boolean r7, Paint r8) {
        a().drawArc(r1, r2, r3, r4, r5, r6, r7, r8);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap r1, Rect r2, RectF r3, Paint r4) {
        a().drawBitmap(r1, r2, r3, r4);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long r1) {
        kz.g(a(), r1);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF r1, float[] r2, RectF r3, float[] r4, Paint r5) {
        kz.j(a(), r1, r2, r3, r4, r5);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] r1, Paint r2) {
        a().drawLines(r1, r2);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float r1, float r2, float r3, float r4, Paint r5) {
        a().drawOval(r1, r2, r3, r4, r5);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch r1, RectF r2, Paint r3) {
        db.r(a(), r1, r2, r3);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture r1, RectF r2) {
        a().drawPicture(r1, r2);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] r1, Paint r2) {
        a().drawPoints(r1, r2);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String r1, float[] r2, Paint r3) {
        a().drawPosText(r1, r2, r3);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect r1, Paint r2) {
        a().drawRect(r1, r2);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float r1, float r2, float r3, float r4, float r5, float r6, Paint r7) {
        a().drawRoundRect(r1, r2, r3, r4, r5, r6, r7);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String r1, float r2, float r3, Paint r4) {
        a().drawText(r1, r2, r3, r4);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String r1, Path r2, float r3, float r4, Paint r5) {
        a().drawTextOnPath(r1, r2, r3, r4, r5);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence r1, int r2, int r3, int r4, int r5, float r6, float r7, boolean r8, Paint r9) {
        a().drawTextRun(r1, r2, r3, r4, r5, r6, r7, r8, r9);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect r1) {
        return tn.w(a(), r1);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path r1) {
        return a().clipPath(r1);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect r1, Region.Op r2) {
        return a().clipRect(r1, r2);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap r1, Rect r2, Rect r3, Paint r4) {
        a().drawBitmap(r1, r2, r3, r4);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture r1, Rect r2) {
        a().drawPicture(r1, r2);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float r1, float r2, float r3, float r4, Paint r5) {
        a().drawRect(r1, r2, r3, r4, r5);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String r1, int r2, int r3, float r4, float r5, Paint r6) {
        a().drawText(r1, r2, r3, r4, r5, r6);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF r1) {
        return l3.z(a(), r1);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF r1, Paint r2) {
        return a().saveLayer(r1, r2);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF r1, int r2) {
        return a().saveLayerAlpha(r1, r2);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF r1) {
        return a().clipRect(r1);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] r1, int r2, int r3, float r4, float r5, int r6, int r7, boolean r8, Paint r9) {
        a().drawBitmap(r1, r2, r3, r4, r5, r6, r7, r8, r9);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int r1, PorterDuff.Mode r2) {
        a().drawColor(r1, r2);
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence r1, int r2, int r3, float r4, float r5, Paint r6) {
        a().drawText(r1, r2, r3, r4, r5, r6);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText r1, int r2, int r3, int r4, int r5, float r6, float r7, boolean r8, Paint r9) {
        kz.l(a(), r1, r2, r3, r4, r5, r6, r7, r8, r9);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float r1, float r2, float r3, float r4, Paint r5, int r6) {
        return a().saveLayer(r1, r2, r3, r4, r5, r6);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float r1, float r2, float r3, float r4, int r5, int r6) {
        return a().saveLayerAlpha(r1, r2, r3, r4, r5, r6);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float r1, float r2, float r3, float r4) {
        return tn.t(a(), r1, r2, r3, r4);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect r1) {
        return a().clipRect(r1);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] r1, int r2, int r3, int r4, int r5, int r6, int r7, boolean r8, Paint r9) {
        a().drawBitmap(r1, r2, r3, r4, r5, r6, r7, r8, r9);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int r1, BlendMode r2) {
        z9.j(a(), r1, r2);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path r1, Canvas.EdgeType r2) {
        return a().quickReject(r1, r2);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float r1, float r2, float r3, float r4, Paint r5) {
        return a().saveLayer(r1, r2, r3, r4, r5);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float r1, float r2, float r3, float r4, int r5) {
        return a().saveLayerAlpha(r1, r2, r3, r4, r5);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float r1, float r2, float r3, float r4, Region.Op r5) {
        return a().clipRect(r1, r2, r3, r4, r5);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap r1, Matrix r2, Paint r3) {
        a().drawBitmap(r1, r2, r3);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path r1) {
        return l3.y(a(), r1);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int r1, int r2, int r3, int r4) {
        return tn.u(a(), r1, r2, r3, r4);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float r1, float r2, float r3, float r4) {
        return a().clipRect(r1, r2, r3, r4);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long r1, BlendMode r3) {
        kz.h(a(), r1, r3);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int r1, int r2, int r3, int r4) {
        return a().clipRect(r1, r2, r3, r4);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float r1, float r2, float r3, float r4, Canvas.EdgeType r5) {
        return a().quickReject(r1, r2, r3, r4, r5);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float r1, float r2, float r3, float r4) {
        return l3.x(a(), r1, r2, r3, r4);
    }
}
