package defpackage;

import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zn0 implements of4 {
    public final /* synthetic */ int n = 1;
    public boolean o;
    public final Object p;
    public final Object q;

    public zn0(hq1 hq1Var) {
        this.q = hq1Var;
        this.p = new cc1(((ew) hq1Var.e).timeout());
    }

    @Override // defpackage.of4
    public final void L(tv tvVar, long j) throws IOException {
        int i = this.n;
        Object obj = this.q;
        switch (i) {
            case 0:
                zz1.i(tvVar.o, 0L, j);
                long j2 = j;
                while (j2 > 0) {
                    t84 t84Var = tvVar.n;
                    t84Var.getClass();
                    int iMin = (int) Math.min(j2, t84Var.c - t84Var.b);
                    ((Deflater) obj).setInput(t84Var.a, t84Var.b, iMin);
                    b(false);
                    long j3 = iMin;
                    tvVar.o -= j3;
                    int i2 = t84Var.b + iMin;
                    t84Var.b = i2;
                    if (i2 == t84Var.c) {
                        tvVar.n = t84Var.a();
                        a94.a(t84Var);
                    }
                    j2 -= j3;
                }
                break;
            default:
                if (!this.o) {
                    xe5.a(tvVar.o, 0L, j);
                    ((ew) ((hq1) obj).e).L(tvVar, j);
                } else {
                    kf2.o("closed");
                }
                break;
        }
    }

    public void b(boolean z) throws IOException {
        t84 t84VarW;
        int iDeflate;
        Deflater deflater = (Deflater) this.q;
        wu3 wu3Var = (wu3) this.p;
        tv tvVar = wu3Var.o;
        while (true) {
            t84VarW = tvVar.W(1);
            byte[] bArr = t84VarW.a;
            int i = t84VarW.c;
            if (z) {
                try {
                    iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                iDeflate = deflater.deflate(bArr, i, 8192 - i);
            }
            if (iDeflate > 0) {
                t84VarW.c += iDeflate;
                tvVar.o += (long) iDeflate;
                wu3Var.b();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (t84VarW.b == t84VarW.c) {
            tvVar.n = t84VarW.a();
            a94.a(t84VarW);
        }
    }

    @Override // defpackage.of4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        int i = this.n;
        Object obj = this.p;
        Object obj2 = this.q;
        switch (i) {
            case 0:
                Deflater deflater = (Deflater) obj2;
                if (this.o) {
                    return;
                }
                deflater.finish();
                b(false);
                th = null;
                try {
                    deflater.end();
                    break;
                } catch (Throwable th) {
                    if (th == null) {
                        th = th;
                    }
                }
                try {
                    ((wu3) obj).close();
                    break;
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    }
                }
                this.o = true;
                if (th != null) {
                    throw th;
                }
                return;
            default:
                hq1 hq1Var = (hq1) obj2;
                if (this.o) {
                    return;
                }
                this.o = true;
                cc1 cc1Var = (cc1) obj;
                fu4 fu4Var = cc1Var.e;
                cc1Var.e = fu4.d;
                fu4Var.a();
                fu4Var.b();
                hq1Var.a = 3;
                return;
        }
    }

    @Override // defpackage.of4, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.n) {
            case 0:
                b(true);
                ((wu3) this.p).flush();
                break;
            default:
                if (!this.o) {
                    ((ew) ((hq1) this.q).e).flush();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.of4
    public final fu4 timeout() {
        int i = this.n;
        Object obj = this.p;
        switch (i) {
            case 0:
                return ((wu3) obj).n.timeout();
            default:
                return (cc1) obj;
        }
    }

    public String toString() {
        switch (this.n) {
            case 0:
                return "DeflaterSink(" + ((wu3) this.p) + ')';
            default:
                return super.toString();
        }
    }

    public zn0(wu3 wu3Var, Deflater deflater) {
        this.p = wu3Var;
        this.q = deflater;
    }
}
