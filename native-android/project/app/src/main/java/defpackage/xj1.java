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
    public static final AtomicBoolean C = null;
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

    static {
        C = new AtomicBoolean(true);
    }

    public xj1(ra r2, nz r3, mz r4) {
        this.b = r3;
        this.c = r4;
        RenderNode r5 = RenderNode.create("Compose", r2);
        this.d = r5;
        this.e = 0;
        this.i = 0;
        if (C.getAndSet(false) == false) goto L8;
        r5.setScaleX(r5.getScaleX());
        r5.setScaleY(r5.getScaleY());
        r5.setTranslationX(r5.getTranslationX());
        r5.setTranslationY(r5.getTranslationY());
        r5.setElevation(r5.getElevation());
        r5.setRotation(r5.getRotation());
        r5.setRotationX(r5.getRotationX());
        r5.setRotationY(r5.getRotationY());
        r5.setCameraDistance(r5.getCameraDistance());
        r5.setPivotX(r5.getPivotX());
        r5.setPivotY(r5.getPivotY());
        r5.setClipToOutline(r5.getClipToOutline());
        r5.setClipToBounds(false);
        r5.setAlpha(r5.getAlpha());
        r5.isValid();
        r5.setLeftTopRightBottom(0, 0, 0, 0);
        r5.offsetLeftAndRight(0);
        r5.offsetTopAndBottom(0);
        if (Build.VERSION.SDK_INT < 28) goto L7;
        cz3.c(r5, cz3.a(r5));
        cz3.d(r5, cz3.b(r5));
    L7:
        bz3.a(r5);
        r5.setLayerType(0);
        r5.setHasOverlappingRendering(r5.hasOverlappingRendering());
    L8:
        r5.setClipToBounds(false);
        P(0);
        this.j = 0;
        this.k = 3;
        this.l = 1.0f;
        this.n = 9205357640488583168L;
        this.o = 1.0f;
        this.p = 1.0f;
        long r6 = x40.b;
        this.q = r6;
        this.r = r6;
        this.s = 8.0f;
    }

    @Override // defpackage.uj1
    public final void A(float r1) {
        this.o = r1;
        this.d.setScaleX(r1);
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
    public final void F(boolean r1) {
        this.t = r1;
        a();
    }

    @Override // defpackage.uj1
    public final float G() {
        return 0.0f;
    }

    @Override // defpackage.uj1
    public final void H(int r1) {
        this.j = r1;
        Q();
    }

    @Override // defpackage.uj1
    public final void I() {
        this.d.setRotation(0.0f);
    }

    @Override // defpackage.uj1
    public final void J(long r3) {
        if (Build.VERSION.SDK_INT < 28) goto L6;
        this.r = r3;
        cz3.d(this.d, e35.U(r3));
        return;
    }

    @Override // defpackage.uj1
    public final Matrix K() {
        Matrix r0 = this.g;
        if (r0 != null) goto L5;
        r0 = new Matrix();
        this.g = r0;
    L5:
        this.d.getMatrix(r0);
        return r0;
    }

    @Override // defpackage.uj1
    public final void L(float r1) {
        this.s = r1;
        this.d.setCameraDistance(-r1);
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

    public final void P(int r5) {
        RenderNode r0 = this.d;
        if (r5 != 1) goto L7;
        r0.setLayerType(2);
        r0.setLayerPaint(this.f);
        r0.setHasOverlappingRendering(true);
        return;
    L7:
        if (r5 != 2) goto L10;
        r0.setLayerType(0);
        r0.setLayerPaint(this.f);
        r0.setHasOverlappingRendering(false);
        return;
    L10:
        r0.setLayerType(0);
        r0.setLayerPaint(this.f);
        r0.setHasOverlappingRendering(true);
    }

    public final void Q() {
        int r0 = this.j;
        if (r0 != 1) goto L6;
    L9:
        P(1);
        return;
    L6:
        if (this.k != 3) goto L9;
        P(r0);
    }

    public final void R() {
        long r0 = this.n;
        if ((9223372034707292159L & r0) != 9205357640488583168L) goto L6;
        this.m = true;
        this.d.setPivotX((((int) (this.e >> 32)) / 2.0f) + this.u);
        this.d.setPivotY((((int) (4294967295L & this.e)) / 2.0f) + this.v);
        return;
    L6:
        this.m = false;
        this.d.setPivotX(Float.intBitsToFloat((int) (r0 >> 32)) + this.u);
        this.d.setPivotY(Float.intBitsToFloat((int) (this.n & 4294967295L)) + this.v);
    }

    public final void S() {
        RenderNode r0 = this.d;
        int r1 = this.A;
        int r2 = r1 - this.u;
        int r3 = this.B;
        int r4 = r3 - this.v;
        long r5 = this.e;
        r0.setLeftTopRightBottom(r2, r4, (r1 + ((int) (r5 >> 32))) + this.w, (r3 + ((int) (r5 & 4294967295L))) + this.x);
    }

    public final void a() {
        boolean r0 = this.t;
        boolean r1 = false;
        if (r0 == true) goto L5;
    L7:
        boolean r3 = false;
    L8:
        if (r0 == false) goto L13;
        if (this.h == false) goto L13;
        r1 = true;
    L13:
        if (r3 == this.y) goto L16;
        this.y = r3;
        this.d.setClipToBounds(r3);
    L16:
        if (r1 == this.z) goto L19;
        this.z = r1;
        this.d.setClipToOutline(r1);
        return;
    L19:
        return;
    L5:
        if (this.h == true) goto L7;
        r3 = true;
        goto L8
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
    public final void d(Outline r1, long r2) {
        this.i = r2;
        this.d.setOutline(r1);
        if (r1 == null) goto L5;
        boolean r3 = true;
    L6:
        this.h = r3;
        a();
        return;
    L5:
        r3 = false;
        goto L6
    }

    @Override // defpackage.uj1
    public final void e(int r3) {
        if (this.k != r3) goto L5;
        return;
    L5:
        this.k = r3;
        Paint r0 = this.f;
        if (r0 != null) goto L8;
        r0 = new Paint();
        this.f = r0;
    L8:
        r0.setXfermode(new PorterDuffXfermode(q05.B(r3)));
        Q();
    }

    @Override // defpackage.uj1
    public final void f() {
        bz3.a(this.d);
    }

    @Override // defpackage.uj1
    public final void g(jz r2) {
        Canvas r0 = ba.a;
        DisplayListCanvas r3 = ((aa) r2).a;
        r3.getClass();
        r3.drawRenderNode(this.d);
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
    public final void j(float r1) {
        this.p = r1;
        this.d.setScaleY(r1);
    }

    @Override // defpackage.uj1
    public final void k(int r4, int r5, long r6) {
        this.A = r4;
        this.B = r5;
        boolean r7 = n02.a(this.e, r6);
        this.e = r6;
        S();
        if (r7 == false) goto L5;
        return;
    L5:
        if (this.m == false) goto L7;
    L8:
        this.d.setPivotX((((int) (r6 >> 32)) / 2.0f) + this.u);
        this.d.setPivotY((((int) (r6 & 4294967295L)) / 2.0f) + this.v);
        return;
    L7:
        if (g83.b(this.n, 9205357640488583168L) == true) goto L8;
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
    public final void o(long r1) {
        this.n = r1;
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
    public final void q(oo0 r21, r62 r22, sj1 r23, ir0 r24) {
        mz r5 = this.c;
        i61 r6 = r5.o;
        DisplayListCanvas r7 = this.d.start(Math.max((((int) (this.e >> 32)) + this.u) + this.w, (int) (this.i >> 32)), Math.max((((int) (this.e & 4294967295L)) + this.v) + this.x, (int) (this.i & 4294967295L)));
        float r8 = this.u;
        float r9 = this.v;
        long r11 = Float.floatToRawIntBits(r8);
        long r10 = (((long) Float.floatToRawIntBits(r9)) & 4294967295L) | (r11 << 32);
        aa r12 = this.b.a;     // Catch: Throwable -> L35
        Canvas r15 = r12.a;     // Catch: Throwable -> L35
        r12.a = (Canvas) r7;     // Catch: Throwable -> L35
        if (this.u > 0.0f) goto L23;
    L20:
        th = th;
        r7 = r7;
    L16:
        DisplayListCanvas r2 = r7;
    L37:
        this.d.end(r2);
        throw th;
    L7:
        if (this.v > 0.0f) goto L23;
        long r13 = l93.o0(this.e);     // Catch: Throwable -> L20
        oo0 r14 = r6.h();     // Catch: Throwable -> L20
        r62 r16 = r6.i();     // Catch: Throwable -> L20
        jz r17 = r6.g();     // Catch: Throwable -> L20
        r15 = r15;
        long r18 = r6.j();     // Catch: Throwable -> L20
        r7 = r7;
        sj1 r19 = (sj1) r6.p;     // Catch: Throwable -> L15
        r6.r(r21);     // Catch: Throwable -> L15
        r6.s(r22);     // Catch: Throwable -> L15
        r6.q(r12);     // Catch: Throwable -> L15
        r6.t(r13);     // Catch: Throwable -> L15
        r6.p = r23;     // Catch: Throwable -> L15
        r12.e();     // Catch: Throwable -> L15
        r24.invoke(r5);     // Catch: Throwable -> L17
        r12.k();     // Catch: Throwable -> L15
        r6.r(r14);     // Catch: Throwable -> L15
        r6.s(r16);     // Catch: Throwable -> L15
        r6.q(r17);     // Catch: Throwable -> L15
        r6.t(r18);     // Catch: Throwable -> L15
        r6.p = r19;     // Catch: Throwable -> L15
    L26:
        r12.a = r15;     // Catch: Throwable -> L15
        this.d.end(r7);
        return;
    L17:
        th = move-exception;
        r12.k();     // Catch: Throwable -> L15
        r6.r(r14);     // Catch: Throwable -> L15
        r6.s(r16);     // Catch: Throwable -> L15
        r6.q(r17);     // Catch: Throwable -> L15
        r6.t(r18);     // Catch: Throwable -> L15
        r6.p = r19;     // Catch: Throwable -> L15
        throw th;     // Catch: Throwable -> L15
    L23:
        int r20 = (int) (r10 >> 32);     // Catch: Throwable -> L15
        int r25 = (int) (r10 & 4294967295L);     // Catch: Throwable -> L15
        r12.j(Float.intBitsToFloat(r20), Float.intBitsToFloat(r25));     // Catch: Throwable -> L15
        long r26 = l93.o0(this.e);     // Catch: Throwable -> L15
        oo0 r110 = r6.h();     // Catch: Throwable -> L15
        r62 r111 = r6.i();     // Catch: Throwable -> L15
        jz r112 = r6.g();     // Catch: Throwable -> L15
        long r27 = r6.j();     // Catch: Throwable -> L15
        sj1 r113 = (sj1) r6.p;     // Catch: Throwable -> L15
        r6.r(r21);     // Catch: Throwable -> L15
        r6.s(r22);     // Catch: Throwable -> L15
        r6.q(r12);     // Catch: Throwable -> L15
        r6.t(r26);     // Catch: Throwable -> L15
        r6.p = r23;     // Catch: Throwable -> L15
        r12.e();     // Catch: Throwable -> L15
        r24.invoke(r5);     // Catch: Throwable -> L29
        r12.k();     // Catch: Throwable -> L15
        r6.r(r110);     // Catch: Throwable -> L15
        r6.s(r111);     // Catch: Throwable -> L15
        r6.q(r112);     // Catch: Throwable -> L15
        r6.t(r27);     // Catch: Throwable -> L15
        r6.p = r113;     // Catch: Throwable -> L15
        r12.j(-Float.intBitsToFloat(r20), -Float.intBitsToFloat(r25));     // Catch: Throwable -> L15
    L29:
        th = move-exception;
        r2 = r7;
        r12.k();     // Catch: Throwable -> L33
        r6.r(r110);     // Catch: Throwable -> L33
        r6.s(r111);     // Catch: Throwable -> L33
        r6.q(r112);     // Catch: Throwable -> L33
        r6.t(r27);     // Catch: Throwable -> L33
        r6.p = r113;     // Catch: Throwable -> L33
        throw th;     // Catch: Throwable -> L33
    L33:
        th = th;
    L15:
        th = th;
    L35:
        th = th;
        r2 = r7;
        goto L37
    }

    @Override // defpackage.uj1
    public final void r() {
        this.d.setRotationX(0.0f);
    }

    @Override // defpackage.uj1
    public final void s(float r1) {
        this.l = r1;
        this.d.setAlpha(r1);
    }

    @Override // defpackage.uj1
    public final void t(int r6, int r7, int r8, int r9) {
        boolean r0 = false;
        if (r6 < 0) goto L8;
        if (r7 < 0) goto L8;
        if (r8 < 0) goto L8;
        if (r9 < 0) goto L8;
        boolean r2 = true;
    L9:
        if (r2 == true) goto L11;
        StringBuilder r3 = b11.t("Outsets cannot be negative! Left: ", ", Top: ", r6, r7, ", Right: ");
        r3.append(r8);
        r3.append(", Bottom: ");
        r3.append(r9);
        bz1.a(r3.toString());
    L11:
        int r4 = this.u;
        if (r6 == r4) goto L14;
    L19:
        if (r6 == r4) goto L21;
    L22:
        r0 = true;
    L23:
        this.u = r6;
        this.v = r7;
        this.w = r8;
        this.x = r9;
        S();
        if (r0 == false) goto L28;
        R();
        return;
    L28:
        return;
    L21:
        if (r7 == this.v) goto L23;
    L14:
        if (r7 != this.v) goto L19;
        if (r8 != this.w) goto L19;
        if (r9 != this.x) goto L19;
        return;
    L8:
        r2 = false;
        goto L9
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
    public final void y(long r3) {
        if (Build.VERSION.SDK_INT < 28) goto L6;
        this.q = r3;
        cz3.c(this.d, e35.U(r3));
        return;
    }

    @Override // defpackage.uj1
    public final void z() {
        Q();
    }
}
