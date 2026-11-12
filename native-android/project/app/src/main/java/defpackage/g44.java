package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g44 extends h44 implements Iterator {
    public f44 n;
    public boolean o;
    public final /* synthetic */ i44 p;

    public g44(i44 r1) {
        this.p = r1;
        this.o = true;
    }

    @Override // defpackage.h44
    public final void a(f44 r2) {
        f44 r0 = this.n;
        if (r2 != r0) goto L10;
        f44 r3 = r0.q;
        this.n = r3;
        if (r3 != null) goto L7;
        boolean r4 = true;
    L8:
        this.o = r4;
        return;
    L7:
        r4 = false;
        goto L8
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.o == true) goto L5;
        f44 r3 = this.n;
        if (r3 != null) goto L11;
    L13:
        return false;
    L11:
        if (r3.p == null) goto L13;
        return true;
    L5:
        if (this.p.n == null) goto L7;
        return true;
    L7:
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.o == false) goto L5;
        this.o = false;
        this.n = this.p.n;
    L11:
        return this.n;
    L5:
        f44 r0 = this.n;
        if (r0 == null) goto L8;
        f44 r1 = r0.p;
    L9:
        this.n = r1;
        goto L11
    L8:
        r1 = null;
        goto L9
    }
}
