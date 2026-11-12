package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zt4 {
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public z5 g;

    static {
        String r0 = f35.a;
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
    }

    public zt4() {
        this.g = z5.f;
    }

    public final long a(int r2, int r3) {
        x5 r1 = this.g.a(r2);
        if (r1.b != (-1)) goto L5;
        return -9223372036854775807L;
    L5:
        return r1.g[r3];
    }

    public final int b(long r11) {
        z5 r0 = this.g;
        long r1 = this.d;
        int r10 = r0.a;
        if (r11 != Long.MIN_VALUE) goto L5;
    L26:
        return -1;
    L5:
        if (r1 != (-9223372036854775807L)) goto L7;
    L9:
        int r7 = r0.d;
    L10:
        if (r7 >= r10) goto L21;
        if (r0.a(r7).a != Long.MIN_VALUE) goto L14;
    L15:
        x5 r8 = r0.a(r7);
        int r9 = r8.b;
        if (r9 == (-1)) goto L21;
        if (r8.a(-1) < r9) goto L21;
    L20:
        r7 = r7 + 1;
        goto L10
    L14:
        if (r0.a(r7).a <= r11) goto L20;
    L21:
        if (r7 >= r10) goto L26;
        if (r1 != (-9223372036854775807L)) goto L24;
    L25:
        return r7;
    L24:
        if (r0.a(r7).a > r1) goto L26;
    L7:
        if (r11 < r1) goto L9;
        goto L9
    }

    public final int c(long r14) {
        z5 r0 = this.g;
        long r1 = this.d;
        int r13 = r0.a;
        int r3 = r13 - 1;
        int r5 = 0;
        if (r3 != (r13 - 1)) goto L11;
        x5 r15 = r0.a(r3);
        if (r15.l == false) goto L11;
        if (r15.a != Long.MIN_VALUE) goto L11;
        if (r15.b != (-1)) goto L11;
        int r16 = 1;
    L12:
        int r4 = r3 - r16;
    L13:
        if (r4 < 0) goto L34;
        if (r14 == Long.MIN_VALUE) goto L34;
        x5 r17 = r0.a(r4);
        long r9 = r17.a;
        if (r9 != Long.MIN_VALUE) goto L32;
        if (r1 == (-9223372036854775807L)) goto L33;
        if (r17.l == false) goto L29;
        if (r9 != Long.MIN_VALUE) goto L29;
        if (r17.b == (-1)) goto L33;
    L29:
        if (r14 >= r1) goto L34;
    L33:
        r4 = r4 - 1;
        goto L13
    L32:
        if (r14 < r9) goto L33;
    L34:
        if (r4 < 0) goto L45;
        x5 r18 = r0.a(r4);
        int r19 = r18.b;
        if (r19 == (-1)) goto L44;
    L38:
        if (r5 >= r19) goto L45;
        int r110 = r18.f[r5];
        if (r110 == 0) goto L44;
        if (r110 == 1) goto L44;
        r5 = r5 + 1;
    L44:
        return r4;
    L45:
        return -1;
    L11:
        r16 = 0;
        goto L12
    }

    public final long d(int r1) {
        return this.g.a(r1).a;
    }

    public final int e(int r2, int r3) {
        x5 r1 = this.g.a(r2);
        if (r1.b != (-1)) goto L5;
        return 0;
    L5:
        return r1.f[r3];
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (r7 != null) goto L8;
    L25:
        return false;
    L8:
        if (zt4.class.equals(r7.getClass()) == false) goto L25;
        zt4 r8 = (zt4) r7;
        if (Objects.equals(this.a, r8.a) == false) goto L25;
        if (Objects.equals(this.b, r8.b) == false) goto L25;
        if (this.c != r8.c) goto L25;
        if (this.d != r8.d) goto L25;
        if (this.e != r8.e) goto L25;
        if (this.f != r8.f) goto L25;
        if (Objects.equals(this.g, r8.g) == false) goto L25;
        return true;
    }

    public final int f(int r1) {
        return this.g.a(r1).a(-1);
    }

    public final boolean g(int r7) {
        z5 r6 = this.g;
        int r0 = r6.a;
        if (r7 == (r0 - 1)) goto L5;
        return false;
    L5:
        if (r7 != (r0 - 1)) goto L15;
        x5 r8 = r6.a(r7);
        if (r8.l == true) goto L9;
        return false;
    L9:
        if (r8.a == Long.MIN_VALUE) goto L11;
        return false;
    L11:
        if (r8.b != (-1)) goto L18;
        return true;
    L18:
        return false;
    L15:
        return false;
    }

    public final boolean h(int r1) {
        return this.g.a(r1).k;
    }

    public final int hashCode() {
        Object r0 = this.a;
        int r1 = 0;
        if (r0 != null) goto L5;
        int r2 = 0;
    L6:
        int r3 = (217 + r2) * 31;
        Object r4 = this.b;
        if (r4 == null) goto L10;
        r1 = r4.hashCode();
    L10:
        int r5 = (((r3 + r1) * 31) + this.c) * 31;
        long r6 = this.d;
        int r7 = (r5 + ((int) (r6 ^ (r6 >>> 32)))) * 31;
        long r8 = this.e;
        return this.g.hashCode() + ((((r7 + ((int) (r8 ^ (r8 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
    L5:
        r2 = r0.hashCode();
        goto L6
    }

    public final void i(Object r1, Object r2, int r3, long r4, long r6, z5 r8, boolean r9) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r6;
        this.g = r8;
        this.f = r9;
    }
}
