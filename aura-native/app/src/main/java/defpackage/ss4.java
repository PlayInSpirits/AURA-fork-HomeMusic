package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ss4 {
    public static final long b = l93.c(0, 0);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public /* synthetic */ ss4(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ss4) {
            return this.a == ((ss4) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long j = this.a;
        return b11.n("TextRange(", ", ", (int) (j >> 32), (int) (j & 4294967295L), ")");
    }
}
