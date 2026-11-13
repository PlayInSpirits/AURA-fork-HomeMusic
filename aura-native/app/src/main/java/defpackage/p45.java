package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class p45 implements fe {
    public final String a;

    public p45(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p45) {
            return this.a.equals(((p45) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return xa3.h("VerbatimTtsAnnotation(verbatim=", this.a, ")");
    }
}
