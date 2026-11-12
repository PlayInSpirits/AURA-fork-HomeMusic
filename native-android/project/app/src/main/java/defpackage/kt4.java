package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kt4 {
    public final int a;
    public final long[] b;
    public final Object[] c;

    public kt4(int r1, long[] r2, Object[] r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    public final int a(long r8) {
        int r0 = this.a - 1;
        if (r0 == (-1)) goto L21;
        long[] r7 = this.b;
        int r2 = 0;
        if (r0 == 0) goto L15;
    L6:
        if (r2 > r0) goto L14;
        int r1 = (r2 + r0) >>> 1;
        long r3 = r7[r1] - r8;
        if (r3 < 0) goto L9;
        if (r3 <= 0) goto L12;
        r0 = r1 - 1;
        goto L6
    L12:
        return r1;
    L9:
        r2 = r1 + 1;
        goto L6
    L14:
        return -(r2 + 1);
    L15:
        long r4 = r7[0];
        if (r4 != r8) goto L18;
        return 0;
    L18:
        if (r4 <= r8) goto L21;
        return -2;
    L21:
        return -1;
    }

    public final kt4 b(long r14, Object r16) {
        Object[] r0 = this.c;
        int r1 = r0.length;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r3 >= r1) goto L8;
        if (r0[r3] == null) goto L7;
        r4 = r4 + 1;
    L7:
        r3 = r3 + 1;
        goto L3
    L8:
        int r5 = r4 + 1;
        long[] r6 = new long[r5];
        Object[] r7 = new Object[r5];
        if (r5 <= 1) goto L27;
        int r8 = 0;
    L11:
        long[] r9 = this.b;
        int r10 = this.a;
        if (r2 >= r5) goto L20;
        if (r8 >= r10) goto L20;
        long r11 = r9[r8];
        Object r12 = r0[r8];
        if (r11 > r14) goto L16;
        if (r12 == null) goto L19;
        r6[r2] = r11;
        r7[r2] = r12;
        r2 = r2 + 1;
    L19:
        r8 = r8 + 1;
        goto L11
    L16:
        r6[r2] = r14;
        r7[r2] = r16;
        r2 = r2 + 1;
    L20:
        if (r8 != r10) goto L22;
        r6[r4] = r14;
        r7[r4] = r16;
    L29:
        return new kt4(r5, r6, r7);
    L22:
        if (r2 >= r5) goto L29;
        long r13 = r9[r8];
        Object r15 = r0[r8];
        if (r15 == null) goto L26;
        r6[r2] = r13;
        r7[r2] = r15;
        r2 = r2 + 1;
    L26:
        r8 = r8 + 1;
        goto L22
    L27:
        r6[0] = r14;
        r7[0] = r16;
        goto L29
    }
}
