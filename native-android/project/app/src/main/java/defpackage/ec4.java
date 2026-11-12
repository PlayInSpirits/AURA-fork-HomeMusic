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

    public ec4(gc4 r1) {
        this.c = r1;
    }

    @Override // defpackage.jc4
    public final void a(Matrix r22, yb4 r23, int r24, Canvas r25) {
        gc4 r2 = this.c;
        float r4 = r2.f;
        float r5 = r2.g;
        RectF r6 = new RectF(r2.b, r2.c, r2.d, r2.e);
        Paint r3 = (Paint) r23.e;
        if (r5 >= 0.0f) goto L5;
        boolean r8 = true;
    L6:
        Path r11 = (Path) r23.h;
        int[] r18 = yb4.k;
        if (r8 == false) goto L9;
        r18[0] = 0;
        r18[1] = r23.c;
        r18[2] = r23.b;
        r18[3] = r23.a;
    L10:
        float r17 = r6.width() / 2.0f;
        if (r17 > 0.0f) goto L13;
        return;
    L13:
        float r1 = 1.0f - (r24 / r17);
        float[] r19 = yb4.l;
        r19[1] = r1;
        r19[2] = ((1.0f - r1) / 2.0f) + r1;
        r3.setShader(new RadialGradient(r6.centerX(), r6.centerY(), r17, r18, r19, Shader.TileMode.CLAMP));
        r25.save();
        r25.concat(r22);
        r25.scale(1.0f, r6.height() / r6.width());
        if (r8 == true) goto L16;
        r25.clipPath(r11, Region.Op.DIFFERENCE);
        r25.drawPath(r11, (Paint) r23.g);
    L16:
        r25.drawArc(r6, r4, r5, true, r3);
        r25.restore();
        return;
    L9:
        r11.rewind();
        r11.moveTo(r6.centerX(), r6.centerY());
        r11.arcTo(r6, r4, r5);
        r11.close();
        float r14 = -r24;
        r6.inset(r14, r14);
        r18[0] = 0;
        r18[1] = r23.a;
        r18[2] = r23.b;
        r18[3] = r23.c;
        goto L10
    L5:
        r8 = false;
        goto L6
    }
}
