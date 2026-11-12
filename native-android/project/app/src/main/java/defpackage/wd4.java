package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wd4 extends fp {
    public final float i;
    public final short j;
    public final int k;
    public final long l;
    public final long m;
    public int n;
    public boolean o;
    public int p;
    public long q;
    public int r;
    public byte[] s;
    public int t;
    public int u;
    public byte[] v;

    public wd4() {
        this.r = 0;
        this.t = 0;
        this.u = 0;
        this.l = 100000;
        this.i = 0.2f;
        this.m = 2000000;
        this.k = 10;
        this.j = 1024;
        byte[] r0 = f35.b;
        this.s = r0;
        this.v = r0;
    }

    @Override // defpackage.fp
    public final gm a(gm r2) {
        if (r2.c != 2) goto L10;
        if (r2.a == (-1)) goto L7;
        return r2;
    L7:
        return gm.e;
    L10:
        throw new AudioProcessor$UnhandledAudioFormatException(r2);
    }

    @Override // defpackage.fp, defpackage.im
    public final boolean b() {
        if (super.b() == true) goto L5;
        return false;
    L5:
        if (this.o == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.im
    public final void e(ByteBuffer r11) {
    L3:
        if (r11.hasRemaining() == false) goto L57;
        if (this.g.hasRemaining() == true) goto L70;
        int r0 = this.p;
        short r1 = this.j;
        boolean r2 = true;
        if (r0 != 0) goto L8;
        int r3 = r11.limit();
        r11.limit(Math.min(r3, r11.position() + this.s.length));
        int r4 = r11.limit() - 1;
    L46:
        if (r4 < r11.position()) goto L51;
        if (Math.abs((r11.get(r4) << 8) | (r11.get(r4 - 1) & 255)) > r1) goto L49;
        r4 = r4 - 2;
        goto L46
    L49:
        int r5 = this.n;
        int r6 = ((r4 / r5) * r5) + r5;
    L53:
        if (r6 != r11.position()) goto L55;
        this.p = 1;
    L56:
        r11.limit(r3);
        goto L3
    L55:
        r11.limit(Math.min(r6, r11.capacity()));
        l(r11.remaining()).put(r11).flip();
        goto L56
    L51:
        r6 = r11.position();
        goto L53
    L8:
        if (r0 != 1) goto L42;
        if (this.t >= this.s.length) goto L12;
        boolean r7 = true;
    L13:
        rr2.w(r7);
        int r8 = r11.limit();
        int r9 = r11.position() + 1;
    L15:
        if (r9 >= r11.limit()) goto L20;
        if (Math.abs((r11.get(r9) << 8) | (r11.get(r9 - 1) & 255)) > r1) goto L18;
        r9 = r9 + 2;
        goto L15
    L18:
        int r10 = this.n;
        int r12 = (r9 / r10) * r10;
    L21:
        int r13 = r12 - r11.position();
        int r14 = this.t;
        int r15 = this.u;
        int r16 = r14 + r15;
        byte[] r17 = this.s;
        if (r16 >= r17.length) goto L25;
        r14 = r17.length;
    L24:
        int r18 = r14 - r16;
        if (r12 >= r8) goto L28;
        boolean r19 = true;
    L29:
        int r20 = Math.min(r13, r18);
        r11.limit(r11.position() + r20);
        r11.get(this.s, r16, r20);
        int r21 = this.u + r20;
        this.u = r21;
        if (r21 > this.s.length) goto L32;
        boolean r22 = true;
    L33:
        rr2.w(r22);
        if (r19 == false) goto L37;
        if (r13 >= r18) goto L37;
    L38:
        n(r2);
        if (r2 == false) goto L41;
        this.p = 0;
        this.r = 0;
    L41:
        r11.limit(r8);
    L37:
        r2 = false;
        goto L38
    L32:
        r22 = false;
        goto L33
    L28:
        r19 = false;
        goto L29
    L25:
        r16 = r15 - (r17.length - r14);
        goto L24
    L20:
        r12 = r11.limit();
        goto L21
    L12:
        r7 = false;
        goto L13
    L42:
        tb4.a();
        return;
    L70:
        return;
    }

    @Override // defpackage.fp
    public final void i() {
        if (b() == false) goto L7;
        gm r0 = this.b;
        int r1 = r0.b * 2;
        this.n = r1;
        int r2 = (((((int) ((this.l * r0.a) / 1000000)) / 2) / r1) * r1) * 2;
        if (this.s.length == r2) goto L7;
        this.s = new byte[r2];
        this.v = new byte[r2];
    L7:
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.t = 0;
        this.u = 0;
    }

    @Override // defpackage.fp
    public final void j() {
        if (this.u <= 0) goto L6;
        n(true);
        this.r = 0;
        return;
    }

    @Override // defpackage.fp
    public final void k() {
        this.o = false;
        byte[] r0 = f35.b;
        this.s = r0;
        this.v = r0;
    }

    public final int m(int r5) {
        int r0 = ((((int) ((this.m * this.b.a) / 1000000)) - this.r) * this.n) - (this.s.length / 2);
        if (r0 < 0) goto L5;
        boolean r1 = true;
    L6:
        rr2.w(r1);
        int r6 = (int) Math.min((r5 * this.i) + 0.5f, r0);
        int r4 = this.n;
        return (r6 / r4) * r4;
    L5:
        r1 = false;
        goto L6
    }

    public final void n(boolean r8) {
        int r0 = this.u;
        byte[] r1 = this.s;
        if (r0 == r1.length) goto L7;
        if (r8 == true) goto L7;
        return;
    L7:
        boolean r3 = false;
        if (this.r != 0) goto L17;
        if (r8 == false) goto L13;
        o(r0, 3);
        int r9 = r0;
    L11:
        int r2 = r9;
    L21:
        if ((r9 % this.n) != 0) goto L23;
        boolean r4 = true;
    L24:
        if (r4 == false) goto L29;
        if (r0 < r2) goto L27;
        r3 = true;
    L27:
        rr2.w(r3);
        this.u -= r9;
        int r5 = this.t + r9;
        this.t = r5;
        this.t = r5 % this.s.length;
        int r6 = this.r;
        int r7 = this.n;
        this.r = (r2 / r7) + r6;
        this.q += (long) ((r9 - r2) / r7);
        return;
    L29:
        kf2.o(gh0.s("bytesConsumed is not aligned to frame size: %s", new Object[]{Integer.valueOf(r9)}));
        return;
    L23:
        r4 = false;
        goto L24
    L13:
        if (r0 < (r1.length / 2)) goto L15;
        boolean r10 = true;
    L16:
        rr2.w(r10);
        r9 = this.s.length / 2;
        o(r9, 0);
        goto L11
    L15:
        r10 = false;
        goto L16
    L17:
        if (r8 == false) goto L19;
        int r11 = r0 - (r1.length / 2);
        int r12 = (r1.length / 2) + r11;
        int r13 = m(r11) + (this.s.length / 2);
        o(r13, 2);
        r2 = r13;
        r9 = r12;
        goto L21
    L19:
        r9 = r0 - (r1.length / 2);
        r2 = m(r9);
        o(r2, 1);
        goto L21
    }

    public final void o(int r11, int r12) {
        if (r11 != 0) goto L4;
        return;
    L4:
        boolean r1 = true;
        if (this.u < r11) goto L7;
        boolean r0 = true;
    L8:
        rr2.l(r0);
        int r2 = this.t;
        if (r12 != 2) goto L17;
        int r4 = this.u;
        int r5 = r2 + r4;
        byte[] r6 = this.s;
        if (r5 > r6.length) goto L13;
        System.arraycopy(r6, r5 - r11, this.v, 0, r11);
    L22:
        if ((r11 % this.n) != 0) goto L24;
        boolean r3 = true;
    L25:
        rr2.j(r11, "sizeToOutput is not aligned to frame size: %s", r3);
        if (this.t >= this.s.length) goto L28;
        boolean r7 = true;
    L29:
        rr2.w(r7);
        byte[] r8 = this.v;
        if ((r11 % this.n) == 0) goto L33;
        r1 = false;
    L33:
        rr2.j(r11, "byteOutput size is not aligned to frame size %s", r1);
        if (r12 == 3) goto L51;
        int r9 = 0;
    L37:
        if (r9 >= r11) goto L51;
        int r10 = r9 + 1;
        int r13 = (r8[r10] << 8) | (r8[r9] & 255);
        int r14 = this.k;
        if (r12 != 0) goto L41;
        r14 = ((((r9 * 1000) / (r11 - 1)) * (r14 - 100)) / 1000) + 100;
    L43:
        int r15 = (r13 * r14) / 100;
        if (r15 < 32767) goto L47;
        r8[r9] = -1;
        r8[r10] = 127;
    L50:
        r9 = r9 + 2;
        goto L37
    L47:
        if (r15 > (-32768)) goto L49;
        r8[r9] = 0;
        r8[r10] = -128;
        goto L50
    L49:
        r8[r9] = (byte) (r15 & 255);
        r8[r10] = (byte) (r15 >> 8);
        goto L50
    L41:
        if (r12 != 2) goto L43;
        r14 = r14 + ((((r9 * 1000) * (100 - r14)) / (r11 - 1)) / 1000);
    L51:
        l(r11).put(r8, 0, r11).flip();
        return;
    L28:
        r7 = false;
        goto L29
    L24:
        r3 = false;
        goto L25
    L13:
        int r16 = r4 - (r6.length - r2);
        byte[] r17 = this.v;
        if (r16 < r11) goto L16;
        System.arraycopy(r6, r16 - r11, r17, 0, r11);
        goto L22
    L16:
        int r18 = r11 - r16;
        System.arraycopy(r6, r6.length - r18, r17, 0, r18);
        System.arraycopy(this.s, 0, this.v, r18, r16);
        goto L22
    L17:
        int r19 = r2 + r11;
        byte[] r20 = this.s;
        int r21 = r20.length;
        byte[] r22 = this.v;
        if (r19 > r21) goto L20;
        System.arraycopy(r20, r2, r22, 0, r11);
        goto L22
    L20:
        int r23 = r20.length - r2;
        System.arraycopy(r20, r2, r22, 0, r23);
        System.arraycopy(this.s, 0, this.v, r23, r11 - r23);
        goto L22
    L7:
        r0 = false;
        goto L8
    }
}
