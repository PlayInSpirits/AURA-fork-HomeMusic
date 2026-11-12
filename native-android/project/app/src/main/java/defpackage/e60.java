package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e60 implements ne0, Serializable {
    public final ne0 n;
    public final le0 o;

    public e60(le0 r1, ne0 r2) {
        r2.getClass();
        r1.getClass();
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.ne0
    public final ne0 J(ne0 r4) {
        r4.getClass();
        if (r4 != q01.n) goto L6;
        return this;
    L6:
        return (ne0) r4.s(new d60(9, (byte) 0), this);
    }

    @Override // defpackage.ne0
    public final le0 K(me0 r2) {
        r2.getClass();
    L3:
        le0 r0 = this.o.K(r2);
        if (r0 != null) goto L5;
        ne0 r1 = this.n;
        if ((r1 instanceof e60) == false) goto L10;
        e60 this = (e60) r1;
        goto L3
    L10:
        return r1.K(r2);
    L5:
        return r0;
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L4;
        return true;
    L4:
        if ((r7 instanceof e60) == false) goto L29;
        e60 r8 = (e60) r7;
        int r0 = 2;
        e60 r2 = r8;
        int r3 = 2;
    L6:
        ne0 r4 = r2.n;
        if ((r4 instanceof e60) == false) goto L9;
        r2 = (e60) r4;
    L10:
        if (r2 == null) goto L11;
        r3 = r3 + 1;
        goto L6
    L11:
        e60 r5 = this;
    L12:
        ne0 r6 = r5.n;
        if ((r6 instanceof e60) == false) goto L15;
        r5 = (e60) r6;
    L16:
        if (r5 == null) goto L17;
        r0 = r0 + 1;
        goto L12
    L17:
        if (r3 != r0) goto L29;
    L18:
        le0 r1 = this.o;
        if (h12.c(r8.K(r1.getKey()), r1) == false) goto L20;
        ne0 r9 = this.n;
        if ((r9 instanceof e60) == false) goto L24;
        e60 this = (e60) r9;
        goto L18
    L24:
        r9.getClass();
        le0 r10 = (le0) r9;
        boolean r11 = h12.c(r8.K(r10.getKey()), r10);
    L25:
        if (r11 == false) goto L29;
        return true;
    L20:
        r11 = false;
        goto L25
    L15:
        r5 = null;
        goto L16
    L9:
        r2 = null;
    L29:
        return false;
    }

    public final int hashCode() {
        int r0 = this.n.hashCode();
        return this.o.hashCode() + r0;
    }

    @Override // defpackage.ne0
    public final Object s(wf1 r2, Object r3) {
        return r2.invoke(this.n.s(r2, r3), this.o);
    }

    public final String toString() {
        return "[" + ((String) s(new d60(0, (byte) 0), "")) + ']';
    }

    @Override // defpackage.ne0
    public final ne0 u(me0 r4) {
        r4.getClass();
        le0 r0 = this.o;
        le0 r1 = r0.K(r4);
        ne0 r2 = this.n;
        if (r1 == null) goto L5;
        return r2;
    L5:
        ne0 r5 = r2.u(r4);
        if (r5 != r2) goto L9;
        return this;
    L9:
        if (r5 != q01.n) goto L12;
        return r0;
    L12:
        return new e60(r0, r5);
    }
}
