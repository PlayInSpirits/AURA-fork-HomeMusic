package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cy3 extends qq2 implements ServiceConnection {
    public static final /* synthetic */ int D = 0;
    public xx3 A;
    public boolean B;
    public ss2 C;
    public final ComponentName v;
    public final zw2 w;
    public final ArrayList x;
    public boolean y;
    public boolean z;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public cy3(Context r3, ComponentName r4) {
        super(r3, new om1(10, r4));
        this.x = new ArrayList();
        this.v = r4;
        this.w = new zw2();
    }

    @Override // defpackage.qq2
    public final nq2 a(String r6, pq2 r7) {
        if (r6 == null) goto L17;
        xk0 r1 = this.t;
        if (r1 == null) goto L16;
        List r2 = (List) r1.p;
        int r3 = r2.size();
        int r4 = 0;
    L7:
        if (r4 >= r3) goto L16;
        if (((sp2) r2.get(r4)).d().equals(r6) == true) goto L10;
        r4 = r4 + 1;
        goto L7
    L10:
        ay3 r0 = new ay3(this, r6, r7);
        this.x.add(r0);
        if (this.B == false) goto L13;
        r0.b(this.A);
    L13:
        l();
        return r0;
    L16:
        return null;
    L17:
        kf2.n("initialMemberRouteId cannot be null.");
        return null;
    }

    @Override // defpackage.qq2
    public final oq2 c(String r2, pq2 r3) {
        if (r2 != null) goto L5;
        kf2.n("routeId cannot be null");
        return null;
    L5:
        return i(r2, null, r3);
    }

    @Override // defpackage.qq2
    public final oq2 d(String r2, String r3) {
        if (r2 == null) goto L9;
        if (r3 != null) goto L6;
        kf2.n("routeGroupId cannot be null");
        return null;
    L6:
        return i(r2, r3, pq2.b);
    L9:
        kf2.n("routeId cannot be null");
        return null;
    }

    @Override // defpackage.qq2
    public final void e(up2 r8) {
        if (this.B == false) goto L10;
        xx3 r1 = this.A;
        int r3 = r1.d;
        r1.d = r3 + 1;
        if (r8 == null) goto L8;
        Bundle r9 = r8.a;
    L9:
        r1.b(10, r3, 0, r9, null);
        goto L10
    L8:
        r9 = null;
    L10:
        l();
    }

    public final void h() {
        if (this.z == true) goto L14;
        Intent r0 = new Intent("android.media.MediaRouteProviderService");
        r0.setComponent(this.v);
        if (Build.VERSION.SDK_INT < 29) goto L8;
        int r1 = 4097;
    L9:
        this.z = this.n.bindService(r0, this, r1);     // Catch: SecurityException -> L11
        return;
    L8:
        r1 = 1;
    L15:
        return;
    }

    public final by3 i(String r5, String r6, pq2 r7) {
        xk0 r0 = this.t;
        if (r0 == null) goto L14;
        List r1 = (List) r0.p;
        int r2 = r1.size();
        int r3 = 0;
    L5:
        if (r3 >= r2) goto L18;
        if (((sp2) r1.get(r3)).d().equals(r5) == true) goto L8;
        r3 = r3 + 1;
        goto L5
    L8:
        by3 r4 = new by3(this, r5, r6, r7);
        this.x.add(r4);
        if (this.B == false) goto L11;
        r4.b(this.A);
    L11:
        l();
        return r4;
    L18:
        return null;
    L14:
        return null;
    }

    public final void j() {
        if (this.A == null) goto L10;
        f(null);
        this.B = false;
        ArrayList r2 = this.x;
        int r3 = r2.size();
        int r4 = 0;
    L5:
        if (r4 >= r3) goto L7;
        ((yx3) r2.get(r4)).c();
        r4 = r4 + 1;
        goto L5
    L7:
        xx3 r5 = this.A;
        r5.b(2, 0, 0, null, null);
        r5.b.b.clear();
        r5.a.getBinder().unlinkToDeath(r5, 0);
        r5.i.w.post(new wx3(r5, 0));
        this.A = null;
        return;
    }

    public final void k() {
        if (this.z == false) goto L12;
        this.z = false;
        j();
        this.n.unbindService(this);     // Catch: IllegalArgumentException -> L7
        return;
    L7:
        e = move-exception;
        Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e);
        return;
    }

    public final void l() {
        if (this.y == true) goto L5;
    L11:
        k();
        return;
    L5:
        if (this.r == null) goto L8;
    L9:
        h();
        return;
    L8:
        if (this.x.isEmpty() == true) goto L11;
        goto L9
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName r7, IBinder r8) {
        if (this.z == false) goto L24;
        j();
        if (r8 == null) goto L7;
        Messenger r9 = new Messenger(r8);
    L8:
        if (r9 != null) goto L22;
    L17:
        Log.e("MediaRouteProviderProxy", this + ": Service returned invalid messenger binder");
        return;
    L22:
        if (r9.getBinder() == null) goto L17;
        xx3 r0 = new xx3(this, r9);
        int r2 = r0.d;
        r0.d = r2 + 1;
        r0.g = r2;
        if (r0.b(1, r2, 4, null, null) == false) goto L27;
        r0.a.getBinder().linkToDeath(r0, 0);     // Catch: RemoteException -> L16
        this.A = r0;
        return;
    L16:
        r0.binderDied();
        return;
    L27:
        return;
    L7:
        r9 = null;
        goto L8
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName r1) {
        j();
    }

    public final String toString() {
        return "Service connection " + this.v.flattenToShortString();
    }
}
