package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ia2 extends x65 {
    public final i03 b;

    public ia2() {
        i03 r0 = f02.a;
        this.b = new i03();
    }

    @Override // defpackage.x65
    public final void b() {
        i03 r15 = this.b;
        int[] r0 = r15.b;
        Object[] r1 = r15.c;
        long[] r16 = r15.a;
        int r2 = r16.length - 2;
        if (r2 < 0) goto L21;
        int r4 = 0;
    L5:
        long r5 = r16[r4];
        if (((((~r5) << 7) & r5) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L19;
        int r7 = 8 - ((~(r4 - r2)) >>> 31);
        int r9 = 0;
    L8:
        if (r9 >= r7) goto L18;
        if ((255 & r5) >= 128) goto L17;
        int r10 = (r4 << 3) + r9;
        int r11 = r0[r10];
        q03 r12 = (q03) r1[r10];
        Object[] r13 = r12.a;
        int r14 = r12.b;
        int r17 = 0;
    L12:
        if (r17 >= r14) goto L17;
        ha2 r18 = (ha2) r13[r17];
        ez r19 = r18.d;
        if (r19 == null) goto L16;
        r19.cancel();
    L16:
        r18.d = null;
        wf2 r110 = (wf2) r18.a.o;
        r110.o = true;
        r110.n = false;
        r110.a();
        r17 = r17 + 1;
    L17:
        r5 = r5 >> 8;
        r9 = r9 + 1;
        goto L8
    L18:
        if (r7 == 8) goto L19;
        return;
    L19:
        if (r4 == r2) goto L30;
        r4 = r4 + 1;
        goto L5
    L30:
        return;
    }
}
