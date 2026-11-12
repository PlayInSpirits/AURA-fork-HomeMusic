package defpackage;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r60 extends AbstractSet implements Serializable {
    public transient Object n;
    public transient int[] o;
    public transient Object[] p;
    public transient int q;
    public transient int r;

    public static r60 a(int r4) {
        r60 r0 = new r60();
        if (r4 < 0) goto L5;
        boolean r2 = true;
    L6:
        rr2.k("Expected size must be >= 0", r2);
        r0.q = jz4.o(r4, 1);
        return r0;
    L5:
        r2 = false;
        goto L6
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object r18) {
        char r3 = 31;
        if (d() == false) goto L11;
        rr2.v("Arrays already allocated", d());
        int r2 = this.q;
        int r5 = Math.max(r2 + 1, 2);
        int r6 = Integer.highestOneBit(r5);
        if (r5 <= ((int) (1.0d * ((double) r6)))) goto L10;
        r6 = r6 << 1;
        if (r6 > 0) goto L10;
        r6 = 1073741824;
    L10:
        int r7 = Math.max(4, r6);
        this.n = bu.g(r7);
        this.q = bu.s(this.q, 32 - Integer.numberOfLeadingZeros(r7 - 1), 31);
        this.o = new int[r2];
        this.p = new Object[r2];
    L11:
        Set r4 = b();
        if (r4 != null) goto L14;
        int[] r8 = f();
        Object[] r9 = e();
        int r10 = this.r;
        int r11 = r10 + 1;
        int r12 = g12.U(r18);
        int r13 = (1 << (this.q & 31)) - 1;
        int r14 = r12 & r13;
        Object r15 = this.n;
        Objects.requireNonNull(r15);
        int r16 = bu.B(r14, r15);
        int r17 = 0;
        if (r16 != 0) goto L20;
        if (r11 <= r13) goto L19;
        r13 = g(r13, bu.t(r13), r12, r10);
    L42:
        int r19 = f().length;
        if (r11 <= r19) goto L47;
        int r20 = Math.min(1073741823, (Math.max(1, r19 >>> 1) + r19) | 1);
        if (r20 == r19) goto L47;
        this.o = Arrays.copyOf(f(), r20);
        this.p = Arrays.copyOf(e(), r20);
    L47:
        f()[r10] = bu.s(r12, 0, r13);
        e()[r10] = r18;
        this.r = r11;
        this.q += 32;
        return true;
    L19:
        Object r21 = this.n;
        Objects.requireNonNull(r21);
        bu.C(r14, r11, r21);
        goto L42
    L20:
        int r110 = ~r13;
        int r111 = r12 & r110;
        int r112 = 0;
    L21:
        int r113 = r16 - 1;
        int r114 = r8[r113];
        char r115 = r3;
        if ((r114 & r110) == r111) goto L24;
    L26:
        int r22 = r114 & r13;
        r112 = r112 + 1;
        if (r22 == 0) goto L29;
        r16 = r22;
        r3 = r115;
        goto L21
    L29:
        if (r112 < 9) goto L39;
        LinkedHashSet r23 = new LinkedHashSet(1 << (this.q & 31), 1.0f);
        if (isEmpty() == false) goto L33;
        r17 = -1;
    L33:
        if (r17 < 0) goto L37;
        r23.add(e()[r17]);
        r17 = r17 + 1;
        if (r17 < this.r) goto L33;
        r17 = -1;
        goto L33
    L37:
        this.n = r23;
        this.o = null;
        this.p = null;
        this.q += 32;
        return r23.add(r18);
    L39:
        if (r11 <= r13) goto L41;
        r13 = g(r13, bu.t(r13), r12, r10);
        goto L42
    L41:
        r8[r113] = bu.s(r114, r11, r13);
        goto L42
    L24:
        if (si0.s(r18, r9[r113]) == false) goto L26;
        return false;
    L14:
        return r4.add(r18);
    }

    public final Set b() {
        Object r1 = this.n;
        if ((r1 instanceof Set) == true) goto L5;
        return null;
    L5:
        return (Set) r1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (d() == false) goto L5;
        return;
    L5:
        this.q += 32;
        Set r0 = b();
        if (r0 == null) goto L9;
        this.q = jz4.o(size(), 3);
        r0.clear();
        this.n = null;
        this.r = 0;
        return;
    L9:
        Arrays.fill(e(), 0, this.r, null);
        Object r1 = this.n;
        Objects.requireNonNull(r1);
        if ((r1 instanceof byte[]) == false) goto L13;
        Arrays.fill((byte[]) r1, (byte) 0);
    L16:
        Arrays.fill(f(), 0, this.r, 0);
        this.r = 0;
        return;
    L13:
        if ((r1 instanceof short[]) == false) goto L15;
        Arrays.fill((short[]) r1, 0);
        goto L16
    L15:
        Arrays.fill((int[]) r1, 0);
        goto L16
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object r8) {
        if (d() == true) goto L20;
        Set r0 = b();
        if (r0 != null) goto L8;
        int r1 = g12.U(r8);
        int r2 = (1 << (this.q & 31)) - 1;
        Object r3 = this.n;
        Objects.requireNonNull(r3);
        int r4 = bu.B(r1 & r2, r3);
        if (r4 == 0) goto L25;
        int r5 = ~r2;
        int r6 = r1 & r5;
    L13:
        int r7 = r4 - 1;
        int r9 = f()[r7];
        if ((r9 & r5) == r6) goto L16;
    L18:
        r4 = r9 & r2;
        if (r4 != 0) goto L13;
        return false;
    L16:
        if (si0.s(r8, e()[r7]) == false) goto L18;
        return true;
    L25:
        return false;
    L8:
        return r0.contains(r8);
    L20:
        return false;
    }

    public final boolean d() {
        if (this.n != null) goto L6;
        return true;
    L6:
        return false;
    }

    public final Object[] e() {
        Object[] r0 = this.p;
        Objects.requireNonNull(r0);
        return r0;
    }

    public final int[] f() {
        int[] r0 = this.o;
        Objects.requireNonNull(r0);
        return r0;
    }

    public final int g(int r9, int r10, int r11, int r12) {
        Object r0 = bu.g(r10);
        int r13 = r10 - 1;
        if (r12 == 0) goto L5;
        bu.C(r11 & r13, r12 + 1, r0);
    L5:
        Object r14 = this.n;
        Objects.requireNonNull(r14);
        int[] r15 = f();
        int r1 = 0;
    L6:
        if (r1 > r9) goto L11;
        int r2 = bu.B(r1, r14);
    L8:
        if (r2 == 0) goto L10;
        int r3 = r2 - 1;
        int r4 = r15[r3];
        int r5 = ((~r9) & r4) | r1;
        int r6 = r5 & r13;
        int r7 = bu.B(r6, r0);
        bu.C(r6, r2, r0);
        r15[r3] = bu.s(r5, r7, r13);
        r2 = r4 & r9;
        goto L8
    L10:
        r1 = r1 + 1;
        goto L6
    L11:
        this.n = r0;
        this.q = bu.s(this.q, 32 - Integer.numberOfLeadingZeros(r13), 31);
        return r13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (size() != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Set r0 = b();
        if (r0 == null) goto L7;
        return r0.iterator();
    L7:
        return new q60(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object r11) {
        if (d() == true) goto L11;
        Set r0 = b();
        if (r0 != null) goto L8;
        int r5 = (1 << (this.q & 31)) - 1;
        Object r6 = this.n;
        Objects.requireNonNull(r6);
        int r12 = bu.A(r11, null, r5, r6, f(), e(), null);
        if (r12 == (-1)) goto L11;
        Object r1 = this.n;
        Objects.requireNonNull(r1);
        int[] r3 = f();
        Object[] r4 = e();
        int r7 = size();
        int r8 = r7 - 1;
        if (r12 >= r8) goto L21;
        Object r9 = r4[r8];
        r4[r12] = r9;
        r4[r8] = null;
        r3[r12] = r3[r8];
        r3[r8] = 0;
        int r2 = g12.U(r9) & r5;
        int r10 = bu.B(r2, r1);
        if (r10 != r7) goto L17;
        bu.C(r2, r12 + 1, r1);
    L22:
        this.r--;
        this.q += 32;
        return true;
    L17:
        int r13 = r10 - 1;
        int r14 = r3[r13];
        int r15 = r14 & r5;
        if (r15 == r7) goto L19;
        r10 = r15;
        goto L17
    L19:
        r3[r13] = bu.s(r14, r12 + 1, r5);
        goto L22
    L21:
        r4[r12] = null;
        r3[r12] = 0;
        goto L22
    L8:
        return r0.remove(r11);
    L11:
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set r0 = b();
        if (r0 == null) goto L7;
        return r0.size();
    L7:
        return this.r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] r5) {
        if (d() == true) goto L5;
        Set r0 = b();
        if (r0 != null) goto L11;
        Object[] r1 = e();
        int r4 = this.r;
        rr2.u(0, r4, r1.length);
        if (r5.length >= r4) goto L20;
        if (r5.length == 0) goto L18;
        r5 = Arrays.copyOf(r5, 0);
    L18:
        r5 = Arrays.copyOf(r5, r4);
    L22:
        System.arraycopy(r1, 0, r5, 0, r4);
        return r5;
    L20:
        if (r5.length <= r4) goto L22;
        r5[r4] = null;
        goto L22
    L11:
        return r0.toArray(r5);
    L5:
        if (r5.length <= 0) goto L7;
        r5[0] = null;
    L7:
        return r5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        if (d() == true) goto L5;
        Set r0 = b();
        if (r0 == null) goto L11;
        return r0.toArray();
    L11:
        return Arrays.copyOf(e(), this.r);
    L5:
        return new Object[0];
    }
}
