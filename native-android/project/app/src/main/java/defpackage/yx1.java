package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yx1 {
    public final int a;
    public final Object b;

    public yx1(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof yx1) == true) goto L8;
        return false;
    L8:
        yx1 r6 = (yx1) r5;
        if (this.a == r6.a) goto L12;
        return false;
    L12:
        if (h12.c(this.b, r6.b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r0 = Integer.hashCode(this.a) * 31;
        Object r1 = this.b;
        if (r1 != null) goto L5;
        int r2 = 0;
    L7:
        return r0 + r2;
    L5:
        r2 = r1.hashCode();
        goto L7
    }

    public final String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + ')';
    }
}
