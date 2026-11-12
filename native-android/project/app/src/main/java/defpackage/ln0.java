package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ln0 extends nn0 implements Comparable {
    public final boolean A;
    public final int r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public ln0(int i, sv4 sv4Var, int i2, jn0 jn0Var, int i3, String str, String str2) {
        int iC;
        super(i, sv4Var, i2);
        int i4 = 0;
        this.s = kq.n(i3, false);
        int i5 = this.q.e;
        int i6 = jn0Var.C;
        yw1 yw1Var = jn0Var.y;
        int i7 = i5 & (~i6);
        this.t = (i7 & 1) != 0;
        this.u = (i7 & 2) != 0;
        yw1 yw1VarO = str2 != null ? yw1.o(str2) : yw1Var.isEmpty() ? yw1.o("") : yw1Var;
        int i8 = 0;
        while (true) {
            if (i8 >= yw1VarO.size()) {
                iC = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iC = pn0.c(this.q, (String) yw1VarO.get(i8), jn0Var.D);
                if (iC > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.v = i8;
        this.w = iC;
        int i9 = str2 != null ? 1088 : jn0Var.A;
        int i10 = this.q.f;
        gb3 gb3Var = pn0.k;
        int iBitCount = (i10 == 0 || i10 != i9) ? Integer.bitCount(i9 & i10) : Integer.MAX_VALUE;
        this.x = iBitCount;
        tb1 tb1Var = this.q;
        this.A = (1088 & tb1Var.f) != 0;
        int iA = pn0.a(tb1Var, jn0Var.z);
        this.y = iA;
        int iC2 = pn0.c(this.q, str, pn0.f(str) == null);
        this.z = iC2;
        boolean z = iC > 0 || (yw1Var.isEmpty() && iBitCount > 0) || ((yw1Var.isEmpty() && iA != Integer.MAX_VALUE) || this.t || ((this.u && iC2 > 0) || jn0Var.x));
        if (kq.n(i3, jn0Var.B0) && z) {
            i4 = 1;
        }
        this.r = i4;
    }

    @Override // defpackage.nn0
    public final int a() {
        return this.r;
    }

    @Override // defpackage.nn0
    public final /* bridge */ /* synthetic */ boolean b(nn0 nn0Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ln0 ln0Var) {
        v60 v60VarC = v60.a.c(this.s, ln0Var.s);
        Integer numValueOf = Integer.valueOf(this.v);
        Integer numValueOf2 = Integer.valueOf(ln0Var.v);
        x13 x13Var = x13.o;
        x13 x13Var2 = x13.p;
        v60 v60VarB = v60VarC.b(numValueOf, numValueOf2, x13Var2);
        int i = ln0Var.w;
        int i2 = this.w;
        v60 v60VarA = v60VarB.a(i2, i);
        int i3 = ln0Var.x;
        int i4 = this.x;
        v60 v60VarC2 = v60VarA.a(i4, i3).b(Integer.valueOf(this.y), Integer.valueOf(ln0Var.y), x13Var2).c(this.t, ln0Var.t);
        Boolean boolValueOf = Boolean.valueOf(this.u);
        Boolean boolValueOf2 = Boolean.valueOf(ln0Var.u);
        if (i2 != 0) {
            x13Var = x13Var2;
        }
        v60 v60VarA2 = v60VarC2.b(boolValueOf, boolValueOf2, x13Var).a(this.z, ln0Var.z);
        if (i4 == 0) {
            v60VarA2 = v60VarA2.d(this.A, ln0Var.A);
        }
        return v60VarA2.e();
    }
}
