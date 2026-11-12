package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mz implements sv0 {
    public final lz n;
    public final i61 o;
    public gc p;
    public gc q;

    public mz() {
        ro0 ro0Var = gb.b;
        lz lzVar = new lz();
        lzVar.a = ro0Var;
        lzVar.b = r62.n;
        lzVar.c = p01.a;
        lzVar.d = 0L;
        this.n = lzVar;
        this.o = new i61(this);
    }

    public static gc a(mz mzVar, long j, q05 q05Var, int i) {
        gc gcVarC = mzVar.c(q05Var);
        Paint paint = (Paint) gcVarC.b;
        if (!x40.c(gcVarC.a(), j)) {
            gcVarC.f(j);
        }
        if (((Shader) gcVarC.c) != null) {
            gcVarC.c = null;
            paint.setShader(null);
        }
        if (!h12.c((dt) gcVarC.d, null)) {
            gcVarC.g(null);
        }
        if (gcVarC.a != i) {
            gcVarC.e(i);
        }
        if (paint.isFilterBitmap()) {
            return gcVarC;
        }
        paint.setFilterBitmap(true);
        return gcVarC;
    }

    @Override // defpackage.sv0
    public final void H(long j, long j2, long j3, q05 q05Var, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.n.c.g(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), a(this, j, q05Var, i));
    }

    @Override // defpackage.oo0
    public final float J() {
        return this.n.a.J();
    }

    @Override // defpackage.sv0
    public final i61 O() {
        return this.o;
    }

    @Override // defpackage.sv0
    public final void U(cc ccVar, long j, long j2, long j3, float f, dt dtVar, int i) {
        this.n.c.b(ccVar, j, j2, j3, b(null, c71.d, f, dtVar, i));
    }

    public final gc b(uo uoVar, q05 q05Var, float f, dt dtVar, int i) {
        gc gcVarC = c(q05Var);
        Paint paint = (Paint) gcVarC.b;
        if (uoVar != null) {
            uoVar.d(P(), gcVarC, f);
        } else {
            if (((Shader) gcVarC.c) != null) {
                gcVarC.c = null;
                paint.setShader(null);
            }
            long jA = gcVarC.a();
            long j = x40.b;
            if (!x40.c(jA, j)) {
                gcVarC.f(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                gcVarC.d(f);
            }
        }
        if (!h12.c((dt) gcVarC.d, dtVar)) {
            gcVarC.g(dtVar);
        }
        if (gcVarC.a != 3) {
            gcVarC.e(3);
        }
        if (paint.isFilterBitmap() == i) {
            return gcVarC;
        }
        paint.setFilterBitmap(true ^ (i == 0));
        return gcVarC;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005b  */
    public final gc c(q05 q05Var) {
        int i;
        Paint.Join join;
        Paint.Cap cap;
        int i2 = 0;
        if (h12.c(q05Var, c71.d)) {
            gc gcVar = this.p;
            if (gcVar != null) {
                return gcVar;
            }
            gc gcVarB = fh0.b();
            gcVarB.h(0);
            this.p = gcVarB;
            return gcVarB;
        }
        if (!(q05Var instanceof ym4)) {
            er1.n();
            return null;
        }
        gc gcVarB2 = this.q;
        if (gcVarB2 == null) {
            gcVarB2 = fh0.b();
            gcVarB2.h(1);
            this.q = gcVarB2;
        }
        Paint paint = (Paint) gcVarB2.b;
        float strokeWidth = paint.getStrokeWidth();
        ym4 ym4Var = (ym4) q05Var;
        float f = ym4Var.d;
        if (strokeWidth != f) {
            paint.setStrokeWidth(f);
        }
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i3 = strokeCap == null ? -1 : hc.a[strokeCap.ordinal()];
        if (i3 == 1) {
            i = 0;
        } else if (i3 == 2) {
            i = 1;
        } else if (i3 != 3) {
            i = 0;
        } else {
            i = 2;
        }
        int i4 = ym4Var.f;
        if (i != i4) {
            if (i4 == 2) {
                cap = Paint.Cap.SQUARE;
            } else if (i4 == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = i4 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
            }
            paint.setStrokeCap(cap);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = ym4Var.e;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i5 = strokeJoin != null ? hc.b[strokeJoin.ordinal()] : -1;
        if (i5 != 1) {
            if (i5 == 2) {
                i2 = 2;
            } else if (i5 == 3) {
                i2 = 1;
            }
        }
        int i6 = ym4Var.g;
        if (i2 == i6) {
            return gcVarB2;
        }
        if (i6 == 0) {
            join = Paint.Join.MITER;
        } else if (i6 == 2) {
            join = Paint.Join.BEVEL;
        } else {
            join = i6 == 1 ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
        return gcVarB2;
    }

    @Override // defpackage.sv0
    public final void d(nc ncVar, uo uoVar, float f, q05 q05Var) {
        this.n.c.c(ncVar, b(uoVar, q05Var, f, null, 1));
    }

    @Override // defpackage.oo0
    public final float g() {
        return this.n.a.g();
    }

    @Override // defpackage.sv0
    public final r62 getLayoutDirection() {
        return this.n.b;
    }
}
