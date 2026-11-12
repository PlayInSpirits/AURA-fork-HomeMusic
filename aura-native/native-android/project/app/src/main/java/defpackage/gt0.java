package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gt0 implements Handler.Callback {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ gt0(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                lt0 lt0Var = (lt0) obj;
                CopyOnWriteArraySet copyOnWriteArraySet = lt0Var.e;
                int i2 = message.what;
                if (i2 == 1) {
                    List list = (List) message.obj;
                    lt0Var.h = true;
                    lt0Var.l = Collections.unmodifiableList(list);
                    boolean zE = lt0Var.e();
                    Iterator it = copyOnWriteArraySet.iterator();
                    while (it.hasNext()) {
                        ((jt0) it.next()).a(lt0Var);
                    }
                    if (zE) {
                        lt0Var.a();
                    }
                } else if (i2 == 2) {
                    int i3 = message.arg1;
                    int i4 = message.arg2;
                    int i5 = lt0Var.f - i3;
                    lt0Var.f = i5;
                    lt0Var.g = i4;
                    if (i4 == 0 && i5 == 0) {
                        Iterator it2 = copyOnWriteArraySet.iterator();
                        while (it2.hasNext()) {
                            ((jt0) it2.next()).e();
                        }
                    }
                } else {
                    if (i2 != 3) {
                        tb4.a();
                        return false;
                    }
                    ht0 ht0Var = (ht0) message.obj;
                    lt0Var.l = Collections.unmodifiableList(ht0Var.c);
                    ns0 ns0Var = ht0Var.a;
                    boolean zE2 = lt0Var.e();
                    if (ht0Var.b) {
                        Iterator it3 = copyOnWriteArraySet.iterator();
                        while (it3.hasNext()) {
                            ((jt0) it3.next()).d(ns0Var);
                        }
                    } else {
                        Iterator it4 = copyOnWriteArraySet.iterator();
                        while (it4.hasNext()) {
                            ((jt0) it4.next()).b(lt0Var, ns0Var);
                        }
                    }
                    if (zE2) {
                        lt0Var.a();
                    }
                }
                return true;
            case 1:
                tc2 tc2Var = (tc2) obj;
                rc2 rc2Var = tc2Var.c;
                rc2Var.getClass();
                for (sc2 sc2Var : tc2Var.d) {
                    if (!sc2Var.d && sc2Var.c) {
                        w71 w71VarF = sc2Var.b.f();
                        sc2Var.b = new xk0(2);
                        sc2Var.c = false;
                        rc2Var.f(sc2Var.a, w71VarF);
                    }
                    yp4 yp4Var = tc2Var.b;
                    yp4Var.getClass();
                    if (yp4Var.a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            case 2:
                rf2 rf2Var = (rf2) obj;
                if (message.what == 1) {
                    try {
                        bm2 bm2Var = (bm2) rf2Var.o;
                        bm2Var.D.p0(bm2Var.c);
                    } catch (RemoteException unused) {
                        l93.q0("MCImplBase", "Error in sending flushCommandQueue");
                    }
                    break;
                }
                return true;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                gm2 gm2Var = (gm2) obj;
                if (message.what == 1) {
                    im2 im2Var = gm2Var.e;
                    im2Var.b1(false, im2Var.n);
                }
                return true;
            default:
                w12 w12Var = (w12) obj;
                int i6 = message.what;
                if (i6 == 1) {
                    ((zm4) w12Var.h).a();
                } else if (i6 == 2) {
                    ((an4) w12Var.i).a();
                } else if (i6 == 3) {
                    ((bn4) w12Var.j).a();
                } else {
                    if (i6 != 4) {
                        return false;
                    }
                    ((cn4) w12Var.k).a();
                }
                return true;
        }
    }
}
