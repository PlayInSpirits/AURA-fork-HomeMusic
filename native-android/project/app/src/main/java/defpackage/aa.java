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
    public Canvas a = ba.a;
    public Rect b;
    public Rect c;

    @Override // defpackage.jz
    public final void a(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.jz
    public final void b(cc ccVar, long j, long j2, long j3, gc gcVar) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        if (!(ccVar instanceof cc)) {
            er1.l("Unable to obtain android.graphics.Bitmap");
            return;
        }
        Bitmap bitmap = ccVar.a;
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(bitmap, rect, rect2, (Paint) gcVar.b);
    }

    @Override // defpackage.jz
    public final void c(nc ncVar, gc gcVar) {
        Canvas canvas = this.a;
        if (ncVar instanceof nc) {
            canvas.drawPath(ncVar.a, (Paint) gcVar.b);
        } else {
            er1.l("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.jz
    public final void d(float f, float f2, float f3, float f4, float f5, float f6, gc gcVar) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) gcVar.b);
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
    public final void g(float f, float f2, float f3, float f4, gc gcVar) {
        this.a.drawRect(f, f2, f3, f4, fh0.n(gcVar));
    }

    @Override // defpackage.jz
    public final void h(float[] fArr) {
        if (jz4.B(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        fArr[0] = f;
        fArr[1] = f5;
        fArr[2] = f10;
        fArr[3] = f2;
        fArr[4] = f6;
        fArr[5] = f11;
        fArr[6] = f4;
        fArr[7] = f8;
        fArr[8] = f12;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
        this.a.concat(matrix);
    }

    @Override // defpackage.jz
    public final void i(nc ncVar) {
        Canvas canvas = this.a;
        if (ncVar instanceof nc) {
            canvas.clipPath(ncVar.a, Region.Op.INTERSECT);
        } else {
            er1.l("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.jz
    public final void j(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.jz
    public final void k() {
        this.a.restore();
    }

    @Override // defpackage.jz
    public final void l(wv3 wv3Var, gc gcVar) {
        this.a.saveLayer(wv3Var.a, wv3Var.b, wv3Var.c, wv3Var.d, (Paint) gcVar.b, 31);
    }

    @Override // defpackage.jz
    public final void m(float f, float f2, float f3, float f4) {
        this.a.clipRect(f, f2, f3, f4, Region.Op.INTERSECT);
    }

    @Override // defpackage.jz
    public final void n() {
        g12.n(this.a, true);
    }
}
