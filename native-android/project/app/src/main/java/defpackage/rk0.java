package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rk0 implements l51 {
    public final byte[] n;
    public final wh0 o;
    public final long p;
    public long q;
    public byte[] r;
    public int s;
    public int t;

    static {
        hn2.a("media3.extractor");
    }

    public rk0(wh0 r1, long r2, long r4) {
        this.o = r1;
        this.q = r2;
        this.p = r4;
        this.r = new byte[65536];
        this.n = new byte[4096];
    }

    @Override // defpackage.l51
    public final boolean a(byte[] r9, int r10, int r11, boolean r12) {
        int r0 = this.t;
        if (r0 != 0) goto L5;
        int r1 = 0;
    L6:
        int r6 = r1;
    L8:
        if (r6 >= r11) goto L12;
        if (r6 == (-1)) goto L12;
        r6 = q(r9, r10, r11, r6, r12);
    L12:
        if (r6 == (-1)) goto L14;
        this.q += (long) r6;
    L14:
        if (r6 == (-1)) goto L17;
        return true;
    L17:
        return false;
    L5:
        r1 = Math.min(r0, r11);
        System.arraycopy(this.r, 0, r9, r10, r1);
        r(r1);
        goto L6
    }

    @Override // defpackage.l51
    public final boolean d(int r8, boolean r9) {
        int r0 = Math.min(this.t, r8);
        r(r0);
        int r5 = r0;
    L4:
        if (r5 >= r8) goto L8;
        if (r5 == (-1)) goto L8;
        byte[] r2 = this.n;
        r5 = q(r2, -r5, Math.min(r8, r2.length + r5), r5, r9);
    L8:
        if (r5 == (-1)) goto L10;
        this.q += (long) r5;
    L10:
        if (r5 == (-1)) goto L13;
        return true;
    L13:
        return false;
    }

    @Override // defpackage.l51
    public final boolean e(byte[] r1, int r2, int r3, boolean r4) {
        if (o(r3, r4) == true) goto L6;
        return false;
    L6:
        System.arraycopy(this.r, this.s - r3, r1, r2, r3);
        return true;
    }

    @Override // defpackage.l51
    public final long f() {
        return this.q + ((long) this.s);
    }

    @Override // defpackage.l51
    public final void g(int r2) {
        o(r2, false);
    }

    @Override // defpackage.l51
    public final long getLength() {
        return this.p;
    }

    @Override // defpackage.l51
    public final long getPosition() {
        return this.q;
    }

    @Override // defpackage.l51
    public final int h(int r8) {
        int r0 = Math.min(this.t, r8);
        r(r0);
        if (r0 != 0) goto L5;
        byte[] r2 = this.n;
        rk0 r1 = this;
        r0 = r1.q(r2, 0, Math.min(r8, r2.length), 0, true);
    L7:
        if (r0 == (-1)) goto L9;
        r1.q += (long) r0;
    L9:
        return r0;
    L5:
        r1 = this;
        goto L7
    }

    @Override // defpackage.l51
    public final int i(byte[] r8, int r9, int r10) {
        p(r10);
        int r0 = this.t;
        int r3 = this.s;
        int r1 = r0 - r3;
        if (r1 != 0) goto L8;
        rk0 r2 = this;
        int r7 = r2.q(this.r, r3, r10, 0, true);
        if (r7 != (-1)) goto L7;
        return -1;
    L7:
        r2.t += r7;
    L9:
        System.arraycopy(r2.r, r2.s, r8, r9, r7);
        r2.s += r7;
        return r7;
    L8:
        r2 = this;
        r7 = Math.min(r10, r1);
        goto L9
    }

    @Override // defpackage.l51
    public final void k() {
        this.s = 0;
    }

    @Override // defpackage.l51
    public final void l(int r2) {
        d(r2, false);
    }

    @Override // defpackage.l51
    public final void n(byte[] r2, int r3, int r4) {
        e(r2, r3, r4, false);
    }

    public final boolean o(int r8, boolean r9) {
        p(r8);
        int r5 = this.t - this.s;
    L3:
        if (r5 >= r8) goto L9;
        rk0 r1 = this;
        int r4 = r8;
        boolean r6 = r9;
        r5 = r1.q(this.r, this.s, r4, r5, r6);
        if (r5 == (-1)) goto L6;
        r1.t = r1.s + r5;
        rk0 this = r1;
        r8 = r4;
        r9 = r6;
        goto L3
    L6:
        return false;
    L9:
        rk0 r2 = this;
        int r7 = r2.s;
        r2.s = r7 + r8;
        return true;
    }

    public final void p(int r4) {
        int r0 = this.s + r4;
        byte[] r5 = this.r;
        if (r0 <= r5.length) goto L6;
        int r6 = f35.j(r5.length * 2, 65536 + r0, r0 + 524288);
        this.r = Arrays.copyOf(this.r, r6);
        return;
    }

    public final int q(byte[] r2, int r3, int r4, int r5, boolean r6) {
        if (Thread.interrupted() == true) goto L14;
        wh0 r1 = this.o;
        int r7 = r1.read(r2, r3 + r5, r4 - r5);
        if (r7 != (-1)) goto L12;
        if (r5 != 0) goto L10;
        if (r6 == false) goto L10;
        return -1;
    L10:
        throw new EOFException();
    L12:
        return r5 + r7;
    L14:
        throw new InterruptedIOException();
    }

    public final void r(int r6) {
        int r0 = this.t - r6;
        this.t = r0;
        this.s = 0;
        byte[] r2 = this.r;
        if (r0 >= (r2.length - 524288)) goto L5;
        byte[] r3 = new byte[65536 + r0];
    L6:
        System.arraycopy(r2, r6, r3, 0, r0);
        this.r = r3;
        return;
    L5:
        r3 = r2;
        goto L6
    }

    @Override // defpackage.wh0
    public final int read(byte[] r9, int r10, int r11) {
        int r0 = this.t;
        int r1 = 0;
        if (r0 == 0) goto L6;
        int r2 = Math.min(r0, r11);
        System.arraycopy(this.r, 0, r9, r10, r2);
        r(r2);
        r1 = r2;
    L6:
        if (r1 != 0) goto L8;
        rk0 r3 = this;
        r1 = r3.q(r9, r10, r11, 0, true);
    L10:
        if (r1 == (-1)) goto L12;
        r3.q += (long) r1;
    L12:
        return r1;
    L8:
        r3 = this;
        goto L10
    }

    @Override // defpackage.l51
    public final void readFully(byte[] r2, int r3, int r4) {
        a(r2, r3, r4, false);
    }
}
