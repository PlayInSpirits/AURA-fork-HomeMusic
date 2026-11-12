package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sk implements of4 {
    public final /* synthetic */ int n;
    public final Object o;
    public final Object p;

    public /* synthetic */ sk(int i, Object obj, Object obj2) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009a A[LOOP:1: B:12:0x0064->B:25:0x009a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x009c A[SYNTHETIC] */
    @Override // defpackage.of4
    public final void L(tv tvVar, long j) throws IOException {
        long j2;
        vh4 vh4Var;
        int i = this.n;
        Object obj = this.o;
        Object obj2 = this.p;
        switch (i) {
            case 0:
                zz1.i(tvVar.o, 0L, j);
                for (long j3 = j; j3 > 0; j3 -= j2) {
                    t84 t84Var = tvVar.n;
                    t84Var.getClass();
                    j2 = 0;
                    try {
                        try {
                            while (j2 < 65536) {
                                j2 += (long) (t84Var.c - t84Var.b);
                                if (j2 >= j3) {
                                    j2 = j3;
                                    vh4Var = (vh4) obj;
                                    sk skVar = (sk) obj2;
                                    vh4Var.h();
                                    skVar.L(tvVar, j2);
                                    if (!vh4Var.i()) {
                                        throw vh4Var.k(null);
                                    }
                                } else {
                                    t84Var = t84Var.f;
                                    t84Var.getClass();
                                }
                            }
                            skVar.L(tvVar, j2);
                            if (!vh4Var.i()) {
                                throw vh4Var.k(null);
                            }
                        } catch (IOException e) {
                            if (!vh4Var.i()) {
                                throw e;
                            }
                            throw vh4Var.k(e);
                        }
                    } catch (Throwable th) {
                        vh4Var.i();
                        throw th;
                    }
                    vh4Var = (vh4) obj;
                    sk skVar2 = (sk) obj2;
                    vh4Var.h();
                }
                return;
            default:
                zz1.i(tvVar.o, 0L, j);
                long j4 = j;
                while (j4 > 0) {
                    ((fu4) obj2).f();
                    t84 t84Var2 = tvVar.n;
                    t84Var2.getClass();
                    int iMin = (int) Math.min(j4, t84Var2.c - t84Var2.b);
                    ((OutputStream) obj).write(t84Var2.a, t84Var2.b, iMin);
                    int i2 = t84Var2.b + iMin;
                    t84Var2.b = i2;
                    long j5 = iMin;
                    j4 -= j5;
                    tvVar.o -= j5;
                    if (i2 == t84Var2.c) {
                        tvVar.n = t84Var2.a();
                        a94.a(t84Var2);
                    }
                }
                return;
        }
    }

    @Override // defpackage.of4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                vh4 vh4Var = (vh4) obj;
                sk skVar = (sk) this.p;
                vh4Var.h();
                try {
                    try {
                        skVar.close();
                        if (vh4Var.i()) {
                            throw vh4Var.k(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!vh4Var.i()) {
                            throw e;
                        }
                        throw vh4Var.k(e);
                    }
                } catch (Throwable th) {
                    vh4Var.i();
                    throw th;
                }
            default:
                ((OutputStream) obj).close();
                return;
        }
    }

    @Override // defpackage.of4, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                vh4 vh4Var = (vh4) obj;
                sk skVar = (sk) this.p;
                vh4Var.h();
                try {
                    try {
                        skVar.flush();
                        if (vh4Var.i()) {
                            throw vh4Var.k(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!vh4Var.i()) {
                            throw e;
                        }
                        throw vh4Var.k(e);
                    }
                } catch (Throwable th) {
                    vh4Var.i();
                    throw th;
                }
            default:
                ((OutputStream) obj).flush();
                return;
        }
    }

    @Override // defpackage.of4
    public final fu4 timeout() {
        switch (this.n) {
            case 0:
                return (vh4) this.o;
            default:
                return (fu4) this.p;
        }
    }

    public final String toString() {
        switch (this.n) {
            case 0:
                return "AsyncTimeout.sink(" + ((sk) this.p) + ')';
            default:
                return "sink(" + ((OutputStream) this.o) + ')';
        }
    }
}
