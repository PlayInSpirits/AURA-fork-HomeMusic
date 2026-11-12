package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mg0 implements qn4 {
    public static final kw p = null;
    public final yw1 n;
    public final long[] o;

    static {
        x13 r0 = x13.o;
        p = new kw(new kf2(27), r0);
    }

    public mg0(gy3 r19) {
        int r2 = r19.q;
        long r6 = -9223372036854775807L;
        int r8 = 0;
        if (r2 != 1) goto L27;
        vw1 r1 = r19.m(0);
        Object r3 = r1.next();
        if (r1.hasNext() == true) goto L16;
        lg0 r4 = (lg0) r3;
        long r10 = r4.b;
        long r12 = r4.c;
        if (r10 != (-9223372036854775807L)) goto L9;
        long r5 = 0;
    L10:
        yw1 r7 = r4.a;
        if (r12 != (-9223372036854775807L)) goto L14;
        this.n = yw1.o(r7);
        this.o = new long[]{r5};
        return;
    L14:
        vw1 r9 = yw1.o;
        this.n = yw1.p(r7, gy3.r);
        this.o = new long[]{r5, r12 + r5};
        return;
    L9:
        r5 = r10;
        goto L10
    L16:
        StringBuilder r0 = new StringBuilder("expected one element but was: <");
        r0.append(r3);
    L18:
        if (r8 >= 4) goto L23;
        if (r1.hasNext() == false) goto L23;
        r0.append(", ");
        r0.append(r1.next());
        r8 = r8 + 1;
    L23:
        if (r1.hasNext() == false) goto L25;
        r0.append(", ...");
    L25:
        r0.append('>');
        throw new IllegalArgumentException(r0.toString());
    L27:
        long[] r11 = new long[r2 * 2];
        this.o = r11;
        Arrays.fill(r11, Long.MAX_VALUE);
        ArrayList r13 = new ArrayList();
        gy3 r14 = yw1.q(p, r19);
        int r15 = 0;
    L29:
        if (r8 >= r14.q) goto L48;
        lg0 r16 = (lg0) r14.get(r8);
        long r17 = r16.b;
        long r18 = r16.c;
        yw1 r20 = r16.a;
        if (r17 != r6) goto L33;
        r17 = 0;
    L33:
        long r110 = r17 + r18;
        if (r15 == 0) goto L43;
        int r21 = r15 - 1;
        long r111 = this.o[r21];
        if (r111 < r17) goto L43;
        if (r111 == r17) goto L40;
    L42:
        l93.q0("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
        this.o[r21] = r17;
        r13.set(r21, r20);
    L45:
        if (r18 == r6) goto L47;
        this.o[r15] = r110;
        r13.add(gy3.r);
        r15 = r15 + 1;
    L47:
        r8 = r8 + 1;
        r6 = r6;
        goto L29
    L40:
        if (((yw1) r13.get(r21)).isEmpty() == false) goto L42;
        r13.set(r21, r20);
    L43:
        this.o[r15] = r17;
        r13.add(r20);
        r15 = r15 + 1;
        goto L45
    L48:
        this.n = yw1.k(r13);
    }

    @Override // defpackage.qn4
    public final int e(long r3) {
        int r4 = f35.b(this.o, r3, false);
        if (r4 >= this.n.size()) goto L5;
        return r4;
    L5:
        return -1;
    }

    @Override // defpackage.qn4
    public final long k(int r3) {
        if (r3 >= this.n.size()) goto L5;
        boolean r0 = true;
    L6:
        rr2.l(r0);
        return this.o[r3];
    L5:
        r0 = false;
        goto L6
    }

    @Override // defpackage.qn4
    public final List m(long r3) {
        int r4 = f35.f(this.o, r3, false);
        if (r4 != (-1)) goto L7;
        vw1 r2 = yw1.o;
        return gy3.r;
    L7:
        return (yw1) this.n.get(r4);
    }

    @Override // defpackage.qn4
    public final int n() {
        return this.n.size();
    }
}
