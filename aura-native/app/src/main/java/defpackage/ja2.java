package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class ja2 extends Service implements ba2 {
    public final qp4 n = new qp4(this);

    @Override // defpackage.ba2
    public final ea2 h() {
        return (ea2) this.n.a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        qp4 qp4Var = this.n;
        qp4Var.getClass();
        qp4Var.m(q92.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        qp4 qp4Var = this.n;
        qp4Var.getClass();
        qp4Var.m(q92.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        qp4 qp4Var = this.n;
        qp4Var.getClass();
        qp4Var.m(q92.ON_STOP);
        qp4Var.m(q92.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        qp4 qp4Var = this.n;
        qp4Var.getClass();
        qp4Var.m(q92.ON_START);
        super.onStart(intent, i);
    }
}
