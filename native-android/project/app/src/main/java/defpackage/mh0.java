package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mh0 extends ep4 implements wf1 {
    public lw4 o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ s24 s;
    public final /* synthetic */ if1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh0(vd0 vd0Var, if1 if1Var, s24 s24Var, boolean z) {
        super(2, vd0Var);
        this.r = z;
        this.s = s24Var;
        this.t = if1Var;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        mh0 mh0Var = new mh0(vd0Var, this.t, this.s, this.r);
        mh0Var.q = obj;
        return mh0Var;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        return ((mh0) create((mw4) obj, (vd0) obj2)).invokeSuspend(j15.a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0070 A[PHI: r0 r12
  0x0070: PHI (r0v6 mw4) = (r0v3 mw4), (r0v10 mw4) binds: [B:23:0x006d, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x0070: PHI (r12v9 java.lang.Object) = (r12v7 java.lang.Object), (r12v0 java.lang.Object) binds: [B:23:0x006d, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0098 A[RETURN] */
    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        lw4 lw4Var;
        lw4 lw4Var2;
        mw4 mw4Var;
        mw4 mw4Var2;
        Object objD;
        Object obj2;
        int i = this.p;
        if1 if1Var = this.t;
        if (i == 0) {
            kb4.X(obj);
            mw4 mw4Var3 = (mw4) this.q;
            mw4Var3.getClass();
            return if1Var.invoke(((qu3) mw4Var3).c());
        }
        vd0 vd0Var = null;
        s24 s24Var = this.s;
        int i2 = 1;
        xe0 xe0Var = xe0.n;
        if (i != 1) {
            if (i == 2) {
                lw4Var = this.o;
                mw4Var2 = (mw4) this.q;
                kb4.X(obj);
            } else {
                if (i == 3) {
                    mw4Var = (mw4) this.q;
                    kb4.X(obj);
                    if (this.r) {
                        return obj;
                    }
                    this.q = obj;
                    this.p = 4;
                    objD = mw4Var.d(this);
                    if (objD != xe0Var) {
                        Object obj3 = obj;
                        obj = objD;
                        obj2 = obj3;
                    }
                    return xe0Var;
                }
                if (i != 4) {
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.q;
                kb4.X(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                s12 s12VarI = s24Var.i();
                s12VarI.b.e(s12VarI.e, s12VarI.f);
            }
            return obj2;
        }
        lw4Var = this.o;
        mw4 mw4Var4 = (mw4) this.q;
        kb4.X(obj);
        if (((Boolean) obj).booleanValue()) {
            lw4Var2 = lw4Var;
            mw4Var = mw4Var4;
            hh0 hh0Var = new hh0(vd0Var, if1Var, i2);
            this.q = mw4Var;
            this.o = null;
            this.p = 3;
            obj = mw4Var.a(lw4Var2, hh0Var, this);
            if (obj != xe0Var) {
                if (this.r) {
                    return obj;
                }
                this.q = obj;
                this.p = 4;
                objD = mw4Var.d(this);
                if (objD != xe0Var) {
                    Object obj4 = obj;
                    obj = objD;
                    obj2 = obj4;
                    if (!((Boolean) obj).booleanValue()) {
                        s12 s12VarI2 = s24Var.i();
                        s12VarI2.b.e(s12VarI2.e, s12VarI2.f);
                    }
                    return obj2;
                }
            }
        } else {
            s12 s12VarI3 = s24Var.i();
            this.q = mw4Var4;
            this.o = lw4Var;
            this.p = 2;
            if (s12VarI3.b(this) != xe0Var) {
                mw4Var2 = mw4Var4;
            }
        }
        return xe0Var;
        lw4Var2 = lw4Var;
        mw4Var = mw4Var2;
        hh0 hh0Var2 = new hh0(vd0Var, if1Var, i2);
        this.q = mw4Var;
        this.o = null;
        this.p = 3;
        obj = mw4Var.a(lw4Var2, hh0Var2, this);
        if (obj != xe0Var) {
            if (this.r) {
                return obj;
            }
            this.q = obj;
            this.p = 4;
            objD = mw4Var.d(this);
            if (objD != xe0Var) {
                Object obj5 = obj;
                obj = objD;
                obj2 = obj5;
                if (!((Boolean) obj).booleanValue()) {
                    s12 s12VarI4 = s24Var.i();
                    s12VarI4.b.e(s12VarI4.e, s12VarI4.f);
                }
                return obj2;
            }
        }
        return xe0Var;
    }
}
