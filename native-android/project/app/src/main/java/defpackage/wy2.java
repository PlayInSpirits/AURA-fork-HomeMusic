package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wy2 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Serializable g;

    public boolean a(int r10) {
        if ((r10 & (-2097152)) != (-2097152)) goto L53;
        int r0 = (r10 >>> 19) & 3;
        if (r0 == 1) goto L53;
        int r4 = (r10 >>> 17) & 3;
        if (r4 == 0) goto L53;
        int r5 = (r10 >>> 12) & 15;
        if (r5 == 0) goto L53;
        if (r5 == 15) goto L53;
        int r6 = (r10 >>> 10) & 3;
        if (r6 == 3) goto L53;
        this.a = r0;
        this.g = jz4.b[3 - r4];
        int r7 = jz4.c[r6];
        this.c = r7;
        int r8 = 2;
        if (r0 != 2) goto L20;
        this.c = r7 / 2;
    L22:
        int r9 = (r10 >>> 9) & 1;
        int r11 = 1152;
        if (r4 == 1) goto L29;
        if (r4 == 2) goto L32;
        if (r4 != 3) goto L27;
        r11 = 384;
        goto L32
    L27:
        nz2.c();
        return false;
    L32:
        this.f = r11;
        if (r4 != 3) goto L38;
        if (r0 != 3) goto L36;
        int r1 = jz4.d[r5 - 1];
    L37:
        this.e = r1;
        this.b = (((r1 * 12) / this.c) + r9) * 4;
    L49:
        if (((r10 >> 6) & 3) != 3) goto L51;
        r8 = 1;
    L51:
        this.d = r8;
        return true;
    L36:
        r1 = jz4.e[r5 - 1];
        goto L37
    L38:
        int r2 = 144;
        if (r0 != 3) goto L44;
        if (r4 != 2) goto L42;
        int r3 = jz4.f[r5 - 1];
    L43:
        this.e = r3;
        this.b = ((r3 * 144) / this.c) + r9;
        goto L49
    L42:
        r3 = jz4.g[r5 - 1];
        goto L43
    L44:
        int r12 = jz4.h[r5 - 1];
        this.e = r12;
        if (r4 != 1) goto L47;
        r2 = 72;
    L47:
        this.b = ((r2 * r12) / this.c) + r9;
        goto L49
    L29:
        if (r0 == 3) goto L32;
        r11 = 576;
        goto L32
    L20:
        if (r0 != 0) goto L22;
        this.c = r7 / 4;
    L53:
        return false;
    }
}
