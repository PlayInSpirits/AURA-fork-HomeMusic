package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fc4 extends jc4 {
    public final hc4 c;
    public final float d;
    public final float e;

    public fc4(hc4 hc4Var, float f, float f2) {
        this.c = hc4Var;
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.jc4
    public final void a(Matrix matrix, yb4 yb4Var, int i, Canvas canvas) {
        hc4 hc4Var = this.c;
        float f = hc4Var.c;
        float f2 = this.e;
        float f3 = hc4Var.b;
        float f4 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        yb4Var.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = yb4Var.c;
        int[] iArr = yb4.i;
        iArr[0] = i2;
        iArr[1] = yb4Var.b;
        iArr[2] = yb4Var.a;
        Paint paint = (Paint) yb4Var.f;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, yb4.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        hc4 hc4Var = this.c;
        return (float) Math.toDegrees(Math.atan((hc4Var.c - this.e) / (hc4Var.b - this.d)));
    }
}
