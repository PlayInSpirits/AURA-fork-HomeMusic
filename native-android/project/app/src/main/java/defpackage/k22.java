package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum k22 extends Enum implements Iterator {
    public static final k22 n = null;
    public static final /* synthetic */ k22[] o = null;

    static {
        k22 r0 = new k22("INSTANCE", 0);
        n = r0;
        o = new k22[]{r0};
    }

    public static k22 valueOf(String r1) {
        return (k22) Enum.valueOf(k22.class, r1);
    }

    public static k22[] values() {
        return (k22[]) o.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        rr2.v("no calls to next() since the last call to remove()", false);
    }
}
