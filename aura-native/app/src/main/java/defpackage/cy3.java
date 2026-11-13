package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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

    public cy3(Context context, ComponentName componentName) {
        super(context, new om1(10, componentName));
        this.x = new ArrayList();
        this.v = componentName;
        this.w = new zw2();
    }

    @Override // defpackage.qq2
    public final nq2 a(String str, pq2 pq2Var) {
        if (str == null) {
            kf2.n("initialMemberRouteId cannot be null.");
            return null;
        }
        xk0 xk0Var = this.t;
        if (xk0Var != null) {
            List list = (List) xk0Var.p;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((sp2) list.get(i)).d().equals(str)) {
                    ay3 ay3Var = new ay3(this, str, pq2Var);
                    this.x.add(ay3Var);
                    if (this.B) {
                        ay3Var.b(this.A);
                    }
                    l();
                    return ay3Var;
                }
            }
        }
        return null;
    }

    @Override // defpackage.qq2
    public final oq2 c(String str, pq2 pq2Var) {
        if (str != null) {
            return i(str, null, pq2Var);
        }
        kf2.n("routeId cannot be null");
        return null;
    }

    @Override // defpackage.qq2
    public final oq2 d(String str, String str2) {
        if (str == null) {
            kf2.n("routeId cannot be null");
            return null;
        }
        if (str2 != null) {
            return i(str, str2, pq2.b);
        }
        kf2.n("routeGroupId cannot be null");
        return null;
    }

    @Override // defpackage.qq2
    public final void e(up2 up2Var) {
        if (this.B) {
            xx3 xx3Var = this.A;
            int i = xx3Var.d;
            xx3Var.d = i + 1;
            xx3Var.b(10, i, 0, up2Var != null ? up2Var.a : null, null);
        }
        l();
    }

    public final void h() {
        if (this.z) {
            return;
        }
        Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.v);
        try {
            this.z = this.n.bindService(intent, this, Build.VERSION.SDK_INT >= 29 ? 4097 : 1);
        } catch (SecurityException unused) {
        }
    }

    public final by3 i(String str, String str2, pq2 pq2Var) {
        xk0 xk0Var = this.t;
        if (xk0Var == null) {
            return null;
        }
        List list = (List) xk0Var.p;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((sp2) list.get(i)).d().equals(str)) {
                by3 by3Var = new by3(this, str, str2, pq2Var);
                this.x.add(by3Var);
                if (this.B) {
                    by3Var.b(this.A);
                }
                l();
                return by3Var;
            }
        }
        return null;
    }

    public final void j() {
        if (this.A != null) {
            f(null);
            this.B = false;
            ArrayList arrayList = this.x;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((yx3) arrayList.get(i)).c();
            }
            xx3 xx3Var = this.A;
            xx3Var.b(2, 0, 0, null, null);
            xx3Var.b.b.clear();
            xx3Var.a.getBinder().unlinkToDeath(xx3Var, 0);
            xx3Var.i.w.post(new wx3(xx3Var, 0));
            this.A = null;
        }
    }

    public final void k() {
        if (this.z) {
            this.z = false;
            j();
            try {
                this.n.unbindService(this);
            } catch (IllegalArgumentException e) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e);
            }
        }
    }

    public final void l() {
        if (!this.y || (this.r == null && this.x.isEmpty())) {
            k();
        } else {
            h();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.z) {
            j();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        xx3 xx3Var = new xx3(this, messenger);
                        int i = xx3Var.d;
                        xx3Var.d = i + 1;
                        xx3Var.g = i;
                        if (xx3Var.b(1, i, 4, null, null)) {
                            try {
                                xx3Var.a.getBinder().linkToDeath(xx3Var, 0);
                                this.A = xx3Var;
                                return;
                            } catch (RemoteException unused) {
                                xx3Var.binderDied();
                                return;
                            }
                        }
                        return;
                    }
                } catch (NullPointerException unused2) {
                }
            }
            Log.e("MediaRouteProviderProxy", this + ": Service returned invalid messenger binder");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        j();
    }

    public final String toString() {
        return "Service connection " + this.v.flattenToShortString();
    }
}
