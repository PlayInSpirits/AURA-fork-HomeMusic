package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r70 implements wf1, xf1, yf1, zf1, ag1, bg1, cg1, dg1, hf1, jf1, lf1, mf1, nf1, of1, pf1, qf1, rf1, tf1, uf1 {
    public final int n;
    public final boolean o;
    public sf1 p;
    public lv3 q;
    public ArrayList r;

    public r70(int i, boolean z, sf1 sf1Var) {
        this.n = i;
        this.o = z;
        this.p = sf1Var;
    }

    @Override // defpackage.xf1
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return c(obj, (rg1) obj2, ((Number) obj3).intValue());
    }

    public final Object b(int i, rg1 rg1Var) {
        rg1Var.S(this.n);
        f(rg1Var);
        int iF = i | (rg1Var.e(this) ? fh0.f(2, 0) : fh0.f(1, 0));
        sf1 sf1Var = this.p;
        jz4.j(2, sf1Var);
        Object objInvoke = ((wf1) sf1Var).invoke(rg1Var, Integer.valueOf(iF));
        lv3 lv3VarP = rg1Var.p();
        if (lv3VarP != null) {
            lv3VarP.d = new q70(2, this, r70.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return objInvoke;
    }

    public final Object c(Object obj, rg1 rg1Var, int i) {
        rg1Var.S(this.n);
        f(rg1Var);
        int iF = rg1Var.e(this) ? fh0.f(2, 1) : fh0.f(1, 1);
        sf1 sf1Var = this.p;
        jz4.j(3, sf1Var);
        Object objA = ((xf1) sf1Var).a(obj, rg1Var, Integer.valueOf(iF | i));
        lv3 lv3VarP = rg1Var.p();
        if (lv3VarP != null) {
            lv3VarP.d = new p70(this, obj, i);
        }
        return objA;
    }

    @Override // defpackage.yf1
    public final /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        return e(obj, obj2, (rg1) obj3, ((Number) obj4).intValue());
    }

    public final Object e(Object obj, Object obj2, rg1 rg1Var, int i) {
        rg1Var.S(this.n);
        f(rg1Var);
        int iF = rg1Var.e(this) ? fh0.f(2, 2) : fh0.f(1, 2);
        sf1 sf1Var = this.p;
        jz4.j(4, sf1Var);
        Object objD = ((yf1) sf1Var).d(obj, obj2, rg1Var, Integer.valueOf(iF | i));
        lv3 lv3VarP = rg1Var.p();
        if (lv3VarP != null) {
            lv3VarP.d = new o70(this, obj, obj2, i);
        }
        return objD;
    }

    public final void f(rg1 rg1Var) {
        lv3 lv3VarU;
        if (!this.o || (lv3VarU = rg1Var.u()) == null) {
            return;
        }
        lv3VarU.b |= 1;
        lv3 lv3Var = this.q;
        if (lv3Var == null || !lv3Var.a() || lv3Var == lv3VarU || h12.c(lv3Var.c, lv3VarU.c)) {
            this.q = lv3VarU;
            return;
        }
        ArrayList arrayList = this.r;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.r = arrayList2;
            arrayList2.add(lv3VarU);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            lv3 lv3Var2 = (lv3) arrayList.get(i);
            if (lv3Var2 == null || !lv3Var2.a() || lv3Var2 == lv3VarU || h12.c(lv3Var2.c, lv3VarU.c)) {
                arrayList.set(i, lv3VarU);
                return;
            }
        }
        arrayList.add(lv3VarU);
    }

    @Override // defpackage.wf1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return b(((Number) obj2).intValue(), (rg1) obj);
    }
}
