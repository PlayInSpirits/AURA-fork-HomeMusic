package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class tn3 {
    public final int a;

    public /* synthetic */ tn3(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tn3) {
            return this.a == ((tn3) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return b11.j(this.a, "PointerKeyboardModifiers(packedValue=", ")");
    }
}
