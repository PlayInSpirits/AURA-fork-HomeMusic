package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x40 {
    public static final long b = 0;
    public static final long c = 0;
    public static final long d = 0;
    public static final long e = 0;
    public static final long f = 0;
    public static final long g = 0;
    public static final /* synthetic */ int h = 0;
    public final long a;

    static {
        b = e35.c(4278190080L);
        e35.c(4282664004L);
        c = e35.c(4287137928L);
        e35.c(4291611852L);
        e35.c(4294967295L);
        d = e35.c(4294901760L);
        e35.c(4278255360L);
        e = e35.c(4278190335L);
        e35.c(4294967040L);
        e35.c(4278255615L);
        e35.c(4294902015L);
        f = e35.b(0);
        g = e35.a(0.0f, 0.0f, 0.0f, 0.0f, s50.u);
    }

    public /* synthetic */ x40(long r1) {
        this.a = r1;
    }

    public static final long a(long r4, p50 r6) {
        p50[] r1 = s50.y;
        p50 r0 = r1[(int) (63 & r4)];
        int r2 = r0.c;
        int r3 = r6.c;
        if ((r2 | r3) >= 0) goto L5;
        xa0 r7 = uo.m(r0, r6);
    L10:
        return r7.a(r4);
    L5:
        i03 r5 = ya0.a;
        int r8 = r2 | (r3 << 6);
        Object r9 = r5.b(r8);
        if (r9 != null) goto L8;
        r9 = uo.m(r0, r6);
        r5.i(r8, r9);
    L8:
        r7 = (xa0) r9;
        goto L10
    }

    public static long b(long r5, float r7) {
        float r0 = g(r5);
        float r1 = f(r5);
        float r2 = e(r5);
        p50[] r6 = s50.y;
        return e35.a(r0, r1, r2, r7, r6[(int) (r5 & 63)]);
    }

    public static final boolean c(long r0, long r2) {
        if (r0 != r2) goto L6;
        return true;
    L6:
        return false;
    }

    public static final float d(long r4) {
        if ((63 & r4) != 0) goto L7;
        float r5 = (float) rr2.W((r4 >>> 56) & 255);
        float r6 = 255.0f;
    L6:
        return r5 / r6;
    L7:
        r5 = (float) rr2.W((r4 >>> 6) & 1023);
        r6 = 1023.0f;
        goto L6
    }

    public static final float e(long r5) {
        if ((63 & r5) == 0) goto L5;
        short r6 = (short) ((r5 >>> 16) & 65535);
        int r1 = Short.MIN_VALUE & r6;
        int r7 = ((65535 & r6) >>> 10) & 31;
        int r8 = r6 & 1023;
        if (r7 != 0) goto L15;
        if (r8 == 0) goto L14;
        float r9 = Float.intBitsToFloat(r8 + 1056964608) - b81.a;
        if (r1 != 0) goto L13;
        return r9;
    L13:
        return -r9;
    L14:
        int r10 = 0;
        int r11 = 0;
    L23:
        return Float.intBitsToFloat(((r10 << 23) | (r1 << 16)) | r11);
    L15:
        int r12 = r8 << 13;
        if (r7 != 31) goto L21;
        int r13 = 255;
        if (r12 == 0) goto L20;
        r12 = r12 | 4194304;
    L20:
        int r4 = r13;
        r11 = r12;
        r10 = r4;
        goto L23
    L21:
        r13 = r7 + 112;
        goto L20
    L5:
        return ((float) rr2.W((r5 >>> 32) & 255)) / 255.0f;
    }

    public static final float f(long r5) {
        if ((63 & r5) == 0) goto L5;
        short r6 = (short) ((r5 >>> 32) & 65535);
        int r0 = Short.MIN_VALUE & r6;
        int r7 = ((65535 & r6) >>> 10) & 31;
        int r8 = r6 & 1023;
        if (r7 != 0) goto L15;
        if (r8 == 0) goto L14;
        float r9 = Float.intBitsToFloat(r8 + 1056964608) - b81.a;
        if (r0 != 0) goto L13;
        return r9;
    L13:
        return -r9;
    L14:
        int r10 = 0;
        int r11 = 0;
    L23:
        return Float.intBitsToFloat(((r10 << 23) | (r0 << 16)) | r11);
    L15:
        int r12 = r8 << 13;
        if (r7 != 31) goto L21;
        int r13 = 255;
        if (r12 == 0) goto L20;
        r12 = r12 | 4194304;
    L20:
        int r4 = r13;
        r11 = r12;
        r10 = r4;
        goto L23
    L21:
        r13 = r7 + 112;
        goto L20
    L5:
        return ((float) rr2.W((r5 >>> 40) & 255)) / 255.0f;
    }

    public static final float g(long r5) {
        if ((63 & r5) == 0) goto L5;
        short r6 = (short) ((r5 >>> 48) & 65535);
        int r0 = Short.MIN_VALUE & r6;
        int r7 = ((65535 & r6) >>> 10) & 31;
        int r8 = r6 & 1023;
        if (r7 != 0) goto L15;
        if (r8 == 0) goto L14;
        float r9 = Float.intBitsToFloat(r8 + 1056964608) - b81.a;
        if (r0 != 0) goto L13;
        return r9;
    L13:
        return -r9;
    L14:
        int r10 = 0;
        int r11 = 0;
    L23:
        return Float.intBitsToFloat(((r10 << 23) | (r0 << 16)) | r11);
    L15:
        int r12 = r8 << 13;
        if (r7 != 31) goto L21;
        int r13 = 255;
        if (r12 == 0) goto L20;
        r12 = r12 | 4194304;
    L20:
        int r4 = r13;
        r11 = r12;
        r10 = r4;
        goto L23
    L21:
        r13 = r7 + 112;
        goto L20
    L5:
        return ((float) rr2.W((r5 >>> 48) & 255)) / 255.0f;
    }

    public static String h(long r6) {
        float r0 = g(r6);
        float r1 = f(r6);
        float r2 = e(r6);
        float r3 = d(r6);
        p50[] r7 = s50.y;
        String r8 = r7[(int) (r6 & 63)].a;
        StringBuilder r9 = b11.r("Color(", r0, ", ", r1, ", ");
        r9.append(r2);
        r9.append(", ");
        r9.append(r3);
        r9.append(", ");
        return b11.q(r9, r8, ")");
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof x40) == false) goto L11;
        long r0 = ((x40) r3).a;
        if (this.a == r0) goto L9;
        return false;
    L9:
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return h(this.a);
    }
}
