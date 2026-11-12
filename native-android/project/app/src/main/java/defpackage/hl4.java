package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hl4 extends ep4 implements xf1 {
    public int o;
    public /* synthetic */ q81 p;
    public /* synthetic */ int q;
    public final /* synthetic */ il4 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl4(il4 il4Var, vd0 vd0Var) {
        super(3, vd0Var);
        this.r = il4Var;
    }

    @Override // defpackage.xf1
    public final Object a(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        hl4 hl4Var = new hl4(this.r, (vd0) obj3);
        hl4Var.p = (q81) obj;
        hl4Var.q = iIntValue;
        return hl4Var.invokeSuspend(j15.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0061 A[PHI: r0
  0x0061: PHI (r0v3 q81) = (r0v2 q81), (r0v6 q81) binds: [B:25:0x005e, B:13:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r0.b(defpackage.gd4.n, r8) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        if (r0.b(defpackage.gd4.p, r8) == r7) goto L32;
     */
    @Override // defpackage.jp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        q81 q81Var;
        int i = this.o;
        xe0 xe0Var = xe0.n;
        if (i == 0) {
            kb4.X(obj);
            q81Var = this.p;
            if (this.q > 0) {
                this.o = 1;
            } else {
                this.p = q81Var;
                this.o = 2;
                if (au0.j(0L, this) != xe0Var) {
                    this.p = q81Var;
                    this.o = 3;
                    if (q81Var.b(gd4.o, this) != xe0Var) {
                        this.p = q81Var;
                        this.o = 4;
                        if (au0.j(Long.MAX_VALUE, this) != xe0Var) {
                            this.p = null;
                            this.o = 5;
                        }
                    }
                }
            }
            return xe0Var;
        }
        if (i != 1) {
            if (i == 2) {
                q81Var = this.p;
                kb4.X(obj);
                this.p = q81Var;
                this.o = 3;
                if (q81Var.b(gd4.o, this) != xe0Var) {
                    this.p = q81Var;
                    this.o = 4;
                    if (au0.j(Long.MAX_VALUE, this) != xe0Var) {
                    }
                }
                return xe0Var;
            }
            if (i == 3) {
                q81Var = this.p;
                kb4.X(obj);
                this.p = q81Var;
                this.o = 4;
                if (au0.j(Long.MAX_VALUE, this) != xe0Var) {
                }
                return xe0Var;
            }
            if (i == 4) {
                q81Var = this.p;
                kb4.X(obj);
            } else if (i != 5) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this.p = null;
            this.o = 5;
        }
        kb4.X(obj);
        return j15.a;
    }
}
