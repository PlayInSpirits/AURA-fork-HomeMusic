package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k34 implements ac4 {
    public final lu0 a;
    public final lu0 b;
    public final lu0 c;
    public final lu0 d;

    public k34(lu0 r1, lu0 r2, lu0 r3, lu0 r4) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
    }

    @Override // defpackage.ac4
    public final ya4 a(long r30, r62 r32, oo0 r33) {
        float r5 = this.a.a(r30, r33);
        float r6 = this.b.a(r30, r33);
        float r7 = this.c.a(r30, r33);
        float r0 = this.d.a(r30, r33);
        float r8 = Math.min(Float.intBitsToFloat((int) ((r30 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (r30 & 2147483647L)));
        float r9 = r5 + r0;
        if (r9 <= r8) goto L5;
        float r10 = r8 / r9;
        r5 = r5 * r10;
        r0 = r0 * r10;
    L5:
        float r11 = r6 + r7;
        if (r11 <= r8) goto L9;
        float r12 = r8 / r11;
        r6 = r6 * r12;
        r7 = r7 * r12;
    L9:
        if (r5 >= 0.0f) goto L11;
    L17:
        StringBuilder r13 = b11.r("Corner size in Px can't be negative(topStart = ", r5, ", topEnd = ", r6, ", bottomEnd = ");
        r13.append(r7);
        r13.append(", bottomStart = ");
        r13.append(r0);
        r13.append(")!");
        fz1.a(r13.toString());
    L19:
        if ((((r5 + r6) + r7) + r0) == 0.0f) goto L21;
        wv3 r1 = bu.d(0, r30);
        r62 r2 = r62.n;
        if (r32 != r2) goto L25;
        float r14 = r5;
    L26:
        long r21 = (Float.floatToRawIntBits(r14) << 32) | (Float.floatToRawIntBits(r14) & 4294967295L);
        if (r32 != r2) goto L29;
        r5 = r6;
    L29:
        long r23 = (Float.floatToRawIntBits(r5) << 32) | (((long) Float.floatToRawIntBits(r5)) & 4294967295L);
        if (r32 != r2) goto L32;
        float r15 = r7;
    L33:
        long r25 = (Float.floatToRawIntBits(r15) << 32) | (((long) Float.floatToRawIntBits(r15)) & 4294967295L);
        if (r32 == r2) goto L38;
        r0 = r7;
    L38:
        return new ob3(new g34(r1.a, r1.b, r1.c, r1.d, r21, r23, r25, (Float.floatToRawIntBits(r0) << 32) | (((long) Float.floatToRawIntBits(r0)) & 4294967295L)));
    L32:
        r15 = r0;
        goto L33
    L25:
        r14 = r6;
        goto L26
    L21:
        return new nb3(bu.d(0, r30));
    L11:
        if (r6 < 0.0f) goto L17;
        if (r7 < 0.0f) goto L17;
        if (r0 < 0.0f) goto L17;
        goto L17
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof k34) == false) goto L22;
        k34 r4 = (k34) r3;
        lu0 r0 = r4.a;
        if (this.a.equals(r0) == true) goto L11;
        return false;
    L11:
        if (this.b.equals(r4.b) == true) goto L14;
        return false;
    L14:
        if (this.c.equals(r4.c) == true) goto L17;
        return false;
    L17:
        if (this.d.equals(r4.d) == true) goto L20;
        return false;
    L20:
        return true;
    L22:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        int r1 = (this.b.hashCode() + r0) * 31;
        int r2 = (this.c.hashCode() + r1) * 31;
        return this.d.hashCode() + r2;
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ")";
    }
}
