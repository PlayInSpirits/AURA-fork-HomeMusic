package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r71 {
    public final ls a;
    public final ps b;
    public ms c;
    public final int d;

    public r71(ns r1, ps r2, long r3, long r5, long r7, long r9, long r11, int r13) {
        this.b = r2;
        this.d = r13;
        this.a = new ls(r1, r3, r5, r7, r9, r11);
    }

    public static int a(int r2, byte[] r3) {
        int r0 = (((r3[r2] & 255) << 24) | ((r3[r2 + 1] & 255) << 16)) | ((r3[r2 + 2] & 255) << 8);
        return (r3[r2 + 3] & 255) | r0;
    }

    public static int c(l51 r2, long r3, t71 r5) {
        if (r3 != r2.getPosition()) goto L6;
        return 0;
    L6:
        r5.a = r3;
        return 1;
    }

    public final int b(l51 r28, t71 r29) {
    L3:
        ms r3 = this.c;
        r3.getClass();
        long r4 = r3.f;
        long r6 = r3.g;
        long r8 = r3.h;
        long r7 = r6 - r4;
        long r10 = this.d;
        ps r11 = this.b;
        if (r7 <= r10) goto L5;
        long r5 = r8 - r28.getPosition();
        if (r5 < 0) goto L32;
        if (r5 > 262144) goto L32;
        r28.l((int) r5);
        r28.k();
        os r9 = r11.c(r28, r3.b);
        int r12 = r9.d;
        long r13 = r9.b;
        long r14 = r9.c;
        if (r12 == (-3)) goto L29;
        if (r12 != (-2)) goto L16;
        r3.d = r13;
        r3.f = r14;
        r3.h = ms.a(r3.b, r13, r3.e, r14, r3.g, r3.c);
        goto L3
    L16:
        if (r12 != (-1)) goto L17;
        r3.e = r13;
        r3.g = r14;
        r3.h = ms.a(r3.b, r3.d, r13, r3.f, r14, r3.c);
        goto L3
    L17:
        if (r12 != 0) goto L25;
        long r15 = r14 - r28.getPosition();
        if (r15 >= 0) goto L21;
    L23:
        this.c = null;
        r11.k();
        return c(r28, r14, r29);
    L21:
        if (r15 > 262144) goto L23;
        r28.l((int) r15);
        goto L23
    L25:
        kf2.o("Invalid case");
        return 0;
    L29:
        this.c = null;
        r11.k();
        return c(r28, r8, r29);
    L32:
        return c(r28, r8, r29);
    L5:
        this.c = null;
        r11.k();
        return c(r28, r4, r29);
    }

    public final void d(long r17) {
        ms r1 = this.c;
        if (r1 != null) goto L5;
    L7:
        ls r4 = this.a;
        this.c = new ms(r17, r4.a.e(r17), r4.c, r4.d, r4.e, r4.f);
        return;
    L5:
        if (r1.a != r17) goto L7;
    }
}
