package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xc extends TextPaint {
    public gc a;
    public sr4 b;
    public int c;
    public xb4 d;
    public x40 e;
    public uo f;
    public dp0 g;
    public qf4 h;
    public q05 i;

    public final gc a() {
        gc r0 = this.a;
        if (r0 == null) goto L5;
        return r0;
    L5:
        gc r1 = new gc(this);
        this.a = r1;
        return r1;
    }

    public final void b(int r2) {
        if (r2 != this.c) goto L5;
        return;
    L5:
        a().e(r2);
        this.c = r2;
    }

    public final void c(uo r4, long r5, float r7) {
        if (r4 != null) goto L7;
        this.g = null;
        this.f = null;
        this.h = null;
        setShader(null);
        return;
    L7:
        if ((r4 instanceof zh4) == false) goto L11;
        d(rr2.M(((zh4) r4).u, r7));
        return;
    L11:
        if ((r4 instanceof pv) == true) goto L13;
        er1.n();
        return;
    L13:
        if (h12.c(this.f, r4) == false) goto L20;
        qf4 r1 = this.h;
        if (r1 != null) goto L17;
        boolean r2 = false;
    L18:
        if (r2 == false) goto L20;
    L22:
        gc r6 = a();
        dp0 r8 = this.g;
        if (r8 == null) goto L25;
        Shader r9 = (Shader) r8.getValue();
    L26:
        r6.c = r9;
        ((Paint) r6.b).setShader(r9);
        this.e = null;
        gh0.C(this, r7);
        return;
    L25:
        r9 = null;
        goto L26
    L17:
        r2 = qf4.a(r1.a, r5);
    L20:
        if (r5 == 9205357640488583168L) goto L22;
        this.f = r4;
        this.h = new qf4(r5);
        wc r3 = new wc(r4, r5);
        z05 r10 = ph4.a;
        this.g = new dp0(r3, null);
        goto L22
    }

    public final void d(long r3) {
        x40 r0 = this.e;
        if (r0 != null) goto L5;
        boolean r1 = false;
    L6:
        if (r1 == false) goto L8;
        return;
    L8:
        if (r3 == 16) goto L12;
        this.e = new x40(r3);
        setColor(e35.U(r3));
        this.g = null;
        this.f = null;
        this.h = null;
        setShader(null);
        return;
    L12:
        return;
    L5:
        r1 = x40.c(r0.a, r3);
        goto L6
    }

    public final void e(q05 r5) {
        if (r5 != null) goto L5;
        return;
    L5:
        if (h12.c(this.i, r5) == true) goto L32;
        this.i = r5;
        if (r5.equals(c71.d) == false) goto L11;
        setStyle(Paint.Style.FILL);
        return;
    L11:
        if ((r5 instanceof ym4) == false) goto L30;
        a().h(1);
        gc r0 = a();
        ym4 r6 = (ym4) r5;
        float r2 = r6.d;
        ((Paint) r0.b).setStrokeWidth(r2);
        gc r1 = a();
        float r3 = r6.e;
        ((Paint) r1.b).setStrokeMiter(r3);
        gc r4 = a();
        int r7 = r6.g;
        Paint r8 = (Paint) r4.b;
        if (r7 != 0) goto L15;
        Paint.Join r9 = Paint.Join.MITER;
    L20:
        r8.setStrokeJoin(r9);
        gc r10 = a();
        int r11 = r6.f;
        Paint r12 = (Paint) r10.b;
        if (r11 != 2) goto L23;
        Paint.Cap r13 = Paint.Cap.SQUARE;
    L28:
        r12.setStrokeCap(r13);
        ((Paint) a().b).setPathEffect(null);
        return;
    L23:
        if (r11 != 1) goto L25;
        r13 = Paint.Cap.ROUND;
        goto L28
    L25:
        if (r11 != 0) goto L27;
        r13 = Paint.Cap.BUTT;
        goto L28
    L27:
        r13 = Paint.Cap.BUTT;
        goto L28
    L15:
        if (r7 != 2) goto L17;
        r9 = Paint.Join.BEVEL;
        goto L20
    L17:
        if (r7 != 1) goto L19;
        r9 = Paint.Join.ROUND;
        goto L20
    L19:
        r9 = Paint.Join.MITER;
        goto L20
    L30:
        er1.n();
        return;
    }

    public final void f(xb4 r6) {
        if (r6 != null) goto L5;
        return;
    L5:
        if (h12.c(this.d, r6) == true) goto L15;
        this.d = r6;
        if (r6.equals(xb4.d) == false) goto L10;
        clearShadowLayer();
        return;
    L10:
        xb4 r7 = this.d;
        float r0 = r7.c;
        if (r0 != 0.0f) goto L13;
        r0 = Float.MIN_VALUE;
    L13:
        setShadowLayer(r0, Float.intBitsToFloat((int) (r7.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), e35.U(this.d.a));
        return;
    }

    public final void g(sr4 r4) {
        if (r4 != null) goto L5;
        return;
    L5:
        if (h12.c(this.b, r4) == true) goto L15;
        this.b = r4;
        int r5 = r4.a;
        boolean r1 = false;
        if ((r5 | 1) != r5) goto L9;
        boolean r6 = true;
    L10:
        setUnderlineText(r6);
        int r7 = this.b.a;
        if ((r7 | 2) != r7) goto L13;
        r1 = true;
    L13:
        setStrikeThruText(r1);
        return;
    L9:
        r6 = false;
        goto L10
    }
}
