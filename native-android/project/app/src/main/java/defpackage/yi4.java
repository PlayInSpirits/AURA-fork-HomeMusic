package defpackage;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yi4 implements zi4 {
    public final float[] a;
    public float[] b;
    public float[] c;
    public float[] d;
    public double e;
    public double f;
    public double g;
    public final /* synthetic */ aj4 h;

    public yi4(aj4 r3) {
        this.h = r3;
        int r0 = r3.h;
        this.a = new float[r0];
        int r1 = r0 * r3.b;
        this.b = new float[r1];
        this.c = new float[r1];
        this.d = new float[r1];
    }

    @Override // defpackage.zi4
    public final void a(int r4, ByteBuffer r5) {
        FloatBuffer r0 = r5.asFloatBuffer();
        float[] r1 = this.b;
        aj4 r3 = this.h;
        r0.get(r1, r3.j * r3.b, r4 / 4);
        r5.position(r5.position() + r4);
    }

    @Override // defpackage.zi4
    public final void b(int r5, ByteBuffer r6) {
        FloatBuffer r0 = r6.asFloatBuffer();
        float[] r1 = this.c;
        int r4 = this.h.b;
        r0.put(r1, 0, r5 * r4);
        int r7 = (r5 * 4) * r4;
        r6.position(r7 + r6.position());
    }

    @Override // defpackage.zi4
    public final void c(int r13, long r14, long r16) {
        int r0 = 0;
    L3:
        aj4 r1 = this.h;
        int r2 = r1.b;
        if (r0 >= r2) goto L6;
        float[] r3 = this.c;
        int r4 = (r1.k * r2) + r0;
        float[] r5 = this.d;
        int r6 = (r13 * r2) + r0;
        float r7 = r5[r6];
        float r8 = r5[r6 + r2];
        long r9 = ((long) r1.n) * r14;
        int r10 = r1.m;
        long r11 = ((long) (r10 + 1)) * r16;
        long r12 = r11 - r9;
        long r15 = r11 - (((long) r10) * r16);
        r3[r4] = (((r15 - r12) * r8) + (r12 * r7)) / r15;
        r0 = r0 + 1;
        goto L3
    }

    @Override // defpackage.zi4
    public final void d(int r5, int r6) {
        int r0 = 0;
    L4:
        if (r0 >= (this.h.b * r6)) goto L6;
        this.b[r5 + r0] = 0.0f;
        r0 = r0 + 1;
        goto L4
    }

    @Override // defpackage.zi4
    public final void e(int r9, int r10) {
        aj4 r0 = this.h;
        int r1 = r0.h / r10;
        int r2 = r0.b;
        int r11 = r10 * r2;
        int r12 = r9 * r2;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L8;
        double r4 = 0.0d;
        int r5 = 0;
    L5:
        if (r5 >= r11) goto L7;
        r4 = r4 + ((double) this.b[((r3 * r11) + r12) + r5]);
        r5 = r5 + 1;
        goto L5
    L7:
        this.a[r3] = (float) (r4 / ((double) r11));
        r3 = r3 + 1;
        goto L3
    }

    @Override // defpackage.zi4
    public final int f(int r2, int r3, int r4) {
        return s(r2, r3, r4, this.b);
    }

    @Override // defpackage.zi4
    public final void flush() {
        this.g = 0.0d;
        this.e = 0.0d;
        this.f = 0.0d;
    }

    @Override // defpackage.zi4
    public final void g() {
        this.g = this.e;
    }

    @Override // defpackage.zi4
    public final Object h() {
        return this.b;
    }

    @Override // defpackage.zi4
    public final Object i() {
        return this.c;
    }

    @Override // defpackage.zi4
    public final void j(int r3) {
        this.c = r(this.c, this.h.k, r3);
    }

    @Override // defpackage.zi4
    public final boolean k() {
        double r0 = this.e;
        if (r0 != 0.0d) goto L5;
        return false;
    L5:
        if (this.h.p != 0) goto L8;
        return false;
    L8:
        if (this.f <= (r0 * 3.0d)) goto L11;
        return false;
    L11:
        if ((r0 * 2.0d) <= (this.g * 3.0d)) goto L19;
        return true;
    L19:
        return false;
    }

    @Override // defpackage.zi4
    public final Object l() {
        return this.d;
    }

    @Override // defpackage.zi4
    public final void m(int r11, int r12, int r13, int r14, int r15) {
        float[] r0 = this.c;
        float[] r10 = this.b;
        int r2 = 0;
    L3:
        if (r2 >= r12) goto L8;
        int r3 = (r13 * r12) + r2;
        int r4 = (r15 * r12) + r2;
        int r5 = (r14 * r12) + r2;
        int r6 = 0;
    L5:
        if (r6 >= r11) goto L7;
        r0[r3] = ((r10[r4] * r6) + (r10[r5] * (r11 - r6))) / r11;
        r3 = r3 + r12;
        r5 = r5 + r12;
        r4 = r4 + r12;
        r6 = r6 + 1;
        goto L5
    L7:
        r2 = r2 + 1;
        goto L3
    }

    @Override // defpackage.zi4
    public final void n(int r3) {
        this.d = r(this.d, this.h.l, r3);
    }

    @Override // defpackage.zi4
    public final int o() {
        return 4;
    }

    @Override // defpackage.zi4
    public final void p(int r3) {
        this.b = r(this.b, this.h.j, r3);
    }

    @Override // defpackage.zi4
    public final int q(int r3, int r4) {
        return s(0, r3, r4, this.a);
    }

    public final float[] r(float[] r2, int r3, int r4) {
        int r0 = r2.length;
        int r1 = this.h.b;
        int r5 = r0 / r1;
        if ((r3 + r4) > r5) goto L6;
        return r2;
    L6:
        return Arrays.copyOf(r2, (((r5 * 3) / 2) + r4) * r1);
    }

    public final int s(int r21, int r22, int r23, float[] r24) {
        int r1 = this.h.b * r21;
        double r8 = 1.0d;
        int r10 = 0;
        double r11 = 0.0d;
        int r4 = 255;
        int r3 = r22;
    L3:
        if (r3 > r23) goto L14;
        int r13 = 0;
        double r14 = 0.0d;
    L5:
        if (r13 >= r3) goto L7;
        r14 = r14 + ((double) Math.abs(r24[r1 + r13] - r24[(r1 + r3) + r13]));
        r13 = r13 + 1;
        goto L5
    L7:
        int r15 = r1;
        double r2 = r3;
        if ((((double) r10) * r14) >= (r8 * r2)) goto L11;
        r10 = r3;
        r8 = r14;
    L11:
        if ((((double) r4) * r14) <= (r2 * r11)) goto L13;
        r4 = r3;
        r11 = r14;
    L13:
        r3 = r3 + 1;
        r1 = r15;
        goto L3
    L14:
        this.e = r8 / ((double) r10);
        this.f = r11 / ((double) r4);
        return r10;
    }
}
