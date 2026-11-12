package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class bo implements m84 {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public bo(long j, long j2) {
        this.a = 2;
        this.b = j;
        o84 o84Var = j2 == 0 ? o84.c : new o84(0L, j2);
        this.c = new l84(o84Var, o84Var);
    }

    @Override // defpackage.m84
    public final boolean b() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.m84
    public final l84 e(long j) {
        int i = this.a;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                co coVar = (co) obj;
                l84 l84VarB = coVar.i[0].b(j);
                while (true) {
                    u20[] u20VarArr = coVar.i;
                    if (i2 >= u20VarArr.length) {
                        return l84VarB;
                    }
                    l84 l84VarB2 = u20VarArr[i2].b(j);
                    if (l84VarB2.a.b < l84VarB.a.b) {
                        l84VarB = l84VarB2;
                    }
                    i2++;
                }
                break;
            case 1:
                v71 v71Var = (v71) obj;
                v71Var.k.getClass();
                rm3 rm3Var = v71Var.k;
                long[] jArr = (long[]) rm3Var.n;
                long[] jArr2 = (long[]) rm3Var.o;
                int iF = f35.f(jArr, f35.k((((long) v71Var.e) * j) / 1000000, 0L, v71Var.j - 1), false);
                long j2 = iF == -1 ? 0L : jArr[iF];
                long j3 = iF != -1 ? jArr2[iF] : 0L;
                int i3 = v71Var.e;
                long j4 = (j2 * 1000000) / ((long) i3);
                long j5 = this.b;
                o84 o84Var = new o84(j4, j3 + j5);
                if (j4 == j || iF == jArr.length - 1) {
                    return new l84(o84Var, o84Var);
                }
                int i4 = iF + 1;
                return new l84(o84Var, new o84((jArr[i4] * 1000000) / ((long) i3), j5 + jArr2[i4]));
            default:
                return (l84) obj;
        }
    }

    @Override // defpackage.m84
    public final long g() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return ((v71) this.c).b();
            default:
                return this.b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bo(long j) {
        this(j, 0L);
        this.a = 2;
    }

    public /* synthetic */ bo(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
