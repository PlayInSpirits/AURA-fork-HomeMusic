package defpackage;

import android.net.Uri;
import android.os.Looper;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zm1 extends bq {
    public final xk0 h;
    public final zh0 i;
    public final i80 j;
    public final ww0 k;
    public final i80 l;
    public final boolean m;
    public final int n;
    public final al0 o;
    public final long p;
    public an2 q;
    public rw4 r;
    public gn2 s;

    static {
        hn2.a("media3.exoplayer.hls");
    }

    public zm1(gn2 gn2Var, zh0 zh0Var, xk0 xk0Var, i80 i80Var, ww0 ww0Var, i80 i80Var2, al0 al0Var, long j, boolean z, int i) {
        this.s = gn2Var;
        this.q = gn2Var.c;
        this.i = zh0Var;
        this.h = xk0Var;
        this.j = i80Var;
        this.k = ww0Var;
        this.l = i80Var2;
        this.o = al0Var;
        this.p = j;
        this.m = z;
        this.n = i;
    }

    public static tm1 t(long j, List list) {
        tm1 tm1Var = null;
        for (int i = 0; i < list.size(); i++) {
            tm1 tm1Var2 = (tm1) list.get(i);
            long j2 = tm1Var2.r;
            if (j2 > j || !tm1Var2.y) {
                if (j2 > j) {
                    break;
                }
            } else {
                tm1Var = tm1Var2;
            }
        }
        return tm1Var;
    }

    @Override // defpackage.bq
    public final boolean a(gn2 gn2Var) {
        gn2 gn2VarH = h();
        bn2 bn2Var = gn2VarH.b;
        bn2Var.getClass();
        bn2 bn2Var2 = gn2Var.b;
        return bn2Var2 != null && bn2Var2.a.equals(bn2Var.a) && bn2Var2.e.equals(bn2Var.e) && Objects.equals(bn2Var2.c, bn2Var.c) && gn2VarH.c.equals(gn2Var.c);
    }

    @Override // defpackage.bq
    public final no2 b(mt2 mt2Var, n9 n9Var, long j) {
        ue1 ue1Var = new ue1((CopyOnWriteArrayList) this.c.q, 0, mt2Var, 8);
        sw0 sw0Var = new sw0(this.d.c, 0, mt2Var);
        rw4 rw4Var = this.r;
        ik3 ik3Var = this.g;
        ik3Var.getClass();
        return new pm1(this.h, this.o, this.i, rw4Var, this.k, sw0Var, this.l, ue1Var, n9Var, this.j, this.m, this.n, ik3Var);
    }

    @Override // defpackage.bq
    public final synchronized gn2 h() {
        return this.s;
    }

    @Override // defpackage.bq
    public final void j() throws IOException {
        al0 al0Var = this.o;
        i61 i61Var = al0Var.t;
        if (i61Var != null) {
            IOException iOException = (IOException) i61Var.q;
            if (iOException != null) {
                throw iOException;
            }
            id2 id2Var = (id2) i61Var.p;
            if (id2Var != null) {
                int i = id2Var.n;
                IOException iOException2 = id2Var.r;
                if (iOException2 != null && id2Var.s > i) {
                    throw iOException2;
                }
            }
        }
        Uri uri = al0Var.x;
        if (uri != null) {
            zk0 zk0Var = (zk0) al0Var.q.get(uri);
            i61 i61Var2 = zk0Var.o;
            IOException iOException3 = (IOException) i61Var2.q;
            if (iOException3 != null) {
                throw iOException3;
            }
            id2 id2Var2 = (id2) i61Var2.p;
            if (id2Var2 != null) {
                int i2 = id2Var2.n;
                IOException iOException4 = id2Var2.r;
                if (iOException4 != null && id2Var2.s > i2) {
                    throw iOException4;
                }
            }
            IOException iOException5 = zk0Var.w;
            if (iOException5 != null) {
                throw iOException5;
            }
        }
    }

    @Override // defpackage.bq
    public final void l(rw4 rw4Var) {
        this.r = rw4Var;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        ik3 ik3Var = this.g;
        ik3Var.getClass();
        ww0 ww0Var = this.k;
        ww0Var.e(looperMyLooper, ik3Var);
        ww0Var.b();
        ue1 ue1Var = new ue1((CopyOnWriteArrayList) this.c.q, 0, (Object) null, 8);
        bn2 bn2Var = h().b;
        bn2Var.getClass();
        Uri uri = bn2Var.a;
        al0 al0Var = this.o;
        al0Var.getClass();
        al0Var.u = f35.p(null);
        al0Var.s = ue1Var;
        al0Var.v = this;
        Map map = Collections.EMPTY_MAP;
        rr2.s(uri, "The uri must be set.");
        de3 de3Var = new de3(((bi0) al0Var.n.o).m(), new ii0(uri, 0L, 1, null, map, 0L, -1L, null, 1), al0Var.o.g());
        rr2.w(al0Var.t == null);
        i61 i61Var = new i61("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        al0Var.t = i61Var;
        i61Var.u(de3Var, al0Var, al0Var.p.D(de3Var.c));
    }

    @Override // defpackage.bq
    public final void n(no2 no2Var) {
        pm1 pm1Var = (pm1) no2Var;
        pm1Var.o.r.remove(pm1Var);
        for (ln1 ln1Var : pm1Var.G) {
            if (ln1Var.Q) {
                for (kn1 kn1Var : ln1Var.I) {
                    kn1Var.j();
                    pw0 pw0Var = kn1Var.h;
                    if (pw0Var != null) {
                        pw0Var.d(kn1Var.e);
                        kn1Var.h = null;
                        kn1Var.g = null;
                    }
                }
            }
            km1 km1Var = ln1Var.q;
            zk0 zk0Var = (zk0) km1Var.g.q.get(km1Var.e[km1Var.r.l()]);
            if (zk0Var != null) {
                zk0Var.x = false;
            }
            km1Var.n = null;
            ln1Var.w.p(ln1Var);
            ln1Var.E.removeCallbacksAndMessages(null);
            ln1Var.U = true;
            ln1Var.F.clear();
        }
        pm1Var.D = null;
    }

    @Override // defpackage.bq
    public final void p() {
        al0 al0Var = this.o;
        al0Var.x = null;
        al0Var.y = null;
        al0Var.w = null;
        al0Var.A = -9223372036854775807L;
        al0Var.t.p(null);
        al0Var.t = null;
        HashMap map = al0Var.q;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((zk0) it.next()).o.p(null);
        }
        al0Var.u.removeCallbacksAndMessages(null);
        al0Var.u = null;
        map.clear();
        this.k.a();
    }

    @Override // defpackage.bq
    public final synchronized void s(gn2 gn2Var) {
        this.s = gn2Var;
    }

    public final void u(ym1 ym1Var) {
        long j;
        bf4 bf4Var;
        long j2;
        long jQ;
        long j3;
        boolean z = ym1Var.p;
        boolean z2 = ym1Var.g;
        yw1 yw1Var = ym1Var.r;
        long j4 = ym1Var.u;
        long jQ2 = ym1Var.e;
        int i = ym1Var.d;
        long j5 = ym1Var.h;
        long jI0 = z ? f35.i0(j5) : -9223372036854775807L;
        long j6 = (i == 2 || i == 1) ? jI0 : -9223372036854775807L;
        al0 al0Var = this.o;
        al0Var.w.getClass();
        y41 y41Var = new y41(26);
        long j7 = 0;
        if (al0Var.z) {
            xm1 xm1Var = ym1Var.v;
            long j8 = j5 - al0Var.A;
            boolean z3 = ym1Var.o;
            long j9 = z3 ? j8 + j4 : -9223372036854775807L;
            long jQ3 = ym1Var.p ? f35.Q(f35.B(this.p)) - (j5 + j4) : 0L;
            long j10 = this.q.a;
            if (j10 != -9223372036854775807L) {
                jQ = f35.Q(j10);
            } else {
                if (jQ2 != -9223372036854775807L) {
                    j2 = j4 - jQ2;
                } else {
                    j2 = xm1Var.d;
                    if (j2 == -9223372036854775807L || ym1Var.n == -9223372036854775807L) {
                        j2 = xm1Var.c;
                        if (j2 == -9223372036854775807L) {
                            j2 = 3 * ym1Var.m;
                        }
                    }
                }
                jQ = j2 + jQ3;
            }
            long j11 = j4 + jQ3;
            long jK = f35.k(jQ, jQ3, j11);
            an2 an2Var = h().c;
            boolean z4 = an2Var.d == -3.4028235E38f && an2Var.e == -3.4028235E38f && xm1Var.c == -9223372036854775807L && xm1Var.d == -9223372036854775807L;
            zm2 zm2VarA = this.q.a();
            zm2VarA.a = f35.i0(jK);
            zm2VarA.d = z4 ? 1.0f : this.q.d;
            zm2VarA.e = z4 ? 1.0f : this.q.e;
            an2 an2Var2 = new an2(zm2VarA);
            this.q = an2Var2;
            if (jQ2 == -9223372036854775807L) {
                jQ2 = j11 - f35.Q(an2Var2.a);
            }
            if (z2) {
                j7 = jQ2;
            } else {
                tm1 tm1VarT = t(jQ2, ym1Var.s);
                if (tm1VarT != null) {
                    j3 = tm1VarT.r;
                } else if (!yw1Var.isEmpty()) {
                    vm1 vm1Var = (vm1) yw1Var.get(f35.d(yw1Var, Long.valueOf(jQ2), true));
                    tm1 tm1VarT2 = t(jQ2, vm1Var.z);
                    j3 = tm1VarT2 != null ? tm1VarT2.r : vm1Var.r;
                }
                j7 = j3;
            }
            bf4Var = new bf4(j6, jI0, j9, ym1Var.u, j8, j7, true, !z3, i == 2 && ym1Var.f, y41Var, h(), this.q);
        } else {
            if (jQ2 == -9223372036854775807L || yw1Var.isEmpty()) {
                j = 0;
            } else {
                if (!z2 && jQ2 != j4) {
                    jQ2 = ((vm1) yw1Var.get(f35.d(yw1Var, Long.valueOf(jQ2), true))).r;
                }
                j = jQ2;
            }
            long j12 = ym1Var.u;
            bf4Var = new bf4(j6, jI0, j12, j12, 0L, j, true, false, true, y41Var, h(), null);
        }
        m(bf4Var);
    }
}
