package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u33 {
    public final List a;
    public final int b;

    public u33(List r2, int r3) {
        this.a = r2;
        this.b = r3;
        if (r2.isEmpty() == false) goto L7;
        if (r3 != (-1)) goto L7;
        return;
    L7:
        if (r2.isEmpty() == true) goto L12;
        int r1 = r2.size();
        if (r3 < 0) goto L12;
        if (r3 >= r1) goto L12;
        return;
    L12:
        StringBuilder r4 = f34.j(r3, "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", "', bounds = '");
        r4.append(gb.C(r2));
        r4.append("'.");
        throw new IllegalArgumentException(r4.toString().toString());
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L17:
        return false;
    L8:
        if (u33.class != r5.getClass()) goto L17;
        u33 r6 = (u33) r5;
        if (this.b == r6.b) goto L14;
        return false;
    L14:
        if (h12.c(this.a, r6.a) == true) goto L16;
        return false;
    L16:
        return true;
    }

    public final int hashCode() {
        int r0 = this.b * 31;
        return this.a.hashCode() + r0;
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.b + ", mergedHistory=" + this.a + ')';
    }

    public u33() {
        this(u01.n, -1);
    }
}
