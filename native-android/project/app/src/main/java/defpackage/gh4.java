package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gh4 implements Iterable, x32 {
    public static final gh4 r = null;
    public final long n;
    public final long o;
    public final long p;
    public final long[] q;

    static {
        r = new gh4(0, 0, 0, null);
    }

    public gh4(long r1, long r3, long r5, long[] r7) {
        this.n = r1;
        this.o = r3;
        this.p = r5;
        this.q = r7;
    }

    public final gh4 a(gh4 r20) {
        gh4 r0 = this;
        gh4 r2 = r;
        if (r20 != r2) goto L5;
        return r0;
    L5:
        if (r0 != r2) goto L7;
        return r2;
    L7:
        long r3 = r20.p;
        long r4 = r20.p;
        long[] r6 = r20.q;
        long r7 = r20.o;
        long r9 = r20.n;
        long r11 = r0.p;
        if (r3 != r11) goto L13;
        long[] r1 = r0.q;
        if (r6 != r1) goto L13;
        return new gh4(r0.n & (~r9), r0.o & (~r7), r11, r1);
    L13:
        int r5 = 0;
        if (r6 == null) goto L19;
        int r8 = r6.length;
        int r10 = 0;
    L16:
        if (r10 >= r8) goto L19;
        r0 = r0.b(r6[r10]);
        r10 = r10 + 1;
    L19:
        if (r7 == 0) goto L27;
        int r12 = 0;
    L21:
        if (r12 >= 64) goto L27;
        if (((1 << r12) & r7) == 0) goto L25;
        r0 = r0.b(((long) r12) + r4);
    L25:
        r12 = r12 + 1;
    L27:
        if (r9 == 0) goto L33;
    L28:
        if (r5 >= 64) goto L33;
        if (((1 << r5) & r9) == 0) goto L32;
        r0 = r0.b((((long) r5) + r4) + 64);
    L32:
        r5 = r5 + 1;
    L33:
        return r0;
    }

    public final gh4 b(long r12) {
        long r0 = r12 - this.p;
        if (h12.k(r0, 0) < 0) goto L11;
        if (h12.k(r0, 64) >= 0) goto L11;
        long r13 = 1 << ((int) r0);
        long r1 = this.o;
        if ((r1 & r13) != 0) goto L9;
    L35:
        return this;
    L9:
        return new gh4(this.n, r1 & (~r13), this.p, this.q);
    L11:
        if (h12.k(r0, 64) < 0) goto L19;
        if (h12.k(r0, 128) >= 0) goto L19;
        long r14 = 1 << (((int) r0) - 64);
        long r2 = this.n;
        if ((r2 & r14) == 0) goto L35;
        return new gh4(r2 & (~r14), this.o, this.p, this.q);
    L19:
        if (h12.k(r0, 0) >= 0) goto L35;
        long[] r3 = this.q;
        if (r3 == null) goto L35;
        int r15 = q05.f(r3, r12);
        if (r15 < 0) goto L35;
        int r16 = r3.length;
        int r4 = r16 - 1;
        if (r4 != 0) goto L27;
        long[] r8 = null;
    L34:
        return new gh4(this.n, this.o, this.p, r8);
    L27:
        long[] r5 = new long[r4];
        if (r15 <= 0) goto L30;
        ti.a0(r3, r5, 0, 0, r15);
    L30:
        if (r15 >= r4) goto L32;
        ti.a0(r3, r5, r15, r15 + 1, r16);
    L32:
        r8 = r5;
        goto L34
    }

    public final boolean d(long r12) {
        long r0 = r12 - this.p;
        if (h12.k(r0, 0) < 0) goto L11;
        if (h12.k(r0, 64) >= 0) goto L11;
        if (((1 << ((int) r0)) & this.o) == 0) goto L9;
        return true;
    L9:
        return false;
    L11:
        if (h12.k(r0, 64) < 0) goto L19;
        if (h12.k(r0, 128) >= 0) goto L19;
        if (((1 << (((int) r0) - 64)) & this.n) == 0) goto L17;
        return true;
    L17:
        return false;
    L19:
        if (h12.k(r0, 0) <= 0) goto L21;
        return false;
    L21:
        long[] r11 = this.q;
        if (r11 != null) goto L24;
    L26:
        return false;
    L24:
        if (q05.f(r11, r12) < 0) goto L26;
        return true;
    }

    public final gh4 e(gh4 r23) {
        gh4 r0 = this;
        gh4 r2 = r;
        if (r23 != r2) goto L5;
        return r0;
    L5:
        if (r0 != r2) goto L7;
        return r23;
    L7:
        long r3 = r23.p;
        long r4 = r23.p;
        long[] r6 = r23.q;
        long r7 = r23.o;
        long r9 = r23.n;
        long r11 = r0.p;
        long r13 = r0.o;
        long r1 = r0.n;
        if (r3 != r11) goto L13;
        long[] r5 = r0.q;
        if (r6 != r5) goto L13;
        return new gh4(r1 | r9, r13 | r7, r11, r5);
    L13:
        int r14 = 0;
        long[] r12 = r0.q;
        if (r12 != null) goto L36;
        if (r12 == null) goto L19;
        int r8 = r12.length;
        gh4 r10 = r23;
        int r15 = 0;
    L17:
        if (r15 >= r8) goto L20;
        r10 = r10.f(r12[r15]);
        r15 = r15 + 1;
    L20:
        long r16 = r0.p;
        if (r13 == 0) goto L29;
        int r17 = 0;
    L23:
        if (r17 >= 64) goto L29;
        if (((1 << r17) & r13) == 0) goto L27;
        r10 = r10.f(((long) r17) + r16);
    L27:
        r17 = r17 + 1;
    L29:
        if (r1 == 0) goto L35;
    L30:
        if (r14 >= 64) goto L35;
        if (((1 << r14) & r1) == 0) goto L34;
        r10 = r10.f((((long) r14) + r16) + 64);
    L34:
        r14 = r14 + 1;
    L35:
        return r10;
    L19:
        r10 = r23;
        goto L20
    L36:
        if (r6 == null) goto L41;
        int r18 = r6.length;
        int r19 = 0;
    L38:
        if (r19 >= r18) goto L41;
        r0 = r0.f(r6[r19]);
        r19 = r19 + 1;
    L41:
        if (r7 == 0) goto L49;
        int r20 = 0;
    L43:
        if (r20 >= 64) goto L49;
        if (((1 << r20) & r7) == 0) goto L47;
        r0 = r0.f(((long) r20) + r4);
    L47:
        r20 = r20 + 1;
    L49:
        if (r9 == 0) goto L55;
    L50:
        if (r14 >= 64) goto L55;
        if (((1 << r14) & r9) == 0) goto L54;
        r0 = r0.f((((long) r14) + r4) + 64);
    L54:
        r14 = r14 + 1;
    L55:
        return r0;
    }

    public final gh4 f(long r30) {
        long r3 = this.p;
        long r5 = r30 - r3;
        long r7 = 0;
        int r9 = h12.k(r5, 0);
        long r10 = this.o;
        if (r9 >= 0) goto L5;
    L10:
        int r11 = h12.k(r5, 64);
        long r12 = this.n;
        int r20 = 64;
        if (r11 >= 0) goto L13;
    L18:
        int r6 = h12.k(r5, 128);
        int r8 = 0;
        long[] r13 = this.q;
        if (r6 < 0) goto L62;
        if (d(r30) == true) goto L69;
        long r14 = ((r30 + 1) / 64) * 64;
        if (h12.k(r14, 0) >= 0) goto L25;
        r14 = 9223372036854775680L;
    L25:
        long r22 = r12;
        rm2 r15 = null;
    L27:
        if (h12.k(r3, r14) >= 0) goto L45;
        if (r10 == r7) goto L40;
        if (r15 != null) goto L32;
        r15 = new rm2(r13);
    L32:
        int r16 = 0;
        int r17 = r20;
    L33:
        if (r16 >= r17) goto L39;
        if ((r10 & (1 << r16)) == r7) goto L38;
        ((l03) r15.o).a(((long) r16) + r3);
    L38:
        r16 = r16 + 1;
        r7 = r7;
    L39:
        long r21 = r7;
        if (r22 == r21) goto L43;
        r3 = r3 + 64;
        r7 = r21;
        r10 = r22;
        r20 = r17;
        r22 = r7;
        goto L27
    L43:
        long r26 = r14;
        long r24 = r21;
    L47:
        if (r15 == null) goto L58;
        l03 r0 = (l03) r15.o;
        int r4 = r0.b;
        if (r4 != 0) goto L51;
        long[] r1 = null;
    L55:
        if (r1 == null) goto L58;
        long[] r28 = r1;
    L60:
        return new gh4(r22, r24, r26, r28).f(r30);
    L51:
        long[] r18 = new long[r4];
        long[] r2 = r0.a;
    L52:
        if (r8 >= r4) goto L54;
        r18[r8] = r2[r8];
        r8 = r8 + 1;
        goto L52
    L54:
        r1 = r18;
    L58:
        r28 = r13;
        goto L60
    L40:
        r17 = r20;
        goto L39
    L45:
        r26 = r3;
        r24 = r10;
    L69:
        return this;
    L62:
        if (r13 == null) goto L64;
        int r19 = q05.f(r13, r30);
        if (r19 >= 0) goto L69;
        int r23 = -(r19 + 1);
        int r25 = r13.length;
        long[] r27 = new long[r25 + 1];
        ti.a0(r13, r27, 0, 0, r23);
        ti.a0(r13, r27, r23 + 1, r23, r25);
        r27[r23] = r30;
        return new gh4(this.n, this.o, this.p, r27);
    L64:
        return new gh4(this.n, this.o, this.p, new long[]{r30});
    L13:
        if (h12.k(r5, 128) >= 0) goto L18;
        long r29 = 1 << (((int) r5) - 64);
        if ((r12 & r29) != 0) goto L69;
        return new gh4(r12 | r29, this.o, this.p, this.q);
    L5:
        if (h12.k(r5, 64) >= 0) goto L10;
        long r31 = 1 << ((int) r5);
        if ((r10 & r31) != 0) goto L69;
        return new gh4(this.n, r10 | r31, this.p, this.q);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return si0.C(new fh4(this, null));
    }

    public final String toString() {
        String r0 = super.toString();
        ArrayList r1 = new ArrayList(r40.k0(this, 10));
        Iterator r9 = iterator();
    L4:
        if (r9.hasNext() == false) goto L6;
        r1.add(String.valueOf(((Number) r9.next()).longValue()));
        goto L4
    L6:
        StringBuilder r10 = new StringBuilder();
        r10.append("");
        int r3 = r1.size();
        int r4 = 0;
        int r5 = 0;
    L7:
        if (r4 >= r3) goto L21;
        Object r6 = r1.get(r4);
        boolean r7 = true;
        r5 = r5 + 1;
        if (r5 <= 1) goto L11;
        r10.append(", ");
    L11:
        if (r6 == null) goto L14;
        r7 = r6 instanceof CharSequence;
    L14:
        if (r7 == false) goto L17;
        r10.append((CharSequence) r6);
    L20:
        r4 = r4 + 1;
        goto L7
    L17:
        if ((r6 instanceof Character) == false) goto L19;
        r10.append(((Character) r6).charValue());
        goto L20
    L19:
        r10.append(r6.toString());
        goto L20
    L21:
        r10.append("");
        return r0 + " [" + r10.toString() + "]";
    }
}
