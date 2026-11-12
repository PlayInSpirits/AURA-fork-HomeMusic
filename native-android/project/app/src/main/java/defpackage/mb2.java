package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mb2 implements Map.Entry {
    public mb2 n;
    public mb2 o;
    public mb2 p;
    public mb2 q;
    public mb2 r;
    public final Object s;
    public final boolean t;
    public Object u;
    public int v;

    public mb2(boolean r1, mb2 r2, Object r3, mb2 r4, mb2 r5) {
        this.n = r2;
        this.s = r3;
        this.t = r1;
        this.v = 1;
        this.q = r4;
        this.r = r5;
        r5.q = this;
        r4.r = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object r4) {
        if ((r4 instanceof Map.Entry) == false) goto L20;
        Map.Entry r5 = (Map.Entry) r4;
        Object r0 = this.s;
        if (r0 != null) goto L10;
        if (r5.getKey() != null) goto L20;
    L11:
        Object r3 = this.u;
        if (r3 != null) goto L17;
        if (r5.getValue() != null) goto L20;
        return true;
    L17:
        if (r3.equals(r5.getValue()) == false) goto L20;
        return true;
    L10:
        if (r0.equals(r5.getKey()) == true) goto L11;
    L20:
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.s;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.u;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int r0 = 0;
        Object r1 = this.s;
        if (r1 != null) goto L5;
        int r2 = 0;
    L6:
        Object r3 = this.u;
        if (r3 == null) goto L11;
        r0 = r3.hashCode();
    L11:
        return r2 ^ r0;
    L5:
        r2 = r1.hashCode();
        goto L6
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object r2) {
        if (r2 == null) goto L4;
    L8:
        Object r0 = this.u;
        this.u = r2;
        return r0;
    L4:
        if (this.t == true) goto L8;
        nz2.n("value == null");
        return null;
    }

    public final String toString() {
        return this.s + "=" + this.u;
    }

    public mb2(boolean r2) {
        this.s = null;
        this.t = r2;
        this.r = this;
        this.q = this;
    }
}
