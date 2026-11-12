package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b6 {
    public int a;
    public int b;
    public Object c;
    public int d;

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
    L34:
        return true;
    L6:
        if ((r4 instanceof b6) == false) goto L35;
        b6 r5 = (b6) r4;
        int r1 = this.a;
        if (r1 == r5.a) goto L12;
        return false;
    L12:
        if (r1 != 8) goto L21;
        if (Math.abs(this.d - this.b) != 1) goto L21;
        if (this.d != r5.b) goto L21;
        if (this.b == r5.d) goto L34;
    L21:
        if (this.d == r5.d) goto L24;
        return false;
    L24:
        if (this.b != r5.b) goto L38;
        Object r3 = this.c;
        Object r6 = r5.c;
        if (r3 != null) goto L29;
        if (r6 == null) goto L34;
        return false;
    L29:
        if (r3.equals(r6) == true) goto L34;
        return false;
    L38:
        return false;
    L35:
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(Integer.toHexString(System.identityHashCode(this)));
        r0.append("[");
        int r1 = this.a;
        if (r1 != 1) goto L5;
        String r2 = "add";
    L15:
        r0.append(r2);
        r0.append(",s:");
        r0.append(this.b);
        r0.append("c:");
        r0.append(this.d);
        r0.append(",p:");
        r0.append(this.c);
        r0.append("]");
        return r0.toString();
    L5:
        if (r1 != 2) goto L7;
        r2 = "rm";
        goto L15
    L7:
        if (r1 != 4) goto L9;
        r2 = "up";
        goto L15
    L9:
        if (r1 == 8) goto L11;
        r2 = "??";
        goto L15
    L11:
        r2 = "mv";
        goto L15
    }
}
