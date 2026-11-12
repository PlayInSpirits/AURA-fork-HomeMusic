package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xu3 implements fw {
    public final ej4 n;
    public final tv o;
    public boolean p;

    public xu3(ej4 ej4Var) {
        ej4Var.getClass();
        this.n = ej4Var;
        this.o = new tv();
    }

    @Override // defpackage.fw
    public final String B(Charset charset) {
        charset.getClass();
        ej4 ej4Var = this.n;
        tv tvVar = this.o;
        tvVar.p(ej4Var);
        return tvVar.K(tvVar.o, charset);
    }

    @Override // defpackage.fw
    public final yw E() {
        ej4 ej4Var = this.n;
        tv tvVar = this.o;
        tvVar.p(ej4Var);
        return tvVar.g(tvVar.o);
    }

    @Override // defpackage.fw
    public final boolean G(long j) {
        tv tvVar;
        if (j < 0) {
            kf2.e(b11.k("byteCount < 0: ", j));
            return false;
        }
        if (this.p) {
            kf2.o("closed");
            return false;
        }
        do {
            tvVar = this.o;
            if (tvVar.o >= j) {
                return true;
            }
        } while (this.n.read(tvVar, 8192L) != -1);
        return false;
    }

    @Override // defpackage.fw
    public final String I() {
        return t(Long.MAX_VALUE);
    }

    @Override // defpackage.fw
    public final long N(tv tvVar) {
        tv tvVar2;
        long j = 0;
        while (true) {
            ej4 ej4Var = this.n;
            tvVar2 = this.o;
            if (ej4Var.read(tvVar2, 8192L) == -1) {
                break;
            }
            long j2 = tvVar2.j();
            if (j2 > 0) {
                j += j2;
                tvVar.L(tvVar2, j2);
            }
        }
        long j3 = tvVar2.o;
        if (j3 <= 0) {
            return j;
        }
        long j4 = j + j3;
        tvVar.L(tvVar2, j3);
        return j4;
    }

    @Override // defpackage.fw
    public final void P(long j) {
        if (!G(j)) {
            throw new EOFException();
        }
    }

    @Override // defpackage.fw
    public final long S() {
        tv tvVar;
        P(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zG = G(i2);
            tvVar = this.o;
            if (!zG) {
                break;
            }
            byte bQ = tvVar.q(i);
            if ((bQ < 48 || bQ > 57) && ((bQ < 97 || bQ > 102) && (bQ < 65 || bQ > 70))) {
                if (i != 0) {
                    break;
                }
                ya4.g(16);
                String string = Integer.toString(bQ, 16);
                string.getClass();
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
            }
            i = i2;
        }
        return tvVar.S();
    }

    @Override // defpackage.fw
    public final InputStream V() {
        return new rv(this, 1);
    }

    @Override // defpackage.fw, defpackage.ew
    public final tv a() {
        return this.o;
    }

    public final long b(byte b, long j, long j2) {
        if (this.p) {
            kf2.o("closed");
            return 0L;
        }
        if (0 > j2) {
            kf2.e(b11.k("fromIndex=0 toIndex=", j2));
            return 0L;
        }
        long jMax = 0;
        while (jMax < j2) {
            tv tvVar = this.o;
            byte b2 = b;
            long j3 = j2;
            long jS = tvVar.s(b2, jMax, j3);
            if (jS != -1) {
                return jS;
            }
            long j4 = tvVar.o;
            if (j4 >= j3 || this.n.read(tvVar, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.p) {
            return;
        }
        this.p = true;
        this.n.close();
        this.o.b();
    }

    public final int f() {
        P(4L);
        return zz1.G(this.o.readInt());
    }

    @Override // defpackage.fw
    public final yw g(long j) {
        P(j);
        return this.o.g(j);
    }

    @Override // defpackage.fw
    public final byte[] i() {
        ej4 ej4Var = this.n;
        tv tvVar = this.o;
        tvVar.p(ej4Var);
        return tvVar.F(tvVar.o);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.p;
    }

    public final long j() throws EOFException {
        char c;
        char c2;
        long j;
        P(8L);
        tv tvVar = this.o;
        if (tvVar.o < 8) {
            throw new EOFException();
        }
        t84 t84Var = tvVar.n;
        t84Var.getClass();
        int i = t84Var.b;
        int i2 = t84Var.c;
        if (i2 - i < 8) {
            j = ((((long) tvVar.readInt()) & 4294967295L) << 32) | (4294967295L & ((long) tvVar.readInt()));
            c = 24;
            c2 = '(';
        } else {
            byte[] bArr = t84Var.a;
            c = 24;
            c2 = '(';
            int i3 = i + 7;
            long j2 = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
            int i4 = i + 8;
            long j3 = j2 | (((long) bArr[i3]) & 255);
            tvVar.o -= 8;
            if (i4 == i2) {
                tvVar.n = t84Var.a();
                a94.a(t84Var);
            } else {
                t84Var.b = i4;
            }
            j = j3;
        }
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> c2) | ((280375465082880L & j) >>> c) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << c) | ((65280 & j) << c2);
    }

    @Override // defpackage.fw
    public final boolean l() {
        if (this.p) {
            kf2.o("closed");
            return false;
        }
        tv tvVar = this.o;
        return tvVar.l() && this.n.read(tvVar, 8192L) == -1;
    }

    @Override // defpackage.fw
    public final int m(cb3 cb3Var) {
        tv tvVar;
        cb3Var.getClass();
        if (this.p) {
            kf2.o("closed");
            return 0;
        }
        do {
            tvVar = this.o;
            int iB = e.b(tvVar, cb3Var, true);
            if (iB != -2) {
                if (iB == -1) {
                    break;
                }
                tvVar.skip(cb3Var.n[iB].d());
                return iB;
            }
        } while (this.n.read(tvVar, 8192L) != -1);
        return -1;
    }

    public final short n() {
        P(2L);
        return this.o.J();
    }

    @Override // defpackage.fw
    public final String o() {
        long jB = b((byte) 10, 0L, Long.MAX_VALUE);
        tv tvVar = this.o;
        if (jB != -1) {
            return e.a(tvVar, jB);
        }
        long j = tvVar.o;
        if (j != 0) {
            return q(j);
        }
        return null;
    }

    public final String q(long j) {
        P(j);
        return this.o.K(j, w10.a);
    }

    @Override // defpackage.ej4
    public final long read(tv tvVar, long j) {
        tvVar.getClass();
        if (j < 0) {
            kf2.e(b11.k("byteCount < 0: ", j));
            return 0L;
        }
        if (this.p) {
            kf2.o("closed");
            return 0L;
        }
        tv tvVar2 = this.o;
        if (tvVar2.o == 0 && this.n.read(tvVar2, 8192L) == -1) {
            return -1L;
        }
        return tvVar2.read(tvVar, Math.min(j, tvVar2.o));
    }

    @Override // defpackage.fw
    public final byte readByte() {
        P(1L);
        return this.o.readByte();
    }

    @Override // defpackage.fw
    public final int readInt() {
        P(4L);
        return this.o.readInt();
    }

    @Override // defpackage.fw
    public final short readShort() {
        P(2L);
        return this.o.readShort();
    }

    @Override // defpackage.fw
    public final void skip(long j) {
        if (this.p) {
            kf2.o("closed");
            return;
        }
        while (j > 0) {
            tv tvVar = this.o;
            if (tvVar.o == 0 && this.n.read(tvVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, tvVar.o);
            tvVar.skip(jMin);
            j -= jMin;
        }
    }

    @Override // defpackage.fw
    public final String t(long j) {
        if (j < 0) {
            kf2.e(b11.k("limit < 0: ", j));
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jB = b((byte) 10, 0L, j2);
        tv tvVar = this.o;
        if (jB != -1) {
            return e.a(tvVar, jB);
        }
        if (j2 < Long.MAX_VALUE && G(j2) && tvVar.q(j2 - 1) == 13 && G(j2 + 1) && tvVar.q(j2) == 10) {
            return e.a(tvVar, j2);
        }
        tv tvVar2 = new tv();
        tvVar.n(tvVar2, 0L, Math.min(32L, tvVar.o));
        throw new EOFException("\\n not found: limit=" + Math.min(tvVar.o, j) + " content=" + tvVar2.g(tvVar2.o).e() + (char) 8230);
    }

    @Override // defpackage.ej4
    public final fu4 timeout() {
        return this.n.timeout();
    }

    public final String toString() {
        return "buffer(" + this.n + ')';
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        tv tvVar = this.o;
        if (tvVar.o == 0 && this.n.read(tvVar, 8192L) == -1) {
            return -1;
        }
        return tvVar.read(byteBuffer);
    }
}
