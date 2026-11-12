package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k02 {
    public static final k02 e = null;
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
        e = new k02(0, 0, 0, 0);
    }

    public k02(int r1, int r2, int r3, int r4) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k02) == true) goto L8;
        return false;
    L8:
        k02 r6 = (k02) r5;
        if (this.a == r6.a) goto L12;
        return false;
    L12:
        if (this.b == r6.b) goto L15;
        return false;
    L15:
        if (this.c == r6.c) goto L18;
        return false;
    L18:
        if (this.d == r6.d) goto L20;
        return false;
    L20:
        return true;
    }

    public final int hashCode() {
        int r0 = Integer.hashCode(this.a) * 31;
        int r1 = f34.d(this.b, r0, 31);
        int r2 = f34.d(this.c, r1, 31);
        return Integer.hashCode(this.d) + r2;
    }

    public final String toString() {
        StringBuilder r0 = b11.t("IntRect.fromLTRB(", ", ", this.a, this.b, ", ");
        r0.append(this.c);
        r0.append(", ");
        r0.append(this.d);
        r0.append(")");
        return r0.toString();
    }
}
