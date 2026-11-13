package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class si5 extends oi5 implements Serializable {
    public final oi5 n;

    public si5(oi5 oi5Var) {
        this.n = oi5Var;
    }

    @Override // defpackage.oi5
    public final oi5 a() {
        return this.n;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.n.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof si5) {
            return this.n.equals(((si5) obj).n);
        }
        return false;
    }

    public final int hashCode() {
        return -this.n.hashCode();
    }

    public final String toString() {
        return this.n.toString().concat(".reverse()");
    }
}
