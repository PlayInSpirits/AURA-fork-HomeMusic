package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ec3 implements fv {
    public final lm0 b;
    public final fv c;
    public final r62 d;

    public ec3(lm0 r1, fv r2, r62 r3) {
        this.b = r1;
        this.c = r2;
        this.d = r3;
    }

    @Override // defpackage.fv
    public final float a(float r12, float r13, float r14) {
        lm0 r0 = this.b;
        zd3 r1 = r0.E;
        float r2 = this.c.a(r12, r13, r14);
        boolean r5 = false;
        if (r12 > 0.0f) goto L5;
        float r15 = r12 + r13;
        int r16 = n85.a;
        if (r15 <= 1.0f) goto L6;
    L10:
        float r17 = Math.abs(r2);
        r62 r18 = r62.o;
        hb3 r4 = hb3.o;
        r62 r11 = this.d;
        if (r17 == 0.0f) goto L32;
        if (r5 == false) goto L32;
        if (r11 == r18) goto L16;
    L18:
        int r19 = r0.f;
    L19:
        float r110 = r19 * (-1.0f);
    L21:
        if (r2 <= 0.0f) goto L26;
        if (r110 >= r2) goto L26;
        r110 = r110 + r0.p();
    L26:
        if (r2 >= 0.0f) goto L30;
        if (r110 <= r2) goto L30;
        r110 = r110 - r0.p();
    L30:
        return r110;
    L16:
        if (r0.m().e != r4) goto L18;
        r19 = r0.p() + (-r0.f);
    L32:
        if (Math.abs(r0.f) >= 1.0E-6d) goto L34;
        return 0.0f;
    L34:
        if (r11 == r18) goto L36;
    L38:
        int r3 = r0.f;
    L39:
        float r111 = r3 * (-1.0f);
        if (r11 != r18) goto L49;
        if (r0.m().e != r4) goto L49;
        if (((Boolean) r1.getValue()).booleanValue() == true) goto L52;
        int r112 = r0.p();
    L47:
        r111 = r111 + r112;
    L52:
        return gb.l(r111, -r14, r14);
    L49:
        if (((Boolean) r1.getValue()).booleanValue() == false) goto L52;
        r112 = r0.p();
        goto L47
    L36:
        if (r0.m().e != r4) goto L38;
        r3 = r0.p() + (-r0.f);
    L6:
        r5 = true;
        goto L10
    L5:
        if ((r12 + r13) <= r14) goto L10;
        goto L6
    }
}
