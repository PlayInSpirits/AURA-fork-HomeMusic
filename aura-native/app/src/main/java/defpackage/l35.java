package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class l35 implements q84 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final int e;

    public l35(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j3;
        this.e = i;
    }

    @Override // defpackage.q84
    public final long a() {
        return this.d;
    }

    @Override // defpackage.m84
    public final boolean b() {
        return true;
    }

    @Override // defpackage.q84
    public final long c(long j) {
        return this.a[f35.f(this.b, j, true)];
    }

    @Override // defpackage.m84
    public final l84 e(long j) {
        long[] jArr = this.a;
        int f = f35.f(jArr, j, true);
        long j2 = jArr[f];
        long[] jArr2 = this.b;
        o84 o84Var = new o84(j2, jArr2[f]);
        if (j2 >= j || f == jArr.length - 1) {
            return new l84(o84Var, o84Var);
        }
        int i = f + 1;
        return new l84(o84Var, new o84(jArr[i], jArr2[i]));
    }

    @Override // defpackage.q84
    public final int f() {
        return this.e;
    }

    @Override // defpackage.m84
    public final long g() {
        return this.c;
    }
}
