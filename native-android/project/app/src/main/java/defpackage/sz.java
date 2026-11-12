package defpackage;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sz implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public sz(View view, ta5 ta5Var, qr2 qr2Var, ValueAnimator valueAnimator) {
        this.n = 4;
        this.o = view;
        this.p = ta5Var;
        this.q = qr2Var;
        this.r = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2 = this.n;
        int i3 = 0;
        Object obj = this.r;
        Object obj2 = this.q;
        Object obj3 = this.p;
        Object obj4 = this.o;
        switch (i2) {
            case 0:
                uz uzVar = (uz) ((d34) obj).o;
                tu2 tu2Var = (tu2) obj3;
                tz tzVar = (tz) obj4;
                if (tzVar != null) {
                    uzVar.M = true;
                    tzVar.b.c(false);
                    uzVar.M = false;
                }
                if (tu2Var.isEnabled() && tu2Var.hasSubMenu()) {
                    ((qu2) obj2).q(tu2Var, null, 4);
                    return;
                }
                return;
            case 1:
                bq4 bq4Var = (bq4) obj;
                while (true) {
                    oi oiVar = ((pn2) bq4Var.q).r;
                    if (i3 >= oiVar.p) {
                        return;
                    }
                    oj2 oj2Var = (oj2) oiVar.j(i3);
                    if (oj2Var.d.equals((ms2) obj4)) {
                        bq4Var.o(oj2Var, (String) obj3, (Bundle) obj2);
                    }
                    i3++;
                }
                break;
            case 2:
                String str = (String) obj3;
                pz1 pz1Var = (pz1) obj;
                oj2 oj2Var2 = (oj2) ((pn2) pz1Var.o).r.get(((Messenger) ((hg3) obj4).o).getBinder());
                if (oj2Var2 == null) {
                    xa3.s("removeSubscription for callback that isn't registered id=", str, "MBServiceCompat");
                    return;
                }
                HashMap map = oj2Var2.f;
                pn2 pn2Var = (pn2) pz1Var.o;
                IBinder iBinder = (IBinder) obj2;
                try {
                    if (iBinder == null) {
                        i = map.remove(str) == null ? 0 : 1;
                        pn2Var.s = oj2Var2;
                        pn2Var.f(str);
                        pn2Var.s = null;
                    } else {
                        List list = (List) map.get(str);
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (iBinder == ((ld3) it.next()).a) {
                                    it.remove();
                                    i3 = 1;
                                }
                            }
                            if (list.isEmpty()) {
                                map.remove(str);
                            }
                        }
                        pn2Var.s = oj2Var2;
                        pn2Var.f(str);
                        pn2Var.s = null;
                        i = i3;
                    }
                    if (i == 0) {
                        l93.q0("MBServiceCompat", "removeSubscription called for " + str + " which is not subscribed");
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    pn2Var.s = oj2Var2;
                    pn2Var.f(str);
                    pn2Var.s = null;
                    throw th;
                }
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                String str2 = (String) obj3;
                pz1 pz1Var2 = (pz1) obj;
                oj2 oj2Var3 = (oj2) ((pn2) pz1Var2.o).r.get(((Messenger) ((hg3) obj4).o).getBinder());
                if (oj2Var3 == null) {
                    xa3.s("getMediaItem for callback that isn't registered id=", str2, "MBServiceCompat");
                    return;
                }
                pn2 pn2Var2 = (pn2) pz1Var2.o;
                nj2 nj2Var = new nj2(str2, (v14) obj2, i3);
                pn2Var2.s = oj2Var3;
                pn2Var2.e(str2, nj2Var);
                pn2Var2.s = null;
                if (nj2Var.b()) {
                    return;
                }
                kf2.o(xa3.g("onLoadItem must call detach() or sendResult() before returning for id=", str2));
                return;
            default:
                pa5.i((View) obj4, (ta5) obj3, (qr2) obj2);
                ((ValueAnimator) obj).start();
                return;
        }
    }

    public /* synthetic */ sz(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.n = i;
        this.r = obj;
        this.o = obj2;
        this.p = obj3;
        this.q = obj4;
    }
}
