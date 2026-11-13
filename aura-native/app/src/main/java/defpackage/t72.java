package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class t72 {
    public final String a;

    public t72(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t72) {
            return this.a.equals(((t72) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b11.q(new StringBuilder("StringHeaderFactory{value='"), this.a, "'}");
    }
}
