package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hz1 extends ef2 {
    @Override // defpackage.cf2
    public final int X(pp1 r7) {
        if2 r0 = this.H.H.R.q;
        r0.getClass();
        f72 r1 = r0.s;
        y62 r2 = r1.d;
        d72 r3 = r0.D;
        if (r2 != y62.o) goto L7;
        r3.d = true;
        if (r3.b == false) goto L8;
        r1.f = true;
        r1.g = true;
    L8:
        hz1 r4 = r0.c().o0;
        if (r4 == null) goto L11;
        Boolean r5 = Boolean.valueOf(r4.B);
    L12:
        hz1 r6 = r0.c().o0;
        if (r6 == null) goto L15;
        r6.B = true;
    L15:
        r0.y();
        hz1 r8 = r0.c().o0;
        if (r8 == null) goto L21;
        if (r5 == null) goto L19;
        boolean r9 = r5.booleanValue();
    L20:
        r8.B = r9;
        goto L21
    L19:
        r9 = false;
    L21:
        Integer r10 = (Integer) r3.g.get(r7);
        if (r10 == null) goto L24;
        int r11 = r10.intValue();
    L25:
        this.M.g(r11, r7);
        return r11;
    L24:
        r11 = Integer.MIN_VALUE;
        goto L25
    L11:
        r5 = null;
        goto L12
    L7:
        r3.e = true;
        goto L8
    }

    @Override // defpackage.ef2
    public final void q0() {
        if2 r0 = this.H.H.R.q;
        r0.getClass();
        r0.c0();
    }

    @Override // defpackage.pi2
    public final jg3 r(long r7) {
        R(r7);
        f63 r0 = this.H;
        f13 r1 = r0.H.y();
        Object[] r2 = r1.n;
        int r3 = r1.p;
        int r4 = 0;
    L3:
        if (r4 >= r3) goto L5;
        if2 r5 = ((c72) r2[r4]).R.q;
        r5.getClass();
        r5.w = a72.p;
        r4 = r4 + 1;
        goto L3
    L5:
        c72 r6 = r0.H;
        ef2.p0(this, r6.I.a(this, r6.m(), r7));
        return this;
    }
}
