package defpackage;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 extends m1 implements Set {
    public final /* synthetic */ nl1 s;

    public p1(nl1 r2, Object r3, Set r4) {
        this.s = r2;
        super(r2, r3, r4, null);
    }

    @Override // defpackage.m1, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection r4) {
        if (r4.isEmpty() == false) goto L6;
        return false;
    L6:
        int r0 = size();
        boolean r5 = j51.L((Set) this.o, r4);
        if (r5 == false) goto L9;
        this.s.s += this.o.size() - r0;
        d();
    L9:
        return r5;
    }
}
