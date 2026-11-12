package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ih0 extends ep4 implements wf1 {
    public lw4 o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ s24 t;
    public final /* synthetic */ if1 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih0(vd0 vd0Var, if1 if1Var, s24 s24Var, boolean z, boolean z2) {
        super(2, vd0Var);
        this.r = z;
        this.s = z2;
        this.t = s24Var;
        this.u = if1Var;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        ih0 ih0Var = new ih0(vd0Var, this.u, this.t, this.r, this.s);
        ih0Var.q = obj;
        return ih0Var;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        return ((ih0) create((mw4) obj, (vd0) obj2)).invokeSuspend(j15.a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009d A[DONT_INVERT, PHI: r0 r12
  0x009d: PHI (r0v11 mw4) = (r0v8 mw4), (r0v16 mw4) binds: [B:34:0x009a, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r12v15 java.lang.Object) = (r12v13 java.lang.Object), (r12v0 java.lang.Object) binds: [B:34:0x009a, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3 A[RETURN] */
    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        lw4 lw4Var;
        mw4 mw4Var;
        lw4 lw4Var2;
        mw4 mw4Var2;
        mw4 mw4Var3;
        Object objD;
        Object obj2;
        int i = this.p;
        if1 if1Var = this.u;
        s24 s24Var = this.t;
        boolean z = this.s;
        xe0 xe0Var = xe0.n;
        if (i == 0) {
            kb4.X(obj);
            mw4 mw4Var4 = (mw4) this.q;
            if (!this.r) {
                mw4Var4.getClass();
                return if1Var.invoke(((qu3) mw4Var4).c());
            }
            lw4Var = z ? lw4.n : lw4.o;
            if (z) {
                lw4 lw4Var3 = lw4Var;
                mw4Var = mw4Var4;
                lw4Var2 = lw4Var3;
                hh0 hh0Var = new hh0(null, if1Var, 0);
                this.q = mw4Var;
                this.o = null;
                this.p = 3;
                obj = mw4Var.a(lw4Var2, hh0Var, this);
                if (obj != xe0Var) {
                    if (z) {
                        return obj;
                    }
                    this.q = obj;
                    this.p = 4;
                    objD = mw4Var.d(this);
                    if (objD != xe0Var) {
                        Object obj3 = obj;
                        obj = objD;
                        obj2 = obj3;
                        if (!((Boolean) obj).booleanValue()) {
                            s12 s12VarI = s24Var.i();
                            s12VarI.b.e(s12VarI.e, s12VarI.f);
                        }
                        return obj2;
                    }
                }
            } else {
                this.q = mw4Var4;
                this.o = lw4Var;
                this.p = 1;
                Object objD2 = mw4Var4.d(this);
                if (objD2 != xe0Var) {
                    mw4Var2 = mw4Var4;
                    obj = objD2;
                }
            }
            return xe0Var;
        }
        if (i == 1) {
            lw4Var = this.o;
            mw4Var2 = (mw4) this.q;
            kb4.X(obj);
        } else {
            if (i == 2) {
                lw4Var = this.o;
                mw4Var3 = (mw4) this.q;
                kb4.X(obj);
                lw4Var2 = lw4Var;
                mw4Var = mw4Var3;
                hh0 hh0Var2 = new hh0(null, if1Var, 0);
                this.q = mw4Var;
                this.o = null;
                this.p = 3;
                obj = mw4Var.a(lw4Var2, hh0Var2, this);
                if (obj != xe0Var) {
                    if (z) {
                        return obj;
                    }
                    this.q = obj;
                    this.p = 4;
                    objD = mw4Var.d(this);
                    if (objD != xe0Var) {
                        Object obj4 = obj;
                        obj = objD;
                        obj2 = obj4;
                    }
                }
                return xe0Var;
            }
            if (i == 3) {
                mw4Var = (mw4) this.q;
                kb4.X(obj);
                if (z) {
                    return obj;
                }
                this.q = obj;
                this.p = 4;
                objD = mw4Var.d(this);
                if (objD != xe0Var) {
                    Object obj5 = obj;
                    obj = objD;
                    obj2 = obj5;
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
            s12 s12VarI2 = s24Var.i();
            s12VarI2.b.e(s12VarI2.e, s12VarI2.f);
        }
        return obj2;
        if (((Boolean) obj).booleanValue()) {
            lw4Var2 = lw4Var;
            mw4Var = mw4Var2;
            hh0 hh0Var3 = new hh0(null, if1Var, 0);
            this.q = mw4Var;
            this.o = null;
            this.p = 3;
            obj = mw4Var.a(lw4Var2, hh0Var3, this);
            if (obj != xe0Var) {
                if (z) {
                    return obj;
                }
                this.q = obj;
                this.p = 4;
                objD = mw4Var.d(this);
                if (objD != xe0Var) {
                    Object obj6 = obj;
                    obj = objD;
                    obj2 = obj6;
                    if (!((Boolean) obj).booleanValue()) {
                        s12 s12VarI3 = s24Var.i();
                        s12VarI3.b.e(s12VarI3.e, s12VarI3.f);
                    }
                    return obj2;
                }
            }
        } else {
            s12 s12VarI4 = s24Var.i();
            this.q = mw4Var2;
            this.o = lw4Var;
            this.p = 2;
            if (s12VarI4.b(this) != xe0Var) {
                mw4Var3 = mw4Var2;
                lw4Var2 = lw4Var;
                mw4Var = mw4Var3;
                hh0 hh0Var4 = new hh0(null, if1Var, 0);
                this.q = mw4Var;
                this.o = null;
                this.p = 3;
                obj = mw4Var.a(lw4Var2, hh0Var4, this);
                if (obj != xe0Var) {
                    if (z) {
                        return obj;
                    }
                    this.q = obj;
                    this.p = 4;
                    objD = mw4Var.d(this);
                    if (objD != xe0Var) {
                        Object obj7 = obj;
                        obj = objD;
                        obj2 = obj7;
                        if (!((Boolean) obj).booleanValue()) {
                            s12 s12VarI5 = s24Var.i();
                            s12VarI5.b.e(s12VarI5.e, s12VarI5.f);
                        }
                        return obj2;
                    }
                }
            }
        }
        return xe0Var;
    }
}
