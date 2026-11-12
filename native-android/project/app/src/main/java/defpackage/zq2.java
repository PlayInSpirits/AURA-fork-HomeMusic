package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.eddyizm.tempus.homemusic.PlayEvent;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zq2 implements yj2 {
    public long n;
    public long o;
    public boolean p;
    public final Object q;
    public Object r;

    public zq2(qa1 qa1Var) {
        this.q = new Handler(Looper.getMainLooper());
        this.r = qa1Var;
    }

    public void a(long j) {
        oh3 oh3Var;
        if (this.p && (oh3Var = (oh3) this.r) != null) {
            long j2 = oh3Var.g;
            long j3 = j - this.o;
            if (j3 < 0) {
                j3 = 0;
            }
            oh3Var.g = j2 + j3;
        }
        this.o = j;
    }

    public void b(long j, long j2, boolean z) {
        a(j2);
        if (j < 0) {
            j = 0;
        }
        this.n = j;
        this.o = j2;
        this.p = z;
    }

    public void c(String str, Long l, long j, boolean z, String str2) {
        String str3;
        oh3 oh3Var = (oh3) this.r;
        if (oh3Var == null) {
            return;
        }
        long jE = (l == null || !h12.c(str, oh3Var.a)) ? e(j) : l.longValue();
        a(j);
        long j2 = oh3Var.b;
        boolean z2 = z || (j2 > 0 && ((double) jE) >= ((double) j2) * 0.9d);
        if (z && j2 > 0) {
            jE = j2;
        }
        this.r = null;
        this.p = false;
        lc lcVar = (lc) this.q;
        if (str2 == null) {
            str3 = z2 ? PlayEvent.FINISH : PlayEvent.SKIP;
        } else {
            str3 = str2;
        }
        lcVar.d(str3, oh3Var, Long.valueOf(jE), Long.valueOf(j));
    }

    @Override // defpackage.yj2
    public void d(qh3 qh3Var) {
        if (this.p) {
            f(j());
        }
        this.r = qh3Var;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000d  */
    public long e(long j) {
        long j2;
        if (this.p) {
            j2 = j - this.o;
            if (j2 < 0) {
                j2 = 0;
            }
        } else {
            j2 = 0;
        }
        long j3 = this.n + j2;
        oh3 oh3Var = (oh3) this.r;
        long j4 = oh3Var != null ? oh3Var.b : 0L;
        return (j4 <= 0 || j3 <= j4) ? j3 : j4;
    }

    public void f(long j) {
        this.n = j;
        if (this.p) {
            ((vp4) this.q).getClass();
            this.o = SystemClock.elapsedRealtime();
        }
    }

    public void g() {
        if (this.p) {
            return;
        }
        ((vp4) this.q).getClass();
        this.o = SystemClock.elapsedRealtime();
        this.p = true;
    }

    @Override // defpackage.yj2
    public qh3 i() {
        return (qh3) this.r;
    }

    @Override // defpackage.yj2
    public long j() {
        long j = this.n;
        if (!this.p) {
            return j;
        }
        ((vp4) this.q).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.o;
        qh3 qh3Var = (qh3) this.r;
        return (qh3Var.a == 1.0f ? f35.Q(jElapsedRealtime) : jElapsedRealtime * ((long) qh3Var.c)) + j;
    }

    public zq2(vp4 vp4Var) {
        this.q = vp4Var;
        this.r = qh3.d;
    }

    public zq2(lc lcVar) {
        this.q = lcVar;
    }
}
