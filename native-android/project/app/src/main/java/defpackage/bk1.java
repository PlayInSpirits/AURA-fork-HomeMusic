package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bk1 implements uj1 {
    public static final ak1 A = null;
    public final qv0 b;
    public final nz c;
    public final v65 d;
    public final Resources e;
    public final Rect f;
    public Paint g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public float p;
    public boolean q;
    public long r;
    public float s;
    public float t;
    public long u;
    public long v;
    public int w;
    public int x;
    public int y;
    public int z;

    static {
        A = new ak1();
    }

    public bk1(qv0 r4) {
        nz r0 = new nz();
        mz r1 = new mz();
        this.b = r4;
        this.c = r0;
        v65 r2 = new v65(r4, r0, r1);
        this.d = r2;
        this.e = r4.getResources();
        this.f = new Rect();
        r4.addView(r2);
        r2.setClipBounds(null);
        this.j = 0;
        View.generateViewId();
        this.n = 3;
        this.o = 0;
        this.p = 1.0f;
        this.r = 9205357640488583168L;
        this.s = 1.0f;
        this.t = 1.0f;
        long r3 = x40.b;
        this.u = r3;
        this.v = r3;
    }

    @Override // defpackage.uj1
    public final void A(float r1) {
        this.s = r1;
        this.d.setScaleX(r1);
    }

    @Override // defpackage.uj1
    public final float B() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
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
    public final void F(boolean r4) {
        boolean r0 = false;
        if (r4 == true) goto L5;
    L7:
        boolean r2 = false;
    L8:
        this.m = r2;
        this.k = true;
        if (r4 == true) goto L11;
    L13:
        this.d.setClipToOutline(r0);
        return;
    L11:
        if (this.l == false) goto L13;
        r0 = true;
        goto L13
    L5:
        if (this.l == true) goto L7;
        r2 = true;
        goto L8
    }

    @Override // defpackage.uj1
    public final float G() {
        return 0.0f;
    }

    @Override // defpackage.uj1
    public final void H(int r1) {
        this.o = r1;
        Q();
    }

    @Override // defpackage.uj1
    public final void I() {
        this.d.setRotation(0.0f);
    }

    @Override // defpackage.uj1
    public final void J(long r3) {
        if (Build.VERSION.SDK_INT < 28) goto L6;
        this.v = r3;
        vl4.h(this.d, e35.U(r3));
        return;
    }

    @Override // defpackage.uj1
    public final Matrix K() {
        return this.d.getMatrix();
    }

    @Override // defpackage.uj1
    public final void L(float r2) {
        this.d.setCameraDistance(r2 * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.uj1
    public final float M() {
        return 0.0f;
    }

    @Override // defpackage.uj1
    public final float N() {
        return this.t;
    }

    @Override // defpackage.uj1
    public final int O() {
        return this.n;
    }

    public final void P() {
        boolean r0 = this.m;
        v65 r1 = this.d;
        if (r0 == false) goto L5;
    L6:
        this.k = true;
    L7:
        int r2 = this.h;
        int r3 = r2 - this.w;
        int r4 = this.i;
        int r5 = r4 - this.x;
        long r6 = this.j;
        r1.layout(r3, r5, (r2 + ((int) (r6 >> 32))) + this.y, (r4 + ((int) (r6 & 4294967295L))) + this.z);
        return;
    L5:
        if (r1.getClipToOutline() == false) goto L7;
        goto L6
    }

    public final void Q() {
        int r0 = this.o;
        if (r0 != 1) goto L6;
    L9:
        a(1);
        return;
    L6:
        if (this.n != 3) goto L9;
        a(r0);
    }

    public final void R() {
        boolean r0 = this.q;
        v65 r4 = this.d;
        if (r0 == false) goto L5;
    L9:
        r4.setPivotX((((int) (this.j >> 32)) / 2.0f) + this.w);
        r4.setPivotY((((int) (this.j & 4294967295L)) / 2.0f) + this.x);
        return;
    L5:
        if (g83.b(this.r, 9205357640488583168L) == true) goto L9;
        r4.setPivotX(Float.intBitsToFloat((int) (this.r >> 32)) + this.w);
        r4.setPivotY(Float.intBitsToFloat((int) (this.r & 4294967295L)) + this.x);
    }

    public final void a(int r5) {
        v65 r1 = this.d;
        boolean r2 = true;
        if (r5 != 1) goto L5;
        r1.setLayerType(2, this.g);
    L9:
        r1.setCanUseCompositingLayer$ui_graphics(r2);
        return;
    L5:
        Paint r4 = this.g;
        if (r5 != 2) goto L8;
        r1.setLayerType(0, r4);
        r2 = false;
        goto L9
    L8:
        r1.setLayerType(0, r4);
        goto L9
    }

    @Override // defpackage.uj1
    public final float b() {
        return this.p;
    }

    @Override // defpackage.uj1
    public final float c() {
        return this.s;
    }

    @Override // defpackage.uj1
    public final void d(Outline r3, long r4) {
        v65 r5 = this.d;
        r5.r = r3;
        r5.invalidateOutline();
        boolean r0 = false;
        if (this.m == false) goto L5;
    L6:
        if (r3 == null) goto L10;
        r5.setClipToOutline(true);
        if (this.m == false) goto L10;
        this.m = false;
        this.k = true;
    L10:
        if (r3 == null) goto L12;
        r0 = true;
    L12:
        this.l = r0;
        return;
    L5:
        if (r5.getClipToOutline() == false) goto L10;
        goto L6
    }

    @Override // defpackage.uj1
    public final void e(int r3) {
        this.n = r3;
        Paint r0 = this.g;
        if (r0 != null) goto L5;
        r0 = new Paint();
        this.g = r0;
    L5:
        r0.setXfermode(new PorterDuffXfermode(q05.B(r3)));
        Q();
    }

    @Override // defpackage.uj1
    public final void f() {
        this.b.removeViewInLayout(this.d);
    }

    @Override // defpackage.uj1
    public final void g(jz r5) {
        boolean r0 = this.k;
        v65 r1 = this.d;
        if (r0 == true) goto L5;
    L13:
        Canvas r2 = ba.a;
        if (((aa) r5).a.isHardwareAccelerated() == false) goto L17;
        this.b.a(r5, r1, r1.getDrawingTime());
        return;
    L17:
        return;
    L5:
        if (this.m == true) goto L9;
        if (r1.getClipToOutline() == true) goto L9;
    L11:
        Rect r3 = null;
    L12:
        r1.setClipBounds(r3);
    L9:
        if (this.l == true) goto L11;
        r3 = this.f;
        r3.left = 0;
        r3.top = 0;
        r3.right = r1.getWidth();
        r3.bottom = r1.getHeight();
        goto L12
    }

    @Override // defpackage.uj1
    public final int h() {
        return this.o;
    }

    @Override // defpackage.uj1
    public final dt i() {
        return null;
    }

    @Override // defpackage.uj1
    public final void j(float r1) {
        this.t = r1;
        this.d.setScaleY(r1);
    }

    @Override // defpackage.uj1
    public final void k(int r3, int r4, long r5) {
        if (n02.a(this.j, r5) == true) goto L6;
        this.h = r3;
        this.i = r4;
        this.j = r5;
        P();
        return;
    L6:
        int r6 = this.h;
        v65 r7 = this.d;
        if (r6 == r3) goto L9;
        r7.offsetLeftAndRight(r3 - r6);
    L9:
        int r8 = this.i;
        if (r8 == r4) goto L12;
        r7.offsetTopAndBottom(r4 - r8);
    L12:
        this.h = r3;
        this.i = r4;
    }

    @Override // defpackage.uj1
    public final float l() {
        return 0.0f;
    }

    @Override // defpackage.uj1
    public final float n() {
        return 0.0f;
    }

    @Override // defpackage.uj1
    public final void o(long r3) {
        this.r = r3;
        if ((r3 & 9223372034707292159L) != 9205357640488583168L) goto L5;
        boolean r4 = true;
    L6:
        this.q = r4;
        R();
        return;
    L5:
        r4 = false;
        goto L6
    }

    @Override // defpackage.uj1
    public final long p() {
        return this.u;
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
    public final void q(oo0 r11, r62 r12, sj1 r13, ir0 r14) {
        v65 r0 = this.d;
        ViewParent r1 = r0.getParent();
        qv0 r2 = this.b;
        if (r1 != null) goto L5;
        r2.addView(r0);
    L5:
        float r3 = this.w;
        float r4 = this.x;
        long r5 = (Float.floatToRawIntBits(r3) << 32) | (Float.floatToRawIntBits(r4) & 4294967295L);
        float r6 = Float.intBitsToFloat((int) (r5 >> 32));
        float r7 = Float.intBitsToFloat((int) (r5 & 4294967295L));
        r0.t = r11;
        r0.u = r12;
        r0.v = r14;
        r0.w = r13;
        r0.x = r6;
        r0.y = r7;
        if (r0.isAttachedToWindow() == false) goto L13;
        r0.setVisibility(4);
        r0.setVisibility(0);
        nz r10 = this.c;     // Catch: ClassCastException -> L10
        ak1 r15 = A;     // Catch: ClassCastException -> L10
        aa r16 = r10.a;     // Catch: ClassCastException -> L10
        Canvas r17 = r16.a;     // Catch: ClassCastException -> L10
        r16.a = r15;     // Catch: ClassCastException -> L10
        r2.a(r16, r0, r0.getDrawingTime());     // Catch: ClassCastException -> L10
        r10.a.a = r17;     // Catch: ClassCastException -> L10
        return;
    L14:
        return;
    }

    @Override // defpackage.uj1
    public final void r() {
        this.d.setRotationX(0.0f);
    }

    @Override // defpackage.uj1
    public final void s(float r1) {
        this.p = r1;
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
        int r4 = this.w;
        if (r6 == r4) goto L14;
    L19:
        if (r6 == r4) goto L21;
    L22:
        r0 = true;
    L23:
        this.w = r6;
        this.x = r7;
        this.y = r8;
        this.z = r9;
        P();
        if (r0 == false) goto L28;
        R();
        return;
    L28:
        return;
    L21:
        if (r7 == this.x) goto L23;
    L14:
        if (r7 != this.x) goto L19;
        if (r8 != this.y) goto L19;
        if (r9 != this.z) goto L19;
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
        return this.v;
    }

    @Override // defpackage.uj1
    public final void y(long r3) {
        if (Build.VERSION.SDK_INT < 28) goto L6;
        this.u = r3;
        vl4.k(this.d, e35.U(r3));
        return;
    }

    @Override // defpackage.uj1
    public final void z() {
        Paint r0 = this.g;
        if (r0 != null) goto L5;
        r0 = new Paint();
        this.g = r0;
    L5:
        r0.setColorFilter(null);
        Q();
    }
}
