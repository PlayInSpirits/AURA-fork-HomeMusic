package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bj1 extends fo0 implements rv0 {
    public final /* synthetic */ int D = 1;
    public final tb E;
    public final vy0 F;
    public Object G;

    public bj1(ip4 ip4Var, tb tbVar, vy0 vy0Var, ac3 ac3Var) {
        this.E = tbVar;
        this.F = vy0Var;
        this.G = ac3Var;
        q0(ip4Var);
    }

    public static boolean t0(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public static boolean u0(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // defpackage.rv0
    public final void S(e72 e72Var) {
        boolean zU0;
        long j;
        char c;
        boolean z;
        boolean zT0;
        int i = this.D;
        tb tbVar = this.E;
        vy0 vy0Var = this.F;
        switch (i) {
            case 0:
                ac3 ac3Var = (ac3) this.G;
                mz mzVar = e72Var.n;
                tbVar.j(mzVar.P());
                if (qf4.b(mzVar.P())) {
                    e72Var.a();
                    return;
                }
                e72Var.a();
                tbVar.d.getValue();
                Canvas canvasA = ba.a(mzVar.o.g());
                boolean zF = vy0.f(vy0Var.f);
                r62 r62Var = r62.n;
                if (zF) {
                    EdgeEffect edgeEffectC = vy0Var.c();
                    float f = -Float.intBitsToFloat((int) (mzVar.P() & 4294967295L));
                    zU0 = u0(270.0f, (((long) Float.floatToRawIntBits(e72Var.M(e72Var.getLayoutDirection() == r62Var ? ac3Var.a : ac3Var.b))) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32), edgeEffectC, canvasA);
                } else {
                    zU0 = false;
                }
                if (vy0.f(vy0Var.d)) {
                    EdgeEffect edgeEffectE = vy0Var.e();
                    ac3Var.getClass();
                    zU0 = u0(0.0f, (((long) Float.floatToRawIntBits(e72Var.M(0.0f))) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), edgeEffectE, canvasA) || zU0;
                }
                if (vy0.f(vy0Var.g)) {
                    EdgeEffect edgeEffectD = vy0Var.d();
                    zU0 = u0(90.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(e72Var.M(e72Var.getLayoutDirection() == r62Var ? ac3Var.b : ac3Var.a) + (-((float) ji2.L(Float.intBitsToFloat((int) (mzVar.P() >> 32))))))) & 4294967295L), edgeEffectD, canvasA) || zU0;
                }
                if (vy0.f(vy0Var.e)) {
                    EdgeEffect edgeEffectB = vy0Var.b();
                    ac3Var.getClass();
                    float fM = e72Var.M(0.0f);
                    zU0 = u0(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (mzVar.P() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (mzVar.P() & 4294967295L))) + fM)) & 4294967295L), edgeEffectB, canvasA) || zU0;
                }
                if (zU0) {
                    tbVar.d();
                    return;
                }
                return;
            default:
                mz mzVar2 = e72Var.n;
                tbVar.j(mzVar2.P());
                Canvas canvasA2 = ba.a(mzVar2.o.g());
                tbVar.d.getValue();
                if (qf4.b(mzVar2.P())) {
                    e72Var.a();
                    return;
                }
                if (!canvasA2.isHardwareAccelerated()) {
                    EdgeEffect edgeEffect = vy0Var.d;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = vy0Var.e;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = vy0Var.f;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = vy0Var.g;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = vy0Var.h;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = vy0Var.i;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = vy0Var.j;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = vy0Var.k;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    e72Var.a();
                    return;
                }
                float fM2 = e72Var.M(30.0f);
                boolean z2 = vy0.f(vy0Var.d) || vy0.g(vy0Var.h) || vy0.f(vy0Var.e) || vy0.g(vy0Var.i);
                boolean z3 = vy0.f(vy0Var.f) || vy0.g(vy0Var.j) || vy0.f(vy0Var.g) || vy0.g(vy0Var.k);
                if (z2 && z3) {
                    j = 4294967295L;
                    c = ' ';
                    v0().setPosition(0, 0, canvasA2.getWidth(), canvasA2.getHeight());
                } else {
                    j = 4294967295L;
                    c = ' ';
                    if (z2) {
                        v0().setPosition(0, 0, (ji2.L(fM2) * 2) + canvasA2.getWidth(), canvasA2.getHeight());
                    } else {
                        if (!z3) {
                            e72Var.a();
                            return;
                        }
                        v0().setPosition(0, 0, canvasA2.getWidth(), (ji2.L(fM2) * 2) + canvasA2.getHeight());
                    }
                }
                RecordingCanvas recordingCanvasBeginRecording = v0().beginRecording();
                boolean zG = vy0.g(vy0Var.j);
                hb3 hb3Var = hb3.o;
                if (zG) {
                    EdgeEffect edgeEffectA = vy0Var.j;
                    if (edgeEffectA == null) {
                        edgeEffectA = vy0Var.a(hb3Var);
                        vy0Var.j = edgeEffectA;
                    }
                    t0(90.0f, edgeEffectA, recordingCanvasBeginRecording);
                    edgeEffectA.finish();
                }
                if (vy0.f(vy0Var.f)) {
                    EdgeEffect edgeEffectC2 = vy0Var.c();
                    zT0 = t0(270.0f, edgeEffectC2, recordingCanvasBeginRecording);
                    if (vy0.g(vy0Var.f)) {
                        z = z3;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (tbVar.c() & j));
                        EdgeEffect edgeEffectA2 = vy0Var.j;
                        if (edgeEffectA2 == null) {
                            edgeEffectA2 = vy0Var.a(hb3Var);
                            vy0Var.j = edgeEffectA2;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        float fB = i2 >= 31 ? qe.b(edgeEffectC2) : 0.0f;
                        float f2 = 1.0f - fIntBitsToFloat;
                        if (i2 >= 31) {
                            qe.d(edgeEffectA2, fB, f2);
                        } else {
                            edgeEffectA2.onPull(fB, f2);
                        }
                    } else {
                        z = z3;
                    }
                } else {
                    z = z3;
                    zT0 = false;
                }
                boolean zG2 = vy0.g(vy0Var.h);
                hb3 hb3Var2 = hb3.n;
                if (zG2) {
                    EdgeEffect edgeEffectA3 = vy0Var.h;
                    if (edgeEffectA3 == null) {
                        edgeEffectA3 = vy0Var.a(hb3Var2);
                        vy0Var.h = edgeEffectA3;
                    }
                    t0(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
                    edgeEffectA3.finish();
                }
                if (vy0.f(vy0Var.d)) {
                    EdgeEffect edgeEffectE2 = vy0Var.e();
                    zT0 = t0(0.0f, edgeEffectE2, recordingCanvasBeginRecording) || zT0;
                    if (vy0.g(vy0Var.d)) {
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tbVar.c() >> c));
                        EdgeEffect edgeEffectA4 = vy0Var.h;
                        if (edgeEffectA4 == null) {
                            edgeEffectA4 = vy0Var.a(hb3Var2);
                            vy0Var.h = edgeEffectA4;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        float fB2 = i3 >= 31 ? qe.b(edgeEffectE2) : 0.0f;
                        if (i3 >= 31) {
                            qe.d(edgeEffectA4, fB2, fIntBitsToFloat2);
                        } else {
                            edgeEffectA4.onPull(fB2, fIntBitsToFloat2);
                        }
                    }
                }
                if (vy0.g(vy0Var.k)) {
                    EdgeEffect edgeEffectA5 = vy0Var.k;
                    if (edgeEffectA5 == null) {
                        edgeEffectA5 = vy0Var.a(hb3Var);
                        vy0Var.k = edgeEffectA5;
                    }
                    t0(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
                    edgeEffectA5.finish();
                }
                if (vy0.f(vy0Var.g)) {
                    EdgeEffect edgeEffectD2 = vy0Var.d();
                    zT0 = t0(90.0f, edgeEffectD2, recordingCanvasBeginRecording) || zT0;
                    if (vy0.g(vy0Var.g)) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (tbVar.c() & j));
                        EdgeEffect edgeEffectA6 = vy0Var.k;
                        if (edgeEffectA6 == null) {
                            edgeEffectA6 = vy0Var.a(hb3Var);
                            vy0Var.k = edgeEffectA6;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float fB3 = i4 >= 31 ? qe.b(edgeEffectD2) : 0.0f;
                        if (i4 >= 31) {
                            qe.d(edgeEffectA6, fB3, fIntBitsToFloat3);
                        } else {
                            edgeEffectA6.onPull(fB3, fIntBitsToFloat3);
                        }
                    }
                }
                if (vy0.g(vy0Var.i)) {
                    EdgeEffect edgeEffectA7 = vy0Var.i;
                    if (edgeEffectA7 == null) {
                        edgeEffectA7 = vy0Var.a(hb3Var2);
                        vy0Var.i = edgeEffectA7;
                    }
                    t0(0.0f, edgeEffectA7, recordingCanvasBeginRecording);
                    edgeEffectA7.finish();
                }
                if (vy0.f(vy0Var.e)) {
                    EdgeEffect edgeEffectB2 = vy0Var.b();
                    boolean z4 = t0(180.0f, edgeEffectB2, recordingCanvasBeginRecording) || zT0;
                    if (vy0.g(vy0Var.e)) {
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (tbVar.c() >> c));
                        EdgeEffect edgeEffectA8 = vy0Var.i;
                        if (edgeEffectA8 == null) {
                            edgeEffectA8 = vy0Var.a(hb3Var2);
                            vy0Var.i = edgeEffectA8;
                        }
                        int i5 = Build.VERSION.SDK_INT;
                        float fB4 = i5 >= 31 ? qe.b(edgeEffectB2) : 0.0f;
                        float f3 = 1.0f - fIntBitsToFloat4;
                        if (i5 >= 31) {
                            qe.d(edgeEffectA8, fB4, f3);
                        } else {
                            edgeEffectA8.onPull(fB4, f3);
                        }
                    }
                    zT0 = z4;
                }
                if (zT0) {
                    tbVar.d();
                }
                float f4 = z ? 0.0f : fM2;
                float f5 = z2 ? 0.0f : fM2;
                r62 layoutDirection = e72Var.getLayoutDirection();
                aa aaVar = new aa();
                aaVar.a = recordingCanvasBeginRecording;
                long jP = mzVar2.P();
                oo0 oo0VarH = mzVar2.o.h();
                r62 r62VarI = mzVar2.o.i();
                jz jzVarG = mzVar2.o.g();
                long j2 = mzVar2.o.j();
                i61 i61Var = mzVar2.o;
                sj1 sj1Var = (sj1) i61Var.p;
                i61Var.r(e72Var);
                i61Var.s(layoutDirection);
                i61Var.q(aaVar);
                i61Var.t(jP);
                i61Var.p = null;
                aaVar.e();
                try {
                    ((zg5) mzVar2.o.o).C(f4, f5);
                    try {
                        e72Var.a();
                        float f6 = -f4;
                        float f7 = -f5;
                        ((zg5) mzVar2.o.o).C(f6, f7);
                        aaVar.k();
                        i61 i61Var2 = mzVar2.o;
                        i61Var2.r(oo0VarH);
                        i61Var2.s(r62VarI);
                        i61Var2.q(jzVarG);
                        i61Var2.t(j2);
                        i61Var2.p = sj1Var;
                        v0().endRecording();
                        int iSave = canvasA2.save();
                        canvasA2.translate(f6, f7);
                        canvasA2.drawRenderNode(v0());
                        canvasA2.restoreToCount(iSave);
                        return;
                    } catch (Throwable th) {
                        ((zg5) mzVar2.o.o).C(-f4, -f5);
                        throw th;
                    }
                } catch (Throwable th2) {
                    aaVar.k();
                    i61 i61Var3 = mzVar2.o;
                    i61Var3.r(oo0VarH);
                    i61Var3.s(r62VarI);
                    i61Var3.q(jzVarG);
                    i61Var3.t(j2);
                    i61Var3.p = sj1Var;
                    throw th2;
                }
        }
    }

    public RenderNode v0() {
        RenderNode renderNode = (RenderNode) this.G;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeF = ek2.f();
        this.G = renderNodeF;
        return renderNodeF;
    }

    public bj1(ip4 ip4Var, tb tbVar, vy0 vy0Var) {
        this.E = tbVar;
        this.F = vy0Var;
        q0(ip4Var);
    }
}
