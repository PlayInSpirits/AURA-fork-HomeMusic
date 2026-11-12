package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tk implements ej4 {
    public final /* synthetic */ int n;
    public final Object o;
    public final Object p;

    public /* synthetic */ tk(int i, Object obj, Object obj2) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                vh4 vh4Var = (vh4) obj;
                tk tkVar = (tk) this.p;
                vh4Var.h();
                try {
                    try {
                        tkVar.close();
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
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // defpackage.ej4
    public final long read(tv tvVar, long j) throws IOException {
        int i = this.n;
        Object obj = this.o;
        Object obj2 = this.p;
        tvVar.getClass();
        switch (i) {
            case 0:
                vh4 vh4Var = (vh4) obj;
                tk tkVar = (tk) obj2;
                vh4Var.h();
                try {
                    try {
                        long j2 = tkVar.read(tvVar, j);
                        if (vh4Var.i()) {
                            throw vh4Var.k(null);
                        }
                        return j2;
                    } catch (IOException e) {
                        if (vh4Var.i()) {
                            throw vh4Var.k(e);
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    vh4Var.i();
                    throw th;
                }
            default:
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    kf2.e(b11.k("byteCount < 0: ", j));
                    return 0L;
                }
                try {
                    ((fu4) obj2).f();
                    t84 t84VarW = tvVar.W(1);
                    int i2 = ((InputStream) obj).read(t84VarW.a, t84VarW.c, (int) Math.min(j, 8192 - t84VarW.c));
                    if (i2 == -1) {
                        if (t84VarW.b == t84VarW.c) {
                            tvVar.n = t84VarW.a();
                            a94.a(t84VarW);
                        }
                        return -1L;
                    }
                    t84VarW.c += i2;
                    long j3 = i2;
                    tvVar.o += j3;
                    return j3;
                } catch (AssertionError e2) {
                    if (wr1.E(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
        }
    }

    @Override // defpackage.ej4
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
                return "AsyncTimeout.source(" + ((tk) this.p) + ')';
            default:
                return "source(" + ((InputStream) this.o) + ')';
        }
    }
}
