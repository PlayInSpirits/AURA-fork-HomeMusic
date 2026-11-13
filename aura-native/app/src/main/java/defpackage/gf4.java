package defpackage;

import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import com.eddyizm.tempus.homemusic.SmartSession;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class gf4 implements no2, hd2 {
    public int A;
    public final ii0 n;
    public final bi0 o;
    public final rw4 p;
    public final i80 q;
    public final ue1 r;
    public final tv4 s;
    public final ArrayList t = new ArrayList();
    public final long u;
    public final i61 v;
    public final tb1 w;
    public final boolean x;
    public boolean y;
    public byte[] z;

    public gf4(ii0 ii0Var, bi0 bi0Var, rw4 rw4Var, tb1 tb1Var, long j, i80 i80Var, ue1 ue1Var, boolean z, ty3 ty3Var) {
        this.n = ii0Var;
        this.o = bi0Var;
        this.p = rw4Var;
        this.w = tb1Var;
        this.u = j;
        this.q = i80Var;
        this.r = ue1Var;
        this.x = z;
        this.s = new tv4(new sv4("", tb1Var));
        this.v = ty3Var != null ? new i61(ty3Var) : new i61("SingleSampleMediaPeriod");
    }

    @Override // defpackage.hd2
    public final void b(jd2 jd2Var, long j, long j2, boolean z) {
        ff4 ff4Var = (ff4) jd2Var;
        yl4 yl4Var = ff4Var.b;
        ed2 ed2Var = new ed2(ff4Var.a, yl4Var.p, yl4Var.q, j, j2, yl4Var.o);
        this.q.getClass();
        this.r.q(ed2Var, 1, -1, null, 0, null, 0L, this.u);
    }

    @Override // defpackage.no2
    public final long c(t41[] t41VarArr, boolean[] zArr, q44[] q44VarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < t41VarArr.length; i++) {
            q44 q44Var = q44VarArr[i];
            ArrayList arrayList = this.t;
            if (q44Var != null && (t41VarArr[i] == null || !zArr[i])) {
                arrayList.remove(q44Var);
                q44VarArr[i] = null;
            }
            if (q44VarArr[i] == null && t41VarArr[i] != null) {
                ef4 ef4Var = new ef4(this);
                arrayList.add(ef4Var);
                q44VarArr[i] = ef4Var;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // defpackage.da4
    public final long d() {
        return (this.y || this.v.l()) ? Long.MIN_VALUE : 0L;
    }

    @Override // defpackage.da4
    public final boolean f() {
        return this.v.l();
    }

    @Override // defpackage.hd2
    public final void g(jd2 jd2Var, long j, long j2) {
        ff4 ff4Var = (ff4) jd2Var;
        this.A = (int) ff4Var.b.o;
        byte[] bArr = ff4Var.c;
        bArr.getClass();
        this.z = bArr;
        this.y = true;
        yl4 yl4Var = ff4Var.b;
        ed2 ed2Var = new ed2(ff4Var.a, yl4Var.p, yl4Var.q, j, j2, this.A);
        this.q.getClass();
        this.r.r(ed2Var, 1, -1, this.w, 0, null, 0L, this.u);
    }

    @Override // defpackage.no2
    public final long i(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.t;
            if (i >= arrayList.size()) {
                return j;
            }
            ef4 ef4Var = (ef4) arrayList.get(i);
            if (ef4Var.n == 2) {
                ef4Var.n = 1;
            }
            i++;
        }
    }

    @Override // defpackage.hd2
    public final void j(jd2 jd2Var, long j, long j2, int i) {
        ff4 ff4Var = (ff4) jd2Var;
        yl4 yl4Var = ff4Var.b;
        this.r.u(i == 0 ? new ed2(j, ff4Var.a) : new ed2(ff4Var.a, yl4Var.p, yl4Var.q, j, j2, yl4Var.o), 1, -1, this.w, 0, null, 0L, this.u, i);
    }

    @Override // defpackage.no2
    public final long l() {
        return -9223372036854775807L;
    }

    @Override // defpackage.no2
    public final void m(mo2 mo2Var, long j) {
        mo2Var.b(this);
    }

    @Override // defpackage.no2
    public final tv4 n() {
        return this.s;
    }

    @Override // defpackage.da4
    public final boolean o(pd2 pd2Var) {
        if (this.y) {
            return false;
        }
        i61 i61Var = this.v;
        if (i61Var.l() || ((IOException) i61Var.q) != null) {
            return false;
        }
        ci0 m = this.o.m();
        rw4 rw4Var = this.p;
        if (rw4Var != null) {
            m.c(rw4Var);
        }
        ff4 ff4Var = new ff4(m, this.n);
        this.q.getClass();
        i61Var.u(ff4Var, this, 3);
        return true;
    }

    @Override // defpackage.da4
    public final long q() {
        return this.y ? Long.MIN_VALUE : 0L;
    }

    @Override // defpackage.hd2
    public final dd2 s(jd2 jd2Var, long j, long j2, IOException iOException, int i) {
        long min;
        IOException iOException2;
        dd2 dd2Var;
        ff4 ff4Var = (ff4) jd2Var;
        yl4 yl4Var = ff4Var.b;
        ed2 ed2Var = new ed2(ff4Var.a, yl4Var.p, yl4Var.q, j, j2, yl4Var.o);
        String str = f35.a;
        this.q.getClass();
        for (Throwable th = iOException; th != null; th = th.getCause()) {
            if ((th instanceof ParserException) || (th instanceof FileNotFoundException) || (th instanceof HttpDataSource$CleartextNotPermittedException) || (th instanceof Loader$UnexpectedLoaderException) || ((th instanceof DataSourceException) && ((DataSourceException) th).n == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i - 1) * 1000, SmartSession.MAX_SONGS);
        boolean z = min == -9223372036854775807L || i >= 3;
        if (this.x && z) {
            iOException2 = iOException;
            l93.r0("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException2);
            this.y = true;
            dd2Var = i61.s;
        } else {
            iOException2 = iOException;
            dd2Var = min != -9223372036854775807L ? new dd2(0, min, false) : i61.t;
        }
        int i2 = dd2Var.a;
        this.r.s(ed2Var, 1, -1, this.w, 0, null, 0L, this.u, iOException2, !(i2 == 0 || i2 == 1));
        return dd2Var;
    }

    @Override // defpackage.no2
    public final void h() {
    }

    @Override // defpackage.da4
    public final void u(long j) {
    }

    @Override // defpackage.no2
    public final long e(long j, n84 n84Var) {
        return j;
    }

    @Override // defpackage.no2
    public final void k(boolean z, long j) {
    }
}
