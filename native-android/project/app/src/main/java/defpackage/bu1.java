package defpackage;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bu1 extends fh0 {
    public final long n;
    public long o;
    public final /* synthetic */ cu1 p;

    public bu1(cu1 r1, long r2) {
        this.p = r1;
        this.n = r2;
    }

    @Override // defpackage.fh0
    public final int e() {
        long r0 = this.n - this.o;
        qs r8 = this.p.p;
        return (int) Math.min(r0, ((((long) r8.n.available()) * 8) + r8.q) / 8);
    }

    @Override // defpackage.fh0
    public final boolean o() {
        if (this.o >= this.n) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.fh0
    public final int r(byte[] r11, int r12, int r13) {
        int r0 = 0;
        if (r13 != 0) goto L5;
        return 0;
    L5:
        int r14 = (int) Math.min(this.n - this.o, r13);
    L6:
        if (r0 >= r14) goto L28;
        cu1 r1 = this.p;
        qs r2 = r1.p;
        i r3 = r1.r;
        int r6 = 1;
        if (r2.q <= 0) goto L14;
        byte r4 = (byte) cu1.j(r2, 8);
        int r5 = r12 + r0;
        byte[] r7 = (byte[]) r3.c;
        int r8 = r3.a;
        r7[r8] = r4;
        int r9 = (r8 + 1) & 65535;
        if (r3.b == true) goto L13;
        if (r9 >= r8) goto L13;
        r3.b = true;
    L13:
        r3.a = r9;
        r11[r5] = r4;
    L25:
        this.o += (long) r6;
        r0 = r0 + r6;
        goto L6
    L14:
        int r10 = r12 + r0;
        int r15 = r1.q.read(r11, r10, r14 - r0);
        if (r15 == (-1)) goto L27;
        int r16 = r10;
    L18:
        if (r16 >= (r10 + r15)) goto L24;
        byte r17 = r11[r16];
        byte[] r18 = (byte[]) r3.c;
        int r19 = r3.a;
        r18[r19] = r17;
        int r20 = (r19 + 1) & 65535;
        if (r3.b == true) goto L23;
        if (r20 >= r19) goto L23;
        r3.b = true;
    L23:
        r3.a = r20;
        r16 = r16 + 1;
        goto L18
    L24:
        r6 = r15;
        goto L25
    L27:
        throw new EOFException("Truncated Deflate64 Stream");
    L28:
        return r14;
    }

    @Override // defpackage.fh0
    public final int x() {
        if (this.o >= this.n) goto L6;
        return 2;
    L6:
        return 1;
    }
}
