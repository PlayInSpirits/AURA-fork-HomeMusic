package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xb4 {
    public static final xb4 d = null;
    public final long a;
    public final long b;
    public final float c;

    static {
        d = new xb4(e35.c(4278190080L), 0, 0.0f);
    }

    public xb4(long r1, long r3, float r5) {
        this.a = r1;
        this.b = r3;
        this.c = r5;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L5;
        return true;
    L5:
        if ((r5 instanceof xb4) == false) goto L20;
        xb4 r6 = (xb4) r5;
        long r0 = r6.a;
        if (x40.c(this.a, r0) == true) goto L11;
        return false;
    L11:
        if (g83.b(this.b, r6.b) == true) goto L14;
        return false;
    L14:
        if (this.c != r6.c) goto L17;
        return true;
    L17:
        return false;
    L20:
        return false;
    }

    public final int hashCode() {
        int r0 = x40.h;
        int r1 = xa3.b(Long.hashCode(this.a) * 31, 31, this.b);
        return Float.hashCode(this.c) + r1;
    }

    public final String toString() {
        StringBuilder r0 = b11.u("Shadow(color=", x40.h(this.a), ", offset=", g83.g(this.b), ", blurRadius=");
        r0.append(this.c);
        r0.append(")");
        return r0.toString();
    }
}
