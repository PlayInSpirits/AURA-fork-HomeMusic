package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mt2 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public mt2(Object r1, int r2, int r3, long r4, int r6) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r6;
    }

    public final mt2 a(Object r9) {
        if (this.a.equals(r9) == false) goto L5;
        return this;
    L5:
        long r5 = this.d;
        int r7 = this.e;
        return new mt2(r9, this.b, this.c, r5, r7);
    }

    public final boolean b() {
        if (this.b == (-1)) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof mt2) == true) goto L8;
        return false;
    L8:
        mt2 r9 = (mt2) r8;
        if (this.a.equals(r9.a) == true) goto L11;
    L19:
        return false;
    L11:
        if (this.b != r9.b) goto L19;
        if (this.c != r9.c) goto L19;
        if (this.d != r9.d) goto L19;
        if (this.e != r9.e) goto L19;
        return true;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public mt2(long r8, Object r10) {
        this(r10, -1, -1, r8, -1);
    }

    public mt2(Object r8, long r9, int r11) {
        this(r8, -1, -1, r9, r11);
    }

    public mt2(Object r3) {
        this(-1, r3);
    }
}
