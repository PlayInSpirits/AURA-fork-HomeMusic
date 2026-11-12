package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e94 implements q94, Iterable, x32 {
    public final w03 n;
    public fg2 o;
    public boolean p;
    public boolean q;

    public e94() {
        long[] r0 = v54.a;
        this.n = new w03();
    }

    @Override // defpackage.q94
    public final void a(p94 r4, Object r5) {
        boolean r0 = r5 instanceof w2;
        w03 r3 = this.n;
        if (r0 == true) goto L5;
    L13:
        r3.l(r4, r5);
    L14:
        r4.getClass();
        return;
    L5:
        if (r3.c(r4) == false) goto L13;
        Object r1 = r3.g(r4);
        r1.getClass();
        w2 r2 = (w2) r1;
        w2 r6 = (w2) r5;
        String r7 = r6.a;
        if (r7 != null) goto L9;
        r7 = r2.a;
    L9:
        sf1 r8 = r6.b;
        if (r8 != null) goto L12;
        r8 = r2.b;
    L12:
        r3.l(r4, new w2(r7, r8));
        goto L14
    }

    public final e94 b() {
        e94 r1 = new e94();
        r1.p = this.p;
        r1.q = this.q;
        w03 r2 = r1.n;
        r2.getClass();
        w03 r0 = this.n;
        r0.getClass();
        Object[] r3 = r0.b;
        Object[] r4 = r0.c;
        long[] r5 = r0.a;
        int r6 = r5.length - 2;
        if (r6 < 0) goto L16;
        int r7 = 0;
    L5:
        long r8 = r5[r7];
        if (((((~r8) << 7) & r8) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L14;
        int r10 = 8 - ((~(r7 - r6)) >>> 31);
        int r12 = 0;
    L8:
        if (r12 >= r10) goto L13;
        if ((255 & r8) >= 128) goto L12;
        int r13 = (r7 << 3) + r12;
        r2.l(r3[r13], r4[r13]);
    L12:
        r8 = r8 >> 8;
        r12 = r12 + 1;
        goto L8
    L13:
        if (r10 != 8) goto L16;
    L14:
        if (r7 == r6) goto L16;
        r7 = r7 + 1;
    L16:
        return r1;
    }

    public final Object d(p94 r2) {
        Object r1 = this.n.g(r2);
        if (r1 == null) goto L5;
        return r1;
    L5:
        nz2.w(r2, " - consider getOrElse or getOrNull", "Key not present: ");
        return null;
    }

    public final void e(e94 r17) {
        w03 r0 = r17.n;
        Object[] r1 = r0.b;
        Object[] r2 = r0.c;
        long[] r3 = r0.a;
        int r4 = r3.length - 2;
        if (r4 < 0) goto L22;
        int r5 = 0;
    L5:
        long r6 = r3[r5];
        if (((((~r6) << 7) & r6) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L20;
        int r8 = 8 - ((~(r5 - r4)) >>> 31);
        int r10 = 0;
    L8:
        if (r10 >= r8) goto L17;
        if ((255 & r6) >= 128) goto L15;
        int r11 = (r5 << 3) + r10;
        Object r12 = r1[r11];
        Object r13 = r2[r11];
        p94 r14 = (p94) r12;
        w03 r15 = this.n;
        Object r16 = r15.g(r14);
        r14.getClass();
        Object r7 = r14.b.invoke(r16, r13);
        if (r7 == null) goto L15;
        r15.l(r14, r7);
    L15:
        r6 = r6 >> 8;
        r10 = r10 + 1;
        goto L8
    L17:
        if (r8 == 8) goto L20;
        return;
    L20:
        if (r5 == r4) goto L30;
        r5 = r5 + 1;
        goto L5
    L30:
        return;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof e94) == false) goto L19;
        e94 r4 = (e94) r3;
        w03 r0 = r4.n;
        if (h12.c(this.n, r0) == true) goto L11;
        return false;
    L11:
        if (this.p == r4.p) goto L14;
        return false;
    L14:
        if (this.q == r4.q) goto L17;
        return false;
    L17:
        return true;
    L19:
        return false;
    }

    public final int hashCode() {
        int r0 = xa3.c(this.n.hashCode() * 31, 31, this.p);
        return Boolean.hashCode(this.q) + r0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        fg2 r0 = this.o;
        if (r0 != null) goto L6;
        w03 r1 = this.n;
        r1.getClass();
        fg2 r2 = new fg2(r1);
        this.o = r2;
        r0 = r2;
    L6:
        return ((r11) r0.entrySet()).iterator();
    }

    public final String toString() {
        StringBuilder r1 = new StringBuilder();
        if (this.p == false) goto L5;
        r1.append("mergeDescendants=true");
        String r2 = ", ";
    L7:
        if (this.q == false) goto L9;
        r1.append(r2);
        r1.append("isClearingSemantics=true");
        r2 = ", ";
    L9:
        w03 r4 = this.n;
        Object[] r5 = r4.b;
        Object[] r6 = r4.c;
        long[] r7 = r4.a;
        int r8 = r7.length - 2;
        if (r8 < 0) goto L24;
        int r9 = 0;
    L12:
        long r10 = r7[r9];
        if (((((~r10) << 7) & r10) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L21;
        int r12 = 8 - ((~(r9 - r8)) >>> 31);
        int r14 = 0;
    L15:
        if (r14 >= r12) goto L20;
        if ((255 & r10) >= 128) goto L19;
        int r15 = (r9 << 3) + r14;
        Object r16 = r5[r15];
        Object r17 = r6[r15];
        r1.append(r2);
        r1.append(((p94) r16).a);
        r1.append(" : ");
        r1.append(r17);
        r2 = ", ";
    L19:
        r10 = r10 >> 8;
        r14 = r14 + 1;
        goto L15
    L20:
        if (r12 != 8) goto L24;
    L21:
        if (r9 == r8) goto L24;
        r9 = r9 + 1;
    L24:
        return xl.L(this) + "{ " + r1 + " }";
    L5:
        r2 = "";
        goto L7
    }
}
