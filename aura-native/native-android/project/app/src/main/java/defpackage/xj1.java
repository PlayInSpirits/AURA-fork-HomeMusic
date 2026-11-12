package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xj1 implements uj1 {
    public static final AtomicBoolean C = new AtomicBoolean(true);
    public int A;
    public int B;
    public final nz b;
    public final mz c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public float l;
    public boolean m;
    public long n;
    public float o;
    public float p;
    public long q;
    public long r;
    public float s;
    public boolean t;
    public int u;
    public int v;
    public int w;
    public int x;
    public boolean y;
    public boolean z;

    public xj1(ra raVar, nz nzVar, mz mzVar) {
        this.b = nzVar;
        this.c = mzVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", raVar);
        this.d = renderNodeCreate;
        this.e = 0L;
        this.i = 0L;
        if (C.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                cz3.c(renderNodeCreate, cz3.a(renderNodeCreate));
                cz3.d(renderNodeCreate, cz3.b(renderNodeCreate));
            }
            bz3.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        P(0);
        this.j = 0;
        this.k = 3;
        this.l = 1.0f;
        this.n = 9205357640488583168L;
        this.o = 1.0f;
        this.p = 1.0f;
        long j = x40.b;
        this.q = j;
        this.r = j;
        this.s = 8.0f;
    }

    @Override // defpackage.uj1
    public final void A(float f) {
        this.o = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.uj1
    public final float B() {
        return this.s;
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
        this.t = z;
        a();
    }

    @Override // defpackage.uj1
    public final float G() {
        return 0.0f;
    }

    @Override // defpackage.uj1
    public final void H(int i) {
        this.j = i;
        Q();
    }

    @Override // defpackage.uj1
    public final void I() {
        this.d.setRotation(0.0f);
    }

    @Override // defpackage.uj1
    public final void J(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.r = j;
            cz3.d(this.d, e35.U(j));
        }
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
        this.s = f;
        this.d.setCameraDistance(-f);
    }

    @Override // defpackage.uj1
    public final float M() {
        return 0.0f;
    }

    @Override // defpackage.uj1
    public final float N() {
        return this.p;
    }

    @Override // defpackage.uj1
    public final int O() {
        return this.k;
    }

    public final void P(int i) {
        RenderNode renderNode = this.d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void Q() {
        int i = this.j;
        if (i != 1 && this.k == 3) {
            P(i);
        } else {
            P(1);
        }
    }

    public final void R() {
        long j = this.n;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.m = true;
            this.d.setPivotX((((int) (this.e >> 32)) / 2.0f) + this.u);
            this.d.setPivotY((((int) (4294967295L & this.e)) / 2.0f) + this.v);
        } else {
            this.m = false;
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.u);
            this.d.setPivotY(Float.intBitsToFloat((int) (this.n & 4294967295L)) + this.v);
        }
    }

    public final void S() {
        RenderNode renderNode = this.d;
        int i = this.A;
        int i2 = i - this.u;
        int i3 = this.B;
        int i4 = i3 - this.v;
        long j = this.e;
        renderNode.setLeftTopRightBottom(i2, i4, i + ((int) (j >> 32)) + this.w, i3 + ((int) (j & 4294967295L)) + this.x);
    }

    public final void a() {
        boolean z = this.t;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.y) {
            this.y = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.z) {
            this.z = z2;
            this.d.setClipToOutline(z2);
        }
    }

    @Override // defpackage.uj1
    public final float b() {
        return this.l;
    }

    @Override // defpackage.uj1
    public final float c() {
        return this.o;
    }

    @Override // defpackage.uj1
    public final void d(Outline outline, long j) {
        this.i = j;
        this.d.setOutline(outline);
        this.h = outline != null;
        a();
    }

    @Override // defpackage.uj1
    public final void e(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(q05.B(i)));
        Q();
    }

    @Override // defpackage.uj1
    public final void f() {
        bz3.a(this.d);
    }

    @Override // defpackage.uj1
    public final void g(jz jzVar) {
        Canvas canvas = ba.a;
        DisplayListCanvas displayListCanvas = ((aa) jzVar).a;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.d);
    }

    @Override // defpackage.uj1
    public final int h() {
        return this.j;
    }

    @Override // defpackage.uj1
    public final dt i() {
        return null;
    }

    @Override // defpackage.uj1
    public final void j(float f) {
        this.p = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.uj1
    public final void k(int i, int i2, long j) {
        this.A = i;
        this.B = i2;
        boolean zA = n02.a(this.e, j);
        this.e = j;
        S();
        if (zA) {
            return;
        }
        if (this.m || g83.b(this.n, 9205357640488583168L)) {
            this.d.setPivotX((((int) (j >> 32)) / 2.0f) + this.u);
            this.d.setPivotY((((int) (j & 4294967295L)) / 2.0f) + this.v);
        }
    }

    @Override // defpackage.uj1
    public final float l() {
        return 0.0f;
    }

    @Override // defpackage.uj1
    public final boolean m() {
        return this.d.isValid();
    }

    @Override // defpackage.uj1
    public final float n() {
        return 0.0f;
    }

    @Override // defpackage.uj1
    public final void o(long j) {
        this.n = j;
        R();
    }

    @Override // defpackage.uj1
    public final long p() {
        return this.q;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.uj1
    public final void q(oo0 oo0Var, r62 r62Var, sj1 sj1Var, ir0 ir0Var) throws Throwable {
        DisplayListCanvas displayListCanvas;
        int i;
        int i2;
        oo0 oo0VarH;
        r62 r62VarI;
        jz jzVarG;
        long j;
        sj1 sj1Var2;
        mz mzVar = this.c;
        i61 i61Var = mzVar.o;
        DisplayListCanvas displayListCanvasStart = this.d.start(Math.max(((int) (this.e >> 32)) + this.u + this.w, (int) (this.i >> 32)), Math.max(((int) (this.e & 4294967295L)) + this.v + this.x, (int) (this.i & 4294967295L)));
        float f = this.u;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.v)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        try {
            aa aaVar = this.b.a;
            Canvas canvas = aaVar.a;
            aaVar.a = (Canvas) displayListCanvasStart;
            try {
                try {
                    if (this.u <= 0.0f) {
                        try {
                            if (this.v <= 0.0f) {
                                long jO0 = l93.o0(this.e);
                                oo0 oo0VarH2 = i61Var.h();
                                r62 r62VarI2 = i61Var.i();
                                jz jzVarG2 = i61Var.g();
                                canvas = canvas;
                                long j2 = i61Var.j();
                                displayListCanvasStart = displayListCanvasStart;
                                sj1 sj1Var3 = (sj1) i61Var.p;
                                i61Var.r(oo0Var);
                                i61Var.s(r62Var);
                                i61Var.q(aaVar);
                                i61Var.t(jO0);
                                i61Var.p = sj1Var;
                                aaVar.e();
                                try {
                                    ir0Var.invoke(mzVar);
                                    aaVar.k();
                                    i61Var.r(oo0VarH2);
                                    i61Var.s(r62VarI2);
                                    i61Var.q(jzVarG2);
                                    i61Var.t(j2);
                                    i61Var.p = sj1Var3;
                                } catch (Throwable th) {
                                    aaVar.k();
                                    i61Var.r(oo0VarH2);
                                    i61Var.s(r62VarI2);
                                    i61Var.q(jzVarG2);
                                    i61Var.t(j2);
                                    i61Var.p = sj1Var3;
                                    throw th;
                                }
                            }
                            aaVar.a = canvas;
                            this.d.end(displayListCanvasStart);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            displayListCanvasStart = displayListCanvasStart;
                            displayListCanvas = displayListCanvasStart;
                            this.d.end(displayListCanvas);
                            throw th;
                        }
                    }
                    ir0Var.invoke(mzVar);
                    aaVar.k();
                    i61Var.r(oo0VarH);
                    i61Var.s(r62VarI);
                    i61Var.q(jzVarG);
                    i61Var.t(j);
                    i61Var.p = sj1Var2;
                    aaVar.j(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
                    aaVar.a = canvas;
                    this.d.end(displayListCanvasStart);
                    return;
                } catch (Throwable th3) {
                    displayListCanvas = displayListCanvasStart;
                    try {
                        aaVar.k();
                        i61Var.r(oo0VarH);
                        i61Var.s(r62VarI);
                        i61Var.q(jzVarG);
                        i61Var.t(j);
                        i61Var.p = sj1Var2;
                        throw th3;
                    } catch (Throwable th4) {
                        th = th4;
                        this.d.end(displayListCanvas);
                        throw th;
                    }
                }
                i = (int) (jFloatToRawIntBits >> 32);
                i2 = (int) (jFloatToRawIntBits & 4294967295L);
                aaVar.j(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                long jO1 = l93.o0(this.e);
                oo0VarH = i61Var.h();
                r62VarI = i61Var.i();
                jzVarG = i61Var.g();
                j = i61Var.j();
                sj1Var2 = (sj1) i61Var.p;
                i61Var.r(oo0Var);
                i61Var.s(r62Var);
                i61Var.q(aaVar);
                i61Var.t(jO1);
                i61Var.p = sj1Var;
                aaVar.e();
            } catch (Throwable th5) {
                th = th5;
                displayListCanvas = displayListCanvasStart;
                this.d.end(displayListCanvas);
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            displayListCanvas = displayListCanvasStart;
        }
    }

    @Override // defpackage.uj1
    public final void r() {
        this.d.setRotationX(0.0f);
    }

    @Override // defpackage.uj1
    public final void s(float f) {
        this.l = f;
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
        int i5 = this.u;
        if (i == i5 && i2 == this.v && i3 == this.w && i4 == this.x) {
            return;
        }
        boolean z = (i == i5 && i2 == this.v) ? false : true;
        this.u = i;
        this.v = i2;
        this.w = i3;
        this.x = i4;
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
        return this.r;
    }

    @Override // defpackage.uj1
    public final void y(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.q = j;
            cz3.c(this.d, e35.U(j));
        }
    }

    @Override // defpackage.uj1
    public final void z() {
        Q();
    }
}
