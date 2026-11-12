package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fq3 extends pi {
    public ai4[] f;
    public ai4[] g;
    public int h;
    public gp3 i;

    @Override // defpackage.pi
    public final ai4 d(boolean[] r10) {
        int r1 = 0;
        int r2 = -1;
    L4:
        if (r1 >= this.h) goto L27;
        ai4[] r3 = this.f;
        ai4 r4 = r3[r1];
        if (r10[r4.o] == true) goto L26;
        gp3 r5 = this.i;
        r5.o = r4;
        int r6 = 8;
        if (r2 != (-1)) goto L18;
    L10:
        if (r6 < 0) goto L26;
        float r7 = ((ai4) r5.o).u[r6];
        if (r7 > 0.0f) goto L26;
        if (r7 < 0.0f) goto L25;
        r6 = r6 - 1;
    L25:
        r2 = r1;
        goto L26
    L18:
        ai4 r8 = r3[r2];
    L19:
        if (r6 < 0) goto L26;
        float r9 = r8.u[r6];
        float r11 = ((ai4) r5.o).u[r6];
        if (r11 != r9) goto L24;
        r6 = r6 - 1;
        goto L19
    L24:
        if (r11 < r9) goto L25;
    L26:
        r1 = r1 + 1;
        goto L4
    L27:
        if (r2 != (-1)) goto L31;
        return null;
    L31:
        return this.f[r2];
    }

    @Override // defpackage.pi
    public final boolean e() {
        if (this.h != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.pi
    public final void i(eb2 r19, pi r20, boolean r21) {
        ai4 r2 = r20.a;
        if (r2 != null) goto L5;
        return;
    L5:
        float[] r3 = r2.u;
        ji r4 = r20.d;
        int r5 = r4.d();
        int r7 = 0;
    L6:
        if (r7 >= r5) goto L30;
        ai4 r8 = r4.e(r7);
        float r9 = r4.f(r7);
        gp3 r10 = this.i;
        r10.o = r8;
        if (r8.n == false) goto L18;
        boolean r11 = true;
        int r12 = 0;
    L10:
        if (r12 >= 9) goto L16;
        float[] r15 = ((ai4) r10.o).u;
        float r17 = (r3[r12] * r9) + r15[r12];
        r15[r12] = r17;
        if (Math.abs(r17) >= 1.0E-4f) goto L14;
        ((ai4) r10.o).u[r12] = 0.0f;
    L15:
        r12 = r12 + 1;
        goto L10
    L14:
        r11 = false;
        goto L15
    L16:
        if (r11 == false) goto L29;
        ((fq3) r10.p).k((ai4) r10.o);
    L29:
        this.b = (r20.b * r9) + this.b;
        r7 = r7 + 1;
        goto L6
    L18:
        int r13 = 0;
    L19:
        if (r13 >= 9) goto L28;
        float r16 = r3[r13];
        if (r16 == 0.0f) goto L26;
        float r18 = r16 * r9;
        if (Math.abs(r18) >= 1.0E-4f) goto L25;
        r18 = 0.0f;
    L25:
        ((ai4) r10.o).u[r13] = r18;
    L27:
        r13 = r13 + 1;
        goto L19
    L26:
        ((ai4) r10.o).u[r13] = 0.0f;
        goto L27
    L28:
        j(r8);
        goto L29
    L30:
        k(r2);
    }

    public final void j(ai4 r7) {
        int r0 = this.h + 1;
        ai4[] r2 = this.f;
        if (r0 <= r2.length) goto L5;
        ai4[] r1 = (ai4[]) Arrays.copyOf(r2, r2.length * 2);
        this.f = r1;
        this.g = (ai4[]) Arrays.copyOf(r1, r1.length * 2);
    L5:
        ai4[] r3 = this.f;
        int r4 = this.h;
        r3[r4] = r7;
        int r5 = r4 + 1;
        this.h = r5;
        if (r5 > 1) goto L8;
    L17:
        r7.n = true;
        r7.a(this);
        return;
    L8:
        if (r3[r4].o <= r7.o) goto L17;
        int r6 = 0;
        int r8 = 0;
    L10:
        int r9 = this.h;
        ai4[] r10 = this.g;
        if (r8 >= r9) goto L13;
        r10[r8] = this.f[r8];
        r8 = r8 + 1;
        goto L10
    L13:
        Arrays.sort(r10, 0, r9, new jb2(3));
    L15:
        if (r6 >= this.h) goto L17;
        this.f[r6] = this.g[r6];
        r6 = r6 + 1;
        goto L15
    }

    public final void k(ai4 r6) {
        int r1 = 0;
    L4:
        if (r1 >= this.h) goto L13;
        if (this.f[r1] == r6) goto L7;
        r1 = r1 + 1;
    L7:
        int r2 = this.h;
        if (r1 >= (r2 - 1)) goto L10;
        ai4[] r3 = this.f;
        int r4 = r1 + 1;
        r3[r1] = r3[r4];
        r1 = r4;
        goto L7
    L10:
        this.h = r2 - 1;
        r6.n = false;
        return;
    }

    @Override // defpackage.pi
    public final String toString() {
        gp3 r0 = this.i;
        String r1 = " goal -> (" + this.b + ") : ";
        int r2 = 0;
    L4:
        if (r2 >= this.h) goto L6;
        r0.o = this.f[r2];
        r1 = r1 + r0 + " ";
        r2 = r2 + 1;
        goto L4
    L6:
        return r1;
    }
}
