package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v65 extends View {
    public static final t65 z = new t65(0);
    public final qv0 n;
    public final nz o;
    public final mz p;
    public boolean q;
    public Outline r;
    public boolean s;
    public oo0 t;
    public r62 u;
    public if1 v;
    public sj1 w;
    public float x;
    public float y;

    public v65(qv0 qv0Var, nz nzVar, mz mzVar) {
        super(qv0Var.getContext());
        this.n = qv0Var;
        this.o = nzVar;
        this.p = mzVar;
        setOutlineProvider(z);
        this.s = true;
        this.t = gb.b;
        this.u = r62.n;
        uj1.a.getClass();
        this.v = k5.r;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f = this.x;
        mz mzVar = this.p;
        nz nzVar = this.o;
        if (f > 0.0f || this.y > 0.0f) {
            int iSave = canvas.save();
            canvas.translate(this.x, this.y);
            aa aaVar = nzVar.a;
            Canvas canvas2 = aaVar.a;
            aaVar.a = canvas;
            oo0 oo0Var = this.t;
            r62 r62Var = this.u;
            float width = getWidth();
            long jFloatToRawIntBits = (4294967295L & ((long) Float.floatToRawIntBits(getHeight()))) | (Float.floatToRawIntBits(width) << 32);
            sj1 sj1Var = this.w;
            if1 if1Var = this.v;
            oo0 oo0VarH = mzVar.O().h();
            r62 r62VarI = mzVar.O().i();
            jz jzVarG = mzVar.O().g();
            long j = mzVar.O().j();
            sj1 sj1Var2 = (sj1) mzVar.O().p;
            i61 i61VarO = mzVar.O();
            i61VarO.r(oo0Var);
            i61VarO.s(r62Var);
            i61VarO.q(aaVar);
            i61VarO.t(jFloatToRawIntBits);
            i61VarO.p = sj1Var;
            aaVar.e();
            try {
                if1Var.invoke(mzVar);
                aaVar.k();
                i61 i61VarO2 = mzVar.O();
                i61VarO2.r(oo0VarH);
                i61VarO2.s(r62VarI);
                i61VarO2.q(jzVarG);
                i61VarO2.t(j);
                i61VarO2.p = sj1Var2;
                nzVar.a.a = canvas2;
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                aaVar.k();
                i61 i61VarO3 = mzVar.O();
                i61VarO3.r(oo0VarH);
                i61VarO3.s(r62VarI);
                i61VarO3.q(jzVarG);
                i61VarO3.t(j);
                i61VarO3.p = sj1Var2;
                throw th;
            }
        } else {
            aa aaVar2 = nzVar.a;
            Canvas canvas3 = aaVar2.a;
            aaVar2.a = canvas;
            oo0 oo0Var2 = this.t;
            r62 r62Var2 = this.u;
            float width2 = getWidth();
            long jFloatToRawIntBits2 = (4294967295L & ((long) Float.floatToRawIntBits(getHeight()))) | (Float.floatToRawIntBits(width2) << 32);
            sj1 sj1Var3 = this.w;
            if1 if1Var2 = this.v;
            oo0 oo0VarH2 = mzVar.O().h();
            r62 r62VarI2 = mzVar.O().i();
            jz jzVarG2 = mzVar.O().g();
            long j2 = mzVar.O().j();
            sj1 sj1Var4 = (sj1) mzVar.O().p;
            i61 i61VarO4 = mzVar.O();
            i61VarO4.r(oo0Var2);
            i61VarO4.s(r62Var2);
            i61VarO4.q(aaVar2);
            i61VarO4.t(jFloatToRawIntBits2);
            i61VarO4.p = sj1Var3;
            aaVar2.e();
            try {
                if1Var2.invoke(mzVar);
                aaVar2.k();
                i61 i61VarO5 = mzVar.O();
                i61VarO5.r(oo0VarH2);
                i61VarO5.s(r62VarI2);
                i61VarO5.q(jzVarG2);
                i61VarO5.t(j2);
                i61VarO5.p = sj1Var4;
                nzVar.a.a = canvas3;
            } catch (Throwable th2) {
                aaVar2.k();
                i61 i61VarO6 = mzVar.O();
                i61VarO6.r(oo0VarH2);
                i61VarO6.s(r62VarI2);
                i61VarO6.q(jzVarG2);
                i61VarO6.t(j2);
                i61VarO6.p = sj1Var4;
                throw th2;
            }
        }
        this.q = false;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.s;
    }

    public final nz getCanvasHolder() {
        return this.o;
    }

    public final View getOwnerView() {
        return this.n;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.s;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.q) {
            return;
        }
        this.q = true;
        super.invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z2) {
        if (this.s != z2) {
            this.s = z2;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z2) {
        this.q = z2;
    }
}
