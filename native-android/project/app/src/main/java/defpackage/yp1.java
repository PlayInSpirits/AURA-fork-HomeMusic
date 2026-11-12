package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yp1 {
    public int a;
    public final ArrayList b;
    public final xu3 c;
    public pl1[] d;
    public int e;
    public int f;
    public int g;

    public yp1(tq1 r2) {
        this.a = 4096;
        this.b = new ArrayList();
        this.c = new xu3(r2);
        this.d = new pl1[8];
        this.e = 7;
    }

    public final int a(int r5) {
        int r0 = 0;
        if (r5 <= 0) goto L10;
        int r1 = this.d.length;
    L5:
        r1 = r1 - 1;
        int r2 = this.e;
        if (r1 < r2) goto L9;
        if (r5 <= 0) goto L9;
        pl1 r3 = this.d[r1];
        r3.getClass();
        int r4 = r3.c;
        r5 = r5 - r4;
        this.g -= r4;
        this.f--;
        r0 = r0 + 1;
    L9:
        pl1[] r6 = this.d;
        System.arraycopy(r6, r2 + 1, r6, (r2 + 1) + r0, this.f);
        this.e += r0;
    L10:
        return r0;
    }

    public final yw b(int r3) {
        if (r3 < 0) goto L7;
        pl1[] r0 = aq1.a;
        if (r3 > (r0.length - 1)) goto L7;
        return r0[r3].a;
    L7:
        int r1 = (this.e + 1) + (r3 - aq1.a.length);
        if (r1 < 0) goto L14;
        pl1[] r2 = this.d;
        if (r1 >= r2.length) goto L14;
        pl1 r4 = r2[r1];
        r4.getClass();
        return r4.a;
    L14:
        throw new IOException("Header index too large " + (r3 + 1));
    }

    public final void c(pl1 r7) {
        this.b.add(r7);
        int r0 = r7.c;
        int r1 = this.a;
        if (r0 <= r1) goto L6;
        ti.h0(this.d, null);
        this.e = this.d.length - 1;
        this.f = 0;
        this.g = 0;
        return;
    L6:
        a((this.g + r0) - r1);
        int r2 = this.f + 1;
        pl1[] r3 = this.d;
        if (r2 <= r3.length) goto L9;
        pl1[] r4 = new pl1[r3.length * 2];
        System.arraycopy(r3, 0, r4, r3.length, r3.length);
        this.e = this.d.length - 1;
        this.d = r4;
    L9:
        int r5 = this.e;
        this.e = r5 - 1;
        this.d[r5] = r7;
        this.f++;
        this.g += r0;
    }

    public final yw d() {
        xu3 r0 = this.c;
        byte r1 = r0.readByte();
        byte[] r2 = xe5.a;
        int r3 = r1 & 255;
        int r4 = 0;
        if ((r1 & 128) != 128) goto L5;
        boolean r5 = true;
    L6:
        long r6 = e(r3, 127);
        if (r5 == false) goto L28;
        tv r11 = new tv();
        int[] r7 = yt1.a;
        r0.getClass();
        j83 r8 = yt1.c;
        j83 r9 = r8;
        long r10 = 0;
        int r12 = 0;
    L10:
        if (r10 >= r6) goto L19;
        byte r13 = r0.readByte();
        byte[] r14 = xe5.a;
        r4 = (r4 << 8) | (r13 & 255);
        r12 = r12 + 8;
    L13:
        if (r12 < 8) goto L18;
        j83[] r15 = (j83[]) r9.p;
        r15.getClass();
        r9 = r15[(r4 >>> (r12 - 8)) & 255];
        r9.getClass();
        if (((j83[]) r9.p) == null) goto L16;
        r12 = r12 - 8;
        goto L13
    L16:
        r11.Y(r9.n);
        r12 = r12 - r9.o;
        r9 = r8;
        goto L13
    L18:
        r10 = r10 + 1;
    L19:
        if (r12 <= 0) goto L26;
        j83[] r16 = (j83[]) r9.p;
        r16.getClass();
        j83 r17 = r16[(r4 << (8 - r12)) & 255];
        r17.getClass();
        int r18 = r17.o;
        if (((j83[]) r17.p) != null) goto L26;
        if (r18 > r12) goto L26;
        r11.Y(r17.n);
        r12 = r12 - r18;
        r9 = r8;
    L26:
        return r11.g(r11.o);
    L28:
        return r0.g(r6);
    L5:
        r5 = false;
        goto L6
    }

    public final int e(int r4, int r5) {
        int r6 = r4 & r5;
        if (r6 >= r5) goto L5;
        return r6;
    L5:
        int r7 = 0;
    L6:
        byte r0 = this.c.readByte();
        byte[] r1 = xe5.a;
        int r2 = r0 & 255;
        if ((r0 & 128) == 0) goto L10;
        r5 = r5 + ((r0 & 127) << r7);
        r7 = r7 + 7;
        goto L6
    L10:
        return r5 + (r2 << r7);
    }
}
