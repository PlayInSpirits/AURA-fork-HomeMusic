package defpackage;

import java.util.AbstractMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hi5 extends ei5 {
    public final /* synthetic */ ii5 p;

    public hi5(ii5 r1) {
        this.p = r1;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int r3) {
        ji5 r2 = this.p.q;
        return new AbstractMap.SimpleImmutableEntry(r2.p.s.get(r3), r2.q.get(r3));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.p.q.q.size();
    }
}
