package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zj1 implements uj1 {
    public final nz b;
    public final mz c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public float i;
    public int j;
    public long k;
    public float l;
    public float m;
    public long n;
    public long o;
    public float p;
    public boolean q;
    public int r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public int z;

    public zj1() {
        nz nzVar = new nz();
        mz mzVar = new mz();
        this.b = nzVar;
        this.c = mzVar;
        RenderNode renderNodeC = kz.c();
        this.d = renderNodeC;
        this.e = 0L;
        renderNodeC.setClipToBounds(false);
        P(renderNodeC, 0);
        this.i = 1.0f;
        this.j = 3;
        this.k = 9205357640488583168L;
        this.l = 1.0f;
        this.m = 1.0f;
        long j = x40.b;
        this.n = j;
        this.o = j;
        this.p = 8.0f;
        this.z = 0;
    }

    @Override // defpackage.uj1
    public final void A(float f) {
        this.l = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.uj1
    public final float B() {
        return this.p;
    }

    @Override // defpackage.uj1
    public final void C() {
        this.d.setElevation(0.0f);
    }

    @Override // defpackage.uj1
    public final float D() {
        return 0.0f;
    }

    @Override // defpackage.uj1
    public final void E() {
        this.d.setTranslationX(0.0f);
    }

    @Override // defpackage.uj1
    public final void F(boolean z) {
        this.q = z;
        a();
    }

    @Override // defpackage.uj1
    public final float G() {
        return 0.0f;
    }

    @Override // defpackage.uj1
    public final void H(int i) {
        this.z = i;
        Q();
    }

    @Override // defpackage.uj1
    public final void I() {
        this.d.setRotationZ(0.0f);
    }

    @Override // defpackage.uj1
    public final void J(long j) {
        this.o = j;
        this.d.setSpotShadowColor(e35.U(j));
    }

    @Override // defpackage.uj1
    public final Matrix K() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.uj1
    public final void L(float f) {
        this.p = f;
        this.d.setCameraDistance(f);
    }

    @Override // defpackage.uj1
    public final float M() {
        return 0.0f;
    }

    @Override // defpackage.uj1
    public final float N() {
        return this.m;
    }

    @Override // defpackage.uj1
    public final int O() {
        return this.j;
    }

    public final void P(RenderNode renderNode, int i) {
        Paint paint = this.f;
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, paint);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void Q() {
        int i = this.z;
        if (i != 1 && this.j == 3) {
            P(this.d, i);
        } else {
            P(this.d, 1);
        }
    }

    public final void R() {
        long j = this.k;
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.d;
        if (j2 == 9205357640488583168L) {
            renderNode.setPivotX((Float.intBitsToFloat((int) (this.e >> 32)) / 2.0f) + this.r);
            this.d.setPivotY((Float.intBitsToFloat((int) (this.e & 4294967295L)) / 2.0f) + this.s);
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.r);
            this.d.setPivotY(Float.intBitsToFloat((int) (this.k & 4294967295L)) + this.s);
        }
    }

    public final void S() {
        RenderNode renderNode = this.d;
        int i = this.x;
        renderNode.setPosition(i - this.r, this.y - this.s, i + ((int) Float.intBitsToFloat((int) (this.e >> 32))) + this.t, this.y + ((int) Float.intBitsToFloat((int) (this.e & 4294967295L))) + this.u);
    }

    public final void a() {
        boolean z = this.q;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.v) {
            this.v = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.w) {
            this.w = z2;
            this.d.setClipToOutline(z2);
        }
    }

    @Override // defpackage.uj1
    public final float b() {
        return this.i;
    }

    @Override // defpackage.uj1
    public final float c() {
        return this.l;
    }

    @Override // defpackage.uj1
    public final void d(Outline outline, long j) {
        this.d.setOutline(outline);
        this.h = outline != null;
        a();
    }

    @Override // defpackage.uj1
    public final void e(int i) {
        this.j = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setBlendMode(q05.A(i));
        Q();
    }

    @Override // defpackage.uj1
    public final void f() {
        this.d.discardDisplayList();
    }

    @Override // defpackage.uj1
    public final void g(jz jzVar) {
        Canvas canvas = ba.a;
        ((aa) jzVar).a.drawRenderNode(this.d);
    }

    @Override // defpackage.uj1
    public final int h() {
        return this.z;
    }

    @Override // defpackage.uj1
    public final dt i() {
        return null;
    }

    @Override // defpackage.uj1
    public final void j(float f) {
        this.m = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.uj1
    public final void k(int i, int i2, long j) {
        this.x = i;
        this.y = i2;
        boolean zA = qf4.a(this.e, l93.o0(j));
        this.e = l93.o0(j);
        S();
        if (zA || !g83.b(this.k, 9205357640488583168L)) {
            return;
        }
        this.d.setPivotX((((int) (j >> 32)) / 2.0f) + this.r);
        this.d.setPivotY((((int) (j & 4294967295L)) / 2.0f) + this.s);
    }

    @Override // defpackage.uj1
    public final float l() {
        return 0.0f;
    }

    @Override // defpackage.uj1
    public final boolean m() {
        return this.d.hasDisplayList();
    }

    @Override // defpackage.uj1
    public final float n() {
        return 0.0f;
    }

    @Override // defpackage.uj1
    public final void o(long j) {
        this.k = j;
        R();
    }

    @Override // defpackage.uj1
    public final long p() {
        return this.n;
    }

    @Override // defpackage.uj1
    public final void q(oo0 oo0Var, r62 r62Var, sj1 sj1Var, ir0 ir0Var) {
        mz mzVar = this.c;
        RecordingCanvas recordingCanvasBeginRecording = this.d.beginRecording();
        float f = this.r;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.s)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        try {
            nz nzVar = this.b;
            aa aaVar = nzVar.a;
            Canvas canvas = aaVar.a;
            aaVar.a = recordingCanvasBeginRecording;
            i61 i61Var = mzVar.o;
            i61Var.r(oo0Var);
            i61Var.s(r62Var);
            i61Var.p = sj1Var;
            i61Var.t(this.e);
            i61Var.q(aaVar);
            if (this.r > 0.0f || this.s > 0.0f) {
                int i = (int) (jFloatToRawIntBits >> 32);
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                aaVar.j(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                ir0Var.invoke(mzVar);
                aaVar.j(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            } else {
                ir0Var.invoke(mzVar);
            }
            nzVar.a.a = canvas;
        } finally {
            this.d.endRecording();
        }
    }

    @Override // defpackage.uj1
    public final void r() {
        this.d.setRotationX(0.0f);
    }

    @Override // defpackage.uj1
    public final void s(float f) {
        this.i = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.uj1
    public final void t(int i, int i2, int i3, int i4) {
        if (!(i >= 0 && i2 >= 0 && i3 >= 0 && i4 >= 0)) {
            StringBuilder sbT = b11.t("Outsets cannot be negative! Left: ", ", Top: ", i, i2, ", Right: ");
            sbT.append(i3);
            sbT.append(", Bottom: ");
            sbT.append(i4);
            bz1.a(sbT.toString());
        }
        int i5 = this.r;
        if (i == i5 && i2 == this.s && i3 == this.t && i4 == this.u) {
            return;
        }
        boolean z = (i == i5 && i2 == this.s) ? false : true;
        this.r = i;
        this.s = i2;
        this.t = i3;
        this.u = i4;
        S();
        if (z) {
            R();
        }
    }

    @Override // defpackage.uj1
    public final float u() {
        return 0.0f;
    }

    @Override // defpackage.uj1
    public final void v() {
        this.d.setTranslationY(0.0f);
    }

    @Override // defpackage.uj1
    public final void w() {
        this.d.setRotationY(0.0f);
    }

    @Override // defpackage.uj1
    public final long x() {
        return this.o;
    }

    @Override // defpackage.uj1
    public final void y(long j) {
        this.n = j;
        this.d.setAmbientShadowColor(e35.U(j));
    }

    @Override // defpackage.uj1
    public final void z() {
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(null);
        Q();
    }
}
