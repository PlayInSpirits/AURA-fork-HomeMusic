package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s80 implements da4 {
    public final gy3 n;
    public long o;

    public s80(List r6, List r7) {
        uw1 r0 = yw1.j();
        int r3 = 0;
        if (r6.size() != r7.size()) goto L5;
        boolean r1 = true;
    L6:
        rr2.l(r1);
    L8:
        if (r3 >= r6.size()) goto L10;
        r0.c(new r80((da4) r6.get(r3), (List) r7.get(r3)));
        r3 = r3 + 1;
        goto L8
    L10:
        this.n = r0.f();
        this.o = -9223372036854775807L;
        return;
    L5:
        r1 = false;
        goto L6
    }

    @Override // defpackage.da4
    public final long d() {
        int r2 = 0;
        long r3 = Long.MAX_VALUE;
    L3:
        gy3 r5 = this.n;
        if (r2 >= r5.q) goto L10;
        long r6 = ((r80) r5.get(r2)).n.d();
        if (r6 == Long.MIN_VALUE) goto L8;
        r3 = Math.min(r3, r6);
    L8:
        r2 = r2 + 1;
        goto L3
    L10:
        if (r3 != Long.MAX_VALUE) goto L12;
        return Long.MIN_VALUE;
    L12:
        return r3;
    }

    @Override // defpackage.da4
    public final boolean f() {
        int r1 = 0;
    L3:
        gy3 r2 = this.n;
        if (r1 >= r2.q) goto L10;
        if (((r80) r2.get(r1)).n.f() == true) goto L7;
        r1 = r1 + 1;
        goto L3
    L7:
        return true;
    L10:
        return false;
    }

    @Override // defpackage.da4
    public final boolean o(pd2 r14) {
        boolean r1 = false;
    L3:
        long r2 = d();
        if (r2 == Long.MIN_VALUE) goto L5;
        int r6 = 0;
        boolean r7 = false;
    L7:
        gy3 r8 = this.n;
        if (r6 >= r8.q) goto L20;
        long r9 = ((r80) r8.get(r6)).n.d();
        if (r9 != Long.MIN_VALUE) goto L12;
    L14:
        boolean r11 = false;
    L16:
        if (r9 == r2) goto L18;
        if (r11 == true) goto L18;
    L19:
        r6 = r6 + 1;
    L18:
        r7 = r7 | ((r80) r8.get(r6)).n.o(r14);
        goto L19
    L12:
        if (r9 > r14.a) goto L14;
        r11 = true;
        goto L16
    L20:
        r1 = r1 | r7;
        if (r7 == true) goto L3;
        return r1;
    L5:
        return r1;
    }

    @Override // defpackage.da4
    public final long q() {
        int r2 = 0;
        long r3 = Long.MAX_VALUE;
        long r5 = Long.MAX_VALUE;
    L3:
        gy3 r7 = this.n;
        if (r2 >= r7.q) goto L19;
        r80 r8 = (r80) r7.get(r2);
        long r11 = r8.n.q();
        yw1 r9 = r8.o;
        if (r9.contains(1) == true) goto L12;
        if (r9.contains(2) == true) goto L12;
        if (r9.contains(4) == true) goto L12;
    L15:
        if (r11 == Long.MIN_VALUE) goto L17;
        r5 = Math.min(r5, r11);
    L17:
        r2 = r2 + 1;
    L12:
        if (r11 == Long.MIN_VALUE) goto L15;
        r3 = Math.min(r3, r11);
        goto L15
    L19:
        if (r3 == Long.MAX_VALUE) goto L23;
        this.o = r3;
        return r3;
    L23:
        if (r5 == Long.MAX_VALUE) goto L28;
        long r0 = this.o;
        if (r0 == (-9223372036854775807L)) goto L27;
        return r0;
    L27:
        return r5;
    L28:
        return Long.MIN_VALUE;
    }

    @Override // defpackage.da4
    public final void u(long r4) {
        int r0 = 0;
    L3:
        gy3 r1 = this.n;
        if (r0 >= r1.q) goto L6;
        ((r80) r1.get(r0)).u(r4);
        r0 = r0 + 1;
        goto L3
    }
}
