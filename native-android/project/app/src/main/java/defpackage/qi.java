package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qi implements Collection, Set, y32, b42 {
    public int[] n;
    public Object[] o;
    public int p;

    public qi(int r2) {
        this.n = su3.a;
        this.o = su3.c;
        if (r2 <= 0) goto L6;
        this.n = new int[r2];
        this.o = new Object[r2];
        return;
    }

    public final Object a(int r10) {
        int r0 = this.p;
        Object[] r1 = this.o;
        Object r2 = r1[r10];
        if (r0 > 1) goto L6;
        clear();
        return r2;
    L6:
        int r3 = r0 - 1;
        int[] r4 = this.n;
        int r7 = 8;
        if (r4.length > 8) goto L9;
    L17:
        if (r10 >= r3) goto L19;
        int r5 = r10 + 1;
        ti.Y(r10, r5, r0, r4, r4);
        Object[] r6 = this.o;
        ti.Z(r10, r5, r0, r6, r6);
    L19:
        this.o[r3] = null;
    L21:
        if (r0 != this.p) goto L24;
        this.p = r3;
        return r2;
    L24:
        kf2.c();
        return null;
    L9:
        if (r0 >= (r4.length / 3)) goto L17;
        if (r0 <= 8) goto L12;
        r7 = r0 + (r0 >> 1);
    L12:
        int[] r8 = new int[r7];
        this.n = r8;
        this.o = new Object[r7];
        if (r10 <= 0) goto L15;
        ti.b0(0, r10, 6, r4, r8);
        ti.c0(0, r10, 6, r1, this.o);
    L15:
        if (r10 >= r3) goto L21;
        int r9 = r10 + 1;
        ti.Y(r10, r9, r0, r4, this.n);
        ti.Z(r10, r9, r0, r1, this.o);
        goto L21
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object r11) {
        int r0 = this.p;
        if (r11 != null) goto L5;
        int r2 = h12.w(this, null, 0);
        int r3 = 0;
    L6:
        if (r2 < 0) goto L8;
        return false;
    L8:
        int r4 = ~r2;
        int[] r5 = this.n;
        if (r0 < r5.length) goto L25;
        int r6 = 8;
        if (r0 < 8) goto L14;
        r6 = (r0 >> 1) + r0;
    L17:
        Object[] r7 = this.o;
        int[] r8 = new int[r6];
        this.n = r8;
        this.o = new Object[r6];
        if (r0 == this.p) goto L20;
        kf2.c();
        return false;
    L20:
        if (r8.length == 0) goto L25;
        ti.b0(0, r5.length, 6, r5, r8);
        ti.c0(0, r7.length, 6, r7, this.o);
        goto L25
    L14:
        if (r0 >= 4) goto L17;
        r6 = 4;
    L25:
        if (r4 >= r0) goto L27;
        int[] r9 = this.n;
        int r10 = r4 + 1;
        ti.Y(r10, r4, r0, r9, r9);
        Object[] r12 = this.o;
        ti.Z(r10, r4, r0, r12, r12);
    L27:
        int r13 = this.p;
        if (r0 != r13) goto L33;
        int[] r1 = this.n;
        if (r4 >= r1.length) goto L33;
        r1[r4] = r3;
        this.o[r4] = r11;
        this.p = r13 + 1;
        return true;
    L33:
        kf2.c();
        return false;
    L5:
        int r14 = r11.hashCode();
        r3 = r14;
        r2 = h12.w(this, r11, r14);
        goto L6
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection r7) {
        r7.getClass();
        int r0 = this.p;
        int r1 = r7.size() + r0;
        int r2 = this.p;
        int[] r3 = this.n;
        boolean r4 = false;
        if (r3.length >= r1) goto L8;
        Object[] r5 = this.o;
        int[] r6 = new int[r1];
        this.n = r6;
        this.o = new Object[r1];
        if (r2 <= 0) goto L8;
        ti.b0(0, r2, 6, r3, r6);
        Object[] r8 = this.o;
        ti.c0(0, this.p, 6, r5, r8);
    L8:
        if (this.p != r2) goto L14;
        Iterator r9 = r7.iterator();
    L11:
        if (r9.hasNext() == false) goto L13;
        r4 = r4 | add(r9.next());
        goto L11
    L13:
        return r4;
    L14:
        kf2.c();
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.p == 0) goto L6;
        this.n = su3.a;
        this.o = su3.c;
        this.p = 0;
    L6:
        if (this.p != 0) goto L8;
        return;
    L8:
        kf2.c();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object r3) {
        if (r3 != null) goto L5;
        int r2 = h12.w(this, null, 0);
    L6:
        if (r2 < 0) goto L9;
        return true;
    L9:
        return false;
    L5:
        r2 = h12.w(this, r3, r3.hashCode());
        goto L6
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection r2) {
        r2.getClass();
        Iterator r3 = r2.iterator();
    L4:
        if (r3.hasNext() == false) goto L9;
        if (contains(r3.next()) == true) goto L4;
        return false;
    L9:
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if ((r7 instanceof Set) == true) goto L8;
    L17:
        return false;
    L8:
        if (this.p == ((Set) r7).size()) goto L19;
        return false;
    L19:
        int r1 = this.p;     // Catch: Throwable -> L18
        int r3 = 0;
    L11:
        if (r3 >= r1) goto L16;
        if (((Set) r7).contains(this.o[r3]) == false) goto L14;
        r3 = r3 + 1;
        goto L11
    L14:
        return false;
    L16:
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] r0 = this.n;
        int r4 = this.p;
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r4) goto L5;
        r2 = r2 + r0[r1];
        r1 = r1 + 1;
        goto L3
    L5:
        return r2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.p > 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ki(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object r3) {
        if (r3 != null) goto L5;
        int r4 = h12.w(this, null, 0);
    L6:
        if (r4 < 0) goto L9;
        a(r4);
        return true;
    L9:
        return false;
    L5:
        r4 = h12.w(this, r3, r3.hashCode());
        goto L6
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection r3) {
        r3.getClass();
        Iterator r4 = r3.iterator();
        boolean r0 = false;
    L4:
        if (r4.hasNext() == false) goto L6;
        r0 = r0 | remove(r4.next());
        goto L4
    L6:
        return r0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection r6) {
        r6.getClass();
        int r0 = this.p - 1;
        boolean r2 = false;
    L4:
        if ((-1) >= r0) goto L9;
        if (q40.s0(r6, this.o[r0]) == true) goto L8;
        a(r0);
        r2 = true;
    L8:
        r0 = r0 - 1;
        goto L4
    L9:
        return r2;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.p;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] r3) {
        r3.getClass();
        int r0 = this.p;
        if (r3.length >= r0) goto L6;
        r3 = (Object[]) Array.newInstance(r3.getClass().getComponentType(), r0);
    L8:
        Object[] r1 = this.o;
        ti.Z(0, 0, this.p, r1, r3);
        return r3;
    L6:
        if (r3.length <= r0) goto L8;
        r3[r0] = null;
        goto L8
    }

    public final String toString() {
        if (isEmpty() == false) goto L6;
        return "{}";
    L6:
        StringBuilder r1 = new StringBuilder(this.p * 14);
        r1.append('{');
        int r0 = this.p;
        int r2 = 0;
    L7:
        if (r2 >= r0) goto L15;
        if (r2 <= 0) goto L10;
        r1.append(", ");
    L10:
        Object r3 = this.o[r2];
        if (r3 == this) goto L13;
        r1.append(r3);
    L14:
        r2 = r2 + 1;
        goto L7
    L13:
        r1.append("(this Set)");
        goto L14
    L15:
        r1.append('}');
        return r1.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return ti.e0(this.o, 0, this.p);
    }
}
