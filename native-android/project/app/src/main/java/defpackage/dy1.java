package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dy1 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof dy1) {
            return this.a == ((dy1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return b11.j(this.a, "IndirectPointerEventPrimaryDirectionalMotionAxis(value=", ")");
    }
}
