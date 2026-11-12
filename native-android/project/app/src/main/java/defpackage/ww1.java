package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ww1 extends yw1 {
    public final transient int p;
    public final transient int q;
    public final /* synthetic */ yw1 r;

    public ww1(yw1 r1, int r2, int r3) {
        this.r = r1;
        this.p = r2;
        this.q = r3;
    }

    @Override // defpackage.rw1
    public final Object[] d() {
        return this.r.d();
    }

    @Override // defpackage.rw1
    public final int e() {
        return (this.r.f() + this.p) + this.q;
    }

    @Override // defpackage.rw1
    public final int f() {
        return this.r.f() + this.p;
    }

    @Override // defpackage.rw1
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int r2) {
        rr2.q(r2, this.q);
        int r3 = r2 + this.p;
        return this.r.get(r3);
    }

    @Override // defpackage.yw1, defpackage.rw1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return m(0);
    }

    @Override // defpackage.yw1, java.util.List
    public final ListIterator listIterator() {
        return m(0);
    }

    @Override // defpackage.yw1
    public final yw1 r(int r2, int r3) {
        rr2.u(r2, r3, this.q);
        int r0 = this.p;
        yw1 r1 = this.r;
        return r1.r(r2 + r0, r3 + r0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.q;
    }

    @Override // defpackage.yw1, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int r1, int r2) {
        return r(r1, r2);
    }

    @Override // defpackage.yw1, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int r1) {
        return m(r1);
    }
}
