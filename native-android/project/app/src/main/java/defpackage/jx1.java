package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jx1 extends rw1 implements Set {
    public static final /* synthetic */ int p = 0;
    public transient yw1 o;

    public static int i(int r5) {
        int r6 = Math.max(r5, 2);
        boolean r1 = true;
        if (r6 >= 751619276) goto L10;
        int r0 = Integer.highestOneBit(r6 - 1) << 1;
    L6:
        if ((((double) r0) * 0.7d) >= r6) goto L8;
        r0 = r0 << 1;
        goto L6
    L8:
        return r0;
    L10:
        if (r6 < 1073741824) goto L13;
        r1 = false;
    L13:
        rr2.k("collection too large", r1);
        return 1073741824;
    }

    public static jx1 j(int r13, Object... r14) {
        if (r13 == 0) goto L36;
        if (r13 == 1) goto L33;
        int r2 = i(r13);
        Object[] r8 = new Object[r2];
        int r5 = r2 - 1;
        int r3 = 0;
        int r4 = 0;
        int r6 = 0;
    L7:
        if (r3 >= r13) goto L20;
        Object r9 = r14[r3];
        if (r9 == null) goto L18;
        int r10 = r9.hashCode();
        int r7 = g12.T(r10);
    L11:
        int r11 = r7 & r5;
        Object r12 = r8[r11];
        if (r12 == null) goto L13;
        if (r12.equals(r9) == true) goto L16;
        r7 = r7 + 1;
    L16:
        r3 = r3 + 1;
        goto L7
    L13:
        r14[r6] = r9;
        r8[r11] = r9;
        r4 = r4 + r10;
        r6 = r6 + 1;
        goto L16
    L18:
        nz2.n(f34.f(r3, "at index "));
        return null;
    L20:
        Arrays.fill(r14, r6, r13, null);
        if (r6 != 1) goto L25;
        Object r15 = r14[0];
        Objects.requireNonNull(r15);
        return new nf4(r15);
    L25:
        if (i(r6) < (r2 / 2)) goto L27;
        int r16 = r14.length;
        if (r6 >= ((r16 >> 1) + (r16 >> 2))) goto L32;
        r14 = Arrays.copyOf(r14, r6);
    L32:
        return new ny3(r4, r5, r6, r14, r8);
    L27:
        return j(r6, r14);
    L33:
        Object r17 = r14[0];
        Objects.requireNonNull(r17);
        return new nf4(r17);
    L36:
        return ny3.w;
    }

    public static jx1 k(Collection r2) {
        if ((r2 instanceof jx1) == true) goto L5;
    L9:
        Object[] r3 = r2.toArray();
        return j(r3.length, r3);
    L5:
        if ((r2 instanceof SortedSet) == true) goto L9;
        jx1 r0 = (jx1) r2;
        if (r0.g() == true) goto L9;
        return r0;
    }

    @Override // defpackage.rw1
    public yw1 a() {
        yw1 r0 = this.o;
        if (r0 != null) goto L6;
        yw1 r1 = l();
        this.o = r1;
        return r1;
    L6:
        return r0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object r3) {
        if (r3 != this) goto L6;
        return true;
    L6:
        if ((r3 instanceof jx1) == false) goto L16;
        if ((this instanceof ny3) == false) goto L16;
        if ((((jx1) r3) instanceof ny3) == false) goto L16;
        if (((ny3) this).r == r3.hashCode()) goto L16;
        return false;
    L16:
        return j51.r(this, r3);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return j51.x(this);
    }

    public yw1 l() {
        Object[] r1 = toArray(rw1.n);
        vw1 r0 = yw1.o;
        return yw1.i(r1.length, r1);
    }
}
