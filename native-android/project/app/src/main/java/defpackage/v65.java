package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v65 extends View {
    public static final t65 z = null;
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

    static {
        z = new t65(0);
    }

    public v65(qv0 r2, nz r3, mz r4) {
        super(r2.getContext());
        this.n = r2;
        this.o = r3;
        this.p = r4;
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
    public final void dispatchDraw(Canvas r19) {
        float r2 = this.x;
        mz r7 = this.p;
        nz r8 = this.o;
        if (r2 <= 0.0f) goto L5;
    L13:
        int r0 = r19.save();
        r19.translate(this.x, this.y);
        aa r3 = r8.a;
        Canvas r9 = r3.a;
        r3.a = r19;
        oo0 r10 = this.t;
        r62 r11 = this.u;
        float r12 = getWidth();
        float r13 = getHeight();
        long r14 = Float.floatToRawIntBits(r12);
        long r4 = (4294967295L & ((long) Float.floatToRawIntBits(r13))) | (r14 << 32);
        sj1 r6 = this.w;
        if1 r15 = this.v;
        oo0 r16 = r7.O().h();
        r62 r17 = r7.O().i();
        jz r18 = r7.O().g();
        long r1 = r7.O().j();
        sj1 r20 = (sj1) r7.O().p;
        i61 r5 = r7.O();
        r5.r(r10);
        r5.s(r11);
        r5.q(r3);
        r5.t(r4);
        r5.p = r6;
        r3.e();
        r15.invoke(r7);     // Catch: Throwable -> L18
        r3.k();
        i61 r21 = r7.O();
        r21.r(r16);
        r21.s(r17);
        r21.q(r18);
        r21.t(r1);
        r21.p = r20;
        r8.a.a = r9;
        r19.restoreToCount(r0);
    L16:
        this.q = false;
        return;
    L18:
        th = move-exception;
        r3.k();
        i61 r22 = r7.O();
        r22.r(r16);
        r22.s(r17);
        r22.q(r18);
        r22.t(r1);
        r22.p = r20;
        throw th;
    L5:
        if (this.y > 0.0f) goto L13;
        aa r23 = r8.a;
        Canvas r24 = r23.a;
        r23.a = r19;
        oo0 r25 = this.t;
        r62 r26 = this.u;
        float r110 = getWidth();
        float r111 = getHeight();
        long r112 = Float.floatToRawIntBits(r110);
        long r27 = (4294967295L & ((long) Float.floatToRawIntBits(r111))) | (r112 << 32);
        sj1 r28 = this.w;
        if1 r113 = this.v;
        oo0 r114 = r7.O().h();
        r62 r115 = r7.O().i();
        jz r116 = r7.O().g();
        long r117 = r7.O().j();
        sj1 r29 = (sj1) r7.O().p;
        i61 r30 = r7.O();
        r30.r(r25);
        r30.s(r26);
        r30.q(r23);
        r30.t(r27);
        r30.p = r28;
        r23.e();
        r113.invoke(r7);     // Catch: Throwable -> L10
        r23.k();
        i61 r31 = r7.O();
        r31.r(r114);
        r31.s(r115);
        r31.q(r116);
        r31.t(r117);
        r31.p = r29;
        r8.a.a = r24;
    L10:
        th = move-exception;
        r23.k();
        i61 r32 = r7.O();
        r32.r(r114);
        r32.s(r115);
        r32.q(r116);
        r32.t(r117);
        r32.p = r29;
        throw th;
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
        if (this.q == true) goto L6;
        this.q = true;
        super.invalidate();
        return;
    }

    @Override // android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean r2) {
        if (this.s == r2) goto L6;
        this.s = r2;
        invalidate();
        return;
    }

    public final void setInvalidated(boolean r1) {
        this.q = r1;
    }
}
