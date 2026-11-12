package defpackage;

import androidx.media3.datasource.cache.Cache$CacheException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jx {
    public final se4 a;
    public final long b;
    public final int c;
    public ii0 d;
    public long e;
    public File f;
    public OutputStream g;
    public long h;
    public long i;
    public z14 j;

    public jx(se4 se4Var) {
        se4Var.getClass();
        this.a = se4Var;
        this.b = 5242880L;
        this.c = 20480;
    }

    public final void a() {
        OutputStream outputStream = this.g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            f35.h(this.g);
            this.g = null;
            File file = this.f;
            this.f = null;
            se4 se4Var = this.a;
            long j = this.h;
            synchronized (se4Var) {
                if (file.exists()) {
                    if (j == 0) {
                        file.delete();
                        return;
                    }
                    te4 te4VarB = te4.b(file, j, -9223372036854775807L, se4Var.c);
                    te4VarB.getClass();
                    wx wxVarL = se4Var.c.l(te4VarB.n);
                    wxVarL.getClass();
                    rr2.w(wxVarL.c(te4VarB.o, te4VarB.p));
                    long jA = nd0.a(wxVarL.e);
                    if (jA != -1) {
                        rr2.w(te4VarB.o + te4VarB.p <= jA);
                    }
                    if (se4Var.d == null) {
                        se4Var.b(te4VarB);
                        se4Var.c.u();
                        se4Var.notifyAll();
                        return;
                    }
                    try {
                        se4Var.d.k(te4VarB.p, te4VarB.s, file.getName());
                        se4Var.b(te4VarB);
                        try {
                            se4Var.c.u();
                            se4Var.notifyAll();
                            return;
                        } catch (IOException e) {
                            throw new Cache$CacheException(e);
                        }
                    } catch (IOException e2) {
                        throw new Cache$CacheException(e2);
                    }
                    throw th;
                }
            }
        } catch (Throwable th) {
            f35.h(this.g);
            this.g = null;
            File file2 = this.f;
            this.f = null;
            file2.delete();
            throw th;
        }
    }

    public final void b(ii0 ii0Var) {
        File fileC;
        long j = ii0Var.g;
        long jMin = j != -1 ? Math.min(j - this.i, this.e) : -1L;
        se4 se4Var = this.a;
        String str = ii0Var.h;
        String str2 = f35.a;
        long j2 = ii0Var.f + this.i;
        synchronized (se4Var) {
            try {
                se4Var.d();
                wx wxVarL = se4Var.c.l(str);
                wxVarL.getClass();
                rr2.w(wxVarL.c(j2, jMin));
                if (!se4Var.a.exists()) {
                    se4.e(se4Var.a);
                    se4Var.o();
                }
                se4Var.b.a(se4Var, jMin);
                File file = new File(se4Var.a, Integer.toString(se4Var.f.nextInt(10)));
                if (!file.exists()) {
                    se4.e(file);
                }
                fileC = te4.c(file, wxVarL.a, j2, System.currentTimeMillis());
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f = fileC;
        FileOutputStream fileOutputStream = new FileOutputStream(this.f);
        if (this.c > 0) {
            z14 z14Var = this.j;
            if (z14Var == null) {
                this.j = new z14(fileOutputStream, this.c);
            } else {
                z14Var.b(fileOutputStream);
            }
            this.g = this.j;
        } else {
            this.g = fileOutputStream;
        }
        this.h = 0L;
    }
}
