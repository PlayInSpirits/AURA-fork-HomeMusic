package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ss4 {
    public static final long b = 0;
    public static final /* synthetic */ int c = 0;
    public final long a;

    static {
        b = l93.c(0, 0);
    }

    public /* synthetic */ ss4(long r1) {
        this.a = r1;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof ss4) == false) goto L11;
        long r0 = ((ss4) r3).a;
        if (this.a == r0) goto L9;
        return false;
    L9:
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long r1 = this.a;
        return b11.n("TextRange(", ", ", (int) (r1 >> 32), (int) (r1 & 4294967295L), ")");
    }
}
