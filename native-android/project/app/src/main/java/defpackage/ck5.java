package defpackage;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ck5 implements Closeable {
    public final ByteArrayInputStream n;
    public bk5 o;
    public final byte[] p = new byte[8];
    public final qw q = new qw(1);

    public ck5(ByteArrayInputStream byteArrayInputStream) {
        this.n = byteArrayInputStream;
    }

    public final void F(int i, byte[] bArr) throws IOException {
        int i2 = 0;
        while (i2 != i) {
            int i3 = this.n.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        this.o = null;
    }

    public final byte[] H() throws IOException {
        u();
        long jS = s();
        if (jS < 0 || jS > 2147483647L) {
            er1.l("the maximum supported byte/text string length is 2147483647 bytes");
            return null;
        }
        if (this.n.available() < jS) {
            throw new EOFException();
        }
        int i = (int) jS;
        byte[] bArr = new byte[i];
        F(i, bArr);
        return bArr;
    }

    public final long b() throws IOException {
        v((byte) -128);
        u();
        long jS = s();
        if (jS < 0) {
            er1.l("the maximum supported array length is 9223372036854775807");
            return 0L;
        }
        if (jS > 0) {
            this.q.a.push(Long.valueOf(jS));
        }
        return jS;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.n.close();
        this.q.b();
    }

    public final long f() throws IOException {
        boolean z;
        n();
        byte b = this.o.a;
        if (b == 0) {
            z = true;
        } else {
            if (b != 32) {
                kf2.o(f34.f((b >> 5) & 7, "expected major type 0 or 1 but found "));
                return 0L;
            }
            z = false;
        }
        long jS = s();
        if (jS >= 0) {
            return z ? jS : ~jS;
        }
        er1.l("the maximum supported unsigned/negative integer is 9223372036854775807");
        return 0L;
    }

    public final long j() throws IOException {
        v((byte) -96);
        u();
        long jS = s();
        if (jS < 0 || jS > 4611686018427387903L) {
            er1.l("the maximum supported map length is 4611686018427387903L");
            return 0L;
        }
        if (jS > 0) {
            this.q.a.push(Long.valueOf(jS + jS));
        }
        return jS;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cb  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
    
        if (r0 != (-2)) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bk5 n() throws IOException {
        long jD;
        if (this.o == null) {
            int i = this.n.read();
            qw qwVar = this.q;
            if (i == -1) {
                qwVar.b();
                return null;
            }
            bk5 bk5Var = new bk5(i);
            this.o = bk5Var;
            long j = -2;
            byte b = bk5Var.a;
            if (b == -128 || b == -96 || b == -64) {
                jD = qwVar.d();
                if (jD != -1) {
                    j = jD;
                }
                mj0.i(b11.k("expected non-string scope but found ", j));
                return null;
            }
            if (b != -32) {
                if (b != 0 && b != 32) {
                    if (b == 64) {
                        qwVar.c(-1L);
                    } else {
                        if (b != 96) {
                            kf2.o(f34.f((b >> 5) & 7, "invalid major type: "));
                            return null;
                        }
                        qwVar.c(-2L);
                    }
                }
                long jD2 = qwVar.d();
                ArrayDeque arrayDeque = qwVar.a;
                if (jD2 == 1) {
                    arrayDeque.pop();
                } else if (jD2 > 1) {
                    arrayDeque.pop();
                    arrayDeque.push(Long.valueOf(jD2 - 1));
                } else if (jD2 == -4) {
                    arrayDeque.pop();
                    arrayDeque.push(-5L);
                } else if (jD2 == -5) {
                    arrayDeque.pop();
                    arrayDeque.push(-4L);
                }
            } else if (bk5Var.b == 31) {
                long jD3 = qwVar.d();
                if (jD3 >= 0) {
                    mj0.i(b11.k("expected indefinite length scope but found ", jD3));
                    return null;
                }
                if (jD3 == -5) {
                    mj0.i("expected a value for dangling key in indefinite-length map");
                    return null;
                }
                qwVar.a.pop();
            }
            jD = qwVar.d();
            if (jD != -1) {
                j = jD;
            }
            mj0.i(b11.k("expected non-string scope but found ", j));
            return null;
        }
        return this.o;
    }

    public final boolean q() throws IOException {
        v((byte) -32);
        if (this.o.b > 24) {
            kf2.o("expected simple value");
            return false;
        }
        int iS = (int) s();
        if (iS == 20) {
            return false;
        }
        if (iS == 21) {
            return true;
        }
        kf2.o("expected FALSE or TRUE");
        return false;
    }

    public final long s() throws IOException {
        bk5 bk5Var = this.o;
        byte b = bk5Var.b;
        if (b < 24) {
            long j = b;
            this.o = null;
            return j;
        }
        if (b == 24) {
            int i = this.n.read();
            if (i == -1) {
                throw new EOFException();
            }
            this.o = null;
            return ((long) i) & 255;
        }
        byte[] bArr = this.p;
        if (b == 25) {
            F(2, bArr);
            return ((((long) bArr[0]) & 255) << 8) | (((long) bArr[1]) & 255);
        }
        if (b == 26) {
            F(4, bArr);
            return ((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16) | ((((long) bArr[2]) & 255) << 8) | (((long) bArr[3]) & 255);
        }
        if (b != 27) {
            mj0.i(xa3.e(b, (bk5Var.a >> 5) & 7, "invalid additional information ", " for major type "));
            return 0L;
        }
        F(8, bArr);
        long j2 = bArr[0];
        long j3 = bArr[1];
        long j4 = bArr[2];
        long j5 = bArr[3];
        return (((long) bArr[7]) & 255) | ((j3 & 255) << 48) | ((j2 & 255) << 56) | ((j4 & 255) << 40) | ((j5 & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8);
    }

    public final void u() throws IOException {
        n();
        byte b = this.o.b;
        if (b != 31) {
            return;
        }
        kf2.o(f34.f(b, "expected definite length but found "));
    }

    public final void v(byte b) throws IOException {
        n();
        byte b2 = this.o.a;
        if (b2 == b) {
            return;
        }
        kf2.o(xa3.e((b >> 5) & 7, (b2 >> 5) & 7, "expected major type ", " but found "));
    }
}
