package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jg4 implements w80, Iterable, x32 {
    public final ig4 n;
    public final int o;
    public final int p;

    public jg4(ig4 r1, int r2, int r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof jg4) == false) goto L13;
        jg4 r4 = (jg4) r3;
        if (r4.o == this.o) goto L7;
        return false;
    L7:
        if (r4.p == this.p) goto L9;
        return false;
    L9:
        if (r4.n != this.n) goto L17;
        return true;
    L17:
        return false;
    L13:
        return false;
    }

    public final int hashCode() {
        return (this.n.hashCode() * 31) + this.o;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ig4 r0 = this.n;
        if (r0.u == this.p) goto L5;
        kg4.f();
    L5:
        int r5 = this.o;
        r0.g(r5);
        return new ik1(r0, r5 + 1, r0.n[(r5 * 5) + 3] + r5);
    }
}
