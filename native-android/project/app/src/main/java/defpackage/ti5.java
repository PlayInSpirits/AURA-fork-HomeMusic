package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ti5 extends gi5 {
    public final transient Object q;

    public ti5(Object r1) {
        this.q = r1;
    }

    @Override // defpackage.wh5
    public final int a(Object[] r2) {
        r2[0] = this.q;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object r1) {
        return this.q.equals(r1);
    }

    @Override // defpackage.wh5
    public final o15 e() {
        return new li5(this.q);
    }

    @Override // defpackage.gi5, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.q.hashCode();
    }

    @Override // defpackage.gi5
    public final ei5 i() {
        Object[] r2 = {this.q};
        int r0 = 0;
    L4:
        if (r0 >= 1) goto L11;
        xh5 r1 = ei5.o;
        if (r2[r0] == null) goto L8;
        r0 = r0 + 1;
        goto L4
    L8:
        nz2.n(f34.f(r0, "at index "));
        return null;
    L11:
        return ei5.i(1, r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new li5(this.q);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return xa3.h("[", this.q.toString(), "]");
    }
}
