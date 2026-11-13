package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ru implements l83, g45 {
    public ru() {
        super();
    }

    public long n;
    public long o;
    public Object p;
    public Object q;

    public ru(int i, long j) {
        rr2.w(((m9) this.p) == null);
        this.n = j;
        this.o = j + i;
    }

    @Override // defpackage.g45
    public boolean a() {
        return true;
    }

    @Override // defpackage.l83
    public long b(l51 l51Var) {
        long j = this.o;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.o = -1L;
        return j2;
    }

    public long c(long j) {
        long j2 = this.o;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.n;
        long j5 = j3 / j4;
        return (((hz3) this.q) == hz3.n || j5 % 2 == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
    }

    @Override // defpackage.g45
    public ce d(long j, ce ceVar, ce ceVar2, ce ceVar3) {
        x7 x7Var = (x7) this.p;
        return ((ss0) x7Var.p).d(c(j), ceVar, ceVar2, f(j, ceVar, ceVar3, ceVar2));
    }

    @Override // defpackage.l83
    public m84 e() {
        rr2.w(this.n != -1);
        return new bo((v71) this.p, this.n, 1);
    }

    public ce f(long j, ce ceVar, ce ceVar2, ce ceVar3) {
        long j2 = this.o;
        long j3 = j + j2;
        long j4 = this.n;
        if (j3 <= j4) {
            return ceVar2;
        }
        return ((ss0) ((x7) this.p).p).d(j4 - j2, ceVar, ceVar3, ceVar2);
    }

    @Override // defpackage.l83
    public void g(long j) {
        long[] jArr = (long[]) ((rm3) this.q).n;
        this.o = jArr[f35.f(jArr, j, true)];
    }

    @Override // defpackage.g45
    public ce k(long j, ce ceVar, ce ceVar2, ce ceVar3) {
        x7 x7Var = (x7) this.p;
        return ((ss0) x7Var.p).k(c(j), ceVar, ceVar2, f(j, ceVar, ceVar3, ceVar2));
    }

    @Override // defpackage.g45
    public long m(ce ceVar, ce ceVar2, ce ceVar3) {
        return Long.MAX_VALUE;
    }

    public ru(String str, byte[] bArr, long j, long j2) {
        this.p = str;
        this.q = bArr;
        this.n = j;
        this.o = j2;
    }
}
