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

    public fc4(hc4 r1, float r2, float r3) {
        this.c = r1;
        this.d = r2;
        this.e = r3;
    }

    @Override // defpackage.jc4
    public final void a(Matrix r18, yb4 r19, int r20, Canvas r21) {
        hc4 r4 = this.c;
        float r5 = r4.c;
        float r6 = this.e;
        float r7 = r4.b;
        float r8 = this.d;
        RectF r9 = new RectF(0.0f, 0.0f, (float) Math.hypot(r5 - r6, r7 - r8), 0.0f);
        Matrix r10 = this.a;
        r10.set(r18);
        r10.preTranslate(r8, r6);
        r10.preRotate(b());
        r19.getClass();
        r9.bottom += r20;
        r9.offset(0.0f, -r20);
        int r2 = r19.c;
        int[] r14 = yb4.i;
        r14[0] = r2;
        r14[1] = r19.b;
        r14[2] = r19.a;
        Paint r0 = (Paint) r19.f;
        float r11 = r9.left;
        r0.setShader(new LinearGradient(r11, r9.top, r11, r9.bottom, r14, yb4.j, Shader.TileMode.CLAMP));
        r21.save();
        r21.concat(r10);
        r21.drawRect(r9, r0);
        r21.restore();
    }

    public final float b() {
        hc4 r0 = this.c;
        return (float) Math.toDegrees(Math.atan((r0.c - this.e) / (r0.b - this.d)));
    }
}
