package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wj2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ hg3 o;
    public final /* synthetic */ String p;
    public final /* synthetic */ Bundle q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ pz1 s;

    public wj2(pz1 pz1Var, hg3 hg3Var, String str, IBinder iBinder, Bundle bundle) {
        this.n = 2;
        this.s = pz1Var;
        this.o = hg3Var;
        this.p = str;
        this.r = iBinder;
        this.q = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        String str = this.p;
        Object obj = this.r;
        pz1 pz1Var = this.s;
        hg3 hg3Var = this.o;
        switch (i) {
            case 0:
                oj2 oj2Var = (oj2) ((pn2) pz1Var.o).r.get(((Messenger) hg3Var.o).getBinder());
                if (oj2Var == null) {
                    l93.q0("MBServiceCompat", "search for callback that isn't registered query=" + str);
                    return;
                }
                pn2 pn2Var = (pn2) pz1Var.o;
                String str2 = this.p;
                nj2 nj2Var = new nj2(str2, (v14) obj, 1);
                pn2Var.s = oj2Var;
                fr2 fr2VarB = pn2Var.b();
                if (fr2VarB == null) {
                    nj2Var.f(null);
                } else if (TextUtils.isEmpty(str2)) {
                    l93.q0("MLSLegacyStub", "Ignoring empty query from " + fr2VarB);
                    nj2Var.f(null);
                } else if (fr2VarB.d instanceof on2) {
                    nj2Var.a();
                    f35.W(pn2Var.z.l, new t6(pn2Var, fr2VarB, nj2Var, str2, this.q));
                }
                pn2Var.s = null;
                if (nj2Var.b()) {
                    return;
                }
                kf2.o(xa3.g("onSearch must call detach() or sendResult() before returning for query=", str2));
                return;
            case 1:
                oj2 oj2Var2 = (oj2) ((pn2) pz1Var.o).r.get(((Messenger) hg3Var.o).getBinder());
                Bundle bundle = this.q;
                if (oj2Var2 == null) {
                    l93.q0("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + str + ", extras=" + bundle);
                    return;
                }
                pn2 pn2Var2 = (pn2) pz1Var.o;
                String str3 = this.p;
                nj2 nj2Var2 = new nj2(str3, (v14) obj, 2);
                pn2Var2.s = oj2Var2;
                Bundle bundle2 = bundle == null ? Bundle.EMPTY : bundle;
                fr2 fr2VarB2 = pn2Var2.b();
                if (fr2VarB2 == null) {
                    nj2Var2.e();
                } else {
                    nj2Var2.a();
                    f35.W(pn2Var2.z.l, new mr((Object) pn2Var2, str3, (Object) fr2VarB2, (Object) nj2Var2, (Object) bundle2, 7));
                }
                pn2Var2.s = null;
                if (nj2Var2.b()) {
                    return;
                }
                throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str3 + " extras=" + bundle);
            default:
                oj2 oj2Var3 = (oj2) ((pn2) pz1Var.o).r.get(((Messenger) hg3Var.o).getBinder());
                String str4 = this.p;
                if (oj2Var3 == null) {
                    xa3.s("addSubscription for callback that isn't registered id=", str4, "MBServiceCompat");
                    return;
                }
                HashMap map = oj2Var3.f;
                pn2 pn2Var3 = (pn2) pz1Var.o;
                IBinder iBinder = (IBinder) obj;
                List arrayList = (List) map.get(str4);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    Bundle bundle3 = this.q;
                    if (!zHasNext) {
                        arrayList.add(new ld3(iBinder, bundle3));
                        map.put(str4, arrayList);
                        pn2Var3.g(str4, oj2Var3, bundle3, null);
                        pn2Var3.s = oj2Var3;
                        fr2 fr2VarB3 = pn2Var3.b();
                        if (fr2VarB3 != null) {
                            if (TextUtils.isEmpty(str4)) {
                                l93.q0("MLSLegacyStub", "onSubscribe(): Ignoring empty id from " + fr2VarB3);
                            } else {
                                f35.W(pn2Var3.z.l, new t6(pn2Var3, fr2VarB3, bundle3, str4, 14));
                            }
                        }
                        pn2Var3.s = null;
                        return;
                    }
                    ld3 ld3Var = (ld3) it.next();
                    if (iBinder == ld3Var.a) {
                        Bundle bundle4 = (Bundle) ld3Var.b;
                        if (bundle3 == bundle4) {
                            return;
                        }
                        if (bundle3 == null) {
                            bundle4.getClass();
                            if (bundle4.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle4.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                return;
                            }
                        } else if (bundle4 == null) {
                            if (bundle3.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle3.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                return;
                            }
                        } else if (bundle3.getInt("android.media.browse.extra.PAGE", -1) == bundle4.getInt("android.media.browse.extra.PAGE", -1) && bundle3.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle4.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
                            return;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ wj2(pz1 pz1Var, hg3 hg3Var, String str, Bundle bundle, v14 v14Var, int i) {
        this.n = i;
        this.s = pz1Var;
        this.o = hg3Var;
        this.p = str;
        this.q = bundle;
        this.r = v14Var;
    }
}
