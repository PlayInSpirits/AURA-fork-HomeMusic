package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sx2 {
    public final long a;

    public /* synthetic */ sx2(long r1) {
        this.a = r1;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof sx2) == false) goto L11;
        long r0 = ((sx2) r3).a;
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
        return "IndirectPointerEventData(packedValue=" + this.a + ")";
    }
}
