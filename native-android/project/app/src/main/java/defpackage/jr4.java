package defpackage;

import android.net.Uri;
import androidx.media3.datasource.cache.CacheDataSink$CacheDataSinkException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jr4 implements ci0 {
    public final ci0 n;
    public final jx o;
    public boolean p;
    public long q;

    public jr4(ci0 ci0Var, jx jxVar) {
        ci0Var.getClass();
        this.n = ci0Var;
        jxVar.getClass();
        this.o = jxVar;
    }

    @Override // defpackage.ci0
    public final long b(ii0 ii0Var) throws CacheDataSink$CacheDataSinkException {
        long jB = this.n.b(ii0Var);
        this.q = jB;
        if (jB == 0) {
            return 0L;
        }
        if (ii0Var.g == -1 && jB != -1) {
            ii0Var = ii0Var.b(0L, jB);
        }
        int i = ii0Var.i;
        this.p = true;
        jx jxVar = this.o;
        jxVar.getClass();
        ii0Var.h.getClass();
        if (ii0Var.g == -1 && (i & 2) == 2) {
            jxVar.d = null;
        } else {
            jxVar.d = ii0Var;
            jxVar.e = (i & 4) == 4 ? jxVar.b : Long.MAX_VALUE;
            jxVar.i = 0L;
            try {
                jxVar.b(ii0Var);
            } catch (IOException e) {
                throw new CacheDataSink$CacheDataSinkException(e);
            }
        }
        return this.q;
    }

    @Override // defpackage.ci0
    public final void c(rw4 rw4Var) {
        rw4Var.getClass();
        this.n.c(rw4Var);
    }

    @Override // defpackage.ci0
    public final void close() throws CacheDataSink$CacheDataSinkException {
        jx jxVar = this.o;
        try {
            this.n.close();
            if (this.p) {
                this.p = false;
                if (jxVar.d == null) {
                    return;
                }
                try {
                    jxVar.a();
                } catch (IOException e) {
                    throw new CacheDataSink$CacheDataSinkException(e);
                }
            }
        } catch (Throwable th) {
            if (this.p) {
                this.p = false;
                if (jxVar.d != null) {
                    try {
                        jxVar.a();
                    } catch (IOException e2) {
                        throw new CacheDataSink$CacheDataSinkException(e2);
                    }
                }
            }
            throw th;
        }
    }

    @Override // defpackage.ci0
    public final Map j() {
        return this.n.j();
    }

    @Override // defpackage.ci0
    public final Uri m() {
        return this.n.m();
    }

    @Override // defpackage.wh0
    public final int read(byte[] bArr, int i, int i2) throws CacheDataSink$CacheDataSinkException {
        if (this.q == 0) {
            return -1;
        }
        int i3 = this.n.read(bArr, i, i2);
        if (i3 > 0) {
            jx jxVar = this.o;
            ii0 ii0Var = jxVar.d;
            if (ii0Var != null) {
                int i4 = 0;
                while (i4 < i3) {
                    try {
                        if (jxVar.h == jxVar.e) {
                            jxVar.a();
                            jxVar.b(ii0Var);
                        }
                        int iMin = (int) Math.min(i3 - i4, jxVar.e - jxVar.h);
                        OutputStream outputStream = jxVar.g;
                        String str = f35.a;
                        outputStream.write(bArr, i + i4, iMin);
                        i4 += iMin;
                        long j = iMin;
                        jxVar.h += j;
                        jxVar.i += j;
                    } catch (IOException e) {
                        throw new CacheDataSink$CacheDataSinkException(e);
                    }
                }
            }
            long j2 = this.q;
            if (j2 != -1) {
                this.q = j2 - ((long) i3);
            }
        }
        return i3;
    }
}
