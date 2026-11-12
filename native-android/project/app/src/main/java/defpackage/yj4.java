package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yj4 implements Iterator {
    public int n;
    public String o;
    public final CharSequence p;
    public final u10 q;
    public int r;
    public int s;
    public final /* synthetic */ si1 t;

    public yj4(si1 r1, ue1 r2, CharSequence r3) {
        this.t = r1;
        this.n = 2;
        this.r = 0;
        this.q = (u10) r2.p;
        this.s = r2.o;
        this.p = r3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.n == 4) goto L5;
        boolean r0 = true;
    L6:
        rr2.w(r0);
        int r1 = xa3.w(this.n);
        if (r1 != 0) goto L9;
        return true;
    L9:
        if (r1 == 2) goto L51;
        this.n = 4;
        int r2 = this.r;
    L11:
        int r3 = this.r;
        if (r3 == (-1)) goto L46;
        r10 r6 = (r10) this.t.o;
        CharSequence r7 = this.p;
        int r8 = r7.length();
        rr2.t(r3, r8);
    L14:
        if (r3 >= r8) goto L19;
        if (r6.c(r7.charAt(r3)) == true) goto L20;
        r3 = r3 + 1;
    L20:
        if (r3 != (-1)) goto L22;
        r3 = r7.length();
        this.r = -1;
    L23:
        int r9 = this.r;
        if (r9 != r2) goto L28;
        int r10 = r9 + 1;
        this.r = r10;
        if (r10 <= r7.length()) goto L11;
        this.r = -1;
    L28:
        u10 r11 = this.q;
        if (r2 >= r3) goto L33;
        if (r11.c(r7.charAt(r2)) == false) goto L33;
        r2 = r2 + 1;
    L33:
        if (r3 <= r2) goto L37;
        if (r11.c(r7.charAt(r3 - 1)) == false) goto L37;
        r3 = r3 - 1;
    L37:
        int r12 = this.s;
        if (r12 != 1) goto L44;
        r3 = r7.length();
        this.r = -1;
    L40:
        if (r3 <= r2) goto L45;
        if (r11.c(r7.charAt(r3 - 1)) == false) goto L45;
        r3 = r3 - 1;
    L45:
        String r4 = r7.subSequence(r2, r3).toString();
    L47:
        this.o = r4;
        if (this.n == 3) goto L51;
        this.n = 1;
        return true;
    L44:
        this.s = r12 - 1;
        goto L45
    L22:
        this.r = r3 + 1;
        goto L23
    L19:
        r3 = -1;
        goto L20
    L46:
        this.n = 3;
        r4 = null;
    L51:
        return false;
    L5:
        r0 = false;
        goto L6
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext() == false) goto L6;
        this.n = 2;
        String r0 = this.o;
        this.o = null;
        return r0;
    L6:
        tb4.k();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
