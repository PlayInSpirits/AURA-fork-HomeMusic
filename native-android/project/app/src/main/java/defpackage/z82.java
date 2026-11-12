package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z82 implements x44, u44 {
    public final y44 n;
    public final w44 o;
    public final x03 p;

    public z82(x44 r3, Map r4, w44 r5) {
        x r0 = new x(23, r3);
        wl4 r6 = z44.a;
        this.n = new y44(r4, r0);
        this.o = r5;
        x03 r7 = w54.a;
        this.p = new x03();
    }

    @Override // defpackage.x44
    public final c12 a(String r1, gf1 r2) {
        return this.n.a(r1, r2);
    }

    @Override // defpackage.x44
    public final boolean b(Object r1) {
        return this.n.b(r1);
    }

    @Override // defpackage.x44
    public final Map c() {
        x03 r0 = this.p;
        Object[] r1 = r0.b;
        long[] r2 = r0.a;
        int r3 = r2.length - 2;
        if (r3 < 0) goto L19;
        int r4 = 0;
    L5:
        long r5 = r2[r4];
        if (((((~r5) << 7) & r5) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L16;
        int r7 = 8 - ((~(r4 - r3)) >>> 31);
        int r9 = 0;
    L8:
        if (r9 >= r7) goto L15;
        if ((255 & r5) >= 128) goto L14;
        Object r10 = r1[(r4 << 3) + r9];
        w44 r11 = this.o;
        if (r11.o.j(r10) != null) goto L14;
        r11.n.remove(r10);
    L14:
        r5 = r5 >> 8;
        r9 = r9 + 1;
        goto L8
    L15:
        if (r7 != 8) goto L19;
    L16:
        if (r4 == r3) goto L19;
        r4 = r4 + 1;
    L19:
        return this.n.c();
    }

    @Override // defpackage.x44
    public final Object d(String r1) {
        return this.n.d(r1);
    }

    @Override // defpackage.u44
    public final void e(Object r7, r70 r8, rg1 r9, int r10) {
        r9.S(-858296452);
        if ((r10 & 6) == 0) goto L5;
        int r0 = r10;
    L11:
        if ((r10 & 48) != 0) goto L18;
        if (r9.g(r8) == false) goto L15;
        int r1 = 32;
    L16:
        r0 = r0 | r1;
        goto L18
    L15:
        r1 = 16;
    L18:
        if ((r10 & 384) != 0) goto L25;
        if (r9.g(this) == false) goto L22;
        int r2 = 256;
    L23:
        r0 = r0 | r2;
        goto L25
    L22:
        r2 = 128;
    L25:
        if ((r0 & 147) == 146) goto L27;
        boolean r3 = true;
    L29:
        if (r9.K(r0 & 1, r3) == false) goto L36;
        w44 r4 = this.o;
        r4.e(r7, r8, r9, r0 & 126);
        boolean r5 = r9.g(this) | r9.g(r7);
        Object r6 = r9.H();
        if (r5 == false) goto L33;
    L34:
        r6 = new o(15, this, r7);
        r9.b0(r6);
    L35:
        bu.b(r7, (if1) r6, r9);
    L37:
        lv3 r11 = r9.p();
        if (r11 == null) goto L41;
        r11.d = new o70(this, r7, r8, r10, 2);
        return;
    L41:
        return;
    L33:
        if (r6 != j80.a) goto L35;
    L36:
        r9.N();
        goto L37
    L27:
        r3 = false;
        goto L29
    L5:
        if (r9.g(r7) == false) goto L7;
        int r12 = 4;
    L8:
        r0 = r12 | r10;
        goto L11
    L7:
        r12 = 2;
        goto L8
    }
}
