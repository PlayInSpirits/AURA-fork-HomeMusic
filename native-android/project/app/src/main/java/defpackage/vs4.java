package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vs4 extends gx2 {
    public final String a;
    public final zs4 b;
    public final ha1 c;

    public vs4(String r1, zs4 r2, ha1 r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    @Override // defpackage.gx2
    public final cx2 d() {
        ys4 r0 = new ys4();
        r0.B = this.a;
        r0.C = this.b;
        r0.D = this.c;
        r0.E = 1;
        r0.F = true;
        r0.G = Integer.MAX_VALUE;
        r0.H = 1;
        return r0;
    }

    @Override // defpackage.gx2
    public final void e(cx2 r11) {
        ys4 r12 = (ys4) r11;
        r12.getClass();
        zs4 r0 = r12.C;
        boolean r1 = false;
        boolean r2 = true;
        zs4 r3 = this.b;
        if (r3 != r0) goto L5;
        r3.getClass();
    L9:
        boolean r4 = false;
    L10:
        String r5 = r12.B;
        String r6 = this.a;
        if (h12.c(r5, r6) == false) goto L13;
        boolean r7 = false;
    L14:
        zs4 r8 = r12.C;
        if (r8 != r3) goto L17;
        r8.getClass();
    L22:
        r1 = true;
    L23:
        boolean r9 = !r1;
        r12.C = r3;
        if (r12.H == 1) goto L27;
        r12.H = 1;
        r9 = true;
    L27:
        if (r12.G == Integer.MAX_VALUE) goto L30;
        r12.G = Integer.MAX_VALUE;
        r9 = true;
    L30:
        if (r12.F == true) goto L32;
        r12.F = true;
        r9 = true;
    L32:
        ha1 r10 = r12.D;
        ha1 r13 = this.c;
        if (h12.c(r10, r13) == true) goto L36;
        r12.D = r13;
        r9 = true;
    L36:
        if (r12.E != 1) goto L38;
        r2 = r9;
    L39:
        if (r7 == true) goto L41;
        if (r2 == true) goto L41;
    L43:
        if (r12.A == false) goto L57;
        if (r7 == true) goto L49;
        if (r4 == true) goto L48;
    L50:
        if (r7 == true) goto L52;
        if (r2 == true) goto L52;
    L53:
        if (r4 == false) goto L56;
        jz4.z(r12);
        return;
    L56:
        return;
    L52:
        g12.A(r12);
        jz4.z(r12);
        goto L53
    L48:
        if (r12.K == null) goto L50;
    L49:
        fu.C(r12);
        goto L50
    L57:
        return;
    L41:
        rd3 r14 = r12.q0();
        String r15 = r12.B;
        zs4 r16 = r12.C;
        ha1 r17 = r12.D;
        int r18 = r12.E;
        boolean r19 = r12.F;
        int r20 = r12.G;
        int r21 = r12.H;
        r14.a = r15;
        r14.b = r16;
        r14.c = r17;
        r14.d = r18;
        r14.e = r19;
        r14.f = r20;
        r14.g = r21;
        r14.q = (r14.q << 2) | 2;
        r14.b();
        goto L43
    L38:
        r12.E = 1;
        goto L39
    L17:
        if (h12.c(r8.b, r3.b) == false) goto L23;
        if (r8.a.a(r3.a) == false) goto L23;
    L13:
        r12.B = r6;
        r12.L = null;
        r7 = true;
        goto L14
    L5:
        if (r3.a.b(r0.a) == true) goto L9;
        r4 = true;
        goto L10
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof vs4) == false) goto L19;
        vs4 r5 = (vs4) r4;
        if (h12.c(this.a, r5.a) == true) goto L12;
        return false;
    L12:
        if (h12.c(this.b, r5.b) == true) goto L15;
        return false;
    L15:
        if (h12.c(this.c, r5.c) == true) goto L18;
        return false;
    L18:
        return true;
    L19:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        int r2 = (this.b.hashCode() + r0) * 31;
        int r3 = f34.d(1, (this.c.hashCode() + r2) * 31, 31);
        return (((((Boolean.hashCode(true) + r3) * 31) + Integer.MAX_VALUE) * 31) + 1) * 31;
    }
}
