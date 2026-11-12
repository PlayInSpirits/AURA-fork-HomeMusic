package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qy2 implements m84 {
    public final long a;
    public final ry2[] b;
    public final int c;

    public qy2(long r1, ry2[] r3, int r4) {
        this.a = r1;
        this.b = r3;
        this.c = r4;
    }

    @Override // defpackage.m84
    public final boolean b() {
        return true;
    }

    @Override // defpackage.m84
    public final l84 e(long r19) {
        ry2[] r3 = this.b;
        int r4 = r3.length;
        o84 r5 = o84.c;
        if (r4 == 0) goto L5;
        int r0 = this.c;
        if (r0 == (-1)) goto L23;
        xv4 r10 = r3[r0].b;
        int r11 = r10.a(r19);
        if (r11 != (-1)) goto L11;
        r11 = r10.b(r19);
    L11:
        long[] r12 = r10.c;
        long[] r13 = r10.f;
        if (r11 == (-1)) goto L14;
        long r14 = r13[r11];
        long r16 = r12[r11];
        if (r14 < r19) goto L18;
    L24:
        long r1 = -1;
        long r8 = -9223372036854775807L;
    L25:
        int r6 = 0;
        long r15 = r16;
    L27:
        if (r6 >= r3.length) goto L45;
        if (r6 == r0) goto L44;
        xv4 r17 = r3[r6].b;
        long[] r18 = r17.c;
        int r7 = r17.a(r14);
        if (r7 != (-1)) goto L32;
        r7 = r17.b(r14);
    L32:
        if (r7 == (-1)) goto L36;
        r15 = Math.min(r18[r7], r15);
    L36:
        if (r8 == (-9223372036854775807L)) goto L44;
        int r9 = r17.a(r8);
        if (r9 != (-1)) goto L40;
        r9 = r17.b(r8);
    L40:
        if (r9 == (-1)) goto L44;
        r1 = Math.min(r18[r9], r1);
    L44:
        r6 = r6 + 1;
        goto L27
    L45:
        o84 r2 = new o84(r14, r15);
        if (r8 != (-9223372036854775807L)) goto L50;
        return new l84(r2, r2);
    L50:
        return new l84(r2, new o84(r8, r1));
    L18:
        if (r11 >= (r10.b - 1)) goto L24;
        int r20 = r10.b(r19);
        if (r20 == (-1)) goto L24;
        if (r20 == r11) goto L24;
        r8 = r13[r20];
        r1 = r12[r20];
        goto L25
    L14:
        return new l84(r5, r5);
    L23:
        r16 = Long.MAX_VALUE;
        r14 = r19;
        goto L24
    L5:
        return new l84(r5, r5);
    }

    @Override // defpackage.m84
    public final long g() {
        return this.a;
    }
}
