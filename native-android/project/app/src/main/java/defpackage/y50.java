package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y50 implements ui2 {
    public final fs a;

    public y50(fs r1) {
        this.a = r1;
    }

    @Override // defpackage.ui2
    public final vi2 a(cf2 r19, List r20, long r21) {
        int r0 = nc0.i(r21);
        int r1 = nc0.j(r21);
        int r2 = nc0.g(r21);
        int r3 = nc0.h(r21);
        int r5 = r19.V(0.0f);
        jg3[] r6 = new jg3[r20.size()];
        int r7 = r20.size();
        int[] r8 = new int[r7];
        int r10 = 0;
        int r11 = 0;
        int r12 = 0;
        int r13 = 0;
    L3:
        if (r10 >= r7) goto L21;
        pi2 r14 = (pi2) r20.get(r10);
        r14.t();
        int r15 = r2 - r11;
        jg3 r16 = r6[r10];
        if (r16 != null) goto L16;
        int r9 = Integer.MAX_VALUE;
        if (r2 != Integer.MAX_VALUE) goto L10;
        int r17 = r2;
        int[] r22 = r8;
    L9:
        int r4 = 0;
    L14:
        r16 = r14.r(qc0.a(r4, r3, r4, r9));
    L15:
        jg3 r18 = r16;
        int r23 = r18.o;
        int r24 = r18.n;
        r22[r10] = r23;
        int r110 = r15 - r23;
        if (r110 >= 0) goto L20;
        r110 = 0;
    L20:
        r12 = Math.min(r5, r110);
        r11 = r11 + (r23 + r12);
        r13 = Math.max(r13, r24);
        r6[r10] = r18;
        r10 = r10 + 1;
        r8 = r22;
        r2 = r17;
        goto L3
    L10:
        r17 = r2;
        r22 = r8;
        if (r15 >= 0) goto L13;
        r4 = 0;
        r9 = 0;
        goto L14
    L13:
        r9 = r15;
        goto L9
    L16:
        r17 = r2;
        r22 = r8;
        goto L15
    L21:
        int[] r25 = r8;
        int r26 = r11 - r12;
        if (r26 >= 0) goto L24;
        r26 = 0;
    L24:
        int r27 = Math.max(r26, r0);
        int r28 = 0;
        int r29 = Math.max(r13, Math.max(r1, 0));
        int[] r30 = new int[r7];
        int r31 = 0;
        int r32 = 0;
    L25:
        if (r32 >= r7) goto L28;
        int r33 = r25[r32];
        r30[r28] = r31;
        r31 = r31 + r33;
        r32 = r32 + 1;
        r28 = r28 + 1;
        goto L25
    L28:
        return r19.v(r29, r27, v01.n, new x50(r6, this, r29, r19, r30));
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L5;
        return true;
    L5:
        if ((r2 instanceof y50) == true) goto L8;
        return false;
    L8:
        if (this.a.equals(((y50) r2).a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        int r0 = gi.a.hashCode() * 31;
        return Float.hashCode(this.a.a) + r0;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + gi.a + ", horizontalAlignment=" + this.a + ")";
    }
}
