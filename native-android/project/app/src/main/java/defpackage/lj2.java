package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lj2 extends im2 {
    public final HashMap s;
    public final bj2 t;

    public lj2(Context context, bj2 bj2Var, cb4 cb4Var, Bundle bundle, Looper looper, xs xsVar) {
        super(context, bj2Var, cb4Var, bundle, looper, xsVar);
        this.s = new HashMap();
        new HashMap();
        this.t = bj2Var;
    }

    @Override // defpackage.im2, defpackage.rk2
    public final wa4 P0() {
        jj2 jj2Var = this.j;
        ml3 ml3Var = this.p;
        if (jj2Var == null) {
            return (wa4) ml3Var.b;
        }
        wa4 wa4Var = (wa4) ml3Var.b;
        wa4Var.getClass();
        HashSet hashSet = new HashSet(wa4Var.a);
        gy3 gy3Var = va4.e;
        for (int i = 0; i < gy3Var.q; i++) {
            hashSet.add(new va4(((Integer) gy3Var.get(i)).intValue()));
        }
        return new wa4(hashSet);
    }

    @Override // defpackage.im2, defpackage.rk2
    public final ic2 T0(va4 va4Var, Bundle bundle) {
        jj2 jj2Var = this.j;
        if (P0().a.contains(va4Var)) {
            return super.T0(va4Var, bundle);
        }
        if (jj2Var == null) {
            return new mw1(new ab4(-4));
        }
        lb4 lb4Var = new lb4();
        String str = va4Var.b;
        si1 si1Var = new si1(this, va4Var, bundle, lb4Var);
        if (TextUtils.isEmpty(str)) {
            kf2.n("action cannot be empty");
            return null;
        }
        gj2 gj2Var = jj2Var.a;
        if (!gj2Var.b.isConnected()) {
            throw new IllegalStateException("Cannot send a custom action (" + str + ") with extras " + bundle + " because the browser is not connected to the service.");
        }
        xc5 xc5Var = gj2Var.f;
        if (xc5Var == null) {
            l93.K("MediaBrowserCompat", "The connected service doesn't support sendCustomAction.");
            gj2Var.d.post(new fj2(si1Var, str, bundle, 0));
            return lb4Var;
        }
        ej2 ej2Var = new ej2(str, bundle, si1Var, gj2Var.d);
        try {
            Messenger messenger = gj2Var.g;
            messenger.getClass();
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_custom_action", str);
            bundle2.putBundle("data_custom_action_extras", bundle);
            bundle2.putParcelable("data_result_receiver", uc5.j(ej2Var, v14.CREATOR));
            xc5Var.w(9, bundle2, messenger);
            return lb4Var;
        } catch (RemoteException e) {
            String str2 = "Remote error sending a custom action: action=" + str + ", extras=" + bundle;
            synchronized (l93.b) {
                Log.i("MediaBrowserCompat", l93.e(str2, e));
                gj2Var.d.post(new fj2(si1Var, str, bundle, 1));
                return lb4Var;
            }
        }
    }

    @Override // defpackage.im2, defpackage.rk2
    public final void a() {
        HashMap map = this.s;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((jj2) it.next()).a();
        }
        map.clear();
        super.a();
    }

    @Override // defpackage.im2
    public final sk2 a1() {
        return this.t;
    }
}
