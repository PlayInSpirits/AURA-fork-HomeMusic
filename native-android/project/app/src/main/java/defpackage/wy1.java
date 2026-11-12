package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wy1 implements ej4 {
    public final xu3 n;
    public final Inflater o;
    public int p;
    public boolean q;

    public wy1(xu3 xu3Var, Inflater inflater) {
        this.n = xu3Var;
        this.o = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.q) {
            return;
        }
        this.o.end();
        this.q = true;
        this.n.close();
    }

    @Override // defpackage.ej4
    public final long read(tv tvVar, long j) {
        long j2;
        tvVar.getClass();
        while (j >= 0) {
            if (this.q) {
                kf2.o("closed");
                return 0L;
            }
            xu3 xu3Var = this.n;
            Inflater inflater = this.o;
            if (j == 0) {
                j2 = 0;
            } else {
                try {
                    t84 t84VarW = tvVar.W(1);
                    int iMin = (int) Math.min(j, 8192 - t84VarW.c);
                    if (inflater.needsInput() && !xu3Var.l()) {
                        t84 t84Var = xu3Var.o.n;
                        t84Var.getClass();
                        int i = t84Var.c;
                        int i2 = t84Var.b;
                        int i3 = i - i2;
                        this.p = i3;
                        inflater.setInput(t84Var.a, i2, i3);
                    }
                    int iInflate = inflater.inflate(t84VarW.a, t84VarW.c, iMin);
                    int i4 = this.p;
                    if (i4 != 0) {
                        int remaining = i4 - inflater.getRemaining();
                        this.p -= remaining;
                        xu3Var.skip(remaining);
                    }
                    if (iInflate > 0) {
                        t84VarW.c += iInflate;
                        j2 = iInflate;
                        tvVar.o += j2;
                    } else {
                        if (t84VarW.b == t84VarW.c) {
                            tvVar.n = t84VarW.a();
                            a94.a(t84VarW);
                        }
                        j2 = 0;
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            if (j2 > 0) {
                return j2;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
            if (xu3Var.l()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        kf2.e(b11.k("byteCount < 0: ", j));
        return 0L;
    }

    @Override // defpackage.ej4
    public final fu4 timeout() {
        return this.n.n.timeout();
    }
}
