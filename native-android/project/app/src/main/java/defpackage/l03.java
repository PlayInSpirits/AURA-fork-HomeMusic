package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l03 {
    public long[] a;
    public int b;

    public l03(int r1) {
        if (r1 != 0) goto L5;
        long[] r2 = we2.a;
    L6:
        this.a = r2;
        return;
    L5:
        r2 = new long[r1];
        goto L6
    }

    public final void a(long r4) {
        int r0 = this.b + 1;
        long[] r1 = this.a;
        if (r1.length >= r0) goto L5;
        this.a = Arrays.copyOf(r1, Math.max(r0, (r1.length * 3) / 2));
    L5:
        long[] r2 = this.a;
        int r3 = this.b;
        r2[r3] = r4;
        this.b = r3 + 1;
    }

    public final boolean equals(Object r8) {
        if ((r8 instanceof l03) == false) goto L16;
        l03 r9 = (l03) r8;
        int r0 = r9.b;
        int r2 = this.b;
        if (r0 != r2) goto L16;
        long[] r7 = this.a;
        long[] r10 = r9.a;
        j02 r1 = gb.g0(0, r2);
        int r3 = r1.n;
        int r4 = r1.o;
        if (r3 <= r4) goto L10;
        return true;
    L10:
        if (r7[r3] != r10[r3]) goto L11;
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
        long[] r0 = this.a;
        int r5 = this.b;
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r5) goto L5;
        r2 = r2 + (Long.hashCode(r0[r1]) * 31);
        r1 = r1 + 1;
        goto L3
    L5:
        return r2;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("[");
        long[] r1 = this.a;
        int r6 = this.b;
        int r2 = 0;
    L3:
        if (r2 >= r6) goto L10;
        long r3 = r1[r2];
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

    public /* synthetic */ l03() {
        this(16);
    }
}
