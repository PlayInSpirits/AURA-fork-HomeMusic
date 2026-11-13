package defpackage;

import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class so3 implements ro3, Serializable {
    public final List n;

    public so3(List list) {
        this.n = list;
    }

    @Override // defpackage.ro3
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.n;
            if (i >= list.size()) {
                return true;
            }
            if (!((ro3) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof so3) {
            return this.n.equals(((so3) obj).n);
        }
        return false;
    }

    public final int hashCode() {
        return this.n.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.n) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
