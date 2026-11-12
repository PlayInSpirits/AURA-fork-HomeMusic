package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v03 implements vw4 {
    public final /* synthetic */ int a;
    public float b;
    public float c;
    public float d;
    public float e;

    public v03() {
        this.a = 0;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
    }

    @Override // defpackage.vw4
    public void a(Canvas canvas, Paint paint, RectF rectF) {
        Path path = new Path();
        float f = this.b;
        float f2 = this.c;
        float f3 = this.d;
        float f4 = this.e;
        path.addRoundRect(rectF, new float[]{f, f, f2, f2, f3, f3, f4, f4}, Path.Direction.CW);
        canvas.drawPath(path, paint);
    }

    public void b(float f, float f2, float f3, float f4) {
        this.b = Math.max(f, this.b);
        this.c = Math.max(f2, this.c);
        this.d = Math.min(f3, this.d);
        this.e = Math.min(f4, this.e);
    }

    public boolean c() {
        return (this.b >= this.d) | (this.c >= this.e);
    }

    public void d(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.b += fIntBitsToFloat;
        this.c += fIntBitsToFloat2;
        this.d += fIntBitsToFloat;
        this.e += fIntBitsToFloat2;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                String strF = gh0.F(this.b);
                String strF2 = gh0.F(this.c);
                String strF3 = gh0.F(this.d);
                String strF4 = gh0.F(this.e);
                StringBuilder sbU = b11.u("MutableRect(", strF, ", ", strF2, ", ");
                sbU.append(strF3);
                sbU.append(", ");
                sbU.append(strF4);
                sbU.append(")");
                return sbU.toString();
            default:
                return super.toString();
        }
    }

    public v03(float f, float f2, float f3, float f4) {
        this.a = 1;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }
}
