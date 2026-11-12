package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p60 extends AbstractMap implements Serializable {
    public static final Object w = null;
    public transient Object n;
    public transient int[] o;
    public transient Object[] p;
    public transient Object[] q;
    public transient int r;
    public transient int s;
    public transient n60 t;
    public transient n60 u;
    public transient s1 v;

    static {
        w = new Object();
    }

    public static p60 a() {
        p60 r0 = new p60();
        r0.r = jz4.o(3, 1);
        return r0;
    }

    public static p60 b(int r4) {
        p60 r0 = new p60();
        if (r4 < 0) goto L5;
        boolean r2 = true;
    L6:
        rr2.k("Expected size must be >= 0", r2);
        r0.r = jz4.o(r4, 1);
        return r0;
    L5:
        r2 = false;
        goto L6
    }

    public final Map c() {
        Object r1 = this.n;
        if ((r1 instanceof Map) == true) goto L5;
        return null;
    L5:
        return (Map) r1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (g() == false) goto L5;
        return;
    L5:
        this.r += 32;
        Map r0 = c();
        if (r0 == null) goto L9;
        this.r = jz4.o(size(), 3);
        r0.clear();
        this.n = null;
        this.s = 0;
        return;
    L9:
        Arrays.fill(j(), 0, this.s, null);
        Arrays.fill(k(), 0, this.s, null);
        Object r1 = this.n;
        Objects.requireNonNull(r1);
        if ((r1 instanceof byte[]) == false) goto L13;
        Arrays.fill((byte[]) r1, (byte) 0);
    L16:
        Arrays.fill(i(), 0, this.s, 0);
        this.s = 0;
        return;
    L13:
        if ((r1 instanceof short[]) == false) goto L15;
        Arrays.fill((short[]) r1, 0);
        goto L16
    L15:
        Arrays.fill((int[]) r1, 0);
        goto L16
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object r2) {
        Map r0 = c();
        if (r0 == null) goto L7;
        return r0.containsKey(r2);
    L7:
        if (e(r2) == (-1)) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object r4) {
        Map r0 = c();
        if (r0 != null) goto L5;
        int r1 = 0;
    L8:
        if (r1 >= this.s) goto L14;
        if (si0.s(r4, k()[r1]) == true) goto L11;
        r1 = r1 + 1;
        goto L8
    L11:
        return true;
    L14:
        return false;
    L5:
        return r0.containsValue(r4);
    }

    public final int d() {
        return (1 << (this.r & 31)) - 1;
    }

    public final int e(Object r8) {
        if (g() == false) goto L5;
        return -1;
    L5:
        int r0 = g12.U(r8);
        int r2 = d();
        Object r3 = this.n;
        Objects.requireNonNull(r3);
        int r4 = bu.B(r0 & r2, r3);
        if (r4 != 0) goto L8;
        return -1;
    L8:
        int r5 = ~r2;
        int r1 = r0 & r5;
    L9:
        int r6 = r4 - 1;
        int r7 = i()[r6];
        if ((r7 & r5) == r1) goto L12;
    L14:
        r4 = r7 & r2;
        if (r4 != 0) goto L9;
        return -1;
    L12:
        if (si0.s(r8, j()[r6]) == false) goto L14;
        return r6;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        n60 r0 = this.u;
        if (r0 != null) goto L6;
        n60 r1 = new n60(this, 0);
        this.u = r1;
        return r1;
    L6:
        return r0;
    }

    public final void f(int r10, int r11) {
        Object r0 = this.n;
        Objects.requireNonNull(r0);
        int[] r1 = i();
        Object[] r2 = j();
        Object[] r3 = k();
        int r9 = size();
        int r4 = r9 - 1;
        if (r10 >= r4) goto L13;
        Object r7 = r2[r4];
        r2[r10] = r7;
        r3[r10] = r3[r4];
        r2[r4] = null;
        r3[r4] = null;
        r1[r10] = r1[r4];
        r1[r4] = 0;
        int r5 = g12.U(r7) & r11;
        int r6 = bu.B(r5, r0);
        if (r6 != r9) goto L8;
        bu.C(r5, r10 + 1, r0);
        return;
    L8:
        int r8 = r6 - 1;
        int r12 = r1[r8];
        int r13 = r12 & r11;
        if (r13 == r9) goto L10;
        r6 = r13;
        goto L8
    L10:
        r1[r8] = bu.s(r12, r10 + 1, r11);
        return;
    L13:
        r2[r10] = null;
        r3[r10] = null;
        r1[r10] = 0;
    }

    public final boolean g() {
        if (this.n != null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object r2) {
        Map r0 = c();
        if (r0 != null) goto L5;
        int r3 = e(r2);
        if (r3 != (-1)) goto L11;
        return null;
    L11:
        return k()[r3];
    L5:
        return r0.get(r2);
    }

    public final Object h(Object r9) {
        if (g() == true) goto L8;
        int r3 = d();
        Object r4 = this.n;
        Objects.requireNonNull(r4);
        int r10 = bu.A(r9, null, r3, r4, i(), j(), null);
        if (r10 == (-1)) goto L8;
        Object r0 = k()[r10];
        f(r10, r3);
        this.s--;
        this.r += 32;
        return r0;
    L8:
        return w;
    }

    public final int[] i() {
        int[] r0 = this.o;
        Objects.requireNonNull(r0);
        return r0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final Object[] j() {
        Object[] r0 = this.p;
        Objects.requireNonNull(r0);
        return r0;
    }

    public final Object[] k() {
        Object[] r0 = this.q;
        Objects.requireNonNull(r0);
        return r0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        n60 r0 = this.t;
        if (r0 != null) goto L6;
        n60 r1 = new n60(this, 1);
        this.t = r1;
        return r1;
    L6:
        return r0;
    }

    public final int l(int r9, int r10, int r11, int r12) {
        Object r0 = bu.g(r10);
        int r13 = r10 - 1;
        if (r12 == 0) goto L5;
        bu.C(r11 & r13, r12 + 1, r0);
    L5:
        Object r14 = this.n;
        Objects.requireNonNull(r14);
        int[] r15 = i();
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
        this.r = bu.s(this.r, 32 - Integer.numberOfLeadingZeros(r13), 31);
        return r13;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f1 -> B:34:0x00d9). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object r20, Object r21) {
        int r4 = 1;
        if (g() == false) goto L11;
        rr2.v("Arrays already allocated", g());
        int r3 = this.r;
        int r5 = Math.max(r3 + 1, 2);
        int r6 = Integer.highestOneBit(r5);
        if (r5 <= ((int) (1.0d * ((double) r6)))) goto L10;
        r6 = r6 << 1;
        if (r6 > 0) goto L10;
        r6 = 1073741824;
    L10:
        int r7 = Math.max(4, r6);
        this.n = bu.g(r7);
        this.r = bu.s(this.r, 32 - Integer.numberOfLeadingZeros(r7 - 1), 31);
        this.o = new int[r3];
        this.p = new Object[r3];
        this.q = new Object[r3];
    L11:
        Map r8 = c();
        if (r8 != null) goto L14;
        int[] r9 = i();
        Object[] r10 = j();
        Object[] r11 = k();
        int r12 = this.s;
        int r13 = r12 + 1;
        int r14 = g12.U(r20);
        int r15 = d();
        int r16 = r14 & r15;
        Object r17 = this.n;
        Objects.requireNonNull(r17);
        int r18 = bu.B(r16, r17);
        if (r18 != 0) goto L21;
        if (r13 <= r15) goto L20;
        r15 = l(r15, bu.t(r15), r14, r12);
    L19:
        int r19 = 1;
    L45:
        int r22 = i().length;
        if (r13 <= r22) goto L50;
        int r110 = r19;
        int r23 = Math.min(1073741823, (Math.max(r110, r22 >>> 1) + r22) | r110);
        if (r23 == r22) goto L50;
        this.o = Arrays.copyOf(i(), r23);
        this.p = Arrays.copyOf(j(), r23);
        this.q = Arrays.copyOf(k(), r23);
    L50:
        i()[r12] = bu.s(r14, 0, r15);
        j()[r12] = r20;
        k()[r12] = r21;
        this.s = r13;
        this.r += 32;
        return null;
    L20:
        Object r24 = this.n;
        Objects.requireNonNull(r24);
        bu.C(r16, r13, r24);
        goto L19
    L21:
        int r111 = ~r15;
        int r112 = r14 & r111;
        int r113 = 0;
    L22:
        int r114 = r18 - r4;
        int r115 = r9[r114];
        r19 = r4;
        if ((r115 & r111) == r112) goto L25;
    L28:
        int r25 = r115 & r15;
        int r116 = r113 + 1;
        if (r25 == 0) goto L31;
        r18 = r25;
        r113 = r116;
        r4 = r19;
        goto L22
    L31:
        if (r116 < 9) goto L42;
        LinkedHashMap r26 = new LinkedHashMap(d() + 1, 1.0f);
        if (isEmpty() == false) goto L35;
    L34:
        int r117 = -1;
    L36:
        if (r117 < 0) goto L40;
        r26.put(j()[r117], k()[r117]);
        r117 = r117 + 1;
        if (r117 >= this.s) goto L34;
    L40:
        this.n = r26;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r += 32;
        return r26.put(r20, r21);
    L35:
        r117 = 0;
        goto L36
    L42:
        if (r13 <= r15) goto L44;
        r15 = l(r15, bu.t(r15), r14, r12);
        goto L45
    L44:
        r9[r114] = bu.s(r115, r13, r15);
        goto L45
    L25:
        if (si0.s(r20, r10[r114]) == false) goto L28;
        Object r0 = r11[r114];
        r11[r114] = r21;
        return r0;
    L14:
        return r8.put(r20, r21);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object r2) {
        Map r0 = c();
        if (r0 != null) goto L5;
        Object r1 = h(r2);
        if (r1 != w) goto L10;
        return null;
    L10:
        return r1;
    L5:
        return r0.remove(r2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map r0 = c();
        if (r0 == null) goto L7;
        return r0.size();
    L7:
        return this.s;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        s1 r0 = this.v;
        if (r0 != null) goto L6;
        s1 r1 = new s1(2, this);
        this.v = r1;
        return r1;
    L6:
        return r0;
    }
}
