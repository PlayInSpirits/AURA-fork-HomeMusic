package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o71 extends ac1 {
    public final long n;
    public final boolean o;
    public long p;

    public o71(ej4 ej4Var, long j, boolean z) {
        super(ej4Var);
        this.n = j;
        this.o = z;
    }

    @Override // defpackage.ac1, defpackage.ej4
    public final long read(tv tvVar, long j) throws IOException {
        tvVar.getClass();
        long j2 = this.p;
        long j3 = this.n;
        if (j2 > j3) {
            j = 0;
        } else if (this.o) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long j5 = super.read(tvVar, j);
        if (j5 != -1) {
            this.p += j5;
        }
        long j6 = this.p;
        if ((j6 >= j3 || j5 != -1) && j6 <= j3) {
            return j5;
        }
        if (j5 > 0 && j6 > j3) {
            long j7 = tvVar.o - (j6 - j3);
            tv tvVar2 = new tv();
            tvVar2.p(tvVar);
            tvVar.L(tvVar2, j7);
            tvVar2.b();
        }
        throw new IOException("expected " + j3 + " bytes but got " + this.p);
    }
}
