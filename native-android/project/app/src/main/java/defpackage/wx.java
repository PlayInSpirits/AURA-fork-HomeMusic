package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wx {
    public final int a;
    public final String b;
    public final TreeSet c;
    public final ArrayList d;
    public yj0 e;

    public wx(int r1, String r2, yj0 r3) {
        this.a = r1;
        this.b = r2;
        this.e = r3;
        this.c = new TreeSet();
        this.d = new ArrayList();
    }

    public final long a(long r12, long r14) {
        boolean r3 = true;
        if (r12 < 0) goto L5;
        boolean r2 = true;
    L6:
        rr2.l(r2);
        if (r14 >= 0) goto L10;
        r3 = false;
    L10:
        rr2.l(r3);
        te4 r4 = b(r12, r14);
        long r5 = r4.p;
        long r7 = Long.MAX_VALUE;
        if (r4.q == false) goto L13;
        long r9 = r12 + r14;
        if (r9 < 0) goto L21;
        r7 = r9;
    L21:
        long r0 = r4.o + r5;
        if (r0 >= r7) goto L32;
        Iterator r11 = this.c.tailSet(r4, false).iterator();
    L25:
        if (r11.hasNext() == false) goto L32;
        te4 r6 = (te4) r11.next();
        long r8 = r6.o;
        if (r8 > r0) goto L32;
        r0 = Math.max(r0, r8 + r6.p);
        if (r0 < r7) goto L25;
    L32:
        return Math.min(r0 - r12, r14);
    L13:
        if (r5 != (-1)) goto L16;
        r5 = Long.MAX_VALUE;
    L16:
        return -Math.min(r5, r14);
    L5:
        r2 = false;
        goto L6
    }

    public final te4 b(long r22, long r24) {
        long r1 = r24;
        te4 r3 = new te4(this.b, r22, -1, -9223372036854775807L, null);
        TreeSet r4 = this.c;
        te4 r5 = (te4) r4.floor(r3);
        if (r5 != null) goto L5;
    L7:
        te4 r6 = (te4) r4.ceiling(r3);
        if (r6 == null) goto L13;
        long r7 = r6.o - r22;
        if (r1 != (-1)) goto L12;
        r1 = r7;
        goto L13
    L12:
        r1 = Math.min(r7, r1);
    L13:
        String r13 = this.b;
        return new te4(r13, r22, r1, -9223372036854775807L, null);
    L5:
        if ((r5.o + r5.p) <= r22) goto L7;
        return r5;
    }

    public final boolean c(long r10, long r12) {
        int r1 = 0;
    L3:
        ArrayList r2 = this.d;
        if (r1 >= r2.size()) goto L20;
        vx r3 = (vx) r2.get(r1);
        long r4 = r3.a;
        long r5 = r3.b;
        if (r5 != (-1)) goto L11;
        if (r10 < r4) goto L19;
        return true;
    L19:
        r1 = r1 + 1;
        goto L3
    L11:
        if (r12 == (-1)) goto L19;
        if (r4 > r10) goto L19;
        if ((r10 + r12) > (r4 + r5)) goto L19;
        return true;
    L20:
        return false;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L19:
        return false;
    L8:
        if (wx.class != r5.getClass()) goto L19;
        wx r6 = (wx) r5;
        if (this.a != r6.a) goto L19;
        if (this.b.equals(r6.b) == false) goto L19;
        if (this.c.equals(r6.c) == false) goto L19;
        if (this.e.equals(r6.e) == false) goto L19;
        return true;
    }

    public final int hashCode() {
        int r0 = this.a * 31;
        int r1 = f34.e(this.b, r0, 31);
        return this.e.hashCode() + r1;
    }
}
