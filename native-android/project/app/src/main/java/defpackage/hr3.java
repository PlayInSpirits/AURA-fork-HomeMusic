package defpackage;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import com.eddyizm.tempus.homemusic.SmartSession;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hr3 implements no2, m51, hd2, kd2, o44 {
    public static final Map e0;
    public static final tb1 f0;
    public final z05 A;
    public final q90 B;
    public final ar3 C;
    public final ar3 D;
    public final Handler E;
    public mo2 F;
    public iv1 G;
    public dr3[] H;
    public p44[] I;
    public gr3[] J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public ss0 O;
    public m84 P;
    public long Q;
    public boolean R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public boolean X;
    public long Y;
    public long Z;
    public boolean a0;
    public int b0;
    public boolean c0;
    public boolean d0;
    public final Uri n;
    public final ci0 o;
    public final ww0 p;
    public final i80 q;
    public final ue1 r;
    public final sw0 s;
    public final kr3 t;
    public final n9 u;
    public final String v;
    public final long w;
    public final tb1 x;
    public final long y;
    public final i61 z;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        e0 = Collections.unmodifiableMap(map);
        sb1 sb1Var = new sb1();
        sb1Var.a = "icy";
        sb1Var.m = lw2.m("application/x-icy");
        f0 = new tb1(sb1Var);
    }

    public hr3(Uri uri, ci0 ci0Var, z05 z05Var, ww0 ww0Var, sw0 sw0Var, i80 i80Var, ue1 ue1Var, kr3 kr3Var, n9 n9Var, String str, int i, tb1 tb1Var, long j, ty3 ty3Var) {
        this.n = uri;
        this.o = ci0Var;
        this.p = ww0Var;
        this.s = sw0Var;
        this.q = i80Var;
        this.r = ue1Var;
        this.t = kr3Var;
        this.u = n9Var;
        this.v = str;
        this.w = i;
        this.x = tb1Var;
        this.z = ty3Var != null ? new i61(ty3Var) : new i61("ProgressiveMediaPeriod");
        this.A = z05Var;
        this.y = j;
        this.B = new q90();
        this.C = new ar3(this, 1);
        this.D = new ar3(this, 2);
        this.E = f35.p(null);
        this.J = new gr3[0];
        this.I = new p44[0];
        this.H = new dr3[0];
        this.Z = -9223372036854775807L;
        this.S = 1;
    }

    public final void A() {
        long j = this.y;
        if (this.d0 || this.L || !this.K || this.P == null) {
            return;
        }
        for (p44 p44Var : this.I) {
            if (p44Var.r() == null) {
                return;
            }
        }
        q90 q90Var = this.B;
        synchronized (q90Var) {
            q90Var.b = false;
        }
        int length = this.I.length;
        sv4[] sv4VarArr = new sv4[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            tb1 tb1VarR = this.I[i].r();
            tb1VarR.getClass();
            String str = tb1VarR.n;
            boolean zI = lw2.i(str);
            boolean z = zI || lw2.l(str);
            zArr[i] = z;
            this.M = z | this.M;
            this.N = j != -9223372036854775807L && length == 1 && lw2.j(str);
            iv1 iv1Var = this.G;
            if (iv1Var != null) {
                int i2 = iv1Var.a;
                if (zI || this.J[i].b) {
                    qv2 qv2Var = tb1VarR.l;
                    qv2 qv2Var2 = qv2Var == null ? new qv2(iv1Var) : qv2Var.a(iv1Var);
                    sb1 sb1VarA = tb1VarR.a();
                    sb1VarA.k = qv2Var2;
                    tb1VarR = new tb1(sb1VarA);
                }
                if (zI && tb1VarR.h == -1 && tb1VarR.i == -1 && i2 != -1) {
                    sb1 sb1VarA2 = tb1VarR.a();
                    sb1VarA2.h = i2;
                    tb1VarR = new tb1(sb1VarA2);
                }
            }
            int iF = this.p.f(tb1VarR);
            sb1 sb1VarA3 = tb1VarR.a();
            sb1VarA3.N = iF;
            tb1 tb1Var = new tb1(sb1VarA3);
            sv4VarArr[i] = new sv4(Integer.toString(i), tb1Var);
            this.V = tb1Var.t | this.V;
        }
        tv4 tv4Var = new tv4(sv4VarArr);
        ss0 ss0Var = new ss0();
        ss0Var.n = tv4Var;
        ss0Var.o = zArr;
        int i3 = tv4Var.a;
        ss0Var.p = new boolean[i3];
        ss0Var.q = new boolean[i3];
        this.O = ss0Var;
        if (this.N && this.Q == -9223372036854775807L) {
            this.Q = j;
            this.P = new br3(this, this.P);
        }
        this.t.u(this.Q, this.P, this.R);
        this.L = true;
        mo2 mo2Var = this.F;
        mo2Var.getClass();
        mo2Var.b(this);
    }

    public final void B(int i) {
        v();
        ss0 ss0Var = this.O;
        boolean[] zArr = (boolean[]) ss0Var.q;
        if (zArr[i]) {
            return;
        }
        tb1 tb1Var = ((tv4) ss0Var.n).a(i).d[0];
        un2 un2Var = new un2(1, lw2.h(tb1Var.n), tb1Var, 0, null, f35.i0(this.Y), -9223372036854775807L);
        ue1 ue1Var = this.r;
        ue1Var.i(new bt2(ue1Var, un2Var));
        zArr[i] = true;
    }

    public final void C(int i) {
        v();
        if (this.a0) {
            if ((!this.M || ((boolean[]) this.O.o)[i]) && !this.I[i].s(false)) {
                this.Z = 0L;
                this.a0 = false;
                this.U = true;
                this.Y = 0L;
                this.b0 = 0;
                for (p44 p44Var : this.I) {
                    p44Var.x(false);
                }
                mo2 mo2Var = this.F;
                mo2Var.getClass();
                mo2Var.j(this);
            }
        }
    }

    public final wv4 D(gr3 gr3Var) {
        int length = this.I.length;
        for (int i = 0; i < length; i++) {
            if (gr3Var.equals(this.J[i])) {
                return this.I[i];
            }
        }
        if (this.K) {
            l93.q0("ProgressiveMediaPeriod", "Extractor added new track (id=" + gr3Var.a + ") after finishing tracks.");
            return new tq0();
        }
        ww0 ww0Var = this.p;
        ww0Var.getClass();
        p44 p44Var = new p44(this.u, ww0Var, this.s);
        dr3 dr3Var = new dr3(p44Var);
        p44Var.f = this;
        int i2 = length + 1;
        gr3[] gr3VarArr = (gr3[]) Arrays.copyOf(this.J, i2);
        gr3VarArr[length] = gr3Var;
        this.J = gr3VarArr;
        p44[] p44VarArr = (p44[]) Arrays.copyOf(this.I, i2);
        p44VarArr[length] = p44Var;
        this.I = p44VarArr;
        dr3[] dr3VarArr = (dr3[]) Arrays.copyOf(this.H, i2);
        dr3VarArr[length] = dr3Var;
        this.H = dr3VarArr;
        return dr3Var;
    }

    public final void E(m84 m84Var) {
        this.P = this.G == null ? m84Var : new bo(-9223372036854775807L);
        this.Q = m84Var.g();
        boolean z = !this.X && m84Var.g() == -9223372036854775807L;
        this.R = z;
        this.S = z ? 7 : 1;
        if (this.L) {
            this.t.u(this.Q, m84Var, z);
        } else {
            A();
        }
    }

    public final void F() {
        er3 er3Var = new er3(this, this.n, this.o, this.A, this, this.B);
        if (this.L) {
            rr2.w(z());
            long j = this.Q;
            if (j != -9223372036854775807L && this.Z > j) {
                this.c0 = true;
                this.Z = -9223372036854775807L;
                return;
            }
            m84 m84Var = this.P;
            m84Var.getClass();
            long j2 = m84Var.e(this.Z).a.b;
            long j3 = this.Z;
            er3Var.f.a = j2;
            er3Var.i = j3;
            er3Var.h = true;
            er3Var.l = false;
            for (p44 p44Var : this.I) {
                p44Var.t = this.Z;
            }
            this.Z = -9223372036854775807L;
        }
        this.b0 = x();
        this.z.u(er3Var, this, this.q.D(this.S));
    }

    public final boolean G() {
        return this.U || z();
    }

    @Override // defpackage.kd2
    public final void a() {
        for (p44 p44Var : this.I) {
            p44Var.x(true);
            pw0 pw0Var = p44Var.h;
            if (pw0Var != null) {
                pw0Var.d(p44Var.e);
                p44Var.h = null;
                p44Var.g = null;
            }
        }
        z05 z05Var = this.A;
        k51 k51Var = (k51) z05Var.p;
        if (k51Var != null) {
            k51Var.a();
            z05Var.p = null;
        }
        z05Var.q = null;
    }

    @Override // defpackage.hd2
    public final void b(jd2 jd2Var, long j, long j2, boolean z) {
        er3 er3Var = (er3) jd2Var;
        yl4 yl4Var = er3Var.b;
        ed2 ed2Var = new ed2(er3Var.j, yl4Var.p, yl4Var.q, j, j2, yl4Var.o);
        this.q.getClass();
        this.r.q(ed2Var, 1, -1, null, 0, null, er3Var.i, this.Q);
        if (z) {
            return;
        }
        for (p44 p44Var : this.I) {
            p44Var.x(false);
        }
        if (this.W > 0) {
            mo2 mo2Var = this.F;
            mo2Var.getClass();
            mo2Var.j(this);
        }
    }

    @Override // defpackage.no2
    public final long c(t41[] t41VarArr, boolean[] zArr, q44[] q44VarArr, boolean[] zArr2, long j) {
        t41 t41Var;
        v();
        ss0 ss0Var = this.O;
        tv4 tv4Var = (tv4) ss0Var.n;
        boolean[] zArr3 = (boolean[]) ss0Var.p;
        int i = this.W;
        int i2 = 0;
        for (int i3 = 0; i3 < t41VarArr.length; i3++) {
            q44 q44Var = q44VarArr[i3];
            if (q44Var != null && (t41VarArr[i3] == null || !zArr[i3])) {
                int i4 = ((fr3) q44Var).n;
                rr2.w(zArr3[i4]);
                this.W--;
                zArr3[i4] = false;
                q44VarArr[i3] = null;
            }
        }
        boolean z = !this.T ? j == 0 || this.N : i != 0;
        for (int i5 = 0; i5 < t41VarArr.length; i5++) {
            if (q44VarArr[i5] == null && (t41Var = t41VarArr[i5]) != null) {
                rr2.w(t41Var.length() == 1);
                rr2.w(t41Var.i(0) == 0);
                int iB = tv4Var.b(t41Var.c());
                rr2.w(!zArr3[iB]);
                this.W++;
                zArr3[iB] = true;
                this.V = t41Var.m().t | this.V;
                q44VarArr[i5] = new fr3(this, iB);
                zArr2[i5] = true;
                if (!z) {
                    p44 p44Var = this.I[iB];
                    z = (p44Var.o() == 0 || p44Var.z(true, j)) ? false : true;
                }
            }
        }
        if (this.W == 0) {
            this.a0 = false;
            this.U = false;
            this.V = false;
            i61 i61Var = this.z;
            if (i61Var.l()) {
                p44[] p44VarArr = this.I;
                int length = p44VarArr.length;
                while (i2 < length) {
                    p44VarArr[i2].j();
                    i2++;
                }
                i61Var.d();
            } else {
                this.c0 = false;
                for (p44 p44Var2 : this.I) {
                    p44Var2.x(false);
                }
            }
        } else if (z) {
            j = i(j);
            while (i2 < q44VarArr.length) {
                if (q44VarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.T = true;
        return j;
    }

    @Override // defpackage.da4
    public final long d() {
        return q();
    }

    @Override // defpackage.no2
    public final long e(long j, n84 n84Var) {
        v();
        if (!this.P.b()) {
            return 0L;
        }
        l84 l84VarE = this.P.e(j);
        return n84Var.a(j, l84VarE.a.a, l84VarE.b.a);
    }

    @Override // defpackage.da4
    public final boolean f() {
        boolean z;
        if (!this.z.l()) {
            return false;
        }
        q90 q90Var = this.B;
        synchronized (q90Var) {
            z = q90Var.b;
        }
        return z;
    }

    @Override // defpackage.hd2
    public final void g(jd2 jd2Var, long j, long j2) {
        er3 er3Var = (er3) jd2Var;
        if (this.Q == -9223372036854775807L && this.P != null) {
            long jY = y(true);
            long j3 = jY == Long.MIN_VALUE ? 0L : jY + 10000;
            this.Q = j3;
            this.t.u(j3, this.P, this.R);
        }
        yl4 yl4Var = er3Var.b;
        ed2 ed2Var = new ed2(er3Var.j, yl4Var.p, yl4Var.q, j, j2, yl4Var.o);
        this.q.getClass();
        this.r.r(ed2Var, 1, -1, null, 0, null, er3Var.i, this.Q);
        this.c0 = true;
        mo2 mo2Var = this.F;
        mo2Var.getClass();
        mo2Var.j(this);
    }

    @Override // defpackage.no2
    public final void h() throws IOException {
        int iD = this.q.D(this.S);
        i61 i61Var = this.z;
        IOException iOException = (IOException) i61Var.q;
        if (iOException != null) {
            throw iOException;
        }
        id2 id2Var = (id2) i61Var.p;
        if (id2Var != null) {
            if (iD == Integer.MIN_VALUE) {
                iD = id2Var.n;
            }
            IOException iOException2 = id2Var.r;
            if (iOException2 != null && id2Var.s > iD) {
                throw iOException2;
            }
        }
        if (this.c0 && !this.L) {
            throw ParserException.a(null, "Loading finished before preparation is complete.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x008a  */
    /* JADX WARN: Code duplicated, block: B:43:0x008f A[LOOP:1: B:42:0x008d->B:43:0x008f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x009b  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a4 A[LOOP:2: B:47:0x00a2->B:48:0x00a4, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x008a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x009b, please report this as an issue */
    @Override // defpackage.no2
    public final long i(long j) {
        int i;
        v();
        boolean[] zArr = (boolean[]) this.O.o;
        if (!this.P.b()) {
            j = 0;
        }
        this.U = false;
        boolean z = this.Y == j;
        this.Y = j;
        if (z()) {
            this.Z = j;
            return j;
        }
        int i2 = this.S;
        i61 i61Var = this.z;
        if (i2 == 7 || !(this.c0 || i61Var.l())) {
            this.a0 = false;
            this.Z = j;
            this.c0 = false;
            this.V = false;
            if (i61Var.l()) {
                i61Var.q = null;
                for (p44 p44Var : this.I) {
                    p44Var.x(false);
                }
                break;
            }
            for (p44 p44Var2 : this.I) {
                p44Var2.j();
            }
            i61Var.d();
            return j;
        }
        int length = this.I.length;
        for (int i3 = 0; i3 < length; i3++) {
            p44 p44Var3 = this.I[i3];
            if (this.H[i3].d.get() == cr3.n && (p44Var3.o() != 0 || !z)) {
                if (!(this.N ? p44Var3.y(p44Var3.q) : p44Var3.z(this.c0, j)) && (zArr[i3] || !this.M)) {
                    this.a0 = false;
                    this.Z = j;
                    this.c0 = false;
                    this.V = false;
                    if (i61Var.l()) {
                        i61Var.q = null;
                        while (i < r0) {
                            p44Var.x(false);
                        }
                        break;
                        break;
                    }
                    while (i < r0) {
                        p44Var2.j();
                    }
                    i61Var.d();
                    return j;
                }
            }
        }
        return j;
    }

    @Override // defpackage.hd2
    public final void j(jd2 jd2Var, long j, long j2, int i) {
        er3 er3Var = (er3) jd2Var;
        yl4 yl4Var = er3Var.b;
        this.r.u(i == 0 ? new ed2(j, er3Var.j) : new ed2(er3Var.j, yl4Var.p, yl4Var.q, j, j2, yl4Var.o), 1, -1, null, 0, null, er3Var.i, this.Q, i);
    }

    @Override // defpackage.no2
    public final void k(boolean z, long j) throws Throwable {
        if (this.N) {
            return;
        }
        v();
        if (z()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.O.p;
        int length = this.I.length;
        for (int i = 0; i < length; i++) {
            this.I[i].i(j, z, zArr[i]);
        }
    }

    @Override // defpackage.no2
    public final long l() {
        if (this.V) {
            this.V = false;
            return this.Y;
        }
        if (!this.U) {
            return -9223372036854775807L;
        }
        if (!this.c0 && x() <= this.b0) {
            return -9223372036854775807L;
        }
        this.U = false;
        return this.Y;
    }

    @Override // defpackage.no2
    public final void m(mo2 mo2Var, long j) {
        this.F = mo2Var;
        tb1 tb1Var = this.x;
        if (tb1Var == null) {
            this.B.d();
            F();
        } else {
            t(0, 3).g(tb1Var);
            E(new ux1(-9223372036854775807L, new long[]{0}, new long[]{0}));
            p();
            this.Z = j;
        }
    }

    @Override // defpackage.no2
    public final tv4 n() {
        v();
        return (tv4) this.O.n;
    }

    @Override // defpackage.da4
    public final boolean o(pd2 pd2Var) {
        if (this.c0) {
            return false;
        }
        i61 i61Var = this.z;
        if (((IOException) i61Var.q) != null || this.a0) {
            return false;
        }
        if ((this.L || this.x != null) && this.W == 0) {
            return false;
        }
        boolean zD = this.B.d();
        if (i61Var.l()) {
            return zD;
        }
        F();
        return true;
    }

    @Override // defpackage.m51
    public final void p() {
        this.K = true;
        this.E.post(this.C);
    }

    @Override // defpackage.da4
    public final long q() {
        long jY;
        boolean z;
        long j;
        v();
        if (this.c0 || this.W == 0) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.Z;
        }
        if (this.M) {
            int length = this.I.length;
            jY = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                ss0 ss0Var = this.O;
                if (((boolean[]) ss0Var.o)[i] && ((boolean[]) ss0Var.p)[i]) {
                    p44 p44Var = this.I[i];
                    synchronized (p44Var) {
                        z = p44Var.w;
                    }
                    if (z) {
                        continue;
                    } else {
                        p44 p44Var2 = this.I[i];
                        synchronized (p44Var2) {
                            j = p44Var2.v;
                        }
                        jY = Math.min(jY, j);
                    }
                }
            }
        } else {
            jY = Long.MAX_VALUE;
        }
        if (jY == Long.MAX_VALUE) {
            jY = y(false);
        }
        return jY == Long.MIN_VALUE ? this.Y : jY;
    }

    @Override // defpackage.o44
    public final void r() {
        this.E.post(this.C);
    }

    @Override // defpackage.hd2
    public final dd2 s(jd2 jd2Var, long j, long j2, IOException iOException, int i) {
        long jMin;
        dd2 dd2Var;
        m84 m84Var;
        er3 er3Var = (er3) jd2Var;
        yl4 yl4Var = er3Var.b;
        ed2 ed2Var = new ed2(er3Var.j, yl4Var.p, yl4Var.q, j, j2, yl4Var.o);
        String str = f35.a;
        this.q.getClass();
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i - 1) * 1000, SmartSession.MAX_SONGS);
                break;
            }
            if ((cause instanceof ParserException) || (cause instanceof FileNotFoundException) || (cause instanceof HttpDataSource$CleartextNotPermittedException) || (cause instanceof Loader$UnexpectedLoaderException) || ((cause instanceof DataSourceException) && ((DataSourceException) cause).n == 2008)) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == -9223372036854775807L) {
            dd2Var = i61.t;
        } else {
            int iX = x();
            int i2 = iX > this.b0 ? 1 : 0;
            if (this.X || !((m84Var = this.P) == null || m84Var.g() == -9223372036854775807L)) {
                this.b0 = iX;
            } else if (!this.L || G()) {
                this.U = this.L;
                this.Y = 0L;
                this.b0 = 0;
                for (p44 p44Var : this.I) {
                    p44Var.x(false);
                }
                er3Var.f.a = 0L;
                er3Var.i = 0L;
                er3Var.h = true;
                er3Var.l = false;
            } else {
                this.a0 = true;
                dd2Var = i61.s;
            }
            dd2Var = new dd2(i2, jMin, false);
        }
        int i3 = dd2Var.a;
        this.r.s(ed2Var, 1, -1, null, 0, null, er3Var.i, this.Q, iOException, !(i3 == 0 || i3 == 1));
        return dd2Var;
    }

    @Override // defpackage.m51
    public final wv4 t(int i, int i2) {
        return D(new gr3(i, false));
    }

    @Override // defpackage.da4
    public final void u(long j) {
    }

    public final void v() {
        rr2.w(this.L);
        this.O.getClass();
        this.P.getClass();
    }

    @Override // defpackage.m51
    public final void w(m84 m84Var) {
        this.E.post(new ur2(13, this, m84Var));
    }

    public final int x() {
        int i = 0;
        for (p44 p44Var : this.I) {
            i += p44Var.q + p44Var.p;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final long y(boolean z) {
        p44 p44Var;
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < this.I.length; i++) {
            if (z) {
                p44Var = this.I[i];
                synchronized (p44Var) {
                    jMax = Math.max(jMax, p44Var.v);
                }
            } else {
                ss0 ss0Var = this.O;
                ss0Var.getClass();
                if (((boolean[]) ss0Var.p)[i]) {
                    p44Var = this.I[i];
                    synchronized (p44Var) {
                    }
                    jMax = Math.max(jMax, p44Var.v);
                } else {
                    continue;
                }
            }
        }
        return jMax;
    }

    public final boolean z() {
        return this.Z != -9223372036854775807L;
    }
}
