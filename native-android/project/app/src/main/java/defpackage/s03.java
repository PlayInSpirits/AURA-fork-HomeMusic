package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s03 extends r14 implements wf1 {
    public bh1 o;
    public t03 p;
    public long[] q;
    public int r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ t03 u;
    public final /* synthetic */ bh1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s03(t03 t03Var, bh1 bh1Var, vd0 vd0Var) {
        super(vd0Var);
        this.u = t03Var;
        this.v = bh1Var;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        s03 s03Var = new s03(this.u, this.v, vd0Var);
        s03Var.t = obj;
        return s03Var;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        return ((s03) create((ba4) obj, (vd0) obj2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        ba4 ba4Var;
        t03 t03Var;
        long[] jArr;
        int i;
        bh1 bh1Var;
        int i2 = this.s;
        if (i2 == 0) {
            kb4.X(obj);
            ba4Var = (ba4) this.t;
            t03Var = this.u;
            r03 r03Var = t03Var.o;
            jArr = r03Var.c;
            i = r03Var.e;
            bh1Var = this.v;
        } else {
            if (i2 != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.r;
            jArr = this.q;
            t03Var = this.p;
            bh1Var = this.o;
            ba4Var = (ba4) this.t;
            kb4.X(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return j15.a;
        }
        int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
        bh1Var.o = i;
        Object obj2 = t03Var.o.b[i];
        this.t = ba4Var;
        this.o = bh1Var;
        this.p = t03Var;
        this.q = jArr;
        this.r = i3;
        this.s = 1;
        ba4Var.b(this, obj2);
        return xe0.n;
    }
}
