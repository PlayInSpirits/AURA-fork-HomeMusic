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

    public tk1(ej4 ej4Var) {
        ej4Var.getClass();
        xu3 xu3Var = new xu3(ej4Var);
        this.o = xu3Var;
        Inflater inflater = new Inflater(true);
        this.p = inflater;
        this.q = new wy1(xu3Var, inflater);
        this.r = new CRC32();
    }

    public static void b(String str, int i, int i2) throws IOException {
        if (i2 == i) {
            return;
        }
        StringBuilder sbS = b11.s(str, ": actual 0x");
        sbS.append(qm4.x0(8, zz1.L(i2)));
        sbS.append(" != expected 0x");
        sbS.append(qm4.x0(8, zz1.L(i)));
        throw new IOException(sbS.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.q.close();
    }

    public final void f(tv tvVar, long j, long j2) {
        t84 t84Var = tvVar.n;
        t84Var.getClass();
        while (true) {
            int i = t84Var.c;
            int i2 = t84Var.b;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            t84Var = t84Var.f;
            t84Var.getClass();
        }
        while (j2 > 0) {
            int i3 = (int) (((long) t84Var.b) + j);
            int iMin = (int) Math.min(t84Var.c - i3, j2);
            this.r.update(t84Var.a, i3, iMin);
            j2 -= (long) iMin;
            t84Var = t84Var.f;
            t84Var.getClass();
            j = 0;
        }
    }

    @Override // defpackage.ej4
    public final long read(tv tvVar, long j) throws IOException {
        tk1 tk1Var = this;
        tvVar.getClass();
        if (j < 0) {
            kf2.e(b11.k("byteCount < 0: ", j));
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        byte b = tk1Var.n;
        CRC32 crc32 = tk1Var.r;
        xu3 xu3Var = tk1Var.o;
        if (b == 0) {
            xu3Var.P(10L);
            tv tvVar2 = xu3Var.o;
            byte bQ = tvVar2.q(3L);
            boolean z = ((bQ >> 1) & 1) == 1;
            if (z) {
                tk1Var.f(tvVar2, 0L, 10L);
            }
            b("ID1ID2", 8075, xu3Var.readShort());
            xu3Var.skip(8L);
            if (((bQ >> 2) & 1) == 1) {
                xu3Var.P(2L);
                if (z) {
                    f(tvVar2, 0L, 2L);
                }
                long J = tvVar2.J() & 65535;
                xu3Var.P(J);
                if (z) {
                    f(tvVar2, 0L, J);
                }
                xu3Var.skip(J);
            }
            if (((bQ >> 3) & 1) == 1) {
                long jB = xu3Var.b((byte) 0, 0L, Long.MAX_VALUE);
                if (jB == -1) {
                    throw new EOFException();
                }
                if (z) {
                    f(tvVar2, 0L, jB + 1);
                }
                xu3Var.skip(jB + 1);
            }
            if (((bQ >> 4) & 1) == 1) {
                long jB2 = xu3Var.b((byte) 0, 0L, Long.MAX_VALUE);
                if (jB2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    tk1Var = this;
                    tk1Var.f(tvVar2, 0L, jB2 + 1);
                } else {
                    tk1Var = this;
                }
                xu3Var.skip(jB2 + 1);
            } else {
                tk1Var = this;
            }
            if (z) {
                b("FHCRC", xu3Var.n(), (short) crc32.getValue());
                crc32.reset();
            }
            tk1Var.n = (byte) 1;
        }
        if (tk1Var.n == 1) {
            long j2 = tvVar.o;
            long j3 = tk1Var.q.read(tvVar, j);
            if (j3 != -1) {
                tk1Var.f(tvVar, j2, j3);
                return j3;
            }
            tk1Var.n = (byte) 2;
        }
        if (tk1Var.n == 2) {
            b("CRC", xu3Var.f(), (int) crc32.getValue());
            b("ISIZE", xu3Var.f(), (int) tk1Var.p.getBytesWritten());
            tk1Var.n = (byte) 3;
            if (!xu3Var.l()) {
                mj0.i("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    @Override // defpackage.ej4
    public final fu4 timeout() {
        return this.o.n.timeout();
    }
}
