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
    public void a(Canvas r7, Paint r8, RectF r9) {
        Path r0 = new Path();
        float r1 = this.b;
        float r2 = this.c;
        float r3 = this.d;
        float r6 = this.e;
        r0.addRoundRect(r9, new float[]{r1, r1, r2, r2, r3, r3, r6, r6}, Path.Direction.CW);
        r7.drawPath(r0, r8);
    }

    public void b(float r2, float r3, float r4, float r5) {
        this.b = Math.max(r2, this.b);
        this.c = Math.max(r3, this.c);
        this.d = Math.min(r4, this.d);
        this.e = Math.min(r5, this.e);
    }

    public boolean c() {
        boolean r1 = false;
        if (this.b < this.d) goto L5;
        boolean r0 = true;
    L7:
        if (this.c < this.e) goto L10;
        r1 = true;
    L10:
        return r0 | r1;
    L5:
        r0 = false;
        goto L7
    }

    public void d(long r4) {
        float r0 = Float.intBitsToFloat((int) (r4 >> 32));
        float r5 = Float.intBitsToFloat((int) (r4 & 4294967295L));
        this.b += r0;
        this.c += r5;
        this.d += r0;
        this.e += r5;
    }

    public String toString() {
        switch(this.a) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        String r0 = gh0.F(this.b);
        String r1 = gh0.F(this.c);
        String r2 = gh0.F(this.d);
        String r5 = gh0.F(this.e);
        StringBuilder r3 = b11.u("MutableRect(", r0, ", ", r1, ", ");
        r3.append(r2);
        r3.append(", ");
        r3.append(r5);
        r3.append(")");
        return r3.toString();
    L5:
        return super.toString();
    }

    public v03(float r2, float r3, float r4, float r5) {
        this.a = 1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
    }
}
