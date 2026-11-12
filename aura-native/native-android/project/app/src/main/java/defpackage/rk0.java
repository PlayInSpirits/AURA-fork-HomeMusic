package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rk0 implements l51 {
    public final wh0 o;
    public final long p;
    public long q;
    public int s;
    public int t;
    public byte[] r = new byte[65536];
    public final byte[] n = new byte[4096];

    static {
        hn2.a("media3.extractor");
    }

    public rk0(wh0 wh0Var, long j, long j2) {
        this.o = wh0Var;
        this.q = j;
        this.p = j2;
    }

    @Override // defpackage.l51
    public final boolean a(byte[] bArr, int i, int i2, boolean z) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.t;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.r, 0, bArr, i, iMin);
            r(iMin);
        }
        int iQ = iMin;
        while (iQ < i2 && iQ != -1) {
            iQ = q(bArr, i, i2, iQ, z);
        }
        if (iQ != -1) {
            this.q += (long) iQ;
        }
        return iQ != -1;
    }

    @Override // defpackage.l51
    public final boolean d(int i, boolean z) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.t, i);
        r(iMin);
        int iQ = iMin;
        while (iQ < i && iQ != -1) {
            byte[] bArr = this.n;
            iQ = q(bArr, -iQ, Math.min(i, bArr.length + iQ), iQ, z);
        }
        if (iQ != -1) {
            this.q += (long) iQ;
        }
        return iQ != -1;
    }

    @Override // defpackage.l51
    public final boolean e(byte[] bArr, int i, int i2, boolean z) {
        if (!o(i2, z)) {
            return false;
        }
        System.arraycopy(this.r, this.s - i2, bArr, i, i2);
        return true;
    }

    @Override // defpackage.l51
    public final long f() {
        return this.q + ((long) this.s);
    }

    @Override // defpackage.l51
    public final void g(int i) {
        o(i, false);
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
    public final int h(int i) throws EOFException, InterruptedIOException {
        rk0 rk0Var;
        int iMin = Math.min(this.t, i);
        r(iMin);
        if (iMin == 0) {
            byte[] bArr = this.n;
            rk0Var = this;
            iMin = rk0Var.q(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            rk0Var = this;
        }
        if (iMin != -1) {
            rk0Var.q += (long) iMin;
        }
        return iMin;
    }

    @Override // defpackage.l51
    public final int i(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        rk0 rk0Var;
        int iMin;
        p(i2);
        int i3 = this.t;
        int i4 = this.s;
        int i5 = i3 - i4;
        if (i5 == 0) {
            rk0Var = this;
            iMin = rk0Var.q(this.r, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            rk0Var.t += iMin;
        } else {
            rk0Var = this;
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(rk0Var.r, rk0Var.s, bArr, i, iMin);
        rk0Var.s += iMin;
        return iMin;
    }

    @Override // defpackage.l51
    public final void k() {
        this.s = 0;
    }

    @Override // defpackage.l51
    public final void l(int i) throws EOFException, InterruptedIOException {
        d(i, false);
    }

    @Override // defpackage.l51
    public final void n(byte[] bArr, int i, int i2) {
        e(bArr, i, i2, false);
    }

    public final boolean o(int i, boolean z) {
        p(i);
        int iQ = this.t - this.s;
        while (iQ < i) {
            rk0 rk0Var = this;
            int i2 = i;
            boolean z2 = z;
            iQ = rk0Var.q(this.r, this.s, i2, iQ, z2);
            if (iQ == -1) {
                return false;
            }
            rk0Var.t = rk0Var.s + iQ;
            this = rk0Var;
            i = i2;
            z = z2;
        }
        this.s += i;
        return true;
    }

    public final void p(int i) {
        int i2 = this.s + i;
        byte[] bArr = this.r;
        if (i2 > bArr.length) {
            this.r = Arrays.copyOf(this.r, f35.j(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    public final int q(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.o.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void r(int i) {
        int i2 = this.t - i;
        this.t = i2;
        this.s = 0;
        byte[] bArr = this.r;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.r = bArr2;
    }

    @Override // defpackage.wh0
    public final int read(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        rk0 rk0Var;
        int i3 = this.t;
        int iQ = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.r, 0, bArr, i, iMin);
            r(iMin);
            iQ = iMin;
        }
        if (iQ == 0) {
            rk0Var = this;
            iQ = rk0Var.q(bArr, i, i2, 0, true);
        } else {
            rk0Var = this;
        }
        if (iQ != -1) {
            rk0Var.q += (long) iQ;
        }
        return iQ;
    }

    @Override // defpackage.l51
    public final void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        a(bArr, i, i2, false);
    }
}
