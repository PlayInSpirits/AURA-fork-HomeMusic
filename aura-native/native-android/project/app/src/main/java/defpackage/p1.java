package defpackage;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 extends m1 implements Set {
    public final /* synthetic */ nl1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(nl1 nl1Var, Object obj, Set set) {
        super(nl1Var, obj, set, null);
        this.s = nl1Var;
    }

    @Override // defpackage.m1, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zL = j51.L((Set) this.o, collection);
        if (zL) {
            this.s.s += this.o.size() - size;
            d();
        }
        return zL;
    }
}
