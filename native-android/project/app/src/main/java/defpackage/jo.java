package defpackage;

import com.google.android.material.textfield.TextInputEditText;
import java.util.List;
import java.util.Locale;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jo implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ jo(rg1 rg1Var, w00 w00Var, hg4 hg4Var, jy2 jy2Var) {
        this.n = 3;
        this.o = rg1Var;
        this.p = w00Var;
        this.q = hg4Var;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int i;
        gd0 gd0Var;
        wv3 wv3Var;
        boolean zS0;
        wv3 wv3VarS;
        wv3 wv3VarS2;
        int i2 = this.n;
        j15 j15Var = j15.a;
        Object obj = this.q;
        Object obj2 = this.p;
        Object obj3 = this.o;
        switch (i2) {
            case 0:
                ((ko) obj3).a();
                fl flVar = (fl) ((z40) obj2).p;
                int i3 = ((hx3) obj).n;
                do {
                    i = flVar.get();
                } while (!flVar.compareAndSet(i, ((i >>> 27) & 15) == i3 ? i - 1 : i));
                return j15Var;
            case 1:
                cv cvVar = (cv) obj3;
                wv3 wv3VarQ0 = cv.q0(cvVar, (f63) obj2, (fa) obj);
                if (wv3VarQ0 == null) {
                    return null;
                }
                gd0 gd0Var2 = cvVar.B;
                if (n02.a(gd0Var2.I, -1L)) {
                    fz1.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return wv3VarQ0.f(gd0Var2.u0(wv3VarQ0, gd0Var2.r0(), 0L) ^ (-9223372034707292160L));
            case 2:
                gd0 gd0Var3 = (gd0) obj3;
                b25 b25Var = (b25) obj2;
                fv fvVar = (fv) obj;
                zg5 zg5Var = gd0Var3.G;
                while (true) {
                    f13 f13Var = (f13) zg5Var.n;
                    int i4 = f13Var.p;
                    if (i4 == 0) {
                        gd0Var = gd0Var3;
                    } else {
                        if (i4 == 0) {
                            kf2.m("MutableVector is empty.");
                            return null;
                        }
                        wv3 wv3Var2 = (wv3) ((cd0) f13Var.n[i4 - 1]).a.invoke();
                        if (wv3Var2 == null) {
                            gd0Var = gd0Var3;
                            zS0 = true;
                        } else {
                            gd0Var = gd0Var3;
                            zS0 = gd0.s0(gd0Var, wv3Var2, 0L, 0L, 3);
                        }
                        if (zS0) {
                            f13 f13Var2 = (f13) zg5Var.n;
                            ((cd0) f13Var2.k(f13Var2.p - 1)).b.resumeWith(j15Var);
                            gd0Var3 = gd0Var;
                        }
                    }
                }
                if (gd0Var.H && (wv3Var = (wv3) gd0Var.F.invoke()) != null && gd0.s0(gd0Var, wv3Var, 0L, 0L, 3)) {
                    gd0Var.H = false;
                }
                b25Var.e = gd0.q0(gd0Var, fvVar, 0L);
                return j15Var;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                rg1 rg1Var = (rg1) obj3;
                w00 w00Var = (w00) obj2;
                hg4 hg4Var = (hg4) obj;
                k80 k80Var = rg1Var.M;
                w00 w00Var2 = k80Var.b;
                try {
                    k80Var.b = w00Var;
                    hg4 hg4Var2 = rg1Var.G;
                    int[] iArr = rg1Var.o;
                    i03 i03Var = rg1Var.v;
                    rg1Var.o = null;
                    rg1Var.v = null;
                    try {
                        rg1Var.G = hg4Var;
                        boolean z = k80Var.e;
                        try {
                            k80Var.e = false;
                            throw null;
                        } catch (Throwable th) {
                            k80Var.e = z;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        rg1Var.G = hg4Var2;
                        rg1Var.o = iArr;
                        rg1Var.v = i03Var;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    k80Var.b = w00Var2;
                    throw th3;
                }
            case 4:
                fo1 fo1Var = (fo1) obj3;
                String str = (String) obj;
                fo1Var.f = (String) obj2;
                fo1Var.g = str;
                TextInputEditText textInputEditText = ((uc1) fo1Var.c).z;
                if (str == null) {
                    str = "";
                }
                String lowerCase = qm4.H0(str, '@').toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                StringBuilder sb = new StringBuilder();
                int length = lowerCase.length();
                for (int i5 = 0; i5 < length; i5++) {
                    char cCharAt = lowerCase.charAt(i5);
                    if (Character.isLetterOrDigit(cCharAt) || qm4.n0("._-", cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                textInputEditText.setText(qm4.J0(32, sb.toString()));
                fo1Var.s(co1.p);
                return j15Var;
            case 5:
                return new lc3((yf1) ((b13) obj3).getValue(), (if1) ((b13) obj2).getValue(), ((Number) ((gf1) obj).invoke()).intValue());
            case 6:
                wf1 wf1Var = (wf1) obj3;
                rp1 rp1Var = (rp1) obj;
                cf2 cf2Var = (cf2) ((jx3) obj2).n;
                w03 w03Var = cf2Var.z;
                if (w03Var == null) {
                    long[] jArr = v54.a;
                    w03Var = new w03();
                    cf2Var.z = w03Var;
                }
                Object objG = w03Var.g(rp1Var);
                if (objG == null) {
                    objG = new af2(cf2Var);
                    w03Var.l(rp1Var, objG);
                }
                af2 af2Var = (af2) objG;
                af2Var.n = false;
                wf1Var.invoke(af2Var, rp1Var);
                return j15Var;
            case 7:
                f63 f63Var = (f63) obj2;
                fx3 fx3Var = (fx3) obj;
                b24 b24Var = f63.j0;
                ((if1) obj3).invoke(b24Var);
                boolean zC = h12.c(f63Var.W, b24Var.v);
                i5 = f63Var.Z != b24Var.w ? 1 : 0;
                ya4 ya4VarA = b24Var.v.a(b24Var.x, b24Var.A, b24Var.z);
                b24Var.C = ya4VarA;
                boolean zC2 = h12.c(f63Var.Y, ya4VarA.s());
                fx3Var.n = !zC2;
                if (!zC || i5 != 0 || !zC2) {
                    f63Var.W = b24Var.v;
                    f63Var.Z = b24Var.w;
                    ya4 ya4Var = b24Var.C;
                    wv3 wv3Var3 = wv3.e;
                    if (ya4Var == null || (wv3VarS = ya4Var.s()) == null) {
                        wv3VarS = wv3Var3;
                    }
                    f63Var.Y = wv3VarS;
                    ya4 ya4Var2 = b24Var.C;
                    if (ya4Var2 != null && (wv3VarS2 = ya4Var2.s()) != null) {
                        k02 k02VarQ = rr2.Q(wv3VarS2);
                        wv3Var3 = new wv3(k02VarQ.a, k02VarQ.b, k02VarQ.c, k02VarQ.d);
                    }
                    f63Var.X = wv3Var3;
                    if (f63Var.a0 && (i5 != 0 || (f63Var.Z && !zC))) {
                        f63Var.H.E();
                    }
                }
                f63Var.a0 = true;
                return j15Var;
            case 8:
                mg1 mg1Var = (mg1) obj3;
                lg4 lg4Var = (lg4) obj2;
                wa3 wa3Var = (wa3) obj;
                if (mg1Var != null) {
                    lg4Var.a(lg4Var.c(mg1Var) - lg4Var.t);
                }
                List listD = gh0.d(lg4Var, null, lg4Var.t, null);
                d80 d80Var = (d80) q40.D0(listD);
                Integer num = d80Var != null ? d80Var.b : null;
                List listC = wa3Var.c(num);
                if (num != null && !listC.isEmpty()) {
                    listC = q40.G0(gb.O(new d80(((d80) q40.w0(listC)).a, null, num)), q40.u0(listC, 1));
                }
                return new c80(q40.G0(listD, listC), wa3Var.g());
            default:
                b0 b0Var = (b0) obj3;
                b0Var.removeOnAttachStateChangeListener((bc) obj2);
                wr1.A(b0Var).a.remove((k65) obj);
                return j15Var;
        }
    }

    public /* synthetic */ jo(Object obj, Object obj2, Object obj3, int i) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
        this.q = obj3;
    }
}
