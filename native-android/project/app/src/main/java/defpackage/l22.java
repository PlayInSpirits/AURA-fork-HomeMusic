package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l22 extends o15 {
    public final Object o;
    public boolean p;

    public l22(Object obj) {
        super(0);
        this.o = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.p;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.p) {
            tb4.k();
            return null;
        }
        this.p = true;
        return this.o;
    }
}
