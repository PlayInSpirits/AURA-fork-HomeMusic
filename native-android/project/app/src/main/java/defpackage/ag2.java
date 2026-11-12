package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ag2 implements Map, Serializable, a42 {
    public static final ag2 A = null;
    public Object[] n;
    public Object[] o;
    public int[] p;
    public int[] q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public bg2 w;
    public cg2 x;
    public bg2 y;
    public boolean z;

    static {
        ag2 r0 = new ag2(0);
        r0.z = true;
        A = r0;
    }

    public ag2(int r5) {
        if (r5 < 0) goto L8;
        Object[] r0 = new Object[r5];
        int[] r1 = new int[r5];
        if (r5 >= 1) goto L6;
        r5 = 1;
    L6:
        int r6 = Integer.highestOneBit(r5 * 3);
        this.n = r0;
        this.o = null;
        this.p = r1;
        this.q = new int[r6];
        this.r = 2;
        this.s = 0;
        this.t = Integer.numberOfLeadingZeros(r6) + 1;
        return;
    L8:
        kf2.n("capacity must be non-negative.");
        throw null;
    }

    public final int a(Object r8) {
        c();
    L3:
        int r0 = i(r8);
        int r1 = this.r * 2;
        int r2 = this.q.length / 2;
        if (r1 <= r2) goto L6;
        r1 = r2;
    L6:
        int r3 = 0;
    L7:
        int[] r4 = this.q;
        int r5 = r4[r0];
        if (r5 <= 0) goto L9;
        if (h12.c(this.n[r5 - 1], r8) == true) goto L19;
        r3 = r3 + 1;
        if (r3 > r1) goto L22;
        int r6 = r0 - 1;
        if (r0 == 0) goto L25;
        r0 = r6;
        goto L7
    L25:
        r0 = this.q.length - 1;
        goto L7
    L22:
        j(this.q.length * 2);
        goto L3
    L19:
        return -r5;
    L9:
        int r7 = this.s;
        Object[] r9 = this.n;
        if (r7 < r9.length) goto L12;
        f(1);
        goto L3
    L12:
        int r10 = r7 + 1;
        this.s = r10;
        r9[r7] = r8;
        this.p[r7] = r0;
        r4[r0] = r10;
        this.v++;
        this.u++;
        if (r3 <= this.r) goto L15;
        this.r = r3;
    L15:
        return r7;
    }

    public final ag2 b() {
        c();
        this.z = true;
        if (this.v <= 0) goto L5;
        return this;
    L5:
        ag2 r1 = A;
        r1.getClass();
        return r1;
    }

    public final void c() {
        if (this.z == true) goto L6;
        return;
    L6:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int r0 = this.s - 1;
        if (r0 < 0) goto L10;
        int r2 = 0;
    L5:
        int[] r3 = this.p;
        int r4 = r3[r2];
        if (r4 < 0) goto L8;
        this.q[r4] = 0;
        r3[r2] = -1;
    L8:
        if (r2 == r0) goto L10;
        r2 = r2 + 1;
    L10:
        xl.I(this.n, 0, this.s);
        Object[] r1 = this.o;
        if (r1 == null) goto L13;
        xl.I(r1, 0, this.s);
    L13:
        this.v = 0;
        this.s = 0;
        this.u++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object r1) {
        if (g(r1) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object r1) {
        if (h(r1) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final void d(boolean r8) {
        Object[] r0 = this.o;
        int r1 = 0;
        int r2 = 0;
    L3:
        int r3 = this.s;
        if (r1 >= r3) goto L14;
        int[] r4 = this.p;
        int r5 = r4[r1];
        if (r5 < 0) goto L13;
        Object[] r6 = this.n;
        r6[r2] = r6[r1];
        if (r0 == null) goto L10;
        r0[r2] = r0[r1];
    L10:
        if (r8 == false) goto L12;
        r4[r2] = r5;
        this.q[r5] = r2 + 1;
    L12:
        r2 = r2 + 1;
    L13:
        r1 = r1 + 1;
        goto L3
    L14:
        xl.I(this.n, r2, r3);
        if (r0 == null) goto L17;
        xl.I(r0, r2, this.s);
    L17:
        this.s = r2;
    }

    public final boolean e(Collection r5) {
        r5.getClass();
        Iterator r6 = r5.iterator();
    L4:
        if (r6.hasNext() == false) goto L13;
        Object r0 = r6.next();
        if (r0 == null) goto L12;
        Map.Entry r1 = (Map.Entry) r0;     // Catch: ClassCastException -> L15
        int r2 = g(r1.getKey());     // Catch: ClassCastException -> L15
        if (r2 >= 0) goto L10;
        boolean r3 = false;
    L11:
        if (r3 == true) goto L4;
    L10:
        Object[] r4 = this.o;     // Catch: ClassCastException -> L15
        r4.getClass();     // Catch: ClassCastException -> L15
        r3 = h12.c(r4[r2], r1.getValue());     // Catch: ClassCastException -> L15
    L12:
        return false;
    L13:
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        bg2 r0 = this.y;
        if (r0 != null) goto L6;
        bg2 r1 = new bg2(this, 0);
        this.y = r1;
        return r1;
    L6:
        return r0;
    }

    @Override // java.util.Map
    public final boolean equals(Object r3) {
        if (r3 != this) goto L4;
        return true;
    L4:
        if ((r3 instanceof Map) == false) goto L10;
        Map r4 = (Map) r3;
        if (this.v == r4.size()) goto L8;
        return false;
    L8:
        if (e(r4.entrySet()) == true) goto L16;
        return false;
    L16:
        return true;
    L10:
        return false;
    }

    public final void f(int r6) {
        Object[] r0 = this.n;
        int r1 = r0.length;
        int r2 = this.s;
        int r3 = r1 - r2;
        int r4 = r2 - this.v;
        int r5 = 1;
        if (r3 < r6) goto L5;
    L10:
        int r7 = r2 + r6;
        if (r7 < 0) goto L35;
        if (r7 <= r0.length) goto L36;
        int r8 = r0.length;
        int r9 = r8 + (r8 >> 1);
        if ((r9 - r7) >= 0) goto L18;
        r9 = r7;
    L18:
        if ((r9 - 2147483639) <= 0) goto L22;
        if (r7 <= 2147483639) goto L21;
        r9 = Integer.MAX_VALUE;
        goto L22
    L21:
        r9 = 2147483639;
    L22:
        this.n = Arrays.copyOf(r0, r9);
        Object[] r10 = this.o;
        if (r10 == null) goto L25;
        Object[] r11 = Arrays.copyOf(r10, r9);
    L26:
        this.o = r11;
        this.p = Arrays.copyOf(this.p, r9);
        if (r9 < 1) goto L30;
        r5 = r9;
    L30:
        int r12 = Integer.highestOneBit(r5 * 3);
        if (r12 <= this.q.length) goto L37;
        j(r12);
        return;
    L37:
        return;
    L25:
        r11 = null;
        goto L26
    L36:
        return;
    L35:
        throw new OutOfMemoryError();
    L5:
        if ((r3 + r4) < r6) goto L10;
        if (r4 < (r0.length / 4)) goto L10;
        d(true);
    }

    public final int g(Object r6) {
        int r0 = i(r6);
        int r1 = this.r;
    L3:
        int r2 = this.q[r0];
        if (r2 == 0) goto L5;
        if (r2 <= 0) goto L10;
        int r3 = r2 - 1;
        if (h12.c(this.n[r3], r6) == false) goto L10;
        return r3;
    L10:
        r1 = r1 - 1;
        if (r1 < 0) goto L12;
        int r4 = r0 - 1;
        if (r0 == 0) goto L15;
        r0 = r4;
        goto L3
    L15:
        r0 = this.q.length - 1;
        goto L3
    L12:
        return -1;
    L5:
        return -1;
    }

    @Override // java.util.Map
    public final Object get(Object r1) {
        int r2 = g(r1);
        if (r2 >= 0) goto L6;
        return null;
    L6:
        Object[] r0 = this.o;
        r0.getClass();
        return r0[r2];
    }

    public final int h(Object r3) {
        int r0 = this.s;
    L3:
        r0 = r0 - 1;
        if (r0 < 0) goto L10;
        if (this.p[r0] < 0) goto L3;
        Object[] r1 = this.o;
        r1.getClass();
        if (h12.c(r1[r0], r3) == false) goto L3;
        return r0;
    L10:
        return -1;
    }

    @Override // java.util.Map
    public final int hashCode() {
        xf2 r0 = new xf2(this, 0);
        int r5 = 0;
    L4:
        if (r0.hasNext() == false) goto L18;
        int r2 = r0.n;
        ag2 r3 = (ag2) r0.q;
        if (r2 >= r3.s) goto L16;
        r0.n = r2 + 1;
        r0.o = r2;
        Object r4 = r3.n[r2];
        if (r4 == null) goto L10;
        int r6 = r4.hashCode();
    L11:
        Object[] r7 = r3.o;
        r7.getClass();
        Object r8 = r7[r0.o];
        if (r8 == null) goto L14;
        int r9 = r8.hashCode();
    L15:
        r0.e();
        r5 = r5 + (r6 ^ r9);
        goto L4
    L14:
        r9 = 0;
        goto L15
    L10:
        r6 = 0;
        goto L11
    L16:
        tb4.k();
        return 0;
    L18:
        return r5;
    }

    public final int i(Object r2) {
        if (r2 == null) goto L4;
        int r3 = r2.hashCode();
    L6:
        return (r3 * (-1640531527)) >>> this.t;
    L4:
        r3 = 0;
        goto L6
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.v != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final void j(int r6) {
        this.u++;
        int r2 = 0;
        if (this.s <= this.v) goto L5;
        d(false);
    L5:
        this.q = new int[r6];
        this.t = Integer.numberOfLeadingZeros(r6) + 1;
    L7:
        if (r2 >= this.s) goto L28;
        int r7 = r2 + 1;
        int r0 = i(this.n[r2]);
        int r1 = this.r;
    L9:
        int[] r3 = this.q;
        if (r3[r0] == 0) goto L11;
        r1 = r1 - 1;
        if (r1 < 0) goto L18;
        int r4 = r0 - 1;
        if (r0 == 0) goto L16;
        r0 = r4;
        goto L9
    L16:
        r0 = r3.length - 1;
        goto L9
    L18:
        kf2.o("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
        return;
    L11:
        r3[r0] = r7;
        this.p[r2] = r0;
        r2 = r7;
        goto L7
    }

    public final void k(int r12) {
        Object[] r0 = this.n;
        r0.getClass();
        r0[r12] = null;
        Object[] r1 = this.o;
        if (r1 == null) goto L5;
        r1[r12] = null;
    L5:
        int r2 = this.p[r12];
        int r3 = this.r * 2;
        int r4 = this.q.length / 2;
        if (r3 <= r4) goto L8;
        r3 = r4;
    L8:
        int r5 = r3;
        int r6 = 0;
        int r7 = r2;
    L9:
        int r8 = r2 - 1;
        if (r2 != 0) goto L12;
        r2 = this.q.length - 1;
    L13:
        r6 = r6 + 1;
        int r9 = this.r;
        int[] r10 = this.q;
        if (r6 > r9) goto L15;
        int r11 = r10[r2];
        if (r11 == 0) goto L18;
        if (r11 >= 0) goto L22;
        r10[r7] = -1;
    L21:
        r7 = r2;
        r6 = 0;
    L25:
        r5 = r5 - 1;
        if (r5 >= 0) goto L9;
        this.q[r7] = -1;
    L28:
        this.p[r12] = -1;
        this.v--;
        this.u++;
        return;
    L22:
        int r13 = r11 - 1;
        int r14 = i(this.n[r13]) - r2;
        int[] r15 = this.q;
        if ((r14 & (r15.length - 1)) < r6) goto L25;
        r15[r7] = r11;
        this.p[r13] = r7;
        goto L21
    L18:
        r10[r7] = 0;
        goto L28
    L15:
        r10[r7] = 0;
        goto L28
    L12:
        r2 = r8;
        goto L13
    }

    @Override // java.util.Map
    public final Set keySet() {
        bg2 r0 = this.w;
        if (r0 != null) goto L6;
        bg2 r1 = new bg2(this, 1);
        this.w = r1;
        return r1;
    L6:
        return r0;
    }

    @Override // java.util.Map
    public final Object put(Object r3, Object r4) {
        c();
        int r5 = a(r3);
        Object[] r0 = this.o;
        if (r0 != null) goto L8;
        int r1 = this.n.length;
        if (r1 < 0) goto L13;
        r0 = new Object[r1];
        this.o = r0;
        goto L8
    L13:
        kf2.n("capacity must be non-negative.");
        return null;
    L8:
        if (r5 >= 0) goto L11;
        int r2 = (-r5) - 1;
        Object r6 = r0[r2];
        r0[r2] = r4;
        return r6;
    L11:
        r0[r5] = r4;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map r6) {
        r6.getClass();
        c();
        Set r7 = r6.entrySet();
        if (r7.isEmpty() == true) goto L30;
        f(r7.size());
        Iterator r8 = r7.iterator();
    L7:
        if (r8.hasNext() == false) goto L31;
        Map.Entry r0 = (Map.Entry) r8.next();
        int r1 = a(r0.getKey());
        Object[] r2 = this.o;
        if (r2 != null) goto L14;
        int r3 = this.n.length;
        if (r3 < 0) goto L19;
        r2 = new Object[r3];
        this.o = r2;
        goto L14
    L19:
        kf2.n("capacity must be non-negative.");
        return;
    L14:
        if (r1 >= 0) goto L15;
        int r4 = (-r1) - 1;
        if (h12.c(r0.getValue(), r2[r4]) == true) goto L7;
        r2[r4] = r0.getValue();
        goto L7
    L15:
        r2[r1] = r0.getValue();
        goto L7
    L31:
        return;
    }

    @Override // java.util.Map
    public final Object remove(Object r2) {
        c();
        int r3 = g(r2);
        if (r3 >= 0) goto L6;
        return null;
    L6:
        Object[] r0 = this.o;
        r0.getClass();
        Object r1 = r0[r3];
        k(r3);
        return r1;
    }

    @Override // java.util.Map
    public final int size() {
        return this.v;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder((this.v * 3) + 2);
        r0.append("{");
        int r2 = 0;
        xf2 r1 = new xf2(this, 0);
    L4:
        if (r1.hasNext() == false) goto L20;
        if (r2 <= 0) goto L7;
        r0.append(", ");
    L7:
        int r6 = r1.n;
        ag2 r3 = (ag2) r1.q;
        if (r6 >= r3.s) goto L18;
        r1.n = r6 + 1;
        r1.o = r6;
        Object r7 = r3.n[r6];
        if (r7 != r3) goto L12;
        r0.append("(this Map)");
    L13:
        r0.append('=');
        Object[] r8 = r3.o;
        r8.getClass();
        Object r9 = r8[r1.o];
        if (r9 != r3) goto L16;
        r0.append("(this Map)");
    L17:
        r1.e();
        r2 = r2 + 1;
        goto L4
    L16:
        r0.append(r9);
        goto L17
    L12:
        r0.append(r7);
        goto L13
    L18:
        tb4.k();
        return null;
    L20:
        r0.append("}");
        return r0.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        cg2 r0 = this.x;
        if (r0 != null) goto L6;
        cg2 r1 = new cg2(0, this);
        this.x = r1;
        return r1;
    L6:
        return r0;
    }

    public ag2() {
        this(8);
    }
}
