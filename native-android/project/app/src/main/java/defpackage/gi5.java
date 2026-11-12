package defpackage;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gi5 extends wh5 implements Set {
    public static final /* synthetic */ int p = 0;
    public transient ei5 o;

    public static gi5 g(int r14, Object... r15) {
        if (r14 == 0) goto L35;
        if (r14 == 1) goto L32;
        int r2 = h(r14);
        Object[] r8 = new Object[r2];
        int r5 = r2 - 1;
        int r3 = 0;
        int r4 = 0;
        int r6 = 0;
    L7:
        if (r3 >= r14) goto L20;
        Object r9 = r15[r3];
        if (r9 == null) goto L18;
        int r7 = r9.hashCode();
        int r10 = (int) (((long) Integer.rotateLeft((int) (((long) r7) * (-862048943)), 15)) * 461845907);
    L11:
        int r11 = r10 & r5;
        Object r12 = r8[r11];
        if (r12 == null) goto L13;
        if (r12.equals(r9) == true) goto L17;
        r10 = r10 + 1;
    L17:
        r3 = r3 + 1;
        goto L7
    L13:
        r15[r6] = r9;
        r8[r11] = r9;
        r4 = r4 + r7;
        r6 = r6 + 1;
        goto L17
    L18:
        nz2.n(f34.f(r3, "at index "));
        return null;
    L20:
        Arrays.fill(r15, r6, r14, null);
        if (r6 != 1) goto L25;
        Object r16 = r15[0];
        Objects.requireNonNull(r16);
        return new ti5(r16);
    L25:
        if (h(r6) < (r2 / 2)) goto L27;
        if (r6 > 0) goto L31;
        r15 = Arrays.copyOf(r15, r6);
    L31:
        return new qi5(r4, r5, r6, r15, r8);
    L27:
        return g(r6, r15);
    L32:
        Object r17 = r15[0];
        Objects.requireNonNull(r17);
        return new ti5(r17);
    L35:
        return qi5.w;
    }

    public static int h(int r5) {
        int r6 = Math.max(r5, 2);
        if (r6 >= 751619276) goto L10;
        int r0 = Integer.highestOneBit(r6 - 1);
    L5:
        r0 = r0 + r0;
        if ((((double) r0) * 0.7d) < r6) goto L5;
        return r0;
    L10:
        if (r6 >= 1073741824) goto L12;
        return 1073741824;
    L12:
        kf2.n("collection too large");
        return 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object r3) {
        if (r3 != this) goto L5;
        return true;
    L5:
        if ((r3 instanceof gi5) == true) goto L7;
    L12:
        if (r3 != this) goto L15;
        return true;
    L15:
        if ((r3 instanceof Set) == false) goto L31;
        Set r4 = (Set) r3;
        if (size() != r4.size()) goto L32;
        if (containsAll(r4) == false) goto L33;
        return true;
    L33:
        return false;
    L32:
        return false;
    L34:
        return false;
    L31:
        return false;
    L7:
        if ((this instanceof qi5) == false) goto L12;
        if ((((gi5) r3) instanceof qi5) == false) goto L12;
        if (((qi5) this).r == r3.hashCode()) goto L12;
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return gh0.M(this);
    }

    public ei5 i() {
        ei5 r0 = this.o;
        if (r0 != null) goto L6;
        ei5 r1 = j();
        this.o = r1;
        return r1;
    L6:
        return r0;
    }

    public ei5 j() {
        Object[] r1 = toArray(wh5.n);
        xh5 r0 = ei5.o;
        return ei5.i(r1.length, r1);
    }
}
