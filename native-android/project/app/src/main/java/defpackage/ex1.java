package defpackage;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ex1 extends o15 {
    public int o;
    public Object p;
    public final /* synthetic */ Iterator q;

    public ex1(o15 r2) {
        super(0);
        this.q = r2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.o <= 0) goto L5;
        return true;
    L5:
        if (this.q.hasNext() == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.o > 0) goto L5;
        p73 r0 = (p73) this.q.next();
        this.p = r0.a;
        this.o = r0.a();
    L5:
        this.o--;
        Object r2 = this.p;
        Objects.requireNonNull(r2);
        return r2;
    }
}
