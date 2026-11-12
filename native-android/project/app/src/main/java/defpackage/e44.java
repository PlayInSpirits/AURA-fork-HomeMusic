package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e44 extends h44 implements Iterator {
    public f44 n;
    public f44 o;

    @Override // defpackage.h44
    public final void a(f44 r3) {
        f44 r1 = null;
        if (this.n == r3) goto L5;
    L7:
        f44 r0 = this.n;
        if (r0 != r3) goto L10;
        this.n = r0.q;
    L10:
        f44 r2 = this.o;
        if (r2 != r3) goto L19;
        f44 r4 = this.n;
        if (r2 == r4) goto L17;
        if (r4 == null) goto L17;
        r1 = r2.p;
    L17:
        this.o = r1;
        return;
    L19:
        return;
    L5:
        if (r3 != this.o) goto L7;
        this.o = null;
        this.n = null;
        goto L7
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.o == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        f44 r0 = this.o;
        f44 r1 = this.n;
        if (r0 == r1) goto L7;
        if (r1 == null) goto L7;
        f44 r2 = r0.p;
    L8:
        this.o = r2;
        return r0;
    L7:
        r2 = null;
        goto L8
    }
}
