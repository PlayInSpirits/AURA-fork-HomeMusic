package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class me5 extends i90 {
    public static final /* synthetic */ int C = 0;
    public final int A;
    public long B;
    public final byte[] o;
    public final qs p;
    public final int q;
    public int r;
    public byte s;
    public int t;
    public int u;
    public final int[] v;
    public final byte[] w;
    public final byte[] x;
    public int y;
    public final boolean z;

    public me5(ByteArrayInputStream r8) {
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        this.o = new byte[1];
        this.q = -1;
        this.r = 9;
        this.t = -1;
        qs r3 = new qs(r8, r0);
        this.p = r3;
        this.B = 0;
        int r1 = (int) r3.b(8);
        int r4 = (int) r3.b(8);
        int r9 = (int) r3.b(8);
        if (r1 == 31) goto L5;
    L26:
        mj0.i("Input is not in .Z format");
        throw null;
    L5:
        if (r4 != 157) goto L26;
        if (r9 < 0) goto L26;
        int r5 = 0;
        if ((r9 & 128) == 0) goto L10;
        boolean r2 = true;
    L11:
        this.z = r2;
        int r10 = r9 & 31;
        this.A = r10;
        if (r2 == false) goto L15;
        this.q = 256;
    L15:
        if (r10 <= 0) goto L24;
        if (r10 <= 0) goto L22;
        int r11 = 1 << r10;
        this.v = new int[r11];
        this.w = new byte[r11];
        this.x = new byte[r11];
        this.y = r11;
    L18:
        if (r5 >= 256) goto L20;
        this.v[r5] = -1;
        this.w[r5] = (byte) r5;
        r5 = r5 + 1;
        goto L18
    L20:
        this.u = (this.z ? 1 : 0) + 256;
        return;
    L22:
        kf2.n(b11.j(r10, "maxCodeSize is ", ", must be bigger than 0"));
        throw null;
    L24:
        kf2.n(b11.j(r10, "maxCodeSize is ", ", must be bigger than 0"));
        throw null;
    L10:
        r2 = false;
        goto L11
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.p.close();
    }

    public final int f(int r6, byte r7) {
        int r0 = this.r;
        int r2 = 1 << r0;
        int r3 = this.u;
        if (r3 >= r2) goto L5;
        this.v[r3] = r6;
        this.w[r3] = r7;
        this.u = r3 + 1;
    L7:
        if (this.u == r2) goto L9;
    L11:
        return r3;
    L9:
        if (r0 >= this.A) goto L11;
        j();
        this.r++;
        goto L11
    L5:
        r3 = -1;
        goto L7
    }

    public final void j() {
        long r0 = 8 - (this.B % 8);
        if (r0 != 8) goto L5;
        r0 = 0;
    L5:
        long r5 = 0;
    L7:
        if (r5 >= r0) goto L9;
        n();
        r5 = r5 + 1;
        goto L7
    L9:
        qs r9 = this.p;
        r9.p = 0;
        r9.q = 0;
    }

    public final int n() {
        int r0 = this.r;
        if (r0 > 31) goto L8;
        int r1 = (int) this.p.b(r0);
        if (r1 < 0) goto L7;
        this.B++;
    L7:
        return r1;
    L8:
        kf2.n("Code size must not be bigger than 31");
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.InputStream
    public final int read(byte[] r12, int r13, int r14) {
        if (r14 != 0) goto L5;
        return 0;
    L5:
        byte[] r1 = this.x;
        int r2 = r1.length - this.y;
        if (r2 <= 0) goto L8;
        int r3 = Math.min(r2, r14);
        System.arraycopy(r1, this.y, r12, r13, r3);
        this.y += r3;
    L9:
        int r4 = r14 - r3;
        if (r4 <= 0) goto L48;
        int r5 = n();
        int r6 = -1;
        if (r5 < 0) goto L36;
        boolean r7 = this.z;
        if (r7 == true) goto L17;
    L19:
        int r8 = this.u;
        if (r5 != r8) goto L26;
        int r9 = this.t;
        if (r9 == (-1)) goto L24;
        f(r9, this.s);
        Object[] r10 = true;
    L28:
        int r11 = r5;
    L29:
        if (r11 < 0) goto L31;
        int r15 = this.y - 1;
        this.y = r15;
        r1[r15] = this.w[r11];
        r11 = this.v[r11];
        goto L29
    L31:
        int r16 = this.t;
        if (r16 == (-1)) goto L35;
        if (r10 == true) goto L35;
        f(r16, r1[this.y]);
    L35:
        this.t = r5;
        r6 = this.y;
        this.s = r1[r6];
        goto L36
    L24:
        mj0.i("The first code can't be a reference to its preceding code");
        return 0;
    L26:
        if (r5 > r8) goto L47;
        r10 = false;
        goto L28
    L47:
        throw new IOException(String.format("Invalid %d bit code 0x%x", new Object[]{Integer.valueOf(this.r), Integer.valueOf(r5)}));
    L17:
        if (r5 != this.q) goto L19;
        this.u = (r7 ? 1 : 0) + 256;
        j();
        this.r = 9;
        this.t = -1;
        r6 = 0;
    L36:
        if (r6 < 0) goto L37;
        int r17 = r13 + r3;
        int r18 = r1.length - this.y;
        if (r18 <= 0) goto L44;
        int r19 = Math.min(r18, r4);
        System.arraycopy(r1, this.y, r12, r17, r19);
        this.y += r19;
    L45:
        r3 = r3 + r19;
        goto L9
    L44:
        r19 = 0;
        goto L45
    L37:
        if (r3 <= 0) goto L40;
        b(r3);
        return r3;
    L40:
        return r6;
    L48:
        b(r3);
        return r3;
    L8:
        r3 = 0;
        goto L9
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] r0 = this.o;
        int r1 = read(r0);
        if (r1 >= 0) goto L6;
        return r1;
    L6:
        return r0[0] & 255;
    }
}
