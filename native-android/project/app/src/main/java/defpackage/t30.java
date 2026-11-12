package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class t30 extends gx2 {
    public final gf1 a;

    public t30(gf1 r1) {
        this.a = r1;
    }

    @Override // defpackage.gx2
    public final cx2 d() {
        return new u30(this.a);
    }

    @Override // defpackage.gx2
    public final void e(cx2 r8) {
        u30 r9 = (u30) r8;
        ea1 r0 = r9.H;
        boolean r3 = true;
        boolean r4 = false;
        if (h12.c(r9.Q, null) == true) goto L5;
        r9.v0();
        r9.Q = null;
        r9.D = null;
        boolean r1 = true;
    L7:
        if (r9.E == true) goto L10;
        r9.E = true;
        r9.Q();
        r1 = true;
    L10:
        if (r9.F == true) goto L12;
        r9.q0(r0);
        fu.C(r9);
        r9.F = true;
    L12:
        r9.G = this.a;
        boolean r7 = r9.R;
        rm2 r5 = r9.Q;
        if (r5 != null) goto L15;
        boolean r6 = true;
    L16:
        if (r7 == r6) goto L24;
        if (r5 != null) goto L19;
        r4 = true;
    L19:
        r9.R = r4;
        if (r4 == true) goto L24;
        if (r9.L != null) goto L24;
    L25:
        if (r3 == false) goto L33;
        ck0 r10 = r9.L;
        if (r10 == null) goto L29;
    L30:
        if (r10 == null) goto L32;
        r9.r0(r10);
    L32:
        r9.L = null;
        r9.x0();
        goto L33
    L29:
        if (r9.R == false) goto L30;
    L33:
        r0.v0(r9.D);
        return;
    L24:
        r3 = r1;
        goto L25
    L15:
        r6 = false;
        goto L16
    L5:
        r1 = false;
        goto L7
    }

    public final boolean equals(Object r3) {
        if (this == r3) goto L17;
        if (r3 != null) goto L7;
        return false;
    L7:
        if (t30.class == r3.getClass()) goto L10;
        return false;
    L10:
        if (this.a == ((t30) r3).a) goto L13;
        return false;
    L13:
        return true;
    L17:
        return true;
    }

    public final int hashCode() {
        int r0 = xa3.c(Boolean.hashCode(true) * 31, 29791, true);
        return this.a.hashCode() + r0;
    }
}
