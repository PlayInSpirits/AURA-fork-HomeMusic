package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h00 {
    public final /* synthetic */ int a;
    public byte[] b;
    public int c;
    public int d;
    public int e;

    public h00(int r2, int r3) {
        this.a = 0;
        this.c = r2;
        this.d = r3;
        this.b = new byte[(r3 * 2) - 1];
        this.e = 0;
    }

    public void a() {
        switch(this.a) {
            case 1: goto L15;
            default: goto L4;
        };
    L4:
        int r0 = this.d;
        if (r0 < 0) goto L12;
        int r1 = this.c;
        if (r0 < r1) goto L11;
        if (r0 != r1) goto L12;
        if (this.e != 0) goto L12;
    L11:
        boolean r2 = true;
    L13:
        rr2.w(r2);
        return;
    L12:
        r2 = false;
        goto L13
    L15:
        int r3 = this.c;
        if (r3 < 0) goto L23;
        int r4 = this.e;
        if (r3 < r4) goto L22;
        if (r3 != r4) goto L23;
        if (this.d != 0) goto L23;
    L22:
        boolean r5 = true;
    L24:
        rr2.w(r5);
        return;
    L23:
        r5 = false;
        goto L24
    }

    public int b() {
        return ((this.e - this.c) * 8) - this.d;
    }

    public void c() {
        if (this.d != 0) goto L5;
        return;
    L5:
        this.d = 0;
        this.c++;
        a();
    }

    public boolean d(int r5) {
        int r0 = this.d;
        int r1 = r5 / 8;
        int r2 = r0 + r1;
        int r3 = (this.e + r5) - (r1 * 8);
        if (r3 <= 7) goto L6;
        r2 = r2 + 1;
        r3 = r3 - 8;
    L6:
        r0 = r0 + 1;
        if (r0 > r2) goto L13;
        if (r2 >= this.c) goto L13;
        if (r(r0) == false) goto L6;
        r2 = r2 + 1;
        r0 = r0 + 2;
    L13:
        int r4 = this.c;
        if (r2 < r4) goto L20;
        if (r2 != r4) goto L18;
        if (r3 == 0) goto L20;
        return false;
    L18:
        return false;
    L20:
        return true;
    }

    public boolean e() {
        int r0 = this.d;
        int r1 = this.e;
        int r3 = 0;
    L4:
        if (this.d >= this.c) goto L9;
        if (h() == true) goto L9;
        r3 = r3 + 1;
    L9:
        if (this.d != this.c) goto L11;
        boolean r4 = true;
    L12:
        this.d = r0;
        this.e = r1;
        if (r4 == false) goto L15;
    L17:
        return false;
    L15:
        if (d((r3 * 2) + 1) == false) goto L17;
        return true;
    L11:
        r4 = false;
        goto L12
    }

    public int f() {
        if (this.d != 0) goto L5;
        boolean r0 = true;
    L6:
        rr2.w(r0);
        return this.c;
    L5:
        r0 = false;
        goto L6
    }

    public int g() {
        return (this.c * 8) + this.d;
    }

    public boolean h() {
        switch(this.a) {
            case 1: goto L17;
            case 2: goto L11;
            default: goto L5;
        };
    L5:
        if ((((this.b[this.d] & 255) >> this.e) & 1) != 1) goto L7;
        boolean r0 = true;
    L8:
        t(1);
        return r0;
    L7:
        r0 = false;
        goto L8
    L11:
        if ((this.b[this.d] & (128 >> this.e)) == 0) goto L13;
        boolean r1 = true;
    L14:
        s();
        return r1;
    L13:
        r1 = false;
        goto L14
    L17:
        if ((this.b[this.c] & (128 >> this.d)) == 0) goto L19;
        boolean r2 = true;
    L20:
        s();
        return r2;
    L19:
        r2 = false;
        goto L20
    }

    public int i(int r11) {
        int r4 = 1;
        switch(this.a) {
            case 1: goto L25;
            case 2: goto L9;
            default: goto L4;
        };
    L4:
        int r0 = this.d;
        int r1 = Math.min(r11, 8 - this.e);
        byte[] r5 = this.b;
        int r6 = r0 + 1;
        int r2 = ((r5[r0] & 255) >> this.e) & (255 >> (8 - r1));
    L5:
        if (r1 >= r11) goto L7;
        r2 = r2 | ((r5[r6] & 255) << r1);
        r1 = r1 + 8;
        r6 = r6 + 1;
        goto L5
    L7:
        int r3 = r2 & ((-1) >>> (32 - r11));
        t(r11);
        return r3;
    L9:
        this.e += r11;
        int r7 = 0;
    L10:
        int r8 = this.e;
        int r9 = 2;
        if (r8 <= 8) goto L17;
        int r10 = r8 - 8;
        this.e = r10;
        byte[] r12 = this.b;
        int r13 = this.d;
        r7 = r7 | ((r12[r13] & 255) << r10);
        if (r(r13 + 1) == true) goto L16;
        r9 = 1;
    L16:
        this.d = r13 + r9;
        goto L10
    L17:
        byte[] r14 = this.b;
        int r15 = this.d;
        int r16 = ((-1) >>> (32 - r11)) & (r7 | ((255 & r14[r15]) >> (8 - r8)));
        if (r8 != 8) goto L23;
        this.e = 0;
        if (r(r15 + 1) == false) goto L22;
        r4 = 2;
    L22:
        this.d = r15 + r4;
    L23:
        a();
        return r16;
    L25:
        if (r11 == 0) goto L41;
        this.d += r11;
        int r17 = 0;
    L28:
        int r18 = this.d;
        if (r18 <= 8) goto L31;
        int r19 = r18 - 8;
        this.d = r19;
        byte[] r20 = this.b;
        int r21 = this.c;
        this.c = r21 + 1;
        r17 = r17 | ((r20[r21] & 255) << r19);
        goto L28
    L31:
        byte[] r22 = this.b;
        int r23 = this.c;
        int r110 = ((-1) >>> (32 - r11)) & (r17 | ((255 & r22[r23]) >> (8 - r18)));
        if (r18 != 8) goto L34;
        this.d = 0;
        this.c = r23 + 1;
    L34:
        a();
        return r110;
    L41:
        return 0;
    }

    public void j(int r10, byte[] r11) {
        int r0 = r10 >> 3;
        int r2 = 0;
    L4:
        if (r2 >= r0) goto L6;
        byte[] r5 = this.b;
        int r6 = this.c;
        int r7 = r6 + 1;
        this.c = r7;
        byte r8 = r5[r6];
        int r9 = this.d;
        byte r12 = (byte) (r8 << r9);
        r11[r2] = r12;
        r11[r2] = (byte) (((255 & r5[r7]) >> (8 - r9)) | r12);
        r2 = r2 + 1;
        goto L4
    L6:
        int r13 = r10 & 7;
        if (r13 != 0) goto L9;
        return;
    L9:
        byte r3 = (byte) (r11[r0] & (255 >> r13));
        r11[r0] = r3;
        int r14 = this.d;
        if ((r14 + r13) <= 8) goto L12;
        byte[] r15 = this.b;
        int r16 = this.c;
        this.c = r16 + 1;
        r11[r0] = (byte) (r3 | ((r15[r16] & 255) << r14));
        this.d = r14 - 8;
    L12:
        int r4 = this.d + r13;
        this.d = r4;
        byte[] r17 = this.b;
        int r18 = this.c;
        r11[r0] = (byte) (((byte) (((255 & r17[r18]) >> (8 - r4)) << (8 - r13))) | r11[r0]);
        if (r4 != 8) goto L15;
        this.d = 0;
        this.c = r18 + 1;
    L15:
        a();
    }

    public long k(int r6) {
        if (r6 > 32) goto L6;
        int r5 = i(r6);
        String r7 = f35.a;
        return ((long) r5) & 4294967295L;
    L6:
        int r8 = i(r6 - 32);
        int r9 = i(32);
        String r3 = f35.a;
        long r10 = ((long) r9) & 4294967295L;
        return r10 | ((((long) r8) & 4294967295L) << 32);
    }

    public void l(int r4, byte[] r5) {
        if (this.d != 0) goto L5;
        boolean r0 = true;
    L6:
        rr2.w(r0);
        System.arraycopy(this.b, this.c, r5, 0, r4);
        this.c += r4;
        a();
        return;
    L5:
        r0 = false;
        goto L6
    }

    public int m() {
        int r0 = 0;
        int r1 = 0;
    L4:
        if (h() == true) goto L6;
        r1 = r1 + 1;
        goto L4
    L6:
        int r3 = (1 << r1) - 1;
        if (r1 <= 0) goto L10;
        r0 = i(r1);
    L10:
        return r3 + r0;
    }

    public int n() {
        int r2 = m();
        if ((r2 % 2) != 0) goto L5;
        int r0 = -1;
    L7:
        return ((r2 + 1) / 2) * r0;
    L5:
        r0 = 1;
        goto L7
    }

    public void o(int r1, byte[] r2) {
        this.b = r2;
        this.c = 0;
        this.d = 0;
        this.e = r1;
    }

    public void p(be3 r3) {
        byte[] r0 = r3.a;
        o(r3.c, r0);
        q(r3.b * 8);
    }

    public void q(int r2) {
        int r0 = r2 / 8;
        this.c = r0;
        this.d = r2 - (r0 * 8);
        a();
    }

    public boolean r(int r3) {
        if (2 <= r3) goto L5;
        return false;
    L5:
        if (r3 >= this.c) goto L15;
        byte[] r2 = this.b;
        if (r2[r3] == 3) goto L9;
        return false;
    L9:
        if (r2[r3 - 2] == 0) goto L11;
        return false;
    L11:
        if (r2[r3 - 1] != 0) goto L18;
        return true;
    L18:
        return false;
    L15:
        return false;
    }

    public void s() {
        switch(this.a) {
            case 1: goto L12;
            default: goto L4;
        };
    L4:
        int r1 = 1;
        int r0 = this.e + 1;
        this.e = r0;
        if (r0 != 8) goto L10;
        this.e = 0;
        int r2 = this.d;
        if (r(r2 + 1) == false) goto L9;
        r1 = 2;
    L9:
        this.d = r2 + r1;
    L10:
        a();
        return;
    L12:
        int r3 = this.d + 1;
        this.d = r3;
        if (r3 != 8) goto L15;
        this.d = 0;
        this.c++;
    L15:
        a();
    }

    public void t(int r5) {
        switch(this.a) {
            case 1: goto L28;
            case 2: goto L18;
            default: goto L4;
        };
    L4:
        int r0 = r5 / 8;
        int r1 = this.d + r0;
        this.d = r1;
        int r6 = (r5 - (r0 * 8)) + this.e;
        this.e = r6;
        boolean r2 = true;
        if (r6 <= 7) goto L7;
        this.d = r1 + 1;
        this.e = r6 - 8;
    L7:
        int r7 = this.d;
        if (r7 < 0) goto L15;
        int r3 = this.c;
        if (r7 < r3) goto L16;
        if (r7 != r3) goto L15;
        if (this.e != 0) goto L15;
    L16:
        rr2.w(r2);
        return;
    L15:
        r2 = false;
        goto L16
    L18:
        int r4 = this.d;
        int r8 = r5 / 8;
        int r9 = r4 + r8;
        this.d = r9;
        int r10 = (r5 - (r8 * 8)) + this.e;
        this.e = r10;
        if (r10 <= 7) goto L21;
        this.d = r9 + 1;
        this.e = r10 - 8;
    L21:
        r4 = r4 + 1;
        if (r4 > this.d) goto L26;
        if (r(r4) == false) goto L21;
        this.d++;
        r4 = r4 + 2;
        goto L21
    L26:
        a();
        return;
    L28:
        int r11 = r5 / 8;
        int r12 = this.c + r11;
        this.c = r12;
        int r13 = (r5 - (r11 * 8)) + this.d;
        this.d = r13;
        if (r13 <= 7) goto L31;
        this.c = r12 + 1;
        this.d = r13 - 8;
    L31:
        a();
    }

    public void u(int r2) {
        if (this.d != 0) goto L5;
        boolean r0 = true;
    L6:
        rr2.w(r0);
        this.c += r2;
        a();
        return;
    L5:
        r0 = false;
        goto L6
    }

    public h00(byte[] r2) {
        this.a = 3;
        this.b = r2;
        this.c = r2.length;
    }

    public h00(byte[] r2, int r3, int r4) {
        this.a = 2;
        this.b = r2;
        this.d = r3;
        this.c = r4;
        this.e = 0;
        a();
    }

    public h00(int r2, byte[] r3) {
        this.a = 1;
        this.b = r3;
        this.e = r2;
    }

    public h00() {
        this.a = 1;
        this.b = f35.b;
    }
}
