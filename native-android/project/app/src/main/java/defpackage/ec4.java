package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ec4 extends jc4 {
    public final gc4 c;

    public ec4(gc4 gc4Var) {
        this.c = gc4Var;
    }

    @Override // defpackage.jc4
    public final void a(Matrix matrix, yb4 yb4Var, int i, Canvas canvas) {
        gc4 gc4Var = this.c;
        float f = gc4Var.f;
        float f2 = gc4Var.g;
        RectF rectF = new RectF(gc4Var.b, gc4Var.c, gc4Var.d, gc4Var.e);
        Paint paint = (Paint) yb4Var.e;
        boolean z = f2 < 0.0f;
        Path path = (Path) yb4Var.h;
        int[] iArr = yb4.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = yb4Var.c;
            iArr[2] = yb4Var.b;
            iArr[3] = yb4Var.a;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = yb4Var.a;
            iArr[2] = yb4Var.b;
            iArr[3] = yb4Var.c;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = yb4.l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, (Paint) yb4Var.g);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
