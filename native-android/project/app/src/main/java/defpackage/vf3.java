package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vf3 extends l2 implements Set, Collection, x32 {
    public static final vf3 q = null;
    public final Object n;
    public final Object o;
    public final nf3 p;

    static {
        fz0 r1 = fz0.Z;
        q = new vf3(r1, r1, nf3.p);
    }

    public vf3(Object r1, Object r2, nf3 r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    @Override // defpackage.y
    public final int a() {
        return this.p.o;
    }

    @Override // defpackage.y, java.util.Collection, java.util.List
    public final boolean contains(Object r1) {
        return this.p.containsKey(r1);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new bh1(this.n, this.p);
    }
}
