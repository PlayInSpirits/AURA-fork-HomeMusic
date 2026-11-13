package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class fb2 implements Iterator, x32 {
    public final String n;
    public int o;
    public int p;
    public int q;
    public int r;

    public fb2(String str) {
        this.n = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.o;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.r < 0) {
            this.o = 2;
            return false;
        }
        String str = this.n;
        int length = str.length();
        int length2 = str.length();
        for (int i4 = this.p; i4 < length2; i4++) {
            char charAt = str.charAt(i4);
            if (charAt == '\n' || charAt == '\r') {
                i = (charAt == '\r' && (i2 = i4 + 1) < str.length() && str.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.o = 1;
                this.r = i;
                this.q = length;
                return true;
            }
        }
        i = -1;
        this.o = 1;
        this.r = i;
        this.q = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            tb4.k();
            return null;
        }
        this.o = 0;
        int i = this.q;
        int i2 = this.p;
        this.p = this.r + i;
        return this.n.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
