package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wf2 implements y14 {
    public boolean n;
    public boolean o;
    public boolean p;
    public final w03 q;

    public wf2() {
        this.n = true;
        this.q = new w03();
    }

    public final void a() {
        w03 r14 = this.q;
        Object[] r0 = r14.c;
        long[] r1 = r14.a;
        int r2 = r1.length - 2;
        if (r2 < 0) goto L20;
        int r4 = 0;
    L5:
        long r5 = r1[r4];
        if (((((~r5) << 7) & r5) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L18;
        int r7 = 8 - ((~(r4 - r2)) >>> 31);
        int r9 = 0;
    L8:
        if (r9 >= r7) goto L17;
        if ((255 & r5) >= 128) goto L16;
        Object r10 = r0[(r4 << 3) + r9];
        if ((r10 instanceof q03) == false) goto L16;
        q03 r11 = (q03) r10;
        Object[] r12 = r11.a;
        int r13 = r11.b;
        int r15 = 0;
    L14:
        if (r15 >= r13) goto L16;
        Object r16 = r12[r15];
        r15 = r15 + 1;
    L16:
        r5 = r5 >> 8;
        r9 = r9 + 1;
        goto L8
    L17:
        if (r7 != 8) goto L20;
    L18:
        if (r4 == r2) goto L20;
        r4 = r4 + 1;
    L20:
        r14.a();
    }
}
