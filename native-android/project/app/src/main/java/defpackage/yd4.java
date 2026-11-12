package defpackage;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class yd4 {
    public int[] n;
    public Object[] o;
    public int p;

    public yd4(int r2) {
        if (r2 != 0) goto L5;
        int[] r0 = su3.a;
    L6:
        this.n = r0;
        if (r2 != 0) goto L9;
        Object[] r3 = su3.c;
    L10:
        this.o = r3;
        return;
    L9:
        r3 = new Object[r2 << 1];
        goto L10
    L5:
        r0 = new int[r2];
        goto L6
    }

    public final int a(Object r5) {
        int r0 = this.p * 2;
        Object[] r4 = this.o;
        if (r5 != null) goto L11;
        int r6 = 1;
    L5:
        if (r6 >= r0) goto L18;
        if (r4[r6] == null) goto L9;
        r6 = r6 + 2;
        goto L5
    L9:
        return r6 >> 1;
    L18:
        return -1;
    L11:
        int r2 = 1;
    L12:
        if (r2 >= r0) goto L24;
        if (r5.equals(r4[r2]) == true) goto L16;
        r2 = r2 + 2;
        goto L12
    L16:
        return r2 >> 1;
    L24:
        return -1;
    }

    public final void b(int r4) {
        int r0 = this.p;
        int[] r1 = this.n;
        if (r1.length >= r4) goto L6;
        this.n = Arrays.copyOf(r1, r4);
        this.o = Arrays.copyOf(this.o, r4 * 2);
    L6:
        if (this.p != r0) goto L8;
        return;
    L8:
        kf2.c();
    }

    public final int c(int r6, Object r7) {
        int r0 = this.p;
        if (r0 != 0) goto L6;
        return -1;
    L6:
        int r1 = su3.h(r0, r6, this.n);
        if (r1 >= 0) goto L10;
    L11:
        return r1;
    L10:
        if (h12.c(r7, this.o[r1 << 1]) == true) goto L11;
        int r2 = r1 + 1;
    L13:
        if (r2 >= r0) goto L20;
        if (this.n[r2] != r6) goto L20;
        if (h12.c(r7, this.o[r2 << 1]) == true) goto L18;
        r2 = r2 + 1;
        goto L13
    L18:
        return r2;
    L20:
        int r3 = r1 - 1;
    L21:
        if (r3 < 0) goto L29;
        if (this.n[r3] != r6) goto L29;
        if (h12.c(r7, this.o[r3 << 1]) == true) goto L26;
        r3 = r3 - 1;
        goto L21
    L26:
        return r3;
    L29:
        return ~r2;
    }

    public void clear() {
        if (this.p <= 0) goto L6;
        this.n = su3.a;
        this.o = su3.c;
        this.p = 0;
    L6:
        if (this.p > 0) goto L8;
        return;
    L8:
        kf2.c();
    }

    public boolean containsKey(Object r1) {
        if (d(r1) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean containsValue(Object r1) {
        if (a(r1) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final int d(Object r2) {
        if (r2 != null) goto L6;
        return e();
    L6:
        return c(r2.hashCode(), r2);
    }

    public final int e() {
        int r0 = this.p;
        if (r0 != 0) goto L6;
        return -1;
    L6:
        int r1 = su3.h(r0, 0, this.n);
        if (r1 >= 0) goto L10;
    L11:
        return r1;
    L10:
        if (this.o[r1 << 1] == null) goto L11;
        int r2 = r1 + 1;
    L13:
        if (r2 >= r0) goto L20;
        if (this.n[r2] != 0) goto L20;
        if (this.o[r2 << 1] == null) goto L18;
        r2 = r2 + 1;
        goto L13
    L18:
        return r2;
    L20:
        int r3 = r1 - 1;
    L21:
        if (r3 < 0) goto L29;
        if (this.n[r3] != 0) goto L29;
        if (this.o[r3 << 1] == null) goto L26;
        r3 = r3 - 1;
        goto L21
    L26:
        return r3;
    L29:
        return ~r2;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L44;
        return true;
    L44:
        if ((r8 instanceof yd4) == false) goto L25;
        int r2 = this.p;     // Catch: Throwable -> L43
        if (r2 == ((yd4) r8).p) goto L11;
        return false;
    L11:
        yd4 r9 = (yd4) r8;     // Catch: Throwable -> L43
        int r3 = 0;
    L12:
        if (r3 >= r2) goto L23;
        Object r4 = f(r3);     // Catch: Throwable -> L43
        Object r5 = j(r3);     // Catch: Throwable -> L43
        Object r6 = r9.get(r4);     // Catch: Throwable -> L43
        if (r5 != null) goto L20;
        if (r6 != null) goto L18;
        if (r9.containsKey(r4) == false) goto L18;
    L22:
        r3 = r3 + 1;     // Catch: Throwable -> L43
    L18:
        return false;
    L20:
        if (r5.equals(r6) == true) goto L22;
        return false;
    L23:
        return true;
    L25:
        if ((r8 instanceof Map) == false) goto L42;
        if (this.p == ((Map) r8).size()) goto L29;
        return false;
    L29:
        int r7 = this.p;     // Catch: Throwable -> L43
        int r10 = 0;
    L30:
        if (r10 >= r7) goto L41;
        Object r11 = f(r10);     // Catch: Throwable -> L43
        Object r12 = j(r10);     // Catch: Throwable -> L43
        Object r13 = ((Map) r8).get(r11);     // Catch: Throwable -> L43
        if (r12 != null) goto L38;
        if (r13 != null) goto L36;
        if (((Map) r8).containsKey(r11) == false) goto L36;
    L40:
        r10 = r10 + 1;
    L36:
        return false;
    L38:
        if (r12.equals(r13) == true) goto L40;
        return false;
    L41:
        return true;
    L42:
        return false;
    }

    public final Object f(int r4) {
        boolean r0 = false;
        if (r4 >= 0) goto L5;
    L7:
        if (r0 == true) goto L9;
        kf2.n(f34.f(r4, "Expected index to be within 0..size()-1, but was "));
        return null;
    L9:
        return this.o[r4 << 1];
    L5:
        if (r4 >= this.p) goto L7;
        r0 = true;
        goto L7
    }

    public void g(oi r5) {
        int r0 = r5.p;
        b(this.p + r0);
        int r2 = 0;
        if (this.p != 0) goto L7;
        if (r0 <= 0) goto L9;
        ti.Y(0, 0, r0, r5.n, this.n);
        int r3 = r0 << 1;
        ti.Z(0, 0, r3, r5.o, this.o);
        this.p = r0;
        return;
    L9:
        return;
    L7:
        if (r2 >= r0) goto L11;
        put(r5.f(r2), r5.j(r2));
        r2 = r2 + 1;
        goto L7
    }

    public Object get(Object r1) {
        int r2 = d(r1);
        if (r2 >= 0) goto L5;
        return null;
    L5:
        return this.o[(r2 << 1) + 1];
    }

    public final Object getOrDefault(Object r1, Object r2) {
        int r3 = d(r1);
        if (r3 >= 0) goto L5;
        return r2;
    L5:
        return this.o[(r3 << 1) + 1];
    }

    public Object h(int r11) {
        if (r11 < 0) goto L33;
        int r1 = this.p;
        if (r11 >= r1) goto L33;
        Object[] r2 = this.o;
        int r3 = r11 << 1;
        Object r4 = r2[r3 + 1];
        if (r1 > 1) goto L10;
        clear();
        return r4;
    L10:
        int r6 = r1 - 1;
        int[] r7 = this.n;
        int r9 = 8;
        if (r7.length > 8) goto L13;
    L24:
        if (r11 >= r6) goto L26;
        int r5 = r11 + 1;
        ti.Y(r11, r5, r1, r7, r7);
        Object[] r12 = this.o;
        ti.Z(r3, r5 << 1, r1 << 1, r12, r12);
    L26:
        Object[] r13 = this.o;
        int r8 = r6 << 1;
        r13[r8] = null;
        r13[r8 + 1] = null;
    L28:
        if (r1 != this.p) goto L31;
        this.p = r6;
        return r4;
    L31:
        kf2.c();
        return null;
    L13:
        if (r1 >= (r7.length / 3)) goto L24;
        if (r1 <= 8) goto L16;
        r9 = r1 + (r1 >> 1);
    L16:
        this.n = Arrays.copyOf(r7, r9);
        this.o = Arrays.copyOf(this.o, r9 << 1);
        if (r1 != this.p) goto L22;
        if (r11 <= 0) goto L20;
        ti.Y(0, 0, r11, r7, this.n);
        ti.Z(0, 0, r3, r2, this.o);
    L20:
        if (r11 >= r6) goto L28;
        int r10 = r11 + 1;
        ti.Y(r11, r10, r1, r7, this.n);
        ti.Z(r3, r10 << 1, r1 << 1, r2, this.o);
        goto L28
    L22:
        kf2.c();
        return null;
    L33:
        kf2.n(f34.f(r11, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public int hashCode() {
        int[] r0 = this.n;
        Object[] r1 = this.o;
        int r8 = this.p;
        int r3 = 1;
        int r4 = 0;
        int r5 = 0;
    L3:
        if (r4 >= r8) goto L9;
        Object r6 = r1[r3];
        int r7 = r0[r4];
        if (r6 == null) goto L7;
        int r9 = r6.hashCode();
    L8:
        r5 = r5 + (r9 ^ r7);
        r4 = r4 + 1;
        r3 = r3 + 2;
        goto L3
    L7:
        r9 = 0;
        goto L8
    L9:
        return r5;
    }

    public Object i(int r4, Object r5) {
        boolean r0 = false;
        if (r4 >= 0) goto L5;
    L7:
        if (r0 == false) goto L10;
        int r6 = (r4 << 1) + 1;
        Object[] r3 = this.o;
        Object r1 = r3[r6];
        r3[r6] = r5;
        return r1;
    L10:
        kf2.n(f34.f(r4, "Expected index to be within 0..size()-1, but was "));
        return null;
    L5:
        if (r4 >= this.p) goto L7;
        r0 = true;
        goto L7
    }

    public final boolean isEmpty() {
        if (this.p > 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final Object j(int r4) {
        boolean r0 = false;
        if (r4 >= 0) goto L5;
    L7:
        if (r0 == true) goto L9;
        kf2.n(f34.f(r4, "Expected index to be within 0..size()-1, but was "));
        return null;
    L9:
        return this.o[(r4 << 1) + 1];
    L5:
        if (r4 >= this.p) goto L7;
        r0 = true;
        goto L7
    }

    public Object put(Object r9, Object r10) {
        int r0 = this.p;
        if (r9 == null) goto L5;
        int r1 = r9.hashCode();
    L6:
        if (r9 == null) goto L8;
        int r2 = c(r1, r9);
    L9:
        if (r2 < 0) goto L12;
        int r11 = (r2 << 1) + 1;
        Object[] r8 = this.o;
        Object r3 = r8[r11];
        r8[r11] = r10;
        return r3;
    L12:
        int r4 = ~r2;
        int[] r5 = this.n;
        if (r0 < r5.length) goto L26;
        int r6 = 8;
        if (r0 < 8) goto L18;
        r6 = (r0 >> 1) + r0;
    L21:
        this.n = Arrays.copyOf(r5, r6);
        this.o = Arrays.copyOf(this.o, r6 << 1);
        if (r0 == this.p) goto L26;
        kf2.c();
        return null;
    L18:
        if (r0 >= 4) goto L21;
        r6 = 4;
    L26:
        if (r4 >= r0) goto L28;
        int[] r7 = this.n;
        int r12 = r4 + 1;
        ti.Y(r12, r4, r0, r7, r7);
        Object[] r13 = this.o;
        ti.Z(r12 << 1, r4 << 1, this.p << 1, r13, r13);
    L28:
        int r14 = this.p;
        if (r0 != r14) goto L34;
        int[] r15 = this.n;
        if (r4 >= r15.length) goto L34;
        r15[r4] = r1;
        Object[] r16 = this.o;
        int r17 = r4 << 1;
        r16[r17] = r9;
        r16[r17 + 1] = r10;
        this.p = r14 + 1;
        return null;
    L34:
        kf2.c();
        return null;
    L8:
        r2 = e();
        goto L9
    L5:
        r1 = 0;
        goto L6
    }

    public final Object putIfAbsent(Object r2, Object r3) {
        Object r0 = get(r2);
        if (r0 == null) goto L5;
        return r0;
    L5:
        return put(r2, r3);
    }

    public final boolean remove(Object r2, Object r3) {
        int r4 = d(r2);
        if (r4 >= 0) goto L5;
        return false;
    L5:
        if (h12.c(r3, j(r4)) == false) goto L10;
        h(r4);
        return true;
    L10:
        return false;
    }

    public final boolean replace(Object r2, Object r3, Object r4) {
        int r5 = d(r2);
        if (r5 >= 0) goto L5;
        return false;
    L5:
        if (h12.c(r3, j(r5)) == false) goto L10;
        i(r5, r4);
        return true;
    L10:
        return false;
    }

    public final int size() {
        return this.p;
    }

    public final String toString() {
        if (isEmpty() == false) goto L6;
        return "{}";
    L6:
        StringBuilder r1 = new StringBuilder(this.p * 28);
        r1.append('{');
        int r0 = this.p;
        int r2 = 0;
    L7:
        if (r2 >= r0) goto L19;
        if (r2 <= 0) goto L10;
        r1.append(", ");
    L10:
        Object r3 = f(r2);
        if (r3 == r1) goto L13;
        r1.append(r3);
    L14:
        r1.append('=');
        Object r4 = j(r2);
        if (r4 == r1) goto L17;
        r1.append(r4);
    L18:
        r2 = r2 + 1;
        goto L7
    L17:
        r1.append("(this Map)");
        goto L18
    L13:
        r1.append("(this Map)");
        goto L14
    L19:
        r1.append('}');
        return r1.toString();
    }

    public Object remove(Object r1) {
        int r2 = d(r1);
        if (r2 >= 0) goto L5;
        return null;
    L5:
        return h(r2);
    }

    public final Object replace(Object r1, Object r2) {
        int r3 = d(r1);
        if (r3 >= 0) goto L5;
        return null;
    L5:
        return i(r3, r2);
    }
}
