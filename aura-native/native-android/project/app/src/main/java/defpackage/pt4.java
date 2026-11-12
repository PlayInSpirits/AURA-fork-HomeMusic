package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pt4 {
    public final i03 a;
    public ot4 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public float[] g;

    public pt4() {
        i03 i03Var = f02.a;
        this.a = new i03();
        this.c = -1L;
        this.d = 0L;
        this.e = 0L;
    }

    public final void a(ot4 ot4Var, long j, long j2, float[] fArr, long j3) throws Exception {
        long j4 = ot4Var.g;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            ot4Var.g = j3;
            ot4Var.a(ot4Var.e, ot4Var.f, j, j2, fArr);
        }
    }

    public final boolean b(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (g02.a(j2, this.d)) {
            z = false;
        } else {
            this.d = j2;
            z = true;
        }
        if (!g02.a(j, this.e)) {
            this.e = j;
            z = true;
        }
        if (fArr != null) {
            this.g = fArr;
            z = true;
        }
        long j3 = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (j3 == this.f) {
            return z;
        }
        this.f = j3;
        return true;
    }
}
