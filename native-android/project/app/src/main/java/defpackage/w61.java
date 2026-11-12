package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w61 implements ej4 {
    public final r32 n;
    public long o;
    public boolean p;

    public w61(r32 r32Var, long j) {
        this.n = r32Var;
        this.o = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        r32 r32Var = this.n;
        if (this.p) {
            return;
        }
        this.p = true;
        ReentrantLock reentrantLock = r32Var.p;
        reentrantLock.lock();
        try {
            int i = r32Var.o - 1;
            r32Var.o = i;
            if (i == 0 && r32Var.n) {
                reentrantLock.unlock();
                synchronized (r32Var) {
                    r32Var.q.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.ej4
    public final long read(tv tvVar, long j) {
        long j2;
        long j3;
        int i;
        tvVar.getClass();
        if (this.p) {
            kf2.o("closed");
            return 0L;
        }
        r32 r32Var = this.n;
        long j4 = this.o;
        if (j < 0) {
            kf2.e(b11.k("byteCount < 0: ", j));
            return 0L;
        }
        long j5 = j + j4;
        long j6 = j4;
        while (true) {
            if (j6 < j5) {
                t84 t84VarW = tvVar.W(1);
                byte[] bArr = t84VarW.a;
                int i2 = t84VarW.c;
                j2 = -1;
                int iMin = (int) Math.min(j5 - j6, 8192 - i2);
                synchronized (r32Var) {
                    bArr.getClass();
                    r32Var.q.seek(j6);
                    i = 0;
                    while (true) {
                        if (i < iMin) {
                            int i3 = r32Var.q.read(bArr, i2, iMin - i);
                            if (i3 != -1) {
                                i += i3;
                            } else if (i == 0) {
                                i = -1;
                                break;
                            }
                        }
                        break;
                    }
                }
                if (i == -1) {
                    if (t84VarW.b == t84VarW.c) {
                        tvVar.n = t84VarW.a();
                        a94.a(t84VarW);
                    }
                    if (j4 == j6) {
                        j3 = -1;
                        break;
                    }
                } else {
                    t84VarW.c += i;
                    long j7 = i;
                    j6 += j7;
                    tvVar.o += j7;
                }
            } else {
                j2 = -1;
            }
            j3 = j6 - j4;
            break;
        }
        if (j3 != j2) {
            this.o += j3;
        }
        return j3;
    }

    @Override // defpackage.ej4
    public final fu4 timeout() {
        return fu4.d;
    }
}
