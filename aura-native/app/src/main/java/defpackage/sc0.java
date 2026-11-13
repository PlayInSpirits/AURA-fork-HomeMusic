package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class sc0 extends tc0 {
    public final int a;

    public sc0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sc0) && this.a == ((sc0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "ConstraintsNotMet(reason=" + this.a + ')';
    }
}
