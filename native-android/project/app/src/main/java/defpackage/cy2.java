package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cy2 {
    public final long a;
    public final long b;
    public final boolean c;

    public cy2(long r1, long r3, boolean r5) {
        this.a = r1;
        this.b = r3;
        this.c = r5;
    }

    public final cy2 a(cy2 r8) {
        return new cy2(g83.e(this.a, r8.a), Math.max(this.b, r8.b), this.c);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L5;
        return true;
    L5:
        if ((r5 instanceof cy2) == false) goto L19;
        cy2 r6 = (cy2) r5;
        if (g83.b(this.a, r6.a) == true) goto L11;
        return false;
    L11:
        if (this.b == r6.b) goto L14;
        return false;
    L14:
        if (this.c == r6.c) goto L17;
        return false;
    L17:
        return true;
    L19:
        return false;
    }

    public final int hashCode() {
        int r0 = xa3.b(Long.hashCode(this.a) * 31, 31, this.b);
        return Boolean.hashCode(this.c) + r0;
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + g83.g(this.a) + ", timeMillis=" + this.b + ", shouldApplyImmediately=" + this.c + ")";
    }
}
