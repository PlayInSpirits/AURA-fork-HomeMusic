package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mi implements Iterator, Map.Entry {
    public int n;
    public int o;
    public boolean p;
    public final /* synthetic */ oi q;

    public mi(oi r1) {
        this.q = r1;
        this.n = r1.p - 1;
        this.o = -1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object r5) {
        if (this.p == true) goto L5;
        kf2.o("This container does not support retaining Map.Entry objects");
        return false;
    L5:
        if ((r5 instanceof Map.Entry) == false) goto L13;
        Map.Entry r6 = (Map.Entry) r5;
        Object r0 = r6.getKey();
        int r2 = this.o;
        oi r3 = this.q;
        if (h12.c(r0, r3.f(r2)) == false) goto L13;
        if (h12.c(r6.getValue(), r3.j(this.o)) == false) goto L13;
        return true;
    L13:
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.p == true) goto L5;
        kf2.o("This container does not support retaining Map.Entry objects");
        return null;
    L5:
        return this.q.f(this.o);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.p == true) goto L5;
        kf2.o("This container does not support retaining Map.Entry objects");
        return null;
    L5:
        return this.q.j(this.o);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.o >= this.n) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int r1 = 0;
        if (this.p == false) goto L13;
        int r0 = this.o;
        oi r2 = this.q;
        Object r3 = r2.f(r0);
        Object r4 = r2.j(this.o);
        if (r3 != null) goto L7;
        int r5 = 0;
    L8:
        if (r4 == null) goto L12;
        r1 = r4.hashCode();
    L12:
        return r5 ^ r1;
    L7:
        r5 = r3.hashCode();
        goto L8
    L13:
        kf2.o("This container does not support retaining Map.Entry objects");
        return 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext() == false) goto L6;
        this.o++;
        this.p = true;
        return this;
    L6:
        tb4.k();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.p == false) goto L6;
        this.q.h(this.o);
        this.o--;
        this.n--;
        this.p = false;
        return;
    L6:
        tb4.a();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object r2) {
        if (this.p == true) goto L5;
        kf2.o("This container does not support retaining Map.Entry objects");
        return null;
    L5:
        return this.q.i(this.o, r2);
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
