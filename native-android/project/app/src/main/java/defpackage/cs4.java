package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cs4 {
    public static final cs4 c = null;
    public final long a;
    public final long b;

    static {
        c = new cs4(su3.v(0), su3.v(0));
    }

    public cs4(long r1, long r3) {
        this.a = r1;
        this.b = r3;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof cs4) == true) goto L8;
        return false;
    L8:
        cs4 r9 = (cs4) r8;
        long r3 = r9.a;
        if (bt4.a(this.a, r3) == true) goto L12;
        return false;
    L12:
        if (bt4.a(this.b, r9.b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        ct4[] r0 = bt4.b;
        int r1 = Long.hashCode(this.a) * 31;
        return Long.hashCode(this.b) + r1;
    }

    public final String toString() {
        return f34.h("TextIndent(firstLine=", bt4.d(this.a), ", restLine=", bt4.d(this.b), ")");
    }
}
