package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class vh5 extends oi5 implements Serializable {
    public final Comparator n;

    public vh5(Comparator comparator) {
        comparator.getClass();
        this.n = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.n.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vh5) {
            return this.n.equals(((vh5) obj).n);
        }
        return false;
    }

    public final int hashCode() {
        return this.n.hashCode();
    }

    public final String toString() {
        return this.n.toString();
    }
}
