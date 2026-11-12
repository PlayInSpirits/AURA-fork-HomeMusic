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

    public lj2(Context r1, bj2 r2, cb4 r3, Bundle r4, Looper r5, xs r6) {
        super(r1, r2, r3, r4, r5, r6);
        this.s = new HashMap();
        new HashMap();
        this.t = r2;
    }

    @Override // defpackage.im2, defpackage.rk2
    public final wa4 P0() {
        jj2 r0 = this.j;
        ml3 r4 = this.p;
        if (r0 == null) goto L11;
        wa4 r5 = (wa4) r4.b;
        r5.getClass();
        HashSet r1 = new HashSet(r5.a);
        gy3 r6 = va4.e;
        int r2 = 0;
    L6:
        if (r2 >= r6.q) goto L9;
        r1.add(new va4(((Integer) r6.get(r2)).intValue()));
        r2 = r2 + 1;
        goto L6
    L9:
        return new wa4(r1);
    L11:
        return (wa4) r4.b;
    }

    @Override // defpackage.im2, defpackage.rk2
    public final ic2 T0(va4 r9, Bundle r10) {
        jj2 r0 = this.j;
        if (P0().a.contains(r9) == true) goto L5;
        if (r0 == null) goto L33;
        lb4 r1 = new lb4();
        String r2 = r9.b;
        si1 r3 = new si1(this, r9, r10, r1);
        if (TextUtils.isEmpty(r2) == true) goto L30;
        gj2 r8 = r0.a;
        if (r8.b.isConnected() == false) goto L29;
        xc5 r11 = r8.f;
        if (r11 != null) goto L15;
        l93.K("MediaBrowserCompat", "The connected service doesn't support sendCustomAction.");
        r8.d.post(new fj2(r3, r2, r10, 0));
        return r1;
    L15:
        ej2 r4 = new ej2(r2, r10, r3, r8.d);
        Messenger r5 = r8.g;     // Catch: RemoteException -> L18
        r5.getClass();     // Catch: RemoteException -> L18
        Bundle r6 = new Bundle();     // Catch: RemoteException -> L18
        r6.putString("data_custom_action", r2);     // Catch: RemoteException -> L18
        r6.putBundle("data_custom_action_extras", r10);     // Catch: RemoteException -> L18
        r6.putParcelable("data_result_receiver", uc5.j(r4, v14.CREATOR));     // Catch: RemoteException -> L18
        r11.w(9, r6, r5);     // Catch: RemoteException -> L18
        return r1;
    L18:
        e = move-exception;
        String r7 = "Remote error sending a custom action: action=" + r2 + ", extras=" + r10;
        monitor-enter(l93.b);
        Log.i("MediaBrowserCompat", l93.e(r7, e));     // Catch: Throwable -> L25
        r8.d.post(new fj2(r3, r2, r10, 1));
        return r1;
    L25:
        th = move-exception;
        throw th;
    L29:
        throw new IllegalStateException("Cannot send a custom action (" + r2 + ") with extras " + r10 + " because the browser is not connected to the service.");
    L30:
        kf2.n("action cannot be empty");
        return null;
    L33:
        return new mw1(new ab4(-4));
    L5:
        return super.T0(r9, r10);
    }

    @Override // defpackage.im2, defpackage.rk2
    public final void a() {
        HashMap r0 = this.s;
        Iterator r1 = r0.values().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        ((jj2) r1.next()).a();
        goto L4
    L6:
        r0.clear();
        super.a();
    }

    @Override // defpackage.im2
    public final sk2 a1() {
        return this.t;
    }
}
