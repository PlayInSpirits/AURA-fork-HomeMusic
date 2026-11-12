package defpackage;

import android.view.KeyEvent;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import com.eddyizm.tempus.homemusic.HubMe;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.lan.LanReceiverService;
import java.util.ArrayList;
import java.util.List;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fa implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ fa(int i, Object obj, Object obj2) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x022a  */
    /* JADX WARN: Code duplicated, block: B:140:0x0247  */
    /* JADX WARN: Code duplicated, block: B:20:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:212:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0060 A[LOOP:0: B:11:0x002d->B:21:0x0060, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37, types: [cx2] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40, types: [cx2] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26, types: [f13] */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29, types: [f13] */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r7v23 */
    @Override // defpackage.gf1
    public final Object invoke() {
        i94 i94Var;
        c72 c72Var;
        wv3 wv3Var;
        List listG0;
        hg4 hg4VarD;
        int i = this.n;
        u73 u73Var = null;
        j15 j15Var = j15.a;
        Object obj = this.p;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                return Boolean.valueOf(ra.c((ra) obj2, (KeyEvent) obj));
            case 1:
                p64 p64Var = (p64) obj2;
                ya yaVar = (ya) obj;
                h64 h64Var = p64Var.r;
                h64 h64Var2 = p64Var.s;
                Float f = p64Var.p;
                Float f2 = p64Var.q;
                float fFloatValue = (h64Var == null || f == null) ? 0.0f : ((Number) h64Var.a.invoke()).floatValue() - f.floatValue();
                float fFloatValue2 = (h64Var2 == null || f2 == null) ? 0.0f : ((Number) h64Var2.a.invoke()).floatValue() - f2.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iA = yaVar.A(p64Var.n);
                    k94 k94Var = (k94) yaVar.s().b(yaVar.x);
                    if (k94Var != null) {
                        try {
                            v3 v3Var = yaVar.z;
                            if (v3Var != null) {
                                v3Var.a.setBoundsInScreen(yaVar.k(k94Var));
                            }
                            break;
                        } catch (IllegalStateException unused) {
                        }
                    }
                    k94 k94Var2 = (k94) yaVar.s().b(yaVar.y);
                    if (k94Var2 != null) {
                        try {
                            v3 v3Var2 = yaVar.A;
                            if (v3Var2 != null) {
                                v3Var2.a.setBoundsInScreen(yaVar.k(k94Var2));
                            }
                            break;
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    yaVar.q.invalidate();
                    k94 k94Var3 = (k94) yaVar.s().b(iA);
                    if (k94Var3 != null && (i94Var = k94Var3.a) != null && (c72Var = i94Var.c) != null) {
                        if (h64Var != null) {
                            yaVar.C.i(iA, h64Var);
                        }
                        if (h64Var2 != null) {
                            yaVar.D.i(iA, h64Var2);
                        }
                        yaVar.w(c72Var);
                    }
                }
                if (h64Var != null) {
                    p64Var.p = (Float) h64Var.a.invoke();
                }
                if (h64Var2 != null) {
                    p64Var.q = (Float) h64Var2.a.invoke();
                }
                return j15Var;
            case 2:
                vo voVar = (vo) obj2;
                e72 e72Var = (e72) obj;
                voVar.H = voVar.C.a(e72Var.n.P(), e72Var.getLayoutDirection(), e72Var);
                return j15Var;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                gf1 gf1Var = (gf1) obj2;
                f63 f63Var = (f63) obj;
                if (gf1Var != null && (wv3Var = (wv3) gf1Var.invoke()) != null) {
                    return wv3Var;
                }
                if (!f63Var.A0().A) {
                    f63Var = null;
                }
                if (f63Var != null) {
                    return bu.d(0L, l93.o0(f63Var.p));
                }
                return null;
            case 4:
                rg1 rg1Var = ((x80) obj2).n;
                ig4 ig4Var = rg1Var.c;
                hg4 hg4VarD2 = ig4Var.d();
                int i2 = 0;
                while (true) {
                    try {
                        if (i2 < ig4Var.o) {
                            if (hg4VarD2.l(i2)) {
                                Object objN = hg4VarD2.n(i2);
                                if (objN != obj) {
                                    wg1 wg1Var = objN instanceof wg1 ? (wg1) objN : null;
                                    if ((wg1Var != null ? wg1Var.a : null) == obj) {
                                    }
                                }
                                u73 u73Var2 = new u73(i2, null);
                                hg4VarD2.c();
                                u73Var = u73Var2;
                                if (u73Var != null) {
                                    int i3 = u73Var.a;
                                    Integer num = u73Var.b;
                                    hg4VarD = ig4Var.d();
                                    try {
                                        ArrayList arrayListH = gh0.H(hg4VarD, i3, num);
                                        hg4VarD.c();
                                        listG0 = q40.G0(arrayListH, rg1Var.A());
                                    } catch (Throwable th) {
                                        hg4VarD.c();
                                        throw th;
                                    }
                                } else {
                                    listG0 = u01.n;
                                }
                                return new c80(listG0, rg1Var.C);
                            }
                            int[] iArr = hg4VarD2.b;
                            int i4 = i2 + 1;
                            int iB = (i4 < hg4VarD2.c ? iArr[(i4 * 5) + 4] : hg4VarD2.e) - kg4.b(iArr, i2);
                            int i5 = 0;
                            while (true) {
                                if (i5 >= iB) {
                                    i2 = i4;
                                } else {
                                    Object objH = hg4VarD2.h(i2, i5);
                                    if (objH != obj) {
                                        wg1 wg1Var2 = objH instanceof wg1 ? (wg1) objH : null;
                                        if ((wg1Var2 != null ? wg1Var2.a : null) != obj) {
                                            i5++;
                                        }
                                    }
                                    u73Var = new u73(i2, Integer.valueOf(i5));
                                }
                            }
                        }
                        hg4VarD2.c();
                        if (u73Var != null) {
                            int i6 = u73Var.a;
                            Integer num2 = u73Var.b;
                            hg4VarD = ig4Var.d();
                            ArrayList arrayListH2 = gh0.H(hg4VarD, i6, num2);
                            hg4VarD.c();
                            listG0 = q40.G0(arrayListH2, rg1Var.A());
                        } else {
                            listG0 = u01.n;
                        }
                        return new c80(listG0, rg1Var.C);
                    } catch (Throwable th2) {
                        hg4VarD2.c();
                        throw th2;
                    }
                }
            case 5:
                ((jx3) obj2).n = ((ba1) obj).s0();
                return j15Var;
            case 6:
                ((jx3) obj2).n = kb4.q((ea1) obj, fg3.a);
                return j15Var;
            case 7:
                ((cm1) obj2).d((cx2) obj);
                return j15Var;
            case 8:
                String str = (String) obj2;
                String str2 = (String) obj;
                rr1 rr1Var = rr1.a;
                String username = ((HubMe) rr1.s(lg2.X(new kd3("username", str), new kd3("password", str2)), "/api/auth/login", HubMe.class)).getUsername();
                if (username != null) {
                    str = username;
                }
                return new kd3(str, str2);
            case 9:
                j52 j52Var = (j52) obj;
                bl2 bl2Var = ((LanReceiverService) obj2).v;
                if (bl2Var != null) {
                    ((bj2) bl2Var.get()).v(j52Var);
                    return j15Var;
                }
                h12.Q("browserFuture");
                throw null;
            case 10:
                jx3 jx3Var = (jx3) obj;
                w12 w12Var = ((c72) obj2).Q;
                if ((((cx2) w12Var.g).q & 8) != 0) {
                    for (cx2 cx2Var = (sq4) w12Var.f; cx2Var != null; cx2Var = cx2Var.r) {
                        if ((cx2Var.p & 8) != 0) {
                            ?? C = cx2Var;
                            ?? f13Var = 0;
                            while (C != 0) {
                                if (C instanceof g94) {
                                    g94 g94Var = (g94) C;
                                    if (g94Var.u()) {
                                        e94 e94Var = new e94();
                                        jx3Var.n = e94Var;
                                        e94Var.q = true;
                                    }
                                    if (g94Var.d0()) {
                                        ((e94) jx3Var.n).p = true;
                                    }
                                    g94Var.c0((q94) jx3Var.n);
                                } else if ((C.p & 8) != 0 && (C instanceof fo0)) {
                                    cx2 cx2Var2 = ((fo0) C).C;
                                    int i7 = 0;
                                    while (cx2Var2 != null) {
                                        if ((cx2Var2.p & 8) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                C = C;
                                                f13Var = f13Var;
                                                f13Var = f13Var;
                                                C = cx2Var2;
                                            } else {
                                                if (f13Var == 0) {
                                                    f13Var = new f13(new cx2[16]);
                                                }
                                                if (C != 0) {
                                                    f13Var.b(C);
                                                    C = 0;
                                                }
                                                f13Var.b(cx2Var2);
                                            }
                                        } else {
                                            C = C;
                                            f13Var = f13Var;
                                        }
                                        cx2Var2 = cx2Var2.s;
                                        C = C;
                                        f13Var = f13Var;
                                    }
                                    if (i7 == 1) {
                                        C = C;
                                        f13Var = f13Var;
                                    } else {
                                        C = C;
                                        f13Var = f13Var;
                                    }
                                }
                                C = j51.c(f13Var);
                            }
                        }
                    }
                }
                return j15Var;
            case 11:
                lm0 lm0Var = (lm0) obj;
                lc3 lc3Var = (lc3) ((dp0) obj2).getValue();
                return new nc3(lm0Var, lc3Var, new ue1((j02) ((g82) lm0Var.d.s).getValue(), lc3Var));
            case 12:
                return new z82((x44) obj2, v01.n, (w44) obj);
            case 13:
                ArrayAdapter arrayAdapter = (ArrayAdapter) obj2;
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) obj;
                if (arrayAdapter.getCount() > 0) {
                    arrayAdapter.getFilter().filter(null);
                    autoCompleteTextView.showDropDown();
                }
                return j15Var;
            case 14:
                mv3 mv3Var = (mv3) obj;
                if (((fl) ((jv3) obj2).n).get() == 0) {
                    mv3Var.invoke();
                }
                return j15Var;
            case 15:
                x03 x03Var = (x03) obj2;
                z80 z80Var = (z80) obj;
                Object[] objArr = x03Var.b;
                long[] jArr = x03Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j = jArr[i8];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8 - ((~(i8 - length)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((255 & j) < 128) {
                                    z80Var.z(objArr[(i8 << 3) + i10]);
                                }
                                j >>= 8;
                            }
                            if (i9 == 8) {
                                if (i8 != length) {
                                    i8++;
                                }
                            }
                        } else if (i8 != length) {
                            i8++;
                        }
                    }
                }
                return j15Var;
            case WaveRetry.MAX_FAILURES /* 16 */:
                ((b0) obj2).removeOnAttachStateChangeListener((vc1) obj);
                return j15Var;
            default:
                ((ea2) obj2).f((pd1) obj);
                return j15Var;
        }
    }
}
