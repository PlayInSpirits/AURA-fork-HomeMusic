package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Map;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ed1 implements w92 {
    public final /* synthetic */ int n = 0;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public ed1(td0 td0Var, ed edVar, tv3 tv3Var, jx3 jx3Var) {
        this.o = td0Var;
        this.p = edVar;
        this.q = tv3Var;
        this.r = jx3Var;
    }

    @Override // defpackage.w92
    public final void b(ba2 ba2Var, q92 q92Var) {
        Bundle bundle;
        boolean z;
        switch (this.n) {
            case 0:
                ld1 ld1Var = (ld1) this.r;
                Map map = ld1Var.k;
                String str = (String) this.o;
                if (q92Var == q92.ON_START && (bundle = (Bundle) map.get(str)) != null) {
                    ((zd1) this.p).d(str, bundle);
                    map.remove(str);
                    if (ld1.I(2)) {
                        Log.v("FragmentManager", "Clearing fragment result with key ".concat(str));
                    }
                }
                if (q92Var == q92.ON_DESTROY) {
                    ((ea2) this.q).f(this);
                    ld1Var.l.remove(str);
                    return;
                }
                return;
            default:
                az azVarY = null;
                switch (gc5.a[q92Var.ordinal()]) {
                    case 1:
                        fu.G((td0) this.o, null, ze0.q, new x70((jx3) this.r, (tv3) this.q, ba2Var, this, null, 8), 1);
                        return;
                    case 2:
                        ed edVar = (ed) this.p;
                        if (edVar != null) {
                            ll llVar = (ll) edVar.p;
                            synchronized (llVar.p) {
                                try {
                                    synchronized (llVar.p) {
                                        z = llVar.o;
                                    }
                                    if (!z) {
                                        ArrayList arrayList = (ArrayList) llVar.q;
                                        llVar.q = (ArrayList) llVar.r;
                                        llVar.r = arrayList;
                                        llVar.o = true;
                                        int size = arrayList.size();
                                        for (int i = 0; i < size; i++) {
                                            ((vd0) arrayList.get(i)).resumeWith(j15.a);
                                        }
                                        arrayList.clear();
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        tv3 tv3Var = (tv3) this.q;
                        synchronized (tv3Var.c) {
                            if (tv3Var.t) {
                                tv3Var.t = false;
                                azVarY = tv3Var.y();
                            }
                            break;
                        }
                        if (azVarY != null) {
                            ((cz) azVarY).resumeWith(j15.a);
                            return;
                        }
                        return;
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        tv3 tv3Var2 = (tv3) this.q;
                        synchronized (tv3Var2.c) {
                            tv3Var2.t = true;
                        }
                        return;
                    case 4:
                        ((tv3) this.q).x();
                        return;
                    case 5:
                    case 6:
                    case 7:
                        return;
                    default:
                        er1.n();
                        return;
                }
        }
    }

    public ed1(ld1 ld1Var, String str, zd1 zd1Var, ea2 ea2Var) {
        this.r = ld1Var;
        this.o = str;
        this.p = zd1Var;
        this.q = ea2Var;
    }
}
