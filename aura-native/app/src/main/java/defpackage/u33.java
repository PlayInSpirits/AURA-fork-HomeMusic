package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class u33 {
    public final List a;
    public final int b;

    public u33(List list, int i) {
        this.a = list;
        this.b = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        StringBuilder j = f34.j(i, "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", "', bounds = '");
        j.append(gb.C(list));
        j.append("'.");
        throw new IllegalArgumentException(j.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u33.class != obj.getClass()) {
            return false;
        }
        u33 u33Var = (u33) obj;
        return this.b == u33Var.b && h12.c(this.a, u33Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.b + ", mergedHistory=" + this.a + ')';
    }

    public u33() {
        this(u01.n, -1);
    }
}
