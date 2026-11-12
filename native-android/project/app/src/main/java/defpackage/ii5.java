package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ii5 extends gi5 {
    public final /* synthetic */ ji5 q;

    public ii5(ji5 r1) {
        this.q = r1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object r3) {
        if ((r3 instanceof Map.Entry) == false) goto L10;
        Map.Entry r4 = (Map.Entry) r3;
        Object r2 = this.q.get(r4.getKey());
        if (r2 == null) goto L10;
        if (r2.equals(r4.getValue()) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.wh5
    public final o15 e() {
        return i().k(0);
    }

    @Override // defpackage.gi5, java.util.Collection, java.util.Set
    public final int hashCode() {
        return gh0.M(this.q.a());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return i().k(0);
    }

    @Override // defpackage.gi5
    public final ei5 j() {
        return new hi5(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.q.q.size();
    }
}
