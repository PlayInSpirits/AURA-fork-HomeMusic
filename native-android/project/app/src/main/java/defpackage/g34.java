package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g34 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        wr1.a(0.0f, 0.0f, 0.0f, 0.0f, 0);
    }

    public g34(float r1, float r2, float r3, float r4, long r5, long r7, long r9, long r11) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r7;
        this.g = r9;
        this.h = r11;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L5;
        return true;
    L5:
        if ((r5 instanceof g34) == false) goto L34;
        g34 r6 = (g34) r5;
        if (Float.compare(this.a, r6.a) == 0) goto L11;
        return false;
    L11:
        if (Float.compare(this.b, r6.b) == 0) goto L14;
        return false;
    L14:
        if (Float.compare(this.c, r6.c) == 0) goto L17;
        return false;
    L17:
        if (Float.compare(this.d, r6.d) == 0) goto L20;
        return false;
    L20:
        if (ud3.g(this.e, r6.e) == true) goto L23;
        return false;
    L23:
        if (ud3.g(this.f, r6.f) == true) goto L26;
        return false;
    L26:
        if (ud3.g(this.g, r6.g) == true) goto L29;
        return false;
    L29:
        if (ud3.g(this.h, r6.h) == true) goto L32;
        return false;
    L32:
        return true;
    L34:
        return false;
    }

    public final int hashCode() {
        int r0 = xa3.b(xa3.b(xa3.b(b11.d(b11.d(b11.d(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), 31, this.e), 31, this.f), 31, this.g);
        return Long.hashCode(this.h) + r0;
    }

    public final String toString() {
        String r0 = gh0.F(this.a);
        String r1 = gh0.F(this.b);
        String r2 = gh0.F(this.c);
        String r3 = gh0.F(this.d);
        StringBuilder r4 = new StringBuilder();
        r4.append(r0);
        r4.append(", ");
        r4.append(r1);
        r4.append(", ");
        r4.append(r2);
        String r5 = b11.q(r4, ", ", r3);
        long r6 = this.e;
        long r7 = this.f;
        boolean r8 = ud3.g(r6, r7);
        long r9 = this.g;
        long r10 = this.h;
        if (r8 == true) goto L5;
    L14:
        String r12 = ud3.I0(r6);
        String r11 = ud3.I0(r7);
        String r13 = ud3.I0(r9);
        String r14 = ud3.I0(r10);
        StringBuilder r15 = b11.u("RoundRect(rect=", r5, ", topLeft=", r12, ", topRight=");
        f34.n(r15, r11, ", bottomRight=", r13, ", bottomLeft=");
        return b11.q(r15, r14, ")");
    L5:
        if (ud3.g(r7, r9) == false) goto L14;
        if (ud3.g(r9, r10) == false) goto L14;
        int r16 = (int) (r6 >> 32);
        int r17 = (int) (r6 & 4294967295L);
        if (Float.intBitsToFloat(r16) == Float.intBitsToFloat(r17)) goto L11;
        String r18 = gh0.F(Float.intBitsToFloat(r16));
        String r19 = gh0.F(Float.intBitsToFloat(r17));
        return b11.q(b11.u("RoundRect(rect=", r5, ", x=", r18, ", y="), r19, ")");
    L11:
        return f34.h("RoundRect(rect=", r5, ", radius=", gh0.F(Float.intBitsToFloat(r16)), ")");
    }
}
