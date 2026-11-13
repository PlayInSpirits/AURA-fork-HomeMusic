package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class mc2 extends nc2 {
    public final oh0 a = oh0.b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mc2.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((mc2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (mc2.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}
