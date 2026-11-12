package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q31 implements qc2, r83, lm2, wc0, f4 {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;

    public /* synthetic */ q31(int i, va4 va4Var, Bundle bundle) {
        this.n = 4;
        this.o = i;
        this.p = va4Var;
    }

    @Override // defpackage.wc0
    public void accept(Object obj) {
        m92 m92VarB;
        fr2 fr2Var = (fr2) this.p;
        int i = this.o;
        try {
            m92VarB = (m92) ((ic2) obj).get();
            rr2.s(m92VarB, "LibraryResult must not be null");
        } catch (InterruptedException e) {
            e = e;
            l93.r0("MediaSessionStub", "Library operation failed", e);
            m92VarB = m92.b(-1);
        } catch (CancellationException e2) {
            l93.r0("MediaSessionStub", "Library operation cancelled", e2);
            m92VarB = m92.b(1);
        } catch (ExecutionException e3) {
            e = e3;
            l93.r0("MediaSessionStub", "Library operation failed", e);
            m92VarB = m92.b(-1);
        }
        try {
            er2 er2Var = fr2Var.d;
            er2Var.getClass();
            er2Var.r(i, m92VarB);
        } catch (RemoteException e4) {
            l93.r0("MediaSessionStub", "Failed to send result to browser " + fr2Var, e4);
        }
    }

    @Override // defpackage.lm2
    public void c(bm2 bm2Var) {
        int i = this.n;
        gq0 gq0Var = gq0.n;
        int i2 = 6;
        Object obj = this.p;
        int i3 = this.o;
        switch (i) {
            case 2:
                yw1 yw1Var = (yw1) obj;
                if (bm2Var.Y()) {
                    gy3 gy3Var = bm2Var.u;
                    gy3 gy3Var2 = bm2Var.v;
                    bm2Var.t = yw1.k(yw1Var);
                    gy3 gy3VarU1 = bm2.u1(yw1Var, bm2Var.s, bm2Var.w, bm2Var.z, bm2Var.I);
                    bm2Var.u = gy3VarU1;
                    bm2Var.v = bm2.t1(gy3VarU1, bm2Var.s, bm2Var.I, bm2Var.w, bm2Var.z);
                    boolean zEquals = bm2Var.u.equals(gy3Var);
                    bm2Var.v.equals(gy3Var2);
                    sk2 sk2VarF1 = bm2Var.f1();
                    sk2VarF1.getClass();
                    rr2.w(Looper.myLooper() == sk2VarF1.f.getLooper());
                    qk2 qk2Var = sk2VarF1.e;
                    qk2Var.getClass();
                    mw1 mw1Var = new mw1(new ab4(-6));
                    if (!zEquals) {
                        qk2Var.u();
                    }
                    mw1Var.f(new gk(bm2Var, mw1Var, i3, i2), gq0Var);
                    break;
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                List list = (List) obj;
                if (bm2Var.Y()) {
                    gy3 gy3Var3 = bm2Var.u;
                    gy3 gy3Var4 = bm2Var.v;
                    bm2Var.s = yw1.k(list);
                    gy3 gy3VarU2 = bm2.u1(bm2Var.t, list, bm2Var.w, bm2Var.z, bm2Var.I);
                    bm2Var.u = gy3VarU2;
                    bm2Var.v = bm2.t1(gy3VarU2, list, bm2Var.I, bm2Var.w, bm2Var.z);
                    boolean zEquals2 = bm2Var.u.equals(gy3Var3);
                    bm2Var.v.equals(gy3Var4);
                    sk2 sk2VarF2 = bm2Var.f1();
                    sk2VarF2.getClass();
                    rr2.w(Looper.myLooper() == sk2VarF2.f.getLooper());
                    qk2 qk2Var2 = sk2VarF2.e;
                    qk2Var2.getClass();
                    mw1 mw1Var2 = new mw1(new ab4(-6));
                    if (!zEquals2) {
                        qk2Var2.u();
                    }
                    mw1Var2.f(new gk(bm2Var, mw1Var2, i3, i2), gq0Var);
                    break;
                }
                break;
            default:
                va4 va4Var = (va4) obj;
                if (bm2Var.Y()) {
                    sk2 sk2VarF3 = bm2Var.f1();
                    sk2VarF3.getClass();
                    rr2.w(Looper.myLooper() == sk2VarF3.f.getLooper());
                    mw1 mw1VarY = sk2VarF3.e.y(va4Var);
                    mw1VarY.f(new gk(bm2Var, mw1VarY, i3, i2), gq0Var);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.f4
    public boolean h(View view) {
        ((SideSheetBehavior) this.p).w(this.o);
        return true;
    }

    @Override // defpackage.qc2
    public void invoke(Object obj) {
        switch (this.n) {
            case 0:
                ((oi3) obj).I(((ph3) this.p).a, this.o);
                break;
            default:
                ((oi3) obj).I(((pe4) this.p).w, this.o);
                break;
        }
    }

    @Override // defpackage.r83
    public pb5 x(View view, pb5 pb5Var) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p;
        marginLayoutParams.bottomMargin = this.o + pb5Var.a.h(2).d;
        view.setLayoutParams(marginLayoutParams);
        return pb5Var;
    }

    public /* synthetic */ q31(int i, gy3 gy3Var, int i2) {
        this.n = i2;
        this.o = i;
        this.p = gy3Var;
    }

    public /* synthetic */ q31(int i, int i2, Object obj) {
        this.n = i2;
        this.p = obj;
        this.o = i;
    }
}
