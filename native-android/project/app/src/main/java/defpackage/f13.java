package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f13 implements RandomAccess {
    public Object[] n;
    public c13 o;
    public int p;

    public f13(Object[] r1) {
        this.n = r1;
        this.p = 0;
    }

    public final void a(int r4, Object r5) {
        int r0 = this.p + 1;
        if (this.n.length >= r0) goto L5;
        m(r0);
    L5:
        Object[] r1 = this.n;
        int r2 = this.p;
        if (r4 == r2) goto L8;
        System.arraycopy(r1, r4, r1, r4 + 1, r2 - r4);
    L8:
        r1[r4] = r5;
        this.p++;
    }

    public final void b(Object r3) {
        int r0 = this.p + 1;
        if (this.n.length >= r0) goto L5;
        m(r0);
    L5:
        Object[] r1 = this.n;
        int r2 = this.p;
        r1[r2] = r3;
        this.p = r2 + 1;
    }

    public final void c(int r5, f13 r6) {
        int r0 = r6.p;
        if (r0 != 0) goto L5;
        return;
    L5:
        int r1 = this.p + r0;
        if (this.n.length >= r1) goto L8;
        m(r1);
    L8:
        Object[] r2 = this.n;
        int r3 = this.p;
        if (r5 == r3) goto L11;
        System.arraycopy(r2, r5, r2, r5 + r0, r3 - r5);
    L11:
        System.arraycopy(r6.n, 0, r2, r5, r0);
        this.p += r0;
    }

    public final void d(List r7, int r8) {
        if (r7.isEmpty() == false) goto L5;
        return;
    L5:
        int r0 = r7.size();
        int r1 = this.p + r0;
        if (this.n.length >= r1) goto L8;
        m(r1);
    L8:
        Object[] r2 = this.n;
        int r3 = this.p;
        if (r8 == r3) goto L11;
        System.arraycopy(r2, r8, r2, r8 + r0, r3 - r8);
    L11:
        int r4 = r7.size();
        int r5 = 0;
    L12:
        if (r5 >= r4) goto L14;
        r2[r8 + r5] = r7.get(r5);
        r5 = r5 + 1;
        goto L12
    L14:
        this.p += r0;
    }

    public final boolean e(int r6, Collection r7) {
        int r1 = 0;
        if (r7.isEmpty() == false) goto L5;
        return false;
    L5:
        int r0 = r7.size();
        int r2 = this.p + r0;
        if (this.n.length >= r2) goto L8;
        m(r2);
    L8:
        Object[] r3 = this.n;
        int r4 = this.p;
        if (r6 == r4) goto L11;
        System.arraycopy(r3, r6, r3, r6 + r0, r4 - r6);
    L11:
        Iterator r8 = r7.iterator();
    L13:
        if (r8.hasNext() == false) goto L19;
        Object r5 = r8.next();
        int r9 = r1 + 1;
        if (r1 < 0) goto L17;
        r3[r1 + r6] = r5;
        r1 = r9;
        goto L13
    L17:
        gb.c0();
        throw null;
    L19:
        this.p += r0;
        return true;
    }

    public final List f() {
        c13 r0 = this.o;
        if (r0 != null) goto L6;
        c13 r1 = new c13(this);
        this.o = r1;
        return r1;
    L6:
        return r0;
    }

    public final void g() {
        Object[] r0 = this.n;
        int r1 = this.p;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L5;
        r0[r3] = null;
        r3 = r3 + 1;
        goto L3
    L5:
        this.p = 0;
    }

    public final boolean h(Object r6) {
        int r0 = this.p - 1;
        if (r0 < 0) goto L10;
        int r3 = 0;
    L6:
        if (h12.c(this.n[r3], r6) == true) goto L7;
        if (r3 == r0) goto L10;
        r3 = r3 + 1;
        goto L6
    L7:
        return true;
    L10:
        return false;
    }

    public final int i(Object r4) {
        Object[] r0 = this.n;
        int r3 = this.p;
        int r1 = 0;
    L3:
        if (r1 >= r3) goto L8;
        if (h12.c(r4, r0[r1]) == true) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        return r1;
    L8:
        return -1;
    }

    public final boolean j(Object r1) {
        int r2 = i(r1);
        if (r2 < 0) goto L6;
        k(r2);
        return true;
    L6:
        return false;
    }

    public final Object k(int r5) {
        Object[] r0 = this.n;
        Object r1 = r0[r5];
        int r2 = this.p;
        if (r5 == (r2 - 1)) goto L5;
        int r3 = r5 + 1;
        System.arraycopy(r0, r3, r0, r5, r2 - r3);
    L5:
        int r6 = this.p - 1;
        this.p = r6;
        r0[r6] = null;
        return r1;
    }

    public final void l(int r4, int r5) {
        if (r5 <= r4) goto L15;
        int r0 = this.p;
        if (r5 >= r0) goto L6;
        Object[] r1 = this.n;
        System.arraycopy(r1, r5, r1, r4, r0 - r5);
    L6:
        int r2 = this.p;
        int r6 = r2 - (r5 - r4);
        int r3 = r2 - 1;
        if (r6 > r3) goto L12;
        int r7 = r6;
    L9:
        this.n[r7] = null;
        if (r7 == r3) goto L12;
        r7 = r7 + 1;
    L12:
        this.p = r6;
        return;
    }

    public final void m(int r4) {
        Object[] r0 = this.n;
        int r1 = r0.length;
        Object[] r5 = new Object[Math.max(r4, r1 * 2)];
        System.arraycopy(r0, 0, r5, 0, r1);
        this.n = r5;
    }
}
