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
        nz r0 = new nz();
        mz r1 = new mz();
        this.b = r0;
        this.c = r1;
        RenderNode r2 = kz.c();
        this.d = r2;
        this.e = 0;
        kz.w(r2);
        P(r2, 0);
        this.i = 1.0f;
        this.j = 3;
        this.k = 9205357640488583168L;
        this.l = 1.0f;
        this.m = 1.0f;
        long r3 = x40.b;
        this.n = r3;
        this.o = r3;
        this.p = 8.0f;
        this.z = 0;
    }

    @Override // defpackage.uj1
    public final void A(float r1) {
        this.l = r1;
        yj1.s(this.d, r1);
    }

    @Override // defpackage.uj1
    public final float B() {
        return this.p;
    }

    @Override // defpackage.uj1
    public final void C() {
        kz.A(this.d);
    }

    @Override // defpackage.uj1
    public final float D() {
        return 0.0f;
    }

    @Override // defpackage.uj1
    public final void E() {
        kz.D(this.d);
    }

    @Override // defpackage.uj1
    public final void F(boolean r1) {
        this.q = r1;
        a();
    }

    @Override // defpackage.uj1
    public final float G() {
        return 0.0f;
    }

    @Override // defpackage.uj1
    public final void H(int r1) {
        this.z = r1;
        Q();
    }

    @Override // defpackage.uj1
    public final void I() {
        yj1.r(this.d);
    }

    @Override // defpackage.uj1
    public final void J(long r1) {
        this.o = r1;
        yj1.i(this.d, e35.U(r1));
    }

    @Override // defpackage.uj1
    public final Matrix K() {
        Matrix r0 = this.g;
        if (r0 != null) goto L5;
        r0 = new Matrix();
        this.g = r0;
    L5:
        yj1.k(this.d, r0);
        return r0;
    }

    @Override // defpackage.uj1
    public final void L(float r1) {
        this.p = r1;
        yj1.x(this.d, r1);
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

    public final void P(RenderNode r2, int r3) {
        Paint r1 = this.f;
        if (r3 != 1) goto L7;
        yj1.m(r2, r1);
        yj1.y(r2);
        return;
    L7:
        if (r3 != 2) goto L10;
        yj1.t(r2, r1);
        yj1.A(r2);
        return;
    L10:
        yj1.t(r2, r1);
        yj1.y(r2);
    }

    public final void Q() {
        int r0 = this.z;
        if (r0 != 1) goto L6;
    L9:
        P(this.d, 1);
        return;
    L6:
        if (this.j != 3) goto L9;
        P(this.d, r0);
    }

    public final void R() {
        long r0 = this.k;
        long r2 = 9223372034707292159L & r0;
        RenderNode r3 = this.d;
        if (r2 != 9205357640488583168L) goto L6;
        yj1.z(r3, (Float.intBitsToFloat((int) (this.e >> 32)) / 2.0f) + this.r);
        yj1.B(this.d, (Float.intBitsToFloat((int) (this.e & 4294967295L)) / 2.0f) + this.s);
        return;
    L6:
        yj1.z(r3, Float.intBitsToFloat((int) (r0 >> 32)) + this.r);
        yj1.B(this.d, Float.intBitsToFloat((int) (this.k & 4294967295L)) + this.s);
    }

    public final void S() {
        RenderNode r0 = this.d;
        int r1 = this.x;
        yj1.j(r0, r1 - this.r, this.y - this.s, (r1 + ((int) Float.intBitsToFloat((int) (this.e >> 32)))) + this.t, (this.y + ((int) Float.intBitsToFloat((int) (this.e & 4294967295L)))) + this.u);
    }

    public final void a() {
        boolean r0 = this.q;
        boolean r1 = false;
        if (r0 == true) goto L5;
    L7:
        boolean r3 = false;
    L8:
        if (r0 == false) goto L13;
        if (this.h == false) goto L13;
        r1 = true;
    L13:
        if (r3 == this.v) goto L16;
        this.v = r3;
        yj1.n(this.d, r3);
    L16:
        if (r1 == this.w) goto L19;
        this.w = r1;
        yj1.u(this.d, r1);
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
        return this.i;
    }

    @Override // defpackage.uj1
    public final float c() {
        return this.l;
    }

    @Override // defpackage.uj1
    public final void d(Outline r1, long r2) {
        yj1.l(this.d, r1);
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
    public final void e(int r2) {
        this.j = r2;
        Paint r0 = this.f;
        if (r0 != null) goto L5;
        r0 = new Paint();
        this.f = r0;
    L5:
        yj1.f(r0, q05.A(r2));
        Q();
    }

    @Override // defpackage.uj1
    public final void f() {
        kz.m(this.d);
    }

    @Override // defpackage.uj1
    public final void g(jz r2) {
        Canvas r0 = ba.a;
        kz.v(((aa) r2).a, this.d);
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
    public final void j(float r1) {
        this.m = r1;
        kz.n(this.d, r1);
    }

    @Override // defpackage.uj1
    public final void k(int r4, int r5, long r6) {
        this.x = r4;
        this.y = r5;
        boolean r7 = qf4.a(this.e, l93.o0(r6));
        this.e = l93.o0(r6);
        S();
        if (r7 == false) goto L5;
        return;
    L5:
        if (g83.b(this.k, 9205357640488583168L) == false) goto L9;
        yj1.z(this.d, (((int) (r6 >> 32)) / 2.0f) + this.r);
        yj1.B(this.d, (((int) (r6 & 4294967295L)) / 2.0f) + this.s);
        return;
    }

    @Override // defpackage.uj1
    public final float l() {
        return 0.0f;
    }

    @Override // defpackage.uj1
    public final boolean m() {
        return yj1.p(this.d);
    }

    @Override // defpackage.uj1
    public final float n() {
        return 0.0f;
    }

    @Override // defpackage.uj1
    public final void o(long r1) {
        this.k = r1;
        R();
    }

    @Override // defpackage.uj1
    public final long p() {
        return this.n;
    }

    @Override // defpackage.uj1
    public final void q(oo0 r11, r62 r12, sj1 r13, ir0 r14) {
        mz r0 = this.c;
        RecordingCanvas r1 = yj1.b(this.d);
        float r2 = this.r;
        float r3 = this.s;
        long r4 = Float.floatToRawIntBits(r2);
        long r5 = (((long) Float.floatToRawIntBits(r3)) & 4294967295L) | (r4 << 32);
        nz r6 = this.b;     // Catch: Throwable -> L9
        aa r7 = r6.a;     // Catch: Throwable -> L9
        Canvas r9 = r7.a;     // Catch: Throwable -> L9
        r7.a = r1;     // Catch: Throwable -> L9
        i61 r8 = r0.o;     // Catch: Throwable -> L9
        r8.r(r11);     // Catch: Throwable -> L9
        r8.s(r12);     // Catch: Throwable -> L9
        r8.p = r13;     // Catch: Throwable -> L9
        r8.t(this.e);     // Catch: Throwable -> L9
        r8.q(r7);     // Catch: Throwable -> L9
        if (this.r <= 0.0f) goto L6;
    L11:
        int r15 = (int) (r5 >> 32);     // Catch: Throwable -> L9
        int r16 = (int) (r5 & 4294967295L);     // Catch: Throwable -> L9
        r7.j(Float.intBitsToFloat(r15), Float.intBitsToFloat(r16));     // Catch: Throwable -> L9
        r14.invoke(r0);     // Catch: Throwable -> L9
        r7.j(-Float.intBitsToFloat(r15), -Float.intBitsToFloat(r16));     // Catch: Throwable -> L9
    L12:
        r6.a.a = r9;     // Catch: Throwable -> L9
        yj1.D(this.d);
        return;
    L6:
        if (this.s > 0.0f) goto L11;
        r14.invoke(r0);     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        yj1.D(this.d);
        throw th;
    }

    @Override // defpackage.uj1
    public final void r() {
        yj1.C(this.d);
    }

    @Override // defpackage.uj1
    public final void s(float r1) {
        this.i = r1;
        yj1.h(this.d, r1);
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
        int r4 = this.r;
        if (r6 == r4) goto L14;
    L19:
        if (r6 == r4) goto L21;
    L22:
        r0 = true;
    L23:
        this.r = r6;
        this.s = r7;
        this.t = r8;
        this.u = r9;
        S();
        if (r0 == false) goto L28;
        R();
        return;
    L28:
        return;
    L21:
        if (r7 == this.s) goto L23;
    L14:
        if (r7 != this.s) goto L19;
        if (r8 != this.t) goto L19;
        if (r9 != this.u) goto L19;
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
        yj1.w(this.d);
    }

    @Override // defpackage.uj1
    public final void w() {
        yj1.g(this.d);
    }

    @Override // defpackage.uj1
    public final long x() {
        return this.o;
    }

    @Override // defpackage.uj1
    public final void y(long r1) {
        this.n = r1;
        kz.o(this.d, e35.U(r1));
    }

    @Override // defpackage.uj1
    public final void z() {
        Paint r0 = this.f;
        if (r0 != null) goto L5;
        r0 = new Paint();
        this.f = r0;
    L5:
        r0.setColorFilter(null);
        Q();
    }
}
