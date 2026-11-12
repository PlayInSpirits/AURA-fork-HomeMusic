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
        gc gcVar = this.a;
        if (gcVar != null) {
            return gcVar;
        }
        gc gcVar2 = new gc(this);
        this.a = gcVar2;
        return gcVar2;
    }

    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        a().e(i);
        this.c = i;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    public final void c(uo uoVar, long j, float f) {
        if (uoVar == null) {
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
            return;
        }
        if (uoVar instanceof zh4) {
            d(rr2.M(((zh4) uoVar).u, f));
            return;
        }
        if (!(uoVar instanceof pv)) {
            er1.n();
            return;
        }
        if (h12.c(this.f, uoVar)) {
            qf4 qf4Var = this.h;
            if (!(qf4Var == null ? false : qf4.a(qf4Var.a, j))) {
                if (j != 9205357640488583168L) {
                    this.f = uoVar;
                    this.h = new qf4(j);
                    wc wcVar = new wc(uoVar, j);
                    z05 z05Var = ph4.a;
                    this.g = new dp0(wcVar, null);
                }
            }
        } else if (j != 9205357640488583168L) {
            this.f = uoVar;
            this.h = new qf4(j);
            wc wcVar2 = new wc(uoVar, j);
            z05 z05Var2 = ph4.a;
            this.g = new dp0(wcVar2, null);
        }
        gc gcVarA = a();
        dp0 dp0Var = this.g;
        Shader shader = dp0Var != null ? (Shader) dp0Var.getValue() : null;
        gcVarA.c = shader;
        ((Paint) gcVarA.b).setShader(shader);
        this.e = null;
        gh0.C(this, f);
    }

    public final void d(long j) {
        x40 x40Var = this.e;
        if ((x40Var == null ? false : x40.c(x40Var.a, j)) || j == 16) {
            return;
        }
        this.e = new x40(j);
        setColor(e35.U(j));
        this.g = null;
        this.f = null;
        this.h = null;
        setShader(null);
    }

    public final void e(q05 q05Var) {
        Paint.Join join;
        Paint.Cap cap;
        if (q05Var == null || h12.c(this.i, q05Var)) {
            return;
        }
        this.i = q05Var;
        if (q05Var.equals(c71.d)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(q05Var instanceof ym4)) {
            er1.n();
            return;
        }
        a().h(1);
        ym4 ym4Var = (ym4) q05Var;
        ((Paint) a().b).setStrokeWidth(ym4Var.d);
        ((Paint) a().b).setStrokeMiter(ym4Var.e);
        gc gcVarA = a();
        int i = ym4Var.g;
        Paint paint = (Paint) gcVarA.b;
        if (i == 0) {
            join = Paint.Join.MITER;
        } else if (i == 2) {
            join = Paint.Join.BEVEL;
        } else {
            join = i == 1 ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
        gc gcVarA2 = a();
        int i2 = ym4Var.f;
        Paint paint2 = (Paint) gcVarA2.b;
        if (i2 == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i2 == 1) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = i2 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        paint2.setStrokeCap(cap);
        ((Paint) a().b).setPathEffect(null);
    }

    public final void f(xb4 xb4Var) {
        if (xb4Var == null || h12.c(this.d, xb4Var)) {
            return;
        }
        this.d = xb4Var;
        if (xb4Var.equals(xb4.d)) {
            clearShadowLayer();
            return;
        }
        xb4 xb4Var2 = this.d;
        float f = xb4Var2.c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (xb4Var2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), e35.U(this.d.a));
    }

    public final void g(sr4 sr4Var) {
        if (sr4Var == null || h12.c(this.b, sr4Var)) {
            return;
        }
        this.b = sr4Var;
        int i = sr4Var.a;
        setUnderlineText((i | 1) == i);
        int i2 = this.b.a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
