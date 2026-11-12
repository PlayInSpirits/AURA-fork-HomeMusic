package defpackage;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d40 extends bc1 {
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;

    public d40(cu4 cu4Var, long j, long j2, boolean z) throws ClippingMediaSource$IllegalClippingException {
        super(cu4Var);
        if (j2 != Long.MIN_VALUE && j2 < j) {
            throw new ClippingMediaSource$IllegalClippingException(2, j, j2);
        }
        boolean z2 = false;
        if (cu4Var.h() != 1) {
            throw new ClippingMediaSource$IllegalClippingException(0);
        }
        bu4 bu4VarM = cu4Var.m(0, new bu4(), 0L);
        long jMax = Math.max(0L, j);
        if (!z && !bu4VarM.j && jMax != 0 && !bu4VarM.g) {
            throw new ClippingMediaSource$IllegalClippingException(1);
        }
        long jMax2 = j2 == Long.MIN_VALUE ? bu4VarM.l : Math.max(0L, j2);
        long j3 = bu4VarM.l;
        if (j3 != -9223372036854775807L) {
            jMax2 = jMax2 > j3 ? j3 : jMax2;
            if (jMax > jMax2) {
                jMax = jMax2;
            }
        }
        this.f = jMax;
        this.g = jMax2;
        this.h = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
        if (bu4VarM.h && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
            z2 = true;
        }
        this.i = z2;
    }

    @Override // defpackage.bc1, defpackage.cu4
    public final zt4 f(int i, zt4 zt4Var, boolean z) {
        this.e.f(0, zt4Var, z);
        long j = zt4Var.e - this.f;
        long j2 = this.h;
        zt4Var.i(zt4Var.a, zt4Var.b, 0, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, j, z5.f, false);
        return zt4Var;
    }

    @Override // defpackage.bc1, defpackage.cu4
    public final bu4 m(int i, bu4 bu4Var, long j) {
        this.e.m(0, bu4Var, 0L);
        long j2 = bu4Var.o;
        long j3 = this.f;
        bu4Var.o = j2 + j3;
        bu4Var.l = this.h;
        bu4Var.h = this.i;
        long j4 = bu4Var.k;
        if (j4 != -9223372036854775807L) {
            long jMax = Math.max(j4, j3);
            bu4Var.k = jMax;
            long j5 = this.g;
            if (j5 != -9223372036854775807L) {
                jMax = Math.min(jMax, j5);
            }
            bu4Var.k = jMax - j3;
        }
        long jI0 = f35.i0(j3);
        long j6 = bu4Var.d;
        if (j6 != -9223372036854775807L) {
            bu4Var.d = j6 + jI0;
        }
        long j7 = bu4Var.e;
        if (j7 != -9223372036854775807L) {
            bu4Var.e = j7 + jI0;
        }
        return bu4Var;
    }
}
