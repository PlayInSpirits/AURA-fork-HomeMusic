package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class li5 extends o15 {
    public static final Object p = null;
    public Object o;

    static {
        p = new Object();
    }

    public li5(Object r2) {
        super(1);
        this.o = r2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.o == p) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object r0 = this.o;
        Object r1 = p;
        if (r0 == r1) goto L6;
        this.o = r1;
        return r0;
    L6:
        tb4.k();
        return null;
    }
}
