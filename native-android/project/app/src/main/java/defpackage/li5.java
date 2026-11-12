package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class li5 extends o15 {
    public static final Object p = new Object();
    public Object o;

    public li5(Object obj) {
        super(1);
        this.o = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.o != p;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.o;
        Object obj2 = p;
        if (obj != obj2) {
            this.o = obj2;
            return obj;
        }
        tb4.k();
        return null;
    }
}
