package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yf2 implements Map.Entry, z32 {
    public final ag2 n;
    public final int o;
    public final int p;

    public yf2(ag2 r1, int r2) {
        r1.getClass();
        this.n = r1;
        this.o = r2;
        this.p = r1.u;
    }

    public final void a() {
        if (this.n.u != this.p) goto L6;
        return;
    L6:
        throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object r3) {
        if ((r3 instanceof Map.Entry) == false) goto L10;
        Map.Entry r4 = (Map.Entry) r3;
        if (h12.c(r4.getKey(), getKey()) == true) goto L7;
        return false;
    L7:
        if (h12.c(r4.getValue(), getValue()) == false) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.n.n[this.o];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] r0 = this.n.o;
        r0.getClass();
        return r0[this.o];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object r0 = getKey();
        int r1 = 0;
        if (r0 == null) goto L5;
        int r2 = r0.hashCode();
    L6:
        Object r3 = getValue();
        if (r3 == null) goto L10;
        r1 = r3.hashCode();
    L10:
        return r2 ^ r1;
    L5:
        r2 = 0;
        goto L6
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object r3) {
        a();
        ag2 r0 = this.n;
        r0.c();
        Object[] r1 = r0.o;
        if (r1 != null) goto L8;
        int r2 = r0.n.length;
        if (r2 < 0) goto L10;
        r1 = new Object[r2];
        r0.o = r1;
        goto L8
    L10:
        kf2.n("capacity must be non-negative.");
        return null;
    L8:
        int r4 = this.o;
        Object r5 = r1[r4];
        r1[r4] = r3;
        return r5;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(getKey());
        r0.append('=');
        r0.append(getValue());
        return r0.toString();
    }
}
