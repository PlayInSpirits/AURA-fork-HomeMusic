package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tk0 extends ep4 implements wf1 {
    public final /* synthetic */ int o = 0;
    public gx3 p;
    public int q;
    public final /* synthetic */ float r;
    public Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ q64 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk0(wg4 wg4Var, float f, if1 if1Var, q64 q64Var, vd0 vd0Var) {
        super(2, vd0Var);
        this.s = wg4Var;
        this.r = f;
        this.t = if1Var;
        this.u = q64Var;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        int i = this.o;
        Object obj2 = this.t;
        switch (i) {
            case 0:
                c74 c74Var = (c74) this.u;
                return new tk0(this.r, (uk0) obj2, c74Var, vd0Var);
            default:
                q64 q64Var = this.u;
                return new tk0((wg4) this.s, this.r, (if1) obj2, q64Var, vd0Var);
        }
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.o;
        j15 j15Var = j15.a;
        we0 we0Var = (we0) obj;
        vd0 vd0Var = (vd0) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((tk0) create(we0Var, vd0Var)).invokeSuspend(j15Var);
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [tg4] */
    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        gx3 gx3Var;
        xd xdVar;
        float f;
        xe0 xe0Var;
        float fSignum;
        final gx3 gx3Var2;
        Object objB;
        float f2;
        int i = this.o;
        xe0 xe0Var2 = xe0.n;
        float f3 = this.r;
        Object obj2 = this.t;
        final int i2 = 0;
        switch (i) {
            case 0:
                int i3 = this.q;
                if (i3 != 0) {
                    if (i3 != 1) {
                        kf2.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xdVar = (xd) this.s;
                    gx3Var = this.p;
                    try {
                        kb4.X(obj);
                    } catch (CancellationException unused) {
                        gx3Var.n = ((Number) xdVar.a()).floatValue();
                    }
                    f3 = gx3Var.n;
                    break;
                } else {
                    kb4.X(obj);
                    if (Math.abs(f3) > 1.0f) {
                        gx3Var = new gx3();
                        gx3Var.n = f3;
                        gx3 gx3Var3 = new gx3();
                        xd xdVarA = j51.a(0.0f, f3, 28);
                        try {
                            uk0 uk0Var = (uk0) obj2;
                            ui0 ui0Var = uk0Var.a;
                            dd0 dd0Var = new dd0(gx3Var3, (c74) this.u, gx3Var, uk0Var);
                            this.p = gx3Var;
                            this.s = xdVarA;
                            this.q = 1;
                            if (j51.g(xdVarA, ui0Var, false, dd0Var, this) == xe0Var2) {
                                return xe0Var2;
                            }
                        } catch (CancellationException unused2) {
                            xdVar = xdVarA;
                            gx3Var.n = ((Number) xdVar.a()).floatValue();
                        }
                        f3 = gx3Var.n;
                    }
                }
                return new Float(f3);
            default:
                final if1 if1Var = (if1) obj2;
                wg4 wg4Var = (wg4) this.s;
                rf2 rf2Var = wg4Var.a;
                int i4 = this.q;
                if (i4 == 0) {
                    kb4.X(obj);
                    float f4 = ((zd) new na4(wg4Var.b.a).D(new zd(0.0f), new zd(f3))).a;
                    lm0 lm0Var = (lm0) rf2Var.n;
                    zd3 zd3Var = lm0Var.m;
                    int iO = ((qc3) zd3Var.getValue()).c + lm0Var.o();
                    if (iO == 0) {
                        fSignum = 0.0f;
                        f = 0.0f;
                        xe0Var = xe0Var2;
                    } else {
                        int i5 = lm0Var.e;
                        if (f3 < 0.0f) {
                            i5++;
                        }
                        int iM = gb.m(((int) (f4 / iO)) + i5, 0, lm0Var.n());
                        lm0Var.o();
                        int i6 = ((qc3) zd3Var.getValue()).c;
                        f = 0.0f;
                        xe0Var = xe0Var2;
                        long j = i5;
                        long j2 = j - 1;
                        int i7 = (int) (j2 < 0 ? 0L : j2);
                        long j3 = j + 1;
                        if (j3 > 2147483647L) {
                            j3 = 2147483647L;
                        }
                        int iAbs = Math.abs((gb.m(gb.m(iM, i7, (int) j3), 0, lm0Var.n()) - i5) * iO) - iO;
                        if (iAbs < 0) {
                            iAbs = 0;
                        }
                        fSignum = iAbs == 0 ? iAbs : Math.signum(f3) * iAbs;
                    }
                    if (Float.isNaN(fSignum)) {
                        fz1.c("calculateApproachOffset returned NaN. Please use a valid value.");
                    }
                    gx3Var2 = new gx3();
                    float fSignum2 = Math.signum(f3) * Math.abs(fSignum);
                    gx3Var2.n = fSignum2;
                    if1Var.invoke(new Float(fSignum2));
                    float f5 = gx3Var2.n;
                    ?? r4 = new if1() { // from class: tg4
                        @Override // defpackage.if1
                        public final Object invoke(Object obj3) {
                            int i8 = i2;
                            j15 j15Var = j15.a;
                            if1 if1Var2 = if1Var;
                            gx3 gx3Var4 = gx3Var2;
                            float fFloatValue = ((Float) obj3).floatValue();
                            switch (i8) {
                                case 0:
                                    float f6 = gx3Var4.n - fFloatValue;
                                    gx3Var4.n = f6;
                                    if1Var2.invoke(Float.valueOf(f6));
                                    break;
                                default:
                                    float f7 = gx3Var4.n - fFloatValue;
                                    gx3Var4.n = f7;
                                    if1Var2.invoke(Float.valueOf(f7));
                                    break;
                            }
                            return j15Var;
                        }
                    };
                    this.p = gx3Var2;
                    this.q = 1;
                    objB = wg4.b(wg4Var, this.u, f5, this.r, r4, this);
                    if (objB == xe0Var) {
                        return xe0Var;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            kb4.X(obj);
                            return obj;
                        }
                        kf2.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gx3 gx3Var4 = this.p;
                    kb4.X(obj);
                    f = 0.0f;
                    xe0Var = xe0Var2;
                    gx3Var2 = gx3Var4;
                    objB = obj;
                }
                xd xdVar2 = (xd) objB;
                float fFloatValue = ((Number) xdVar2.a()).floatValue();
                lm0 lm0Var2 = (lm0) rf2Var.n;
                rv2 rv2Var = lm0Var2.m().n;
                List list = lm0Var2.m().a;
                int size = list.size();
                float f6 = Float.NEGATIVE_INFINITY;
                float f7 = Float.POSITIVE_INFINITY;
                while (i2 < size) {
                    xi2 xi2Var = (xi2) list.get(i2);
                    te5.x(lm0Var2.m());
                    int i8 = lm0Var2.m().f;
                    int i9 = lm0Var2.m().d;
                    int i10 = lm0Var2.m().b;
                    int i11 = xi2Var.l;
                    lm0Var2.n();
                    rv2Var.getClass();
                    float f8 = i11 - f;
                    if (f8 <= f && f8 > f6) {
                        f6 = f8;
                    }
                    if (f8 >= f && f8 < f7) {
                        f7 = f8;
                    }
                    i2++;
                }
                if (f6 == Float.NEGATIVE_INFINITY) {
                    f6 = f7;
                }
                if (f7 == Float.POSITIVE_INFINITY) {
                    f7 = f6;
                }
                if (!lm0Var2.c()) {
                    if (xl.A(lm0Var2, fFloatValue)) {
                        f6 = f;
                        f7 = f6;
                    } else {
                        f7 = f;
                    }
                }
                if (lm0Var2.b()) {
                    f2 = f7;
                } else if (xl.A(lm0Var2, fFloatValue)) {
                    f6 = f;
                    f2 = f7;
                } else {
                    f2 = f;
                    f6 = f2;
                }
                float fFloatValue2 = ((Number) ((gc3) rf2Var.o).a(Float.valueOf(fFloatValue), Float.valueOf(f6), Float.valueOf(f2))).floatValue();
                if (fFloatValue2 != f6 && fFloatValue2 != f2 && fFloatValue2 != f) {
                    fz1.c("Final Snapping Offset Should Be one of " + f6 + ", " + f2 + " or 0.0");
                }
                if (fFloatValue2 == Float.POSITIVE_INFINITY || fFloatValue2 == Float.NEGATIVE_INFINITY) {
                    fFloatValue2 = f;
                }
                if (Float.isNaN(fFloatValue2)) {
                    fz1.c("calculateSnapOffset returned NaN. Please use a valid value.");
                }
                gx3Var2.n = fFloatValue2;
                float f9 = f;
                xd xdVarP = j51.p(xdVar2, f9, f9, 30);
                ck4 ck4Var = wg4Var.c;
                final int i12 = 1;
                if1 if1Var2 = new if1() { // from class: tg4
                    @Override // defpackage.if1
                    public final Object invoke(Object obj3) {
                        int i13 = i12;
                        j15 j15Var = j15.a;
                        if1 if1Var3 = if1Var;
                        gx3 gx3Var5 = gx3Var2;
                        float fFloatValue3 = ((Float) obj3).floatValue();
                        switch (i13) {
                            case 0:
                                float f10 = gx3Var5.n - fFloatValue3;
                                gx3Var5.n = f10;
                                if1Var3.invoke(Float.valueOf(f10));
                                break;
                            default:
                                float f11 = gx3Var5.n - fFloatValue3;
                                gx3Var5.n = f11;
                                if1Var3.invoke(Float.valueOf(f11));
                                break;
                        }
                        return j15Var;
                    }
                };
                this.p = null;
                this.q = 2;
                Object objD = su3.d(this.u, fFloatValue2, fFloatValue2, xdVarP, ck4Var, if1Var2, this);
                return objD == xe0Var ? xe0Var : objD;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk0(float f, uk0 uk0Var, c74 c74Var, vd0 vd0Var) {
        super(2, vd0Var);
        this.r = f;
        this.t = uk0Var;
        this.u = c74Var;
    }
}
