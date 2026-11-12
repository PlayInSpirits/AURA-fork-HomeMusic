package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sd3 implements fe {
    public final int a;
    public final int b;
    public final long c;
    public final cs4 d;
    public final zg3 e;
    public final ra2 f;
    public final int g;
    public final int h;
    public final qs4 i;

    public sd3(int r1, int r2, long r3, cs4 r5, zg3 r6, ra2 r7, int r8, int r9, qs4 r10) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r5;
        this.e = r6;
        this.f = r7;
        this.g = r8;
        this.h = r9;
        this.i = r10;
        if (bt4.a(r3, bt4.c) == false) goto L5;
        return;
    L5:
        if (bt4.c(r3) >= 0.0f) goto L10;
        dz1.b("lineHeight can't be negative (" + bt4.c(r3) + ")");
        return;
    }

    public final sd3 a(sd3 r12) {
        if (r12 != null) goto L5;
        return this;
    L5:
        return td3.a(this, r12.a, r12.b, r12.c, r12.d, r12.e, r12.f, r12.g, r12.h, r12.i);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L5;
        return true;
    L5:
        if ((r5 instanceof sd3) == false) goto L38;
        sd3 r6 = (sd3) r5;
        int r0 = r6.a;
        if (this.a == r0) goto L10;
        return false;
    L10:
        if (this.b == r6.b) goto L12;
        return false;
    L12:
        if (bt4.a(this.c, r6.c) == true) goto L15;
        return false;
    L15:
        if (h12.c(this.d, r6.d) == true) goto L18;
        return false;
    L18:
        if (h12.c(this.e, r6.e) == true) goto L21;
        return false;
    L21:
        if (h12.c(this.f, r6.f) == true) goto L24;
        return false;
    L24:
        if (this.g == r6.g) goto L26;
        return false;
    L26:
        if (this.h == r6.h) goto L28;
        return false;
    L28:
        if (h12.c(this.i, r6.i) == false) goto L43;
        return true;
    L43:
        return false;
    L38:
        return false;
    }

    public final int hashCode() {
        int r0 = f34.d(this.b, Integer.hashCode(this.a) * 31, 31);
        ct4[] r2 = bt4.b;
        int r1 = xa3.b(r0, 31, this.c);
        int r3 = 0;
        cs4 r4 = this.d;
        if (r4 == null) goto L5;
        int r5 = r4.hashCode();
    L6:
        int r6 = (r1 + r5) * 31;
        zg3 r7 = this.e;
        if (r7 == null) goto L9;
        int r8 = r7.hashCode();
    L10:
        int r9 = (r6 + r8) * 31;
        ra2 r10 = this.f;
        if (r10 == null) goto L13;
        int r11 = r10.hashCode();
    L14:
        int r12 = f34.d(this.h, f34.d(this.g, (r9 + r11) * 31, 31), 31);
        qs4 r13 = this.i;
        if (r13 == null) goto L18;
        r3 = r13.hashCode();
    L18:
        return r12 + r3;
    L13:
        r11 = 0;
        goto L14
    L9:
        r8 = 0;
        goto L10
    L5:
        r5 = 0;
        goto L6
    }

    public final String toString() {
        String r0 = mr4.a(this.a);
        String r1 = ur4.a(this.b);
        String r2 = bt4.d(this.c);
        String r3 = ma2.a(this.g);
        String r4 = du1.a(this.h);
        StringBuilder r5 = b11.u("ParagraphStyle(textAlign=", r0, ", textDirection=", r1, ", lineHeight=");
        r5.append(r2);
        r5.append(", textIndent=");
        r5.append(this.d);
        r5.append(", platformStyle=");
        r5.append(this.e);
        r5.append(", lineHeightStyle=");
        r5.append(this.f);
        r5.append(", lineBreak=");
        f34.n(r5, r3, ", hyphens=", r4, ", textMotion=");
        r5.append(this.i);
        r5.append(")");
        return r5.toString();
    }
}
