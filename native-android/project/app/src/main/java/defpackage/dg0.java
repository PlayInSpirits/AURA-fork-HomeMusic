package defpackage;

import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetDigitalCredentialController;
import androidx.preference.Preference;
import app.homemusic.R;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dg0 implements e93, fz, mn0, cp3, mk, ks2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ dg0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
        this.q = obj3;
        this.r = obj4;
    }

    @Override // defpackage.e93
    public void a(Exception exc) {
        CredentialProviderGetDigitalCredentialController.invokePlayServices$lambda$1((CredentialProviderGetDigitalCredentialController) this.o, (CancellationSignal) this.p, (Executor) this.q, (vf0) this.r, exc);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008a A[PHI: r0
  0x008a: PHI (r0v2 fr2) = (r0v1 fr2), (r0v1 fr2), (r0v11 fr2) binds: [B:14:0x003e, B:16:0x0044, B:32:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.mk
    public ic2 apply(Object obj) {
        Object obj2;
        Boolean bool;
        fr2 fr2Var = (fr2) this.o;
        kn2 kn2Var = (kn2) this.p;
        String str = (String) this.q;
        jn2 jn2Var = (jn2) this.r;
        m92 m92Var = (m92) obj;
        if (m92Var.a != 0 || (obj2 = m92Var.c) == null || (bool = ((gn2) obj2).d.q) == null || !bool.booleanValue()) {
            int i = m92Var.a;
            if (i == 0) {
                i = -3;
            }
            return new mw1(m92.b(i));
        }
        if (fr2Var.b != 0) {
            kn2Var.getClass();
            rr2.l(!TextUtils.isEmpty(str));
            tn2 tn2Var = kn2Var.a;
            if (tn2Var.y && tn2Var.k(fr2Var)) {
                yw1 yw1VarU = tn2Var.h.f.u();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= yw1VarU.size()) {
                        yw1 yw1VarU2 = tn2Var.g.f.u();
                        while (true) {
                            if (i2 >= yw1VarU2.size()) {
                                fr2Var = null;
                                break;
                            }
                            fr2 fr2Var2 = (fr2) yw1VarU2.get(i2);
                            if (tn2.m(fr2Var2)) {
                                fr2Var = fr2Var2;
                                break;
                            }
                            i2++;
                        }
                    } else {
                        fr2 fr2Var3 = (fr2) yw1VarU.get(i3);
                        if (tn2.m(fr2Var3)) {
                            fr2Var = fr2Var3;
                            break;
                        }
                        i3++;
                    }
                }
                if (fr2Var != null) {
                    tn2Var.e(fr2Var, new eg0(tn2Var, str, jn2Var, 6));
                }
            } else {
                tn2Var.e(fr2Var, new eg0(tn2Var, str, jn2Var, 6));
            }
        }
        return new mw1(new m92(0, SystemClock.elapsedRealtime(), null, null, null, 1));
    }

    @Override // defpackage.ks2
    public void b(fr2 fr2Var) {
        ls2 ls2Var = (ls2) this.o;
        va4 va4Var = (va4) this.p;
        Bundle bundle = (Bundle) this.q;
        ResultReceiver resultReceiver = (ResultReceiver) this.r;
        tn2 tn2Var = ls2Var.g;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        ic2 ic2VarQ = tn2Var.q(fr2Var, va4Var, bundle);
        if (resultReceiver != null) {
            ic2VarQ.f(new ur2(1, ic2VarQ, resultReceiver), gq0.n);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    @Override // defpackage.mn0
    public gy3 g(int i, sv4 sv4Var, int[] iArr) {
        int i2;
        int i3;
        int i4;
        int i5;
        sv4 sv4Var2 = sv4Var;
        jn0 jn0Var = (jn0) this.o;
        String str = (String) this.p;
        int[] iArr2 = (int[]) this.q;
        Point point = (Point) this.r;
        int i6 = iArr2[i];
        int i7 = point != null ? point.x : jn0Var.i;
        int i8 = point != null ? point.y : jn0Var.j;
        boolean z = jn0Var.l;
        if (i7 == Integer.MAX_VALUE || i8 == Integer.MAX_VALUE) {
            i2 = Integer.MAX_VALUE;
        } else {
            int i9 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < sv4Var2.a; i10++) {
                tb1 tb1Var = sv4Var2.d[i10];
                int i11 = tb1Var.u;
                int i12 = tb1Var.v;
                if (i11 > 0 && i12 > 0) {
                    if (!z) {
                        i4 = i8;
                        i5 = i7;
                    } else if ((i11 > i12) != (i7 > i8)) {
                        i5 = i8;
                        i4 = i7;
                    } else {
                        i4 = i8;
                        i5 = i7;
                    }
                    int i13 = i11 * i4;
                    int i14 = i12 * i5;
                    Point point2 = i13 >= i14 ? new Point(i5, f35.g(i14, i11)) : new Point(f35.g(i13, i12), i4);
                    int i15 = tb1Var.u;
                    int i16 = i15 * i12;
                    if (i15 >= ((int) (point2.x * 0.98f)) && i12 >= ((int) (point2.y * 0.98f)) && i16 < i9) {
                        i9 = i16;
                    }
                }
            }
            i2 = i9;
        }
        uw1 uw1VarJ = yw1.j();
        int i17 = 0;
        while (i17 < sv4Var2.a) {
            tb1 tb1Var2 = sv4Var2.d[i17];
            int i18 = tb1Var2.u;
            int i19 = (i18 == -1 || (i3 = tb1Var2.v) == -1) ? -1 : i18 * i3;
            uw1VarJ.c(new on0(i, sv4Var2, i17, jn0Var, iArr[i17], str, i6, i2 == Integer.MAX_VALUE || (i19 != -1 && i19 <= i2)));
            i17++;
            sv4Var2 = sv4Var;
        }
        return uw1VarJ.f();
    }

    @Override // defpackage.cp3
    public void j(Preference preference) {
        int i = this.n;
        Object obj = this.r;
        Object obj2 = this.q;
        Object obj3 = this.p;
        Object obj4 = this.o;
        switch (i) {
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                jx3 jx3Var = (jx3) obj4;
                vb4 vb4Var = (vb4) obj3;
                jx3 jx3Var2 = (jx3) obj2;
                Preference preference2 = (Preference) obj;
                String str = (String) jx3Var.n;
                if (str == null) {
                    String str2 = (String) jx3Var2.n;
                    if (str2 != null) {
                        ud3.M(vb4Var.X(), str2, new na4(vb4Var, jx3Var, jx3Var2, preference2));
                        break;
                    }
                } else {
                    vg2 vg2Var = new vg2(vb4Var.Z(), 0);
                    vg2Var.a.f = vb4Var.t(R.string.homemusic_settings_google_unlink, str);
                    vg2Var.l(R.string.homemusic_settings_google_unlink_ok, new vs1(vb4Var, jx3Var, jx3Var2, preference2, 0)).j(android.R.string.cancel, null).h();
                    break;
                }
                break;
            default:
                h62 h62Var = (h62) obj4;
                vg2 vg2VarO = new vg2(h62Var.Z(), 0).o((String) obj3);
                vg2VarO.i(R.string.lan_revoke_question);
                f9 f9VarCreate = vg2VarO.l(R.string.lan_revoke, new rn1((SharedPreferences) obj2, h62Var, (String) obj, 3)).j(android.R.string.cancel, null).create();
                h62Var.U0 = null;
                f9 f9Var = h62Var.K0;
                if (f9Var != null) {
                    f9Var.dismiss();
                }
                h62Var.K0 = f9VarCreate;
                f9VarCreate.show();
                break;
        }
    }

    @Override // defpackage.fz
    public void onCancel() {
        View view = (View) this.o;
        xm0 xm0Var = (xm0) this.p;
        tm0 tm0Var = (tm0) this.q;
        pj4 pj4Var = (pj4) this.r;
        view.clearAnimation();
        xm0Var.a.endViewTransition(view);
        tm0Var.d();
        if (ld1.I(2)) {
            Log.v("FragmentManager", "Animation from operation " + pj4Var + " has been cancelled.");
        }
    }
}
