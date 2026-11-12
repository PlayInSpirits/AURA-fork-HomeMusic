package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ou implements ui2 {
    public final hs a;
    public final boolean b;

    public ou(hs r1, boolean r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // defpackage.ui2
    public final vi2 a(final cf2 r14, final List r15, long r16) {
        boolean r0 = r15.isEmpty();
        v01 r7 = v01.n;
        if (r0 == false) goto L7;
        return r14.v(nc0.j(r16), nc0.i(r16), r7, new or1(24));
    L7:
        if (this.b == false) goto L9;
        long r1 = r16;
    L11:
        if (r15.size() != 1) goto L14;
        final pi2 r2 = (pi2) r15.get(0);
        r2.t();
        final jg3 r3 = r2.r(r1);
        final int r4 = Math.max(nc0.j(r16), r3.n);
        final int r5 = Math.max(nc0.i(r16), r3.o);
        return r14.v(r4, r5, r7, new mu(r3, r2, r14, r4, r5, this));
    L14:
        final jg3[] r6 = new jg3[r15.size()];
        final hx3 r8 = new hx3();
        r8.n = nc0.j(r16);
        int r9 = 0;
        final hx3 r10 = new hx3();
        r10.n = nc0.i(r16);
        int r11 = r15.size();
    L15:
        if (r9 >= r11) goto L18;
        pi2 r12 = (pi2) r15.get(r9);
        r12.t();
        jg3 r13 = r12.r(r1);
        r6[r9] = r13;
        r8.n = Math.max(r8.n, r13.n);
        r10.n = Math.max(r10.n, r13.o);
        r9 = r9 + 1;
        goto L15
    L18:
        return r14.v(r8.n, r10.n, r7, new nu(r6, r15, r14, r8, r10, this));
    L9:
        r1 = r16 & (-8589934589L);
        goto L11
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof ou) == false) goto L16;
        ou r4 = (ou) r3;
        if (this.a.equals(r4.a) == true) goto L11;
        return false;
    L11:
        if (this.b == r4.b) goto L14;
        return false;
    L14:
        return true;
    L16:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        return Boolean.hashCode(this.b) + r0;
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ")";
    }
}
