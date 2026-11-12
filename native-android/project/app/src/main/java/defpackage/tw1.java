package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tw1 implements Serializable {
    public static final tw1 p = null;
    public final int[] n;
    public final int o;

    static {
        p = new tw1(new int[0]);
    }

    public tw1(int[] r2) {
        int r0 = r2.length;
        this.n = r2;
        this.o = r0;
    }

    public final int a(int r2) {
        rr2.q(r2, this.o);
        return this.n[r2];
    }

    public final boolean equals(Object r6) {
        if (r6 != this) goto L5;
        return true;
    L5:
        if ((r6 instanceof tw1) == false) goto L14;
        tw1 r7 = (tw1) r6;
        int r0 = r7.o;
        int r2 = this.o;
        if (r2 != r0) goto L14;
        int r1 = 0;
    L11:
        if (r1 >= r2) goto L20;
        if (a(r1) != r7.a(r1)) goto L14;
        r1 = r1 + 1;
        goto L11
    L20:
        return true;
    L14:
        return false;
    }

    public final int hashCode() {
        int r0 = 1;
        int r1 = 0;
    L4:
        if (r1 >= this.o) goto L6;
        r0 = (r0 * 31) + this.n[r1];
        r1 = r1 + 1;
        goto L4
    L6:
        return r0;
    }

    public final String toString() {
        int r0 = this.o;
        if (r0 != 0) goto L6;
        return "[]";
    L6:
        StringBuilder r1 = new StringBuilder(r0 * 5);
        r1.append('[');
        int[] r4 = this.n;
        r1.append(r4[0]);
        int r2 = 1;
    L7:
        if (r2 >= r0) goto L9;
        r1.append(", ");
        r1.append(r4[r2]);
        r2 = r2 + 1;
        goto L7
    L9:
        r1.append(']');
        return r1.toString();
    }
}
