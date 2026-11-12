package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mz2 {
    public final w03 a;

    public /* synthetic */ mz2(w03 r1) {
        this.a = r1;
    }

    public static final Object a(w03 r5) {
        Object r1 = r5.g(null);
        if (r1 != null) goto L6;
        return null;
    L6:
        if ((r1 instanceof q03) == false) goto L18;
        q03 r2 = (q03) r1;
        if (r2.h() == true) goto L16;
        int r3 = r2.b - 1;
        Object r4 = r2.f(r3);
        r2.k(r3);
        r4.getClass();
        if (r2.h() == false) goto L13;
        r5.j(null);
    L13:
        if (r2.b != 1) goto L15;
        r5.l(null, r2.e());
    L15:
        return r4;
    L16:
        kf2.m("List is empty.");
        return null;
    L18:
        r5.j(null);
        return r1;
    }

    public static final q03 b(w03 r14) {
        if (r14.i() == false) goto L6;
        q03 r15 = t73.b;
        r15.getClass();
        return r15;
    L6:
        q03 r0 = new q03();
        Object[] r1 = r14.c;
        long[] r16 = r14.a;
        int r2 = r16.length - 2;
        if (r2 < 0) goto L23;
        int r4 = 0;
    L9:
        long r5 = r16[r4];
        if (((((~r5) << 7) & r5) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L21;
        int r7 = 8 - ((~(r4 - r2)) >>> 31);
        int r9 = 0;
    L12:
        if (r9 >= r7) goto L20;
        if ((255 & r5) >= 128) goto L19;
        Object r10 = r1[(r4 << 3) + r9];
        if ((r10 instanceof q03) == false) goto L18;
        r0.b((q03) r10);
        goto L19
    L18:
        r10.getClass();
        r0.a(r10);
    L19:
        r5 = r5 >> 8;
        r9 = r9 + 1;
        goto L12
    L20:
        if (r7 != 8) goto L23;
    L21:
        if (r4 == r2) goto L23;
        r4 = r4 + 1;
    L23:
        return r0;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof mz2) == false) goto L11;
        w03 r3 = ((mz2) r2).a;
        if (this.a.equals(r3) == true) goto L9;
        return false;
    L9:
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ")";
    }
}
