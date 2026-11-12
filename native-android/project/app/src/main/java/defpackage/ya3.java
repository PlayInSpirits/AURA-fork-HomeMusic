package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ya3 extends l93 {
    public e22[] d;
    public int e;
    public int[] f;
    public int g;
    public Object[] h;
    public int i;

    public ya3() {
        this.d = new e22[16];
        this.f = new int[16];
        this.h = new Object[16];
    }

    public final void u0() {
        this.e = 0;
        this.g = 0;
        Arrays.fill(this.h, 0, this.i, null);
        this.i = 0;
    }

    public final void v0(bi r9, lg4 r10, uy3 r11, wa3 r12) {
        if (this.e == 0) goto L19;
        x20 r2 = new x20();
        r2.d = this;
        ya3 r0 = (ya3) r2.d;
    L5:
        e22 r1 = r0.d[r2.a];
        mg1 r7 = r1.e(r2);
        bi r3 = r9;
        lg4 r4 = r10;
        uy3 r5 = r11;
        wa3 r6 = r12;
        r1.d(r2, r3, r4, r5, r6);     // Catch: Throwable -> L13
        int r13 = r2.a;
        int r14 = r0.e;
        if (r13 >= r14) goto L19;
        e22 r15 = r0.d[r13];
        r2.b += r15.b;
        r2.c += r15.c;
        int r16 = r13 + 1;
        r2.a = r16;
        if (r16 >= r14) goto L19;
        r9 = r3;
        r10 = r4;
        r11 = r5;
        r12 = r6;
    L13:
        th = move-exception;
        if (r6 == null) goto L25;
        si0.T(th, new jo(r7, r4, r6, 8));
        throw th;
    L25:
        throw th;
    L19:
        u0();
    }

    public final boolean w0() {
        if (this.e != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final void x0(e22 r8) {
        int r0 = this.e;
        e22[] r1 = this.d;
        int r3 = 1024;
        if (r0 != r1.length) goto L8;
        if (r0 <= 1024) goto L6;
        int r2 = 1024;
    L7:
        e22[] r4 = new e22[r2 + r0];
        System.arraycopy(r1, 0, r4, 0, r0);
        this.d = r4;
        goto L8
    L6:
        r2 = r0;
    L8:
        int r5 = this.g;
        int r6 = r8.b;
        int r7 = r8.c;
        int r9 = r5 + r6;
        int[] r10 = this.f;
        int r11 = r10.length;
        if (r9 <= r11) goto L18;
        if (r11 <= 1024) goto L12;
        int r12 = 1024;
    L13:
        int r13 = r12 + r11;
        if (r13 < r9) goto L17;
        r9 = r13;
    L17:
        int[] r14 = new int[r9];
        ti.Y(0, 0, r11, r10, r14);
        this.f = r14;
        goto L18
    L12:
        r12 = r11;
    L18:
        int r15 = this.i + r7;
        Object[] r16 = this.h;
        int r17 = r16.length;
        if (r15 <= r17) goto L28;
        if (r17 > 1024) goto L23;
        r3 = r17;
    L23:
        int r18 = r3 + r17;
        if (r18 < r15) goto L27;
        r15 = r18;
    L27:
        Object[] r19 = new Object[r15];
        System.arraycopy(r16, 0, r19, 0, r17);
        this.h = r19;
    L28:
        e22[] r20 = this.d;
        int r21 = this.e;
        this.e = r21 + 1;
        r20[r21] = r8;
        this.g += r8.b;
        this.i += r7;
    }
}
