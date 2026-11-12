package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vf3 extends l2 implements Set, Collection, x32 {
    public static final vf3 q;
    public final Object n;
    public final Object o;
    public final nf3 p;

    static {
        fz0 fz0Var = fz0.Z;
        q = new vf3(fz0Var, fz0Var, nf3.p);
    }

    public vf3(Object obj, Object obj2, nf3 nf3Var) {
        this.n = obj;
        this.o = obj2;
        this.p = nf3Var;
    }

    @Override // defpackage.y
    public final int a() {
        return this.p.o;
    }

    @Override // defpackage.y, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.p.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new bh1(this.n, this.p);
    }
}
