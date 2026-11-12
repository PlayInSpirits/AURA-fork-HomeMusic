package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ku0 implements Comparable {
    public final float n;

    public static int a(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    public static final boolean b(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static String c(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return a(this.n, ((ku0) obj).n);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ku0) {
            return Float.compare(this.n, ((ku0) obj).n) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.n);
    }

    public final String toString() {
        return c(this.n);
    }
}
