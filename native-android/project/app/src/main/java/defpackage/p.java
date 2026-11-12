package defpackage;

import android.view.View;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.WaveRetry;
import java.util.ArrayList;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, Object obj2, vd0 vd0Var, int i) {
        super(2, vd0Var);
        this.o = i;
        this.q = obj;
        this.r = obj2;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        int i = this.o;
        Object obj2 = this.r;
        switch (i) {
            case 0:
                return new p((rm2) this.q, (wp1) obj2, vd0Var, 0);
            case 1:
                return new p((rm2) this.q, (xp1) obj2, vd0Var, 1);
            case 2:
                p pVar = new p((ip) obj2, vd0Var, 2);
                pVar.q = obj;
                return pVar;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return new p((cv) this.q, (jo) obj2, vd0Var, 3);
            case 4:
                p pVar2 = new p((z00) obj2, vd0Var, 4);
                pVar2.q = obj;
                return pVar2;
            case 5:
                p pVar3 = new p((a10) obj2, vd0Var, 5);
                pVar3.q = obj;
                return pVar3;
            case 6:
                return new p((a80) this.q, (Runnable) obj2, vd0Var, 6);
            case 7:
                return new p((wf1) this.q, (go3) obj2, vd0Var, 7);
            case 8:
                return new p((wf1) this.q, (jx3) obj2, vd0Var, 8);
            case 9:
                return new p((rm2) this.q, (b13) obj2, vd0Var, 9);
            case 10:
                return new p((sn3) this.q, (lm0) obj2, vd0Var, 10);
            case 11:
                return new p((ll4) this.q, (rx2) obj2, vd0Var, 11);
            case 12:
                p pVar4 = new p((hy2) obj2, vd0Var, 12);
                pVar4.q = obj;
                return pVar4;
            case 13:
                return new p((p53) this.q, (rq3) obj2, vd0Var, 13);
            case 14:
                return new p((ir2) this.q, (wf1) obj2, vd0Var, 14);
            case 15:
                p pVar5 = new p((y00) obj2, vd0Var, 15);
                pVar5.q = obj;
                return pVar5;
            case WaveRetry.MAX_FAILURES /* 16 */:
                return new p((zu0) this.q, (z64) obj2, vd0Var, 16);
            case 17:
                return new p((jy4) this.q, (gf1) obj2, vd0Var, 17);
            case 18:
                p pVar6 = new p((q81) obj2, vd0Var, 18);
                pVar6.q = obj;
                return pVar6;
            default:
                return new p((tv3) this.q, (View) obj2, vd0Var, 19);
        }
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.o;
        j15 j15Var = j15.a;
        switch (i) {
            case 0:
                return ((p) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
            case 1:
                return ((p) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
            case 2:
                return ((p) create((rq3) obj, (vd0) obj2)).invokeSuspend(j15Var);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return ((p) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
            case 4:
                return ((p) create((rq3) obj, (vd0) obj2)).invokeSuspend(j15Var);
            case 5:
                return ((p) create((q81) obj, (vd0) obj2)).invokeSuspend(j15Var);
            case 6:
                return ((p) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
            case 7:
                return ((p) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
            case 8:
                return ((p) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
            case 9:
                return ((p) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
            case 10:
                return ((p) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
            case 11:
                ((p) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
                return xe0.n;
            case 12:
                return ((p) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
            case 13:
                return ((p) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
            case 14:
                return ((p) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
            case 15:
                return ((p) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
            case WaveRetry.MAX_FAILURES /* 16 */:
                return ((p) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
            case 17:
                return ((p) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
            case 18:
                return ((p) create(obj, (vd0) obj2)).invokeSuspend(j15Var);
            default:
                return ((p) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0204 A[Catch: all -> 0x01e2, TryCatch #0 {all -> 0x01e2, blocks: (B:113:0x01dc, B:123:0x01fa, B:125:0x0204, B:129:0x0217, B:120:0x01ef), top: B:272:0x01d2 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0213  */
    /* JADX WARN: Code duplicated, block: B:128:0x0214  */
    /* JADX WARN: Code duplicated, block: B:133:0x0240  */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x023a, code lost:
    
        if (defpackage.hy2.E(r6, r7, r8, r9, r10, r11) == r0) goto L131;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:130:0x023a -> B:115:0x01e0). Please report as a decompilation issue!!! */
    @Override // defpackage.jp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        we0 we0Var;
        we0 we0Var2;
        p pVar;
        Object objH;
        Throwable th;
        s22 s22Var;
        int i = 0;
        int i2 = 2;
        vd0 vd0Var = null;
        switch (this.o) {
            case 0:
                xe0 xe0Var = xe0.n;
                int i3 = this.p;
                if (i3 == 0) {
                    kb4.X(obj);
                    rm2 rm2Var = (rm2) this.q;
                    wp1 wp1Var = (wp1) this.r;
                    this.p = 1;
                    if (rm2Var.e(wp1Var, this) == xe0Var) {
                        return xe0Var;
                    }
                } else {
                    if (i3 != 1) {
                        kf2.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kb4.X(obj);
                }
                return j15.a;
            case 1:
                xe0 xe0Var2 = xe0.n;
                int i4 = this.p;
                if (i4 == 0) {
                    kb4.X(obj);
                    rm2 rm2Var2 = (rm2) this.q;
                    xp1 xp1Var = (xp1) this.r;
                    this.p = 1;
                    if (rm2Var2.e(xp1Var, this) == xe0Var2) {
                        return xe0Var2;
                    }
                } else {
                    if (i4 != 1) {
                        kf2.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kb4.X(obj);
                }
                return j15.a;
            case 2:
                xe0 xe0Var3 = xe0.n;
                int i5 = this.p;
                if (i5 == 0) {
                    kb4.X(obj);
                    rq3 rq3Var = (rq3) this.q;
                    ip ipVar = (ip) this.r;
                    hp hpVar = new hp(ipVar, rq3Var);
                    xb0 xb0Var = ipVar.a;
                    xb0Var.getClass();
                    synchronized (xb0Var.c) {
                        try {
                            if (xb0Var.d.add(hpVar)) {
                                if (xb0Var.d.size() == 1) {
                                    xb0Var.e = xb0Var.a();
                                    cx.f().b(yb0.a, xb0Var.getClass().getSimpleName() + ": initial state = " + xb0Var.e);
                                    xb0Var.c();
                                }
                                Object sc0Var = ipVar.e(xb0Var.e) ? new sc0(ipVar.d()) : rc0.a;
                                rq3Var.getClass();
                                rq3Var.d(sc0Var);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    gp gpVar = new gp(i, (ip) this.r, hpVar);
                    this.p = 1;
                    if (jz4.i(rq3Var, gpVar, this) == xe0Var3) {
                        return xe0Var3;
                    }
                } else {
                    if (i5 != 1) {
                        kf2.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kb4.X(obj);
                }
                return j15.a;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                xe0 xe0Var4 = xe0.n;
                int i6 = this.p;
                if (i6 == 0) {
                    kb4.X(obj);
                    cv cvVar = (cv) this.q;
                    jo joVar = (jo) this.r;
                    this.p = 1;
                    if (xl.h(cvVar, joVar, this) == xe0Var4) {
                        return xe0Var4;
                    }
                } else {
                    if (i6 != 1) {
                        kf2.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kb4.X(obj);
                }
                return j15.a;
            case 4:
                xe0 xe0Var5 = xe0.n;
                int i7 = this.p;
                if (i7 == 0) {
                    kb4.X(obj);
                    rq3 rq3Var2 = (rq3) this.q;
                    z00 z00Var = (z00) this.r;
                    this.p = 1;
                    if (z00Var.b(rq3Var2, this) == xe0Var5) {
                        return xe0Var5;
                    }
                } else {
                    if (i7 != 1) {
                        kf2.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kb4.X(obj);
                }
                return j15.a;
            case 5:
                xe0 xe0Var6 = xe0.n;
                int i8 = this.p;
                if (i8 == 0) {
                    kb4.X(obj);
                    q81 q81Var = (q81) this.q;
                    a10 a10Var = (a10) this.r;
                    this.p = 1;
                    if (a10Var.f(q81Var, this) == xe0Var6) {
                        return xe0Var6;
                    }
                } else {
                    if (i8 != 1) {
                        kf2.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kb4.X(obj);
                }
                return j15.a;
            case 6:
                j15 j15Var = j15.a;
                a80 a80Var = (a80) this.q;
                xe0 xe0Var7 = xe0.n;
                int i9 = this.p;
                if (i9 == 0) {
                    kb4.X(obj);
                    sy3 sy3Var = a80Var.f;
                    this.p = 1;
                    Object objA = sy3Var.a(0.0f - sy3Var.c, this);
                    if (objA != xe0Var7) {
                        objA = j15Var;
                    }
                    if (objA == xe0Var7) {
                        return xe0Var7;
                    }
                } else {
                    if (i9 != 1) {
                        kf2.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kb4.X(obj);
                }
                ((zd3) a80Var.c.o).setValue(Boolean.FALSE);
                ((Runnable) this.r).run();
                return j15Var;
            case 7:
                xe0 xe0Var8 = xe0.n;
                int i10 = this.p;
                if (i10 != 0) {
                    if (i10 == 1) {
                        kb4.X(obj);
                        return obj;
                    }
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kb4.X(obj);
                wf1 wf1Var = (wf1) this.q;
                go3 go3Var = (go3) this.r;
                this.p = 1;
                Object objInvoke = wf1Var.invoke(go3Var, this);
                return objInvoke == xe0Var8 ? xe0Var8 : objInvoke;
            case 8:
                xe0 xe0Var9 = xe0.n;
                int i11 = this.p;
                if (i11 != 0) {
                    if (i11 == 1) {
                        kb4.X(obj);
                        return obj;
                    }
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kb4.X(obj);
                wf1 wf1Var2 = (wf1) this.q;
                Object obj2 = ((jx3) this.r).n;
                this.p = 1;
                Object objInvoke2 = wf1Var2.invoke(obj2, this);
                return objInvoke2 == xe0Var9 ? xe0Var9 : objInvoke2;
            case 9:
                xe0 xe0Var10 = xe0.n;
                int i12 = this.p;
                if (i12 != 0) {
                    if (i12 == 1) {
                        kb4.X(obj);
                        return j15.a;
                    }
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kb4.X(obj);
                ArrayList arrayList = new ArrayList();
                cd4 cd4Var = (cd4) ((rm2) this.q).o;
                lv0 lv0Var = new lv0(i, arrayList, (b13) this.r);
                this.p = 1;
                cd4Var.getClass();
                cd4.k(cd4Var, lv0Var, this);
                return xe0Var10;
            case 10:
                xe0 xe0Var11 = xe0.n;
                int i13 = this.p;
                if (i13 == 0) {
                    kb4.X(obj);
                    sn3 sn3Var = (sn3) this.q;
                    j82 j82Var = new j82((lm0) this.r, null);
                    this.p = 1;
                    if (xl.g(sn3Var, j82Var, this) == xe0Var11) {
                        return xe0Var11;
                    }
                } else {
                    if (i13 != 1) {
                        kf2.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kb4.X(obj);
                }
                return j15.a;
            case 11:
                xe0 xe0Var12 = xe0.n;
                int i14 = this.p;
                if (i14 == 0) {
                    kb4.X(obj);
                    ll4 ll4Var = (ll4) this.q;
                    fc0 fc0Var = new fc0(2, (rx2) this.r);
                    this.p = 1;
                    if (ll4Var.a(fc0Var, this) == xe0Var12) {
                        return xe0Var12;
                    }
                } else {
                    if (i14 != 1) {
                        kf2.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kb4.X(obj);
                }
                er1.a();
                return null;
            case 12:
                hy2 hy2Var = (hy2) this.r;
                xe0 xe0Var13 = xe0.n;
                int i15 = this.p;
                try {
                    if (i15 == 0) {
                        kb4.X(obj);
                        we0Var = (we0) this.q;
                        if (gb.L(we0Var.e())) {
                            hy2Var.h = null;
                            return j15.a;
                        }
                        aw awVar = hy2Var.g;
                        this.q = we0Var;
                        this.p = 1;
                        awVar.getClass();
                        objH = aw.H(awVar, this);
                        if (objH == xe0Var13) {
                            we0Var2 = we0Var;
                            obj = objH;
                            cy2 cy2Var = (cy2) obj;
                            float fM = ((oo0) hy2Var.d).M(6.0f);
                            float fM2 = ((oo0) hy2Var.d).M(1.0f);
                            g74 g74Var = (g74) hy2Var.b;
                            this.q = we0Var2;
                            this.p = 2;
                            pVar = this;
                            break;
                        }
                        return xe0Var13;
                    }
                    if (i15 == 1) {
                        we0Var2 = (we0) this.q;
                        kb4.X(obj);
                        cy2 cy2Var2 = (cy2) obj;
                        float fM3 = ((oo0) hy2Var.d).M(6.0f);
                        float fM4 = ((oo0) hy2Var.d).M(1.0f);
                        g74 g74Var2 = (g74) hy2Var.b;
                        this.q = we0Var2;
                        this.p = 2;
                        pVar = this;
                    } else {
                        if (i15 != 2) {
                            kf2.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        we0Var2 = (we0) this.q;
                        kb4.X(obj);
                        pVar = this;
                    }
                    break;
                    we0Var = we0Var2;
                    this = pVar;
                    if (gb.L(we0Var.e())) {
                        hy2Var.h = null;
                        return j15.a;
                    }
                    aw awVar2 = hy2Var.g;
                    this.q = we0Var;
                    this.p = 1;
                    awVar2.getClass();
                    objH = aw.H(awVar2, this);
                    if (objH == xe0Var13) {
                        we0Var2 = we0Var;
                        obj = objH;
                        cy2 cy2Var3 = (cy2) obj;
                        float fM5 = ((oo0) hy2Var.d).M(6.0f);
                        float fM6 = ((oo0) hy2Var.d).M(1.0f);
                        g74 g74Var3 = (g74) hy2Var.b;
                        this.q = we0Var2;
                        this.p = 2;
                        pVar = this;
                        break;
                    }
                    return xe0Var13;
                } catch (Throwable th3) {
                    hy2Var.h = null;
                    throw th3;
                }
            case 13:
                xe0 xe0Var14 = xe0.n;
                int i16 = this.p;
                if (i16 == 0) {
                    kb4.X(obj);
                    this.p = 1;
                    if (au0.j(1000L, this) == xe0Var14) {
                        return xe0Var14;
                    }
                } else {
                    if (i16 != 1) {
                        kf2.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kb4.X(obj);
                }
                cx.f().b(lc5.a, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after 1000 ms");
                ((rq3) this.r).d(new sc0(7));
                return j15.a;
            case 14:
                xe0 xe0Var15 = xe0.n;
                int i17 = this.p;
                if (i17 == 0) {
                    kb4.X(obj);
                    g74 g74Var4 = (g74) ((ir2) this.q).b;
                    h13 h13Var = h13.o;
                    wf1 wf1Var3 = (wf1) this.r;
                    this.p = 1;
                    if (g74Var4.g(h13Var, wf1Var3, this) == xe0Var15) {
                        return xe0Var15;
                    }
                } else {
                    if (i17 != 1) {
                        kf2.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kb4.X(obj);
                }
                return j15.a;
            case 15:
                xe0 xe0Var16 = xe0.n;
                int i18 = this.p;
                if (i18 != 0) {
                    if (i18 != 1) {
                        kf2.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    s22Var = (s22) this.q;
                    try {
                        kb4.X(obj);
                        s22Var.f(null);
                        return obj;
                    } catch (Throwable th4) {
                        th = th4;
                        s22Var.f(null);
                        throw th;
                    }
                }
                kb4.X(obj);
                sk4 sk4VarG = fu.G((we0) this.q, null, null, new ac0(i2, vd0Var), 3);
                try {
                    y00 y00Var = (y00) this.r;
                    this.q = sk4VarG;
                    this.p = 1;
                    Object objH2 = y00Var.h(this);
                    if (objH2 == xe0Var16) {
                        return xe0Var16;
                    }
                    obj = objH2;
                    s22Var = sk4VarG;
                    s22Var.f(null);
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    s22Var = sk4VarG;
                    s22Var.f(null);
                    throw th;
                }
            case WaveRetry.MAX_FAILURES /* 16 */:
                xe0 xe0Var17 = xe0.n;
                int i19 = this.p;
                if (i19 == 0) {
                    kb4.X(obj);
                    zu0 zu0Var = (zu0) this.q;
                    float f = zu0Var.b ? -1.0f : 1.0f;
                    g74 g74Var5 = ((z64) this.r).e0;
                    long j = zu0Var.a;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
                    long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                    long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat2);
                    this.p = 1;
                    if (g74Var5.c((jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), false, this) == xe0Var17) {
                        return xe0Var17;
                    }
                } else {
                    if (i19 != 1) {
                        kf2.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kb4.X(obj);
                }
                return j15.a;
            case 17:
                gf1 gf1Var = (gf1) this.r;
                xe0 xe0Var18 = xe0.n;
                int i20 = this.p;
                try {
                    if (i20 == 0) {
                        kb4.X(obj);
                        jy4 jy4Var = (jy4) this.q;
                        this.p = 1;
                        obj = jy4.b(jy4Var, this);
                        if (obj == xe0Var18) {
                            return xe0Var18;
                        }
                    } else {
                        if (i20 != 1) {
                            kf2.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kb4.X(obj);
                    }
                    gf1Var.invoke();
                    return j15.a;
                } catch (Throwable th6) {
                    gf1Var.invoke();
                    throw th6;
                }
            case 18:
                xe0 xe0Var19 = xe0.n;
                int i21 = this.p;
                if (i21 == 0) {
                    kb4.X(obj);
                    Object obj3 = this.q;
                    q81 q81Var2 = (q81) this.r;
                    this.p = 1;
                    if (q81Var2.b(obj3, this) == xe0Var19) {
                        return xe0Var19;
                    }
                } else {
                    if (i21 != 1) {
                        kf2.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kb4.X(obj);
                }
                return j15.a;
            default:
                j15 j15Var2 = j15.a;
                tv3 tv3Var = (tv3) this.q;
                View view = (View) this.r;
                xe0 xe0Var20 = xe0.n;
                int i22 = this.p;
                try {
                    if (i22 == 0) {
                        kb4.X(obj);
                        this.p = 1;
                        Object objQ = ya4.q(tv3Var.u, new pv3(i2, vd0Var, i), this);
                        if (objQ != xe0Var20) {
                            objQ = j15Var2;
                        }
                        if (objQ == xe0Var20) {
                            return xe0Var20;
                        }
                    } else {
                        if (i22 != 1) {
                            kf2.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kb4.X(obj);
                    }
                    if (ic5.a(view) == tv3Var) {
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    }
                    return j15Var2;
                } catch (Throwable th7) {
                    if (ic5.a(view) != tv3Var) {
                        throw th7;
                    }
                    view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    throw th7;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, vd0 vd0Var, int i) {
        super(2, vd0Var);
        this.o = i;
        this.r = obj;
    }
}
