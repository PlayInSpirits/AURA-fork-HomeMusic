package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fb2 implements Iterator, x32 {
    public final String n;
    public int o;
    public int p;
    public int q;
    public int r;

    public fb2(String r1) {
        this.n = r1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int r0 = this.o;
        if (r0 == 0) goto L7;
        if (r0 != 1) goto L6;
        return true;
    L6:
        return false;
    L7:
        int r3 = 2;
        if (this.r >= 0) goto L11;
        this.o = 2;
        return false;
    L11:
        String r1 = this.n;
        int r2 = r1.length();
        int r4 = this.p;
        int r5 = r1.length();
    L12:
        if (r4 >= r5) goto L25;
        char r6 = r1.charAt(r4);
        if (r6 == '\n') goto L17;
        if (r6 == '\r') goto L17;
        r4 = r4 + 1;
    L17:
        if (r6 != '\r') goto L23;
        int r7 = r4 + 1;
        if (r7 >= r1.length()) goto L23;
        if (r1.charAt(r7) != '\n') goto L23;
    L24:
        r2 = r4;
    L26:
        this.o = 1;
        this.r = r3;
        this.q = r2;
        return true;
    L23:
        r3 = 1;
        goto L24
    L25:
        r3 = -1;
        goto L26
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext() == false) goto L6;
        this.o = 0;
        int r0 = this.q;
        int r1 = this.p;
        this.p = this.r + r0;
        return this.n.subSequence(r1, r0).toString();
    L6:
        tb4.k();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
