package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bf4 extends cu4 {
    public static final Object q = new Object();
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final Object n;
    public final gn2 o;
    public final an2 p;

    static {
        um2 um2Var = new um2();
        xm2 xm2Var = new xm2();
        List list = Collections.EMPTY_LIST;
        gy3 gy3Var = gy3.r;
        zm2 zm2Var = new zm2();
        cn2 cn2Var = cn2.d;
        Uri uri = Uri.EMPTY;
        rr2.w(((Uri) xm2Var.e) == null || ((UUID) xm2Var.d) != null);
        if (uri != null) {
            new bn2(uri, null, ((UUID) xm2Var.d) != null ? new ym2(xm2Var) : null, null, list, null, gy3Var, -9223372036854775807L);
        }
        new wm2(um2Var);
        new an2(zm2Var);
        do2 do2Var = do2.K;
    }

    public bf4(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, y41 y41Var, gn2 gn2Var, an2 an2Var) {
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = j5;
        this.j = j6;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = y41Var;
        gn2Var.getClass();
        this.o = gn2Var;
        this.p = an2Var;
    }

    @Override // defpackage.cu4
    public final int b(Object obj) {
        return q != obj ? -1 : 0;
    }

    @Override // defpackage.cu4
    public final zt4 f(int i, zt4 zt4Var, boolean z) {
        rr2.q(i, 1);
        Object obj = z ? q : null;
        long j = -this.i;
        zt4Var.getClass();
        zt4Var.i(null, obj, 0, this.g, j, z5.f, false);
        return zt4Var;
    }

    @Override // defpackage.cu4
    public final int h() {
        return 1;
    }

    @Override // defpackage.cu4
    public final Object l(int i) {
        rr2.q(i, 1);
        return q;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d A[PHI: r1
  0x002d: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v4 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.cu4
    public final bu4 m(int i, bu4 bu4Var, long j) {
        long j2;
        rr2.q(i, 1);
        long j3 = this.j;
        boolean z = this.l;
        if (!z || this.m || j == 0) {
            j2 = j3;
        } else {
            long j4 = this.h;
            if (j4 != -9223372036854775807L) {
                j3 += j;
                if (j3 <= j4) {
                    j2 = j3;
                }
            }
            j2 = -9223372036854775807L;
        }
        bu4Var.b(bu4.p, this.o, this.n, this.e, this.f, -9223372036854775807L, this.k, z, this.p, j2, this.h, 0, 0, this.i);
        return bu4Var;
    }

    @Override // defpackage.cu4
    public final int o() {
        return 1;
    }
}
