package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tk1 implements ej4 {
    public byte n;
    public final xu3 o;
    public final Inflater p;
    public final wy1 q;
    public final CRC32 r;

    public tk1(ej4 r3) {
        r3.getClass();
        xu3 r0 = new xu3(r3);
        this.o = r0;
        Inflater r4 = new Inflater(true);
        this.p = r4;
        this.q = new wy1(r0, r4);
        this.r = new CRC32();
    }

    public static void b(String r2, int r3, int r4) {
        if (r4 != r3) goto L4;
        return;
    L4:
        StringBuilder r5 = b11.s(r2, ": actual 0x");
        r5.append(qm4.x0(8, zz1.L(r4)));
        r5.append(" != expected 0x");
        r5.append(qm4.x0(8, zz1.L(r3)));
        throw new IOException(r5.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.q.close();
    }

    public final void f(tv r5, long r6, long r8) {
        t84 r7 = r5.n;
        r7.getClass();
    L3:
        int r0 = r7.c;
        int r1 = r7.b;
        if (r6 < (r0 - r1)) goto L7;
        r6 = r6 - ((long) (r0 - r1));
        r7 = r7.f;
        r7.getClass();
    L7:
        if (r8 <= 0) goto L9;
        int r9 = (int) (((long) r7.b) + r6);
        int r10 = (int) Math.min(r7.c - r9, r8);
        this.r.update(r7.a, r9, r10);
        r8 = r8 - ((long) r10);
        r7 = r7.f;
        r7.getClass();
        r6 = 0;
        goto L7
    }

    @Override // defpackage.ej4
    public final long read(tv r26, long r27) {
        tk1 r0 = this;
        r26.getClass();
        if (r27 < 0) goto L61;
        if (r27 != 0) goto L6;
        return 0;
    L6:
        byte r1 = r0.n;
        CRC32 r11 = r0.r;
        xu3 r13 = r0.o;
        if (r1 != 0) goto L47;
        r13.P(10);
        tv r2 = r13.o;
        byte r21 = r2.q(3);
        if (((r21 >> 1) & 1) != 1) goto L11;
        boolean r22 = true;
    L12:
        if (r22 == false) goto L14;
        r0.f(r2, 0, 10);
    L14:
        b("ID1ID2", 8075, r13.readShort());
        r13.skip(8);
        if (((r21 >> 2) & 1) != 1) goto L24;
        r13.P(2);
        if (r22 == false) goto L19;
        f(r2, 0, 2);
    L19:
        long r4 = r2.J() & 65535;
        r13.P(r4);
        if (r22 == false) goto L22;
        f(r2, 0, r4);
    L22:
        r13.skip(r4);
    L24:
        if (((r21 >> 3) & 1) != 1) goto L33;
        long r15 = r13.b((byte) 0, 0, Long.MAX_VALUE);
        if (r15 == (-1)) goto L31;
        if (r22 == false) goto L29;
        f(r2, 0, r15 + 1);
    L29:
        r13.skip(r15 + 1);
        goto L33
    L31:
        throw new EOFException();
    L33:
        if (((r21 >> 4) & 1) != 1) goto L42;
        long r14 = r13.b((byte) 0, 0, Long.MAX_VALUE);
        if (r14 == (-1)) goto L41;
        if (r22 == false) goto L38;
        r0 = this;
        r0.f(r2, 0, r14 + 1);
    L39:
        r13.skip(r14 + 1);
    L43:
        if (r22 == false) goto L45;
        b("FHCRC", r13.n(), (short) r11.getValue());
        r11.reset();
    L45:
        r0.n = 1;
        goto L47
    L38:
        r0 = this;
        goto L39
    L41:
        throw new EOFException();
    L42:
        r0 = this;
        goto L43
    L11:
        r22 = false;
    L47:
        if (r0.n != 1) goto L54;
        long r3 = r26.o;
        long r5 = r0.q.read(r26, r27);
        if (r5 == (-1)) goto L52;
        r0.f(r26, r3, r5);
        return r5;
    L52:
        r0.n = 2;
    L54:
        if (r0.n != 2) goto L60;
        b("CRC", r13.f(), (int) r11.getValue());
        b("ISIZE", r13.f(), (int) r0.p.getBytesWritten());
        r0.n = 3;
        if (r13.l() == true) goto L60;
        mj0.i("gzip finished without exhausting source");
        return 0;
    L60:
        return -1;
    L61:
        kf2.e(b11.k("byteCount < 0: ", r27));
        return 0;
    }

    @Override // defpackage.ej4
    public final fu4 timeout() {
        return this.o.n.timeout();
    }
}
