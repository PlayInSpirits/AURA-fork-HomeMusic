package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wu3 implements ew {
    public final of4 n;
    public final tv o;
    public boolean p;

    public wu3(of4 of4Var) {
        of4Var.getClass();
        this.n = of4Var;
        this.o = new tv();
    }

    @Override // defpackage.ew
    public final ew A(yw ywVar) {
        ywVar.getClass();
        if (this.p) {
            kf2.o("closed");
            return null;
        }
        this.o.X(ywVar);
        b();
        return this;
    }

    @Override // defpackage.ew
    public final ew C(long j) {
        if (this.p) {
            kf2.o("closed");
            return null;
        }
        this.o.a0(j);
        b();
        return this;
    }

    @Override // defpackage.of4
    public final void L(tv tvVar, long j) {
        tvVar.getClass();
        if (this.p) {
            kf2.o("closed");
        } else {
            this.o.L(tvVar, j);
            b();
        }
    }

    @Override // defpackage.ew
    public final ew Q(long j) {
        if (this.p) {
            kf2.o("closed");
            return null;
        }
        this.o.Z(j);
        b();
        return this;
    }

    @Override // defpackage.ew
    public final tv a() {
        return this.o;
    }

    public final ew b() {
        if (this.p) {
            kf2.o("closed");
            return null;
        }
        tv tvVar = this.o;
        long j = tvVar.j();
        if (j > 0) {
            this.n.L(tvVar, j);
        }
        return this;
    }

    @Override // defpackage.of4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        of4 of4Var = this.n;
        if (this.p) {
            return;
        }
        tv tvVar = this.o;
        long j = tvVar.o;
        if (j > 0) {
            of4Var.L(tvVar, j);
        }
        th = null;
        try {
            of4Var.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.p = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.ew, defpackage.of4, java.io.Flushable
    public final void flush() {
        if (this.p) {
            kf2.o("closed");
            return;
        }
        tv tvVar = this.o;
        long j = tvVar.o;
        of4 of4Var = this.n;
        if (j > 0) {
            of4Var.L(tvVar, j);
        }
        of4Var.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.p;
    }

    @Override // defpackage.ew
    public final long p(ej4 ej4Var) {
        ej4Var.getClass();
        long j = 0;
        while (true) {
            long j2 = ej4Var.read(this.o, 8192L);
            if (j2 == -1) {
                return j;
            }
            j += j2;
            b();
        }
    }

    @Override // defpackage.of4
    public final fu4 timeout() {
        return this.n.timeout();
    }

    public final String toString() {
        return "buffer(" + this.n + ')';
    }

    @Override // defpackage.ew
    public final ew write(byte[] bArr) {
        bArr.getClass();
        if (this.p) {
            kf2.o("closed");
            return null;
        }
        this.o.m78write(bArr, 0, bArr.length);
        b();
        return this;
    }

    @Override // defpackage.ew
    public final ew writeByte(int i) {
        if (this.p) {
            kf2.o("closed");
            return null;
        }
        this.o.Y(i);
        b();
        return this;
    }

    @Override // defpackage.ew
    public final ew writeInt(int i) {
        if (this.p) {
            kf2.o("closed");
            return null;
        }
        this.o.b0(i);
        b();
        return this;
    }

    @Override // defpackage.ew
    public final ew writeShort(int i) {
        if (this.p) {
            kf2.o("closed");
            return null;
        }
        this.o.c0(i);
        b();
        return this;
    }

    @Override // defpackage.ew
    public final ew y(String str) {
        str.getClass();
        if (this.p) {
            kf2.o("closed");
            return null;
        }
        this.o.d0(str);
        b();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.p) {
            int iWrite = this.o.write(byteBuffer);
            b();
            return iWrite;
        }
        kf2.o("closed");
        return 0;
    }

    @Override // defpackage.ew
    public final ew write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (!this.p) {
            this.o.m78write(bArr, i, i2);
            b();
            return this;
        }
        kf2.o("closed");
        return null;
    }
}
