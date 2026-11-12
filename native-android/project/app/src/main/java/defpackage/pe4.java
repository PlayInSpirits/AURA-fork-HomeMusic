package defpackage;

import android.os.SystemClock;
import androidx.media3.common.PlaybackException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pe4 {
    public final int A;
    public final int B;
    public final int C;
    public final ne4 D;
    public final xm E;
    public final xm F;
    public final xm G;
    public final xm H;
    public final boolean I;
    public final int J;
    public final long K;
    public final boolean L;
    public final mi3 a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final PlaybackException f;
    public final int g;
    public final boolean h;
    public final long i;
    public final long j;
    public final long k;
    public final qh3 l;
    public final cw4 m;
    public final il n;
    public final float o;
    public final float p;
    public final s55 q;
    public final jg0 r;
    public final hp0 s;
    public final int t;
    public final pf4 u;
    public final qv2 v;
    public final cu4 w;
    public final jw4 x;
    public final do2 y;
    public final do2 z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [iw4] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    public pe4(oe4 oe4Var) {
        int i;
        jw4 jw4Var = oe4Var.y;
        do2 do2Var = oe4Var.z;
        boolean z = false;
        if (oe4Var.x.p()) {
            int i2 = oe4Var.d;
            rr2.k("Empty playlist only allowed in STATE_IDLE or STATE_ENDED", i2 == 1 || i2 == 4);
            rr2.k("Ads not allowed if playlist is empty", oe4Var.C == -1 && oe4Var.D == -1);
            jw4Var = jw4Var == null ? jw4.b : jw4Var;
            if (do2Var == null) {
                do2Var = do2.K;
            }
        } else {
            int i3 = oe4Var.B;
            if (i3 == -1) {
                i = 0;
            } else {
                rr2.k("currentMediaItemIndex must be less than playlist.size()", i3 < oe4Var.x.o());
                i = i3;
            }
            if (oe4Var.C != -1) {
                zt4 zt4Var = new zt4();
                bu4 bu4Var = new bu4();
                Long l = oe4Var.E;
                long jLongValue = l != null ? l.longValue() : oe4Var.F.get();
                cu4 cu4Var = oe4Var.x;
                oe4Var.x.f(cu4Var.b(cu4Var.i(bu4Var, zt4Var, i, f35.Q(jLongValue)).first), zt4Var, false);
                rr2.k("PeriodData has less ad groups than adGroupIndex", oe4Var.C < zt4Var.g.a);
                int i4 = zt4Var.g.a(oe4Var.C).b;
                if (i4 != -1) {
                    rr2.k("Ad group has less ads than adIndexInGroupIndex", oe4Var.D < i4);
                }
            }
            yw1 yw1Var = oe4Var.w;
            if (yw1Var != null) {
                he4 he4Var = (he4) yw1Var.get(i);
                jw4 jw4Var2 = he4Var.b;
                do2Var = he4Var.d;
                jw4Var = jw4Var2;
            }
            if (do2Var == null) {
                gn2 gn2Var = oe4Var.x.m(i, new bu4(), 0L).b;
                jw4Var.getClass();
                co2 co2Var = new co2();
                yw1 yw1Var2 = jw4Var.a;
                int size = yw1Var2.size();
                int i5 = 0;
                while (i5 < size) {
                    ?? r12 = (iw4) yw1Var2.get(i5);
                    for (?? r13 = z; r13 < r12.a; r13++) {
                        if (r12.e[r13]) {
                            tb1 tb1VarA = r12.a(r13);
                            if (tb1VarA.l != null) {
                                ?? r15 = z;
                                while (true) {
                                    pv2[] pv2VarArr = tb1VarA.l.a;
                                    if (r15 < pv2VarArr.length) {
                                        pv2VarArr[r15].b(co2Var);
                                        r15++;
                                    }
                                }
                            }
                        }
                        z = false;
                    }
                    i5++;
                    z = false;
                }
                co2Var.b(gn2Var.d);
                do2Var = new do2(co2Var);
                z = true;
            } else {
                z = false;
            }
        }
        if (oe4Var.f != null) {
            rr2.k("Player error only allowed in STATE_IDLE", oe4Var.d == 1);
        }
        int i6 = oe4Var.d;
        ne4 xmVar = oe4Var.F;
        Long l2 = oe4Var.E;
        if (l2 != null) {
            if (oe4Var.C == -1 && oe4Var.b && oe4Var.d == 3 && oe4Var.e == 0 && l2.longValue() != -9223372036854775807L) {
                final long jLongValue2 = oe4Var.E.longValue();
                final float f = oe4Var.l.a;
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                xmVar = new ne4() { // from class: me4
                    @Override // defpackage.ne4
                    public final long get() {
                        return jLongValue2 + ((long) ((SystemClock.elapsedRealtime() - jElapsedRealtime) * f));
                    }
                };
            } else {
                xmVar = new xm(oe4Var.E.longValue());
            }
        }
        xm xmVar2 = oe4Var.G;
        this.a = oe4Var.a;
        this.b = oe4Var.b;
        this.c = oe4Var.c;
        this.d = oe4Var.d;
        this.e = oe4Var.e;
        this.f = oe4Var.f;
        this.g = oe4Var.g;
        this.h = oe4Var.h;
        this.i = oe4Var.i;
        this.j = oe4Var.j;
        this.k = oe4Var.k;
        this.l = oe4Var.l;
        this.m = oe4Var.m;
        this.n = oe4Var.n;
        this.o = oe4Var.o;
        this.p = oe4Var.p;
        this.q = oe4Var.q;
        this.r = oe4Var.r;
        this.s = oe4Var.s;
        this.t = oe4Var.t;
        this.u = oe4Var.u;
        this.v = oe4Var.v;
        this.w = oe4Var.x;
        jw4Var.getClass();
        this.x = jw4Var;
        this.y = do2Var;
        this.z = oe4Var.A;
        this.A = oe4Var.B;
        this.B = oe4Var.C;
        this.C = oe4Var.D;
        this.D = xmVar;
        this.E = xmVar2;
        this.F = oe4Var.H;
        this.G = oe4Var.I;
        this.H = oe4Var.J;
        this.I = oe4Var.K;
        this.J = oe4Var.L;
        this.K = oe4Var.M;
        this.L = z;
    }

    public final oe4 a() {
        oe4 oe4Var = new oe4();
        oe4Var.a = this.a;
        oe4Var.b = this.b;
        oe4Var.c = this.c;
        oe4Var.d = this.d;
        oe4Var.e = this.e;
        oe4Var.f = this.f;
        oe4Var.g = this.g;
        oe4Var.h = this.h;
        oe4Var.i = this.i;
        oe4Var.j = this.j;
        oe4Var.k = this.k;
        oe4Var.l = this.l;
        oe4Var.m = this.m;
        oe4Var.n = this.n;
        oe4Var.o = this.o;
        oe4Var.p = this.p;
        oe4Var.q = this.q;
        oe4Var.r = this.r;
        oe4Var.s = this.s;
        oe4Var.t = this.t;
        oe4Var.u = this.u;
        oe4Var.v = this.v;
        cu4 cu4Var = this.w;
        oe4Var.x = cu4Var;
        if (cu4Var instanceof le4) {
            oe4Var.w = ((le4) cu4Var).e;
        } else {
            oe4Var.y = this.x;
            oe4Var.z = this.L ? null : this.y;
        }
        oe4Var.A = this.z;
        oe4Var.B = this.A;
        oe4Var.C = this.B;
        oe4Var.D = this.C;
        oe4Var.E = null;
        oe4Var.F = this.D;
        oe4Var.G = this.E;
        oe4Var.H = this.F;
        oe4Var.I = this.G;
        oe4Var.J = this.H;
        oe4Var.K = this.I;
        oe4Var.L = this.J;
        oe4Var.M = this.K;
        return oe4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pe4) {
            pe4 pe4Var = (pe4) obj;
            if (this.b == pe4Var.b && this.c == pe4Var.c && this.a.equals(pe4Var.a) && this.d == pe4Var.d && this.e == pe4Var.e && this.f == pe4Var.f && this.g == pe4Var.g && this.h == pe4Var.h && this.i == pe4Var.i && this.j == pe4Var.j && this.k == pe4Var.k && this.l.equals(pe4Var.l) && this.m.equals(pe4Var.m) && this.n.equals(pe4Var.n) && this.o == pe4Var.o && this.p == pe4Var.p && this.q.equals(pe4Var.q) && this.r.equals(pe4Var.r) && this.s.equals(pe4Var.s) && this.t == pe4Var.t && this.u.equals(pe4Var.u) && this.v.equals(pe4Var.v) && this.w.equals(pe4Var.w) && this.x.equals(pe4Var.x) && this.y.equals(pe4Var.y) && this.z.equals(pe4Var.z) && this.A == pe4Var.A && this.B == pe4Var.B && this.C == pe4Var.C && this.D.equals(pe4Var.D) && this.E.equals(pe4Var.E) && this.F.equals(pe4Var.F) && this.G.equals(pe4Var.G) && this.H.equals(pe4Var.H) && this.I == pe4Var.I && this.J == pe4Var.J && this.K == pe4Var.K) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.a.hashCode() + 217) * 31) + (this.b ? 1 : 0)) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31;
        PlaybackException playbackException = this.f;
        int iHashCode2 = (((((iHashCode + (playbackException == null ? 0 : playbackException.hashCode())) * 31) + this.g) * 31) + (this.h ? 1 : 0)) * 961;
        long j = this.i;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.j;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.k;
        int iHashCode3 = (((((this.H.hashCode() + ((this.G.hashCode() + ((this.F.hashCode() + ((this.E.hashCode() + ((this.D.hashCode() + ((((((((this.z.hashCode() + ((this.y.hashCode() + ((this.x.a.hashCode() + ((this.w.hashCode() + ((this.v.hashCode() + ((this.u.hashCode() + ((((this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + ((Float.floatToRawIntBits(this.p) + ((Float.floatToRawIntBits(this.o) + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + this.t) * 961)) * 961)) * 31)) * 31)) * 31)) * 31)) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + (this.I ? 1 : 0)) * 31) + this.J) * 31;
        long j4 = this.K;
        return iHashCode3 + ((int) ((j4 >>> 32) ^ j4));
    }
}
