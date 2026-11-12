package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ku0 implements Comparable {
    public final float n;

    public /* synthetic */ ku0(float r1) {
        this.n = r1;
    }

    public static int a(float r1, float r2) {
        if (Float.isNaN(r1) == false) goto L5;
        return 0;
    L5:
        if (Float.isNaN(r2) == false) goto L8;
        return 0;
    L8:
        return Float.compare(r1, r2);
    }

    public static final boolean b(float r0, float r1) {
        if (Float.compare(r0, r1) != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static String c(float r1) {
        if (Float.isNaN(r1) == false) goto L7;
        return "Dp.Unspecified";
    L7:
        return r1 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r1) {
        float r2 = ((ku0) r1).n;
        return a(this.n, r2);
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof ku0) == false) goto L11;
        float r3 = ((ku0) r2).n;
        if (Float.compare(this.n, r3) == 0) goto L9;
        return false;
    L9:
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.n);
    }

    public final String toString() {
        return c(this.n);
    }
}
