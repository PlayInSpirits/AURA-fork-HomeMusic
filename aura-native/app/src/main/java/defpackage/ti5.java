package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ti5 extends gi5 {
    public final transient Object q;

    public ti5(Object obj) {
        this.q = obj;
    }

    @Override // defpackage.wh5
    public final int a(Object[] objArr) {
        objArr[0] = this.q;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.q.equals(obj);
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
        Object[] objArr = {this.q};
        for (int i = 0; i < 1; i++) {
            xh5 xh5Var = ei5.o;
            if (objArr[i] == null) {
                nz2.n(f34.f(i, "at index "));
                return null;
            }
        }
        return ei5.i(1, objArr);
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
