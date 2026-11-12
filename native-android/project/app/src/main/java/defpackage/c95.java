package defpackage;

import androidx.media3.common.ParserException;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c95 implements b95 {
    public final m51 a;
    public final wv4 b;
    public final uu c;
    public final tb1 d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public c95(m51 m51Var, wv4 wv4Var, uu uuVar, String str, int i) throws ParserException {
        this.a = m51Var;
        this.b = wv4Var;
        this.c = uuVar;
        int i2 = uuVar.n;
        int i3 = uuVar.o;
        int i4 = (uuVar.q * i2) / 8;
        int i5 = uuVar.p;
        if (i5 != i4) {
            throw ParserException.a(null, "Expected block size: " + i4 + "; got: " + i5);
        }
        int i6 = i3 * i4;
        int i7 = i6 * 8;
        int iMax = Math.max(i4, i6 / 10);
        this.e = iMax;
        sb1 sb1Var = new sb1();
        sb1Var.l = lw2.m("audio/wav");
        sb1Var.m = lw2.m(str);
        sb1Var.h = i7;
        sb1Var.i = i7;
        sb1Var.n = iMax;
        sb1Var.E = i2;
        sb1Var.F = i3;
        sb1Var.G = i;
        this.d = new tb1(sb1Var);
    }

    @Override // defpackage.b95
    public final void a(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }

    @Override // defpackage.b95
    public final boolean b(l51 l51Var, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
            int iF = this.b.f(l51Var, (int) Math.min(i2 - i, j2), true);
            if (iF == -1) {
                j2 = 0;
            } else {
                this.g += iF;
                j2 -= (long) iF;
            }
        }
        uu uuVar = this.c;
        int i3 = uuVar.p;
        int i4 = this.g / i3;
        if (i4 > 0) {
            long j3 = this.f;
            long j4 = this.h;
            long j5 = uuVar.o;
            String str = f35.a;
            long jA0 = j3 + f35.a0(j4, 1000000L, j5, RoundingMode.DOWN);
            int i5 = i4 * i3;
            int i6 = this.g - i5;
            this.b.a(jA0, 1, i5, i6, null);
            this.h += (long) i4;
            this.g = i6;
        }
        return j2 <= 0;
    }

    @Override // defpackage.b95
    public final void c(int i, long j) {
        e95 e95Var = new e95(this.c, 1, i, j);
        this.a.w(e95Var);
        tb1 tb1Var = this.d;
        wv4 wv4Var = this.b;
        wv4Var.g(tb1Var);
        wv4Var.d(e95Var.e);
    }
}
