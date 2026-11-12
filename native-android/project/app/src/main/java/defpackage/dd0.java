package defpackage;

import android.content.Context;
import com.bumptech.glide.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dd0 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ dd0(gd0 gd0Var, b25 b25Var, s22 s22Var, e74 e74Var) {
        this.n = 0;
        this.o = gd0Var;
        this.p = s22Var;
        this.q = e74Var;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x011d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x011f A[LOOP:0: B:36:0x00d9->B:49:0x011f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x0136 A[SYNTHETIC] */
    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        Object objG;
        int i = this.n;
        boolean zBooleanValue = false;
        j15 j15Var = j15.a;
        Object obj2 = this.q;
        Object obj3 = this.p;
        Object obj4 = this.o;
        switch (i) {
            case 0:
                gd0 gd0Var = (gd0) obj4;
                s22 s22Var = (s22) obj3;
                e74 e74Var = (e74) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                float f = gd0Var.D ? 1.0f : -1.0f;
                g74 g74Var = gd0Var.C;
                long jF = g74Var.f(g74Var.i(f * fFloatValue));
                g74 g74Var2 = e74Var.a;
                float fH = g74Var.h(g74Var.f(g74Var2.d(g74Var2.k, jF, 1))) * f;
                if (Math.abs(fH) < Math.abs(fFloatValue)) {
                    CancellationException cancellationException = new CancellationException(xa3.f("Scroll animation cancelled because scroll was not consumed (", fH, " < ", fFloatValue, ")"));
                    cancellationException.initCause(null);
                    s22Var.f(cancellationException);
                }
                return j15Var;
            case 1:
                gx3 gx3Var = (gx3) obj4;
                vd vdVar = (vd) obj;
                float fFloatValue2 = ((Number) vdVar.e.getValue()).floatValue() - gx3Var.n;
                float fA = ((c74) obj3).a(fFloatValue2);
                gx3Var.n = ((Number) vdVar.e.getValue()).floatValue();
                ((gx3) obj2).n = ((Number) ((if1) vdVar.a.p).invoke(vdVar.f)).floatValue();
                if (Math.abs(fFloatValue2 - fA) > 0.5f) {
                    vdVar.a();
                }
                return j15Var;
            case 2:
                ey eyVar = (ey) obj3;
                if1 if1Var = (if1) obj2;
                ba1 ba1Var = (ba1) obj;
                if (!h12.c(ba1Var, (ba1) obj4)) {
                    if (h12.c(ba1Var, (ba1) eyVar.c)) {
                        kf2.o("Focus search landed at the root.");
                        return null;
                    }
                    zBooleanValue = ((Boolean) if1Var.invoke(ba1Var)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                kz2 kz2Var = (kz2) obj3;
                jx3 jx3Var = (jx3) obj2;
                if (((Set) obj4).contains(obj) && (objG = kz2Var.b.g(obj)) != null) {
                    if (objG instanceof x03) {
                        x03 x03Var = (x03) objG;
                        Object[] objArr = x03Var.b;
                        long[] jArr = x03Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i2 = 0;
                            while (true) {
                                long j = jArr[i2];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                                    for (int i4 = 0; i4 < i3; i4++) {
                                        if ((255 & j) < 128) {
                                            y94 y94Var = (y94) objArr[(i2 << 3) + i4];
                                            if (jx3Var.n == null) {
                                                jx3Var.n = new ArrayList();
                                            }
                                            ((List) jx3Var.n).add(y94Var);
                                        }
                                        j >>= 8;
                                    }
                                    if (i3 == 8) {
                                        if (i2 != length) {
                                            i2++;
                                        }
                                    }
                                } else if (i2 != length) {
                                    i2++;
                                }
                            }
                        }
                    } else {
                        y94 y94Var2 = (y94) objG;
                        if (jx3Var.n == null) {
                            jx3Var.n = new ArrayList();
                        }
                        ((List) jx3Var.n).add(y94Var2);
                    }
                }
                return j15Var;
            case 4:
                String str = (String) obj4;
                Context context = (Context) obj3;
                b13 b13Var = (b13) obj2;
                ((yr0) obj).getClass();
                if (str == null || str.length() == 0) {
                    b13Var.setValue(null);
                    return new j73();
                }
                String strB = wg0.b(ud3.t(), str);
                wq4 i73Var = new i73(b13Var, 1);
                vz3 vz3Var = (vz3) a.c(context).g().P(strB).e(wg0.b);
                vz3Var.J(i73Var, null, vz3Var, fh0.g);
                return new vy1(3, context, i73Var);
            case 5:
                w44 w44Var = (w44) obj4;
                a54 a54Var = (a54) obj2;
                w03 w03Var = w44Var.o;
                if (w03Var.b(obj3)) {
                    nz2.k(obj3, " was used multiple times ", "Key ");
                    return null;
                }
                w44Var.n.remove(obj3);
                w03Var.l(obj3, a54Var);
                return new v44(w44Var, obj3, a54Var);
            default:
                jx3 jx3Var2 = (jx3) obj3;
                lu2 lu2Var = (lu2) obj2;
                ad2 ad2Var = (ad2) ((if1) obj4).invoke(obj);
                Object obj5 = jx3Var2.n;
                if (obj5 != ad2Var) {
                    if (obj5 != null) {
                        ku2 ku2Var = (ku2) lu2Var.l.b((ad2) obj5);
                        if (ku2Var != null) {
                            ku2Var.a.j(ku2Var);
                        }
                    }
                    jx3Var2.n = ad2Var;
                    if (ad2Var != null) {
                        lu2Var.l(ad2Var, new ht1(new kl3(13, lu2Var), 2));
                    }
                }
                return j15Var;
        }
    }

    public /* synthetic */ dd0(gx3 gx3Var, c74 c74Var, gx3 gx3Var2, uk0 uk0Var) {
        this.n = 1;
        this.o = gx3Var;
        this.p = c74Var;
        this.q = gx3Var2;
    }

    public /* synthetic */ dd0(Object obj, Object obj2, Object obj3, int i) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
        this.q = obj3;
    }
}
