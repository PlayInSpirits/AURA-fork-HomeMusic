package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m44 {
    public final n9 a;
    public final int b;
    public final be3 c;
    public ru d;
    public ru e;
    public ru f;
    public long g;

    public m44(n9 r4) {
        this.a = r4;
        int r5 = r4.m();
        this.b = r5;
        this.c = new be3(32);
        ru r0 = new ru(r5, 0);
        this.d = r0;
        this.e = r0;
        this.f = r0;
    }

    public static ru c(ru r5, long r6, ByteBuffer r8, int r9) {
    L3:
        if (r6 < r5.o) goto L5;
        r5 = (ru) r5.q;
    L5:
        if (r9 <= 0) goto L9;
        int r0 = Math.min(r9, (int) (r5.o - r6));
        m9 r1 = (m9) r5.p;
        r8.put(r1.a, ((int) (r6 - r5.n)) + r1.b, r0);
        r9 = r9 - r0;
        r6 = r6 + ((long) r0);
        if (r6 != r5.o) goto L5;
        r5 = (ru) r5.q;
        goto L5
    L9:
        return r5;
    }

    public static ru d(ru r6, long r7, byte[] r9, int r10) {
    L3:
        if (r7 < r6.o) goto L5;
        r6 = (ru) r6.q;
        goto L3
    L5:
        int r0 = r10;
    L6:
        if (r0 <= 0) goto L10;
        int r1 = Math.min(r0, (int) (r6.o - r7));
        m9 r2 = (m9) r6.p;
        System.arraycopy(r2.a, ((int) (r7 - r6.n)) + r2.b, r9, r10 - r0, r1);
        r0 = r0 - r1;
        r7 = r7 + ((long) r1);
        if (r7 != r6.o) goto L6;
        r6 = (ru) r6.q;
        goto L6
    L10:
        return r6;
    }

    public static ru e(ru r12, cj0 r13, cw1 r14, be3 r15) {
        if (r13.d(1073741824) == false) goto L32;
        long r0 = r14.b;
        int r2 = 1;
        r15.K(1);
        ru r16 = d(r12, r0, r15.a, 1);
        long r1 = r0 + 1;
        int r4 = 0;
        byte r3 = r15.a[0];
        if ((r3 & 128) == 0) goto L7;
        boolean r5 = true;
    L8:
        int r6 = r3 & 127;
        fg0 r7 = r13.q;
        byte[] r8 = r7.a;
        if (r8 != null) goto L11;
        r7.a = new byte[16];
    L12:
        r12 = d(r16, r1, r7.a, r6);
        long r9 = r1 + ((long) r6);
        if (r5 == false) goto L15;
        r15.K(2);
        r12 = d(r12, r9, r15.a, 2);
        r9 = r9 + 2;
        r2 = r15.H();
    L15:
        int[] r10 = r7.d;
        if (r10 != null) goto L18;
    L19:
        r10 = new int[r2];
    L20:
        int[] r11 = r7.e;
        if (r11 != null) goto L23;
    L24:
        r11 = new int[r2];
    L25:
        if (r5 == false) goto L29;
        int r17 = r2 * 6;
        r15.K(r17);
        r12 = d(r12, r9, r15.a, r17);
        r9 = r9 + ((long) r17);
        r15.N(0);
    L27:
        if (r4 >= r2) goto L30;
        r10[r4] = r15.H();
        r11[r4] = r15.E();
        r4 = r4 + 1;
    L30:
        vv4 r18 = (vv4) r14.c;
        String r19 = f35.a;
        byte[] r20 = r18.b;
        byte[] r21 = r7.a;
        int r22 = r18.a;
        int r110 = r18.c;
        int r23 = r18.d;
        r7.f = r2;
        r7.d = r10;
        r7.e = r11;
        r7.b = r20;
        r7.a = r21;
        r7.c = r22;
        r7.g = r110;
        r7.h = r23;
        MediaCodec.CryptoInfo r111 = r7.i;
        r111.numSubSamples = r2;
        r111.numBytesOfClearData = r10;
        r111.numBytesOfEncryptedData = r11;
        r111.key = r20;
        r111.iv = r21;
        r111.mode = r22;
        hd5 r24 = r7.j;
        r24.getClass();
        MediaCodec.CryptoInfo.Pattern r25 = (MediaCodec.CryptoInfo.Pattern) r24.p;
        r25.set(r110, r23);
        ((MediaCodec.CryptoInfo) r24.o).setPattern(r25);
        long r26 = r14.b;
        int r27 = (int) (r9 - r26);
        r14.b = r26 + ((long) r27);
        r14.a -= r27;
        goto L32
    L29:
        r10[0] = 0;
        r11[0] = r14.a - ((int) (r9 - r14.b));
        goto L30
    L23:
        if (r11.length >= r2) goto L25;
    L18:
        if (r10.length >= r2) goto L20;
    L11:
        Arrays.fill(r8, (byte) 0);
        goto L12
    L7:
        r5 = false;
    L32:
        if (r13.d(268435456) == false) goto L42;
        r15.K(4);
        ru r112 = d(r12, r14.b, r15.a, 4);
        int r113 = r15.E();
        r14.b += 4;
        r14.a -= 4;
        r13.t(r113);
        ru r114 = c(r112, r14.b, r13.r, r113);
        r14.b += (long) r113;
        int r28 = r14.a - r113;
        r14.a = r28;
        ByteBuffer r115 = r13.u;
        if (r115 != null) goto L36;
    L39:
        r13.u = ByteBuffer.allocate(r28);
    L41:
        return c(r114, r14.b, r13.u, r14.a);
    L36:
        if (r115.capacity() < r28) goto L39;
        r13.u.clear();
        goto L41
    L42:
        r13.t(r14.a);
        return c(r12, r14.b, r13.r, r14.a);
    }

    public final void a(long r4) {
        if (r4 == (-1)) goto L14;
    L5:
        ru r0 = this.d;
        if (r4 < r0.o) goto L9;
        m9 r1 = (m9) r0.p;
        this.a.f(r1);
        ru r2 = this.d;
        r2.p = null;
        ru r3 = (ru) r2.q;
        r2.q = null;
        this.d = r3;
        goto L5
    L9:
        if (this.e.n >= r0.n) goto L13;
        this.e = r0;
        return;
    L13:
        return;
    }

    public final int b(int r7) {
        ru r0 = this.f;
        if (((m9) r0.p) != null) goto L6;
        m9 r1 = this.a.g();
        long r3 = this.f.o;
        ru r2 = new ru(this.b, r3);
        r0.p = r1;
        r0.q = r2;
    L6:
        return Math.min(r7, (int) (this.f.o - this.g));
    }
}
