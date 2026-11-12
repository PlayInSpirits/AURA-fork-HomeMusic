package defpackage;

import android.os.SystemClock;
import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l55 {
    public final gp3 a;
    public final e55 b;
    public final pu c = new pu();
    public final tu d = new tu();
    public final tu e = new tu();
    public final uu f;
    public final f55 g;
    public long h;
    public long i;
    public long j;
    public s55 k;
    public long l;

    public l55(gp3 gp3Var, e55 e55Var, f55 f55Var) {
        this.a = gp3Var;
        this.b = e55Var;
        this.g = f55Var;
        uu uuVar = new uu();
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        uuVar.n = 0;
        uuVar.o = -1;
        uuVar.p = 0;
        uuVar.r = new long[iHighestOneBit];
        uuVar.q = iHighestOneBit - 1;
        this.f = uuVar;
        this.h = -9223372036854775807L;
        this.k = s55.d;
        this.i = -9223372036854775807L;
        this.j = -9223372036854775807L;
    }

    public final void a(long j, long j2) {
        final gp3 gp3Var = this.a;
        tn0 tn0Var = (tn0) gp3Var.p;
        while (true) {
            uu uuVar = this.f;
            int i = uuVar.p;
            if (i == 0) {
                return;
            }
            if (i == 0) {
                tb4.k();
                return;
            }
            long j3 = ((long[]) uuVar.r)[uuVar.n];
            Long l = (Long) this.e.f(j3);
            e55 e55Var = this.b;
            if (l != null && l.longValue() != this.l) {
                this.l = l.longValue();
                e55Var.e(2);
            }
            long j4 = this.l;
            e55 e55Var2 = this.b;
            pu puVar = this.c;
            int iA = e55Var2.a(j3, j, j2, j4, false, false, puVar);
            if (iA != 5 && iA != 4) {
                this.g.a(j3, puVar.a);
            }
            final int i2 = 0;
            final int i3 = 1;
            if (iA == 0 || iA == 1) {
                this.i = j3;
                boolean z = iA == 0;
                long jA = uuVar.a();
                s55 s55Var = (s55) this.d.f(jA);
                if (s55Var != null && !s55Var.equals(s55.d) && !s55Var.equals(this.k)) {
                    this.k = s55Var;
                    sb1 sb1Var = new sb1();
                    sb1Var.t = s55Var.a;
                    sb1Var.u = s55Var.b;
                    sb1Var.m = lw2.m("video/raw");
                    gp3Var.o = new tb1(sb1Var);
                    tn0Var.i.execute(new k6(21, gp3Var, s55Var));
                }
                long jNanoTime = z ? System.nanoTime() : puVar.b;
                i3 = e55Var.e == 3 ? 0 : 1;
                e55Var.e = 3;
                e55Var.l.getClass();
                e55Var.g = f35.Q(SystemClock.elapsedRealtime());
                if (i3 != 0 && tn0Var.e != null) {
                    tn0Var.i.execute(new Runnable() { // from class: sn0
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = i2;
                            gp3 gp3Var2 = gp3Var;
                            switch (i4) {
                                case 0:
                                    ((tn0) gp3Var2.p).h.b();
                                    break;
                                default:
                                    ((tn0) gp3Var2.p).h.c();
                                    break;
                            }
                        }
                    });
                }
                tb1 tb1Var = (tb1) gp3Var.o;
                tn0Var.j.d(jA, jNanoTime, tb1Var == null ? new tb1(new sb1()) : tb1Var, null);
                lk2 lk2Var = (lk2) tn0Var.d.remove();
                lk2Var.c.N0(lk2Var.a, lk2Var.b, jNanoTime);
            } else if (iA == 2 || iA == 3) {
                this.i = j3;
                uuVar.a();
                tn0Var.i.execute(new Runnable() { // from class: sn0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i4 = i3;
                        gp3 gp3Var2 = gp3Var;
                        switch (i4) {
                            case 0:
                                ((tn0) gp3Var2.p).h.b();
                                break;
                            default:
                                ((tn0) gp3Var2.p).h.c();
                                break;
                        }
                    }
                });
                lk2 lk2Var2 = (lk2) tn0Var.d.remove();
                ok2 ok2Var = lk2Var2.c;
                ak2 ak2Var = lk2Var2.a;
                int i4 = lk2Var2.b;
                Trace.beginSection("dropVideoBuffer");
                ak2Var.g(i4);
                Trace.endSection();
                ok2Var.S0(0, 1);
            } else {
                if (iA != 4) {
                    if (iA == 5) {
                        return;
                    }
                    kf2.o(String.valueOf(iA));
                    return;
                }
                this.i = j3;
            }
        }
    }
}
