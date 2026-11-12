package defpackage;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rg2 extends be5 {
    public final boolean l;
    public final bu4 m;
    public final zt4 n;
    public pg2 o;
    public og2 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public rg2(bq bqVar, boolean z) {
        super(bqVar);
        this.l = z && bqVar.i();
        this.m = new bu4();
        this.n = new zt4();
        cu4 cu4VarG = bqVar.g();
        if (cu4VarG == null) {
            this.o = new pg2(new qg2(bqVar.h()), bu4.p, pg2.h);
        } else {
            this.o = new pg2(cu4VarG, null, null);
            this.s = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.be5
    public final void A(cu4 cu4Var) {
        long j;
        pg2 pg2Var;
        mt2 mt2VarA;
        pg2 pg2Var2;
        if (this.r) {
            pg2 pg2Var3 = this.o;
            this.o = new pg2(cu4Var, pg2Var3.f, pg2Var3.g);
            og2 og2Var = this.p;
            if (og2Var != null) {
                E(og2Var.t);
            }
        } else {
            if (!cu4Var.p()) {
                bu4 bu4Var = this.m;
                cu4Var.n(0, bu4Var);
                long j2 = bu4Var.k;
                Object obj = bu4Var.a;
                og2 og2Var2 = this.p;
                if (og2Var2 != null) {
                    long j3 = og2Var2.o;
                    pg2 pg2Var4 = this.o;
                    Object obj2 = og2Var2.n.a;
                    zt4 zt4Var = this.n;
                    pg2Var4.g(obj2, zt4Var);
                    long j4 = zt4Var.e + j3;
                    this.o.m(0, bu4Var, 0L);
                    if (j4 != bu4Var.k) {
                        j = j4;
                    } else {
                        j = j2;
                    }
                } else {
                    j = j2;
                }
                Pair pairI = cu4Var.i(this.m, this.n, 0, j);
                Object obj3 = pairI.first;
                long jLongValue = ((Long) pairI.second).longValue();
                if (this.s) {
                    pg2 pg2Var5 = this.o;
                    pg2Var = new pg2(cu4Var, pg2Var5.f, pg2Var5.g);
                } else {
                    pg2Var = new pg2(cu4Var, obj, obj3);
                }
                this.o = pg2Var;
                og2 og2Var3 = this.p;
                if (og2Var3 != null && E(jLongValue)) {
                    mt2 mt2Var = og2Var3.n;
                    Object obj4 = mt2Var.a;
                    if (this.o.g != null && obj4.equals(pg2.h)) {
                        obj4 = this.o.g;
                    }
                    mt2VarA = mt2Var.a(obj4);
                }
                this.s = true;
                this.r = true;
                m(this.o);
                if (mt2VarA != null) {
                    og2 og2Var4 = this.p;
                    og2Var4.getClass();
                    og2Var4.a(mt2VarA);
                }
            }
            if (this.s) {
                pg2 pg2Var6 = this.o;
                pg2Var2 = new pg2(cu4Var, pg2Var6.f, pg2Var6.g);
            } else {
                pg2Var2 = new pg2(cu4Var, bu4.p, pg2.h);
            }
            this.o = pg2Var2;
        }
        mt2VarA = null;
        this.s = true;
        this.r = true;
        m(this.o);
        if (mt2VarA != null) {
            og2 og2Var5 = this.p;
            og2Var5.getClass();
            og2Var5.a(mt2VarA);
        }
    }

    @Override // defpackage.be5
    public final void C() {
        if (this.l) {
            return;
        }
        this.q = true;
        B();
    }

    @Override // defpackage.be5, defpackage.bq
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final og2 b(mt2 mt2Var, n9 n9Var, long j) {
        og2 og2Var = new og2(mt2Var, n9Var, j);
        rr2.w(og2Var.q == null);
        og2Var.q = this.k;
        if (!this.r) {
            this.p = og2Var;
            if (!this.q) {
                this.q = true;
                B();
            }
            return og2Var;
        }
        Object obj = mt2Var.a;
        if (this.o.g != null && obj.equals(pg2.h)) {
            obj = this.o.g;
        }
        og2Var.a(mt2Var.a(obj));
        return og2Var;
    }

    public final boolean E(long j) {
        og2 og2Var = this.p;
        int iB = this.o.b(og2Var.n.a);
        if (iB == -1) {
            return false;
        }
        pg2 pg2Var = this.o;
        zt4 zt4Var = this.n;
        pg2Var.f(iB, zt4Var, false);
        long j2 = zt4Var.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        og2Var.t = j;
        return true;
    }

    @Override // defpackage.be5, defpackage.bq
    public final boolean a(gn2 gn2Var) {
        return this.k.a(gn2Var);
    }

    @Override // defpackage.be5, defpackage.bq
    public final void n(no2 no2Var) {
        og2 og2Var = (og2) no2Var;
        if (og2Var.r != null) {
            bq bqVar = og2Var.q;
            bqVar.getClass();
            bqVar.n(og2Var.r);
        }
        if (no2Var == this.p) {
            this.p = null;
        }
    }

    @Override // defpackage.p80, defpackage.bq
    public final void p() {
        this.r = false;
        this.q = false;
        super.p();
    }

    @Override // defpackage.be5, defpackage.bq
    public final void s(gn2 gn2Var) {
        if (this.s) {
            pg2 pg2Var = this.o;
            cu4 cu4Var = pg2Var.e;
            this.o = new pg2(cu4Var instanceof du4 ? new du4(((du4) cu4Var).e, gn2Var) : new du4(cu4Var, gn2Var), pg2Var.f, pg2Var.g);
        } else {
            this.o = new pg2(new qg2(gn2Var), bu4.p, pg2.h);
        }
        this.k.s(gn2Var);
    }

    @Override // defpackage.be5
    public final mt2 z(mt2 mt2Var) {
        Object obj = mt2Var.a;
        Object obj2 = this.o.g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = pg2.h;
        }
        return mt2Var.a(obj);
    }
}
