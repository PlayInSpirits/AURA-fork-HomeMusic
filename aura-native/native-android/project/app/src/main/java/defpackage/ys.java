package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ys extends hd3 {
    public final cc e;
    public final long f;
    public int g = 1;
    public final long h;
    public float i;
    public dt j;

    public ys(cc ccVar, long j) {
        int i;
        this.e = ccVar;
        this.f = j;
        int i2 = (int) (j >> 32);
        if (i2 < 0 || (i = (int) (4294967295L & j)) < 0 || i2 > ccVar.a.getWidth() || i > ccVar.a.getHeight()) {
            kf2.n("Failed requirement.");
            throw null;
        }
        this.h = j;
        this.i = 1.0f;
    }

    @Override // defpackage.hd3
    public final void a(float f) {
        this.i = f;
    }

    @Override // defpackage.hd3
    public final void b(dt dtVar) {
        this.j = dtVar;
    }

    @Override // defpackage.hd3
    public final long d() {
        return l93.o0(this.h);
    }

    @Override // defpackage.hd3
    public final void e(e72 e72Var) {
        mz mzVar = e72Var.n;
        sv0.p(e72Var, this.e, this.f, (((long) Math.round(Float.intBitsToFloat((int) (mzVar.P() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (mzVar.P() & 4294967295L)))) & 4294967295L), this.i, this.j, this.g, 328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys)) {
            return false;
        }
        ys ysVar = (ys) obj;
        return h12.c(this.e, ysVar.e) && g02.a(0L, 0L) && n02.a(this.f, ysVar.f) && this.g == ysVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + xa3.b(xa3.b(this.e.hashCode() * 31, 31, 0L), 31, this.f);
    }

    public final String toString() {
        String str;
        String strD = g02.d(0L);
        String strB = n02.b(this.f);
        int i = this.g;
        if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Low";
        } else if (i == 2) {
            str = "Medium";
        } else {
            str = i == 3 ? "High" : "Unknown";
        }
        return "BitmapPainter(image=" + this.e + ", srcOffset=" + strD + ", srcSize=" + strB + ", filterQuality=" + str + ")";
    }
}
