package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zq1 implements Closeable {
    public static final Logger s = Logger.getLogger(iq1.class.getName());
    public final ew n;
    public final tv o;
    public int p;
    public boolean q;
    public final zp1 r;

    public zq1(ew ewVar) {
        ewVar.getClass();
        this.n = ewVar;
        tv tvVar = new tv();
        this.o = tvVar;
        this.p = 16384;
        this.r = new zp1(tvVar);
    }

    public final synchronized void b(pb4 pb4Var) {
        try {
            pb4Var.getClass();
            if (this.q) {
                throw new IOException("closed");
            }
            int i = this.p;
            int i2 = pb4Var.a;
            if ((i2 & 32) != 0) {
                i = pb4Var.b[5];
            }
            this.p = i;
            if (((i2 & 2) != 0 ? pb4Var.b[1] : -1) != -1) {
                zp1 zp1Var = this.r;
                int i3 = (i2 & 2) != 0 ? pb4Var.b[1] : -1;
                zp1Var.getClass();
                int iMin = Math.min(i3, 16384);
                int i4 = zp1Var.d;
                if (i4 != iMin) {
                    if (iMin < i4) {
                        zp1Var.b = Math.min(zp1Var.b, iMin);
                    }
                    zp1Var.c = true;
                    zp1Var.d = iMin;
                    int i5 = zp1Var.h;
                    if (iMin < i5) {
                        if (iMin == 0) {
                            pl1[] pl1VarArr = zp1Var.e;
                            ti.f0(0, pl1VarArr.length, null, pl1VarArr);
                            zp1Var.f = zp1Var.e.length - 1;
                            zp1Var.g = 0;
                            zp1Var.h = 0;
                        } else {
                            zp1Var.a(i5 - iMin);
                        }
                    }
                }
            }
            j(0, 0, 4, 1);
            this.n.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.q = true;
        this.n.close();
    }

    public final synchronized void f(boolean z, int i, tv tvVar, int i2) {
        if (this.q) {
            throw new IOException("closed");
        }
        j(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            ew ewVar = this.n;
            tvVar.getClass();
            ewVar.L(tvVar, i2);
        }
    }

    public final synchronized void flush() {
        if (this.q) {
            throw new IOException("closed");
        }
        this.n.flush();
    }

    public final void j(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = s;
            if (logger.isLoggable(level)) {
                logger.fine(iq1.b(false, i, i2, i3, i4));
            }
        }
        if (i2 > this.p) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.p + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            kf2.e(f34.f(i, "reserved bit set: "));
            return;
        }
        byte[] bArr = xe5.a;
        ew ewVar = this.n;
        ewVar.getClass();
        ewVar.writeByte((i2 >>> 16) & 255);
        ewVar.writeByte((i2 >>> 8) & 255);
        ewVar.writeByte(i2 & 255);
        ewVar.writeByte(i3 & 255);
        ewVar.writeByte(i4 & 255);
        ewVar.writeInt(i & Integer.MAX_VALUE);
    }

    public final synchronized void n(int i, b21 b21Var, byte[] bArr) {
        if (this.q) {
            throw new IOException("closed");
        }
        if (b21Var.n == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        j(0, bArr.length + 8, 7, 0);
        this.n.writeInt(i);
        this.n.writeInt(b21Var.n);
        if (bArr.length != 0) {
            this.n.write(bArr);
        }
        this.n.flush();
    }

    public final synchronized void q(boolean z, int i, ArrayList arrayList) {
        if (this.q) {
            throw new IOException("closed");
        }
        this.r.d(arrayList);
        long j = this.o.o;
        long jMin = Math.min(this.p, j);
        int i2 = j == jMin ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        j(i, (int) jMin, 1, i2);
        this.n.L(this.o, jMin);
        if (j > jMin) {
            long j2 = j - jMin;
            while (j2 > 0) {
                long jMin2 = Math.min(this.p, j2);
                j2 -= jMin2;
                j(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                this.n.L(this.o, jMin2);
            }
        }
    }

    public final synchronized void s(int i, int i2, boolean z) {
        if (this.q) {
            throw new IOException("closed");
        }
        j(0, 8, 6, z ? 1 : 0);
        this.n.writeInt(i);
        this.n.writeInt(i2);
        this.n.flush();
    }

    public final synchronized void u(int i, b21 b21Var) {
        if (this.q) {
            throw new IOException("closed");
        }
        if (b21Var.n == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        j(i, 4, 3, 0);
        this.n.writeInt(b21Var.n);
        this.n.flush();
    }

    public final synchronized void v(int i, long j) {
        try {
            if (this.q) {
                throw new IOException("closed");
            }
            if (j == 0 || j > 2147483647L) {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
            }
            Logger logger = s;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(iq1.c(i, 4, j, false));
            }
            j(i, 4, 8, 0);
            this.n.writeInt((int) j);
            this.n.flush();
        } catch (Throwable th) {
            throw th;
        }
    }
}
