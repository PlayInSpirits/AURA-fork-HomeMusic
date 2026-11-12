package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class so3 implements ro3, Serializable {
    public final List n;

    public so3(List r1) {
        this.n = r1;
    }

    @Override // defpackage.ro3
    public final boolean apply(Object r5) {
        int r1 = 0;
    L3:
        List r2 = this.n;
        if (r1 >= r2.size()) goto L9;
        if (((ro3) r2.get(r1)).apply(r5) == false) goto L7;
        r1 = r1 + 1;
        goto L3
    L7:
        return false;
    L9:
        return true;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof so3) == true) goto L5;
        return false;
    L5:
        return this.n.equals(((so3) r2).n);
    }

    public final int hashCode() {
        return this.n.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("Predicates.and(");
        Iterator r3 = this.n.iterator();
        boolean r1 = true;
    L4:
        if (r3.hasNext() == false) goto L9;
        Object r2 = r3.next();
        if (r1 == true) goto L8;
        r0.append(',');
    L8:
        r0.append(r2);
        r1 = false;
        goto L4
    L9:
        r0.append(')');
        return r0.toString();
    }
}
