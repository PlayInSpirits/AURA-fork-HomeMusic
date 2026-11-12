package defpackage;

import java.util.AbstractMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hi5 extends ei5 {
    public final /* synthetic */ ii5 p;

    public hi5(ii5 ii5Var) {
        this.p = ii5Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        ji5 ji5Var = this.p.q;
        return new AbstractMap.SimpleImmutableEntry(ji5Var.p.s.get(i), ji5Var.q.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.p.q.q.size();
    }
}
