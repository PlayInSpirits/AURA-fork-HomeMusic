package defpackage;

import android.net.Uri;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.cache.Cache$CacheException;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lx implements ci0 {
    public long A;
    public long B;
    public te4 C;
    public boolean D;
    public boolean E;
    public long F;
    public final se4 n;
    public final ci0 o;
    public final jr4 p;
    public final ci0 q;
    public final px r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public Uri v;
    public ii0 w;
    public ii0 x;
    public ci0 y;
    public long z;

    public lx(se4 se4Var, ci0 ci0Var, ci0 ci0Var2, jx jxVar, px pxVar, int i) {
        this.n = se4Var;
        this.o = ci0Var2;
        this.r = pxVar;
        this.s = (i & 1) != 0;
        this.t = (i & 2) != 0;
        this.u = (i & 4) != 0;
        if (ci0Var != null) {
            this.q = ci0Var;
            this.p = jxVar != null ? new jr4(ci0Var, jxVar) : null;
        } else {
            this.q = mg3.n;
            this.p = null;
        }
    }

    @Override // defpackage.ci0
    public final long b(ii0 ii0Var) {
        se4 se4Var = this.n;
        try {
            String strD = this.r.d(ii0Var);
            hi0 hi0VarA = ii0Var.a();
            long j = ii0Var.f;
            long j2 = ii0Var.g;
            hi0VarA.h = strD;
            ii0 ii0VarA = hi0VarA.a();
            this.w = ii0VarA;
            Uri uri = ii0VarA.a;
            byte[] bArr = (byte[]) se4Var.i(strD).b.get("exo_redir");
            Uri uri2 = null;
            String str = bArr != null ? new String(bArr, StandardCharsets.UTF_8) : null;
            if (str != null) {
                uri2 = Uri.parse(str);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.v = uri;
            this.A = j;
            boolean z = (this.t && this.D) || (this.u && j2 == -1);
            this.E = z;
            if (z) {
                this.B = -1L;
            } else {
                long jA = nd0.a(se4Var.i(strD));
                this.B = jA;
                if (jA != -1) {
                    long j3 = jA - j;
                    this.B = j3;
                    if (j3 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            }
            if (j2 != -1) {
                long j4 = this.B;
                this.B = j4 == -1 ? j2 : Math.min(j4, j2);
            }
            long j5 = this.B;
            if (j5 > 0 || j5 == -1) {
                p(ii0VarA, false);
            }
            return j2 != -1 ? j2 : this.B;
        } catch (Throwable th) {
            if (this.y == this.o || (th instanceof Cache$CacheException)) {
                this.D = true;
            }
            throw th;
        }
    }

    @Override // defpackage.ci0
    public final void c(rw4 rw4Var) {
        rw4Var.getClass();
        this.o.c(rw4Var);
        this.q.c(rw4Var);
    }

    @Override // defpackage.ci0
    public final void close() {
        this.w = null;
        this.v = null;
        this.A = 0L;
        try {
            o();
        } catch (Throwable th) {
            if (this.y == this.o || (th instanceof Cache$CacheException)) {
                this.D = true;
            }
            throw th;
        }
    }

    @Override // defpackage.ci0
    public final Map j() {
        return !(this.y == this.o) ? this.q.j() : Collections.EMPTY_MAP;
    }

    @Override // defpackage.ci0
    public final Uri m() {
        return this.v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o() {
        se4 se4Var = this.n;
        ci0 ci0Var = this.y;
        if (ci0Var == null) {
            return;
        }
        try {
            ci0Var.close();
        } finally {
            this.x = null;
            this.y = null;
            te4 te4Var = this.C;
            if (te4Var != null) {
                se4Var.l(te4Var);
                this.C = null;
            }
        }
    }

    public final void p(ii0 ii0Var, boolean z) throws InterruptedIOException {
        te4 te4VarP;
        ii0 ii0VarA;
        ci0 ci0Var;
        String str = ii0Var.h;
        String str2 = f35.a;
        if (this.E) {
            te4VarP = null;
        } else {
            boolean z2 = this.s;
            se4 se4Var = this.n;
            long j = this.A;
            if (z2) {
                try {
                    long j2 = this.B;
                    synchronized (se4Var) {
                        se4Var.d();
                        while (true) {
                            te4VarP = se4Var.p(j, j2, str);
                            if (te4VarP != null) {
                                break;
                            } else {
                                se4Var.wait();
                            }
                        }
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            } else {
                te4VarP = se4Var.p(j, this.B, str);
            }
        }
        if (te4VarP == null) {
            ci0Var = this.q;
            hi0 hi0VarA = ii0Var.a();
            hi0VarA.f = this.A;
            hi0VarA.g = this.B;
            ii0VarA = hi0VarA.a();
        } else if (te4VarP.q) {
            Uri uriFromFile = Uri.fromFile(te4VarP.r);
            long j3 = te4VarP.o;
            long j4 = this.A - j3;
            long jMin = te4VarP.p - j4;
            long j5 = this.B;
            if (j5 != -1) {
                jMin = Math.min(jMin, j5);
            }
            hi0 hi0VarA2 = ii0Var.a();
            hi0VarA2.a = uriFromFile;
            hi0VarA2.b = j3;
            hi0VarA2.f = j4;
            hi0VarA2.g = jMin;
            ii0VarA = hi0VarA2.a();
            ci0Var = this.o;
        } else {
            long jMin2 = te4VarP.p;
            long j6 = this.B;
            if (jMin2 == -1) {
                jMin2 = j6;
            } else if (j6 != -1) {
                jMin2 = Math.min(jMin2, j6);
            }
            hi0 hi0VarA3 = ii0Var.a();
            hi0VarA3.f = this.A;
            hi0VarA3.g = jMin2;
            ii0VarA = hi0VarA3.a();
            ci0Var = this.p;
            if (ci0Var == null) {
                ci0Var = this.q;
                this.n.l(te4VarP);
                te4VarP = null;
            }
        }
        this.F = (this.E || ci0Var != this.q) ? Long.MAX_VALUE : this.A + 102400;
        if (z) {
            rr2.w(this.y == this.q);
            if (ci0Var == this.q) {
                return;
            }
            try {
                o();
            } catch (Throwable th) {
                if (!te4VarP.q) {
                    this.n.l(te4VarP);
                }
                throw th;
            }
        }
        if (te4VarP != null && !te4VarP.q) {
            this.C = te4VarP;
        }
        this.y = ci0Var;
        this.x = ii0VarA;
        this.z = 0L;
        long jB = ci0Var.b(ii0VarA);
        xc5 xc5Var = new xc5(5);
        if (ii0VarA.g == -1 && jB != -1) {
            this.B = jB;
            xc5Var.m(Long.valueOf(this.A + jB), "exo_len");
        }
        if (!(this.y == this.o)) {
            Uri uriM = ci0Var.m();
            this.v = uriM;
            Uri uri = ii0Var.a.equals(uriM) ? null : this.v;
            if (uri == null) {
                ((ArrayList) xc5Var.p).add("exo_redir");
                ((HashMap) xc5Var.o).remove("exo_redir");
            } else {
                xc5Var.m(uri.toString(), "exo_redir");
            }
        }
        if (this.y == this.p) {
            this.n.c(str, xc5Var);
        }
    }

    @Override // defpackage.wh0
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        long j;
        ci0 ci0Var = this.o;
        if (i2 == 0) {
            return 0;
        }
        if (this.B == 0) {
            return -1;
        }
        ii0 ii0Var = this.w;
        ii0Var.getClass();
        ii0 ii0Var2 = this.x;
        ii0Var2.getClass();
        try {
            if (this.A >= this.F) {
                p(ii0Var, true);
            }
            ci0 ci0Var2 = this.y;
            ci0Var2.getClass();
            int i4 = ci0Var2.read(bArr, i, i2);
            ci0 ci0Var3 = this.y;
            if (i4 != -1) {
                long j2 = i4;
                this.A += j2;
                this.z += j2;
                long j3 = this.B;
                if (j3 == -1) {
                    return i4;
                }
                this.B = j3 - j2;
                return i4;
            }
            if (!(ci0Var3 == ci0Var)) {
                j = -1;
                long j4 = ii0Var2.g;
                if (j4 != -1) {
                    i3 = i4;
                    if (this.z < j4) {
                    }
                } else {
                    i3 = i4;
                }
                String str = ii0Var.h;
                String str2 = f35.a;
                this.B = 0L;
                if (!(ci0Var3 == this.p)) {
                    return i3;
                }
                xc5 xc5Var = new xc5(5);
                xc5Var.m(Long.valueOf(this.A), "exo_len");
                this.n.c(str, xc5Var);
                return i3;
            }
            i3 = i4;
            j = -1;
            long j5 = this.B;
            if (j5 <= 0 && j5 != j) {
                return i3;
            }
            o();
            p(ii0Var, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if (this.y == ci0Var || (th instanceof Cache$CacheException)) {
                this.D = true;
            }
            throw th;
        }
    }
}
