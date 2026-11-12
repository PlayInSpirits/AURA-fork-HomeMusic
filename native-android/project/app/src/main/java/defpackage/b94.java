package defpackage;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b94 extends yw {
    public final transient byte[][] r;
    public final transient int[] s;

    public b94(byte[][] r2, int[] r3) {
        super(yw.q.n);
        this.r = r2;
        this.s = r3;
    }

    @Override // defpackage.yw
    public final String a() {
        throw null;
    }

    @Override // defpackage.yw
    public final yw c(String r8) {
        MessageDigest r9 = MessageDigest.getInstance(r8);
        byte[][] r0 = this.r;
        int r1 = r0.length;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r1) goto L5;
        int[] r5 = this.s;
        int r4 = r5[r1 + r2];
        int r6 = r5[r2];
        r9.update(r0[r2], r4, r6 - r3);
        r2 = r2 + 1;
        r3 = r6;
        goto L3
    L5:
        byte[] r7 = r9.digest();
        r7.getClass();
        return new yw(r7);
    }

    @Override // defpackage.yw
    public final int d() {
        return this.s[this.r.length - 1];
    }

    @Override // defpackage.yw
    public final String e() {
        return t().e();
    }

    @Override // defpackage.yw
    public final boolean equals(Object r4) {
        if (r4 != this) goto L5;
        return true;
    L5:
        if ((r4 instanceof yw) == false) goto L12;
        yw r5 = (yw) r4;
        if (r5.d() != d()) goto L12;
        if (m(0, r5, d()) == false) goto L12;
        return true;
    L12:
        return false;
    }

    @Override // defpackage.yw
    public final int f(int r1, byte[] r2) {
        r2.getClass();
        return t().f(r1, r2);
    }

    @Override // defpackage.yw
    public final byte[] h() {
        return s();
    }

    @Override // defpackage.yw
    public final int hashCode() {
        int r0 = this.o;
        if (r0 == 0) goto L5;
        return r0;
    L5:
        byte[][] r1 = this.r;
        int r2 = r1.length;
        int r3 = 0;
        int r4 = 1;
        int r5 = 0;
    L6:
        if (r3 >= r2) goto L11;
        int[] r6 = this.s;
        int r7 = r6[r2 + r3];
        int r8 = r6[r3];
        byte[] r9 = r1[r3];
        int r10 = (r8 - r5) + r7;
    L8:
        if (r7 >= r10) goto L10;
        r4 = (r4 * 31) + r9[r7];
        r7 = r7 + 1;
        goto L8
    L10:
        r3 = r3 + 1;
        r5 = r8;
        goto L6
    L11:
        this.o = r4;
        return r4;
    }

    @Override // defpackage.yw
    public final byte i(int r10) {
        byte[][] r0 = this.r;
        int r1 = r0.length - 1;
        int[] r2 = this.s;
        zz1.i(r2[r1], r10, 1);
        int r9 = wr1.Q(this, r10);
        if (r9 != 0) goto L5;
        int r3 = 0;
    L7:
        return r0[r9][(r10 - r3) + r2[r0.length + r9]];
    L5:
        r3 = r2[r9 - 1];
        goto L7
    }

    @Override // defpackage.yw
    public final int j(byte[] r1) {
        r1.getClass();
        return t().j(r1);
    }

    @Override // defpackage.yw
    public final boolean l(int r8, int r9, int r10, byte[] r11) {
        r11.getClass();
        if (r8 >= 0) goto L5;
    L22:
        return false;
    L5:
        if (r8 > (d() - r10)) goto L22;
        if (r9 < 0) goto L22;
        if (r9 > (r11.length - r10)) goto L22;
        int r12 = r10 + r8;
        int r1 = wr1.Q(this, r8);
    L11:
        if (r8 >= r12) goto L20;
        int[] r2 = this.s;
        if (r1 != 0) goto L15;
        int r3 = 0;
    L16:
        int r4 = r2[r1] - r3;
        byte[][] r5 = this.r;
        int r6 = r2[r5.length + r1];
        int r7 = Math.min(r12, r4 + r3) - r8;
        if (zz1.e((r8 - r3) + r6, r9, r7, r5[r1], r11) == false) goto L18;
        r9 = r9 + r7;
        r8 = r8 + r7;
        r1 = r1 + 1;
        goto L11
    L18:
        return false;
    L15:
        r3 = r2[r1 - 1];
        goto L16
    L20:
        return true;
    }

    @Override // defpackage.yw
    public final boolean m(int r9, yw r10, int r11) {
        r10.getClass();
        if (r9 >= 0) goto L5;
    L19:
        return false;
    L5:
        if (r9 > (d() - r11)) goto L19;
        int r12 = r11 + r9;
        int r1 = wr1.Q(this, r9);
        int r2 = 0;
    L8:
        if (r9 >= r12) goto L17;
        int[] r3 = this.s;
        if (r1 != 0) goto L12;
        int r4 = 0;
    L13:
        int r5 = r3[r1] - r4;
        byte[][] r6 = this.r;
        int r7 = r3[r6.length + r1];
        int r8 = Math.min(r12, r5 + r4) - r9;
        if (r10.l(r2, (r9 - r4) + r7, r8, r6[r1]) == false) goto L19;
        r2 = r2 + r8;
        r9 = r9 + r8;
        r1 = r1 + 1;
        goto L8
    L12:
        r4 = r3[r1 - 1];
        goto L13
    L17:
        return true;
    }

    @Override // defpackage.yw
    public final yw n(int r11, int r12) {
        if (r12 != (-1234567890)) goto L6;
        r12 = d();
    L6:
        if (r11 >= 0) goto L8;
        kf2.e(b11.j(r11, "beginIndex=", " < 0"));
        return null;
    L8:
        if (r12 > d()) goto L31;
        int r1 = r12 - r11;
        if (r1 < 0) goto L29;
        if (r11 == 0) goto L13;
    L15:
        if (r11 == r12) goto L17;
        int r0 = wr1.Q(this, r11);
        int r13 = wr1.Q(this, r12 - 1);
        byte[][] r3 = this.r;
        byte[][] r2 = (byte[][]) ti.e0(r3, r0, r13 + 1);
        int[] r4 = new int[r2.length * 2];
        int r5 = 0;
        int[] r10 = this.s;
        if (r0 > r13) goto L24;
        int r7 = r0;
        int r6 = 0;
    L21:
        r4[r6] = Math.min(r10[r7] - r11, r1);
        int r8 = r6 + 1;
        r4[r6 + r2.length] = r10[r3.length + r7];
        if (r7 == r13) goto L24;
        r7 = r7 + 1;
        r6 = r8;
    L24:
        if (r0 == 0) goto L27;
        r5 = r10[r0 - 1];
    L27:
        int r14 = r2.length;
        r4[r14] = (r11 - r5) + r4[r14];
        return new b94(r2, r4);
    L17:
        return yw.q;
    L13:
        if (r12 != d()) goto L15;
        return this;
    L29:
        kf2.e(xa3.e(r12, r11, "endIndex=", " < beginIndex="));
        return null;
    L31:
        StringBuilder r15 = f34.j(r12, "endIndex=", " > length(");
        r15.append(d());
        r15.append(')');
        throw new IllegalArgumentException(r15.toString().toString());
    }

    @Override // defpackage.yw
    public final yw p() {
        return t().p();
    }

    @Override // defpackage.yw
    public final void r(tv r10, int r11) {
        int r1 = wr1.Q(this, 0);
        int r2 = 0;
    L3:
        if (r2 >= r11) goto L13;
        int[] r3 = this.s;
        if (r1 != 0) goto L7;
        int r4 = 0;
    L8:
        int r5 = r3[r1] - r4;
        byte[][] r6 = this.r;
        int r7 = r3[r6.length + r1];
        int r8 = Math.min(r11, r5 + r4) - r2;
        int r9 = (r2 - r4) + r7;
        t84 r12 = new t84(r6[r1], r9, r9 + r8, true);
        t84 r13 = r10.n;
        if (r13 != null) goto L11;
        r12.g = r12;
        r12.f = r12;
        r10.n = r12;
    L12:
        r2 = r2 + r8;
        r1 = r1 + 1;
        goto L3
    L11:
        t84 r14 = r13.g;
        r14.getClass();
        r14.b(r12);
        goto L12
    L7:
        r4 = r3[r1 - 1];
        goto L8
    L13:
        r10.o += (long) r11;
    }

    public final byte[] s() {
        byte[] r0 = new byte[d()];
        byte[][] r1 = this.r;
        int r2 = r1.length;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
    L3:
        if (r3 >= r2) goto L5;
        int[] r7 = this.s;
        int r6 = r7[r2 + r3];
        int r8 = r7[r3];
        int r9 = r8 - r4;
        ti.X(r5, r6, r6 + r9, r1[r3], r0);
        r5 = r5 + r9;
        r3 = r3 + 1;
        r4 = r8;
        goto L3
    L5:
        return r0;
    }

    public final yw t() {
        return new yw(s());
    }

    @Override // defpackage.yw
    public final String toString() {
        return t().toString();
    }
}
