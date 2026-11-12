package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ta2 extends mw0 {
    public float c;
    public float d;
    public float e;
    public Path f;

    public ta2(cb2 r1) {
        super(r1);
        this.c = 300.0f;
    }

    @Override // defpackage.mw0
    public final void a(Canvas r8, Rect r9, float r10) {
        this.c = r9.width();
        cb2 r0 = (cb2) this.a;
        float r1 = r0.a;
        r8.translate((r9.width() / 2.0f) + r9.left, Math.max(0.0f, (r9.height() - r0.a) / 2.0f) + ((r9.height() / 2.0f) + r9.top));
        if (r0.i == false) goto L6;
        r8.scale(-1.0f, 1.0f);
    L6:
        if (this.b.d() == false) goto L10;
        if (r0.e != 1) goto L10;
    L13:
        r8.scale(1.0f, -1.0f);
    L15:
        if (this.b.d() == false) goto L17;
    L18:
        r8.translate(0.0f, ((r10 - 1.0f) * r0.a) / 2.0f);
    L19:
        float r11 = this.c;
        r8.clipRect((-r11) / 2.0f, (-r1) / 2.0f, r11 / 2.0f, r1 / 2.0f);
        this.d = r0.a * r10;
        this.e = r0.b * r10;
        return;
    L17:
        if (this.b.c() == false) goto L19;
    L10:
        if (this.b.c() == false) goto L15;
        if (r0.f != 2) goto L15;
        goto L13
    }

    @Override // defpackage.mw0
    public final void b(Canvas r5, Paint r6, float r7, float r8, int r9) {
        if (r7 != r8) goto L5;
        return;
    L5:
        float r0 = this.c;
        float r1 = (-r0) / 2.0f;
        float r10 = ((r7 * r0) + r1) - (this.e * 2.0f);
        float r11 = (r8 * r0) + r1;
        r6.setStyle(Paint.Style.FILL);
        r6.setAntiAlias(true);
        r6.setColor(r9);
        r5.save();
        r5.clipPath(this.f);
        float r2 = this.d;
        RectF r12 = new RectF(r10, (-r2) / 2.0f, r11, r2 / 2.0f);
        float r4 = this.e;
        r5.drawRoundRect(r12, r4, r4, r6);
        r5.restore();
    }

    @Override // defpackage.mw0
    public final void c(Canvas r8, Paint r9) {
        int r0 = g12.l(((cb2) this.a).d, this.b.w);
        r9.setStyle(Paint.Style.FILL);
        r9.setAntiAlias(true);
        r9.setColor(r0);
        Path r1 = new Path();
        this.f = r1;
        float r2 = this.c;
        float r5 = this.d;
        RectF r3 = new RectF((-r2) / 2.0f, (-r5) / 2.0f, r2 / 2.0f, r5 / 2.0f);
        float r4 = this.e;
        r1.addRoundRect(r3, r4, r4, Path.Direction.CCW);
        r8.drawPath(this.f, r9);
    }

    @Override // defpackage.mw0
    public final int d() {
        return ((cb2) this.a).a;
    }

    @Override // defpackage.mw0
    public final int e() {
        return -1;
    }
}
