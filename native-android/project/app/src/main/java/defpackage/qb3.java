package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qb3 {
    public final long a;
    public final ac3 b;

    public qb3() {
        long r0 = e35.c(4284900966L);
        ac3 r2 = q05.b(3);
        this.a = r0;
        this.b = r2;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L5;
        return true;
    L5:
        if (r8 == null) goto L7;
        Class<?> r1 = r8.getClass();
    L9:
        if (qb3.class.equals(r1) == true) goto L11;
        return false;
    L11:
        r8.getClass();
        qb3 r9 = (qb3) r8;
        if (x40.c(this.a, r9.a) == true) goto L15;
        return false;
    L15:
        if (h12.c(this.b, r9.b) == true) goto L17;
        return false;
    L17:
        return true;
    L7:
        r1 = null;
        goto L9
    }

    public final int hashCode() {
        int r0 = x40.h;
        int r1 = Long.hashCode(this.a) * 31;
        return this.b.hashCode() + r1;
    }

    public final String toString() {
        return "OverscrollConfiguration(glowColor=" + x40.h(this.a) + ", drawPadding=" + this.b + ")";
    }
}
