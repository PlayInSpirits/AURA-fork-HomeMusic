package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nb2 extends AbstractMap implements Serializable {
    public static final jb2 v = null;
    public final Comparator n;
    public final boolean o;
    public mb2 p;
    public int q;
    public int r;
    public final mb2 s;
    public lb2 t;
    public lb2 u;

    static {
        v = new jb2(0);
    }

    public nb2(boolean r2) {
        this.q = 0;
        this.r = 0;
        this.n = v;
        this.o = r2;
        this.s = new mb2(r2);
    }

    public final mb2 a(Object r13, boolean r14) {
        mb2 r0 = this.p;
        jb2 r2 = v;
        Comparator r3 = this.n;
        if (r0 == null) goto L19;
        if (r3 != r2) goto L6;
        Comparable r4 = (Comparable) r13;
    L7:
        Object r5 = r0.s;
        if (r4 == null) goto L10;
        int r6 = r4.compareTo(r5);
    L11:
        if (r6 == 0) goto L12;
        if (r6 >= 0) goto L15;
        mb2 r7 = r0.o;
    L16:
        if (r7 == null) goto L17;
        r0 = r7;
    L17:
        mb2 r8 = r0;
        if (r14 == true) goto L22;
        return null;
    L22:
        mb2 r10 = this.s;
        if (r8 != null) goto L31;
        if (r3 == r2) goto L26;
    L30:
        mb2 r9 = new mb2(this.o, r8, r13, r10, r10.r);
        this.p = r9;
    L36:
        this.q++;
        this.r++;
        return r9;
    L26:
        if ((r13 instanceof Comparable) == true) goto L30;
        throw new ClassCastException(r13.getClass().getName().concat(" is not Comparable"));
    L31:
        r9 = new mb2(this.o, r8, r13, r10, r10.r);
        if (r6 >= 0) goto L34;
        r8.o = r9;
    L35:
        b(r8, true);
        goto L36
    L34:
        r8.p = r9;
        goto L35
    L15:
        r7 = r0.p;
        goto L16
    L12:
        return r0;
    L10:
        r6 = r3.compare(r13, r5);
        goto L11
    L6:
        r4 = null;
        goto L7
    L19:
        r6 = 0;
        goto L17
    }

    public final void b(mb2 r8, boolean r9) {
    L2:
        if (r8 == null) goto L52;
        mb2 r0 = r8.o;
        mb2 r1 = r8.p;
        int r2 = 0;
        if (r0 == null) goto L6;
        int r3 = r0.v;
    L7:
        if (r1 == null) goto L9;
        int r4 = r1.v;
    L10:
        int r5 = r3 - r4;
        if (r5 != (-2)) goto L28;
        mb2 r6 = r1.o;
        mb2 r7 = r1.p;
        if (r7 == null) goto L15;
        int r10 = r7.v;
    L16:
        if (r6 == null) goto L18;
        r2 = r6.v;
    L18:
        int r11 = r2 - r10;
        if (r11 == (-1)) goto L24;
        if (r11 != 0) goto L23;
        if (r9 == false) goto L24;
    L23:
        f(r1);
        e(r8);
    L25:
        if (r9 == false) goto L51;
        return;
    L51:
        r8 = r8.n;
    L24:
        e(r8);
        goto L25
    L15:
        r10 = 0;
        goto L16
    L28:
        if (r5 != 2) goto L44;
        mb2 r12 = r0.o;
        mb2 r13 = r0.p;
        if (r13 == null) goto L32;
        int r14 = r13.v;
    L33:
        if (r12 == null) goto L35;
        r2 = r12.v;
    L35:
        int r15 = r2 - r14;
        if (r15 == 1) goto L41;
        if (r15 != 0) goto L40;
        if (r9 == false) goto L41;
    L40:
        e(r0);
        f(r8);
    L42:
        if (r9 == false) goto L51;
        return;
    L41:
        f(r8);
        goto L42
    L32:
        r14 = 0;
        goto L33
    L44:
        if (r5 != 0) goto L48;
        r8.v = r3 + 1;
        if (r9 == false) goto L51;
        return;
    L48:
        r8.v = Math.max(r3, r4) + 1;
        if (r9 == true) goto L51;
        return;
    L9:
        r4 = 0;
        goto L10
    L6:
        r3 = 0;
        goto L7
    }

    public final void c(mb2 r7, boolean r8) {
        if (r8 == false) goto L4;
        mb2 r9 = r7.r;
        r9.q = r7.q;
        r7.q.r = r9;
    L4:
        mb2 r10 = r7.o;
        mb2 r0 = r7.p;
        mb2 r1 = r7.n;
        int r2 = 0;
        if (r10 == null) goto L27;
        if (r0 == null) goto L27;
        if (r10.v <= r0.v) goto L13;
        mb2 r3 = r10.p;
    L10:
        mb2 r5 = r3;
        mb2 r4 = r10;
        r10 = r5;
        if (r10 == null) goto L18;
        r3 = r10.p;
    L18:
        c(r4, false);
        mb2 r11 = r7.o;
        if (r11 == null) goto L21;
        int r6 = r11.v;
        r4.o = r11;
        r11.n = r4;
        r7.o = null;
    L22:
        mb2 r12 = r7.p;
        if (r12 == null) goto L25;
        r2 = r12.v;
        r4.p = r12;
        r12.n = r4;
        r7.p = null;
    L25:
        r4.v = Math.max(r6, r2) + 1;
        d(r7, r4);
        return;
    L21:
        r6 = 0;
        goto L22
    L13:
        mb2 r13 = r0.o;
    L14:
        mb2 r14 = r0;
        r0 = r13;
        if (r0 == null) goto L17;
        r13 = r0.o;
        goto L14
    L17:
        r4 = r14;
    L27:
        if (r10 == null) goto L29;
        d(r7, r10);
        r7.o = null;
    L32:
        b(r1, false);
        this.q--;
        this.r++;
        return;
    L29:
        if (r0 == null) goto L31;
        d(r7, r0);
        r7.p = null;
        goto L32
    L31:
        d(r7, null);
        goto L32
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.p = null;
        this.q = 0;
        this.r++;
        mb2 r1 = this.s;
        r1.r = r1;
        r1.q = r1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object r3) {
        mb2 r1 = null;
        if (r3 != null) goto L10;
    L5:
        if (r1 == null) goto L8;
        return true;
    L8:
        return false;
    L10:
        r1 = a(r3, false);     // Catch: ClassCastException -> L9
        goto L5
    }

    public final void d(mb2 r3, mb2 r4) {
        mb2 r0 = r3.n;
        r3.n = null;
        if (r4 == null) goto L5;
        r4.n = r0;
    L5:
        if (r0 != null) goto L7;
        this.p = r4;
        return;
    L7:
        if (r0.o != r3) goto L10;
        r0.o = r4;
        return;
    L10:
        r0.p = r4;
    }

    public final void e(mb2 r5) {
        mb2 r0 = r5.o;
        mb2 r1 = r5.p;
        mb2 r2 = r1.o;
        mb2 r3 = r1.p;
        r5.p = r2;
        if (r2 == null) goto L5;
        r2.n = r5;
    L5:
        d(r5, r1);
        r1.o = r5;
        r5.n = r1;
        int r4 = 0;
        if (r0 == null) goto L8;
        int r6 = r0.v;
    L9:
        if (r2 == null) goto L11;
        int r7 = r2.v;
    L12:
        int r8 = Math.max(r6, r7) + 1;
        r5.v = r8;
        if (r3 == null) goto L15;
        r4 = r3.v;
    L15:
        r1.v = Math.max(r8, r4) + 1;
        return;
    L11:
        r7 = 0;
        goto L12
    L8:
        r6 = 0;
        goto L9
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        lb2 r0 = this.t;
        if (r0 == null) goto L5;
        return r0;
    L5:
        lb2 r1 = new lb2(this, 0);
        this.t = r1;
        return r1;
    }

    public final void f(mb2 r5) {
        mb2 r0 = r5.o;
        mb2 r1 = r5.p;
        mb2 r2 = r0.o;
        mb2 r3 = r0.p;
        r5.o = r3;
        if (r3 == null) goto L5;
        r3.n = r5;
    L5:
        d(r5, r0);
        r0.p = r5;
        r5.n = r0;
        int r4 = 0;
        if (r1 == null) goto L8;
        int r6 = r1.v;
    L9:
        if (r3 == null) goto L11;
        int r7 = r3.v;
    L12:
        int r8 = Math.max(r6, r7) + 1;
        r5.v = r8;
        if (r2 == null) goto L15;
        r4 = r2.v;
    L15:
        r0.v = Math.max(r8, r4) + 1;
        return;
    L11:
        r7 = 0;
        goto L12
    L8:
        r6 = 0;
        goto L9
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object r3) {
        if (r3 != null) goto L13;
    L7:
        mb2 r2 = null;
    L8:
        if (r2 != null) goto L10;
        return null;
    L10:
        return r2.u;
    L13:
        r2 = a(r3, false);     // Catch: ClassCastException -> L12
        goto L8
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        lb2 r0 = this.u;
        if (r0 == null) goto L5;
        return r0;
    L5:
        lb2 r1 = new lb2(this, 1);
        this.u = r1;
        return r1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object r3, Object r4) {
        if (r3 == null) goto L12;
        if (r4 == null) goto L6;
    L10:
        mb2 r2 = a(r3, true);
        Object r5 = r2.u;
        r2.u = r4;
        return r5;
    L6:
        if (this.o == true) goto L10;
        nz2.n("value == null");
        return null;
    L12:
        nz2.n("key == null");
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object r3) {
        if (r3 != null) goto L15;
    L7:
        mb2 r4 = null;
    L8:
        if (r4 == null) goto L10;
        c(r4, true);
    L10:
        if (r4 != null) goto L12;
        return null;
    L12:
        return r4.u;
    L15:
        r4 = a(r3, false);     // Catch: ClassCastException -> L14
        goto L8
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.q;
    }
}
