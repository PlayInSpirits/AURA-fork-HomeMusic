package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nf4 extends jx1 {
    public final transient Object q;

    public nf4(Object obj) {
        obj.getClass();
        this.q = obj;
    }

    @Override // defpackage.jx1, defpackage.rw1
    public final yw1 a() {
        return yw1.o(this.q);
    }

    @Override // defpackage.rw1
    public final int b(int i, Object[] objArr) {
        objArr[i] = this.q;
        return i + 1;
    }

    @Override // defpackage.rw1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.q.equals(obj);
    }

    @Override // defpackage.rw1
    public final boolean g() {
        return false;
    }

    @Override // defpackage.rw1
    /* JADX INFO: renamed from: h */
    public final o15 iterator() {
        return new l22(this.q);
    }

    @Override // defpackage.jx1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.q.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.q.toString() + ']';
    }
}
