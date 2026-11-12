package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sz2 extends q1 implements vb2 {
    public transient rz2 t;

    @Override // defpackage.q1, defpackage.u1
    public final Map e() {
        Map r0 = this.r;
        if ((r0 instanceof NavigableMap) == false) goto L7;
        return new h1(this, (NavigableMap) r0);
    L7:
        if ((r0 instanceof SortedMap) == false) goto L11;
        return new k1(this, (SortedMap) r0);
    L11:
        return new f1(this, r0);
    }

    @Override // defpackage.q1, defpackage.u1
    public final Set g() {
        Map r0 = this.r;
        if ((r0 instanceof NavigableMap) == false) goto L7;
        return new i1(this, (NavigableMap) r0);
    L7:
        if ((r0 instanceof SortedMap) == false) goto L11;
        return new l1(this, (SortedMap) r0);
    L11:
        return new g1(this, r0);
    }

    @Override // defpackage.q1, defpackage.qz2
    public final Collection get(Object r1) {
        return (List) super.get(r1);
    }

    @Override // defpackage.q1
    public final Collection i() {
        return (List) this.t.get();
    }

    @Override // defpackage.q1
    public final Collection k(Object r3, Collection r4) {
        List r5 = (List) r4;
        if ((r5 instanceof RandomAccess) == false) goto L7;
        return new j1(this, r3, r5, null);
    L7:
        return new o1(this, r3, r5, null);
    }
}
