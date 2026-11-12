package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oh5 extends bb3 {
    public static final oh5 n = null;

    static {
        n = new oh5();
    }

    @Override // defpackage.bb3
    public final Object c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.bb3
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object r1) {
        if (r1 != this) goto L5;
        return true;
    L5:
        return false;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
