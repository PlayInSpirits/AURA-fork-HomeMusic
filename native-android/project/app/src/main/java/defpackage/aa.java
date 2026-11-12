package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class aa implements jz {
    public Canvas a;
    public Rect b;
    public Rect c;

    public aa() {
        this.a = ba.a;
    }

    @Override // defpackage.jz
    public final void a(float r1, float r2) {
        this.a.scale(r1, r2);
    }

    @Override // defpackage.jz
    public final void b(cc r9, long r10, long r12, long r14, gc r16) {
        if (this.b != null) goto L5;
        this.b = new Rect();
        this.c = new Rect();
    L5:
        Canvas r0 = this.a;
        if ((r9 instanceof cc) == false) goto L9;
        Bitmap r11 = r9.a;
        Rect r1 = this.b;
        r1.getClass();
        int r3 = (int) (r10 >> 32);
        r1.left = r3;
        int r13 = (int) (r10 & 4294967295L);
        r1.top = r13;
        r1.right = r3 + ((int) (r12 >> 32));
        r1.bottom = r13 + ((int) (r12 & 4294967295L));
        Rect r8 = this.c;
        r8.getClass();
        r8.left = 0;
        r8.top = 0;
        r8.right = (int) (r14 >> 32);
        r8.bottom = (int) (r14 & 4294967295L);
        r0.drawBitmap(r11, r1, r8, (Paint) r16.b);
        return;
    L9:
        er1.l("Unable to obtain android.graphics.Bitmap");
    }

    @Override // defpackage.jz
    public final void c(nc r2, gc r3) {
        Canvas r1 = this.a;
        if ((r2 instanceof nc) == false) goto L6;
        r1.drawPath(r2.a, (Paint) r3.b);
        return;
    L6:
        er1.l("Unable to obtain android.graphics.Path");
    }

    @Override // defpackage.jz
    public final void d(float r1, float r2, float r3, float r4, float r5, float r6, gc r7) {
        this.a.drawRoundRect(r1, r2, r3, r4, r5, r6, (Paint) r7.b);
    }

    @Override // defpackage.jz
    public final void e() {
        this.a.save();
    }

    @Override // defpackage.jz
    public final void f() {
        g12.n(this.a, false);
    }

    @Override // defpackage.jz
    public final void g(float r1, float r2, float r3, float r4, gc r5) {
        this.a.drawRect(r1, r2, r3, r4, fh0.n(r5));
    }

    @Override // defpackage.jz
    public final void h(float[] r24) {
        if (jz4.B(r24) == true) goto L6;
        Matrix r1 = new Matrix();
        float r3 = r24[0];
        float r5 = r24[1];
        float r7 = r24[2];
        float r9 = r24[3];
        float r11 = r24[4];
        float r13 = r24[5];
        float r15 = r24[6];
        float r17 = r24[7];
        float r19 = r24[8];
        float r20 = r24[12];
        float r21 = r24[13];
        float r22 = r24[15];
        r24[0] = r3;
        r24[1] = r11;
        r24[2] = r20;
        r24[3] = r5;
        r24[4] = r13;
        r24[5] = r21;
        r24[6] = r9;
        r24[7] = r17;
        r24[8] = r22;
        r1.setValues(r24);
        r24[0] = r3;
        r24[1] = r5;
        r24[2] = r7;
        r24[3] = r9;
        r24[4] = r11;
        r24[5] = r13;
        r24[6] = r15;
        r24[7] = r17;
        r24[8] = r19;
        this.a.concat(r1);
        return;
    }

    @Override // defpackage.jz
    public final void i(nc r2) {
        Canvas r1 = this.a;
        if ((r2 instanceof nc) == false) goto L6;
        r1.clipPath(r2.a, Region.Op.INTERSECT);
        return;
    L6:
        er1.l("Unable to obtain android.graphics.Path");
    }

    @Override // defpackage.jz
    public final void j(float r1, float r2) {
        this.a.translate(r1, r2);
    }

    @Override // defpackage.jz
    public final void k() {
        this.a.restore();
    }

    @Override // defpackage.jz
    public final void l(wv3 r8, gc r9) {
        this.a.saveLayer(r8.a, r8.b, r8.c, r8.d, (Paint) r9.b, 31);
    }

    @Override // defpackage.jz
    public final void m(float r7, float r8, float r9, float r10) {
        this.a.clipRect(r7, r8, r9, r10, Region.Op.INTERSECT);
    }

    @Override // defpackage.jz
    public final void n() {
        g12.n(this.a, true);
    }
}
