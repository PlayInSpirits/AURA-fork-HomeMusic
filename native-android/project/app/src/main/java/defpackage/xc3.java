package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xc3 extends ep4 implements wf1 {
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ ad3 q;
    public final /* synthetic */ int r;
    public final /* synthetic */ float s;
    public final /* synthetic */ wd t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc3(ad3 ad3Var, int i, float f, wd wdVar, vd0 vd0Var) {
        super(2, vd0Var);
        this.q = ad3Var;
        this.r = i;
        this.s = f;
        this.t = wdVar;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        xc3 xc3Var = new xc3(this.q, this.r, this.s, this.t, vd0Var);
        xc3Var.p = obj;
        return xc3Var;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        return ((xc3) create((q64) obj, (vd0) obj2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        int i = this.o;
        j15 j15Var = j15.a;
        if (i != 0) {
            if (i == 1) {
                kb4.X(obj);
                return j15Var;
            }
            kf2.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kb4.X(obj);
        q64 q64Var = (q64) this.p;
        ad3 ad3Var = this.q;
        sm0 sm0Var = new sm0(q64Var, ad3Var);
        this.o = 1;
        dd3 dd3Var = ed3.a;
        int i2 = this.r;
        ad3Var.q.h(ad3Var.j(new Integer(i2).intValue()));
        boolean z = i2 > ad3Var.e;
        int i3 = (((xi2) q40.C0(ad3Var.m().a)).a - ad3Var.e) + 1;
        if (((z && i2 > ((xi2) q40.C0(ad3Var.m().a)).a) || (!z && i2 < ad3Var.e)) && Math.abs(i2 - ad3Var.e) >= 3) {
            int i4 = ad3Var.e;
            if (z) {
                int i5 = i2 - i3;
                if (i5 >= i4) {
                    i4 = i5;
                }
            } else {
                int i6 = i3 + i2;
                if (i6 <= i4) {
                    i4 = i6;
                }
            }
            float fP = ad3Var.p();
            ad3Var.t(fP == 0.0f ? 0.0f : 0.0f / fP, i4, true);
        }
        Object objF = j51.f(((int) (gb.n(e35.t(ad3Var) + ((long) ji2.L(((ad3Var.p() * (i2 - ad3Var.k())) - (ad3Var.l() * ad3Var.p())) + 0.0f)), ad3Var.h, ad3Var.g) - e35.t(ad3Var))) + this.s, this.t, new ib(9, new gx3(), sm0Var), this, 4);
        xe0 xe0Var = xe0.n;
        if (objF != xe0Var) {
            objF = j15Var;
        }
        return objF == xe0Var ? xe0Var : j15Var;
    }
}
