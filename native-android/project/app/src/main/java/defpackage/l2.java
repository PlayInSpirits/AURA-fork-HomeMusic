package defpackage;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l2 extends y implements Set {
    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object r4) {
        if (r4 != this) goto L6;
        return true;
    L6:
        if ((r4 instanceof Set) == true) goto L8;
        return false;
    L8:
        Set r5 = (Set) r4;
        if (size() == r5.size()) goto L12;
        return false;
    L12:
        return containsAll(r5);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator<E> r3 = iterator();
        int r1 = 0;
    L4:
        if (r3.hasNext() == false) goto L10;
        Object r2 = r3.next();
        if (r2 == null) goto L8;
        int r4 = r2.hashCode();
    L9:
        r1 = r1 + r4;
        goto L4
    L8:
        r4 = 0;
        goto L9
    L10:
        return r1;
    }
}
