package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nc3 {
    public final lm0 a;
    public final lc3 b;
    public final ue1 c;

    public nc3(lm0 r1, lc3 r2, ue1 r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    public final void a(final int r9, Object r10, rg1 r11, int r12) {
        r11.S(-1201380429);
        if (r11.d(r9) == false) goto L5;
        int r0 = 4;
    L6:
        int r1 = r0 | r12;
        if (r11.g(r10) == false) goto L9;
        int r2 = 32;
    L10:
        int r3 = r1 | r2;
        if (r11.e(this) == false) goto L13;
        int r4 = 256;
    L14:
        int r5 = r3 | r4;
        if ((r5 & 147) == 146) goto L17;
        boolean r6 = true;
    L19:
        if (r11.K(r5 & 1, r6) == false) goto L21;
        int r7 = r9;
        Object r8 = r10;
        rg1 r13 = r11;
        jz4.b(r8, r7, this.a.z, fh0.w(1142237095, new mc3(this, r9), r11), r13, (((r5 >> 3) & 14) | 3072) | ((r5 << 3) & 112));
    L22:
        lv3 r14 = r13.p();
        if (r14 == null) goto L26;
        r14.d = new d82(this, r7, r8, r12);
        return;
    L26:
        return;
    L21:
        r7 = r9;
        r8 = r10;
        r13 = r11;
        r13.N();
        goto L22
    L17:
        r6 = false;
        goto L19
    L13:
        r4 = 128;
        goto L14
    L9:
        r2 = 16;
        goto L10
    L5:
        r0 = 2;
        goto L6
    }

    public final int b() {
        lc3 r0 = this.b;
        r0.getClass();
        return r0.a.o;
    }

    public final Object c(int r4) {
        ue1 r0 = this.c;
        Object[] r1 = (Object[]) r0.q;
        int r2 = r4 - r0.o;
        if (r2 >= 0) goto L5;
    L7:
        Object r3 = null;
    L8:
        if (r3 != null) goto L17;
        lc3 r5 = this.b;
        r5.getClass();
        f12 r6 = r5.a.j(r4);
        int r7 = r4 - r6.a;
        if1 r8 = (if1) r6.c.n;
        if (r8 == null) goto L16;
        Object r9 = r8.invoke(Integer.valueOf(r7));
        if (r9 == null) goto L16;
        return r9;
    L16:
        return new ql0(r4);
    L17:
        return r3;
    L5:
        if (r2 >= r1.length) goto L7;
        r3 = r1[r2];
        goto L8
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof nc3) == true) goto L9;
        return false;
    L9:
        lc3 r3 = ((nc3) r2).b;
        return h12.c(this.b, r3);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
