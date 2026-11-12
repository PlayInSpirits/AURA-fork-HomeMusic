package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rd3 {
    public String a;
    public zs4 b;
    public ha1 c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public oo0 i;
    public ic j;
    public boolean k;
    public mw2 m;
    public qd3 n;
    public r62 o;
    public long q;
    public long h = gz1.a;
    public long l = 0;
    public long p = qc0.g(0, 0, 0, 0);

    public rd3(String str, zs4 zs4Var, ha1 ha1Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = zs4Var;
        this.c = ha1Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public final boolean a(long j, r62 r62Var) {
        long jA;
        qd3 qd3Var;
        int i;
        float f;
        int i2;
        this.q = (this.q << 2) | 3;
        boolean z = false;
        if (this.g > 1) {
            zs4 zs4Var = this.b;
            mw2 mw2Var = this.m;
            oo0 oo0Var = this.i;
            oo0Var.getClass();
            mw2 mw2VarT = j51.t(mw2Var, r62Var, zs4Var, oo0Var, this.c);
            this.m = mw2VarT;
            int i3 = this.g;
            ro0 ro0Var = mw2VarT.c;
            float f2 = mw2VarT.g;
            float f3 = mw2VarT.f;
            if (Float.isNaN(f2) || Float.isNaN(f3)) {
                String str = nw2.a;
                zs4 zs4Var2 = mw2VarT.e;
                ha1 ha1Var = mw2VarT.d;
                u01 u01Var = u01.n;
                ic icVar = new ic(new mc(str, zs4Var2, u01Var, u01Var, ha1Var, ro0Var, false), 1, 1, qc0.b(0, 0, 15));
                i = 1;
                float f4 = new ic(new mc(nw2.b, mw2VarT.e, u01Var, u01Var, mw2VarT.d, ro0Var, true), 2, 1, qc0.b(0, 0, 15)).f;
                f = icVar.f;
                f3 = f4 - f;
                mw2VarT.g = f;
                mw2VarT.f = f3;
            } else {
                f = f2;
                i = 1;
            }
            if (i3 != i) {
                i2 = Math.round((f3 * (i3 - i)) + f);
                if (i2 < 0) {
                    i2 = 0;
                }
                int iG = nc0.g(j);
                if (i2 > iG) {
                    i2 = iG;
                }
            } else {
                i2 = nc0.i(j);
            }
            jA = qc0.a(nc0.j(j), nc0.h(j), i2, nc0.g(j));
        } else {
            jA = j;
        }
        ic icVar2 = this.j;
        if (icVar2 != null && (qd3Var = this.n) != null && !qd3Var.a() && r62Var == this.o && (nc0.b(jA, this.p) || (nc0.h(jA) == nc0.h(this.p) && nc0.j(jA) == nc0.j(this.p) && nc0.g(jA) >= icVar2.f && !icVar2.d.d))) {
            if (!nc0.b(jA, this.p)) {
                ic icVar3 = this.j;
                icVar3.getClass();
                long jD = qc0.d(jA, (((long) ji2.g(Math.min(icVar3.a.v.c(), icVar3.c()))) << 32) | (((long) ji2.g(icVar3.f)) & 4294967295L));
                this.l = jD;
                this.k = this.d != 3 && (((float) ((int) (jD >> 32))) < icVar3.c() || ((float) ((int) (jD & 4294967295L))) < icVar3.f);
                this.p = jA;
            }
            return false;
        }
        qd3 mcVar = this.n;
        if (mcVar == null || r62Var != this.o || mcVar.a()) {
            this.o = r62Var;
            String str2 = this.a;
            zs4 zs4VarG0 = ud3.g0(this.b, r62Var);
            oo0 oo0Var2 = this.i;
            oo0Var2.getClass();
            ha1 ha1Var2 = this.c;
            boolean z2 = this.e;
            u01 u01Var2 = u01.n;
            mcVar = new mc(str2, zs4VarG0, u01Var2, u01Var2, ha1Var2, oo0Var2, z2);
        }
        this.n = mcVar;
        long jW = ji2.w(jA, this.e, this.d, mcVar.d());
        boolean z3 = this.e;
        int i4 = this.d;
        int i5 = this.f;
        ic icVar4 = new ic((mc) mcVar, ((z3 || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, jW);
        this.p = jA;
        int iG2 = ji2.g(icVar4.c());
        float f5 = icVar4.f;
        long jD2 = qc0.d(jA, (((long) iG2) << 32) | (((long) ji2.g(f5)) & 4294967295L));
        this.l = jD2;
        if (this.d != 3 && (((int) (jD2 >> 32)) < icVar4.c() || ((int) (jD2 & 4294967295L)) < f5)) {
            z = true;
        }
        this.k = z;
        this.j = icVar4;
        return true;
    }

    public final void b() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.p = qc0.g(0, 0, 0, 0);
        this.l = 0L;
        this.k = false;
    }

    public final void c(oo0 oo0Var) {
        long jA;
        oo0 oo0Var2 = this.i;
        if (oo0Var != null) {
            int i = gz1.b;
            jA = gz1.a(oo0Var.g(), oo0Var.J());
        } else {
            jA = gz1.a;
        }
        if (oo0Var2 == null) {
            this.i = oo0Var;
            this.h = jA;
        } else if (oo0Var == null || this.h != jA) {
            this.i = oo0Var;
            this.h = jA;
            this.q = (this.q << 2) | 1;
            b();
        }
    }

    public final String toString() {
        return b11.p(b11.u("ParagraphLayoutCache(paragraph=", this.j != null ? "<paragraph>" : "null", ", lastDensity=", gz1.b(this.h), ", history="), this.q, ", constraints=$)");
    }
}
