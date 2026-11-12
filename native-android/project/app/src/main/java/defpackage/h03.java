package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h03 {
    public int[] a;
    public int b;

    public h03(int r1) {
        if (r1 != 0) goto L5;
        int[] r2 = m02.a;
    L6:
        this.a = r2;
        return;
    L5:
        r2 = new int[r1];
        goto L6
    }

    public final void a(int r4) {
        int r0 = this.b + 1;
        int[] r1 = this.a;
        if (r1.length >= r0) goto L5;
        this.a = Arrays.copyOf(r1, Math.max(r0, (r1.length * 3) / 2));
    L5:
        int[] r2 = this.a;
        int r3 = this.b;
        r2[r3] = r4;
        this.b = r3 + 1;
    }

    public final int b(int r2) {
        if (r2 >= 0) goto L4;
    L7:
        kf2.h("Index must be between 0 and size");
        return 0;
    L4:
        if (r2 >= this.b) goto L7;
        return this.a[r2];
    }

    public final void c(int r4) {
        if (r4 < 0) goto L10;
        int r0 = this.b;
        if (r4 >= r0) goto L10;
        int[] r1 = this.a;
        int r2 = r1[r4];
        if (r4 == (r0 - 1)) goto L8;
        ti.Y(r4, r4 + 1, r0, r1, r1);
    L8:
        this.b--;
        return;
    L10:
        kf2.h("Index must be between 0 and size");
    }

    public final void d(int r2, int r3) {
        if (r2 >= 0) goto L4;
    L7:
        kf2.h("Index must be between 0 and size");
        return;
    L4:
        if (r2 >= this.b) goto L7;
        int[] r1 = this.a;
        int r0 = r1[r2];
        r1[r2] = r3;
    }

    public final boolean equals(Object r6) {
        if ((r6 instanceof h03) == false) goto L16;
        h03 r7 = (h03) r6;
        int r0 = r7.b;
        int r2 = this.b;
        if (r0 != r2) goto L16;
        int[] r5 = this.a;
        int[] r8 = r7.a;
        j02 r1 = gb.g0(0, r2);
        int r3 = r1.n;
        int r4 = r1.o;
        if (r3 <= r4) goto L10;
        return true;
    L10:
        if (r5[r3] != r8[r3]) goto L11;
        if (r3 == r4) goto L19;
        r3 = r3 + 1;
        goto L10
    L19:
        return true;
    L11:
        return false;
    L16:
        return false;
    }

    public final int hashCode() {
        int[] r0 = this.a;
        int r4 = this.b;
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r4) goto L5;
        r2 = r2 + (Integer.hashCode(r0[r1]) * 31);
        r1 = r1 + 1;
        goto L3
    L5:
        return r2;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("[");
        int[] r1 = this.a;
        int r5 = this.b;
        int r2 = 0;
    L3:
        if (r2 >= r5) goto L10;
        int r3 = r1[r2];
        if (r2 == (-1)) goto L6;
        if (r2 == 0) goto L9;
        r0.append(", ");
    L9:
        r0.append(r3);
        r2 = r2 + 1;
        goto L3
    L6:
        r0.append("...");
    L12:
        return r0.toString();
    L10:
        r0.append("]");
        goto L12
    }

    public /* synthetic */ h03() {
        this(16);
    }
}
