package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class r64 extends gx2 {
    public final lm0 a;
    public final boolean b;
    public final y71 c;
    public final rm2 d;
    public final fv e;
    public final tb f;

    public r64(lm0 r1, boolean r2, y71 r3, rm2 r4, fv r5, tb r6) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
    }

    @Override // defpackage.gx2
    public final cx2 d() {
        s64 r0 = new s64();
        r0.D = this.a;
        r0.E = hb3.o;
        r0.F = this.b;
        r0.G = this.c;
        r0.H = this.d;
        r0.I = this.e;
        r0.J = this.f;
        return r0;
    }

    @Override // defpackage.gx2
    public final void e(cx2 r9) {
        rm2 r6 = this.d;
        fv r7 = this.e;
        ((s64) r9).v0(this.a, hb3.o, this.f, this.b, this.c, r6, r7);
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L5;
        return true;
    L5:
        if (r4 != null) goto L7;
    L29:
        return false;
    L7:
        if (r64.class != r4.getClass()) goto L29;
        r64 r5 = (r64) r4;
        if (this.a == r5.a) goto L13;
        return false;
    L13:
        if (this.b != r5.b) goto L29;
        if (h12.c(this.c, r5.c) == false) goto L29;
        if (h12.c(this.d, r5.d) == false) goto L29;
        if (h12.c(this.e, r5.e) == false) goto L29;
        if (h12.c(this.f, r5.f) == false) goto L29;
        return true;
    }

    public final int hashCode() {
        int r2 = 0;
        int r0 = xa3.c(xa3.c((hb3.o.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.b), 31, false);
        y71 r3 = this.c;
        if (r3 == null) goto L5;
        int r4 = r3.hashCode();
    L6:
        int r1 = (r0 + r4) * 31;
        rm2 r5 = this.d;
        if (r5 == null) goto L9;
        int r6 = r5.hashCode();
    L10:
        int r7 = (r1 + r6) * 31;
        fv r8 = this.e;
        if (r8 == null) goto L13;
        int r9 = r8.hashCode();
    L14:
        int r10 = xa3.c((r7 + r9) * 31, 31, false);
        tb r11 = this.f;
        if (r11 == null) goto L18;
        r2 = r11.hashCode();
    L18:
        return r10 + r2;
    L13:
        r9 = 0;
        goto L14
    L9:
        r6 = 0;
        goto L10
    L5:
        r4 = 0;
        goto L6
    }
}
